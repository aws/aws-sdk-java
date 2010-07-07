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
 * <p>
 * The VpnConnection data type.
 * </p>
 */
public class VpnConnection {

    /**
     * Specifies the ID of the VPN gateway at the VPC end of the VPN
     * connection.
     */
    private String vpnConnectionId;

    /**
     * Describes the current state of the VPN connection. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     */
    private String state;

    /**
     * Contains configuration information in the native XML format for the
     * VPN connection's customer gateway. <p> This element is always present
     * in the CreateVpnConnection response; however, it's present in the
     * DescribeVpnConnections response only if the VPN connection is in the
     * <code>pending</code> or <code>available</code> state.
     */
    private String customerGatewayConfiguration;

    /**
     * Specifies the type of VPN connection.
     */
    private String type;

    /**
     * Specifies ID of the customer gateway at the end of the VPN connection.
     */
    private String customerGatewayId;

    /**
     * Specfies the ID of the VPN gateway at the VPC end of the VPN
     * connection.
     */
    private String vpnGatewayId;

    /**
     * Specifies the ID of the VPN gateway at the VPC end of the VPN
     * connection.
     *
     * @return Specifies the ID of the VPN gateway at the VPC end of the VPN
     *         connection.
     */
    public String getVpnConnectionId() {
        return vpnConnectionId;
    }
    
    /**
     * Specifies the ID of the VPN gateway at the VPC end of the VPN
     * connection.
     *
     * @param vpnConnectionId Specifies the ID of the VPN gateway at the VPC end of the VPN
     *         connection.
     */
    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }
    
    /**
     * Specifies the ID of the VPN gateway at the VPC end of the VPN
     * connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionId Specifies the ID of the VPN gateway at the VPC end of the VPN
     *         connection.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnConnection withVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    
    
    /**
     * Describes the current state of the VPN connection. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     *
     * @return Describes the current state of the VPN connection. Valid values are
     *         <code>pending</code>, <code>available</code>, <code>deleting</code>,
     *         and <code>deleted</code>.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Describes the current state of the VPN connection. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     *
     * @param state Describes the current state of the VPN connection. Valid values are
     *         <code>pending</code>, <code>available</code>, <code>deleting</code>,
     *         and <code>deleted</code>.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Describes the current state of the VPN connection. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state Describes the current state of the VPN connection. Valid values are
     *         <code>pending</code>, <code>available</code>, <code>deleting</code>,
     *         and <code>deleted</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnConnection withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * Contains configuration information in the native XML format for the
     * VPN connection's customer gateway. <p> This element is always present
     * in the CreateVpnConnection response; however, it's present in the
     * DescribeVpnConnections response only if the VPN connection is in the
     * <code>pending</code> or <code>available</code> state.
     *
     * @return Contains configuration information in the native XML format for the
     *         VPN connection's customer gateway. <p> This element is always present
     *         in the CreateVpnConnection response; however, it's present in the
     *         DescribeVpnConnections response only if the VPN connection is in the
     *         <code>pending</code> or <code>available</code> state.
     */
    public String getCustomerGatewayConfiguration() {
        return customerGatewayConfiguration;
    }
    
    /**
     * Contains configuration information in the native XML format for the
     * VPN connection's customer gateway. <p> This element is always present
     * in the CreateVpnConnection response; however, it's present in the
     * DescribeVpnConnections response only if the VPN connection is in the
     * <code>pending</code> or <code>available</code> state.
     *
     * @param customerGatewayConfiguration Contains configuration information in the native XML format for the
     *         VPN connection's customer gateway. <p> This element is always present
     *         in the CreateVpnConnection response; however, it's present in the
     *         DescribeVpnConnections response only if the VPN connection is in the
     *         <code>pending</code> or <code>available</code> state.
     */
    public void setCustomerGatewayConfiguration(String customerGatewayConfiguration) {
        this.customerGatewayConfiguration = customerGatewayConfiguration;
    }
    
    /**
     * Contains configuration information in the native XML format for the
     * VPN connection's customer gateway. <p> This element is always present
     * in the CreateVpnConnection response; however, it's present in the
     * DescribeVpnConnections response only if the VPN connection is in the
     * <code>pending</code> or <code>available</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayConfiguration Contains configuration information in the native XML format for the
     *         VPN connection's customer gateway. <p> This element is always present
     *         in the CreateVpnConnection response; however, it's present in the
     *         DescribeVpnConnections response only if the VPN connection is in the
     *         <code>pending</code> or <code>available</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnConnection withCustomerGatewayConfiguration(String customerGatewayConfiguration) {
        this.customerGatewayConfiguration = customerGatewayConfiguration;
        return this;
    }
    
    
    /**
     * Specifies the type of VPN connection.
     *
     * @return Specifies the type of VPN connection.
     */
    public String getType() {
        return type;
    }
    
    /**
     * Specifies the type of VPN connection.
     *
     * @param type Specifies the type of VPN connection.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Specifies the type of VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type Specifies the type of VPN connection.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnConnection withType(String type) {
        this.type = type;
        return this;
    }
    
    
    /**
     * Specifies ID of the customer gateway at the end of the VPN connection.
     *
     * @return Specifies ID of the customer gateway at the end of the VPN connection.
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }
    
    /**
     * Specifies ID of the customer gateway at the end of the VPN connection.
     *
     * @param customerGatewayId Specifies ID of the customer gateway at the end of the VPN connection.
     */
    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }
    
    /**
     * Specifies ID of the customer gateway at the end of the VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayId Specifies ID of the customer gateway at the end of the VPN connection.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnConnection withCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    
    
    /**
     * Specfies the ID of the VPN gateway at the VPC end of the VPN
     * connection.
     *
     * @return Specfies the ID of the VPN gateway at the VPC end of the VPN
     *         connection.
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }
    
    /**
     * Specfies the ID of the VPN gateway at the VPC end of the VPN
     * connection.
     *
     * @param vpnGatewayId Specfies the ID of the VPN gateway at the VPC end of the VPN
     *         connection.
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }
    
    /**
     * Specfies the ID of the VPN gateway at the VPC end of the VPN
     * connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayId Specfies the ID of the VPN gateway at the VPC end of the VPN
     *         connection.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnConnection withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
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
        sb.append("VpnConnectionId: " + vpnConnectionId + ", ");
        sb.append("State: " + state + ", ");
        sb.append("CustomerGatewayConfiguration: " + customerGatewayConfiguration + ", ");
        sb.append("Type: " + type + ", ");
        sb.append("CustomerGatewayId: " + customerGatewayId + ", ");
        sb.append("VpnGatewayId: " + vpnGatewayId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    