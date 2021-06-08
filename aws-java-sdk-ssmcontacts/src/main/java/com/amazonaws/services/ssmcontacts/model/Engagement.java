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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Incident Manager reaching out to a contact or escalation plan to engage contact during an incident.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/Engagement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Engagement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement.
     * </p>
     */
    private String engagementArn;
    /**
     * <p>
     * The ARN of the escalation plan or contact that Incident Manager is engaging.
     * </p>
     */
    private String contactArn;
    /**
     * <p>
     * The user that started the engagement.
     * </p>
     */
    private String sender;
    /**
     * <p>
     * The ARN of the incident that's engaging the contact.
     * </p>
     */
    private String incidentId;
    /**
     * <p>
     * The time that the engagement began.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time that the engagement ended.
     * </p>
     */
    private java.util.Date stopTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement.
     * </p>
     * 
     * @param engagementArn
     *        The Amazon Resource Name (ARN) of the engagement.
     */

    public void setEngagementArn(String engagementArn) {
        this.engagementArn = engagementArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the engagement.
     */

    public String getEngagementArn() {
        return this.engagementArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement.
     * </p>
     * 
     * @param engagementArn
     *        The Amazon Resource Name (ARN) of the engagement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Engagement withEngagementArn(String engagementArn) {
        setEngagementArn(engagementArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the escalation plan or contact that Incident Manager is engaging.
     * </p>
     * 
     * @param contactArn
     *        The ARN of the escalation plan or contact that Incident Manager is engaging.
     */

    public void setContactArn(String contactArn) {
        this.contactArn = contactArn;
    }

    /**
     * <p>
     * The ARN of the escalation plan or contact that Incident Manager is engaging.
     * </p>
     * 
     * @return The ARN of the escalation plan or contact that Incident Manager is engaging.
     */

    public String getContactArn() {
        return this.contactArn;
    }

    /**
     * <p>
     * The ARN of the escalation plan or contact that Incident Manager is engaging.
     * </p>
     * 
     * @param contactArn
     *        The ARN of the escalation plan or contact that Incident Manager is engaging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Engagement withContactArn(String contactArn) {
        setContactArn(contactArn);
        return this;
    }

    /**
     * <p>
     * The user that started the engagement.
     * </p>
     * 
     * @param sender
     *        The user that started the engagement.
     */

    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * <p>
     * The user that started the engagement.
     * </p>
     * 
     * @return The user that started the engagement.
     */

    public String getSender() {
        return this.sender;
    }

    /**
     * <p>
     * The user that started the engagement.
     * </p>
     * 
     * @param sender
     *        The user that started the engagement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Engagement withSender(String sender) {
        setSender(sender);
        return this;
    }

    /**
     * <p>
     * The ARN of the incident that's engaging the contact.
     * </p>
     * 
     * @param incidentId
     *        The ARN of the incident that's engaging the contact.
     */

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    /**
     * <p>
     * The ARN of the incident that's engaging the contact.
     * </p>
     * 
     * @return The ARN of the incident that's engaging the contact.
     */

    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * <p>
     * The ARN of the incident that's engaging the contact.
     * </p>
     * 
     * @param incidentId
     *        The ARN of the incident that's engaging the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Engagement withIncidentId(String incidentId) {
        setIncidentId(incidentId);
        return this;
    }

    /**
     * <p>
     * The time that the engagement began.
     * </p>
     * 
     * @param startTime
     *        The time that the engagement began.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that the engagement began.
     * </p>
     * 
     * @return The time that the engagement began.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time that the engagement began.
     * </p>
     * 
     * @param startTime
     *        The time that the engagement began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Engagement withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time that the engagement ended.
     * </p>
     * 
     * @param stopTime
     *        The time that the engagement ended.
     */

    public void setStopTime(java.util.Date stopTime) {
        this.stopTime = stopTime;
    }

    /**
     * <p>
     * The time that the engagement ended.
     * </p>
     * 
     * @return The time that the engagement ended.
     */

    public java.util.Date getStopTime() {
        return this.stopTime;
    }

    /**
     * <p>
     * The time that the engagement ended.
     * </p>
     * 
     * @param stopTime
     *        The time that the engagement ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Engagement withStopTime(java.util.Date stopTime) {
        setStopTime(stopTime);
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
        if (getEngagementArn() != null)
            sb.append("EngagementArn: ").append(getEngagementArn()).append(",");
        if (getContactArn() != null)
            sb.append("ContactArn: ").append(getContactArn()).append(",");
        if (getSender() != null)
            sb.append("Sender: ").append(getSender()).append(",");
        if (getIncidentId() != null)
            sb.append("IncidentId: ").append(getIncidentId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStopTime() != null)
            sb.append("StopTime: ").append(getStopTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Engagement == false)
            return false;
        Engagement other = (Engagement) obj;
        if (other.getEngagementArn() == null ^ this.getEngagementArn() == null)
            return false;
        if (other.getEngagementArn() != null && other.getEngagementArn().equals(this.getEngagementArn()) == false)
            return false;
        if (other.getContactArn() == null ^ this.getContactArn() == null)
            return false;
        if (other.getContactArn() != null && other.getContactArn().equals(this.getContactArn()) == false)
            return false;
        if (other.getSender() == null ^ this.getSender() == null)
            return false;
        if (other.getSender() != null && other.getSender().equals(this.getSender()) == false)
            return false;
        if (other.getIncidentId() == null ^ this.getIncidentId() == null)
            return false;
        if (other.getIncidentId() != null && other.getIncidentId().equals(this.getIncidentId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStopTime() == null ^ this.getStopTime() == null)
            return false;
        if (other.getStopTime() != null && other.getStopTime().equals(this.getStopTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngagementArn() == null) ? 0 : getEngagementArn().hashCode());
        hashCode = prime * hashCode + ((getContactArn() == null) ? 0 : getContactArn().hashCode());
        hashCode = prime * hashCode + ((getSender() == null) ? 0 : getSender().hashCode());
        hashCode = prime * hashCode + ((getIncidentId() == null) ? 0 : getIncidentId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStopTime() == null) ? 0 : getStopTime().hashCode());
        return hashCode;
    }

    @Override
    public Engagement clone() {
        try {
            return (Engagement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.EngagementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
