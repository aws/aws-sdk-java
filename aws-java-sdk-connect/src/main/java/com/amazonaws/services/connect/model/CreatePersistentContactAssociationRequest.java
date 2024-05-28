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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreatePersistentContactAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePersistentContactAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * This is the contactId of the current contact that the <code>CreatePersistentContactAssociation</code> API is
     * being called from.
     * </p>
     */
    private String initialContactId;
    /**
     * <p>
     * The contactId chosen for rehydration depends on the type chosen.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of the
     * specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the past ended
     * chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines what the most
     * recent chat contact on the past ended chat session and uses it to start a persistent chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the specified past chat contact provided in the
     * <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of this API.
     * </p>
     * <p>
     * To illustrate how to use rehydration type, consider the following example: A customer starts a chat session.
     * Agent a1 accepts the chat and a conversation starts between the customer and Agent a1. This first contact creates
     * a contact ID <b>C1</b>. Agent a1 then transfers the chat to Agent a2. This creates another contact ID <b>C2</b>.
     * At this point Agent a2 ends the chat. The customer is forwarded to the disconnect flow for a post chat survey
     * that creates another contact ID <b>C3</b>. After the chat survey, the chat session ends. Later, the customer
     * returns and wants to resume their past chat session. At this point, the customer can have following use cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Use Case 1</b>: The customer wants to continue the past chat session but they want to hide the post chat
     * survey. For this they will use the following configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Configuration</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * SourceContactId = "C2"
     * </p>
     * </li>
     * <li>
     * <p>
     * RehydrationType = "FROM_SEGMENT"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Expected behavior</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * This starts a persistent chat session from the specified past ended contact (C2). Transcripts of past chat
     * sessions C2 and C1 are accessible in the current persistent chat session. Note that chat segment C3 is dropped
     * from the persistent chat session.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Use Case 2</b>: The customer wants to continue the past chat session and see the transcript of the entire past
     * engagement, including the post chat survey. For this they will use the following configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Configuration</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * SourceContactId = "C1"
     * </p>
     * </li>
     * <li>
     * <p>
     * RehydrationType = "ENTIRE_PAST_SESSION"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Expected behavior</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * This starts a persistent chat session from the most recently ended chat contact (C3). Transcripts of past chat
     * sessions C3, C2 and C1 are accessible in the current persistent chat session.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String rehydrationType;
    /**
     * <p>
     * The contactId from which a persistent chat session must be started.
     * </p>
     */
    private String sourceContactId;
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

    public CreatePersistentContactAssociationRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * This is the contactId of the current contact that the <code>CreatePersistentContactAssociation</code> API is
     * being called from.
     * </p>
     * 
     * @param initialContactId
     *        This is the contactId of the current contact that the <code>CreatePersistentContactAssociation</code> API
     *        is being called from.
     */

    public void setInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
    }

    /**
     * <p>
     * This is the contactId of the current contact that the <code>CreatePersistentContactAssociation</code> API is
     * being called from.
     * </p>
     * 
     * @return This is the contactId of the current contact that the <code>CreatePersistentContactAssociation</code> API
     *         is being called from.
     */

    public String getInitialContactId() {
        return this.initialContactId;
    }

    /**
     * <p>
     * This is the contactId of the current contact that the <code>CreatePersistentContactAssociation</code> API is
     * being called from.
     * </p>
     * 
     * @param initialContactId
     *        This is the contactId of the current contact that the <code>CreatePersistentContactAssociation</code> API
     *        is being called from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePersistentContactAssociationRequest withInitialContactId(String initialContactId) {
        setInitialContactId(initialContactId);
        return this;
    }

    /**
     * <p>
     * The contactId chosen for rehydration depends on the type chosen.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of the
     * specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the past ended
     * chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines what the most
     * recent chat contact on the past ended chat session and uses it to start a persistent chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the specified past chat contact provided in the
     * <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of this API.
     * </p>
     * <p>
     * To illustrate how to use rehydration type, consider the following example: A customer starts a chat session.
     * Agent a1 accepts the chat and a conversation starts between the customer and Agent a1. This first contact creates
     * a contact ID <b>C1</b>. Agent a1 then transfers the chat to Agent a2. This creates another contact ID <b>C2</b>.
     * At this point Agent a2 ends the chat. The customer is forwarded to the disconnect flow for a post chat survey
     * that creates another contact ID <b>C3</b>. After the chat survey, the chat session ends. Later, the customer
     * returns and wants to resume their past chat session. At this point, the customer can have following use cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Use Case 1</b>: The customer wants to continue the past chat session but they want to hide the post chat
     * survey. For this they will use the following configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Configuration</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * SourceContactId = "C2"
     * </p>
     * </li>
     * <li>
     * <p>
     * RehydrationType = "FROM_SEGMENT"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Expected behavior</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * This starts a persistent chat session from the specified past ended contact (C2). Transcripts of past chat
     * sessions C2 and C1 are accessible in the current persistent chat session. Note that chat segment C3 is dropped
     * from the persistent chat session.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Use Case 2</b>: The customer wants to continue the past chat session and see the transcript of the entire past
     * engagement, including the post chat survey. For this they will use the following configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Configuration</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * SourceContactId = "C1"
     * </p>
     * </li>
     * <li>
     * <p>
     * RehydrationType = "ENTIRE_PAST_SESSION"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Expected behavior</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * This starts a persistent chat session from the most recently ended chat contact (C3). Transcripts of past chat
     * sessions C3, C2 and C1 are accessible in the current persistent chat session.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param rehydrationType
     *        The contactId chosen for rehydration depends on the type chosen.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of
     *        the specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the
     *        past ended chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines
     *        what the most recent chat contact on the past ended chat session and uses it to start a persistent chat.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FROM_SEGMENT</code>: Rehydrates a chat from the specified past chat contact provided in the
     *        <code>sourceContactId</code> field.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The actual contactId used for rehydration is provided in the response of this API.
     *        </p>
     *        <p>
     *        To illustrate how to use rehydration type, consider the following example: A customer starts a chat
     *        session. Agent a1 accepts the chat and a conversation starts between the customer and Agent a1. This first
     *        contact creates a contact ID <b>C1</b>. Agent a1 then transfers the chat to Agent a2. This creates another
     *        contact ID <b>C2</b>. At this point Agent a2 ends the chat. The customer is forwarded to the disconnect
     *        flow for a post chat survey that creates another contact ID <b>C3</b>. After the chat survey, the chat
     *        session ends. Later, the customer returns and wants to resume their past chat session. At this point, the
     *        customer can have following use cases:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Use Case 1</b>: The customer wants to continue the past chat session but they want to hide the post
     *        chat survey. For this they will use the following configuration:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Configuration</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        SourceContactId = "C2"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RehydrationType = "FROM_SEGMENT"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Expected behavior</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        This starts a persistent chat session from the specified past ended contact (C2). Transcripts of past chat
     *        sessions C2 and C1 are accessible in the current persistent chat session. Note that chat segment C3 is
     *        dropped from the persistent chat session.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Use Case 2</b>: The customer wants to continue the past chat session and see the transcript of the
     *        entire past engagement, including the post chat survey. For this they will use the following
     *        configuration:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Configuration</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        SourceContactId = "C1"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RehydrationType = "ENTIRE_PAST_SESSION"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Expected behavior</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        This starts a persistent chat session from the most recently ended chat contact (C3). Transcripts of past
     *        chat sessions C3, C2 and C1 are accessible in the current persistent chat session.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     * @see RehydrationType
     */

    public void setRehydrationType(String rehydrationType) {
        this.rehydrationType = rehydrationType;
    }

    /**
     * <p>
     * The contactId chosen for rehydration depends on the type chosen.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of the
     * specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the past ended
     * chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines what the most
     * recent chat contact on the past ended chat session and uses it to start a persistent chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the specified past chat contact provided in the
     * <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of this API.
     * </p>
     * <p>
     * To illustrate how to use rehydration type, consider the following example: A customer starts a chat session.
     * Agent a1 accepts the chat and a conversation starts between the customer and Agent a1. This first contact creates
     * a contact ID <b>C1</b>. Agent a1 then transfers the chat to Agent a2. This creates another contact ID <b>C2</b>.
     * At this point Agent a2 ends the chat. The customer is forwarded to the disconnect flow for a post chat survey
     * that creates another contact ID <b>C3</b>. After the chat survey, the chat session ends. Later, the customer
     * returns and wants to resume their past chat session. At this point, the customer can have following use cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Use Case 1</b>: The customer wants to continue the past chat session but they want to hide the post chat
     * survey. For this they will use the following configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Configuration</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * SourceContactId = "C2"
     * </p>
     * </li>
     * <li>
     * <p>
     * RehydrationType = "FROM_SEGMENT"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Expected behavior</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * This starts a persistent chat session from the specified past ended contact (C2). Transcripts of past chat
     * sessions C2 and C1 are accessible in the current persistent chat session. Note that chat segment C3 is dropped
     * from the persistent chat session.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Use Case 2</b>: The customer wants to continue the past chat session and see the transcript of the entire past
     * engagement, including the post chat survey. For this they will use the following configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Configuration</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * SourceContactId = "C1"
     * </p>
     * </li>
     * <li>
     * <p>
     * RehydrationType = "ENTIRE_PAST_SESSION"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Expected behavior</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * This starts a persistent chat session from the most recently ended chat contact (C3). Transcripts of past chat
     * sessions C3, C2 and C1 are accessible in the current persistent chat session.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The contactId chosen for rehydration depends on the type chosen.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact
     *         of the specified past ended chat session. To use this type, provide the <code>initialContactId</code> of
     *         the past ended chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect
     *         determines what the most recent chat contact on the past ended chat session and uses it to start a
     *         persistent chat.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FROM_SEGMENT</code>: Rehydrates a chat from the specified past chat contact provided in the
     *         <code>sourceContactId</code> field.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The actual contactId used for rehydration is provided in the response of this API.
     *         </p>
     *         <p>
     *         To illustrate how to use rehydration type, consider the following example: A customer starts a chat
     *         session. Agent a1 accepts the chat and a conversation starts between the customer and Agent a1. This
     *         first contact creates a contact ID <b>C1</b>. Agent a1 then transfers the chat to Agent a2. This creates
     *         another contact ID <b>C2</b>. At this point Agent a2 ends the chat. The customer is forwarded to the
     *         disconnect flow for a post chat survey that creates another contact ID <b>C3</b>. After the chat survey,
     *         the chat session ends. Later, the customer returns and wants to resume their past chat session. At this
     *         point, the customer can have following use cases:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Use Case 1</b>: The customer wants to continue the past chat session but they want to hide the post
     *         chat survey. For this they will use the following configuration:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Configuration</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         SourceContactId = "C2"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RehydrationType = "FROM_SEGMENT"
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Expected behavior</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This starts a persistent chat session from the specified past ended contact (C2). Transcripts of past
     *         chat sessions C2 and C1 are accessible in the current persistent chat session. Note that chat segment C3
     *         is dropped from the persistent chat session.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Use Case 2</b>: The customer wants to continue the past chat session and see the transcript of the
     *         entire past engagement, including the post chat survey. For this they will use the following
     *         configuration:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Configuration</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         SourceContactId = "C1"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RehydrationType = "ENTIRE_PAST_SESSION"
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Expected behavior</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This starts a persistent chat session from the most recently ended chat contact (C3). Transcripts of past
     *         chat sessions C3, C2 and C1 are accessible in the current persistent chat session.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </li>
     * @see RehydrationType
     */

    public String getRehydrationType() {
        return this.rehydrationType;
    }

    /**
     * <p>
     * The contactId chosen for rehydration depends on the type chosen.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of the
     * specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the past ended
     * chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines what the most
     * recent chat contact on the past ended chat session and uses it to start a persistent chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the specified past chat contact provided in the
     * <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of this API.
     * </p>
     * <p>
     * To illustrate how to use rehydration type, consider the following example: A customer starts a chat session.
     * Agent a1 accepts the chat and a conversation starts between the customer and Agent a1. This first contact creates
     * a contact ID <b>C1</b>. Agent a1 then transfers the chat to Agent a2. This creates another contact ID <b>C2</b>.
     * At this point Agent a2 ends the chat. The customer is forwarded to the disconnect flow for a post chat survey
     * that creates another contact ID <b>C3</b>. After the chat survey, the chat session ends. Later, the customer
     * returns and wants to resume their past chat session. At this point, the customer can have following use cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Use Case 1</b>: The customer wants to continue the past chat session but they want to hide the post chat
     * survey. For this they will use the following configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Configuration</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * SourceContactId = "C2"
     * </p>
     * </li>
     * <li>
     * <p>
     * RehydrationType = "FROM_SEGMENT"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Expected behavior</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * This starts a persistent chat session from the specified past ended contact (C2). Transcripts of past chat
     * sessions C2 and C1 are accessible in the current persistent chat session. Note that chat segment C3 is dropped
     * from the persistent chat session.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Use Case 2</b>: The customer wants to continue the past chat session and see the transcript of the entire past
     * engagement, including the post chat survey. For this they will use the following configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Configuration</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * SourceContactId = "C1"
     * </p>
     * </li>
     * <li>
     * <p>
     * RehydrationType = "ENTIRE_PAST_SESSION"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Expected behavior</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * This starts a persistent chat session from the most recently ended chat contact (C3). Transcripts of past chat
     * sessions C3, C2 and C1 are accessible in the current persistent chat session.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param rehydrationType
     *        The contactId chosen for rehydration depends on the type chosen.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of
     *        the specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the
     *        past ended chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines
     *        what the most recent chat contact on the past ended chat session and uses it to start a persistent chat.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FROM_SEGMENT</code>: Rehydrates a chat from the specified past chat contact provided in the
     *        <code>sourceContactId</code> field.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The actual contactId used for rehydration is provided in the response of this API.
     *        </p>
     *        <p>
     *        To illustrate how to use rehydration type, consider the following example: A customer starts a chat
     *        session. Agent a1 accepts the chat and a conversation starts between the customer and Agent a1. This first
     *        contact creates a contact ID <b>C1</b>. Agent a1 then transfers the chat to Agent a2. This creates another
     *        contact ID <b>C2</b>. At this point Agent a2 ends the chat. The customer is forwarded to the disconnect
     *        flow for a post chat survey that creates another contact ID <b>C3</b>. After the chat survey, the chat
     *        session ends. Later, the customer returns and wants to resume their past chat session. At this point, the
     *        customer can have following use cases:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Use Case 1</b>: The customer wants to continue the past chat session but they want to hide the post
     *        chat survey. For this they will use the following configuration:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Configuration</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        SourceContactId = "C2"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RehydrationType = "FROM_SEGMENT"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Expected behavior</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        This starts a persistent chat session from the specified past ended contact (C2). Transcripts of past chat
     *        sessions C2 and C1 are accessible in the current persistent chat session. Note that chat segment C3 is
     *        dropped from the persistent chat session.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Use Case 2</b>: The customer wants to continue the past chat session and see the transcript of the
     *        entire past engagement, including the post chat survey. For this they will use the following
     *        configuration:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Configuration</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        SourceContactId = "C1"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RehydrationType = "ENTIRE_PAST_SESSION"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Expected behavior</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        This starts a persistent chat session from the most recently ended chat contact (C3). Transcripts of past
     *        chat sessions C3, C2 and C1 are accessible in the current persistent chat session.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RehydrationType
     */

    public CreatePersistentContactAssociationRequest withRehydrationType(String rehydrationType) {
        setRehydrationType(rehydrationType);
        return this;
    }

    /**
     * <p>
     * The contactId chosen for rehydration depends on the type chosen.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of the
     * specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the past ended
     * chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines what the most
     * recent chat contact on the past ended chat session and uses it to start a persistent chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the specified past chat contact provided in the
     * <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of this API.
     * </p>
     * <p>
     * To illustrate how to use rehydration type, consider the following example: A customer starts a chat session.
     * Agent a1 accepts the chat and a conversation starts between the customer and Agent a1. This first contact creates
     * a contact ID <b>C1</b>. Agent a1 then transfers the chat to Agent a2. This creates another contact ID <b>C2</b>.
     * At this point Agent a2 ends the chat. The customer is forwarded to the disconnect flow for a post chat survey
     * that creates another contact ID <b>C3</b>. After the chat survey, the chat session ends. Later, the customer
     * returns and wants to resume their past chat session. At this point, the customer can have following use cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Use Case 1</b>: The customer wants to continue the past chat session but they want to hide the post chat
     * survey. For this they will use the following configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Configuration</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * SourceContactId = "C2"
     * </p>
     * </li>
     * <li>
     * <p>
     * RehydrationType = "FROM_SEGMENT"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Expected behavior</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * This starts a persistent chat session from the specified past ended contact (C2). Transcripts of past chat
     * sessions C2 and C1 are accessible in the current persistent chat session. Note that chat segment C3 is dropped
     * from the persistent chat session.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Use Case 2</b>: The customer wants to continue the past chat session and see the transcript of the entire past
     * engagement, including the post chat survey. For this they will use the following configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Configuration</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * SourceContactId = "C1"
     * </p>
     * </li>
     * <li>
     * <p>
     * RehydrationType = "ENTIRE_PAST_SESSION"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Expected behavior</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * This starts a persistent chat session from the most recently ended chat contact (C3). Transcripts of past chat
     * sessions C3, C2 and C1 are accessible in the current persistent chat session.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param rehydrationType
     *        The contactId chosen for rehydration depends on the type chosen.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of
     *        the specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the
     *        past ended chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines
     *        what the most recent chat contact on the past ended chat session and uses it to start a persistent chat.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FROM_SEGMENT</code>: Rehydrates a chat from the specified past chat contact provided in the
     *        <code>sourceContactId</code> field.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The actual contactId used for rehydration is provided in the response of this API.
     *        </p>
     *        <p>
     *        To illustrate how to use rehydration type, consider the following example: A customer starts a chat
     *        session. Agent a1 accepts the chat and a conversation starts between the customer and Agent a1. This first
     *        contact creates a contact ID <b>C1</b>. Agent a1 then transfers the chat to Agent a2. This creates another
     *        contact ID <b>C2</b>. At this point Agent a2 ends the chat. The customer is forwarded to the disconnect
     *        flow for a post chat survey that creates another contact ID <b>C3</b>. After the chat survey, the chat
     *        session ends. Later, the customer returns and wants to resume their past chat session. At this point, the
     *        customer can have following use cases:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Use Case 1</b>: The customer wants to continue the past chat session but they want to hide the post
     *        chat survey. For this they will use the following configuration:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Configuration</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        SourceContactId = "C2"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RehydrationType = "FROM_SEGMENT"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Expected behavior</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        This starts a persistent chat session from the specified past ended contact (C2). Transcripts of past chat
     *        sessions C2 and C1 are accessible in the current persistent chat session. Note that chat segment C3 is
     *        dropped from the persistent chat session.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Use Case 2</b>: The customer wants to continue the past chat session and see the transcript of the
     *        entire past engagement, including the post chat survey. For this they will use the following
     *        configuration:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Configuration</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        SourceContactId = "C1"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RehydrationType = "ENTIRE_PAST_SESSION"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Expected behavior</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        This starts a persistent chat session from the most recently ended chat contact (C3). Transcripts of past
     *        chat sessions C3, C2 and C1 are accessible in the current persistent chat session.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RehydrationType
     */

    public CreatePersistentContactAssociationRequest withRehydrationType(RehydrationType rehydrationType) {
        this.rehydrationType = rehydrationType.toString();
        return this;
    }

    /**
     * <p>
     * The contactId from which a persistent chat session must be started.
     * </p>
     * 
     * @param sourceContactId
     *        The contactId from which a persistent chat session must be started.
     */

    public void setSourceContactId(String sourceContactId) {
        this.sourceContactId = sourceContactId;
    }

    /**
     * <p>
     * The contactId from which a persistent chat session must be started.
     * </p>
     * 
     * @return The contactId from which a persistent chat session must be started.
     */

    public String getSourceContactId() {
        return this.sourceContactId;
    }

    /**
     * <p>
     * The contactId from which a persistent chat session must be started.
     * </p>
     * 
     * @param sourceContactId
     *        The contactId from which a persistent chat session must be started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePersistentContactAssociationRequest withSourceContactId(String sourceContactId) {
        setSourceContactId(sourceContactId);
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

    public CreatePersistentContactAssociationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getInitialContactId() != null)
            sb.append("InitialContactId: ").append(getInitialContactId()).append(",");
        if (getRehydrationType() != null)
            sb.append("RehydrationType: ").append(getRehydrationType()).append(",");
        if (getSourceContactId() != null)
            sb.append("SourceContactId: ").append(getSourceContactId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePersistentContactAssociationRequest == false)
            return false;
        CreatePersistentContactAssociationRequest other = (CreatePersistentContactAssociationRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInitialContactId() == null ^ this.getInitialContactId() == null)
            return false;
        if (other.getInitialContactId() != null && other.getInitialContactId().equals(this.getInitialContactId()) == false)
            return false;
        if (other.getRehydrationType() == null ^ this.getRehydrationType() == null)
            return false;
        if (other.getRehydrationType() != null && other.getRehydrationType().equals(this.getRehydrationType()) == false)
            return false;
        if (other.getSourceContactId() == null ^ this.getSourceContactId() == null)
            return false;
        if (other.getSourceContactId() != null && other.getSourceContactId().equals(this.getSourceContactId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInitialContactId() == null) ? 0 : getInitialContactId().hashCode());
        hashCode = prime * hashCode + ((getRehydrationType() == null) ? 0 : getRehydrationType().hashCode());
        hashCode = prime * hashCode + ((getSourceContactId() == null) ? 0 : getSourceContactId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreatePersistentContactAssociationRequest clone() {
        return (CreatePersistentContactAssociationRequest) super.clone();
    }

}
