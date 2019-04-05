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
 * - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged in metadata as progressive.
 * It will only convert those that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the deinterlacer
 * converts every frame to progressive - even those that are already tagged as progressive. Turn Force mode on only if
 * there is a good chance that the metadata has tagged frames as progressive when they are not progressive. Do not turn
 * on otherwise; processing frames that are already progressive into progressive will probably result in lower quality
 * video.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DeinterlacerControl {

    FORCE_ALL_FRAMES("FORCE_ALL_FRAMES"),
    NORMAL("NORMAL");

    private String value;

    private DeinterlacerControl(String value) {
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
     * @return DeinterlacerControl corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DeinterlacerControl fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DeinterlacerControl enumEntry : DeinterlacerControl.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
