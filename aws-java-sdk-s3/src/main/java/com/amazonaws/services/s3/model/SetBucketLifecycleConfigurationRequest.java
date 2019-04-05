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
 * Contains options for setting the lifecycle configuration for a bucket.
 * 
 * @see SetBucketLifecycleConfigurationRequest#SetBucketLifecycleConfigurationRequest(String, BucketLifecycleConfiguration)
 */
public class SetBucketLifecycleConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    
    /**
     * The bucket whose lifecycle configuration is being set.
     */
    private String bucketName;

    /**
     * The new lifecycle configuration for the specified bucket.
     */
    private BucketLifecycleConfiguration lifecycleConfiguration;
    
    /**
     * Constructs a new {@link SetBucketLifecycleConfigurationRequest} 
     * to set the bucket lifecycle configuration of
     * the specified bucket.
     * 
     * @param bucketName
     *            The name of the bucket for which to set the lifecycle
     *            configuration.
     * @param lifecycleConfiguration
     *            The new lifecycle configuration for this bucket, which
     *            completely replaces any existing configuration.
     */
    public SetBucketLifecycleConfigurationRequest(
            String bucketName, BucketLifecycleConfiguration lifecycleConfiguration) {
        this.bucketName = bucketName;
        this.lifecycleConfiguration = lifecycleConfiguration;
    }

    
    /**
     * Gets the name of the bucket whose lifecycle configuration is being
     * set.
     * 
     * @return The name of the bucket whose lifecycle configuration is being
     *         set.
     *         
     * @see SetBucketLifecycleConfigurationRequest#setBucketName(String)
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket whose lifecycle configuration is being set.
     * 
     * @param bucketName
     *            The name of the bucket whose lifecycle configuration is being
     *            set.
     *            
     * @see SetBucketLifecycleConfigurationRequest#getBucketName()           
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket whose lifecycle configuration is being set,
     * and returns this object so that additional method calls may be chained
     * together.
     * 
     * @param bucketName
     *            The name of the bucket whose lifecycle configuration is being
     *            set.
     * 
     * @return This {@link SetBucketLifecycleConfigurationRequest} object so that
     *         additional method calls may be chained together.
     *         
     * @see SetBucketLifecycleConfigurationRequest#setBucketName(String)       
     */
    public SetBucketLifecycleConfigurationRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Gets the new lifecycle configuration for the specified bucket.
     * 
     * @return The new lifecycle configuration for the specified bucket.
     * 
     * @see SetBucketLifecycleConfigurationRequest#withLifecycleConfiguration(BucketLifecycleConfiguration)
     */
    public BucketLifecycleConfiguration getLifecycleConfiguration() {
        return lifecycleConfiguration;
    }

    /**
     * Sets the new lifecycle configuration for the specified bucket.
     * 
     * @param lifecycleConfiguration
     *            The new lifecycle configuration for the specified bucket.
     *            
     * @see SetBucketLifecycleConfigurationRequest#getLifecycleConfiguration()           
     * @see SetBucketLifecycleConfigurationRequest#withLifecycleConfiguration(BucketLifecycleConfiguration)
     */
    public void setLifecycleConfiguration(
            BucketLifecycleConfiguration lifecycleConfiguration) {
        this.lifecycleConfiguration = lifecycleConfiguration;
    }

    /**
     * Sets the new lifecycle configuration for the specified bucket and
     * returns this object, enabling additional method calls to be chained
     * together.
     * 
     * @param lifecycleConfiguration
     *            The new lifecycle configuration for the specified bucket.
     * 
     * @return This {@link SetBucketLifecycleConfigurationRequest} object, enabling that
     *         additional method calls may be chained together.
     *         
     * @see SetBucketLifecycleConfigurationRequest#getLifecycleConfiguration()  
     */
    public SetBucketLifecycleConfigurationRequest withLifecycleConfiguration(
            BucketLifecycleConfiguration lifecycleConfiguration) {
        setLifecycleConfiguration(lifecycleConfiguration);
        return this;
    }

}
