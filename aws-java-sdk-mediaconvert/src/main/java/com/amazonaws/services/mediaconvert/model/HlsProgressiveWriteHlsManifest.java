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
 * Specify whether MediaConvert generates HLS manifests while your job is running or when your job is complete. To
 * generate HLS manifests while your job is running: Choose Enabled. Use if you want to play back your content as soon
 * as it's available. MediaConvert writes the parent and child manifests after the first three media segments are
 * written to your destination S3 bucket. It then writes new updated manifests after each additional segment is written.
 * The parent manifest includes the latest BANDWIDTH and AVERAGE-BANDWIDTH attributes, and child manifests include the
 * latest available media segment. When your job completes, the final child playlists include an EXT-X-ENDLIST tag. To
 * generate HLS manifests only when your job completes: Choose Disabled.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum HlsProgressiveWriteHlsManifest {

    ENABLED("ENABLED"),
    DISABLED("DISABLED");

    private String value;

    private HlsProgressiveWriteHlsManifest(String value) {
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
     * @return HlsProgressiveWriteHlsManifest corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static HlsProgressiveWriteHlsManifest fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (HlsProgressiveWriteHlsManifest enumEntry : HlsProgressiveWriteHlsManifest.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
