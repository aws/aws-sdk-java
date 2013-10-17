/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteVpnGatewayRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteVpnGateway(DeleteVpnGatewayRequest) DeleteVpnGateway operation}.
 * <p>
 * Deletes a VPN gateway. Use this when you want to delete a VPC and all its associated components because you no longer need them. We recommend that
 * before you delete a VPN gateway, you detach it from the VPC and delete the VPN connection. Note that you don't need to delete the VPN gateway if you
 * just want to delete and re-create the VPN connection between your VPC and data center.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteVpnGateway(DeleteVpnGatewayRequest)
 */
public class DeleteVpnGatewayRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DeleteVpnGatewayRequest> {

    /**
     * The ID of the VPN gateway to delete.
     */
    private String vpnGatewayId;

    /**
     * Default constructor for a new DeleteVpnGatewayRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteVpnGatewayRequest() {}
    
    /**
     * Constructs a new DeleteVpnGatewayRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vpnGatewayId The ID of the VPN gateway to delete.
     */
    public DeleteVpnGatewayRequest(String vpnGatewayId) {
        setVpnGatewayId(vpnGatewayId);
    }

    /**
     * The ID of the VPN gateway to delete.
     *
     * @return The ID of the VPN gateway to delete.
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }
    
    /**
     * The ID of the VPN gateway to delete.
     *
     * @param vpnGatewayId The ID of the VPN gateway to delete.
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }
    
    /**
     * The ID of the VPN gateway to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayId The ID of the VPN gateway to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteVpnGatewayRequest withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DeleteVpnGatewayRequest> getDryRunRequest() {
        Request<DeleteVpnGatewayRequest> request = new DeleteVpnGatewayRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVpnGatewayId() != null) sb.append("VpnGatewayId: " + getVpnGatewayId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteVpnGatewayRequest == false) return false;
        DeleteVpnGatewayRequest other = (DeleteVpnGatewayRequest)obj;
        
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null) return false;
        if (other.getVpnGatewayId() != null && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false) return false; 
        return true;
    }
    
}
    