/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the dimensions for a set of metrics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Dimensions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Dimensions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the queue for which metrics are returned.
     * </p>
     */
    private QueueReference queue;
    /**
     * <p>
     * The channel used for grouping and filters.
     * </p>
     */
    private String channel;

    /**
     * <p>
     * Information about the queue for which metrics are returned.
     * </p>
     * 
     * @param queue
     *        Information about the queue for which metrics are returned.
     */

    public void setQueue(QueueReference queue) {
        this.queue = queue;
    }

    /**
     * <p>
     * Information about the queue for which metrics are returned.
     * </p>
     * 
     * @return Information about the queue for which metrics are returned.
     */

    public QueueReference getQueue() {
        return this.queue;
    }

    /**
     * <p>
     * Information about the queue for which metrics are returned.
     * </p>
     * 
     * @param queue
     *        Information about the queue for which metrics are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dimensions withQueue(QueueReference queue) {
        setQueue(queue);
        return this;
    }

    /**
     * <p>
     * The channel used for grouping and filters.
     * </p>
     * 
     * @param channel
     *        The channel used for grouping and filters.
     * @see Channel
     */

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The channel used for grouping and filters.
     * </p>
     * 
     * @return The channel used for grouping and filters.
     * @see Channel
     */

    public String getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * The channel used for grouping and filters.
     * </p>
     * 
     * @param channel
     *        The channel used for grouping and filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public Dimensions withChannel(String channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * The channel used for grouping and filters.
     * </p>
     * 
     * @param channel
     *        The channel used for grouping and filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public Dimensions withChannel(Channel channel) {
        this.channel = channel.toString();
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
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Dimensions == false)
            return false;
        Dimensions other = (Dimensions) obj;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        return hashCode;
    }

    @Override
    public Dimensions clone() {
        try {
            return (Dimensions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.DimensionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
