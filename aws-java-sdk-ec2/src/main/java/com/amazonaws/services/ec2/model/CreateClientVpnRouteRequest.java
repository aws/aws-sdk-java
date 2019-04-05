/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateClientVpnRouteRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClientVpnRouteRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateClientVpnRouteRequest> {

    /**
     * <p>
     * The ID of the Client VPN endpoint to which to add the route.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To add a route for Internet access, enter <code>0.0.0.0/0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4 CIDR range
     * </p>
     * </li>
     * </ul>
     * <p>
     * Route address ranges cannot overlap with the CIDR range specified for client allocation.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The ID of the subnet through which you want to route traffic. The specified subnet must be an existing target
     * network of the Client VPN endpoint.
     * </p>
     */
    private String targetVpcSubnetId;
    /**
     * <p>
     * A brief description of the route.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the Client VPN endpoint to which to add the route.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint to which to add the route.
     */

    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to which to add the route.
     * </p>
     * 
     * @return The ID of the Client VPN endpoint to which to add the route.
     */

    public String getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to which to add the route.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint to which to add the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnRouteRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To add a route for Internet access, enter <code>0.0.0.0/0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4 CIDR range
     * </p>
     * </li>
     * </ul>
     * <p>
     * Route address ranges cannot overlap with the CIDR range specified for client allocation.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The IPv4 address range, in CIDR notation, of the route destination. For example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To add a route for Internet access, enter <code>0.0.0.0/0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4 CIDR range
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Route address ranges cannot overlap with the CIDR range specified for client allocation.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To add a route for Internet access, enter <code>0.0.0.0/0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4 CIDR range
     * </p>
     * </li>
     * </ul>
     * <p>
     * Route address ranges cannot overlap with the CIDR range specified for client allocation.
     * </p>
     * 
     * @return The IPv4 address range, in CIDR notation, of the route destination. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To add a route for Internet access, enter <code>0.0.0.0/0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4 CIDR range
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Route address ranges cannot overlap with the CIDR range specified for client allocation.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To add a route for Internet access, enter <code>0.0.0.0/0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * </p>
     * </li>
     * <li>
     * <p>
     * To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4 CIDR range
     * </p>
     * </li>
     * </ul>
     * <p>
     * Route address ranges cannot overlap with the CIDR range specified for client allocation.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The IPv4 address range, in CIDR notation, of the route destination. For example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To add a route for Internet access, enter <code>0.0.0.0/0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4 CIDR range
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Route address ranges cannot overlap with the CIDR range specified for client allocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet through which you want to route traffic. The specified subnet must be an existing target
     * network of the Client VPN endpoint.
     * </p>
     * 
     * @param targetVpcSubnetId
     *        The ID of the subnet through which you want to route traffic. The specified subnet must be an existing
     *        target network of the Client VPN endpoint.
     */

    public void setTargetVpcSubnetId(String targetVpcSubnetId) {
        this.targetVpcSubnetId = targetVpcSubnetId;
    }

    /**
     * <p>
     * The ID of the subnet through which you want to route traffic. The specified subnet must be an existing target
     * network of the Client VPN endpoint.
     * </p>
     * 
     * @return The ID of the subnet through which you want to route traffic. The specified subnet must be an existing
     *         target network of the Client VPN endpoint.
     */

    public String getTargetVpcSubnetId() {
        return this.targetVpcSubnetId;
    }

    /**
     * <p>
     * The ID of the subnet through which you want to route traffic. The specified subnet must be an existing target
     * network of the Client VPN endpoint.
     * </p>
     * 
     * @param targetVpcSubnetId
     *        The ID of the subnet through which you want to route traffic. The specified subnet must be an existing
     *        target network of the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnRouteRequest withTargetVpcSubnetId(String targetVpcSubnetId) {
        setTargetVpcSubnetId(targetVpcSubnetId);
        return this;
    }

    /**
     * <p>
     * A brief description of the route.
     * </p>
     * 
     * @param description
     *        A brief description of the route.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the route.
     * </p>
     * 
     * @return A brief description of the route.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the route.
     * </p>
     * 
     * @param description
     *        A brief description of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnRouteRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateClientVpnRouteRequest> getDryRunRequest() {
        Request<CreateClientVpnRouteRequest> request = new CreateClientVpnRouteRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: ").append(getClientVpnEndpointId()).append(",");
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getTargetVpcSubnetId() != null)
            sb.append("TargetVpcSubnetId: ").append(getTargetVpcSubnetId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClientVpnRouteRequest == false)
            return false;
        CreateClientVpnRouteRequest other = (CreateClientVpnRouteRequest) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getTargetVpcSubnetId() == null ^ this.getTargetVpcSubnetId() == null)
            return false;
        if (other.getTargetVpcSubnetId() != null && other.getTargetVpcSubnetId().equals(this.getTargetVpcSubnetId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getTargetVpcSubnetId() == null) ? 0 : getTargetVpcSubnetId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateClientVpnRouteRequest clone() {
        return (CreateClientVpnRouteRequest) super.clone();
    }
}
