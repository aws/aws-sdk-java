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

    private String voiceConnectorId;

    private Integer defaultSessionExpiryMinutes;

    private java.util.List<String> phoneNumberPoolCountries;

    private String fallBackPhoneNumber;

    private Boolean disabled;

    /**
     * @param voiceConnectorId
     */

    public void setVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
    }

    /**
     * @return
     */

    public String getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    /**
     * @param voiceConnectorId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutVoiceConnectorProxyRequest withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

    /**
     * @param defaultSessionExpiryMinutes
     */

    public void setDefaultSessionExpiryMinutes(Integer defaultSessionExpiryMinutes) {
        this.defaultSessionExpiryMinutes = defaultSessionExpiryMinutes;
    }

    /**
     * @return
     */

    public Integer getDefaultSessionExpiryMinutes() {
        return this.defaultSessionExpiryMinutes;
    }

    /**
     * @param defaultSessionExpiryMinutes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutVoiceConnectorProxyRequest withDefaultSessionExpiryMinutes(Integer defaultSessionExpiryMinutes) {
        setDefaultSessionExpiryMinutes(defaultSessionExpiryMinutes);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getPhoneNumberPoolCountries() {
        return phoneNumberPoolCountries;
    }

    /**
     * @param phoneNumberPoolCountries
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumberPoolCountries(java.util.Collection)} or
     * {@link #withPhoneNumberPoolCountries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param phoneNumberPoolCountries
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
     * @param phoneNumberPoolCountries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutVoiceConnectorProxyRequest withPhoneNumberPoolCountries(java.util.Collection<String> phoneNumberPoolCountries) {
        setPhoneNumberPoolCountries(phoneNumberPoolCountries);
        return this;
    }

    /**
     * @param fallBackPhoneNumber
     */

    public void setFallBackPhoneNumber(String fallBackPhoneNumber) {
        this.fallBackPhoneNumber = fallBackPhoneNumber;
    }

    /**
     * @return
     */

    public String getFallBackPhoneNumber() {
        return this.fallBackPhoneNumber;
    }

    /**
     * @param fallBackPhoneNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutVoiceConnectorProxyRequest withFallBackPhoneNumber(String fallBackPhoneNumber) {
        setFallBackPhoneNumber(fallBackPhoneNumber);
        return this;
    }

    /**
     * @param disabled
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * @return
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * @param disabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutVoiceConnectorProxyRequest withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * @return
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
