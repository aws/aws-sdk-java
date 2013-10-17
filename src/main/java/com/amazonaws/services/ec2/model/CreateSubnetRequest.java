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
import com.amazonaws.services.ec2.model.transform.CreateSubnetRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createSubnet(CreateSubnetRequest) CreateSubnet operation}.
 * <p>
 * Creates a subnet in an existing VPC. You can create up to 20 subnets in a VPC. If you add more than one subnet to a VPC, they're set up in a star
 * topology with a logical router in the middle. When you create each subnet, you provide the VPC ID and the CIDR block you want for the subnet. Once you
 * create a subnet, you can't change its CIDR block. The subnet's CIDR block can be the same as the VPC's CIDR block (assuming you want only a single
 * subnet in the VPC), or a subset of the VPC's CIDR block. If you create more than one subnet in a VPC, the subnets' CIDR blocks must not overlap. The
 * smallest subnet (and VPC) you can create uses a <code>/28</code> netmask (16 IP addresses), and the largest uses a <code>/18</code> netmask (16,384 IP
 * addresses).
 * </p>
 * <p>
 * <b>IMPORTANT:</b> AWS reserves both the first four and the last IP address in each subnet's CIDR block. They're not available for use.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createSubnet(CreateSubnetRequest)
 */
public class CreateSubnetRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateSubnetRequest> {

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
     * Default constructor for a new CreateSubnetRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateSubnetRequest() {}
    
    /**
     * Constructs a new CreateSubnetRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vpcId The ID of the VPC to create the subnet in.
     * @param cidrBlock The CIDR block the subnet is to cover.
     */
    public CreateSubnetRequest(String vpcId, String cidrBlock) {
        setVpcId(vpcId);
        setCidrBlock(cidrBlock);
    }

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

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateSubnetRequest> getDryRunRequest() {
        Request<CreateSubnetRequest> request = new CreateSubnetRequestMarshaller().marshall(this);
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
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getCidrBlock() != null) sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateSubnetRequest == false) return false;
        CreateSubnetRequest other = (CreateSubnetRequest)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null) return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        return true;
    }
    
}
    