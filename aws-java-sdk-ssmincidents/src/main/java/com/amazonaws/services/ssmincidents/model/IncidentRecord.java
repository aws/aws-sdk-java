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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The record of the incident that's created when an incident occurs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/IncidentRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncidentRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The runbook, or automation document, that's run at the beginning of the incident.
     * </p>
     */
    private java.util.List<AutomationExecution> automationExecutions;
    /**
     * <p>
     * The chat channel used for collaboration during an incident.
     * </p>
     */
    private ChatChannel chatChannel;
    /**
     * <p>
     * The time that Incident Manager created the incident record.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The string Incident Manager uses to prevent duplicate incidents from being created by the same incident.
     * </p>
     */
    private String dedupeString;
    /**
     * <p>
     * The impact of the incident on customers and applications.
     * </p>
     */
    private Integer impact;
    /**
     * <p>
     * Details about the action that started the incident.
     * </p>
     */
    private IncidentRecordSource incidentRecordSource;
    /**
     * <p>
     * Who modified the incident most recently.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The time at which the incident was most recently modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident record.
     * </p>
     */
    private java.util.List<NotificationTargetItem> notificationTargets;
    /**
     * <p>
     * The time at which the incident was resolved. This appears as a timeline event.
     * </p>
     */
    private java.util.Date resolvedTime;
    /**
     * <p>
     * The current status of the incident.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The summary of the incident. The summary is a brief synopsis of what occurred, what is currently happening, and
     * context.
     * </p>
     */
    private String summary;
    /**
     * <p>
     * The title of the incident.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the incident record.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the incident record.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the incident record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The runbook, or automation document, that's run at the beginning of the incident.
     * </p>
     * 
     * @return The runbook, or automation document, that's run at the beginning of the incident.
     */

    public java.util.List<AutomationExecution> getAutomationExecutions() {
        return automationExecutions;
    }

    /**
     * <p>
     * The runbook, or automation document, that's run at the beginning of the incident.
     * </p>
     * 
     * @param automationExecutions
     *        The runbook, or automation document, that's run at the beginning of the incident.
     */

    public void setAutomationExecutions(java.util.Collection<AutomationExecution> automationExecutions) {
        if (automationExecutions == null) {
            this.automationExecutions = null;
            return;
        }

        this.automationExecutions = new java.util.ArrayList<AutomationExecution>(automationExecutions);
    }

    /**
     * <p>
     * The runbook, or automation document, that's run at the beginning of the incident.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutomationExecutions(java.util.Collection)} or {@link #withAutomationExecutions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param automationExecutions
     *        The runbook, or automation document, that's run at the beginning of the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withAutomationExecutions(AutomationExecution... automationExecutions) {
        if (this.automationExecutions == null) {
            setAutomationExecutions(new java.util.ArrayList<AutomationExecution>(automationExecutions.length));
        }
        for (AutomationExecution ele : automationExecutions) {
            this.automationExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The runbook, or automation document, that's run at the beginning of the incident.
     * </p>
     * 
     * @param automationExecutions
     *        The runbook, or automation document, that's run at the beginning of the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withAutomationExecutions(java.util.Collection<AutomationExecution> automationExecutions) {
        setAutomationExecutions(automationExecutions);
        return this;
    }

    /**
     * <p>
     * The chat channel used for collaboration during an incident.
     * </p>
     * 
     * @param chatChannel
     *        The chat channel used for collaboration during an incident.
     */

    public void setChatChannel(ChatChannel chatChannel) {
        this.chatChannel = chatChannel;
    }

    /**
     * <p>
     * The chat channel used for collaboration during an incident.
     * </p>
     * 
     * @return The chat channel used for collaboration during an incident.
     */

    public ChatChannel getChatChannel() {
        return this.chatChannel;
    }

    /**
     * <p>
     * The chat channel used for collaboration during an incident.
     * </p>
     * 
     * @param chatChannel
     *        The chat channel used for collaboration during an incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withChatChannel(ChatChannel chatChannel) {
        setChatChannel(chatChannel);
        return this;
    }

    /**
     * <p>
     * The time that Incident Manager created the incident record.
     * </p>
     * 
     * @param creationTime
     *        The time that Incident Manager created the incident record.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that Incident Manager created the incident record.
     * </p>
     * 
     * @return The time that Incident Manager created the incident record.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that Incident Manager created the incident record.
     * </p>
     * 
     * @param creationTime
     *        The time that Incident Manager created the incident record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The string Incident Manager uses to prevent duplicate incidents from being created by the same incident.
     * </p>
     * 
     * @param dedupeString
     *        The string Incident Manager uses to prevent duplicate incidents from being created by the same incident.
     */

    public void setDedupeString(String dedupeString) {
        this.dedupeString = dedupeString;
    }

    /**
     * <p>
     * The string Incident Manager uses to prevent duplicate incidents from being created by the same incident.
     * </p>
     * 
     * @return The string Incident Manager uses to prevent duplicate incidents from being created by the same incident.
     */

    public String getDedupeString() {
        return this.dedupeString;
    }

    /**
     * <p>
     * The string Incident Manager uses to prevent duplicate incidents from being created by the same incident.
     * </p>
     * 
     * @param dedupeString
     *        The string Incident Manager uses to prevent duplicate incidents from being created by the same incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withDedupeString(String dedupeString) {
        setDedupeString(dedupeString);
        return this;
    }

    /**
     * <p>
     * The impact of the incident on customers and applications.
     * </p>
     * 
     * @param impact
     *        The impact of the incident on customers and applications.
     */

    public void setImpact(Integer impact) {
        this.impact = impact;
    }

    /**
     * <p>
     * The impact of the incident on customers and applications.
     * </p>
     * 
     * @return The impact of the incident on customers and applications.
     */

    public Integer getImpact() {
        return this.impact;
    }

    /**
     * <p>
     * The impact of the incident on customers and applications.
     * </p>
     * 
     * @param impact
     *        The impact of the incident on customers and applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withImpact(Integer impact) {
        setImpact(impact);
        return this;
    }

    /**
     * <p>
     * Details about the action that started the incident.
     * </p>
     * 
     * @param incidentRecordSource
     *        Details about the action that started the incident.
     */

    public void setIncidentRecordSource(IncidentRecordSource incidentRecordSource) {
        this.incidentRecordSource = incidentRecordSource;
    }

    /**
     * <p>
     * Details about the action that started the incident.
     * </p>
     * 
     * @return Details about the action that started the incident.
     */

    public IncidentRecordSource getIncidentRecordSource() {
        return this.incidentRecordSource;
    }

    /**
     * <p>
     * Details about the action that started the incident.
     * </p>
     * 
     * @param incidentRecordSource
     *        Details about the action that started the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withIncidentRecordSource(IncidentRecordSource incidentRecordSource) {
        setIncidentRecordSource(incidentRecordSource);
        return this;
    }

    /**
     * <p>
     * Who modified the incident most recently.
     * </p>
     * 
     * @param lastModifiedBy
     *        Who modified the incident most recently.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * Who modified the incident most recently.
     * </p>
     * 
     * @return Who modified the incident most recently.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * Who modified the incident most recently.
     * </p>
     * 
     * @param lastModifiedBy
     *        Who modified the incident most recently.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The time at which the incident was most recently modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time at which the incident was most recently modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time at which the incident was most recently modified.
     * </p>
     * 
     * @return The time at which the incident was most recently modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time at which the incident was most recently modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time at which the incident was most recently modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident record.
     * </p>
     * 
     * @return The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident
     *         record.
     */

    public java.util.List<NotificationTargetItem> getNotificationTargets() {
        return notificationTargets;
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident record.
     * </p>
     * 
     * @param notificationTargets
     *        The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident
     *        record.
     */

    public void setNotificationTargets(java.util.Collection<NotificationTargetItem> notificationTargets) {
        if (notificationTargets == null) {
            this.notificationTargets = null;
            return;
        }

        this.notificationTargets = new java.util.ArrayList<NotificationTargetItem>(notificationTargets);
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident record.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationTargets(java.util.Collection)} or {@link #withNotificationTargets(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param notificationTargets
     *        The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident
     *        record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withNotificationTargets(NotificationTargetItem... notificationTargets) {
        if (this.notificationTargets == null) {
            setNotificationTargets(new java.util.ArrayList<NotificationTargetItem>(notificationTargets.length));
        }
        for (NotificationTargetItem ele : notificationTargets) {
            this.notificationTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident record.
     * </p>
     * 
     * @param notificationTargets
     *        The SNS targets that AWS Chatbot uses to notify the chat channels and perform actions on the incident
     *        record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withNotificationTargets(java.util.Collection<NotificationTargetItem> notificationTargets) {
        setNotificationTargets(notificationTargets);
        return this;
    }

    /**
     * <p>
     * The time at which the incident was resolved. This appears as a timeline event.
     * </p>
     * 
     * @param resolvedTime
     *        The time at which the incident was resolved. This appears as a timeline event.
     */

    public void setResolvedTime(java.util.Date resolvedTime) {
        this.resolvedTime = resolvedTime;
    }

    /**
     * <p>
     * The time at which the incident was resolved. This appears as a timeline event.
     * </p>
     * 
     * @return The time at which the incident was resolved. This appears as a timeline event.
     */

    public java.util.Date getResolvedTime() {
        return this.resolvedTime;
    }

    /**
     * <p>
     * The time at which the incident was resolved. This appears as a timeline event.
     * </p>
     * 
     * @param resolvedTime
     *        The time at which the incident was resolved. This appears as a timeline event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withResolvedTime(java.util.Date resolvedTime) {
        setResolvedTime(resolvedTime);
        return this;
    }

    /**
     * <p>
     * The current status of the incident.
     * </p>
     * 
     * @param status
     *        The current status of the incident.
     * @see IncidentRecordStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the incident.
     * </p>
     * 
     * @return The current status of the incident.
     * @see IncidentRecordStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the incident.
     * </p>
     * 
     * @param status
     *        The current status of the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IncidentRecordStatus
     */

    public IncidentRecord withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the incident.
     * </p>
     * 
     * @param status
     *        The current status of the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IncidentRecordStatus
     */

    public IncidentRecord withStatus(IncidentRecordStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The summary of the incident. The summary is a brief synopsis of what occurred, what is currently happening, and
     * context.
     * </p>
     * 
     * @param summary
     *        The summary of the incident. The summary is a brief synopsis of what occurred, what is currently
     *        happening, and context.
     */

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * The summary of the incident. The summary is a brief synopsis of what occurred, what is currently happening, and
     * context.
     * </p>
     * 
     * @return The summary of the incident. The summary is a brief synopsis of what occurred, what is currently
     *         happening, and context.
     */

    public String getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * The summary of the incident. The summary is a brief synopsis of what occurred, what is currently happening, and
     * context.
     * </p>
     * 
     * @param summary
     *        The summary of the incident. The summary is a brief synopsis of what occurred, what is currently
     *        happening, and context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withSummary(String summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * The title of the incident.
     * </p>
     * 
     * @param title
     *        The title of the incident.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the incident.
     * </p>
     * 
     * @return The title of the incident.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the incident.
     * </p>
     * 
     * @param title
     *        The title of the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecord withTitle(String title) {
        setTitle(title);
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
        if (getAutomationExecutions() != null)
            sb.append("AutomationExecutions: ").append(getAutomationExecutions()).append(",");
        if (getChatChannel() != null)
            sb.append("ChatChannel: ").append(getChatChannel()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDedupeString() != null)
            sb.append("DedupeString: ").append(getDedupeString()).append(",");
        if (getImpact() != null)
            sb.append("Impact: ").append(getImpact()).append(",");
        if (getIncidentRecordSource() != null)
            sb.append("IncidentRecordSource: ").append(getIncidentRecordSource()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getNotificationTargets() != null)
            sb.append("NotificationTargets: ").append(getNotificationTargets()).append(",");
        if (getResolvedTime() != null)
            sb.append("ResolvedTime: ").append(getResolvedTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IncidentRecord == false)
            return false;
        IncidentRecord other = (IncidentRecord) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAutomationExecutions() == null ^ this.getAutomationExecutions() == null)
            return false;
        if (other.getAutomationExecutions() != null && other.getAutomationExecutions().equals(this.getAutomationExecutions()) == false)
            return false;
        if (other.getChatChannel() == null ^ this.getChatChannel() == null)
            return false;
        if (other.getChatChannel() != null && other.getChatChannel().equals(this.getChatChannel()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDedupeString() == null ^ this.getDedupeString() == null)
            return false;
        if (other.getDedupeString() != null && other.getDedupeString().equals(this.getDedupeString()) == false)
            return false;
        if (other.getImpact() == null ^ this.getImpact() == null)
            return false;
        if (other.getImpact() != null && other.getImpact().equals(this.getImpact()) == false)
            return false;
        if (other.getIncidentRecordSource() == null ^ this.getIncidentRecordSource() == null)
            return false;
        if (other.getIncidentRecordSource() != null && other.getIncidentRecordSource().equals(this.getIncidentRecordSource()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getNotificationTargets() == null ^ this.getNotificationTargets() == null)
            return false;
        if (other.getNotificationTargets() != null && other.getNotificationTargets().equals(this.getNotificationTargets()) == false)
            return false;
        if (other.getResolvedTime() == null ^ this.getResolvedTime() == null)
            return false;
        if (other.getResolvedTime() != null && other.getResolvedTime().equals(this.getResolvedTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAutomationExecutions() == null) ? 0 : getAutomationExecutions().hashCode());
        hashCode = prime * hashCode + ((getChatChannel() == null) ? 0 : getChatChannel().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDedupeString() == null) ? 0 : getDedupeString().hashCode());
        hashCode = prime * hashCode + ((getImpact() == null) ? 0 : getImpact().hashCode());
        hashCode = prime * hashCode + ((getIncidentRecordSource() == null) ? 0 : getIncidentRecordSource().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getNotificationTargets() == null) ? 0 : getNotificationTargets().hashCode());
        hashCode = prime * hashCode + ((getResolvedTime() == null) ? 0 : getResolvedTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public IncidentRecord clone() {
        try {
            return (IncidentRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.IncidentRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
