/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.route53domains.model;

/**
 * 
 */
public enum DomainAvailability {

    AVAILABLE("AVAILABLE"),
    AVAILABLE_RESERVED("AVAILABLE_RESERVED"),
    AVAILABLE_PREORDER("AVAILABLE_PREORDER"),
    UNAVAILABLE("UNAVAILABLE"),
    UNAVAILABLE_PREMIUM("UNAVAILABLE_PREMIUM"),
    UNAVAILABLE_RESTRICTED("UNAVAILABLE_RESTRICTED"),
    RESERVED("RESERVED"),
    DONT_KNOW("DONT_KNOW");

    private String value;

    private DomainAvailability(String value) {
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
     * @return DomainAvailability corresponding to the value
     */
    public static DomainAvailability fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("AVAILABLE".equals(value)) {
            return AVAILABLE;
        } else if ("AVAILABLE_RESERVED".equals(value)) {
            return AVAILABLE_RESERVED;
        } else if ("AVAILABLE_PREORDER".equals(value)) {
            return AVAILABLE_PREORDER;
        } else if ("UNAVAILABLE".equals(value)) {
            return UNAVAILABLE;
        } else if ("UNAVAILABLE_PREMIUM".equals(value)) {
            return UNAVAILABLE_PREMIUM;
        } else if ("UNAVAILABLE_RESTRICTED".equals(value)) {
            return UNAVAILABLE_RESTRICTED;
        } else if ("RESERVED".equals(value)) {
            return RESERVED;
        } else if ("DONT_KNOW".equals(value)) {
            return DONT_KNOW;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}