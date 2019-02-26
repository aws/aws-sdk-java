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
 * Contains options for setting the cross origin configuration for a bucket.
 * 
 * @see SetBucketCrossOriginConfigurationRequest#SetBucketCrossOriginConfigurationRequest(String, BucketCrossOriginConfiguration)
 */
public class SetBucketCrossOriginConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    
    /**
     * The bucket whose cross origin configuration is being set.
     */
    private String bucketName;

    /**
     * The new cross origin configuration for the specified bucket.
     */
    private BucketCrossOriginConfiguration crossOriginConfiguration;
    
    /**
     * Constructs a new {@link SetBucketCrossOriginConfigurationRequest} 
     * to set the bucket cross origin configuration of
     * the specified bucket.
     * 
     * @param bucketName
     *            The name of the bucket for which to set the cross origin
     *            configuration.
     * @param crossOriginConfiguration
     *            The new cross origin configuration for this bucket, which
     *            completely replaces any existing configuration.
     */
    public SetBucketCrossOriginConfigurationRequest(
            String bucketName, BucketCrossOriginConfiguration crossOriginConfiguration) {
        this.bucketName = bucketName;
        this.crossOriginConfiguration = crossOriginConfiguration;
    }

    
    /**
     * Gets the name of the bucket whose cross origin configuration is being
     * set.
     * 
     * @return The name of the bucket whose cross origin configuration is being
     *         set.
     *         
     * @see SetBucketCrossOriginConfigurationRequest#setBucketName(String)
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket whose cross origin configuration is being set.
     * 
     * @param bucketName
     *            The name of the bucket whose cross origin configuration is being
     *            set.
     *            
     * @see SetBucketCrossOriginConfigurationRequest#getBucketName()           
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket whose cross origin configuration is being set,
     * and returns this object so that additional method calls may be chained
     * together.
     * 
     * @param bucketName
     *            The name of the bucket whose cross origin configuration is being
     *            set.
     * 
     * @return This {@link SetBucketCrossOriginConfigurationRequest} object so that
     *         additional method calls may be chained together.
     *         
     * @see SetBucketCrossOriginConfigurationRequest#setBucketName(String)       
     */
    public SetBucketCrossOriginConfigurationRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Gets the new cross origin configuration for the specified bucket.
     * 
     * @return The new cross origin configuration for the specified bucket.
     * 
     * @see SetBucketCrossOriginConfigurationRequest#setCrossOriginConfiguration(BucketCrossOriginConfiguration)
     * @see SetBucketCrossOriginConfigurationRequest#withCrossOriginConfiguration(BucketCrossOriginConfiguration)
     */
    public BucketCrossOriginConfiguration getCrossOriginConfiguration() {
        return crossOriginConfiguration;
    }

    /**
     * Sets the new cross origin configuration for the specified bucket.
     * 
     * @param crossOriginConfiguration
     *            The new cross origin configuration for the specified bucket.
     *            
     * @see SetBucketCrossOriginConfigurationRequest#getCrossOriginConfiguration()           
     * @see SetBucketCrossOriginConfigurationRequest#withCrossOriginConfiguration(BucketCrossOriginConfiguration)
     */
    public void setCrossOriginConfiguration(
            BucketCrossOriginConfiguration crossOriginConfiguration) {
        this.crossOriginConfiguration = crossOriginConfiguration;
    }

    /**
     * Sets the new cross origin configuration for the specified bucket and
     * returns this object, enabling additional method calls to be chained
     * together.
     * 
     * @param crossOriginConfiguration
     *            The new cross origin configuration for the specified bucket.
     * 
     * @return This {@link SetBucketCrossOriginConfigurationRequest} object, enabling that
     *         additional method calls may be chained together.
     *         
     * @see SetBucketCrossOriginConfigurationRequest#getCrossOriginConfiguration()  
     */
    public SetBucketCrossOriginConfigurationRequest withCrossOriginConfiguration(
            BucketCrossOriginConfiguration crossOriginConfiguration) {
        setCrossOriginConfiguration(crossOriginConfiguration);
        return this;
    }

}
