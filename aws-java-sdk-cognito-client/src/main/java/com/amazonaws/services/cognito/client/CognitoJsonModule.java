package com.amazonaws.services.cognito.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;

class CognitoJsonModule {
    public static final ObjectMapper MAPPER = configure(new ObjectMapper());

    private CognitoJsonModule() {
        // not intended for instantiation
    }

    public static ObjectMapper configure(ObjectMapper mapper) {
        return mapper
                .registerModule(new Jdk8Module())
                .registerModule(new JavaTimeModule());
    }

    public static <T> T toObject(String json, Class<T> klass) throws CognitoTokenVerifyException {
        try {
            return MAPPER.readValue(json, klass);
        } catch (IOException e) {
            throw new CognitoTokenVerifyException("Unable to parse " + klass + ": " + json, e);
        }
    }
}
