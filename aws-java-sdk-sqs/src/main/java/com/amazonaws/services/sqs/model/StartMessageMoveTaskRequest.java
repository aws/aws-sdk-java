/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/StartMessageMoveTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMessageMoveTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the queue that contains the messages to be moved to another queue. Currently, only ARNs of dead-letter
     * queues (DLQs) whose sources are other Amazon SQS queues are accepted. DLQs whose sources are non-SQS queues, such
     * as Lambda or Amazon SNS topics, are not currently supported.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The ARN of the queue that receives the moved messages. You can use this field to specify the destination queue
     * where you would like to redrive messages. If this field is left blank, the messages will be redriven back to
     * their respective original source queues.
     * </p>
     */
    private String destinationArn;
    /**
     * <p>
     * The number of messages to be moved per second (the message movement rate). You can use this field to define a
     * fixed message movement rate. The maximum value for messages per second is 500. If this field is left blank, the
     * system will optimize the rate based on the queue message backlog size, which may vary throughout the duration of
     * the message movement task.
     * </p>
     */
    private Integer maxNumberOfMessagesPerSecond;

    /**
     * <p>
     * The ARN of the queue that contains the messages to be moved to another queue. Currently, only ARNs of dead-letter
     * queues (DLQs) whose sources are other Amazon SQS queues are accepted. DLQs whose sources are non-SQS queues, such
     * as Lambda or Amazon SNS topics, are not currently supported.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of the queue that contains the messages to be moved to another queue. Currently, only ARNs of
     *        dead-letter queues (DLQs) whose sources are other Amazon SQS queues are accepted. DLQs whose sources are
     *        non-SQS queues, such as Lambda or Amazon SNS topics, are not currently supported.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The ARN of the queue that contains the messages to be moved to another queue. Currently, only ARNs of dead-letter
     * queues (DLQs) whose sources are other Amazon SQS queues are accepted. DLQs whose sources are non-SQS queues, such
     * as Lambda or Amazon SNS topics, are not currently supported.
     * </p>
     * 
     * @return The ARN of the queue that contains the messages to be moved to another queue. Currently, only ARNs of
     *         dead-letter queues (DLQs) whose sources are other Amazon SQS queues are accepted. DLQs whose sources are
     *         non-SQS queues, such as Lambda or Amazon SNS topics, are not currently supported.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The ARN of the queue that contains the messages to be moved to another queue. Currently, only ARNs of dead-letter
     * queues (DLQs) whose sources are other Amazon SQS queues are accepted. DLQs whose sources are non-SQS queues, such
     * as Lambda or Amazon SNS topics, are not currently supported.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of the queue that contains the messages to be moved to another queue. Currently, only ARNs of
     *        dead-letter queues (DLQs) whose sources are other Amazon SQS queues are accepted. DLQs whose sources are
     *        non-SQS queues, such as Lambda or Amazon SNS topics, are not currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMessageMoveTaskRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the queue that receives the moved messages. You can use this field to specify the destination queue
     * where you would like to redrive messages. If this field is left blank, the messages will be redriven back to
     * their respective original source queues.
     * </p>
     * 
     * @param destinationArn
     *        The ARN of the queue that receives the moved messages. You can use this field to specify the destination
     *        queue where you would like to redrive messages. If this field is left blank, the messages will be redriven
     *        back to their respective original source queues.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The ARN of the queue that receives the moved messages. You can use this field to specify the destination queue
     * where you would like to redrive messages. If this field is left blank, the messages will be redriven back to
     * their respective original source queues.
     * </p>
     * 
     * @return The ARN of the queue that receives the moved messages. You can use this field to specify the destination
     *         queue where you would like to redrive messages. If this field is left blank, the messages will be
     *         redriven back to their respective original source queues.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * The ARN of the queue that receives the moved messages. You can use this field to specify the destination queue
     * where you would like to redrive messages. If this field is left blank, the messages will be redriven back to
     * their respective original source queues.
     * </p>
     * 
     * @param destinationArn
     *        The ARN of the queue that receives the moved messages. You can use this field to specify the destination
     *        queue where you would like to redrive messages. If this field is left blank, the messages will be redriven
     *        back to their respective original source queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMessageMoveTaskRequest withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * The number of messages to be moved per second (the message movement rate). You can use this field to define a
     * fixed message movement rate. The maximum value for messages per second is 500. If this field is left blank, the
     * system will optimize the rate based on the queue message backlog size, which may vary throughout the duration of
     * the message movement task.
     * </p>
     * 
     * @param maxNumberOfMessagesPerSecond
     *        The number of messages to be moved per second (the message movement rate). You can use this field to
     *        define a fixed message movement rate. The maximum value for messages per second is 500. If this field is
     *        left blank, the system will optimize the rate based on the queue message backlog size, which may vary
     *        throughout the duration of the message movement task.
     */

    public void setMaxNumberOfMessagesPerSecond(Integer maxNumberOfMessagesPerSecond) {
        this.maxNumberOfMessagesPerSecond = maxNumberOfMessagesPerSecond;
    }

    /**
     * <p>
     * The number of messages to be moved per second (the message movement rate). You can use this field to define a
     * fixed message movement rate. The maximum value for messages per second is 500. If this field is left blank, the
     * system will optimize the rate based on the queue message backlog size, which may vary throughout the duration of
     * the message movement task.
     * </p>
     * 
     * @return The number of messages to be moved per second (the message movement rate). You can use this field to
     *         define a fixed message movement rate. The maximum value for messages per second is 500. If this field is
     *         left blank, the system will optimize the rate based on the queue message backlog size, which may vary
     *         throughout the duration of the message movement task.
     */

    public Integer getMaxNumberOfMessagesPerSecond() {
        return this.maxNumberOfMessagesPerSecond;
    }

    /**
     * <p>
     * The number of messages to be moved per second (the message movement rate). You can use this field to define a
     * fixed message movement rate. The maximum value for messages per second is 500. If this field is left blank, the
     * system will optimize the rate based on the queue message backlog size, which may vary throughout the duration of
     * the message movement task.
     * </p>
     * 
     * @param maxNumberOfMessagesPerSecond
     *        The number of messages to be moved per second (the message movement rate). You can use this field to
     *        define a fixed message movement rate. The maximum value for messages per second is 500. If this field is
     *        left blank, the system will optimize the rate based on the queue message backlog size, which may vary
     *        throughout the duration of the message movement task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMessageMoveTaskRequest withMaxNumberOfMessagesPerSecond(Integer maxNumberOfMessagesPerSecond) {
        setMaxNumberOfMessagesPerSecond(maxNumberOfMessagesPerSecond);
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
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getMaxNumberOfMessagesPerSecond() != null)
            sb.append("MaxNumberOfMessagesPerSecond: ").append(getMaxNumberOfMessagesPerSecond());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMessageMoveTaskRequest == false)
            return false;
        StartMessageMoveTaskRequest other = (StartMessageMoveTaskRequest) obj;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getMaxNumberOfMessagesPerSecond() == null ^ this.getMaxNumberOfMessagesPerSecond() == null)
            return false;
        if (other.getMaxNumberOfMessagesPerSecond() != null && other.getMaxNumberOfMessagesPerSecond().equals(this.getMaxNumberOfMessagesPerSecond()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getMaxNumberOfMessagesPerSecond() == null) ? 0 : getMaxNumberOfMessagesPerSecond().hashCode());
        return hashCode;
    }

    @Override
    public StartMessageMoveTaskRequest clone() {
        return (StartMessageMoveTaskRequest) super.clone();
    }

}
