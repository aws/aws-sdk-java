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
 * The status of an objects legal hold.
 */
public enum ObjectLockLegalHoldStatus {
    ON("ON"),
    OFF("OFF")
    ;

    private final String objectLockLegalHoldStatus;

    ObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
    }

    public static ObjectLockLegalHoldStatus fromString(String objectLockLegalHoldStatusString) {
        for (ObjectLockLegalHoldStatus v : ObjectLockLegalHoldStatus.values()) {
            if (v.toString().equals(objectLockLegalHoldStatusString)) {
                return v;
            }
        }
        throw new IllegalArgumentException("Cannot create enum from " + objectLockLegalHoldStatusString + " value!");
    }

    @Override
    public String toString() {
        return objectLockLegalHoldStatus;
    }
}
