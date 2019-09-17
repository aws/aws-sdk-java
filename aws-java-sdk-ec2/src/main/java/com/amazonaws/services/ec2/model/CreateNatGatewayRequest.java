/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateNatGatewayRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNatGatewayRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateNatGatewayRequest> {

    /**
     * <p>
     * The allocation ID of an Elastic IP address to associate with the NAT gateway. If the Elastic IP address is
     * associated with another resource, you must first disassociate it.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 64 ASCII characters.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The subnet in which to create the NAT gateway.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The allocation ID of an Elastic IP address to associate with the NAT gateway. If the Elastic IP address is
     * associated with another resource, you must first disassociate it.
     * </p>
     * 
     * @param allocationId
     *        The allocation ID of an Elastic IP address to associate with the NAT gateway. If the Elastic IP address is
     *        associated with another resource, you must first disassociate it.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * The allocation ID of an Elastic IP address to associate with the NAT gateway. If the Elastic IP address is
     * associated with another resource, you must first disassociate it.
     * </p>
     * 
     * @return The allocation ID of an Elastic IP address to associate with the NAT gateway. If the Elastic IP address
     *         is associated with another resource, you must first disassociate it.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * The allocation ID of an Elastic IP address to associate with the NAT gateway. If the Elastic IP address is
     * associated with another resource, you must first disassociate it.
     * </p>
     * 
     * @param allocationId
     *        The allocation ID of an Elastic IP address to associate with the NAT gateway. If the Elastic IP address is
     *        associated with another resource, you must first disassociate it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNatGatewayRequest withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 64 ASCII characters.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.</p>
     *        <p>
     *        Constraint: Maximum 64 ASCII characters.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 64 ASCII characters.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.</p>
     *         <p>
     *         Constraint: Maximum 64 ASCII characters.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 64 ASCII characters.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.</p>
     *        <p>
     *        Constraint: Maximum 64 ASCII characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNatGatewayRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The subnet in which to create the NAT gateway.
     * </p>
     * 
     * @param subnetId
     *        The subnet in which to create the NAT gateway.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet in which to create the NAT gateway.
     * </p>
     * 
     * @return The subnet in which to create the NAT gateway.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet in which to create the NAT gateway.
     * </p>
     * 
     * @param subnetId
     *        The subnet in which to create the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNatGatewayRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateNatGatewayRequest> getDryRunRequest() {
        Request<CreateNatGatewayRequest> request = new CreateNatGatewayRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAllocationId() != null)
            sb.append("AllocationId: ").append(getAllocationId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNatGatewayRequest == false)
            return false;
        CreateNatGatewayRequest other = (CreateNatGatewayRequest) obj;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public CreateNatGatewayRequest clone() {
        return (CreateNatGatewayRequest) super.clone();
    }
}
