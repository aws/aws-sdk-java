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
 * Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a profile
 * based on the video codec and resolution. For a list of codecs supported with each MXF profile, see
 * https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For more information
 * about the automatic selection behavior, see
 * https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum MxfProfile {

    D_10("D_10"),
    XDCAM("XDCAM"),
    OP1A("OP1A"),
    XAVC("XAVC");

    private String value;

    private MxfProfile(String value) {
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
     * @return MxfProfile corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static MxfProfile fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (MxfProfile enumEntry : MxfProfile.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
