/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;

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
public class BucketNotificationConfiguration {

    private List<TopicConfiguration> topicConfigurations = null;

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
        this.topicConfigurations = new ArrayList<TopicConfiguration>( 1 );
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
     * 
     * @see BucketNotificationConfiguration#BucketNotificationConfiguration()
     */
    public BucketNotificationConfiguration( Collection<TopicConfiguration> topicConfigurations ) {
        this.topicConfigurations = new ArrayList<TopicConfiguration>( 1 );
        this.topicConfigurations.addAll( topicConfigurations );
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
     * @see BucketNotificationConfiguration#setTopicConfigurations(Collection)
     */
    public BucketNotificationConfiguration withTopicConfigurations( TopicConfiguration... topicConfigurations ) {
        this.topicConfigurations.clear();
        
        for ( int index = 0; index < topicConfigurations.length; index++ ) {
            this.topicConfigurations.add( topicConfigurations[ index ] );
        }
        
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
     * @see BucketNotificationConfiguration#withTopicConfigurations(TopicConfiguration)         
     */
    public void setTopicConfigurations( Collection<TopicConfiguration> topicConfigurations ) {
        this.topicConfigurations.clear();
        this.topicConfigurations.addAll( topicConfigurations );
    }

    /**
     * <p>
     * Gets the list of {@link BucketNotificationConfiguration.TopicConfiguration} objects
     * contained in this object. This method may return an empty list if no <code>TopicConfiguration</code>
     * objects are present.
     * </p>
     * 
     * @return The list of <code>TopicConfiguration</code> objects contained in this object.
     *   May return an empty list.
     */
    public List<TopicConfiguration> getTopicConfigurations() {
        return this.topicConfigurations;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("TopicConfigurations: " + this.getTopicConfigurations() );
        sb.append("}");
        return sb.toString();
    }
    
    /**
     * <p>
     * Represents the SNS topic to publish event notification to.  
     * Notifications are published to the topic
     * only if the specified event is triggered.
     * </p>
     */
    public static class TopicConfiguration {
        private final String topic;
        private final String event;
        
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
            this.topic = topic;
            this.event = event;
        }
    
        /**
         * <p>
         * Gets the topic ARN (Amazon Resource Name) for the topic to publish events to.
         * </p>
         * 
         * @return The topic ARN for the topic to publish events to.
         */
        public String getTopic() {
            return this.topic;
        }
        
        /**
         * <p>
         * Gets the event that must occur for the notification to be published.
         * </p>
         * 
         * @return The event that must occur for the notification to be published.
         */
        public String getEvent() {
            return this.event;
        }
        
        public String toString() {
            StringBuffer sb = new StringBuffer();
            sb.append("{");
            sb.append("Topic: " + this.getTopic() + ", ");
            sb.append("Event: " + this.getEvent() + ", ");
            sb.append("}");
            return sb.toString();
        }
    }
}
