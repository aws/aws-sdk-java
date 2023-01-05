/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details for an S3 bucket notification configuration.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketNotificationConfigurationDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketNotificationConfigurationDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of events that trigger a notification.
     * </p>
     */
    private java.util.List<String> events;
    /**
     * <p>
     * The filters that determine which S3 buckets generate notifications.
     * </p>
     */
    private AwsS3BucketNotificationConfigurationFilter filter;
    /**
     * <p>
     * The ARN of the Lambda function, Amazon SQS queue, or Amazon SNS topic that generates the notification.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * Indicates the type of notification. Notifications can be generated using Lambda functions, Amazon SQS queues, or
     * Amazon SNS topics, with corresponding valid values as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LambdaConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TopicConfiguration</code>
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * The list of events that trigger a notification.
     * </p>
     * 
     * @return The list of events that trigger a notification.
     */

    public java.util.List<String> getEvents() {
        return events;
    }

    /**
     * <p>
     * The list of events that trigger a notification.
     * </p>
     * 
     * @param events
     *        The list of events that trigger a notification.
     */

    public void setEvents(java.util.Collection<String> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<String>(events);
    }

    /**
     * <p>
     * The list of events that trigger a notification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        The list of events that trigger a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketNotificationConfigurationDetail withEvents(String... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<String>(events.length));
        }
        for (String ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of events that trigger a notification.
     * </p>
     * 
     * @param events
     *        The list of events that trigger a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketNotificationConfigurationDetail withEvents(java.util.Collection<String> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The filters that determine which S3 buckets generate notifications.
     * </p>
     * 
     * @param filter
     *        The filters that determine which S3 buckets generate notifications.
     */

    public void setFilter(AwsS3BucketNotificationConfigurationFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filters that determine which S3 buckets generate notifications.
     * </p>
     * 
     * @return The filters that determine which S3 buckets generate notifications.
     */

    public AwsS3BucketNotificationConfigurationFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The filters that determine which S3 buckets generate notifications.
     * </p>
     * 
     * @param filter
     *        The filters that determine which S3 buckets generate notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketNotificationConfigurationDetail withFilter(AwsS3BucketNotificationConfigurationFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The ARN of the Lambda function, Amazon SQS queue, or Amazon SNS topic that generates the notification.
     * </p>
     * 
     * @param destination
     *        The ARN of the Lambda function, Amazon SQS queue, or Amazon SNS topic that generates the notification.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The ARN of the Lambda function, Amazon SQS queue, or Amazon SNS topic that generates the notification.
     * </p>
     * 
     * @return The ARN of the Lambda function, Amazon SQS queue, or Amazon SNS topic that generates the notification.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The ARN of the Lambda function, Amazon SQS queue, or Amazon SNS topic that generates the notification.
     * </p>
     * 
     * @param destination
     *        The ARN of the Lambda function, Amazon SQS queue, or Amazon SNS topic that generates the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketNotificationConfigurationDetail withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * Indicates the type of notification. Notifications can be generated using Lambda functions, Amazon SQS queues, or
     * Amazon SNS topics, with corresponding valid values as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LambdaConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TopicConfiguration</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Indicates the type of notification. Notifications can be generated using Lambda functions, Amazon SQS
     *        queues, or Amazon SNS topics, with corresponding valid values as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LambdaConfiguration</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QueueConfiguration</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TopicConfiguration</code>
     *        </p>
     *        </li>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates the type of notification. Notifications can be generated using Lambda functions, Amazon SQS queues, or
     * Amazon SNS topics, with corresponding valid values as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LambdaConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TopicConfiguration</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the type of notification. Notifications can be generated using Lambda functions, Amazon SQS
     *         queues, or Amazon SNS topics, with corresponding valid values as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LambdaConfiguration</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QueueConfiguration</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TopicConfiguration</code>
     *         </p>
     *         </li>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Indicates the type of notification. Notifications can be generated using Lambda functions, Amazon SQS queues, or
     * Amazon SNS topics, with corresponding valid values as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LambdaConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TopicConfiguration</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Indicates the type of notification. Notifications can be generated using Lambda functions, Amazon SQS
     *        queues, or Amazon SNS topics, with corresponding valid values as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LambdaConfiguration</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QueueConfiguration</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TopicConfiguration</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketNotificationConfigurationDetail withType(String type) {
        setType(type);
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
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketNotificationConfigurationDetail == false)
            return false;
        AwsS3BucketNotificationConfigurationDetail other = (AwsS3BucketNotificationConfigurationDetail) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketNotificationConfigurationDetail clone() {
        try {
            return (AwsS3BucketNotificationConfigurationDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketNotificationConfigurationDetailMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
