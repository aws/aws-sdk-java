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
import com.amazonaws.services.ec2.model.transform.AttachInternetGatewayRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#attachInternetGateway(AttachInternetGatewayRequest) AttachInternetGateway operation}.
 * <p>
 * Attaches an Internet gateway to a VPC, enabling connectivity between the Internet and the VPC. For more information about your VPC and Internet
 * gateway, go to the Amazon Virtual Private Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#attachInternetGateway(AttachInternetGatewayRequest)
 */
public class AttachInternetGatewayRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<AttachInternetGatewayRequest> {

    /**
     * The ID of the Internet gateway to attach.
     */
    private String internetGatewayId;

    /**
     * The ID of the VPC.
     */
    private String vpcId;

    /**
     * The ID of the Internet gateway to attach.
     *
     * @return The ID of the Internet gateway to attach.
     */
    public String getInternetGatewayId() {
        return internetGatewayId;
    }
    
    /**
     * The ID of the Internet gateway to attach.
     *
     * @param internetGatewayId The ID of the Internet gateway to attach.
     */
    public void setInternetGatewayId(String internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
    }
    
    /**
     * The ID of the Internet gateway to attach.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param internetGatewayId The ID of the Internet gateway to attach.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttachInternetGatewayRequest withInternetGatewayId(String internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
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
    public AttachInternetGatewayRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<AttachInternetGatewayRequest> getDryRunRequest() {
        Request<AttachInternetGatewayRequest> request = new AttachInternetGatewayRequestMarshaller().marshall(this);
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
        if (getInternetGatewayId() != null) sb.append("InternetGatewayId: " + getInternetGatewayId() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInternetGatewayId() == null) ? 0 : getInternetGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AttachInternetGatewayRequest == false) return false;
        AttachInternetGatewayRequest other = (AttachInternetGatewayRequest)obj;
        
        if (other.getInternetGatewayId() == null ^ this.getInternetGatewayId() == null) return false;
        if (other.getInternetGatewayId() != null && other.getInternetGatewayId().equals(this.getInternetGatewayId()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        return true;
    }
    
}
    