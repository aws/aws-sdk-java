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
 * Specify how MediaConvert writes SegmentTimeline in your output DASH manifest. To write a SegmentTimeline in each
 * video Representation: Keep the default value, Basic. To write a common SegmentTimeline in the video AdaptationSet:
 * Choose Compact. Note that MediaConvert will still write a SegmentTimeline in any Representation that does not share a
 * common timeline. To write a video AdaptationSet for each different output framerate, and a common SegmentTimeline in
 * each AdaptationSet: Choose Distinct.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DashManifestStyle {

    BASIC("BASIC"),
    COMPACT("COMPACT"),
    DISTINCT("DISTINCT");

    private String value;

    private DashManifestStyle(String value) {
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
     * @return DashManifestStyle corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DashManifestStyle fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DashManifestStyle enumEntry : DashManifestStyle.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
