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
import com.amazonaws.services.ec2.model.transform.DeleteClientVpnRouteRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteClientVpnRouteRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteClientVpnRouteRequest> {

    /**
     * <p>
     * The ID of the Client VPN endpoint from which the route is to be deleted.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The ID of the target subnet used by the route.
     * </p>
     */
    private String targetVpcSubnetId;
    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route to be deleted.
     * </p>
     */
    private String destinationCidrBlock;

    /**
     * <p>
     * The ID of the Client VPN endpoint from which the route is to be deleted.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint from which the route is to be deleted.
     */

    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint from which the route is to be deleted.
     * </p>
     * 
     * @return The ID of the Client VPN endpoint from which the route is to be deleted.
     */

    public String getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint from which the route is to be deleted.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint from which the route is to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClientVpnRouteRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The ID of the target subnet used by the route.
     * </p>
     * 
     * @param targetVpcSubnetId
     *        The ID of the target subnet used by the route.
     */

    public void setTargetVpcSubnetId(String targetVpcSubnetId) {
        this.targetVpcSubnetId = targetVpcSubnetId;
    }

    /**
     * <p>
     * The ID of the target subnet used by the route.
     * </p>
     * 
     * @return The ID of the target subnet used by the route.
     */

    public String getTargetVpcSubnetId() {
        return this.targetVpcSubnetId;
    }

    /**
     * <p>
     * The ID of the target subnet used by the route.
     * </p>
     * 
     * @param targetVpcSubnetId
     *        The ID of the target subnet used by the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClientVpnRouteRequest withTargetVpcSubnetId(String targetVpcSubnetId) {
        setTargetVpcSubnetId(targetVpcSubnetId);
        return this;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route to be deleted.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The IPv4 address range, in CIDR notation, of the route to be deleted.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route to be deleted.
     * </p>
     * 
     * @return The IPv4 address range, in CIDR notation, of the route to be deleted.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route to be deleted.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The IPv4 address range, in CIDR notation, of the route to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClientVpnRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteClientVpnRouteRequest> getDryRunRequest() {
        Request<DeleteClientVpnRouteRequest> request = new DeleteClientVpnRouteRequestMarshaller().marshall(this);
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
        if (getTargetVpcSubnetId() != null)
            sb.append("TargetVpcSubnetId: ").append(getTargetVpcSubnetId()).append(",");
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteClientVpnRouteRequest == false)
            return false;
        DeleteClientVpnRouteRequest other = (DeleteClientVpnRouteRequest) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getTargetVpcSubnetId() == null ^ this.getTargetVpcSubnetId() == null)
            return false;
        if (other.getTargetVpcSubnetId() != null && other.getTargetVpcSubnetId().equals(this.getTargetVpcSubnetId()) == false)
            return false;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getTargetVpcSubnetId() == null) ? 0 : getTargetVpcSubnetId().hashCode());
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        return hashCode;
    }

    @Override
    public DeleteClientVpnRouteRequest clone() {
        return (DeleteClientVpnRouteRequest) super.clone();
    }
}
