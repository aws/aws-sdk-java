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
import com.amazonaws.services.ec2.model.transform.AttachVpnGatewayRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#attachVpnGateway(AttachVpnGatewayRequest) AttachVpnGateway operation}.
 * <p>
 * Attaches a VPN gateway to a VPC. This is the last step required to get your VPC fully connected to your data center before launching instances in it.
 * For more information, go to Process for Using Amazon VPC in the Amazon Virtual Private Cloud Developer Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#attachVpnGateway(AttachVpnGatewayRequest)
 */
public class AttachVpnGatewayRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<AttachVpnGatewayRequest> {

    /**
     * The ID of the VPN gateway to attach to the VPC.
     */
    private String vpnGatewayId;

    /**
     * The ID of the VPC to attach to the VPN gateway.
     */
    private String vpcId;

    /**
     * Default constructor for a new AttachVpnGatewayRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AttachVpnGatewayRequest() {}
    
    /**
     * Constructs a new AttachVpnGatewayRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vpnGatewayId The ID of the VPN gateway to attach to the VPC.
     * @param vpcId The ID of the VPC to attach to the VPN gateway.
     */
    public AttachVpnGatewayRequest(String vpnGatewayId, String vpcId) {
        setVpnGatewayId(vpnGatewayId);
        setVpcId(vpcId);
    }

    /**
     * The ID of the VPN gateway to attach to the VPC.
     *
     * @return The ID of the VPN gateway to attach to the VPC.
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }
    
    /**
     * The ID of the VPN gateway to attach to the VPC.
     *
     * @param vpnGatewayId The ID of the VPN gateway to attach to the VPC.
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }
    
    /**
     * The ID of the VPN gateway to attach to the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayId The ID of the VPN gateway to attach to the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttachVpnGatewayRequest withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }

    /**
     * The ID of the VPC to attach to the VPN gateway.
     *
     * @return The ID of the VPC to attach to the VPN gateway.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC to attach to the VPN gateway.
     *
     * @param vpcId The ID of the VPC to attach to the VPN gateway.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC to attach to the VPN gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC to attach to the VPN gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttachVpnGatewayRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<AttachVpnGatewayRequest> getDryRunRequest() {
        Request<AttachVpnGatewayRequest> request = new AttachVpnGatewayRequestMarshaller().marshall(this);
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
        if (getVpnGatewayId() != null) sb.append("VpnGatewayId: " + getVpnGatewayId() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AttachVpnGatewayRequest == false) return false;
        AttachVpnGatewayRequest other = (AttachVpnGatewayRequest)obj;
        
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null) return false;
        if (other.getVpnGatewayId() != null && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        return true;
    }
    
}
    