/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model.intelligenttiering;

/**
 * Represents whether an S3 Intelligent-Tiering configuration is enabled or disabled.
 */
public enum IntelligentTieringStatus {

    Enabled("Enabled"),
    Disabled("Disabled");

    private final String intelligentTieringStatus;

    IntelligentTieringStatus(String intelligentTieringStatus) {
        this.intelligentTieringStatus = intelligentTieringStatus;
    }

    @Override
    public String toString() {
        return intelligentTieringStatus;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return enum corresponding to the value
     */
    public static IntelligentTieringStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (IntelligentTieringStatus enumEntry : IntelligentTieringStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
