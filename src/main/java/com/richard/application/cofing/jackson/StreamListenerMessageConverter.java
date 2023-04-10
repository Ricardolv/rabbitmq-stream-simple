package com.richard.application.cofing.jackson;


import org.springframework.amqp.core.MessageListener;

import java.util.function.Function;

public interface StreamListenerMessageConverter<T> extends Function<StreamListener<T>, MessageListener> {
}
