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

import com.amazonaws.services.s3.AmazonS3;

import java.io.Serializable;

/**
 * Result object to contain the response returned from {@link AmazonS3#getObjectRetention(GetObjectRetentionRequest)}.
 */
public class GetObjectRetentionResult implements Serializable {
    private ObjectLockRetention retention;

    /**
     * The container element for an object's retention settings.
     */
    public ObjectLockRetention getRetention() {
        return retention;
    }

    /**
     * The container element for an object's retention settings.
     */
    public GetObjectRetentionResult withRetention(ObjectLockRetention retention) {
        this.retention = retention;
        return this;
    }

    /**
     * The container element for an object's retention settings.
     */
    public void setRetention(ObjectLockRetention retention) {
        withRetention(retention);
    }
}
