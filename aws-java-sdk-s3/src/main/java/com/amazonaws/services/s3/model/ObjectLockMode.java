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
 * The object lock mode.
 */
public enum ObjectLockMode {
    GOVERNANCE("GOVERNANCE"),
    COMPLIANCE("COMPLIANCE")
    ;

    private final String objectLockMode;

    ObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
    }

    public static ObjectLockMode fromString(String objectLockModeString) {
        for (ObjectLockMode v : ObjectLockMode.values()) {
            if (v.toString().equals(objectLockModeString)) {
                return v;
            }
        }
        throw new IllegalArgumentException("Cannot create enum from " + objectLockModeString + " value!");
    }

    @Override
    public String toString() {
        return objectLockMode;
    }
}