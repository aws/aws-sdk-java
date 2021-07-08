/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/CreateContactChannel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContactChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The name of the contact channel.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Incident Manager supports three types of contact channels:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VOICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code>
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The details that Incident Manager uses when trying to engage the contact channel. The format is dependent on the
     * type of the contact channel. The following are the expected formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SMS - '+' followed by the country code and phone number
     * </p>
     * </li>
     * <li>
     * <p>
     * VOICE - '+' followed by the country code and phone number
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL - any standard email format
     * </p>
     * </li>
     * </ul>
     */
    private ContactChannelAddress deliveryAddress;
    /**
     * <p>
     * If you want to activate the channel at a later time, you can choose to defer activation. Incident Manager can't
     * engage your contact channel until it has been activated.
     * </p>
     */
    private Boolean deferActivation;
    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
     * </p>
     * 
     * @param contactId
     *        The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
     * </p>
     * 
     * @param contactId
     *        The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactChannelRequest withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The name of the contact channel.
     * </p>
     * 
     * @param name
     *        The name of the contact channel.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the contact channel.
     * </p>
     * 
     * @return The name of the contact channel.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the contact channel.
     * </p>
     * 
     * @param name
     *        The name of the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactChannelRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Incident Manager supports three types of contact channels:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VOICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Incident Manager supports three types of contact channels:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SMS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VOICE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMAIL</code>
     *        </p>
     *        </li>
     * @see ChannelType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Incident Manager supports three types of contact channels:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VOICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Incident Manager supports three types of contact channels:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SMS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VOICE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EMAIL</code>
     *         </p>
     *         </li>
     * @see ChannelType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Incident Manager supports three types of contact channels:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VOICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Incident Manager supports three types of contact channels:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SMS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VOICE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMAIL</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public CreateContactChannelRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Incident Manager supports three types of contact channels:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VOICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Incident Manager supports three types of contact channels:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SMS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VOICE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMAIL</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public CreateContactChannelRequest withType(ChannelType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The details that Incident Manager uses when trying to engage the contact channel. The format is dependent on the
     * type of the contact channel. The following are the expected formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SMS - '+' followed by the country code and phone number
     * </p>
     * </li>
     * <li>
     * <p>
     * VOICE - '+' followed by the country code and phone number
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL - any standard email format
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliveryAddress
     *        The details that Incident Manager uses when trying to engage the contact channel. The format is dependent
     *        on the type of the contact channel. The following are the expected formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SMS - '+' followed by the country code and phone number
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VOICE - '+' followed by the country code and phone number
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EMAIL - any standard email format
     *        </p>
     *        </li>
     */

    public void setDeliveryAddress(ContactChannelAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    /**
     * <p>
     * The details that Incident Manager uses when trying to engage the contact channel. The format is dependent on the
     * type of the contact channel. The following are the expected formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SMS - '+' followed by the country code and phone number
     * </p>
     * </li>
     * <li>
     * <p>
     * VOICE - '+' followed by the country code and phone number
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL - any standard email format
     * </p>
     * </li>
     * </ul>
     * 
     * @return The details that Incident Manager uses when trying to engage the contact channel. The format is dependent
     *         on the type of the contact channel. The following are the expected formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         SMS - '+' followed by the country code and phone number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VOICE - '+' followed by the country code and phone number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL - any standard email format
     *         </p>
     *         </li>
     */

    public ContactChannelAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /**
     * <p>
     * The details that Incident Manager uses when trying to engage the contact channel. The format is dependent on the
     * type of the contact channel. The following are the expected formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SMS - '+' followed by the country code and phone number
     * </p>
     * </li>
     * <li>
     * <p>
     * VOICE - '+' followed by the country code and phone number
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL - any standard email format
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliveryAddress
     *        The details that Incident Manager uses when trying to engage the contact channel. The format is dependent
     *        on the type of the contact channel. The following are the expected formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SMS - '+' followed by the country code and phone number
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VOICE - '+' followed by the country code and phone number
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EMAIL - any standard email format
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactChannelRequest withDeliveryAddress(ContactChannelAddress deliveryAddress) {
        setDeliveryAddress(deliveryAddress);
        return this;
    }

    /**
     * <p>
     * If you want to activate the channel at a later time, you can choose to defer activation. Incident Manager can't
     * engage your contact channel until it has been activated.
     * </p>
     * 
     * @param deferActivation
     *        If you want to activate the channel at a later time, you can choose to defer activation. Incident Manager
     *        can't engage your contact channel until it has been activated.
     */

    public void setDeferActivation(Boolean deferActivation) {
        this.deferActivation = deferActivation;
    }

    /**
     * <p>
     * If you want to activate the channel at a later time, you can choose to defer activation. Incident Manager can't
     * engage your contact channel until it has been activated.
     * </p>
     * 
     * @return If you want to activate the channel at a later time, you can choose to defer activation. Incident Manager
     *         can't engage your contact channel until it has been activated.
     */

    public Boolean getDeferActivation() {
        return this.deferActivation;
    }

    /**
     * <p>
     * If you want to activate the channel at a later time, you can choose to defer activation. Incident Manager can't
     * engage your contact channel until it has been activated.
     * </p>
     * 
     * @param deferActivation
     *        If you want to activate the channel at a later time, you can choose to defer activation. Incident Manager
     *        can't engage your contact channel until it has been activated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactChannelRequest withDeferActivation(Boolean deferActivation) {
        setDeferActivation(deferActivation);
        return this;
    }

    /**
     * <p>
     * If you want to activate the channel at a later time, you can choose to defer activation. Incident Manager can't
     * engage your contact channel until it has been activated.
     * </p>
     * 
     * @return If you want to activate the channel at a later time, you can choose to defer activation. Incident Manager
     *         can't engage your contact channel until it has been activated.
     */

    public Boolean isDeferActivation() {
        return this.deferActivation;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param idempotencyToken
     *        A token ensuring that the action is called only once with the specified details.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @return A token ensuring that the action is called only once with the specified details.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param idempotencyToken
     *        A token ensuring that the action is called only once with the specified details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactChannelRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDeliveryAddress() != null)
            sb.append("DeliveryAddress: ").append(getDeliveryAddress()).append(",");
        if (getDeferActivation() != null)
            sb.append("DeferActivation: ").append(getDeferActivation()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContactChannelRequest == false)
            return false;
        CreateContactChannelRequest other = (CreateContactChannelRequest) obj;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDeliveryAddress() == null ^ this.getDeliveryAddress() == null)
            return false;
        if (other.getDeliveryAddress() != null && other.getDeliveryAddress().equals(this.getDeliveryAddress()) == false)
            return false;
        if (other.getDeferActivation() == null ^ this.getDeferActivation() == null)
            return false;
        if (other.getDeferActivation() != null && other.getDeferActivation().equals(this.getDeferActivation()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDeliveryAddress() == null) ? 0 : getDeliveryAddress().hashCode());
        hashCode = prime * hashCode + ((getDeferActivation() == null) ? 0 : getDeferActivation().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateContactChannelRequest clone() {
        return (CreateContactChannelRequest) super.clone();
    }

}
