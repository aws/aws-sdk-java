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
 * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the
 * output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise the
 * value in Audio Type is included in the output. Note that this field and audioType are both ignored if
 * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AudioTypeControl {

    FOLLOW_INPUT("FOLLOW_INPUT"),
    USE_CONFIGURED("USE_CONFIGURED");

    private String value;

    private AudioTypeControl(String value) {
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
     * @return AudioTypeControl corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AudioTypeControl fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AudioTypeControl enumEntry : AudioTypeControl.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
