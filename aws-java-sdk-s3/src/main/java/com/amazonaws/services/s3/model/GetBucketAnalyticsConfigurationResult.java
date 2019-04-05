/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;

import java.io.Serializable;

/**
 * Result object to contain the response returned from
 * {@link com.amazonaws.services.s3.AmazonS3Client#getBucketAnalyticsConfiguration(GetBucketAnalyticsConfigurationRequest)}
 * operation.
 */
public class GetBucketAnalyticsConfigurationResult implements Serializable {

    private AnalyticsConfiguration analyticsConfiguration;

    /**
     * Returns the requested analytics configuration.
     */
    public AnalyticsConfiguration getAnalyticsConfiguration() {
        return analyticsConfiguration;
    }

    /**
     * Sets the requested analytics configuration.
     */
    public void setAnalyticsConfiguration(AnalyticsConfiguration analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
    }

    /**
     * Sets the requested analytics configuration and returns the
     * {@link GetBucketAnalyticsConfigurationResult} object for method chaining.
     */
    public GetBucketAnalyticsConfigurationResult withAnalyticsConfiguration(AnalyticsConfiguration analyticsConfiguration) {
        setAnalyticsConfiguration(analyticsConfiguration);
        return this;
    }
}
