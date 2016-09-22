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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the AllocateConnectionOnInterconnect operation.
 * </p>
 */
public class AllocateConnectionOnInterconnectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Bandwidth of the connection.
     * </p>
     * <p>
     * Example: "<i>500Mbps</i>"
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Values: 50M, 100M, 200M, 300M, 400M, or 500M
     * </p>
     */
    private String bandwidth;
    /**
     * <p>
     * Name of the provisioned connection.
     * </p>
     * <p>
     * Example: "<i>500M Connection to AWS</i>"
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * Numeric account Id of the customer for whom the connection will be provisioned.
     * </p>
     * <p>
     * Example: 123443215678
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * ID of the interconnect on which the connection will be provisioned.
     * </p>
     * <p>
     * Example: dxcon-456abc78
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String interconnectId;
    /**
     * <p>
     * The dedicated VLAN provisioned to the connection.
     * </p>
     * <p>
     * Example: 101
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private Integer vlan;

    /**
     * <p>
     * Bandwidth of the connection.
     * </p>
     * <p>
     * Example: "<i>500Mbps</i>"
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Values: 50M, 100M, 200M, 300M, 400M, or 500M
     * </p>
     * 
     * @param bandwidth
     *        Bandwidth of the connection.</p>
     *        <p>
     *        Example: "<i>500Mbps</i>"
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Values: 50M, 100M, 200M, 300M, 400M, or 500M
     */

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * <p>
     * Bandwidth of the connection.
     * </p>
     * <p>
     * Example: "<i>500Mbps</i>"
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Values: 50M, 100M, 200M, 300M, 400M, or 500M
     * </p>
     * 
     * @return Bandwidth of the connection.</p>
     *         <p>
     *         Example: "<i>500Mbps</i>"
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Values: 50M, 100M, 200M, 300M, 400M, or 500M
     */

    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * <p>
     * Bandwidth of the connection.
     * </p>
     * <p>
     * Example: "<i>500Mbps</i>"
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Values: 50M, 100M, 200M, 300M, 400M, or 500M
     * </p>
     * 
     * @param bandwidth
     *        Bandwidth of the connection.</p>
     *        <p>
     *        Example: "<i>500Mbps</i>"
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Values: 50M, 100M, 200M, 300M, 400M, or 500M
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectRequest withBandwidth(String bandwidth) {
        setBandwidth(bandwidth);
        return this;
    }

    /**
     * <p>
     * Name of the provisioned connection.
     * </p>
     * <p>
     * Example: "<i>500M Connection to AWS</i>"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param connectionName
     *        Name of the provisioned connection.</p>
     *        <p>
     *        Example: "<i>500M Connection to AWS</i>"
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * Name of the provisioned connection.
     * </p>
     * <p>
     * Example: "<i>500M Connection to AWS</i>"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return Name of the provisioned connection.</p>
     *         <p>
     *         Example: "<i>500M Connection to AWS</i>"
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * Name of the provisioned connection.
     * </p>
     * <p>
     * Example: "<i>500M Connection to AWS</i>"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param connectionName
     *        Name of the provisioned connection.</p>
     *        <p>
     *        Example: "<i>500M Connection to AWS</i>"
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectRequest withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * Numeric account Id of the customer for whom the connection will be provisioned.
     * </p>
     * <p>
     * Example: 123443215678
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param ownerAccount
     *        Numeric account Id of the customer for whom the connection will be provisioned.</p>
     *        <p>
     *        Example: 123443215678
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * Numeric account Id of the customer for whom the connection will be provisioned.
     * </p>
     * <p>
     * Example: 123443215678
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return Numeric account Id of the customer for whom the connection will be provisioned.</p>
     *         <p>
     *         Example: 123443215678
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * Numeric account Id of the customer for whom the connection will be provisioned.
     * </p>
     * <p>
     * Example: 123443215678
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param ownerAccount
     *        Numeric account Id of the customer for whom the connection will be provisioned.</p>
     *        <p>
     *        Example: 123443215678
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * ID of the interconnect on which the connection will be provisioned.
     * </p>
     * <p>
     * Example: dxcon-456abc78
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param interconnectId
     *        ID of the interconnect on which the connection will be provisioned.</p>
     *        <p>
     *        Example: dxcon-456abc78
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
    }

    /**
     * <p>
     * ID of the interconnect on which the connection will be provisioned.
     * </p>
     * <p>
     * Example: dxcon-456abc78
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return ID of the interconnect on which the connection will be provisioned.</p>
     *         <p>
     *         Example: dxcon-456abc78
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getInterconnectId() {
        return this.interconnectId;
    }

    /**
     * <p>
     * ID of the interconnect on which the connection will be provisioned.
     * </p>
     * <p>
     * Example: dxcon-456abc78
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param interconnectId
     *        ID of the interconnect on which the connection will be provisioned.</p>
     *        <p>
     *        Example: dxcon-456abc78
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectRequest withInterconnectId(String interconnectId) {
        setInterconnectId(interconnectId);
        return this;
    }

    /**
     * <p>
     * The dedicated VLAN provisioned to the connection.
     * </p>
     * <p>
     * Example: 101
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param vlan
     *        The dedicated VLAN provisioned to the connection.</p>
     *        <p>
     *        Example: 101
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    /**
     * <p>
     * The dedicated VLAN provisioned to the connection.
     * </p>
     * <p>
     * Example: 101
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The dedicated VLAN provisioned to the connection.</p>
     *         <p>
     *         Example: 101
     *         </p>
     *         <p>
     *         Default: None
     */

    public Integer getVlan() {
        return this.vlan;
    }

    /**
     * <p>
     * The dedicated VLAN provisioned to the connection.
     * </p>
     * <p>
     * Example: 101
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param vlan
     *        The dedicated VLAN provisioned to the connection.</p>
     *        <p>
     *        Example: 101
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateConnectionOnInterconnectRequest withVlan(Integer vlan) {
        setVlan(vlan);
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
        if (getBandwidth() != null)
            sb.append("Bandwidth: " + getBandwidth() + ",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: " + getConnectionName() + ",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: " + getOwnerAccount() + ",");
        if (getInterconnectId() != null)
            sb.append("InterconnectId: " + getInterconnectId() + ",");
        if (getVlan() != null)
            sb.append("Vlan: " + getVlan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateConnectionOnInterconnectRequest == false)
            return false;
        AllocateConnectionOnInterconnectRequest other = (AllocateConnectionOnInterconnectRequest) obj;
        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getInterconnectId() == null ^ this.getInterconnectId() == null)
            return false;
        if (other.getInterconnectId() != null && other.getInterconnectId().equals(this.getInterconnectId()) == false)
            return false;
        if (other.getVlan() == null ^ this.getVlan() == null)
            return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getInterconnectId() == null) ? 0 : getInterconnectId().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        return hashCode;
    }

    @Override
    public AllocateConnectionOnInterconnectRequest clone() {
        return (AllocateConnectionOnInterconnectRequest) super.clone();
    }
}
