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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample)
 * box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1
 * amendment 1. This improves compatibility with Apple players and tools.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Mp4CslgAtom {

    INCLUDE("INCLUDE"),
    EXCLUDE("EXCLUDE");

    private String value;

    private Mp4CslgAtom(String value) {
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
     * @return Mp4CslgAtom corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Mp4CslgAtom fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Mp4CslgAtom enumEntry : Mp4CslgAtom.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
