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
 * Violation detail for the subnet for which internet traffic that hasn't been inspected.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/NetworkFirewallInternetTrafficNotInspectedViolation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkFirewallInternetTrafficNotInspectedViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subnet ID.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The subnet Availability Zone.
     * </p>
     */
    private String subnetAvailabilityZone;
    /**
     * <p>
     * Information about the route table ID.
     * </p>
     */
    private String routeTableId;
    /**
     * <p>
     * The route or routes that are in violation.
     * </p>
     */
    private java.util.List<Route> violatingRoutes;
    /**
     * <p>
     * Information about whether the route table is used in another Availability Zone.
     * </p>
     */
    private Boolean isRouteTableUsedInDifferentAZ;
    /**
     * <p>
     * Information about the subnet route table for the current firewall.
     * </p>
     */
    private String currentFirewallSubnetRouteTable;
    /**
     * <p>
     * The expected endpoint for the current firewall.
     * </p>
     */
    private String expectedFirewallEndpoint;
    /**
     * <p>
     * The firewall subnet ID.
     * </p>
     */
    private String firewallSubnetId;
    /**
     * <p>
     * The firewall subnet routes that are expected.
     * </p>
     */
    private java.util.List<ExpectedRoute> expectedFirewallSubnetRoutes;
    /**
     * <p>
     * The actual firewall subnet routes.
     * </p>
     */
    private java.util.List<Route> actualFirewallSubnetRoutes;
    /**
     * <p>
     * The internet gateway ID.
     * </p>
     */
    private String internetGatewayId;
    /**
     * <p>
     * The current route table for the internet gateway.
     * </p>
     */
    private String currentInternetGatewayRouteTable;
    /**
     * <p>
     * The internet gateway routes that are expected.
     * </p>
     */
    private java.util.List<ExpectedRoute> expectedInternetGatewayRoutes;
    /**
     * <p>
     * The actual internet gateway routes.
     * </p>
     */
    private java.util.List<Route> actualInternetGatewayRoutes;
    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The subnet ID.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID.
     * </p>
     * 
     * @return The subnet ID.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet ID.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The subnet Availability Zone.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        The subnet Availability Zone.
     */

    public void setSubnetAvailabilityZone(String subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
    }

    /**
     * <p>
     * The subnet Availability Zone.
     * </p>
     * 
     * @return The subnet Availability Zone.
     */

    public String getSubnetAvailabilityZone() {
        return this.subnetAvailabilityZone;
    }

    /**
     * <p>
     * The subnet Availability Zone.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        The subnet Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withSubnetAvailabilityZone(String subnetAvailabilityZone) {
        setSubnetAvailabilityZone(subnetAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * Information about the route table ID.
     * </p>
     * 
     * @param routeTableId
     *        Information about the route table ID.
     */

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * Information about the route table ID.
     * </p>
     * 
     * @return Information about the route table ID.
     */

    public String getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * <p>
     * Information about the route table ID.
     * </p>
     * 
     * @param routeTableId
     *        Information about the route table ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withRouteTableId(String routeTableId) {
        setRouteTableId(routeTableId);
        return this;
    }

    /**
     * <p>
     * The route or routes that are in violation.
     * </p>
     * 
     * @return The route or routes that are in violation.
     */

    public java.util.List<Route> getViolatingRoutes() {
        return violatingRoutes;
    }

    /**
     * <p>
     * The route or routes that are in violation.
     * </p>
     * 
     * @param violatingRoutes
     *        The route or routes that are in violation.
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
     * The route or routes that are in violation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setViolatingRoutes(java.util.Collection)} or {@link #withViolatingRoutes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param violatingRoutes
     *        The route or routes that are in violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withViolatingRoutes(Route... violatingRoutes) {
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
     * The route or routes that are in violation.
     * </p>
     * 
     * @param violatingRoutes
     *        The route or routes that are in violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withViolatingRoutes(java.util.Collection<Route> violatingRoutes) {
        setViolatingRoutes(violatingRoutes);
        return this;
    }

    /**
     * <p>
     * Information about whether the route table is used in another Availability Zone.
     * </p>
     * 
     * @param isRouteTableUsedInDifferentAZ
     *        Information about whether the route table is used in another Availability Zone.
     */

    public void setIsRouteTableUsedInDifferentAZ(Boolean isRouteTableUsedInDifferentAZ) {
        this.isRouteTableUsedInDifferentAZ = isRouteTableUsedInDifferentAZ;
    }

    /**
     * <p>
     * Information about whether the route table is used in another Availability Zone.
     * </p>
     * 
     * @return Information about whether the route table is used in another Availability Zone.
     */

    public Boolean getIsRouteTableUsedInDifferentAZ() {
        return this.isRouteTableUsedInDifferentAZ;
    }

    /**
     * <p>
     * Information about whether the route table is used in another Availability Zone.
     * </p>
     * 
     * @param isRouteTableUsedInDifferentAZ
     *        Information about whether the route table is used in another Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withIsRouteTableUsedInDifferentAZ(Boolean isRouteTableUsedInDifferentAZ) {
        setIsRouteTableUsedInDifferentAZ(isRouteTableUsedInDifferentAZ);
        return this;
    }

    /**
     * <p>
     * Information about whether the route table is used in another Availability Zone.
     * </p>
     * 
     * @return Information about whether the route table is used in another Availability Zone.
     */

    public Boolean isRouteTableUsedInDifferentAZ() {
        return this.isRouteTableUsedInDifferentAZ;
    }

    /**
     * <p>
     * Information about the subnet route table for the current firewall.
     * </p>
     * 
     * @param currentFirewallSubnetRouteTable
     *        Information about the subnet route table for the current firewall.
     */

    public void setCurrentFirewallSubnetRouteTable(String currentFirewallSubnetRouteTable) {
        this.currentFirewallSubnetRouteTable = currentFirewallSubnetRouteTable;
    }

    /**
     * <p>
     * Information about the subnet route table for the current firewall.
     * </p>
     * 
     * @return Information about the subnet route table for the current firewall.
     */

    public String getCurrentFirewallSubnetRouteTable() {
        return this.currentFirewallSubnetRouteTable;
    }

    /**
     * <p>
     * Information about the subnet route table for the current firewall.
     * </p>
     * 
     * @param currentFirewallSubnetRouteTable
     *        Information about the subnet route table for the current firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withCurrentFirewallSubnetRouteTable(String currentFirewallSubnetRouteTable) {
        setCurrentFirewallSubnetRouteTable(currentFirewallSubnetRouteTable);
        return this;
    }

    /**
     * <p>
     * The expected endpoint for the current firewall.
     * </p>
     * 
     * @param expectedFirewallEndpoint
     *        The expected endpoint for the current firewall.
     */

    public void setExpectedFirewallEndpoint(String expectedFirewallEndpoint) {
        this.expectedFirewallEndpoint = expectedFirewallEndpoint;
    }

    /**
     * <p>
     * The expected endpoint for the current firewall.
     * </p>
     * 
     * @return The expected endpoint for the current firewall.
     */

    public String getExpectedFirewallEndpoint() {
        return this.expectedFirewallEndpoint;
    }

    /**
     * <p>
     * The expected endpoint for the current firewall.
     * </p>
     * 
     * @param expectedFirewallEndpoint
     *        The expected endpoint for the current firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withExpectedFirewallEndpoint(String expectedFirewallEndpoint) {
        setExpectedFirewallEndpoint(expectedFirewallEndpoint);
        return this;
    }

    /**
     * <p>
     * The firewall subnet ID.
     * </p>
     * 
     * @param firewallSubnetId
     *        The firewall subnet ID.
     */

    public void setFirewallSubnetId(String firewallSubnetId) {
        this.firewallSubnetId = firewallSubnetId;
    }

    /**
     * <p>
     * The firewall subnet ID.
     * </p>
     * 
     * @return The firewall subnet ID.
     */

    public String getFirewallSubnetId() {
        return this.firewallSubnetId;
    }

    /**
     * <p>
     * The firewall subnet ID.
     * </p>
     * 
     * @param firewallSubnetId
     *        The firewall subnet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withFirewallSubnetId(String firewallSubnetId) {
        setFirewallSubnetId(firewallSubnetId);
        return this;
    }

    /**
     * <p>
     * The firewall subnet routes that are expected.
     * </p>
     * 
     * @return The firewall subnet routes that are expected.
     */

    public java.util.List<ExpectedRoute> getExpectedFirewallSubnetRoutes() {
        return expectedFirewallSubnetRoutes;
    }

    /**
     * <p>
     * The firewall subnet routes that are expected.
     * </p>
     * 
     * @param expectedFirewallSubnetRoutes
     *        The firewall subnet routes that are expected.
     */

    public void setExpectedFirewallSubnetRoutes(java.util.Collection<ExpectedRoute> expectedFirewallSubnetRoutes) {
        if (expectedFirewallSubnetRoutes == null) {
            this.expectedFirewallSubnetRoutes = null;
            return;
        }

        this.expectedFirewallSubnetRoutes = new java.util.ArrayList<ExpectedRoute>(expectedFirewallSubnetRoutes);
    }

    /**
     * <p>
     * The firewall subnet routes that are expected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExpectedFirewallSubnetRoutes(java.util.Collection)} or
     * {@link #withExpectedFirewallSubnetRoutes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param expectedFirewallSubnetRoutes
     *        The firewall subnet routes that are expected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withExpectedFirewallSubnetRoutes(ExpectedRoute... expectedFirewallSubnetRoutes) {
        if (this.expectedFirewallSubnetRoutes == null) {
            setExpectedFirewallSubnetRoutes(new java.util.ArrayList<ExpectedRoute>(expectedFirewallSubnetRoutes.length));
        }
        for (ExpectedRoute ele : expectedFirewallSubnetRoutes) {
            this.expectedFirewallSubnetRoutes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The firewall subnet routes that are expected.
     * </p>
     * 
     * @param expectedFirewallSubnetRoutes
     *        The firewall subnet routes that are expected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withExpectedFirewallSubnetRoutes(java.util.Collection<ExpectedRoute> expectedFirewallSubnetRoutes) {
        setExpectedFirewallSubnetRoutes(expectedFirewallSubnetRoutes);
        return this;
    }

    /**
     * <p>
     * The actual firewall subnet routes.
     * </p>
     * 
     * @return The actual firewall subnet routes.
     */

    public java.util.List<Route> getActualFirewallSubnetRoutes() {
        return actualFirewallSubnetRoutes;
    }

    /**
     * <p>
     * The actual firewall subnet routes.
     * </p>
     * 
     * @param actualFirewallSubnetRoutes
     *        The actual firewall subnet routes.
     */

    public void setActualFirewallSubnetRoutes(java.util.Collection<Route> actualFirewallSubnetRoutes) {
        if (actualFirewallSubnetRoutes == null) {
            this.actualFirewallSubnetRoutes = null;
            return;
        }

        this.actualFirewallSubnetRoutes = new java.util.ArrayList<Route>(actualFirewallSubnetRoutes);
    }

    /**
     * <p>
     * The actual firewall subnet routes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActualFirewallSubnetRoutes(java.util.Collection)} or
     * {@link #withActualFirewallSubnetRoutes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param actualFirewallSubnetRoutes
     *        The actual firewall subnet routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withActualFirewallSubnetRoutes(Route... actualFirewallSubnetRoutes) {
        if (this.actualFirewallSubnetRoutes == null) {
            setActualFirewallSubnetRoutes(new java.util.ArrayList<Route>(actualFirewallSubnetRoutes.length));
        }
        for (Route ele : actualFirewallSubnetRoutes) {
            this.actualFirewallSubnetRoutes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actual firewall subnet routes.
     * </p>
     * 
     * @param actualFirewallSubnetRoutes
     *        The actual firewall subnet routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withActualFirewallSubnetRoutes(java.util.Collection<Route> actualFirewallSubnetRoutes) {
        setActualFirewallSubnetRoutes(actualFirewallSubnetRoutes);
        return this;
    }

    /**
     * <p>
     * The internet gateway ID.
     * </p>
     * 
     * @param internetGatewayId
     *        The internet gateway ID.
     */

    public void setInternetGatewayId(String internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
    }

    /**
     * <p>
     * The internet gateway ID.
     * </p>
     * 
     * @return The internet gateway ID.
     */

    public String getInternetGatewayId() {
        return this.internetGatewayId;
    }

    /**
     * <p>
     * The internet gateway ID.
     * </p>
     * 
     * @param internetGatewayId
     *        The internet gateway ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withInternetGatewayId(String internetGatewayId) {
        setInternetGatewayId(internetGatewayId);
        return this;
    }

    /**
     * <p>
     * The current route table for the internet gateway.
     * </p>
     * 
     * @param currentInternetGatewayRouteTable
     *        The current route table for the internet gateway.
     */

    public void setCurrentInternetGatewayRouteTable(String currentInternetGatewayRouteTable) {
        this.currentInternetGatewayRouteTable = currentInternetGatewayRouteTable;
    }

    /**
     * <p>
     * The current route table for the internet gateway.
     * </p>
     * 
     * @return The current route table for the internet gateway.
     */

    public String getCurrentInternetGatewayRouteTable() {
        return this.currentInternetGatewayRouteTable;
    }

    /**
     * <p>
     * The current route table for the internet gateway.
     * </p>
     * 
     * @param currentInternetGatewayRouteTable
     *        The current route table for the internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withCurrentInternetGatewayRouteTable(String currentInternetGatewayRouteTable) {
        setCurrentInternetGatewayRouteTable(currentInternetGatewayRouteTable);
        return this;
    }

    /**
     * <p>
     * The internet gateway routes that are expected.
     * </p>
     * 
     * @return The internet gateway routes that are expected.
     */

    public java.util.List<ExpectedRoute> getExpectedInternetGatewayRoutes() {
        return expectedInternetGatewayRoutes;
    }

    /**
     * <p>
     * The internet gateway routes that are expected.
     * </p>
     * 
     * @param expectedInternetGatewayRoutes
     *        The internet gateway routes that are expected.
     */

    public void setExpectedInternetGatewayRoutes(java.util.Collection<ExpectedRoute> expectedInternetGatewayRoutes) {
        if (expectedInternetGatewayRoutes == null) {
            this.expectedInternetGatewayRoutes = null;
            return;
        }

        this.expectedInternetGatewayRoutes = new java.util.ArrayList<ExpectedRoute>(expectedInternetGatewayRoutes);
    }

    /**
     * <p>
     * The internet gateway routes that are expected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExpectedInternetGatewayRoutes(java.util.Collection)} or
     * {@link #withExpectedInternetGatewayRoutes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param expectedInternetGatewayRoutes
     *        The internet gateway routes that are expected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withExpectedInternetGatewayRoutes(ExpectedRoute... expectedInternetGatewayRoutes) {
        if (this.expectedInternetGatewayRoutes == null) {
            setExpectedInternetGatewayRoutes(new java.util.ArrayList<ExpectedRoute>(expectedInternetGatewayRoutes.length));
        }
        for (ExpectedRoute ele : expectedInternetGatewayRoutes) {
            this.expectedInternetGatewayRoutes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The internet gateway routes that are expected.
     * </p>
     * 
     * @param expectedInternetGatewayRoutes
     *        The internet gateway routes that are expected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withExpectedInternetGatewayRoutes(
            java.util.Collection<ExpectedRoute> expectedInternetGatewayRoutes) {
        setExpectedInternetGatewayRoutes(expectedInternetGatewayRoutes);
        return this;
    }

    /**
     * <p>
     * The actual internet gateway routes.
     * </p>
     * 
     * @return The actual internet gateway routes.
     */

    public java.util.List<Route> getActualInternetGatewayRoutes() {
        return actualInternetGatewayRoutes;
    }

    /**
     * <p>
     * The actual internet gateway routes.
     * </p>
     * 
     * @param actualInternetGatewayRoutes
     *        The actual internet gateway routes.
     */

    public void setActualInternetGatewayRoutes(java.util.Collection<Route> actualInternetGatewayRoutes) {
        if (actualInternetGatewayRoutes == null) {
            this.actualInternetGatewayRoutes = null;
            return;
        }

        this.actualInternetGatewayRoutes = new java.util.ArrayList<Route>(actualInternetGatewayRoutes);
    }

    /**
     * <p>
     * The actual internet gateway routes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActualInternetGatewayRoutes(java.util.Collection)} or
     * {@link #withActualInternetGatewayRoutes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param actualInternetGatewayRoutes
     *        The actual internet gateway routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withActualInternetGatewayRoutes(Route... actualInternetGatewayRoutes) {
        if (this.actualInternetGatewayRoutes == null) {
            setActualInternetGatewayRoutes(new java.util.ArrayList<Route>(actualInternetGatewayRoutes.length));
        }
        for (Route ele : actualInternetGatewayRoutes) {
            this.actualInternetGatewayRoutes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actual internet gateway routes.
     * </p>
     * 
     * @param actualInternetGatewayRoutes
     *        The actual internet gateway routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation withActualInternetGatewayRoutes(java.util.Collection<Route> actualInternetGatewayRoutes) {
        setActualInternetGatewayRoutes(actualInternetGatewayRoutes);
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

    public NetworkFirewallInternetTrafficNotInspectedViolation withVpcId(String vpcId) {
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
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getSubnetAvailabilityZone() != null)
            sb.append("SubnetAvailabilityZone: ").append(getSubnetAvailabilityZone()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId()).append(",");
        if (getViolatingRoutes() != null)
            sb.append("ViolatingRoutes: ").append(getViolatingRoutes()).append(",");
        if (getIsRouteTableUsedInDifferentAZ() != null)
            sb.append("IsRouteTableUsedInDifferentAZ: ").append(getIsRouteTableUsedInDifferentAZ()).append(",");
        if (getCurrentFirewallSubnetRouteTable() != null)
            sb.append("CurrentFirewallSubnetRouteTable: ").append(getCurrentFirewallSubnetRouteTable()).append(",");
        if (getExpectedFirewallEndpoint() != null)
            sb.append("ExpectedFirewallEndpoint: ").append(getExpectedFirewallEndpoint()).append(",");
        if (getFirewallSubnetId() != null)
            sb.append("FirewallSubnetId: ").append(getFirewallSubnetId()).append(",");
        if (getExpectedFirewallSubnetRoutes() != null)
            sb.append("ExpectedFirewallSubnetRoutes: ").append(getExpectedFirewallSubnetRoutes()).append(",");
        if (getActualFirewallSubnetRoutes() != null)
            sb.append("ActualFirewallSubnetRoutes: ").append(getActualFirewallSubnetRoutes()).append(",");
        if (getInternetGatewayId() != null)
            sb.append("InternetGatewayId: ").append(getInternetGatewayId()).append(",");
        if (getCurrentInternetGatewayRouteTable() != null)
            sb.append("CurrentInternetGatewayRouteTable: ").append(getCurrentInternetGatewayRouteTable()).append(",");
        if (getExpectedInternetGatewayRoutes() != null)
            sb.append("ExpectedInternetGatewayRoutes: ").append(getExpectedInternetGatewayRoutes()).append(",");
        if (getActualInternetGatewayRoutes() != null)
            sb.append("ActualInternetGatewayRoutes: ").append(getActualInternetGatewayRoutes()).append(",");
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

        if (obj instanceof NetworkFirewallInternetTrafficNotInspectedViolation == false)
            return false;
        NetworkFirewallInternetTrafficNotInspectedViolation other = (NetworkFirewallInternetTrafficNotInspectedViolation) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getSubnetAvailabilityZone() == null ^ this.getSubnetAvailabilityZone() == null)
            return false;
        if (other.getSubnetAvailabilityZone() != null && other.getSubnetAvailabilityZone().equals(this.getSubnetAvailabilityZone()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getViolatingRoutes() == null ^ this.getViolatingRoutes() == null)
            return false;
        if (other.getViolatingRoutes() != null && other.getViolatingRoutes().equals(this.getViolatingRoutes()) == false)
            return false;
        if (other.getIsRouteTableUsedInDifferentAZ() == null ^ this.getIsRouteTableUsedInDifferentAZ() == null)
            return false;
        if (other.getIsRouteTableUsedInDifferentAZ() != null
                && other.getIsRouteTableUsedInDifferentAZ().equals(this.getIsRouteTableUsedInDifferentAZ()) == false)
            return false;
        if (other.getCurrentFirewallSubnetRouteTable() == null ^ this.getCurrentFirewallSubnetRouteTable() == null)
            return false;
        if (other.getCurrentFirewallSubnetRouteTable() != null
                && other.getCurrentFirewallSubnetRouteTable().equals(this.getCurrentFirewallSubnetRouteTable()) == false)
            return false;
        if (other.getExpectedFirewallEndpoint() == null ^ this.getExpectedFirewallEndpoint() == null)
            return false;
        if (other.getExpectedFirewallEndpoint() != null && other.getExpectedFirewallEndpoint().equals(this.getExpectedFirewallEndpoint()) == false)
            return false;
        if (other.getFirewallSubnetId() == null ^ this.getFirewallSubnetId() == null)
            return false;
        if (other.getFirewallSubnetId() != null && other.getFirewallSubnetId().equals(this.getFirewallSubnetId()) == false)
            return false;
        if (other.getExpectedFirewallSubnetRoutes() == null ^ this.getExpectedFirewallSubnetRoutes() == null)
            return false;
        if (other.getExpectedFirewallSubnetRoutes() != null && other.getExpectedFirewallSubnetRoutes().equals(this.getExpectedFirewallSubnetRoutes()) == false)
            return false;
        if (other.getActualFirewallSubnetRoutes() == null ^ this.getActualFirewallSubnetRoutes() == null)
            return false;
        if (other.getActualFirewallSubnetRoutes() != null && other.getActualFirewallSubnetRoutes().equals(this.getActualFirewallSubnetRoutes()) == false)
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
        if (other.getExpectedInternetGatewayRoutes() == null ^ this.getExpectedInternetGatewayRoutes() == null)
            return false;
        if (other.getExpectedInternetGatewayRoutes() != null
                && other.getExpectedInternetGatewayRoutes().equals(this.getExpectedInternetGatewayRoutes()) == false)
            return false;
        if (other.getActualInternetGatewayRoutes() == null ^ this.getActualInternetGatewayRoutes() == null)
            return false;
        if (other.getActualInternetGatewayRoutes() != null && other.getActualInternetGatewayRoutes().equals(this.getActualInternetGatewayRoutes()) == false)
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

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getSubnetAvailabilityZone() == null) ? 0 : getSubnetAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getViolatingRoutes() == null) ? 0 : getViolatingRoutes().hashCode());
        hashCode = prime * hashCode + ((getIsRouteTableUsedInDifferentAZ() == null) ? 0 : getIsRouteTableUsedInDifferentAZ().hashCode());
        hashCode = prime * hashCode + ((getCurrentFirewallSubnetRouteTable() == null) ? 0 : getCurrentFirewallSubnetRouteTable().hashCode());
        hashCode = prime * hashCode + ((getExpectedFirewallEndpoint() == null) ? 0 : getExpectedFirewallEndpoint().hashCode());
        hashCode = prime * hashCode + ((getFirewallSubnetId() == null) ? 0 : getFirewallSubnetId().hashCode());
        hashCode = prime * hashCode + ((getExpectedFirewallSubnetRoutes() == null) ? 0 : getExpectedFirewallSubnetRoutes().hashCode());
        hashCode = prime * hashCode + ((getActualFirewallSubnetRoutes() == null) ? 0 : getActualFirewallSubnetRoutes().hashCode());
        hashCode = prime * hashCode + ((getInternetGatewayId() == null) ? 0 : getInternetGatewayId().hashCode());
        hashCode = prime * hashCode + ((getCurrentInternetGatewayRouteTable() == null) ? 0 : getCurrentInternetGatewayRouteTable().hashCode());
        hashCode = prime * hashCode + ((getExpectedInternetGatewayRoutes() == null) ? 0 : getExpectedInternetGatewayRoutes().hashCode());
        hashCode = prime * hashCode + ((getActualInternetGatewayRoutes() == null) ? 0 : getActualInternetGatewayRoutes().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public NetworkFirewallInternetTrafficNotInspectedViolation clone() {
        try {
            return (NetworkFirewallInternetTrafficNotInspectedViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.NetworkFirewallInternetTrafficNotInspectedViolationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
