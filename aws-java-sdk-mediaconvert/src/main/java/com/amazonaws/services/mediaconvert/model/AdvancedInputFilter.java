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
 * Use to remove noise, blocking, blurriness, or ringing from your input as a pre-filter step before encoding. The
 * Advanced input filter removes more types of compression artifacts and is an improvement when compared to basic
 * Deblock and Denoise filters. To remove video compression artifacts from your input and improve the video quality:
 * Choose Enabled. Additionally, this filter can help increase the video quality of your output relative to its bitrate,
 * since noisy inputs are more complex and require more bits to encode. To help restore loss of detail after applying
 * the filter, you can optionally add texture or sharpening as an additional step. Jobs that use this feature incur
 * pro-tier pricing. To not apply advanced input filtering: Choose Disabled. Note that you can still apply basic
 * filtering with Deblock and Denoise.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AdvancedInputFilter {

    ENABLED("ENABLED"),
    DISABLED("DISABLED");

    private String value;

    private AdvancedInputFilter(String value) {
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
     * @return AdvancedInputFilter corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AdvancedInputFilter fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AdvancedInputFilter enumEntry : AdvancedInputFilter.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
