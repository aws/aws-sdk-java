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
package com.amazonaws.opensdk.internal.protocol;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.opensdk.internal.BaseException;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.ValidationUtils;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Optional;

/**
 * Unmarshaller for JSON error responses from AWS services.
 */
@SdkInternalApi
@ThreadSafe
public class ApiGatewayErrorUnmarshaller implements
        Unmarshaller<BaseException, JsonNode> {

    private static final ObjectMapper MAPPER = new ObjectMapper()
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

    private final Class<? extends BaseException> exceptionClass;
    private final Optional<Integer> httpStatusCode;

    /**
     * @param exceptionClass Exception class this unmarshaller will attempt to deserialize error
     *                       response into
     * @param httpStatusCode HTTP status code associated with this modeled exception. A value of
     *                       null will match all http status codes.
     */
    public ApiGatewayErrorUnmarshaller(Class<? extends BaseException> exceptionClass,
                                       Optional<Integer> httpStatusCode) {
        this.exceptionClass = ValidationUtils.assertNotNull(exceptionClass, "exceptionClass");
        this.httpStatusCode = ValidationUtils.assertNotNull(httpStatusCode, "httpStatusCode");
    }

    @Override
    public BaseException unmarshall(JsonNode jsonContent) throws Exception {
        return MAPPER.treeToValue(jsonContent, exceptionClass);
    }

    /**
     * @param actualHttpStatusCode Actual HTTP status code found in the error response.
     * @return True if the http status can be handled by this unmarshaller, false otherwise
     */
    boolean matches(int actualHttpStatusCode) {
        return httpStatusCode
                .map(sc -> sc == actualHttpStatusCode)
                .orElse(true);
    }

}
