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
package com.amazonaws.http;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.internal.http.ErrorCodeParser;
import com.amazonaws.internal.http.JsonErrorMessageParser;
import com.amazonaws.protocol.json.JsonContent;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.fasterxml.jackson.core.JsonFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@SdkInternalApi
public class JsonErrorResponseHandler implements HttpResponseHandler<AmazonServiceException> {

    private static final Log LOG = LogFactory.getLog(JsonErrorResponseHandler.class);

    private final List<JsonErrorUnmarshaller> unmarshallers;
    private final ErrorCodeParser errorCodeParser;
    private final JsonErrorMessageParser errorMessageParser;
    private final JsonFactory jsonFactory;

    public JsonErrorResponseHandler(
            List<JsonErrorUnmarshaller> errorUnmarshallers,
            ErrorCodeParser errorCodeParser,
            JsonErrorMessageParser errorMessageParser,
            JsonFactory jsonFactory) {
        this.unmarshallers = errorUnmarshallers;
        this.errorCodeParser = errorCodeParser;
        this.errorMessageParser = errorMessageParser;
        this.jsonFactory = jsonFactory;
    }

    @Override
    public boolean needsConnectionLeftOpen() {
        return false;
    }

    @Override
    public AmazonServiceException handle(HttpResponse response) throws Exception {
        JsonContent jsonContent = JsonContent.createJsonContent(response, jsonFactory);
        String errorCode = errorCodeParser.parseErrorCode(response, jsonContent);
        AmazonServiceException ase = createException(errorCode, jsonContent);

        // Jackson has special-casing for 'message' values when deserializing
        // Throwables, but sometimes the service passes the error message in
        // other JSON fields - handle it here.
        if (ase.getErrorMessage() == null) {
            ase.setErrorMessage(errorMessageParser.parseErrorMessage(response, jsonContent.getJsonNode()));
        }

        ase.setErrorCode(errorCode);
        ase.setServiceName(response.getRequest().getServiceName());
        ase.setStatusCode(response.getStatusCode());
        ase.setErrorType(getErrorTypeFromStatusCode(response.getStatusCode()));
        ase.setRawResponse(jsonContent.getRawContent());
        String requestId = getRequestIdFromHeaders(response.getHeaders());
        if (requestId != null) {
            ase.setRequestId(requestId);
        }
        ase.setHttpHeaders(response.getHeaders());
        return ase;
    }

    /**
     * Create an AmazonServiceException using the chain of unmarshallers. This method will never
     * return null, it will always return a valid AmazonServiceException
     *
     * @param errorCode
     *            Error code to find an appropriate unmarshaller
     * @param jsonContent
     *            JsonContent of HTTP response
     * @return AmazonServiceException
     */
    private AmazonServiceException createException(String errorCode, JsonContent jsonContent) {
        AmazonServiceException ase = unmarshallException(errorCode, jsonContent);
        if (ase == null) {
            ase = new AmazonServiceException(
                    "Unable to unmarshall exception response with the unmarshallers provided");
        }
        return ase;
    }

    private AmazonServiceException unmarshallException(String errorCode, JsonContent jsonContent) {
        for (JsonErrorUnmarshaller unmarshaller : unmarshallers) {
            if (unmarshaller.matchErrorCode(errorCode)) {
                try {
                    return unmarshaller.unmarshall(jsonContent.getJsonNode());
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

}
