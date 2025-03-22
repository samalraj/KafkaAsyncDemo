package com.example.kafkaclients;

import java.util.concurrent.CompletableFuture;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String topic = "flt_msg";

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public CompletableFuture<Void> sendMessage(String message) {
        return CompletableFuture.runAsync(() -> kafkaTemplate.send(topic, message));
    }
}
