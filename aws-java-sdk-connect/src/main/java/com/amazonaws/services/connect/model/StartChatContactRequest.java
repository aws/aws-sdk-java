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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartChatContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartChatContactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the flow for initiating the chat. To see the ContactFlowId in the Amazon Connect admin website,
     * on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page, under the
     * name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part of the ARN,
     * shown here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     * 846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     */
    private String contactFlowId;
    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes. They can
     * be accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * Information identifying the participant.
     * </p>
     */
    private ParticipantDetails participantDetails;
    /**
     * <p>
     * The initial message to be sent to the newly created chat. If you have a Lex bot in your flow, the initial message
     * is not delivered to the Lex bot.
     * </p>
     */
    private ChatMessage initialMessage;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The total duration of the newly started chat session. If not specified, the chat session duration defaults to 25
     * hour. The minimum configurable time is 60 minutes. The maximum configurable time is 10,080 minutes (7 days).
     * </p>
     */
    private Integer chatDurationInMinutes;
    /**
     * <p>
     * The supported chat message content types. Supported types are <code>text/plain</code>, <code>text/markdown</code>, <code>application/json</code>, <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>.
     * </p>
     * <p>
     * Content types must always contain <code>text/plain</code>. You can then put any other supported type in the list.
     * For example, all the following lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>, <code>[text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>.
     * </p>
     * <note>
     * <p>
     * The type <code>application/vnd.amazonaws.connect.message.interactive</code> is required to use the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html">Show view</a> flow block.
     * </p>
     * </note>
     */
    private java.util.List<String> supportedMessagingContentTypes;
    /**
     * <p>
     * Enable persistent chats. For more information about enabling persistent chat, and for example use cases and how
     * to configure for them, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html">Enable persistent chat</a>.
     * </p>
     */
    private PersistentChat persistentChat;
    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is related to the chat starting.
     * </p>
     * <note>
     * <p>
     * You cannot provide data for both RelatedContactId and PersistentChat.
     * </p>
     * </note>
     */
    private String relatedContactId;
    /**
     * <p>
     * A set of system defined key-value pairs stored on individual contact segments using an attribute map. The
     * attributes are standard Amazon Connect attributes. They can be accessed in flows.
     * </p>
     * <p>
     * Attribute keys can include only alphanumeric, -, and _.
     * </p>
     * <p>
     * This field can be used to show channel subtype, such as <code>connect:Guide</code>.
     * </p>
     * <note>
     * <p>
     * The types <code>application/vnd.amazonaws.connect.message.interactive</code> and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code> must be present in the
     * SupportedMessagingContentTypes field of this API in order to set <code>SegmentAttributes</code> as {
     * <code> "connect:Subtype": {"valueString" : "connect:Guide" }}</code>.
     * </p>
     * </note>
     */
    private java.util.Map<String, SegmentAttributeValue> segmentAttributes;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *         ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the flow for initiating the chat. To see the ContactFlowId in the Amazon Connect admin website,
     * on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page, under the
     * name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part of the ARN,
     * shown here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     * 846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the flow for initiating the chat. To see the ContactFlowId in the Amazon Connect admin
     *        website, on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow
     *        page, under the name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the
     *        last part of the ARN, shown here in bold: </p>
     *        <p>
     *        arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     *        846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     */

    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow for initiating the chat. To see the ContactFlowId in the Amazon Connect admin website,
     * on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page, under the
     * name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part of the ARN,
     * shown here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     * 846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     * 
     * @return The identifier of the flow for initiating the chat. To see the ContactFlowId in the Amazon Connect admin
     *         website, on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow
     *         page, under the name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is
     *         the last part of the ARN, shown here in bold: </p>
     *         <p>
     *         arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     *         846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     */

    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow for initiating the chat. To see the ContactFlowId in the Amazon Connect admin website,
     * on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page, under the
     * name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part of the ARN,
     * shown here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     * 846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the flow for initiating the chat. To see the ContactFlowId in the Amazon Connect admin
     *        website, on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow
     *        page, under the name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the
     *        last part of the ARN, shown here in bold: </p>
     *        <p>
     *        arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     *        846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest withContactFlowId(String contactFlowId) {
        setContactFlowId(contactFlowId);
        return this;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes. They can
     * be accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * 
     * @return A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes.
     *         They can be accessed in flows just like any other contact attributes. </p>
     *         <p>
     *         There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include
     *         only alphanumeric, dash, and underscore characters.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes. They can
     * be accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * 
     * @param attributes
     *        A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes.
     *        They can be accessed in flows just like any other contact attributes. </p>
     *        <p>
     *        There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include
     *        only alphanumeric, dash, and underscore characters.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes. They can
     * be accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * 
     * @param attributes
     *        A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes.
     *        They can be accessed in flows just like any other contact attributes. </p>
     *        <p>
     *        There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include
     *        only alphanumeric, dash, and underscore characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see StartChatContactRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Information identifying the participant.
     * </p>
     * 
     * @param participantDetails
     *        Information identifying the participant.
     */

    public void setParticipantDetails(ParticipantDetails participantDetails) {
        this.participantDetails = participantDetails;
    }

    /**
     * <p>
     * Information identifying the participant.
     * </p>
     * 
     * @return Information identifying the participant.
     */

    public ParticipantDetails getParticipantDetails() {
        return this.participantDetails;
    }

    /**
     * <p>
     * Information identifying the participant.
     * </p>
     * 
     * @param participantDetails
     *        Information identifying the participant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest withParticipantDetails(ParticipantDetails participantDetails) {
        setParticipantDetails(participantDetails);
        return this;
    }

    /**
     * <p>
     * The initial message to be sent to the newly created chat. If you have a Lex bot in your flow, the initial message
     * is not delivered to the Lex bot.
     * </p>
     * 
     * @param initialMessage
     *        The initial message to be sent to the newly created chat. If you have a Lex bot in your flow, the initial
     *        message is not delivered to the Lex bot.
     */

    public void setInitialMessage(ChatMessage initialMessage) {
        this.initialMessage = initialMessage;
    }

    /**
     * <p>
     * The initial message to be sent to the newly created chat. If you have a Lex bot in your flow, the initial message
     * is not delivered to the Lex bot.
     * </p>
     * 
     * @return The initial message to be sent to the newly created chat. If you have a Lex bot in your flow, the initial
     *         message is not delivered to the Lex bot.
     */

    public ChatMessage getInitialMessage() {
        return this.initialMessage;
    }

    /**
     * <p>
     * The initial message to be sent to the newly created chat. If you have a Lex bot in your flow, the initial message
     * is not delivered to the Lex bot.
     * </p>
     * 
     * @param initialMessage
     *        The initial message to be sent to the newly created chat. If you have a Lex bot in your flow, the initial
     *        message is not delivered to the Lex bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest withInitialMessage(ChatMessage initialMessage) {
        setInitialMessage(initialMessage);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *         provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see
     *         <a href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making
     *         retries safe with idempotent APIs</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The total duration of the newly started chat session. If not specified, the chat session duration defaults to 25
     * hour. The minimum configurable time is 60 minutes. The maximum configurable time is 10,080 minutes (7 days).
     * </p>
     * 
     * @param chatDurationInMinutes
     *        The total duration of the newly started chat session. If not specified, the chat session duration defaults
     *        to 25 hour. The minimum configurable time is 60 minutes. The maximum configurable time is 10,080 minutes
     *        (7 days).
     */

    public void setChatDurationInMinutes(Integer chatDurationInMinutes) {
        this.chatDurationInMinutes = chatDurationInMinutes;
    }

    /**
     * <p>
     * The total duration of the newly started chat session. If not specified, the chat session duration defaults to 25
     * hour. The minimum configurable time is 60 minutes. The maximum configurable time is 10,080 minutes (7 days).
     * </p>
     * 
     * @return The total duration of the newly started chat session. If not specified, the chat session duration
     *         defaults to 25 hour. The minimum configurable time is 60 minutes. The maximum configurable time is 10,080
     *         minutes (7 days).
     */

    public Integer getChatDurationInMinutes() {
        return this.chatDurationInMinutes;
    }

    /**
     * <p>
     * The total duration of the newly started chat session. If not specified, the chat session duration defaults to 25
     * hour. The minimum configurable time is 60 minutes. The maximum configurable time is 10,080 minutes (7 days).
     * </p>
     * 
     * @param chatDurationInMinutes
     *        The total duration of the newly started chat session. If not specified, the chat session duration defaults
     *        to 25 hour. The minimum configurable time is 60 minutes. The maximum configurable time is 10,080 minutes
     *        (7 days).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest withChatDurationInMinutes(Integer chatDurationInMinutes) {
        setChatDurationInMinutes(chatDurationInMinutes);
        return this;
    }

    /**
     * <p>
     * The supported chat message content types. Supported types are <code>text/plain</code>, <code>text/markdown</code>, <code>application/json</code>, <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>.
     * </p>
     * <p>
     * Content types must always contain <code>text/plain</code>. You can then put any other supported type in the list.
     * For example, all the following lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>, <code>[text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>.
     * </p>
     * <note>
     * <p>
     * The type <code>application/vnd.amazonaws.connect.message.interactive</code> is required to use the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html">Show view</a> flow block.
     * </p>
     * </note>
     * 
     * @return The supported chat message content types. Supported types are <code>text/plain</code>,
     *         <code>text/markdown</code>, <code>application/json</code>,
     *         <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     *         <code>application/vnd.amazonaws.connect.message.interactive.response</code>. </p>
     *         <p>
     *         Content types must always contain <code>text/plain</code>. You can then put any other supported type in
     *         the list. For example, all the following lists are valid because they contain <code>text/plain</code>:
     *         <code>[text/plain, text/markdown, application/json]</code>, <code>[text/markdown, text/plain]</code>,
     *         <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     *         .
     *         </p>
     *         <note>
     *         <p>
     *         The type <code>application/vnd.amazonaws.connect.message.interactive</code> is required to use the <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html">Show view</a> flow
     *         block.
     *         </p>
     */

    public java.util.List<String> getSupportedMessagingContentTypes() {
        return supportedMessagingContentTypes;
    }

    /**
     * <p>
     * The supported chat message content types. Supported types are <code>text/plain</code>, <code>text/markdown</code>, <code>application/json</code>, <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>.
     * </p>
     * <p>
     * Content types must always contain <code>text/plain</code>. You can then put any other supported type in the list.
     * For example, all the following lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>, <code>[text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>.
     * </p>
     * <note>
     * <p>
     * The type <code>application/vnd.amazonaws.connect.message.interactive</code> is required to use the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html">Show view</a> flow block.
     * </p>
     * </note>
     * 
     * @param supportedMessagingContentTypes
     *        The supported chat message content types. Supported types are <code>text/plain</code>,
     *        <code>text/markdown</code>, <code>application/json</code>,
     *        <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     *        <code>application/vnd.amazonaws.connect.message.interactive.response</code>. </p>
     *        <p>
     *        Content types must always contain <code>text/plain</code>. You can then put any other supported type in
     *        the list. For example, all the following lists are valid because they contain <code>text/plain</code>:
     *        <code>[text/plain, text/markdown, application/json]</code>, <code>[text/markdown, text/plain]</code>,
     *        <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     *        .
     *        </p>
     *        <note>
     *        <p>
     *        The type <code>application/vnd.amazonaws.connect.message.interactive</code> is required to use the <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html">Show view</a> flow
     *        block.
     *        </p>
     */

    public void setSupportedMessagingContentTypes(java.util.Collection<String> supportedMessagingContentTypes) {
        if (supportedMessagingContentTypes == null) {
            this.supportedMessagingContentTypes = null;
            return;
        }

        this.supportedMessagingContentTypes = new java.util.ArrayList<String>(supportedMessagingContentTypes);
    }

    /**
     * <p>
     * The supported chat message content types. Supported types are <code>text/plain</code>, <code>text/markdown</code>, <code>application/json</code>, <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>.
     * </p>
     * <p>
     * Content types must always contain <code>text/plain</code>. You can then put any other supported type in the list.
     * For example, all the following lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>, <code>[text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>.
     * </p>
     * <note>
     * <p>
     * The type <code>application/vnd.amazonaws.connect.message.interactive</code> is required to use the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html">Show view</a> flow block.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedMessagingContentTypes(java.util.Collection)} or
     * {@link #withSupportedMessagingContentTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedMessagingContentTypes
     *        The supported chat message content types. Supported types are <code>text/plain</code>,
     *        <code>text/markdown</code>, <code>application/json</code>,
     *        <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     *        <code>application/vnd.amazonaws.connect.message.interactive.response</code>. </p>
     *        <p>
     *        Content types must always contain <code>text/plain</code>. You can then put any other supported type in
     *        the list. For example, all the following lists are valid because they contain <code>text/plain</code>:
     *        <code>[text/plain, text/markdown, application/json]</code>, <code>[text/markdown, text/plain]</code>,
     *        <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     *        .
     *        </p>
     *        <note>
     *        <p>
     *        The type <code>application/vnd.amazonaws.connect.message.interactive</code> is required to use the <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html">Show view</a> flow
     *        block.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest withSupportedMessagingContentTypes(String... supportedMessagingContentTypes) {
        if (this.supportedMessagingContentTypes == null) {
            setSupportedMessagingContentTypes(new java.util.ArrayList<String>(supportedMessagingContentTypes.length));
        }
        for (String ele : supportedMessagingContentTypes) {
            this.supportedMessagingContentTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported chat message content types. Supported types are <code>text/plain</code>, <code>text/markdown</code>, <code>application/json</code>, <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>.
     * </p>
     * <p>
     * Content types must always contain <code>text/plain</code>. You can then put any other supported type in the list.
     * For example, all the following lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>, <code>[text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>.
     * </p>
     * <note>
     * <p>
     * The type <code>application/vnd.amazonaws.connect.message.interactive</code> is required to use the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html">Show view</a> flow block.
     * </p>
     * </note>
     * 
     * @param supportedMessagingContentTypes
     *        The supported chat message content types. Supported types are <code>text/plain</code>,
     *        <code>text/markdown</code>, <code>application/json</code>,
     *        <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     *        <code>application/vnd.amazonaws.connect.message.interactive.response</code>. </p>
     *        <p>
     *        Content types must always contain <code>text/plain</code>. You can then put any other supported type in
     *        the list. For example, all the following lists are valid because they contain <code>text/plain</code>:
     *        <code>[text/plain, text/markdown, application/json]</code>, <code>[text/markdown, text/plain]</code>,
     *        <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     *        .
     *        </p>
     *        <note>
     *        <p>
     *        The type <code>application/vnd.amazonaws.connect.message.interactive</code> is required to use the <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html">Show view</a> flow
     *        block.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest withSupportedMessagingContentTypes(java.util.Collection<String> supportedMessagingContentTypes) {
        setSupportedMessagingContentTypes(supportedMessagingContentTypes);
        return this;
    }

    /**
     * <p>
     * Enable persistent chats. For more information about enabling persistent chat, and for example use cases and how
     * to configure for them, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html">Enable persistent chat</a>.
     * </p>
     * 
     * @param persistentChat
     *        Enable persistent chats. For more information about enabling persistent chat, and for example use cases
     *        and how to configure for them, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html">Enable persistent
     *        chat</a>.
     */

    public void setPersistentChat(PersistentChat persistentChat) {
        this.persistentChat = persistentChat;
    }

    /**
     * <p>
     * Enable persistent chats. For more information about enabling persistent chat, and for example use cases and how
     * to configure for them, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html">Enable persistent chat</a>.
     * </p>
     * 
     * @return Enable persistent chats. For more information about enabling persistent chat, and for example use cases
     *         and how to configure for them, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html">Enable persistent
     *         chat</a>.
     */

    public PersistentChat getPersistentChat() {
        return this.persistentChat;
    }

    /**
     * <p>
     * Enable persistent chats. For more information about enabling persistent chat, and for example use cases and how
     * to configure for them, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html">Enable persistent chat</a>.
     * </p>
     * 
     * @param persistentChat
     *        Enable persistent chats. For more information about enabling persistent chat, and for example use cases
     *        and how to configure for them, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html">Enable persistent
     *        chat</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest withPersistentChat(PersistentChat persistentChat) {
        setPersistentChat(persistentChat);
        return this;
    }

    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is related to the chat starting.
     * </p>
     * <note>
     * <p>
     * You cannot provide data for both RelatedContactId and PersistentChat.
     * </p>
     * </note>
     * 
     * @param relatedContactId
     *        The unique identifier for an Amazon Connect contact. This identifier is related to the chat starting.</p>
     *        <note>
     *        <p>
     *        You cannot provide data for both RelatedContactId and PersistentChat.
     *        </p>
     */

    public void setRelatedContactId(String relatedContactId) {
        this.relatedContactId = relatedContactId;
    }

    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is related to the chat starting.
     * </p>
     * <note>
     * <p>
     * You cannot provide data for both RelatedContactId and PersistentChat.
     * </p>
     * </note>
     * 
     * @return The unique identifier for an Amazon Connect contact. This identifier is related to the chat starting.</p>
     *         <note>
     *         <p>
     *         You cannot provide data for both RelatedContactId and PersistentChat.
     *         </p>
     */

    public String getRelatedContactId() {
        return this.relatedContactId;
    }

    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is related to the chat starting.
     * </p>
     * <note>
     * <p>
     * You cannot provide data for both RelatedContactId and PersistentChat.
     * </p>
     * </note>
     * 
     * @param relatedContactId
     *        The unique identifier for an Amazon Connect contact. This identifier is related to the chat starting.</p>
     *        <note>
     *        <p>
     *        You cannot provide data for both RelatedContactId and PersistentChat.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest withRelatedContactId(String relatedContactId) {
        setRelatedContactId(relatedContactId);
        return this;
    }

    /**
     * <p>
     * A set of system defined key-value pairs stored on individual contact segments using an attribute map. The
     * attributes are standard Amazon Connect attributes. They can be accessed in flows.
     * </p>
     * <p>
     * Attribute keys can include only alphanumeric, -, and _.
     * </p>
     * <p>
     * This field can be used to show channel subtype, such as <code>connect:Guide</code>.
     * </p>
     * <note>
     * <p>
     * The types <code>application/vnd.amazonaws.connect.message.interactive</code> and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code> must be present in the
     * SupportedMessagingContentTypes field of this API in order to set <code>SegmentAttributes</code> as {
     * <code> "connect:Subtype": {"valueString" : "connect:Guide" }}</code>.
     * </p>
     * </note>
     * 
     * @return A set of system defined key-value pairs stored on individual contact segments using an attribute map. The
     *         attributes are standard Amazon Connect attributes. They can be accessed in flows.</p>
     *         <p>
     *         Attribute keys can include only alphanumeric, -, and _.
     *         </p>
     *         <p>
     *         This field can be used to show channel subtype, such as <code>connect:Guide</code>.
     *         </p>
     *         <note>
     *         <p>
     *         The types <code>application/vnd.amazonaws.connect.message.interactive</code> and
     *         <code>application/vnd.amazonaws.connect.message.interactive.response</code> must be present in the
     *         SupportedMessagingContentTypes field of this API in order to set <code>SegmentAttributes</code> as {
     *         <code> "connect:Subtype": {"valueString" : "connect:Guide" }}</code>.
     *         </p>
     */

    public java.util.Map<String, SegmentAttributeValue> getSegmentAttributes() {
        return segmentAttributes;
    }

    /**
     * <p>
     * A set of system defined key-value pairs stored on individual contact segments using an attribute map. The
     * attributes are standard Amazon Connect attributes. They can be accessed in flows.
     * </p>
     * <p>
     * Attribute keys can include only alphanumeric, -, and _.
     * </p>
     * <p>
     * This field can be used to show channel subtype, such as <code>connect:Guide</code>.
     * </p>
     * <note>
     * <p>
     * The types <code>application/vnd.amazonaws.connect.message.interactive</code> and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code> must be present in the
     * SupportedMessagingContentTypes field of this API in order to set <code>SegmentAttributes</code> as {
     * <code> "connect:Subtype": {"valueString" : "connect:Guide" }}</code>.
     * </p>
     * </note>
     * 
     * @param segmentAttributes
     *        A set of system defined key-value pairs stored on individual contact segments using an attribute map. The
     *        attributes are standard Amazon Connect attributes. They can be accessed in flows.</p>
     *        <p>
     *        Attribute keys can include only alphanumeric, -, and _.
     *        </p>
     *        <p>
     *        This field can be used to show channel subtype, such as <code>connect:Guide</code>.
     *        </p>
     *        <note>
     *        <p>
     *        The types <code>application/vnd.amazonaws.connect.message.interactive</code> and
     *        <code>application/vnd.amazonaws.connect.message.interactive.response</code> must be present in the
     *        SupportedMessagingContentTypes field of this API in order to set <code>SegmentAttributes</code> as {
     *        <code> "connect:Subtype": {"valueString" : "connect:Guide" }}</code>.
     *        </p>
     */

    public void setSegmentAttributes(java.util.Map<String, SegmentAttributeValue> segmentAttributes) {
        this.segmentAttributes = segmentAttributes;
    }

    /**
     * <p>
     * A set of system defined key-value pairs stored on individual contact segments using an attribute map. The
     * attributes are standard Amazon Connect attributes. They can be accessed in flows.
     * </p>
     * <p>
     * Attribute keys can include only alphanumeric, -, and _.
     * </p>
     * <p>
     * This field can be used to show channel subtype, such as <code>connect:Guide</code>.
     * </p>
     * <note>
     * <p>
     * The types <code>application/vnd.amazonaws.connect.message.interactive</code> and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code> must be present in the
     * SupportedMessagingContentTypes field of this API in order to set <code>SegmentAttributes</code> as {
     * <code> "connect:Subtype": {"valueString" : "connect:Guide" }}</code>.
     * </p>
     * </note>
     * 
     * @param segmentAttributes
     *        A set of system defined key-value pairs stored on individual contact segments using an attribute map. The
     *        attributes are standard Amazon Connect attributes. They can be accessed in flows.</p>
     *        <p>
     *        Attribute keys can include only alphanumeric, -, and _.
     *        </p>
     *        <p>
     *        This field can be used to show channel subtype, such as <code>connect:Guide</code>.
     *        </p>
     *        <note>
     *        <p>
     *        The types <code>application/vnd.amazonaws.connect.message.interactive</code> and
     *        <code>application/vnd.amazonaws.connect.message.interactive.response</code> must be present in the
     *        SupportedMessagingContentTypes field of this API in order to set <code>SegmentAttributes</code> as {
     *        <code> "connect:Subtype": {"valueString" : "connect:Guide" }}</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest withSegmentAttributes(java.util.Map<String, SegmentAttributeValue> segmentAttributes) {
        setSegmentAttributes(segmentAttributes);
        return this;
    }

    /**
     * Add a single SegmentAttributes entry
     *
     * @see StartChatContactRequest#withSegmentAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest addSegmentAttributesEntry(String key, SegmentAttributeValue value) {
        if (null == this.segmentAttributes) {
            this.segmentAttributes = new java.util.HashMap<String, SegmentAttributeValue>();
        }
        if (this.segmentAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.segmentAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SegmentAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactRequest clearSegmentAttributesEntries() {
        this.segmentAttributes = null;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: ").append(getContactFlowId()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getParticipantDetails() != null)
            sb.append("ParticipantDetails: ").append(getParticipantDetails()).append(",");
        if (getInitialMessage() != null)
            sb.append("InitialMessage: ").append(getInitialMessage()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getChatDurationInMinutes() != null)
            sb.append("ChatDurationInMinutes: ").append(getChatDurationInMinutes()).append(",");
        if (getSupportedMessagingContentTypes() != null)
            sb.append("SupportedMessagingContentTypes: ").append(getSupportedMessagingContentTypes()).append(",");
        if (getPersistentChat() != null)
            sb.append("PersistentChat: ").append(getPersistentChat()).append(",");
        if (getRelatedContactId() != null)
            sb.append("RelatedContactId: ").append(getRelatedContactId()).append(",");
        if (getSegmentAttributes() != null)
            sb.append("SegmentAttributes: ").append(getSegmentAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartChatContactRequest == false)
            return false;
        StartChatContactRequest other = (StartChatContactRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null && other.getContactFlowId().equals(this.getContactFlowId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getParticipantDetails() == null ^ this.getParticipantDetails() == null)
            return false;
        if (other.getParticipantDetails() != null && other.getParticipantDetails().equals(this.getParticipantDetails()) == false)
            return false;
        if (other.getInitialMessage() == null ^ this.getInitialMessage() == null)
            return false;
        if (other.getInitialMessage() != null && other.getInitialMessage().equals(this.getInitialMessage()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getChatDurationInMinutes() == null ^ this.getChatDurationInMinutes() == null)
            return false;
        if (other.getChatDurationInMinutes() != null && other.getChatDurationInMinutes().equals(this.getChatDurationInMinutes()) == false)
            return false;
        if (other.getSupportedMessagingContentTypes() == null ^ this.getSupportedMessagingContentTypes() == null)
            return false;
        if (other.getSupportedMessagingContentTypes() != null
                && other.getSupportedMessagingContentTypes().equals(this.getSupportedMessagingContentTypes()) == false)
            return false;
        if (other.getPersistentChat() == null ^ this.getPersistentChat() == null)
            return false;
        if (other.getPersistentChat() != null && other.getPersistentChat().equals(this.getPersistentChat()) == false)
            return false;
        if (other.getRelatedContactId() == null ^ this.getRelatedContactId() == null)
            return false;
        if (other.getRelatedContactId() != null && other.getRelatedContactId().equals(this.getRelatedContactId()) == false)
            return false;
        if (other.getSegmentAttributes() == null ^ this.getSegmentAttributes() == null)
            return false;
        if (other.getSegmentAttributes() != null && other.getSegmentAttributes().equals(this.getSegmentAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getParticipantDetails() == null) ? 0 : getParticipantDetails().hashCode());
        hashCode = prime * hashCode + ((getInitialMessage() == null) ? 0 : getInitialMessage().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getChatDurationInMinutes() == null) ? 0 : getChatDurationInMinutes().hashCode());
        hashCode = prime * hashCode + ((getSupportedMessagingContentTypes() == null) ? 0 : getSupportedMessagingContentTypes().hashCode());
        hashCode = prime * hashCode + ((getPersistentChat() == null) ? 0 : getPersistentChat().hashCode());
        hashCode = prime * hashCode + ((getRelatedContactId() == null) ? 0 : getRelatedContactId().hashCode());
        hashCode = prime * hashCode + ((getSegmentAttributes() == null) ? 0 : getSegmentAttributes().hashCode());
        return hashCode;
    }

    @Override
    public StartChatContactRequest clone() {
        return (StartChatContactRequest) super.clone();
    }

}
