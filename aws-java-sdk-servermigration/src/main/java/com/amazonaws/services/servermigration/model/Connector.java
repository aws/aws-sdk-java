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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/Connector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Connector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the connector.
     * </p>
     */
    private String connectorId;
    /**
     * <p>
     * The connector version.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The status of the connector.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The capabilities of the connector.
     * </p>
     */
    private java.util.List<String> capabilityList;
    /**
     * <p>
     * The name of the VM manager.
     * </p>
     */
    private String vmManagerName;
    /**
     * <p>
     * The VM management product.
     * </p>
     */
    private String vmManagerType;
    /**
     * <p>
     * The identifier of the VM manager.
     * </p>
     */
    private String vmManagerId;
    /**
     * <p>
     * The IP address of the connector.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The MAC address of the connector.
     * </p>
     */
    private String macAddress;
    /**
     * <p>
     * The time the connector was associated.
     * </p>
     */
    private java.util.Date associatedOn;

    /**
     * <p>
     * The identifier of the connector.
     * </p>
     * 
     * @param connectorId
     *        The identifier of the connector.
     */

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    /**
     * <p>
     * The identifier of the connector.
     * </p>
     * 
     * @return The identifier of the connector.
     */

    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * <p>
     * The identifier of the connector.
     * </p>
     * 
     * @param connectorId
     *        The identifier of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withConnectorId(String connectorId) {
        setConnectorId(connectorId);
        return this;
    }

    /**
     * <p>
     * The connector version.
     * </p>
     * 
     * @param version
     *        The connector version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The connector version.
     * </p>
     * 
     * @return The connector version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The connector version.
     * </p>
     * 
     * @param version
     *        The connector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The status of the connector.
     * </p>
     * 
     * @param status
     *        The status of the connector.
     * @see ConnectorStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the connector.
     * </p>
     * 
     * @return The status of the connector.
     * @see ConnectorStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the connector.
     * </p>
     * 
     * @param status
     *        The status of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorStatus
     */

    public Connector withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the connector.
     * </p>
     * 
     * @param status
     *        The status of the connector.
     * @see ConnectorStatus
     */

    public void setStatus(ConnectorStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the connector.
     * </p>
     * 
     * @param status
     *        The status of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorStatus
     */

    public Connector withStatus(ConnectorStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The capabilities of the connector.
     * </p>
     * 
     * @return The capabilities of the connector.
     * @see ConnectorCapability
     */

    public java.util.List<String> getCapabilityList() {
        return capabilityList;
    }

    /**
     * <p>
     * The capabilities of the connector.
     * </p>
     * 
     * @param capabilityList
     *        The capabilities of the connector.
     * @see ConnectorCapability
     */

    public void setCapabilityList(java.util.Collection<String> capabilityList) {
        if (capabilityList == null) {
            this.capabilityList = null;
            return;
        }

        this.capabilityList = new java.util.ArrayList<String>(capabilityList);
    }

    /**
     * <p>
     * The capabilities of the connector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilityList(java.util.Collection)} or {@link #withCapabilityList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param capabilityList
     *        The capabilities of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorCapability
     */

    public Connector withCapabilityList(String... capabilityList) {
        if (this.capabilityList == null) {
            setCapabilityList(new java.util.ArrayList<String>(capabilityList.length));
        }
        for (String ele : capabilityList) {
            this.capabilityList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capabilities of the connector.
     * </p>
     * 
     * @param capabilityList
     *        The capabilities of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorCapability
     */

    public Connector withCapabilityList(java.util.Collection<String> capabilityList) {
        setCapabilityList(capabilityList);
        return this;
    }

    /**
     * <p>
     * The capabilities of the connector.
     * </p>
     * 
     * @param capabilityList
     *        The capabilities of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorCapability
     */

    public Connector withCapabilityList(ConnectorCapability... capabilityList) {
        java.util.ArrayList<String> capabilityListCopy = new java.util.ArrayList<String>(capabilityList.length);
        for (ConnectorCapability value : capabilityList) {
            capabilityListCopy.add(value.toString());
        }
        if (getCapabilityList() == null) {
            setCapabilityList(capabilityListCopy);
        } else {
            getCapabilityList().addAll(capabilityListCopy);
        }
        return this;
    }

    /**
     * <p>
     * The name of the VM manager.
     * </p>
     * 
     * @param vmManagerName
     *        The name of the VM manager.
     */

    public void setVmManagerName(String vmManagerName) {
        this.vmManagerName = vmManagerName;
    }

    /**
     * <p>
     * The name of the VM manager.
     * </p>
     * 
     * @return The name of the VM manager.
     */

    public String getVmManagerName() {
        return this.vmManagerName;
    }

    /**
     * <p>
     * The name of the VM manager.
     * </p>
     * 
     * @param vmManagerName
     *        The name of the VM manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withVmManagerName(String vmManagerName) {
        setVmManagerName(vmManagerName);
        return this;
    }

    /**
     * <p>
     * The VM management product.
     * </p>
     * 
     * @param vmManagerType
     *        The VM management product.
     * @see VmManagerType
     */

    public void setVmManagerType(String vmManagerType) {
        this.vmManagerType = vmManagerType;
    }

    /**
     * <p>
     * The VM management product.
     * </p>
     * 
     * @return The VM management product.
     * @see VmManagerType
     */

    public String getVmManagerType() {
        return this.vmManagerType;
    }

    /**
     * <p>
     * The VM management product.
     * </p>
     * 
     * @param vmManagerType
     *        The VM management product.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VmManagerType
     */

    public Connector withVmManagerType(String vmManagerType) {
        setVmManagerType(vmManagerType);
        return this;
    }

    /**
     * <p>
     * The VM management product.
     * </p>
     * 
     * @param vmManagerType
     *        The VM management product.
     * @see VmManagerType
     */

    public void setVmManagerType(VmManagerType vmManagerType) {
        withVmManagerType(vmManagerType);
    }

    /**
     * <p>
     * The VM management product.
     * </p>
     * 
     * @param vmManagerType
     *        The VM management product.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VmManagerType
     */

    public Connector withVmManagerType(VmManagerType vmManagerType) {
        this.vmManagerType = vmManagerType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the VM manager.
     * </p>
     * 
     * @param vmManagerId
     *        The identifier of the VM manager.
     */

    public void setVmManagerId(String vmManagerId) {
        this.vmManagerId = vmManagerId;
    }

    /**
     * <p>
     * The identifier of the VM manager.
     * </p>
     * 
     * @return The identifier of the VM manager.
     */

    public String getVmManagerId() {
        return this.vmManagerId;
    }

    /**
     * <p>
     * The identifier of the VM manager.
     * </p>
     * 
     * @param vmManagerId
     *        The identifier of the VM manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withVmManagerId(String vmManagerId) {
        setVmManagerId(vmManagerId);
        return this;
    }

    /**
     * <p>
     * The IP address of the connector.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the connector.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address of the connector.
     * </p>
     * 
     * @return The IP address of the connector.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address of the connector.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The MAC address of the connector.
     * </p>
     * 
     * @param macAddress
     *        The MAC address of the connector.
     */

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * <p>
     * The MAC address of the connector.
     * </p>
     * 
     * @return The MAC address of the connector.
     */

    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * <p>
     * The MAC address of the connector.
     * </p>
     * 
     * @param macAddress
     *        The MAC address of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withMacAddress(String macAddress) {
        setMacAddress(macAddress);
        return this;
    }

    /**
     * <p>
     * The time the connector was associated.
     * </p>
     * 
     * @param associatedOn
     *        The time the connector was associated.
     */

    public void setAssociatedOn(java.util.Date associatedOn) {
        this.associatedOn = associatedOn;
    }

    /**
     * <p>
     * The time the connector was associated.
     * </p>
     * 
     * @return The time the connector was associated.
     */

    public java.util.Date getAssociatedOn() {
        return this.associatedOn;
    }

    /**
     * <p>
     * The time the connector was associated.
     * </p>
     * 
     * @param associatedOn
     *        The time the connector was associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withAssociatedOn(java.util.Date associatedOn) {
        setAssociatedOn(associatedOn);
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
        if (getConnectorId() != null)
            sb.append("ConnectorId: ").append(getConnectorId()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCapabilityList() != null)
            sb.append("CapabilityList: ").append(getCapabilityList()).append(",");
        if (getVmManagerName() != null)
            sb.append("VmManagerName: ").append(getVmManagerName()).append(",");
        if (getVmManagerType() != null)
            sb.append("VmManagerType: ").append(getVmManagerType()).append(",");
        if (getVmManagerId() != null)
            sb.append("VmManagerId: ").append(getVmManagerId()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getMacAddress() != null)
            sb.append("MacAddress: ").append(getMacAddress()).append(",");
        if (getAssociatedOn() != null)
            sb.append("AssociatedOn: ").append(getAssociatedOn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Connector == false)
            return false;
        Connector other = (Connector) obj;
        if (other.getConnectorId() == null ^ this.getConnectorId() == null)
            return false;
        if (other.getConnectorId() != null && other.getConnectorId().equals(this.getConnectorId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCapabilityList() == null ^ this.getCapabilityList() == null)
            return false;
        if (other.getCapabilityList() != null && other.getCapabilityList().equals(this.getCapabilityList()) == false)
            return false;
        if (other.getVmManagerName() == null ^ this.getVmManagerName() == null)
            return false;
        if (other.getVmManagerName() != null && other.getVmManagerName().equals(this.getVmManagerName()) == false)
            return false;
        if (other.getVmManagerType() == null ^ this.getVmManagerType() == null)
            return false;
        if (other.getVmManagerType() != null && other.getVmManagerType().equals(this.getVmManagerType()) == false)
            return false;
        if (other.getVmManagerId() == null ^ this.getVmManagerId() == null)
            return false;
        if (other.getVmManagerId() != null && other.getVmManagerId().equals(this.getVmManagerId()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getMacAddress() == null ^ this.getMacAddress() == null)
            return false;
        if (other.getMacAddress() != null && other.getMacAddress().equals(this.getMacAddress()) == false)
            return false;
        if (other.getAssociatedOn() == null ^ this.getAssociatedOn() == null)
            return false;
        if (other.getAssociatedOn() != null && other.getAssociatedOn().equals(this.getAssociatedOn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorId() == null) ? 0 : getConnectorId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCapabilityList() == null) ? 0 : getCapabilityList().hashCode());
        hashCode = prime * hashCode + ((getVmManagerName() == null) ? 0 : getVmManagerName().hashCode());
        hashCode = prime * hashCode + ((getVmManagerType() == null) ? 0 : getVmManagerType().hashCode());
        hashCode = prime * hashCode + ((getVmManagerId() == null) ? 0 : getVmManagerId().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        hashCode = prime * hashCode + ((getAssociatedOn() == null) ? 0 : getAssociatedOn().hashCode());
        return hashCode;
    }

    @Override
    public Connector clone() {
        try {
            return (Connector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ConnectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
