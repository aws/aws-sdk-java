/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Object representing a Connector
 */
public class Connector implements Serializable, Cloneable {

    private String connectorId;

    private String version;

    private String status;

    private java.util.List<String> capabilityList;

    private String vmManagerName;

    private String vmManagerType;

    private String vmManagerId;

    private String ipAddress;

    private String macAddress;

    private java.util.Date associatedOn;

    /**
     * @param connectorId
     */

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    /**
     * @return
     */

    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * @param connectorId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withConnectorId(String connectorId) {
        setConnectorId(connectorId);
        return this;
    }

    /**
     * @param version
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * @param version
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * @param status
     * @see ConnectorStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     * @see ConnectorStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorStatus
     */

    public Connector withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param status
     * @see ConnectorStatus
     */

    public void setStatus(ConnectorStatus status) {
        this.status = status.toString();
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorStatus
     */

    public Connector withStatus(ConnectorStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * @return
     * @see ConnectorCapability
     */

    public java.util.List<String> getCapabilityList() {
        return capabilityList;
    }

    /**
     * @param capabilityList
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilityList(java.util.Collection)} or {@link #withCapabilityList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param capabilityList
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
     * @param capabilityList
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorCapability
     */

    public Connector withCapabilityList(java.util.Collection<String> capabilityList) {
        setCapabilityList(capabilityList);
        return this;
    }

    /**
     * @param capabilityList
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
     * @param vmManagerName
     */

    public void setVmManagerName(String vmManagerName) {
        this.vmManagerName = vmManagerName;
    }

    /**
     * @return
     */

    public String getVmManagerName() {
        return this.vmManagerName;
    }

    /**
     * @param vmManagerName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withVmManagerName(String vmManagerName) {
        setVmManagerName(vmManagerName);
        return this;
    }

    /**
     * @param vmManagerType
     * @see VmManagerType
     */

    public void setVmManagerType(String vmManagerType) {
        this.vmManagerType = vmManagerType;
    }

    /**
     * @return
     * @see VmManagerType
     */

    public String getVmManagerType() {
        return this.vmManagerType;
    }

    /**
     * @param vmManagerType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VmManagerType
     */

    public Connector withVmManagerType(String vmManagerType) {
        setVmManagerType(vmManagerType);
        return this;
    }

    /**
     * @param vmManagerType
     * @see VmManagerType
     */

    public void setVmManagerType(VmManagerType vmManagerType) {
        this.vmManagerType = vmManagerType.toString();
    }

    /**
     * @param vmManagerType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VmManagerType
     */

    public Connector withVmManagerType(VmManagerType vmManagerType) {
        setVmManagerType(vmManagerType);
        return this;
    }

    /**
     * @param vmManagerId
     */

    public void setVmManagerId(String vmManagerId) {
        this.vmManagerId = vmManagerId;
    }

    /**
     * @return
     */

    public String getVmManagerId() {
        return this.vmManagerId;
    }

    /**
     * @param vmManagerId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withVmManagerId(String vmManagerId) {
        setVmManagerId(vmManagerId);
        return this;
    }

    /**
     * @param ipAddress
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * @return
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * @param ipAddress
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * @param macAddress
     */

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * @return
     */

    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * @param macAddress
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withMacAddress(String macAddress) {
        setMacAddress(macAddress);
        return this;
    }

    /**
     * @param associatedOn
     */

    public void setAssociatedOn(java.util.Date associatedOn) {
        this.associatedOn = associatedOn;
    }

    /**
     * @return
     */

    public java.util.Date getAssociatedOn() {
        return this.associatedOn;
    }

    /**
     * @param associatedOn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withAssociatedOn(java.util.Date associatedOn) {
        setAssociatedOn(associatedOn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ConnectorId: " + getConnectorId() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCapabilityList() != null)
            sb.append("CapabilityList: " + getCapabilityList() + ",");
        if (getVmManagerName() != null)
            sb.append("VmManagerName: " + getVmManagerName() + ",");
        if (getVmManagerType() != null)
            sb.append("VmManagerType: " + getVmManagerType() + ",");
        if (getVmManagerId() != null)
            sb.append("VmManagerId: " + getVmManagerId() + ",");
        if (getIpAddress() != null)
            sb.append("IpAddress: " + getIpAddress() + ",");
        if (getMacAddress() != null)
            sb.append("MacAddress: " + getMacAddress() + ",");
        if (getAssociatedOn() != null)
            sb.append("AssociatedOn: " + getAssociatedOn());
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
}
