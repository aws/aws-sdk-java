/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The Amazon Chime Voice Connector configuration, including outbound host name and encryption settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/VoiceConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceConnector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     */
    private String voiceConnectorId;
    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The outbound host name for the Amazon Chime Voice Connector.
     * </p>
     */
    private String outboundHostName;
    /**
     * <p>
     * Designates whether encryption is required for the Amazon Chime Voice Connector.
     * </p>
     */
    private Boolean requireEncryption;
    /**
     * <p>
     * The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Amazon Chime Voice Connector ID.
     */

    public void setVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @return The Amazon Chime Voice Connector ID.
     */

    public String getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Amazon Chime Voice Connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnector withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Chime Voice Connector.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     * 
     * @return The name of the Amazon Chime Voice Connector.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Chime Voice Connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnector withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The outbound host name for the Amazon Chime Voice Connector.
     * </p>
     * 
     * @param outboundHostName
     *        The outbound host name for the Amazon Chime Voice Connector.
     */

    public void setOutboundHostName(String outboundHostName) {
        this.outboundHostName = outboundHostName;
    }

    /**
     * <p>
     * The outbound host name for the Amazon Chime Voice Connector.
     * </p>
     * 
     * @return The outbound host name for the Amazon Chime Voice Connector.
     */

    public String getOutboundHostName() {
        return this.outboundHostName;
    }

    /**
     * <p>
     * The outbound host name for the Amazon Chime Voice Connector.
     * </p>
     * 
     * @param outboundHostName
     *        The outbound host name for the Amazon Chime Voice Connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnector withOutboundHostName(String outboundHostName) {
        setOutboundHostName(outboundHostName);
        return this;
    }

    /**
     * <p>
     * Designates whether encryption is required for the Amazon Chime Voice Connector.
     * </p>
     * 
     * @param requireEncryption
     *        Designates whether encryption is required for the Amazon Chime Voice Connector.
     */

    public void setRequireEncryption(Boolean requireEncryption) {
        this.requireEncryption = requireEncryption;
    }

    /**
     * <p>
     * Designates whether encryption is required for the Amazon Chime Voice Connector.
     * </p>
     * 
     * @return Designates whether encryption is required for the Amazon Chime Voice Connector.
     */

    public Boolean getRequireEncryption() {
        return this.requireEncryption;
    }

    /**
     * <p>
     * Designates whether encryption is required for the Amazon Chime Voice Connector.
     * </p>
     * 
     * @param requireEncryption
     *        Designates whether encryption is required for the Amazon Chime Voice Connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnector withRequireEncryption(Boolean requireEncryption) {
        setRequireEncryption(requireEncryption);
        return this;
    }

    /**
     * <p>
     * Designates whether encryption is required for the Amazon Chime Voice Connector.
     * </p>
     * 
     * @return Designates whether encryption is required for the Amazon Chime Voice Connector.
     */

    public Boolean isRequireEncryption() {
        return this.requireEncryption;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnector withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnector withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutboundHostName() != null)
            sb.append("OutboundHostName: ").append(getOutboundHostName()).append(",");
        if (getRequireEncryption() != null)
            sb.append("RequireEncryption: ").append(getRequireEncryption()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceConnector == false)
            return false;
        VoiceConnector other = (VoiceConnector) obj;
        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutboundHostName() == null ^ this.getOutboundHostName() == null)
            return false;
        if (other.getOutboundHostName() != null && other.getOutboundHostName().equals(this.getOutboundHostName()) == false)
            return false;
        if (other.getRequireEncryption() == null ^ this.getRequireEncryption() == null)
            return false;
        if (other.getRequireEncryption() != null && other.getRequireEncryption().equals(this.getRequireEncryption()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutboundHostName() == null) ? 0 : getOutboundHostName().hashCode());
        hashCode = prime * hashCode + ((getRequireEncryption() == null) ? 0 : getRequireEncryption().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public VoiceConnector clone() {
        try {
            return (VoiceConnector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.VoiceConnectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
