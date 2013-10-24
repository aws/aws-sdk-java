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
 * A structure containing information about a new private virtual interface.
 * </p>
 */
public class NewPrivateVirtualInterface implements Serializable {

    /**
     * The name of the virtual interface assigned by the customer.
     * <p>Example: "My VPC"
     */
    private String virtualInterfaceName;

    /**
     * The VLAN ID. <p>Example: 101
     */
    private Integer vlan;

    /**
     * Autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration. <p>Example: 65000
     */
    private Integer asn;

    /**
     * Authentication key for BGP configuration. <p>Example: asdf34example
     */
    private String authKey;

    /**
     * IP address assigned to the Amazon interface. <p>Example:
     * 192.168.1.1/30
     */
    private String amazonAddress;

    /**
     * IP address assigned to the customer interface. <p>Example:
     * 192.168.1.2/30
     */
    private String customerAddress;

    /**
     * The ID of the virtual private gateway to a VPC. This only applies to
     * private virtual interfaces. <p>Example: vgw-123er56
     */
    private String virtualGatewayId;

    /**
     * The name of the virtual interface assigned by the customer.
     * <p>Example: "My VPC"
     *
     * @return The name of the virtual interface assigned by the customer.
     *         <p>Example: "My VPC"
     */
    public String getVirtualInterfaceName() {
        return virtualInterfaceName;
    }
    
    /**
     * The name of the virtual interface assigned by the customer.
     * <p>Example: "My VPC"
     *
     * @param virtualInterfaceName The name of the virtual interface assigned by the customer.
     *         <p>Example: "My VPC"
     */
    public void setVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
    }
    
    /**
     * The name of the virtual interface assigned by the customer.
     * <p>Example: "My VPC"
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualInterfaceName The name of the virtual interface assigned by the customer.
     *         <p>Example: "My VPC"
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NewPrivateVirtualInterface withVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
        return this;
    }

    /**
     * The VLAN ID. <p>Example: 101
     *
     * @return The VLAN ID. <p>Example: 101
     */
    public Integer getVlan() {
        return vlan;
    }
    
    /**
     * The VLAN ID. <p>Example: 101
     *
     * @param vlan The VLAN ID. <p>Example: 101
     */
    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }
    
    /**
     * The VLAN ID. <p>Example: 101
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vlan The VLAN ID. <p>Example: 101
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NewPrivateVirtualInterface withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    /**
     * Autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration. <p>Example: 65000
     *
     * @return Autonomous system (AS) number for Border Gateway Protocol (BGP)
     *         configuration. <p>Example: 65000
     */
    public Integer getAsn() {
        return asn;
    }
    
    /**
     * Autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration. <p>Example: 65000
     *
     * @param asn Autonomous system (AS) number for Border Gateway Protocol (BGP)
     *         configuration. <p>Example: 65000
     */
    public void setAsn(Integer asn) {
        this.asn = asn;
    }
    
    /**
     * Autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration. <p>Example: 65000
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param asn Autonomous system (AS) number for Border Gateway Protocol (BGP)
     *         configuration. <p>Example: 65000
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NewPrivateVirtualInterface withAsn(Integer asn) {
        this.asn = asn;
        return this;
    }

    /**
     * Authentication key for BGP configuration. <p>Example: asdf34example
     *
     * @return Authentication key for BGP configuration. <p>Example: asdf34example
     */
    public String getAuthKey() {
        return authKey;
    }
    
    /**
     * Authentication key for BGP configuration. <p>Example: asdf34example
     *
     * @param authKey Authentication key for BGP configuration. <p>Example: asdf34example
     */
    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }
    
    /**
     * Authentication key for BGP configuration. <p>Example: asdf34example
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param authKey Authentication key for BGP configuration. <p>Example: asdf34example
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NewPrivateVirtualInterface withAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }

    /**
     * IP address assigned to the Amazon interface. <p>Example:
     * 192.168.1.1/30
     *
     * @return IP address assigned to the Amazon interface. <p>Example:
     *         192.168.1.1/30
     */
    public String getAmazonAddress() {
        return amazonAddress;
    }
    
    /**
     * IP address assigned to the Amazon interface. <p>Example:
     * 192.168.1.1/30
     *
     * @param amazonAddress IP address assigned to the Amazon interface. <p>Example:
     *         192.168.1.1/30
     */
    public void setAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
    }
    
    /**
     * IP address assigned to the Amazon interface. <p>Example:
     * 192.168.1.1/30
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param amazonAddress IP address assigned to the Amazon interface. <p>Example:
     *         192.168.1.1/30
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NewPrivateVirtualInterface withAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
        return this;
    }

    /**
     * IP address assigned to the customer interface. <p>Example:
     * 192.168.1.2/30
     *
     * @return IP address assigned to the customer interface. <p>Example:
     *         192.168.1.2/30
     */
    public String getCustomerAddress() {
        return customerAddress;
    }
    
    /**
     * IP address assigned to the customer interface. <p>Example:
     * 192.168.1.2/30
     *
     * @param customerAddress IP address assigned to the customer interface. <p>Example:
     *         192.168.1.2/30
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    
    /**
     * IP address assigned to the customer interface. <p>Example:
     * 192.168.1.2/30
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerAddress IP address assigned to the customer interface. <p>Example:
     *         192.168.1.2/30
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NewPrivateVirtualInterface withCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    /**
     * The ID of the virtual private gateway to a VPC. This only applies to
     * private virtual interfaces. <p>Example: vgw-123er56
     *
     * @return The ID of the virtual private gateway to a VPC. This only applies to
     *         private virtual interfaces. <p>Example: vgw-123er56
     */
    public String getVirtualGatewayId() {
        return virtualGatewayId;
    }
    
    /**
     * The ID of the virtual private gateway to a VPC. This only applies to
     * private virtual interfaces. <p>Example: vgw-123er56
     *
     * @param virtualGatewayId The ID of the virtual private gateway to a VPC. This only applies to
     *         private virtual interfaces. <p>Example: vgw-123er56
     */
    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }
    
    /**
     * The ID of the virtual private gateway to a VPC. This only applies to
     * private virtual interfaces. <p>Example: vgw-123er56
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualGatewayId The ID of the virtual private gateway to a VPC. This only applies to
     *         private virtual interfaces. <p>Example: vgw-123er56
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NewPrivateVirtualInterface withVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
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
        if (getVirtualGatewayId() != null) sb.append("VirtualGatewayId: " + getVirtualGatewayId() );
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
        hashCode = prime * hashCode + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NewPrivateVirtualInterface == false) return false;
        NewPrivateVirtualInterface other = (NewPrivateVirtualInterface)obj;
        
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
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null) return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false) return false; 
        return true;
    }
    
}
    