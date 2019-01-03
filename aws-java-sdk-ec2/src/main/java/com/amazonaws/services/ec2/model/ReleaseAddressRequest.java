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
import com.amazonaws.services.ec2.model.transform.ReleaseAddressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReleaseAddressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ReleaseAddressRequest> {

    /**
     * <p>
     * [EC2-VPC] The allocation ID. Required for EC2-VPC.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     * </p>
     */
    private String publicIp;

    /**
     * Default constructor for ReleaseAddressRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public ReleaseAddressRequest() {
    }

    /**
     * Constructs a new ReleaseAddressRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param publicIp
     *        [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     */
    public ReleaseAddressRequest(String publicIp) {
        setPublicIp(publicIp);
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID. Required for EC2-VPC.
     * </p>
     * 
     * @param allocationId
     *        [EC2-VPC] The allocation ID. Required for EC2-VPC.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID. Required for EC2-VPC.
     * </p>
     * 
     * @return [EC2-VPC] The allocation ID. Required for EC2-VPC.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID. Required for EC2-VPC.
     * </p>
     * 
     * @param allocationId
     *        [EC2-VPC] The allocation ID. Required for EC2-VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseAddressRequest withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     * </p>
     * 
     * @param publicIp
     *        [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     * </p>
     * 
     * @return [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     * </p>
     * 
     * @param publicIp
     *        [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseAddressRequest withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ReleaseAddressRequest> getDryRunRequest() {
        Request<ReleaseAddressRequest> request = new ReleaseAddressRequestMarshaller().marshall(this);
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
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReleaseAddressRequest == false)
            return false;
        ReleaseAddressRequest other = (ReleaseAddressRequest) obj;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        return hashCode;
    }

    @Override
    public ReleaseAddressRequest clone() {
        return (ReleaseAddressRequest) super.clone();
    }
}
