# Employee Management System - Microservice Project

## Overview
This microservice project is an Employee Management System developed as a practical exercise to reinforce the concepts of microservices architecture. The project incorporates CRUD (Create, Read, Update, Delete) operations for managing employee information. Thymeleaf is used for the frontend, providing a dynamic and interactive user interface.

## Prerequisites
Before running the project, ensure you have the following prerequisites installed:

- Java Development Kit (JDK)
- MySQL Database
- Maven

## Setup

1. **Clone the Repository:**
   ```
   git clone https://github.com/your-username/employee-management-system.git
   cd employee-management-system
   ```

2. **Database Configuration:**
   - Create a MySQL database with the credentials specified in the `application.properties` file.
   - Update the `application.properties` file with your MySQL database username and password.
   
3. **Build and Run:**
   - Build the project using Maven:
     ```
     mvn clean install
     ```
   - Run the application:
     ```
     java -jar target/employee-management-system.jar
     ```

4. **Access the Application:**
   Open your web browser and navigate to `http://localhost:8080` to access the Employee Management System.

## Project Structure

- **src/main/java/com.example.employeemanagementsystem:**
  - `EmployeeManagementSystemApplication.java`: Main application class.
  - `controller/`: Contains controllers for handling HTTP requests.
  - `model/`: Defines the data model for the employee entity.
  - `repository/`: Manages data access and interaction with the database.
  - `service/`: Implements business logic and services.

- **src/main/resources:**
  - `application.properties`: Configuration file containing database connection details.
  - `templates/`: Thymeleaf templates for the frontend.

- **src/test/:**
  - Contains unit and integration tests for the application.

## Functionality

The Employee Management System provides the following functionalities:

- **List Employees:**
  View a list of all employees with basic details.

- **Add Employee:**
  Add a new employee to the system by providing necessary information.

- **Update Employee:**
  Modify the details of an existing employee.

- **Remove Employee:**
  Delete an employee from the system.

## Feedback and Contributions
Feel free to provide feedback or contribute to the project. If you encounter any issues, please create a GitHub issue.

Thank you for using the Employee Management System!
