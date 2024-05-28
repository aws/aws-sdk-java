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
 * Specify the strength of the Bandwidth reduction filter. For most workflows, we recommend that you choose Auto to
 * reduce the bandwidth of your output with little to no perceptual decrease in video quality. For high quality and high
 * bitrate outputs, choose Low. For the most bandwidth reduction, choose High. We recommend that you choose High for low
 * bitrate outputs. Note that High may incur a slight increase in the softness of your output.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BandwidthReductionFilterStrength {

    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH"),
    AUTO("AUTO"),
    OFF("OFF");

    private String value;

    private BandwidthReductionFilterStrength(String value) {
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
     * @return BandwidthReductionFilterStrength corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static BandwidthReductionFilterStrength fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (BandwidthReductionFilterStrength enumEntry : BandwidthReductionFilterStrength.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
