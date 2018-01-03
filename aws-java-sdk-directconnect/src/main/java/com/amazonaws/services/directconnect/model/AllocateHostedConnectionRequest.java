/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to theHostedConnection operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocateHostedConnection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllocateHostedConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the interconnect or LAG on which the connection will be provisioned.
     * </p>
     * <p>
     * Example: dxcon-456abc78 or dxlag-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The numeric account ID of the customer for whom the connection will be provisioned.
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
     * The bandwidth of the connection.
     * </p>
     * <p>
     * Example: <code>500Mbps</code>
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps
     * </p>
     */
    private String bandwidth;
    /**
     * <p>
     * The name of the provisioned connection.
     * </p>
     * <p>
     * Example: "<code>500M Connection to AWS</code>"
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * The dedicated VLAN provisioned to the hosted connection.
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
     * The ID of the interconnect or LAG on which the connection will be provisioned.
     * </p>
     * <p>
     * Example: dxcon-456abc78 or dxlag-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param connectionId
     *        The ID of the interconnect or LAG on which the connection will be provisioned.</p>
     *        <p>
     *        Example: dxcon-456abc78 or dxlag-abc123
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the interconnect or LAG on which the connection will be provisioned.
     * </p>
     * <p>
     * Example: dxcon-456abc78 or dxlag-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The ID of the interconnect or LAG on which the connection will be provisioned.</p>
     *         <p>
     *         Example: dxcon-456abc78 or dxlag-abc123
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the interconnect or LAG on which the connection will be provisioned.
     * </p>
     * <p>
     * Example: dxcon-456abc78 or dxlag-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param connectionId
     *        The ID of the interconnect or LAG on which the connection will be provisioned.</p>
     *        <p>
     *        Example: dxcon-456abc78 or dxlag-abc123
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostedConnectionRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The numeric account ID of the customer for whom the connection will be provisioned.
     * </p>
     * <p>
     * Example: 123443215678
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param ownerAccount
     *        The numeric account ID of the customer for whom the connection will be provisioned.</p>
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
     * The numeric account ID of the customer for whom the connection will be provisioned.
     * </p>
     * <p>
     * Example: 123443215678
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The numeric account ID of the customer for whom the connection will be provisioned.</p>
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
     * The numeric account ID of the customer for whom the connection will be provisioned.
     * </p>
     * <p>
     * Example: 123443215678
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param ownerAccount
     *        The numeric account ID of the customer for whom the connection will be provisioned.</p>
     *        <p>
     *        Example: 123443215678
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostedConnectionRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     * <p>
     * Example: <code>500Mbps</code>
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps
     * </p>
     * 
     * @param bandwidth
     *        The bandwidth of the connection.</p>
     *        <p>
     *        Example: <code>500Mbps</code>
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps
     */

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     * <p>
     * Example: <code>500Mbps</code>
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps
     * </p>
     * 
     * @return The bandwidth of the connection.</p>
     *         <p>
     *         Example: <code>500Mbps</code>
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps
     */

    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     * <p>
     * Example: <code>500Mbps</code>
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps
     * </p>
     * 
     * @param bandwidth
     *        The bandwidth of the connection.</p>
     *        <p>
     *        Example: <code>500Mbps</code>
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostedConnectionRequest withBandwidth(String bandwidth) {
        setBandwidth(bandwidth);
        return this;
    }

    /**
     * <p>
     * The name of the provisioned connection.
     * </p>
     * <p>
     * Example: "<code>500M Connection to AWS</code>"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param connectionName
     *        The name of the provisioned connection.</p>
     *        <p>
     *        Example: "<code>500M Connection to AWS</code>"
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the provisioned connection.
     * </p>
     * <p>
     * Example: "<code>500M Connection to AWS</code>"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The name of the provisioned connection.</p>
     *         <p>
     *         Example: "<code>500M Connection to AWS</code>"
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the provisioned connection.
     * </p>
     * <p>
     * Example: "<code>500M Connection to AWS</code>"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param connectionName
     *        The name of the provisioned connection.</p>
     *        <p>
     *        Example: "<code>500M Connection to AWS</code>"
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostedConnectionRequest withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * The dedicated VLAN provisioned to the hosted connection.
     * </p>
     * <p>
     * Example: 101
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param vlan
     *        The dedicated VLAN provisioned to the hosted connection.</p>
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
     * The dedicated VLAN provisioned to the hosted connection.
     * </p>
     * <p>
     * Example: 101
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The dedicated VLAN provisioned to the hosted connection.</p>
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
     * The dedicated VLAN provisioned to the hosted connection.
     * </p>
     * <p>
     * Example: 101
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param vlan
     *        The dedicated VLAN provisioned to the hosted connection.</p>
     *        <p>
     *        Example: 101
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostedConnectionRequest withVlan(Integer vlan) {
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
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getBandwidth() != null)
            sb.append("Bandwidth: ").append(getBandwidth()).append(",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getVlan() != null)
            sb.append("Vlan: ").append(getVlan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateHostedConnectionRequest == false)
            return false;
        AllocateHostedConnectionRequest other = (AllocateHostedConnectionRequest) obj;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
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

        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        return hashCode;
    }

    @Override
    public AllocateHostedConnectionRequest clone() {
        return (AllocateHostedConnectionRequest) super.clone();
    }

}
