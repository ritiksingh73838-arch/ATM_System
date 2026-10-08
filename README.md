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
- Database credentials are never stored in the code or in this repository
- They are read from a local config.properties file, which is excluded from Git via .gitignore
- A template file config.example.properties shows the required format

## Database Setup
sql
CREATE DATABASE IF NOT EXISTS ATM_db;
USE ATM_db;

CREATE TABLE IF NOT EXISTS accounts (
    account_number VARCHAR(20) PRIMARY KEY
);

Add the remaining columns (holder name, PIN, balance) as per your table.

## How to Run
1. Install MySQL and create the database using the SQL above.
2. Add mysql-connector-j to the project libraries.
3. Copy config.example.properties to a new file named config.properties in the project root.
4. Open config.properties and fill in your own MySQL details.
5. Run ATMApplication.java.

## Author
*Ritik Singh*
- GitHub: https://github.com/ritiksingh73838-arch
- Email: your_email@gmail.com
