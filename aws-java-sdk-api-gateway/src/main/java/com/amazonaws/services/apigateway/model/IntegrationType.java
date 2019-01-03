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
 * <p>
 * The integration type. The valid value is <code>HTTP</code> for integrating an API method with an HTTP backend;
 * <code>AWS</code> with any AWS service endpoints; <code>MOCK</code> for testing without actually invoking the backend;
 * <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration; <code>AWS_PROXY</code> for integrating with
 * the Lambda proxy integration.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum IntegrationType {

    HTTP("HTTP"),
    AWS("AWS"),
    MOCK("MOCK"),
    HTTP_PROXY("HTTP_PROXY"),
    AWS_PROXY("AWS_PROXY");

    private String value;

    private IntegrationType(String value) {
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
     * @return IntegrationType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static IntegrationType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (IntegrationType enumEntry : IntegrationType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
