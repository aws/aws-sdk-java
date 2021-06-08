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
 * Use this setting to control the values that MediaConvert puts in your HLS parent playlist to control how the client
 * player selects which audio track to play. The other options for this setting determine the values that MediaConvert
 * writes for the DEFAULT and AUTOSELECT attributes of the EXT-X-MEDIA entry for the audio variant. For more information
 * about these attributes, see the Apple documentation article
 * https://developer.apple.com/documentation/http_live_streaming
 * /example_playlists_for_http_live_streaming/adding_alternate_media_to_a_playlist. Choose Alternate audio, auto select,
 * default (ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT) to set DEFAULT=YES and AUTOSELECT=YES. Choose this value for only one
 * variant in your output group. Choose Alternate audio, auto select, not default (ALTERNATE_AUDIO_AUTO_SELECT) to set
 * DEFAULT=NO and AUTOSELECT=YES. Choose Alternate Audio, Not Auto Select to set DEFAULT=NO and AUTOSELECT=NO. When you
 * don't specify a value for this setting, MediaConvert defaults to Alternate audio, auto select, default. When there is
 * more than one variant in your output group, you must explicitly choose a value for this setting.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CmfcAudioTrackType {

    ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT("ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT"),
    ALTERNATE_AUDIO_AUTO_SELECT("ALTERNATE_AUDIO_AUTO_SELECT"),
    ALTERNATE_AUDIO_NOT_AUTO_SELECT("ALTERNATE_AUDIO_NOT_AUTO_SELECT");

    private String value;

    private CmfcAudioTrackType(String value) {
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
     * @return CmfcAudioTrackType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static CmfcAudioTrackType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CmfcAudioTrackType enumEntry : CmfcAudioTrackType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
