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
import com.amazonaws.services.ec2.model.transform.ReleaseAddressRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#releaseAddress(ReleaseAddressRequest) ReleaseAddress operation}.
 * <p>
 * The ReleaseAddress operation releases an elastic IP address associated with your account.
 * </p>
 * <p>
 * <b>NOTE:</b> Releasing an IP address automatically disassociates it from any instance with which it is associated. For more information, see
 * DisassociateAddress.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> After releasing an elastic IP address, it is released to the IP address pool and might no longer be available to your account. Make
 * sure to update your DNS records and any servers or devices that communicate with the address. If you run this operation on an elastic IP address that
 * is already released, the address might be assigned to another account which will cause Amazon EC2 to return an error.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#releaseAddress(ReleaseAddressRequest)
 */
public class ReleaseAddressRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ReleaseAddressRequest> {

    /**
     * The elastic IP address that you are releasing from your account.
     */
    private String publicIp;

    /**
     * The allocation ID that AWS provided when you allocated the address for
     * use with Amazon VPC.
     */
    private String allocationId;

    /**
     * Default constructor for a new ReleaseAddressRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ReleaseAddressRequest() {}
    
    /**
     * Constructs a new ReleaseAddressRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param publicIp The elastic IP address that you are releasing from
     * your account.
     */
    public ReleaseAddressRequest(String publicIp) {
        setPublicIp(publicIp);
    }

    /**
     * The elastic IP address that you are releasing from your account.
     *
     * @return The elastic IP address that you are releasing from your account.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * The elastic IP address that you are releasing from your account.
     *
     * @param publicIp The elastic IP address that you are releasing from your account.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * The elastic IP address that you are releasing from your account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp The elastic IP address that you are releasing from your account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReleaseAddressRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * The allocation ID that AWS provided when you allocated the address for
     * use with Amazon VPC.
     *
     * @return The allocation ID that AWS provided when you allocated the address for
     *         use with Amazon VPC.
     */
    public String getAllocationId() {
        return allocationId;
    }
    
    /**
     * The allocation ID that AWS provided when you allocated the address for
     * use with Amazon VPC.
     *
     * @param allocationId The allocation ID that AWS provided when you allocated the address for
     *         use with Amazon VPC.
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }
    
    /**
     * The allocation ID that AWS provided when you allocated the address for
     * use with Amazon VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocationId The allocation ID that AWS provided when you allocated the address for
     *         use with Amazon VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReleaseAddressRequest withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ReleaseAddressRequest> getDryRunRequest() {
        Request<ReleaseAddressRequest> request = new ReleaseAddressRequestMarshaller().marshall(this);
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
        if (getPublicIp() != null) sb.append("PublicIp: " + getPublicIp() + ",");
        if (getAllocationId() != null) sb.append("AllocationId: " + getAllocationId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode()); 
        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReleaseAddressRequest == false) return false;
        ReleaseAddressRequest other = (ReleaseAddressRequest)obj;
        
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        if (other.getAllocationId() == null ^ this.getAllocationId() == null) return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false) return false; 
        return true;
    }
    
}
    