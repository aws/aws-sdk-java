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
 * Specify the XAVC profile for this output. For more information, see the Sony documentation at
 * https://www.xavc-info.org/. Note that MediaConvert doesn't support the interlaced video XAVC operating points for
 * XAVC_HD_INTRA_CBG. To create an interlaced XAVC output, choose the profile XAVC_HD.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum XavcProfile {

    XAVC_HD_INTRA_CBG("XAVC_HD_INTRA_CBG"),
    XAVC_4K_INTRA_CBG("XAVC_4K_INTRA_CBG"),
    XAVC_4K_INTRA_VBR("XAVC_4K_INTRA_VBR"),
    XAVC_HD("XAVC_HD"),
    XAVC_4K("XAVC_4K");

    private String value;

    private XavcProfile(String value) {
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
     * @return XavcProfile corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static XavcProfile fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (XavcProfile enumEntry : XavcProfile.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
