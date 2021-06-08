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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The proxy configuration for an Amazon Chime Voice Connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/Proxy" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Proxy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default number of minutes allowed for proxy sessions.
     * </p>
     */
    private Integer defaultSessionExpiryMinutes;
    /**
     * <p>
     * When true, stops proxy sessions from being created on the specified Amazon Chime Voice Connector.
     * </p>
     */
    private Boolean disabled;
    /**
     * <p>
     * The phone number to route calls to after a proxy session expires.
     * </p>
     */
    private String fallBackPhoneNumber;
    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     */
    private java.util.List<String> phoneNumberCountries;

    /**
     * <p>
     * The default number of minutes allowed for proxy sessions.
     * </p>
     * 
     * @param defaultSessionExpiryMinutes
     *        The default number of minutes allowed for proxy sessions.
     */

    public void setDefaultSessionExpiryMinutes(Integer defaultSessionExpiryMinutes) {
        this.defaultSessionExpiryMinutes = defaultSessionExpiryMinutes;
    }

    /**
     * <p>
     * The default number of minutes allowed for proxy sessions.
     * </p>
     * 
     * @return The default number of minutes allowed for proxy sessions.
     */

    public Integer getDefaultSessionExpiryMinutes() {
        return this.defaultSessionExpiryMinutes;
    }

    /**
     * <p>
     * The default number of minutes allowed for proxy sessions.
     * </p>
     * 
     * @param defaultSessionExpiryMinutes
     *        The default number of minutes allowed for proxy sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proxy withDefaultSessionExpiryMinutes(Integer defaultSessionExpiryMinutes) {
        setDefaultSessionExpiryMinutes(defaultSessionExpiryMinutes);
        return this;
    }

    /**
     * <p>
     * When true, stops proxy sessions from being created on the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param disabled
     *        When true, stops proxy sessions from being created on the specified Amazon Chime Voice Connector.
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * When true, stops proxy sessions from being created on the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @return When true, stops proxy sessions from being created on the specified Amazon Chime Voice Connector.
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * When true, stops proxy sessions from being created on the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param disabled
     *        When true, stops proxy sessions from being created on the specified Amazon Chime Voice Connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proxy withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * <p>
     * When true, stops proxy sessions from being created on the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @return When true, stops proxy sessions from being created on the specified Amazon Chime Voice Connector.
     */

    public Boolean isDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * The phone number to route calls to after a proxy session expires.
     * </p>
     * 
     * @param fallBackPhoneNumber
     *        The phone number to route calls to after a proxy session expires.
     */

    public void setFallBackPhoneNumber(String fallBackPhoneNumber) {
        this.fallBackPhoneNumber = fallBackPhoneNumber;
    }

    /**
     * <p>
     * The phone number to route calls to after a proxy session expires.
     * </p>
     * 
     * @return The phone number to route calls to after a proxy session expires.
     */

    public String getFallBackPhoneNumber() {
        return this.fallBackPhoneNumber;
    }

    /**
     * <p>
     * The phone number to route calls to after a proxy session expires.
     * </p>
     * 
     * @param fallBackPhoneNumber
     *        The phone number to route calls to after a proxy session expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proxy withFallBackPhoneNumber(String fallBackPhoneNumber) {
        setFallBackPhoneNumber(fallBackPhoneNumber);
        return this;
    }

    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     * 
     * @return The countries for proxy phone numbers to be selected from.
     */

    public java.util.List<String> getPhoneNumberCountries() {
        return phoneNumberCountries;
    }

    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     * 
     * @param phoneNumberCountries
     *        The countries for proxy phone numbers to be selected from.
     */

    public void setPhoneNumberCountries(java.util.Collection<String> phoneNumberCountries) {
        if (phoneNumberCountries == null) {
            this.phoneNumberCountries = null;
            return;
        }

        this.phoneNumberCountries = new java.util.ArrayList<String>(phoneNumberCountries);
    }

    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumberCountries(java.util.Collection)} or {@link #withPhoneNumberCountries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param phoneNumberCountries
     *        The countries for proxy phone numbers to be selected from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proxy withPhoneNumberCountries(String... phoneNumberCountries) {
        if (this.phoneNumberCountries == null) {
            setPhoneNumberCountries(new java.util.ArrayList<String>(phoneNumberCountries.length));
        }
        for (String ele : phoneNumberCountries) {
            this.phoneNumberCountries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     * 
     * @param phoneNumberCountries
     *        The countries for proxy phone numbers to be selected from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proxy withPhoneNumberCountries(java.util.Collection<String> phoneNumberCountries) {
        setPhoneNumberCountries(phoneNumberCountries);
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
        if (getDefaultSessionExpiryMinutes() != null)
            sb.append("DefaultSessionExpiryMinutes: ").append(getDefaultSessionExpiryMinutes()).append(",");
        if (getDisabled() != null)
            sb.append("Disabled: ").append(getDisabled()).append(",");
        if (getFallBackPhoneNumber() != null)
            sb.append("FallBackPhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getPhoneNumberCountries() != null)
            sb.append("PhoneNumberCountries: ").append(getPhoneNumberCountries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Proxy == false)
            return false;
        Proxy other = (Proxy) obj;
        if (other.getDefaultSessionExpiryMinutes() == null ^ this.getDefaultSessionExpiryMinutes() == null)
            return false;
        if (other.getDefaultSessionExpiryMinutes() != null && other.getDefaultSessionExpiryMinutes().equals(this.getDefaultSessionExpiryMinutes()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        if (other.getFallBackPhoneNumber() == null ^ this.getFallBackPhoneNumber() == null)
            return false;
        if (other.getFallBackPhoneNumber() != null && other.getFallBackPhoneNumber().equals(this.getFallBackPhoneNumber()) == false)
            return false;
        if (other.getPhoneNumberCountries() == null ^ this.getPhoneNumberCountries() == null)
            return false;
        if (other.getPhoneNumberCountries() != null && other.getPhoneNumberCountries().equals(this.getPhoneNumberCountries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultSessionExpiryMinutes() == null) ? 0 : getDefaultSessionExpiryMinutes().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        hashCode = prime * hashCode + ((getFallBackPhoneNumber() == null) ? 0 : getFallBackPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberCountries() == null) ? 0 : getPhoneNumberCountries().hashCode());
        return hashCode;
    }

    @Override
    public Proxy clone() {
        try {
            return (Proxy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.ProxyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
