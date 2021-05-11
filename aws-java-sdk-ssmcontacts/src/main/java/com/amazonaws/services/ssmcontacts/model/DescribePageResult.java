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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DescribePage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * </p>
     */
    private String pageArn;
    /**
     * <p>
     * The ARN of the engagement that engaged the contact channel.
     * </p>
     */
    private String engagementArn;
    /**
     * <p>
     * The ARN of the contact that was engaged.
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
     * The secure subject of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> and <code>EMAIL</code>.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * The secure content of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> and <code>EMAIL</code>.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The insecure subject of the message that was sent to the contact. Use this field for engagements to
     * <code>SMS</code>.
     * </p>
     */
    private String publicSubject;
    /**
     * <p>
     * The insecure content of the message that was sent to the contact. Use this field for engagements to
     * <code>SMS</code>.
     * </p>
     */
    private String publicContent;
    /**
     * <p>
     * The ARN of the incident that engaged the contact channel.
     * </p>
     */
    private String incidentId;
    /**
     * <p>
     * The time the engagement was sent to the contact channel.
     * </p>
     */
    private java.util.Date sentTime;
    /**
     * <p>
     * The time that the contact channel acknowledged the engagement.
     * </p>
     */
    private java.util.Date readTime;
    /**
     * <p>
     * The time that the contact channel received the engagement.
     * </p>
     */
    private java.util.Date deliveryTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * </p>
     * 
     * @param pageArn
     *        The Amazon Resource Name (ARN) of the engagement to a contact channel.
     */

    public void setPageArn(String pageArn) {
        this.pageArn = pageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the engagement to a contact channel.
     */

    public String getPageArn() {
        return this.pageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * </p>
     * 
     * @param pageArn
     *        The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePageResult withPageArn(String pageArn) {
        setPageArn(pageArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the engagement that engaged the contact channel.
     * </p>
     * 
     * @param engagementArn
     *        The ARN of the engagement that engaged the contact channel.
     */

    public void setEngagementArn(String engagementArn) {
        this.engagementArn = engagementArn;
    }

    /**
     * <p>
     * The ARN of the engagement that engaged the contact channel.
     * </p>
     * 
     * @return The ARN of the engagement that engaged the contact channel.
     */

    public String getEngagementArn() {
        return this.engagementArn;
    }

    /**
     * <p>
     * The ARN of the engagement that engaged the contact channel.
     * </p>
     * 
     * @param engagementArn
     *        The ARN of the engagement that engaged the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePageResult withEngagementArn(String engagementArn) {
        setEngagementArn(engagementArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the contact that was engaged.
     * </p>
     * 
     * @param contactArn
     *        The ARN of the contact that was engaged.
     */

    public void setContactArn(String contactArn) {
        this.contactArn = contactArn;
    }

    /**
     * <p>
     * The ARN of the contact that was engaged.
     * </p>
     * 
     * @return The ARN of the contact that was engaged.
     */

    public String getContactArn() {
        return this.contactArn;
    }

    /**
     * <p>
     * The ARN of the contact that was engaged.
     * </p>
     * 
     * @param contactArn
     *        The ARN of the contact that was engaged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePageResult withContactArn(String contactArn) {
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

    public DescribePageResult withSender(String sender) {
        setSender(sender);
        return this;
    }

    /**
     * <p>
     * The secure subject of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> and <code>EMAIL</code>.
     * </p>
     * 
     * @param subject
     *        The secure subject of the message that was sent to the contact. Use this field for engagements to
     *        <code>VOICE</code> and <code>EMAIL</code>.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The secure subject of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> and <code>EMAIL</code>.
     * </p>
     * 
     * @return The secure subject of the message that was sent to the contact. Use this field for engagements to
     *         <code>VOICE</code> and <code>EMAIL</code>.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The secure subject of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> and <code>EMAIL</code>.
     * </p>
     * 
     * @param subject
     *        The secure subject of the message that was sent to the contact. Use this field for engagements to
     *        <code>VOICE</code> and <code>EMAIL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePageResult withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The secure content of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> and <code>EMAIL</code>.
     * </p>
     * 
     * @param content
     *        The secure content of the message that was sent to the contact. Use this field for engagements to
     *        <code>VOICE</code> and <code>EMAIL</code>.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The secure content of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> and <code>EMAIL</code>.
     * </p>
     * 
     * @return The secure content of the message that was sent to the contact. Use this field for engagements to
     *         <code>VOICE</code> and <code>EMAIL</code>.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The secure content of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> and <code>EMAIL</code>.
     * </p>
     * 
     * @param content
     *        The secure content of the message that was sent to the contact. Use this field for engagements to
     *        <code>VOICE</code> and <code>EMAIL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePageResult withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The insecure subject of the message that was sent to the contact. Use this field for engagements to
     * <code>SMS</code>.
     * </p>
     * 
     * @param publicSubject
     *        The insecure subject of the message that was sent to the contact. Use this field for engagements to
     *        <code>SMS</code>.
     */

    public void setPublicSubject(String publicSubject) {
        this.publicSubject = publicSubject;
    }

    /**
     * <p>
     * The insecure subject of the message that was sent to the contact. Use this field for engagements to
     * <code>SMS</code>.
     * </p>
     * 
     * @return The insecure subject of the message that was sent to the contact. Use this field for engagements to
     *         <code>SMS</code>.
     */

    public String getPublicSubject() {
        return this.publicSubject;
    }

    /**
     * <p>
     * The insecure subject of the message that was sent to the contact. Use this field for engagements to
     * <code>SMS</code>.
     * </p>
     * 
     * @param publicSubject
     *        The insecure subject of the message that was sent to the contact. Use this field for engagements to
     *        <code>SMS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePageResult withPublicSubject(String publicSubject) {
        setPublicSubject(publicSubject);
        return this;
    }

    /**
     * <p>
     * The insecure content of the message that was sent to the contact. Use this field for engagements to
     * <code>SMS</code>.
     * </p>
     * 
     * @param publicContent
     *        The insecure content of the message that was sent to the contact. Use this field for engagements to
     *        <code>SMS</code>.
     */

    public void setPublicContent(String publicContent) {
        this.publicContent = publicContent;
    }

    /**
     * <p>
     * The insecure content of the message that was sent to the contact. Use this field for engagements to
     * <code>SMS</code>.
     * </p>
     * 
     * @return The insecure content of the message that was sent to the contact. Use this field for engagements to
     *         <code>SMS</code>.
     */

    public String getPublicContent() {
        return this.publicContent;
    }

    /**
     * <p>
     * The insecure content of the message that was sent to the contact. Use this field for engagements to
     * <code>SMS</code>.
     * </p>
     * 
     * @param publicContent
     *        The insecure content of the message that was sent to the contact. Use this field for engagements to
     *        <code>SMS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePageResult withPublicContent(String publicContent) {
        setPublicContent(publicContent);
        return this;
    }

    /**
     * <p>
     * The ARN of the incident that engaged the contact channel.
     * </p>
     * 
     * @param incidentId
     *        The ARN of the incident that engaged the contact channel.
     */

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    /**
     * <p>
     * The ARN of the incident that engaged the contact channel.
     * </p>
     * 
     * @return The ARN of the incident that engaged the contact channel.
     */

    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * <p>
     * The ARN of the incident that engaged the contact channel.
     * </p>
     * 
     * @param incidentId
     *        The ARN of the incident that engaged the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePageResult withIncidentId(String incidentId) {
        setIncidentId(incidentId);
        return this;
    }

    /**
     * <p>
     * The time the engagement was sent to the contact channel.
     * </p>
     * 
     * @param sentTime
     *        The time the engagement was sent to the contact channel.
     */

    public void setSentTime(java.util.Date sentTime) {
        this.sentTime = sentTime;
    }

    /**
     * <p>
     * The time the engagement was sent to the contact channel.
     * </p>
     * 
     * @return The time the engagement was sent to the contact channel.
     */

    public java.util.Date getSentTime() {
        return this.sentTime;
    }

    /**
     * <p>
     * The time the engagement was sent to the contact channel.
     * </p>
     * 
     * @param sentTime
     *        The time the engagement was sent to the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePageResult withSentTime(java.util.Date sentTime) {
        setSentTime(sentTime);
        return this;
    }

    /**
     * <p>
     * The time that the contact channel acknowledged the engagement.
     * </p>
     * 
     * @param readTime
     *        The time that the contact channel acknowledged the engagement.
     */

    public void setReadTime(java.util.Date readTime) {
        this.readTime = readTime;
    }

    /**
     * <p>
     * The time that the contact channel acknowledged the engagement.
     * </p>
     * 
     * @return The time that the contact channel acknowledged the engagement.
     */

    public java.util.Date getReadTime() {
        return this.readTime;
    }

    /**
     * <p>
     * The time that the contact channel acknowledged the engagement.
     * </p>
     * 
     * @param readTime
     *        The time that the contact channel acknowledged the engagement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePageResult withReadTime(java.util.Date readTime) {
        setReadTime(readTime);
        return this;
    }

    /**
     * <p>
     * The time that the contact channel received the engagement.
     * </p>
     * 
     * @param deliveryTime
     *        The time that the contact channel received the engagement.
     */

    public void setDeliveryTime(java.util.Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * <p>
     * The time that the contact channel received the engagement.
     * </p>
     * 
     * @return The time that the contact channel received the engagement.
     */

    public java.util.Date getDeliveryTime() {
        return this.deliveryTime;
    }

    /**
     * <p>
     * The time that the contact channel received the engagement.
     * </p>
     * 
     * @param deliveryTime
     *        The time that the contact channel received the engagement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePageResult withDeliveryTime(java.util.Date deliveryTime) {
        setDeliveryTime(deliveryTime);
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
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getPublicSubject() != null)
            sb.append("PublicSubject: ").append(getPublicSubject()).append(",");
        if (getPublicContent() != null)
            sb.append("PublicContent: ").append(getPublicContent()).append(",");
        if (getIncidentId() != null)
            sb.append("IncidentId: ").append(getIncidentId()).append(",");
        if (getSentTime() != null)
            sb.append("SentTime: ").append(getSentTime()).append(",");
        if (getReadTime() != null)
            sb.append("ReadTime: ").append(getReadTime()).append(",");
        if (getDeliveryTime() != null)
            sb.append("DeliveryTime: ").append(getDeliveryTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePageResult == false)
            return false;
        DescribePageResult other = (DescribePageResult) obj;
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
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getPublicSubject() == null ^ this.getPublicSubject() == null)
            return false;
        if (other.getPublicSubject() != null && other.getPublicSubject().equals(this.getPublicSubject()) == false)
            return false;
        if (other.getPublicContent() == null ^ this.getPublicContent() == null)
            return false;
        if (other.getPublicContent() != null && other.getPublicContent().equals(this.getPublicContent()) == false)
            return false;
        if (other.getIncidentId() == null ^ this.getIncidentId() == null)
            return false;
        if (other.getIncidentId() != null && other.getIncidentId().equals(this.getIncidentId()) == false)
            return false;
        if (other.getSentTime() == null ^ this.getSentTime() == null)
            return false;
        if (other.getSentTime() != null && other.getSentTime().equals(this.getSentTime()) == false)
            return false;
        if (other.getReadTime() == null ^ this.getReadTime() == null)
            return false;
        if (other.getReadTime() != null && other.getReadTime().equals(this.getReadTime()) == false)
            return false;
        if (other.getDeliveryTime() == null ^ this.getDeliveryTime() == null)
            return false;
        if (other.getDeliveryTime() != null && other.getDeliveryTime().equals(this.getDeliveryTime()) == false)
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
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getPublicSubject() == null) ? 0 : getPublicSubject().hashCode());
        hashCode = prime * hashCode + ((getPublicContent() == null) ? 0 : getPublicContent().hashCode());
        hashCode = prime * hashCode + ((getIncidentId() == null) ? 0 : getIncidentId().hashCode());
        hashCode = prime * hashCode + ((getSentTime() == null) ? 0 : getSentTime().hashCode());
        hashCode = prime * hashCode + ((getReadTime() == null) ? 0 : getReadTime().hashCode());
        hashCode = prime * hashCode + ((getDeliveryTime() == null) ? 0 : getDeliveryTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribePageResult clone() {
        try {
            return (DescribePageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
