/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.EnumSet;

/**
 * Represents the topic configuration for an Amazon S3 bucket.
 */
public class TopicConfiguration extends NotificationConfiguration implements Serializable {

    /**
     * The Amazon SNS topic ARN for this configuration.
     */
    private String topicARN;

    public TopicConfiguration() {
        super();
    }

    /**
     * Creates a new topic configuration with the given topic arn and set of events.
     * 
     * @param topicARN
     *            the Amazon SNS topic arn to which the notifications are to be sent.
     * @param events
     *            the events for which the notifications are to be sent
     */
    public TopicConfiguration(String topicARN, EnumSet<S3Event> events) {
        super(events);
        this.topicARN = topicARN;
    }

    /**
     * Creates a new topic configuration with the given topic arn and set of events.
     * 
     * @param topicARN
     *            the Amazon SNS topic arn to which the notifications are to be sent.
     * @param events
     *            the events for which the notifications are to be sent
     */
    public TopicConfiguration(String topicARN, String... events) {
        super(events);
        this.topicARN = topicARN;
    }

    /**
     * Returns the topic arn for this notification configuration.
     */
    public String getTopicARN() {
        return topicARN;
    }

    /**
     * Sets the topic ARN for this configuration
     * 
     * @param topicARN
     *            ARN for the SNS topic
     */
    public void setTopicARN(String topicARN) {
        this.topicARN = topicARN;
    }

    /**
     * Fluent method to set the topic ARN for this configuration
     * 
     * @param topicARN
     *            ARN for the SNS topic
     * @return This object for method chaining
     */
    public TopicConfiguration withTopicARN(String topicARN) {
        setTopicARN(topicARN);
        return this;
    }
}
