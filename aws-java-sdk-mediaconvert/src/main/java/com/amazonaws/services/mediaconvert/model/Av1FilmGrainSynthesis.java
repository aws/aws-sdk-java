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
 * Film grain synthesis replaces film grain present in your content with similar quality synthesized AV1 film grain. We
 * recommend that you choose Enabled to reduce the bandwidth of your QVBR quality level 5, 6, 7, or 8 outputs. For QVBR
 * quality level 9 or 10 outputs we recommend that you keep the default value, Disabled. When you include Film grain
 * synthesis, you cannot include the Noise reducer preprocessor.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Av1FilmGrainSynthesis {

    DISABLED("DISABLED"),
    ENABLED("ENABLED");

    private String value;

    private Av1FilmGrainSynthesis(String value) {
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
     * @return Av1FilmGrainSynthesis corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Av1FilmGrainSynthesis fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Av1FilmGrainSynthesis enumEntry : Av1FilmGrainSynthesis.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
