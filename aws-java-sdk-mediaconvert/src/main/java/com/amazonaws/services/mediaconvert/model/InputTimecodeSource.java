/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Use Timecode source (InputTimecodeSource) to specify how timecode information from your input is adjusted and encoded
 * in all outputs for the job. Default is embedded. Set to Embedded (EMBEDDED) to use the timecode that is in the input
 * video. If no embedded timecode is in the source, will set the timecode for the first frame to 00:00:00:00. Set to
 * Start at 0 (ZEROBASED) to set the timecode of the initial frame to 00:00:00:00. Set to Specified start
 * (SPECIFIEDSTART) to provide the initial timecode yourself the setting (Start).
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
