/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model;

/**
 * The retention mode for an object.
 */
public enum ObjectLockRetentionMode {
    GOVERNANCE("GOVERNANCE"),

    COMPLIANCE("COMPLIANCE"),

    ;

    private final String objectLockRetentionMode;

    ObjectLockRetentionMode(String objectLockRetentionMode) {
        this.objectLockRetentionMode = objectLockRetentionMode;
    }

    public static ObjectLockRetentionMode fromString(String objectLockRetentionModeString) {
        for (ObjectLockRetentionMode v : ObjectLockRetentionMode.values()) {
            if (v.toString().equals(objectLockRetentionModeString)) {
                return v;
            }
        }
        throw new IllegalArgumentException("Cannot create enum from " + objectLockRetentionModeString + " value!");
    }

    @Override
    public String toString() {
        return objectLockRetentionMode;
    }
}
