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
 * Violation detail for the improperly configured subnet route. It's possible there is a missing route table route, or a
 * configuration that causes traffic to cross an Availability Zone boundary.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/NetworkFirewallInvalidRouteConfigurationViolation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkFirewallInvalidRouteConfigurationViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subnets that are affected.
     * </p>
     */
    private java.util.List<String> affectedSubnets;
    /**
     * <p>
     * The route table ID.
     * </p>
     */
    private String routeTableId;
    /**
     * <p>
     * Information about whether the route table is used in another Availability Zone.
     * </p>
     */
    private Boolean isRouteTableUsedInDifferentAZ;
    /**
     * <p>
     * The route that's in violation.
     * </p>
     */
    private Route violatingRoute;
    /**
     * <p>
     * The subnet route table for the current firewall.
     * </p>
     */
    private String currentFirewallSubnetRouteTable;
    /**
     * <p>
     * The firewall endpoint that's expected.
     * </p>
     */
    private String expectedFirewallEndpoint;
    /**
     * <p>
     * The actual firewall endpoint.
     * </p>
     */
    private String actualFirewallEndpoint;
    /**
     * <p>
     * The expected subnet ID for the firewall.
     * </p>
     */
    private String expectedFirewallSubnetId;
    /**
     * <p>
     * The actual subnet ID for the firewall.
     * </p>
     */
    private String actualFirewallSubnetId;
    /**
     * <p>
     * The firewall subnet routes that are expected.
     * </p>
     */
    private java.util.List<ExpectedRoute> expectedFirewallSubnetRoutes;
    /**
     * <p>
     * The actual firewall subnet routes that are expected.
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
     * The route table for the current internet gateway.
     * </p>
     */
    private String currentInternetGatewayRouteTable;
    /**
     * <p>
     * The expected routes for the internet gateway.
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
     * The subnets that are affected.
     * </p>
     * 
     * @return The subnets that are affected.
     */

    public java.util.List<String> getAffectedSubnets() {
        return affectedSubnets;
    }

    /**
     * <p>
     * The subnets that are affected.
     * </p>
     * 
     * @param affectedSubnets
     *        The subnets that are affected.
     */

    public void setAffectedSubnets(java.util.Collection<String> affectedSubnets) {
        if (affectedSubnets == null) {
            this.affectedSubnets = null;
            return;
        }

        this.affectedSubnets = new java.util.ArrayList<String>(affectedSubnets);
    }

    /**
     * <p>
     * The subnets that are affected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAffectedSubnets(java.util.Collection)} or {@link #withAffectedSubnets(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param affectedSubnets
     *        The subnets that are affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation withAffectedSubnets(String... affectedSubnets) {
        if (this.affectedSubnets == null) {
            setAffectedSubnets(new java.util.ArrayList<String>(affectedSubnets.length));
        }
        for (String ele : affectedSubnets) {
            this.affectedSubnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnets that are affected.
     * </p>
     * 
     * @param affectedSubnets
     *        The subnets that are affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation withAffectedSubnets(java.util.Collection<String> affectedSubnets) {
        setAffectedSubnets(affectedSubnets);
        return this;
    }

    /**
     * <p>
     * The route table ID.
     * </p>
     * 
     * @param routeTableId
     *        The route table ID.
     */

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * The route table ID.
     * </p>
     * 
     * @return The route table ID.
     */

    public String getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * <p>
     * The route table ID.
     * </p>
     * 
     * @param routeTableId
     *        The route table ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation withRouteTableId(String routeTableId) {
        setRouteTableId(routeTableId);
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

    public NetworkFirewallInvalidRouteConfigurationViolation withIsRouteTableUsedInDifferentAZ(Boolean isRouteTableUsedInDifferentAZ) {
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
     * The route that's in violation.
     * </p>
     * 
     * @param violatingRoute
     *        The route that's in violation.
     */

    public void setViolatingRoute(Route violatingRoute) {
        this.violatingRoute = violatingRoute;
    }

    /**
     * <p>
     * The route that's in violation.
     * </p>
     * 
     * @return The route that's in violation.
     */

    public Route getViolatingRoute() {
        return this.violatingRoute;
    }

    /**
     * <p>
     * The route that's in violation.
     * </p>
     * 
     * @param violatingRoute
     *        The route that's in violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation withViolatingRoute(Route violatingRoute) {
        setViolatingRoute(violatingRoute);
        return this;
    }

    /**
     * <p>
     * The subnet route table for the current firewall.
     * </p>
     * 
     * @param currentFirewallSubnetRouteTable
     *        The subnet route table for the current firewall.
     */

    public void setCurrentFirewallSubnetRouteTable(String currentFirewallSubnetRouteTable) {
        this.currentFirewallSubnetRouteTable = currentFirewallSubnetRouteTable;
    }

    /**
     * <p>
     * The subnet route table for the current firewall.
     * </p>
     * 
     * @return The subnet route table for the current firewall.
     */

    public String getCurrentFirewallSubnetRouteTable() {
        return this.currentFirewallSubnetRouteTable;
    }

    /**
     * <p>
     * The subnet route table for the current firewall.
     * </p>
     * 
     * @param currentFirewallSubnetRouteTable
     *        The subnet route table for the current firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation withCurrentFirewallSubnetRouteTable(String currentFirewallSubnetRouteTable) {
        setCurrentFirewallSubnetRouteTable(currentFirewallSubnetRouteTable);
        return this;
    }

    /**
     * <p>
     * The firewall endpoint that's expected.
     * </p>
     * 
     * @param expectedFirewallEndpoint
     *        The firewall endpoint that's expected.
     */

    public void setExpectedFirewallEndpoint(String expectedFirewallEndpoint) {
        this.expectedFirewallEndpoint = expectedFirewallEndpoint;
    }

    /**
     * <p>
     * The firewall endpoint that's expected.
     * </p>
     * 
     * @return The firewall endpoint that's expected.
     */

    public String getExpectedFirewallEndpoint() {
        return this.expectedFirewallEndpoint;
    }

    /**
     * <p>
     * The firewall endpoint that's expected.
     * </p>
     * 
     * @param expectedFirewallEndpoint
     *        The firewall endpoint that's expected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation withExpectedFirewallEndpoint(String expectedFirewallEndpoint) {
        setExpectedFirewallEndpoint(expectedFirewallEndpoint);
        return this;
    }

    /**
     * <p>
     * The actual firewall endpoint.
     * </p>
     * 
     * @param actualFirewallEndpoint
     *        The actual firewall endpoint.
     */

    public void setActualFirewallEndpoint(String actualFirewallEndpoint) {
        this.actualFirewallEndpoint = actualFirewallEndpoint;
    }

    /**
     * <p>
     * The actual firewall endpoint.
     * </p>
     * 
     * @return The actual firewall endpoint.
     */

    public String getActualFirewallEndpoint() {
        return this.actualFirewallEndpoint;
    }

    /**
     * <p>
     * The actual firewall endpoint.
     * </p>
     * 
     * @param actualFirewallEndpoint
     *        The actual firewall endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation withActualFirewallEndpoint(String actualFirewallEndpoint) {
        setActualFirewallEndpoint(actualFirewallEndpoint);
        return this;
    }

    /**
     * <p>
     * The expected subnet ID for the firewall.
     * </p>
     * 
     * @param expectedFirewallSubnetId
     *        The expected subnet ID for the firewall.
     */

    public void setExpectedFirewallSubnetId(String expectedFirewallSubnetId) {
        this.expectedFirewallSubnetId = expectedFirewallSubnetId;
    }

    /**
     * <p>
     * The expected subnet ID for the firewall.
     * </p>
     * 
     * @return The expected subnet ID for the firewall.
     */

    public String getExpectedFirewallSubnetId() {
        return this.expectedFirewallSubnetId;
    }

    /**
     * <p>
     * The expected subnet ID for the firewall.
     * </p>
     * 
     * @param expectedFirewallSubnetId
     *        The expected subnet ID for the firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation withExpectedFirewallSubnetId(String expectedFirewallSubnetId) {
        setExpectedFirewallSubnetId(expectedFirewallSubnetId);
        return this;
    }

    /**
     * <p>
     * The actual subnet ID for the firewall.
     * </p>
     * 
     * @param actualFirewallSubnetId
     *        The actual subnet ID for the firewall.
     */

    public void setActualFirewallSubnetId(String actualFirewallSubnetId) {
        this.actualFirewallSubnetId = actualFirewallSubnetId;
    }

    /**
     * <p>
     * The actual subnet ID for the firewall.
     * </p>
     * 
     * @return The actual subnet ID for the firewall.
     */

    public String getActualFirewallSubnetId() {
        return this.actualFirewallSubnetId;
    }

    /**
     * <p>
     * The actual subnet ID for the firewall.
     * </p>
     * 
     * @param actualFirewallSubnetId
     *        The actual subnet ID for the firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation withActualFirewallSubnetId(String actualFirewallSubnetId) {
        setActualFirewallSubnetId(actualFirewallSubnetId);
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

    public NetworkFirewallInvalidRouteConfigurationViolation withExpectedFirewallSubnetRoutes(ExpectedRoute... expectedFirewallSubnetRoutes) {
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

    public NetworkFirewallInvalidRouteConfigurationViolation withExpectedFirewallSubnetRoutes(java.util.Collection<ExpectedRoute> expectedFirewallSubnetRoutes) {
        setExpectedFirewallSubnetRoutes(expectedFirewallSubnetRoutes);
        return this;
    }

    /**
     * <p>
     * The actual firewall subnet routes that are expected.
     * </p>
     * 
     * @return The actual firewall subnet routes that are expected.
     */

    public java.util.List<Route> getActualFirewallSubnetRoutes() {
        return actualFirewallSubnetRoutes;
    }

    /**
     * <p>
     * The actual firewall subnet routes that are expected.
     * </p>
     * 
     * @param actualFirewallSubnetRoutes
     *        The actual firewall subnet routes that are expected.
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
     * The actual firewall subnet routes that are expected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActualFirewallSubnetRoutes(java.util.Collection)} or
     * {@link #withActualFirewallSubnetRoutes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param actualFirewallSubnetRoutes
     *        The actual firewall subnet routes that are expected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation withActualFirewallSubnetRoutes(Route... actualFirewallSubnetRoutes) {
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
     * The actual firewall subnet routes that are expected.
     * </p>
     * 
     * @param actualFirewallSubnetRoutes
     *        The actual firewall subnet routes that are expected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation withActualFirewallSubnetRoutes(java.util.Collection<Route> actualFirewallSubnetRoutes) {
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

    public NetworkFirewallInvalidRouteConfigurationViolation withInternetGatewayId(String internetGatewayId) {
        setInternetGatewayId(internetGatewayId);
        return this;
    }

    /**
     * <p>
     * The route table for the current internet gateway.
     * </p>
     * 
     * @param currentInternetGatewayRouteTable
     *        The route table for the current internet gateway.
     */

    public void setCurrentInternetGatewayRouteTable(String currentInternetGatewayRouteTable) {
        this.currentInternetGatewayRouteTable = currentInternetGatewayRouteTable;
    }

    /**
     * <p>
     * The route table for the current internet gateway.
     * </p>
     * 
     * @return The route table for the current internet gateway.
     */

    public String getCurrentInternetGatewayRouteTable() {
        return this.currentInternetGatewayRouteTable;
    }

    /**
     * <p>
     * The route table for the current internet gateway.
     * </p>
     * 
     * @param currentInternetGatewayRouteTable
     *        The route table for the current internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation withCurrentInternetGatewayRouteTable(String currentInternetGatewayRouteTable) {
        setCurrentInternetGatewayRouteTable(currentInternetGatewayRouteTable);
        return this;
    }

    /**
     * <p>
     * The expected routes for the internet gateway.
     * </p>
     * 
     * @return The expected routes for the internet gateway.
     */

    public java.util.List<ExpectedRoute> getExpectedInternetGatewayRoutes() {
        return expectedInternetGatewayRoutes;
    }

    /**
     * <p>
     * The expected routes for the internet gateway.
     * </p>
     * 
     * @param expectedInternetGatewayRoutes
     *        The expected routes for the internet gateway.
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
     * The expected routes for the internet gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExpectedInternetGatewayRoutes(java.util.Collection)} or
     * {@link #withExpectedInternetGatewayRoutes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param expectedInternetGatewayRoutes
     *        The expected routes for the internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation withExpectedInternetGatewayRoutes(ExpectedRoute... expectedInternetGatewayRoutes) {
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
     * The expected routes for the internet gateway.
     * </p>
     * 
     * @param expectedInternetGatewayRoutes
     *        The expected routes for the internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation withExpectedInternetGatewayRoutes(java.util.Collection<ExpectedRoute> expectedInternetGatewayRoutes) {
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

    public NetworkFirewallInvalidRouteConfigurationViolation withActualInternetGatewayRoutes(Route... actualInternetGatewayRoutes) {
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

    public NetworkFirewallInvalidRouteConfigurationViolation withActualInternetGatewayRoutes(java.util.Collection<Route> actualInternetGatewayRoutes) {
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

    public NetworkFirewallInvalidRouteConfigurationViolation withVpcId(String vpcId) {
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
        if (getAffectedSubnets() != null)
            sb.append("AffectedSubnets: ").append(getAffectedSubnets()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId()).append(",");
        if (getIsRouteTableUsedInDifferentAZ() != null)
            sb.append("IsRouteTableUsedInDifferentAZ: ").append(getIsRouteTableUsedInDifferentAZ()).append(",");
        if (getViolatingRoute() != null)
            sb.append("ViolatingRoute: ").append(getViolatingRoute()).append(",");
        if (getCurrentFirewallSubnetRouteTable() != null)
            sb.append("CurrentFirewallSubnetRouteTable: ").append(getCurrentFirewallSubnetRouteTable()).append(",");
        if (getExpectedFirewallEndpoint() != null)
            sb.append("ExpectedFirewallEndpoint: ").append(getExpectedFirewallEndpoint()).append(",");
        if (getActualFirewallEndpoint() != null)
            sb.append("ActualFirewallEndpoint: ").append(getActualFirewallEndpoint()).append(",");
        if (getExpectedFirewallSubnetId() != null)
            sb.append("ExpectedFirewallSubnetId: ").append(getExpectedFirewallSubnetId()).append(",");
        if (getActualFirewallSubnetId() != null)
            sb.append("ActualFirewallSubnetId: ").append(getActualFirewallSubnetId()).append(",");
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

        if (obj instanceof NetworkFirewallInvalidRouteConfigurationViolation == false)
            return false;
        NetworkFirewallInvalidRouteConfigurationViolation other = (NetworkFirewallInvalidRouteConfigurationViolation) obj;
        if (other.getAffectedSubnets() == null ^ this.getAffectedSubnets() == null)
            return false;
        if (other.getAffectedSubnets() != null && other.getAffectedSubnets().equals(this.getAffectedSubnets()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getIsRouteTableUsedInDifferentAZ() == null ^ this.getIsRouteTableUsedInDifferentAZ() == null)
            return false;
        if (other.getIsRouteTableUsedInDifferentAZ() != null
                && other.getIsRouteTableUsedInDifferentAZ().equals(this.getIsRouteTableUsedInDifferentAZ()) == false)
            return false;
        if (other.getViolatingRoute() == null ^ this.getViolatingRoute() == null)
            return false;
        if (other.getViolatingRoute() != null && other.getViolatingRoute().equals(this.getViolatingRoute()) == false)
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
        if (other.getActualFirewallEndpoint() == null ^ this.getActualFirewallEndpoint() == null)
            return false;
        if (other.getActualFirewallEndpoint() != null && other.getActualFirewallEndpoint().equals(this.getActualFirewallEndpoint()) == false)
            return false;
        if (other.getExpectedFirewallSubnetId() == null ^ this.getExpectedFirewallSubnetId() == null)
            return false;
        if (other.getExpectedFirewallSubnetId() != null && other.getExpectedFirewallSubnetId().equals(this.getExpectedFirewallSubnetId()) == false)
            return false;
        if (other.getActualFirewallSubnetId() == null ^ this.getActualFirewallSubnetId() == null)
            return false;
        if (other.getActualFirewallSubnetId() != null && other.getActualFirewallSubnetId().equals(this.getActualFirewallSubnetId()) == false)
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

        hashCode = prime * hashCode + ((getAffectedSubnets() == null) ? 0 : getAffectedSubnets().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getIsRouteTableUsedInDifferentAZ() == null) ? 0 : getIsRouteTableUsedInDifferentAZ().hashCode());
        hashCode = prime * hashCode + ((getViolatingRoute() == null) ? 0 : getViolatingRoute().hashCode());
        hashCode = prime * hashCode + ((getCurrentFirewallSubnetRouteTable() == null) ? 0 : getCurrentFirewallSubnetRouteTable().hashCode());
        hashCode = prime * hashCode + ((getExpectedFirewallEndpoint() == null) ? 0 : getExpectedFirewallEndpoint().hashCode());
        hashCode = prime * hashCode + ((getActualFirewallEndpoint() == null) ? 0 : getActualFirewallEndpoint().hashCode());
        hashCode = prime * hashCode + ((getExpectedFirewallSubnetId() == null) ? 0 : getExpectedFirewallSubnetId().hashCode());
        hashCode = prime * hashCode + ((getActualFirewallSubnetId() == null) ? 0 : getActualFirewallSubnetId().hashCode());
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
    public NetworkFirewallInvalidRouteConfigurationViolation clone() {
        try {
            return (NetworkFirewallInvalidRouteConfigurationViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.NetworkFirewallInvalidRouteConfigurationViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
