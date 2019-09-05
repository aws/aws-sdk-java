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
package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.ThreadSafe;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy;

/**
 * Unmarshaller for JSON error responses from AWS services.
 */
@SdkInternalApi
@ThreadSafe
public class JsonErrorUnmarshaller extends AbstractErrorUnmarshaller<JsonNode> {

    public static final JsonErrorUnmarshaller DEFAULT_UNMARSHALLER = new JsonErrorUnmarshaller(
            AmazonServiceException.class, null);

    private static final ObjectMapper MAPPER = new ObjectMapper().configure(
            DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).setPropertyNamingStrategy(
            new PascalCaseStrategy());

    private final String handledErrorCode;

    /**
     * @param exceptionClass   Exception class this unmarshaller will attempt to deserialize error response into
     * @param handledErrorCode AWS error code that this unmarshaller handles. Pass null to handle all exceptions
     */
    public JsonErrorUnmarshaller(Class<? extends AmazonServiceException> exceptionClass, String handledErrorCode) {
        super(exceptionClass);
        this.handledErrorCode = handledErrorCode;
    }

    @Override
    public AmazonServiceException unmarshall(JsonNode jsonContent) throws Exception {
        return MAPPER.treeToValue(jsonContent, exceptionClass);
    }

    /**
     * @param actualErrorCode Actual AWS error code found in the error response.
     * @return True if the actualErrorCode can be handled by this unmarshaller, false otherwise
     */
    public boolean matchErrorCode(String actualErrorCode) {
        if (handledErrorCode == null) {
            return true;
        }
        return handledErrorCode.equals(actualErrorCode);
    }

}
