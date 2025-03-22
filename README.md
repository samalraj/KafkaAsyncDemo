# KafkaDemo

KafkaDemo is a Spring Boot application that demonstrates how to produce and consume messages using Apache Kafka in a non-blocking manner.

## Prerequisites

- Java 17 or higher
- Apache Kafka
- Maven or Gradle
- Git

## Getting Started

### Clone the Repository

```sh
git clone https://github.com/your-username/KafkaDemo.git
cd KafkaDemo

Build the Project
Using Maven
Using Gradle
Run the Application
Sending Messages
You can send messages to the Kafka topic by making a POST request to the /send endpoint.

Example using curl:

Consuming Messages
Messages sent to the Kafka topic will be consumed by the application and printed to the console.

Project Structure
KafkaDemoApplication.java: The main application class.
MessageController.java: REST controller for sending messages to Kafka.
KafkaProducer.java: Kafka producer for sending messages.
KafkaConsumer.java: Kafka consumer for consuming messages.
KafkaDemoApplicationTests.java: Unit tests for the application.
Dependencies
Spring Boot
Spring Kafka
Project Reactor
JUnit 5
License
This project is licensed under the MIT License - see the LICENSE file for details.

