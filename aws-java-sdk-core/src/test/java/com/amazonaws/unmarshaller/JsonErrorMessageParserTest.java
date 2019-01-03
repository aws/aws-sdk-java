/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.unmarshaller;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.internal.http.JsonErrorMessageParser;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class JsonErrorMessageParserTest {

    private static final JsonErrorMessageParser parser = JsonErrorMessageParser.DEFAULT_ERROR_MESSAGE_PARSER;

    private static final String MESSAGE_CONTENT = "boom";

    private HttpResponse response;

    private ObjectNode jsonNode;

    @Before
    public void setup() {
        jsonNode = JsonNodeFactory.instance.objectNode();
        response = new HttpResponse(null, null);
    }

    @Test
    public void deprecatedOverload_ParsesMessageSuccessfully() {
        jsonNode.put("message", MESSAGE_CONTENT);
        String parsed = parser.parseErrorMessage(jsonNode);
        assertEquals(MESSAGE_CONTENT, parsed);
    }

    @Test
    public void testErrorMessageAt_message() {
        jsonNode.put("message", MESSAGE_CONTENT);
        String parsed = parser.parseErrorMessage(response, jsonNode);
        assertEquals(MESSAGE_CONTENT, parsed);
    }

    @Test
    public void testErrorMessageAt_Message() {
        jsonNode.put("Message", MESSAGE_CONTENT);
        String parsed = parser.parseErrorMessage(response, jsonNode);
        assertEquals(MESSAGE_CONTENT, parsed);
    }

    @Test
    public void testErrorMessageAt_errorMessage() {
        jsonNode.put("errorMessage", MESSAGE_CONTENT);
        String parsed = parser.parseErrorMessage(response, jsonNode);
        assertEquals(MESSAGE_CONTENT, parsed);
    }

    @Test
    public void testNoErrorMessage_ReturnsNull() {
        String parsed = parser.parseErrorMessage(response, jsonNode);
        assertNull(parsed);
    }

    @Test
    public void testErrorMessageIsNumber_ReturnsNull() {
        jsonNode.put("message", 1);
        String parsed = parser.parseErrorMessage(response, jsonNode);
        assertNull(parsed);
    }

    @Test
    public void testErrorMessageIsObject_ReturnsNull() {
        jsonNode.set("message", JsonNodeFactory.instance.objectNode().put("foo", "bar"));
        String parsed = parser.parseErrorMessage(response, jsonNode);
        assertNull(parsed);
    }

    @Test
    public void testErrorMessageAtMultipleLocations_ReturnsLowerMessage() {
        jsonNode.put("message", MESSAGE_CONTENT);
        String randomStuff = UUID.randomUUID().toString();
        jsonNode.put("Message", randomStuff);
        jsonNode.put("errorMessage", randomStuff);
        String parsed = parser.parseErrorMessage(response, jsonNode);
        assertEquals(MESSAGE_CONTENT, parsed);
    }

    @Test
    public void errorMessageInHeader_ReturnsHeaderValue() {
        response.addHeader(JsonErrorMessageParser.X_AMZN_ERROR_MESSAGE, MESSAGE_CONTENT);
        String parsed = parser.parseErrorMessage(response, jsonNode);
        assertEquals(MESSAGE_CONTENT, parsed);
    }

    @Test
    public void errorMessageInHeader_ReturnsHeaderValue_CaseInsensitive() {
        response.addHeader("x-AMZN-error-message", MESSAGE_CONTENT);
        String parsed = parser.parseErrorMessage(response, jsonNode);
        assertEquals(MESSAGE_CONTENT, parsed);
    }

    @Test
    public void errorMessageInHeader_TakesPrecedenceOverMessageInBody() {
        response.addHeader(JsonErrorMessageParser.X_AMZN_ERROR_MESSAGE, MESSAGE_CONTENT);
        jsonNode.put("message", "other message in body");
        String parsed = parser.parseErrorMessage(response, jsonNode);
        assertEquals(MESSAGE_CONTENT, parsed);
    }

}
