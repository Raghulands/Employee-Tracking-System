# Employee Tracking System

## About the Project

Employee Tracking System is a Java web application developed using Java Servlets, Hibernate, JPA, and PostgreSQL. It allows users to add employee details, view all registered employees, and search for a specific employee using their Employee ID.

The application uses HTML forms to collect employee information, Java Servlets to process requests, and Hibernate with JPA to store and retrieve data from PostgreSQL. Maven is used for dependency management, and the application runs on Apache Tomcat 9.

## Features

- Add and Save Employee Details
- View All Employees
- Search Employees by ID
- Display Employee Details
- Employee Not Found Message
- PostgreSQL Database Integration
- Hibernate ORM and JPA
- Maven Dependency Management

## Technologies Used

- Java
- HTML
- Java Servlets
- Hibernate
- JPA
- PostgreSQL
- Apache Maven
- Apache Tomcat 9
- Eclipse IDE

## Application Modules

1. **Save Employee:** Add employee details such as ID, Name, Designation, and Salary to the database.
2. **View All Employees:** Retrieve and display all registered employee records using JPQL.
3. **View Employee by ID:** Search for an employee using their ID and display the matching details.

## Project Structure

```text
EmployeeTrackingSystem/
│
├── src/
│   └── main/
│       ├── java/servlet/
│       │   ├── Employee.java
│       │   ├── SaveEmp.java
│       │   ├── ViewEmp.java
│       │   └── ViewEmpId.java
│       │
│       ├── resources/META-INF/
│       │   └── persistence.xml
│       │
│       └── webapp/
│           ├── FormHome.html
│           ├── SaveEmp.html
│           ├── ViewEmp.html
│           └── ViewEmpOnId.html
│
├── pom.xml
└── README.md
```

## Prerequisites

- Java JDK
- Eclipse IDE
- Apache Tomcat 9
- PostgreSQL
- Apache Maven

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/EmployeeTrackingSystem.git
```

### 2. Create the PostgreSQL Database

```sql
CREATE DATABASE "EmpTrackSys";
```

### 3. Configure the Database

Update your PostgreSQL username and password in `persistence.xml`.

### 4. Import into Eclipse

Import the project as an **Existing Maven Project** and update the Maven dependencies.

### 5. Run the Application

Configure Apache Tomcat 9 in Eclipse and select **Run As → Run on Server**.

Open the application in your browser:

```text
http://localhost:8080/EmployeeTrackingSystem/
```

---

*Built as a hands-on Java web development project to learn Servlets, Hibernate, JPA, and PostgreSQL integration.*
