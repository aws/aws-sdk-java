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

/**
 * <p>
 * A connection represents the physical network connection between the AWS Direct Connect location and the customer.
 * </p>
 */
public class DeleteConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account that will own the new connection.
     * </p>
     */
    private String ownerAccount;

    private String connectionId;

    private String connectionName;

    private String connectionState;

    private String region;

    private String location;
    /**
     * <p>
     * Bandwidth of the connection.
     * </p>
     * <p>
     * Example: 1Gbps (for regular connections), or 500Mbps (for hosted connections)
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String bandwidth;

    private Integer vlan;
    /**
     * <p>
     * The name of the AWS Direct Connect service provider associated with the connection.
     * </p>
     */
    private String partnerName;
    /**
     * <p>
     * The time of the most recent call to DescribeConnectionLoa for this Connection.
     * </p>
     */
    private java.util.Date loaIssueTime;

    /**
     * <p>
     * The AWS account that will own the new connection.
     * </p>
     * 
     * @param ownerAccount
     *        The AWS account that will own the new connection.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The AWS account that will own the new connection.
     * </p>
     * 
     * @return The AWS account that will own the new connection.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The AWS account that will own the new connection.
     * </p>
     * 
     * @param ownerAccount
     *        The AWS account that will own the new connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionResult withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * @param connectionId
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * @return
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @param connectionId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionResult withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * @param connectionName
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * @return
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * @param connectionName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionResult withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * @param connectionState
     * @see ConnectionState
     */

    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }

    /**
     * @return
     * @see ConnectionState
     */

    public String getConnectionState() {
        return this.connectionState;
    }

    /**
     * @param connectionState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionState
     */

    public DeleteConnectionResult withConnectionState(String connectionState) {
        setConnectionState(connectionState);
        return this;
    }

    /**
     * @param connectionState
     * @see ConnectionState
     */

    public void setConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState.toString();
    }

    /**
     * @param connectionState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionState
     */

    public DeleteConnectionResult withConnectionState(ConnectionState connectionState) {
        setConnectionState(connectionState);
        return this;
    }

    /**
     * @param region
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * @param region
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionResult withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * @param location
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * @param location
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * Bandwidth of the connection.
     * </p>
     * <p>
     * Example: 1Gbps (for regular connections), or 500Mbps (for hosted connections)
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param bandwidth
     *        Bandwidth of the connection.</p>
     *        <p>
     *        Example: 1Gbps (for regular connections), or 500Mbps (for hosted connections)
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * <p>
     * Bandwidth of the connection.
     * </p>
     * <p>
     * Example: 1Gbps (for regular connections), or 500Mbps (for hosted connections)
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return Bandwidth of the connection.</p>
     *         <p>
     *         Example: 1Gbps (for regular connections), or 500Mbps (for hosted connections)
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * <p>
     * Bandwidth of the connection.
     * </p>
     * <p>
     * Example: 1Gbps (for regular connections), or 500Mbps (for hosted connections)
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param bandwidth
     *        Bandwidth of the connection.</p>
     *        <p>
     *        Example: 1Gbps (for regular connections), or 500Mbps (for hosted connections)
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionResult withBandwidth(String bandwidth) {
        setBandwidth(bandwidth);
        return this;
    }

    /**
     * @param vlan
     */

    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    /**
     * @return
     */

    public Integer getVlan() {
        return this.vlan;
    }

    /**
     * @param vlan
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionResult withVlan(Integer vlan) {
        setVlan(vlan);
        return this;
    }

    /**
     * <p>
     * The name of the AWS Direct Connect service provider associated with the connection.
     * </p>
     * 
     * @param partnerName
     *        The name of the AWS Direct Connect service provider associated with the connection.
     */

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    /**
     * <p>
     * The name of the AWS Direct Connect service provider associated with the connection.
     * </p>
     * 
     * @return The name of the AWS Direct Connect service provider associated with the connection.
     */

    public String getPartnerName() {
        return this.partnerName;
    }

    /**
     * <p>
     * The name of the AWS Direct Connect service provider associated with the connection.
     * </p>
     * 
     * @param partnerName
     *        The name of the AWS Direct Connect service provider associated with the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionResult withPartnerName(String partnerName) {
        setPartnerName(partnerName);
        return this;
    }

    /**
     * <p>
     * The time of the most recent call to DescribeConnectionLoa for this Connection.
     * </p>
     * 
     * @param loaIssueTime
     *        The time of the most recent call to DescribeConnectionLoa for this Connection.
     */

    public void setLoaIssueTime(java.util.Date loaIssueTime) {
        this.loaIssueTime = loaIssueTime;
    }

    /**
     * <p>
     * The time of the most recent call to DescribeConnectionLoa for this Connection.
     * </p>
     * 
     * @return The time of the most recent call to DescribeConnectionLoa for this Connection.
     */

    public java.util.Date getLoaIssueTime() {
        return this.loaIssueTime;
    }

    /**
     * <p>
     * The time of the most recent call to DescribeConnectionLoa for this Connection.
     * </p>
     * 
     * @param loaIssueTime
     *        The time of the most recent call to DescribeConnectionLoa for this Connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionResult withLoaIssueTime(java.util.Date loaIssueTime) {
        setLoaIssueTime(loaIssueTime);
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
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: " + getOwnerAccount() + ",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: " + getConnectionId() + ",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: " + getConnectionName() + ",");
        if (getConnectionState() != null)
            sb.append("ConnectionState: " + getConnectionState() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getBandwidth() != null)
            sb.append("Bandwidth: " + getBandwidth() + ",");
        if (getVlan() != null)
            sb.append("Vlan: " + getVlan() + ",");
        if (getPartnerName() != null)
            sb.append("PartnerName: " + getPartnerName() + ",");
        if (getLoaIssueTime() != null)
            sb.append("LoaIssueTime: " + getLoaIssueTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConnectionResult == false)
            return false;
        DeleteConnectionResult other = (DeleteConnectionResult) obj;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getConnectionState() == null ^ this.getConnectionState() == null)
            return false;
        if (other.getConnectionState() != null && other.getConnectionState().equals(this.getConnectionState()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getVlan() == null ^ this.getVlan() == null)
            return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false)
            return false;
        if (other.getPartnerName() == null ^ this.getPartnerName() == null)
            return false;
        if (other.getPartnerName() != null && other.getPartnerName().equals(this.getPartnerName()) == false)
            return false;
        if (other.getLoaIssueTime() == null ^ this.getLoaIssueTime() == null)
            return false;
        if (other.getLoaIssueTime() != null && other.getLoaIssueTime().equals(this.getLoaIssueTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getConnectionState() == null) ? 0 : getConnectionState().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        hashCode = prime * hashCode + ((getPartnerName() == null) ? 0 : getPartnerName().hashCode());
        hashCode = prime * hashCode + ((getLoaIssueTime() == null) ? 0 : getLoaIssueTime().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConnectionResult clone() {
        try {
            return (DeleteConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
