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
 * Represents the available archive tiers for objects in the S3 Intelligent-Tiering storage class.
 *
 * @see com.amazonaws.services.s3.model.StorageClass
 */
public enum IntelligentTieringAccessTier {

    /**
     * First level of tiering.
     */
    ARCHIVE_ACCESS("ARCHIVE_ACCESS"),

    /**
     * Second level of tiering.
     */
    DEEP_ARCHIVE_ACCESS("DEEP_ARCHIVE_ACCESS");

    private final String intelligentTieringAccessTier;

    IntelligentTieringAccessTier(String intelligentTieringAccessTier) {
        this.intelligentTieringAccessTier = intelligentTieringAccessTier;
    }

    @Override
    public String toString() {
        return intelligentTieringAccessTier;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return enum corresponding to the value
     */
    public static IntelligentTieringAccessTier fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (IntelligentTieringAccessTier enumEntry : IntelligentTieringAccessTier.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
