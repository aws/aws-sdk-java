/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#sendEmail(SendEmailRequest) SendEmail operation}.
 * <p>
 * Composes an email message based on input data, and then immediately queues the message for sending.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>If you have not yet requested production access to Amazon SES, then you will only be able to send email to and from verified email
 * addresses and domains. For more information, go to the Amazon SES Developer Guide.
 * </p>
 * <p>
 * The total size of the message cannot exceed 10 MB.
 * </p>
 * <p>
 * Amazon SES has a limit on the total number of recipients per message: The combined number of To:, CC: and BCC: email addresses cannot exceed 50. If
 * you need to send an email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call Amazon SES
 * repeatedly to send the message to each group.
 * </p>
 * <p>
 * For every message that you send, the total number of recipients (To:, CC: and BCC:) is counted against your <i>sending quota</i> - the maximum number
 * of emails you can send in a 24-hour period. For information about your sending quota, go to the "Managing Your Sending Activity" section of the<a
 * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide"> Amazon SES Developer Guide </a> .
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#sendEmail(SendEmailRequest)
 */
public class SendEmailRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identity's email address.
     */
    private String source;

    /**
     * The destination for this email, composed of To:, CC:, and BCC: fields.
     */
    private Destination destination;

    /**
     * The message to be sent.
     */
    private Message message;

    /**
     * The reply-to email address(es) for the message. If the recipient
     * replies to the message, each reply-to address will receive the reply.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> replyToAddresses;

    /**
     * The email address to which bounce notifications are to be forwarded.
     * If the message cannot be delivered to the recipient, then an error
     * message will be returned from the recipient's ISP; this message will
     * then be forwarded to the email address specified by the
     * <code>ReturnPath</code> parameter.
     */
    private String returnPath;

    /**
     * Default constructor for a new SendEmailRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SendEmailRequest() {}
    
    /**
     * Constructs a new SendEmailRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param source The identity's email address.
     * @param destination The destination for this email, composed of To:,
     * CC:, and BCC: fields.
     * @param message The message to be sent.
     */
    public SendEmailRequest(String source, Destination destination, Message message) {
        setSource(source);
        setDestination(destination);
        setMessage(message);
    }

    /**
     * The identity's email address.
     *
     * @return The identity's email address.
     */
    public String getSource() {
        return source;
    }
    
    /**
     * The identity's email address.
     *
     * @param source The identity's email address.
     */
    public void setSource(String source) {
        this.source = source;
    }
    
    /**
     * The identity's email address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param source The identity's email address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendEmailRequest withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * The destination for this email, composed of To:, CC:, and BCC: fields.
     *
     * @return The destination for this email, composed of To:, CC:, and BCC: fields.
     */
    public Destination getDestination() {
        return destination;
    }
    
    /**
     * The destination for this email, composed of To:, CC:, and BCC: fields.
     *
     * @param destination The destination for this email, composed of To:, CC:, and BCC: fields.
     */
    public void setDestination(Destination destination) {
        this.destination = destination;
    }
    
    /**
     * The destination for this email, composed of To:, CC:, and BCC: fields.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destination The destination for this email, composed of To:, CC:, and BCC: fields.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendEmailRequest withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * The message to be sent.
     *
     * @return The message to be sent.
     */
    public Message getMessage() {
        return message;
    }
    
    /**
     * The message to be sent.
     *
     * @param message The message to be sent.
     */
    public void setMessage(Message message) {
        this.message = message;
    }
    
    /**
     * The message to be sent.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The message to be sent.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendEmailRequest withMessage(Message message) {
        this.message = message;
        return this;
    }

    /**
     * The reply-to email address(es) for the message. If the recipient
     * replies to the message, each reply-to address will receive the reply.
     *
     * @return The reply-to email address(es) for the message. If the recipient
     *         replies to the message, each reply-to address will receive the reply.
     */
    public java.util.List<String> getReplyToAddresses() {
        if (replyToAddresses == null) {
              replyToAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              replyToAddresses.setAutoConstruct(true);
        }
        return replyToAddresses;
    }
    
    /**
     * The reply-to email address(es) for the message. If the recipient
     * replies to the message, each reply-to address will receive the reply.
     *
     * @param replyToAddresses The reply-to email address(es) for the message. If the recipient
     *         replies to the message, each reply-to address will receive the reply.
     */
    public void setReplyToAddresses(java.util.Collection<String> replyToAddresses) {
        if (replyToAddresses == null) {
            this.replyToAddresses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> replyToAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(replyToAddresses.size());
        replyToAddressesCopy.addAll(replyToAddresses);
        this.replyToAddresses = replyToAddressesCopy;
    }
    
    /**
     * The reply-to email address(es) for the message. If the recipient
     * replies to the message, each reply-to address will receive the reply.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replyToAddresses The reply-to email address(es) for the message. If the recipient
     *         replies to the message, each reply-to address will receive the reply.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendEmailRequest withReplyToAddresses(String... replyToAddresses) {
        if (getReplyToAddresses() == null) setReplyToAddresses(new java.util.ArrayList<String>(replyToAddresses.length));
        for (String value : replyToAddresses) {
            getReplyToAddresses().add(value);
        }
        return this;
    }
    
    /**
     * The reply-to email address(es) for the message. If the recipient
     * replies to the message, each reply-to address will receive the reply.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replyToAddresses The reply-to email address(es) for the message. If the recipient
     *         replies to the message, each reply-to address will receive the reply.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendEmailRequest withReplyToAddresses(java.util.Collection<String> replyToAddresses) {
        if (replyToAddresses == null) {
            this.replyToAddresses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> replyToAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(replyToAddresses.size());
            replyToAddressesCopy.addAll(replyToAddresses);
            this.replyToAddresses = replyToAddressesCopy;
        }

        return this;
    }

    /**
     * The email address to which bounce notifications are to be forwarded.
     * If the message cannot be delivered to the recipient, then an error
     * message will be returned from the recipient's ISP; this message will
     * then be forwarded to the email address specified by the
     * <code>ReturnPath</code> parameter.
     *
     * @return The email address to which bounce notifications are to be forwarded.
     *         If the message cannot be delivered to the recipient, then an error
     *         message will be returned from the recipient's ISP; this message will
     *         then be forwarded to the email address specified by the
     *         <code>ReturnPath</code> parameter.
     */
    public String getReturnPath() {
        return returnPath;
    }
    
    /**
     * The email address to which bounce notifications are to be forwarded.
     * If the message cannot be delivered to the recipient, then an error
     * message will be returned from the recipient's ISP; this message will
     * then be forwarded to the email address specified by the
     * <code>ReturnPath</code> parameter.
     *
     * @param returnPath The email address to which bounce notifications are to be forwarded.
     *         If the message cannot be delivered to the recipient, then an error
     *         message will be returned from the recipient's ISP; this message will
     *         then be forwarded to the email address specified by the
     *         <code>ReturnPath</code> parameter.
     */
    public void setReturnPath(String returnPath) {
        this.returnPath = returnPath;
    }
    
    /**
     * The email address to which bounce notifications are to be forwarded.
     * If the message cannot be delivered to the recipient, then an error
     * message will be returned from the recipient's ISP; this message will
     * then be forwarded to the email address specified by the
     * <code>ReturnPath</code> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param returnPath The email address to which bounce notifications are to be forwarded.
     *         If the message cannot be delivered to the recipient, then an error
     *         message will be returned from the recipient's ISP; this message will
     *         then be forwarded to the email address specified by the
     *         <code>ReturnPath</code> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendEmailRequest withReturnPath(String returnPath) {
        this.returnPath = returnPath;
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
        if (getSource() != null) sb.append("Source: " + getSource() + ",");
        if (getDestination() != null) sb.append("Destination: " + getDestination() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getReplyToAddresses() != null) sb.append("ReplyToAddresses: " + getReplyToAddresses() + ",");
        if (getReturnPath() != null) sb.append("ReturnPath: " + getReturnPath() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode()); 
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        hashCode = prime * hashCode + ((getReplyToAddresses() == null) ? 0 : getReplyToAddresses().hashCode()); 
        hashCode = prime * hashCode + ((getReturnPath() == null) ? 0 : getReturnPath().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SendEmailRequest == false) return false;
        SendEmailRequest other = (SendEmailRequest)obj;
        
        if (other.getSource() == null ^ this.getSource() == null) return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false) return false; 
        if (other.getDestination() == null ^ this.getDestination() == null) return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getReplyToAddresses() == null ^ this.getReplyToAddresses() == null) return false;
        if (other.getReplyToAddresses() != null && other.getReplyToAddresses().equals(this.getReplyToAddresses()) == false) return false; 
        if (other.getReturnPath() == null ^ this.getReturnPath() == null) return false;
        if (other.getReturnPath() != null && other.getReturnPath().equals(this.getReturnPath()) == false) return false; 
        return true;
    }
    
}
    