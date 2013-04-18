/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.directconnect.model;
import java.io.Serializable;

/**
 * <p>
 * A structure containing information about a new public virtual interface.
 * </p>
 */
public class NewPublicVirtualInterface  implements Serializable  {

    /**
     * The name of the virtual interface assigned by the customer <p>Example:
     * "Dev VPC"
     */
    private String virtualInterfaceName;

    /**
     * VLAN ID <p>Example: 101
     */
    private Integer vlan;

    /**
     * Autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration <p>Example: 65000
     */
    private Integer asn;

    /**
     * Authentication key for BGP configuration <p>Example: asdf34example
     */
    private String authKey;

    /**
     * IP address assigned to the Amazon interface. <p>Example: 192.168.1.1
     */
    private String amazonAddress;

    private String customerAddress;

    /**
     * A list of route filter prefixes.
     */
    private java.util.List<RouteFilterPrefix> routeFilterPrefixes;

    /**
     * The name of the virtual interface assigned by the customer <p>Example:
     * "Dev VPC"
     *
     * @return The name of the virtual interface assigned by the customer <p>Example:
     *         "Dev VPC"
     */
    public String getVirtualInterfaceName() {
        return virtualInterfaceName;
    }
    
    /**
     * The name of the virtual interface assigned by the customer <p>Example:
     * "Dev VPC"
     *
     * @param virtualInterfaceName The name of the virtual interface assigned by the customer <p>Example:
     *         "Dev VPC"
     */
    public void setVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
    }
    
    /**
     * The name of the virtual interface assigned by the customer <p>Example:
     * "Dev VPC"
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualInterfaceName The name of the virtual interface assigned by the customer <p>Example:
     *         "Dev VPC"
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NewPublicVirtualInterface withVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
        return this;
    }
    
    
    /**
     * VLAN ID <p>Example: 101
     *
     * @return VLAN ID <p>Example: 101
     */
    public Integer getVlan() {
        return vlan;
    }
    
    /**
     * VLAN ID <p>Example: 101
     *
     * @param vlan VLAN ID <p>Example: 101
     */
    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }
    
    /**
     * VLAN ID <p>Example: 101
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vlan VLAN ID <p>Example: 101
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NewPublicVirtualInterface withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }
    
    
    /**
     * Autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration <p>Example: 65000
     *
     * @return Autonomous system (AS) number for Border Gateway Protocol (BGP)
     *         configuration <p>Example: 65000
     */
    public Integer getAsn() {
        return asn;
    }
    
    /**
     * Autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration <p>Example: 65000
     *
     * @param asn Autonomous system (AS) number for Border Gateway Protocol (BGP)
     *         configuration <p>Example: 65000
     */
    public void setAsn(Integer asn) {
        this.asn = asn;
    }
    
    /**
     * Autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration <p>Example: 65000
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param asn Autonomous system (AS) number for Border Gateway Protocol (BGP)
     *         configuration <p>Example: 65000
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NewPublicVirtualInterface withAsn(Integer asn) {
        this.asn = asn;
        return this;
    }
    
    
    /**
     * Authentication key for BGP configuration <p>Example: asdf34example
     *
     * @return Authentication key for BGP configuration <p>Example: asdf34example
     */
    public String getAuthKey() {
        return authKey;
    }
    
    /**
     * Authentication key for BGP configuration <p>Example: asdf34example
     *
     * @param authKey Authentication key for BGP configuration <p>Example: asdf34example
     */
    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }
    
    /**
     * Authentication key for BGP configuration <p>Example: asdf34example
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param authKey Authentication key for BGP configuration <p>Example: asdf34example
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NewPublicVirtualInterface withAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    
    
    /**
     * IP address assigned to the Amazon interface. <p>Example: 192.168.1.1
     *
     * @return IP address assigned to the Amazon interface. <p>Example: 192.168.1.1
     */
    public String getAmazonAddress() {
        return amazonAddress;
    }
    
    /**
     * IP address assigned to the Amazon interface. <p>Example: 192.168.1.1
     *
     * @param amazonAddress IP address assigned to the Amazon interface. <p>Example: 192.168.1.1
     */
    public void setAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
    }
    
    /**
     * IP address assigned to the Amazon interface. <p>Example: 192.168.1.1
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param amazonAddress IP address assigned to the Amazon interface. <p>Example: 192.168.1.1
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NewPublicVirtualInterface withAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
        return this;
    }
    
    
    /**
     * Returns the value of the CustomerAddress property for this object.
     *
     * @return The value of the CustomerAddress property for this object.
     */
    public String getCustomerAddress() {
        return customerAddress;
    }
    
    /**
     * Sets the value of the CustomerAddress property for this object.
     *
     * @param customerAddress The new value for the CustomerAddress property for this object.
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    
    /**
     * Sets the value of the CustomerAddress property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerAddress The new value for the CustomerAddress property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NewPublicVirtualInterface withCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }
    
    
    /**
     * A list of route filter prefixes.
     *
     * @return A list of route filter prefixes.
     */
    public java.util.List<RouteFilterPrefix> getRouteFilterPrefixes() {
        
        if (routeFilterPrefixes == null) {
            routeFilterPrefixes = new java.util.ArrayList<RouteFilterPrefix>();
        }
        return routeFilterPrefixes;
    }
    
    /**
     * A list of route filter prefixes.
     *
     * @param routeFilterPrefixes A list of route filter prefixes.
     */
    public void setRouteFilterPrefixes(java.util.Collection<RouteFilterPrefix> routeFilterPrefixes) {
        if (routeFilterPrefixes == null) {
            this.routeFilterPrefixes = null;
            return;
        }

        java.util.List<RouteFilterPrefix> routeFilterPrefixesCopy = new java.util.ArrayList<RouteFilterPrefix>(routeFilterPrefixes.size());
        routeFilterPrefixesCopy.addAll(routeFilterPrefixes);
        this.routeFilterPrefixes = routeFilterPrefixesCopy;
    }
    
    /**
     * A list of route filter prefixes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeFilterPrefixes A list of route filter prefixes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NewPublicVirtualInterface withRouteFilterPrefixes(RouteFilterPrefix... routeFilterPrefixes) {
        if (getRouteFilterPrefixes() == null) setRouteFilterPrefixes(new java.util.ArrayList<RouteFilterPrefix>(routeFilterPrefixes.length));
        for (RouteFilterPrefix value : routeFilterPrefixes) {
            getRouteFilterPrefixes().add(value);
        }
        return this;
    }
    
    /**
     * A list of route filter prefixes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeFilterPrefixes A list of route filter prefixes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NewPublicVirtualInterface withRouteFilterPrefixes(java.util.Collection<RouteFilterPrefix> routeFilterPrefixes) {
        if (routeFilterPrefixes == null) {
            this.routeFilterPrefixes = null;
        } else {
            java.util.List<RouteFilterPrefix> routeFilterPrefixesCopy = new java.util.ArrayList<RouteFilterPrefix>(routeFilterPrefixes.size());
            routeFilterPrefixesCopy.addAll(routeFilterPrefixes);
            this.routeFilterPrefixes = routeFilterPrefixesCopy;
        }

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");    	
        if (getVirtualInterfaceName() != null) sb.append("VirtualInterfaceName: " + getVirtualInterfaceName() + ",");    	
        if (getVlan() != null) sb.append("Vlan: " + getVlan() + ",");    	
        if (getAsn() != null) sb.append("Asn: " + getAsn() + ",");    	
        if (getAuthKey() != null) sb.append("AuthKey: " + getAuthKey() + ",");    	
        if (getAmazonAddress() != null) sb.append("AmazonAddress: " + getAmazonAddress() + ",");    	
        if (getCustomerAddress() != null) sb.append("CustomerAddress: " + getCustomerAddress() + ",");    	
        if (getRouteFilterPrefixes() != null) sb.append("RouteFilterPrefixes: " + getRouteFilterPrefixes() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NewPublicVirtualInterface == false) return false;
        NewPublicVirtualInterface other = (NewPublicVirtualInterface)obj;
        
        if (other.getVirtualInterfaceName() == null ^ this.getVirtualInterfaceName() == null) return false;
        if (other.getVirtualInterfaceName() != null && other.getVirtualInterfaceName().equals(this.getVirtualInterfaceName()) == false) return false; 
        if (other.getVlan() == null ^ this.getVlan() == null) return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false) return false; 
        if (other.getAsn() == null ^ this.getAsn() == null) return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false) return false; 
        if (other.getAuthKey() == null ^ this.getAuthKey() == null) return false;
        if (other.getAuthKey() != null && other.getAuthKey().equals(this.getAuthKey()) == false) return false; 
        if (other.getAmazonAddress() == null ^ this.getAmazonAddress() == null) return false;
        if (other.getAmazonAddress() != null && other.getAmazonAddress().equals(this.getAmazonAddress()) == false) return false; 
        if (other.getCustomerAddress() == null ^ this.getCustomerAddress() == null) return false;
        if (other.getCustomerAddress() != null && other.getCustomerAddress().equals(this.getCustomerAddress()) == false) return false; 
        if (other.getRouteFilterPrefixes() == null ^ this.getRouteFilterPrefixes() == null) return false;
        if (other.getRouteFilterPrefixes() != null && other.getRouteFilterPrefixes().equals(this.getRouteFilterPrefixes()) == false) return false; 
        return true;
    }
    
}
    