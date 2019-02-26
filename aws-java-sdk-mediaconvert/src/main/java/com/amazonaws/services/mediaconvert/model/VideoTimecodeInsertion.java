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
 * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate is
 * identical to the output frame rate. To include timecodes in this output, set Timecode insertion
 * (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the
 * service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are
 * present, the service will set the timecode for the first output frame to zero. To change this default behavior,
 * adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located under
 * Job > Job settings > Timecode configuration. Note - Timecode source under input settings (InputTimecodeSource) does
 * not affect the timecodes that are inserted in the output. Source under Job settings > Timecode configuration
 * (TimecodeSource) does.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum VideoTimecodeInsertion {

    DISABLED("DISABLED"),
    PIC_TIMING_SEI("PIC_TIMING_SEI");

    private String value;

    private VideoTimecodeInsertion(String value) {
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
     * @return VideoTimecodeInsertion corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static VideoTimecodeInsertion fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (VideoTimecodeInsertion enumEntry : VideoTimecodeInsertion.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
