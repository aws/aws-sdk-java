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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the channel and queue identifier for a routing profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RoutingProfileQueueReference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoutingProfileQueueReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * </p>
     */
    private String channel;

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     * 
     * @param queueId
     *        The identifier for the queue.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     * 
     * @return The identifier for the queue.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     * 
     * @param queueId
     *        The identifier for the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingProfileQueueReference withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * </p>
     * 
     * @param channel
     *        The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * @see Channel
     */

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * </p>
     * 
     * @return The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * @see Channel
     */

    public String getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * </p>
     * 
     * @param channel
     *        The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public RoutingProfileQueueReference withChannel(String channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * </p>
     * 
     * @param channel
     *        The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public RoutingProfileQueueReference withChannel(Channel channel) {
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
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
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

        if (obj instanceof RoutingProfileQueueReference == false)
            return false;
        RoutingProfileQueueReference other = (RoutingProfileQueueReference) obj;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
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

        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        return hashCode;
    }

    @Override
    public RoutingProfileQueueReference clone() {
        try {
            return (RoutingProfileQueueReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RoutingProfileQueueReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
