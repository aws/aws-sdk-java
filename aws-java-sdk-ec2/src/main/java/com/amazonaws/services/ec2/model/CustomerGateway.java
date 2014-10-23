/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a customer gateway.
 * </p>
 */
public class CustomerGateway implements Serializable {

    /**
     * The ID of the customer gateway.
     */
    private String customerGatewayId;

    /**
     * The current state of the customer gateway (<code>pending | available |
     * deleting | deleted</code>).
     */
    private String state;

    /**
     * The type of VPN connection the customer gateway supports
     * (<code>ipsec.1</code>).
     */
    private String type;

    /**
     * The Internet-routable IP address of the customer gateway's outside
     * interface.
     */
    private String ipAddress;

    /**
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     * Number (ASN).
     */
    private String bgpAsn;

    /**
     * Any tags assigned to the customer gateway.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The ID of the customer gateway.
     *
     * @return The ID of the customer gateway.
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }
    
    /**
     * The ID of the customer gateway.
     *
     * @param customerGatewayId The ID of the customer gateway.
     */
    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }
    
    /**
     * The ID of the customer gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayId The ID of the customer gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CustomerGateway withCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }

    /**
     * The current state of the customer gateway (<code>pending | available |
     * deleting | deleted</code>).
     *
     * @return The current state of the customer gateway (<code>pending | available |
     *         deleting | deleted</code>).
     */
    public String getState() {
        return state;
    }
    
    /**
     * The current state of the customer gateway (<code>pending | available |
     * deleting | deleted</code>).
     *
     * @param state The current state of the customer gateway (<code>pending | available |
     *         deleting | deleted</code>).
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The current state of the customer gateway (<code>pending | available |
     * deleting | deleted</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The current state of the customer gateway (<code>pending | available |
     *         deleting | deleted</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CustomerGateway withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The type of VPN connection the customer gateway supports
     * (<code>ipsec.1</code>).
     *
     * @return The type of VPN connection the customer gateway supports
     *         (<code>ipsec.1</code>).
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of VPN connection the customer gateway supports
     * (<code>ipsec.1</code>).
     *
     * @param type The type of VPN connection the customer gateway supports
     *         (<code>ipsec.1</code>).
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of VPN connection the customer gateway supports
     * (<code>ipsec.1</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The type of VPN connection the customer gateway supports
     *         (<code>ipsec.1</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CustomerGateway withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The Internet-routable IP address of the customer gateway's outside
     * interface.
     *
     * @return The Internet-routable IP address of the customer gateway's outside
     *         interface.
     */
    public String getIpAddress() {
        return ipAddress;
    }
    
    /**
     * The Internet-routable IP address of the customer gateway's outside
     * interface.
     *
     * @param ipAddress The Internet-routable IP address of the customer gateway's outside
     *         interface.
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    /**
     * The Internet-routable IP address of the customer gateway's outside
     * interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipAddress The Internet-routable IP address of the customer gateway's outside
     *         interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CustomerGateway withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     * Number (ASN).
     *
     * @return The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     *         Number (ASN).
     */
    public String getBgpAsn() {
        return bgpAsn;
    }
    
    /**
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     * Number (ASN).
     *
     * @param bgpAsn The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     *         Number (ASN).
     */
    public void setBgpAsn(String bgpAsn) {
        this.bgpAsn = bgpAsn;
    }
    
    /**
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     * Number (ASN).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bgpAsn The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     *         Number (ASN).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CustomerGateway withBgpAsn(String bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * Any tags assigned to the customer gateway.
     *
     * @return Any tags assigned to the customer gateway.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the customer gateway.
     *
     * @param tags Any tags assigned to the customer gateway.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * Any tags assigned to the customer gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the customer gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CustomerGateway withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Any tags assigned to the customer gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the customer gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CustomerGateway withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
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
        if (getCustomerGatewayId() != null) sb.append("CustomerGatewayId: " + getCustomerGatewayId() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getIpAddress() != null) sb.append("IpAddress: " + getIpAddress() + ",");
        if (getBgpAsn() != null) sb.append("BgpAsn: " + getBgpAsn() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getBgpAsn() == null) ? 0 : getBgpAsn().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CustomerGateway == false) return false;
        CustomerGateway other = (CustomerGateway)obj;
        
        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null) return false;
        if (other.getCustomerGatewayId() != null && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getIpAddress() == null ^ this.getIpAddress() == null) return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false) return false; 
        if (other.getBgpAsn() == null ^ this.getBgpAsn() == null) return false;
        if (other.getBgpAsn() != null && other.getBgpAsn().equals(this.getBgpAsn()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    