/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specify the event message box (eMSG) version for ID3 timed metadata in your output. For more information, see ISO/IEC
 * 23009-1:2022 section 5.10.3.3.3 Syntax. Leave blank to use the default value Version 0. When you specify Version 1,
 * you must also set ID3 metadata (timedMetadata) to Passthrough.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum MpdTimedMetadataBoxVersion {

    VERSION_0("VERSION_0"),
    VERSION_1("VERSION_1");

    private String value;

    private MpdTimedMetadataBoxVersion(String value) {
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
     * @return MpdTimedMetadataBoxVersion corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static MpdTimedMetadataBoxVersion fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (MpdTimedMetadataBoxVersion enumEntry : MpdTimedMetadataBoxVersion.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
