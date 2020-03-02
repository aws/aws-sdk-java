/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The phone number of the customer, in E.164 format.
     * </p>
     */
    private String destinationPhoneNumber;
    /**
     * <p>
     * The identifier of the contact flow for the outbound call.
     * </p>
     */
    private String contactFlowId;
    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token is valid
     * for 7 days after creation. If a contact is already started, the contact ID is returned. If the contact is
     * disconnected, a new contact is started.
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
     * in the queue. If you do not specify a queue, the queue defined in the contact flow is used. If you do not specify
     * a queue, you must specify a source phone number.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be
     * accessed in contact flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     */
    private java.util.Map<String, String> attributes;

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
     * The identifier of the contact flow for the outbound call.
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the contact flow for the outbound call.
     */

    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier of the contact flow for the outbound call.
     * </p>
     * 
     * @return The identifier of the contact flow for the outbound call.
     */

    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * <p>
     * The identifier of the contact flow for the outbound call.
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the contact flow for the outbound call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withContactFlowId(String contactFlowId) {
        setContactFlowId(contactFlowId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token is valid
     * for 7 days after creation. If a contact is already started, the contact ID is returned. If the contact is
     * disconnected, a new contact is started.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token
     *        is valid for 7 days after creation. If a contact is already started, the contact ID is returned. If the
     *        contact is disconnected, a new contact is started.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token is valid
     * for 7 days after creation. If a contact is already started, the contact ID is returned. If the contact is
     * disconnected, a new contact is started.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token
     *         is valid for 7 days after creation. If a contact is already started, the contact ID is returned. If the
     *         contact is disconnected, a new contact is started.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token is valid
     * for 7 days after creation. If a contact is already started, the contact ID is returned. If the contact is
     * disconnected, a new contact is started.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token
     *        is valid for 7 days after creation. If a contact is already started, the contact ID is returned. If the
     *        contact is disconnected, a new contact is started.
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
     * in the queue. If you do not specify a queue, the queue defined in the contact flow is used. If you do not specify
     * a queue, you must specify a source phone number.
     * </p>
     * 
     * @param queueId
     *        The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number
     *        specified in the queue. If you do not specify a queue, the queue defined in the contact flow is used. If
     *        you do not specify a queue, you must specify a source phone number.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number specified
     * in the queue. If you do not specify a queue, the queue defined in the contact flow is used. If you do not specify
     * a queue, you must specify a source phone number.
     * </p>
     * 
     * @return The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number
     *         specified in the queue. If you do not specify a queue, the queue defined in the contact flow is used. If
     *         you do not specify a queue, you must specify a source phone number.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number specified
     * in the queue. If you do not specify a queue, the queue defined in the contact flow is used. If you do not specify
     * a queue, you must specify a source phone number.
     * </p>
     * 
     * @param queueId
     *        The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number
     *        specified in the queue. If you do not specify a queue, the queue defined in the contact flow is used. If
     *        you do not specify a queue, you must specify a source phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be
     * accessed in contact flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * 
     * @return A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes,
     *         and can be accessed in contact flows just like any other contact attributes.</p>
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
     * accessed in contact flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * 
     * @param attributes
     *        A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and
     *        can be accessed in contact flows just like any other contact attributes.</p>
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
     * accessed in contact flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * 
     * @param attributes
     *        A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and
     *        can be accessed in contact flows just like any other contact attributes.</p>
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
            sb.append("Attributes: ").append(getAttributes());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationPhoneNumber() == null) ? 0 : getDestinationPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSourcePhoneNumber() == null) ? 0 : getSourcePhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public StartOutboundVoiceContactRequest clone() {
        return (StartOutboundVoiceContactRequest) super.clone();
    }

}
