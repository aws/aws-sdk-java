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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data on the status of agent components.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ComponentStatusData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentStatusData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Bytes received by the component.
     * </p>
     */
    private Long bytesReceived;
    /**
     * <p>
     * Bytes sent by the component.
     * </p>
     */
    private Long bytesSent;
    /**
     * <p>
     * Capability ARN of the component.
     * </p>
     */
    private String capabilityArn;
    /**
     * <p>
     * The Component type.
     * </p>
     */
    private String componentType;
    /**
     * <p>
     * Dataflow UUID associated with the component.
     * </p>
     */
    private String dataflowId;
    /**
     * <p>
     * Packets dropped by component.
     * </p>
     */
    private Long packetsDropped;
    /**
     * <p>
     * Component status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Bytes received by the component.
     * </p>
     * 
     * @param bytesReceived
     *        Bytes received by the component.
     */

    public void setBytesReceived(Long bytesReceived) {
        this.bytesReceived = bytesReceived;
    }

    /**
     * <p>
     * Bytes received by the component.
     * </p>
     * 
     * @return Bytes received by the component.
     */

    public Long getBytesReceived() {
        return this.bytesReceived;
    }

    /**
     * <p>
     * Bytes received by the component.
     * </p>
     * 
     * @param bytesReceived
     *        Bytes received by the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentStatusData withBytesReceived(Long bytesReceived) {
        setBytesReceived(bytesReceived);
        return this;
    }

    /**
     * <p>
     * Bytes sent by the component.
     * </p>
     * 
     * @param bytesSent
     *        Bytes sent by the component.
     */

    public void setBytesSent(Long bytesSent) {
        this.bytesSent = bytesSent;
    }

    /**
     * <p>
     * Bytes sent by the component.
     * </p>
     * 
     * @return Bytes sent by the component.
     */

    public Long getBytesSent() {
        return this.bytesSent;
    }

    /**
     * <p>
     * Bytes sent by the component.
     * </p>
     * 
     * @param bytesSent
     *        Bytes sent by the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentStatusData withBytesSent(Long bytesSent) {
        setBytesSent(bytesSent);
        return this;
    }

    /**
     * <p>
     * Capability ARN of the component.
     * </p>
     * 
     * @param capabilityArn
     *        Capability ARN of the component.
     */

    public void setCapabilityArn(String capabilityArn) {
        this.capabilityArn = capabilityArn;
    }

    /**
     * <p>
     * Capability ARN of the component.
     * </p>
     * 
     * @return Capability ARN of the component.
     */

    public String getCapabilityArn() {
        return this.capabilityArn;
    }

    /**
     * <p>
     * Capability ARN of the component.
     * </p>
     * 
     * @param capabilityArn
     *        Capability ARN of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentStatusData withCapabilityArn(String capabilityArn) {
        setCapabilityArn(capabilityArn);
        return this;
    }

    /**
     * <p>
     * The Component type.
     * </p>
     * 
     * @param componentType
     *        The Component type.
     */

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    /**
     * <p>
     * The Component type.
     * </p>
     * 
     * @return The Component type.
     */

    public String getComponentType() {
        return this.componentType;
    }

    /**
     * <p>
     * The Component type.
     * </p>
     * 
     * @param componentType
     *        The Component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentStatusData withComponentType(String componentType) {
        setComponentType(componentType);
        return this;
    }

    /**
     * <p>
     * Dataflow UUID associated with the component.
     * </p>
     * 
     * @param dataflowId
     *        Dataflow UUID associated with the component.
     */

    public void setDataflowId(String dataflowId) {
        this.dataflowId = dataflowId;
    }

    /**
     * <p>
     * Dataflow UUID associated with the component.
     * </p>
     * 
     * @return Dataflow UUID associated with the component.
     */

    public String getDataflowId() {
        return this.dataflowId;
    }

    /**
     * <p>
     * Dataflow UUID associated with the component.
     * </p>
     * 
     * @param dataflowId
     *        Dataflow UUID associated with the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentStatusData withDataflowId(String dataflowId) {
        setDataflowId(dataflowId);
        return this;
    }

    /**
     * <p>
     * Packets dropped by component.
     * </p>
     * 
     * @param packetsDropped
     *        Packets dropped by component.
     */

    public void setPacketsDropped(Long packetsDropped) {
        this.packetsDropped = packetsDropped;
    }

    /**
     * <p>
     * Packets dropped by component.
     * </p>
     * 
     * @return Packets dropped by component.
     */

    public Long getPacketsDropped() {
        return this.packetsDropped;
    }

    /**
     * <p>
     * Packets dropped by component.
     * </p>
     * 
     * @param packetsDropped
     *        Packets dropped by component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentStatusData withPacketsDropped(Long packetsDropped) {
        setPacketsDropped(packetsDropped);
        return this;
    }

    /**
     * <p>
     * Component status.
     * </p>
     * 
     * @param status
     *        Component status.
     * @see AgentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Component status.
     * </p>
     * 
     * @return Component status.
     * @see AgentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Component status.
     * </p>
     * 
     * @param status
     *        Component status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public ComponentStatusData withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Component status.
     * </p>
     * 
     * @param status
     *        Component status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public ComponentStatusData withStatus(AgentStatus status) {
        this.status = status.toString();
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
        if (getBytesReceived() != null)
            sb.append("BytesReceived: ").append(getBytesReceived()).append(",");
        if (getBytesSent() != null)
            sb.append("BytesSent: ").append(getBytesSent()).append(",");
        if (getCapabilityArn() != null)
            sb.append("CapabilityArn: ").append(getCapabilityArn()).append(",");
        if (getComponentType() != null)
            sb.append("ComponentType: ").append(getComponentType()).append(",");
        if (getDataflowId() != null)
            sb.append("DataflowId: ").append(getDataflowId()).append(",");
        if (getPacketsDropped() != null)
            sb.append("PacketsDropped: ").append(getPacketsDropped()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentStatusData == false)
            return false;
        ComponentStatusData other = (ComponentStatusData) obj;
        if (other.getBytesReceived() == null ^ this.getBytesReceived() == null)
            return false;
        if (other.getBytesReceived() != null && other.getBytesReceived().equals(this.getBytesReceived()) == false)
            return false;
        if (other.getBytesSent() == null ^ this.getBytesSent() == null)
            return false;
        if (other.getBytesSent() != null && other.getBytesSent().equals(this.getBytesSent()) == false)
            return false;
        if (other.getCapabilityArn() == null ^ this.getCapabilityArn() == null)
            return false;
        if (other.getCapabilityArn() != null && other.getCapabilityArn().equals(this.getCapabilityArn()) == false)
            return false;
        if (other.getComponentType() == null ^ this.getComponentType() == null)
            return false;
        if (other.getComponentType() != null && other.getComponentType().equals(this.getComponentType()) == false)
            return false;
        if (other.getDataflowId() == null ^ this.getDataflowId() == null)
            return false;
        if (other.getDataflowId() != null && other.getDataflowId().equals(this.getDataflowId()) == false)
            return false;
        if (other.getPacketsDropped() == null ^ this.getPacketsDropped() == null)
            return false;
        if (other.getPacketsDropped() != null && other.getPacketsDropped().equals(this.getPacketsDropped()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBytesReceived() == null) ? 0 : getBytesReceived().hashCode());
        hashCode = prime * hashCode + ((getBytesSent() == null) ? 0 : getBytesSent().hashCode());
        hashCode = prime * hashCode + ((getCapabilityArn() == null) ? 0 : getCapabilityArn().hashCode());
        hashCode = prime * hashCode + ((getComponentType() == null) ? 0 : getComponentType().hashCode());
        hashCode = prime * hashCode + ((getDataflowId() == null) ? 0 : getDataflowId().hashCode());
        hashCode = prime * hashCode + ((getPacketsDropped() == null) ? 0 : getPacketsDropped().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ComponentStatusData clone() {
        try {
            return (ComponentStatusData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.ComponentStatusDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
