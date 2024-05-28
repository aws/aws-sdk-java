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
 * Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel layout tags
 * in the same order as your output's audio channel order. For example, if your output audio track has a left and a
 * right channel, enter Left (L) for the first channel and Right (R) for the second. If your output has multiple
 * single-channel audio tracks, enter a single channel layout tag for each track.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AudioChannelTag {

    L("L"),
    R("R"),
    C("C"),
    LFE("LFE"),
    LS("LS"),
    RS("RS"),
    LC("LC"),
    RC("RC"),
    CS("CS"),
    LSD("LSD"),
    RSD("RSD"),
    TCS("TCS"),
    VHL("VHL"),
    VHC("VHC"),
    VHR("VHR"),
    TBL("TBL"),
    TBC("TBC"),
    TBR("TBR"),
    RSL("RSL"),
    RSR("RSR"),
    LW("LW"),
    RW("RW"),
    LFE2("LFE2"),
    LT("LT"),
    RT("RT"),
    HI("HI"),
    NAR("NAR"),
    M("M");

    private String value;

    private AudioChannelTag(String value) {
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
     * @return AudioChannelTag corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AudioChannelTag fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AudioChannelTag enumEntry : AudioChannelTag.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
