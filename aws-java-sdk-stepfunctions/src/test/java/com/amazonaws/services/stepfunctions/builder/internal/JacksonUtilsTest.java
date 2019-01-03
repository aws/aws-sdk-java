/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.stepfunctions.builder.internal;

import static com.amazonaws.services.stepfunctions.builder.StatesAsserts.assertJsonEquals;
import static com.amazonaws.services.stepfunctions.builder.internal.JacksonUtils.jsonToString;
import static com.amazonaws.services.stepfunctions.builder.internal.JacksonUtils.objectToJsonNode;
import static com.amazonaws.services.stepfunctions.builder.internal.JacksonUtils.stringToJsonNode;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.stepfunctions.builder.SimplePojo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import org.junit.Test;
import org.mockito.Mockito;

public class JacksonUtilsTest {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    @Test
    public void jsonToString_NullNode_ReturnsNull() {
        assertNull(jsonToString(null));
    }

    @Test
    public void jsonToString_NonNullNode_ReturnsJson() throws IOException {
        String json = "{\"foo\": \"bar\"}";
        assertJsonEquals(json, jsonToString(MAPPER.readTree(json)));
    }

    @Test(expected = SdkClientException.class)
    public void invalidJsonNode_ThrowsException() throws IOException {
        JsonNode mock = Mockito.mock(JsonNode.class);
        Mockito.doThrow(new JsonMappingException("BOOM"))
               .when(mock).serialize(any(JsonGenerator.class), any(SerializerProvider.class));
        jsonToString(mock);
    }

    @Test
    public void stringToJsonNode_NullString_ReturnsNull() {
        assertNull(stringToJsonNode("Param", null));
    }

    @Test
    public void stringToJsonNode_ValidJson_ReturnsJsonNode() throws JsonProcessingException {
        String json = "[1, 2, 3]";
        JsonNode actual = stringToJsonNode("Param", json);
        assertJsonEquals(json, MAPPER.writeValueAsString(actual));
    }

    @Test(expected = SdkClientException.class)
    public void stringToJsonNode_InvalidJson_ThrowsException() throws JsonProcessingException {
        stringToJsonNode("Param", "{");
    }

    @Test
    public void objectToJsonNode_ReturnsJsonNode() throws JsonProcessingException {
        JsonNode actual = objectToJsonNode(new SimplePojo("value"));
        assertJsonEquals("{\"foo\": \"value\"}", MAPPER.writeValueAsString(actual));
    }

}