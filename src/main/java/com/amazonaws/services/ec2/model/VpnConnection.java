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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * The VpnConnection data type.
 * </p>
 */
public class VpnConnection implements Serializable {

    /**
     * Specifies the ID of the VPN gateway at the VPC end of the VPN
     * connection.
     */
    private String vpnConnectionId;

    /**
     * Describes the current state of the VPN connection. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
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
     * A list of tags for the VpnConnection.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    private com.amazonaws.internal.ListWithAutoConstructFlag<VgwTelemetry> vgwTelemetry;

    private VpnConnectionOptions options;

    private com.amazonaws.internal.ListWithAutoConstructFlag<VpnStaticRoute> routes;

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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @return Describes the current state of the VPN connection. Valid values are
     *         <code>pending</code>, <code>available</code>, <code>deleting</code>,
     *         and <code>deleted</code>.
     *
     * @see VpnState
     */
    public String getState() {
        return state;
    }
    
    /**
     * Describes the current state of the VPN connection. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state Describes the current state of the VPN connection. Valid values are
     *         <code>pending</code>, <code>available</code>, <code>deleting</code>,
     *         and <code>deleted</code>.
     *
     * @see VpnState
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state Describes the current state of the VPN connection. Valid values are
     *         <code>pending</code>, <code>available</code>, <code>deleting</code>,
     *         and <code>deleted</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see VpnState
     */
    public VpnConnection withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Describes the current state of the VPN connection. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state Describes the current state of the VPN connection. Valid values are
     *         <code>pending</code>, <code>available</code>, <code>deleting</code>,
     *         and <code>deleted</code>.
     *
     * @see VpnState
     */
    public void setState(VpnState state) {
        this.state = state.toString();
    }
    
