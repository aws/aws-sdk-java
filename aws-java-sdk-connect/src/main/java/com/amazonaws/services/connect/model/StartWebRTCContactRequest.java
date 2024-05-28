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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartWebRTCContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartWebRTCContactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be
     * accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, -, and _ characters.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * <p>
     * The token is valid for 7 days after creation. If a contact is already started, the contact ID is returned.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The identifier of the flow for the call. To see the ContactFlowId in the Amazon Connect admin website, on the
     * navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page, under the name of
     * the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part of the ARN, shown
     * here in bold:
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
     * Information about the video sharing capabilities of the participants (customer, agent).
     * </p>
     */
    private AllowedCapabilities allowedCapabilities;

    private ParticipantDetails participantDetails;
    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is related to the contact starting.
     * </p>
     */
    private String relatedContactId;
    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel (CCP). Tasks can have the following
     * reference types at the time of creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a supported reference type during task
     * creation.
     * </p>
     */
    private java.util.Map<String, Reference> references;
    /**
     * <p>
     * A description of the task that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     */
    private String description;

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be
     * accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, -, and _ characters.
     * </p>
     * 
     * @return A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes,
     *         and can be accessed in flows just like any other contact attributes.</p>
     *         <p>
     *         There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include
     *         only alphanumeric, -, and _ characters.
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
     * alphanumeric, -, and _ characters.
     * </p>
     * 
     * @param attributes
     *        A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and
     *        can be accessed in flows just like any other contact attributes.</p>
     *        <p>
     *        There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include
     *        only alphanumeric, -, and _ characters.
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
     * alphanumeric, -, and _ characters.
     * </p>
     * 
     * @param attributes
     *        A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and
     *        can be accessed in flows just like any other contact attributes.</p>
     *        <p>
     *        There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include
     *        only alphanumeric, -, and _ characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWebRTCContactRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see StartWebRTCContactRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartWebRTCContactRequest addAttributesEntry(String key, String value) {
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

    public StartWebRTCContactRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * <p>
     * The token is valid for 7 days after creation. If a contact is already started, the contact ID is returned.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.</p>
     *        <p>
     *        The token is valid for 7 days after creation. If a contact is already started, the contact ID is returned.
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
     * <p>
     * The token is valid for 7 days after creation. If a contact is already started, the contact ID is returned.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *         provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see
     *         <a href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making
     *         retries safe with idempotent APIs</a>.</p>
     *         <p>
     *         The token is valid for 7 days after creation. If a contact is already started, the contact ID is
     *         returned.
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
     * <p>
     * The token is valid for 7 days after creation. If a contact is already started, the contact ID is returned.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.</p>
     *        <p>
     *        The token is valid for 7 days after creation. If a contact is already started, the contact ID is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWebRTCContactRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the flow for the call. To see the ContactFlowId in the Amazon Connect admin website, on the
     * navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page, under the name of
     * the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part of the ARN, shown
     * here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     * 846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the flow for the call. To see the ContactFlowId in the Amazon Connect admin website, on
     *        the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page, under
     *        the name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part
     *        of the ARN, shown here in bold: </p>
     *        <p>
     *        arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     *        846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     */

    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow for the call. To see the ContactFlowId in the Amazon Connect admin website, on the
     * navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page, under the name of
     * the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part of the ARN, shown
     * here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     * 846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     * 
     * @return The identifier of the flow for the call. To see the ContactFlowId in the Amazon Connect admin website, on
     *         the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page, under
     *         the name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part
     *         of the ARN, shown here in bold: </p>
     *         <p>
     *         arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     *         846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     */

    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow for the call. To see the ContactFlowId in the Amazon Connect admin website, on the
     * navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page, under the name of
     * the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part of the ARN, shown
     * here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     * 846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the flow for the call. To see the ContactFlowId in the Amazon Connect admin website, on
     *        the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page, under
     *        the name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part
     *        of the ARN, shown here in bold: </p>
     *        <p>
     *        arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     *        846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWebRTCContactRequest withContactFlowId(String contactFlowId) {
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

    public StartWebRTCContactRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Information about the video sharing capabilities of the participants (customer, agent).
     * </p>
     * 
     * @param allowedCapabilities
     *        Information about the video sharing capabilities of the participants (customer, agent).
     */

    public void setAllowedCapabilities(AllowedCapabilities allowedCapabilities) {
        this.allowedCapabilities = allowedCapabilities;
    }

    /**
     * <p>
     * Information about the video sharing capabilities of the participants (customer, agent).
     * </p>
     * 
     * @return Information about the video sharing capabilities of the participants (customer, agent).
     */

    public AllowedCapabilities getAllowedCapabilities() {
        return this.allowedCapabilities;
    }

    /**
     * <p>
     * Information about the video sharing capabilities of the participants (customer, agent).
     * </p>
     * 
     * @param allowedCapabilities
     *        Information about the video sharing capabilities of the participants (customer, agent).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWebRTCContactRequest withAllowedCapabilities(AllowedCapabilities allowedCapabilities) {
        setAllowedCapabilities(allowedCapabilities);
        return this;
    }

    /**
     * @param participantDetails
     */

    public void setParticipantDetails(ParticipantDetails participantDetails) {
        this.participantDetails = participantDetails;
    }

    /**
     * @return
     */

    public ParticipantDetails getParticipantDetails() {
        return this.participantDetails;
    }

    /**
     * @param participantDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWebRTCContactRequest withParticipantDetails(ParticipantDetails participantDetails) {
        setParticipantDetails(participantDetails);
        return this;
    }

    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is related to the contact starting.
     * </p>
     * 
     * @param relatedContactId
     *        The unique identifier for an Amazon Connect contact. This identifier is related to the contact starting.
     */

    public void setRelatedContactId(String relatedContactId) {
        this.relatedContactId = relatedContactId;
    }

    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is related to the contact starting.
     * </p>
     * 
     * @return The unique identifier for an Amazon Connect contact. This identifier is related to the contact starting.
     */

    public String getRelatedContactId() {
        return this.relatedContactId;
    }

    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is related to the contact starting.
     * </p>
     * 
     * @param relatedContactId
     *        The unique identifier for an Amazon Connect contact. This identifier is related to the contact starting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWebRTCContactRequest withRelatedContactId(String relatedContactId) {
        setRelatedContactId(relatedContactId);
        return this;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel (CCP). Tasks can have the following
     * reference types at the time of creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a supported reference type during task
     * creation.
     * </p>
     * 
     * @return A formatted URL that is shown to an agent in the Contact Control Panel (CCP). Tasks can have the
     *         following reference types at the time of creation: <code>URL</code> | <code>NUMBER</code> |
     *         <code>STRING</code> | <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a supported
     *         reference type during task creation.
     */

    public java.util.Map<String, Reference> getReferences() {
        return references;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel (CCP). Tasks can have the following
     * reference types at the time of creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a supported reference type during task
     * creation.
     * </p>
     * 
     * @param references
     *        A formatted URL that is shown to an agent in the Contact Control Panel (CCP). Tasks can have the following
     *        reference types at the time of creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     *        <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a supported reference type during
     *        task creation.
     */

    public void setReferences(java.util.Map<String, Reference> references) {
        this.references = references;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel (CCP). Tasks can have the following
     * reference types at the time of creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a supported reference type during task
     * creation.
     * </p>
     * 
     * @param references
     *        A formatted URL that is shown to an agent in the Contact Control Panel (CCP). Tasks can have the following
     *        reference types at the time of creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     *        <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a supported reference type during
     *        task creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWebRTCContactRequest withReferences(java.util.Map<String, Reference> references) {
        setReferences(references);
        return this;
    }

    /**
     * Add a single References entry
     *
     * @see StartWebRTCContactRequest#withReferences
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartWebRTCContactRequest addReferencesEntry(String key, Reference value) {
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

    public StartWebRTCContactRequest clearReferencesEntries() {
        this.references = null;
        return this;
    }

    /**
     * <p>
     * A description of the task that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @param description
     *        A description of the task that is shown to an agent in the Contact Control Panel (CCP).
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the task that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @return A description of the task that is shown to an agent in the Contact Control Panel (CCP).
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the task that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @param description
     *        A description of the task that is shown to an agent in the Contact Control Panel (CCP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWebRTCContactRequest withDescription(String description) {
        setDescription(description);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: ").append(getContactFlowId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getAllowedCapabilities() != null)
            sb.append("AllowedCapabilities: ").append(getAllowedCapabilities()).append(",");
        if (getParticipantDetails() != null)
            sb.append("ParticipantDetails: ").append(getParticipantDetails()).append(",");
        if (getRelatedContactId() != null)
            sb.append("RelatedContactId: ").append(getRelatedContactId()).append(",");
        if (getReferences() != null)
            sb.append("References: ").append(getReferences()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartWebRTCContactRequest == false)
            return false;
        StartWebRTCContactRequest other = (StartWebRTCContactRequest) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null && other.getContactFlowId().equals(this.getContactFlowId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAllowedCapabilities() == null ^ this.getAllowedCapabilities() == null)
            return false;
        if (other.getAllowedCapabilities() != null && other.getAllowedCapabilities().equals(this.getAllowedCapabilities()) == false)
            return false;
        if (other.getParticipantDetails() == null ^ this.getParticipantDetails() == null)
            return false;
        if (other.getParticipantDetails() != null && other.getParticipantDetails().equals(this.getParticipantDetails()) == false)
            return false;
        if (other.getRelatedContactId() == null ^ this.getRelatedContactId() == null)
            return false;
        if (other.getRelatedContactId() != null && other.getRelatedContactId().equals(this.getRelatedContactId()) == false)
            return false;
        if (other.getReferences() == null ^ this.getReferences() == null)
            return false;
        if (other.getReferences() != null && other.getReferences().equals(this.getReferences()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAllowedCapabilities() == null) ? 0 : getAllowedCapabilities().hashCode());
        hashCode = prime * hashCode + ((getParticipantDetails() == null) ? 0 : getParticipantDetails().hashCode());
        hashCode = prime * hashCode + ((getRelatedContactId() == null) ? 0 : getRelatedContactId().hashCode());
        hashCode = prime * hashCode + ((getReferences() == null) ? 0 : getReferences().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public StartWebRTCContactRequest clone() {
        return (StartWebRTCContactRequest) super.clone();
    }

}
