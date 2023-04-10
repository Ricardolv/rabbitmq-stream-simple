package com.richard.application.cofing.jackson;


import org.springframework.rabbit.stream.producer.RabbitStreamTemplate;

import java.util.function.Function;

public interface RabbitStreamTemplateSimpleFactory extends Function<String, RabbitStreamTemplate> {
}
