package com.upgrad.kafkatest.controller;

import com.upgrad.kafkatest.config.KafkaTestProperties;
import com.upgrad.kafkatest.entity.ProgressEvent;
import com.upgrad.kafkatest.sender.KafkaMessageSender;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/progress")
public class ProgressEventController {

    private final KafkaTestProperties kafkaTestProperties;

    private final KafkaMessageSender kafkaMessageSender;


    @PostMapping
    public void postProgressEvent(@RequestBody ProgressEvent progressEvent) {
        kafkaMessageSender.sendMessage(kafkaTestProperties.getKafkaProperties().getTopic(), progressEvent);
    }
}
