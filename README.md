# Spring Boot with Kafka Real World Project

This project pretends to create two microservices to use Apache Kafka as a messaging system to exchange messages between them.

This project is built as a parent-pom project with Spring Boot and Maven and includes two modules for exchange messages.

The project includes a docker-compose.yml file to use Kafka and Zookeeper in a docker container (The use of this file It's optional only if you don't want to install the Kafka into your local machine).

## Modules

* wikimedia-producer
* wikimedia-consumer

### wikimedia-producer

This module is in charge of processing the recent data from the wikimedia stream and sending it to the kafka broker.

### wikimedia-consumer

This module is in charge of processing the data from the kafka broker and persist them into an embebbed database.
