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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you set this value
 * to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add non-linear watermarking to
 * only clean content that doesn't already have non-linear Nielsen watermarks.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum NielsenSourceWatermarkStatusType {

    CLEAN("CLEAN"),
    WATERMARKED("WATERMARKED");

    private String value;

    private NielsenSourceWatermarkStatusType(String value) {
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
     * @return NielsenSourceWatermarkStatusType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static NielsenSourceWatermarkStatusType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (NielsenSourceWatermarkStatusType enumEntry : NielsenSourceWatermarkStatusType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
