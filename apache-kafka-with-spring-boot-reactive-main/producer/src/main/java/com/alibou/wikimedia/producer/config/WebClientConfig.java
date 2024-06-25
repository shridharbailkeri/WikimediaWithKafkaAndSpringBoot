package com.alibou.wikimedia.producer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    //Why WebClient?

    //Inter-Service Communication: If your Kafka consumers or producers need to communicate with other microservices or external APIs,
    //the WebClient is a non-blocking, reactive HTTP client that can handle such requests efficiently.
    //This is particularly useful in microservices architecture where services often need to interact with each other over HTTP.

    //Data Enrichment: When consuming messages from Kafka, you might need to enrich the data with additional information fetched from external services.
    // For example, if a Kafka message contains an ID,
    // your application might need to fetch more details about this ID from another service. WebClient can be used to make these HTTP requests.


    //Monitoring and Health Checks: Sometimes, Kafka consumers might need to check the health or status of external services before processing messages.
    // Using WebClient, your application can perform these checks by making HTTP requests to the relevant endpoints.

    //Configuration Management: In some scenarios, you might need to dynamically fetch configuration data from an external service or API.
    // WebClient can be used to retrieve these configurations, which can then be used to adjust the behavior of your Kafka consumers or producers.

    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}
