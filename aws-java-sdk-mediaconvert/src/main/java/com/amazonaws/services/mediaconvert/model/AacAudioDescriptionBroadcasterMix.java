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
 * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo pair.
 * The value for AudioType will be set to 3, which signals to downstream systems that this stream contains
 * "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does
 * not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in AudioType
 * and FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio description (AD). In
 * this case, the encoder will use any values you provide for AudioType and FollowInputAudioType.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AacAudioDescriptionBroadcasterMix {

    BROADCASTER_MIXED_AD("BROADCASTER_MIXED_AD"),
    NORMAL("NORMAL");

    private String value;

    private AacAudioDescriptionBroadcasterMix(String value) {
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
     * @return AacAudioDescriptionBroadcasterMix corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AacAudioDescriptionBroadcasterMix fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AacAudioDescriptionBroadcasterMix enumEntry : AacAudioDescriptionBroadcasterMix.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
