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
import com.amazonaws.services.ec2.model.transform.ReleaseAddressRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#releaseAddress(ReleaseAddressRequest) ReleaseAddress operation}.
 * <p>
 * Releases the specified Elastic IP address.
 * </p>
 * <p>
 * After releasing an Elastic IP address, it is released to the IP
 * address pool and might be unavailable to you. Be sure to update your
 * DNS records and any servers or devices that communicate with the
 * address. If you attempt to release an Elastic IP address that you
 * already released, you'll get an <code>AuthFailure</code> error if the
 * address is already allocated to another AWS account.
 * </p>
 * <p>
 * [EC2-Classic, default VPC] Releasing an Elastic IP address
 * automatically disassociates it from any instance that it's associated
 * with. To disassociate an Elastic IP address without releasing it, use
 * DisassociateAddress.
 * </p>
 * <p>
 * [Nondefault VPC] You must use the DisassociateAddress to disassociate
 * the Elastic IP address before you try to release it. Otherwise, Amazon
 * EC2 returns an error ( <code>InvalidIPAddress.InUse</code> ).
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#releaseAddress(ReleaseAddressRequest)
 */
public class ReleaseAddressRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ReleaseAddressRequest> {

    /**
     * [EC2-Classic] The Elastic IP address.
     */
    private String publicIp;

    /**
     * [EC2-VPC] The allocation ID.
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
     * @param publicIp [EC2-Classic] The Elastic IP address.
     */
    public ReleaseAddressRequest(String publicIp) {
        setPublicIp(publicIp);
    }

    /**
     * [EC2-Classic] The Elastic IP address.
     *
     * @return [EC2-Classic] The Elastic IP address.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * [EC2-Classic] The Elastic IP address.
     *
     * @param publicIp [EC2-Classic] The Elastic IP address.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * [EC2-Classic] The Elastic IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp [EC2-Classic] The Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReleaseAddressRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * [EC2-VPC] The allocation ID.
     *
     * @return [EC2-VPC] The allocation ID.
     */
    public String getAllocationId() {
        return allocationId;
    }
    
    /**
     * [EC2-VPC] The allocation ID.
     *
     * @param allocationId [EC2-VPC] The allocation ID.
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }
    
    /**
     * [EC2-VPC] The allocation ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocationId [EC2-VPC] The allocation ID.
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
    