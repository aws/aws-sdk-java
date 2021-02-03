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
import com.amazonaws.services.ec2.model.transform.ResetAddressAttributeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetAddressAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ResetAddressAttributeRequest> {

    /**
     * <p>
     * [EC2-VPC] The allocation ID.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * The attribute of the IP address.
     * </p>
     */
    private String attribute;

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

    public ResetAddressAttributeRequest withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * The attribute of the IP address.
     * </p>
     * 
     * @param attribute
     *        The attribute of the IP address.
     * @see AddressAttributeName
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The attribute of the IP address.
     * </p>
     * 
     * @return The attribute of the IP address.
     * @see AddressAttributeName
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The attribute of the IP address.
     * </p>
     * 
     * @param attribute
     *        The attribute of the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressAttributeName
     */

    public ResetAddressAttributeRequest withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The attribute of the IP address.
     * </p>
     * 
     * @param attribute
     *        The attribute of the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressAttributeName
     */

    public ResetAddressAttributeRequest withAttribute(AddressAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ResetAddressAttributeRequest> getDryRunRequest() {
        Request<ResetAddressAttributeRequest> request = new ResetAddressAttributeRequestMarshaller().marshall(this);
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetAddressAttributeRequest == false)
            return false;
        ResetAddressAttributeRequest other = (ResetAddressAttributeRequest) obj;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        return hashCode;
    }

    @Override
    public ResetAddressAttributeRequest clone() {
        return (ResetAddressAttributeRequest) super.clone();
    }
}
