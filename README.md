# Mars Rover Simulation (Java)

This project simulates the random movement of a damaged Mars Rover navigating a dangerous Martian environment. Built using a 4-level class hierarchy, the simulation evaluates whether the rover runs out of battery or falls off a cliff first.

## Project Overview
The rover can move randomly 1–4 meters forward or backward per step. If it moves more than 1000 meters from its starting point, it falls off a cliff. Otherwise, it runs until the 10,000-meter battery limit is reached. The simulation runs 500 times to estimate how often the rover survives.

## Concepts Demonstrated
- Java OOP: Inheritance and constructor chaining
- Randomized simulation logic
- CLI-based Java compilation and execution
- Class hierarchy:
  - `Vehicle`
  - `UnmannedVehicle` (extends Vehicle)
  - `MarsRover` (extends UnmannedVehicle)
  - `DamagedRover` (extends MarsRover)

## Technologies Used
- Java
- Eclipse IDE
- Command Line (Terminal / PowerShell)

## File Structure
```
src/
└── transport/
    ├── Vehicle.java
    ├── UnmannedVehicle.java
    ├── MarsRover.java
    └── DamagedRover.java
```



## What I Learned
- How Java handles class inheritance and constructor calls
- Simulating random behavior using `Math.random()`
- Running Java applications from the terminal using `javac` and `java`


