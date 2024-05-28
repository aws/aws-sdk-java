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
 * Contains information about a contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Contact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Contact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The identifier for the contact.
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
     * The name of the contact.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the contact.
     * </p>
     */
    private String description;
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
    private QueueInfo queueInfo;
    /**
     * <p>
     * Information about the agent who accepted the contact.
     * </p>
     */
    private AgentInfo agentInfo;
    /**
     * <p>
     * The date and time this contact was initiated, in UTC time. For <code>INBOUND</code>, this is when the contact
     * arrived. For <code>OUTBOUND</code>, this is when the agent began dialing. For <code>CALLBACK</code>, this is when
     * the callback contact was created. For <code>TRANSFER</code> and <code>QUEUE_TRANSFER</code>, this is when the
     * transfer was initiated. For <code>API</code>, this is when the request arrived. For
     * <code>EXTERNAL_OUTBOUND</code>, this is when the agent started dialing the external participant. For
     * <code>MONITOR</code>, this is when the supervisor started listening to a contact.
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
     * The timestamp when contact was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTimestamp;
    /**
     * <p>
     * The timestamp when the contact was last paused.
     * </p>
     */
    private java.util.Date lastPausedTimestamp;
    /**
     * <p>
     * The timestamp when the contact was last resumed.
     * </p>
     */
    private java.util.Date lastResumedTimestamp;
    /**
     * <p>
     * Total pause count for a contact.
     * </p>
     */
    private Integer totalPauseCount;
    /**
     * <p>
     * Total pause duration for a contact in seconds.
     * </p>
     */
    private Integer totalPauseDurationInSeconds;
    /**
     * <p>
     * The timestamp, in Unix epoch time format, at which to start running the inbound flow.
     * </p>
     */
    private java.util.Date scheduledTimestamp;
    /**
     * <p>
     * The contactId that is <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html#relatedcontactid">related</a>
     * to this contact.
     * </p>
     */
    private String relatedContactId;
    /**
     * <p>
     * Information about Amazon Connect Wisdom.
     * </p>
     */
    private WisdomInfo wisdomInfo;
    /**
     * <p>
     * An integer that represents the queue time adjust to be applied to the contact, in seconds (longer / larger queue
     * time are routed preferentially). Cannot be specified if the QueuePriority is specified. Must be statically
     * defined and a valid integer value.
     * </p>
     */
    private Integer queueTimeAdjustmentSeconds;
    /**
     * <p>
     * An integer that represents the queue priority to be applied to the contact (lower priorities are routed
     * preferentially). Cannot be specified if the QueueTimeAdjustmentSeconds is specified. Must be statically defined,
     * must be larger than zero, and a valid integer value. Default Value is 5.
     * </p>
     */
    private Long queuePriority;
    /**
     * <p>
     * Tags associated with the contact. This contains both Amazon Web Services generated and user-defined tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the contact.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the contact.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The identifier for the contact.
     * </p>
     * 
     * @param id
     *        The identifier for the contact.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the contact.
     * </p>
     * 
     * @return The identifier for the contact.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the contact.
     * </p>
     * 
     * @param id
     *        The identifier for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withId(String id) {
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

    public Contact withInitialContactId(String initialContactId) {
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

    public Contact withPreviousContactId(String previousContactId) {
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

    public Contact withInitiationMethod(String initiationMethod) {
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

    public Contact withInitiationMethod(ContactInitiationMethod initiationMethod) {
        this.initiationMethod = initiationMethod.toString();
        return this;
    }

    /**
     * <p>
     * The name of the contact.
     * </p>
     * 
     * @param name
     *        The name of the contact.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the contact.
     * </p>
     * 
     * @return The name of the contact.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the contact.
     * </p>
     * 
     * @param name
     *        The name of the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the contact.
     * </p>
     * 
     * @param description
     *        The description of the contact.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the contact.
     * </p>
     * 
     * @return The description of the contact.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the contact.
     * </p>
     * 
     * @param description
     *        The description of the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withDescription(String description) {
        setDescription(description);
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

    public Contact withChannel(String channel) {
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

    public Contact withChannel(Channel channel) {
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

    public void setQueueInfo(QueueInfo queueInfo) {
        this.queueInfo = queueInfo;
    }

    /**
     * <p>
     * If this contact was queued, this contains information about the queue.
     * </p>
     * 
     * @return If this contact was queued, this contains information about the queue.
     */

    public QueueInfo getQueueInfo() {
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

    public Contact withQueueInfo(QueueInfo queueInfo) {
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

    public void setAgentInfo(AgentInfo agentInfo) {
        this.agentInfo = agentInfo;
    }

    /**
     * <p>
     * Information about the agent who accepted the contact.
     * </p>
     * 
     * @return Information about the agent who accepted the contact.
     */

    public AgentInfo getAgentInfo() {
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

    public Contact withAgentInfo(AgentInfo agentInfo) {
        setAgentInfo(agentInfo);
        return this;
    }

    /**
     * <p>
     * The date and time this contact was initiated, in UTC time. For <code>INBOUND</code>, this is when the contact
     * arrived. For <code>OUTBOUND</code>, this is when the agent began dialing. For <code>CALLBACK</code>, this is when
     * the callback contact was created. For <code>TRANSFER</code> and <code>QUEUE_TRANSFER</code>, this is when the
     * transfer was initiated. For <code>API</code>, this is when the request arrived. For
     * <code>EXTERNAL_OUTBOUND</code>, this is when the agent started dialing the external participant. For
     * <code>MONITOR</code>, this is when the supervisor started listening to a contact.
     * </p>
     * 
     * @param initiationTimestamp
     *        The date and time this contact was initiated, in UTC time. For <code>INBOUND</code>, this is when the
     *        contact arrived. For <code>OUTBOUND</code>, this is when the agent began dialing. For
     *        <code>CALLBACK</code>, this is when the callback contact was created. For <code>TRANSFER</code> and
     *        <code>QUEUE_TRANSFER</code>, this is when the transfer was initiated. For <code>API</code>, this is when
     *        the request arrived. For <code>EXTERNAL_OUTBOUND</code>, this is when the agent started dialing the
     *        external participant. For <code>MONITOR</code>, this is when the supervisor started listening to a
     *        contact.
     */

    public void setInitiationTimestamp(java.util.Date initiationTimestamp) {
        this.initiationTimestamp = initiationTimestamp;
    }

    /**
     * <p>
     * The date and time this contact was initiated, in UTC time. For <code>INBOUND</code>, this is when the contact
     * arrived. For <code>OUTBOUND</code>, this is when the agent began dialing. For <code>CALLBACK</code>, this is when
     * the callback contact was created. For <code>TRANSFER</code> and <code>QUEUE_TRANSFER</code>, this is when the
     * transfer was initiated. For <code>API</code>, this is when the request arrived. For
     * <code>EXTERNAL_OUTBOUND</code>, this is when the agent started dialing the external participant. For
     * <code>MONITOR</code>, this is when the supervisor started listening to a contact.
     * </p>
     * 
     * @return The date and time this contact was initiated, in UTC time. For <code>INBOUND</code>, this is when the
     *         contact arrived. For <code>OUTBOUND</code>, this is when the agent began dialing. For
     *         <code>CALLBACK</code>, this is when the callback contact was created. For <code>TRANSFER</code> and
     *         <code>QUEUE_TRANSFER</code>, this is when the transfer was initiated. For <code>API</code>, this is when
     *         the request arrived. For <code>EXTERNAL_OUTBOUND</code>, this is when the agent started dialing the
     *         external participant. For <code>MONITOR</code>, this is when the supervisor started listening to a
     *         contact.
     */

    public java.util.Date getInitiationTimestamp() {
        return this.initiationTimestamp;
    }

    /**
     * <p>
     * The date and time this contact was initiated, in UTC time. For <code>INBOUND</code>, this is when the contact
     * arrived. For <code>OUTBOUND</code>, this is when the agent began dialing. For <code>CALLBACK</code>, this is when
     * the callback contact was created. For <code>TRANSFER</code> and <code>QUEUE_TRANSFER</code>, this is when the
     * transfer was initiated. For <code>API</code>, this is when the request arrived. For
     * <code>EXTERNAL_OUTBOUND</code>, this is when the agent started dialing the external participant. For
     * <code>MONITOR</code>, this is when the supervisor started listening to a contact.
     * </p>
     * 
     * @param initiationTimestamp
     *        The date and time this contact was initiated, in UTC time. For <code>INBOUND</code>, this is when the
     *        contact arrived. For <code>OUTBOUND</code>, this is when the agent began dialing. For
     *        <code>CALLBACK</code>, this is when the callback contact was created. For <code>TRANSFER</code> and
     *        <code>QUEUE_TRANSFER</code>, this is when the transfer was initiated. For <code>API</code>, this is when
     *        the request arrived. For <code>EXTERNAL_OUTBOUND</code>, this is when the agent started dialing the
     *        external participant. For <code>MONITOR</code>, this is when the supervisor started listening to a
     *        contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withInitiationTimestamp(java.util.Date initiationTimestamp) {
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

    public Contact withDisconnectTimestamp(java.util.Date disconnectTimestamp) {
        setDisconnectTimestamp(disconnectTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp when contact was last updated.
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        The timestamp when contact was last updated.
     */

    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    /**
     * <p>
     * The timestamp when contact was last updated.
     * </p>
     * 
     * @return The timestamp when contact was last updated.
     */

    public java.util.Date getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }

    /**
     * <p>
     * The timestamp when contact was last updated.
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        The timestamp when contact was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        setLastUpdateTimestamp(lastUpdateTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp when the contact was last paused.
     * </p>
     * 
     * @param lastPausedTimestamp
     *        The timestamp when the contact was last paused.
     */

    public void setLastPausedTimestamp(java.util.Date lastPausedTimestamp) {
        this.lastPausedTimestamp = lastPausedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was last paused.
     * </p>
     * 
     * @return The timestamp when the contact was last paused.
     */

    public java.util.Date getLastPausedTimestamp() {
        return this.lastPausedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was last paused.
     * </p>
     * 
     * @param lastPausedTimestamp
     *        The timestamp when the contact was last paused.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withLastPausedTimestamp(java.util.Date lastPausedTimestamp) {
        setLastPausedTimestamp(lastPausedTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp when the contact was last resumed.
     * </p>
     * 
     * @param lastResumedTimestamp
     *        The timestamp when the contact was last resumed.
     */

    public void setLastResumedTimestamp(java.util.Date lastResumedTimestamp) {
        this.lastResumedTimestamp = lastResumedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was last resumed.
     * </p>
     * 
     * @return The timestamp when the contact was last resumed.
     */

    public java.util.Date getLastResumedTimestamp() {
        return this.lastResumedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was last resumed.
     * </p>
     * 
     * @param lastResumedTimestamp
     *        The timestamp when the contact was last resumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withLastResumedTimestamp(java.util.Date lastResumedTimestamp) {
        setLastResumedTimestamp(lastResumedTimestamp);
        return this;
    }

    /**
     * <p>
     * Total pause count for a contact.
     * </p>
     * 
     * @param totalPauseCount
     *        Total pause count for a contact.
     */

    public void setTotalPauseCount(Integer totalPauseCount) {
        this.totalPauseCount = totalPauseCount;
    }

    /**
     * <p>
     * Total pause count for a contact.
     * </p>
     * 
     * @return Total pause count for a contact.
     */

    public Integer getTotalPauseCount() {
        return this.totalPauseCount;
    }

    /**
     * <p>
     * Total pause count for a contact.
     * </p>
     * 
     * @param totalPauseCount
     *        Total pause count for a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withTotalPauseCount(Integer totalPauseCount) {
        setTotalPauseCount(totalPauseCount);
        return this;
    }

    /**
     * <p>
     * Total pause duration for a contact in seconds.
     * </p>
     * 
     * @param totalPauseDurationInSeconds
     *        Total pause duration for a contact in seconds.
     */

    public void setTotalPauseDurationInSeconds(Integer totalPauseDurationInSeconds) {
        this.totalPauseDurationInSeconds = totalPauseDurationInSeconds;
    }

    /**
     * <p>
     * Total pause duration for a contact in seconds.
     * </p>
     * 
     * @return Total pause duration for a contact in seconds.
     */

    public Integer getTotalPauseDurationInSeconds() {
        return this.totalPauseDurationInSeconds;
    }

    /**
     * <p>
     * Total pause duration for a contact in seconds.
     * </p>
     * 
     * @param totalPauseDurationInSeconds
     *        Total pause duration for a contact in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withTotalPauseDurationInSeconds(Integer totalPauseDurationInSeconds) {
        setTotalPauseDurationInSeconds(totalPauseDurationInSeconds);
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

    public Contact withScheduledTimestamp(java.util.Date scheduledTimestamp) {
        setScheduledTimestamp(scheduledTimestamp);
        return this;
    }

    /**
     * <p>
     * The contactId that is <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html#relatedcontactid">related</a>
     * to this contact.
     * </p>
     * 
     * @param relatedContactId
     *        The contactId that is <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html#relatedcontactid"
     *        >related</a> to this contact.
     */

    public void setRelatedContactId(String relatedContactId) {
        this.relatedContactId = relatedContactId;
    }

    /**
     * <p>
     * The contactId that is <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html#relatedcontactid">related</a>
     * to this contact.
     * </p>
     * 
     * @return The contactId that is <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html#relatedcontactid"
     *         >related</a> to this contact.
     */

    public String getRelatedContactId() {
        return this.relatedContactId;
    }

    /**
     * <p>
     * The contactId that is <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html#relatedcontactid">related</a>
     * to this contact.
     * </p>
     * 
     * @param relatedContactId
     *        The contactId that is <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html#relatedcontactid"
     *        >related</a> to this contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withRelatedContactId(String relatedContactId) {
        setRelatedContactId(relatedContactId);
        return this;
    }

    /**
     * <p>
     * Information about Amazon Connect Wisdom.
     * </p>
     * 
     * @param wisdomInfo
     *        Information about Amazon Connect Wisdom.
     */

    public void setWisdomInfo(WisdomInfo wisdomInfo) {
        this.wisdomInfo = wisdomInfo;
    }

    /**
     * <p>
     * Information about Amazon Connect Wisdom.
     * </p>
     * 
     * @return Information about Amazon Connect Wisdom.
     */

    public WisdomInfo getWisdomInfo() {
        return this.wisdomInfo;
    }

    /**
     * <p>
     * Information about Amazon Connect Wisdom.
     * </p>
     * 
     * @param wisdomInfo
     *        Information about Amazon Connect Wisdom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withWisdomInfo(WisdomInfo wisdomInfo) {
        setWisdomInfo(wisdomInfo);
        return this;
    }

    /**
     * <p>
     * An integer that represents the queue time adjust to be applied to the contact, in seconds (longer / larger queue
     * time are routed preferentially). Cannot be specified if the QueuePriority is specified. Must be statically
     * defined and a valid integer value.
     * </p>
     * 
     * @param queueTimeAdjustmentSeconds
     *        An integer that represents the queue time adjust to be applied to the contact, in seconds (longer / larger
     *        queue time are routed preferentially). Cannot be specified if the QueuePriority is specified. Must be
     *        statically defined and a valid integer value.
     */

    public void setQueueTimeAdjustmentSeconds(Integer queueTimeAdjustmentSeconds) {
        this.queueTimeAdjustmentSeconds = queueTimeAdjustmentSeconds;
    }

    /**
     * <p>
     * An integer that represents the queue time adjust to be applied to the contact, in seconds (longer / larger queue
     * time are routed preferentially). Cannot be specified if the QueuePriority is specified. Must be statically
     * defined and a valid integer value.
     * </p>
     * 
     * @return An integer that represents the queue time adjust to be applied to the contact, in seconds (longer /
     *         larger queue time are routed preferentially). Cannot be specified if the QueuePriority is specified. Must
     *         be statically defined and a valid integer value.
     */

    public Integer getQueueTimeAdjustmentSeconds() {
        return this.queueTimeAdjustmentSeconds;
    }

    /**
     * <p>
     * An integer that represents the queue time adjust to be applied to the contact, in seconds (longer / larger queue
     * time are routed preferentially). Cannot be specified if the QueuePriority is specified. Must be statically
     * defined and a valid integer value.
     * </p>
     * 
     * @param queueTimeAdjustmentSeconds
     *        An integer that represents the queue time adjust to be applied to the contact, in seconds (longer / larger
     *        queue time are routed preferentially). Cannot be specified if the QueuePriority is specified. Must be
     *        statically defined and a valid integer value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withQueueTimeAdjustmentSeconds(Integer queueTimeAdjustmentSeconds) {
        setQueueTimeAdjustmentSeconds(queueTimeAdjustmentSeconds);
        return this;
    }

    /**
     * <p>
     * An integer that represents the queue priority to be applied to the contact (lower priorities are routed
     * preferentially). Cannot be specified if the QueueTimeAdjustmentSeconds is specified. Must be statically defined,
     * must be larger than zero, and a valid integer value. Default Value is 5.
     * </p>
     * 
     * @param queuePriority
     *        An integer that represents the queue priority to be applied to the contact (lower priorities are routed
     *        preferentially). Cannot be specified if the QueueTimeAdjustmentSeconds is specified. Must be statically
     *        defined, must be larger than zero, and a valid integer value. Default Value is 5.
     */

    public void setQueuePriority(Long queuePriority) {
        this.queuePriority = queuePriority;
    }

    /**
     * <p>
     * An integer that represents the queue priority to be applied to the contact (lower priorities are routed
     * preferentially). Cannot be specified if the QueueTimeAdjustmentSeconds is specified. Must be statically defined,
     * must be larger than zero, and a valid integer value. Default Value is 5.
     * </p>
     * 
     * @return An integer that represents the queue priority to be applied to the contact (lower priorities are routed
     *         preferentially). Cannot be specified if the QueueTimeAdjustmentSeconds is specified. Must be statically
     *         defined, must be larger than zero, and a valid integer value. Default Value is 5.
     */

    public Long getQueuePriority() {
        return this.queuePriority;
    }

    /**
     * <p>
     * An integer that represents the queue priority to be applied to the contact (lower priorities are routed
     * preferentially). Cannot be specified if the QueueTimeAdjustmentSeconds is specified. Must be statically defined,
     * must be larger than zero, and a valid integer value. Default Value is 5.
     * </p>
     * 
     * @param queuePriority
     *        An integer that represents the queue priority to be applied to the contact (lower priorities are routed
     *        preferentially). Cannot be specified if the QueueTimeAdjustmentSeconds is specified. Must be statically
     *        defined, must be larger than zero, and a valid integer value. Default Value is 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withQueuePriority(Long queuePriority) {
        setQueuePriority(queuePriority);
        return this;
    }

    /**
     * <p>
     * Tags associated with the contact. This contains both Amazon Web Services generated and user-defined tags.
     * </p>
     * 
     * @return Tags associated with the contact. This contains both Amazon Web Services generated and user-defined tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the contact. This contains both Amazon Web Services generated and user-defined tags.
     * </p>
     * 
     * @param tags
     *        Tags associated with the contact. This contains both Amazon Web Services generated and user-defined tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags associated with the contact. This contains both Amazon Web Services generated and user-defined tags.
     * </p>
     * 
     * @param tags
     *        Tags associated with the contact. This contains both Amazon Web Services generated and user-defined tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Contact#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Contact addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Contact clearTagsEntries() {
        this.tags = null;
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
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
        if (getLastUpdateTimestamp() != null)
            sb.append("LastUpdateTimestamp: ").append(getLastUpdateTimestamp()).append(",");
        if (getLastPausedTimestamp() != null)
            sb.append("LastPausedTimestamp: ").append(getLastPausedTimestamp()).append(",");
        if (getLastResumedTimestamp() != null)
            sb.append("LastResumedTimestamp: ").append(getLastResumedTimestamp()).append(",");
        if (getTotalPauseCount() != null)
            sb.append("TotalPauseCount: ").append(getTotalPauseCount()).append(",");
        if (getTotalPauseDurationInSeconds() != null)
            sb.append("TotalPauseDurationInSeconds: ").append(getTotalPauseDurationInSeconds()).append(",");
        if (getScheduledTimestamp() != null)
            sb.append("ScheduledTimestamp: ").append(getScheduledTimestamp()).append(",");
        if (getRelatedContactId() != null)
            sb.append("RelatedContactId: ").append(getRelatedContactId()).append(",");
        if (getWisdomInfo() != null)
            sb.append("WisdomInfo: ").append(getWisdomInfo()).append(",");
        if (getQueueTimeAdjustmentSeconds() != null)
            sb.append("QueueTimeAdjustmentSeconds: ").append(getQueueTimeAdjustmentSeconds()).append(",");
        if (getQueuePriority() != null)
            sb.append("QueuePriority: ").append(getQueuePriority()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Contact == false)
            return false;
        Contact other = (Contact) obj;
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        if (other.getLastUpdateTimestamp() == null ^ this.getLastUpdateTimestamp() == null)
            return false;
        if (other.getLastUpdateTimestamp() != null && other.getLastUpdateTimestamp().equals(this.getLastUpdateTimestamp()) == false)
            return false;
        if (other.getLastPausedTimestamp() == null ^ this.getLastPausedTimestamp() == null)
            return false;
        if (other.getLastPausedTimestamp() != null && other.getLastPausedTimestamp().equals(this.getLastPausedTimestamp()) == false)
            return false;
        if (other.getLastResumedTimestamp() == null ^ this.getLastResumedTimestamp() == null)
            return false;
        if (other.getLastResumedTimestamp() != null && other.getLastResumedTimestamp().equals(this.getLastResumedTimestamp()) == false)
            return false;
        if (other.getTotalPauseCount() == null ^ this.getTotalPauseCount() == null)
            return false;
        if (other.getTotalPauseCount() != null && other.getTotalPauseCount().equals(this.getTotalPauseCount()) == false)
            return false;
        if (other.getTotalPauseDurationInSeconds() == null ^ this.getTotalPauseDurationInSeconds() == null)
            return false;
        if (other.getTotalPauseDurationInSeconds() != null && other.getTotalPauseDurationInSeconds().equals(this.getTotalPauseDurationInSeconds()) == false)
            return false;
        if (other.getScheduledTimestamp() == null ^ this.getScheduledTimestamp() == null)
            return false;
        if (other.getScheduledTimestamp() != null && other.getScheduledTimestamp().equals(this.getScheduledTimestamp()) == false)
            return false;
        if (other.getRelatedContactId() == null ^ this.getRelatedContactId() == null)
            return false;
        if (other.getRelatedContactId() != null && other.getRelatedContactId().equals(this.getRelatedContactId()) == false)
            return false;
        if (other.getWisdomInfo() == null ^ this.getWisdomInfo() == null)
            return false;
        if (other.getWisdomInfo() != null && other.getWisdomInfo().equals(this.getWisdomInfo()) == false)
            return false;
        if (other.getQueueTimeAdjustmentSeconds() == null ^ this.getQueueTimeAdjustmentSeconds() == null)
            return false;
        if (other.getQueueTimeAdjustmentSeconds() != null && other.getQueueTimeAdjustmentSeconds().equals(this.getQueueTimeAdjustmentSeconds()) == false)
            return false;
        if (other.getQueuePriority() == null ^ this.getQueuePriority() == null)
            return false;
        if (other.getQueuePriority() != null && other.getQueuePriority().equals(this.getQueuePriority()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getQueueInfo() == null) ? 0 : getQueueInfo().hashCode());
        hashCode = prime * hashCode + ((getAgentInfo() == null) ? 0 : getAgentInfo().hashCode());
        hashCode = prime * hashCode + ((getInitiationTimestamp() == null) ? 0 : getInitiationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDisconnectTimestamp() == null) ? 0 : getDisconnectTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTimestamp() == null) ? 0 : getLastUpdateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastPausedTimestamp() == null) ? 0 : getLastPausedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastResumedTimestamp() == null) ? 0 : getLastResumedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTotalPauseCount() == null) ? 0 : getTotalPauseCount().hashCode());
        hashCode = prime * hashCode + ((getTotalPauseDurationInSeconds() == null) ? 0 : getTotalPauseDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getScheduledTimestamp() == null) ? 0 : getScheduledTimestamp().hashCode());
        hashCode = prime * hashCode + ((getRelatedContactId() == null) ? 0 : getRelatedContactId().hashCode());
        hashCode = prime * hashCode + ((getWisdomInfo() == null) ? 0 : getWisdomInfo().hashCode());
        hashCode = prime * hashCode + ((getQueueTimeAdjustmentSeconds() == null) ? 0 : getQueueTimeAdjustmentSeconds().hashCode());
        hashCode = prime * hashCode + ((getQueuePriority() == null) ? 0 : getQueuePriority().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Contact clone() {
        try {
            return (Contact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ContactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
