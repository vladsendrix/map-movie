# MapMovie

## Introduction

Welcome to the MapMovie project! This project is designed to manage information related to movies, actors, genres, Oscars, reviews, and users. The project is structured using Java and the Spring Framework, offering both a Command Line Interface (CLI) and a RESTful API for interaction.

## Setup

To get started with the MapMovie project, follow these steps:

1. Clone the project repository:

   ```bash
   git clone https://github.com/vladsendrix/map-movie
   ```

2. Open the project in your preferred Java Integrated Development Environment (IDE).

    ```bash
    code -r mapmovie
    ```

3. Build the project using Maven or Gradle.
    
    ```bash
    mvn clean install
    ```

4. Configure the database connection in the application.properties file.

    ```bash
    docker compose up -d
    ```

5. Run the application.

    ```
    mvn spring-boot:run
    ```

## CLI

Actor CLI
The Actor CLI provides commands to manage actors. Here are the available commands, we'll use the Actor model as an example:

- `actor create` - Create a new actor
```bash
createActor <firstName> <lastName> <nationality>
```

- `actor find` - Read an existing actor
```bash
findActor <id>
```

- `actor update` - Update an existing actor
```bash
updateActor <id> <firstName> <lastName> <nationality>
```

- `actor delete` - Delete an existing actor
```bash
deleteActor <id>
```

## RESTful API

The project provides a RESTful API for managing entities. It follows the common CRUD operations (Create, Read, Update, Delete) and is structured based on the BaseController class.

# Endpoints

- GET /{entity}/{id}: Get an entity by ID.
```bash
curl -X GET /actor/{id}
```

- POST /{entity}: Create a new entity.
```bash
curl -X POST /actor/{id}
```

- PUT /{entity}/{id}: Update an entity by ID.
```bash
curl -X PUT -H "Content-Type: application/json" -d '{"firstName":"Mirciu", "lastName":"Nebunu", "nationality":"român"}' /actor/{id}
```

- DELETE /{entity}/{id}: Delete an entity by ID.
```bash
curl -X DELETE /actor/{id}
```

## Error Handling
The error handling in our project is based on the HTTP status codes. Here are the most common scenarios:

404 Not Found
In scenarios where an entity is not found, such as when using the findActor operation, the system returns an HTTP 404 Not Found response.

```bash
curl -IX GET /actor/{nonexistent_id}
```

```bash
HTTP/1.1 404 
Content-Length: 0
Date: Mon, 08 Jan 2024 13:11:18 GMT
```

## Use Cases

- Netflix
- IMDB
- Self hosted movie library
- Film Studies Research
- Film Festival Programming
