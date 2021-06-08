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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateProxySession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProxySessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     */
    private String voiceConnectorId;
    /**
     * <p>
     * The participant phone numbers.
     * </p>
     */
    private java.util.List<String> participantPhoneNumbers;
    /**
     * <p>
     * The name of the proxy session.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The number of minutes allowed for the proxy session.
     * </p>
     */
    private Integer expiryMinutes;
    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     */
    private java.util.List<String> capabilities;
    /**
     * <p>
     * The preference for proxy phone number reuse, or stickiness, between the same participants across sessions.
     * </p>
     */
    private String numberSelectionBehavior;
    /**
     * <p>
     * The preference for matching the country or area code of the proxy phone number with that of the first
     * participant.
     * </p>
     */
    private String geoMatchLevel;
    /**
     * <p>
     * The country and area code for the proxy phone number.
     * </p>
     */
    private GeoMatchParams geoMatchParams;

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

    public CreateProxySessionRequest withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

    /**
     * <p>
     * The participant phone numbers.
     * </p>
     * 
     * @return The participant phone numbers.
     */

    public java.util.List<String> getParticipantPhoneNumbers() {
        return participantPhoneNumbers;
    }

    /**
     * <p>
     * The participant phone numbers.
     * </p>
     * 
     * @param participantPhoneNumbers
     *        The participant phone numbers.
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
     * The participant phone numbers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParticipantPhoneNumbers(java.util.Collection)} or
     * {@link #withParticipantPhoneNumbers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param participantPhoneNumbers
     *        The participant phone numbers.
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
     * <p>
     * The participant phone numbers.
     * </p>
     * 
     * @param participantPhoneNumbers
     *        The participant phone numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProxySessionRequest withParticipantPhoneNumbers(java.util.Collection<String> participantPhoneNumbers) {
        setParticipantPhoneNumbers(participantPhoneNumbers);
        return this;
    }

    /**
     * <p>
     * The name of the proxy session.
     * </p>
     * 
     * @param name
     *        The name of the proxy session.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the proxy session.
     * </p>
     * 
     * @return The name of the proxy session.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the proxy session.
     * </p>
     * 
     * @param name
     *        The name of the proxy session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProxySessionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The number of minutes allowed for the proxy session.
     * </p>
     * 
     * @param expiryMinutes
     *        The number of minutes allowed for the proxy session.
     */

    public void setExpiryMinutes(Integer expiryMinutes) {
        this.expiryMinutes = expiryMinutes;
    }

    /**
     * <p>
     * The number of minutes allowed for the proxy session.
     * </p>
     * 
     * @return The number of minutes allowed for the proxy session.
     */

    public Integer getExpiryMinutes() {
        return this.expiryMinutes;
    }

    /**
     * <p>
     * The number of minutes allowed for the proxy session.
     * </p>
     * 
     * @param expiryMinutes
     *        The number of minutes allowed for the proxy session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProxySessionRequest withExpiryMinutes(Integer expiryMinutes) {
        setExpiryMinutes(expiryMinutes);
        return this;
    }

    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     * 
     * @return The proxy session capabilities.
     * @see Capability
     */

    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     * 
     * @param capabilities
     *        The proxy session capabilities.
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
     * The proxy session capabilities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        The proxy session capabilities.
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
     * <p>
     * The proxy session capabilities.
     * </p>
     * 
     * @param capabilities
     *        The proxy session capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateProxySessionRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     * 
     * @param capabilities
     *        The proxy session capabilities.
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
     * <p>
     * The preference for proxy phone number reuse, or stickiness, between the same participants across sessions.
     * </p>
     * 
     * @param numberSelectionBehavior
     *        The preference for proxy phone number reuse, or stickiness, between the same participants across sessions.
     * @see NumberSelectionBehavior
     */

    public void setNumberSelectionBehavior(String numberSelectionBehavior) {
        this.numberSelectionBehavior = numberSelectionBehavior;
    }

    /**
     * <p>
     * The preference for proxy phone number reuse, or stickiness, between the same participants across sessions.
     * </p>
     * 
     * @return The preference for proxy phone number reuse, or stickiness, between the same participants across
     *         sessions.
     * @see NumberSelectionBehavior
     */

    public String getNumberSelectionBehavior() {
        return this.numberSelectionBehavior;
    }

    /**
     * <p>
     * The preference for proxy phone number reuse, or stickiness, between the same participants across sessions.
     * </p>
     * 
     * @param numberSelectionBehavior
     *        The preference for proxy phone number reuse, or stickiness, between the same participants across sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberSelectionBehavior
     */

    public CreateProxySessionRequest withNumberSelectionBehavior(String numberSelectionBehavior) {
        setNumberSelectionBehavior(numberSelectionBehavior);
        return this;
    }

    /**
     * <p>
     * The preference for proxy phone number reuse, or stickiness, between the same participants across sessions.
     * </p>
     * 
     * @param numberSelectionBehavior
     *        The preference for proxy phone number reuse, or stickiness, between the same participants across sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberSelectionBehavior
     */

    public CreateProxySessionRequest withNumberSelectionBehavior(NumberSelectionBehavior numberSelectionBehavior) {
        this.numberSelectionBehavior = numberSelectionBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The preference for matching the country or area code of the proxy phone number with that of the first
     * participant.
     * </p>
     * 
     * @param geoMatchLevel
     *        The preference for matching the country or area code of the proxy phone number with that of the first
     *        participant.
     * @see GeoMatchLevel
     */

    public void setGeoMatchLevel(String geoMatchLevel) {
        this.geoMatchLevel = geoMatchLevel;
    }

    /**
     * <p>
     * The preference for matching the country or area code of the proxy phone number with that of the first
     * participant.
     * </p>
     * 
     * @return The preference for matching the country or area code of the proxy phone number with that of the first
     *         participant.
     * @see GeoMatchLevel
     */

    public String getGeoMatchLevel() {
        return this.geoMatchLevel;
    }

    /**
     * <p>
     * The preference for matching the country or area code of the proxy phone number with that of the first
     * participant.
     * </p>
     * 
     * @param geoMatchLevel
     *        The preference for matching the country or area code of the proxy phone number with that of the first
     *        participant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeoMatchLevel
     */

    public CreateProxySessionRequest withGeoMatchLevel(String geoMatchLevel) {
        setGeoMatchLevel(geoMatchLevel);
        return this;
    }

    /**
     * <p>
     * The preference for matching the country or area code of the proxy phone number with that of the first
     * participant.
     * </p>
     * 
     * @param geoMatchLevel
     *        The preference for matching the country or area code of the proxy phone number with that of the first
     *        participant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeoMatchLevel
     */

    public CreateProxySessionRequest withGeoMatchLevel(GeoMatchLevel geoMatchLevel) {
        this.geoMatchLevel = geoMatchLevel.toString();
        return this;
    }

    /**
     * <p>
     * The country and area code for the proxy phone number.
     * </p>
     * 
     * @param geoMatchParams
     *        The country and area code for the proxy phone number.
     */

    public void setGeoMatchParams(GeoMatchParams geoMatchParams) {
        this.geoMatchParams = geoMatchParams;
    }

    /**
     * <p>
     * The country and area code for the proxy phone number.
     * </p>
     * 
     * @return The country and area code for the proxy phone number.
     */

    public GeoMatchParams getGeoMatchParams() {
        return this.geoMatchParams;
    }

    /**
     * <p>
     * The country and area code for the proxy phone number.
     * </p>
     * 
     * @param geoMatchParams
     *        The country and area code for the proxy phone number.
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
