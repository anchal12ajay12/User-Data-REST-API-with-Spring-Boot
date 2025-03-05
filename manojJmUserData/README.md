# Spring Boot API Project
This project is designed to demonstrate the use of various Spring Boot features, including REST APIs, validation, logging, exception handling, and more. Below is a summary of the tasks implemented and the corresponding API endpoints.

## Task List

### Task 1: Set up a Spring Boot project
Description: A Spring Boot project set up with basic dependencies (Spring Web, Spring Boot DevTools).

Outcome: A functional Spring Boot project with the proper folder structure.

### Task 2: Create a simple REST API endpoint
Description: A basic "Hello, World!" endpoint.

Endpoint:

GET /hello
Expected Output: "Hello, World!"

### Task 3: Add a second REST API endpoint that accepts a name as a path variable

Description: A greeting endpoint that accepts a name as a path variable.

Endpoint:

GET /greet/{name}

Expected Output: "Hello, {name}!"

### Task 4: Create a POST API that accepts name and age details as JSON

Description: A POST endpoint that accepts name and age as JSON and returns a formatted message.

Endpoint:

POST /greet

Expected Payload:

{
  "name": "John",
  "age": 25
}

Expected Output: "Hello, John! You are 25 years old."

### Task 5: Write a simple JUnit test for the APIs developed

Description: Basic unit tests for the APIs created.

Test Details: A JUnit test will check the functionality of the endpoints.

### Task 6: Add a new REST API endpoint to accept a JSON payload and return the same data

Description: A POST endpoint that echoes back the JSON data.

Endpoint:

POST /echo

Expected Output: The same JSON data sent in the request.

### Task 7: Implement basic validation for the JSON payload using annotations

Description: Implement validation for the name and age fields using @NotNull and @Size annotations.

Endpoint:

POST /greet/validate

Expected Payload:

{
  "name": "John",
  "age": 25
}

Expected Output: Validation errors return meaningful messages for invalid input.

### Task 8: Use a List in memory to store user data and implement CRUD operations

Description: Implement an in-memory user data storage with CRUD operations.

Endpoints:

POST /users/add - Add a user

GET /users/{id} - Get user by ID

GET /users - List all users

DELETE /users/{id} - Delete user by ID

Expected Output: Appropriate user data added, retrieved, or deleted.

### Task 9: Learn and configure basic logging using SLF4J

Description: Configure basic logging for the application.

Endpoint: All endpoints will log API calls.

### Task 10: Write a simple integration test to test the JSON payload endpoint

Description: Integration tests to verify the JSON payload functionality.

Test Endpoint URL: /echo

### Task 11: Add query parameters to filter users by name or age

Description: Filter users by name or age using query parameters.

Endpoint:

GET /users/filter?name={name}&age={age}

Expected Output: A filtered list of users based on the provided query parameters.

### Task 12: Use both @RequestParam and @PathVariable in the same endpoint

Description: Use both @RequestParam and @PathVariable in the same endpoint.

Endpoint:

GET /greet/task12/{name}?message={message}

Expected Output: "Hello, {name}! {message}"

### Task 13: Add a feature to count the number of times each endpoint has been called

Description: Count and display the number of times the /hello endpoint is called.

Endpoint:

GET /hello

Expected Output: "Hello, World! This endpoint has been called [x] times."

### Task 14: Handle exceptions globally using @ControllerAdvice

Description: Global exception handling for unhandled exceptions.

Endpoint:

GET /error?name=error

Expected Output: "Error: Something went wrong!"

### Task 15: Create an endpoint that returns a list of numbers asynchronously

Description: Asynchronously return numbers from 1 to 10.

Endpoint:

GET /numbers

Expected Output: A list of numbers from 1 to 10.

### Task 16: Add a scheduled task that logs "Application is running" every 5 minutes

Description: A scheduled task that logs a message every 5 minutes.

Log Message: "Application is running"

Note: No direct endpoint, but the log can be viewed every 5 minutes.

### Task 17: Configure dev and prod profiles with different logging levels

Description: Configure different logging levels for dev and prod profiles.

Test: Switch between dev and prod profiles and check log levels.

### Task 18: Demonstrate the use of Actuator

Description: Expose health check and other actuator endpoints.

Endpoint:

GET /actuator/health

Expected Output: {"status":"UP"}

### Task 19: Create a simple HTML page and serve it as a static resource

Description: Serve a static HTML page from the resources/static folder.

Endpoint:

GET /

Expected Output: A simple HTML page with a welcome message.

### Task 20: Prepare and present a demo of the project

Description: Prepare and present a demo of the project with all the features implemented.
# Conclusion

This project demonstrates the creation and implementation of RESTful APIs using Spring Boot, incorporating features such as validation, exception handling, async processing, scheduled tasks, and more. Each task represents a step in building a fully functional Spring Boot application.

Feel free to explore and test each endpoint as per the tasks listed above.
