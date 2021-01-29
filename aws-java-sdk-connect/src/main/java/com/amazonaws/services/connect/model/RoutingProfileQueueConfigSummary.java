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
 * Contains summary information about a routing profile queue.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RoutingProfileQueueConfigSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoutingProfileQueueConfigSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     */
    private String queueArn;
    /**
     * <p>
     * The name of the queue.
     * </p>
     */
    private String queueName;
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
     * The delay, in seconds, that a contact should be in the queue before they are routed to an available agent. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html">Queues:
     * priority and delay</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     */
    private Integer delay;
    /**
     * <p>
     * The channels this queue supports.
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

    public RoutingProfileQueueConfigSummary withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     * 
     * @param queueArn
     *        The Amazon Resource Name (ARN) of the queue.
     */

    public void setQueueArn(String queueArn) {
        this.queueArn = queueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the queue.
     */

    public String getQueueArn() {
        return this.queueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     * 
     * @param queueArn
     *        The Amazon Resource Name (ARN) of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingProfileQueueConfigSummary withQueueArn(String queueArn) {
        setQueueArn(queueArn);
        return this;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * 
     * @param queueName
     *        The name of the queue.
     */

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * 
     * @return The name of the queue.
     */

    public String getQueueName() {
        return this.queueName;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * 
     * @param queueName
     *        The name of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingProfileQueueConfigSummary withQueueName(String queueName) {
        setQueueName(queueName);
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

    public RoutingProfileQueueConfigSummary withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The delay, in seconds, that a contact should be in the queue before they are routed to an available agent. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html">Queues:
     * priority and delay</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param delay
     *        The delay, in seconds, that a contact should be in the queue before they are routed to an available agent.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *        >Queues: priority and delay</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    /**
     * <p>
     * The delay, in seconds, that a contact should be in the queue before they are routed to an available agent. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html">Queues:
     * priority and delay</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @return The delay, in seconds, that a contact should be in the queue before they are routed to an available
     *         agent. For more information, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *         >Queues: priority and delay</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public Integer getDelay() {
        return this.delay;
    }

    /**
     * <p>
     * The delay, in seconds, that a contact should be in the queue before they are routed to an available agent. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html">Queues:
     * priority and delay</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param delay
     *        The delay, in seconds, that a contact should be in the queue before they are routed to an available agent.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *        >Queues: priority and delay</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingProfileQueueConfigSummary withDelay(Integer delay) {
        setDelay(delay);
        return this;
    }

    /**
     * <p>
     * The channels this queue supports.
     * </p>
     * 
     * @param channel
     *        The channels this queue supports.
     * @see Channel
     */

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The channels this queue supports.
     * </p>
     * 
     * @return The channels this queue supports.
     * @see Channel
     */

    public String getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * The channels this queue supports.
     * </p>
     * 
     * @param channel
     *        The channels this queue supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public RoutingProfileQueueConfigSummary withChannel(String channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * The channels this queue supports.
     * </p>
     * 
     * @param channel
     *        The channels this queue supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public RoutingProfileQueueConfigSummary withChannel(Channel channel) {
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
        if (getQueueArn() != null)
            sb.append("QueueArn: ").append(getQueueArn()).append(",");
        if (getQueueName() != null)
            sb.append("QueueName: ").append(getQueueName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getDelay() != null)
            sb.append("Delay: ").append(getDelay()).append(",");
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

        if (obj instanceof RoutingProfileQueueConfigSummary == false)
            return false;
        RoutingProfileQueueConfigSummary other = (RoutingProfileQueueConfigSummary) obj;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getQueueArn() == null ^ this.getQueueArn() == null)
            return false;
        if (other.getQueueArn() != null && other.getQueueArn().equals(this.getQueueArn()) == false)
            return false;
        if (other.getQueueName() == null ^ this.getQueueName() == null)
            return false;
        if (other.getQueueName() != null && other.getQueueName().equals(this.getQueueName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getDelay() == null ^ this.getDelay() == null)
            return false;
        if (other.getDelay() != null && other.getDelay().equals(this.getDelay()) == false)
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
        hashCode = prime * hashCode + ((getQueueArn() == null) ? 0 : getQueueArn().hashCode());
        hashCode = prime * hashCode + ((getQueueName() == null) ? 0 : getQueueName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getDelay() == null) ? 0 : getDelay().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        return hashCode;
    }

    @Override
    public RoutingProfileQueueConfigSummary clone() {
        try {
            return (RoutingProfileQueueConfigSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RoutingProfileQueueConfigSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
