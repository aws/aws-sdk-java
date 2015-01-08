/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a VPN connection.
 * </p>
 */
public class VpnConnection implements Serializable {

    /**
     * The ID of the VPN connection.
     */
    private String vpnConnectionId;

    /**
     * The current state of the VPN connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     */
    private String state;

    /**
     * The configuration information for the VPN connection's customer
     * gateway (in the native XML format). This element is always present in
     * the <a>CreateVpnConnection</a> response; however, it's present in the
     * <a>DescribeVpnConnections</a> response only if the VPN connection is
     * in the <code>pending</code> or <code>available</code> state.
     */
    private String customerGatewayConfiguration;

    /**
     * The type of VPN connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     */
    private String type;

    /**
     * The ID of the customer gateway at your end of the VPN connection.
     */
    private String customerGatewayId;

    /**
     * The ID of the virtual private gateway at the AWS side of the VPN
     * connection.
     */
    private String vpnGatewayId;

    /**
     * Any tags assigned to the VPN connection.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Information about the VPN tunnel.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VgwTelemetry> vgwTelemetry;

    /**
     * The VPN connection options.
     */
    private VpnConnectionOptions options;

    /**
     * The static routes associated with the VPN connection.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VpnStaticRoute> routes;

    /**
     * The ID of the VPN connection.
     *
     * @return The ID of the VPN connection.
     */
    public String getVpnConnectionId() {
        return vpnConnectionId;
    }
    
