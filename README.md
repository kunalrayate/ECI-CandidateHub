# ECI Election Hub

## Overview
The **ECI Election Hub** is a web application designed to manage and interact with election candidate data. The application allows users to perform basic CRUD (Create, Read, Update, Delete) operations on candidate details, such as candidate ID, name, party name, assembly, state name, gender, and age.

## Features
1. **Select Query (View Data):**
   - View candidate details based on different filters such as state, party name, gender, etc.
   
2. **Insert Query (Add Data):**
   - Add new candidate information including candidate ID, name, party name, assembly constituency, state name, gender, and age.

3. **Update Query (Modify Data):**
   - Update existing candidate information by modifying attributes like name, party name, gender, age, etc.
   
4. **Delete Query (Remove Data):**
   - Delete candidate records from the system using the unique candidate ID.

## Attributes
Each candidate record consists of the following attributes:
- **c_id**: Candidate ID (Unique Identifier)
- **name**: Full name of the candidate
- **partyname**: Political party name
- **assembly**: Assembly constituency
- **statename**: Name of the state
- **gender**: Gender of the candidate
- **age**: Age of the candidate

## Technologies Used
- **MySQL**: Database to store candidate information.
- **SQL**: Queries for performing CRUD operations on the database.
- **Maven**: Build and dependency management tool for the project.

## Database Schema
Here’s an example of the SQL schema for the candidate table:

```sql
CREATE TABLE candidates (
    c_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    partyname VARCHAR(255),
    assembly VARCHAR(255),
    statename VARCHAR(255),
    gender ENUM('Male', 'Female', 'Other'),
    age INT
);

 Contact

For any inquiries, questions, or feedback related to this project, feel free to reach out to me:

- GitHub :  (https://github.com/kunalrayate)
- Email :  (kunalrayate126@gmail.com)

