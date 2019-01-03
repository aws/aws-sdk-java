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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MoveAddressToVpcResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The allocation ID for the Elastic IP address.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * The status of the move of the IP address.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The allocation ID for the Elastic IP address.
     * </p>
     * 
     * @param allocationId
     *        The allocation ID for the Elastic IP address.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * The allocation ID for the Elastic IP address.
     * </p>
     * 
     * @return The allocation ID for the Elastic IP address.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * The allocation ID for the Elastic IP address.
     * </p>
     * 
     * @param allocationId
     *        The allocation ID for the Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MoveAddressToVpcResult withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * The status of the move of the IP address.
     * </p>
     * 
     * @param status
     *        The status of the move of the IP address.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the move of the IP address.
     * </p>
     * 
     * @return The status of the move of the IP address.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the move of the IP address.
     * </p>
     * 
     * @param status
     *        The status of the move of the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public MoveAddressToVpcResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the move of the IP address.
     * </p>
     * 
     * @param status
     *        The status of the move of the IP address.
     * @see Status
     */

    public void setStatus(Status status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the move of the IP address.
     * </p>
     * 
     * @param status
     *        The status of the move of the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public MoveAddressToVpcResult withStatus(Status status) {
        this.status = status.toString();
        return this;
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MoveAddressToVpcResult == false)
            return false;
        MoveAddressToVpcResult other = (MoveAddressToVpcResult) obj;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public MoveAddressToVpcResult clone() {
        try {
            return (MoveAddressToVpcResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
