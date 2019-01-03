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
 * Selects method of inserting SDT information into output stream. "Follow input SDT" copies SDT information from input
 * stream to output stream. "Follow input SDT if present" copies SDT information from input stream to output stream if
 * SDT information is present in the input, otherwise it will fall back on the user-defined values. Enter
 * "SDT  Manually" means user will enter the SDT information. "No SDT" means output stream will not contain SDT
 * information.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum OutputSdt {

    SDT_FOLLOW("SDT_FOLLOW"),
    SDT_FOLLOW_IF_PRESENT("SDT_FOLLOW_IF_PRESENT"),
    SDT_MANUAL("SDT_MANUAL"),
    SDT_NONE("SDT_NONE");

    private String value;

    private OutputSdt(String value) {
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
     * @return OutputSdt corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static OutputSdt fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (OutputSdt enumEntry : OutputSdt.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
