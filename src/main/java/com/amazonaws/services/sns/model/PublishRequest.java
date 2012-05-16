/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The Publish action sends a message to all of a topic's subscribed endpoints. When a messageId is returned, the message has been saved and Amazon SNS
 * will attempt to deliver it to the topic's subscribers shortly. The format of the outgoing message to each subscribed endpoint depends on the
 * notification protocol selected.
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
     * Optional parameter. It will have one valid value: "json". If this
     * option, Message is present and set to "json", the value of Message
     * must: be a syntactically valid JSON object. It must contain at least a
     * top level JSON key of "default" with a value that is a string. For any
     * other top level key that matches one of our transport protocols (e.g.
     * "http"), then the corresponding value (if it is a string) will be used
     * for the message published for that protocol <p>Constraints: Keys in
     * the JSON object that correspond to supported transport protocols must
     * have simple JSON string values. The values will be parsed (unescaped)
     * before they are used in outgoing messages. Typically, outbound
     * notifications are JSON encoded (meaning, the characters will be
     * reescaped for sending). JSON strings are UTF-8. Values have a minimum
     * length of 0 (the empty string, "", is allowed). Values have a maximum
     * length bounded by the overall message size (so, including multiple
     * protocols may limit message sizes). Non-string values will cause the
     * key to be ignored. Keys that do not correspond to supported transport
     * protocols will be ignored. Duplicate keys are not allowed. Failure to
     * parse or validate any key or value in the message will cause the
     * Publish call to return an error (no partial delivery).
     */
    private String messageStructure;

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
     * Optional parameter. It will have one valid value: "json". If this
     * option, Message is present and set to "json", the value of Message
     * must: be a syntactically valid JSON object. It must contain at least a
     * top level JSON key of "default" with a value that is a string. For any
     * other top level key that matches one of our transport protocols (e.g.
     * "http"), then the corresponding value (if it is a string) will be used
     * for the message published for that protocol <p>Constraints: Keys in
     * the JSON object that correspond to supported transport protocols must
     * have simple JSON string values. The values will be parsed (unescaped)
     * before they are used in outgoing messages. Typically, outbound
     * notifications are JSON encoded (meaning, the characters will be
     * reescaped for sending). JSON strings are UTF-8. Values have a minimum
     * length of 0 (the empty string, "", is allowed). Values have a maximum
     * length bounded by the overall message size (so, including multiple
     * protocols may limit message sizes). Non-string values will cause the
     * key to be ignored. Keys that do not correspond to supported transport
     * protocols will be ignored. Duplicate keys are not allowed. Failure to
     * parse or validate any key or value in the message will cause the
     * Publish call to return an error (no partial delivery).
     *
     * @return Optional parameter. It will have one valid value: "json". If this
     *         option, Message is present and set to "json", the value of Message
     *         must: be a syntactically valid JSON object. It must contain at least a
     *         top level JSON key of "default" with a value that is a string. For any
     *         other top level key that matches one of our transport protocols (e.g.
     *         "http"), then the corresponding value (if it is a string) will be used
     *         for the message published for that protocol <p>Constraints: Keys in
     *         the JSON object that correspond to supported transport protocols must
     *         have simple JSON string values. The values will be parsed (unescaped)
     *         before they are used in outgoing messages. Typically, outbound
     *         notifications are JSON encoded (meaning, the characters will be
     *         reescaped for sending). JSON strings are UTF-8. Values have a minimum
     *         length of 0 (the empty string, "", is allowed). Values have a maximum
     *         length bounded by the overall message size (so, including multiple
     *         protocols may limit message sizes). Non-string values will cause the
     *         key to be ignored. Keys that do not correspond to supported transport
     *         protocols will be ignored. Duplicate keys are not allowed. Failure to
     *         parse or validate any key or value in the message will cause the
     *         Publish call to return an error (no partial delivery).
     */
    public String getMessageStructure() {
        return messageStructure;
    }
    
    /**
     * Optional parameter. It will have one valid value: "json". If this
     * option, Message is present and set to "json", the value of Message
     * must: be a syntactically valid JSON object. It must contain at least a
     * top level JSON key of "default" with a value that is a string. For any
     * other top level key that matches one of our transport protocols (e.g.
     * "http"), then the corresponding value (if it is a string) will be used
     * for the message published for that protocol <p>Constraints: Keys in
     * the JSON object that correspond to supported transport protocols must
     * have simple JSON string values. The values will be parsed (unescaped)
     * before they are used in outgoing messages. Typically, outbound
     * notifications are JSON encoded (meaning, the characters will be
     * reescaped for sending). JSON strings are UTF-8. Values have a minimum
     * length of 0 (the empty string, "", is allowed). Values have a maximum
     * length bounded by the overall message size (so, including multiple
     * protocols may limit message sizes). Non-string values will cause the
     * key to be ignored. Keys that do not correspond to supported transport
     * protocols will be ignored. Duplicate keys are not allowed. Failure to
     * parse or validate any key or value in the message will cause the
     * Publish call to return an error (no partial delivery).
     *
     * @param messageStructure Optional parameter. It will have one valid value: "json". If this
     *         option, Message is present and set to "json", the value of Message
     *         must: be a syntactically valid JSON object. It must contain at least a
     *         top level JSON key of "default" with a value that is a string. For any
     *         other top level key that matches one of our transport protocols (e.g.
     *         "http"), then the corresponding value (if it is a string) will be used
     *         for the message published for that protocol <p>Constraints: Keys in
     *         the JSON object that correspond to supported transport protocols must
     *         have simple JSON string values. The values will be parsed (unescaped)
     *         before they are used in outgoing messages. Typically, outbound
     *         notifications are JSON encoded (meaning, the characters will be
     *         reescaped for sending). JSON strings are UTF-8. Values have a minimum
     *         length of 0 (the empty string, "", is allowed). Values have a maximum
     *         length bounded by the overall message size (so, including multiple
     *         protocols may limit message sizes). Non-string values will cause the
     *         key to be ignored. Keys that do not correspond to supported transport
     *         protocols will be ignored. Duplicate keys are not allowed. Failure to
     *         parse or validate any key or value in the message will cause the
     *         Publish call to return an error (no partial delivery).
     */
    public void setMessageStructure(String messageStructure) {
        this.messageStructure = messageStructure;
    }
    
    /**
     * Optional parameter. It will have one valid value: "json". If this
     * option, Message is present and set to "json", the value of Message
     * must: be a syntactically valid JSON object. It must contain at least a
     * top level JSON key of "default" with a value that is a string. For any
     * other top level key that matches one of our transport protocols (e.g.
     * "http"), then the corresponding value (if it is a string) will be used
     * for the message published for that protocol <p>Constraints: Keys in
     * the JSON object that correspond to supported transport protocols must
     * have simple JSON string values. The values will be parsed (unescaped)
     * before they are used in outgoing messages. Typically, outbound
     * notifications are JSON encoded (meaning, the characters will be
     * reescaped for sending). JSON strings are UTF-8. Values have a minimum
     * length of 0 (the empty string, "", is allowed). Values have a maximum
     * length bounded by the overall message size (so, including multiple
     * protocols may limit message sizes). Non-string values will cause the
     * key to be ignored. Keys that do not correspond to supported transport
     * protocols will be ignored. Duplicate keys are not allowed. Failure to
     * parse or validate any key or value in the message will cause the
     * Publish call to return an error (no partial delivery).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageStructure Optional parameter. It will have one valid value: "json". If this
     *         option, Message is present and set to "json", the value of Message
     *         must: be a syntactically valid JSON object. It must contain at least a
     *         top level JSON key of "default" with a value that is a string. For any
     *         other top level key that matches one of our transport protocols (e.g.
     *         "http"), then the corresponding value (if it is a string) will be used
     *         for the message published for that protocol <p>Constraints: Keys in
     *         the JSON object that correspond to supported transport protocols must
     *         have simple JSON string values. The values will be parsed (unescaped)
     *         before they are used in outgoing messages. Typically, outbound
     *         notifications are JSON encoded (meaning, the characters will be
     *         reescaped for sending). JSON strings are UTF-8. Values have a minimum
     *         length of 0 (the empty string, "", is allowed). Values have a maximum
     *         length bounded by the overall message size (so, including multiple
     *         protocols may limit message sizes). Non-string values will cause the
     *         key to be ignored. Keys that do not correspond to supported transport
     *         protocols will be ignored. Duplicate keys are not allowed. Failure to
     *         parse or validate any key or value in the message will cause the
     *         Publish call to return an error (no partial delivery).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PublishRequest withMessageStructure(String messageStructure) {
        this.messageStructure = messageStructure;
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
        if (topicArn != null) sb.append("TopicArn: " + topicArn + ", ");
        if (message != null) sb.append("Message: " + message + ", ");
        if (subject != null) sb.append("Subject: " + subject + ", ");
        if (messageStructure != null) sb.append("MessageStructure: " + messageStructure + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode()); 
        hashCode = prime * hashCode + ((getMessageStructure() == null) ? 0 : getMessageStructure().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof PublishRequest == false) return false;
        PublishRequest other = (PublishRequest)obj;
        
        if (other.getTopicArn() == null ^ this.getTopicArn() == null) return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getSubject() == null ^ this.getSubject() == null) return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false) return false; 
        if (other.getMessageStructure() == null ^ this.getMessageStructure() == null) return false;
        if (other.getMessageStructure() != null && other.getMessageStructure().equals(this.getMessageStructure()) == false) return false; 
        return true;
    }
    
}
    