package com.upgrad.kafkatest.sender;


import com.upgrad.kafkatest.entity.ProgressEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class KafkaMessageSender {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(String topic, ProgressEvent progressEvent) {
        log.info("Sending message to topic {} : {}", topic, progressEvent);
        kafkaTemplate.send(topic, progressEvent);
    }
}
