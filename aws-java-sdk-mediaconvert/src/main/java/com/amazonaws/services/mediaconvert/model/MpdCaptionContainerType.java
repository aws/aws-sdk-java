/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar captions
 * in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a raw
 * container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented MP4
 * files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum MpdCaptionContainerType {

    RAW("RAW"),
    FRAGMENTED_MP4("FRAGMENTED_MP4");

    private String value;

    private MpdCaptionContainerType(String value) {
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
     * @return MpdCaptionContainerType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static MpdCaptionContainerType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (MpdCaptionContainerType enumEntry : MpdCaptionContainerType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
