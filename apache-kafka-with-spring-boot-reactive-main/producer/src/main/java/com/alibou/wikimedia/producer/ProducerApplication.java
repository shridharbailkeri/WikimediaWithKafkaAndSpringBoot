package com.alibou.wikimedia.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerApplication {
	// producer and consumer running on same port - correction required server: port: 8081 producer .yml
	// run consumer (starts listening)
	//  run producer (producer should be up and running) - because it needs to first consume from external api (keep listening)
	// then in postman and send a get request to "/api/v1/wikimedia"
	// now producer starts consuming the external api
	// then .subscribe(producer::sendMessage); will start publishing the messages to the broker
	// consumer sees and consumes messages
	// summary ProducerConsumeStreamAndPublish AndConsumerConsumeAgain


	// also alternatively
	//in a terminal kafka_server and windows folder:
	// $ bin/kafka-console-consumer.sh --topic wikimedia-stream --from-beginning --bootstrap-server localhost:9092 - keeps the stream ready

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}

}
