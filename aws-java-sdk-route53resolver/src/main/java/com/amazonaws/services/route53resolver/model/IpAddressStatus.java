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
package com.amazonaws.services.route53resolver.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum IpAddressStatus {

    CREATING("CREATING"),
    FAILED_CREATION("FAILED_CREATION"),
    ATTACHING("ATTACHING"),
    ATTACHED("ATTACHED"),
    REMAP_DETACHING("REMAP_DETACHING"),
    REMAP_ATTACHING("REMAP_ATTACHING"),
    DETACHING("DETACHING"),
    FAILED_RESOURCE_GONE("FAILED_RESOURCE_GONE"),
    DELETING("DELETING"),
    DELETE_FAILED_FAS_EXPIRED("DELETE_FAILED_FAS_EXPIRED");

    private String value;

    private IpAddressStatus(String value) {
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
     * @return IpAddressStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static IpAddressStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (IpAddressStatus enumEntry : IpAddressStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
