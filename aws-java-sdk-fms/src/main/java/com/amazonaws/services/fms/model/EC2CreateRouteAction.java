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
 * Information about the CreateRoute action in Amazon EC2.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/EC2CreateRouteAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2CreateRouteAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of CreateRoute action in Amazon EC2.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the IPv4 CIDR address block used for the destination match.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * Information about the ID of a prefix list used for the destination match.
     * </p>
     */
    private String destinationPrefixListId;
    /**
     * <p>
     * Information about the IPv6 CIDR block destination.
     * </p>
     */
    private String destinationIpv6CidrBlock;
    /**
     * <p>
     * Information about the ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
     * </p>
     */
    private ActionTarget vpcEndpointId;
    /**
     * <p>
     * Information about the ID of an internet gateway or virtual private gateway attached to your VPC.
     * </p>
     */
    private ActionTarget gatewayId;
    /**
     * <p>
     * Information about the ID of the route table for the route.
     * </p>
     */
    private ActionTarget routeTableId;

    /**
     * <p>
     * A description of CreateRoute action in Amazon EC2.
     * </p>
     * 
     * @param description
     *        A description of CreateRoute action in Amazon EC2.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of CreateRoute action in Amazon EC2.
     * </p>
     * 
     * @return A description of CreateRoute action in Amazon EC2.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of CreateRoute action in Amazon EC2.
     * </p>
     * 
     * @param description
     *        A description of CreateRoute action in Amazon EC2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2CreateRouteAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR address block used for the destination match.
     * </p>
     * 
     * @param destinationCidrBlock
     *        Information about the IPv4 CIDR address block used for the destination match.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR address block used for the destination match.
     * </p>
     * 
     * @return Information about the IPv4 CIDR address block used for the destination match.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR address block used for the destination match.
     * </p>
     * 
     * @param destinationCidrBlock
     *        Information about the IPv4 CIDR address block used for the destination match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2CreateRouteAction withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * Information about the ID of a prefix list used for the destination match.
     * </p>
     * 
     * @param destinationPrefixListId
     *        Information about the ID of a prefix list used for the destination match.
     */

    public void setDestinationPrefixListId(String destinationPrefixListId) {
        this.destinationPrefixListId = destinationPrefixListId;
    }

    /**
     * <p>
     * Information about the ID of a prefix list used for the destination match.
     * </p>
     * 
     * @return Information about the ID of a prefix list used for the destination match.
     */

    public String getDestinationPrefixListId() {
        return this.destinationPrefixListId;
    }

    /**
     * <p>
     * Information about the ID of a prefix list used for the destination match.
     * </p>
     * 
     * @param destinationPrefixListId
     *        Information about the ID of a prefix list used for the destination match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2CreateRouteAction withDestinationPrefixListId(String destinationPrefixListId) {
        setDestinationPrefixListId(destinationPrefixListId);
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR block destination.
     * </p>
     * 
     * @param destinationIpv6CidrBlock
     *        Information about the IPv6 CIDR block destination.
     */

    public void setDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR block destination.
     * </p>
     * 
     * @return Information about the IPv6 CIDR block destination.
     */

    public String getDestinationIpv6CidrBlock() {
        return this.destinationIpv6CidrBlock;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR block destination.
     * </p>
     * 
     * @param destinationIpv6CidrBlock
     *        Information about the IPv6 CIDR block destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2CreateRouteAction withDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        setDestinationIpv6CidrBlock(destinationIpv6CidrBlock);
        return this;
    }

    /**
     * <p>
     * Information about the ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
     * </p>
     * 
     * @param vpcEndpointId
     *        Information about the ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
     */

    public void setVpcEndpointId(ActionTarget vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * Information about the ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
     * </p>
     * 
     * @return Information about the ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
     */

    public ActionTarget getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * Information about the ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
     * </p>
     * 
     * @param vpcEndpointId
     *        Information about the ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2CreateRouteAction withVpcEndpointId(ActionTarget vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * Information about the ID of an internet gateway or virtual private gateway attached to your VPC.
     * </p>
     * 
     * @param gatewayId
     *        Information about the ID of an internet gateway or virtual private gateway attached to your VPC.
     */

    public void setGatewayId(ActionTarget gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * Information about the ID of an internet gateway or virtual private gateway attached to your VPC.
     * </p>
     * 
     * @return Information about the ID of an internet gateway or virtual private gateway attached to your VPC.
     */

    public ActionTarget getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * Information about the ID of an internet gateway or virtual private gateway attached to your VPC.
     * </p>
     * 
     * @param gatewayId
     *        Information about the ID of an internet gateway or virtual private gateway attached to your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2CreateRouteAction withGatewayId(ActionTarget gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * Information about the ID of the route table for the route.
     * </p>
     * 
     * @param routeTableId
     *        Information about the ID of the route table for the route.
     */

    public void setRouteTableId(ActionTarget routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * Information about the ID of the route table for the route.
     * </p>
     * 
     * @return Information about the ID of the route table for the route.
     */

    public ActionTarget getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * <p>
     * Information about the ID of the route table for the route.
     * </p>
     * 
     * @param routeTableId
     *        Information about the ID of the route table for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2CreateRouteAction withRouteTableId(ActionTarget routeTableId) {
        setRouteTableId(routeTableId);
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
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getDestinationPrefixListId() != null)
            sb.append("DestinationPrefixListId: ").append(getDestinationPrefixListId()).append(",");
        if (getDestinationIpv6CidrBlock() != null)
            sb.append("DestinationIpv6CidrBlock: ").append(getDestinationIpv6CidrBlock()).append(",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId()).append(",");
        if (getGatewayId() != null)
            sb.append("GatewayId: ").append(getGatewayId()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2CreateRouteAction == false)
            return false;
        EC2CreateRouteAction other = (EC2CreateRouteAction) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getDestinationPrefixListId() == null ^ this.getDestinationPrefixListId() == null)
            return false;
        if (other.getDestinationPrefixListId() != null && other.getDestinationPrefixListId().equals(this.getDestinationPrefixListId()) == false)
            return false;
        if (other.getDestinationIpv6CidrBlock() == null ^ this.getDestinationIpv6CidrBlock() == null)
            return false;
        if (other.getDestinationIpv6CidrBlock() != null && other.getDestinationIpv6CidrBlock().equals(this.getDestinationIpv6CidrBlock()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDestinationPrefixListId() == null) ? 0 : getDestinationPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getDestinationIpv6CidrBlock() == null) ? 0 : getDestinationIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        return hashCode;
    }

    @Override
    public EC2CreateRouteAction clone() {
        try {
            return (EC2CreateRouteAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.EC2CreateRouteActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
