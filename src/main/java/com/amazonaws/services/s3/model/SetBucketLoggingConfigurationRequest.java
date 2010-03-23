/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Options for setting the logging configuration for a bucket. The bucket
 * logging configuration object controls whether server access logging is
 * enabled or not for the specified bucket, and if so the destination bucket
 * where server access logs are delivered (which may be the same bucket as the
 * source bucket), and the optional log file prefix.
 * <p>
 * In order to deliver server access logs, the destination bucket must have log
 * delivery write permissions. You can use the
 * {@link CannedAccessControlList#LogDeliveryWrite} ACL to quickly add the
 * correct permissions to your destination bucket, or you can modify the
 * bucket's existing ACL to grant the {@link GroupGrantee#LogDelivery} group
 * grantee the {@link Permission#Write} permission.
 * <p>
 * Changes to the logging status for a bucket are visible in the configuration
 * API immediately, but they take time to actually affect the delivery of log
 * files. For example, if you enable logging for a bucket, some requests made in
 * the following hour might be logged, while others might not. Or, if you change
 * the target bucket for logging from bucket A to bucket B, some logs for the
 * next hour might continue to be delivered to bucket A, while others might be
 * delivered to the new target bucket B. In all cases, the new settings will
 * eventually take effect without any further action on your part.
 */
public class SetBucketLoggingConfigurationRequest extends AmazonWebServiceRequest {

    /**
     * The name of the bucket whose logging configuration is being set.
     */
    private String bucketName;
    
    /**
     * The new logging configuration for the specified bucket.
     */
    private BucketLoggingConfiguration loggingConfiguration;

    
    /**
     * @param bucketName
     * @param loggingConfiguration
     */
    public SetBucketLoggingConfigurationRequest(String bucketName, BucketLoggingConfiguration loggingConfiguration) {
        this.bucketName = bucketName;
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * Returns the name of the bucket whose logging configuration is being set.
     * 
     * @return The name of the bucket whose logging configuration is being set.
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
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket whose logging configuration is being set ,
     * and returns the updated object so that additional method calls may be
     * chained together.
     * 
     * @param bucketName
     *            The name of the bucket whose logging configuration is being
     *            set.
     * 
     * @return This SetBucketLoggingConfigurationRequest object so that
     *         additional method calls may be chained together.
     */
    public SetBucketLoggingConfigurationRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the new logging configuration for the specified bucket.
     * 
     * @return The new logging configuration for the specified bucket.
     */
    public BucketLoggingConfiguration getLoggingConfiguration() {
        return loggingConfiguration;
    }

    /**
     * Sets the new logging configuration for the specified bucket.
     * 
     * @param loggingConfiguration
     *            The new logging configuration for the specified bucket.
     */
    public void setLoggingConfiguration(BucketLoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * Sets the new logging configuration for the specified bucket, and returns
     * the updated object so that additional method calls may be chained
     * together.
     * 
     * @param loggingConfiguration
     *            The new logging configuration for the specified bucket.
     * 
     * @return This SetBucketLoggingConfigurationRequest object so that
     *         additional method calls may be chained together.
     */
    public SetBucketLoggingConfigurationRequest withLoggingConfiguration(BucketLoggingConfiguration loggingConfiguration) {
        setLoggingConfiguration(loggingConfiguration);
        return this;
    }

}
