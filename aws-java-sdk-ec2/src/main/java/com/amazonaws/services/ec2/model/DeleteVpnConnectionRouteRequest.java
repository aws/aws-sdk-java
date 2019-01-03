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
import com.amazonaws.services.ec2.model.transform.DeleteVpnConnectionRouteRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DeleteVpnConnectionRoute.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVpnConnectionRouteRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteVpnConnectionRouteRequest> {

    /**
     * <p>
     * The CIDR block associated with the local subnet of the customer network.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     */
    private String vpnConnectionId;

    /**
     * <p>
     * The CIDR block associated with the local subnet of the customer network.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR block associated with the local subnet of the customer network.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR block associated with the local subnet of the customer network.
     * </p>
     * 
     * @return The CIDR block associated with the local subnet of the customer network.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR block associated with the local subnet of the customer network.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR block associated with the local subnet of the customer network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpnConnectionRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     * 
     * @param vpnConnectionId
     *        The ID of the VPN connection.
     */

    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     * 
     * @return The ID of the VPN connection.
     */

    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     * 
     * @param vpnConnectionId
     *        The ID of the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpnConnectionRouteRequest withVpnConnectionId(String vpnConnectionId) {
        setVpnConnectionId(vpnConnectionId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteVpnConnectionRouteRequest> getDryRunRequest() {
        Request<DeleteVpnConnectionRouteRequest> request = new DeleteVpnConnectionRouteRequestMarshaller().marshall(this);
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
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getVpnConnectionId() != null)
            sb.append("VpnConnectionId: ").append(getVpnConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVpnConnectionRouteRequest == false)
            return false;
        DeleteVpnConnectionRouteRequest other = (DeleteVpnConnectionRouteRequest) obj;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null)
            return false;
        if (other.getVpnConnectionId() != null && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVpnConnectionRouteRequest clone() {
        return (DeleteVpnConnectionRouteRequest) super.clone();
    }
}
