
#  Car Sharing Project

This is a Java-based project simulating a simple car-sharing application. It was developed as a graduation project for an online course, where only task descriptions were provided — all logic, architecture, and implementation were done by me.

The project uses Gradle, JDBC, and an embedded RDB database to demonstrate key concepts such as object-relational mapping, entity relationships, and basic CRUD operations. It is built in a modular, task-based structure for clarity and testability.

---

##  Project Structure

The project is organized into tasks, each introducing new functionality:

- **Initialization** – Setting up the database and environment
- **Welcome, customer** – Basic user interaction and logic
- **Relationship** – Working with related entities in the database
- **Test suite** – `CarSharingTest.java` and `DatabaseUtil.java` for validating functionality

---

##  Technologies Used

- Java 11+
- Gradle
- H2 (via JDBC)
- JUnit (for testing)

---

##  How to Run (for run use JetBrains JDK 17 version!)

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/Car_Sharing_project.git
   cd Car_Sharing_project
   ```

2. Build the project:
   ```bash
   ./gradlew build
   ```

3. Run the application or specific tasks using:
   ```bash
   ./gradlew run
   ```

4. Run tests:
   ```bash
   ./gradlew test
   ```

---

##  Key Features

- In-memory or file-based H2 DB setup
- JDBC connections with RDB logic embedded in Java
- Task-based learning structure with gradual complexity
- Basic CRUD: create companies, cars, customers; rent/return cars
- Clean test coverage for core logic

---

##  Tests

The test classes validate core functionality and simulate interaction with the system:
- `CarSharingTest.java` — end-to-end logic testing
- `DatabaseUtil.java` — utility setup for database access

