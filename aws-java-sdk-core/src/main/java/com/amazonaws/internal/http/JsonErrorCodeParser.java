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
package com.amazonaws.internal.http;

import java.util.Map;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.protocol.json.JsonContent;
import com.fasterxml.jackson.databind.JsonNode;

@SdkInternalApi
public class JsonErrorCodeParser implements ErrorCodeParser {

    /**
     * Services using AWS JSON 1.1 protocol with HTTP binding send the error code information in the
     * response headers, instead of the content. Package private for tests.
     */
    static final String X_AMZN_ERROR_TYPE = "x-amzn-ErrorType";

    private final String errorCodeFieldName;

    public JsonErrorCodeParser() {
        this(null);
    }

    public JsonErrorCodeParser(String errorCodeFieldName) {
        this.errorCodeFieldName = errorCodeFieldName == null ? "__type" : errorCodeFieldName;
    }

    /**
     * Parse the error code from the response.
     *
     * @return Error Code of exceptional response or null if it can't be determined
     */
    public String parseErrorCode(HttpResponse response, JsonContent jsonContent) {
        String errorCodeFromHeader = parseErrorCodeFromHeader(response.getHeaders());
        if (errorCodeFromHeader != null) {
            return errorCodeFromHeader;
        } else if (jsonContent != null) {
            return parseErrorCodeFromContents(jsonContent.getJsonNode());
        } else {
            return null;
        }
    }

    /**
     * Attempt to parse the error code from the response headers. Returns null if information is not
     * present in the header.
     */
    private String parseErrorCodeFromHeader(Map<String, String> httpHeaders) {
        String headerValue = httpHeaders.get(X_AMZN_ERROR_TYPE);
        if (headerValue != null) {
            int separator = headerValue.indexOf(':');
            if (separator != -1) {
                headerValue = headerValue.substring(0, separator);
            }
        }
        return headerValue;
    }

    /**
     * Attempt to parse the error code from the response content. Returns null if information is not
     * present in the content. Codes are expected to be in the form <b>"typeName"</b> or
     * <b>"prefix#typeName"</b> Examples : "AccessDeniedException", "com.amazonaws.dynamodb.v20111205#ProvisionedThroughputExceededException"
     */
    private String parseErrorCodeFromContents(JsonNode jsonContents) {
        if (jsonContents == null || !jsonContents.has(errorCodeFieldName)) {
            return null;
        }
        String code = jsonContents.findValue(errorCodeFieldName).asText();
        int separator = code.lastIndexOf("#");
        return code.substring(separator + 1);
    }
}
