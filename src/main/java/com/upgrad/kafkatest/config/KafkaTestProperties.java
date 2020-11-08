package com.upgrad.kafkatest.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "kafka-test")
@Data
@Configuration
public class KafkaTestProperties {

    private final KafkaProperties kafkaProperties = new KafkaProperties();

    @Data
    public static class KafkaProperties {
        private String topic;
    }
}
