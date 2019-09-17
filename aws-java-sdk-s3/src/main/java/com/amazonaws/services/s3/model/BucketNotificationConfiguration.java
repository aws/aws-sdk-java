/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.util.json.Jackson;

/**
 * <p>
 * Represents a bucket's notification configuration. The notification configuration is
 * used to control reception of notifications for specific events for Amazon S3 buckets.
 * </p>
 * <p>
 * Using SNS as the delivery service, the notification configuration
 * of an Amazon S3 bucket provides near real-time notifications of events
 * the user is interested in.
 * Notification is turned on by enabling configuration on a bucket, specifying
 * the events and the SNS topic. This configuration can only be turned
 * on by the bucket owner.
 * </p>
 * <p>
 * If a notification configuration already exists for the
 * specified bucket, the new notification configuration will replace the existing
 * notification configuration.  To remove a notification configuration, pass an
 * an empty configuration directly to
 * {@link AmazonS3#setBucketNotificationConfiguration(String,BucketNotificationConfiguration)}.
 * </p>
 * <p>
 * Note: Currently buckets may only have a single event and topic
 * configuration.
 * </p>
 *
 * @see AmazonS3#getBucketNotificationConfiguration(String)
 * @see AmazonS3#setBucketNotificationConfiguration(String, BucketNotificationConfiguration)
 */
public class BucketNotificationConfiguration implements Serializable {

    private Map<String, NotificationConfiguration> configurations = null;

    /**
     * <p>
     * Creates a new bucket notification configuration.
     * By default, the newly created configuration is empty.
     * </p>
     * <p>
     * Passing the new configuration directly to
     * {@link AmazonS3#setBucketNotificationConfiguration(String,BucketNotificationConfiguration)}
     * will remove any existing bucket notification configuration.
     * </p>
     *
     * @see BucketNotificationConfiguration#BucketNotificationConfiguration(Collection)
     */
    public BucketNotificationConfiguration() {
        this.configurations = new HashMap<String, NotificationConfiguration>();
    }

    /**
     * <p>
     * Creates a new bucket notification configuration with the given configuration.
     * </p>
     *
     * @param name the name for the configuration
     * @param notificationConfiguration the notification configuration for the Amazon S3 bucket.
     */
    public BucketNotificationConfiguration(String name,
            NotificationConfiguration notificationConfiguration) {
        this.configurations = new HashMap<String, NotificationConfiguration>();
        addConfiguration(name, notificationConfiguration);
    }

    /**
     * Sets the given notification configurations and returns this object.
     *
     * @param notificationConfiguration
     *            the notification configurations to set
     * @return The updated {@link BucketNotificationConfiguration} object.
     */
    public BucketNotificationConfiguration withNotificationConfiguration(
            Map<String, NotificationConfiguration> notificationConfiguration) {
        configurations.clear();
        configurations.putAll(notificationConfiguration);
        return this;
    }

    /**
     * Adds the given notification configuration to the
     * {@link BucketNotificationConfiguration} object
     *
     * @param name
     *            the name of the configuration
     * @param notificationConfiguration
     *            the notification configuration for the Amazon S3 bucket.
     * @return The updated {@link BucketNotificationConfiguration} object.
     */
    public BucketNotificationConfiguration addConfiguration(String name,
            NotificationConfiguration notificationConfiguration) {
        configurations.put(name, notificationConfiguration);
        return this;
    }

    /**
     * Returns all the notification configurations associated with the Amazon S3
     * bucket.
     */
    public Map<String, NotificationConfiguration> getConfigurations() {
        return configurations;
    }

    /**
     * Sets the given notification configurations in this
     * {@link BucketNotificationConfiguration} object.
     *
     * @param configurations
     *            the notification configurations to set
     */
    public void setConfigurations(
            Map<String, NotificationConfiguration> configurations) {
        this.configurations = configurations;
    }

    /**
     * Returns the notification configuration for the given name.
     *
     * @param name
     *            the name of the notification configuration
     * @return {@link NotificationConfiguration} associated with the given name.
     */
    public NotificationConfiguration getConfigurationByName(String name) {
        return configurations.get(name);
    }

    /**
     * <p>
     * Removes the notification configuration for the given name in the
     * {@link BucketNotificationConfiguration} object.
     * </p>
     * <p>
     * Pass the updated {@link BucketNotificationConfiguration} to
     * {@link AmazonS3#setBucketNotificationConfiguration(String,BucketNotificationConfiguration)}
     * to update the configuration in Amazon S3 for the bucket.
     * </p>
     *
     * @param name
     *            the name of the notification configuration
     * @return {@link NotificationConfiguration} associated with the given name.
     */
    public NotificationConfiguration removeConfiguration(String name) {
        return configurations.remove(name);
    }

