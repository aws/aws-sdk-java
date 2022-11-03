/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Apply audio timing corrections to help synchronize audio and video in your output. To apply timing corrections, your
 * input must meet the following requirements: * Container: MP4, or MOV, with an accurate time-to-sample (STTS) table. *
 * Audio track: AAC. Choose from the following audio timing correction settings: * Disabled (Default): Apply no
 * correction. * Auto: Recommended for most inputs. MediaConvert analyzes the audio timing in your input and determines
 * which correction setting to use, if needed. * Track: Adjust the duration of each audio frame by a constant amount to
 * align the audio track length with STTS duration. Track-level correction does not affect pitch, and is recommended for
 * tonal audio content such as music. * Frame: Adjust the duration of each audio frame by a variable amount to align
 * audio frames with STTS timestamps. No corrections are made to already-aligned frames. Frame-level correction may
 * affect the pitch of corrected frames, and is recommended for atonal audio content such as speech or percussion.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AudioDurationCorrection {

    DISABLED("DISABLED"),
    AUTO("AUTO"),
    TRACK("TRACK"),
    FRAME("FRAME");

    private String value;

    private AudioDurationCorrection(String value) {
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
     * @return AudioDurationCorrection corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AudioDurationCorrection fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AudioDurationCorrection enumEntry : AudioDurationCorrection.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
