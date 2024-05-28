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
 * Information about the queue for the specified quantum task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/QuantumTaskQueueInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuantumTaskQueueInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Optional. Provides more information about the queue position. For example, if the task is complete and no longer
     * in the queue, the message field contains that information.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Current position of the task in the quantum tasks queue.
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
     * Optional. Specifies the priority of the queue. Quantum tasks in a priority queue are processed before the tasks
     * in a normal queue.
     * </p>
     */
    private String queuePriority;

    /**
     * <p>
     * Optional. Provides more information about the queue position. For example, if the task is complete and no longer
     * in the queue, the message field contains that information.
     * </p>
     * 
     * @param message
     *        Optional. Provides more information about the queue position. For example, if the task is complete and no
     *        longer in the queue, the message field contains that information.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Optional. Provides more information about the queue position. For example, if the task is complete and no longer
     * in the queue, the message field contains that information.
     * </p>
     * 
     * @return Optional. Provides more information about the queue position. For example, if the task is complete and no
     *         longer in the queue, the message field contains that information.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Optional. Provides more information about the queue position. For example, if the task is complete and no longer
     * in the queue, the message field contains that information.
     * </p>
     * 
     * @param message
     *        Optional. Provides more information about the queue position. For example, if the task is complete and no
     *        longer in the queue, the message field contains that information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuantumTaskQueueInfo withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Current position of the task in the quantum tasks queue.
     * </p>
     * 
     * @param position
     *        Current position of the task in the quantum tasks queue.
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * Current position of the task in the quantum tasks queue.
     * </p>
     * 
     * @return Current position of the task in the quantum tasks queue.
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * Current position of the task in the quantum tasks queue.
     * </p>
     * 
     * @param position
     *        Current position of the task in the quantum tasks queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuantumTaskQueueInfo withPosition(String position) {
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

    public QuantumTaskQueueInfo withQueue(String queue) {
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

    public QuantumTaskQueueInfo withQueue(QueueName queue) {
        this.queue = queue.toString();
        return this;
    }

    /**
     * <p>
     * Optional. Specifies the priority of the queue. Quantum tasks in a priority queue are processed before the tasks
     * in a normal queue.
     * </p>
     * 
     * @param queuePriority
     *        Optional. Specifies the priority of the queue. Quantum tasks in a priority queue are processed before the
     *        tasks in a normal queue.
     * @see QueuePriority
     */

    public void setQueuePriority(String queuePriority) {
        this.queuePriority = queuePriority;
    }

    /**
     * <p>
     * Optional. Specifies the priority of the queue. Quantum tasks in a priority queue are processed before the tasks
     * in a normal queue.
     * </p>
     * 
     * @return Optional. Specifies the priority of the queue. Quantum tasks in a priority queue are processed before the
     *         tasks in a normal queue.
     * @see QueuePriority
     */

    public String getQueuePriority() {
        return this.queuePriority;
    }

    /**
     * <p>
     * Optional. Specifies the priority of the queue. Quantum tasks in a priority queue are processed before the tasks
     * in a normal queue.
     * </p>
     * 
     * @param queuePriority
     *        Optional. Specifies the priority of the queue. Quantum tasks in a priority queue are processed before the
     *        tasks in a normal queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueuePriority
     */

    public QuantumTaskQueueInfo withQueuePriority(String queuePriority) {
        setQueuePriority(queuePriority);
        return this;
    }

    /**
     * <p>
     * Optional. Specifies the priority of the queue. Quantum tasks in a priority queue are processed before the tasks
     * in a normal queue.
     * </p>
     * 
     * @param queuePriority
     *        Optional. Specifies the priority of the queue. Quantum tasks in a priority queue are processed before the
     *        tasks in a normal queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueuePriority
     */

    public QuantumTaskQueueInfo withQueuePriority(QueuePriority queuePriority) {
        this.queuePriority = queuePriority.toString();
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
            sb.append("Queue: ").append(getQueue()).append(",");
        if (getQueuePriority() != null)
            sb.append("QueuePriority: ").append(getQueuePriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuantumTaskQueueInfo == false)
            return false;
        QuantumTaskQueueInfo other = (QuantumTaskQueueInfo) obj;
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
        if (other.getQueuePriority() == null ^ this.getQueuePriority() == null)
            return false;
        if (other.getQueuePriority() != null && other.getQueuePriority().equals(this.getQueuePriority()) == false)
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
        hashCode = prime * hashCode + ((getQueuePriority() == null) ? 0 : getQueuePriority().hashCode());
        return hashCode;
    }

    @Override
    public QuantumTaskQueueInfo clone() {
        try {
            return (QuantumTaskQueueInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.braket.model.transform.QuantumTaskQueueInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
