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
import com.amazonaws.services.ec2.model.transform.CreateVpcRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createVpc(CreateVpcRequest) CreateVpc operation}.
 * <p>
 * Creates a VPC with the CIDR block you specify. The smallest VPC you can create uses a <code>/28</code> netmask (16 IP addresses), and the largest
 * uses a <code>/18</code> netmask (16,384 IP addresses). To help you decide how big to make your VPC, go to the topic about creating VPCs in the Amazon
 * Virtual Private Cloud Developer Guide.
 * </p>
 * <p>
 * By default, each instance you launch in the VPC has the default DHCP options (the standard EC2 host name, no domain name, no DNS server, no NTP
 * server, and no NetBIOS server or node type).
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createVpc(CreateVpcRequest)
 */
public class CreateVpcRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateVpcRequest> {

    /**
     * A valid CIDR block.
     */
    private String cidrBlock;

    /**
     * The allowed tenancy of instances launched into the VPC. A value of
     * default means instances can be launched with any tenancy; a value of
     * dedicated means instances must be launched with tenancy as dedicated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     */
    private String instanceTenancy;

    /**
     * Default constructor for a new CreateVpcRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateVpcRequest() {}
    
    /**
     * Constructs a new CreateVpcRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cidrBlock A valid CIDR block.
     */
    public CreateVpcRequest(String cidrBlock) {
        setCidrBlock(cidrBlock);
    }

    /**
     * A valid CIDR block.
     *
     * @return A valid CIDR block.
     */
    public String getCidrBlock() {
        return cidrBlock;
    }
    
    /**
     * A valid CIDR block.
     *
     * @param cidrBlock A valid CIDR block.
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }
    
    /**
     * A valid CIDR block.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrBlock A valid CIDR block.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateVpcRequest withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * The allowed tenancy of instances launched into the VPC. A value of
     * default means instances can be launched with any tenancy; a value of
     * dedicated means instances must be launched with tenancy as dedicated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @return The allowed tenancy of instances launched into the VPC. A value of
     *         default means instances can be launched with any tenancy; a value of
     *         dedicated means instances must be launched with tenancy as dedicated.
     *
     * @see Tenancy
     */
    public String getInstanceTenancy() {
        return instanceTenancy;
    }
    
    /**
     * The allowed tenancy of instances launched into the VPC. A value of
     * default means instances can be launched with any tenancy; a value of
     * dedicated means instances must be launched with tenancy as dedicated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The allowed tenancy of instances launched into the VPC. A value of
     *         default means instances can be launched with any tenancy; a value of
     *         dedicated means instances must be launched with tenancy as dedicated.
     *
     * @see Tenancy
     */
    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }
    
    /**
     * The allowed tenancy of instances launched into the VPC. A value of
     * default means instances can be launched with any tenancy; a value of
     * dedicated means instances must be launched with tenancy as dedicated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The allowed tenancy of instances launched into the VPC. A value of
     *         default means instances can be launched with any tenancy; a value of
     *         dedicated means instances must be launched with tenancy as dedicated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see Tenancy
     */
    public CreateVpcRequest withInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
        return this;
    }

    /**
     * The allowed tenancy of instances launched into the VPC. A value of
     * default means instances can be launched with any tenancy; a value of
     * dedicated means instances must be launched with tenancy as dedicated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The allowed tenancy of instances launched into the VPC. A value of
     *         default means instances can be launched with any tenancy; a value of
     *         dedicated means instances must be launched with tenancy as dedicated.
     *
     * @see Tenancy
     */
    public void setInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
    }
    
    /**
     * The allowed tenancy of instances launched into the VPC. A value of
     * default means instances can be launched with any tenancy; a value of
     * dedicated means instances must be launched with tenancy as dedicated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The allowed tenancy of instances launched into the VPC. A value of
     *         default means instances can be launched with any tenancy; a value of
     *         dedicated means instances must be launched with tenancy as dedicated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see Tenancy
     */
    public CreateVpcRequest withInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateVpcRequest> getDryRunRequest() {
        Request<CreateVpcRequest> request = new CreateVpcRequestMarshaller().marshall(this);
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
        if (getCidrBlock() != null) sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getInstanceTenancy() != null) sb.append("InstanceTenancy: " + getInstanceTenancy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateVpcRequest == false) return false;
        CreateVpcRequest other = (CreateVpcRequest)obj;
        
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null) return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false) return false; 
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null) return false;
        if (other.getInstanceTenancy() != null && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false) return false; 
        return true;
    }
    
}
    