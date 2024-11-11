package com.mtrifonov.producer.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @Mikhail Trifonov
 */
@Configuration
public class KafkaConfig {
    
    @Bean
    public NewTopic newTopic() {
        return new NewTopic("test-topic", 1, (short) 1);
    }
}