    /**
     * The ID of the VPN connection.
     *
     * @param vpnConnectionId The ID of the VPN connection.
     */
    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }
    
    /**
     * The ID of the VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionId The ID of the VPN connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpnConnection withVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }

    /**
     * The current state of the VPN connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @return The current state of the VPN connection.
     *
     * @see VpnState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The current state of the VPN connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The current state of the VPN connection.
     *
     * @see VpnState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The current state of the VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The current state of the VPN connection.
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
     * The current state of the VPN connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The current state of the VPN connection.
     *
     * @see VpnState
     */
    public void setState(VpnState state) {
        this.state = state.toString();
    }
    
    /**
     * The current state of the VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The current state of the VPN connection.
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
     * The configuration information for the VPN connection's customer
     * gateway (in the native XML format). This element is always present in
     * the <a>CreateVpnConnection</a> response; however, it's present in the
     * <a>DescribeVpnConnections</a> response only if the VPN connection is
     * in the <code>pending</code> or <code>available</code> state.
     *
     * @return The configuration information for the VPN connection's customer
     *         gateway (in the native XML format). This element is always present in
     *         the <a>CreateVpnConnection</a> response; however, it's present in the
     *         <a>DescribeVpnConnections</a> response only if the VPN connection is
     *         in the <code>pending</code> or <code>available</code> state.
     */
    public String getCustomerGatewayConfiguration() {
        return customerGatewayConfiguration;
    }
    
    /**
     * The configuration information for the VPN connection's customer
     * gateway (in the native XML format). This element is always present in
     * the <a>CreateVpnConnection</a> response; however, it's present in the
     * <a>DescribeVpnConnections</a> response only if the VPN connection is
     * in the <code>pending</code> or <code>available</code> state.
     *
     * @param customerGatewayConfiguration The configuration information for the VPN connection's customer
     *         gateway (in the native XML format). This element is always present in
     *         the <a>CreateVpnConnection</a> response; however, it's present in the
     *         <a>DescribeVpnConnections</a> response only if the VPN connection is
     *         in the <code>pending</code> or <code>available</code> state.
     */
    public void setCustomerGatewayConfiguration(String customerGatewayConfiguration) {
        this.customerGatewayConfiguration = customerGatewayConfiguration;
    }
    
    /**
     * The configuration information for the VPN connection's customer
     * gateway (in the native XML format). This element is always present in
     * the <a>CreateVpnConnection</a> response; however, it's present in the
     * <a>DescribeVpnConnections</a> response only if the VPN connection is
     * in the <code>pending</code> or <code>available</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayConfiguration The configuration information for the VPN connection's customer
     *         gateway (in the native XML format). This element is always present in
     *         the <a>CreateVpnConnection</a> response; however, it's present in the
     *         <a>DescribeVpnConnections</a> response only if the VPN connection is
     *         in the <code>pending</code> or <code>available</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpnConnection withCustomerGatewayConfiguration(String customerGatewayConfiguration) {
        this.customerGatewayConfiguration = customerGatewayConfiguration;
        return this;
    }

    /**
     * The type of VPN connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @return The type of VPN connection.
     *
     * @see GatewayType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of VPN connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection.
     *
     * @see GatewayType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection.
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
     * The type of VPN connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection.
     *
     * @see GatewayType
     */
    public void setType(GatewayType type) {
        this.type = type.toString();
    }
    
    /**
     * The type of VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection.
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
     * The ID of the customer gateway at your end of the VPN connection.
     *
     * @return The ID of the customer gateway at your end of the VPN connection.
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }
    
    /**
     * The ID of the customer gateway at your end of the VPN connection.
     *
     * @param customerGatewayId The ID of the customer gateway at your end of the VPN connection.
     */
    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }
    
    /**
     * The ID of the customer gateway at your end of the VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayId The ID of the customer gateway at your end of the VPN connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpnConnection withCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }

    /**
     * The ID of the virtual private gateway at the AWS side of the VPN
     * connection.
     *
     * @return The ID of the virtual private gateway at the AWS side of the VPN
     *         connection.
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }
    
    /**
     * The ID of the virtual private gateway at the AWS side of the VPN
     * connection.
     *
     * @param vpnGatewayId The ID of the virtual private gateway at the AWS side of the VPN
     *         connection.
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }
    
    /**
     * The ID of the virtual private gateway at the AWS side of the VPN
     * connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayId The ID of the virtual private gateway at the AWS side of the VPN
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
     * Any tags assigned to the VPN connection.
     *
     * @return Any tags assigned to the VPN connection.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the VPN connection.
     *
     * @param tags Any tags assigned to the VPN connection.
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
     * Any tags assigned to the VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the VPN connection.
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
     * Any tags assigned to the VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the VPN connection.
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
     * Information about the VPN tunnel.
     *
     * @return Information about the VPN tunnel.
     */
    public java.util.List<VgwTelemetry> getVgwTelemetry() {
        if (vgwTelemetry == null) {
              vgwTelemetry = new com.amazonaws.internal.ListWithAutoConstructFlag<VgwTelemetry>();
              vgwTelemetry.setAutoConstruct(true);
        }
        return vgwTelemetry;
    }
    
    /**
     * Information about the VPN tunnel.
     *
     * @param vgwTelemetry Information about the VPN tunnel.
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
     * Information about the VPN tunnel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vgwTelemetry Information about the VPN tunnel.
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
     * Information about the VPN tunnel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vgwTelemetry Information about the VPN tunnel.
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
     * The VPN connection options.
     *
     * @return The VPN connection options.
     */
    public VpnConnectionOptions getOptions() {
        return options;
    }
    
    /**
     * The VPN connection options.
     *
     * @param options The VPN connection options.
     */
    public void setOptions(VpnConnectionOptions options) {
        this.options = options;
    }
    
    /**
     * The VPN connection options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options The VPN connection options.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpnConnection withOptions(VpnConnectionOptions options) {
        this.options = options;
        return this;
    }

    /**
     * The static routes associated with the VPN connection.
     *
     * @return The static routes associated with the VPN connection.
     */
    public java.util.List<VpnStaticRoute> getRoutes() {
        if (routes == null) {
              routes = new com.amazonaws.internal.ListWithAutoConstructFlag<VpnStaticRoute>();
              routes.setAutoConstruct(true);
        }
        return routes;
    }
    
    /**
     * The static routes associated with the VPN connection.
     *
     * @param routes The static routes associated with the VPN connection.
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
     * The static routes associated with the VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routes The static routes associated with the VPN connection.
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
     * The static routes associated with the VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routes The static routes associated with the VPN connection.
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
    