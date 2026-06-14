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
<img width="317" height="197" alt="image" src="https://github.com/user-attachments/assets/963cfed6-247a-4939-a957-38341352fbde" />



### ADMIN PANEL
<img width="577" height="683" alt="image" src="https://github.com/user-attachments/assets/700778ea-1015-4eb1-ae6f-5780ce5005fa" />
<img width="490" height="486" alt="image" src="https://github.com/user-attachments/assets/84232a9e-5198-4eb3-83bd-89bfed44e7e7" />
<img width="473" height="500" alt="image" src="https://github.com/user-attachments/assets/ca871851-aabd-457f-9026-1399fe8907f7" />
<img width="487" height="482" alt="image" src="https://github.com/user-attachments/assets/a496c418-4704-4089-83e8-34dc79f30312" />
<img width="491" height="497" alt="image" src="https://github.com/user-attachments/assets/9ef998db-6e36-40eb-b031-fb4acd62271d" />
<img width="503" height="507" alt="image" src="https://github.com/user-attachments/assets/f1544150-ad0f-4e89-99bf-4590733f7f19" />
<img width="1427" height="501" alt="image" src="https://github.com/user-attachments/assets/b8d4da29-fb0e-459e-8974-12c57b55d4ce" />
<img width="1432" height="502" alt="image" src="https://github.com/user-attachments/assets/415ae410-e98f-468f-8a9e-9fe95c9b40ac" />
<img width="1407" height="507" alt="image" src="https://github.com/user-attachments/assets/6858c9f7-7a61-4b5b-9861-a4e82392aba0" />



### Customer PANEL
<img width="732" height="702" alt="image" src="https://github.com/user-attachments/assets/596d16aa-3bc9-44d9-8c51-7653a20b02b9" />
<img width="371" height="340" alt="image" src="https://github.com/user-attachments/assets/7ae14eb8-c124-4052-9344-89ad4fba1e63" />
<img width="382" height="348" alt="image" src="https://github.com/user-attachments/assets/aa517156-f836-4e92-bca7-17fa3c2933e6" />
<img width="382" height="337" alt="image" src="https://github.com/user-attachments/assets/ec20db2e-2d19-4cc8-a358-00c28f5648f1" />
<img width="381" height="347" alt="image" src="https://github.com/user-attachments/assets/b8faee9c-b075-4bd8-8bf3-1403ea930aa8" />
<img width="377" height="278" alt="image" src="https://github.com/user-attachments/assets/d500d2af-bf47-45de-8001-8206b176ecbe" />
<img width="377" height="305" alt="image" src="https://github.com/user-attachments/assets/faf25892-45bd-4dc0-8f3a-894c6786b766" />


### Shopping Cart
<img width="382" height="305" alt="image" src="https://github.com/user-attachments/assets/a8223b59-3791-4e47-a989-a8828b158e78" />


### Order Management
<img width="381" height="245" alt="image" src="https://github.com/user-attachments/assets/b5f30f36-9d4b-4968-bbd9-6a73b4dae520" />

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
