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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.model.intelligenttiering.IntelligentTieringConfiguration;

/**
 * Request object to set S3 Intelligent-Tiering configuration to a bucket.
 */
public class SetBucketIntelligentTieringConfigurationRequest extends AmazonWebServiceRequest implements Serializable {

    private String bucketName;
    private IntelligentTieringConfiguration intelligentTieringConfiguration;

    public SetBucketIntelligentTieringConfigurationRequest() { }

    public SetBucketIntelligentTieringConfigurationRequest(
            String bucketName, IntelligentTieringConfiguration intelligentTieringConfiguration) {
        this.bucketName = bucketName;
        this.intelligentTieringConfiguration = intelligentTieringConfiguration;
    }

    /**
     * Returns the name of the bucket to which an S3 Intelligent-Tiering configuration is stored.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket to which an S3 Intelligent-Tiering configuration is stored.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket to which an S3 Intelligent-Tiering configuration is stored
     * and returns this object for method chaining.
     */
    public SetBucketIntelligentTieringConfigurationRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the {@link IntelligentTieringConfiguration} object.
     */
    public IntelligentTieringConfiguration getIntelligentTierinConfiguration() {
        return intelligentTieringConfiguration;
    }

    /**
     * Sets the {@link IntelligentTieringConfiguration} object.
     */
    public void setIntelligentTierinConfiguration(IntelligentTieringConfiguration intelligentTieringConfiguration) {
        this.intelligentTieringConfiguration = intelligentTieringConfiguration;
    }

    /**
     * Sets the {@link IntelligentTieringConfiguration} object and
     * returns this object for method chaining.
     */
    public SetBucketIntelligentTieringConfigurationRequest withIntelligentTieringConfiguration(
            IntelligentTieringConfiguration intelligentTieringConfiguration) {
        setIntelligentTierinConfiguration(intelligentTieringConfiguration);
        return this;
    }
}