    /**
     * <p>
     * Creates a new bucket notification configuration containing the specified
     * <code>TopicConfigurations</code>.
     * </p>
     * <p>
     * Passing the new configuration directly to
     * {@link AmazonS3#setBucketNotificationConfiguration(String,BucketNotificationConfiguration)}
     * will set the bucket's notification configuration and overwrite any existing configuration.
     * </p>
     * @deprecated
     * @see BucketNotificationConfiguration#BucketNotificationConfiguration(String, NotificationConfiguration)
     */
    public BucketNotificationConfiguration( Collection<TopicConfiguration> topicConfigurations ) {
        this.configurations = new HashMap<String, NotificationConfiguration>();
        if (topicConfigurations != null){
            for(TopicConfiguration config : topicConfigurations) {
                addConfiguration(UUID.randomUUID().toString(), config);
            }
        }
    }

    /**
     * <p>
     * Sets the {@link BucketNotificationConfiguration.TopicConfiguration}
     * <code>TopicConfigurations</code> and returns this object,
     * enabling additional method calls to be chained together.
     * </p>
     * <p>
     * Calling this method will overwrite any
     * previously set <code>TopicConfigurations</code> for this object.
     * </p>
     *
     * @param topicConfigurations
     *            A set of topic configurations.
     *
     * @return The updated {@link BucketNotificationConfiguration} object,
     * 		   enabling additional method calls to be chained together.
     *
     * @deprecated
     * @see BucketNotificationConfiguration#withNotificationConfiguration(Map)
     */
    public BucketNotificationConfiguration withTopicConfigurations( TopicConfiguration... topicConfigurations ) {
        setTopicConfigurations(Arrays.asList(topicConfigurations));
        return this;
    }

    /**
     * <p>
     * Sets the {@link BucketNotificationConfiguration.TopicConfiguration}.
     * </p>
     * <p>
     * Calling this method will overwrite any
     * previously set <code>TopicConfigurations</code> for this object.
     * </p>
     *
     * @param topicConfigurations
     *            A collection of topic configurations.
     *
     * @deprecated
     * @see BucketNotificationConfiguration#setConfigurations(Map)
     */
    public void setTopicConfigurations( Collection<TopicConfiguration> topicConfigurations ) {
        this.configurations.clear();

        if (topicConfigurations != null) {
            for (TopicConfiguration topicConfiguration : topicConfigurations) {
                addConfiguration(UUID.randomUUID().toString(),
                        topicConfiguration);
            }
        }
    }

    /**
     * <p>
     * Gets the list of
     * {@link BucketNotificationConfiguration.TopicConfiguration} objects
     * contained in this object. This method may return an empty list if no
     * <code>TopicConfiguration</code> objects are present.
     * </p>
     * <p>
     * This method is deprecated and will not return all the notification
     * configuration associated with the Amazon S3 bucket. To retrieve all the
     * configuration use @see
     * BucketNotificationConfiguration#getConfigurations()
     * </p>
     *
     * @deprecated
     * @see BucketNotificationConfiguration#getConfigurations()
     * @return The list of <code>TopicConfiguration</code> objects contained in
     *         this object. May return an empty list.
     */
    public List<TopicConfiguration> getTopicConfigurations() {
        List<TopicConfiguration> topicConfigs = new ArrayList<BucketNotificationConfiguration.TopicConfiguration>();
        for (Map.Entry<String, NotificationConfiguration> entry : configurations
                .entrySet()) {
            if (entry.getValue() instanceof TopicConfiguration) {
                topicConfigs.add((TopicConfiguration) entry.getValue());
            }
        }
        return topicConfigs;
    }

    @Override
    public String toString() {
        return Jackson.toJsonString(this.getConfigurations());
    }

    /**
     * <p>
     * Represents the SNS topic to publish event notification to. Notifications
     * are published to the topic only if the specified event is triggered.
     * </p>
     *
     * @deprecated Use
     *             {@link com.amazonaws.services.s3.model.TopicConfiguration}
     *             instead
     */
    @Deprecated
    public static class TopicConfiguration extends com.amazonaws.services.s3.model.TopicConfiguration{

        /**
         * <p>
         * Creates a new {@link BucketNotificationConfiguration.TopicConfiguration}.
         * </p>
         *
         * @param topic
         *          The SNS Topic ARN (Amazon Resource Name) to publish notifications to.
         * @param event
         *           The event that must occur to trigger the notification publication.
         */
        public TopicConfiguration( final String topic, final String event ) {
            super(topic, event);
        }

        /**
         * <p>
         * Gets the topic ARN (Amazon Resource Name) for the topic to publish events to.
         * </p>
         *
         * @return The topic ARN for the topic to publish events to.
         */
        public String getTopic() {
            return getTopicARN();
        }

        /**
         * <p>
         * Gets the first event that is configured in the list of events.
         * </p>
         *
         * @deprecated use
         *             {@link com.amazonaws.services.s3.model.TopicConfiguration#getEvents()}
         *             instead.
         */
        public String getEvent() {
            Set<String> events = getEvents();
            String[] eventArray = events.toArray(new String[events.size()]);
            return eventArray[0];
        }

        @Override
        public String toString() {
            return Jackson.toJsonString(this);
        }
    }
}
