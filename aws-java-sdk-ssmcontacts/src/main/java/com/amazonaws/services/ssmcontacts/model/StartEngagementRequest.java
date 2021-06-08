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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/StartEngagement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartEngagementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact being engaged.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The user that started the engagement.
     * </p>
     */
    private String sender;
    /**
     * <p>
     * The secure subject of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> or <code>EMAIL</code>.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * The secure content of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> or <code>EMAIL</code>.
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
     * The ARN of the incident that the engagement is part of.
     * </p>
     */
    private String incidentId;
    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact being engaged.
     * </p>
     * 
     * @param contactId
     *        The Amazon Resource Name (ARN) of the contact being engaged.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact being engaged.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact being engaged.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact being engaged.
     * </p>
     * 
     * @param contactId
     *        The Amazon Resource Name (ARN) of the contact being engaged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEngagementRequest withContactId(String contactId) {
        setContactId(contactId);
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

    public StartEngagementRequest withSender(String sender) {
        setSender(sender);
        return this;
    }

    /**
     * <p>
     * The secure subject of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> or <code>EMAIL</code>.
     * </p>
     * 
     * @param subject
     *        The secure subject of the message that was sent to the contact. Use this field for engagements to
     *        <code>VOICE</code> or <code>EMAIL</code>.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The secure subject of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> or <code>EMAIL</code>.
     * </p>
     * 
     * @return The secure subject of the message that was sent to the contact. Use this field for engagements to
     *         <code>VOICE</code> or <code>EMAIL</code>.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The secure subject of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> or <code>EMAIL</code>.
     * </p>
     * 
     * @param subject
     *        The secure subject of the message that was sent to the contact. Use this field for engagements to
     *        <code>VOICE</code> or <code>EMAIL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEngagementRequest withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The secure content of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> or <code>EMAIL</code>.
     * </p>
     * 
     * @param content
     *        The secure content of the message that was sent to the contact. Use this field for engagements to
     *        <code>VOICE</code> or <code>EMAIL</code>.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The secure content of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> or <code>EMAIL</code>.
     * </p>
     * 
     * @return The secure content of the message that was sent to the contact. Use this field for engagements to
     *         <code>VOICE</code> or <code>EMAIL</code>.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The secure content of the message that was sent to the contact. Use this field for engagements to
     * <code>VOICE</code> or <code>EMAIL</code>.
     * </p>
     * 
     * @param content
     *        The secure content of the message that was sent to the contact. Use this field for engagements to
     *        <code>VOICE</code> or <code>EMAIL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEngagementRequest withContent(String content) {
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

    public StartEngagementRequest withPublicSubject(String publicSubject) {
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

    public StartEngagementRequest withPublicContent(String publicContent) {
        setPublicContent(publicContent);
        return this;
    }

    /**
     * <p>
     * The ARN of the incident that the engagement is part of.
     * </p>
     * 
     * @param incidentId
     *        The ARN of the incident that the engagement is part of.
     */

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    /**
     * <p>
     * The ARN of the incident that the engagement is part of.
     * </p>
     * 
     * @return The ARN of the incident that the engagement is part of.
     */

    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * <p>
     * The ARN of the incident that the engagement is part of.
     * </p>
     * 
     * @param incidentId
     *        The ARN of the incident that the engagement is part of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEngagementRequest withIncidentId(String incidentId) {
        setIncidentId(incidentId);
        return this;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param idempotencyToken
     *        A token ensuring that the action is called only once with the specified details.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @return A token ensuring that the action is called only once with the specified details.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param idempotencyToken
     *        A token ensuring that the action is called only once with the specified details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEngagementRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartEngagementRequest == false)
            return false;
        StartEngagementRequest other = (StartEngagementRequest) obj;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
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
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getSender() == null) ? 0 : getSender().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getPublicSubject() == null) ? 0 : getPublicSubject().hashCode());
        hashCode = prime * hashCode + ((getPublicContent() == null) ? 0 : getPublicContent().hashCode());
        hashCode = prime * hashCode + ((getIncidentId() == null) ? 0 : getIncidentId().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public StartEngagementRequest clone() {
        return (StartEngagementRequest) super.clone();
    }

}
