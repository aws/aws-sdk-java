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
 * The details that Incident Manager uses when trying to engage the contact channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ContactChannelAddress" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactChannelAddress implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The format is dependent on the type of the contact channel. The following are the expected formats:
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
    private String simpleAddress;

    /**
     * <p>
     * The format is dependent on the type of the contact channel. The following are the expected formats:
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
     * @param simpleAddress
     *        The format is dependent on the type of the contact channel. The following are the expected formats:</p>
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

    public void setSimpleAddress(String simpleAddress) {
        this.simpleAddress = simpleAddress;
    }

    /**
     * <p>
     * The format is dependent on the type of the contact channel. The following are the expected formats:
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
     * @return The format is dependent on the type of the contact channel. The following are the expected formats:</p>
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

    public String getSimpleAddress() {
        return this.simpleAddress;
    }

    /**
     * <p>
     * The format is dependent on the type of the contact channel. The following are the expected formats:
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
     * @param simpleAddress
     *        The format is dependent on the type of the contact channel. The following are the expected formats:</p>
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

    public ContactChannelAddress withSimpleAddress(String simpleAddress) {
        setSimpleAddress(simpleAddress);
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
        if (getSimpleAddress() != null)
            sb.append("SimpleAddress: ").append(getSimpleAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactChannelAddress == false)
            return false;
        ContactChannelAddress other = (ContactChannelAddress) obj;
        if (other.getSimpleAddress() == null ^ this.getSimpleAddress() == null)
            return false;
        if (other.getSimpleAddress() != null && other.getSimpleAddress().equals(this.getSimpleAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimpleAddress() == null) ? 0 : getSimpleAddress().hashCode());
        return hashCode;
    }

    @Override
    public ContactChannelAddress clone() {
        try {
            return (ContactChannelAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.ContactChannelAddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
