# GESTION-TLRH-SQLI (SpringBoot, HTML/CSS, JavaScript, Bootstrap, PostgreSQL)

GESTION-TLRH-SQLI is an application that manages human capital inside SQLI. The application was completed as part of my internship at the company in Summer 2022.

**Demo of the Application (in French):**

https://user-images.githubusercontent.com/103124512/187304108-596685d6-8dab-4b51-b023-eb11948fdcc8.mp4

**To use, you need to:**

- Download or clone this repository
- Download Spring Boot Extension Pack (in case you want to work with VS Code)
- Download the latest version of JDBC https://jdbc.postgresql.org/download.html
- Connect PostreSQL to VS Code. 

- Set up PostgresSQL database and Create the following tables:

  <img width="290" alt="Screenshot 2022-08-29 at 22 34 19" src="https://user-images.githubusercontent.com/103124512/187303286-42b1a607-ab30-42db-a6c5-bf2565e72db1.png">
  
  ```
  CREATE TABLE Pages(
  matricule serial PRIMARY KEY,
  nom VARCHAR(45) NOT NULL,
  prenom VARCHAR(45) NOT NULL,
  abrev VARCHAR(3) NOT NULL,
  ancien_rh VARCHAR(45) NOT NULL,
  rh_ctuel VARCHAR(45) NOT NULL,
  gender VARCHAR(1) NOT NULL,
  site VARCHAR(45) DEFAULT 'Rabat',
  bu VARCHAR(4) NOT NULL,
  embauche VARCHAR(10) NOT NULL,
  bap VARCHAR(45) NOT NULL,
  depart VARCHAR(10),
  ancien_collab VARCHAR(1) NOT NULL,
  seminaire VARCHAR(1) NOT NULL,
  date_seminaire VARCHAR(10),
  app VARCHAR(3) NOT NULL,
  poste VARCHAR(4) NOT NULL,
  salaire INT NOT NULL,
  sorting INT NOT NULL);
  ```
  
  ```
  CREATE TABLE users(
  id serial PRIMARY KEY,
  username VARCHAR(45) NOT NULL,
  password VARCHAR(245) NOT NULL,
  email VARCHAR(45) NOT NULL,
  phone_number VARCHAR(45) NOT NULL);
  ```
  
  ```
  CREATE TABLE admin(
  id serial PRIMARY KEY,
  username VARCHAR(45) NOT NULL,
  password VARCHAR(245) NOT NULL);
  ```
  
  **Error Handling Examples:**
  
| Sign In | Register | Add Collaborateur (Wrong Date) |
| :---: | :---: | :---: |
|<img width="688" alt="Screenshot 2022-08-30 at 01 30 37" src="https://user-images.githubusercontent.com/103124512/187322095-82ccdd81-5f0a-471e-8203-2c56aa065d49.png">|<img width="1344" alt="Screenshot 2022-08-30 at 01 30 16" src="https://user-images.githubusercontent.com/103124512/187322056-26c698e2-0f7d-4391-8eaf-0a7ebb2f057e.png">|<img width="1344" alt="Screenshot 2022-08-30 at 01 29 54" src="https://user-images.githubusercontent.com/103124512/187322023-df2159de-90e1-42af-8c92-172610215264.png">|

