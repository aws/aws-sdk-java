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
 * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If you
 * choose the value auto, the service will automatically select the precision based on the per-frame compression ratio.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Mpeg2IntraDcPrecision {

    AUTO("AUTO"),
    INTRA_DC_PRECISION_8("INTRA_DC_PRECISION_8"),
    INTRA_DC_PRECISION_9("INTRA_DC_PRECISION_9"),
    INTRA_DC_PRECISION_10("INTRA_DC_PRECISION_10"),
    INTRA_DC_PRECISION_11("INTRA_DC_PRECISION_11");

    private String value;

    private Mpeg2IntraDcPrecision(String value) {
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
     * @return Mpeg2IntraDcPrecision corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Mpeg2IntraDcPrecision fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Mpeg2IntraDcPrecision enumEntry : Mpeg2IntraDcPrecision.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
