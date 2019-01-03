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
 * Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions. To
 * use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral is an edge preserving noise
 * reduction filter. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) are convolution filters. * Conserve is
 * a min/max noise reduction filter. * Spatial is a frequency-domain filter based on JND principles.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum NoiseReducerFilter {

    BILATERAL("BILATERAL"),
    MEAN("MEAN"),
    GAUSSIAN("GAUSSIAN"),
    LANCZOS("LANCZOS"),
    SHARPEN("SHARPEN"),
    CONSERVE("CONSERVE"),
    SPATIAL("SPATIAL");

    private String value;

    private NoiseReducerFilter(String value) {
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
     * @return NoiseReducerFilter corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static NoiseReducerFilter fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (NoiseReducerFilter enumEntry : NoiseReducerFilter.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
