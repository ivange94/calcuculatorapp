# calcuculatorapp

This a simple calculator that takes an operator and two operands then performs a mathematical operation and return a result.
This is a school assignment. This could be implemented only as a JavaScript app but the course requirement says it should be 
in client server form. So I created a server with Spring Boot and front end is just a normal HTML app that connects to the 
back end via ajax calls.

# How to
To see this app work, you need to run both the client and the server. The server by default will be listening to port 8080 and 
the client port will depend on which server you deployed it to. For development I used just the SimpleHTTPServer python module
for the client.

## Run server

To run the server you first need to build the server code. It's a maven application. To build the server first navigate to the
root of the maven project

`cd server/app`

and execute

`mvn clean install` 

And that will generate a .jar file that you can execute like this

`java -jar target/app-{version}.jar`

**Note** If you don't want to go through the stress of building the application you can just execute the .jar file in the target 
directory. 

## Run client

You can run the client on any server you wish. Just make sure you server is running on http://localhost:8080 because the client has been
configured to connect to the server via that url. Also the server has been configured to allow cross origin request from any
origin so it doesn't matter which port your client is running on, it'll still be able to access the server.

