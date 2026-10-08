# ATM System

A console-based ATM system built with *Java, **JDBC* and *MySQL*.

## Features
- Connects to a MySQL database (ATM_db) using JDBC
- Account data stored in the accounts table
- Account class models an ATM account
- ATMApplication class handles the application flow

## Planned Features
- Balance enquiry
- Cash deposit and withdrawal
- PIN verification
- Transaction history

## Tech Stack
- Java
- JDBC (MySQL Connector/J)
- MySQL
- IntelliJ IDEA

## Security
- Database credentials are kept in config.properties, which is excluded from Git via .gitignore
- Use PreparedStatement for all user-input queries (protects against SQL injection)

## Database Setup
sql
CREATE DATABASE IF NOT EXISTS ATM_db;
USE ATM_db;

CREATE TABLE IF NOT EXISTS accounts (
    account_number VARCHAR(20) PRIMARY KEY
);

(Add the remaining columns, such as holder name, PIN and balance, as per your table.)

## How to Run
1. Install MySQL and create the database using the SQL above.
2. Add mysql-connector-j to the project libraries.
3. Create a config.properties file in the project root:
   
   db.url=jdbc:mysql://localhost:3306/ATM_db
   db.username=root
   db.password=your_password_here
   
4. Run ATMApplication.java.

## Author
*Ritik Singh*
- GitHub: https://github.com/ritiksingh73838-arch
- Email: your_email@gmail.com
