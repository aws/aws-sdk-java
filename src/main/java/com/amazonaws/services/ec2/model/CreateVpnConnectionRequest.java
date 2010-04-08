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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * 
 * </p>
 */
public class CreateVpnConnectionRequest extends AmazonWebServiceRequest {

    /**
     * The type of VPN connection.
     */
    private String type;

    /**
     * The ID of the customer gateway.
     */
    private String customerGatewayId;

    /**
     * The ID of the VPN gateway.
     */
    private String vpnGatewayId;

    /**
     * The type of VPN connection.
     *
     * @return The type of VPN connection.
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of VPN connection.
     *
     * @param type The type of VPN connection.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The type of VPN connection.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateVpnConnectionRequest withType(String type) {
        this.type = type;
        return this;
    }
    
    
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
    public CreateVpnConnectionRequest withCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    
    
    /**
     * The ID of the VPN gateway.
     *
     * @return The ID of the VPN gateway.
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }
    
    /**
     * The ID of the VPN gateway.
     *
     * @param vpnGatewayId The ID of the VPN gateway.
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }
    
    /**
     * The ID of the VPN gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayId The ID of the VPN gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateVpnConnectionRequest withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("Type: " + type + ", ");
        sb.append("CustomerGatewayId: " + customerGatewayId + ", ");
        sb.append("VpnGatewayId: " + vpnGatewayId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    