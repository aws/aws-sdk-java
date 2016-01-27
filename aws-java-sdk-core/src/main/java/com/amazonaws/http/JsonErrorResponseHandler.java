/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map.Entry;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.json.JSONObject;

public class JsonErrorResponseHandler implements HttpResponseHandler<AmazonServiceException> {

    /**
     * Services using AWS JSON 1.1 protocol with HTTP binding send the error
     * type information in the response headers, instead of the content.
     */
    private static final String X_AMZN_ERROR_TYPE = "x-amzn-ErrorType";

    /**
     * The list of error response unmarshallers to try to apply to error
     * responses.
     */
    private List<? extends JsonErrorUnmarshaller> unmarshallerList;

    public JsonErrorResponseHandler(List<? extends JsonErrorUnmarshaller> exceptionUnmarshallers) {
        this.unmarshallerList = exceptionUnmarshallers;
    }

    public AmazonServiceException handle(HttpResponse response) throws Exception {
        String streamContents = readStreamContents(response.getContent());
        JSONObject jsonErrorMessage;
        try {
            String s = streamContents;
            if (s.length() == 0 || s.trim().length() == 0) s = "{}";
            jsonErrorMessage = new JSONObject(s);
        } catch (Exception e) {
            throw new AmazonClientException("Unable to parse error response: '" + streamContents + "'", e);
        }

        String errorTypeFromHeader = parseErrorTypeFromHeader(response);

        AmazonServiceException ase = runErrorUnmarshallers(response, jsonErrorMessage, errorTypeFromHeader);
        if (ase == null) return null;

        ase.setServiceName(response.getRequest().getServiceName());
        ase.setStatusCode(response.getStatusCode());
        if (response.getStatusCode() < 500) {
            ase.setErrorType(ErrorType.Client);
        } else {
            ase.setErrorType(ErrorType.Service);
        }

        for (Entry<String, String> headerEntry : response.getHeaders().entrySet()) {
            if (headerEntry.getKey().equalsIgnoreCase("X-Amzn-RequestId")) {
                ase.setRequestId(headerEntry.getValue());
            }
        }

        return ase;
    }

    private AmazonServiceException runErrorUnmarshallers(HttpResponse errorResponse, JSONObject json, String errorTypeFromHeader) throws Exception {
        /*
         * We need to select which exception unmarshaller is the correct one to
         * use from all the possible exceptions this operation can throw.
         * Currently we rely on JsonErrorUnmarshaller.match(...) method which
         * checks for the error type parsed either from response headers or the
         * content.
         */
        for (JsonErrorUnmarshaller unmarshaller : unmarshallerList) {
            if (unmarshaller.match(errorTypeFromHeader, json)) {
                AmazonServiceException ase = unmarshaller.unmarshall(json);
                ase.setStatusCode(errorResponse.getStatusCode());
                return ase;
            }
        }

        return null;
    }

    public boolean needsConnectionLeftOpen() {
        return false;
    }

    private String readStreamContents(final InputStream stream) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                sb.append(line);
            }

            return sb.toString();
        } catch (Exception e) {
            try {stream.close();} catch (Exception ex) {}
            throw new AmazonClientException("Unable to read error response: " + e.getMessage(), e);
        }
    }

    /**
     * Attempt to parse the error type from the response headers.
     * Returns null if such information is not available in the header.
     */
    private String parseErrorTypeFromHeader(HttpResponse response) {
        String headerValue = response.getHeaders().get(X_AMZN_ERROR_TYPE);
        if (headerValue != null) {
            int separator = headerValue.indexOf(':');
            if (separator != -1) {
                headerValue  = headerValue.substring(0, separator);
            }
        }
        return headerValue;
    }
}
