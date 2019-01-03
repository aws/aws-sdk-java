/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a notification topic and its status. Notification topics are used for publishing ElastiCache events to
 * subscribers using Amazon Simple Notification Service (SNS).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/NotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the topic.
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * The current state of the topic.
     * </p>
     */
    private String topicStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the topic.
     * </p>
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) that identifies the topic.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the topic.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the topic.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the topic.
     * </p>
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) that identifies the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationConfiguration withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * The current state of the topic.
     * </p>
     * 
     * @param topicStatus
     *        The current state of the topic.
     */

    public void setTopicStatus(String topicStatus) {
        this.topicStatus = topicStatus;
    }

    /**
     * <p>
     * The current state of the topic.
     * </p>
     * 
     * @return The current state of the topic.
     */

    public String getTopicStatus() {
        return this.topicStatus;
    }

    /**
     * <p>
     * The current state of the topic.
     * </p>
     * 
     * @param topicStatus
     *        The current state of the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationConfiguration withTopicStatus(String topicStatus) {
        setTopicStatus(topicStatus);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
        if (getTopicStatus() != null)
            sb.append("TopicStatus: ").append(getTopicStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationConfiguration == false)
            return false;
        NotificationConfiguration other = (NotificationConfiguration) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getTopicStatus() == null ^ this.getTopicStatus() == null)
            return false;
        if (other.getTopicStatus() != null && other.getTopicStatus().equals(this.getTopicStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getTopicStatus() == null) ? 0 : getTopicStatus().hashCode());
        return hashCode;
    }

    @Override
    public NotificationConfiguration clone() {
        try {
            return (NotificationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
