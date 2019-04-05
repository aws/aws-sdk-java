/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the current accelerate status for a bucket.
 * @see BucketAccelerateConfiguration
 */
public enum BucketAccelerateStatus {

    Enabled("Enabled"),
    Suspended("Suspended");

    public static BucketAccelerateStatus fromValue(String statusString) throws IllegalArgumentException {
        for (BucketAccelerateStatus accelerateStatus : BucketAccelerateStatus.values()) {
            if (accelerateStatus.toString().equals(statusString)) {
                return accelerateStatus;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + statusString + " value!");
    }

    private final String accelerateStatus;

    private BucketAccelerateStatus(String status) {
        this.accelerateStatus = status;
    }

    @Override
    public String toString() {
        return accelerateStatus;
    }
}
