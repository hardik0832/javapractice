# Java JDBC – Employee Database App

## 📌 Objective
This project demonstrates how to connect Java with MySQL using JDBC and perform CRUD (Create, Read, Update, Delete) operations.

## 🛠 Tools Used
- Java
- MySQL
- JDBC (MySQL Connector)
- VS Code

## 🗄 Database Setup

Run the following SQL commands in MySQL:

```sql
CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    department VARCHAR(100),
    salary DOUBLE
);