package net.springmicro.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic microTopic(){
        return TopicBuilder.name("arvind")
                .build();
    }

    @Bean
    public NewTopic microJsonTopic(){
        return TopicBuilder.name("arvind_json")
                .build();
    }
}
