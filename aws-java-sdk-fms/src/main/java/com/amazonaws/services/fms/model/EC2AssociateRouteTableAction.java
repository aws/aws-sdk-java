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
 * The action of associating an EC2 resource, such as a subnet or internet gateway, with a route table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/EC2AssociateRouteTableAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2AssociateRouteTableAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the EC2 route table that is associated with the remediation action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the EC2 route table that is associated with the remediation action.
     * </p>
     */
    private ActionTarget routeTableId;
    /**
     * <p>
     * The ID of the subnet for the EC2 route table that is associated with the remediation action.
     * </p>
     */
    private ActionTarget subnetId;
    /**
     * <p>
     * The ID of the gateway to be used with the EC2 route table that is associated with the remediation action.
     * </p>
     */
    private ActionTarget gatewayId;

    /**
     * <p>
     * A description of the EC2 route table that is associated with the remediation action.
     * </p>
     * 
     * @param description
     *        A description of the EC2 route table that is associated with the remediation action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the EC2 route table that is associated with the remediation action.
     * </p>
     * 
     * @return A description of the EC2 route table that is associated with the remediation action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the EC2 route table that is associated with the remediation action.
     * </p>
     * 
     * @param description
     *        A description of the EC2 route table that is associated with the remediation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2AssociateRouteTableAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 route table that is associated with the remediation action.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the EC2 route table that is associated with the remediation action.
     */

    public void setRouteTableId(ActionTarget routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * The ID of the EC2 route table that is associated with the remediation action.
     * </p>
     * 
     * @return The ID of the EC2 route table that is associated with the remediation action.
     */

    public ActionTarget getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * <p>
     * The ID of the EC2 route table that is associated with the remediation action.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the EC2 route table that is associated with the remediation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2AssociateRouteTableAction withRouteTableId(ActionTarget routeTableId) {
        setRouteTableId(routeTableId);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet for the EC2 route table that is associated with the remediation action.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet for the EC2 route table that is associated with the remediation action.
     */

    public void setSubnetId(ActionTarget subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet for the EC2 route table that is associated with the remediation action.
     * </p>
     * 
     * @return The ID of the subnet for the EC2 route table that is associated with the remediation action.
     */

    public ActionTarget getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet for the EC2 route table that is associated with the remediation action.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet for the EC2 route table that is associated with the remediation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2AssociateRouteTableAction withSubnetId(ActionTarget subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The ID of the gateway to be used with the EC2 route table that is associated with the remediation action.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the gateway to be used with the EC2 route table that is associated with the remediation action.
     */

    public void setGatewayId(ActionTarget gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway to be used with the EC2 route table that is associated with the remediation action.
     * </p>
     * 
     * @return The ID of the gateway to be used with the EC2 route table that is associated with the remediation action.
     */

    public ActionTarget getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway to be used with the EC2 route table that is associated with the remediation action.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the gateway to be used with the EC2 route table that is associated with the remediation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2AssociateRouteTableAction withGatewayId(ActionTarget gatewayId) {
        setGatewayId(gatewayId);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getGatewayId() != null)
            sb.append("GatewayId: ").append(getGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2AssociateRouteTableAction == false)
            return false;
        EC2AssociateRouteTableAction other = (EC2AssociateRouteTableAction) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public EC2AssociateRouteTableAction clone() {
        try {
            return (EC2AssociateRouteTableAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.EC2AssociateRouteTableActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
