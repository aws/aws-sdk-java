/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Violation detail for an unexpected route that's present in a route table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/NetworkFirewallUnexpectedFirewallRoutesViolation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkFirewallUnexpectedFirewallRoutesViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subnet ID for the firewall.
     * </p>
     */
    private String firewallSubnetId;
    /**
     * <p>
     * The routes that are in violation.
     * </p>
     */
    private java.util.List<Route> violatingRoutes;
    /**
     * <p>
     * The ID of the route table.
     * </p>
     */
    private String routeTableId;
    /**
     * <p>
     * The endpoint of the firewall.
     * </p>
     */
    private String firewallEndpoint;
    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The subnet ID for the firewall.
     * </p>
     * 
     * @param firewallSubnetId
     *        The subnet ID for the firewall.
     */

    public void setFirewallSubnetId(String firewallSubnetId) {
        this.firewallSubnetId = firewallSubnetId;
    }

    /**
     * <p>
     * The subnet ID for the firewall.
     * </p>
     * 
     * @return The subnet ID for the firewall.
     */

    public String getFirewallSubnetId() {
        return this.firewallSubnetId;
    }

    /**
     * <p>
     * The subnet ID for the firewall.
     * </p>
     * 
     * @param firewallSubnetId
     *        The subnet ID for the firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallUnexpectedFirewallRoutesViolation withFirewallSubnetId(String firewallSubnetId) {
        setFirewallSubnetId(firewallSubnetId);
        return this;
    }

    /**
     * <p>
     * The routes that are in violation.
     * </p>
     * 
     * @return The routes that are in violation.
     */

    public java.util.List<Route> getViolatingRoutes() {
        return violatingRoutes;
    }

    /**
     * <p>
     * The routes that are in violation.
     * </p>
     * 
     * @param violatingRoutes
     *        The routes that are in violation.
     */

    public void setViolatingRoutes(java.util.Collection<Route> violatingRoutes) {
        if (violatingRoutes == null) {
            this.violatingRoutes = null;
            return;
        }

        this.violatingRoutes = new java.util.ArrayList<Route>(violatingRoutes);
    }

    /**
     * <p>
     * The routes that are in violation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setViolatingRoutes(java.util.Collection)} or {@link #withViolatingRoutes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param violatingRoutes
     *        The routes that are in violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallUnexpectedFirewallRoutesViolation withViolatingRoutes(Route... violatingRoutes) {
        if (this.violatingRoutes == null) {
            setViolatingRoutes(new java.util.ArrayList<Route>(violatingRoutes.length));
        }
        for (Route ele : violatingRoutes) {
            this.violatingRoutes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The routes that are in violation.
     * </p>
     * 
     * @param violatingRoutes
     *        The routes that are in violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallUnexpectedFirewallRoutesViolation withViolatingRoutes(java.util.Collection<Route> violatingRoutes) {
        setViolatingRoutes(violatingRoutes);
        return this;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the route table.
     */

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @return The ID of the route table.
     */

    public String getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallUnexpectedFirewallRoutesViolation withRouteTableId(String routeTableId) {
        setRouteTableId(routeTableId);
        return this;
    }

    /**
     * <p>
     * The endpoint of the firewall.
     * </p>
     * 
     * @param firewallEndpoint
     *        The endpoint of the firewall.
     */

    public void setFirewallEndpoint(String firewallEndpoint) {
        this.firewallEndpoint = firewallEndpoint;
    }

    /**
     * <p>
     * The endpoint of the firewall.
     * </p>
     * 
     * @return The endpoint of the firewall.
     */

    public String getFirewallEndpoint() {
        return this.firewallEndpoint;
    }

    /**
     * <p>
     * The endpoint of the firewall.
     * </p>
     * 
     * @param firewallEndpoint
     *        The endpoint of the firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallUnexpectedFirewallRoutesViolation withFirewallEndpoint(String firewallEndpoint) {
        setFirewallEndpoint(firewallEndpoint);
        return this;
    }

    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     * 
     * @param vpcId
     *        Information about the VPC ID.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     * 
     * @return Information about the VPC ID.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     * 
     * @param vpcId
     *        Information about the VPC ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallUnexpectedFirewallRoutesViolation withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getFirewallSubnetId() != null)
            sb.append("FirewallSubnetId: ").append(getFirewallSubnetId()).append(",");
        if (getViolatingRoutes() != null)
            sb.append("ViolatingRoutes: ").append(getViolatingRoutes()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId()).append(",");
        if (getFirewallEndpoint() != null)
            sb.append("FirewallEndpoint: ").append(getFirewallEndpoint()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkFirewallUnexpectedFirewallRoutesViolation == false)
            return false;
        NetworkFirewallUnexpectedFirewallRoutesViolation other = (NetworkFirewallUnexpectedFirewallRoutesViolation) obj;
        if (other.getFirewallSubnetId() == null ^ this.getFirewallSubnetId() == null)
            return false;
        if (other.getFirewallSubnetId() != null && other.getFirewallSubnetId().equals(this.getFirewallSubnetId()) == false)
            return false;
        if (other.getViolatingRoutes() == null ^ this.getViolatingRoutes() == null)
            return false;
        if (other.getViolatingRoutes() != null && other.getViolatingRoutes().equals(this.getViolatingRoutes()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getFirewallEndpoint() == null ^ this.getFirewallEndpoint() == null)
            return false;
        if (other.getFirewallEndpoint() != null && other.getFirewallEndpoint().equals(this.getFirewallEndpoint()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallSubnetId() == null) ? 0 : getFirewallSubnetId().hashCode());
        hashCode = prime * hashCode + ((getViolatingRoutes() == null) ? 0 : getViolatingRoutes().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getFirewallEndpoint() == null) ? 0 : getFirewallEndpoint().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public NetworkFirewallUnexpectedFirewallRoutesViolation clone() {
        try {
            return (NetworkFirewallUnexpectedFirewallRoutesViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.NetworkFirewallUnexpectedFirewallRoutesViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
