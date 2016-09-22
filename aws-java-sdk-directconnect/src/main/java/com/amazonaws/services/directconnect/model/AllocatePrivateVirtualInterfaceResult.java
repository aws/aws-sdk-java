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
 * A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer.
 * </p>
 */
public class AllocatePrivateVirtualInterfaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The AWS account that will own the new virtual interface.
     * </p>
     */
    private String ownerAccount;

    private String virtualInterfaceId;

    private String location;

    private String connectionId;

    private String virtualInterfaceType;

    private String virtualInterfaceName;

    private Integer vlan;

    private Integer asn;

    private String authKey;

    private String amazonAddress;

    private String customerAddress;

    private String virtualInterfaceState;
    /**
     * <p>
     * Information for generating the customer router configuration.
     * </p>
     */
    private String customerRouterConfig;

    private String virtualGatewayId;

    private com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> routeFilterPrefixes;

    /**
     * <p>
     * The AWS account that will own the new virtual interface.
     * </p>
     * 
     * @param ownerAccount
     *        The AWS account that will own the new virtual interface.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The AWS account that will own the new virtual interface.
     * </p>
     * 
     * @return The AWS account that will own the new virtual interface.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The AWS account that will own the new virtual interface.
     * </p>
     * 
     * @param ownerAccount
     *        The AWS account that will own the new virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePrivateVirtualInterfaceResult withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * @param virtualInterfaceId
     */

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * @return
     */

    public String getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     * @param virtualInterfaceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePrivateVirtualInterfaceResult withVirtualInterfaceId(String virtualInterfaceId) {
        setVirtualInterfaceId(virtualInterfaceId);
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

    public AllocatePrivateVirtualInterfaceResult withLocation(String location) {
        setLocation(location);
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

    public AllocatePrivateVirtualInterfaceResult withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * @param virtualInterfaceType
     */

    public void setVirtualInterfaceType(String virtualInterfaceType) {
        this.virtualInterfaceType = virtualInterfaceType;
    }

    /**
     * @return
     */

    public String getVirtualInterfaceType() {
        return this.virtualInterfaceType;
    }

    /**
     * @param virtualInterfaceType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePrivateVirtualInterfaceResult withVirtualInterfaceType(String virtualInterfaceType) {
        setVirtualInterfaceType(virtualInterfaceType);
        return this;
    }

    /**
     * @param virtualInterfaceName
     */

    public void setVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
    }

    /**
     * @return
     */

    public String getVirtualInterfaceName() {
        return this.virtualInterfaceName;
    }

    /**
     * @param virtualInterfaceName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePrivateVirtualInterfaceResult withVirtualInterfaceName(String virtualInterfaceName) {
        setVirtualInterfaceName(virtualInterfaceName);
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

    public AllocatePrivateVirtualInterfaceResult withVlan(Integer vlan) {
        setVlan(vlan);
        return this;
    }

    /**
     * @param asn
     */

    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    /**
     * @return
     */

    public Integer getAsn() {
        return this.asn;
    }

    /**
     * @param asn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePrivateVirtualInterfaceResult withAsn(Integer asn) {
        setAsn(asn);
        return this;
    }

    /**
     * @param authKey
     */

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    /**
     * @return
     */

    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @param authKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePrivateVirtualInterfaceResult withAuthKey(String authKey) {
        setAuthKey(authKey);
        return this;
    }

    /**
     * @param amazonAddress
     */

    public void setAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
    }

    /**
     * @return
     */

    public String getAmazonAddress() {
        return this.amazonAddress;
    }

    /**
     * @param amazonAddress
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePrivateVirtualInterfaceResult withAmazonAddress(String amazonAddress) {
        setAmazonAddress(amazonAddress);
        return this;
    }

    /**
     * @param customerAddress
     */

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * @return
     */

    public String getCustomerAddress() {
        return this.customerAddress;
    }

    /**
     * @param customerAddress
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePrivateVirtualInterfaceResult withCustomerAddress(String customerAddress) {
        setCustomerAddress(customerAddress);
        return this;
    }

    /**
     * @param virtualInterfaceState
     * @see VirtualInterfaceState
     */

    public void setVirtualInterfaceState(String virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState;
    }

    /**
     * @return
     * @see VirtualInterfaceState
     */

    public String getVirtualInterfaceState() {
        return this.virtualInterfaceState;
    }

    /**
     * @param virtualInterfaceState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualInterfaceState
     */

    public AllocatePrivateVirtualInterfaceResult withVirtualInterfaceState(String virtualInterfaceState) {
        setVirtualInterfaceState(virtualInterfaceState);
        return this;
    }

    /**
     * @param virtualInterfaceState
     * @see VirtualInterfaceState
     */

    public void setVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState.toString();
    }

    /**
     * @param virtualInterfaceState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualInterfaceState
     */

    public AllocatePrivateVirtualInterfaceResult withVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        setVirtualInterfaceState(virtualInterfaceState);
        return this;
    }

    /**
     * <p>
     * Information for generating the customer router configuration.
     * </p>
     * 
     * @param customerRouterConfig
     *        Information for generating the customer router configuration.
     */

    public void setCustomerRouterConfig(String customerRouterConfig) {
        this.customerRouterConfig = customerRouterConfig;
    }

    /**
     * <p>
     * Information for generating the customer router configuration.
     * </p>
     * 
     * @return Information for generating the customer router configuration.
     */

    public String getCustomerRouterConfig() {
        return this.customerRouterConfig;
    }

    /**
     * <p>
     * Information for generating the customer router configuration.
     * </p>
     * 
     * @param customerRouterConfig
     *        Information for generating the customer router configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePrivateVirtualInterfaceResult withCustomerRouterConfig(String customerRouterConfig) {
        setCustomerRouterConfig(customerRouterConfig);
        return this;
    }

    /**
     * @param virtualGatewayId
     */

    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * @return
     */

    public String getVirtualGatewayId() {
        return this.virtualGatewayId;
    }

    /**
     * @param virtualGatewayId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePrivateVirtualInterfaceResult withVirtualGatewayId(String virtualGatewayId) {
        setVirtualGatewayId(virtualGatewayId);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<RouteFilterPrefix> getRouteFilterPrefixes() {
        if (routeFilterPrefixes == null) {
            routeFilterPrefixes = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>();
        }
        return routeFilterPrefixes;
    }

    /**
     * @param routeFilterPrefixes
     */

    public void setRouteFilterPrefixes(java.util.Collection<RouteFilterPrefix> routeFilterPrefixes) {
        if (routeFilterPrefixes == null) {
            this.routeFilterPrefixes = null;
            return;
        }

        this.routeFilterPrefixes = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(routeFilterPrefixes);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteFilterPrefixes(java.util.Collection)} or {@link #withRouteFilterPrefixes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param routeFilterPrefixes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePrivateVirtualInterfaceResult withRouteFilterPrefixes(RouteFilterPrefix... routeFilterPrefixes) {
        if (this.routeFilterPrefixes == null) {
            setRouteFilterPrefixes(new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(routeFilterPrefixes.length));
        }
        for (RouteFilterPrefix ele : routeFilterPrefixes) {
            this.routeFilterPrefixes.add(ele);
        }
        return this;
    }

    /**
     * @param routeFilterPrefixes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePrivateVirtualInterfaceResult withRouteFilterPrefixes(java.util.Collection<RouteFilterPrefix> routeFilterPrefixes) {
        setRouteFilterPrefixes(routeFilterPrefixes);
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
        if (getVirtualInterfaceId() != null)
            sb.append("VirtualInterfaceId: " + getVirtualInterfaceId() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: " + getConnectionId() + ",");
        if (getVirtualInterfaceType() != null)
            sb.append("VirtualInterfaceType: " + getVirtualInterfaceType() + ",");
        if (getVirtualInterfaceName() != null)
            sb.append("VirtualInterfaceName: " + getVirtualInterfaceName() + ",");
        if (getVlan() != null)
            sb.append("Vlan: " + getVlan() + ",");
        if (getAsn() != null)
            sb.append("Asn: " + getAsn() + ",");
        if (getAuthKey() != null)
            sb.append("AuthKey: " + getAuthKey() + ",");
        if (getAmazonAddress() != null)
            sb.append("AmazonAddress: " + getAmazonAddress() + ",");
        if (getCustomerAddress() != null)
            sb.append("CustomerAddress: " + getCustomerAddress() + ",");
        if (getVirtualInterfaceState() != null)
            sb.append("VirtualInterfaceState: " + getVirtualInterfaceState() + ",");
        if (getCustomerRouterConfig() != null)
            sb.append("CustomerRouterConfig: " + getCustomerRouterConfig() + ",");
        if (getVirtualGatewayId() != null)
            sb.append("VirtualGatewayId: " + getVirtualGatewayId() + ",");
        if (getRouteFilterPrefixes() != null)
            sb.append("RouteFilterPrefixes: " + getRouteFilterPrefixes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocatePrivateVirtualInterfaceResult == false)
            return false;
        AllocatePrivateVirtualInterfaceResult other = (AllocatePrivateVirtualInterfaceResult) obj;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getVirtualInterfaceType() == null ^ this.getVirtualInterfaceType() == null)
            return false;
        if (other.getVirtualInterfaceType() != null && other.getVirtualInterfaceType().equals(this.getVirtualInterfaceType()) == false)
            return false;
        if (other.getVirtualInterfaceName() == null ^ this.getVirtualInterfaceName() == null)
            return false;
        if (other.getVirtualInterfaceName() != null && other.getVirtualInterfaceName().equals(this.getVirtualInterfaceName()) == false)
            return false;
        if (other.getVlan() == null ^ this.getVlan() == null)
            return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getAuthKey() == null ^ this.getAuthKey() == null)
            return false;
        if (other.getAuthKey() != null && other.getAuthKey().equals(this.getAuthKey()) == false)
            return false;
        if (other.getAmazonAddress() == null ^ this.getAmazonAddress() == null)
            return false;
        if (other.getAmazonAddress() != null && other.getAmazonAddress().equals(this.getAmazonAddress()) == false)
            return false;
        if (other.getCustomerAddress() == null ^ this.getCustomerAddress() == null)
            return false;
        if (other.getCustomerAddress() != null && other.getCustomerAddress().equals(this.getCustomerAddress()) == false)
            return false;
        if (other.getVirtualInterfaceState() == null ^ this.getVirtualInterfaceState() == null)
            return false;
        if (other.getVirtualInterfaceState() != null && other.getVirtualInterfaceState().equals(this.getVirtualInterfaceState()) == false)
            return false;
        if (other.getCustomerRouterConfig() == null ^ this.getCustomerRouterConfig() == null)
            return false;
        if (other.getCustomerRouterConfig() != null && other.getCustomerRouterConfig().equals(this.getCustomerRouterConfig()) == false)
            return false;
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        if (other.getRouteFilterPrefixes() == null ^ this.getRouteFilterPrefixes() == null)
            return false;
        if (other.getRouteFilterPrefixes() != null && other.getRouteFilterPrefixes().equals(this.getRouteFilterPrefixes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getVirtualInterfaceType() == null) ? 0 : getVirtualInterfaceType().hashCode());
        hashCode = prime * hashCode + ((getVirtualInterfaceName() == null) ? 0 : getVirtualInterfaceName().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getAuthKey() == null) ? 0 : getAuthKey().hashCode());
        hashCode = prime * hashCode + ((getAmazonAddress() == null) ? 0 : getAmazonAddress().hashCode());
        hashCode = prime * hashCode + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        hashCode = prime * hashCode + ((getVirtualInterfaceState() == null) ? 0 : getVirtualInterfaceState().hashCode());
        hashCode = prime * hashCode + ((getCustomerRouterConfig() == null) ? 0 : getCustomerRouterConfig().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        hashCode = prime * hashCode + ((getRouteFilterPrefixes() == null) ? 0 : getRouteFilterPrefixes().hashCode());
        return hashCode;
    }

    @Override
    public AllocatePrivateVirtualInterfaceResult clone() {
        try {
            return (AllocatePrivateVirtualInterfaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
