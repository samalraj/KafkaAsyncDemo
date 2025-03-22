package com.example.kafkaclients;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
@Component
public class KafkaConsumer {    

    @KafkaListener(topics = "flt_msg", groupId = "flt_group")
    public void consumeMessage(String message) {
        Mono.just(message)
            .doOnNext(msg -> System.out.println(String.format("Consumed message -> %s", msg)))
            .subscribe();
    }
    
}
