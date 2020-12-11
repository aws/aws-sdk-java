/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a route table route.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AnalysisRouteTableRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisRouteTableRoute implements Serializable, Cloneable {

    /**
     * <p>
     * The destination IPv4 address, in CIDR notation.
     * </p>
     */
    private String destinationCidr;
    /**
     * <p>
     * The prefix of the AWS service.
     * </p>
     */
    private String destinationPrefixListId;
    /**
     * <p>
     * The ID of an egress-only internet gateway.
     * </p>
     */
    private String egressOnlyInternetGatewayId;
    /**
     * <p>
     * The ID of the gateway, such as an internet gateway or virtual private gateway.
     * </p>
     */
    private String gatewayId;
    /**
     * <p>
     * The ID of the instance, such as a NAT instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The ID of a NAT gateway.
     * </p>
     */
    private String natGatewayId;
    /**
     * <p>
     * The ID of a network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * Describes how the route was created. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     * </p>
     * </li>
     * </ul>
     */
    private String origin;
    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * The destination IPv4 address, in CIDR notation.
     * </p>
     * 
     * @param destinationCidr
     *        The destination IPv4 address, in CIDR notation.
     */

    public void setDestinationCidr(String destinationCidr) {
        this.destinationCidr = destinationCidr;
    }

    /**
     * <p>
     * The destination IPv4 address, in CIDR notation.
     * </p>
     * 
     * @return The destination IPv4 address, in CIDR notation.
     */

    public String getDestinationCidr() {
        return this.destinationCidr;
    }

    /**
     * <p>
     * The destination IPv4 address, in CIDR notation.
     * </p>
     * 
     * @param destinationCidr
     *        The destination IPv4 address, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRouteTableRoute withDestinationCidr(String destinationCidr) {
        setDestinationCidr(destinationCidr);
        return this;
    }

    /**
     * <p>
     * The prefix of the AWS service.
     * </p>
     * 
     * @param destinationPrefixListId
     *        The prefix of the AWS service.
     */

    public void setDestinationPrefixListId(String destinationPrefixListId) {
        this.destinationPrefixListId = destinationPrefixListId;
    }

    /**
     * <p>
     * The prefix of the AWS service.
     * </p>
     * 
     * @return The prefix of the AWS service.
     */

    public String getDestinationPrefixListId() {
        return this.destinationPrefixListId;
    }

    /**
     * <p>
     * The prefix of the AWS service.
     * </p>
     * 
     * @param destinationPrefixListId
     *        The prefix of the AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRouteTableRoute withDestinationPrefixListId(String destinationPrefixListId) {
        setDestinationPrefixListId(destinationPrefixListId);
        return this;
    }

    /**
     * <p>
     * The ID of an egress-only internet gateway.
     * </p>
     * 
     * @param egressOnlyInternetGatewayId
     *        The ID of an egress-only internet gateway.
     */

    public void setEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * The ID of an egress-only internet gateway.
     * </p>
     * 
     * @return The ID of an egress-only internet gateway.
     */

    public String getEgressOnlyInternetGatewayId() {
        return this.egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * The ID of an egress-only internet gateway.
     * </p>
     * 
     * @param egressOnlyInternetGatewayId
     *        The ID of an egress-only internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRouteTableRoute withEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        setEgressOnlyInternetGatewayId(egressOnlyInternetGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the gateway, such as an internet gateway or virtual private gateway.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the gateway, such as an internet gateway or virtual private gateway.
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway, such as an internet gateway or virtual private gateway.
     * </p>
     * 
     * @return The ID of the gateway, such as an internet gateway or virtual private gateway.
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway, such as an internet gateway or virtual private gateway.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the gateway, such as an internet gateway or virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRouteTableRoute withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the instance, such as a NAT instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance, such as a NAT instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance, such as a NAT instance.
     * </p>
     * 
     * @return The ID of the instance, such as a NAT instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance, such as a NAT instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance, such as a NAT instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRouteTableRoute withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The ID of a NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of a NAT gateway.
     */

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    /**
     * <p>
     * The ID of a NAT gateway.
     * </p>
     * 
     * @return The ID of a NAT gateway.
     */

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * <p>
     * The ID of a NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of a NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRouteTableRoute withNatGatewayId(String natGatewayId) {
        setNatGatewayId(natGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of a network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of a network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of a network interface.
     * </p>
     * 
     * @return The ID of a network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of a network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of a network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRouteTableRoute withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * Describes how the route was created. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param origin
     *        Describes how the route was created. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreateRoute</code> - The route was manually added to the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     *        </p>
     *        </li>
     */

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * Describes how the route was created. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes how the route was created. The following are possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreateRoute</code> - The route was manually added to the route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     *         </p>
     *         </li>
     */

    public String getOrigin() {
        return this.origin;
    }

    /**
     * <p>
     * Describes how the route was created. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param origin
     *        Describes how the route was created. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreateRoute</code> - The route was manually added to the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRouteTableRoute withOrigin(String origin) {
        setOrigin(origin);
        return this;
    }

    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of a transit gateway.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     * 
     * @return The ID of a transit gateway.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of a transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRouteTableRoute withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of a VPC peering connection.
     */

    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     * 
     * @return The ID of a VPC peering connection.
     */

    public String getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of a VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRouteTableRoute withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        setVpcPeeringConnectionId(vpcPeeringConnectionId);
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
        if (getDestinationCidr() != null)
            sb.append("DestinationCidr: ").append(getDestinationCidr()).append(",");
        if (getDestinationPrefixListId() != null)
            sb.append("DestinationPrefixListId: ").append(getDestinationPrefixListId()).append(",");
        if (getEgressOnlyInternetGatewayId() != null)
            sb.append("EgressOnlyInternetGatewayId: ").append(getEgressOnlyInternetGatewayId()).append(",");
        if (getGatewayId() != null)
            sb.append("GatewayId: ").append(getGatewayId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getNatGatewayId() != null)
            sb.append("NatGatewayId: ").append(getNatGatewayId()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getOrigin() != null)
            sb.append("Origin: ").append(getOrigin()).append(",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: ").append(getVpcPeeringConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisRouteTableRoute == false)
            return false;
        AnalysisRouteTableRoute other = (AnalysisRouteTableRoute) obj;
        if (other.getDestinationCidr() == null ^ this.getDestinationCidr() == null)
            return false;
        if (other.getDestinationCidr() != null && other.getDestinationCidr().equals(this.getDestinationCidr()) == false)
            return false;
        if (other.getDestinationPrefixListId() == null ^ this.getDestinationPrefixListId() == null)
            return false;
        if (other.getDestinationPrefixListId() != null && other.getDestinationPrefixListId().equals(this.getDestinationPrefixListId()) == false)
            return false;
        if (other.getEgressOnlyInternetGatewayId() == null ^ this.getEgressOnlyInternetGatewayId() == null)
            return false;
        if (other.getEgressOnlyInternetGatewayId() != null && other.getEgressOnlyInternetGatewayId().equals(this.getEgressOnlyInternetGatewayId()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getNatGatewayId() == null ^ this.getNatGatewayId() == null)
            return false;
        if (other.getNatGatewayId() != null && other.getNatGatewayId().equals(this.getNatGatewayId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationCidr() == null) ? 0 : getDestinationCidr().hashCode());
        hashCode = prime * hashCode + ((getDestinationPrefixListId() == null) ? 0 : getDestinationPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getEgressOnlyInternetGatewayId() == null) ? 0 : getEgressOnlyInternetGatewayId().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisRouteTableRoute clone() {
        try {
            return (AnalysisRouteTableRoute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
