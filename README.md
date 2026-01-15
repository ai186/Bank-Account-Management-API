🏦Banking Application – JWT Secured (Spring Boot) 📌 Project Overview This project is a Banking Application built using Spring Boot (Backend) with JWT-based Authentication. It supports secure login, account management, and transaction operations (deposit & withdraw). All sensitive APIs are protected using Spring Security + JWT

Tech Stack Backend • Java 17+ • Spring Boot • Spring Security • JWT (JSON Web Token) • Spring Data JPA • MySQL Tools • Postman (API testing) • Maven • Git

Authentication Flow (JWT)

User logs in using username & password
Backend validates credentials
JWT token is generated
Token is stored in browser localStorage
Token is sent in Authorization: Bearer header
JWT filter validates token for every request
🚀 Features

Create new bank accounts View account details by ID Deposit money into an account Withdraw money with balance validation View all accounts Delete an account Global exception handling with clean JSON responses

✅ Conclusion This project demonstrates a real-world secure backend system using JWT Authentication, suitable for banking and enterprise applications.
