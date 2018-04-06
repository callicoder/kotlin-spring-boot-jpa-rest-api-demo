# Kotlin, Spring Boot, MySQL, JPA, Hibernate Rest API

Build a Restful CRUD API using Kotlin, Spring Boot, Mysql, JPA and Hibernate.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/callicoder/kotlin-spring-boot-jpa-rest-api-demo.git
```

**2. Create Mysql database**
```bash
create database kotlin_demo_app
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Running the App**

Type the following command in your terminal to run the app -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/articles
    
    POST /api/articles
    
    GET /api/articles/{id}
    
    PUT /api/articles/{id}
    
    DELETE /api/articles/{id}

You can test them using postman or any other rest client.

## Learn more

You can find the tutorial for this application on my blog -

<https://www.callicoder.com/kotlin-spring-boot-mysql-jpa-hibernate-rest-api-tutorial/>
