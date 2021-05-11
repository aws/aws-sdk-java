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
 * Incident Manager engaging a contact's contact channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/Page" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Page implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the page to the contact channel.
     * </p>
     */
    private String pageArn;
    /**
     * <p>
     * The ARN of the engagement that this page is part of.
     * </p>
     */
    private String engagementArn;
    /**
     * <p>
     * The ARN of the contact that Incident Manager is engaging.
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
     * The ARN of the incident that's engaging the contact channel.
     * </p>
     */
    private String incidentId;
    /**
     * <p>
     * The time that Incident Manager engaged the contact channel.
     * </p>
     */
    private java.util.Date sentTime;
    /**
     * <p>
     * The time the message was delivered to the contact channel.
     * </p>
     */
    private java.util.Date deliveryTime;
    /**
     * <p>
     * The time that the contact channel acknowledged engagement.
     * </p>
     */
    private java.util.Date readTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the page to the contact channel.
     * </p>
     * 
     * @param pageArn
     *        The Amazon Resource Name (ARN) of the page to the contact channel.
     */

    public void setPageArn(String pageArn) {
        this.pageArn = pageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the page to the contact channel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the page to the contact channel.
     */

    public String getPageArn() {
        return this.pageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the page to the contact channel.
     * </p>
     * 
     * @param pageArn
     *        The Amazon Resource Name (ARN) of the page to the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Page withPageArn(String pageArn) {
        setPageArn(pageArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the engagement that this page is part of.
     * </p>
     * 
     * @param engagementArn
     *        The ARN of the engagement that this page is part of.
     */

    public void setEngagementArn(String engagementArn) {
        this.engagementArn = engagementArn;
    }

    /**
     * <p>
     * The ARN of the engagement that this page is part of.
     * </p>
     * 
     * @return The ARN of the engagement that this page is part of.
     */

    public String getEngagementArn() {
        return this.engagementArn;
    }

    /**
     * <p>
     * The ARN of the engagement that this page is part of.
     * </p>
     * 
     * @param engagementArn
     *        The ARN of the engagement that this page is part of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Page withEngagementArn(String engagementArn) {
        setEngagementArn(engagementArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the contact that Incident Manager is engaging.
     * </p>
     * 
     * @param contactArn
     *        The ARN of the contact that Incident Manager is engaging.
     */

    public void setContactArn(String contactArn) {
        this.contactArn = contactArn;
    }

    /**
     * <p>
     * The ARN of the contact that Incident Manager is engaging.
     * </p>
     * 
     * @return The ARN of the contact that Incident Manager is engaging.
     */

    public String getContactArn() {
        return this.contactArn;
    }

    /**
     * <p>
     * The ARN of the contact that Incident Manager is engaging.
     * </p>
     * 
     * @param contactArn
     *        The ARN of the contact that Incident Manager is engaging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Page withContactArn(String contactArn) {
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

    public Page withSender(String sender) {
        setSender(sender);
        return this;
    }

    /**
     * <p>
     * The ARN of the incident that's engaging the contact channel.
     * </p>
     * 
     * @param incidentId
     *        The ARN of the incident that's engaging the contact channel.
     */

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    /**
     * <p>
     * The ARN of the incident that's engaging the contact channel.
     * </p>
     * 
     * @return The ARN of the incident that's engaging the contact channel.
     */

    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * <p>
     * The ARN of the incident that's engaging the contact channel.
     * </p>
     * 
     * @param incidentId
     *        The ARN of the incident that's engaging the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Page withIncidentId(String incidentId) {
        setIncidentId(incidentId);
        return this;
    }

    /**
     * <p>
     * The time that Incident Manager engaged the contact channel.
     * </p>
     * 
     * @param sentTime
     *        The time that Incident Manager engaged the contact channel.
     */

    public void setSentTime(java.util.Date sentTime) {
        this.sentTime = sentTime;
    }

    /**
     * <p>
     * The time that Incident Manager engaged the contact channel.
     * </p>
     * 
     * @return The time that Incident Manager engaged the contact channel.
     */

    public java.util.Date getSentTime() {
        return this.sentTime;
    }

    /**
     * <p>
     * The time that Incident Manager engaged the contact channel.
     * </p>
     * 
     * @param sentTime
     *        The time that Incident Manager engaged the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Page withSentTime(java.util.Date sentTime) {
        setSentTime(sentTime);
        return this;
    }

    /**
     * <p>
     * The time the message was delivered to the contact channel.
     * </p>
     * 
     * @param deliveryTime
     *        The time the message was delivered to the contact channel.
     */

    public void setDeliveryTime(java.util.Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * <p>
     * The time the message was delivered to the contact channel.
     * </p>
     * 
     * @return The time the message was delivered to the contact channel.
     */

    public java.util.Date getDeliveryTime() {
        return this.deliveryTime;
    }

    /**
     * <p>
     * The time the message was delivered to the contact channel.
     * </p>
     * 
     * @param deliveryTime
     *        The time the message was delivered to the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Page withDeliveryTime(java.util.Date deliveryTime) {
        setDeliveryTime(deliveryTime);
        return this;
    }

    /**
     * <p>
     * The time that the contact channel acknowledged engagement.
     * </p>
     * 
     * @param readTime
     *        The time that the contact channel acknowledged engagement.
     */

    public void setReadTime(java.util.Date readTime) {
        this.readTime = readTime;
    }

    /**
     * <p>
     * The time that the contact channel acknowledged engagement.
     * </p>
     * 
     * @return The time that the contact channel acknowledged engagement.
     */

    public java.util.Date getReadTime() {
        return this.readTime;
    }

    /**
     * <p>
     * The time that the contact channel acknowledged engagement.
     * </p>
     * 
     * @param readTime
     *        The time that the contact channel acknowledged engagement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Page withReadTime(java.util.Date readTime) {
        setReadTime(readTime);
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
        if (getPageArn() != null)
            sb.append("PageArn: ").append(getPageArn()).append(",");
        if (getEngagementArn() != null)
            sb.append("EngagementArn: ").append(getEngagementArn()).append(",");
        if (getContactArn() != null)
            sb.append("ContactArn: ").append(getContactArn()).append(",");
        if (getSender() != null)
            sb.append("Sender: ").append(getSender()).append(",");
        if (getIncidentId() != null)
            sb.append("IncidentId: ").append(getIncidentId()).append(",");
        if (getSentTime() != null)
            sb.append("SentTime: ").append(getSentTime()).append(",");
        if (getDeliveryTime() != null)
            sb.append("DeliveryTime: ").append(getDeliveryTime()).append(",");
        if (getReadTime() != null)
            sb.append("ReadTime: ").append(getReadTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Page == false)
            return false;
        Page other = (Page) obj;
        if (other.getPageArn() == null ^ this.getPageArn() == null)
            return false;
        if (other.getPageArn() != null && other.getPageArn().equals(this.getPageArn()) == false)
            return false;
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
        if (other.getSentTime() == null ^ this.getSentTime() == null)
            return false;
        if (other.getSentTime() != null && other.getSentTime().equals(this.getSentTime()) == false)
            return false;
        if (other.getDeliveryTime() == null ^ this.getDeliveryTime() == null)
            return false;
        if (other.getDeliveryTime() != null && other.getDeliveryTime().equals(this.getDeliveryTime()) == false)
            return false;
        if (other.getReadTime() == null ^ this.getReadTime() == null)
            return false;
        if (other.getReadTime() != null && other.getReadTime().equals(this.getReadTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageArn() == null) ? 0 : getPageArn().hashCode());
        hashCode = prime * hashCode + ((getEngagementArn() == null) ? 0 : getEngagementArn().hashCode());
        hashCode = prime * hashCode + ((getContactArn() == null) ? 0 : getContactArn().hashCode());
        hashCode = prime * hashCode + ((getSender() == null) ? 0 : getSender().hashCode());
        hashCode = prime * hashCode + ((getIncidentId() == null) ? 0 : getIncidentId().hashCode());
        hashCode = prime * hashCode + ((getSentTime() == null) ? 0 : getSentTime().hashCode());
        hashCode = prime * hashCode + ((getDeliveryTime() == null) ? 0 : getDeliveryTime().hashCode());
        hashCode = prime * hashCode + ((getReadTime() == null) ? 0 : getReadTime().hashCode());
        return hashCode;
    }

    @Override
    public Page clone() {
        try {
            return (Page) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.PageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
