/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

/**
 * Represents the accelerate configuration for a bucket.
 */
public class BucketAccelerateConfiguration implements Serializable {

    /** The current accelerate configuration status */
    private String status;

    /**
     * Creates a new bucket accelerate configuration object with the specified status.
     *
     * @param status
     *            The desired bucket accelerate status for the new configuration object. See
     *            {@link BucketAccelerateStatus} for a list of valid values.
     */
    public BucketAccelerateConfiguration(String status) {
        setStatus(status);
    }

    /**
     * Creates a new bucket accelerate configuration object with the specified status.
     *
     * @param status
     *            The desired bucket accelerate status for the new configuration object. See
     *            {@link BucketAccelerateStatus} for a list of valid values.
     */
    public BucketAccelerateConfiguration(BucketAccelerateStatus status) {
        setStatus(status);
    }

    /**
     * @return The current status of the accelerate configuration for this bucket, or null if the
     *         bucket has never been enabled or suspended accelerate configuration.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the desired bucket accelerate status for this configuration object.
     *
     * @param status
     *            The desired bucket accelerate status for this configuration object. See
     *            {@link BucketAccelerateStatus} for a list of valid values.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Sets the desired bucket accelerate status for this configuration object.
     *
     * @param status
     *            The desired bucket accelerate status for this configuration object. See
     *            {@link BucketAccelerateStatus} for a list of valid values.
     */
    public void setStatus(BucketAccelerateStatus status) {
        setStatus(status.toString());
    }

    /**
     * Fluent setter method for {@link #setStatus(String)}
     *
     * @return This {@link BucketAccelerateConfiguration} object so that additional method calls may
     *         be chained together.
     * @see #setStatus(String)
     */
    public BucketAccelerateConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    public BucketAccelerateConfiguration withStatus(BucketAccelerateStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * A convenience method that returns whether the bucket is enabled accelerate mode.
     *
     * @return True if the accelerate configuration has the {@link BucketAccelerateStatus#Enabled}
     *         status.
     */
    public boolean isAccelerateEnabled() {
        return BucketAccelerateStatus.Enabled.toString().equals(getStatus());
    }
}
