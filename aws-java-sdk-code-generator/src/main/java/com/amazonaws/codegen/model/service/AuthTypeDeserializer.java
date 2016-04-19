package com.amazonaws.codegen.model.service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class AuthTypeDeserializer extends JsonDeserializer<AuthType> {

    @Override
    public AuthType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        return AuthType.fromValue(p.getText());
    }
}
