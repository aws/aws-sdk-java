/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#sendBounce(SendBounceRequest) SendBounce operation}.
 * <p>
 * Generates and sends a bounce message to the sender of an email you
 * received through Amazon SES. You can only use this API on an email up
 * to 24 hours after you receive it.
 * </p>
 * <p>
 * <b>NOTE:</b>You cannot use this API to send generic bounces for mail
 * that was not received by Amazon SES.
 * </p>
 * <p>
 * For information about receiving email through Amazon SES, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 * <p>
 * This action is throttled at one request per second.
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#sendBounce(SendBounceRequest)
 */
public class SendBounceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The message ID of the message to be bounced.
     */
    private String originalMessageId;

    /**
     * The address to use in the "From" header of the bounce message. This
     * must be an identity that you have verified with Amazon SES.
     */
    private String bounceSender;

    /**
     * Human-readable text for the bounce message to explain the failure. If
     * not specified, the text will be auto-generated based on the bounced
     * recipient information.
     */
    private String explanation;

    /**
     * Message-related DSN fields. If not specified, Amazon SES will choose
     * the values.
     */
    private MessageDsn messageDsn;

    /**
     * A list of recipients of the bounced message, including the information
     * required to create the Delivery Status Notifications (DSNs) for the
     * recipients. You must specify at least one
     * <code>BouncedRecipientInfo</code> in the list.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BouncedRecipientInfo> bouncedRecipientInfoList;

    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to use the address in the "From" header of the
     * bounce. For more information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     * SES Developer Guide</a>.
     */
    private String bounceSenderArn;

    /**
     * The message ID of the message to be bounced.
     *
     * @return The message ID of the message to be bounced.
     */
    public String getOriginalMessageId() {
        return originalMessageId;
    }
    
    /**
     * The message ID of the message to be bounced.
     *
     * @param originalMessageId The message ID of the message to be bounced.
     */
    public void setOriginalMessageId(String originalMessageId) {
        this.originalMessageId = originalMessageId;
    }
    
    /**
     * The message ID of the message to be bounced.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param originalMessageId The message ID of the message to be bounced.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendBounceRequest withOriginalMessageId(String originalMessageId) {
        this.originalMessageId = originalMessageId;
        return this;
    }

    /**
     * The address to use in the "From" header of the bounce message. This
     * must be an identity that you have verified with Amazon SES.
     *
     * @return The address to use in the "From" header of the bounce message. This
     *         must be an identity that you have verified with Amazon SES.
     */
    public String getBounceSender() {
        return bounceSender;
    }
    
    /**
     * The address to use in the "From" header of the bounce message. This
     * must be an identity that you have verified with Amazon SES.
     *
     * @param bounceSender The address to use in the "From" header of the bounce message. This
     *         must be an identity that you have verified with Amazon SES.
     */
    public void setBounceSender(String bounceSender) {
        this.bounceSender = bounceSender;
    }
    
    /**
     * The address to use in the "From" header of the bounce message. This
     * must be an identity that you have verified with Amazon SES.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bounceSender The address to use in the "From" header of the bounce message. This
     *         must be an identity that you have verified with Amazon SES.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendBounceRequest withBounceSender(String bounceSender) {
        this.bounceSender = bounceSender;
        return this;
    }

    /**
     * Human-readable text for the bounce message to explain the failure. If
     * not specified, the text will be auto-generated based on the bounced
     * recipient information.
     *
     * @return Human-readable text for the bounce message to explain the failure. If
     *         not specified, the text will be auto-generated based on the bounced
     *         recipient information.
     */
    public String getExplanation() {
        return explanation;
    }
    
    /**
     * Human-readable text for the bounce message to explain the failure. If
     * not specified, the text will be auto-generated based on the bounced
     * recipient information.
     *
     * @param explanation Human-readable text for the bounce message to explain the failure. If
     *         not specified, the text will be auto-generated based on the bounced
     *         recipient information.
     */
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
    
    /**
     * Human-readable text for the bounce message to explain the failure. If
     * not specified, the text will be auto-generated based on the bounced
     * recipient information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param explanation Human-readable text for the bounce message to explain the failure. If
     *         not specified, the text will be auto-generated based on the bounced
     *         recipient information.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendBounceRequest withExplanation(String explanation) {
        this.explanation = explanation;
        return this;
    }

    /**
     * Message-related DSN fields. If not specified, Amazon SES will choose
     * the values.
     *
     * @return Message-related DSN fields. If not specified, Amazon SES will choose
     *         the values.
     */
    public MessageDsn getMessageDsn() {
        return messageDsn;
    }
    
    /**
     * Message-related DSN fields. If not specified, Amazon SES will choose
     * the values.
     *
     * @param messageDsn Message-related DSN fields. If not specified, Amazon SES will choose
     *         the values.
     */
    public void setMessageDsn(MessageDsn messageDsn) {
        this.messageDsn = messageDsn;
    }
    
    /**
     * Message-related DSN fields. If not specified, Amazon SES will choose
     * the values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageDsn Message-related DSN fields. If not specified, Amazon SES will choose
     *         the values.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendBounceRequest withMessageDsn(MessageDsn messageDsn) {
        this.messageDsn = messageDsn;
        return this;
    }

    /**
     * A list of recipients of the bounced message, including the information
     * required to create the Delivery Status Notifications (DSNs) for the
     * recipients. You must specify at least one
     * <code>BouncedRecipientInfo</code> in the list.
     *
     * @return A list of recipients of the bounced message, including the information
     *         required to create the Delivery Status Notifications (DSNs) for the
     *         recipients. You must specify at least one
     *         <code>BouncedRecipientInfo</code> in the list.
     */
    public java.util.List<BouncedRecipientInfo> getBouncedRecipientInfoList() {
        if (bouncedRecipientInfoList == null) {
              bouncedRecipientInfoList = new com.amazonaws.internal.ListWithAutoConstructFlag<BouncedRecipientInfo>();
              bouncedRecipientInfoList.setAutoConstruct(true);
        }
        return bouncedRecipientInfoList;
    }
    
    /**
     * A list of recipients of the bounced message, including the information
     * required to create the Delivery Status Notifications (DSNs) for the
     * recipients. You must specify at least one
     * <code>BouncedRecipientInfo</code> in the list.
     *
     * @param bouncedRecipientInfoList A list of recipients of the bounced message, including the information
     *         required to create the Delivery Status Notifications (DSNs) for the
     *         recipients. You must specify at least one
     *         <code>BouncedRecipientInfo</code> in the list.
     */
    public void setBouncedRecipientInfoList(java.util.Collection<BouncedRecipientInfo> bouncedRecipientInfoList) {
        if (bouncedRecipientInfoList == null) {
            this.bouncedRecipientInfoList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<BouncedRecipientInfo> bouncedRecipientInfoListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BouncedRecipientInfo>(bouncedRecipientInfoList.size());
        bouncedRecipientInfoListCopy.addAll(bouncedRecipientInfoList);
        this.bouncedRecipientInfoList = bouncedRecipientInfoListCopy;
    }
    
    /**
     * A list of recipients of the bounced message, including the information
     * required to create the Delivery Status Notifications (DSNs) for the
     * recipients. You must specify at least one
     * <code>BouncedRecipientInfo</code> in the list.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setBouncedRecipientInfoList(java.util.Collection)}
     * or {@link #withBouncedRecipientInfoList(java.util.Collection)} if you
     * want to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bouncedRecipientInfoList A list of recipients of the bounced message, including the information
     *         required to create the Delivery Status Notifications (DSNs) for the
     *         recipients. You must specify at least one
     *         <code>BouncedRecipientInfo</code> in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendBounceRequest withBouncedRecipientInfoList(BouncedRecipientInfo... bouncedRecipientInfoList) {
        if (getBouncedRecipientInfoList() == null) setBouncedRecipientInfoList(new java.util.ArrayList<BouncedRecipientInfo>(bouncedRecipientInfoList.length));
        for (BouncedRecipientInfo value : bouncedRecipientInfoList) {
            getBouncedRecipientInfoList().add(value);
        }
        return this;
    }
    
    /**
     * A list of recipients of the bounced message, including the information
     * required to create the Delivery Status Notifications (DSNs) for the
     * recipients. You must specify at least one
     * <code>BouncedRecipientInfo</code> in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bouncedRecipientInfoList A list of recipients of the bounced message, including the information
     *         required to create the Delivery Status Notifications (DSNs) for the
     *         recipients. You must specify at least one
     *         <code>BouncedRecipientInfo</code> in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendBounceRequest withBouncedRecipientInfoList(java.util.Collection<BouncedRecipientInfo> bouncedRecipientInfoList) {
        if (bouncedRecipientInfoList == null) {
            this.bouncedRecipientInfoList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<BouncedRecipientInfo> bouncedRecipientInfoListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BouncedRecipientInfo>(bouncedRecipientInfoList.size());
            bouncedRecipientInfoListCopy.addAll(bouncedRecipientInfoList);
            this.bouncedRecipientInfoList = bouncedRecipientInfoListCopy;
        }

        return this;
    }

    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to use the address in the "From" header of the
     * bounce. For more information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     * SES Developer Guide</a>.
     *
     * @return This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to use the address in the "From" header of the
     *         bounce. For more information about sending authorization, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     *         SES Developer Guide</a>.
     */
    public String getBounceSenderArn() {
        return bounceSenderArn;
    }
    
    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to use the address in the "From" header of the
     * bounce. For more information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     * SES Developer Guide</a>.
     *
     * @param bounceSenderArn This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to use the address in the "From" header of the
     *         bounce. For more information about sending authorization, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     *         SES Developer Guide</a>.
     */
    public void setBounceSenderArn(String bounceSenderArn) {
        this.bounceSenderArn = bounceSenderArn;
    }
    
    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to use the address in the "From" header of the
     * bounce. For more information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     * SES Developer Guide</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bounceSenderArn This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to use the address in the "From" header of the
     *         bounce. For more information about sending authorization, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     *         SES Developer Guide</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendBounceRequest withBounceSenderArn(String bounceSenderArn) {
        this.bounceSenderArn = bounceSenderArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOriginalMessageId() != null) sb.append("OriginalMessageId: " + getOriginalMessageId() + ",");
        if (getBounceSender() != null) sb.append("BounceSender: " + getBounceSender() + ",");
        if (getExplanation() != null) sb.append("Explanation: " + getExplanation() + ",");
        if (getMessageDsn() != null) sb.append("MessageDsn: " + getMessageDsn() + ",");
        if (getBouncedRecipientInfoList() != null) sb.append("BouncedRecipientInfoList: " + getBouncedRecipientInfoList() + ",");
        if (getBounceSenderArn() != null) sb.append("BounceSenderArn: " + getBounceSenderArn() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SendBounceRequest == false) return false;
        SendBounceRequest other = (SendBounceRequest)obj;
        
        if (other.getOriginalMessageId() == null ^ this.getOriginalMessageId() == null) return false;
        if (other.getOriginalMessageId() != null && other.getOriginalMessageId().equals(this.getOriginalMessageId()) == false) return false; 
        if (other.getBounceSender() == null ^ this.getBounceSender() == null) return false;
        if (other.getBounceSender() != null && other.getBounceSender().equals(this.getBounceSender()) == false) return false; 
        if (other.getExplanation() == null ^ this.getExplanation() == null) return false;
        if (other.getExplanation() != null && other.getExplanation().equals(this.getExplanation()) == false) return false; 
        if (other.getMessageDsn() == null ^ this.getMessageDsn() == null) return false;
        if (other.getMessageDsn() != null && other.getMessageDsn().equals(this.getMessageDsn()) == false) return false; 
        if (other.getBouncedRecipientInfoList() == null ^ this.getBouncedRecipientInfoList() == null) return false;
        if (other.getBouncedRecipientInfoList() != null && other.getBouncedRecipientInfoList().equals(this.getBouncedRecipientInfoList()) == false) return false; 
        if (other.getBounceSenderArn() == null ^ this.getBounceSenderArn() == null) return false;
        if (other.getBounceSenderArn() != null && other.getBounceSenderArn().equals(this.getBounceSenderArn()) == false) return false; 
        return true;
    }
    
    @Override
    public SendBounceRequest clone() {
        
            return (SendBounceRequest) super.clone();
    }

}
    