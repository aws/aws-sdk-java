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
 * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
 * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a
 * frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
 * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
 * transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the
 * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
 * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings
 * FramerateNumerator and FramerateDenominator.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum H264FramerateControl {

    INITIALIZE_FROM_SOURCE("INITIALIZE_FROM_SOURCE"),
    SPECIFIED("SPECIFIED");

    private String value;

    private H264FramerateControl(String value) {
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
     * @return H264FramerateControl corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static H264FramerateControl fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (H264FramerateControl enumEntry : H264FramerateControl.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
