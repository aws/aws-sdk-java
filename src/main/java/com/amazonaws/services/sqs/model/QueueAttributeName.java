/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs.model;

/**
 * Queue Attribute Name
 */
public enum QueueAttributeName {
    
    Policy("Policy"),
    VisibilityTimeout("VisibilityTimeout"),
    MaximumMessageSize("MaximumMessageSize"),
    MessageRetentionPeriod("MessageRetentionPeriod"),
    ApproximateNumberOfMessages("ApproximateNumberOfMessages"),
    ApproximateNumberOfMessagesNotVisible("ApproximateNumberOfMessagesNotVisible"),
    CreatedTimestamp("CreatedTimestamp"),
    LastModifiedTimestamp("LastModifiedTimestamp"),
    QueueArn("QueueArn"),
    ApproximateNumberOfMessagesDelayed("ApproximateNumberOfMessagesDelayed"),
    DelaySeconds("DelaySeconds"),
    ReceiveMessageWaitTimeSeconds("ReceiveMessageWaitTimeSeconds");

    private String value;

    private QueueAttributeName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return QueueAttributeName corresponding to the value
     */
    public static QueueAttributeName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("Policy".equals(value)) {
            return QueueAttributeName.Policy;
        } else if ("VisibilityTimeout".equals(value)) {
            return QueueAttributeName.VisibilityTimeout;
        } else if ("MaximumMessageSize".equals(value)) {
            return QueueAttributeName.MaximumMessageSize;
        } else if ("MessageRetentionPeriod".equals(value)) {
            return QueueAttributeName.MessageRetentionPeriod;
        } else if ("ApproximateNumberOfMessages".equals(value)) {
            return QueueAttributeName.ApproximateNumberOfMessages;
        } else if ("ApproximateNumberOfMessagesNotVisible".equals(value)) {
            return QueueAttributeName.ApproximateNumberOfMessagesNotVisible;
        } else if ("CreatedTimestamp".equals(value)) {
            return QueueAttributeName.CreatedTimestamp;
        } else if ("LastModifiedTimestamp".equals(value)) {
            return QueueAttributeName.LastModifiedTimestamp;
        } else if ("QueueArn".equals(value)) {
            return QueueAttributeName.QueueArn;
        } else if ("ApproximateNumberOfMessagesDelayed".equals(value)) {
            return QueueAttributeName.ApproximateNumberOfMessagesDelayed;
        } else if ("DelaySeconds".equals(value)) {
            return QueueAttributeName.DelaySeconds;
        } else if ("ReceiveMessageWaitTimeSeconds".equals(value)) {
            return QueueAttributeName.ReceiveMessageWaitTimeSeconds;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    