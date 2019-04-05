/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigateway.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum GatewayResponseType {

    DEFAULT_4XX("DEFAULT_4XX"),
    DEFAULT_5XX("DEFAULT_5XX"),
    RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND"),
    UNAUTHORIZED("UNAUTHORIZED"),
    INVALID_API_KEY("INVALID_API_KEY"),
    ACCESS_DENIED("ACCESS_DENIED"),
    AUTHORIZER_FAILURE("AUTHORIZER_FAILURE"),
    AUTHORIZER_CONFIGURATION_ERROR("AUTHORIZER_CONFIGURATION_ERROR"),
    INVALID_SIGNATURE("INVALID_SIGNATURE"),
    EXPIRED_TOKEN("EXPIRED_TOKEN"),
    MISSING_AUTHENTICATION_TOKEN("MISSING_AUTHENTICATION_TOKEN"),
    INTEGRATION_FAILURE("INTEGRATION_FAILURE"),
    INTEGRATION_TIMEOUT("INTEGRATION_TIMEOUT"),
    API_CONFIGURATION_ERROR("API_CONFIGURATION_ERROR"),
    UNSUPPORTED_MEDIA_TYPE("UNSUPPORTED_MEDIA_TYPE"),
    BAD_REQUEST_PARAMETERS("BAD_REQUEST_PARAMETERS"),
    BAD_REQUEST_BODY("BAD_REQUEST_BODY"),
    REQUEST_TOO_LARGE("REQUEST_TOO_LARGE"),
    THROTTLED("THROTTLED"),
    QUOTA_EXCEEDED("QUOTA_EXCEEDED");

    private String value;

    private GatewayResponseType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return GatewayResponseType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static GatewayResponseType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (GatewayResponseType enumEntry : GatewayResponseType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
