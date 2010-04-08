/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * 
 * </p>
 */
public class CreateSubnetRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the VPC to create the subnet in.
     */
    private String vpcId;

    /**
     * The CIDR block the subnet is to cover.
     */
    private String cidrBlock;

    /**
     * The Availability Zone to create the subnet in.
     */
    private String availabilityZone;

    /**
     * The ID of the VPC to create the subnet in.
     *
     * @return The ID of the VPC to create the subnet in.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC to create the subnet in.
     *
     * @param vpcId The ID of the VPC to create the subnet in.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC to create the subnet in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC to create the subnet in.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateSubnetRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    
    
    /**
     * The CIDR block the subnet is to cover.
     *
     * @return The CIDR block the subnet is to cover.
     */
    public String getCidrBlock() {
        return cidrBlock;
    }
    
    /**
     * The CIDR block the subnet is to cover.
     *
     * @param cidrBlock The CIDR block the subnet is to cover.
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }
    
    /**
     * The CIDR block the subnet is to cover.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrBlock The CIDR block the subnet is to cover.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateSubnetRequest withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    
    
    /**
     * The Availability Zone to create the subnet in.
     *
     * @return The Availability Zone to create the subnet in.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone to create the subnet in.
     *
     * @param availabilityZone The Availability Zone to create the subnet in.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone to create the subnet in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone to create the subnet in.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateSubnetRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("VpcId: " + vpcId + ", ");
        sb.append("CidrBlock: " + cidrBlock + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    