/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
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

/**
 * Contains options for setting the notification configuration for a bucket.
 * 
 * @see SetBucketNotificationConfigurationRequest#SetBucketNotificationConfigurationRequest(String, BucketNotificationConfiguration)
 */
public class SetBucketNotificationConfigurationRequest extends AmazonWebServiceRequest implements Serializable {

    private BucketNotificationConfiguration notificationConfiguration;

    private String bucketName;

    /**
     * @deprecated Use SetBucketNotificationConfigurationRequest(String, BucketNotificationConfiguration) instead.
     */
    @Deprecated
    public SetBucketNotificationConfigurationRequest(BucketNotificationConfiguration bucketNotificationConfiguration,
            String bucket) {
        this.notificationConfiguration = bucketNotificationConfiguration;
        this.bucketName = bucket;
    }

    /**
     * Constructs a new {@link SetBucketNotificationConfigurationRequest} 
     * to set the bucket notification configuration of
     * the specified bucket.
     * 
     * @param bucketName
     *            The name of the bucket for which to set the notification
     *            configuration.
     * @param notificationConfiguration
     *            The new notification configuration for this bucket, which
     *            completely replaces any existing configuration.
     */
    public SetBucketNotificationConfigurationRequest(
            String bucketName, BucketNotificationConfiguration notificationConfiguration) {
        this.bucketName = bucketName;
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * @deprecated Use getNotificationConfiguration() instead.
     */
    @Deprecated
    public BucketNotificationConfiguration getBucketNotificationConfiguration() {
        return notificationConfiguration;
    }

    /**
     * Gets the new notification configuration for the specified bucket.
     * 
     * @return The new notification configuration for the specified bucket.
     * 
     * @see SetBucketNotificationConfigurationRequest#withNotificationConfiguration(BucketNotificationConfiguration)
     */
    public BucketNotificationConfiguration getNotificationConfiguration() {
        return notificationConfiguration;
    }

    /**
     * @deprecated Use setNotificationConfiguration(BucketNotificationConfiguration) instead.
     */
    @Deprecated
    public void setBucketNotificationConfiguration(BucketNotificationConfiguration bucketNotificationConfiguration) {
        this.notificationConfiguration = bucketNotificationConfiguration;
    }

    /**
     * Sets the new notification configuration for the specified bucket.
     * 
     * @param notificationConfiguration
     *            The new notification configuration for the specified bucket.
     * 
     * @see SetBucketNotificationConfigurationRequest#withNotificationConfiguration(BucketNotificationConfiguration)
     */
    public void setNotificationConfiguration(BucketNotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * Sets the new notification configuration for the specified bucket and
     * returns this object, enabling additional method calls to be chained
     * together.
     * 
     * @param notificationConfiguration
     *            The new notification configuration for the specified bucket.
     * 
     * @return This {@link SetBucketNotificationConfigurationRequest} object,
     *         enabling that additional method calls may be chained together.
     * 
     * @see SetBucketNotificationConfigurationRequest#getNotificationConfiguration()
     */
    public SetBucketNotificationConfigurationRequest withNotificationConfiguration(
            BucketNotificationConfiguration notificationConfiguration) {
        setNotificationConfiguration(notificationConfiguration);
        return this;
    }

    /**
     * @deprecated Use getBucketName() instead.
     */
    @Deprecated
    public String getBucket() {
        return bucketName;
    }

    /**
     * Gets the name of the bucket whose notification configuration is being
     * set.
     * 
     * @return The name of the bucket whose notification configuration is being
     *         set.
     * 
     * @see SetBucketNotificationConfigurationRequest#setBucketName(String)
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * @deprecated Use setBucketName(String) instead.
     */
    @Deprecated
    public void setBucket(String bucket) {
        this.bucketName = bucket;
    }

    /**
     * Sets the name of the bucket whose notification configuration is being
     * set.
     * 
     * @param bucketName
     *            The name of the bucket whose notification configuration is
     *            being set.
     * 
     * @see SetBucketNotificationConfigurationRequest#getBucketName()
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket whose notification configuration is being
     * set, and returns this object so that additional method calls may be
     * chained together.
     * 
     * @param bucketName
     *            The name of the bucket whose notification configuration is
     *            being set.
     * 
     * @return This {@link SetBucketNotificationConfigurationRequest} object so
     *         that additional method calls may be chained together.
     * 
     * @see SetBucketNotificationConfigurationRequest#setBucketName(String)
     */
    public SetBucketNotificationConfigurationRequest withBucketName(
            String bucketName) {
        setBucketName(bucketName);
        return this;
    }
}
