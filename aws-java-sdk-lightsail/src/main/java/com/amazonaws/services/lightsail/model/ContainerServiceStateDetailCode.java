/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ContainerServiceStateDetailCode {

    CREATING_SYSTEM_RESOURCES("CREATING_SYSTEM_RESOURCES"),
    CREATING_NETWORK_INFRASTRUCTURE("CREATING_NETWORK_INFRASTRUCTURE"),
    PROVISIONING_CERTIFICATE("PROVISIONING_CERTIFICATE"),
    PROVISIONING_SERVICE("PROVISIONING_SERVICE"),
    CREATING_DEPLOYMENT("CREATING_DEPLOYMENT"),
    EVALUATING_HEALTH_CHECK("EVALUATING_HEALTH_CHECK"),
    ACTIVATING_DEPLOYMENT("ACTIVATING_DEPLOYMENT"),
    CERTIFICATE_LIMIT_EXCEEDED("CERTIFICATE_LIMIT_EXCEEDED"),
    UNKNOWN_ERROR("UNKNOWN_ERROR");

    private String value;

    private ContainerServiceStateDetailCode(String value) {
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
     * @return ContainerServiceStateDetailCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ContainerServiceStateDetailCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ContainerServiceStateDetailCode enumEntry : ContainerServiceStateDetailCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
