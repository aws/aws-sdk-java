/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.internal.http.JsonErrorCodeParser;
import com.amazonaws.protocol.json.JsonContent;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonErrorCodeParserTest {

    /**
     * Value of error type present in headers for tests below
     */
    private static final String HEADER_ERROR_TYPE = "headerErrorType";

    /**
     * Value of error type present in JSON content for tests below
     */
    private static final String JSON_ERROR_TYPE = "jsonErrorType";

    private static final String ERROR_FIELD_NAME = "testErrorCode";
    private static final ObjectMapper MAPPER = new ObjectMapper();

    private final JsonErrorCodeParser parser = new JsonErrorCodeParser(ERROR_FIELD_NAME);

    @Test
    public void parseErrorType_ErrorTypeInHeadersTakesPrecedence_NoSuffix() {
        String actualErrorType = parser.parseErrorCode(
                httpResponseWithHeaders(JsonErrorCodeParser.X_AMZN_ERROR_TYPE, HEADER_ERROR_TYPE),
                toJsonContent(JSON_ERROR_TYPE));
        assertEquals(HEADER_ERROR_TYPE, actualErrorType);
    }

    @Test
    public void parseErrorType_ErrorTypeInHeadersTakesPrecedence_SuffixIgnored() {
        String actualErrorType = parser.parseErrorCode(
                httpResponseWithHeaders(JsonErrorCodeParser.X_AMZN_ERROR_TYPE,
                        String.format("%s:%s", HEADER_ERROR_TYPE, "someSuffix")), toJsonContent(JSON_ERROR_TYPE));
        assertEquals(HEADER_ERROR_TYPE, actualErrorType);
    }

    @Test
    public void parseErrorType_ErrorTypeInContent_NoPrefix() {
        String actualErrorType = parser.parseErrorCode(httpResponseWithoutHeaders(), toJsonContent(JSON_ERROR_TYPE));
        assertEquals(JSON_ERROR_TYPE, actualErrorType);
    }

    @Test
    public void parseErrorType_ErrorTypeInContent_PrefixIgnored() {
        String actualErrorType = parser.parseErrorCode(httpResponseWithoutHeaders(),
                toJsonContent(String.format("%s#%s", "somePrefix", JSON_ERROR_TYPE)));
        assertEquals(JSON_ERROR_TYPE, actualErrorType);
    }

    @Test
    public void parseErrorType_NotPresentInHeadersAndNullContent_ReturnsNull() {
        assertNull(parser.parseErrorCode(httpResponseWithoutHeaders(), null));
    }

    @Test
    public void parseErrorType_NotPresentInHeadersAndEmptyContent_ReturnsNull() {
        assertNull(parser.parseErrorCode(httpResponseWithoutHeaders(), new JsonContent(null, new ObjectMapper().createObjectNode())));
    }

    private static JsonContent toJsonContent(String errorType) {
        ObjectNode node = MAPPER.createObjectNode();
        node.put(ERROR_FIELD_NAME, errorType);
        return new JsonContent(null, node);
    }

    private static HttpResponse httpResponseWithoutHeaders() {
        return new HttpResponse(null, null);
    }

    private static HttpResponse httpResponseWithHeaders(String header, String value) {
        HttpResponse response = new HttpResponse(null, null);
        response.addHeader(header, value);
        return response;
    }
}
