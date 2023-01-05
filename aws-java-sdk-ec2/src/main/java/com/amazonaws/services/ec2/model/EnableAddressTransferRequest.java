/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.EnableAddressTransferRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableAddressTransferRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<EnableAddressTransferRequest> {

    /**
     * <p>
     * The allocation ID of an Elastic IP address.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * The ID of the account that you want to transfer the Elastic IP address to.
     * </p>
     */
    private String transferAccountId;

    /**
     * <p>
     * The allocation ID of an Elastic IP address.
     * </p>
     * 
     * @param allocationId
     *        The allocation ID of an Elastic IP address.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * The allocation ID of an Elastic IP address.
     * </p>
     * 
     * @return The allocation ID of an Elastic IP address.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * The allocation ID of an Elastic IP address.
     * </p>
     * 
     * @param allocationId
     *        The allocation ID of an Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableAddressTransferRequest withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * The ID of the account that you want to transfer the Elastic IP address to.
     * </p>
     * 
     * @param transferAccountId
     *        The ID of the account that you want to transfer the Elastic IP address to.
     */

    public void setTransferAccountId(String transferAccountId) {
        this.transferAccountId = transferAccountId;
    }

    /**
     * <p>
     * The ID of the account that you want to transfer the Elastic IP address to.
     * </p>
     * 
     * @return The ID of the account that you want to transfer the Elastic IP address to.
     */

    public String getTransferAccountId() {
        return this.transferAccountId;
    }

    /**
     * <p>
     * The ID of the account that you want to transfer the Elastic IP address to.
     * </p>
     * 
     * @param transferAccountId
     *        The ID of the account that you want to transfer the Elastic IP address to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableAddressTransferRequest withTransferAccountId(String transferAccountId) {
        setTransferAccountId(transferAccountId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<EnableAddressTransferRequest> getDryRunRequest() {
        Request<EnableAddressTransferRequest> request = new EnableAddressTransferRequestMarshaller().marshall(this);
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
        if (getTransferAccountId() != null)
            sb.append("TransferAccountId: ").append(getTransferAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableAddressTransferRequest == false)
            return false;
        EnableAddressTransferRequest other = (EnableAddressTransferRequest) obj;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getTransferAccountId() == null ^ this.getTransferAccountId() == null)
            return false;
        if (other.getTransferAccountId() != null && other.getTransferAccountId().equals(this.getTransferAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getTransferAccountId() == null) ? 0 : getTransferAccountId().hashCode());
        return hashCode;
    }

    @Override
    public EnableAddressTransferRequest clone() {
        return (EnableAddressTransferRequest) super.clone();
    }
}
