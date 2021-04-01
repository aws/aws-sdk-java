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
 * Use this setting only when your audio codec is a Dolby one (AC3, EAC3, or Atmos) and your downstream workflow
 * requires that your DASH manifest use the Dolby channel configuration tag, rather than the MPEG one. For example, you
 * might need to use this to make dynamic ad insertion work. Specify which audio channel configuration scheme ID URI
 * MediaConvert writes in your DASH manifest. Keep the default value, MPEG channel configuration
 * (MPEG_CHANNEL_CONFIGURATION), to have MediaConvert write this: urn:mpeg:mpegB:cicp:ChannelConfiguration. Choose Dolby
 * channel configuration (DOLBY_CHANNEL_CONFIGURATION) to have MediaConvert write this instead:
 * tag:dolby.com,2014:dash:audio_channel_configuration:2011.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DashIsoGroupAudioChannelConfigSchemeIdUri {

    MPEG_CHANNEL_CONFIGURATION("MPEG_CHANNEL_CONFIGURATION"),
    DOLBY_CHANNEL_CONFIGURATION("DOLBY_CHANNEL_CONFIGURATION");

    private String value;

    private DashIsoGroupAudioChannelConfigSchemeIdUri(String value) {
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
     * @return DashIsoGroupAudioChannelConfigSchemeIdUri corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DashIsoGroupAudioChannelConfigSchemeIdUri fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DashIsoGroupAudioChannelConfigSchemeIdUri enumEntry : DashIsoGroupAudioChannelConfigSchemeIdUri.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
