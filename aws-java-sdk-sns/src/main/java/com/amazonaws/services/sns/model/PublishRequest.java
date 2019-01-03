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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for Publish action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/Publish" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The topic you want to publish to.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TopicArn</code> parameter, you must specify a value for the
     * <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * Either TopicArn or EndpointArn, but not both.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TargetArn</code> parameter, you must specify a value for the
     * <code>PhoneNumber</code> or <code>TopicArn</code> parameters.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The phone number to which you want to deliver an SMS message. Use E.164 format.
     * </p>
     * <p>
     * If you don't specify a value for the <code>PhoneNumber</code> parameter, you must specify a value for the
     * <code>TargetArn</code> or <code>TopicArn</code> parameters.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The message you want to send.
     * </p>
     * <important>
     * <p>
     * The <code>Message</code> parameter is always a string. If you set <code>MessageStructure</code> to
     * <code>json</code>, you must string-encode the <code>Message</code> parameter.
     * </p>
     * </important>
     * <p>
     * If you are publishing to a topic and you want to send the same message to all transport protocols, include the
     * text of the message as a String value. If you want to send different messages for each transport protocol, set
     * the value of the <code>MessageStructure</code> parameter to <code>json</code> and use a JSON object for the
     * <code>Message</code> parameter.
     * </p>
     * <p/>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * With the exception of SMS, messages must be UTF-8 encoded strings and at most 256 KB in size (262,144 bytes, not
     * 262,144 characters).
     * </p>
     * </li>
     * <li>
     * <p>
     * For SMS, each message can contain up to 140 characters. This character limit depends on the encoding schema. For
     * example, an SMS message can contain 160 GSM characters, 140 ASCII characters, or 70 UCS-2 characters.
     * </p>
     * <p>
     * If you publish a message that exceeds this size limit, Amazon SNS sends the message as multiple messages, each
     * fitting within the size limit. Messages aren't truncated mid-word but are cut off at whole-word boundaries.
     * </p>
     * <p>
     * The total size limit for a single SMS <code>Publish</code> action is 1,600 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * JSON-specific constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Keys in the JSON object that correspond to supported transport protocols must have simple JSON string values.
     * </p>
     * </li>
     * <li>
     * <p>
     * The values will be parsed (unescaped) before they are used in outgoing messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * Outbound notifications are JSON encoded (meaning that the characters will be reescaped for sending).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a minimum length of 0 (the empty string, "", is allowed).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a maximum length bounded by the overall message size (so, including multiple protocols may limit
     * message sizes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-string values will cause the key to be ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys that do not correspond to supported transport protocols are ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Duplicate keys are not allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failure to parse or validate any key or value in the message will cause the <code>Publish</code> call to return
     * an error (no partial delivery).
     * </p>
     * </li>
     * </ul>
     */
    private String message;
    /**
     * <p>
     * Optional parameter to be used as the "Subject" line when the message is delivered to email endpoints. This field
     * will also be included, if present, in the standard JSON messages delivered to other endpoints.
     * </p>
     * <p>
     * Constraints: Subjects must be ASCII text that begins with a letter, number, or punctuation mark; must not include
     * line breaks or control characters; and must be less than 100 characters long.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to send a different message for each protocol.
     * For example, using one publish action, you can send a short message to your SMS subscribers and a longer message
     * to your email subscribers. If you set <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * be a syntactically valid JSON object; and
     * </p>
     * </li>
     * <li>
     * <p>
     * contain at least a top-level JSON key of "default" with a value that is a string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to send to a specific transport protocol
     * (e.g., "http").
     * </p>
     * <p>
     * For information about sending different messages for each protocol using the AWS Management Console, go to <a
     * href="http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol">Create Different
     * Messages for Each Protocol</a> in the <i>Amazon Simple Notification Service Getting Started Guide</i>.
     * </p>
     * <p>
     * Valid value: <code>json</code>
     * </p>
     */
    private String messageStructure;
    /**
     * <p>
     * Message attributes for Publish action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue> messageAttributes;

    /**
     * Default constructor for PublishRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize the object after creating it.
     */
    public PublishRequest() {
    }

    /**
     * Constructs a new PublishRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn
     *        The topic you want to publish to.</p>
     *        <p>
     *        If you don't specify a value for the <code>TopicArn</code> parameter, you must specify a value for the
     *        <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     * @param message
     *        The message you want to send.
     *        </p>
     *        <important>
     *        <p>
     *        The <code>Message</code> parameter is always a string. If you set <code>MessageStructure</code> to
     *        <code>json</code>, you must string-encode the <code>Message</code> parameter.
     *        </p>
     *        </important>
     *        <p>
     *        If you are publishing to a topic and you want to send the same message to all transport protocols, include
     *        the text of the message as a String value. If you want to send different messages for each transport
     *        protocol, set the value of the <code>MessageStructure</code> parameter to <code>json</code> and use a JSON
     *        object for the <code>Message</code> parameter.
     *        </p>
     *        <p/>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        With the exception of SMS, messages must be UTF-8 encoded strings and at most 256 KB in size (262,144
     *        bytes, not 262,144 characters).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For SMS, each message can contain up to 140 characters. This character limit depends on the encoding
     *        schema. For example, an SMS message can contain 160 GSM characters, 140 ASCII characters, or 70 UCS-2
     *        characters.
     *        </p>
     *        <p>
     *        If you publish a message that exceeds this size limit, Amazon SNS sends the message as multiple messages,
     *        each fitting within the size limit. Messages aren't truncated mid-word but are cut off at whole-word
     *        boundaries.
     *        </p>
     *        <p>
     *        The total size limit for a single SMS <code>Publish</code> action is 1,600 characters.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        JSON-specific constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Keys in the JSON object that correspond to supported transport protocols must have simple JSON string
     *        values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The values will be parsed (unescaped) before they are used in outgoing messages.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Outbound notifications are JSON encoded (meaning that the characters will be reescaped for sending).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Values have a minimum length of 0 (the empty string, "", is allowed).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Values have a maximum length bounded by the overall message size (so, including multiple protocols may
     *        limit message sizes).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Non-string values will cause the key to be ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys that do not correspond to supported transport protocols are ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Duplicate keys are not allowed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failure to parse or validate any key or value in the message will cause the <code>Publish</code> call to
     *        return an error (no partial delivery).
     *        </p>
     *        </li>
     */
    public PublishRequest(String topicArn, String message) {
        setTopicArn(topicArn);
        setMessage(message);
    }

    /**
     * Constructs a new PublishRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn
     *        The topic you want to publish to.</p>
     *        <p>
     *        If you don't specify a value for the <code>TopicArn</code> parameter, you must specify a value for the
     *        <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     * @param message
     *        The message you want to send.
     *        </p>
     *        <important>
     *        <p>
     *        The <code>Message</code> parameter is always a string. If you set <code>MessageStructure</code> to
     *        <code>json</code>, you must string-encode the <code>Message</code> parameter.
     *        </p>
     *        </important>
     *        <p>
     *        If you are publishing to a topic and you want to send the same message to all transport protocols, include
     *        the text of the message as a String value. If you want to send different messages for each transport
     *        protocol, set the value of the <code>MessageStructure</code> parameter to <code>json</code> and use a JSON
     *        object for the <code>Message</code> parameter.
     *        </p>
     *        <p/>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        With the exception of SMS, messages must be UTF-8 encoded strings and at most 256 KB in size (262,144
     *        bytes, not 262,144 characters).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For SMS, each message can contain up to 140 characters. This character limit depends on the encoding
     *        schema. For example, an SMS message can contain 160 GSM characters, 140 ASCII characters, or 70 UCS-2
     *        characters.
     *        </p>
     *        <p>
     *        If you publish a message that exceeds this size limit, Amazon SNS sends the message as multiple messages,
     *        each fitting within the size limit. Messages aren't truncated mid-word but are cut off at whole-word
     *        boundaries.
     *        </p>
     *        <p>
     *        The total size limit for a single SMS <code>Publish</code> action is 1,600 characters.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        JSON-specific constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Keys in the JSON object that correspond to supported transport protocols must have simple JSON string
     *        values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The values will be parsed (unescaped) before they are used in outgoing messages.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Outbound notifications are JSON encoded (meaning that the characters will be reescaped for sending).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Values have a minimum length of 0 (the empty string, "", is allowed).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Values have a maximum length bounded by the overall message size (so, including multiple protocols may
     *        limit message sizes).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Non-string values will cause the key to be ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys that do not correspond to supported transport protocols are ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Duplicate keys are not allowed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failure to parse or validate any key or value in the message will cause the <code>Publish</code> call to
     *        return an error (no partial delivery).
     *        </p>
     *        </li>
     * @param subject
     *        Optional parameter to be used as the "Subject" line when the message is delivered to email endpoints. This
     *        field will also be included, if present, in the standard JSON messages delivered to other endpoints.</p>
     *        <p>
     *        Constraints: Subjects must be ASCII text that begins with a letter, number, or punctuation mark; must not
     *        include line breaks or control characters; and must be less than 100 characters long.
     */
    public PublishRequest(String topicArn, String message, String subject) {
        setTopicArn(topicArn);
        setMessage(message);
        setSubject(subject);
    }

    /**
     * <p>
     * The topic you want to publish to.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TopicArn</code> parameter, you must specify a value for the
     * <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     * </p>
     * 
     * @param topicArn
     *        The topic you want to publish to.</p>
     *        <p>
     *        If you don't specify a value for the <code>TopicArn</code> parameter, you must specify a value for the
     *        <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The topic you want to publish to.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TopicArn</code> parameter, you must specify a value for the
     * <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     * </p>
     * 
     * @return The topic you want to publish to.</p>
     *         <p>
     *         If you don't specify a value for the <code>TopicArn</code> parameter, you must specify a value for the
     *         <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The topic you want to publish to.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TopicArn</code> parameter, you must specify a value for the
     * <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     * </p>
     * 
     * @param topicArn
     *        The topic you want to publish to.</p>
     *        <p>
     *        If you don't specify a value for the <code>TopicArn</code> parameter, you must specify a value for the
     *        <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * Either TopicArn or EndpointArn, but not both.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TargetArn</code> parameter, you must specify a value for the
     * <code>PhoneNumber</code> or <code>TopicArn</code> parameters.
     * </p>
     * 
     * @param targetArn
     *        Either TopicArn or EndpointArn, but not both.</p>
     *        <p>
     *        If you don't specify a value for the <code>TargetArn</code> parameter, you must specify a value for the
     *        <code>PhoneNumber</code> or <code>TopicArn</code> parameters.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * Either TopicArn or EndpointArn, but not both.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TargetArn</code> parameter, you must specify a value for the
     * <code>PhoneNumber</code> or <code>TopicArn</code> parameters.
     * </p>
     * 
     * @return Either TopicArn or EndpointArn, but not both.</p>
     *         <p>
     *         If you don't specify a value for the <code>TargetArn</code> parameter, you must specify a value for the
     *         <code>PhoneNumber</code> or <code>TopicArn</code> parameters.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * Either TopicArn or EndpointArn, but not both.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TargetArn</code> parameter, you must specify a value for the
     * <code>PhoneNumber</code> or <code>TopicArn</code> parameters.
     * </p>
     * 
     * @param targetArn
     *        Either TopicArn or EndpointArn, but not both.</p>
     *        <p>
     *        If you don't specify a value for the <code>TargetArn</code> parameter, you must specify a value for the
     *        <code>PhoneNumber</code> or <code>TopicArn</code> parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The phone number to which you want to deliver an SMS message. Use E.164 format.
     * </p>
     * <p>
     * If you don't specify a value for the <code>PhoneNumber</code> parameter, you must specify a value for the
     * <code>TargetArn</code> or <code>TopicArn</code> parameters.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number to which you want to deliver an SMS message. Use E.164 format.</p>
     *        <p>
     *        If you don't specify a value for the <code>PhoneNumber</code> parameter, you must specify a value for the
     *        <code>TargetArn</code> or <code>TopicArn</code> parameters.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number to which you want to deliver an SMS message. Use E.164 format.
     * </p>
     * <p>
     * If you don't specify a value for the <code>PhoneNumber</code> parameter, you must specify a value for the
     * <code>TargetArn</code> or <code>TopicArn</code> parameters.
     * </p>
     * 
     * @return The phone number to which you want to deliver an SMS message. Use E.164 format.</p>
     *         <p>
     *         If you don't specify a value for the <code>PhoneNumber</code> parameter, you must specify a value for the
     *         <code>TargetArn</code> or <code>TopicArn</code> parameters.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number to which you want to deliver an SMS message. Use E.164 format.
     * </p>
     * <p>
     * If you don't specify a value for the <code>PhoneNumber</code> parameter, you must specify a value for the
     * <code>TargetArn</code> or <code>TopicArn</code> parameters.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number to which you want to deliver an SMS message. Use E.164 format.</p>
     *        <p>
     *        If you don't specify a value for the <code>PhoneNumber</code> parameter, you must specify a value for the
     *        <code>TargetArn</code> or <code>TopicArn</code> parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The message you want to send.
     * </p>
     * <important>
     * <p>
     * The <code>Message</code> parameter is always a string. If you set <code>MessageStructure</code> to
     * <code>json</code>, you must string-encode the <code>Message</code> parameter.
     * </p>
     * </important>
     * <p>
     * If you are publishing to a topic and you want to send the same message to all transport protocols, include the
     * text of the message as a String value. If you want to send different messages for each transport protocol, set
     * the value of the <code>MessageStructure</code> parameter to <code>json</code> and use a JSON object for the
     * <code>Message</code> parameter.
     * </p>
     * <p/>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * With the exception of SMS, messages must be UTF-8 encoded strings and at most 256 KB in size (262,144 bytes, not
     * 262,144 characters).
     * </p>
     * </li>
     * <li>
     * <p>
     * For SMS, each message can contain up to 140 characters. This character limit depends on the encoding schema. For
     * example, an SMS message can contain 160 GSM characters, 140 ASCII characters, or 70 UCS-2 characters.
     * </p>
     * <p>
     * If you publish a message that exceeds this size limit, Amazon SNS sends the message as multiple messages, each
     * fitting within the size limit. Messages aren't truncated mid-word but are cut off at whole-word boundaries.
     * </p>
     * <p>
     * The total size limit for a single SMS <code>Publish</code> action is 1,600 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * JSON-specific constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Keys in the JSON object that correspond to supported transport protocols must have simple JSON string values.
     * </p>
     * </li>
     * <li>
     * <p>
     * The values will be parsed (unescaped) before they are used in outgoing messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * Outbound notifications are JSON encoded (meaning that the characters will be reescaped for sending).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a minimum length of 0 (the empty string, "", is allowed).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a maximum length bounded by the overall message size (so, including multiple protocols may limit
     * message sizes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-string values will cause the key to be ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys that do not correspond to supported transport protocols are ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Duplicate keys are not allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failure to parse or validate any key or value in the message will cause the <code>Publish</code> call to return
     * an error (no partial delivery).
     * </p>
     * </li>
     * </ul>
     * 
     * @param message
     *        The message you want to send.</p> <important>
     *        <p>
     *        The <code>Message</code> parameter is always a string. If you set <code>MessageStructure</code> to
     *        <code>json</code>, you must string-encode the <code>Message</code> parameter.
     *        </p>
     *        </important>
     *        <p>
     *        If you are publishing to a topic and you want to send the same message to all transport protocols, include
     *        the text of the message as a String value. If you want to send different messages for each transport
     *        protocol, set the value of the <code>MessageStructure</code> parameter to <code>json</code> and use a JSON
     *        object for the <code>Message</code> parameter.
     *        </p>
     *        <p/>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        With the exception of SMS, messages must be UTF-8 encoded strings and at most 256 KB in size (262,144
     *        bytes, not 262,144 characters).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For SMS, each message can contain up to 140 characters. This character limit depends on the encoding
     *        schema. For example, an SMS message can contain 160 GSM characters, 140 ASCII characters, or 70 UCS-2
     *        characters.
     *        </p>
     *        <p>
     *        If you publish a message that exceeds this size limit, Amazon SNS sends the message as multiple messages,
     *        each fitting within the size limit. Messages aren't truncated mid-word but are cut off at whole-word
     *        boundaries.
     *        </p>
     *        <p>
     *        The total size limit for a single SMS <code>Publish</code> action is 1,600 characters.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        JSON-specific constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Keys in the JSON object that correspond to supported transport protocols must have simple JSON string
     *        values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The values will be parsed (unescaped) before they are used in outgoing messages.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Outbound notifications are JSON encoded (meaning that the characters will be reescaped for sending).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Values have a minimum length of 0 (the empty string, "", is allowed).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Values have a maximum length bounded by the overall message size (so, including multiple protocols may
     *        limit message sizes).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Non-string values will cause the key to be ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys that do not correspond to supported transport protocols are ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Duplicate keys are not allowed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failure to parse or validate any key or value in the message will cause the <code>Publish</code> call to
     *        return an error (no partial delivery).
     *        </p>
     *        </li>
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message you want to send.
     * </p>
     * <important>
     * <p>
     * The <code>Message</code> parameter is always a string. If you set <code>MessageStructure</code> to
     * <code>json</code>, you must string-encode the <code>Message</code> parameter.
     * </p>
     * </important>
     * <p>
     * If you are publishing to a topic and you want to send the same message to all transport protocols, include the
     * text of the message as a String value. If you want to send different messages for each transport protocol, set
     * the value of the <code>MessageStructure</code> parameter to <code>json</code> and use a JSON object for the
     * <code>Message</code> parameter.
     * </p>
     * <p/>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * With the exception of SMS, messages must be UTF-8 encoded strings and at most 256 KB in size (262,144 bytes, not
     * 262,144 characters).
     * </p>
     * </li>
     * <li>
     * <p>
     * For SMS, each message can contain up to 140 characters. This character limit depends on the encoding schema. For
     * example, an SMS message can contain 160 GSM characters, 140 ASCII characters, or 70 UCS-2 characters.
     * </p>
     * <p>
     * If you publish a message that exceeds this size limit, Amazon SNS sends the message as multiple messages, each
     * fitting within the size limit. Messages aren't truncated mid-word but are cut off at whole-word boundaries.
     * </p>
     * <p>
     * The total size limit for a single SMS <code>Publish</code> action is 1,600 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * JSON-specific constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Keys in the JSON object that correspond to supported transport protocols must have simple JSON string values.
     * </p>
     * </li>
     * <li>
     * <p>
     * The values will be parsed (unescaped) before they are used in outgoing messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * Outbound notifications are JSON encoded (meaning that the characters will be reescaped for sending).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a minimum length of 0 (the empty string, "", is allowed).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a maximum length bounded by the overall message size (so, including multiple protocols may limit
     * message sizes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-string values will cause the key to be ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys that do not correspond to supported transport protocols are ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Duplicate keys are not allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failure to parse or validate any key or value in the message will cause the <code>Publish</code> call to return
     * an error (no partial delivery).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The message you want to send.</p> <important>
     *         <p>
     *         The <code>Message</code> parameter is always a string. If you set <code>MessageStructure</code> to
     *         <code>json</code>, you must string-encode the <code>Message</code> parameter.
     *         </p>
     *         </important>
     *         <p>
     *         If you are publishing to a topic and you want to send the same message to all transport protocols,
     *         include the text of the message as a String value. If you want to send different messages for each
     *         transport protocol, set the value of the <code>MessageStructure</code> parameter to <code>json</code> and
     *         use a JSON object for the <code>Message</code> parameter.
     *         </p>
     *         <p/>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         With the exception of SMS, messages must be UTF-8 encoded strings and at most 256 KB in size (262,144
     *         bytes, not 262,144 characters).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For SMS, each message can contain up to 140 characters. This character limit depends on the encoding
     *         schema. For example, an SMS message can contain 160 GSM characters, 140 ASCII characters, or 70 UCS-2
     *         characters.
     *         </p>
     *         <p>
     *         If you publish a message that exceeds this size limit, Amazon SNS sends the message as multiple messages,
     *         each fitting within the size limit. Messages aren't truncated mid-word but are cut off at whole-word
     *         boundaries.
     *         </p>
     *         <p>
     *         The total size limit for a single SMS <code>Publish</code> action is 1,600 characters.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         JSON-specific constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Keys in the JSON object that correspond to supported transport protocols must have simple JSON string
     *         values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The values will be parsed (unescaped) before they are used in outgoing messages.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Outbound notifications are JSON encoded (meaning that the characters will be reescaped for sending).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Values have a minimum length of 0 (the empty string, "", is allowed).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Values have a maximum length bounded by the overall message size (so, including multiple protocols may
     *         limit message sizes).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Non-string values will cause the key to be ignored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Keys that do not correspond to supported transport protocols are ignored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Duplicate keys are not allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failure to parse or validate any key or value in the message will cause the <code>Publish</code> call to
     *         return an error (no partial delivery).
     *         </p>
     *         </li>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message you want to send.
     * </p>
     * <important>
     * <p>
     * The <code>Message</code> parameter is always a string. If you set <code>MessageStructure</code> to
     * <code>json</code>, you must string-encode the <code>Message</code> parameter.
     * </p>
     * </important>
     * <p>
     * If you are publishing to a topic and you want to send the same message to all transport protocols, include the
     * text of the message as a String value. If you want to send different messages for each transport protocol, set
     * the value of the <code>MessageStructure</code> parameter to <code>json</code> and use a JSON object for the
     * <code>Message</code> parameter.
     * </p>
     * <p/>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * With the exception of SMS, messages must be UTF-8 encoded strings and at most 256 KB in size (262,144 bytes, not
     * 262,144 characters).
     * </p>
     * </li>
     * <li>
     * <p>
     * For SMS, each message can contain up to 140 characters. This character limit depends on the encoding schema. For
     * example, an SMS message can contain 160 GSM characters, 140 ASCII characters, or 70 UCS-2 characters.
     * </p>
     * <p>
     * If you publish a message that exceeds this size limit, Amazon SNS sends the message as multiple messages, each
     * fitting within the size limit. Messages aren't truncated mid-word but are cut off at whole-word boundaries.
     * </p>
     * <p>
     * The total size limit for a single SMS <code>Publish</code> action is 1,600 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * JSON-specific constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Keys in the JSON object that correspond to supported transport protocols must have simple JSON string values.
     * </p>
     * </li>
     * <li>
     * <p>
     * The values will be parsed (unescaped) before they are used in outgoing messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * Outbound notifications are JSON encoded (meaning that the characters will be reescaped for sending).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a minimum length of 0 (the empty string, "", is allowed).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a maximum length bounded by the overall message size (so, including multiple protocols may limit
     * message sizes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-string values will cause the key to be ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys that do not correspond to supported transport protocols are ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Duplicate keys are not allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failure to parse or validate any key or value in the message will cause the <code>Publish</code> call to return
     * an error (no partial delivery).
     * </p>
     * </li>
     * </ul>
     * 
     * @param message
     *        The message you want to send.</p> <important>
     *        <p>
     *        The <code>Message</code> parameter is always a string. If you set <code>MessageStructure</code> to
     *        <code>json</code>, you must string-encode the <code>Message</code> parameter.
     *        </p>
     *        </important>
     *        <p>
     *        If you are publishing to a topic and you want to send the same message to all transport protocols, include
     *        the text of the message as a String value. If you want to send different messages for each transport
     *        protocol, set the value of the <code>MessageStructure</code> parameter to <code>json</code> and use a JSON
     *        object for the <code>Message</code> parameter.
     *        </p>
     *        <p/>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        With the exception of SMS, messages must be UTF-8 encoded strings and at most 256 KB in size (262,144
     *        bytes, not 262,144 characters).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For SMS, each message can contain up to 140 characters. This character limit depends on the encoding
     *        schema. For example, an SMS message can contain 160 GSM characters, 140 ASCII characters, or 70 UCS-2
     *        characters.
     *        </p>
     *        <p>
     *        If you publish a message that exceeds this size limit, Amazon SNS sends the message as multiple messages,
     *        each fitting within the size limit. Messages aren't truncated mid-word but are cut off at whole-word
     *        boundaries.
     *        </p>
     *        <p>
     *        The total size limit for a single SMS <code>Publish</code> action is 1,600 characters.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        JSON-specific constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Keys in the JSON object that correspond to supported transport protocols must have simple JSON string
     *        values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The values will be parsed (unescaped) before they are used in outgoing messages.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Outbound notifications are JSON encoded (meaning that the characters will be reescaped for sending).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Values have a minimum length of 0 (the empty string, "", is allowed).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Values have a maximum length bounded by the overall message size (so, including multiple protocols may
     *        limit message sizes).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Non-string values will cause the key to be ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys that do not correspond to supported transport protocols are ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Duplicate keys are not allowed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failure to parse or validate any key or value in the message will cause the <code>Publish</code> call to
     *        return an error (no partial delivery).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Optional parameter to be used as the "Subject" line when the message is delivered to email endpoints. This field
     * will also be included, if present, in the standard JSON messages delivered to other endpoints.
     * </p>
     * <p>
     * Constraints: Subjects must be ASCII text that begins with a letter, number, or punctuation mark; must not include
     * line breaks or control characters; and must be less than 100 characters long.
     * </p>
     * 
     * @param subject
     *        Optional parameter to be used as the "Subject" line when the message is delivered to email endpoints. This
     *        field will also be included, if present, in the standard JSON messages delivered to other endpoints.</p>
     *        <p>
     *        Constraints: Subjects must be ASCII text that begins with a letter, number, or punctuation mark; must not
     *        include line breaks or control characters; and must be less than 100 characters long.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * Optional parameter to be used as the "Subject" line when the message is delivered to email endpoints. This field
     * will also be included, if present, in the standard JSON messages delivered to other endpoints.
     * </p>
     * <p>
     * Constraints: Subjects must be ASCII text that begins with a letter, number, or punctuation mark; must not include
     * line breaks or control characters; and must be less than 100 characters long.
     * </p>
     * 
     * @return Optional parameter to be used as the "Subject" line when the message is delivered to email endpoints.
     *         This field will also be included, if present, in the standard JSON messages delivered to other
     *         endpoints.</p>
     *         <p>
     *         Constraints: Subjects must be ASCII text that begins with a letter, number, or punctuation mark; must not
     *         include line breaks or control characters; and must be less than 100 characters long.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * Optional parameter to be used as the "Subject" line when the message is delivered to email endpoints. This field
     * will also be included, if present, in the standard JSON messages delivered to other endpoints.
     * </p>
     * <p>
     * Constraints: Subjects must be ASCII text that begins with a letter, number, or punctuation mark; must not include
     * line breaks or control characters; and must be less than 100 characters long.
     * </p>
     * 
     * @param subject
     *        Optional parameter to be used as the "Subject" line when the message is delivered to email endpoints. This
     *        field will also be included, if present, in the standard JSON messages delivered to other endpoints.</p>
     *        <p>
     *        Constraints: Subjects must be ASCII text that begins with a letter, number, or punctuation mark; must not
     *        include line breaks or control characters; and must be less than 100 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to send a different message for each protocol.
     * For example, using one publish action, you can send a short message to your SMS subscribers and a longer message
     * to your email subscribers. If you set <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * be a syntactically valid JSON object; and
     * </p>
     * </li>
     * <li>
     * <p>
     * contain at least a top-level JSON key of "default" with a value that is a string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to send to a specific transport protocol
     * (e.g., "http").
     * </p>
     * <p>
     * For information about sending different messages for each protocol using the AWS Management Console, go to <a
     * href="http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol">Create Different
     * Messages for Each Protocol</a> in the <i>Amazon Simple Notification Service Getting Started Guide</i>.
     * </p>
     * <p>
     * Valid value: <code>json</code>
     * </p>
     * 
     * @param messageStructure
     *        Set <code>MessageStructure</code> to <code>json</code> if you want to send a different message for each
     *        protocol. For example, using one publish action, you can send a short message to your SMS subscribers and
     *        a longer message to your email subscribers. If you set <code>MessageStructure</code> to <code>json</code>,
     *        the value of the <code>Message</code> parameter must: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        be a syntactically valid JSON object; and
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        contain at least a top-level JSON key of "default" with a value that is a string.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can define other top-level keys that define the message you want to send to a specific transport
     *        protocol (e.g., "http").
     *        </p>
     *        <p>
     *        For information about sending different messages for each protocol using the AWS Management Console, go to
     *        <a href="http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol">Create
     *        Different Messages for Each Protocol</a> in the <i>Amazon Simple Notification Service Getting Started
     *        Guide</i>.
     *        </p>
     *        <p>
     *        Valid value: <code>json</code>
     */

    public void setMessageStructure(String messageStructure) {
        this.messageStructure = messageStructure;
    }

    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to send a different message for each protocol.
     * For example, using one publish action, you can send a short message to your SMS subscribers and a longer message
     * to your email subscribers. If you set <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * be a syntactically valid JSON object; and
     * </p>
     * </li>
     * <li>
     * <p>
     * contain at least a top-level JSON key of "default" with a value that is a string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to send to a specific transport protocol
     * (e.g., "http").
     * </p>
     * <p>
     * For information about sending different messages for each protocol using the AWS Management Console, go to <a
     * href="http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol">Create Different
     * Messages for Each Protocol</a> in the <i>Amazon Simple Notification Service Getting Started Guide</i>.
     * </p>
     * <p>
     * Valid value: <code>json</code>
     * </p>
     * 
     * @return Set <code>MessageStructure</code> to <code>json</code> if you want to send a different message for each
     *         protocol. For example, using one publish action, you can send a short message to your SMS subscribers and
     *         a longer message to your email subscribers. If you set <code>MessageStructure</code> to <code>json</code>
     *         , the value of the <code>Message</code> parameter must: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         be a syntactically valid JSON object; and
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         contain at least a top-level JSON key of "default" with a value that is a string.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can define other top-level keys that define the message you want to send to a specific transport
     *         protocol (e.g., "http").
     *         </p>
     *         <p>
     *         For information about sending different messages for each protocol using the AWS Management Console, go
     *         to <a
     *         href="http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol">Create
     *         Different Messages for Each Protocol</a> in the <i>Amazon Simple Notification Service Getting Started
     *         Guide</i>.
     *         </p>
     *         <p>
     *         Valid value: <code>json</code>
     */

    public String getMessageStructure() {
        return this.messageStructure;
    }

    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to send a different message for each protocol.
     * For example, using one publish action, you can send a short message to your SMS subscribers and a longer message
     * to your email subscribers. If you set <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * be a syntactically valid JSON object; and
     * </p>
     * </li>
     * <li>
     * <p>
     * contain at least a top-level JSON key of "default" with a value that is a string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to send to a specific transport protocol
     * (e.g., "http").
     * </p>
     * <p>
     * For information about sending different messages for each protocol using the AWS Management Console, go to <a
     * href="http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol">Create Different
     * Messages for Each Protocol</a> in the <i>Amazon Simple Notification Service Getting Started Guide</i>.
     * </p>
     * <p>
     * Valid value: <code>json</code>
     * </p>
     * 
     * @param messageStructure
     *        Set <code>MessageStructure</code> to <code>json</code> if you want to send a different message for each
     *        protocol. For example, using one publish action, you can send a short message to your SMS subscribers and
     *        a longer message to your email subscribers. If you set <code>MessageStructure</code> to <code>json</code>,
     *        the value of the <code>Message</code> parameter must: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        be a syntactically valid JSON object; and
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        contain at least a top-level JSON key of "default" with a value that is a string.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can define other top-level keys that define the message you want to send to a specific transport
     *        protocol (e.g., "http").
     *        </p>
     *        <p>
     *        For information about sending different messages for each protocol using the AWS Management Console, go to
     *        <a href="http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol">Create
     *        Different Messages for Each Protocol</a> in the <i>Amazon Simple Notification Service Getting Started
     *        Guide</i>.
     *        </p>
     *        <p>
     *        Valid value: <code>json</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withMessageStructure(String messageStructure) {
        setMessageStructure(messageStructure);
        return this;
    }

    /**
     * <p>
     * Message attributes for Publish action.
     * </p>
     * 
     * @return Message attributes for Publish action.
     */

    public java.util.Map<String, MessageAttributeValue> getMessageAttributes() {
        if (messageAttributes == null) {
            messageAttributes = new com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue>();
        }
        return messageAttributes;
    }

    /**
     * <p>
     * Message attributes for Publish action.
     * </p>
     * 
     * @param messageAttributes
     *        Message attributes for Publish action.
     */

    public void setMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue>(messageAttributes);
    }

    /**
     * <p>
     * Message attributes for Publish action.
     * </p>
     * 
     * @param messageAttributes
     *        Message attributes for Publish action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        setMessageAttributes(messageAttributes);
        return this;
    }

    public PublishRequest addMessageAttributesEntry(String key, MessageAttributeValue value) {
        if (null == this.messageAttributes) {
            this.messageAttributes = new com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue>();
        }
        if (this.messageAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.messageAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MessageAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest clearMessageAttributesEntries() {
        this.messageAttributes = null;
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
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getMessageStructure() != null)
            sb.append("MessageStructure: ").append(getMessageStructure()).append(",");
        if (getMessageAttributes() != null)
            sb.append("MessageAttributes: ").append(getMessageAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishRequest == false)
            return false;
        PublishRequest other = (PublishRequest) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getMessageStructure() == null ^ this.getMessageStructure() == null)
            return false;
        if (other.getMessageStructure() != null && other.getMessageStructure().equals(this.getMessageStructure()) == false)
            return false;
        if (other.getMessageAttributes() == null ^ this.getMessageAttributes() == null)
            return false;
        if (other.getMessageAttributes() != null && other.getMessageAttributes().equals(this.getMessageAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getMessageStructure() == null) ? 0 : getMessageStructure().hashCode());
        hashCode = prime * hashCode + ((getMessageAttributes() == null) ? 0 : getMessageAttributes().hashCode());
        return hashCode;
    }

    @Override
    public PublishRequest clone() {
        return (PublishRequest) super.clone();
    }

}
