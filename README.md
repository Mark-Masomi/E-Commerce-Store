# E-Commerce Microservices API

This project implements an e-commerce API using a microservices architecture, leveraging Gradle, Kotlin, and Java.

**Table of Contents**

- [Introduction](#introduction)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Running the Application](#running-the-application)
- [Testing the API](#testing-the-api)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This repository contains the source code for an e-commerce platform designed with a microservices architecture. The system is built using Gradle for build automation, Kotlin for the development language, and Java for compatibility and interoperability. The application is structured into multiple microservices, each responsible for a specific domain within the e-commerce ecosystem.

## Project Structure

The project is organized into the following modules:

```
ecommerce/
├── discovery-server/          # Eureka Server for service discovery
├── config-server/             # Spring Cloud Config Server
├── api-gateway/               # API Gateway (Spring Cloud Gateway)
├── product-service/           # Microservice for product management
├── order-service/             # Microservice for order management
├── user-service/              # Microservice for user management
└── inventory-service/         # Microservice for inventory management
```

Each directory represents a separate Spring Boot project, encapsulating the functionality of a specific microservice.

## Technologies Used

- **Gradle**: Build automation tool used for dependency management and project builds.
- **Kotlin**: Programming language used for developing the microservices.
- **Java**: Provides compatibility and interoperability within the project.
- **Spring Boot**: Framework for building stand-alone, production-grade Spring-based applications.
- **Spring Cloud**: Provides tools for building distributed systems and microservices architectures.
- **Eureka Server**: Service discovery server for locating services in the system.
- **Spring Cloud Config**: Centralized configuration server for managing application configurations.
- **Spring Cloud Gateway**: API Gateway for routing requests to appropriate microservices.
- **Spring Data JPA**: Simplifies database interactions using Java Persistence API.
- **H2 Database**: In-memory database used for development and testing purposes.

## Setup and Installation

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/Mark-Masomi/E-Commerce-Store.git
   ```

2. **Navigate to the Project Directory**:

   ```bash
   cd ecommerce-microservices-api
   ```

3. **Build the Project**:

   ```bash
   ./gradlew build
   ```

   This command compiles the source code and packages the application.

## Running the Application

1. **Start the Eureka Server**:

   ```bash
   cd discovery-server
   ./gradlew bootRun
   ```

   The Eureka Server will start on port 8761.

2. **Start the Config Server**:

   ```bash
   cd config-server
   ./gradlew bootRun
   ```

   The Config Server will start on port 8888.

3. **Start the API Gateway**:

   ```bash
   cd api-gateway
   ./gradlew bootRun
   ```

   The API Gateway will start on port 8080.

4. **Start the Microservices**:

   For each microservice (e.g., `product-service`, `order-service`), navigate to its directory and run:

   ```bash
   cd product-service
   ./gradlew bootRun
   ```

   Repeat this step for each microservice.

## Testing the API

Once all services are running, you can test the API endpoints using tools like Postman or cURL. The API Gateway routes requests to the appropriate microservices.

For example, to retrieve a list of products:

```bash
curl http://localhost:8080/api/products
```

Ensure that the Eureka Server and Config Server are running before starting the microservices.

## Contributing

Contributions are welcome! Please fork the repository, make your changes, and submit a pull request.

Before contributing, ensure that your code adheres to the project's coding standards and passes all tests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

For more detailed information and advanced configurations, refer to the [Spring Boot Microservices E-Commerce Project: Step-by-Step Tutorial](https://rameshfadatare.medium.com/in-this-tutorial-we-will-create-a-simple-e-commerce-application-using-a-microservices-architecture-a51214921faa).

For additional resources and examples on microservices architecture with Kotlin, you can explore repositories like [microservices-example](https://github.com/rkudryashov/microservices-example) and [spring-microservices](https://github.com/ElinaValieva/spring-microservices).

For a comprehensive guide on setting up a Spring Boot, Kotlin, and Gradle project, refer to [Spring Boot + Kotlin + Gradle Project Template](https://medium 
