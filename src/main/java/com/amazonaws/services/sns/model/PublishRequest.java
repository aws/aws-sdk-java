/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#publish(PublishRequest) Publish operation}.
 * <p>
 * The Publish action sends a message to all of a topic's subscribed
 * endpoints. When a messageId is returned, the message has been saved
 * and Amazon SNS will attempt to deliver it to the topic's subscribers
 * shortly. The format of the outgoing message to each subscribed
 * endpoint depends on the notification protocol selected.
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#publish(PublishRequest)
 */
public class PublishRequest extends AmazonWebServiceRequest {

    /**
     * The topic you want to publish to.
     */
    private String topicArn;

    /**
     * The message you want to send to the topic. <p>Constraints: Messages
     * must be UTF-8 encoded strings at most 8 KB in size (8192 bytes, not
     * 8192 characters).
     */
    private String message;

    /**
     * Optional parameter to be used as the "Subject" line of when the
     * message is delivered to e-mail endpoints. This field will also be
     * included, if present, in the standard JSON messages delivered to other
     * endpoints. <p>Constraints: Subjects must be ASCII text that begins
     * with a letter, number or punctuation mark; must not include line
     * breaks or control characters; and must be less than 100 characters
     * long.
     */
    private String subject;

    /**
     * Default constructor for a new PublishRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PublishRequest() {}
    
    /**
     * Constructs a new PublishRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn The topic you want to publish to.
     * @param message The message you want to send to the topic.
     * <p>Constraints: Messages must be UTF-8 encoded strings at most 8 KB in
     * size (8192 bytes, not 8192 characters).
     */
    public PublishRequest(String topicArn, String message) {
        this.topicArn = topicArn;
        this.message = message;
    }
    
    /**
     * Constructs a new PublishRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn The topic you want to publish to.
     * @param message The message you want to send to the topic.
     * <p>Constraints: Messages must be UTF-8 encoded strings at most 8 KB in
     * size (8192 bytes, not 8192 characters).
     * @param subject Optional parameter to be used as the "Subject" line of
     * when the message is delivered to e-mail endpoints. This field will
     * also be included, if present, in the standard JSON messages delivered
     * to other endpoints. <p>Constraints: Subjects must be ASCII text that
     * begins with a letter, number or punctuation mark; must not include
     * line breaks or control characters; and must be less than 100
     * characters long.
     */
    public PublishRequest(String topicArn, String message, String subject) {
        this.topicArn = topicArn;
        this.message = message;
        this.subject = subject;
    }
    
    /**
     * The topic you want to publish to.
     *
     * @return The topic you want to publish to.
     */
    public String getTopicArn() {
        return topicArn;
    }
    
    /**
     * The topic you want to publish to.
     *
     * @param topicArn The topic you want to publish to.
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }
    
    /**
     * The topic you want to publish to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicArn The topic you want to publish to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PublishRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }
    
    
    /**
     * The message you want to send to the topic. <p>Constraints: Messages
     * must be UTF-8 encoded strings at most 8 KB in size (8192 bytes, not
     * 8192 characters).
     *
     * @return The message you want to send to the topic. <p>Constraints: Messages
     *         must be UTF-8 encoded strings at most 8 KB in size (8192 bytes, not
     *         8192 characters).
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The message you want to send to the topic. <p>Constraints: Messages
     * must be UTF-8 encoded strings at most 8 KB in size (8192 bytes, not
     * 8192 characters).
     *
     * @param message The message you want to send to the topic. <p>Constraints: Messages
     *         must be UTF-8 encoded strings at most 8 KB in size (8192 bytes, not
     *         8192 characters).
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The message you want to send to the topic. <p>Constraints: Messages
     * must be UTF-8 encoded strings at most 8 KB in size (8192 bytes, not
     * 8192 characters).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The message you want to send to the topic. <p>Constraints: Messages
     *         must be UTF-8 encoded strings at most 8 KB in size (8192 bytes, not
     *         8192 characters).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PublishRequest withMessage(String message) {
        this.message = message;
        return this;
    }
    
    
    /**
     * Optional parameter to be used as the "Subject" line of when the
     * message is delivered to e-mail endpoints. This field will also be
     * included, if present, in the standard JSON messages delivered to other
     * endpoints. <p>Constraints: Subjects must be ASCII text that begins
     * with a letter, number or punctuation mark; must not include line
     * breaks or control characters; and must be less than 100 characters
     * long.
     *
     * @return Optional parameter to be used as the "Subject" line of when the
     *         message is delivered to e-mail endpoints. This field will also be
     *         included, if present, in the standard JSON messages delivered to other
     *         endpoints. <p>Constraints: Subjects must be ASCII text that begins
     *         with a letter, number or punctuation mark; must not include line
     *         breaks or control characters; and must be less than 100 characters
     *         long.
     */
    public String getSubject() {
        return subject;
    }
    
    /**
     * Optional parameter to be used as the "Subject" line of when the
     * message is delivered to e-mail endpoints. This field will also be
     * included, if present, in the standard JSON messages delivered to other
     * endpoints. <p>Constraints: Subjects must be ASCII text that begins
     * with a letter, number or punctuation mark; must not include line
     * breaks or control characters; and must be less than 100 characters
     * long.
     *
     * @param subject Optional parameter to be used as the "Subject" line of when the
     *         message is delivered to e-mail endpoints. This field will also be
     *         included, if present, in the standard JSON messages delivered to other
     *         endpoints. <p>Constraints: Subjects must be ASCII text that begins
     *         with a letter, number or punctuation mark; must not include line
     *         breaks or control characters; and must be less than 100 characters
     *         long.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    /**
     * Optional parameter to be used as the "Subject" line of when the
     * message is delivered to e-mail endpoints. This field will also be
     * included, if present, in the standard JSON messages delivered to other
     * endpoints. <p>Constraints: Subjects must be ASCII text that begins
     * with a letter, number or punctuation mark; must not include line
     * breaks or control characters; and must be less than 100 characters
     * long.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subject Optional parameter to be used as the "Subject" line of when the
     *         message is delivered to e-mail endpoints. This field will also be
     *         included, if present, in the standard JSON messages delivered to other
     *         endpoints. <p>Constraints: Subjects must be ASCII text that begins
     *         with a letter, number or punctuation mark; must not include line
     *         breaks or control characters; and must be less than 100 characters
     *         long.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PublishRequest withSubject(String subject) {
        this.subject = subject;
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
        sb.append("TopicArn: " + topicArn + ", ");
        sb.append("Message: " + message + ", ");
        sb.append("Subject: " + subject + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    