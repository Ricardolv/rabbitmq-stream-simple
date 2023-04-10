package com.richard.infrastructure.messaging;

import com.richard.application.cofing.jackson.StreamListener;
import com.richard.domain.Request;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class AppSuperStreamConsumer extends StreamListener<Request> {

    @Override
    @Retryable(interceptor = "streamRetryOperationsInterceptorFactoryBean")
    public void onMessage(Request payload) {
        log.info("Consumer message: {}", payload);
    }
}
