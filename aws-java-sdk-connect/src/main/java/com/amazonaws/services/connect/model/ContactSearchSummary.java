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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information of returned contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ContactSearchSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactSearchSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The identifier of the contact summary.
     * </p>
     */
    private String id;
    /**
     * <p>
     * If this contact is related to other contacts, this is the ID of the initial contact.
     * </p>
     */
    private String initialContactId;
    /**
     * <p>
     * If this contact is not the first contact, this is the ID of the previous contact.
     * </p>
     */
    private String previousContactId;
    /**
     * <p>
     * Indicates how the contact was initiated.
     * </p>
     */
    private String initiationMethod;
    /**
     * <p>
     * How the contact reached your contact center.
     * </p>
     */
    private String channel;
    /**
     * <p>
     * If this contact was queued, this contains information about the queue.
     * </p>
     */
    private ContactSearchSummaryQueueInfo queueInfo;
    /**
     * <p>
     * Information about the agent who accepted the contact.
     * </p>
     */
    private ContactSearchSummaryAgentInfo agentInfo;
    /**
     * <p>
     * The date and time this contact was initiated, in UTC time. For <code>INBOUND</code>, this is when the contact
     * arrived. For <code>OUTBOUND</code>, this is when the agent began dialing. For <code>CALLBACK</code>, this is when
     * the callback contact was created. For <code>TRANSFER</code> and <code>QUEUE_TRANSFER</code>, this is when the
     * transfer was initiated. For API, this is when the request arrived. For <code>EXTERNAL_OUTBOUND</code>, this is
     * when the agent started dialing the external participant. For <code>MONITOR</code>, this is when the supervisor
     * started listening to a contact.
     * </p>
     */
    private java.util.Date initiationTimestamp;
    /**
     * <p>
     * The timestamp when the customer endpoint disconnected from Amazon Connect.
     * </p>
     */
    private java.util.Date disconnectTimestamp;
    /**
     * <p>
     * The timestamp, in Unix epoch time format, at which to start running the inbound flow.
     * </p>
     */
    private java.util.Date scheduledTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the contact.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactSearchSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The identifier of the contact summary.
     * </p>
     * 
     * @param id
     *        The identifier of the contact summary.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the contact summary.
     * </p>
     * 
     * @return The identifier of the contact summary.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the contact summary.
     * </p>
     * 
     * @param id
     *        The identifier of the contact summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactSearchSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * If this contact is related to other contacts, this is the ID of the initial contact.
     * </p>
     * 
     * @param initialContactId
     *        If this contact is related to other contacts, this is the ID of the initial contact.
     */

    public void setInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
    }

    /**
     * <p>
     * If this contact is related to other contacts, this is the ID of the initial contact.
     * </p>
     * 
     * @return If this contact is related to other contacts, this is the ID of the initial contact.
     */

    public String getInitialContactId() {
        return this.initialContactId;
    }

    /**
     * <p>
     * If this contact is related to other contacts, this is the ID of the initial contact.
     * </p>
     * 
     * @param initialContactId
     *        If this contact is related to other contacts, this is the ID of the initial contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactSearchSummary withInitialContactId(String initialContactId) {
        setInitialContactId(initialContactId);
        return this;
    }

    /**
     * <p>
     * If this contact is not the first contact, this is the ID of the previous contact.
     * </p>
     * 
     * @param previousContactId
     *        If this contact is not the first contact, this is the ID of the previous contact.
     */

    public void setPreviousContactId(String previousContactId) {
        this.previousContactId = previousContactId;
    }

    /**
     * <p>
     * If this contact is not the first contact, this is the ID of the previous contact.
     * </p>
     * 
     * @return If this contact is not the first contact, this is the ID of the previous contact.
     */

    public String getPreviousContactId() {
        return this.previousContactId;
    }

    /**
     * <p>
     * If this contact is not the first contact, this is the ID of the previous contact.
     * </p>
     * 
     * @param previousContactId
     *        If this contact is not the first contact, this is the ID of the previous contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactSearchSummary withPreviousContactId(String previousContactId) {
        setPreviousContactId(previousContactId);
        return this;
    }

    /**
     * <p>
     * Indicates how the contact was initiated.
     * </p>
     * 
     * @param initiationMethod
     *        Indicates how the contact was initiated.
     * @see ContactInitiationMethod
     */

    public void setInitiationMethod(String initiationMethod) {
        this.initiationMethod = initiationMethod;
    }

    /**
     * <p>
     * Indicates how the contact was initiated.
     * </p>
     * 
     * @return Indicates how the contact was initiated.
     * @see ContactInitiationMethod
     */

    public String getInitiationMethod() {
        return this.initiationMethod;
    }

    /**
     * <p>
     * Indicates how the contact was initiated.
     * </p>
     * 
     * @param initiationMethod
     *        Indicates how the contact was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactInitiationMethod
     */

    public ContactSearchSummary withInitiationMethod(String initiationMethod) {
        setInitiationMethod(initiationMethod);
        return this;
    }

    /**
     * <p>
     * Indicates how the contact was initiated.
     * </p>
     * 
     * @param initiationMethod
     *        Indicates how the contact was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactInitiationMethod
     */

    public ContactSearchSummary withInitiationMethod(ContactInitiationMethod initiationMethod) {
        this.initiationMethod = initiationMethod.toString();
        return this;
    }

    /**
     * <p>
     * How the contact reached your contact center.
     * </p>
     * 
     * @param channel
     *        How the contact reached your contact center.
     * @see Channel
     */

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * How the contact reached your contact center.
     * </p>
     * 
     * @return How the contact reached your contact center.
     * @see Channel
     */

    public String getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * How the contact reached your contact center.
     * </p>
     * 
     * @param channel
     *        How the contact reached your contact center.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public ContactSearchSummary withChannel(String channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * How the contact reached your contact center.
     * </p>
     * 
     * @param channel
     *        How the contact reached your contact center.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public ContactSearchSummary withChannel(Channel channel) {
        this.channel = channel.toString();
        return this;
    }

    /**
     * <p>
     * If this contact was queued, this contains information about the queue.
     * </p>
     * 
     * @param queueInfo
     *        If this contact was queued, this contains information about the queue.
     */

    public void setQueueInfo(ContactSearchSummaryQueueInfo queueInfo) {
        this.queueInfo = queueInfo;
    }

    /**
     * <p>
     * If this contact was queued, this contains information about the queue.
     * </p>
     * 
     * @return If this contact was queued, this contains information about the queue.
     */

    public ContactSearchSummaryQueueInfo getQueueInfo() {
        return this.queueInfo;
    }

    /**
     * <p>
     * If this contact was queued, this contains information about the queue.
     * </p>
     * 
     * @param queueInfo
     *        If this contact was queued, this contains information about the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactSearchSummary withQueueInfo(ContactSearchSummaryQueueInfo queueInfo) {
        setQueueInfo(queueInfo);
        return this;
    }

    /**
     * <p>
     * Information about the agent who accepted the contact.
     * </p>
     * 
     * @param agentInfo
     *        Information about the agent who accepted the contact.
     */

    public void setAgentInfo(ContactSearchSummaryAgentInfo agentInfo) {
        this.agentInfo = agentInfo;
    }

    /**
     * <p>
     * Information about the agent who accepted the contact.
     * </p>
     * 
     * @return Information about the agent who accepted the contact.
     */

    public ContactSearchSummaryAgentInfo getAgentInfo() {
        return this.agentInfo;
    }

    /**
     * <p>
     * Information about the agent who accepted the contact.
     * </p>
     * 
     * @param agentInfo
     *        Information about the agent who accepted the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactSearchSummary withAgentInfo(ContactSearchSummaryAgentInfo agentInfo) {
        setAgentInfo(agentInfo);
        return this;
    }

    /**
     * <p>
     * The date and time this contact was initiated, in UTC time. For <code>INBOUND</code>, this is when the contact
     * arrived. For <code>OUTBOUND</code>, this is when the agent began dialing. For <code>CALLBACK</code>, this is when
     * the callback contact was created. For <code>TRANSFER</code> and <code>QUEUE_TRANSFER</code>, this is when the
     * transfer was initiated. For API, this is when the request arrived. For <code>EXTERNAL_OUTBOUND</code>, this is
     * when the agent started dialing the external participant. For <code>MONITOR</code>, this is when the supervisor
     * started listening to a contact.
     * </p>
     * 
     * @param initiationTimestamp
     *        The date and time this contact was initiated, in UTC time. For <code>INBOUND</code>, this is when the
     *        contact arrived. For <code>OUTBOUND</code>, this is when the agent began dialing. For
     *        <code>CALLBACK</code>, this is when the callback contact was created. For <code>TRANSFER</code> and
     *        <code>QUEUE_TRANSFER</code>, this is when the transfer was initiated. For API, this is when the request
     *        arrived. For <code>EXTERNAL_OUTBOUND</code>, this is when the agent started dialing the external
     *        participant. For <code>MONITOR</code>, this is when the supervisor started listening to a contact.
     */

    public void setInitiationTimestamp(java.util.Date initiationTimestamp) {
        this.initiationTimestamp = initiationTimestamp;
    }

    /**
     * <p>
     * The date and time this contact was initiated, in UTC time. For <code>INBOUND</code>, this is when the contact
     * arrived. For <code>OUTBOUND</code>, this is when the agent began dialing. For <code>CALLBACK</code>, this is when
     * the callback contact was created. For <code>TRANSFER</code> and <code>QUEUE_TRANSFER</code>, this is when the
     * transfer was initiated. For API, this is when the request arrived. For <code>EXTERNAL_OUTBOUND</code>, this is
     * when the agent started dialing the external participant. For <code>MONITOR</code>, this is when the supervisor
     * started listening to a contact.
     * </p>
     * 
     * @return The date and time this contact was initiated, in UTC time. For <code>INBOUND</code>, this is when the
     *         contact arrived. For <code>OUTBOUND</code>, this is when the agent began dialing. For
     *         <code>CALLBACK</code>, this is when the callback contact was created. For <code>TRANSFER</code> and
     *         <code>QUEUE_TRANSFER</code>, this is when the transfer was initiated. For API, this is when the request
     *         arrived. For <code>EXTERNAL_OUTBOUND</code>, this is when the agent started dialing the external
     *         participant. For <code>MONITOR</code>, this is when the supervisor started listening to a contact.
     */

    public java.util.Date getInitiationTimestamp() {
        return this.initiationTimestamp;
    }

    /**
     * <p>
     * The date and time this contact was initiated, in UTC time. For <code>INBOUND</code>, this is when the contact
     * arrived. For <code>OUTBOUND</code>, this is when the agent began dialing. For <code>CALLBACK</code>, this is when
     * the callback contact was created. For <code>TRANSFER</code> and <code>QUEUE_TRANSFER</code>, this is when the
     * transfer was initiated. For API, this is when the request arrived. For <code>EXTERNAL_OUTBOUND</code>, this is
     * when the agent started dialing the external participant. For <code>MONITOR</code>, this is when the supervisor
     * started listening to a contact.
     * </p>
     * 
     * @param initiationTimestamp
     *        The date and time this contact was initiated, in UTC time. For <code>INBOUND</code>, this is when the
     *        contact arrived. For <code>OUTBOUND</code>, this is when the agent began dialing. For
     *        <code>CALLBACK</code>, this is when the callback contact was created. For <code>TRANSFER</code> and
     *        <code>QUEUE_TRANSFER</code>, this is when the transfer was initiated. For API, this is when the request
     *        arrived. For <code>EXTERNAL_OUTBOUND</code>, this is when the agent started dialing the external
     *        participant. For <code>MONITOR</code>, this is when the supervisor started listening to a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactSearchSummary withInitiationTimestamp(java.util.Date initiationTimestamp) {
        setInitiationTimestamp(initiationTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp when the customer endpoint disconnected from Amazon Connect.
     * </p>
     * 
     * @param disconnectTimestamp
     *        The timestamp when the customer endpoint disconnected from Amazon Connect.
     */

    public void setDisconnectTimestamp(java.util.Date disconnectTimestamp) {
        this.disconnectTimestamp = disconnectTimestamp;
    }

    /**
     * <p>
     * The timestamp when the customer endpoint disconnected from Amazon Connect.
     * </p>
     * 
     * @return The timestamp when the customer endpoint disconnected from Amazon Connect.
     */

    public java.util.Date getDisconnectTimestamp() {
        return this.disconnectTimestamp;
    }

    /**
     * <p>
     * The timestamp when the customer endpoint disconnected from Amazon Connect.
     * </p>
     * 
     * @param disconnectTimestamp
     *        The timestamp when the customer endpoint disconnected from Amazon Connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactSearchSummary withDisconnectTimestamp(java.util.Date disconnectTimestamp) {
        setDisconnectTimestamp(disconnectTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp, in Unix epoch time format, at which to start running the inbound flow.
     * </p>
     * 
     * @param scheduledTimestamp
     *        The timestamp, in Unix epoch time format, at which to start running the inbound flow.
     */

    public void setScheduledTimestamp(java.util.Date scheduledTimestamp) {
        this.scheduledTimestamp = scheduledTimestamp;
    }

    /**
     * <p>
     * The timestamp, in Unix epoch time format, at which to start running the inbound flow.
     * </p>
     * 
     * @return The timestamp, in Unix epoch time format, at which to start running the inbound flow.
     */

    public java.util.Date getScheduledTimestamp() {
        return this.scheduledTimestamp;
    }

    /**
     * <p>
     * The timestamp, in Unix epoch time format, at which to start running the inbound flow.
     * </p>
     * 
     * @param scheduledTimestamp
     *        The timestamp, in Unix epoch time format, at which to start running the inbound flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactSearchSummary withScheduledTimestamp(java.util.Date scheduledTimestamp) {
        setScheduledTimestamp(scheduledTimestamp);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getInitialContactId() != null)
            sb.append("InitialContactId: ").append(getInitialContactId()).append(",");
        if (getPreviousContactId() != null)
            sb.append("PreviousContactId: ").append(getPreviousContactId()).append(",");
        if (getInitiationMethod() != null)
            sb.append("InitiationMethod: ").append(getInitiationMethod()).append(",");
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getQueueInfo() != null)
            sb.append("QueueInfo: ").append(getQueueInfo()).append(",");
        if (getAgentInfo() != null)
            sb.append("AgentInfo: ").append(getAgentInfo()).append(",");
        if (getInitiationTimestamp() != null)
            sb.append("InitiationTimestamp: ").append(getInitiationTimestamp()).append(",");
        if (getDisconnectTimestamp() != null)
            sb.append("DisconnectTimestamp: ").append(getDisconnectTimestamp()).append(",");
        if (getScheduledTimestamp() != null)
            sb.append("ScheduledTimestamp: ").append(getScheduledTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactSearchSummary == false)
            return false;
        ContactSearchSummary other = (ContactSearchSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInitialContactId() == null ^ this.getInitialContactId() == null)
            return false;
        if (other.getInitialContactId() != null && other.getInitialContactId().equals(this.getInitialContactId()) == false)
            return false;
        if (other.getPreviousContactId() == null ^ this.getPreviousContactId() == null)
            return false;
        if (other.getPreviousContactId() != null && other.getPreviousContactId().equals(this.getPreviousContactId()) == false)
            return false;
        if (other.getInitiationMethod() == null ^ this.getInitiationMethod() == null)
            return false;
        if (other.getInitiationMethod() != null && other.getInitiationMethod().equals(this.getInitiationMethod()) == false)
            return false;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getQueueInfo() == null ^ this.getQueueInfo() == null)
            return false;
        if (other.getQueueInfo() != null && other.getQueueInfo().equals(this.getQueueInfo()) == false)
            return false;
        if (other.getAgentInfo() == null ^ this.getAgentInfo() == null)
            return false;
        if (other.getAgentInfo() != null && other.getAgentInfo().equals(this.getAgentInfo()) == false)
            return false;
        if (other.getInitiationTimestamp() == null ^ this.getInitiationTimestamp() == null)
            return false;
        if (other.getInitiationTimestamp() != null && other.getInitiationTimestamp().equals(this.getInitiationTimestamp()) == false)
            return false;
        if (other.getDisconnectTimestamp() == null ^ this.getDisconnectTimestamp() == null)
            return false;
        if (other.getDisconnectTimestamp() != null && other.getDisconnectTimestamp().equals(this.getDisconnectTimestamp()) == false)
            return false;
        if (other.getScheduledTimestamp() == null ^ this.getScheduledTimestamp() == null)
            return false;
        if (other.getScheduledTimestamp() != null && other.getScheduledTimestamp().equals(this.getScheduledTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInitialContactId() == null) ? 0 : getInitialContactId().hashCode());
        hashCode = prime * hashCode + ((getPreviousContactId() == null) ? 0 : getPreviousContactId().hashCode());
        hashCode = prime * hashCode + ((getInitiationMethod() == null) ? 0 : getInitiationMethod().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getQueueInfo() == null) ? 0 : getQueueInfo().hashCode());
        hashCode = prime * hashCode + ((getAgentInfo() == null) ? 0 : getAgentInfo().hashCode());
        hashCode = prime * hashCode + ((getInitiationTimestamp() == null) ? 0 : getInitiationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDisconnectTimestamp() == null) ? 0 : getDisconnectTimestamp().hashCode());
        hashCode = prime * hashCode + ((getScheduledTimestamp() == null) ? 0 : getScheduledTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ContactSearchSummary clone() {
        try {
            return (ContactSearchSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ContactSearchSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
