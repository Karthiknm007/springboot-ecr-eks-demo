# Spring Boot → Docker → ECR → EKS Demo

A beginner-friendly Spring Boot application for practicing:

1. Build a Spring Boot application
2. Create a Docker image
3. Push the image to Amazon ECR
4. Deploy the image to Amazon EKS

## Endpoints

- `/`
- `/api/hello`
- `/api/random`
- `/api/status`
- `/actuator/health`

## Build

```bash
mvn clean package
```

## Run locally

```bash
java -jar target/ecr-eks-demo-0.0.1-SNAPSHOT.jar
```

Open:

`http://localhost:8080/api/hello`

## Docker

```bash
docker build -t springboot-demo:latest .
docker run -p 8080:8080 springboot-demo:latest
```

## EKS

Before applying `k8s/deployment.yaml`, replace the placeholder ECR image with your actual ECR repository URI.
