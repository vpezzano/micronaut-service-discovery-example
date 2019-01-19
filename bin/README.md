mkdir micronaut-service-discovery-example
Create 3 apps under micronaut-service-discovery-example, one client and two servers:
cd micronaut-service-discovery-example
mn create-app com.techprimers.micronaut.client
mn create-app com.techprimers.micronaut.server1
mn create-app com.techprimers.micronaut.server2
Create 2 clients in the client app, one is a client of server1, and the other is a client of server2:
cd client 
mn create-client server1-client
mn create-client server2-client
Create HelloController under server1:
cd ../server1
mn create-controller hello-controller
Create HelloController under server2:
cd ../server2
mn create-controller hello-controller
start all the applications with the command:
gradlew run