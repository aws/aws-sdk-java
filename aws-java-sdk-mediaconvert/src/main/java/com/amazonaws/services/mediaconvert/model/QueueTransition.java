/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Description of the source and destination queues between which the job has moved, along with the timestamp of the
 * move
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/QueueTransition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueueTransition implements Serializable, Cloneable, StructuredPojo {

    /** The queue that the job was on after the transition. */
    private String destinationQueue;
    /** The queue that the job was on before the transition. */
    private String sourceQueue;
    /** The time, in Unix epoch format, that the job moved from the source queue to the destination queue. */
    private java.util.Date timestamp;

    /**
     * The queue that the job was on after the transition.
     * 
     * @param destinationQueue
     *        The queue that the job was on after the transition.
     */

    public void setDestinationQueue(String destinationQueue) {
        this.destinationQueue = destinationQueue;
    }

    /**
     * The queue that the job was on after the transition.
     * 
     * @return The queue that the job was on after the transition.
     */

    public String getDestinationQueue() {
        return this.destinationQueue;
    }

    /**
     * The queue that the job was on after the transition.
     * 
     * @param destinationQueue
     *        The queue that the job was on after the transition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueTransition withDestinationQueue(String destinationQueue) {
        setDestinationQueue(destinationQueue);
        return this;
    }

    /**
     * The queue that the job was on before the transition.
     * 
     * @param sourceQueue
     *        The queue that the job was on before the transition.
     */

    public void setSourceQueue(String sourceQueue) {
        this.sourceQueue = sourceQueue;
    }

    /**
     * The queue that the job was on before the transition.
     * 
     * @return The queue that the job was on before the transition.
     */

    public String getSourceQueue() {
        return this.sourceQueue;
    }

    /**
     * The queue that the job was on before the transition.
     * 
     * @param sourceQueue
     *        The queue that the job was on before the transition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueTransition withSourceQueue(String sourceQueue) {
        setSourceQueue(sourceQueue);
        return this;
    }

    /**
     * The time, in Unix epoch format, that the job moved from the source queue to the destination queue.
     * 
     * @param timestamp
     *        The time, in Unix epoch format, that the job moved from the source queue to the destination queue.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * The time, in Unix epoch format, that the job moved from the source queue to the destination queue.
     * 
     * @return The time, in Unix epoch format, that the job moved from the source queue to the destination queue.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * The time, in Unix epoch format, that the job moved from the source queue to the destination queue.
     * 
     * @param timestamp
     *        The time, in Unix epoch format, that the job moved from the source queue to the destination queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueTransition withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getDestinationQueue() != null)
            sb.append("DestinationQueue: ").append(getDestinationQueue()).append(",");
        if (getSourceQueue() != null)
            sb.append("SourceQueue: ").append(getSourceQueue()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueueTransition == false)
            return false;
        QueueTransition other = (QueueTransition) obj;
        if (other.getDestinationQueue() == null ^ this.getDestinationQueue() == null)
            return false;
        if (other.getDestinationQueue() != null && other.getDestinationQueue().equals(this.getDestinationQueue()) == false)
            return false;
        if (other.getSourceQueue() == null ^ this.getSourceQueue() == null)
            return false;
        if (other.getSourceQueue() != null && other.getSourceQueue().equals(this.getSourceQueue()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationQueue() == null) ? 0 : getDestinationQueue().hashCode());
        hashCode = prime * hashCode + ((getSourceQueue() == null) ? 0 : getSourceQueue().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public QueueTransition clone() {
        try {
            return (QueueTransition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.QueueTransitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
