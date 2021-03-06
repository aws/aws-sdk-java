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
 * Specify whether MediaConvert should use any dynamic range control metadata from your input file. Keep the default
 * value, Custom (SPECIFIED), to provide dynamic range control values in your job settings. Choose Follow source
 * (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these settings to specify your
 * dynamic range control values: Dynamic range compression line (DynamicRangeCompressionLine) and Dynamic range
 * compression RF (DynamicRangeCompressionRf). When you keep the value Custom (SPECIFIED) for Dynamic range control
 * (DynamicRangeControl) and you don't specify values for the related settings, MediaConvert uses default values for
 * those settings.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Eac3AtmosDynamicRangeControl {

    SPECIFIED("SPECIFIED"),
    INITIALIZE_FROM_SOURCE("INITIALIZE_FROM_SOURCE");

    private String value;

    private Eac3AtmosDynamicRangeControl(String value) {
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
     * @return Eac3AtmosDynamicRangeControl corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Eac3AtmosDynamicRangeControl fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Eac3AtmosDynamicRangeControl enumEntry : Eac3AtmosDynamicRangeControl.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
