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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the queue for a specified job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/HybridJobQueueInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HybridJobQueueInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Optional. Provides more information about the queue position. For example, if the job is complete and no longer
     * in the queue, the message field contains that information.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Current position of the job in the jobs queue.
     * </p>
     */
    private String position;
    /**
     * <p>
     * The name of the queue.
     * </p>
     */
    private String queue;

    /**
     * <p>
     * Optional. Provides more information about the queue position. For example, if the job is complete and no longer
     * in the queue, the message field contains that information.
     * </p>
     * 
     * @param message
     *        Optional. Provides more information about the queue position. For example, if the job is complete and no
     *        longer in the queue, the message field contains that information.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Optional. Provides more information about the queue position. For example, if the job is complete and no longer
     * in the queue, the message field contains that information.
     * </p>
     * 
     * @return Optional. Provides more information about the queue position. For example, if the job is complete and no
     *         longer in the queue, the message field contains that information.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Optional. Provides more information about the queue position. For example, if the job is complete and no longer
     * in the queue, the message field contains that information.
     * </p>
     * 
     * @param message
     *        Optional. Provides more information about the queue position. For example, if the job is complete and no
     *        longer in the queue, the message field contains that information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HybridJobQueueInfo withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Current position of the job in the jobs queue.
     * </p>
     * 
     * @param position
     *        Current position of the job in the jobs queue.
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * Current position of the job in the jobs queue.
     * </p>
     * 
     * @return Current position of the job in the jobs queue.
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * Current position of the job in the jobs queue.
     * </p>
     * 
     * @param position
     *        Current position of the job in the jobs queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HybridJobQueueInfo withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * 
     * @param queue
     *        The name of the queue.
     * @see QueueName
     */

    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * 
     * @return The name of the queue.
     * @see QueueName
     */

    public String getQueue() {
        return this.queue;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * 
     * @param queue
     *        The name of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueName
     */

    public HybridJobQueueInfo withQueue(String queue) {
        setQueue(queue);
        return this;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * 
     * @param queue
     *        The name of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueName
     */

    public HybridJobQueueInfo withQueue(QueueName queue) {
        this.queue = queue.toString();
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getQueue() != null)
            sb.append("Queue: ").append(getQueue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HybridJobQueueInfo == false)
            return false;
        HybridJobQueueInfo other = (HybridJobQueueInfo) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        return hashCode;
    }

    @Override
    public HybridJobQueueInfo clone() {
        try {
            return (HybridJobQueueInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.braket.model.transform.HybridJobQueueInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
