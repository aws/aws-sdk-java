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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Requests API Gateway to change information about the current Account resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * For more information about supported patch operations, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     * </p>
     */
    private java.util.List<PatchOperation> patchOperations;

    /**
     * <p>
     * For more information about supported patch operations, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     * </p>
     * 
     * @return For more information about supported patch operations, see <a
     *         href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     */

    public java.util.List<PatchOperation> getPatchOperations() {
        return patchOperations;
    }

    /**
     * <p>
     * For more information about supported patch operations, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     * </p>
     * 
     * @param patchOperations
     *        For more information about supported patch operations, see <a
     *        href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
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
     * For more information about supported patch operations, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPatchOperations(java.util.Collection)} or {@link #withPatchOperations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param patchOperations
     *        For more information about supported patch operations, see <a
     *        href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountRequest withPatchOperations(PatchOperation... patchOperations) {
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
     * For more information about supported patch operations, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     * </p>
     * 
     * @param patchOperations
     *        For more information about supported patch operations, see <a
     *        href="https://docs.aws.amazon.com/apigateway/latest/api/patch-operations.html">Patch Operations</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountRequest withPatchOperations(java.util.Collection<PatchOperation> patchOperations) {
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

        if (obj instanceof UpdateAccountRequest == false)
            return false;
        UpdateAccountRequest other = (UpdateAccountRequest) obj;
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

        hashCode = prime * hashCode + ((getPatchOperations() == null) ? 0 : getPatchOperations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountRequest clone() {
        return (UpdateAccountRequest) super.clone();
    }

}
