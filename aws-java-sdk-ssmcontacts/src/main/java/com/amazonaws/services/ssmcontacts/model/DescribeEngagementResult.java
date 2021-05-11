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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DescribeEngagement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEngagementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the escalation plan or contacts involved in the engagement.
     * </p>
     */
    private String contactArn;
    /**
     * <p>
     * The ARN of the engagement.
     * </p>
     */
    private String engagementArn;
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
     * The ARN of the incident in which the engagement occurred.
     * </p>
     */
    private String incidentId;
    /**
     * <p>
     * The time that the engagement started.
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
     * The ARN of the escalation plan or contacts involved in the engagement.
     * </p>
     * 
     * @param contactArn
     *        The ARN of the escalation plan or contacts involved in the engagement.
     */

    public void setContactArn(String contactArn) {
        this.contactArn = contactArn;
    }

    /**
     * <p>
     * The ARN of the escalation plan or contacts involved in the engagement.
     * </p>
     * 
     * @return The ARN of the escalation plan or contacts involved in the engagement.
     */

    public String getContactArn() {
        return this.contactArn;
    }

    /**
     * <p>
     * The ARN of the escalation plan or contacts involved in the engagement.
     * </p>
     * 
     * @param contactArn
     *        The ARN of the escalation plan or contacts involved in the engagement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngagementResult withContactArn(String contactArn) {
        setContactArn(contactArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the engagement.
     * </p>
     * 
     * @param engagementArn
     *        The ARN of the engagement.
     */

    public void setEngagementArn(String engagementArn) {
        this.engagementArn = engagementArn;
    }

    /**
     * <p>
     * The ARN of the engagement.
     * </p>
     * 
     * @return The ARN of the engagement.
     */

    public String getEngagementArn() {
        return this.engagementArn;
    }

    /**
     * <p>
     * The ARN of the engagement.
     * </p>
     * 
     * @param engagementArn
     *        The ARN of the engagement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngagementResult withEngagementArn(String engagementArn) {
        setEngagementArn(engagementArn);
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

    public DescribeEngagementResult withSender(String sender) {
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

    public DescribeEngagementResult withSubject(String subject) {
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

    public DescribeEngagementResult withContent(String content) {
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

    public DescribeEngagementResult withPublicSubject(String publicSubject) {
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

    public DescribeEngagementResult withPublicContent(String publicContent) {
        setPublicContent(publicContent);
        return this;
    }

    /**
     * <p>
     * The ARN of the incident in which the engagement occurred.
     * </p>
     * 
     * @param incidentId
     *        The ARN of the incident in which the engagement occurred.
     */

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    /**
     * <p>
     * The ARN of the incident in which the engagement occurred.
     * </p>
     * 
     * @return The ARN of the incident in which the engagement occurred.
     */

    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * <p>
     * The ARN of the incident in which the engagement occurred.
     * </p>
     * 
     * @param incidentId
     *        The ARN of the incident in which the engagement occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngagementResult withIncidentId(String incidentId) {
        setIncidentId(incidentId);
        return this;
    }

    /**
     * <p>
     * The time that the engagement started.
     * </p>
     * 
     * @param startTime
     *        The time that the engagement started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that the engagement started.
     * </p>
     * 
     * @return The time that the engagement started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time that the engagement started.
     * </p>
     * 
     * @param startTime
     *        The time that the engagement started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngagementResult withStartTime(java.util.Date startTime) {
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

    public DescribeEngagementResult withStopTime(java.util.Date stopTime) {
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
        if (getContactArn() != null)
            sb.append("ContactArn: ").append(getContactArn()).append(",");
        if (getEngagementArn() != null)
            sb.append("EngagementArn: ").append(getEngagementArn()).append(",");
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

        if (obj instanceof DescribeEngagementResult == false)
            return false;
        DescribeEngagementResult other = (DescribeEngagementResult) obj;
        if (other.getContactArn() == null ^ this.getContactArn() == null)
            return false;
        if (other.getContactArn() != null && other.getContactArn().equals(this.getContactArn()) == false)
            return false;
        if (other.getEngagementArn() == null ^ this.getEngagementArn() == null)
            return false;
        if (other.getEngagementArn() != null && other.getEngagementArn().equals(this.getEngagementArn()) == false)
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

        hashCode = prime * hashCode + ((getContactArn() == null) ? 0 : getContactArn().hashCode());
        hashCode = prime * hashCode + ((getEngagementArn() == null) ? 0 : getEngagementArn().hashCode());
        hashCode = prime * hashCode + ((getSender() == null) ? 0 : getSender().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getPublicSubject() == null) ? 0 : getPublicSubject().hashCode());
        hashCode = prime * hashCode + ((getPublicContent() == null) ? 0 : getPublicContent().hashCode());
        hashCode = prime * hashCode + ((getIncidentId() == null) ? 0 : getIncidentId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStopTime() == null) ? 0 : getStopTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEngagementResult clone() {
        try {
            return (DescribeEngagementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
