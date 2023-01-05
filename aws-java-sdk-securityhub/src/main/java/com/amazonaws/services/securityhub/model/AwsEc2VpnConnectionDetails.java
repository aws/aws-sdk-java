/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an Amazon EC2 VPN connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2VpnConnectionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2VpnConnectionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the VPN connection.
     * </p>
     */
    private String vpnConnectionId;
    /**
     * <p>
     * The current state of the VPN connection. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * The identifier of the customer gateway that is at your end of the VPN connection.
     * </p>
     */
    private String customerGatewayId;
    /**
     * <p>
     * The configuration information for the VPN connection's customer gateway, in the native XML format.
     * </p>
     */
    private String customerGatewayConfiguration;
    /**
     * <p>
     * The type of VPN connection.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The identifier of the virtual private gateway that is at the Amazon Web Services side of the VPN connection.
     * </p>
     */
    private String vpnGatewayId;
    /**
     * <p>
     * The category of the VPN connection. <code>VPN</code> indicates an Amazon Web Services VPN connection.
     * <code>VPN-Classic</code> indicates an Amazon Web Services Classic VPN connection.
     * </p>
     */
    private String category;
    /**
     * <p>
     * Information about the VPN tunnel.
     * </p>
     */
    private java.util.List<AwsEc2VpnConnectionVgwTelemetryDetails> vgwTelemetry;
    /**
     * <p>
     * The VPN connection options.
     * </p>
     */
    private AwsEc2VpnConnectionOptionsDetails options;
    /**
     * <p>
     * The static routes that are associated with the VPN connection.
     * </p>
     */
    private java.util.List<AwsEc2VpnConnectionRoutesDetails> routes;
    /**
     * <p>
     * The identifier of the transit gateway that is associated with the VPN connection.
     * </p>
     */
    private String transitGatewayId;

    /**
     * <p>
     * The identifier of the VPN connection.
     * </p>
     * 
     * @param vpnConnectionId
     *        The identifier of the VPN connection.
     */

    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    /**
     * <p>
     * The identifier of the VPN connection.
     * </p>
     * 
     * @return The identifier of the VPN connection.
     */

    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    /**
     * <p>
     * The identifier of the VPN connection.
     * </p>
     * 
     * @param vpnConnectionId
     *        The identifier of the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionDetails withVpnConnectionId(String vpnConnectionId) {
        setVpnConnectionId(vpnConnectionId);
        return this;
    }

    /**
     * <p>
     * The current state of the VPN connection. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the VPN connection. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>available</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>
     *        </p>
     *        </li>
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the VPN connection. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the VPN connection. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>available</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>
     *         </p>
     *         </li>
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the VPN connection. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the VPN connection. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>available</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionDetails withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The identifier of the customer gateway that is at your end of the VPN connection.
     * </p>
     * 
     * @param customerGatewayId
     *        The identifier of the customer gateway that is at your end of the VPN connection.
     */

    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }

    /**
     * <p>
     * The identifier of the customer gateway that is at your end of the VPN connection.
     * </p>
     * 
     * @return The identifier of the customer gateway that is at your end of the VPN connection.
     */

    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    /**
     * <p>
     * The identifier of the customer gateway that is at your end of the VPN connection.
     * </p>
     * 
     * @param customerGatewayId
     *        The identifier of the customer gateway that is at your end of the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionDetails withCustomerGatewayId(String customerGatewayId) {
        setCustomerGatewayId(customerGatewayId);
        return this;
    }

    /**
     * <p>
     * The configuration information for the VPN connection's customer gateway, in the native XML format.
     * </p>
     * 
     * @param customerGatewayConfiguration
     *        The configuration information for the VPN connection's customer gateway, in the native XML format.
     */

    public void setCustomerGatewayConfiguration(String customerGatewayConfiguration) {
        this.customerGatewayConfiguration = customerGatewayConfiguration;
    }

    /**
     * <p>
     * The configuration information for the VPN connection's customer gateway, in the native XML format.
     * </p>
     * 
     * @return The configuration information for the VPN connection's customer gateway, in the native XML format.
     */

    public String getCustomerGatewayConfiguration() {
        return this.customerGatewayConfiguration;
    }

    /**
     * <p>
     * The configuration information for the VPN connection's customer gateway, in the native XML format.
     * </p>
     * 
     * @param customerGatewayConfiguration
     *        The configuration information for the VPN connection's customer gateway, in the native XML format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionDetails withCustomerGatewayConfiguration(String customerGatewayConfiguration) {
        setCustomerGatewayConfiguration(customerGatewayConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of VPN connection.
     * </p>
     * 
     * @param type
     *        The type of VPN connection.
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
     */

    public AwsEc2VpnConnectionDetails withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The identifier of the virtual private gateway that is at the Amazon Web Services side of the VPN connection.
     * </p>
     * 
     * @param vpnGatewayId
     *        The identifier of the virtual private gateway that is at the Amazon Web Services side of the VPN
     *        connection.
     */

    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }

    /**
     * <p>
     * The identifier of the virtual private gateway that is at the Amazon Web Services side of the VPN connection.
     * </p>
     * 
     * @return The identifier of the virtual private gateway that is at the Amazon Web Services side of the VPN
     *         connection.
     */

    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     * <p>
     * The identifier of the virtual private gateway that is at the Amazon Web Services side of the VPN connection.
     * </p>
     * 
     * @param vpnGatewayId
     *        The identifier of the virtual private gateway that is at the Amazon Web Services side of the VPN
     *        connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionDetails withVpnGatewayId(String vpnGatewayId) {
        setVpnGatewayId(vpnGatewayId);
        return this;
    }

    /**
     * <p>
     * The category of the VPN connection. <code>VPN</code> indicates an Amazon Web Services VPN connection.
     * <code>VPN-Classic</code> indicates an Amazon Web Services Classic VPN connection.
     * </p>
     * 
     * @param category
     *        The category of the VPN connection. <code>VPN</code> indicates an Amazon Web Services VPN connection.
     *        <code>VPN-Classic</code> indicates an Amazon Web Services Classic VPN connection.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of the VPN connection. <code>VPN</code> indicates an Amazon Web Services VPN connection.
     * <code>VPN-Classic</code> indicates an Amazon Web Services Classic VPN connection.
     * </p>
     * 
     * @return The category of the VPN connection. <code>VPN</code> indicates an Amazon Web Services VPN connection.
     *         <code>VPN-Classic</code> indicates an Amazon Web Services Classic VPN connection.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of the VPN connection. <code>VPN</code> indicates an Amazon Web Services VPN connection.
     * <code>VPN-Classic</code> indicates an Amazon Web Services Classic VPN connection.
     * </p>
     * 
     * @param category
     *        The category of the VPN connection. <code>VPN</code> indicates an Amazon Web Services VPN connection.
     *        <code>VPN-Classic</code> indicates an Amazon Web Services Classic VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionDetails withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * Information about the VPN tunnel.
     * </p>
     * 
     * @return Information about the VPN tunnel.
     */

    public java.util.List<AwsEc2VpnConnectionVgwTelemetryDetails> getVgwTelemetry() {
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

    public void setVgwTelemetry(java.util.Collection<AwsEc2VpnConnectionVgwTelemetryDetails> vgwTelemetry) {
        if (vgwTelemetry == null) {
            this.vgwTelemetry = null;
            return;
        }

        this.vgwTelemetry = new java.util.ArrayList<AwsEc2VpnConnectionVgwTelemetryDetails>(vgwTelemetry);
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

    public AwsEc2VpnConnectionDetails withVgwTelemetry(AwsEc2VpnConnectionVgwTelemetryDetails... vgwTelemetry) {
        if (this.vgwTelemetry == null) {
            setVgwTelemetry(new java.util.ArrayList<AwsEc2VpnConnectionVgwTelemetryDetails>(vgwTelemetry.length));
        }
        for (AwsEc2VpnConnectionVgwTelemetryDetails ele : vgwTelemetry) {
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

    public AwsEc2VpnConnectionDetails withVgwTelemetry(java.util.Collection<AwsEc2VpnConnectionVgwTelemetryDetails> vgwTelemetry) {
        setVgwTelemetry(vgwTelemetry);
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

    public void setOptions(AwsEc2VpnConnectionOptionsDetails options) {
        this.options = options;
    }

    /**
     * <p>
     * The VPN connection options.
     * </p>
     * 
     * @return The VPN connection options.
     */

    public AwsEc2VpnConnectionOptionsDetails getOptions() {
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

    public AwsEc2VpnConnectionDetails withOptions(AwsEc2VpnConnectionOptionsDetails options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The static routes that are associated with the VPN connection.
     * </p>
     * 
     * @return The static routes that are associated with the VPN connection.
     */

    public java.util.List<AwsEc2VpnConnectionRoutesDetails> getRoutes() {
        return routes;
    }

    /**
     * <p>
     * The static routes that are associated with the VPN connection.
     * </p>
     * 
     * @param routes
     *        The static routes that are associated with the VPN connection.
     */

    public void setRoutes(java.util.Collection<AwsEc2VpnConnectionRoutesDetails> routes) {
        if (routes == null) {
            this.routes = null;
            return;
        }

        this.routes = new java.util.ArrayList<AwsEc2VpnConnectionRoutesDetails>(routes);
    }

    /**
     * <p>
     * The static routes that are associated with the VPN connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutes(java.util.Collection)} or {@link #withRoutes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param routes
     *        The static routes that are associated with the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionDetails withRoutes(AwsEc2VpnConnectionRoutesDetails... routes) {
        if (this.routes == null) {
            setRoutes(new java.util.ArrayList<AwsEc2VpnConnectionRoutesDetails>(routes.length));
        }
        for (AwsEc2VpnConnectionRoutesDetails ele : routes) {
            this.routes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The static routes that are associated with the VPN connection.
     * </p>
     * 
     * @param routes
     *        The static routes that are associated with the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionDetails withRoutes(java.util.Collection<AwsEc2VpnConnectionRoutesDetails> routes) {
        setRoutes(routes);
        return this;
    }

    /**
     * <p>
     * The identifier of the transit gateway that is associated with the VPN connection.
     * </p>
     * 
     * @param transitGatewayId
     *        The identifier of the transit gateway that is associated with the VPN connection.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The identifier of the transit gateway that is associated with the VPN connection.
     * </p>
     * 
     * @return The identifier of the transit gateway that is associated with the VPN connection.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The identifier of the transit gateway that is associated with the VPN connection.
     * </p>
     * 
     * @param transitGatewayId
     *        The identifier of the transit gateway that is associated with the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionDetails withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
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
        if (getVpnConnectionId() != null)
            sb.append("VpnConnectionId: ").append(getVpnConnectionId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCustomerGatewayId() != null)
            sb.append("CustomerGatewayId: ").append(getCustomerGatewayId()).append(",");
        if (getCustomerGatewayConfiguration() != null)
            sb.append("CustomerGatewayConfiguration: ").append(getCustomerGatewayConfiguration()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVpnGatewayId() != null)
            sb.append("VpnGatewayId: ").append(getVpnGatewayId()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getVgwTelemetry() != null)
            sb.append("VgwTelemetry: ").append(getVgwTelemetry()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getRoutes() != null)
            sb.append("Routes: ").append(getRoutes()).append(",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2VpnConnectionDetails == false)
            return false;
        AwsEc2VpnConnectionDetails other = (AwsEc2VpnConnectionDetails) obj;
        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null)
            return false;
        if (other.getVpnConnectionId() != null && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null)
            return false;
        if (other.getCustomerGatewayId() != null && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false)
            return false;
        if (other.getCustomerGatewayConfiguration() == null ^ this.getCustomerGatewayConfiguration() == null)
            return false;
        if (other.getCustomerGatewayConfiguration() != null && other.getCustomerGatewayConfiguration().equals(this.getCustomerGatewayConfiguration()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null)
            return false;
        if (other.getVpnGatewayId() != null && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getVgwTelemetry() == null ^ this.getVgwTelemetry() == null)
            return false;
        if (other.getVgwTelemetry() != null && other.getVgwTelemetry().equals(this.getVgwTelemetry()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getRoutes() == null ^ this.getRoutes() == null)
            return false;
        if (other.getRoutes() != null && other.getRoutes().equals(this.getRoutes()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode());
        hashCode = prime * hashCode + ((getCustomerGatewayConfiguration() == null) ? 0 : getCustomerGatewayConfiguration().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getVgwTelemetry() == null) ? 0 : getVgwTelemetry().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getRoutes() == null) ? 0 : getRoutes().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2VpnConnectionDetails clone() {
        try {
            return (AwsEc2VpnConnectionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2VpnConnectionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
