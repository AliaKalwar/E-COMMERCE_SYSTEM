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
## PROJECT STRUCTURE

E-COMMERCE_SYSTEM/
│
├── .idea/
│   ├── .gitignore
│   ├── encodings.xml
│   ├── misc.xml
│
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── example/
│                   └── Main.java
│
├── MONGODB/
│   ├── MONGODB SCREENSHOTS/
│   ├── MONGODB_COMPASS_SCREENSHOTS/
│   └── MONGODB-CODE.txt
│
├── .gitignore
├── pom.xml
├── README.md
├── project report.pdf
└── Screenshots

--
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
<img width="562" height="577" alt="image" src="https://github.com/user-attachments/assets/816bcafa-9752-47b5-b0cd-027223613c92" />

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
<img width="602" height="518" alt="image" src="https://github.com/user-attachments/assets/348a776b-fa78-4b19-90d2-0209bbab0d01" />
<img width="582" height="545" alt="image" src="https://github.com/user-attachments/assets/512fdfa7-ed84-4462-809a-86fc2b7523b2" />
<img width="593" height="540" alt="image" src="https://github.com/user-attachments/assets/75123cbc-3467-46a7-9383-f485724a5fa8" />
<img width="1325" height="523" alt="image" src="https://github.com/user-attachments/assets/d50cd915-56ce-44ef-afa6-d16853f80537" />
<img width="1320" height="532" alt="image" src="https://github.com/user-attachments/assets/95b9a127-c1fc-4ce6-9e99-84355dabfcd9" />
<img width="1342" height="543" alt="image" src="https://github.com/user-attachments/assets/19a89554-0b99-4931-95ab-75bf537d0454" />
<img width="1317" height="540" alt="image" src="https://github.com/user-attachments/assets/c2e6a197-3b15-4ac3-875f-e3a42296abb2" />
<img width="1331" height="530" alt="image" src="https://github.com/user-attachments/assets/0c8fd7aa-ecb0-4ec3-b4a4-685d411ef60c" />
<img width="1331" height="527" alt="image" src="https://github.com/user-attachments/assets/045b473c-dde3-4f32-8278-134fd2448f31" />
<img width="1282" height="537" alt="image" src="https://github.com/user-attachments/assets/6ae65a0f-3bf5-4062-8baa-4a5564e8489e" />
<img width="597" height="548" alt="image" src="https://github.com/user-attachments/assets/978cc4e8-933f-4f08-aa7d-f24ed936ea21" />
<img width="582" height="561" alt="image" src="https://github.com/user-attachments/assets/c51263bf-409e-48c8-bdac-c1452a1047e3" />
<img width="575" height="528" alt="image" src="https://github.com/user-attachments/assets/7738c0cc-b6d4-46f2-a223-31424418a694" />



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
