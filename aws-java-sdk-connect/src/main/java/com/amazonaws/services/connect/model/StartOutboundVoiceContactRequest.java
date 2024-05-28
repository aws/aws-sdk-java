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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartOutboundVoiceContact" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartOutboundVoiceContactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a voice contact that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the voice contact that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     */
    private String description;
    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel (CCP). Contacts can have the following
     * reference types at the time of creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a supported reference type during voice
     * contact creation.
     * </p>
     */
    private java.util.Map<String, Reference> references;
    /**
     * <p>
     * The <code>contactId</code> that is related to this contact. Linking voice, task, or chat by using
     * <code>RelatedContactID</code> copies over contact attributes from the related contact to the new contact. All
     * updates to user-defined attributes in the new contact are limited to the individual contact ID. There are no
     * limits to the number of contacts that can be linked by using <code>RelatedContactId</code>.
     * </p>
     */
    private String relatedContactId;
    /**
     * <p>
     * The phone number of the customer, in E.164 format.
     * </p>
     */
    private String destinationPhoneNumber;
    /**
     * <p>
     * The identifier of the flow for the outbound call. To see the ContactFlowId in the Amazon Connect admin website,
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
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>. The token is valid for 7 days after creation. If a contact is already started, the contact
     * ID is returned.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The phone number associated with the Amazon Connect instance, in E.164 format. If you do not specify a source
     * phone number, you must specify a queue.
     * </p>
     */
    private String sourcePhoneNumber;
    /**
     * <p>
     * The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number specified
     * in the queue. If you do not specify a queue, the queue defined in the flow is used. If you do not specify a
     * queue, you must specify a source phone number.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be
     * accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * Configuration of the answering machine detection for this outbound call.
     * </p>
     */
    private AnswerMachineDetectionConfig answerMachineDetectionConfig;
    /**
     * <p>
     * The campaign identifier of the outbound communication.
     * </p>
     */
    private String campaignId;
    /**
     * <p>
     * Denotes the class of traffic. Calls with different traffic types are handled differently by Amazon Connect. The
     * default value is <code>GENERAL</code>. Use <code>CAMPAIGN</code> if <code>EnableAnswerMachineDetection</code> is
     * set to <code>true</code>. For all other cases, use <code>GENERAL</code>.
     * </p>
     */
    private String trafficType;

    /**
     * <p>
     * The name of a voice contact that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @param name
     *        The name of a voice contact that is shown to an agent in the Contact Control Panel (CCP).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a voice contact that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @return The name of a voice contact that is shown to an agent in the Contact Control Panel (CCP).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a voice contact that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @param name
     *        The name of a voice contact that is shown to an agent in the Contact Control Panel (CCP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the voice contact that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @param description
     *        A description of the voice contact that is shown to an agent in the Contact Control Panel (CCP).
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the voice contact that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @return A description of the voice contact that is shown to an agent in the Contact Control Panel (CCP).
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the voice contact that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @param description
     *        A description of the voice contact that is shown to an agent in the Contact Control Panel (CCP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel (CCP). Contacts can have the following
     * reference types at the time of creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a supported reference type during voice
     * contact creation.
     * </p>
     * 
     * @return A formatted URL that is shown to an agent in the Contact Control Panel (CCP). Contacts can have the
     *         following reference types at the time of creation: <code>URL</code> | <code>NUMBER</code> |
     *         <code>STRING</code> | <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a supported
     *         reference type during voice contact creation.
     */

    public java.util.Map<String, Reference> getReferences() {
        return references;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel (CCP). Contacts can have the following
     * reference types at the time of creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a supported reference type during voice
     * contact creation.
     * </p>
     * 
     * @param references
     *        A formatted URL that is shown to an agent in the Contact Control Panel (CCP). Contacts can have the
     *        following reference types at the time of creation: <code>URL</code> | <code>NUMBER</code> |
     *        <code>STRING</code> | <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a supported
     *        reference type during voice contact creation.
     */

    public void setReferences(java.util.Map<String, Reference> references) {
        this.references = references;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel (CCP). Contacts can have the following
     * reference types at the time of creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a supported reference type during voice
     * contact creation.
     * </p>
     * 
     * @param references
     *        A formatted URL that is shown to an agent in the Contact Control Panel (CCP). Contacts can have the
     *        following reference types at the time of creation: <code>URL</code> | <code>NUMBER</code> |
     *        <code>STRING</code> | <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a supported
     *        reference type during voice contact creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withReferences(java.util.Map<String, Reference> references) {
        setReferences(references);
        return this;
    }

    /**
     * Add a single References entry
     *
     * @see StartOutboundVoiceContactRequest#withReferences
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest addReferencesEntry(String key, Reference value) {
        if (null == this.references) {
            this.references = new java.util.HashMap<String, Reference>();
        }
        if (this.references.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.references.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into References.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest clearReferencesEntries() {
        this.references = null;
        return this;
    }

    /**
     * <p>
     * The <code>contactId</code> that is related to this contact. Linking voice, task, or chat by using
     * <code>RelatedContactID</code> copies over contact attributes from the related contact to the new contact. All
     * updates to user-defined attributes in the new contact are limited to the individual contact ID. There are no
     * limits to the number of contacts that can be linked by using <code>RelatedContactId</code>.
     * </p>
     * 
     * @param relatedContactId
     *        The <code>contactId</code> that is related to this contact. Linking voice, task, or chat by using
     *        <code>RelatedContactID</code> copies over contact attributes from the related contact to the new contact.
     *        All updates to user-defined attributes in the new contact are limited to the individual contact ID. There
     *        are no limits to the number of contacts that can be linked by using <code>RelatedContactId</code>.
     */

    public void setRelatedContactId(String relatedContactId) {
        this.relatedContactId = relatedContactId;
    }

    /**
     * <p>
     * The <code>contactId</code> that is related to this contact. Linking voice, task, or chat by using
     * <code>RelatedContactID</code> copies over contact attributes from the related contact to the new contact. All
     * updates to user-defined attributes in the new contact are limited to the individual contact ID. There are no
     * limits to the number of contacts that can be linked by using <code>RelatedContactId</code>.
     * </p>
     * 
     * @return The <code>contactId</code> that is related to this contact. Linking voice, task, or chat by using
     *         <code>RelatedContactID</code> copies over contact attributes from the related contact to the new contact.
     *         All updates to user-defined attributes in the new contact are limited to the individual contact ID. There
     *         are no limits to the number of contacts that can be linked by using <code>RelatedContactId</code>.
     */

    public String getRelatedContactId() {
        return this.relatedContactId;
    }

    /**
     * <p>
     * The <code>contactId</code> that is related to this contact. Linking voice, task, or chat by using
     * <code>RelatedContactID</code> copies over contact attributes from the related contact to the new contact. All
     * updates to user-defined attributes in the new contact are limited to the individual contact ID. There are no
     * limits to the number of contacts that can be linked by using <code>RelatedContactId</code>.
     * </p>
     * 
     * @param relatedContactId
     *        The <code>contactId</code> that is related to this contact. Linking voice, task, or chat by using
     *        <code>RelatedContactID</code> copies over contact attributes from the related contact to the new contact.
     *        All updates to user-defined attributes in the new contact are limited to the individual contact ID. There
     *        are no limits to the number of contacts that can be linked by using <code>RelatedContactId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withRelatedContactId(String relatedContactId) {
        setRelatedContactId(relatedContactId);
        return this;
    }

    /**
     * <p>
     * The phone number of the customer, in E.164 format.
     * </p>
     * 
     * @param destinationPhoneNumber
     *        The phone number of the customer, in E.164 format.
     */

    public void setDestinationPhoneNumber(String destinationPhoneNumber) {
        this.destinationPhoneNumber = destinationPhoneNumber;
    }

    /**
     * <p>
     * The phone number of the customer, in E.164 format.
     * </p>
     * 
     * @return The phone number of the customer, in E.164 format.
     */

    public String getDestinationPhoneNumber() {
        return this.destinationPhoneNumber;
    }

    /**
     * <p>
     * The phone number of the customer, in E.164 format.
     * </p>
     * 
     * @param destinationPhoneNumber
     *        The phone number of the customer, in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withDestinationPhoneNumber(String destinationPhoneNumber) {
        setDestinationPhoneNumber(destinationPhoneNumber);
        return this;
    }

    /**
     * <p>
     * The identifier of the flow for the outbound call. To see the ContactFlowId in the Amazon Connect admin website,
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
     *        The identifier of the flow for the outbound call. To see the ContactFlowId in the Amazon Connect admin
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
     * The identifier of the flow for the outbound call. To see the ContactFlowId in the Amazon Connect admin website,
     * on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page, under the
     * name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part of the ARN,
     * shown here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     * 846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     * 
     * @return The identifier of the flow for the outbound call. To see the ContactFlowId in the Amazon Connect admin
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
     * The identifier of the flow for the outbound call. To see the ContactFlowId in the Amazon Connect admin website,
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
     *        The identifier of the flow for the outbound call. To see the ContactFlowId in the Amazon Connect admin
     *        website, on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow
     *        page, under the name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the
     *        last part of the ARN, shown here in bold: </p>
     *        <p>
     *        arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     *        846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withContactFlowId(String contactFlowId) {
        setContactFlowId(contactFlowId);
        return this;
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

    public StartOutboundVoiceContactRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>. The token is valid for 7 days after creation. If a contact is already started, the contact
     * ID is returned.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>. The token is valid for 7 days after creation. If a contact is already
     *        started, the contact ID is returned.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>. The token is valid for 7 days after creation. If a contact is already started, the contact
     * ID is returned.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *         provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see
     *         <a href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making
     *         retries safe with idempotent APIs</a>. The token is valid for 7 days after creation. If a contact is
     *         already started, the contact ID is returned.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>. The token is valid for 7 days after creation. If a contact is already started, the contact
     * ID is returned.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>. The token is valid for 7 days after creation. If a contact is already
     *        started, the contact ID is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The phone number associated with the Amazon Connect instance, in E.164 format. If you do not specify a source
     * phone number, you must specify a queue.
     * </p>
     * 
     * @param sourcePhoneNumber
     *        The phone number associated with the Amazon Connect instance, in E.164 format. If you do not specify a
     *        source phone number, you must specify a queue.
     */

    public void setSourcePhoneNumber(String sourcePhoneNumber) {
        this.sourcePhoneNumber = sourcePhoneNumber;
    }

    /**
     * <p>
     * The phone number associated with the Amazon Connect instance, in E.164 format. If you do not specify a source
     * phone number, you must specify a queue.
     * </p>
     * 
     * @return The phone number associated with the Amazon Connect instance, in E.164 format. If you do not specify a
     *         source phone number, you must specify a queue.
     */

    public String getSourcePhoneNumber() {
        return this.sourcePhoneNumber;
    }

    /**
     * <p>
     * The phone number associated with the Amazon Connect instance, in E.164 format. If you do not specify a source
     * phone number, you must specify a queue.
     * </p>
     * 
     * @param sourcePhoneNumber
     *        The phone number associated with the Amazon Connect instance, in E.164 format. If you do not specify a
     *        source phone number, you must specify a queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withSourcePhoneNumber(String sourcePhoneNumber) {
        setSourcePhoneNumber(sourcePhoneNumber);
        return this;
    }

    /**
     * <p>
     * The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number specified
     * in the queue. If you do not specify a queue, the queue defined in the flow is used. If you do not specify a
     * queue, you must specify a source phone number.
     * </p>
     * 
     * @param queueId
     *        The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number
     *        specified in the queue. If you do not specify a queue, the queue defined in the flow is used. If you do
     *        not specify a queue, you must specify a source phone number.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number specified
     * in the queue. If you do not specify a queue, the queue defined in the flow is used. If you do not specify a
     * queue, you must specify a source phone number.
     * </p>
     * 
     * @return The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number
     *         specified in the queue. If you do not specify a queue, the queue defined in the flow is used. If you do
     *         not specify a queue, you must specify a source phone number.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number specified
     * in the queue. If you do not specify a queue, the queue defined in the flow is used. If you do not specify a
     * queue, you must specify a source phone number.
     * </p>
     * 
     * @param queueId
     *        The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number
     *        specified in the queue. If you do not specify a queue, the queue defined in the flow is used. If you do
     *        not specify a queue, you must specify a source phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be
     * accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * 
     * @return A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes,
     *         and can be accessed in flows just like any other contact attributes.</p>
     *         <p>
     *         There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include
     *         only alphanumeric, dash, and underscore characters.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be
     * accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * 
     * @param attributes
     *        A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and
     *        can be accessed in flows just like any other contact attributes.</p>
     *        <p>
     *        There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include
     *        only alphanumeric, dash, and underscore characters.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be
     * accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * 
     * @param attributes
     *        A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and
     *        can be accessed in flows just like any other contact attributes.</p>
     *        <p>
     *        There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include
     *        only alphanumeric, dash, and underscore characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see StartOutboundVoiceContactRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest addAttributesEntry(String key, String value) {
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

    public StartOutboundVoiceContactRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Configuration of the answering machine detection for this outbound call.
     * </p>
     * 
     * @param answerMachineDetectionConfig
     *        Configuration of the answering machine detection for this outbound call.
     */

    public void setAnswerMachineDetectionConfig(AnswerMachineDetectionConfig answerMachineDetectionConfig) {
        this.answerMachineDetectionConfig = answerMachineDetectionConfig;
    }

    /**
     * <p>
     * Configuration of the answering machine detection for this outbound call.
     * </p>
     * 
     * @return Configuration of the answering machine detection for this outbound call.
     */

    public AnswerMachineDetectionConfig getAnswerMachineDetectionConfig() {
        return this.answerMachineDetectionConfig;
    }

    /**
     * <p>
     * Configuration of the answering machine detection for this outbound call.
     * </p>
     * 
     * @param answerMachineDetectionConfig
     *        Configuration of the answering machine detection for this outbound call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withAnswerMachineDetectionConfig(AnswerMachineDetectionConfig answerMachineDetectionConfig) {
        setAnswerMachineDetectionConfig(answerMachineDetectionConfig);
        return this;
    }

    /**
     * <p>
     * The campaign identifier of the outbound communication.
     * </p>
     * 
     * @param campaignId
     *        The campaign identifier of the outbound communication.
     */

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * <p>
     * The campaign identifier of the outbound communication.
     * </p>
     * 
     * @return The campaign identifier of the outbound communication.
     */

    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * <p>
     * The campaign identifier of the outbound communication.
     * </p>
     * 
     * @param campaignId
     *        The campaign identifier of the outbound communication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withCampaignId(String campaignId) {
        setCampaignId(campaignId);
        return this;
    }

    /**
     * <p>
     * Denotes the class of traffic. Calls with different traffic types are handled differently by Amazon Connect. The
     * default value is <code>GENERAL</code>. Use <code>CAMPAIGN</code> if <code>EnableAnswerMachineDetection</code> is
     * set to <code>true</code>. For all other cases, use <code>GENERAL</code>.
     * </p>
     * 
     * @param trafficType
     *        Denotes the class of traffic. Calls with different traffic types are handled differently by Amazon
     *        Connect. The default value is <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     *        <code>EnableAnswerMachineDetection</code> is set to <code>true</code>. For all other cases, use
     *        <code>GENERAL</code>.
     * @see TrafficType
     */

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    /**
     * <p>
     * Denotes the class of traffic. Calls with different traffic types are handled differently by Amazon Connect. The
     * default value is <code>GENERAL</code>. Use <code>CAMPAIGN</code> if <code>EnableAnswerMachineDetection</code> is
     * set to <code>true</code>. For all other cases, use <code>GENERAL</code>.
     * </p>
     * 
     * @return Denotes the class of traffic. Calls with different traffic types are handled differently by Amazon
     *         Connect. The default value is <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     *         <code>EnableAnswerMachineDetection</code> is set to <code>true</code>. For all other cases, use
     *         <code>GENERAL</code>.
     * @see TrafficType
     */

    public String getTrafficType() {
        return this.trafficType;
    }

    /**
     * <p>
     * Denotes the class of traffic. Calls with different traffic types are handled differently by Amazon Connect. The
     * default value is <code>GENERAL</code>. Use <code>CAMPAIGN</code> if <code>EnableAnswerMachineDetection</code> is
     * set to <code>true</code>. For all other cases, use <code>GENERAL</code>.
     * </p>
     * 
     * @param trafficType
     *        Denotes the class of traffic. Calls with different traffic types are handled differently by Amazon
     *        Connect. The default value is <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     *        <code>EnableAnswerMachineDetection</code> is set to <code>true</code>. For all other cases, use
     *        <code>GENERAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficType
     */

    public StartOutboundVoiceContactRequest withTrafficType(String trafficType) {
        setTrafficType(trafficType);
        return this;
    }

    /**
     * <p>
     * Denotes the class of traffic. Calls with different traffic types are handled differently by Amazon Connect. The
     * default value is <code>GENERAL</code>. Use <code>CAMPAIGN</code> if <code>EnableAnswerMachineDetection</code> is
     * set to <code>true</code>. For all other cases, use <code>GENERAL</code>.
     * </p>
     * 
     * @param trafficType
     *        Denotes the class of traffic. Calls with different traffic types are handled differently by Amazon
     *        Connect. The default value is <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     *        <code>EnableAnswerMachineDetection</code> is set to <code>true</code>. For all other cases, use
     *        <code>GENERAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficType
     */

    public StartOutboundVoiceContactRequest withTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getReferences() != null)
            sb.append("References: ").append(getReferences()).append(",");
        if (getRelatedContactId() != null)
            sb.append("RelatedContactId: ").append(getRelatedContactId()).append(",");
        if (getDestinationPhoneNumber() != null)
            sb.append("DestinationPhoneNumber: ").append(getDestinationPhoneNumber()).append(",");
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: ").append(getContactFlowId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getSourcePhoneNumber() != null)
            sb.append("SourcePhoneNumber: ").append(getSourcePhoneNumber()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getAnswerMachineDetectionConfig() != null)
            sb.append("AnswerMachineDetectionConfig: ").append(getAnswerMachineDetectionConfig()).append(",");
        if (getCampaignId() != null)
            sb.append("CampaignId: ").append(getCampaignId()).append(",");
        if (getTrafficType() != null)
            sb.append("TrafficType: ").append(getTrafficType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartOutboundVoiceContactRequest == false)
            return false;
        StartOutboundVoiceContactRequest other = (StartOutboundVoiceContactRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getReferences() == null ^ this.getReferences() == null)
            return false;
        if (other.getReferences() != null && other.getReferences().equals(this.getReferences()) == false)
            return false;
        if (other.getRelatedContactId() == null ^ this.getRelatedContactId() == null)
            return false;
        if (other.getRelatedContactId() != null && other.getRelatedContactId().equals(this.getRelatedContactId()) == false)
            return false;
        if (other.getDestinationPhoneNumber() == null ^ this.getDestinationPhoneNumber() == null)
            return false;
        if (other.getDestinationPhoneNumber() != null && other.getDestinationPhoneNumber().equals(this.getDestinationPhoneNumber()) == false)
            return false;
        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null && other.getContactFlowId().equals(this.getContactFlowId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSourcePhoneNumber() == null ^ this.getSourcePhoneNumber() == null)
            return false;
        if (other.getSourcePhoneNumber() != null && other.getSourcePhoneNumber().equals(this.getSourcePhoneNumber()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getAnswerMachineDetectionConfig() == null ^ this.getAnswerMachineDetectionConfig() == null)
            return false;
        if (other.getAnswerMachineDetectionConfig() != null && other.getAnswerMachineDetectionConfig().equals(this.getAnswerMachineDetectionConfig()) == false)
            return false;
        if (other.getCampaignId() == null ^ this.getCampaignId() == null)
            return false;
        if (other.getCampaignId() != null && other.getCampaignId().equals(this.getCampaignId()) == false)
            return false;
        if (other.getTrafficType() == null ^ this.getTrafficType() == null)
            return false;
        if (other.getTrafficType() != null && other.getTrafficType().equals(this.getTrafficType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getReferences() == null) ? 0 : getReferences().hashCode());
        hashCode = prime * hashCode + ((getRelatedContactId() == null) ? 0 : getRelatedContactId().hashCode());
        hashCode = prime * hashCode + ((getDestinationPhoneNumber() == null) ? 0 : getDestinationPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSourcePhoneNumber() == null) ? 0 : getSourcePhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getAnswerMachineDetectionConfig() == null) ? 0 : getAnswerMachineDetectionConfig().hashCode());
        hashCode = prime * hashCode + ((getCampaignId() == null) ? 0 : getCampaignId().hashCode());
        hashCode = prime * hashCode + ((getTrafficType() == null) ? 0 : getTrafficType().hashCode());
        return hashCode;
    }

    @Override
    public StartOutboundVoiceContactRequest clone() {
        return (StartOutboundVoiceContactRequest) super.clone();
    }

}
