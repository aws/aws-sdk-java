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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ProxySession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProxySession implements Serializable, Cloneable, StructuredPojo {

    private String voiceConnectorId;

    private String proxySessionId;

    private String name;

    private String status;

    private Integer expiryMinutes;

    private java.util.List<String> capabilities;

    private java.util.Date createdTimestamp;

    private java.util.Date updatedTimestamp;

    private java.util.Date endedTimestamp;

    private java.util.List<Participant> participants;

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

    public ProxySession withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

    /**
     * @param proxySessionId
     */

    public void setProxySessionId(String proxySessionId) {
        this.proxySessionId = proxySessionId;
    }

    /**
     * @return
     */

    public String getProxySessionId() {
        return this.proxySessionId;
    }

    /**
     * @param proxySessionId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProxySession withProxySessionId(String proxySessionId) {
        setProxySessionId(proxySessionId);
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

    public ProxySession withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param status
     * @see ProxySessionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     * @see ProxySessionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProxySessionStatus
     */

    public ProxySession withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProxySessionStatus
     */

    public ProxySession withStatus(ProxySessionStatus status) {
        this.status = status.toString();
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

    public ProxySession withExpiryMinutes(Integer expiryMinutes) {
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

    public ProxySession withCapabilities(String... capabilities) {
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

    public ProxySession withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * @param capabilities
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public ProxySession withCapabilities(Capability... capabilities) {
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
     * @param createdTimestamp
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * @param createdTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProxySession withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * @param updatedTimestamp
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * @param updatedTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProxySession withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
        return this;
    }

    /**
     * @param endedTimestamp
     */

    public void setEndedTimestamp(java.util.Date endedTimestamp) {
        this.endedTimestamp = endedTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getEndedTimestamp() {
        return this.endedTimestamp;
    }

    /**
     * @param endedTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProxySession withEndedTimestamp(java.util.Date endedTimestamp) {
        setEndedTimestamp(endedTimestamp);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Participant> getParticipants() {
        return participants;
    }

    /**
     * @param participants
     */

    public void setParticipants(java.util.Collection<Participant> participants) {
        if (participants == null) {
            this.participants = null;
            return;
        }

        this.participants = new java.util.ArrayList<Participant>(participants);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParticipants(java.util.Collection)} or {@link #withParticipants(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param participants
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProxySession withParticipants(Participant... participants) {
        if (this.participants == null) {
            setParticipants(new java.util.ArrayList<Participant>(participants.length));
        }
        for (Participant ele : participants) {
            this.participants.add(ele);
        }
        return this;
    }

    /**
     * @param participants
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProxySession withParticipants(java.util.Collection<Participant> participants) {
        setParticipants(participants);
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

    public ProxySession withNumberSelectionBehavior(String numberSelectionBehavior) {
        setNumberSelectionBehavior(numberSelectionBehavior);
        return this;
    }

    /**
     * @param numberSelectionBehavior
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberSelectionBehavior
     */

    public ProxySession withNumberSelectionBehavior(NumberSelectionBehavior numberSelectionBehavior) {
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

    public ProxySession withGeoMatchLevel(String geoMatchLevel) {
        setGeoMatchLevel(geoMatchLevel);
        return this;
    }

    /**
     * @param geoMatchLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeoMatchLevel
     */

    public ProxySession withGeoMatchLevel(GeoMatchLevel geoMatchLevel) {
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

    public ProxySession withGeoMatchParams(GeoMatchParams geoMatchParams) {
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
        if (getProxySessionId() != null)
            sb.append("ProxySessionId: ").append(getProxySessionId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getExpiryMinutes() != null)
            sb.append("ExpiryMinutes: ").append(getExpiryMinutes()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp()).append(",");
        if (getEndedTimestamp() != null)
            sb.append("EndedTimestamp: ").append(getEndedTimestamp()).append(",");
        if (getParticipants() != null)
            sb.append("Participants: ").append(getParticipants()).append(",");
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

        if (obj instanceof ProxySession == false)
            return false;
        ProxySession other = (ProxySession) obj;
        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getProxySessionId() == null ^ this.getProxySessionId() == null)
            return false;
        if (other.getProxySessionId() != null && other.getProxySessionId().equals(this.getProxySessionId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getExpiryMinutes() == null ^ this.getExpiryMinutes() == null)
            return false;
        if (other.getExpiryMinutes() != null && other.getExpiryMinutes().equals(this.getExpiryMinutes()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        if (other.getEndedTimestamp() == null ^ this.getEndedTimestamp() == null)
            return false;
        if (other.getEndedTimestamp() != null && other.getEndedTimestamp().equals(this.getEndedTimestamp()) == false)
            return false;
        if (other.getParticipants() == null ^ this.getParticipants() == null)
            return false;
        if (other.getParticipants() != null && other.getParticipants().equals(this.getParticipants()) == false)
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
        hashCode = prime * hashCode + ((getProxySessionId() == null) ? 0 : getProxySessionId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getExpiryMinutes() == null) ? 0 : getExpiryMinutes().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEndedTimestamp() == null) ? 0 : getEndedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getParticipants() == null) ? 0 : getParticipants().hashCode());
        hashCode = prime * hashCode + ((getNumberSelectionBehavior() == null) ? 0 : getNumberSelectionBehavior().hashCode());
        hashCode = prime * hashCode + ((getGeoMatchLevel() == null) ? 0 : getGeoMatchLevel().hashCode());
        hashCode = prime * hashCode + ((getGeoMatchParams() == null) ? 0 : getGeoMatchParams().hashCode());
        return hashCode;
    }

    @Override
    public ProxySession clone() {
        try {
            return (ProxySession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.ProxySessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
