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
 * Timecode source under input settings (InputTimecodeSource) only affects the behavior of features that apply to a
 * single input at a time, such as input clipping and synchronizing some captions formats. Use this setting to specify
 * whether the service counts frames by timecodes embedded in the video (EMBEDDED) or by starting the first frame at
 * zero (ZEROBASED). In both cases, the timecode format is HH:MM:SS:FF or HH:MM:SS;FF, where FF is the frame number.
 * Only set this to EMBEDDED if your source video has embedded timecodes.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum InputTimecodeSource {

    EMBEDDED("EMBEDDED"),
    ZEROBASED("ZEROBASED"),
    SPECIFIEDSTART("SPECIFIEDSTART");

    private String value;

    private InputTimecodeSource(String value) {
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
     * @return InputTimecodeSource corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static InputTimecodeSource fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (InputTimecodeSource enumEntry : InputTimecodeSource.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
