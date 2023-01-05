/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartTaskContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTaskContactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the previous chat, voice, or task contact.
     * </p>
     */
    private String previousContactId;
    /**
     * <p>
     * The identifier of the flow for initiating the tasks. To see the ContactFlowId in the Amazon Connect console user
     * interface, on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page,
     * under the name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part of
     * the ARN, shown here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     * 846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     */
    private String contactFlowId;
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
     * The name of a task that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     */
    private String name;
    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel (CCP).
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
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled time
     * cannot be in the past. It must be within up to 6 days in future.
     * </p>
     */
    private java.util.Date scheduledTime;
    /**
     * <p>
     * A unique identifier for the task template.
     * </p>
     */
    private String taskTemplateId;
    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     */
    private String quickConnectId;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskContactRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the previous chat, voice, or task contact.
     * </p>
     * 
     * @param previousContactId
     *        The identifier of the previous chat, voice, or task contact.
     */

    public void setPreviousContactId(String previousContactId) {
        this.previousContactId = previousContactId;
    }

    /**
     * <p>
     * The identifier of the previous chat, voice, or task contact.
     * </p>
     * 
     * @return The identifier of the previous chat, voice, or task contact.
     */

    public String getPreviousContactId() {
        return this.previousContactId;
    }

    /**
     * <p>
     * The identifier of the previous chat, voice, or task contact.
     * </p>
     * 
     * @param previousContactId
     *        The identifier of the previous chat, voice, or task contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskContactRequest withPreviousContactId(String previousContactId) {
        setPreviousContactId(previousContactId);
        return this;
    }

    /**
     * <p>
     * The identifier of the flow for initiating the tasks. To see the ContactFlowId in the Amazon Connect console user
     * interface, on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page,
     * under the name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part of
     * the ARN, shown here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     * 846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the flow for initiating the tasks. To see the ContactFlowId in the Amazon Connect
     *        console user interface, on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the
     *        flow. On the flow page, under the name of the flow, choose <b>Show additional flow information</b>. The
     *        ContactFlowId is the last part of the ARN, shown here in bold: </p>
     *        <p>
     *        arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     *        846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     */

    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow for initiating the tasks. To see the ContactFlowId in the Amazon Connect console user
     * interface, on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page,
     * under the name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part of
     * the ARN, shown here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     * 846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     * 
     * @return The identifier of the flow for initiating the tasks. To see the ContactFlowId in the Amazon Connect
     *         console user interface, on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the
     *         flow. On the flow page, under the name of the flow, choose <b>Show additional flow information</b>. The
     *         ContactFlowId is the last part of the ARN, shown here in bold: </p>
     *         <p>
     *         arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     *         846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     */

    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow for initiating the tasks. To see the ContactFlowId in the Amazon Connect console user
     * interface, on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page,
     * under the name of the flow, choose <b>Show additional flow information</b>. The ContactFlowId is the last part of
     * the ARN, shown here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     * 846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the flow for initiating the tasks. To see the ContactFlowId in the Amazon Connect
     *        console user interface, on the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the
     *        flow. On the flow page, under the name of the flow, choose <b>Show additional flow information</b>. The
     *        ContactFlowId is the last part of the ARN, shown here in bold: </p>
     *        <p>
     *        arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     *        846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskContactRequest withContactFlowId(String contactFlowId) {
        setContactFlowId(contactFlowId);
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

    public StartTaskContactRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see StartTaskContactRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskContactRequest addAttributesEntry(String key, String value) {
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

    public StartTaskContactRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The name of a task that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @param name
     *        The name of a task that is shown to an agent in the Contact Control Panel (CCP).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a task that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @return The name of a task that is shown to an agent in the Contact Control Panel (CCP).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a task that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @param name
     *        The name of a task that is shown to an agent in the Contact Control Panel (CCP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskContactRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @return A formatted URL that is shown to an agent in the Contact Control Panel (CCP).
     */

    public java.util.Map<String, Reference> getReferences() {
        return references;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @param references
     *        A formatted URL that is shown to an agent in the Contact Control Panel (CCP).
     */

    public void setReferences(java.util.Map<String, Reference> references) {
        this.references = references;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel (CCP).
     * </p>
     * 
     * @param references
     *        A formatted URL that is shown to an agent in the Contact Control Panel (CCP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskContactRequest withReferences(java.util.Map<String, Reference> references) {
        setReferences(references);
        return this;
    }

    /**
     * Add a single References entry
     *
     * @see StartTaskContactRequest#withReferences
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskContactRequest addReferencesEntry(String key, Reference value) {
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

    public StartTaskContactRequest clearReferencesEntries() {
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

    public StartTaskContactRequest withDescription(String description) {
        setDescription(description);
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

    public StartTaskContactRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled time
     * cannot be in the past. It must be within up to 6 days in future.
     * </p>
     * 
     * @param scheduledTime
     *        The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled
     *        time cannot be in the past. It must be within up to 6 days in future.
     */

    public void setScheduledTime(java.util.Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled time
     * cannot be in the past. It must be within up to 6 days in future.
     * </p>
     * 
     * @return The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled
     *         time cannot be in the past. It must be within up to 6 days in future.
     */

    public java.util.Date getScheduledTime() {
        return this.scheduledTime;
    }

    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled time
     * cannot be in the past. It must be within up to 6 days in future.
     * </p>
     * 
     * @param scheduledTime
     *        The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled
     *        time cannot be in the past. It must be within up to 6 days in future.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskContactRequest withScheduledTime(java.util.Date scheduledTime) {
        setScheduledTime(scheduledTime);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the task template.
     * </p>
     * 
     * @param taskTemplateId
     *        A unique identifier for the task template.
     */

    public void setTaskTemplateId(String taskTemplateId) {
        this.taskTemplateId = taskTemplateId;
    }

    /**
     * <p>
     * A unique identifier for the task template.
     * </p>
     * 
     * @return A unique identifier for the task template.
     */

    public String getTaskTemplateId() {
        return this.taskTemplateId;
    }

    /**
     * <p>
     * A unique identifier for the task template.
     * </p>
     * 
     * @param taskTemplateId
     *        A unique identifier for the task template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskContactRequest withTaskTemplateId(String taskTemplateId) {
        setTaskTemplateId(taskTemplateId);
        return this;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     * 
     * @param quickConnectId
     *        The identifier for the quick connect.
     */

    public void setQuickConnectId(String quickConnectId) {
        this.quickConnectId = quickConnectId;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     * 
     * @return The identifier for the quick connect.
     */

    public String getQuickConnectId() {
        return this.quickConnectId;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     * 
     * @param quickConnectId
     *        The identifier for the quick connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskContactRequest withQuickConnectId(String quickConnectId) {
        setQuickConnectId(quickConnectId);
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
        if (getPreviousContactId() != null)
            sb.append("PreviousContactId: ").append(getPreviousContactId()).append(",");
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: ").append(getContactFlowId()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReferences() != null)
            sb.append("References: ").append(getReferences()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getScheduledTime() != null)
            sb.append("ScheduledTime: ").append(getScheduledTime()).append(",");
        if (getTaskTemplateId() != null)
            sb.append("TaskTemplateId: ").append(getTaskTemplateId()).append(",");
        if (getQuickConnectId() != null)
            sb.append("QuickConnectId: ").append(getQuickConnectId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTaskContactRequest == false)
            return false;
        StartTaskContactRequest other = (StartTaskContactRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPreviousContactId() == null ^ this.getPreviousContactId() == null)
            return false;
        if (other.getPreviousContactId() != null && other.getPreviousContactId().equals(this.getPreviousContactId()) == false)
            return false;
        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null && other.getContactFlowId().equals(this.getContactFlowId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReferences() == null ^ this.getReferences() == null)
            return false;
        if (other.getReferences() != null && other.getReferences().equals(this.getReferences()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getScheduledTime() == null ^ this.getScheduledTime() == null)
            return false;
        if (other.getScheduledTime() != null && other.getScheduledTime().equals(this.getScheduledTime()) == false)
            return false;
        if (other.getTaskTemplateId() == null ^ this.getTaskTemplateId() == null)
            return false;
        if (other.getTaskTemplateId() != null && other.getTaskTemplateId().equals(this.getTaskTemplateId()) == false)
            return false;
        if (other.getQuickConnectId() == null ^ this.getQuickConnectId() == null)
            return false;
        if (other.getQuickConnectId() != null && other.getQuickConnectId().equals(this.getQuickConnectId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPreviousContactId() == null) ? 0 : getPreviousContactId().hashCode());
        hashCode = prime * hashCode + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReferences() == null) ? 0 : getReferences().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getScheduledTime() == null) ? 0 : getScheduledTime().hashCode());
        hashCode = prime * hashCode + ((getTaskTemplateId() == null) ? 0 : getTaskTemplateId().hashCode());
        hashCode = prime * hashCode + ((getQuickConnectId() == null) ? 0 : getQuickConnectId().hashCode());
        return hashCode;
    }

    @Override
    public StartTaskContactRequest clone() {
        return (StartTaskContactRequest) super.clone();
    }

}
