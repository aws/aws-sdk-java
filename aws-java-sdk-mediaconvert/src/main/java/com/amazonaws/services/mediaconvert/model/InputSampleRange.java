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
 * Use this setting when your input video codec is AVC-Intra. Ignore this setting for all other inputs. If the sample
 * range metadata in your input video is accurate, or if you don't know about sample range, keep the default value,
 * Follow (FOLLOW), for this setting. When you do, the service automatically detects your input sample range. If your
 * input video has metadata indicating the wrong sample range, specify the accurate sample range here. When you do,
 * MediaConvert ignores any sample range information in the input metadata. Regardless of whether MediaConvert uses the
 * input sample range or the sample range that you specify, MediaConvert uses the sample range for transcoding and also
 * writes it to the output metadata.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum InputSampleRange {

    FOLLOW("FOLLOW"),
    FULL_RANGE("FULL_RANGE"),
    LIMITED_RANGE("LIMITED_RANGE");

    private String value;

    private InputSampleRange(String value) {
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
     * @return InputSampleRange corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static InputSampleRange fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (InputSampleRange enumEntry : InputSampleRange.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
