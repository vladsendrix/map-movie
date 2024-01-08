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

- `{entity} create` - Create a new entity
```bash
createActor <firstName> <lastName> <nationality>
createActorRole <movieID> <actorID> <role>
createDirector <firstName> <lastName> <yearOfBirth> <gender>
createGenre <name>
createMovie <title> <year> <directorID>
createMovieGenre <genreID> <movieID>
createMovieOscar <oscarID> <movieID>
createOscar <category> <year>
createReview <movieID> <userID> <rating> <comment>
createUser <username> <firstName> <lastName> <email>
```

- `{entity} find` - Read an existing entity
```bash
find{Entity} <id>
```

- `{entity} update` - Update an existing entity
```bash
upadetActor <id> <firstName> <lastName> <nationality>
updateActorRole <id> <movieID> <actorID> <role>
updateDirector <id> <firstName> <lastName> <yearOfBirth> <gender>
updateGenre <id> <name>
updateMovie <id> <title> <year> <directorID>
updateMovieGenre <id> <genreID> <movieID>
updateMovieOscar <id> <oscarID> <movieID>
updateOscar <id> <category> <year>
updateReview <id> <movieID> <userID> <rating> <comment>
updateUser <id> <username> <firstName> <lastName> <email>
```

- `{entity} delete` - Delete an existing entity
```bash
delete{Entity} <id>
```

## RESTful API

The project provides a RESTful API for managing entities. It follows the common CRUD operations (Create, Read, Update, Delete) and is structured based on the BaseController class.

# Endpoints

- GET /{entity}/{id}: Get an entity by ID.
```bash
curl -X GET /entity/{id}
```

- POST /{entity}: Create a new entity.
```bash
curl -X POST /entity/{id}
```

- PUT /{entity}/{id}: Update an entity by ID.
```bash
curl -X PUT -H "Content-Type: application/json" -d '{"firstName":"Mirciu", "lastName":"Nebunu", "nationality":"român"}' /actor/{id}
curl -X PUT -H "Content-Type: application/json" -d '{"movieID":100, "actorID":50, "role":"leading"}' /actorrole/{id}
curl -X PUT -H "Content-Type: application/json" -d '{"name":"Razvan", "lastName":"Tiban", "yearOfBirth":1990, "gender": "M"}' /director/{id}
curl -X PUT -H "Content-Type: application/json" -d '{"firstName":"Drama"}' /genre/{id}
curl -X PUT -H "Content-Type: application/json" -d '{"title":"LOTR", "year":2001, "directorID":111}' /movie/{id}
curl -X PUT -H "Content-Type: application/json" -d '{"genreID":1, "movieID":2}' /moviegenre/{id}
curl -X PUT -H "Content-Type: application/json" -d '{"oscarID":23, "movieID":40}' /movieoscar/{id}
curl -X PUT -H "Content-Type: application/json" -d '{"movieID":10, "userID":200, "rating": 9.2, "comment": "Very Good"}' /review/{id}
curl -X PUT -H "Content-Type: application/json" -d '{"username":"BamBam", "firstName":"Mihai", "lastName":"Salcudean", "email": "a@gmail.com"}' /user/{id}

```

- DELETE /{entity}/{id}: Delete an entity by ID.
```bash
curl -X DELETE /entity/{id}
```

## Error Handling
The error handling in our project is based on the HTTP status codes. Here are the most common scenarios:

404 Not Found
In scenarios where an entity is not found, such as when using the findActor operation, the system returns an HTTP 404 Not Found response.

```bash
curl -IX GET /entity/{nonexistent_id}
```

```bash
HTTP/1.1 404 
Content-Length: 0
Date: Mon, 08 Jan 2024 13:11:18 GMT
```

## Use Cases

- Netflix ( a netflix like project can use our api for the backend - can use the database for storing the movie library )
- IMDB ( a movie review website can use our review and user logic for the backend - providing the possibility for a user to write a review for a movie)
- Self hosted movie library ( a plex clone can use our api and relations - a microservice that detects movie names can use the database to store the local movie library)
- Film Studies Research ( the movie category and oscars implementation can be useful for a project like this - can Oscar relations write concise reviews for movies)
- Film Festival Programming ( with a watchlist implemented, the project can make use of it for future movie programming - providing the possibility for user to organize his schedule for the wanted movies)
