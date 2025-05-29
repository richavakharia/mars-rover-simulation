package transport;

public class DamagedRover extends MarsRover{
	private double position;    		// Distance from start. Range is
										// -1000 to +1000. If Rover travels
   										// beyond this range, it falls off
										// a cliff.
	private double metersTraveled; 		// Total meters traveled
										//back and forth.
	private boolean fell;            	// If true, an expensive loss.
	private final static int   MAX_TRAVEL_METERS_BEFORE_EMPTY_BATTERY  = 10000;
	private final static int   METERS_FROM_START_TO_CLIFF = 1000;
	private final static int   N_SIMULATIONS = 500;
	
	//
	// Simulates travel under damage conditions. In each turn, travels forward or
	// backward either 1, 2, 3, or 4 meters. Continues until there's no more power
	// in the battery, or we fall off a cliff. Cliffs are at position = 1000 or
	// position = -1000.
	//
	
	private void move(double distance, boolean forward) {
		if (forward = true) {
			changePositionBy(distance,0);
		}
		else {
			changePositionBy(-distance,0);
		}
	}
	public void simulateStormDamageTravel()
	{
		// Reset instance variables here
		//position = 0;
		metersTraveled = 0;
		fell = false;
		
		setPosition(0,0);
	 
		while (metersTraveled < MAX_TRAVEL_METERS_BEFORE_EMPTY_BATTERY)
		{
	  	// Random int: 1, 2, 3, or 4. Represents the
	  	// travel distance (maybe forward, maybe back) this turn
	      double distanceNextTurn = (int)(1 + 4*Math.random());
	  	// Random boolean for direction of travel this turn.
	      boolean forwardNotBack = (Math.random() > 0.5);
	      this.move(distanceNextTurn,  forwardNotBack);
	   	     
	      // Adjust position and metersTraveled.
	      if (forwardNotBack) {
		    position += distanceNextTurn;
	      }
	      else {
		    position -= distanceNextTurn;
	      metersTraveled += Math.abs(position);
	      }
	 
	      // Check for falling off cliff. If Rover fell, set fell to true and
	      // terminate (break out of) the loop.
	      if (position > METERS_FROM_START_TO_CLIFF || position < -(METERS_FROM_START_TO_CLIFF))
	      {
		    fell = true;
		    break;
	      }
		}
		
	  }
	public double getMetersTraveled() {
		 return metersTraveled;
	 }
	
	public boolean getFell() {
		return fell;
	}
	
	public static void main(String args[]) {
	    int fallsOffCliffCount = 0;
	    
	    for (int i = 0; i < N_SIMULATIONS; i++) {
	        DamagedRover rover = new DamagedRover();
	        rover.simulateStormDamageTravel();
	        
	        if (rover.getFell()) {
	            fallsOffCliffCount++;
	            System.out.println("Fell " + rover.getMetersTraveled());
	        } else {
	            System.out.println("No more power");
	        }
	    }
	    
	    System.out.println("Number of times the rover fell off the cliff: " + fallsOffCliffCount);
	}


}
