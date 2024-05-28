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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A result row containing metadata for an archived email message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/Row" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Row implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the archived message.
     * </p>
     */
    private String archivedMessageId;
    /**
     * <p>
     * The email addresses in the CC header.
     * </p>
     */
    private String cc;
    /**
     * <p>
     * The date the email was sent.
     * </p>
     */
    private String date;
    /**
     * <p>
     * The email address of the sender.
     * </p>
     */
    private String from;
    /**
     * <p>
     * A flag indicating if the email has attachments.
     * </p>
     */
    private Boolean hasAttachments;
    /**
     * <p>
     * The email message ID this is a reply to.
     * </p>
     */
    private String inReplyTo;
    /**
     * <p>
     * The unique message ID of the email.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The received headers from the email delivery path.
     * </p>
     */
    private java.util.List<String> receivedHeaders;
    /**
     * <p>
     * The timestamp of when the email was received.
     * </p>
     */
    private java.util.Date receivedTimestamp;
    /**
     * <p>
     * The subject header value of the email.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * The email addresses in the To header.
     * </p>
     */
    private String to;
    /**
     * <p>
     * The user agent that sent the email.
     * </p>
     */
    private String xMailer;
    /**
     * <p>
     * The original user agent that sent the email.
     * </p>
     */
    private String xOriginalMailer;
    /**
     * <p>
     * The priority level of the email.
     * </p>
     */
    private String xPriority;

    /**
     * <p>
     * The unique identifier of the archived message.
     * </p>
     * 
     * @param archivedMessageId
     *        The unique identifier of the archived message.
     */

    public void setArchivedMessageId(String archivedMessageId) {
        this.archivedMessageId = archivedMessageId;
    }

    /**
     * <p>
     * The unique identifier of the archived message.
     * </p>
     * 
     * @return The unique identifier of the archived message.
     */

    public String getArchivedMessageId() {
        return this.archivedMessageId;
    }

    /**
     * <p>
     * The unique identifier of the archived message.
     * </p>
     * 
     * @param archivedMessageId
     *        The unique identifier of the archived message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withArchivedMessageId(String archivedMessageId) {
        setArchivedMessageId(archivedMessageId);
        return this;
    }

    /**
     * <p>
     * The email addresses in the CC header.
     * </p>
     * 
     * @param cc
     *        The email addresses in the CC header.
     */

    public void setCc(String cc) {
        this.cc = cc;
    }

    /**
     * <p>
     * The email addresses in the CC header.
     * </p>
     * 
     * @return The email addresses in the CC header.
     */

    public String getCc() {
        return this.cc;
    }

    /**
     * <p>
     * The email addresses in the CC header.
     * </p>
     * 
     * @param cc
     *        The email addresses in the CC header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withCc(String cc) {
        setCc(cc);
        return this;
    }

    /**
     * <p>
     * The date the email was sent.
     * </p>
     * 
     * @param date
     *        The date the email was sent.
     */

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * <p>
     * The date the email was sent.
     * </p>
     * 
     * @return The date the email was sent.
     */

    public String getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date the email was sent.
     * </p>
     * 
     * @param date
     *        The date the email was sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withDate(String date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * The email address of the sender.
     * </p>
     * 
     * @param from
     *        The email address of the sender.
     */

    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * <p>
     * The email address of the sender.
     * </p>
     * 
     * @return The email address of the sender.
     */

    public String getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The email address of the sender.
     * </p>
     * 
     * @param from
     *        The email address of the sender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withFrom(String from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * A flag indicating if the email has attachments.
     * </p>
     * 
     * @param hasAttachments
     *        A flag indicating if the email has attachments.
     */

    public void setHasAttachments(Boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    /**
     * <p>
     * A flag indicating if the email has attachments.
     * </p>
     * 
     * @return A flag indicating if the email has attachments.
     */

    public Boolean getHasAttachments() {
        return this.hasAttachments;
    }

    /**
     * <p>
     * A flag indicating if the email has attachments.
     * </p>
     * 
     * @param hasAttachments
     *        A flag indicating if the email has attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withHasAttachments(Boolean hasAttachments) {
        setHasAttachments(hasAttachments);
        return this;
    }

    /**
     * <p>
     * A flag indicating if the email has attachments.
     * </p>
     * 
     * @return A flag indicating if the email has attachments.
     */

    public Boolean isHasAttachments() {
        return this.hasAttachments;
    }

    /**
     * <p>
     * The email message ID this is a reply to.
     * </p>
     * 
     * @param inReplyTo
     *        The email message ID this is a reply to.
     */

    public void setInReplyTo(String inReplyTo) {
        this.inReplyTo = inReplyTo;
    }

    /**
     * <p>
     * The email message ID this is a reply to.
     * </p>
     * 
     * @return The email message ID this is a reply to.
     */

    public String getInReplyTo() {
        return this.inReplyTo;
    }

    /**
     * <p>
     * The email message ID this is a reply to.
     * </p>
     * 
     * @param inReplyTo
     *        The email message ID this is a reply to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withInReplyTo(String inReplyTo) {
        setInReplyTo(inReplyTo);
        return this;
    }

    /**
     * <p>
     * The unique message ID of the email.
     * </p>
     * 
     * @param messageId
     *        The unique message ID of the email.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The unique message ID of the email.
     * </p>
     * 
     * @return The unique message ID of the email.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The unique message ID of the email.
     * </p>
     * 
     * @param messageId
     *        The unique message ID of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The received headers from the email delivery path.
     * </p>
     * 
     * @return The received headers from the email delivery path.
     */

    public java.util.List<String> getReceivedHeaders() {
        return receivedHeaders;
    }

    /**
     * <p>
     * The received headers from the email delivery path.
     * </p>
     * 
     * @param receivedHeaders
     *        The received headers from the email delivery path.
     */

    public void setReceivedHeaders(java.util.Collection<String> receivedHeaders) {
        if (receivedHeaders == null) {
            this.receivedHeaders = null;
            return;
        }

        this.receivedHeaders = new java.util.ArrayList<String>(receivedHeaders);
    }

    /**
     * <p>
     * The received headers from the email delivery path.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReceivedHeaders(java.util.Collection)} or {@link #withReceivedHeaders(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param receivedHeaders
     *        The received headers from the email delivery path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withReceivedHeaders(String... receivedHeaders) {
        if (this.receivedHeaders == null) {
            setReceivedHeaders(new java.util.ArrayList<String>(receivedHeaders.length));
        }
        for (String ele : receivedHeaders) {
            this.receivedHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The received headers from the email delivery path.
     * </p>
     * 
     * @param receivedHeaders
     *        The received headers from the email delivery path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withReceivedHeaders(java.util.Collection<String> receivedHeaders) {
        setReceivedHeaders(receivedHeaders);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the email was received.
     * </p>
     * 
     * @param receivedTimestamp
     *        The timestamp of when the email was received.
     */

    public void setReceivedTimestamp(java.util.Date receivedTimestamp) {
        this.receivedTimestamp = receivedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the email was received.
     * </p>
     * 
     * @return The timestamp of when the email was received.
     */

    public java.util.Date getReceivedTimestamp() {
        return this.receivedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the email was received.
     * </p>
     * 
     * @param receivedTimestamp
     *        The timestamp of when the email was received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withReceivedTimestamp(java.util.Date receivedTimestamp) {
        setReceivedTimestamp(receivedTimestamp);
        return this;
    }

    /**
     * <p>
     * The subject header value of the email.
     * </p>
     * 
     * @param subject
     *        The subject header value of the email.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject header value of the email.
     * </p>
     * 
     * @return The subject header value of the email.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The subject header value of the email.
     * </p>
     * 
     * @param subject
     *        The subject header value of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The email addresses in the To header.
     * </p>
     * 
     * @param to
     *        The email addresses in the To header.
     */

    public void setTo(String to) {
        this.to = to;
    }

    /**
     * <p>
     * The email addresses in the To header.
     * </p>
     * 
     * @return The email addresses in the To header.
     */

    public String getTo() {
        return this.to;
    }

    /**
     * <p>
     * The email addresses in the To header.
     * </p>
     * 
     * @param to
     *        The email addresses in the To header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withTo(String to) {
        setTo(to);
        return this;
    }

    /**
     * <p>
     * The user agent that sent the email.
     * </p>
     * 
     * @param xMailer
     *        The user agent that sent the email.
     */

    public void setXMailer(String xMailer) {
        this.xMailer = xMailer;
    }

    /**
     * <p>
     * The user agent that sent the email.
     * </p>
     * 
     * @return The user agent that sent the email.
     */

    public String getXMailer() {
        return this.xMailer;
    }

    /**
     * <p>
     * The user agent that sent the email.
     * </p>
     * 
     * @param xMailer
     *        The user agent that sent the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withXMailer(String xMailer) {
        setXMailer(xMailer);
        return this;
    }

    /**
     * <p>
     * The original user agent that sent the email.
     * </p>
     * 
     * @param xOriginalMailer
     *        The original user agent that sent the email.
     */

    public void setXOriginalMailer(String xOriginalMailer) {
        this.xOriginalMailer = xOriginalMailer;
    }

    /**
     * <p>
     * The original user agent that sent the email.
     * </p>
     * 
     * @return The original user agent that sent the email.
     */

    public String getXOriginalMailer() {
        return this.xOriginalMailer;
    }

    /**
     * <p>
     * The original user agent that sent the email.
     * </p>
     * 
     * @param xOriginalMailer
     *        The original user agent that sent the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withXOriginalMailer(String xOriginalMailer) {
        setXOriginalMailer(xOriginalMailer);
        return this;
    }

    /**
     * <p>
     * The priority level of the email.
     * </p>
     * 
     * @param xPriority
     *        The priority level of the email.
     */

    public void setXPriority(String xPriority) {
        this.xPriority = xPriority;
    }

    /**
     * <p>
     * The priority level of the email.
     * </p>
     * 
     * @return The priority level of the email.
     */

    public String getXPriority() {
        return this.xPriority;
    }

    /**
     * <p>
     * The priority level of the email.
     * </p>
     * 
     * @param xPriority
     *        The priority level of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withXPriority(String xPriority) {
        setXPriority(xPriority);
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
        if (getArchivedMessageId() != null)
            sb.append("ArchivedMessageId: ").append(getArchivedMessageId()).append(",");
        if (getCc() != null)
            sb.append("Cc: ").append(getCc()).append(",");
        if (getDate() != null)
            sb.append("Date: ").append(getDate()).append(",");
        if (getFrom() != null)
            sb.append("From: ").append(getFrom()).append(",");
        if (getHasAttachments() != null)
            sb.append("HasAttachments: ").append(getHasAttachments()).append(",");
        if (getInReplyTo() != null)
            sb.append("InReplyTo: ").append(getInReplyTo()).append(",");
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getReceivedHeaders() != null)
            sb.append("ReceivedHeaders: ").append(getReceivedHeaders()).append(",");
        if (getReceivedTimestamp() != null)
            sb.append("ReceivedTimestamp: ").append(getReceivedTimestamp()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getTo() != null)
            sb.append("To: ").append(getTo()).append(",");
        if (getXMailer() != null)
            sb.append("XMailer: ").append(getXMailer()).append(",");
        if (getXOriginalMailer() != null)
            sb.append("XOriginalMailer: ").append(getXOriginalMailer()).append(",");
        if (getXPriority() != null)
            sb.append("XPriority: ").append(getXPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Row == false)
            return false;
        Row other = (Row) obj;
        if (other.getArchivedMessageId() == null ^ this.getArchivedMessageId() == null)
            return false;
        if (other.getArchivedMessageId() != null && other.getArchivedMessageId().equals(this.getArchivedMessageId()) == false)
            return false;
        if (other.getCc() == null ^ this.getCc() == null)
            return false;
        if (other.getCc() != null && other.getCc().equals(this.getCc()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getHasAttachments() == null ^ this.getHasAttachments() == null)
            return false;
        if (other.getHasAttachments() != null && other.getHasAttachments().equals(this.getHasAttachments()) == false)
            return false;
        if (other.getInReplyTo() == null ^ this.getInReplyTo() == null)
            return false;
        if (other.getInReplyTo() != null && other.getInReplyTo().equals(this.getInReplyTo()) == false)
            return false;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getReceivedHeaders() == null ^ this.getReceivedHeaders() == null)
            return false;
        if (other.getReceivedHeaders() != null && other.getReceivedHeaders().equals(this.getReceivedHeaders()) == false)
            return false;
        if (other.getReceivedTimestamp() == null ^ this.getReceivedTimestamp() == null)
            return false;
        if (other.getReceivedTimestamp() != null && other.getReceivedTimestamp().equals(this.getReceivedTimestamp()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        if (other.getXMailer() == null ^ this.getXMailer() == null)
            return false;
        if (other.getXMailer() != null && other.getXMailer().equals(this.getXMailer()) == false)
            return false;
        if (other.getXOriginalMailer() == null ^ this.getXOriginalMailer() == null)
            return false;
        if (other.getXOriginalMailer() != null && other.getXOriginalMailer().equals(this.getXOriginalMailer()) == false)
            return false;
        if (other.getXPriority() == null ^ this.getXPriority() == null)
            return false;
        if (other.getXPriority() != null && other.getXPriority().equals(this.getXPriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchivedMessageId() == null) ? 0 : getArchivedMessageId().hashCode());
        hashCode = prime * hashCode + ((getCc() == null) ? 0 : getCc().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getHasAttachments() == null) ? 0 : getHasAttachments().hashCode());
        hashCode = prime * hashCode + ((getInReplyTo() == null) ? 0 : getInReplyTo().hashCode());
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getReceivedHeaders() == null) ? 0 : getReceivedHeaders().hashCode());
        hashCode = prime * hashCode + ((getReceivedTimestamp() == null) ? 0 : getReceivedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        hashCode = prime * hashCode + ((getXMailer() == null) ? 0 : getXMailer().hashCode());
        hashCode = prime * hashCode + ((getXOriginalMailer() == null) ? 0 : getXOriginalMailer().hashCode());
        hashCode = prime * hashCode + ((getXPriority() == null) ? 0 : getXPriority().hashCode());
        return hashCode;
    }

    @Override
    public Row clone() {
        try {
            return (Row) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.RowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
