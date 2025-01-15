# Java Microservices Shop

The application implements an e-commerce platform composed of several microservices that collaborate to enable online product sales. The platform handles processes related to orders, products, inventory management, and notifications, with communication between the microservices facilitated through asynchronous messaging using Apache Kafka.

Application uses an **API Gateway**, which serves as the access point for all microservices, managing traffic and user authentication.

Application consists of the following services:
- **api-gateway**: Manages communication between the frontend and the microservices, handles user authentication and authorization.
- **product-service**: Manages product data, including details, pricing, and availability.
- **order-service**: Handles the process of placing orders, processing them, and tracking order status.
- **inventory-service**: Manages the monitoring and updating of product inventory levels.
- **notification-service**: Sends notifications to users about their order status, promotions, etc.

Frontend of the application is built with Angular, providing users with an intuitive and dynamic interface.

Application utilizes **Grafana** for monitoring the performance of the microservices and **Auth Server** for managing user authentication.

By using **Apache Kafka**, the system ensures reliable asynchronous communication between microservices, enabling flexible scaling and high availability.

## Technologies Used:
- **Java**: Programming language used to build the microservices with Spring Boot framework.
- **Apache Kafka**: A tool for asynchronous communication between microservices, ensuring reliability and scalability.
- **Spring Boot**: A Java framework for rapidly building microservices.
- **Angular**: A frontend framework for building dynamic web applications.
- **Grafana**: A tool for monitoring system status and analyzing the performance of microservices.
- **Auth Server**: A server responsible for managing user identities and permissions.

## System Diagram
<img src="https://github.com/user-attachments/assets/908ab4e5-eb3c-4afc-be67-ee1dfcc99bbf">

## Screenshots
| Main page | Login panel | Grafana dashboard |
| -------|--------------|-----------------|
| <img src="https://github.com/user-attachments/assets/6ee11d36-77ad-4d09-8dc9-67f2bfd939c0" width="400"> | <img src="https://github.com/user-attachments/assets/e5b81cdb-98ef-4150-a7b1-c8f64b0e059f" width="400"> |<img src="https://github.com/user-attachments/assets/4f2316bd-549b-4210-8f5a-25dbfcc049f2" width=400> |


## Table of Contents:
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installing](#installing)
    - [Microservices](#microservices)
    - [Frontend](#frontend)
- [Functionalities](#functionalities)

## Getting Started
Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites
- Java >= 17
- Maven: 3.9.6
- Node.js: 20.11.1
- npm: 10.9.2
- Docker: >= 27.2.0
- Docker Compose: >= 1.29


### Installing
Clone the repository:
```bash
git clone https://github.com/BlackRaven18/java-microservices.git
```

#### Microservices

1. Run the individual microservices with InteliJ IDEA or with Maven:
  ```bash
  mvn spring-boot:run
  ```

#### Frontend

1. Navigate to the frontend directory:
```bash
cd frontend
```

2. Install the required dependencies:
```bash
npm install
```

3. Run the Angular application:
```bash
npm start
```

### Functionalities:

- **Product Management:**
  - **Adding Products:** Allows administrators to add new products to the inventory.
  - **Updating Products:** Enables editing product details, including price, description, and images.

- **Order Management:**
  - **Placing Orders:** Allows users to place orders for products.
  - **Order Tracking:** Users can check the status of their orders (e.g., processing, shipped).

- **Inventory Management:**
  - **Updating Inventory Levels:** Automatically decreases the inventory level after an order is placed.

- **Notifications:**
  - **User Notifications:** Notifies users about order status.

- **Monitoring:**
  - **Performance Monitoring:** Uses Grafana to visualize the performance of microservices, such as the number of processed orders, response times, etc.

- **User Management:**
  - **Authentication:** Users authenticate into the system using a secure authentication system.
