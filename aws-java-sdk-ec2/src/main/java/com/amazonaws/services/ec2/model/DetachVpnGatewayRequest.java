/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DetachVpnGatewayRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#detachVpnGateway(DetachVpnGatewayRequest) DetachVpnGateway operation}.
 * <p>
 * Detaches a virtual private gateway from a VPC. You do this if you're
 * planning to turn off the VPC and not use it anymore. You can confirm a
 * virtual private gateway has been completely detached from a VPC by
 * describing the virtual private gateway (any attachments to the virtual
 * private gateway are also described).
 * </p>
 * <p>
 * You must wait for the attachment's state to switch to
 * <code>detached</code> before you can delete the VPC or attach a
 * different VPC to the virtual private gateway.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#detachVpnGateway(DetachVpnGatewayRequest)
 */
public class DetachVpnGatewayRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DetachVpnGatewayRequest> {

    /**
     * The ID of the virtual private gateway.
     */
    private String vpnGatewayId;

    /**
     * The ID of the VPC.
     */
    private String vpcId;

    /**
     * Default constructor for a new DetachVpnGatewayRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DetachVpnGatewayRequest() {}
    
    /**
     * Constructs a new DetachVpnGatewayRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vpnGatewayId The ID of the virtual private gateway.
     * @param vpcId The ID of the VPC.
     */
    public DetachVpnGatewayRequest(String vpnGatewayId, String vpcId) {
        setVpnGatewayId(vpnGatewayId);
        setVpcId(vpcId);
    }

    /**
     * The ID of the virtual private gateway.
     *
     * @return The ID of the virtual private gateway.
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }
    
    /**
     * The ID of the virtual private gateway.
     *
     * @param vpnGatewayId The ID of the virtual private gateway.
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }
    
    /**
     * The ID of the virtual private gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayId The ID of the virtual private gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetachVpnGatewayRequest withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }

    /**
     * The ID of the VPC.
     *
     * @return The ID of the VPC.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC.
     *
     * @param vpcId The ID of the VPC.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetachVpnGatewayRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DetachVpnGatewayRequest> getDryRunRequest() {
        Request<DetachVpnGatewayRequest> request = new DetachVpnGatewayRequestMarshaller().marshall(this);
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

        if (obj instanceof DetachVpnGatewayRequest == false) return false;
        DetachVpnGatewayRequest other = (DetachVpnGatewayRequest)obj;
        
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null) return false;
        if (other.getVpnGatewayId() != null && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        return true;
    }
    
}
    