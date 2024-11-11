package com.mtrifonov.producer.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mtrifonov.producer.DTO.MoneyTransferNoteDTO;
import com.mtrifonov.producer.kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @Mikhail Trifonov
 */
@RestController
@RequestMapping("/api")
public class SimpleController {
    
    private final KafkaProducer producer;

    public SimpleController(KafkaProducer producer) {
        this.producer = producer;
    }
    
    @PostMapping
    public ResponseEntity<Void> entryPoint(@RequestBody MoneyTransferNoteDTO data) throws JsonProcessingException {
        producer.produce(data);
        return ResponseEntity.ok().build();
    }
}
