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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateProxySession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProxySessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String voiceConnectorId;

    private java.util.List<String> participantPhoneNumbers;

    private String name;

    private Integer expiryMinutes;

    private java.util.List<String> capabilities;

    private String numberSelectionBehavior;

    private String geoMatchLevel;

    private GeoMatchParams geoMatchParams;

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

    public CreateProxySessionRequest withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getParticipantPhoneNumbers() {
        return participantPhoneNumbers;
    }

    /**
     * @param participantPhoneNumbers
     */

    public void setParticipantPhoneNumbers(java.util.Collection<String> participantPhoneNumbers) {
        if (participantPhoneNumbers == null) {
            this.participantPhoneNumbers = null;
            return;
        }

        this.participantPhoneNumbers = new java.util.ArrayList<String>(participantPhoneNumbers);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParticipantPhoneNumbers(java.util.Collection)} or
     * {@link #withParticipantPhoneNumbers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param participantPhoneNumbers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProxySessionRequest withParticipantPhoneNumbers(String... participantPhoneNumbers) {
        if (this.participantPhoneNumbers == null) {
            setParticipantPhoneNumbers(new java.util.ArrayList<String>(participantPhoneNumbers.length));
        }
        for (String ele : participantPhoneNumbers) {
            this.participantPhoneNumbers.add(ele);
        }
        return this;
    }

    /**
     * @param participantPhoneNumbers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProxySessionRequest withParticipantPhoneNumbers(java.util.Collection<String> participantPhoneNumbers) {
        setParticipantPhoneNumbers(participantPhoneNumbers);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProxySessionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param expiryMinutes
     */

    public void setExpiryMinutes(Integer expiryMinutes) {
        this.expiryMinutes = expiryMinutes;
    }

    /**
     * @return
     */

    public Integer getExpiryMinutes() {
        return this.expiryMinutes;
    }

    /**
     * @param expiryMinutes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProxySessionRequest withExpiryMinutes(Integer expiryMinutes) {
        setExpiryMinutes(expiryMinutes);
        return this;
    }

    /**
     * @return
     * @see Capability
     */

    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * @param capabilities
     * @see Capability
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateProxySessionRequest withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * @param capabilities
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateProxySessionRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * @param capabilities
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateProxySessionRequest withCapabilities(Capability... capabilities) {
        java.util.ArrayList<String> capabilitiesCopy = new java.util.ArrayList<String>(capabilities.length);
        for (Capability value : capabilities) {
            capabilitiesCopy.add(value.toString());
        }
        if (getCapabilities() == null) {
            setCapabilities(capabilitiesCopy);
        } else {
            getCapabilities().addAll(capabilitiesCopy);
        }
        return this;
    }

    /**
     * @param numberSelectionBehavior
     * @see NumberSelectionBehavior
     */

    public void setNumberSelectionBehavior(String numberSelectionBehavior) {
        this.numberSelectionBehavior = numberSelectionBehavior;
    }

    /**
     * @return
     * @see NumberSelectionBehavior
     */

    public String getNumberSelectionBehavior() {
        return this.numberSelectionBehavior;
    }

    /**
     * @param numberSelectionBehavior
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberSelectionBehavior
     */

    public CreateProxySessionRequest withNumberSelectionBehavior(String numberSelectionBehavior) {
        setNumberSelectionBehavior(numberSelectionBehavior);
        return this;
    }

    /**
     * @param numberSelectionBehavior
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberSelectionBehavior
     */

    public CreateProxySessionRequest withNumberSelectionBehavior(NumberSelectionBehavior numberSelectionBehavior) {
        this.numberSelectionBehavior = numberSelectionBehavior.toString();
        return this;
    }

    /**
     * @param geoMatchLevel
     * @see GeoMatchLevel
     */

    public void setGeoMatchLevel(String geoMatchLevel) {
        this.geoMatchLevel = geoMatchLevel;
    }

    /**
     * @return
     * @see GeoMatchLevel
     */

    public String getGeoMatchLevel() {
        return this.geoMatchLevel;
    }

    /**
     * @param geoMatchLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeoMatchLevel
     */

    public CreateProxySessionRequest withGeoMatchLevel(String geoMatchLevel) {
        setGeoMatchLevel(geoMatchLevel);
        return this;
    }

    /**
     * @param geoMatchLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeoMatchLevel
     */

    public CreateProxySessionRequest withGeoMatchLevel(GeoMatchLevel geoMatchLevel) {
        this.geoMatchLevel = geoMatchLevel.toString();
        return this;
    }

    /**
     * @param geoMatchParams
     */

    public void setGeoMatchParams(GeoMatchParams geoMatchParams) {
        this.geoMatchParams = geoMatchParams;
    }

    /**
     * @return
     */

    public GeoMatchParams getGeoMatchParams() {
        return this.geoMatchParams;
    }

    /**
     * @param geoMatchParams
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProxySessionRequest withGeoMatchParams(GeoMatchParams geoMatchParams) {
        setGeoMatchParams(geoMatchParams);
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
        if (getVoiceConnectorId() != null)
            sb.append("VoiceConnectorId: ").append(getVoiceConnectorId()).append(",");
        if (getParticipantPhoneNumbers() != null)
            sb.append("ParticipantPhoneNumbers: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getExpiryMinutes() != null)
            sb.append("ExpiryMinutes: ").append(getExpiryMinutes()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getNumberSelectionBehavior() != null)
            sb.append("NumberSelectionBehavior: ").append(getNumberSelectionBehavior()).append(",");
        if (getGeoMatchLevel() != null)
            sb.append("GeoMatchLevel: ").append(getGeoMatchLevel()).append(",");
        if (getGeoMatchParams() != null)
            sb.append("GeoMatchParams: ").append(getGeoMatchParams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProxySessionRequest == false)
            return false;
        CreateProxySessionRequest other = (CreateProxySessionRequest) obj;
        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getParticipantPhoneNumbers() == null ^ this.getParticipantPhoneNumbers() == null)
            return false;
        if (other.getParticipantPhoneNumbers() != null && other.getParticipantPhoneNumbers().equals(this.getParticipantPhoneNumbers()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getExpiryMinutes() == null ^ this.getExpiryMinutes() == null)
            return false;
        if (other.getExpiryMinutes() != null && other.getExpiryMinutes().equals(this.getExpiryMinutes()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getNumberSelectionBehavior() == null ^ this.getNumberSelectionBehavior() == null)
            return false;
        if (other.getNumberSelectionBehavior() != null && other.getNumberSelectionBehavior().equals(this.getNumberSelectionBehavior()) == false)
            return false;
        if (other.getGeoMatchLevel() == null ^ this.getGeoMatchLevel() == null)
            return false;
        if (other.getGeoMatchLevel() != null && other.getGeoMatchLevel().equals(this.getGeoMatchLevel()) == false)
            return false;
        if (other.getGeoMatchParams() == null ^ this.getGeoMatchParams() == null)
            return false;
        if (other.getGeoMatchParams() != null && other.getGeoMatchParams().equals(this.getGeoMatchParams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getParticipantPhoneNumbers() == null) ? 0 : getParticipantPhoneNumbers().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getExpiryMinutes() == null) ? 0 : getExpiryMinutes().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getNumberSelectionBehavior() == null) ? 0 : getNumberSelectionBehavior().hashCode());
        hashCode = prime * hashCode + ((getGeoMatchLevel() == null) ? 0 : getGeoMatchLevel().hashCode());
        hashCode = prime * hashCode + ((getGeoMatchParams() == null) ? 0 : getGeoMatchParams().hashCode());
        return hashCode;
    }

    @Override
    public CreateProxySessionRequest clone() {
        return (CreateProxySessionRequest) super.clone();
    }

}
