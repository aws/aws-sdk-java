/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitosync.model;

/**
 * Bulk Publish Status
 */
public enum BulkPublishStatus {
    
    NOT_STARTED("NOT_STARTED"),
    IN_PROGRESS("IN_PROGRESS"),
    FAILED("FAILED"),
    SUCCEEDED("SUCCEEDED");

    private String value;

    private BulkPublishStatus(String value) {
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
     *            real value
     * @return BulkPublishStatus corresponding to the value
     */
    public static BulkPublishStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("NOT_STARTED".equals(value)) {
            return BulkPublishStatus.NOT_STARTED;
        } else if ("IN_PROGRESS".equals(value)) {
            return BulkPublishStatus.IN_PROGRESS;
        } else if ("FAILED".equals(value)) {
            return BulkPublishStatus.FAILED;
        } else if ("SUCCEEDED".equals(value)) {
            return BulkPublishStatus.SUCCEEDED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    