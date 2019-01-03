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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The PATCH request to update a usage plan of a given plan Id.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUsagePlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The Id of the to-be-updated usage plan.
     * </p>
     */
    private String usagePlanId;
    /**
     * <p>
     * A list of update operations to be applied to the specified resource and in the order specified in this list.
     * </p>
     */
    private java.util.List<PatchOperation> patchOperations;

    /**
     * <p>
     * [Required] The Id of the to-be-updated usage plan.
     * </p>
     * 
     * @param usagePlanId
     *        [Required] The Id of the to-be-updated usage plan.
     */

    public void setUsagePlanId(String usagePlanId) {
        this.usagePlanId = usagePlanId;
    }

    /**
     * <p>
     * [Required] The Id of the to-be-updated usage plan.
     * </p>
     * 
     * @return [Required] The Id of the to-be-updated usage plan.
     */

    public String getUsagePlanId() {
        return this.usagePlanId;
    }

    /**
     * <p>
     * [Required] The Id of the to-be-updated usage plan.
     * </p>
     * 
     * @param usagePlanId
     *        [Required] The Id of the to-be-updated usage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUsagePlanRequest withUsagePlanId(String usagePlanId) {
        setUsagePlanId(usagePlanId);
        return this;
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and in the order specified in this list.
     * </p>
     * 
     * @return A list of update operations to be applied to the specified resource and in the order specified in this
     *         list.
     */

    public java.util.List<PatchOperation> getPatchOperations() {
        return patchOperations;
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and in the order specified in this list.
     * </p>
     * 
     * @param patchOperations
     *        A list of update operations to be applied to the specified resource and in the order specified in this
     *        list.
     */

    public void setPatchOperations(java.util.Collection<PatchOperation> patchOperations) {
        if (patchOperations == null) {
            this.patchOperations = null;
            return;
        }

        this.patchOperations = new java.util.ArrayList<PatchOperation>(patchOperations);
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and in the order specified in this list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPatchOperations(java.util.Collection)} or {@link #withPatchOperations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param patchOperations
     *        A list of update operations to be applied to the specified resource and in the order specified in this
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUsagePlanRequest withPatchOperations(PatchOperation... patchOperations) {
        if (this.patchOperations == null) {
            setPatchOperations(new java.util.ArrayList<PatchOperation>(patchOperations.length));
        }
        for (PatchOperation ele : patchOperations) {
            this.patchOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and in the order specified in this list.
     * </p>
     * 
     * @param patchOperations
     *        A list of update operations to be applied to the specified resource and in the order specified in this
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUsagePlanRequest withPatchOperations(java.util.Collection<PatchOperation> patchOperations) {
        setPatchOperations(patchOperations);
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
        if (getUsagePlanId() != null)
            sb.append("UsagePlanId: ").append(getUsagePlanId()).append(",");
        if (getPatchOperations() != null)
            sb.append("PatchOperations: ").append(getPatchOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUsagePlanRequest == false)
            return false;
        UpdateUsagePlanRequest other = (UpdateUsagePlanRequest) obj;
        if (other.getUsagePlanId() == null ^ this.getUsagePlanId() == null)
            return false;
        if (other.getUsagePlanId() != null && other.getUsagePlanId().equals(this.getUsagePlanId()) == false)
            return false;
        if (other.getPatchOperations() == null ^ this.getPatchOperations() == null)
            return false;
        if (other.getPatchOperations() != null && other.getPatchOperations().equals(this.getPatchOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsagePlanId() == null) ? 0 : getUsagePlanId().hashCode());
        hashCode = prime * hashCode + ((getPatchOperations() == null) ? 0 : getPatchOperations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUsagePlanRequest clone() {
        return (UpdateUsagePlanRequest) super.clone();
    }

}
