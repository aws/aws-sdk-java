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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorProxy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutVoiceConnectorProxyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     */
    private String voiceConnectorId;
    /**
     * <p>
     * The default number of minutes allowed for proxy sessions.
     * </p>
     */
    private Integer defaultSessionExpiryMinutes;
    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     */
    private java.util.List<String> phoneNumberPoolCountries;
    /**
     * <p>
     * The phone number to route calls to after a proxy session expires.
     * </p>
     */
    private String fallBackPhoneNumber;
    /**
     * <p>
     * When true, stops proxy sessions from being created on the specified Amazon Chime Voice Connector.
     * </p>
     */
    private Boolean disabled;

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Amazon Chime voice connector ID.
     */

    public void setVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     * 
     * @return The Amazon Chime voice connector ID.
     */

    public String getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Amazon Chime voice connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutVoiceConnectorProxyRequest withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

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

    public PutVoiceConnectorProxyRequest withDefaultSessionExpiryMinutes(Integer defaultSessionExpiryMinutes) {
        setDefaultSessionExpiryMinutes(defaultSessionExpiryMinutes);
        return this;
    }

    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     * 
     * @return The countries for proxy phone numbers to be selected from.
     */

    public java.util.List<String> getPhoneNumberPoolCountries() {
        return phoneNumberPoolCountries;
    }

    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     * 
     * @param phoneNumberPoolCountries
     *        The countries for proxy phone numbers to be selected from.
     */

    public void setPhoneNumberPoolCountries(java.util.Collection<String> phoneNumberPoolCountries) {
        if (phoneNumberPoolCountries == null) {
            this.phoneNumberPoolCountries = null;
            return;
        }

        this.phoneNumberPoolCountries = new java.util.ArrayList<String>(phoneNumberPoolCountries);
    }

    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumberPoolCountries(java.util.Collection)} or
     * {@link #withPhoneNumberPoolCountries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param phoneNumberPoolCountries
     *        The countries for proxy phone numbers to be selected from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutVoiceConnectorProxyRequest withPhoneNumberPoolCountries(String... phoneNumberPoolCountries) {
        if (this.phoneNumberPoolCountries == null) {
            setPhoneNumberPoolCountries(new java.util.ArrayList<String>(phoneNumberPoolCountries.length));
        }
        for (String ele : phoneNumberPoolCountries) {
            this.phoneNumberPoolCountries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     * 
     * @param phoneNumberPoolCountries
     *        The countries for proxy phone numbers to be selected from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutVoiceConnectorProxyRequest withPhoneNumberPoolCountries(java.util.Collection<String> phoneNumberPoolCountries) {
        setPhoneNumberPoolCountries(phoneNumberPoolCountries);
        return this;
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

    public PutVoiceConnectorProxyRequest withFallBackPhoneNumber(String fallBackPhoneNumber) {
        setFallBackPhoneNumber(fallBackPhoneNumber);
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

    public PutVoiceConnectorProxyRequest withDisabled(Boolean disabled) {
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
        if (getVoiceConnectorId() != null)
            sb.append("VoiceConnectorId: ").append(getVoiceConnectorId()).append(",");
        if (getDefaultSessionExpiryMinutes() != null)
            sb.append("DefaultSessionExpiryMinutes: ").append(getDefaultSessionExpiryMinutes()).append(",");
        if (getPhoneNumberPoolCountries() != null)
            sb.append("PhoneNumberPoolCountries: ").append(getPhoneNumberPoolCountries()).append(",");
        if (getFallBackPhoneNumber() != null)
            sb.append("FallBackPhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getDisabled() != null)
            sb.append("Disabled: ").append(getDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutVoiceConnectorProxyRequest == false)
            return false;
        PutVoiceConnectorProxyRequest other = (PutVoiceConnectorProxyRequest) obj;
        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getDefaultSessionExpiryMinutes() == null ^ this.getDefaultSessionExpiryMinutes() == null)
            return false;
        if (other.getDefaultSessionExpiryMinutes() != null && other.getDefaultSessionExpiryMinutes().equals(this.getDefaultSessionExpiryMinutes()) == false)
            return false;
        if (other.getPhoneNumberPoolCountries() == null ^ this.getPhoneNumberPoolCountries() == null)
            return false;
        if (other.getPhoneNumberPoolCountries() != null && other.getPhoneNumberPoolCountries().equals(this.getPhoneNumberPoolCountries()) == false)
            return false;
        if (other.getFallBackPhoneNumber() == null ^ this.getFallBackPhoneNumber() == null)
            return false;
        if (other.getFallBackPhoneNumber() != null && other.getFallBackPhoneNumber().equals(this.getFallBackPhoneNumber()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getDefaultSessionExpiryMinutes() == null) ? 0 : getDefaultSessionExpiryMinutes().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberPoolCountries() == null) ? 0 : getPhoneNumberPoolCountries().hashCode());
        hashCode = prime * hashCode + ((getFallBackPhoneNumber() == null) ? 0 : getFallBackPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        return hashCode;
    }

    @Override
    public PutVoiceConnectorProxyRequest clone() {
        return (PutVoiceConnectorProxyRequest) super.clone();
    }

}
