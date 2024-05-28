/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * For Amazon Chime SDK Voice Connector groups, the Amazon Chime SDK Voice Connectors to which you route inbound calls.
 * Includes priority configuration settings. Limit: 3 VoiceConnectorItems per Voice Connector group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/VoiceConnectorItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceConnectorItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Voice Connector ID.
     * </p>
     */
    private String voiceConnectorId;
    /**
     * <p>
     * The priority setting of a Voice Connector item. Calls are routed to hosts in priority order, with 1 as the
     * highest priority. When hosts have equal priority, the system distributes calls among them based on their relative
     * weight.
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * The Voice Connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Voice Connector ID.
     */

    public void setVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
    }

    /**
     * <p>
     * The Voice Connector ID.
     * </p>
     * 
     * @return The Voice Connector ID.
     */

    public String getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    /**
     * <p>
     * The Voice Connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Voice Connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnectorItem withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

    /**
     * <p>
     * The priority setting of a Voice Connector item. Calls are routed to hosts in priority order, with 1 as the
     * highest priority. When hosts have equal priority, the system distributes calls among them based on their relative
     * weight.
     * </p>
     * 
     * @param priority
     *        The priority setting of a Voice Connector item. Calls are routed to hosts in priority order, with 1 as the
     *        highest priority. When hosts have equal priority, the system distributes calls among them based on their
     *        relative weight.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority setting of a Voice Connector item. Calls are routed to hosts in priority order, with 1 as the
     * highest priority. When hosts have equal priority, the system distributes calls among them based on their relative
     * weight.
     * </p>
     * 
     * @return The priority setting of a Voice Connector item. Calls are routed to hosts in priority order, with 1 as
     *         the highest priority. When hosts have equal priority, the system distributes calls among them based on
     *         their relative weight.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority setting of a Voice Connector item. Calls are routed to hosts in priority order, with 1 as the
     * highest priority. When hosts have equal priority, the system distributes calls among them based on their relative
     * weight.
     * </p>
     * 
     * @param priority
     *        The priority setting of a Voice Connector item. Calls are routed to hosts in priority order, with 1 as the
     *        highest priority. When hosts have equal priority, the system distributes calls among them based on their
     *        relative weight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceConnectorItem withPriority(Integer priority) {
        setPriority(priority);
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
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceConnectorItem == false)
            return false;
        VoiceConnectorItem other = (VoiceConnectorItem) obj;
        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public VoiceConnectorItem clone() {
        try {
            return (VoiceConnectorItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.VoiceConnectorItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
