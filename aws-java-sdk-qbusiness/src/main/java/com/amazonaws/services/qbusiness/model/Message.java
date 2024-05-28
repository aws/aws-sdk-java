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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A message in an Amazon Q Business web experience.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/Message" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Message implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience message.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The content of the Amazon Q Business web experience message.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The timestamp of the first Amazon Q Business web experience message.
     * </p>
     */
    private java.util.Date time;
    /**
     * <p>
     * The type of Amazon Q Business message, whether <code>HUMAN</code> or <code>AI</code> generated.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A file directly uploaded into an Amazon Q Business web experience chat.
     * </p>
     */
    private java.util.List<AttachmentOutput> attachments;
    /**
     * <p>
     * The source documents used to generate Amazon Q Business web experience message.
     * </p>
     */
    private java.util.List<SourceAttribution> sourceAttribution;

    private ActionReview actionReview;

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience message.
     * </p>
     * 
     * @param messageId
     *        The identifier of the Amazon Q Business web experience message.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience message.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business web experience message.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience message.
     * </p>
     * 
     * @param messageId
     *        The identifier of the Amazon Q Business web experience message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The content of the Amazon Q Business web experience message.
     * </p>
     * 
     * @param body
     *        The content of the Amazon Q Business web experience message.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The content of the Amazon Q Business web experience message.
     * </p>
     * 
     * @return The content of the Amazon Q Business web experience message.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The content of the Amazon Q Business web experience message.
     * </p>
     * 
     * @param body
     *        The content of the Amazon Q Business web experience message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The timestamp of the first Amazon Q Business web experience message.
     * </p>
     * 
     * @param time
     *        The timestamp of the first Amazon Q Business web experience message.
     */

    public void setTime(java.util.Date time) {
        this.time = time;
    }

    /**
     * <p>
     * The timestamp of the first Amazon Q Business web experience message.
     * </p>
     * 
     * @return The timestamp of the first Amazon Q Business web experience message.
     */

    public java.util.Date getTime() {
        return this.time;
    }

    /**
     * <p>
     * The timestamp of the first Amazon Q Business web experience message.
     * </p>
     * 
     * @param time
     *        The timestamp of the first Amazon Q Business web experience message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withTime(java.util.Date time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Q Business message, whether <code>HUMAN</code> or <code>AI</code> generated.
     * </p>
     * 
     * @param type
     *        The type of Amazon Q Business message, whether <code>HUMAN</code> or <code>AI</code> generated.
     * @see MessageType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of Amazon Q Business message, whether <code>HUMAN</code> or <code>AI</code> generated.
     * </p>
     * 
     * @return The type of Amazon Q Business message, whether <code>HUMAN</code> or <code>AI</code> generated.
     * @see MessageType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of Amazon Q Business message, whether <code>HUMAN</code> or <code>AI</code> generated.
     * </p>
     * 
     * @param type
     *        The type of Amazon Q Business message, whether <code>HUMAN</code> or <code>AI</code> generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public Message withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Q Business message, whether <code>HUMAN</code> or <code>AI</code> generated.
     * </p>
     * 
     * @param type
     *        The type of Amazon Q Business message, whether <code>HUMAN</code> or <code>AI</code> generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public Message withType(MessageType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A file directly uploaded into an Amazon Q Business web experience chat.
     * </p>
     * 
     * @return A file directly uploaded into an Amazon Q Business web experience chat.
     */

    public java.util.List<AttachmentOutput> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * A file directly uploaded into an Amazon Q Business web experience chat.
     * </p>
     * 
     * @param attachments
     *        A file directly uploaded into an Amazon Q Business web experience chat.
     */

    public void setAttachments(java.util.Collection<AttachmentOutput> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new java.util.ArrayList<AttachmentOutput>(attachments);
    }

    /**
     * <p>
     * A file directly uploaded into an Amazon Q Business web experience chat.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        A file directly uploaded into an Amazon Q Business web experience chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withAttachments(AttachmentOutput... attachments) {
        if (this.attachments == null) {
            setAttachments(new java.util.ArrayList<AttachmentOutput>(attachments.length));
        }
        for (AttachmentOutput ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A file directly uploaded into an Amazon Q Business web experience chat.
     * </p>
     * 
     * @param attachments
     *        A file directly uploaded into an Amazon Q Business web experience chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withAttachments(java.util.Collection<AttachmentOutput> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * The source documents used to generate Amazon Q Business web experience message.
     * </p>
     * 
     * @return The source documents used to generate Amazon Q Business web experience message.
     */

    public java.util.List<SourceAttribution> getSourceAttribution() {
        return sourceAttribution;
    }

    /**
     * <p>
     * The source documents used to generate Amazon Q Business web experience message.
     * </p>
     * 
     * @param sourceAttribution
     *        The source documents used to generate Amazon Q Business web experience message.
     */

    public void setSourceAttribution(java.util.Collection<SourceAttribution> sourceAttribution) {
        if (sourceAttribution == null) {
            this.sourceAttribution = null;
            return;
        }

        this.sourceAttribution = new java.util.ArrayList<SourceAttribution>(sourceAttribution);
    }

    /**
     * <p>
     * The source documents used to generate Amazon Q Business web experience message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceAttribution(java.util.Collection)} or {@link #withSourceAttribution(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param sourceAttribution
     *        The source documents used to generate Amazon Q Business web experience message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withSourceAttribution(SourceAttribution... sourceAttribution) {
        if (this.sourceAttribution == null) {
            setSourceAttribution(new java.util.ArrayList<SourceAttribution>(sourceAttribution.length));
        }
        for (SourceAttribution ele : sourceAttribution) {
            this.sourceAttribution.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source documents used to generate Amazon Q Business web experience message.
     * </p>
     * 
     * @param sourceAttribution
     *        The source documents used to generate Amazon Q Business web experience message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withSourceAttribution(java.util.Collection<SourceAttribution> sourceAttribution) {
        setSourceAttribution(sourceAttribution);
        return this;
    }

    /**
     * @param actionReview
     */

    public void setActionReview(ActionReview actionReview) {
        this.actionReview = actionReview;
    }

    /**
     * @return
     */

    public ActionReview getActionReview() {
        return this.actionReview;
    }

    /**
     * @param actionReview
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withActionReview(ActionReview actionReview) {
        setActionReview(actionReview);
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
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getTime() != null)
            sb.append("Time: ").append(getTime()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments()).append(",");
        if (getSourceAttribution() != null)
            sb.append("SourceAttribution: ").append(getSourceAttribution()).append(",");
        if (getActionReview() != null)
            sb.append("ActionReview: ").append(getActionReview());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Message == false)
            return false;
        Message other = (Message) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getSourceAttribution() == null ^ this.getSourceAttribution() == null)
            return false;
        if (other.getSourceAttribution() != null && other.getSourceAttribution().equals(this.getSourceAttribution()) == false)
            return false;
        if (other.getActionReview() == null ^ this.getActionReview() == null)
            return false;
        if (other.getActionReview() != null && other.getActionReview().equals(this.getActionReview()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getSourceAttribution() == null) ? 0 : getSourceAttribution().hashCode());
        hashCode = prime * hashCode + ((getActionReview() == null) ? 0 : getActionReview().hashCode());
        return hashCode;
    }

    @Override
    public Message clone() {
        try {
            return (Message) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.MessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
