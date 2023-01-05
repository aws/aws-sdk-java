/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AnnotationType {

    GENERIC("GENERIC"),
    CHR_POS("CHR_POS"),
    CHR_POS_REF_ALT("CHR_POS_REF_ALT"),
    CHR_START_END_ONE_BASE("CHR_START_END_ONE_BASE"),
    CHR_START_END_REF_ALT_ONE_BASE("CHR_START_END_REF_ALT_ONE_BASE"),
    CHR_START_END_ZERO_BASE("CHR_START_END_ZERO_BASE"),
    CHR_START_END_REF_ALT_ZERO_BASE("CHR_START_END_REF_ALT_ZERO_BASE");

    private String value;

    private AnnotationType(String value) {
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
     * @return AnnotationType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AnnotationType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AnnotationType enumEntry : AnnotationType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
