/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Optionally specify the amount of sharpening to apply when you use the Advanced input filter. Sharpening adds contrast
 * to the edges of your video content and can reduce softness. To apply no sharpening: Keep the default value, Off. To
 * apply a minimal amount of sharpening choose Low, or for the maximum choose High.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AdvancedInputFilterSharpen {

    OFF("OFF"),
    LOW("LOW"),
    HIGH("HIGH");

    private String value;

    private AdvancedInputFilterSharpen(String value) {
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
     * @return AdvancedInputFilterSharpen corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AdvancedInputFilterSharpen fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AdvancedInputFilterSharpen enumEntry : AdvancedInputFilterSharpen.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
