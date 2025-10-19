# Spring Boot Article Management Demo

A simple Spring Boot REST API demo for managing articles.  
It provides **CRUD operations** (Create, Read, Update, Delete) using a layered architecture with **Controller**, **Service**, and **DTO** classes.

---

## 🛠️ Technology Stack

- Java 17  
- Spring Boot  
- Maven  
- Lombok  
- RESTful APIs (JSON responses)

---

## 📦 Project Structure

<img width="632" height="592" alt="image" src="https://github.com/user-attachments/assets/9d80bdce-f879-49bd-8244-cbdad7fb4e32" />

##  API Endpoints
| Method | Endpoint                        | Description                   |
|--------|---------------------------------|-------------------------------|
| GET    | `/api/articles/all`              | Retrieve all articles         |
| GET    | `/api/articles/id/{id}`          | Retrieve article by ID        |
| GET    | `/api/articles?id={id}`          | Retrieve article by query param |
| POST   | `/api/articles/create`           | Create a new article          |
| PUT    | `/api/articles/update/{id}`      | Update an existing article    |
| DELETE | `/api/articles/delete/{id}`      | Delete an article             |
