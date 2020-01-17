/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Ignore this setting unless this input is a QuickTime animation with an alpha channel. Use this setting to create
 * separate Key and Fill outputs. In each output, specify which part of the input MediaConvert uses. Leave this setting
 * at the default value DISCARD to delete the alpha channel and preserve the video. Set it to REMAP_TO_LUMA to delete
 * the video and map the alpha channel to the luma channel of your outputs.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AlphaBehavior {

    DISCARD("DISCARD"),
    REMAP_TO_LUMA("REMAP_TO_LUMA");

    private String value;

    private AlphaBehavior(String value) {
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
     * @return AlphaBehavior corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AlphaBehavior fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AlphaBehavior enumEntry : AlphaBehavior.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
