# Game-Of-Life-Spring-Project

This is simple implementation of Conway's game of life application that is eveloped as RESTful APIs with Spring Boot and running without need of extra configuration.
For easy build and dependency management tool is used Maven. In the case of an error, a specific code to the error and a meaningful message is provided to client.
The application has API Documentation.


Rules of the game:
1. Any live cell with two or three live neighbours survives.
2. Any dead cell with three live neighbours becomes a live cell.
3. All other live cells die in the next generation. Similarly, all other dead cells stay dead.


Instructions:
- You can run the game as a standard Spring app.
- The game does't have user interface. So to get next generation you need to make new POST request.
  
  Example of request body:
  
  {
    "field_dimensions":{
        "number_rows": 6,
        "number_columns": 6
    },
    "live_cells": [
        {
            "row_index":2,
            "column_index":2
        },
        {
            "row_index": 2,
            "column_index":3
        }
    ]
}
  
  
- The playing field consists of rows and columns that are limited from 2 to 100 and filled with cells. 
- Consider that the left and right edges of the field to be stitched together, and the top and bottom edges also, yielding a toroidal array.  
- Each cell exists in one of two possible states - live or dead.
- The game is played by a single player who enter the dimensions of the field and the coordinates of the living cells.
- With every request, the player declares the generation of each subsequent generation, which obeys the rules described above.
- The next generation will appear as responce, with indexes for row and column for living cells.

Useful links about documentation API:
- Access the API documentation at: http://localhost:8080/api-docs/
- Access the API documentation with Swagger UI at: http://localhost:8080/swagger-ui-game-of-life.html
