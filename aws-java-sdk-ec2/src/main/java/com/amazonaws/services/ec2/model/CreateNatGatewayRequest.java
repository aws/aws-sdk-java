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

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createNatGateway(CreateNatGatewayRequest) CreateNatGateway operation}.
 * <p>
 * Creates a NAT gateway in the specified subnet. A NAT gateway can be
 * used to enable instances in a private subnet to connect to the
 * Internet. This action creates a network interface in the specified
 * subnet with a private IP address from the IP address range of the
 * subnet. For more information, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html"> NAT Gateways </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createNatGateway(CreateNatGatewayRequest)
 */
public class CreateNatGatewayRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The subnet in which to create the NAT gateway.
     */
    private String subnetId;

    /**
     * The allocation ID of an Elastic IP address to associate with the NAT
     * gateway. If the Elastic IP address is associated with another
     * resource, you must first disassociate it.
     */
    private String allocationId;

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>. <p>Constraint: Maximum 64 ASCII characters.
     */
    private String clientToken;

    /**
     * The subnet in which to create the NAT gateway.
     *
     * @return The subnet in which to create the NAT gateway.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The subnet in which to create the NAT gateway.
     *
     * @param subnetId The subnet in which to create the NAT gateway.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The subnet in which to create the NAT gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The subnet in which to create the NAT gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNatGatewayRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * The allocation ID of an Elastic IP address to associate with the NAT
     * gateway. If the Elastic IP address is associated with another
     * resource, you must first disassociate it.
     *
     * @return The allocation ID of an Elastic IP address to associate with the NAT
     *         gateway. If the Elastic IP address is associated with another
     *         resource, you must first disassociate it.
     */
    public String getAllocationId() {
        return allocationId;
    }
    
    /**
     * The allocation ID of an Elastic IP address to associate with the NAT
     * gateway. If the Elastic IP address is associated with another
     * resource, you must first disassociate it.
     *
     * @param allocationId The allocation ID of an Elastic IP address to associate with the NAT
     *         gateway. If the Elastic IP address is associated with another
     *         resource, you must first disassociate it.
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }
    
    /**
     * The allocation ID of an Elastic IP address to associate with the NAT
     * gateway. If the Elastic IP address is associated with another
     * resource, you must first disassociate it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocationId The allocation ID of an Elastic IP address to associate with the NAT
     *         gateway. If the Elastic IP address is associated with another
     *         resource, you must first disassociate it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNatGatewayRequest withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>. <p>Constraint: Maximum 64 ASCII characters.
     *
     * @return Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a>. <p>Constraint: Maximum 64 ASCII characters.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>. <p>Constraint: Maximum 64 ASCII characters.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a>. <p>Constraint: Maximum 64 ASCII characters.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>. <p>Constraint: Maximum 64 ASCII characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a>. <p>Constraint: Maximum 64 ASCII characters.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNatGatewayRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getAllocationId() != null) sb.append("AllocationId: " + getAllocationId() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateNatGatewayRequest == false) return false;
        CreateNatGatewayRequest other = (CreateNatGatewayRequest)obj;
        
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getAllocationId() == null ^ this.getAllocationId() == null) return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateNatGatewayRequest clone() {
        
            return (CreateNatGatewayRequest) super.clone();
    }

}
    