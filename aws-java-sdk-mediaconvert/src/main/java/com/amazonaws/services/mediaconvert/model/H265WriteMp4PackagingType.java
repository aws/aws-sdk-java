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
 * Use this setting only for outputs encoded with H.265 that are in CMAF or DASH output groups. If you include
 * writeMp4PackagingType in your JSON job specification for other outputs, your video might not work properly with
 * downstream systems and video players. If the location of parameter set NAL units don't matter in your workflow,
 * ignore this setting. The service defaults to marking your output as HEV1. Choose HVC1 to mark your output as HVC1.
 * This makes your output compliant with this specification: ISO IECJTC1 SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd
 * Edition. For these outputs, the service stores parameter set NAL units in the sample headers but not in the samples
 * directly. Keep the default HEV1 to mark your output as HEV1. For these outputs, the service writes parameter set NAL
 * units directly into the samples.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum H265WriteMp4PackagingType {

    HVC1("HVC1"),
    HEV1("HEV1");

    private String value;

    private H265WriteMp4PackagingType(String value) {
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
     * @return H265WriteMp4PackagingType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static H265WriteMp4PackagingType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (H265WriteMp4PackagingType enumEntry : H265WriteMp4PackagingType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
