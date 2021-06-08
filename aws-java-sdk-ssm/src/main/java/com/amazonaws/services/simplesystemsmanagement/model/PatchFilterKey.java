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
package com.amazonaws.services.simplesystemsmanagement.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum PatchFilterKey {

    ARCH("ARCH"),
    ADVISORY_ID("ADVISORY_ID"),
    BUGZILLA_ID("BUGZILLA_ID"),
    PATCH_SET("PATCH_SET"),
    PRODUCT("PRODUCT"),
    PRODUCT_FAMILY("PRODUCT_FAMILY"),
    CLASSIFICATION("CLASSIFICATION"),
    CVE_ID("CVE_ID"),
    EPOCH("EPOCH"),
    MSRC_SEVERITY("MSRC_SEVERITY"),
    NAME("NAME"),
    PATCH_ID("PATCH_ID"),
    SECTION("SECTION"),
    PRIORITY("PRIORITY"),
    REPOSITORY("REPOSITORY"),
    RELEASE("RELEASE"),
    SEVERITY("SEVERITY"),
    SECURITY("SECURITY"),
    VERSION("VERSION");

    private String value;

    private PatchFilterKey(String value) {
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
     * @return PatchFilterKey corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static PatchFilterKey fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (PatchFilterKey enumEntry : PatchFilterKey.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
