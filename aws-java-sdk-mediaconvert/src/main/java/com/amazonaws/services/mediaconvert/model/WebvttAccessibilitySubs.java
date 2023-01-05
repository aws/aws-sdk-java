/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Set Accessibility subtitles to Enabled if the ISMC or WebVTT captions track is intended to provide accessibility for
 * people who are deaf or hard of hearing. When you enable this feature, MediaConvert adds the following attributes
 * under EXT-X-MEDIA in the HLS or CMAF manifest for this track:
 * CHARACTERISTICS="public.accessibility.describes-spoken-dialog,public.accessibility.describes-music-and-sound" and
 * AUTOSELECT="YES". Keep the default value, Disabled, if the captions track is not intended to provide such
 * accessibility. MediaConvert will not add the above attributes.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum WebvttAccessibilitySubs {

    DISABLED("DISABLED"),
    ENABLED("ENABLED");

    private String value;

    private WebvttAccessibilitySubs(String value) {
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
     * @return WebvttAccessibilitySubs corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static WebvttAccessibilitySubs fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (WebvttAccessibilitySubs enumEntry : WebvttAccessibilitySubs.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
