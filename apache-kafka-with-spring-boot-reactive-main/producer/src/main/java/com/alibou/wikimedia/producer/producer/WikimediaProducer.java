package com.alibou.wikimedia.producer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
@Slf4j
public class WikimediaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    // First String (Key Type): This represents the type of the key for the Kafka messages.
    // Kafka messages can have keys that are used to determine the partition within the topic to which the message will be sent.
    // In this case, the key is of type String.

    //Second String (Value Type): This represents the type of the value for the Kafka messages.
    // In this example, the value of the messages being sent is of type String.

    //If you were to include a key with your message,
    // you could use an overloaded method of send that takes both the key and value, such as kafkaTemplate.send("wikimedia-stream", key, msg).

    public void sendMessage(String msg) {
        // log.info(format("Sending message to alibou Topic:: %s", msg));
        kafkaTemplate.send("wikimedia-stream", msg);
    }


}
