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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the <a href="https://docs.aws.amazon.com/connect/latest/APIReference/API_Contact.html">contact</a>
 * associated to the user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AgentContactReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentContactReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The channel of the contact.
     * </p>
     */
    private String channel;
    /**
     * <p>
     * How the contact was initiated.
     * </p>
     */
    private String initiationMethod;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">state of the
     * contact</a>.
     * </p>
     */
    private String agentContactState;
    /**
     * <p>
     * The epoch timestamp when the contact state started.
     * </p>
     */
    private java.util.Date stateStartTimestamp;
    /**
     * <p>
     * The time at which the contact was connected to an agent.
     * </p>
     */
    private java.util.Date connectedToAgentTimestamp;

    private QueueReference queue;

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact in this instance of Amazon Connect.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @return The identifier of the contact in this instance of Amazon Connect.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact in this instance of Amazon Connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentContactReference withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The channel of the contact.
     * </p>
     * 
     * @param channel
     *        The channel of the contact.
     * @see Channel
     */

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The channel of the contact.
     * </p>
     * 
     * @return The channel of the contact.
     * @see Channel
     */

    public String getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * The channel of the contact.
     * </p>
     * 
     * @param channel
     *        The channel of the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public AgentContactReference withChannel(String channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * The channel of the contact.
     * </p>
     * 
     * @param channel
     *        The channel of the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public AgentContactReference withChannel(Channel channel) {
        this.channel = channel.toString();
        return this;
    }

    /**
     * <p>
     * How the contact was initiated.
     * </p>
     * 
     * @param initiationMethod
     *        How the contact was initiated.
     * @see ContactInitiationMethod
     */

    public void setInitiationMethod(String initiationMethod) {
        this.initiationMethod = initiationMethod;
    }

    /**
     * <p>
     * How the contact was initiated.
     * </p>
     * 
     * @return How the contact was initiated.
     * @see ContactInitiationMethod
     */

    public String getInitiationMethod() {
        return this.initiationMethod;
    }

    /**
     * <p>
     * How the contact was initiated.
     * </p>
     * 
     * @param initiationMethod
     *        How the contact was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactInitiationMethod
     */

    public AgentContactReference withInitiationMethod(String initiationMethod) {
        setInitiationMethod(initiationMethod);
        return this;
    }

    /**
     * <p>
     * How the contact was initiated.
     * </p>
     * 
     * @param initiationMethod
     *        How the contact was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactInitiationMethod
     */

    public AgentContactReference withInitiationMethod(ContactInitiationMethod initiationMethod) {
        this.initiationMethod = initiationMethod.toString();
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">state of the
     * contact</a>.
     * </p>
     * 
     * @param agentContactState
     *        The <a href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">state of the
     *        contact</a>.
     * @see ContactState
     */

    public void setAgentContactState(String agentContactState) {
        this.agentContactState = agentContactState;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">state of the
     * contact</a>.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">state of
     *         the contact</a>.
     * @see ContactState
     */

    public String getAgentContactState() {
        return this.agentContactState;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">state of the
     * contact</a>.
     * </p>
     * 
     * @param agentContactState
     *        The <a href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">state of the
     *        contact</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactState
     */

    public AgentContactReference withAgentContactState(String agentContactState) {
        setAgentContactState(agentContactState);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">state of the
     * contact</a>.
     * </p>
     * 
     * @param agentContactState
     *        The <a href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">state of the
     *        contact</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactState
     */

    public AgentContactReference withAgentContactState(ContactState agentContactState) {
        this.agentContactState = agentContactState.toString();
        return this;
    }

    /**
     * <p>
     * The epoch timestamp when the contact state started.
     * </p>
     * 
     * @param stateStartTimestamp
     *        The epoch timestamp when the contact state started.
     */

    public void setStateStartTimestamp(java.util.Date stateStartTimestamp) {
        this.stateStartTimestamp = stateStartTimestamp;
    }

    /**
     * <p>
     * The epoch timestamp when the contact state started.
     * </p>
     * 
     * @return The epoch timestamp when the contact state started.
     */

    public java.util.Date getStateStartTimestamp() {
        return this.stateStartTimestamp;
    }

    /**
     * <p>
     * The epoch timestamp when the contact state started.
     * </p>
     * 
     * @param stateStartTimestamp
     *        The epoch timestamp when the contact state started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentContactReference withStateStartTimestamp(java.util.Date stateStartTimestamp) {
        setStateStartTimestamp(stateStartTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which the contact was connected to an agent.
     * </p>
     * 
     * @param connectedToAgentTimestamp
     *        The time at which the contact was connected to an agent.
     */

    public void setConnectedToAgentTimestamp(java.util.Date connectedToAgentTimestamp) {
        this.connectedToAgentTimestamp = connectedToAgentTimestamp;
    }

    /**
     * <p>
     * The time at which the contact was connected to an agent.
     * </p>
     * 
     * @return The time at which the contact was connected to an agent.
     */

    public java.util.Date getConnectedToAgentTimestamp() {
        return this.connectedToAgentTimestamp;
    }

    /**
     * <p>
     * The time at which the contact was connected to an agent.
     * </p>
     * 
     * @param connectedToAgentTimestamp
     *        The time at which the contact was connected to an agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentContactReference withConnectedToAgentTimestamp(java.util.Date connectedToAgentTimestamp) {
        setConnectedToAgentTimestamp(connectedToAgentTimestamp);
        return this;
    }

    /**
     * @param queue
     */

    public void setQueue(QueueReference queue) {
        this.queue = queue;
    }

    /**
     * @return
     */

    public QueueReference getQueue() {
        return this.queue;
    }

    /**
     * @param queue
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentContactReference withQueue(QueueReference queue) {
        setQueue(queue);
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
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getInitiationMethod() != null)
            sb.append("InitiationMethod: ").append(getInitiationMethod()).append(",");
        if (getAgentContactState() != null)
            sb.append("AgentContactState: ").append(getAgentContactState()).append(",");
        if (getStateStartTimestamp() != null)
            sb.append("StateStartTimestamp: ").append(getStateStartTimestamp()).append(",");
        if (getConnectedToAgentTimestamp() != null)
            sb.append("ConnectedToAgentTimestamp: ").append(getConnectedToAgentTimestamp()).append(",");
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

        if (obj instanceof AgentContactReference == false)
            return false;
        AgentContactReference other = (AgentContactReference) obj;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getInitiationMethod() == null ^ this.getInitiationMethod() == null)
            return false;
        if (other.getInitiationMethod() != null && other.getInitiationMethod().equals(this.getInitiationMethod()) == false)
            return false;
        if (other.getAgentContactState() == null ^ this.getAgentContactState() == null)
            return false;
        if (other.getAgentContactState() != null && other.getAgentContactState().equals(this.getAgentContactState()) == false)
            return false;
        if (other.getStateStartTimestamp() == null ^ this.getStateStartTimestamp() == null)
            return false;
        if (other.getStateStartTimestamp() != null && other.getStateStartTimestamp().equals(this.getStateStartTimestamp()) == false)
            return false;
        if (other.getConnectedToAgentTimestamp() == null ^ this.getConnectedToAgentTimestamp() == null)
            return false;
        if (other.getConnectedToAgentTimestamp() != null && other.getConnectedToAgentTimestamp().equals(this.getConnectedToAgentTimestamp()) == false)
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

        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getInitiationMethod() == null) ? 0 : getInitiationMethod().hashCode());
        hashCode = prime * hashCode + ((getAgentContactState() == null) ? 0 : getAgentContactState().hashCode());
        hashCode = prime * hashCode + ((getStateStartTimestamp() == null) ? 0 : getStateStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getConnectedToAgentTimestamp() == null) ? 0 : getConnectedToAgentTimestamp().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        return hashCode;
    }

    @Override
    public AgentContactReference clone() {
        try {
            return (AgentContactReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AgentContactReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
