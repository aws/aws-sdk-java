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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the route endpoint that violates the policy scope.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/RouteHasOutOfScopeEndpointViolation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteHasOutOfScopeEndpointViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the subnet associated with the route that violates the policy scope.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The VPC ID of the route that violates the policy scope.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The ID of the route table.
     * </p>
     */
    private String routeTableId;
    /**
     * <p>
     * The list of routes that violate the route table.
     * </p>
     */
    private java.util.List<Route> violatingRoutes;
    /**
     * <p>
     * The subnet's Availability Zone.
     * </p>
     */
    private String subnetAvailabilityZone;
    /**
     * <p>
     * The ID of the subnet's Availability Zone.
     * </p>
     */
    private String subnetAvailabilityZoneId;
    /**
     * <p>
     * The route table associated with the current firewall subnet.
     * </p>
     */
    private String currentFirewallSubnetRouteTable;
    /**
     * <p>
     * The ID of the firewall subnet.
     * </p>
     */
    private String firewallSubnetId;
    /**
     * <p>
     * The list of firewall subnet routes.
     * </p>
     */
    private java.util.List<Route> firewallSubnetRoutes;
    /**
     * <p>
     * The ID of the Internet Gateway.
     * </p>
     */
    private String internetGatewayId;
    /**
     * <p>
     * The current route table associated with the Internet Gateway.
     * </p>
     */
    private String currentInternetGatewayRouteTable;
    /**
     * <p>
     * The routes in the route table associated with the Internet Gateway.
     * </p>
     */
    private java.util.List<Route> internetGatewayRoutes;

    /**
     * <p>
     * The ID of the subnet associated with the route that violates the policy scope.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet associated with the route that violates the policy scope.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet associated with the route that violates the policy scope.
     * </p>
     * 
     * @return The ID of the subnet associated with the route that violates the policy scope.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet associated with the route that violates the policy scope.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet associated with the route that violates the policy scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteHasOutOfScopeEndpointViolation withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The VPC ID of the route that violates the policy scope.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID of the route that violates the policy scope.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID of the route that violates the policy scope.
     * </p>
     * 
     * @return The VPC ID of the route that violates the policy scope.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID of the route that violates the policy scope.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID of the route that violates the policy scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteHasOutOfScopeEndpointViolation withVpcId(String vpcId) {
        setVpcId(vpcId);
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

    public RouteHasOutOfScopeEndpointViolation withRouteTableId(String routeTableId) {
        setRouteTableId(routeTableId);
        return this;
    }

    /**
     * <p>
     * The list of routes that violate the route table.
     * </p>
     * 
     * @return The list of routes that violate the route table.
     */

    public java.util.List<Route> getViolatingRoutes() {
        return violatingRoutes;
    }

    /**
     * <p>
     * The list of routes that violate the route table.
     * </p>
     * 
     * @param violatingRoutes
     *        The list of routes that violate the route table.
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
     * The list of routes that violate the route table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setViolatingRoutes(java.util.Collection)} or {@link #withViolatingRoutes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param violatingRoutes
     *        The list of routes that violate the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteHasOutOfScopeEndpointViolation withViolatingRoutes(Route... violatingRoutes) {
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
     * The list of routes that violate the route table.
     * </p>
     * 
     * @param violatingRoutes
     *        The list of routes that violate the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteHasOutOfScopeEndpointViolation withViolatingRoutes(java.util.Collection<Route> violatingRoutes) {
        setViolatingRoutes(violatingRoutes);
        return this;
    }

    /**
     * <p>
     * The subnet's Availability Zone.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        The subnet's Availability Zone.
     */

    public void setSubnetAvailabilityZone(String subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
    }

    /**
     * <p>
     * The subnet's Availability Zone.
     * </p>
     * 
     * @return The subnet's Availability Zone.
     */

    public String getSubnetAvailabilityZone() {
        return this.subnetAvailabilityZone;
    }

    /**
     * <p>
     * The subnet's Availability Zone.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        The subnet's Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteHasOutOfScopeEndpointViolation withSubnetAvailabilityZone(String subnetAvailabilityZone) {
        setSubnetAvailabilityZone(subnetAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet's Availability Zone.
     * </p>
     * 
     * @param subnetAvailabilityZoneId
     *        The ID of the subnet's Availability Zone.
     */

    public void setSubnetAvailabilityZoneId(String subnetAvailabilityZoneId) {
        this.subnetAvailabilityZoneId = subnetAvailabilityZoneId;
    }

    /**
     * <p>
     * The ID of the subnet's Availability Zone.
     * </p>
     * 
     * @return The ID of the subnet's Availability Zone.
     */

    public String getSubnetAvailabilityZoneId() {
        return this.subnetAvailabilityZoneId;
    }

    /**
     * <p>
     * The ID of the subnet's Availability Zone.
     * </p>
     * 
     * @param subnetAvailabilityZoneId
     *        The ID of the subnet's Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteHasOutOfScopeEndpointViolation withSubnetAvailabilityZoneId(String subnetAvailabilityZoneId) {
        setSubnetAvailabilityZoneId(subnetAvailabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The route table associated with the current firewall subnet.
     * </p>
     * 
     * @param currentFirewallSubnetRouteTable
     *        The route table associated with the current firewall subnet.
     */

    public void setCurrentFirewallSubnetRouteTable(String currentFirewallSubnetRouteTable) {
        this.currentFirewallSubnetRouteTable = currentFirewallSubnetRouteTable;
    }

    /**
     * <p>
     * The route table associated with the current firewall subnet.
     * </p>
     * 
     * @return The route table associated with the current firewall subnet.
     */

    public String getCurrentFirewallSubnetRouteTable() {
        return this.currentFirewallSubnetRouteTable;
    }

    /**
     * <p>
     * The route table associated with the current firewall subnet.
     * </p>
     * 
     * @param currentFirewallSubnetRouteTable
     *        The route table associated with the current firewall subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteHasOutOfScopeEndpointViolation withCurrentFirewallSubnetRouteTable(String currentFirewallSubnetRouteTable) {
        setCurrentFirewallSubnetRouteTable(currentFirewallSubnetRouteTable);
        return this;
    }

    /**
     * <p>
     * The ID of the firewall subnet.
     * </p>
     * 
     * @param firewallSubnetId
     *        The ID of the firewall subnet.
     */

    public void setFirewallSubnetId(String firewallSubnetId) {
        this.firewallSubnetId = firewallSubnetId;
    }

    /**
     * <p>
     * The ID of the firewall subnet.
     * </p>
     * 
     * @return The ID of the firewall subnet.
     */

    public String getFirewallSubnetId() {
        return this.firewallSubnetId;
    }

    /**
     * <p>
     * The ID of the firewall subnet.
     * </p>
     * 
     * @param firewallSubnetId
     *        The ID of the firewall subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteHasOutOfScopeEndpointViolation withFirewallSubnetId(String firewallSubnetId) {
        setFirewallSubnetId(firewallSubnetId);
        return this;
    }

    /**
     * <p>
     * The list of firewall subnet routes.
     * </p>
     * 
     * @return The list of firewall subnet routes.
     */

    public java.util.List<Route> getFirewallSubnetRoutes() {
        return firewallSubnetRoutes;
    }

    /**
     * <p>
     * The list of firewall subnet routes.
     * </p>
     * 
     * @param firewallSubnetRoutes
     *        The list of firewall subnet routes.
     */

    public void setFirewallSubnetRoutes(java.util.Collection<Route> firewallSubnetRoutes) {
        if (firewallSubnetRoutes == null) {
            this.firewallSubnetRoutes = null;
            return;
        }

        this.firewallSubnetRoutes = new java.util.ArrayList<Route>(firewallSubnetRoutes);
    }

    /**
     * <p>
     * The list of firewall subnet routes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFirewallSubnetRoutes(java.util.Collection)} or {@link #withFirewallSubnetRoutes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param firewallSubnetRoutes
     *        The list of firewall subnet routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteHasOutOfScopeEndpointViolation withFirewallSubnetRoutes(Route... firewallSubnetRoutes) {
        if (this.firewallSubnetRoutes == null) {
            setFirewallSubnetRoutes(new java.util.ArrayList<Route>(firewallSubnetRoutes.length));
        }
        for (Route ele : firewallSubnetRoutes) {
            this.firewallSubnetRoutes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of firewall subnet routes.
     * </p>
     * 
     * @param firewallSubnetRoutes
     *        The list of firewall subnet routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteHasOutOfScopeEndpointViolation withFirewallSubnetRoutes(java.util.Collection<Route> firewallSubnetRoutes) {
        setFirewallSubnetRoutes(firewallSubnetRoutes);
        return this;
    }

    /**
     * <p>
     * The ID of the Internet Gateway.
     * </p>
     * 
     * @param internetGatewayId
     *        The ID of the Internet Gateway.
     */

    public void setInternetGatewayId(String internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
    }

    /**
     * <p>
     * The ID of the Internet Gateway.
     * </p>
     * 
     * @return The ID of the Internet Gateway.
     */

    public String getInternetGatewayId() {
        return this.internetGatewayId;
    }

    /**
     * <p>
     * The ID of the Internet Gateway.
     * </p>
     * 
     * @param internetGatewayId
     *        The ID of the Internet Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteHasOutOfScopeEndpointViolation withInternetGatewayId(String internetGatewayId) {
        setInternetGatewayId(internetGatewayId);
        return this;
    }

    /**
     * <p>
     * The current route table associated with the Internet Gateway.
     * </p>
     * 
     * @param currentInternetGatewayRouteTable
     *        The current route table associated with the Internet Gateway.
     */

    public void setCurrentInternetGatewayRouteTable(String currentInternetGatewayRouteTable) {
        this.currentInternetGatewayRouteTable = currentInternetGatewayRouteTable;
    }

    /**
     * <p>
     * The current route table associated with the Internet Gateway.
     * </p>
     * 
     * @return The current route table associated with the Internet Gateway.
     */

    public String getCurrentInternetGatewayRouteTable() {
        return this.currentInternetGatewayRouteTable;
    }

    /**
     * <p>
     * The current route table associated with the Internet Gateway.
     * </p>
     * 
     * @param currentInternetGatewayRouteTable
     *        The current route table associated with the Internet Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteHasOutOfScopeEndpointViolation withCurrentInternetGatewayRouteTable(String currentInternetGatewayRouteTable) {
        setCurrentInternetGatewayRouteTable(currentInternetGatewayRouteTable);
        return this;
    }

    /**
     * <p>
     * The routes in the route table associated with the Internet Gateway.
     * </p>
     * 
     * @return The routes in the route table associated with the Internet Gateway.
     */

    public java.util.List<Route> getInternetGatewayRoutes() {
        return internetGatewayRoutes;
    }

    /**
     * <p>
     * The routes in the route table associated with the Internet Gateway.
     * </p>
     * 
     * @param internetGatewayRoutes
     *        The routes in the route table associated with the Internet Gateway.
     */

    public void setInternetGatewayRoutes(java.util.Collection<Route> internetGatewayRoutes) {
        if (internetGatewayRoutes == null) {
            this.internetGatewayRoutes = null;
            return;
        }

        this.internetGatewayRoutes = new java.util.ArrayList<Route>(internetGatewayRoutes);
    }

    /**
     * <p>
     * The routes in the route table associated with the Internet Gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInternetGatewayRoutes(java.util.Collection)} or
     * {@link #withInternetGatewayRoutes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param internetGatewayRoutes
     *        The routes in the route table associated with the Internet Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteHasOutOfScopeEndpointViolation withInternetGatewayRoutes(Route... internetGatewayRoutes) {
        if (this.internetGatewayRoutes == null) {
            setInternetGatewayRoutes(new java.util.ArrayList<Route>(internetGatewayRoutes.length));
        }
        for (Route ele : internetGatewayRoutes) {
            this.internetGatewayRoutes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The routes in the route table associated with the Internet Gateway.
     * </p>
     * 
     * @param internetGatewayRoutes
     *        The routes in the route table associated with the Internet Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteHasOutOfScopeEndpointViolation withInternetGatewayRoutes(java.util.Collection<Route> internetGatewayRoutes) {
        setInternetGatewayRoutes(internetGatewayRoutes);
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
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId()).append(",");
        if (getViolatingRoutes() != null)
            sb.append("ViolatingRoutes: ").append(getViolatingRoutes()).append(",");
        if (getSubnetAvailabilityZone() != null)
            sb.append("SubnetAvailabilityZone: ").append(getSubnetAvailabilityZone()).append(",");
        if (getSubnetAvailabilityZoneId() != null)
            sb.append("SubnetAvailabilityZoneId: ").append(getSubnetAvailabilityZoneId()).append(",");
        if (getCurrentFirewallSubnetRouteTable() != null)
            sb.append("CurrentFirewallSubnetRouteTable: ").append(getCurrentFirewallSubnetRouteTable()).append(",");
        if (getFirewallSubnetId() != null)
            sb.append("FirewallSubnetId: ").append(getFirewallSubnetId()).append(",");
        if (getFirewallSubnetRoutes() != null)
            sb.append("FirewallSubnetRoutes: ").append(getFirewallSubnetRoutes()).append(",");
        if (getInternetGatewayId() != null)
            sb.append("InternetGatewayId: ").append(getInternetGatewayId()).append(",");
        if (getCurrentInternetGatewayRouteTable() != null)
            sb.append("CurrentInternetGatewayRouteTable: ").append(getCurrentInternetGatewayRouteTable()).append(",");
        if (getInternetGatewayRoutes() != null)
            sb.append("InternetGatewayRoutes: ").append(getInternetGatewayRoutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteHasOutOfScopeEndpointViolation == false)
            return false;
        RouteHasOutOfScopeEndpointViolation other = (RouteHasOutOfScopeEndpointViolation) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getViolatingRoutes() == null ^ this.getViolatingRoutes() == null)
            return false;
        if (other.getViolatingRoutes() != null && other.getViolatingRoutes().equals(this.getViolatingRoutes()) == false)
            return false;
        if (other.getSubnetAvailabilityZone() == null ^ this.getSubnetAvailabilityZone() == null)
            return false;
        if (other.getSubnetAvailabilityZone() != null && other.getSubnetAvailabilityZone().equals(this.getSubnetAvailabilityZone()) == false)
            return false;
        if (other.getSubnetAvailabilityZoneId() == null ^ this.getSubnetAvailabilityZoneId() == null)
            return false;
        if (other.getSubnetAvailabilityZoneId() != null && other.getSubnetAvailabilityZoneId().equals(this.getSubnetAvailabilityZoneId()) == false)
            return false;
        if (other.getCurrentFirewallSubnetRouteTable() == null ^ this.getCurrentFirewallSubnetRouteTable() == null)
            return false;
        if (other.getCurrentFirewallSubnetRouteTable() != null
                && other.getCurrentFirewallSubnetRouteTable().equals(this.getCurrentFirewallSubnetRouteTable()) == false)
            return false;
        if (other.getFirewallSubnetId() == null ^ this.getFirewallSubnetId() == null)
            return false;
        if (other.getFirewallSubnetId() != null && other.getFirewallSubnetId().equals(this.getFirewallSubnetId()) == false)
            return false;
        if (other.getFirewallSubnetRoutes() == null ^ this.getFirewallSubnetRoutes() == null)
            return false;
        if (other.getFirewallSubnetRoutes() != null && other.getFirewallSubnetRoutes().equals(this.getFirewallSubnetRoutes()) == false)
            return false;
        if (other.getInternetGatewayId() == null ^ this.getInternetGatewayId() == null)
            return false;
        if (other.getInternetGatewayId() != null && other.getInternetGatewayId().equals(this.getInternetGatewayId()) == false)
            return false;
        if (other.getCurrentInternetGatewayRouteTable() == null ^ this.getCurrentInternetGatewayRouteTable() == null)
            return false;
        if (other.getCurrentInternetGatewayRouteTable() != null
                && other.getCurrentInternetGatewayRouteTable().equals(this.getCurrentInternetGatewayRouteTable()) == false)
            return false;
        if (other.getInternetGatewayRoutes() == null ^ this.getInternetGatewayRoutes() == null)
            return false;
        if (other.getInternetGatewayRoutes() != null && other.getInternetGatewayRoutes().equals(this.getInternetGatewayRoutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getViolatingRoutes() == null) ? 0 : getViolatingRoutes().hashCode());
        hashCode = prime * hashCode + ((getSubnetAvailabilityZone() == null) ? 0 : getSubnetAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getSubnetAvailabilityZoneId() == null) ? 0 : getSubnetAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getCurrentFirewallSubnetRouteTable() == null) ? 0 : getCurrentFirewallSubnetRouteTable().hashCode());
        hashCode = prime * hashCode + ((getFirewallSubnetId() == null) ? 0 : getFirewallSubnetId().hashCode());
        hashCode = prime * hashCode + ((getFirewallSubnetRoutes() == null) ? 0 : getFirewallSubnetRoutes().hashCode());
        hashCode = prime * hashCode + ((getInternetGatewayId() == null) ? 0 : getInternetGatewayId().hashCode());
        hashCode = prime * hashCode + ((getCurrentInternetGatewayRouteTable() == null) ? 0 : getCurrentInternetGatewayRouteTable().hashCode());
        hashCode = prime * hashCode + ((getInternetGatewayRoutes() == null) ? 0 : getInternetGatewayRoutes().hashCode());
        return hashCode;
    }

    @Override
    public RouteHasOutOfScopeEndpointViolation clone() {
        try {
            return (RouteHasOutOfScopeEndpointViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.RouteHasOutOfScopeEndpointViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
