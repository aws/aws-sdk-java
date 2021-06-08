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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The method that Incident Manager uses to engage a contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ContactChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactChannel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     */
    private String contactChannelArn;
    /**
     * <p>
     * The ARN of the contact that contains the contact channel.
     * </p>
     */
    private String contactArn;
    /**
     * <p>
     * The name of the contact channel.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the contact channel. Incident Manager supports three contact methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * VOICE
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The details that Incident Manager uses when trying to engage the contact channel.
     * </p>
     */
    private ContactChannelAddress deliveryAddress;
    /**
     * <p>
     * A Boolean value describing if the contact channel has been activated or not. If the contact channel isn't
     * activated, Incident Manager can't engage the contact through it.
     * </p>
     */
    private String activationStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     * 
     * @param contactChannelArn
     *        The Amazon Resource Name (ARN) of the contact channel.
     */

    public void setContactChannelArn(String contactChannelArn) {
        this.contactChannelArn = contactChannelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact channel.
     */

    public String getContactChannelArn() {
        return this.contactChannelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     * 
     * @param contactChannelArn
     *        The Amazon Resource Name (ARN) of the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactChannel withContactChannelArn(String contactChannelArn) {
        setContactChannelArn(contactChannelArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the contact that contains the contact channel.
     * </p>
     * 
     * @param contactArn
     *        The ARN of the contact that contains the contact channel.
     */

    public void setContactArn(String contactArn) {
        this.contactArn = contactArn;
    }

    /**
     * <p>
     * The ARN of the contact that contains the contact channel.
     * </p>
     * 
     * @return The ARN of the contact that contains the contact channel.
     */

    public String getContactArn() {
        return this.contactArn;
    }

    /**
     * <p>
     * The ARN of the contact that contains the contact channel.
     * </p>
     * 
     * @param contactArn
     *        The ARN of the contact that contains the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactChannel withContactArn(String contactArn) {
        setContactArn(contactArn);
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

    public ContactChannel withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the contact channel. Incident Manager supports three contact methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * VOICE
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the contact channel. Incident Manager supports three contact methods:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SMS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VOICE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EMAIL
     *        </p>
     *        </li>
     * @see ChannelType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the contact channel. Incident Manager supports three contact methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * VOICE
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the contact channel. Incident Manager supports three contact methods:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         SMS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VOICE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL
     *         </p>
     *         </li>
     * @see ChannelType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the contact channel. Incident Manager supports three contact methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * VOICE
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the contact channel. Incident Manager supports three contact methods:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SMS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VOICE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EMAIL
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public ContactChannel withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the contact channel. Incident Manager supports three contact methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * VOICE
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the contact channel. Incident Manager supports three contact methods:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SMS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VOICE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EMAIL
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public ContactChannel withType(ChannelType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The details that Incident Manager uses when trying to engage the contact channel.
     * </p>
     * 
     * @param deliveryAddress
     *        The details that Incident Manager uses when trying to engage the contact channel.
     */

    public void setDeliveryAddress(ContactChannelAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    /**
     * <p>
     * The details that Incident Manager uses when trying to engage the contact channel.
     * </p>
     * 
     * @return The details that Incident Manager uses when trying to engage the contact channel.
     */

    public ContactChannelAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /**
     * <p>
     * The details that Incident Manager uses when trying to engage the contact channel.
     * </p>
     * 
     * @param deliveryAddress
     *        The details that Incident Manager uses when trying to engage the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactChannel withDeliveryAddress(ContactChannelAddress deliveryAddress) {
        setDeliveryAddress(deliveryAddress);
        return this;
    }

    /**
     * <p>
     * A Boolean value describing if the contact channel has been activated or not. If the contact channel isn't
     * activated, Incident Manager can't engage the contact through it.
     * </p>
     * 
     * @param activationStatus
     *        A Boolean value describing if the contact channel has been activated or not. If the contact channel isn't
     *        activated, Incident Manager can't engage the contact through it.
     * @see ActivationStatus
     */

    public void setActivationStatus(String activationStatus) {
        this.activationStatus = activationStatus;
    }

    /**
     * <p>
     * A Boolean value describing if the contact channel has been activated or not. If the contact channel isn't
     * activated, Incident Manager can't engage the contact through it.
     * </p>
     * 
     * @return A Boolean value describing if the contact channel has been activated or not. If the contact channel isn't
     *         activated, Incident Manager can't engage the contact through it.
     * @see ActivationStatus
     */

    public String getActivationStatus() {
        return this.activationStatus;
    }

    /**
     * <p>
     * A Boolean value describing if the contact channel has been activated or not. If the contact channel isn't
     * activated, Incident Manager can't engage the contact through it.
     * </p>
     * 
     * @param activationStatus
     *        A Boolean value describing if the contact channel has been activated or not. If the contact channel isn't
     *        activated, Incident Manager can't engage the contact through it.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivationStatus
     */

    public ContactChannel withActivationStatus(String activationStatus) {
        setActivationStatus(activationStatus);
        return this;
    }

    /**
     * <p>
     * A Boolean value describing if the contact channel has been activated or not. If the contact channel isn't
     * activated, Incident Manager can't engage the contact through it.
     * </p>
     * 
     * @param activationStatus
     *        A Boolean value describing if the contact channel has been activated or not. If the contact channel isn't
     *        activated, Incident Manager can't engage the contact through it.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivationStatus
     */

    public ContactChannel withActivationStatus(ActivationStatus activationStatus) {
        this.activationStatus = activationStatus.toString();
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
        if (getContactChannelArn() != null)
            sb.append("ContactChannelArn: ").append(getContactChannelArn()).append(",");
        if (getContactArn() != null)
            sb.append("ContactArn: ").append(getContactArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDeliveryAddress() != null)
            sb.append("DeliveryAddress: ").append(getDeliveryAddress()).append(",");
        if (getActivationStatus() != null)
            sb.append("ActivationStatus: ").append(getActivationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactChannel == false)
            return false;
        ContactChannel other = (ContactChannel) obj;
        if (other.getContactChannelArn() == null ^ this.getContactChannelArn() == null)
            return false;
        if (other.getContactChannelArn() != null && other.getContactChannelArn().equals(this.getContactChannelArn()) == false)
            return false;
        if (other.getContactArn() == null ^ this.getContactArn() == null)
            return false;
        if (other.getContactArn() != null && other.getContactArn().equals(this.getContactArn()) == false)
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
        if (other.getActivationStatus() == null ^ this.getActivationStatus() == null)
            return false;
        if (other.getActivationStatus() != null && other.getActivationStatus().equals(this.getActivationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactChannelArn() == null) ? 0 : getContactChannelArn().hashCode());
        hashCode = prime * hashCode + ((getContactArn() == null) ? 0 : getContactArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDeliveryAddress() == null) ? 0 : getDeliveryAddress().hashCode());
        hashCode = prime * hashCode + ((getActivationStatus() == null) ? 0 : getActivationStatus().hashCode());
        return hashCode;
    }

    @Override
    public ContactChannel clone() {
        try {
            return (ContactChannel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.ContactChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
