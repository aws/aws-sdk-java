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
 * Optional. When you have AFD signaling set up in your output video stream, use this setting to choose whether to also
 * include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF wrapper. Choose Copy
 * from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video stream for this output to the MXF wrapper.
 * Regardless of which option you choose, the AFD values remain in the video stream. Related settings: To set up your
 * output to include or exclude AFD values, see AfdSignaling, under VideoDescription. On the console, find AFD signaling
 * under the output's video encoding settings.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum MxfAfdSignaling {

    NO_COPY("NO_COPY"),
    COPY_FROM_VIDEO("COPY_FROM_VIDEO");

    private String value;

    private MxfAfdSignaling(String value) {
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
     * @return MxfAfdSignaling corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static MxfAfdSignaling fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (MxfAfdSignaling enumEntry : MxfAfdSignaling.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
