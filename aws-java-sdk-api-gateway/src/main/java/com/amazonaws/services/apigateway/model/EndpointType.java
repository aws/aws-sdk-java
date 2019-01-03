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
 * The endpoint type. The valid values are <code>EDGE</code> for edge-optimized API setup, most suitable for mobile
 * applications; <code>REGIONAL</code> for regional API endpoint setup, most suitable for calling from AWS Region; and
 * <code>PRIVATE</code> for private APIs.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum EndpointType {

    REGIONAL("REGIONAL"),
    EDGE("EDGE"),
    PRIVATE("PRIVATE");

    private String value;

    private EndpointType(String value) {
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
     * @return EndpointType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static EndpointType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (EndpointType enumEntry : EndpointType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
