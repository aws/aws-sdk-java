/*
 * Copyright 2015-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyMapOf;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.http.JsonErrorCodeParser;
import com.amazonaws.transform.JsonErrorUnmarshallerV2;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.fasterxml.jackson.databind.JsonNode;

public class JsonErrorResponseHandlerV2Test {

    private static final String SERVICE_NAME = "someService";
    private static final String ERROR_CODE = "someErrorCode";
    private JsonErrorResponseHandlerV2 responseHandler;
    private HttpResponse httpResponse;

    @Mock
    private JsonErrorUnmarshallerV2 unmarshaller;

    @Mock
    private JsonErrorCodeParser errorCodeParser;

    @Before
    public void setup() throws UnsupportedEncodingException {
        MockitoAnnotations.initMocks(this);
        when(errorCodeParser.parseErrorCode(anyMapOf(String.class, String.class), (JsonNode) anyObject())).thenReturn(
                ERROR_CODE);

        httpResponse = new HttpResponse(new DefaultRequest<String>(SERVICE_NAME), null);
        httpResponse.setContent(new StringInputStream("{}"));

        responseHandler = new JsonErrorResponseHandlerV2(
                Arrays.asList(unmarshaller), errorCodeParser);
    }

    @Test
    public void handle_NoUnmarshallersAdded_ReturnsGenericAmazonServiceException() throws Exception {
        responseHandler = new JsonErrorResponseHandlerV2(new ArrayList<JsonErrorUnmarshallerV2>());

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertNotNull(ase);
    }

    @Test
    public void handle_NoMatchingUnmarshallers_ReturnsGenericAmazonServiceException() throws Exception {
        expectUnmarshallerDoesNotMatch();

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertNotNull(ase);
    }

    @Test
    public void handle_NullContent_ReturnsGenericAmazonServiceException() throws Exception {
        httpResponse.setStatusCode(500);
        httpResponse.setContent(null);

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        // We assert these common properties are set again to make sure that code path is exercised
        // for unknown AmazonServiceExceptions as well
        assertEquals(ERROR_CODE, ase.getErrorCode());
        assertEquals(500, ase.getStatusCode());
        assertEquals(SERVICE_NAME, ase.getServiceName());
        assertEquals(ErrorType.Service, ase.getErrorType());
    }

    @Test
    public void handle_EmptyContent_ReturnsGenericAmazonServiceException() throws Exception {
        httpResponse.setStatusCode(500);
        httpResponse.setContent(new StringInputStream(""));

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertNotNull(ase);
    }

    @Test
    public void handle_UnmarshallerReturnsNull_ReturnsGenericAmazonServiceException() throws Exception {
        expectUnmarshallerMatches();

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertNotNull(ase);
        assertEquals(ERROR_CODE, ase.getErrorCode());
    }

    @Test
    public void handle_UnmarshallerThrowsException_ReturnsGenericAmazonServiceException() throws Exception {
        expectUnmarshallerMatches();
        when(unmarshaller.unmarshall((JsonNode) anyObject())).thenThrow(new RuntimeException());

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertNotNull(ase);
        assertEquals(ERROR_CODE, ase.getErrorCode());
    }

    @Test
    public void handle_UnmarshallerReturnsException_ClientErrorType() throws Exception {
        httpResponse.setStatusCode(400);
        expectUnmarshallerMatches();
        when(unmarshaller.unmarshall((JsonNode) anyObject())).thenReturn(new CustomException("error"));

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertEquals(ERROR_CODE, ase.getErrorCode());
        assertEquals(400, ase.getStatusCode());
        assertEquals(SERVICE_NAME, ase.getServiceName());
        assertEquals(ErrorType.Client, ase.getErrorType());
    }

    @Test
    public void handle_UnmarshallerReturnsException_ServiceErrorType() throws Exception {
        httpResponse.setStatusCode(500);
        expectUnmarshallerMatches();
        when(unmarshaller.unmarshall((JsonNode) anyObject())).thenReturn(new CustomException("error"));

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertEquals(ErrorType.Service, ase.getErrorType());
    }

    @Test
    public void handle_UnmarshallerReturnsException_WithRequestId() throws Exception {
        httpResponse.setStatusCode(500);
        httpResponse.addHeader(HttpResponseHandler.X_AMZN_REQUEST_ID_HEADER, "1234");
        expectUnmarshallerMatches();
        when(unmarshaller.unmarshall((JsonNode) anyObject())).thenReturn(new CustomException("error"));

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertEquals("1234", ase.getRequestId());
    }

    /**
     * Headers are case insensitive so the request id should still be parsed in this test
     */
    @Test
    public void handle_UnmarshallerReturnsException_WithCaseInsensitiveRequestId() throws Exception {
        httpResponse.setStatusCode(500);
        httpResponse.addHeader(StringUtils.upperCase(HttpResponseHandler.X_AMZN_REQUEST_ID_HEADER), "1234");
        expectUnmarshallerMatches();
        when(unmarshaller.unmarshall((JsonNode) anyObject())).thenReturn(new CustomException("error"));

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertEquals("1234", ase.getRequestId());
    }

    private void expectUnmarshallerMatches() throws Exception {
        when(unmarshaller.matchErrorCode(anyString())).thenReturn(true);
    }

    private void expectUnmarshallerDoesNotMatch() throws Exception {
        when(unmarshaller.matchErrorCode(anyString())).thenReturn(false);
    }

    private static class CustomException extends AmazonServiceException {

        private static final long serialVersionUID = 1305027296023640779L;

        public CustomException(String errorMessage) {
            super(errorMessage);
        }
    }
}
