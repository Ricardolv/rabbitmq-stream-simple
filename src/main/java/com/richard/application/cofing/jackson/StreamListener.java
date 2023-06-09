package com.richard.application.cofing.jackson;


import com.fasterxml.jackson.core.type.TypeReference;

public abstract  class StreamListener<T> extends TypeReference<T> {

    public abstract void onMessage(T payload);
}
