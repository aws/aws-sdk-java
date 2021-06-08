/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.services.s3.model.intelligenttiering.IntelligentTieringConfiguration;

/**
 * Result object to contain the response returned from
 * {@link com.amazonaws.services.s3.AmazonS3Client#getBucketIntelligentTieringConfiguration(
 * GetBucketIntelligentTieringConfigurationRequest)}
 * operation.
 */
public class GetBucketIntelligentTieringConfigurationResult implements Serializable {

    private IntelligentTieringConfiguration intelligentTieringConfiguration;

    /**
     * Returns the requested S3 Intelligent-Tiering configuration.
     */
    public IntelligentTieringConfiguration getIntelligentTieringConfiguration() {
        return intelligentTieringConfiguration;
    }

    /**
     * Sets the requested S3 Intelligent-Tiering configuration.
     */
    public void setIntelligentTieringConfiguration(IntelligentTieringConfiguration intelligentTieringConfiguration) {
        this.intelligentTieringConfiguration = intelligentTieringConfiguration;
    }

    /**
     * Sets the requested S3 Intelligent-Tiering configuration and returns the
     * {@link GetBucketIntelligentTieringConfigurationResult} object for method chaining.
     */
    public GetBucketIntelligentTieringConfigurationResult withIntelligentTieringConfiguration(
            IntelligentTieringConfiguration intelligentTieringConfiguration) {
        setIntelligentTieringConfiguration(intelligentTieringConfiguration);
        return this;
    }
}
