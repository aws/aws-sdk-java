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
 * Represents bucket notification configuration used to control receiving 
 * notifications for specific events for Amazon S3 buckets.
 * <p>
 * The notification configuration of a bucket provides near realtime notifications 
 * of events the user is interested in, using SNS as the delivery service. 
 * Notification is turned on by enabling configuration on a bucket, specifying 
 * the events and the SNS topic. This configuration can only be turned 
 * on by the bucket owner. If a notification configuration already exists for the
 * specified bucket, the new notification configuration will replace the existing 
 * notification configuration.  To remove the notification configuration pass in 
 * an empty request.  Currently, buckets may only have a single event and topic 
 * configuration.
 * <p>
 *
 * @see AmazonS3#getBucketNotificationConfiguration(String)
 * @see AmazonS3#setBucketNotificationConfiguration(String,BucketNotificationConfiguration)
 */
public class BucketNotificationConfiguration {

    private List<TopicConfiguration> topicConfigurations = null;

    /**
     * Creates a new bucket notification configuration, which by default is <b>empty</b>.
     * <p>
     * Passing this new object directly to
     * {@link AmazonS3#setBucketNotificationConfiguration(String,BucketNotificationConfiguration)}
     * will do remove any existing bucket notification configuration.
     */
    public BucketNotificationConfiguration() {
        this.topicConfigurations = new ArrayList<TopicConfiguration>( 1 );
    }
    
    /**
     * Creates a new bucket notification configuration with the specified TopicConfigurations.
     * <p>
     * Passing this new object directly to
     * {@link AmazonS3#setBucketNotificationConfiguration(String,BucketNotificationConfiguration)}
     * will set the bucket's notification configuration.
     */
    public BucketNotificationConfiguration( Collection<TopicConfiguration> topicConfigurations ) {
        this.topicConfigurations = new ArrayList<TopicConfiguration>( 1 );
        this.topicConfigurations.addAll( topicConfigurations );
    }

    /**
     * Sets the TopicConfigurations for this object, and returns this object so that 
     * additional method calls may be chained together.
     * <p>
     * This method will clear out any previously set TopicConfigurations set for this object.
     * 
     * @param topicConfigurations
     *            A set of topic configurations.
     * 
     * @return The updated BucketNotificationConfiguration object so that
     *         additional method calls may be chained together.
     */
    public BucketNotificationConfiguration withTopicConfigurations( TopicConfiguration... topicConfigurations ) {
        this.topicConfigurations.clear();
        
        for ( int index = 0; index < topicConfigurations.length; index++ ) {
            this.topicConfigurations.add( topicConfigurations[ index ] );
        }
        
        return this;
    }

    /**
     * Sets the TopicConfigurations for this object.
     * <p>
     * This method will clear out any previously set TopicConfigurations set for this object.
     * 
     * @param topicConfigurations
     *            A collection of topic configurations.
     */
    public void setTopicConfigurations( Collection<TopicConfiguration> topicConfigurations ) {
        this.topicConfigurations.clear();
        this.topicConfigurations.addAll( topicConfigurations );
    }

    /**
     * @return Returns a List of TopicConfigurations present in this object.  May return an empty list.
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
     * Represents the SNS Topic to publish event notification to.  Will publish notifications to the topic
     * only if the specified event is triggered.
     */
    public static class TopicConfiguration {
        private final String topic;
        private final String event;
        
        /**
         * @param topic
         *          The SNS Topic ARN to publish notifications to.
         * @param event
         *           The event that if it happens triggers the notification publication.
         */
        public TopicConfiguration( final String topic, final String event ) {
            this.topic = topic;
            this.event = event;
        }
    
        /**
         * @return The topic ARN for the topic to publish events to.
         */
        public String getTopic() {
            return this.topic;
        }
        
        /**
         * @return The event that must occur for the notification top be published.
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
