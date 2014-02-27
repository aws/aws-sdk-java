/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a VPC with the specified CIDR block.
 * </p>
 * <p>
 * The smallest VPC you can create uses a /28 netmask (16 IP addresses),
 * and the largest uses a /16 netmask (65,536 IP addresses). To help you
 * decide how big to make your VPC, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"> Your VPC and Subnets </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 * <p>
 * By default, each instance you launch in the VPC has the default DHCP
 * options, which includes only a default DNS server that we provide
 * (AmazonProvidedDNS). For more information about DHCP options, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createVpc(CreateVpcRequest)
 */
public class CreateVpcRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateVpcRequest> {

    /**
     * The network range for the VPC, in CIDR notation. For example,
     * <code>10.0.0.0/16</code>.
     */
    private String cidrBlock;

    /**
     * The supported tenancy options for instances launched into the VPC. A
     * value of <code>default</code> means that instances can be launched
     * with any tenancy; a value of <code>dedicated</code> means all
     * instances launched into the VPC are launched as dedicated tenancy
     * instances regardless of the tenancy assigned to the instance at
     * launch. Dedicated tenancy instances runs on single-tenant hardware.
     * <p>Default: <code>default</code>
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
     * @param cidrBlock The network range for the VPC, in CIDR notation. For
     * example, <code>10.0.0.0/16</code>.
     */
    public CreateVpcRequest(String cidrBlock) {
        setCidrBlock(cidrBlock);
    }

    /**
     * The network range for the VPC, in CIDR notation. For example,
     * <code>10.0.0.0/16</code>.
     *
     * @return The network range for the VPC, in CIDR notation. For example,
     *         <code>10.0.0.0/16</code>.
     */
    public String getCidrBlock() {
        return cidrBlock;
    }
    
    /**
     * The network range for the VPC, in CIDR notation. For example,
     * <code>10.0.0.0/16</code>.
     *
     * @param cidrBlock The network range for the VPC, in CIDR notation. For example,
     *         <code>10.0.0.0/16</code>.
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }
    
    /**
     * The network range for the VPC, in CIDR notation. For example,
     * <code>10.0.0.0/16</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrBlock The network range for the VPC, in CIDR notation. For example,
     *         <code>10.0.0.0/16</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateVpcRequest withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * The supported tenancy options for instances launched into the VPC. A
     * value of <code>default</code> means that instances can be launched
     * with any tenancy; a value of <code>dedicated</code> means all
     * instances launched into the VPC are launched as dedicated tenancy
     * instances regardless of the tenancy assigned to the instance at
     * launch. Dedicated tenancy instances runs on single-tenant hardware.
     * <p>Default: <code>default</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @return The supported tenancy options for instances launched into the VPC. A
     *         value of <code>default</code> means that instances can be launched
     *         with any tenancy; a value of <code>dedicated</code> means all
     *         instances launched into the VPC are launched as dedicated tenancy
     *         instances regardless of the tenancy assigned to the instance at
     *         launch. Dedicated tenancy instances runs on single-tenant hardware.
     *         <p>Default: <code>default</code>
     *
     * @see Tenancy
     */
    public String getInstanceTenancy() {
        return instanceTenancy;
    }
    
    /**
     * The supported tenancy options for instances launched into the VPC. A
     * value of <code>default</code> means that instances can be launched
     * with any tenancy; a value of <code>dedicated</code> means all
     * instances launched into the VPC are launched as dedicated tenancy
     * instances regardless of the tenancy assigned to the instance at
     * launch. Dedicated tenancy instances runs on single-tenant hardware.
     * <p>Default: <code>default</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The supported tenancy options for instances launched into the VPC. A
     *         value of <code>default</code> means that instances can be launched
     *         with any tenancy; a value of <code>dedicated</code> means all
     *         instances launched into the VPC are launched as dedicated tenancy
     *         instances regardless of the tenancy assigned to the instance at
     *         launch. Dedicated tenancy instances runs on single-tenant hardware.
     *         <p>Default: <code>default</code>
     *
     * @see Tenancy
     */
    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }
    
    /**
     * The supported tenancy options for instances launched into the VPC. A
     * value of <code>default</code> means that instances can be launched
     * with any tenancy; a value of <code>dedicated</code> means all
     * instances launched into the VPC are launched as dedicated tenancy
     * instances regardless of the tenancy assigned to the instance at
     * launch. Dedicated tenancy instances runs on single-tenant hardware.
     * <p>Default: <code>default</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The supported tenancy options for instances launched into the VPC. A
     *         value of <code>default</code> means that instances can be launched
     *         with any tenancy; a value of <code>dedicated</code> means all
     *         instances launched into the VPC are launched as dedicated tenancy
     *         instances regardless of the tenancy assigned to the instance at
     *         launch. Dedicated tenancy instances runs on single-tenant hardware.
     *         <p>Default: <code>default</code>
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
     * The supported tenancy options for instances launched into the VPC. A
     * value of <code>default</code> means that instances can be launched
     * with any tenancy; a value of <code>dedicated</code> means all
     * instances launched into the VPC are launched as dedicated tenancy
     * instances regardless of the tenancy assigned to the instance at
     * launch. Dedicated tenancy instances runs on single-tenant hardware.
     * <p>Default: <code>default</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The supported tenancy options for instances launched into the VPC. A
     *         value of <code>default</code> means that instances can be launched
     *         with any tenancy; a value of <code>dedicated</code> means all
     *         instances launched into the VPC are launched as dedicated tenancy
     *         instances regardless of the tenancy assigned to the instance at
     *         launch. Dedicated tenancy instances runs on single-tenant hardware.
     *         <p>Default: <code>default</code>
     *
     * @see Tenancy
     */
    public void setInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
    }
    
    /**
     * The supported tenancy options for instances launched into the VPC. A
     * value of <code>default</code> means that instances can be launched
     * with any tenancy; a value of <code>dedicated</code> means all
     * instances launched into the VPC are launched as dedicated tenancy
     * instances regardless of the tenancy assigned to the instance at
     * launch. Dedicated tenancy instances runs on single-tenant hardware.
     * <p>Default: <code>default</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The supported tenancy options for instances launched into the VPC. A
     *         value of <code>default</code> means that instances can be launched
     *         with any tenancy; a value of <code>dedicated</code> means all
     *         instances launched into the VPC are launched as dedicated tenancy
     *         instances regardless of the tenancy assigned to the instance at
     *         launch. Dedicated tenancy instances runs on single-tenant hardware.
     *         <p>Default: <code>default</code>
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
    