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
 * To create an output that complies with the XAVC file format guidelines for interoperability, keep the default value,
 * Drop frames for compliance (DROP_FRAMES_FOR_COMPLIANCE). To include all frames from your input in this output, keep
 * the default setting, Allow any duration (ALLOW_ANY_DURATION). The number of frames that MediaConvert excludes when
 * you set this to Drop frames for compliance depends on the output frame rate and duration.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum MxfXavcDurationMode {

    ALLOW_ANY_DURATION("ALLOW_ANY_DURATION"),
    DROP_FRAMES_FOR_COMPLIANCE("DROP_FRAMES_FOR_COMPLIANCE");

    private String value;

    private MxfXavcDurationMode(String value) {
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
     * @return MxfXavcDurationMode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static MxfXavcDurationMode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (MxfXavcDurationMode enumEntry : MxfXavcDurationMode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
