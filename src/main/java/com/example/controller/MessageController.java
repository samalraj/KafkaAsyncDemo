package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.kafkaclients.KafkaProducer;

import java.util.concurrent.CompletableFuture;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MessageController {
    private final KafkaProducer producer;

    public MessageController(KafkaProducer producer) {
        this.producer = producer;
    }

   @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        CompletableFuture<Void> future = producer.sendMessage(message);
        future.thenAccept(result -> {
            // Handle success
        }).exceptionally(ex -> {
            // Handle failure
            return null;
        });
        return new ResponseEntity<>("Message sent successfully", HttpStatus.OK);
    }

}
