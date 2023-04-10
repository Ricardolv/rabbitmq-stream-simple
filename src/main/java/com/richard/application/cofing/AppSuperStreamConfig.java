package com.richard.application.cofing;

import com.richard.application.cofing.jackson.RabbitStreamTemplateSimpleFactory;
import com.richard.application.cofing.jackson.StreamListener;
import com.richard.application.cofing.jackson.StreamListenerContainerSimpleFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.rabbit.stream.config.SuperStream;
import org.springframework.rabbit.stream.listener.StreamListenerContainer;
import org.springframework.rabbit.stream.producer.RabbitStreamTemplate;

@Configuration
@RequiredArgsConstructor
public class AppSuperStreamConfig {

    private static final String SUPER_STREAM = "app.super";

    @Bean
    SuperStream appSuperStream() {
        return new SuperStream(SUPER_STREAM, 3);
    }

    @Bean
    RabbitStreamTemplate appRabbitStreamTemplate(RabbitStreamTemplateSimpleFactory factory) {
        return factory.apply(SUPER_STREAM);
    }

    @Bean
    <T> StreamListenerContainer appContainer(StreamListenerContainerSimpleFactory<T> factory,
                                             StreamListener<T> appSuperStreamConsumer) {
        return factory.apply(SUPER_STREAM, appSuperStreamConsumer);
    }

}
