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
 * Whether the object lock is enabled.
 */
public enum ObjectLockEnabled {

    ENABLED("Enabled");

    private final String objectLockEnabled;

    ObjectLockEnabled(String objectLockEnabled) {
        this.objectLockEnabled = objectLockEnabled;
    }

    public static ObjectLockEnabled fromString(String objectLockEnabledString) {
        for (ObjectLockEnabled v : ObjectLockEnabled.values()) {
            if (v.toString().equals(objectLockEnabledString)) {
                return v;
            }
        }
        throw new IllegalArgumentException("Cannot create enum from " + objectLockEnabledString + " value!");
    }

    @Override
    public String toString() {
        return objectLockEnabled;
    }
}