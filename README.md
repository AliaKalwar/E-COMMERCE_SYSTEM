# E-COMMERCE_SYSTEM
# E-Commerce Management System Using Java Swing and MongoDB

## Project Overview

The E-Commerce Management System is a desktop-based application developed using Java Swing and MongoDB. The system provides an efficient platform for managing products, customers, shopping carts, and orders through a user-friendly graphical interface.

This project was developed as part of the Advanced Database Management Systems (ADBMS) course to demonstrate the practical implementation of NoSQL databases and CRUD operations in a real-world application.

---

## Features

### Admin Module
- Add Products
- Search Products
- View Products
- View Customer Orders

### Customer Module
- Add Customer
- View Products
- Add Products to Cart
- View Cart
- Place Orders

### Database Operations
- Create Records
- Read Records
- Update Records
- Delete Records

---

## Technologies Used

- Java
- Java Swing
- MongoDB
- MongoDB Java Driver
- Maven
- IntelliJ IDEA

---

## Database Information

**Database Name:** EcommerceDB

### Collections

#### Customers

```json
{
  "_id": "C001",
  "name": "Shifa",
  "email": "shifa@gmail.com",
  "password": "1234"
}
```

#### Products

```json
{
  "_id": "P001",
  "name": "Laptop",
  "category": "Electronics",
  "price": 85000,
  "stock": 10
}
```

#### Orders

```json
{
  "_id": "O001",
  "customerId": "C001",
  "productId": "P001",
  "quantity": 1,
  "total": 85000,
  "status": "Delivered"
}
```

#### Cart

```json
{
  "_id": "CRT001",
  "customerId": "C001",
  "productId": "P005",
  "quantity": 2
}
```

---

## Dataset Summary

| Collection | Records |
|------------|----------|
| Customers | 5 |
| Products | 12 |
| Orders | 5 |
| Cart | 3 |

### Product Categories

- Electronics
- Accessories
- Furniture

---

## System Architecture

```text
User
   |
   v
Java Swing GUI
   |
   v
Application Logic
   |
   v
MongoDB Java Driver
   |
   v
MongoDB Database (EcommerceDB)
```

---

## CRUD Operations

### Create
- Add Product
- Add Customer
- Create Order
- Add Item to Cart

### Read
- View Products
- Search Products
- View Orders
- View Cart

### Update
- Update Product Information
- Update Product Stock
- Update Order Status

### Delete
- Remove Product Records
- Remove Cart Records

---

## Project Objectives

- Develop a desktop-based E-Commerce Management System.
- Integrate Java Swing with MongoDB.
- Implement CRUD operations using a NoSQL database.
- Manage products, customers, carts, and orders efficiently.
- Demonstrate practical database management concepts.

---

## Advantages

- User-friendly graphical interface
- Fast data retrieval
- Flexible NoSQL database structure
- Easy maintenance
- Scalable database design
- Efficient product and order management

---

## Future Enhancements

- User Authentication and Authorization
- Online Payment Gateway
- Inventory Reports
- Sales Analytics
- Product Categories
- Mobile Application Support

---

## Screenshots

### Main Dashboard
Add screenshot here

### Product Management
Add screenshot here

### Customer Management
Add screenshot here

### Shopping Cart
Add screenshot here

### Order Management
Add screenshot here

---

## Authors

**Shifa Batool**  
**Alia Kalwar**

BS Computer Science

Sukkur IBA University

---

## Course

Advanced Database Management Systems (ADBMS)

---

## Conclusion

This project demonstrates the successful integration of Java Swing and MongoDB to develop a desktop-based E-Commerce Management System. The application efficiently manages customers, products, shopping carts, and orders while implementing CRUD operations through a NoSQL database. The project fulfills all major requirements of the ADBMS course and provides a practical understanding of modern database management techniques.
