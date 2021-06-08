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
 * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior,
 * Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different
 * PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job
 * specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the
 * parNumerator and parDenominator settings.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ProresParControl {

    INITIALIZE_FROM_SOURCE("INITIALIZE_FROM_SOURCE"),
    SPECIFIED("SPECIFIED");

    private String value;

    private ProresParControl(String value) {
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
     * @return ProresParControl corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ProresParControl fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ProresParControl enumEntry : ProresParControl.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
