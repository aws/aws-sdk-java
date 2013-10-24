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
package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#publish(PublishRequest) Publish operation}.
 * <p>
 * The <code>Publish</code> action sends a message to all of a topic's subscribed endpoints. When a <code>messageId</code> is returned, the message has
 * been saved and Amazon SNS will attempt to deliver it to the topic's subscribers shortly. The format of the outgoing message to each subscribed
 * endpoint depends on the notification protocol selected.
 * </p>
 * <p>
 * To use the <code>Publish</code> action for sending a message to a mobile endpoint, such as an app on a Kindle device or mobile phone, you must specify
 * the EndpointArn. The EndpointArn is returned when making a call with the <code>CreatePlatformEndpoint</code> action. The second example below shows a
 * request and response for publishing to a mobile endpoint.
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#publish(PublishRequest)
 */
public class PublishRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The topic you want to publish to.
     */
    private String topicArn;

    /**
     * Either TopicArn or EndpointArn, but not both.
     */
    private String targetArn;

    /**
     * The message you want to send to the topic. <p>If you want to send the
     * same message to all transport protocols, include the text of the
     * message as a String value. <p>If you want to send different messages
     * for each transport protocol, set the value of the
     * <code>MessageStructure</code> parameter to <code>json</code> and use a
     * JSON object for the <code>Message</code> parameter. See the Examples
     * section for the format of the JSON object. <p>Constraints: Messages
     * must be UTF-8 encoded strings at most 256 KB in size (262144 bytes,
     * not 262144 characters). <p>JSON-specific constraints: <ul> <li>Keys in
     * the JSON object that correspond to supported transport protocols must
     * have simple JSON string values. </li> <li>The values will be parsed
     * (unescaped) before they are used in outgoing messages.</li>
     * <li>Outbound notifications are JSON encoded (meaning that the
     * characters will be reescaped for sending).</li> <li>Values have a
     * minimum length of 0 (the empty string, "", is allowed).</li>
     * <li>Values have a maximum length bounded by the overall message size
     * (so, including multiple protocols may limit message sizes).</li>
     * <li>Non-string values will cause the key to be ignored.</li> <li>Keys
     * that do not correspond to supported transport protocols are
     * ignored.</li> <li>Duplicate keys are not allowed.</li> <li>Failure to
     * parse or validate any key or value in the message will cause the
     * <code>Publish</code> call to return an error (no partial
     * delivery).</li> </ul>
     */
    private String message;

    /**
     * Optional parameter to be used as the "Subject" line when the message
     * is delivered to email endpoints. This field will also be included, if
     * present, in the standard JSON messages delivered to other endpoints.
     * <p>Constraints: Subjects must be ASCII text that begins with a letter,
     * number, or punctuation mark; must not include line breaks or control
     * characters; and must be less than 100 characters long.
     */
    private String subject;

    /**
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers
     * and a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must: <ul> <li>be a syntactically valid
     * JSON object; and</li> <li>contain at least a top-level JSON key of
     * "default" with a value that is a string.</li> </ul> <p> You can define
     * other top-level keys that define the message you want to send to a
     * specific transport protocol (e.g., "http"). <p>For information about
     * sending different messages for each protocol using the AWS Management
     * Console, go to <a
     * href="http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol">Create
     * Different Messages for Each Protocol</a> in the <i>Amazon Simple
     * Notification Service Getting Started Guide</i>. <p>Valid value:
     * <code>json</code>
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
     * @param message The message you want to send to the topic. <p>If you
     * want to send the same message to all transport protocols, include the
     * text of the message as a String value. <p>If you want to send
     * different messages for each transport protocol, set the value of the
     * <code>MessageStructure</code> parameter to <code>json</code> and use a
     * JSON object for the <code>Message</code> parameter. See the Examples
     * section for the format of the JSON object. <p>Constraints: Messages
     * must be UTF-8 encoded strings at most 256 KB in size (262144 bytes,
     * not 262144 characters). <p>JSON-specific constraints: <ul> <li>Keys in
     * the JSON object that correspond to supported transport protocols must
     * have simple JSON string values. </li> <li>The values will be parsed
     * (unescaped) before they are used in outgoing messages.</li>
     * <li>Outbound notifications are JSON encoded (meaning that the
     * characters will be reescaped for sending).</li> <li>Values have a
     * minimum length of 0 (the empty string, "", is allowed).</li>
     * <li>Values have a maximum length bounded by the overall message size
     * (so, including multiple protocols may limit message sizes).</li>
     * <li>Non-string values will cause the key to be ignored.</li> <li>Keys
     * that do not correspond to supported transport protocols are
     * ignored.</li> <li>Duplicate keys are not allowed.</li> <li>Failure to
     * parse or validate any key or value in the message will cause the
     * <code>Publish</code> call to return an error (no partial
     * delivery).</li> </ul>
     */
    public PublishRequest(String topicArn, String message) {
        setTopicArn(topicArn);
        setMessage(message);
    }

    /**
     * Constructs a new PublishRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn The topic you want to publish to.
     * @param message The message you want to send to the topic. <p>If you
     * want to send the same message to all transport protocols, include the
     * text of the message as a String value. <p>If you want to send
     * different messages for each transport protocol, set the value of the
     * <code>MessageStructure</code> parameter to <code>json</code> and use a
     * JSON object for the <code>Message</code> parameter. See the Examples
     * section for the format of the JSON object. <p>Constraints: Messages
     * must be UTF-8 encoded strings at most 256 KB in size (262144 bytes,
     * not 262144 characters). <p>JSON-specific constraints: <ul> <li>Keys in
     * the JSON object that correspond to supported transport protocols must
     * have simple JSON string values. </li> <li>The values will be parsed
     * (unescaped) before they are used in outgoing messages.</li>
     * <li>Outbound notifications are JSON encoded (meaning that the
     * characters will be reescaped for sending).</li> <li>Values have a
     * minimum length of 0 (the empty string, "", is allowed).</li>
     * <li>Values have a maximum length bounded by the overall message size
     * (so, including multiple protocols may limit message sizes).</li>
     * <li>Non-string values will cause the key to be ignored.</li> <li>Keys
     * that do not correspond to supported transport protocols are
     * ignored.</li> <li>Duplicate keys are not allowed.</li> <li>Failure to
     * parse or validate any key or value in the message will cause the
     * <code>Publish</code> call to return an error (no partial
     * delivery).</li> </ul>
     * @param subject Optional parameter to be used as the "Subject" line
     * when the message is delivered to email endpoints. This field will also
     * be included, if present, in the standard JSON messages delivered to
     * other endpoints. <p>Constraints: Subjects must be ASCII text that
     * begins with a letter, number, or punctuation mark; must not include
     * line breaks or control characters; and must be less than 100
     * characters long.
     */
    public PublishRequest(String topicArn, String message, String subject) {
        setTopicArn(topicArn);
        setMessage(message);
        setSubject(subject);
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
     * Either TopicArn or EndpointArn, but not both.
     *
     * @return Either TopicArn or EndpointArn, but not both.
     */
    public String getTargetArn() {
        return targetArn;
    }
    
    /**
     * Either TopicArn or EndpointArn, but not both.
     *
     * @param targetArn Either TopicArn or EndpointArn, but not both.
     */
    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }
    
    /**
     * Either TopicArn or EndpointArn, but not both.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetArn Either TopicArn or EndpointArn, but not both.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PublishRequest withTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * The message you want to send to the topic. <p>If you want to send the
     * same message to all transport protocols, include the text of the
     * message as a String value. <p>If you want to send different messages
     * for each transport protocol, set the value of the
     * <code>MessageStructure</code> parameter to <code>json</code> and use a
     * JSON object for the <code>Message</code> parameter. See the Examples
     * section for the format of the JSON object. <p>Constraints: Messages
     * must be UTF-8 encoded strings at most 256 KB in size (262144 bytes,
     * not 262144 characters). <p>JSON-specific constraints: <ul> <li>Keys in
     * the JSON object that correspond to supported transport protocols must
     * have simple JSON string values. </li> <li>The values will be parsed
     * (unescaped) before they are used in outgoing messages.</li>
     * <li>Outbound notifications are JSON encoded (meaning that the
     * characters will be reescaped for sending).</li> <li>Values have a
     * minimum length of 0 (the empty string, "", is allowed).</li>
     * <li>Values have a maximum length bounded by the overall message size
     * (so, including multiple protocols may limit message sizes).</li>
     * <li>Non-string values will cause the key to be ignored.</li> <li>Keys
     * that do not correspond to supported transport protocols are
     * ignored.</li> <li>Duplicate keys are not allowed.</li> <li>Failure to
     * parse or validate any key or value in the message will cause the
     * <code>Publish</code> call to return an error (no partial
     * delivery).</li> </ul>
     *
     * @return The message you want to send to the topic. <p>If you want to send the
     *         same message to all transport protocols, include the text of the
     *         message as a String value. <p>If you want to send different messages
     *         for each transport protocol, set the value of the
     *         <code>MessageStructure</code> parameter to <code>json</code> and use a
     *         JSON object for the <code>Message</code> parameter. See the Examples
     *         section for the format of the JSON object. <p>Constraints: Messages
     *         must be UTF-8 encoded strings at most 256 KB in size (262144 bytes,
     *         not 262144 characters). <p>JSON-specific constraints: <ul> <li>Keys in
     *         the JSON object that correspond to supported transport protocols must
     *         have simple JSON string values. </li> <li>The values will be parsed
     *         (unescaped) before they are used in outgoing messages.</li>
     *         <li>Outbound notifications are JSON encoded (meaning that the
     *         characters will be reescaped for sending).</li> <li>Values have a
     *         minimum length of 0 (the empty string, "", is allowed).</li>
     *         <li>Values have a maximum length bounded by the overall message size
     *         (so, including multiple protocols may limit message sizes).</li>
     *         <li>Non-string values will cause the key to be ignored.</li> <li>Keys
     *         that do not correspond to supported transport protocols are
     *         ignored.</li> <li>Duplicate keys are not allowed.</li> <li>Failure to
     *         parse or validate any key or value in the message will cause the
     *         <code>Publish</code> call to return an error (no partial
     *         delivery).</li> </ul>
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The message you want to send to the topic. <p>If you want to send the
     * same message to all transport protocols, include the text of the
     * message as a String value. <p>If you want to send different messages
     * for each transport protocol, set the value of the
     * <code>MessageStructure</code> parameter to <code>json</code> and use a
     * JSON object for the <code>Message</code> parameter. See the Examples
     * section for the format of the JSON object. <p>Constraints: Messages
     * must be UTF-8 encoded strings at most 256 KB in size (262144 bytes,
     * not 262144 characters). <p>JSON-specific constraints: <ul> <li>Keys in
     * the JSON object that correspond to supported transport protocols must
     * have simple JSON string values. </li> <li>The values will be parsed
     * (unescaped) before they are used in outgoing messages.</li>
     * <li>Outbound notifications are JSON encoded (meaning that the
     * characters will be reescaped for sending).</li> <li>Values have a
     * minimum length of 0 (the empty string, "", is allowed).</li>
     * <li>Values have a maximum length bounded by the overall message size
     * (so, including multiple protocols may limit message sizes).</li>
     * <li>Non-string values will cause the key to be ignored.</li> <li>Keys
     * that do not correspond to supported transport protocols are
     * ignored.</li> <li>Duplicate keys are not allowed.</li> <li>Failure to
     * parse or validate any key or value in the message will cause the
     * <code>Publish</code> call to return an error (no partial
     * delivery).</li> </ul>
     *
     * @param message The message you want to send to the topic. <p>If you want to send the
     *         same message to all transport protocols, include the text of the
     *         message as a String value. <p>If you want to send different messages
     *         for each transport protocol, set the value of the
     *         <code>MessageStructure</code> parameter to <code>json</code> and use a
     *         JSON object for the <code>Message</code> parameter. See the Examples
     *         section for the format of the JSON object. <p>Constraints: Messages
     *         must be UTF-8 encoded strings at most 256 KB in size (262144 bytes,
     *         not 262144 characters). <p>JSON-specific constraints: <ul> <li>Keys in
     *         the JSON object that correspond to supported transport protocols must
     *         have simple JSON string values. </li> <li>The values will be parsed
     *         (unescaped) before they are used in outgoing messages.</li>
     *         <li>Outbound notifications are JSON encoded (meaning that the
     *         characters will be reescaped for sending).</li> <li>Values have a
     *         minimum length of 0 (the empty string, "", is allowed).</li>
     *         <li>Values have a maximum length bounded by the overall message size
     *         (so, including multiple protocols may limit message sizes).</li>
     *         <li>Non-string values will cause the key to be ignored.</li> <li>Keys
     *         that do not correspond to supported transport protocols are
     *         ignored.</li> <li>Duplicate keys are not allowed.</li> <li>Failure to
     *         parse or validate any key or value in the message will cause the
     *         <code>Publish</code> call to return an error (no partial
     *         delivery).</li> </ul>
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The message you want to send to the topic. <p>If you want to send the
     * same message to all transport protocols, include the text of the
     * message as a String value. <p>If you want to send different messages
     * for each transport protocol, set the value of the
     * <code>MessageStructure</code> parameter to <code>json</code> and use a
     * JSON object for the <code>Message</code> parameter. See the Examples
     * section for the format of the JSON object. <p>Constraints: Messages
     * must be UTF-8 encoded strings at most 256 KB in size (262144 bytes,
     * not 262144 characters). <p>JSON-specific constraints: <ul> <li>Keys in
     * the JSON object that correspond to supported transport protocols must
     * have simple JSON string values. </li> <li>The values will be parsed
     * (unescaped) before they are used in outgoing messages.</li>
     * <li>Outbound notifications are JSON encoded (meaning that the
     * characters will be reescaped for sending).</li> <li>Values have a
     * minimum length of 0 (the empty string, "", is allowed).</li>
     * <li>Values have a maximum length bounded by the overall message size
     * (so, including multiple protocols may limit message sizes).</li>
     * <li>Non-string values will cause the key to be ignored.</li> <li>Keys
     * that do not correspond to supported transport protocols are
     * ignored.</li> <li>Duplicate keys are not allowed.</li> <li>Failure to
     * parse or validate any key or value in the message will cause the
     * <code>Publish</code> call to return an error (no partial
     * delivery).</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The message you want to send to the topic. <p>If you want to send the
     *         same message to all transport protocols, include the text of the
     *         message as a String value. <p>If you want to send different messages
     *         for each transport protocol, set the value of the
     *         <code>MessageStructure</code> parameter to <code>json</code> and use a
     *         JSON object for the <code>Message</code> parameter. See the Examples
     *         section for the format of the JSON object. <p>Constraints: Messages
     *         must be UTF-8 encoded strings at most 256 KB in size (262144 bytes,
     *         not 262144 characters). <p>JSON-specific constraints: <ul> <li>Keys in
     *         the JSON object that correspond to supported transport protocols must
     *         have simple JSON string values. </li> <li>The values will be parsed
     *         (unescaped) before they are used in outgoing messages.</li>
     *         <li>Outbound notifications are JSON encoded (meaning that the
     *         characters will be reescaped for sending).</li> <li>Values have a
     *         minimum length of 0 (the empty string, "", is allowed).</li>
     *         <li>Values have a maximum length bounded by the overall message size
     *         (so, including multiple protocols may limit message sizes).</li>
     *         <li>Non-string values will cause the key to be ignored.</li> <li>Keys
     *         that do not correspond to supported transport protocols are
     *         ignored.</li> <li>Duplicate keys are not allowed.</li> <li>Failure to
     *         parse or validate any key or value in the message will cause the
     *         <code>Publish</code> call to return an error (no partial
     *         delivery).</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PublishRequest withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Optional parameter to be used as the "Subject" line when the message
     * is delivered to email endpoints. This field will also be included, if
     * present, in the standard JSON messages delivered to other endpoints.
     * <p>Constraints: Subjects must be ASCII text that begins with a letter,
     * number, or punctuation mark; must not include line breaks or control
     * characters; and must be less than 100 characters long.
     *
     * @return Optional parameter to be used as the "Subject" line when the message
     *         is delivered to email endpoints. This field will also be included, if
     *         present, in the standard JSON messages delivered to other endpoints.
     *         <p>Constraints: Subjects must be ASCII text that begins with a letter,
     *         number, or punctuation mark; must not include line breaks or control
     *         characters; and must be less than 100 characters long.
     */
    public String getSubject() {
        return subject;
    }
    
    /**
     * Optional parameter to be used as the "Subject" line when the message
     * is delivered to email endpoints. This field will also be included, if
     * present, in the standard JSON messages delivered to other endpoints.
     * <p>Constraints: Subjects must be ASCII text that begins with a letter,
     * number, or punctuation mark; must not include line breaks or control
     * characters; and must be less than 100 characters long.
     *
     * @param subject Optional parameter to be used as the "Subject" line when the message
     *         is delivered to email endpoints. This field will also be included, if
     *         present, in the standard JSON messages delivered to other endpoints.
     *         <p>Constraints: Subjects must be ASCII text that begins with a letter,
     *         number, or punctuation mark; must not include line breaks or control
     *         characters; and must be less than 100 characters long.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    /**
     * Optional parameter to be used as the "Subject" line when the message
     * is delivered to email endpoints. This field will also be included, if
     * present, in the standard JSON messages delivered to other endpoints.
     * <p>Constraints: Subjects must be ASCII text that begins with a letter,
     * number, or punctuation mark; must not include line breaks or control
     * characters; and must be less than 100 characters long.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subject Optional parameter to be used as the "Subject" line when the message
     *         is delivered to email endpoints. This field will also be included, if
     *         present, in the standard JSON messages delivered to other endpoints.
     *         <p>Constraints: Subjects must be ASCII text that begins with a letter,
     *         number, or punctuation mark; must not include line breaks or control
     *         characters; and must be less than 100 characters long.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PublishRequest withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers
     * and a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must: <ul> <li>be a syntactically valid
     * JSON object; and</li> <li>contain at least a top-level JSON key of
     * "default" with a value that is a string.</li> </ul> <p> You can define
     * other top-level keys that define the message you want to send to a
     * specific transport protocol (e.g., "http"). <p>For information about
     * sending different messages for each protocol using the AWS Management
     * Console, go to <a
     * href="http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol">Create
     * Different Messages for Each Protocol</a> in the <i>Amazon Simple
     * Notification Service Getting Started Guide</i>. <p>Valid value:
     * <code>json</code>
     *
     * @return Set <code>MessageStructure</code> to <code>json</code> if you want to
     *         send a different message for each protocol. For example, using one
     *         publish action, you can send a short message to your SMS subscribers
     *         and a longer message to your email subscribers. If you set
     *         <code>MessageStructure</code> to <code>json</code>, the value of the
     *         <code>Message</code> parameter must: <ul> <li>be a syntactically valid
     *         JSON object; and</li> <li>contain at least a top-level JSON key of
     *         "default" with a value that is a string.</li> </ul> <p> You can define
     *         other top-level keys that define the message you want to send to a
     *         specific transport protocol (e.g., "http"). <p>For information about
     *         sending different messages for each protocol using the AWS Management
     *         Console, go to <a
     *         href="http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol">Create
     *         Different Messages for Each Protocol</a> in the <i>Amazon Simple
     *         Notification Service Getting Started Guide</i>. <p>Valid value:
     *         <code>json</code>
     */
    public String getMessageStructure() {
        return messageStructure;
    }
    
    /**
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers
     * and a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must: <ul> <li>be a syntactically valid
     * JSON object; and</li> <li>contain at least a top-level JSON key of
     * "default" with a value that is a string.</li> </ul> <p> You can define
     * other top-level keys that define the message you want to send to a
     * specific transport protocol (e.g., "http"). <p>For information about
     * sending different messages for each protocol using the AWS Management
     * Console, go to <a
     * href="http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol">Create
     * Different Messages for Each Protocol</a> in the <i>Amazon Simple
     * Notification Service Getting Started Guide</i>. <p>Valid value:
     * <code>json</code>
     *
     * @param messageStructure Set <code>MessageStructure</code> to <code>json</code> if you want to
     *         send a different message for each protocol. For example, using one
     *         publish action, you can send a short message to your SMS subscribers
     *         and a longer message to your email subscribers. If you set
     *         <code>MessageStructure</code> to <code>json</code>, the value of the
     *         <code>Message</code> parameter must: <ul> <li>be a syntactically valid
     *         JSON object; and</li> <li>contain at least a top-level JSON key of
     *         "default" with a value that is a string.</li> </ul> <p> You can define
     *         other top-level keys that define the message you want to send to a
     *         specific transport protocol (e.g., "http"). <p>For information about
     *         sending different messages for each protocol using the AWS Management
     *         Console, go to <a
     *         href="http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol">Create
     *         Different Messages for Each Protocol</a> in the <i>Amazon Simple
     *         Notification Service Getting Started Guide</i>. <p>Valid value:
     *         <code>json</code>
     */
    public void setMessageStructure(String messageStructure) {
        this.messageStructure = messageStructure;
    }
    
    /**
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers
     * and a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must: <ul> <li>be a syntactically valid
     * JSON object; and</li> <li>contain at least a top-level JSON key of
     * "default" with a value that is a string.</li> </ul> <p> You can define
     * other top-level keys that define the message you want to send to a
     * specific transport protocol (e.g., "http"). <p>For information about
     * sending different messages for each protocol using the AWS Management
     * Console, go to <a
     * href="http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol">Create
     * Different Messages for Each Protocol</a> in the <i>Amazon Simple
     * Notification Service Getting Started Guide</i>. <p>Valid value:
     * <code>json</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageStructure Set <code>MessageStructure</code> to <code>json</code> if you want to
     *         send a different message for each protocol. For example, using one
     *         publish action, you can send a short message to your SMS subscribers
     *         and a longer message to your email subscribers. If you set
     *         <code>MessageStructure</code> to <code>json</code>, the value of the
     *         <code>Message</code> parameter must: <ul> <li>be a syntactically valid
     *         JSON object; and</li> <li>contain at least a top-level JSON key of
     *         "default" with a value that is a string.</li> </ul> <p> You can define
     *         other top-level keys that define the message you want to send to a
     *         specific transport protocol (e.g., "http"). <p>For information about
     *         sending different messages for each protocol using the AWS Management
     *         Console, go to <a
     *         href="http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol">Create
     *         Different Messages for Each Protocol</a> in the <i>Amazon Simple
     *         Notification Service Getting Started Guide</i>. <p>Valid value:
     *         <code>json</code>
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
        if (getTopicArn() != null) sb.append("TopicArn: " + getTopicArn() + ",");
        if (getTargetArn() != null) sb.append("TargetArn: " + getTargetArn() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getSubject() != null) sb.append("Subject: " + getSubject() + ",");
        if (getMessageStructure() != null) sb.append("MessageStructure: " + getMessageStructure() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode()); 
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode()); 
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
        if (other.getTargetArn() == null ^ this.getTargetArn() == null) return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getSubject() == null ^ this.getSubject() == null) return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false) return false; 
        if (other.getMessageStructure() == null ^ this.getMessageStructure() == null) return false;
        if (other.getMessageStructure() != null && other.getMessageStructure().equals(this.getMessageStructure()) == false) return false; 
        return true;
    }
    
}
    