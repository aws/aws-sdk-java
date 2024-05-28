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
 * Add texture and detail to areas of your input video content that were lost after applying the Advanced input filter.
 * To adaptively add texture and reduce softness: Choose Enabled. To not add any texture: Keep the default value,
 * Disabled. We recommend that you choose Disabled for input video content that doesn't have texture, including screen
 * recordings, computer graphics, or cartoons.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AdvancedInputFilterAddTexture {

    ENABLED("ENABLED"),
    DISABLED("DISABLED");

    private String value;

    private AdvancedInputFilterAddTexture(String value) {
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
     * @return AdvancedInputFilterAddTexture corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AdvancedInputFilterAddTexture fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AdvancedInputFilterAddTexture enumEntry : AdvancedInputFilterAddTexture.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
