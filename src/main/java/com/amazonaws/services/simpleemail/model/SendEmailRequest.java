/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#sendEmail(SendEmailRequest) SendEmail operation}.
 * <p>
 * Composes an email message based on input data, and then immediately
 * queues the message for sending.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>If you have not yet requested production access to
 * Amazon SES, then you will only be able to send email to and from
 * verified email addresses. For more information, go to the Amazon SES
 * Developer Guide.
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#sendEmail(SendEmailRequest)
 */
public class SendEmailRequest extends AmazonWebServiceRequest {

    /**
     * The sender's email address.
     */
    private String source;

    /**
     * The destination for this email, composed of To:, From:, and CC:
     * fields.
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
    private java.util.List<String> replyToAddresses;

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
     * @param source The sender's email address.
     * @param destination The destination for this email, composed of To:,
     * From:, and CC: fields.
     * @param message The message to be sent.
     */
    public SendEmailRequest(String source, Destination destination, Message message) {
        this.source = source;
        this.destination = destination;
        this.message = message;
    }

    
    
    /**
     * The sender's email address.
     *
     * @return The sender's email address.
     */
    public String getSource() {
        return source;
    }
    
    /**
     * The sender's email address.
     *
     * @param source The sender's email address.
     */
    public void setSource(String source) {
        this.source = source;
    }
    
    /**
     * The sender's email address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param source The sender's email address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SendEmailRequest withSource(String source) {
        this.source = source;
        return this;
    }
    
    
    /**
     * The destination for this email, composed of To:, From:, and CC:
     * fields.
     *
     * @return The destination for this email, composed of To:, From:, and CC:
     *         fields.
     */
    public Destination getDestination() {
        return destination;
    }
    
    /**
     * The destination for this email, composed of To:, From:, and CC:
     * fields.
     *
     * @param destination The destination for this email, composed of To:, From:, and CC:
     *         fields.
     */
    public void setDestination(Destination destination) {
        this.destination = destination;
    }
    
    /**
     * The destination for this email, composed of To:, From:, and CC:
     * fields.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destination The destination for this email, composed of To:, From:, and CC:
     *         fields.
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
            replyToAddresses = new java.util.ArrayList<String>();
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
        java.util.List<String> replyToAddressesCopy = new java.util.ArrayList<String>();
        if (replyToAddresses != null) {
            replyToAddressesCopy.addAll(replyToAddresses);
        }
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
        if (getReplyToAddresses() == null) setReplyToAddresses(new java.util.ArrayList<String>());
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
        java.util.List<String> replyToAddressesCopy = new java.util.ArrayList<String>();
        if (replyToAddresses != null) {
            replyToAddressesCopy.addAll(replyToAddresses);
        }
        this.replyToAddresses = replyToAddressesCopy;

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
        sb.append("Source: " + source + ", ");
        sb.append("Destination: " + destination + ", ");
        sb.append("Message: " + message + ", ");
        sb.append("ReplyToAddresses: " + replyToAddresses + ", ");
        sb.append("ReturnPath: " + returnPath + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    