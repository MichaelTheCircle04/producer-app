package com.mtrifonov.producer.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mtrifonov.producer.DTO.MoneyTransferNoteDTO;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @Mikhail Trifonov
 */
@Component
public class KafkaProducer {
    
    private final ObjectMapper mapper;
    private final KafkaTemplate<String, String> template;

    public KafkaProducer(ObjectMapper mapper, KafkaTemplate<String, String> template) {
        this.mapper = mapper;
        this.template = template;
    }
    
    public void produce(MoneyTransferNoteDTO data) throws JsonProcessingException {
        String message = mapper.writeValueAsString(data);
        template.send("test-topic", message);
        
    }
}
