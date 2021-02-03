/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.ModifyAddressAttributeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyAddressAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyAddressAttributeRequest> {

    /**
     * <p>
     * [EC2-VPC] The allocation ID.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * The domain name to modify for the IP address.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * [EC2-VPC] The allocation ID.
     * </p>
     * 
     * @param allocationId
     *        [EC2-VPC] The allocation ID.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID.
     * </p>
     * 
     * @return [EC2-VPC] The allocation ID.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID.
     * </p>
     * 
     * @param allocationId
     *        [EC2-VPC] The allocation ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyAddressAttributeRequest withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * The domain name to modify for the IP address.
     * </p>
     * 
     * @param domainName
     *        The domain name to modify for the IP address.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name to modify for the IP address.
     * </p>
     * 
     * @return The domain name to modify for the IP address.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name to modify for the IP address.
     * </p>
     * 
     * @param domainName
     *        The domain name to modify for the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyAddressAttributeRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyAddressAttributeRequest> getDryRunRequest() {
        Request<ModifyAddressAttributeRequest> request = new ModifyAddressAttributeRequestMarshaller().marshall(this);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyAddressAttributeRequest == false)
            return false;
        ModifyAddressAttributeRequest other = (ModifyAddressAttributeRequest) obj;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public ModifyAddressAttributeRequest clone() {
        return (ModifyAddressAttributeRequest) super.clone();
    }
}
