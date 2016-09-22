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
 * A structure containing information about a new public virtual interface.
 * </p>
 */
public class NewPublicVirtualInterface implements Serializable, Cloneable {

    private String virtualInterfaceName;

    private Integer vlan;

    private Integer asn;

    private String authKey;

    private String amazonAddress;

    private String customerAddress;

    private com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> routeFilterPrefixes;

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

    public NewPublicVirtualInterface withVirtualInterfaceName(String virtualInterfaceName) {
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

    public NewPublicVirtualInterface withVlan(Integer vlan) {
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

    public NewPublicVirtualInterface withAsn(Integer asn) {
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

    public NewPublicVirtualInterface withAuthKey(String authKey) {
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

    public NewPublicVirtualInterface withAmazonAddress(String amazonAddress) {
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

    public NewPublicVirtualInterface withCustomerAddress(String customerAddress) {
        setCustomerAddress(customerAddress);
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

    public NewPublicVirtualInterface withRouteFilterPrefixes(RouteFilterPrefix... routeFilterPrefixes) {
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

    public NewPublicVirtualInterface withRouteFilterPrefixes(java.util.Collection<RouteFilterPrefix> routeFilterPrefixes) {
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

        if (obj instanceof NewPublicVirtualInterface == false)
            return false;
        NewPublicVirtualInterface other = (NewPublicVirtualInterface) obj;
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

        hashCode = prime * hashCode + ((getVirtualInterfaceName() == null) ? 0 : getVirtualInterfaceName().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getAuthKey() == null) ? 0 : getAuthKey().hashCode());
        hashCode = prime * hashCode + ((getAmazonAddress() == null) ? 0 : getAmazonAddress().hashCode());
        hashCode = prime * hashCode + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        hashCode = prime * hashCode + ((getRouteFilterPrefixes() == null) ? 0 : getRouteFilterPrefixes().hashCode());
        return hashCode;
    }

    @Override
    public NewPublicVirtualInterface clone() {
        try {
            return (NewPublicVirtualInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
