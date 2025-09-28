# Java_self_Assessment-2

This repository contains solutions for the Compact Programming assignment as part of the FH Dortmund online course on Java programming.
The assignment is divided into four tasks, each focusing on a different aspect of Java basics, object handling, and algorithms.

Each task was implemented individually by group members, and the final solutions are documented here.

📌 Problem Statements & Contributions

Modern warehouses rely heavily on autonomous guided vehicles (AGVs) to optimize material handling and logistics. However, coordinating multiple operations, assigning AGVs, and estimating resources like time, energy, and fleet size is a complex challenge.

This project simulates an industrial warehouse process where:

Each process is made of multiple operations (loading, transporting, unloading, etc.).

Each operation may require one or more AGVs.

The simulation calculates the total process duration, energy consumption, and AGV utilization.

The goal is to provide a simplified model of warehouse automation that demonstrates how OOP concepts (classes, objects, composition) can be applied to real-world industrial problems.

👤 Harshavarthan – AGV Class

Designed the AGV blueprint to represent Autonomous Guided Vehicles with attributes like battery load, speed, position, and energy consumption.

Implemented energy usage tracking (via consumption) to measure the impact of each AGV on the industrial process.

Enabled reusability and scalability by creating a class structure where multiple AGVs can be added and customized.

👤 Anil – IOperation Class

Built the operation model (IOperation) to represent tasks in the warehouse, each with time duration and resource requirements.

Integrated AGVs as resources into operations, ensuring that different vehicles can be assigned per task.

Provided methods to track operation duration and resource usage, making the simulation closer to real-world process flows.

👤 Adesh – IndustrialProcess Class

Structured the overall process workflow where multiple operations are linked to form a warehouse process.

Developed methods to calculate total process time, energy consumption, and AGV count, simulating real efficiency metrics.

Created a modular process manager that allows flexible addition of operations for different industrial workflows.

👤 Dyaneshwar – WarehouseSimulation (Main Class)

Orchestrated the simulation environment, creating AGVs, operations, and combining them into an industrial process.

Printed performance metrics like total duration, AGV count, and energy consumption for analysis.

Demonstrated a working prototype showing how AGVs interact with operations and processes in a warehouse setting.

🎥 Submission Info
1.Drive Link (video explanation of the solution): https://drive.google.com/drive/folders/1PZPyamME_Tj3c0sEAThj6Ng1gznnBg6l?usp=sharing
2.Problem Statement : 

