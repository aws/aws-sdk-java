/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/VoiceConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceConnector implements Serializable, Cloneable, StructuredPojo {

    private String voiceConnectorId;

    private String awsRegion;

    private String name;

    private String outboundHostName;

    private Boolean requireEncryption;

    private java.util.Date createdTimestamp;

    private java.util.Date updatedTimestamp;

    private String voiceConnectorArn;

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

    public VoiceConnector withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

    /**
     * @param awsRegion
     * @see VoiceConnectorAwsRegion
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * @return
     * @see VoiceConnectorAwsRegion
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * @param awsRegion
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceConnectorAwsRegion
     */

    public VoiceConnector withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * @param awsRegion
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceConnectorAwsRegion
     */

    public VoiceConnector withAwsRegion(VoiceConnectorAwsRegion awsRegion) {
        this.awsRegion = awsRegion.toString();
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

    public VoiceConnector withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param outboundHostName
     */

    public void setOutboundHostName(String outboundHostName) {
        this.outboundHostName = outboundHostName;
    }

    /**
     * @return
     */

    public String getOutboundHostName() {
        return this.outboundHostName;
    }

    /**
     * @param outboundHostName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnector withOutboundHostName(String outboundHostName) {
        setOutboundHostName(outboundHostName);
        return this;
    }

    /**
     * @param requireEncryption
     */

    public void setRequireEncryption(Boolean requireEncryption) {
        this.requireEncryption = requireEncryption;
    }

    /**
     * @return
     */

    public Boolean getRequireEncryption() {
        return this.requireEncryption;
    }

    /**
     * @param requireEncryption
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnector withRequireEncryption(Boolean requireEncryption) {
        setRequireEncryption(requireEncryption);
        return this;
    }

    /**
     * @return
     */

    public Boolean isRequireEncryption() {
        return this.requireEncryption;
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

    public VoiceConnector withCreatedTimestamp(java.util.Date createdTimestamp) {
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

    public VoiceConnector withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
        return this;
    }

    /**
     * @param voiceConnectorArn
     */

    public void setVoiceConnectorArn(String voiceConnectorArn) {
        this.voiceConnectorArn = voiceConnectorArn;
    }

    /**
     * @return
     */

    public String getVoiceConnectorArn() {
        return this.voiceConnectorArn;
    }

    /**
     * @param voiceConnectorArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnector withVoiceConnectorArn(String voiceConnectorArn) {
        setVoiceConnectorArn(voiceConnectorArn);
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
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutboundHostName() != null)
            sb.append("OutboundHostName: ").append(getOutboundHostName()).append(",");
        if (getRequireEncryption() != null)
            sb.append("RequireEncryption: ").append(getRequireEncryption()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp()).append(",");
        if (getVoiceConnectorArn() != null)
            sb.append("VoiceConnectorArn: ").append(getVoiceConnectorArn());
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
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
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
        if (other.getVoiceConnectorArn() == null ^ this.getVoiceConnectorArn() == null)
            return false;
        if (other.getVoiceConnectorArn() != null && other.getVoiceConnectorArn().equals(this.getVoiceConnectorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutboundHostName() == null) ? 0 : getOutboundHostName().hashCode());
        hashCode = prime * hashCode + ((getRequireEncryption() == null) ? 0 : getRequireEncryption().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getVoiceConnectorArn() == null) ? 0 : getVoiceConnectorArn().hashCode());
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
        com.amazonaws.services.chimesdkvoice.model.transform.VoiceConnectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
