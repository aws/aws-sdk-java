/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * When an "Audio Description":#audio_description specifies an AudioSelector or AudioSelectorGroup for which no matching
 * source is found in the input, then the audio selector marked as DEFAULT will be used. If none are marked as default,
 * silence will be inserted for the duration of the input.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AudioDefaultSelection {

    DEFAULT("DEFAULT"),
    NOT_DEFAULT("NOT_DEFAULT");

    private String value;

    private AudioDefaultSelection(String value) {
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
     * @return AudioDefaultSelection corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AudioDefaultSelection fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AudioDefaultSelection enumEntry : AudioDefaultSelection.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