    /**
     * Describes the current state of the VPN connection. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state Describes the current state of the VPN connection. Valid values are
     *         <code>pending</code>, <code>available</code>, <code>deleting</code>,
     *         and <code>deleted</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see VpnState
     */
    public VpnConnection withState(VpnState state) {
        this.state = state.toString();
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @return Specifies the type of VPN connection.
     *
     * @see GatewayType
     */
    public String getType() {
        return type;
    }
    
    /**
     * Specifies the type of VPN connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type Specifies the type of VPN connection.
     *
     * @see GatewayType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Specifies the type of VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type Specifies the type of VPN connection.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see GatewayType
     */
    public VpnConnection withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Specifies the type of VPN connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type Specifies the type of VPN connection.
     *
     * @see GatewayType
     */
    public void setType(GatewayType type) {
        this.type = type.toString();
    }
    
    /**
     * Specifies the type of VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type Specifies the type of VPN connection.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see GatewayType
     */
    public VpnConnection withType(GatewayType type) {
        this.type = type.toString();
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
     * A list of tags for the VpnConnection.
     *
     * @return A list of tags for the VpnConnection.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags for the VpnConnection.
     *
     * @param tags A list of tags for the VpnConnection.
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
     * A list of tags for the VpnConnection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the VpnConnection.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VpnConnection withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags for the VpnConnection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the VpnConnection.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VpnConnection withTags(java.util.Collection<Tag> tags) {
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
     * Returns the value of the VgwTelemetry property for this object.
     *
     * @return The value of the VgwTelemetry property for this object.
     */
    public java.util.List<VgwTelemetry> getVgwTelemetry() {
        if (vgwTelemetry == null) {
              vgwTelemetry = new com.amazonaws.internal.ListWithAutoConstructFlag<VgwTelemetry>();
              vgwTelemetry.setAutoConstruct(true);
        }
        return vgwTelemetry;
    }
    
    /**
     * Sets the value of the VgwTelemetry property for this object.
     *
     * @param vgwTelemetry The new value for the VgwTelemetry property for this object.
     */
    public void setVgwTelemetry(java.util.Collection<VgwTelemetry> vgwTelemetry) {
        if (vgwTelemetry == null) {
            this.vgwTelemetry = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VgwTelemetry> vgwTelemetryCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VgwTelemetry>(vgwTelemetry.size());
        vgwTelemetryCopy.addAll(vgwTelemetry);
        this.vgwTelemetry = vgwTelemetryCopy;
    }
    
    /**
     * Sets the value of the VgwTelemetry property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vgwTelemetry The new value for the VgwTelemetry property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VpnConnection withVgwTelemetry(VgwTelemetry... vgwTelemetry) {
        if (getVgwTelemetry() == null) setVgwTelemetry(new java.util.ArrayList<VgwTelemetry>(vgwTelemetry.length));
        for (VgwTelemetry value : vgwTelemetry) {
            getVgwTelemetry().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the VgwTelemetry property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vgwTelemetry The new value for the VgwTelemetry property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VpnConnection withVgwTelemetry(java.util.Collection<VgwTelemetry> vgwTelemetry) {
        if (vgwTelemetry == null) {
            this.vgwTelemetry = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VgwTelemetry> vgwTelemetryCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VgwTelemetry>(vgwTelemetry.size());
            vgwTelemetryCopy.addAll(vgwTelemetry);
            this.vgwTelemetry = vgwTelemetryCopy;
        }

        return this;
    }

    /**
     * Returns the value of the Options property for this object.
     *
     * @return The value of the Options property for this object.
     */
    public VpnConnectionOptions getOptions() {
        return options;
    }
    
    /**
     * Sets the value of the Options property for this object.
     *
     * @param options The new value for the Options property for this object.
     */
    public void setOptions(VpnConnectionOptions options) {
        this.options = options;
    }
    
    /**
     * Sets the value of the Options property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options The new value for the Options property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VpnConnection withOptions(VpnConnectionOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns the value of the Routes property for this object.
     *
     * @return The value of the Routes property for this object.
     */
    public java.util.List<VpnStaticRoute> getRoutes() {
        if (routes == null) {
              routes = new com.amazonaws.internal.ListWithAutoConstructFlag<VpnStaticRoute>();
              routes.setAutoConstruct(true);
        }
        return routes;
    }
    
    /**
     * Sets the value of the Routes property for this object.
     *
     * @param routes The new value for the Routes property for this object.
     */
    public void setRoutes(java.util.Collection<VpnStaticRoute> routes) {
        if (routes == null) {
            this.routes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VpnStaticRoute> routesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpnStaticRoute>(routes.size());
        routesCopy.addAll(routes);
        this.routes = routesCopy;
    }
    
    /**
     * Sets the value of the Routes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routes The new value for the Routes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VpnConnection withRoutes(VpnStaticRoute... routes) {
        if (getRoutes() == null) setRoutes(new java.util.ArrayList<VpnStaticRoute>(routes.length));
        for (VpnStaticRoute value : routes) {
            getRoutes().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Routes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routes The new value for the Routes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VpnConnection withRoutes(java.util.Collection<VpnStaticRoute> routes) {
        if (routes == null) {
            this.routes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VpnStaticRoute> routesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpnStaticRoute>(routes.size());
            routesCopy.addAll(routes);
            this.routes = routesCopy;
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
        if (getVpnConnectionId() != null) sb.append("VpnConnectionId: " + getVpnConnectionId() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getCustomerGatewayConfiguration() != null) sb.append("CustomerGatewayConfiguration: " + getCustomerGatewayConfiguration() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getCustomerGatewayId() != null) sb.append("CustomerGatewayId: " + getCustomerGatewayId() + ",");
        if (getVpnGatewayId() != null) sb.append("VpnGatewayId: " + getVpnGatewayId() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getVgwTelemetry() != null) sb.append("VgwTelemetry: " + getVgwTelemetry() + ",");
        if (getOptions() != null) sb.append("Options: " + getOptions() + ",");
        if (getRoutes() != null) sb.append("Routes: " + getRoutes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getCustomerGatewayConfiguration() == null) ? 0 : getCustomerGatewayConfiguration().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getVgwTelemetry() == null) ? 0 : getVgwTelemetry().hashCode()); 
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode()); 
        hashCode = prime * hashCode + ((getRoutes() == null) ? 0 : getRoutes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VpnConnection == false) return false;
        VpnConnection other = (VpnConnection)obj;
        
        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null) return false;
        if (other.getVpnConnectionId() != null && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getCustomerGatewayConfiguration() == null ^ this.getCustomerGatewayConfiguration() == null) return false;
        if (other.getCustomerGatewayConfiguration() != null && other.getCustomerGatewayConfiguration().equals(this.getCustomerGatewayConfiguration()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null) return false;
        if (other.getCustomerGatewayId() != null && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false) return false; 
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null) return false;
        if (other.getVpnGatewayId() != null && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getVgwTelemetry() == null ^ this.getVgwTelemetry() == null) return false;
        if (other.getVgwTelemetry() != null && other.getVgwTelemetry().equals(this.getVgwTelemetry()) == false) return false; 
        if (other.getOptions() == null ^ this.getOptions() == null) return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false) return false; 
        if (other.getRoutes() == null ^ this.getRoutes() == null) return false;
        if (other.getRoutes() != null && other.getRoutes().equals(this.getRoutes()) == false) return false; 
        return true;
    }
    
}
    