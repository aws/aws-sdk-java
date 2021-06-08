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
package com.amazonaws.services.medialive.model;

import javax.annotation.Generated;

/**
 * Input preference when deciding which input to make active when a previously failed input has recovered. If
 * \"EQUAL_INPUT_PREFERENCE\", then the active input will stay active as long as it is healthy. If
 * \"PRIMARY_INPUT_PREFERRED\", then always switch back to the primary input when it is healthy.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum InputPreference {

    EQUAL_INPUT_PREFERENCE("EQUAL_INPUT_PREFERENCE"),
    PRIMARY_INPUT_PREFERRED("PRIMARY_INPUT_PREFERRED");

    private String value;

    private InputPreference(String value) {
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
     * @return InputPreference corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static InputPreference fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (InputPreference enumEntry : InputPreference.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
