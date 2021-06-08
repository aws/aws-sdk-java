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
 * Contains information about the queue and channel for which priority and delay can be set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RoutingProfileQueueConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoutingProfileQueueConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about a queue resource.
     * </p>
     */
    private RoutingProfileQueueReference queueReference;
    /**
     * <p>
     * The order in which contacts are to be handled for the queue. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html">Queues:
     * priority and delay</a>.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The delay, in seconds, a contact should be in the queue before they are routed to an available agent. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html">Queues:
     * priority and delay</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     */
    private Integer delay;

    /**
     * <p>
     * Contains information about a queue resource.
     * </p>
     * 
     * @param queueReference
     *        Contains information about a queue resource.
     */

    public void setQueueReference(RoutingProfileQueueReference queueReference) {
        this.queueReference = queueReference;
    }

    /**
     * <p>
     * Contains information about a queue resource.
     * </p>
     * 
     * @return Contains information about a queue resource.
     */

    public RoutingProfileQueueReference getQueueReference() {
        return this.queueReference;
    }

    /**
     * <p>
     * Contains information about a queue resource.
     * </p>
     * 
     * @param queueReference
     *        Contains information about a queue resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingProfileQueueConfig withQueueReference(RoutingProfileQueueReference queueReference) {
        setQueueReference(queueReference);
        return this;
    }

    /**
     * <p>
     * The order in which contacts are to be handled for the queue. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html">Queues:
     * priority and delay</a>.
     * </p>
     * 
     * @param priority
     *        The order in which contacts are to be handled for the queue. For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *        >Queues: priority and delay</a>.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The order in which contacts are to be handled for the queue. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html">Queues:
     * priority and delay</a>.
     * </p>
     * 
     * @return The order in which contacts are to be handled for the queue. For more information, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *         >Queues: priority and delay</a>.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The order in which contacts are to be handled for the queue. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html">Queues:
     * priority and delay</a>.
     * </p>
     * 
     * @param priority
     *        The order in which contacts are to be handled for the queue. For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *        >Queues: priority and delay</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingProfileQueueConfig withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The delay, in seconds, a contact should be in the queue before they are routed to an available agent. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html">Queues:
     * priority and delay</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param delay
     *        The delay, in seconds, a contact should be in the queue before they are routed to an available agent. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *        >Queues: priority and delay</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    /**
     * <p>
     * The delay, in seconds, a contact should be in the queue before they are routed to an available agent. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html">Queues:
     * priority and delay</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @return The delay, in seconds, a contact should be in the queue before they are routed to an available agent. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *         >Queues: priority and delay</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public Integer getDelay() {
        return this.delay;
    }

    /**
     * <p>
     * The delay, in seconds, a contact should be in the queue before they are routed to an available agent. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html">Queues:
     * priority and delay</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param delay
     *        The delay, in seconds, a contact should be in the queue before they are routed to an available agent. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *        >Queues: priority and delay</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingProfileQueueConfig withDelay(Integer delay) {
        setDelay(delay);
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
        if (getQueueReference() != null)
            sb.append("QueueReference: ").append(getQueueReference()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getDelay() != null)
            sb.append("Delay: ").append(getDelay());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoutingProfileQueueConfig == false)
            return false;
        RoutingProfileQueueConfig other = (RoutingProfileQueueConfig) obj;
        if (other.getQueueReference() == null ^ this.getQueueReference() == null)
            return false;
        if (other.getQueueReference() != null && other.getQueueReference().equals(this.getQueueReference()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getDelay() == null ^ this.getDelay() == null)
            return false;
        if (other.getDelay() != null && other.getDelay().equals(this.getDelay()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueReference() == null) ? 0 : getQueueReference().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getDelay() == null) ? 0 : getDelay().hashCode());
        return hashCode;
    }

    @Override
    public RoutingProfileQueueConfig clone() {
        try {
            return (RoutingProfileQueueConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RoutingProfileQueueConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
