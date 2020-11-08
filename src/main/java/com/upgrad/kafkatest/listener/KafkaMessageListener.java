package com.upgrad.kafkatest.listener;


import com.upgrad.kafkatest.entity.ProgressEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaMessageListener {


    @KafkaListener(topics = "${kafka-test.kafka-properties.topic}", groupId = "groupId")
    public void listen(ProgressEvent message) {
        log.info("Received Messasge in group - group-id: " + message);
    }

}
