/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to send a bounce message to the sender of an email you received through Amazon SES.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendBounce" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendBounceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The message ID of the message to be bounced.
     * </p>
     */
    private String originalMessageId;
    /**
     * <p>
     * The address to use in the "From" header of the bounce message. This must be an identity that you have verified
     * with Amazon SES.
     * </p>
     */
    private String bounceSender;
    /**
     * <p>
     * Human-readable text for the bounce message to explain the failure. If not specified, the text will be
     * auto-generated based on the bounced recipient information.
     * </p>
     */
    private String explanation;
    /**
     * <p>
     * Message-related DSN fields. If not specified, Amazon SES will choose the values.
     * </p>
     */
    private MessageDsn messageDsn;
    /**
     * <p>
     * A list of recipients of the bounced message, including the information required to create the Delivery Status
     * Notifications (DSNs) for the recipients. You must specify at least one <code>BouncedRecipientInfo</code> in the
     * list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BouncedRecipientInfo> bouncedRecipientInfoList;
    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the address in the "From" header of the bounce. For more
     * information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     */
    private String bounceSenderArn;

    /**
     * <p>
     * The message ID of the message to be bounced.
     * </p>
     * 
     * @param originalMessageId
     *        The message ID of the message to be bounced.
     */

    public void setOriginalMessageId(String originalMessageId) {
        this.originalMessageId = originalMessageId;
    }

    /**
     * <p>
     * The message ID of the message to be bounced.
     * </p>
     * 
     * @return The message ID of the message to be bounced.
     */

    public String getOriginalMessageId() {
        return this.originalMessageId;
    }

    /**
     * <p>
     * The message ID of the message to be bounced.
     * </p>
     * 
     * @param originalMessageId
     *        The message ID of the message to be bounced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBounceRequest withOriginalMessageId(String originalMessageId) {
        setOriginalMessageId(originalMessageId);
        return this;
    }

    /**
     * <p>
     * The address to use in the "From" header of the bounce message. This must be an identity that you have verified
     * with Amazon SES.
     * </p>
     * 
     * @param bounceSender
     *        The address to use in the "From" header of the bounce message. This must be an identity that you have
     *        verified with Amazon SES.
     */

    public void setBounceSender(String bounceSender) {
        this.bounceSender = bounceSender;
    }

    /**
     * <p>
     * The address to use in the "From" header of the bounce message. This must be an identity that you have verified
     * with Amazon SES.
     * </p>
     * 
     * @return The address to use in the "From" header of the bounce message. This must be an identity that you have
     *         verified with Amazon SES.
     */

    public String getBounceSender() {
        return this.bounceSender;
    }

    /**
     * <p>
     * The address to use in the "From" header of the bounce message. This must be an identity that you have verified
     * with Amazon SES.
     * </p>
     * 
     * @param bounceSender
     *        The address to use in the "From" header of the bounce message. This must be an identity that you have
     *        verified with Amazon SES.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBounceRequest withBounceSender(String bounceSender) {
        setBounceSender(bounceSender);
        return this;
    }

    /**
     * <p>
     * Human-readable text for the bounce message to explain the failure. If not specified, the text will be
     * auto-generated based on the bounced recipient information.
     * </p>
     * 
     * @param explanation
     *        Human-readable text for the bounce message to explain the failure. If not specified, the text will be
     *        auto-generated based on the bounced recipient information.
     */

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    /**
     * <p>
     * Human-readable text for the bounce message to explain the failure. If not specified, the text will be
     * auto-generated based on the bounced recipient information.
     * </p>
     * 
     * @return Human-readable text for the bounce message to explain the failure. If not specified, the text will be
     *         auto-generated based on the bounced recipient information.
     */

    public String getExplanation() {
        return this.explanation;
    }

    /**
     * <p>
     * Human-readable text for the bounce message to explain the failure. If not specified, the text will be
     * auto-generated based on the bounced recipient information.
     * </p>
     * 
     * @param explanation
     *        Human-readable text for the bounce message to explain the failure. If not specified, the text will be
     *        auto-generated based on the bounced recipient information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBounceRequest withExplanation(String explanation) {
        setExplanation(explanation);
        return this;
    }

    /**
     * <p>
     * Message-related DSN fields. If not specified, Amazon SES will choose the values.
     * </p>
     * 
     * @param messageDsn
     *        Message-related DSN fields. If not specified, Amazon SES will choose the values.
     */

    public void setMessageDsn(MessageDsn messageDsn) {
        this.messageDsn = messageDsn;
    }

    /**
     * <p>
     * Message-related DSN fields. If not specified, Amazon SES will choose the values.
     * </p>
     * 
     * @return Message-related DSN fields. If not specified, Amazon SES will choose the values.
     */

    public MessageDsn getMessageDsn() {
        return this.messageDsn;
    }

    /**
     * <p>
     * Message-related DSN fields. If not specified, Amazon SES will choose the values.
     * </p>
     * 
     * @param messageDsn
     *        Message-related DSN fields. If not specified, Amazon SES will choose the values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBounceRequest withMessageDsn(MessageDsn messageDsn) {
        setMessageDsn(messageDsn);
        return this;
    }

    /**
     * <p>
     * A list of recipients of the bounced message, including the information required to create the Delivery Status
     * Notifications (DSNs) for the recipients. You must specify at least one <code>BouncedRecipientInfo</code> in the
     * list.
     * </p>
     * 
     * @return A list of recipients of the bounced message, including the information required to create the Delivery
     *         Status Notifications (DSNs) for the recipients. You must specify at least one
     *         <code>BouncedRecipientInfo</code> in the list.
     */

    public java.util.List<BouncedRecipientInfo> getBouncedRecipientInfoList() {
        if (bouncedRecipientInfoList == null) {
            bouncedRecipientInfoList = new com.amazonaws.internal.SdkInternalList<BouncedRecipientInfo>();
        }
        return bouncedRecipientInfoList;
    }

    /**
     * <p>
     * A list of recipients of the bounced message, including the information required to create the Delivery Status
     * Notifications (DSNs) for the recipients. You must specify at least one <code>BouncedRecipientInfo</code> in the
     * list.
     * </p>
     * 
     * @param bouncedRecipientInfoList
     *        A list of recipients of the bounced message, including the information required to create the Delivery
     *        Status Notifications (DSNs) for the recipients. You must specify at least one
     *        <code>BouncedRecipientInfo</code> in the list.
     */

    public void setBouncedRecipientInfoList(java.util.Collection<BouncedRecipientInfo> bouncedRecipientInfoList) {
        if (bouncedRecipientInfoList == null) {
            this.bouncedRecipientInfoList = null;
            return;
        }

        this.bouncedRecipientInfoList = new com.amazonaws.internal.SdkInternalList<BouncedRecipientInfo>(bouncedRecipientInfoList);
    }

    /**
     * <p>
     * A list of recipients of the bounced message, including the information required to create the Delivery Status
     * Notifications (DSNs) for the recipients. You must specify at least one <code>BouncedRecipientInfo</code> in the
     * list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBouncedRecipientInfoList(java.util.Collection)} or
     * {@link #withBouncedRecipientInfoList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param bouncedRecipientInfoList
     *        A list of recipients of the bounced message, including the information required to create the Delivery
     *        Status Notifications (DSNs) for the recipients. You must specify at least one
     *        <code>BouncedRecipientInfo</code> in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBounceRequest withBouncedRecipientInfoList(BouncedRecipientInfo... bouncedRecipientInfoList) {
        if (this.bouncedRecipientInfoList == null) {
            setBouncedRecipientInfoList(new com.amazonaws.internal.SdkInternalList<BouncedRecipientInfo>(bouncedRecipientInfoList.length));
        }
        for (BouncedRecipientInfo ele : bouncedRecipientInfoList) {
            this.bouncedRecipientInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of recipients of the bounced message, including the information required to create the Delivery Status
     * Notifications (DSNs) for the recipients. You must specify at least one <code>BouncedRecipientInfo</code> in the
     * list.
     * </p>
     * 
     * @param bouncedRecipientInfoList
     *        A list of recipients of the bounced message, including the information required to create the Delivery
     *        Status Notifications (DSNs) for the recipients. You must specify at least one
     *        <code>BouncedRecipientInfo</code> in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBounceRequest withBouncedRecipientInfoList(java.util.Collection<BouncedRecipientInfo> bouncedRecipientInfoList) {
        setBouncedRecipientInfoList(bouncedRecipientInfoList);
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the address in the "From" header of the bounce. For more
     * information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @param bounceSenderArn
     *        This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *        with the sending authorization policy that permits you to use the address in the "From" header of the
     *        bounce. For more information about sending authorization, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     */

    public void setBounceSenderArn(String bounceSenderArn) {
        this.bounceSenderArn = bounceSenderArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the address in the "From" header of the bounce. For more
     * information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @return This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *         with the sending authorization policy that permits you to use the address in the "From" header of the
     *         bounce. For more information about sending authorization, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *         Developer Guide</a>.
     */

    public String getBounceSenderArn() {
        return this.bounceSenderArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the address in the "From" header of the bounce. For more
     * information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @param bounceSenderArn
     *        This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *        with the sending authorization policy that permits you to use the address in the "From" header of the
     *        bounce. For more information about sending authorization, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBounceRequest withBounceSenderArn(String bounceSenderArn) {
        setBounceSenderArn(bounceSenderArn);
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
        if (getOriginalMessageId() != null)
            sb.append("OriginalMessageId: ").append(getOriginalMessageId()).append(",");
        if (getBounceSender() != null)
            sb.append("BounceSender: ").append(getBounceSender()).append(",");
        if (getExplanation() != null)
            sb.append("Explanation: ").append(getExplanation()).append(",");
        if (getMessageDsn() != null)
            sb.append("MessageDsn: ").append(getMessageDsn()).append(",");
        if (getBouncedRecipientInfoList() != null)
            sb.append("BouncedRecipientInfoList: ").append(getBouncedRecipientInfoList()).append(",");
        if (getBounceSenderArn() != null)
            sb.append("BounceSenderArn: ").append(getBounceSenderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendBounceRequest == false)
            return false;
        SendBounceRequest other = (SendBounceRequest) obj;
        if (other.getOriginalMessageId() == null ^ this.getOriginalMessageId() == null)
            return false;
        if (other.getOriginalMessageId() != null && other.getOriginalMessageId().equals(this.getOriginalMessageId()) == false)
            return false;
        if (other.getBounceSender() == null ^ this.getBounceSender() == null)
            return false;
        if (other.getBounceSender() != null && other.getBounceSender().equals(this.getBounceSender()) == false)
            return false;
        if (other.getExplanation() == null ^ this.getExplanation() == null)
            return false;
        if (other.getExplanation() != null && other.getExplanation().equals(this.getExplanation()) == false)
            return false;
        if (other.getMessageDsn() == null ^ this.getMessageDsn() == null)
            return false;
        if (other.getMessageDsn() != null && other.getMessageDsn().equals(this.getMessageDsn()) == false)
            return false;
        if (other.getBouncedRecipientInfoList() == null ^ this.getBouncedRecipientInfoList() == null)
            return false;
        if (other.getBouncedRecipientInfoList() != null && other.getBouncedRecipientInfoList().equals(this.getBouncedRecipientInfoList()) == false)
            return false;
        if (other.getBounceSenderArn() == null ^ this.getBounceSenderArn() == null)
            return false;
        if (other.getBounceSenderArn() != null && other.getBounceSenderArn().equals(this.getBounceSenderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginalMessageId() == null) ? 0 : getOriginalMessageId().hashCode());
        hashCode = prime * hashCode + ((getBounceSender() == null) ? 0 : getBounceSender().hashCode());
        hashCode = prime * hashCode + ((getExplanation() == null) ? 0 : getExplanation().hashCode());
        hashCode = prime * hashCode + ((getMessageDsn() == null) ? 0 : getMessageDsn().hashCode());
        hashCode = prime * hashCode + ((getBouncedRecipientInfoList() == null) ? 0 : getBouncedRecipientInfoList().hashCode());
        hashCode = prime * hashCode + ((getBounceSenderArn() == null) ? 0 : getBounceSenderArn().hashCode());
        return hashCode;
    }

    @Override
    public SendBounceRequest clone() {
        return (SendBounceRequest) super.clone();
    }

}
