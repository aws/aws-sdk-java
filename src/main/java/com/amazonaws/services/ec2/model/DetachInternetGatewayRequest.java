/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#detachInternetGateway(DetachInternetGatewayRequest) DetachInternetGateway operation}.
 * <p>
 * Detaches an Internet gateway from a VPC, disabling connectivity
 * between the Internet and the VPC. The VPC must not contain any running
 * instances with elastic IP addresses. For more information about your
 * VPC and Internet gateway, go to Amazon Virtual Private Cloud User
 * Guide.
 * </p>
 * <p>
 * For more information about Amazon Virtual Private Cloud and Internet
 * gateways, go to the Amazon Virtual Private Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#detachInternetGateway(DetachInternetGatewayRequest)
 */
public class DetachInternetGatewayRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the Internet gateway to detach.
     */
    private String internetGatewayId;

    /**
     * The ID of the VPC.
     */
    private String vpcId;

    /**
     * The ID of the Internet gateway to detach.
     *
     * @return The ID of the Internet gateway to detach.
     */
    public String getInternetGatewayId() {
        return internetGatewayId;
    }
    
    /**
     * The ID of the Internet gateway to detach.
     *
     * @param internetGatewayId The ID of the Internet gateway to detach.
     */
    public void setInternetGatewayId(String internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
    }
    
    /**
     * The ID of the Internet gateway to detach.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param internetGatewayId The ID of the Internet gateway to detach.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DetachInternetGatewayRequest withInternetGatewayId(String internetGatewayId) {
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
    public DetachInternetGatewayRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
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
        sb.append("InternetGatewayId: " + internetGatewayId + ", ");
        sb.append("VpcId: " + vpcId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    