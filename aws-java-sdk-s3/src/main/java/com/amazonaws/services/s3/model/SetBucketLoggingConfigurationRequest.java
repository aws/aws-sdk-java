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
 * <p>
 * Contains options for setting the logging configuration for a bucket. The bucket
 * logging configuration object controls whether or not server access logging is
 * enabled for the specified bucket.  If server access logging is enabled,
 * this object provides options for specifying where the server
 * access logs are delivered and the optional log file prefix.
 * </p>
 * <p>
 * In order to deliver server access logs, the destination bucket must have log
 * delivery write permissions. Use the
 * {@link CannedAccessControlList#LogDeliveryWrite} ACL to quickly add the
 * correct permissions to the destination bucket. Alternatively, modify the
 * bucket's existing ACL to grant the {@link GroupGrantee#LogDelivery} group
 * grantee the {@link Permission#Write} permission.
 * </p>
 * <p>
 * Changes to the logging status for a bucket are visible in the configuration
 * API immediately, but take time to actually affect the delivery of log
 * files. For example, when enabling logging for a bucket, some requests made in
 * the following hour might be logged while others might not. 
 * For another example, when changing
 * the target bucket for logging from bucket 'A' to bucket 'B', some logs for the
 * next hour might continue to be delivered to bucket 'A.' Others might be
 * delivered to the new target bucket 'B.' In all cases, the new settings will
 * eventually take effect without any further action from the user.
 * </p>
 * 
 * @see SetBucketLoggingConfigurationRequest#SetBucketLoggingConfigurationRequest(String, BucketLoggingConfiguration)
 */
public class SetBucketLoggingConfigurationRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the bucket whose logging configuration is being set.
     */
    private String bucketName;
    
    /**
     * The new logging configuration for the specified bucket.
     */
    private BucketLoggingConfiguration loggingConfiguration;

    
    /**
     * Constructs a new {@link SetBucketLoggingConfigurationRequest} 
     * to set the bucket logging configuration of
     * the specified bucket.
     * 
     * @param bucketName
     *            The name of the bucket whose logging configuration is being
     *            set.
     * @param loggingConfiguration
     *            The new logging configuration for the specified bucket.
     */
    public SetBucketLoggingConfigurationRequest(String bucketName, BucketLoggingConfiguration loggingConfiguration) {
        this.bucketName = bucketName;
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * Gets the name of the bucket whose logging configuration is being set.
     * 
     * @return The name of the bucket whose logging configuration is being set.
     * 
     * @see SetBucketLoggingConfigurationRequest#setBucketName(String)
     * @see SetBucketLoggingConfigurationRequest#withLoggingConfiguration(BucketLoggingConfiguration)
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket whose logging configuration is being set.
     * 
     * @param bucketName
     *            The name of the bucket whose logging configuration is being
     *            set.
     *            
     * @see SetBucketLoggingConfigurationRequest#getBucketName()
     * @see SetBucketLoggingConfigurationRequest#withBucketName(String)            
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket whose logging configuration is being set
     * and returns this object, enabling additional method calls to be
     * chained together.
     * 
     * @param bucketName
     *            The name of the bucket whose logging configuration is being
     *            set.
     * 
     * @return This {@link SetBucketLoggingConfigurationRequest} object, enabling
     *         additional method calls may to be chained together.
     *         
     * @see SetBucketLoggingConfigurationRequest#getBucketName()
     * @see SetBucketLoggingConfigurationRequest#setBucketName(String)     
     */
    public SetBucketLoggingConfigurationRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Gets the logging configuration for the specified bucket.
     * 
     * @return The logging configuration for the specified bucket.
     * 
     * @see SetBucketLoggingConfigurationRequest#setLoggingConfiguration(BucketLoggingConfiguration)
     * @see SetBucketLoggingConfigurationRequest#withLoggingConfiguration(BucketLoggingConfiguration)
     */
    public BucketLoggingConfiguration getLoggingConfiguration() {
        return loggingConfiguration;
    }

    /**
     * Sets the logging configuration for the specified bucket.
     * 
     * @param loggingConfiguration
     *            The logging configuration for the specified bucket.
     *            
     * @see SetBucketLoggingConfigurationRequest#getLoggingConfiguration()     
     * @see SetBucketLoggingConfigurationRequest#withLoggingConfiguration(BucketLoggingConfiguration)
     */
    public void setLoggingConfiguration(BucketLoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * Sets the logging configuration for the specified bucket and returns
     * the updated object, enabling additional method calls to be chained
     * together.
     * 
     * @param loggingConfiguration
     *            The logging configuration for the specified bucket.
     * 
     * @return This {@link SetBucketLoggingConfigurationRequest} object, enabling
     *         additional method calls to be chained together.
     *         
     * @see SetBucketLoggingConfigurationRequest#getLoggingConfiguration()
     * @see SetBucketLoggingConfigurationRequest#setLoggingConfiguration(BucketLoggingConfiguration)
     */
    public SetBucketLoggingConfigurationRequest withLoggingConfiguration(BucketLoggingConfiguration loggingConfiguration) {
        setLoggingConfiguration(loggingConfiguration);
        return this;
    }

}
