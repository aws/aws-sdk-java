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
 * Specify whether MediaConvert automatically attempts to prevent decoder buffer underflows in your transport stream
 * output. Use if you are seeing decoder buffer underflows in your output and are unable to increase your transport
 * stream's bitrate. For most workflows: We recommend that you keep the default value, Disabled. To prevent decoder
 * buffer underflows in your output, when possible: Choose Enabled. Note that if MediaConvert prevents a decoder buffer
 * underflow in your output, output video quality is reduced and your job will take longer to complete.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum M2tsPreventBufferUnderflow {

    DISABLED("DISABLED"),
    ENABLED("ENABLED");

    private String value;

    private M2tsPreventBufferUnderflow(String value) {
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
     * @return M2tsPreventBufferUnderflow corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static M2tsPreventBufferUnderflow fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (M2tsPreventBufferUnderflow enumEntry : M2tsPreventBufferUnderflow.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
