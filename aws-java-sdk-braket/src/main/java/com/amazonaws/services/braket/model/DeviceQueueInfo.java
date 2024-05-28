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
 * Information about tasks and jobs queued on a device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/DeviceQueueInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceQueueInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the queue.
     * </p>
     */
    private String queue;
    /**
     * <p>
     * Optional. Specifies the priority of the queue. Tasks in a priority queue are processed before the tasks in a
     * normal queue.
     * </p>
     */
    private String queuePriority;
    /**
     * <p>
     * The number of jobs or tasks in the queue for a given device.
     * </p>
     */
    private String queueSize;

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

    public DeviceQueueInfo withQueue(String queue) {
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

    public DeviceQueueInfo withQueue(QueueName queue) {
        this.queue = queue.toString();
        return this;
    }

    /**
     * <p>
     * Optional. Specifies the priority of the queue. Tasks in a priority queue are processed before the tasks in a
     * normal queue.
     * </p>
     * 
     * @param queuePriority
     *        Optional. Specifies the priority of the queue. Tasks in a priority queue are processed before the tasks in
     *        a normal queue.
     * @see QueuePriority
     */

    public void setQueuePriority(String queuePriority) {
        this.queuePriority = queuePriority;
    }

    /**
     * <p>
     * Optional. Specifies the priority of the queue. Tasks in a priority queue are processed before the tasks in a
     * normal queue.
     * </p>
     * 
     * @return Optional. Specifies the priority of the queue. Tasks in a priority queue are processed before the tasks
     *         in a normal queue.
     * @see QueuePriority
     */

    public String getQueuePriority() {
        return this.queuePriority;
    }

    /**
     * <p>
     * Optional. Specifies the priority of the queue. Tasks in a priority queue are processed before the tasks in a
     * normal queue.
     * </p>
     * 
     * @param queuePriority
     *        Optional. Specifies the priority of the queue. Tasks in a priority queue are processed before the tasks in
     *        a normal queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueuePriority
     */

    public DeviceQueueInfo withQueuePriority(String queuePriority) {
        setQueuePriority(queuePriority);
        return this;
    }

    /**
     * <p>
     * Optional. Specifies the priority of the queue. Tasks in a priority queue are processed before the tasks in a
     * normal queue.
     * </p>
     * 
     * @param queuePriority
     *        Optional. Specifies the priority of the queue. Tasks in a priority queue are processed before the tasks in
     *        a normal queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueuePriority
     */

    public DeviceQueueInfo withQueuePriority(QueuePriority queuePriority) {
        this.queuePriority = queuePriority.toString();
        return this;
    }

    /**
     * <p>
     * The number of jobs or tasks in the queue for a given device.
     * </p>
     * 
     * @param queueSize
     *        The number of jobs or tasks in the queue for a given device.
     */

    public void setQueueSize(String queueSize) {
        this.queueSize = queueSize;
    }

    /**
     * <p>
     * The number of jobs or tasks in the queue for a given device.
     * </p>
     * 
     * @return The number of jobs or tasks in the queue for a given device.
     */

    public String getQueueSize() {
        return this.queueSize;
    }

    /**
     * <p>
     * The number of jobs or tasks in the queue for a given device.
     * </p>
     * 
     * @param queueSize
     *        The number of jobs or tasks in the queue for a given device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceQueueInfo withQueueSize(String queueSize) {
        setQueueSize(queueSize);
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
        if (getQueue() != null)
            sb.append("Queue: ").append(getQueue()).append(",");
        if (getQueuePriority() != null)
            sb.append("QueuePriority: ").append(getQueuePriority()).append(",");
        if (getQueueSize() != null)
            sb.append("QueueSize: ").append(getQueueSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceQueueInfo == false)
            return false;
        DeviceQueueInfo other = (DeviceQueueInfo) obj;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        if (other.getQueuePriority() == null ^ this.getQueuePriority() == null)
            return false;
        if (other.getQueuePriority() != null && other.getQueuePriority().equals(this.getQueuePriority()) == false)
            return false;
        if (other.getQueueSize() == null ^ this.getQueueSize() == null)
            return false;
        if (other.getQueueSize() != null && other.getQueueSize().equals(this.getQueueSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode + ((getQueuePriority() == null) ? 0 : getQueuePriority().hashCode());
        hashCode = prime * hashCode + ((getQueueSize() == null) ? 0 : getQueueSize().hashCode());
        return hashCode;
    }

    @Override
    public DeviceQueueInfo clone() {
        try {
            return (DeviceQueueInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.braket.model.transform.DeviceQueueInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
