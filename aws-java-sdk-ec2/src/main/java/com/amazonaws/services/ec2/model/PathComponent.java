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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a path component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PathComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PathComponent implements Serializable, Cloneable {

    /**
     * <p>
     * The sequence number.
     * </p>
     */
    private Integer sequenceNumber;
    /**
     * <p>
     * The network ACL rule.
     * </p>
     */
    private AnalysisAclRule aclRule;
    /**
     * <p>
     * The resource to which the path component is attached.
     * </p>
     */
    private AnalysisComponent attachedTo;
    /**
     * <p>
     * The component.
     * </p>
     */
    private AnalysisComponent component;
    /**
     * <p>
     * The destination VPC.
     * </p>
     */
    private AnalysisComponent destinationVpc;
    /**
     * <p>
     * The outbound header.
     * </p>
     */
    private AnalysisPacketHeader outboundHeader;
    /**
     * <p>
     * The inbound header.
     * </p>
     */
    private AnalysisPacketHeader inboundHeader;
    /**
     * <p>
     * The route table route.
     * </p>
     */
    private AnalysisRouteTableRoute routeTableRoute;
    /**
     * <p>
     * The security group rule.
     * </p>
     */
    private AnalysisSecurityGroupRule securityGroupRule;
    /**
     * <p>
     * The source VPC.
     * </p>
     */
    private AnalysisComponent sourceVpc;
    /**
     * <p>
     * The subnet.
     * </p>
     */
    private AnalysisComponent subnet;
    /**
     * <p>
     * The component VPC.
     * </p>
     */
    private AnalysisComponent vpc;
    /**
     * <p>
     * The additional details.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AdditionalDetail> additionalDetails;
    /**
     * <p>
     * The transit gateway.
     * </p>
     */
    private AnalysisComponent transitGateway;
    /**
     * <p>
     * The route in a transit gateway route table.
     * </p>
     */
    private TransitGatewayRouteTableRoute transitGatewayRouteTableRoute;
    /**
     * <p>
     * The explanation codes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Explanation> explanations;
    /**
     * <p>
     * The load balancer listener.
     * </p>
     */
    private AnalysisComponent elasticLoadBalancerListener;

    /**
     * <p>
     * The sequence number.
     * </p>
     * 
     * @param sequenceNumber
     *        The sequence number.
     */

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * <p>
     * The sequence number.
     * </p>
     * 
     * @return The sequence number.
     */

    public Integer getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * <p>
     * The sequence number.
     * </p>
     * 
     * @param sequenceNumber
     *        The sequence number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withSequenceNumber(Integer sequenceNumber) {
        setSequenceNumber(sequenceNumber);
        return this;
    }

    /**
     * <p>
     * The network ACL rule.
     * </p>
     * 
     * @param aclRule
     *        The network ACL rule.
     */

    public void setAclRule(AnalysisAclRule aclRule) {
        this.aclRule = aclRule;
    }

    /**
     * <p>
     * The network ACL rule.
     * </p>
     * 
     * @return The network ACL rule.
     */

    public AnalysisAclRule getAclRule() {
        return this.aclRule;
    }

    /**
     * <p>
     * The network ACL rule.
     * </p>
     * 
     * @param aclRule
     *        The network ACL rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withAclRule(AnalysisAclRule aclRule) {
        setAclRule(aclRule);
        return this;
    }

    /**
     * <p>
     * The resource to which the path component is attached.
     * </p>
     * 
     * @param attachedTo
     *        The resource to which the path component is attached.
     */

    public void setAttachedTo(AnalysisComponent attachedTo) {
        this.attachedTo = attachedTo;
    }

    /**
     * <p>
     * The resource to which the path component is attached.
     * </p>
     * 
     * @return The resource to which the path component is attached.
     */

    public AnalysisComponent getAttachedTo() {
        return this.attachedTo;
    }

    /**
     * <p>
     * The resource to which the path component is attached.
     * </p>
     * 
     * @param attachedTo
     *        The resource to which the path component is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withAttachedTo(AnalysisComponent attachedTo) {
        setAttachedTo(attachedTo);
        return this;
    }

    /**
     * <p>
     * The component.
     * </p>
     * 
     * @param component
     *        The component.
     */

    public void setComponent(AnalysisComponent component) {
        this.component = component;
    }

    /**
     * <p>
     * The component.
     * </p>
     * 
     * @return The component.
     */

    public AnalysisComponent getComponent() {
        return this.component;
    }

    /**
     * <p>
     * The component.
     * </p>
     * 
     * @param component
     *        The component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withComponent(AnalysisComponent component) {
        setComponent(component);
        return this;
    }

    /**
     * <p>
     * The destination VPC.
     * </p>
     * 
     * @param destinationVpc
     *        The destination VPC.
     */

    public void setDestinationVpc(AnalysisComponent destinationVpc) {
        this.destinationVpc = destinationVpc;
    }

    /**
     * <p>
     * The destination VPC.
     * </p>
     * 
     * @return The destination VPC.
     */

    public AnalysisComponent getDestinationVpc() {
        return this.destinationVpc;
    }

    /**
     * <p>
     * The destination VPC.
     * </p>
     * 
     * @param destinationVpc
     *        The destination VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withDestinationVpc(AnalysisComponent destinationVpc) {
        setDestinationVpc(destinationVpc);
        return this;
    }

    /**
     * <p>
     * The outbound header.
     * </p>
     * 
     * @param outboundHeader
     *        The outbound header.
     */

    public void setOutboundHeader(AnalysisPacketHeader outboundHeader) {
        this.outboundHeader = outboundHeader;
    }

    /**
     * <p>
     * The outbound header.
     * </p>
     * 
     * @return The outbound header.
     */

    public AnalysisPacketHeader getOutboundHeader() {
        return this.outboundHeader;
    }

    /**
     * <p>
     * The outbound header.
     * </p>
     * 
     * @param outboundHeader
     *        The outbound header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withOutboundHeader(AnalysisPacketHeader outboundHeader) {
        setOutboundHeader(outboundHeader);
        return this;
    }

    /**
     * <p>
     * The inbound header.
     * </p>
     * 
     * @param inboundHeader
     *        The inbound header.
     */

    public void setInboundHeader(AnalysisPacketHeader inboundHeader) {
        this.inboundHeader = inboundHeader;
    }

    /**
     * <p>
     * The inbound header.
     * </p>
     * 
     * @return The inbound header.
     */

    public AnalysisPacketHeader getInboundHeader() {
        return this.inboundHeader;
    }

    /**
     * <p>
     * The inbound header.
     * </p>
     * 
     * @param inboundHeader
     *        The inbound header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withInboundHeader(AnalysisPacketHeader inboundHeader) {
        setInboundHeader(inboundHeader);
        return this;
    }

    /**
     * <p>
     * The route table route.
     * </p>
     * 
     * @param routeTableRoute
     *        The route table route.
     */

    public void setRouteTableRoute(AnalysisRouteTableRoute routeTableRoute) {
        this.routeTableRoute = routeTableRoute;
    }

    /**
     * <p>
     * The route table route.
     * </p>
     * 
     * @return The route table route.
     */

    public AnalysisRouteTableRoute getRouteTableRoute() {
        return this.routeTableRoute;
    }

    /**
     * <p>
     * The route table route.
     * </p>
     * 
     * @param routeTableRoute
     *        The route table route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withRouteTableRoute(AnalysisRouteTableRoute routeTableRoute) {
        setRouteTableRoute(routeTableRoute);
        return this;
    }

    /**
     * <p>
     * The security group rule.
     * </p>
     * 
     * @param securityGroupRule
     *        The security group rule.
     */

    public void setSecurityGroupRule(AnalysisSecurityGroupRule securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
    }

    /**
     * <p>
     * The security group rule.
     * </p>
     * 
     * @return The security group rule.
     */

    public AnalysisSecurityGroupRule getSecurityGroupRule() {
        return this.securityGroupRule;
    }

    /**
     * <p>
     * The security group rule.
     * </p>
     * 
     * @param securityGroupRule
     *        The security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withSecurityGroupRule(AnalysisSecurityGroupRule securityGroupRule) {
        setSecurityGroupRule(securityGroupRule);
        return this;
    }

    /**
     * <p>
     * The source VPC.
     * </p>
     * 
     * @param sourceVpc
     *        The source VPC.
     */

    public void setSourceVpc(AnalysisComponent sourceVpc) {
        this.sourceVpc = sourceVpc;
    }

    /**
     * <p>
     * The source VPC.
     * </p>
     * 
     * @return The source VPC.
     */

    public AnalysisComponent getSourceVpc() {
        return this.sourceVpc;
    }

    /**
     * <p>
     * The source VPC.
     * </p>
     * 
     * @param sourceVpc
     *        The source VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withSourceVpc(AnalysisComponent sourceVpc) {
        setSourceVpc(sourceVpc);
        return this;
    }

    /**
     * <p>
     * The subnet.
     * </p>
     * 
     * @param subnet
     *        The subnet.
     */

    public void setSubnet(AnalysisComponent subnet) {
        this.subnet = subnet;
    }

    /**
     * <p>
     * The subnet.
     * </p>
     * 
     * @return The subnet.
     */

    public AnalysisComponent getSubnet() {
        return this.subnet;
    }

    /**
     * <p>
     * The subnet.
     * </p>
     * 
     * @param subnet
     *        The subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withSubnet(AnalysisComponent subnet) {
        setSubnet(subnet);
        return this;
    }

    /**
     * <p>
     * The component VPC.
     * </p>
     * 
     * @param vpc
     *        The component VPC.
     */

    public void setVpc(AnalysisComponent vpc) {
        this.vpc = vpc;
    }

    /**
     * <p>
     * The component VPC.
     * </p>
     * 
     * @return The component VPC.
     */

    public AnalysisComponent getVpc() {
        return this.vpc;
    }

    /**
     * <p>
     * The component VPC.
     * </p>
     * 
     * @param vpc
     *        The component VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withVpc(AnalysisComponent vpc) {
        setVpc(vpc);
        return this;
    }

    /**
     * <p>
     * The additional details.
     * </p>
     * 
     * @return The additional details.
     */

    public java.util.List<AdditionalDetail> getAdditionalDetails() {
        if (additionalDetails == null) {
            additionalDetails = new com.amazonaws.internal.SdkInternalList<AdditionalDetail>();
        }
        return additionalDetails;
    }

    /**
     * <p>
     * The additional details.
     * </p>
     * 
     * @param additionalDetails
     *        The additional details.
     */

    public void setAdditionalDetails(java.util.Collection<AdditionalDetail> additionalDetails) {
        if (additionalDetails == null) {
            this.additionalDetails = null;
            return;
        }

        this.additionalDetails = new com.amazonaws.internal.SdkInternalList<AdditionalDetail>(additionalDetails);
    }

    /**
     * <p>
     * The additional details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalDetails(java.util.Collection)} or {@link #withAdditionalDetails(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param additionalDetails
     *        The additional details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withAdditionalDetails(AdditionalDetail... additionalDetails) {
        if (this.additionalDetails == null) {
            setAdditionalDetails(new com.amazonaws.internal.SdkInternalList<AdditionalDetail>(additionalDetails.length));
        }
        for (AdditionalDetail ele : additionalDetails) {
            this.additionalDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The additional details.
     * </p>
     * 
     * @param additionalDetails
     *        The additional details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withAdditionalDetails(java.util.Collection<AdditionalDetail> additionalDetails) {
        setAdditionalDetails(additionalDetails);
        return this;
    }

    /**
     * <p>
     * The transit gateway.
     * </p>
     * 
     * @param transitGateway
     *        The transit gateway.
     */

    public void setTransitGateway(AnalysisComponent transitGateway) {
        this.transitGateway = transitGateway;
    }

    /**
     * <p>
     * The transit gateway.
     * </p>
     * 
     * @return The transit gateway.
     */

    public AnalysisComponent getTransitGateway() {
        return this.transitGateway;
    }

    /**
     * <p>
     * The transit gateway.
     * </p>
     * 
     * @param transitGateway
     *        The transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withTransitGateway(AnalysisComponent transitGateway) {
        setTransitGateway(transitGateway);
        return this;
    }

    /**
     * <p>
     * The route in a transit gateway route table.
     * </p>
     * 
     * @param transitGatewayRouteTableRoute
     *        The route in a transit gateway route table.
     */

    public void setTransitGatewayRouteTableRoute(TransitGatewayRouteTableRoute transitGatewayRouteTableRoute) {
        this.transitGatewayRouteTableRoute = transitGatewayRouteTableRoute;
    }

    /**
     * <p>
     * The route in a transit gateway route table.
     * </p>
     * 
     * @return The route in a transit gateway route table.
     */

    public TransitGatewayRouteTableRoute getTransitGatewayRouteTableRoute() {
        return this.transitGatewayRouteTableRoute;
    }

    /**
     * <p>
     * The route in a transit gateway route table.
     * </p>
     * 
     * @param transitGatewayRouteTableRoute
     *        The route in a transit gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withTransitGatewayRouteTableRoute(TransitGatewayRouteTableRoute transitGatewayRouteTableRoute) {
        setTransitGatewayRouteTableRoute(transitGatewayRouteTableRoute);
        return this;
    }

    /**
     * <p>
     * The explanation codes.
     * </p>
     * 
     * @return The explanation codes.
     */

    public java.util.List<Explanation> getExplanations() {
        if (explanations == null) {
            explanations = new com.amazonaws.internal.SdkInternalList<Explanation>();
        }
        return explanations;
    }

    /**
     * <p>
     * The explanation codes.
     * </p>
     * 
     * @param explanations
     *        The explanation codes.
     */

    public void setExplanations(java.util.Collection<Explanation> explanations) {
        if (explanations == null) {
            this.explanations = null;
            return;
        }

        this.explanations = new com.amazonaws.internal.SdkInternalList<Explanation>(explanations);
    }

    /**
     * <p>
     * The explanation codes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExplanations(java.util.Collection)} or {@link #withExplanations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param explanations
     *        The explanation codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withExplanations(Explanation... explanations) {
        if (this.explanations == null) {
            setExplanations(new com.amazonaws.internal.SdkInternalList<Explanation>(explanations.length));
        }
        for (Explanation ele : explanations) {
            this.explanations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The explanation codes.
     * </p>
     * 
     * @param explanations
     *        The explanation codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withExplanations(java.util.Collection<Explanation> explanations) {
        setExplanations(explanations);
        return this;
    }

    /**
     * <p>
     * The load balancer listener.
     * </p>
     * 
     * @param elasticLoadBalancerListener
     *        The load balancer listener.
     */

    public void setElasticLoadBalancerListener(AnalysisComponent elasticLoadBalancerListener) {
        this.elasticLoadBalancerListener = elasticLoadBalancerListener;
    }

    /**
     * <p>
     * The load balancer listener.
     * </p>
     * 
     * @return The load balancer listener.
     */

    public AnalysisComponent getElasticLoadBalancerListener() {
        return this.elasticLoadBalancerListener;
    }

    /**
     * <p>
     * The load balancer listener.
     * </p>
     * 
     * @param elasticLoadBalancerListener
     *        The load balancer listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathComponent withElasticLoadBalancerListener(AnalysisComponent elasticLoadBalancerListener) {
        setElasticLoadBalancerListener(elasticLoadBalancerListener);
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
        if (getSequenceNumber() != null)
            sb.append("SequenceNumber: ").append(getSequenceNumber()).append(",");
        if (getAclRule() != null)
            sb.append("AclRule: ").append(getAclRule()).append(",");
        if (getAttachedTo() != null)
            sb.append("AttachedTo: ").append(getAttachedTo()).append(",");
        if (getComponent() != null)
            sb.append("Component: ").append(getComponent()).append(",");
        if (getDestinationVpc() != null)
            sb.append("DestinationVpc: ").append(getDestinationVpc()).append(",");
        if (getOutboundHeader() != null)
            sb.append("OutboundHeader: ").append(getOutboundHeader()).append(",");
        if (getInboundHeader() != null)
            sb.append("InboundHeader: ").append(getInboundHeader()).append(",");
        if (getRouteTableRoute() != null)
            sb.append("RouteTableRoute: ").append(getRouteTableRoute()).append(",");
        if (getSecurityGroupRule() != null)
            sb.append("SecurityGroupRule: ").append(getSecurityGroupRule()).append(",");
        if (getSourceVpc() != null)
            sb.append("SourceVpc: ").append(getSourceVpc()).append(",");
        if (getSubnet() != null)
            sb.append("Subnet: ").append(getSubnet()).append(",");
        if (getVpc() != null)
            sb.append("Vpc: ").append(getVpc()).append(",");
        if (getAdditionalDetails() != null)
            sb.append("AdditionalDetails: ").append(getAdditionalDetails()).append(",");
        if (getTransitGateway() != null)
            sb.append("TransitGateway: ").append(getTransitGateway()).append(",");
        if (getTransitGatewayRouteTableRoute() != null)
            sb.append("TransitGatewayRouteTableRoute: ").append(getTransitGatewayRouteTableRoute()).append(",");
        if (getExplanations() != null)
            sb.append("Explanations: ").append(getExplanations()).append(",");
        if (getElasticLoadBalancerListener() != null)
            sb.append("ElasticLoadBalancerListener: ").append(getElasticLoadBalancerListener());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PathComponent == false)
            return false;
        PathComponent other = (PathComponent) obj;
        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null)
            return false;
        if (other.getSequenceNumber() != null && other.getSequenceNumber().equals(this.getSequenceNumber()) == false)
            return false;
        if (other.getAclRule() == null ^ this.getAclRule() == null)
            return false;
        if (other.getAclRule() != null && other.getAclRule().equals(this.getAclRule()) == false)
            return false;
        if (other.getAttachedTo() == null ^ this.getAttachedTo() == null)
            return false;
        if (other.getAttachedTo() != null && other.getAttachedTo().equals(this.getAttachedTo()) == false)
            return false;
        if (other.getComponent() == null ^ this.getComponent() == null)
            return false;
        if (other.getComponent() != null && other.getComponent().equals(this.getComponent()) == false)
            return false;
        if (other.getDestinationVpc() == null ^ this.getDestinationVpc() == null)
            return false;
        if (other.getDestinationVpc() != null && other.getDestinationVpc().equals(this.getDestinationVpc()) == false)
            return false;
        if (other.getOutboundHeader() == null ^ this.getOutboundHeader() == null)
            return false;
        if (other.getOutboundHeader() != null && other.getOutboundHeader().equals(this.getOutboundHeader()) == false)
            return false;
        if (other.getInboundHeader() == null ^ this.getInboundHeader() == null)
            return false;
        if (other.getInboundHeader() != null && other.getInboundHeader().equals(this.getInboundHeader()) == false)
            return false;
        if (other.getRouteTableRoute() == null ^ this.getRouteTableRoute() == null)
            return false;
        if (other.getRouteTableRoute() != null && other.getRouteTableRoute().equals(this.getRouteTableRoute()) == false)
            return false;
        if (other.getSecurityGroupRule() == null ^ this.getSecurityGroupRule() == null)
            return false;
        if (other.getSecurityGroupRule() != null && other.getSecurityGroupRule().equals(this.getSecurityGroupRule()) == false)
            return false;
        if (other.getSourceVpc() == null ^ this.getSourceVpc() == null)
            return false;
        if (other.getSourceVpc() != null && other.getSourceVpc().equals(this.getSourceVpc()) == false)
            return false;
        if (other.getSubnet() == null ^ this.getSubnet() == null)
            return false;
        if (other.getSubnet() != null && other.getSubnet().equals(this.getSubnet()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        if (other.getAdditionalDetails() == null ^ this.getAdditionalDetails() == null)
            return false;
        if (other.getAdditionalDetails() != null && other.getAdditionalDetails().equals(this.getAdditionalDetails()) == false)
            return false;
        if (other.getTransitGateway() == null ^ this.getTransitGateway() == null)
            return false;
        if (other.getTransitGateway() != null && other.getTransitGateway().equals(this.getTransitGateway()) == false)
            return false;
        if (other.getTransitGatewayRouteTableRoute() == null ^ this.getTransitGatewayRouteTableRoute() == null)
            return false;
        if (other.getTransitGatewayRouteTableRoute() != null
                && other.getTransitGatewayRouteTableRoute().equals(this.getTransitGatewayRouteTableRoute()) == false)
            return false;
        if (other.getExplanations() == null ^ this.getExplanations() == null)
            return false;
        if (other.getExplanations() != null && other.getExplanations().equals(this.getExplanations()) == false)
            return false;
        if (other.getElasticLoadBalancerListener() == null ^ this.getElasticLoadBalancerListener() == null)
            return false;
        if (other.getElasticLoadBalancerListener() != null && other.getElasticLoadBalancerListener().equals(this.getElasticLoadBalancerListener()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode());
        hashCode = prime * hashCode + ((getAclRule() == null) ? 0 : getAclRule().hashCode());
        hashCode = prime * hashCode + ((getAttachedTo() == null) ? 0 : getAttachedTo().hashCode());
        hashCode = prime * hashCode + ((getComponent() == null) ? 0 : getComponent().hashCode());
        hashCode = prime * hashCode + ((getDestinationVpc() == null) ? 0 : getDestinationVpc().hashCode());
        hashCode = prime * hashCode + ((getOutboundHeader() == null) ? 0 : getOutboundHeader().hashCode());
        hashCode = prime * hashCode + ((getInboundHeader() == null) ? 0 : getInboundHeader().hashCode());
        hashCode = prime * hashCode + ((getRouteTableRoute() == null) ? 0 : getRouteTableRoute().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupRule() == null) ? 0 : getSecurityGroupRule().hashCode());
        hashCode = prime * hashCode + ((getSourceVpc() == null) ? 0 : getSourceVpc().hashCode());
        hashCode = prime * hashCode + ((getSubnet() == null) ? 0 : getSubnet().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        hashCode = prime * hashCode + ((getAdditionalDetails() == null) ? 0 : getAdditionalDetails().hashCode());
        hashCode = prime * hashCode + ((getTransitGateway() == null) ? 0 : getTransitGateway().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayRouteTableRoute() == null) ? 0 : getTransitGatewayRouteTableRoute().hashCode());
        hashCode = prime * hashCode + ((getExplanations() == null) ? 0 : getExplanations().hashCode());
        hashCode = prime * hashCode + ((getElasticLoadBalancerListener() == null) ? 0 : getElasticLoadBalancerListener().hashCode());
        return hashCode;
    }

    @Override
    public PathComponent clone() {
        try {
            return (PathComponent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
