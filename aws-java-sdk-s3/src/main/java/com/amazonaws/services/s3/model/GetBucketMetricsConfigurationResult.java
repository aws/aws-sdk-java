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

import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;

import java.io.Serializable;

/**
 * Result object to contain the response returned from
 * {@link com.amazonaws.services.s3.AmazonS3Client#getBucketMetricsConfiguration(GetBucketMetricsConfigurationRequest)}
 * operation.
 */
public class GetBucketMetricsConfigurationResult implements Serializable {

    private MetricsConfiguration metricsConfiguration;

    /**
     * Returns the requested metrics configuration.
     */
    public MetricsConfiguration getMetricsConfiguration() {
        return metricsConfiguration;
    }

    /**
     * Sets the requested metrics configuration.
     */
    public void setMetricsConfiguration(MetricsConfiguration metricsConfiguration) {
        this.metricsConfiguration = metricsConfiguration;
    }

    /**
     * Sets the requested metrics configuration and returns
     * {@link GetBucketMetricsConfigurationResult} object for method chaining.
     */
    public GetBucketMetricsConfigurationResult withMetricsConfiguration(MetricsConfiguration metricsConfiguration) {
        setMetricsConfiguration(metricsConfiguration);
        return this;
    }
}
