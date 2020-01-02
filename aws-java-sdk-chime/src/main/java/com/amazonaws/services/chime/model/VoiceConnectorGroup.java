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
 * <p>
 * The Amazon Chime Voice Connector group configuration, including associated Amazon Chime Voice Connectors. You can
 * include Amazon Chime Voice Connectors from different AWS Regions in your group. This creates a fault tolerant
 * mechanism for fallback in case of availability events.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/VoiceConnectorGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceConnectorGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     */
    private String voiceConnectorGroupId;
    /**
     * <p>
     * The name of the Amazon Chime Voice Connector group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Chime Voice Connectors to which to route inbound calls.
     * </p>
     */
    private java.util.List<VoiceConnectorItem> voiceConnectorItems;
    /**
     * <p>
     * The Amazon Chime Voice Connector group creation timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The updated Amazon Chime Voice Connector group timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * 
     * @param voiceConnectorGroupId
     *        The Amazon Chime Voice Connector group ID.
     */

    public void setVoiceConnectorGroupId(String voiceConnectorGroupId) {
        this.voiceConnectorGroupId = voiceConnectorGroupId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * 
     * @return The Amazon Chime Voice Connector group ID.
     */

    public String getVoiceConnectorGroupId() {
        return this.voiceConnectorGroupId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * 
     * @param voiceConnectorGroupId
     *        The Amazon Chime Voice Connector group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnectorGroup withVoiceConnectorGroupId(String voiceConnectorGroupId) {
        setVoiceConnectorGroupId(voiceConnectorGroupId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector group.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Chime Voice Connector group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector group.
     * </p>
     * 
     * @return The name of the Amazon Chime Voice Connector group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector group.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Chime Voice Connector group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnectorGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connectors to which to route inbound calls.
     * </p>
     * 
     * @return The Amazon Chime Voice Connectors to which to route inbound calls.
     */

    public java.util.List<VoiceConnectorItem> getVoiceConnectorItems() {
        return voiceConnectorItems;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connectors to which to route inbound calls.
     * </p>
     * 
     * @param voiceConnectorItems
     *        The Amazon Chime Voice Connectors to which to route inbound calls.
     */

    public void setVoiceConnectorItems(java.util.Collection<VoiceConnectorItem> voiceConnectorItems) {
        if (voiceConnectorItems == null) {
            this.voiceConnectorItems = null;
            return;
        }

        this.voiceConnectorItems = new java.util.ArrayList<VoiceConnectorItem>(voiceConnectorItems);
    }

    /**
     * <p>
     * The Amazon Chime Voice Connectors to which to route inbound calls.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVoiceConnectorItems(java.util.Collection)} or {@link #withVoiceConnectorItems(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param voiceConnectorItems
     *        The Amazon Chime Voice Connectors to which to route inbound calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnectorGroup withVoiceConnectorItems(VoiceConnectorItem... voiceConnectorItems) {
        if (this.voiceConnectorItems == null) {
            setVoiceConnectorItems(new java.util.ArrayList<VoiceConnectorItem>(voiceConnectorItems.length));
        }
        for (VoiceConnectorItem ele : voiceConnectorItems) {
            this.voiceConnectorItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connectors to which to route inbound calls.
     * </p>
     * 
     * @param voiceConnectorItems
     *        The Amazon Chime Voice Connectors to which to route inbound calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnectorGroup withVoiceConnectorItems(java.util.Collection<VoiceConnectorItem> voiceConnectorItems) {
        setVoiceConnectorItems(voiceConnectorItems);
        return this;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The Amazon Chime Voice Connector group creation timestamp, in ISO 8601 format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The Amazon Chime Voice Connector group creation timestamp, in ISO 8601 format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The Amazon Chime Voice Connector group creation timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnectorGroup withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector group timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The updated Amazon Chime Voice Connector group timestamp, in ISO 8601 format.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector group timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The updated Amazon Chime Voice Connector group timestamp, in ISO 8601 format.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector group timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The updated Amazon Chime Voice Connector group timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnectorGroup withUpdatedTimestamp(java.util.Date updatedTimestamp) {
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
        if (getVoiceConnectorGroupId() != null)
            sb.append("VoiceConnectorGroupId: ").append(getVoiceConnectorGroupId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVoiceConnectorItems() != null)
            sb.append("VoiceConnectorItems: ").append(getVoiceConnectorItems()).append(",");
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

        if (obj instanceof VoiceConnectorGroup == false)
            return false;
        VoiceConnectorGroup other = (VoiceConnectorGroup) obj;
        if (other.getVoiceConnectorGroupId() == null ^ this.getVoiceConnectorGroupId() == null)
            return false;
        if (other.getVoiceConnectorGroupId() != null && other.getVoiceConnectorGroupId().equals(this.getVoiceConnectorGroupId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVoiceConnectorItems() == null ^ this.getVoiceConnectorItems() == null)
            return false;
        if (other.getVoiceConnectorItems() != null && other.getVoiceConnectorItems().equals(this.getVoiceConnectorItems()) == false)
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

        hashCode = prime * hashCode + ((getVoiceConnectorGroupId() == null) ? 0 : getVoiceConnectorGroupId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVoiceConnectorItems() == null) ? 0 : getVoiceConnectorItems().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public VoiceConnectorGroup clone() {
        try {
            return (VoiceConnectorGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.VoiceConnectorGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
