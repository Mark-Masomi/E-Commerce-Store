# E-Commerce Store

A Spring Boot microservice-based application for managing orders, products, inventory, and product reviews.

## **Microservices Overview**

- **API Gateway**: Routes requests to appropriate microservices.
- **Eureka Service**: Service discovery and registration.
- **User Service**: Handles user management.
- **Auth Service**: Provides authentication using JWT.
- **Inventory Service**: Manages product inventory and availability.
- **Order Service**: Processes customer orders.
- **Reviews Service**: Manages product reviews and ratings.
- **Notification Service**: Sends notifications to users.

---

## **Technologies and Concepts Used**

- **Programming Language**: Java 17  
- **Framework**: Spring Boot  
- **Build Tool**: Gradle  
- **Database**: PostgreSQL  

---

## **Architecture**

- **Microservices**: Modular, loosely coupled services for scalability and maintainability.  
- **API Gateway Pattern**: Centralized gateway for routing and aggregating requests.  
- **Service Discovery**: Netflix Eureka for dynamic service registration and discovery.

---

## **Security**

- **Authentication**: JSON Web Tokens (JWT) for secure user authentication and authorization.

---

## **Testing and Quality Assurance**

- **Unit Testing**: JUnit and Mockito.  
- **Integration Testing**: Ensures services interact correctly.  
- **TestContainers**: Manages external dependencies (e.g., databases) during testing.

---

## **CI/CD Pipeline**

- **Build and Dependency Management**: Maven.  
- **Containerization**: Docker for packaging microservices.  
- **Automation**: GitHub Actions for building, testing, and publishing Docker images to Docker Hub.

---

## **Event-Driven Messaging**

- **Message Broker**: Apache Kafka for asynchronous communication between services.

---

## **Observability and Monitoring**

- **Data Visualization**: Grafana.  
- **Tracing**: OpenTelemetry, Grafana Tempo, and Zipkin.  
- **Metrics Collection**: Prometheus.  
- **Logging**: Grafana Loki.

---

## **How to Run the Application**

### **Using Docker Compose**

Run the pre-built Docker images for a fast setup:  
1. Clone the repository or download the `docker-compose.yaml` file.  
2. Run the following command to start all services:  
   ```bash
   cd deployment && docker-compose up -d
   ```

### **Local Development with Docker**

To build images from the local codebase:  
1. Clone the repository.  
2. Run the following command:  
   ```bash
   docker-compose -f docker-compose-dev.yaml up -d --build
   ```

For optimal local development:  
- Install **Java 17** or higher and **Maven**.  
- Use `docker-compose-infra.yaml` to configure essential infrastructure services.  
- Run individual services with:  
   ```bash
   mvn spring-boot:run
   ```

---

## **API Exploration and Interaction**

- **Swagger UI**: [http://localhost:8080/swagger](http://localhost:8080/swagger)  
- **Postman Collection**: Import `postman.json` into Postman.

---

## **Future Improvements**

1. **Security**: Migrate from JWT to OAuth 2.0 using Keycloak for enhanced authentication and authorization.  
2. **CI/CD**: Integrate Jenkins for automated testing and deployment pipelines.  
3. **Container Orchestration**: Adopt Kubernetes for container orchestration to improve scalability and fault tolerance.  
4. **Performance Optimization**: Implement caching mechanisms and optimize database queries.  
5. **Feature Enhancements**: Add support for additional payment gateways and advanced analytics.

---

## **Contributing**

We welcome contributions! Please follow the steps below:  
1. Fork the repository.  
2. Create a new branch for your feature/bug fix.  
3. Submit a pull request with detailed descriptions of your changes.

---

## **License**

This project is licensed under the [MIT License](LICENSE).
