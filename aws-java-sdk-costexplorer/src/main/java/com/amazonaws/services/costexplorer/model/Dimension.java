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
package com.amazonaws.services.costexplorer.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Dimension {

    AZ("AZ"),
    INSTANCE_TYPE("INSTANCE_TYPE"),
    LINKED_ACCOUNT("LINKED_ACCOUNT"),
    OPERATION("OPERATION"),
    PURCHASE_TYPE("PURCHASE_TYPE"),
    REGION("REGION"),
    SERVICE("SERVICE"),
    USAGE_TYPE("USAGE_TYPE"),
    USAGE_TYPE_GROUP("USAGE_TYPE_GROUP"),
    RECORD_TYPE("RECORD_TYPE"),
    OPERATING_SYSTEM("OPERATING_SYSTEM"),
    TENANCY("TENANCY"),
    SCOPE("SCOPE"),
    PLATFORM("PLATFORM"),
    SUBSCRIPTION_ID("SUBSCRIPTION_ID"),
    LEGAL_ENTITY_NAME("LEGAL_ENTITY_NAME"),
    DEPLOYMENT_OPTION("DEPLOYMENT_OPTION"),
    DATABASE_ENGINE("DATABASE_ENGINE"),
    CACHE_ENGINE("CACHE_ENGINE"),
    INSTANCE_TYPE_FAMILY("INSTANCE_TYPE_FAMILY"),
    BILLING_ENTITY("BILLING_ENTITY"),
    RESERVATION_ID("RESERVATION_ID");

    private String value;

    private Dimension(String value) {
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
     * @return Dimension corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Dimension fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Dimension enumEntry : Dimension.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
