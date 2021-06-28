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
 * Specify whether MediaConvert generates images for trick play. Keep the default value, None (NONE), to not generate
 * any images. Choose Thumbnail (THUMBNAIL) to generate tiled thumbnails. Choose Thumbnail and full frame
 * (THUMBNAIL_AND_FULLFRAME) to generate tiled thumbnails and full-resolution images of single frames. When you enable
 * Write HLS manifest (WriteHlsManifest), MediaConvert creates a child manifest for each set of images that you generate
 * and adds corresponding entries to the parent manifest. When you enable Write DASH manifest (WriteDashManifest),
 * MediaConvert adds an entry in the .mpd manifest for each set of images that you generate. A common application for
 * these images is Roku trick mode. The thumbnails and full-frame images that MediaConvert creates with this feature are
 * compatible with this Roku specification:
 * https://developer.roku.com/docs/developer-program/media-playback/trick-mode/hls-and-dash.md
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CmafImageBasedTrickPlay {

    NONE("NONE"),
    THUMBNAIL("THUMBNAIL"),
    THUMBNAIL_AND_FULLFRAME("THUMBNAIL_AND_FULLFRAME");

    private String value;

    private CmafImageBasedTrickPlay(String value) {
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
     * @return CmafImageBasedTrickPlay corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static CmafImageBasedTrickPlay fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CmafImageBasedTrickPlay enumEntry : CmafImageBasedTrickPlay.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
