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
 * Updates an existing <a>VpcLink</a> of a specified identifier.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVpcLinkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     * <a>VpcLink</a>.
     * </p>
     */
    private String vpcLinkId;
    /**
     * <p>
     * A list of update operations to be applied to the specified resource and in the order specified in this list.
     * </p>
     */
    private java.util.List<PatchOperation> patchOperations;

    /**
     * <p>
     * [Required] The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     * <a>VpcLink</a>.
     * </p>
     * 
     * @param vpcLinkId
     *        [Required] The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     *        <a>VpcLink</a>.
     */

    public void setVpcLinkId(String vpcLinkId) {
        this.vpcLinkId = vpcLinkId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     * <a>VpcLink</a>.
     * </p>
     * 
     * @return [Required] The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     *         <a>VpcLink</a>.
     */

    public String getVpcLinkId() {
        return this.vpcLinkId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     * <a>VpcLink</a>.
     * </p>
     * 
     * @param vpcLinkId
     *        [Required] The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     *        <a>VpcLink</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcLinkRequest withVpcLinkId(String vpcLinkId) {
        setVpcLinkId(vpcLinkId);
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

    public UpdateVpcLinkRequest withPatchOperations(PatchOperation... patchOperations) {
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

    public UpdateVpcLinkRequest withPatchOperations(java.util.Collection<PatchOperation> patchOperations) {
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
        if (getVpcLinkId() != null)
            sb.append("VpcLinkId: ").append(getVpcLinkId()).append(",");
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

        if (obj instanceof UpdateVpcLinkRequest == false)
            return false;
        UpdateVpcLinkRequest other = (UpdateVpcLinkRequest) obj;
        if (other.getVpcLinkId() == null ^ this.getVpcLinkId() == null)
            return false;
        if (other.getVpcLinkId() != null && other.getVpcLinkId().equals(this.getVpcLinkId()) == false)
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

        hashCode = prime * hashCode + ((getVpcLinkId() == null) ? 0 : getVpcLinkId().hashCode());
        hashCode = prime * hashCode + ((getPatchOperations() == null) ? 0 : getPatchOperations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVpcLinkRequest clone() {
        return (UpdateVpcLinkRequest) super.clone();
    }

}
