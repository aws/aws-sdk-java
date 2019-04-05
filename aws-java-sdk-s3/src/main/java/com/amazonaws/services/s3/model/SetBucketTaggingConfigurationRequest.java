/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Contains options for setting the tagging configuration for a bucket.
 * 
 * @see SetBucketTaggingConfigurationRequest#SetBucketTaggingConfigurationRequest(String, BucketTaggingConfiguration)
 */
public class SetBucketTaggingConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    
    /**
     * The bucket whose tagging configuration is being set.
     */
    private String bucketName;

    /**
     * The new tagging configuration for the specified bucket.
     */
    private BucketTaggingConfiguration taggingConfiguration;
    
    /**
     * Constructs a new {@link SetBucketTaggingConfigurationRequest} 
     * to set the bucket tagging configuration of
     * the specified bucket.
     * 
     * @param bucketName
     *            The name of the bucket for which to set the tagging
     *            configuration.
     * @param taggingConfiguration
     *            The new tagging configuration for this bucket, which
     *            completely replaces any existing configuration.
     */
    public SetBucketTaggingConfigurationRequest(
            String bucketName, BucketTaggingConfiguration taggingConfiguration) {
        this.bucketName = bucketName;
        this.taggingConfiguration = taggingConfiguration;
    }

    /**
     * Gets the name of the bucket whose tagging configuration is being
     * set.
     * 
     * @return The name of the bucket whose tagging configuration is being
     *         set.
     *         
     * @see SetBucketTaggingConfigurationRequest#setBucketName(String)
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket whose tagging configuration is being set.
     * 
     * @param bucketName
     *            The name of the bucket whose tagging configuration is being
     *            set.
     *            
     * @see SetBucketTaggingConfigurationRequest#getBucketName()           
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket whose tagging configuration is being set,
     * and returns this object so that additional method calls may be chained
     * together.
     * 
     * @param bucketName
     *            The name of the bucket whose tagging configuration is being
     *            set.
     * 
     * @return This {@link SetBucketTaggingConfigurationRequest} object so that
     *         additional method calls may be chained together.
     *         
     * @see SetBucketTaggingConfigurationRequest#setBucketName(String)       
     */
    public SetBucketTaggingConfigurationRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Gets the new tagging configuration for the specified bucket.
     * 
     * @return The new tagging configuration for the specified bucket.
     * 
     * @see SetBucketTaggingConfigurationRequest#withTaggingConfiguration(BucketTaggingConfiguration)
     */
    public BucketTaggingConfiguration getTaggingConfiguration() {
        return taggingConfiguration;
    }

    /**
     * Sets the new tagging configuration for the specified bucket.
     * 
     * @param taggingConfiguration
     *            The new tagging configuration for the specified bucket.
     *            
     * @see SetBucketTaggingConfigurationRequest#getTaggingConfiguration()           
     * @see SetBucketTaggingConfigurationRequest#withTaggingConfiguration(BucketTaggingConfiguration)
     */
    public void setTaggingConfiguration(
            BucketTaggingConfiguration taggingConfiguration) {
        this.taggingConfiguration = taggingConfiguration;
    }

    /**
     * Sets the new tagging configuration for the specified bucket and
     * returns this object, enabling additional method calls to be chained
     * together.
     * 
     * @param taggingConfiguration
     *            The new tagging configuration for the specified bucket.
     * 
     * @return This {@link SetBucketTaggingConfigurationRequest} object, enabling that
     *         additional method calls may be chained together.
     *         
     * @see SetBucketTaggingConfigurationRequest#getTaggingConfiguration()  
     */
    public SetBucketTaggingConfigurationRequest withTaggingConfiguration(
            BucketTaggingConfiguration taggingConfiguration) {
        setTaggingConfiguration(taggingConfiguration);
        return this;
    }

}
