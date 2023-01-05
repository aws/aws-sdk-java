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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateCostAllocationTagsStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCostAllocationTagsStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of <code>CostAllocationTagStatusEntry</code> objects that are used to update cost allocation tags status
     * for this request.
     * </p>
     */
    private java.util.List<CostAllocationTagStatusEntry> costAllocationTagsStatus;

    /**
     * <p>
     * The list of <code>CostAllocationTagStatusEntry</code> objects that are used to update cost allocation tags status
     * for this request.
     * </p>
     * 
     * @return The list of <code>CostAllocationTagStatusEntry</code> objects that are used to update cost allocation
     *         tags status for this request.
     */

    public java.util.List<CostAllocationTagStatusEntry> getCostAllocationTagsStatus() {
        return costAllocationTagsStatus;
    }

    /**
     * <p>
     * The list of <code>CostAllocationTagStatusEntry</code> objects that are used to update cost allocation tags status
     * for this request.
     * </p>
     * 
     * @param costAllocationTagsStatus
     *        The list of <code>CostAllocationTagStatusEntry</code> objects that are used to update cost allocation tags
     *        status for this request.
     */

    public void setCostAllocationTagsStatus(java.util.Collection<CostAllocationTagStatusEntry> costAllocationTagsStatus) {
        if (costAllocationTagsStatus == null) {
            this.costAllocationTagsStatus = null;
            return;
        }

        this.costAllocationTagsStatus = new java.util.ArrayList<CostAllocationTagStatusEntry>(costAllocationTagsStatus);
    }

    /**
     * <p>
     * The list of <code>CostAllocationTagStatusEntry</code> objects that are used to update cost allocation tags status
     * for this request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCostAllocationTagsStatus(java.util.Collection)} or
     * {@link #withCostAllocationTagsStatus(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param costAllocationTagsStatus
     *        The list of <code>CostAllocationTagStatusEntry</code> objects that are used to update cost allocation tags
     *        status for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCostAllocationTagsStatusRequest withCostAllocationTagsStatus(CostAllocationTagStatusEntry... costAllocationTagsStatus) {
        if (this.costAllocationTagsStatus == null) {
            setCostAllocationTagsStatus(new java.util.ArrayList<CostAllocationTagStatusEntry>(costAllocationTagsStatus.length));
        }
        for (CostAllocationTagStatusEntry ele : costAllocationTagsStatus) {
            this.costAllocationTagsStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>CostAllocationTagStatusEntry</code> objects that are used to update cost allocation tags status
     * for this request.
     * </p>
     * 
     * @param costAllocationTagsStatus
     *        The list of <code>CostAllocationTagStatusEntry</code> objects that are used to update cost allocation tags
     *        status for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCostAllocationTagsStatusRequest withCostAllocationTagsStatus(java.util.Collection<CostAllocationTagStatusEntry> costAllocationTagsStatus) {
        setCostAllocationTagsStatus(costAllocationTagsStatus);
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
        if (getCostAllocationTagsStatus() != null)
            sb.append("CostAllocationTagsStatus: ").append(getCostAllocationTagsStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCostAllocationTagsStatusRequest == false)
            return false;
        UpdateCostAllocationTagsStatusRequest other = (UpdateCostAllocationTagsStatusRequest) obj;
        if (other.getCostAllocationTagsStatus() == null ^ this.getCostAllocationTagsStatus() == null)
            return false;
        if (other.getCostAllocationTagsStatus() != null && other.getCostAllocationTagsStatus().equals(this.getCostAllocationTagsStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCostAllocationTagsStatus() == null) ? 0 : getCostAllocationTagsStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCostAllocationTagsStatusRequest clone() {
        return (UpdateCostAllocationTagsStatusRequest) super.clone();
    }

}
