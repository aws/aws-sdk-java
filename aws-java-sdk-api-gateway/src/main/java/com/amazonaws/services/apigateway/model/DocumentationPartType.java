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
public enum DocumentationPartType {

    API("API"),
    AUTHORIZER("AUTHORIZER"),
    MODEL("MODEL"),
    RESOURCE("RESOURCE"),
    METHOD("METHOD"),
    PATH_PARAMETER("PATH_PARAMETER"),
    QUERY_PARAMETER("QUERY_PARAMETER"),
    REQUEST_HEADER("REQUEST_HEADER"),
    REQUEST_BODY("REQUEST_BODY"),
    RESPONSE("RESPONSE"),
    RESPONSE_HEADER("RESPONSE_HEADER"),
    RESPONSE_BODY("RESPONSE_BODY");

    private String value;

    private DocumentationPartType(String value) {
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
     * @return DocumentationPartType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DocumentationPartType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DocumentationPartType enumEntry : DocumentationPartType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
