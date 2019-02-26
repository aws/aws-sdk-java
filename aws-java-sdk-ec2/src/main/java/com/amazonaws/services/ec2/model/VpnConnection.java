/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a VPN connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpnConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpnConnection implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration information for the VPN connection's customer gateway (in the native XML format). This element
     * is always present in the <a>CreateVpnConnection</a> response; however, it's present in the
     * <a>DescribeVpnConnections</a> response only if the VPN connection is in the <code>pending</code> or
     * <code>available</code> state.
     * </p>
     */
    private String customerGatewayConfiguration;
    /**
     * <p>
     * The ID of the customer gateway at your end of the VPN connection.
     * </p>
     */
    private String customerGatewayId;
    /**
     * <p>
     * The category of the VPN connection. A value of <code>VPN</code> indicates an AWS VPN connection. A value of
     * <code>VPN-Classic</code> indicates an AWS Classic VPN connection.
     * </p>
     */
    private String category;
    /**
     * <p>
     * The current state of the VPN connection.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The type of VPN connection.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     */
    private String vpnConnectionId;
    /**
     * <p>
     * The ID of the virtual private gateway at the AWS side of the VPN connection.
     * </p>
     */
    private String vpnGatewayId;
    /**
     * <p>
     * The ID of the transit gateway associated with the VPN connection.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The VPN connection options.
     * </p>
     */
    private VpnConnectionOptions options;
    /**
     * <p>
     * The static routes associated with the VPN connection.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpnStaticRoute> routes;
    /**
     * <p>
     * Any tags assigned to the VPN connection.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Information about the VPN tunnel.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VgwTelemetry> vgwTelemetry;

    /**
     * <p>
     * The configuration information for the VPN connection's customer gateway (in the native XML format). This element
     * is always present in the <a>CreateVpnConnection</a> response; however, it's present in the
     * <a>DescribeVpnConnections</a> response only if the VPN connection is in the <code>pending</code> or
     * <code>available</code> state.
     * </p>
     * 
     * @param customerGatewayConfiguration
     *        The configuration information for the VPN connection's customer gateway (in the native XML format). This
     *        element is always present in the <a>CreateVpnConnection</a> response; however, it's present in the
     *        <a>DescribeVpnConnections</a> response only if the VPN connection is in the <code>pending</code> or
     *        <code>available</code> state.
     */

    public void setCustomerGatewayConfiguration(String customerGatewayConfiguration) {
        this.customerGatewayConfiguration = customerGatewayConfiguration;
    }

    /**
     * <p>
     * The configuration information for the VPN connection's customer gateway (in the native XML format). This element
     * is always present in the <a>CreateVpnConnection</a> response; however, it's present in the
     * <a>DescribeVpnConnections</a> response only if the VPN connection is in the <code>pending</code> or
     * <code>available</code> state.
     * </p>
     * 
     * @return The configuration information for the VPN connection's customer gateway (in the native XML format). This
     *         element is always present in the <a>CreateVpnConnection</a> response; however, it's present in the
     *         <a>DescribeVpnConnections</a> response only if the VPN connection is in the <code>pending</code> or
     *         <code>available</code> state.
     */

    public String getCustomerGatewayConfiguration() {
        return this.customerGatewayConfiguration;
    }

    /**
     * <p>
     * The configuration information for the VPN connection's customer gateway (in the native XML format). This element
     * is always present in the <a>CreateVpnConnection</a> response; however, it's present in the
     * <a>DescribeVpnConnections</a> response only if the VPN connection is in the <code>pending</code> or
     * <code>available</code> state.
     * </p>
     * 
     * @param customerGatewayConfiguration
     *        The configuration information for the VPN connection's customer gateway (in the native XML format). This
     *        element is always present in the <a>CreateVpnConnection</a> response; however, it's present in the
     *        <a>DescribeVpnConnections</a> response only if the VPN connection is in the <code>pending</code> or
     *        <code>available</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnection withCustomerGatewayConfiguration(String customerGatewayConfiguration) {
        setCustomerGatewayConfiguration(customerGatewayConfiguration);
        return this;
    }

    /**
     * <p>
     * The ID of the customer gateway at your end of the VPN connection.
     * </p>
     * 
     * @param customerGatewayId
     *        The ID of the customer gateway at your end of the VPN connection.
     */

    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway at your end of the VPN connection.
     * </p>
     * 
     * @return The ID of the customer gateway at your end of the VPN connection.
     */

    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway at your end of the VPN connection.
     * </p>
     * 
     * @param customerGatewayId
     *        The ID of the customer gateway at your end of the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnection withCustomerGatewayId(String customerGatewayId) {
        setCustomerGatewayId(customerGatewayId);
        return this;
    }

    /**
     * <p>
     * The category of the VPN connection. A value of <code>VPN</code> indicates an AWS VPN connection. A value of
     * <code>VPN-Classic</code> indicates an AWS Classic VPN connection.
     * </p>
     * 
     * @param category
     *        The category of the VPN connection. A value of <code>VPN</code> indicates an AWS VPN connection. A value
     *        of <code>VPN-Classic</code> indicates an AWS Classic VPN connection.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of the VPN connection. A value of <code>VPN</code> indicates an AWS VPN connection. A value of
     * <code>VPN-Classic</code> indicates an AWS Classic VPN connection.
     * </p>
     * 
     * @return The category of the VPN connection. A value of <code>VPN</code> indicates an AWS VPN connection. A value
     *         of <code>VPN-Classic</code> indicates an AWS Classic VPN connection.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of the VPN connection. A value of <code>VPN</code> indicates an AWS VPN connection. A value of
     * <code>VPN-Classic</code> indicates an AWS Classic VPN connection.
     * </p>
     * 
     * @param category
     *        The category of the VPN connection. A value of <code>VPN</code> indicates an AWS VPN connection. A value
     *        of <code>VPN-Classic</code> indicates an AWS Classic VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnection withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The current state of the VPN connection.
     * </p>
     * 
     * @param state
     *        The current state of the VPN connection.
     * @see VpnState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the VPN connection.
     * </p>
     * 
     * @return The current state of the VPN connection.
     * @see VpnState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the VPN connection.
     * </p>
     * 
     * @param state
     *        The current state of the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnState
     */

    public VpnConnection withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the VPN connection.
     * </p>
     * 
     * @param state
     *        The current state of the VPN connection.
     * @see VpnState
     */

    public void setState(VpnState state) {
        withState(state);
    }

    /**
     * <p>
     * The current state of the VPN connection.
     * </p>
     * 
     * @param state
     *        The current state of the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnState
     */

    public VpnConnection withState(VpnState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The type of VPN connection.
     * </p>
     * 
     * @param type
     *        The type of VPN connection.
     * @see GatewayType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of VPN connection.
     * </p>
     * 
     * @return The type of VPN connection.
     * @see GatewayType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of VPN connection.
     * </p>
     * 
     * @param type
     *        The type of VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public VpnConnection withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of VPN connection.
     * </p>
     * 
     * @param type
     *        The type of VPN connection.
     * @see GatewayType
     */

    public void setType(GatewayType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of VPN connection.
     * </p>
     * 
     * @param type
     *        The type of VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public VpnConnection withType(GatewayType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     * 
     * @param vpnConnectionId
     *        The ID of the VPN connection.
     */

    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     * 
     * @return The ID of the VPN connection.
     */

    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     * 
     * @param vpnConnectionId
     *        The ID of the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnection withVpnConnectionId(String vpnConnectionId) {
        setVpnConnectionId(vpnConnectionId);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway at the AWS side of the VPN connection.
     * </p>
     * 
     * @param vpnGatewayId
     *        The ID of the virtual private gateway at the AWS side of the VPN connection.
     */

    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway at the AWS side of the VPN connection.
     * </p>
     * 
     * @return The ID of the virtual private gateway at the AWS side of the VPN connection.
     */

    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway at the AWS side of the VPN connection.
     * </p>
     * 
     * @param vpnGatewayId
     *        The ID of the virtual private gateway at the AWS side of the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnection withVpnGatewayId(String vpnGatewayId) {
        setVpnGatewayId(vpnGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway associated with the VPN connection.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway associated with the VPN connection.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway associated with the VPN connection.
     * </p>
     * 
     * @return The ID of the transit gateway associated with the VPN connection.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway associated with the VPN connection.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway associated with the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnection withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The VPN connection options.
     * </p>
     * 
     * @param options
     *        The VPN connection options.
     */

    public void setOptions(VpnConnectionOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * The VPN connection options.
     * </p>
     * 
     * @return The VPN connection options.
     */

    public VpnConnectionOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The VPN connection options.
     * </p>
     * 
     * @param options
     *        The VPN connection options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnection withOptions(VpnConnectionOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The static routes associated with the VPN connection.
     * </p>
     * 
     * @return The static routes associated with the VPN connection.
     */

    public java.util.List<VpnStaticRoute> getRoutes() {
        if (routes == null) {
            routes = new com.amazonaws.internal.SdkInternalList<VpnStaticRoute>();
        }
        return routes;
    }

    /**
     * <p>
     * The static routes associated with the VPN connection.
     * </p>
     * 
     * @param routes
     *        The static routes associated with the VPN connection.
     */

    public void setRoutes(java.util.Collection<VpnStaticRoute> routes) {
        if (routes == null) {
            this.routes = null;
            return;
        }

        this.routes = new com.amazonaws.internal.SdkInternalList<VpnStaticRoute>(routes);
    }

    /**
     * <p>
     * The static routes associated with the VPN connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutes(java.util.Collection)} or {@link #withRoutes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param routes
     *        The static routes associated with the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnection withRoutes(VpnStaticRoute... routes) {
        if (this.routes == null) {
            setRoutes(new com.amazonaws.internal.SdkInternalList<VpnStaticRoute>(routes.length));
        }
        for (VpnStaticRoute ele : routes) {
            this.routes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The static routes associated with the VPN connection.
     * </p>
     * 
     * @param routes
     *        The static routes associated with the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnection withRoutes(java.util.Collection<VpnStaticRoute> routes) {
        setRoutes(routes);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the VPN connection.
     * </p>
     * 
     * @return Any tags assigned to the VPN connection.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the VPN connection.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the VPN connection.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the VPN connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnection withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the VPN connection.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnection withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Information about the VPN tunnel.
     * </p>
     * 
     * @return Information about the VPN tunnel.
     */

    public java.util.List<VgwTelemetry> getVgwTelemetry() {
        if (vgwTelemetry == null) {
            vgwTelemetry = new com.amazonaws.internal.SdkInternalList<VgwTelemetry>();
        }
        return vgwTelemetry;
    }

    /**
     * <p>
     * Information about the VPN tunnel.
     * </p>
     * 
     * @param vgwTelemetry
     *        Information about the VPN tunnel.
     */

    public void setVgwTelemetry(java.util.Collection<VgwTelemetry> vgwTelemetry) {
        if (vgwTelemetry == null) {
            this.vgwTelemetry = null;
            return;
        }

        this.vgwTelemetry = new com.amazonaws.internal.SdkInternalList<VgwTelemetry>(vgwTelemetry);
    }

    /**
     * <p>
     * Information about the VPN tunnel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVgwTelemetry(java.util.Collection)} or {@link #withVgwTelemetry(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vgwTelemetry
     *        Information about the VPN tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnection withVgwTelemetry(VgwTelemetry... vgwTelemetry) {
        if (this.vgwTelemetry == null) {
            setVgwTelemetry(new com.amazonaws.internal.SdkInternalList<VgwTelemetry>(vgwTelemetry.length));
        }
        for (VgwTelemetry ele : vgwTelemetry) {
            this.vgwTelemetry.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the VPN tunnel.
     * </p>
     * 
     * @param vgwTelemetry
     *        Information about the VPN tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnection withVgwTelemetry(java.util.Collection<VgwTelemetry> vgwTelemetry) {
        setVgwTelemetry(vgwTelemetry);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCustomerGatewayConfiguration() != null)
            sb.append("CustomerGatewayConfiguration: ").append(getCustomerGatewayConfiguration()).append(",");
        if (getCustomerGatewayId() != null)
            sb.append("CustomerGatewayId: ").append(getCustomerGatewayId()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVpnConnectionId() != null)
            sb.append("VpnConnectionId: ").append(getVpnConnectionId()).append(",");
        if (getVpnGatewayId() != null)
            sb.append("VpnGatewayId: ").append(getVpnGatewayId()).append(",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getRoutes() != null)
            sb.append("Routes: ").append(getRoutes()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVgwTelemetry() != null)
            sb.append("VgwTelemetry: ").append(getVgwTelemetry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpnConnection == false)
            return false;
        VpnConnection other = (VpnConnection) obj;
        if (other.getCustomerGatewayConfiguration() == null ^ this.getCustomerGatewayConfiguration() == null)
            return false;
        if (other.getCustomerGatewayConfiguration() != null && other.getCustomerGatewayConfiguration().equals(this.getCustomerGatewayConfiguration()) == false)
            return false;
        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null)
            return false;
        if (other.getCustomerGatewayId() != null && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null)
            return false;
        if (other.getVpnConnectionId() != null && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false)
            return false;
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null)
            return false;
        if (other.getVpnGatewayId() != null && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getRoutes() == null ^ this.getRoutes() == null)
            return false;
        if (other.getRoutes() != null && other.getRoutes().equals(this.getRoutes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVgwTelemetry() == null ^ this.getVgwTelemetry() == null)
            return false;
        if (other.getVgwTelemetry() != null && other.getVgwTelemetry().equals(this.getVgwTelemetry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerGatewayConfiguration() == null) ? 0 : getCustomerGatewayConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode());
        hashCode = prime * hashCode + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getRoutes() == null) ? 0 : getRoutes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVgwTelemetry() == null) ? 0 : getVgwTelemetry().hashCode());
        return hashCode;
    }

    @Override
    public VpnConnection clone() {
        try {
            return (VpnConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
