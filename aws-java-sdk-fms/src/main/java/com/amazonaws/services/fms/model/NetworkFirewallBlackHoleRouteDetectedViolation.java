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
 * Violation detail for an internet gateway route with an inactive state in the customer subnet route table or Network
 * Firewall subnet route table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/NetworkFirewallBlackHoleRouteDetectedViolation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkFirewallBlackHoleRouteDetectedViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subnet that has an inactive state.
     * </p>
     */
    private String violationTarget;
    /**
     * <p>
     * Information about the route table ID.
     * </p>
     */
    private String routeTableId;
    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Information about the route or routes that are in violation.
     * </p>
     */
    private java.util.List<Route> violatingRoutes;

    /**
     * <p>
     * The subnet that has an inactive state.
     * </p>
     * 
     * @param violationTarget
     *        The subnet that has an inactive state.
     */

    public void setViolationTarget(String violationTarget) {
        this.violationTarget = violationTarget;
    }

    /**
     * <p>
     * The subnet that has an inactive state.
     * </p>
     * 
     * @return The subnet that has an inactive state.
     */

    public String getViolationTarget() {
        return this.violationTarget;
    }

    /**
     * <p>
     * The subnet that has an inactive state.
     * </p>
     * 
     * @param violationTarget
     *        The subnet that has an inactive state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallBlackHoleRouteDetectedViolation withViolationTarget(String violationTarget) {
        setViolationTarget(violationTarget);
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

    public NetworkFirewallBlackHoleRouteDetectedViolation withRouteTableId(String routeTableId) {
        setRouteTableId(routeTableId);
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

    public NetworkFirewallBlackHoleRouteDetectedViolation withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Information about the route or routes that are in violation.
     * </p>
     * 
     * @return Information about the route or routes that are in violation.
     */

    public java.util.List<Route> getViolatingRoutes() {
        return violatingRoutes;
    }

    /**
     * <p>
     * Information about the route or routes that are in violation.
     * </p>
     * 
     * @param violatingRoutes
     *        Information about the route or routes that are in violation.
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
     * Information about the route or routes that are in violation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setViolatingRoutes(java.util.Collection)} or {@link #withViolatingRoutes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param violatingRoutes
     *        Information about the route or routes that are in violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallBlackHoleRouteDetectedViolation withViolatingRoutes(Route... violatingRoutes) {
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
     * Information about the route or routes that are in violation.
     * </p>
     * 
     * @param violatingRoutes
     *        Information about the route or routes that are in violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallBlackHoleRouteDetectedViolation withViolatingRoutes(java.util.Collection<Route> violatingRoutes) {
        setViolatingRoutes(violatingRoutes);
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
        if (getViolationTarget() != null)
            sb.append("ViolationTarget: ").append(getViolationTarget()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getViolatingRoutes() != null)
            sb.append("ViolatingRoutes: ").append(getViolatingRoutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkFirewallBlackHoleRouteDetectedViolation == false)
            return false;
        NetworkFirewallBlackHoleRouteDetectedViolation other = (NetworkFirewallBlackHoleRouteDetectedViolation) obj;
        if (other.getViolationTarget() == null ^ this.getViolationTarget() == null)
            return false;
        if (other.getViolationTarget() != null && other.getViolationTarget().equals(this.getViolationTarget()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getViolatingRoutes() == null ^ this.getViolatingRoutes() == null)
            return false;
        if (other.getViolatingRoutes() != null && other.getViolatingRoutes().equals(this.getViolatingRoutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViolationTarget() == null) ? 0 : getViolationTarget().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getViolatingRoutes() == null) ? 0 : getViolatingRoutes().hashCode());
        return hashCode;
    }

    @Override
    public NetworkFirewallBlackHoleRouteDetectedViolation clone() {
        try {
            return (NetworkFirewallBlackHoleRouteDetectedViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.NetworkFirewallBlackHoleRouteDetectedViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
