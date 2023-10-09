# Spring Boot Microservices

This project is developed using Java Spring Boot and ReactJs.

## Installation

### Backend
Use an IDE to run a Java Spring Boot then run 
 - 1st service-registry
 - Then run config-server, api-gateway, department-service, employee-service, organization-service.

 - To use zipkin -> java -jar zipkinFilePath
 - RabbitMQ can be used to update configurations simultaneously. Run "docker run --rm -it -p 5672:5672 rabbitmq" command
 


### Frontend

Directory -> react-frontend

- Instal packages:
```
npm install
```
To start the project use:
```
npm run dev
```


## Project Descriptions
### Backend

- Microservices Communication using RestTemplate, WebClient, and Spring Cloud OpenFeign
- Create Service Registry and Discovery using Spring Cloud Netflix Eureka
- Load balancing with Eureka server and Open Feign using Spring Cloud LoadBalancer
- Create API Gateway using Spring Cloud Gateway
- Centralized Configurations using Spring Cloud Config Server
- Auto Refresh Config Changes using Spring Cloud Bus
- Distributed Tracing with Spring Cloud Sleuth and Zipkin
- Resilience4J: Circuit Breaker, Retry, and RateLimiter Patterns
- React Frontend Microservice and Integrate with Backend Microservices
- Generate REST API Documentation


## License

[MIT](https://choosealicense.com/licenses/mit/)
