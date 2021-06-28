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
 * This setting applies only to ProRes 4444 and ProRes 4444 XQ outputs that you create from inputs that use 4:4:4 chroma
 * sampling. Set Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING) to allow outputs to also use 4:4:4 chroma sampling. You
 * must specify a value for this setting when your output codec profile supports 4:4:4 chroma sampling. Related
 * Settings: When you set Chroma sampling to Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING), you must choose an output
 * codec profile that supports 4:4:4 chroma sampling. These values for Profile (CodecProfile) support 4:4:4 chroma
 * sampling: Apple ProRes 4444 (APPLE_PRORES_4444) or Apple ProRes 4444 XQ (APPLE_PRORES_4444_XQ). When you set Chroma
 * sampling to Preserve 4:4:4 sampling, you must disable all video preprocessors except for Nexguard file marker
 * (PartnerWatermarking). When you set Chroma sampling to Preserve 4:4:4 sampling and use framerate conversion, you must
 * set Frame rate conversion algorithm (FramerateConversionAlgorithm) to Drop duplicate (DUPLICATE_DROP).
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ProresChromaSampling {

    PRESERVE_444_SAMPLING("PRESERVE_444_SAMPLING"),
    SUBSAMPLE_TO_422("SUBSAMPLE_TO_422");

    private String value;

    private ProresChromaSampling(String value) {
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
     * @return ProresChromaSampling corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ProresChromaSampling fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ProresChromaSampling enumEntry : ProresChromaSampling.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
