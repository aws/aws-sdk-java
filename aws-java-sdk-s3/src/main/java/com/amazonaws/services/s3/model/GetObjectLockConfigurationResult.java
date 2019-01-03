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

/**
 * Result object to contain the response returned from {@link AmazonS3#getObjectLockConfiguration(GetObjectLockConfigurationRequest)}.
 */
public class GetObjectLockConfigurationResult {
    private ObjectLockConfiguration objectLockConfiguration;

    /**
     * The specified bucket's Object Lock configuration.
     */
    public ObjectLockConfiguration getObjectLockConfiguration() {
        return objectLockConfiguration;
    }

    /**
     * The specified bucket's Object Lock configuration.
     */
    public GetObjectLockConfigurationResult withObjectLockConfiguration(ObjectLockConfiguration objectLockConfiguration) {
        this.objectLockConfiguration = objectLockConfiguration;
        return this;
    }

    /**
     * The specified bucket's Object Lock configuration.
     */
    public void setObjectLockConfiguration(ObjectLockConfiguration objectLockConfiguration) {
        withObjectLockConfiguration(objectLockConfiguration);
    }
}
