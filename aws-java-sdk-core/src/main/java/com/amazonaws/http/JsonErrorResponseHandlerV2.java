/*
 * Copyright 2015-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.internal.http.JsonErrorCodeParser;
import com.amazonaws.transform.JsonErrorUnmarshallerV2;
import com.amazonaws.util.IOUtils;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonErrorResponseHandlerV2 implements HttpResponseHandler<AmazonServiceException> {

    private static final Log LOG = LogFactory.getLog(JsonErrorResponseHandlerV2.class);

    private final List<JsonErrorUnmarshallerV2> unmarshallers;
    private final JsonErrorCodeParser errorCodeParser;

    public JsonErrorResponseHandlerV2(List<JsonErrorUnmarshallerV2> errorUnmarshallers) {
        this(errorUnmarshallers, JsonErrorCodeParser.DEFAULT_ERROR_CODE_PARSER);
    }

    public JsonErrorResponseHandlerV2(List<JsonErrorUnmarshallerV2> errorUnmarshallers, JsonErrorCodeParser errorCodeParser) {
        this.unmarshallers = errorUnmarshallers;
        this.errorCodeParser = errorCodeParser;
    }

    @Override
    public boolean needsConnectionLeftOpen() {
        return false;
    }

    @Override
    public AmazonServiceException handle(HttpResponse response) throws Exception {
        JsonContent jsonContent = JsonContent.createJsonContent(response);
        String errorCode = errorCodeParser.parseErrorCode(response.getHeaders(), jsonContent.jsonNode);
        AmazonServiceException ase = createException(errorCode, jsonContent);

        ase.setErrorCode(errorCode);
        ase.setServiceName(response.getRequest().getServiceName());
        ase.setStatusCode(response.getStatusCode());
        ase.setErrorType(getErrorTypeFromStatusCode(response.getStatusCode()));
        ase.setRawResponseContent(jsonContent.rawJsonContent);
        String requestId = getRequestIdFromHeaders(response.getHeaders());
        if (requestId != null) {
            ase.setRequestId(requestId);
        }
        return ase;
    }

    /**
     * Create an AmazonServiceException using the chain of unmarshallers. This method will never
     * return null, it will always return a valid AmazonServiceException
     *
     * @param errorCode
     *            Error code to find an appropriate unmarshaller
     * @param JsonContent
     *            JsonContent of HTTP response
     * @return AmazonServiceException
     */
    private AmazonServiceException createException(String errorCode, JsonContent jsonContent) {
        if (!jsonContent.isJsonValid()) {
            return new AmazonServiceException("Unable to parse HTTP response content");
        }
        AmazonServiceException ase = unmarshallException(errorCode, jsonContent);
        if (ase == null) {
            ase = new AmazonServiceException("Unable to unmarshall exception response with the unmarshallers provided");
        }
        return ase;
    }

    private AmazonServiceException unmarshallException(String errorCode, JsonContent jsonContent) {
        for (JsonErrorUnmarshallerV2 unmarshaller : unmarshallers) {
            if (unmarshaller.matchErrorCode(errorCode)) {
                try {
                    return unmarshaller.unmarshall(jsonContent.jsonNode);
                } catch (Exception e) {
                    LOG.info("Unable to unmarshall exception content", e);
                    return null;
                }
            }
        }
        return null;
    }

    private ErrorType getErrorTypeFromStatusCode(int statusCode) {
        return statusCode < 500 ? ErrorType.Client : ErrorType.Service;
    }

    private String getRequestIdFromHeaders(Map<String, String> headers) {
        for (Entry<String, String> headerEntry : headers.entrySet()) {
            if (headerEntry.getKey().equalsIgnoreCase(X_AMZN_REQUEST_ID_HEADER)) {
                return headerEntry.getValue();
            }
        }
        return null;
    }

    /**
     * Simple struct like class to hold both the raw json string content and it's parsed JsonNode
     */
    private static class JsonContent {

        private static final ObjectMapper MAPPER = new ObjectMapper()
                .configure(JsonParser.Feature.ALLOW_COMMENTS, true);

        public final String rawJsonContent;
        public final JsonNode jsonNode;

        /**
         * Static factory method to create a JsonContent object from the contents of the
         * HttpResponse provided
         */
        public static JsonContent createJsonContent(HttpResponse httpResponse) {
            String rawJsonContent = null;
            try {
                rawJsonContent = IOUtils.toString(httpResponse.getContent());
            } catch (Exception e) {
                LOG.info("Unable to read HTTP response content", e);
            }
            return new JsonContent(rawJsonContent);

        }

        private JsonContent(String rawJsonContent) {
            this.rawJsonContent = rawJsonContent;
            this.jsonNode = parseJsonContent(rawJsonContent);
        }

        private static JsonNode parseJsonContent(String rawJsonContent) {
            if (rawJsonContent == null) {
                return null;
            }
            try {
                return MAPPER.readTree(rawJsonContent);
            } catch (Exception e) {
                LOG.info("Unable to parse HTTP response content", e);
                return null;
            }
        }

        public boolean isJsonValid() {
            return jsonNode != null;
        }

    }
}
