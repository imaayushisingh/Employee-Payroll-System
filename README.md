# Employee Payroll System

This Java program represents a simple Employee Payroll System, demonstrating key object-oriented programming principles such as abstraction, encapsulation, inheritance, polymorphism, and the use of collections.

## Table of Contents
1. [**Overview**](#overview)
2. [**Classes**](#classes)
    - [**Employee**](#employee)
    - [**FullTimeEmployee**](#fulltimeemployee)
    - [**PartTimeEmployee**](#parttimeemployee)
    - [**PayRollSystem**](#payrollsystem)
3. [**Usage**](#usage)
4. [**How to Run**](#how-to-run)

## Overview
The Employee Payroll System consists of three main classes: `Employee`, `FullTimeEmployee`, and `PartTimeEmployee`. It also includes a `PayRollSystem` class to manage a list of employees.

## Classes

### Employee
- **Abstraction**: The `Employee` class is abstract, providing a blueprint for full-time and part-time employees.
- **Encapsulation**: Private fields `name` and `id` are encapsulated, and access is provided through getter methods.
- **Constructor**: The class has a constructor to initialize the name and ID of an employee.
- **Abstract Method**: Contains an abstract method `calculateSalary()` that needs to be implemented by subclasses.
- **Polymorphism**: Overrides the `toString()` method to provide a customized string representation.

### FullTimeEmployee
- **Inheritance**: Extends the `Employee` class, inheriting its properties and methods.
- Constructor initializes additional `monthlySalary` specific to full-time employees.
- Implements the `calculateSalary()` method as required by the abstract superclass.

### PartTimeEmployee
- Inherits from `Employee`.
- Contains fields for `hoursWorked` and `hourlyRate` specific to part-time employees.
- Implements the `calculateSalary()` method to calculate the salary based on hours worked and hourly rate.

### PayRollSystem
- Manages a list of employees using an `ArrayList`.
- Provides methods to add, remove, and display employee details.

## Usage
The program creates a `PayRollSystem`, adds full-time and part-time employees, displays initial details, removes an employee, and displays the remaining details.

## How to Run
1. Ensure you have Java installed on your machine.
2. Compile the `Main.java` file using `javac Main.java`.
3. Run the compiled program using `java Main`.

