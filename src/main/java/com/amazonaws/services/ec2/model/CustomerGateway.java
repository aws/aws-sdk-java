/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Customer Gateway
 */
public class CustomerGateway {

    private String customerGatewayId;

    private String state;

    private String type;

    private String ipAddress;

    private String bgpAsn;

    /**
     * Returns the value of the CustomerGatewayId property for this object.
     *
     * @return The value of the CustomerGatewayId property for this object.
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }
    
    /**
     * Sets the value of the CustomerGatewayId property for this object.
     *
     * @param customerGatewayId The new value for the CustomerGatewayId property for this object.
     */
    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }
    
    /**
     * Sets the value of the CustomerGatewayId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayId The new value for the CustomerGatewayId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CustomerGateway withCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    
    
    /**
     * Returns the value of the State property for this object.
     *
     * @return The value of the State property for this object.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets the value of the State property for this object.
     *
     * @param state The new value for the State property for this object.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CustomerGateway withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * Returns the value of the Type property for this object.
     *
     * @return The value of the Type property for this object.
     */
    public String getType() {
        return type;
    }
    
    /**
     * Sets the value of the Type property for this object.
     *
     * @param type The new value for the Type property for this object.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Sets the value of the Type property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The new value for the Type property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CustomerGateway withType(String type) {
        this.type = type;
        return this;
    }
    
    
    /**
     * Returns the value of the IpAddress property for this object.
     *
     * @return The value of the IpAddress property for this object.
     */
    public String getIpAddress() {
        return ipAddress;
    }
    
    /**
     * Sets the value of the IpAddress property for this object.
     *
     * @param ipAddress The new value for the IpAddress property for this object.
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    /**
     * Sets the value of the IpAddress property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipAddress The new value for the IpAddress property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CustomerGateway withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    
    
    /**
     * Returns the value of the BgpAsn property for this object.
     *
     * @return The value of the BgpAsn property for this object.
     */
    public String getBgpAsn() {
        return bgpAsn;
    }
    
    /**
     * Sets the value of the BgpAsn property for this object.
     *
     * @param bgpAsn The new value for the BgpAsn property for this object.
     */
    public void setBgpAsn(String bgpAsn) {
        this.bgpAsn = bgpAsn;
    }
    
    /**
     * Sets the value of the BgpAsn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bgpAsn The new value for the BgpAsn property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CustomerGateway withBgpAsn(String bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }
    
    
}
    