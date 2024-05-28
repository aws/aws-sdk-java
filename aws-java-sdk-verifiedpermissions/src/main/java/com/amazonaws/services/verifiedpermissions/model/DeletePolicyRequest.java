/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeletePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy that you want to delete.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * Specifies the ID of the policy that you want to delete.
     * </p>
     */
    private String policyId;

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy that you want to delete.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store that contains the policy that you want to delete.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy that you want to delete.
     * </p>
     * 
     * @return Specifies the ID of the policy store that contains the policy that you want to delete.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy that you want to delete.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store that contains the policy that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePolicyRequest withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * Specifies the ID of the policy that you want to delete.
     * </p>
     * 
     * @param policyId
     *        Specifies the ID of the policy that you want to delete.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * Specifies the ID of the policy that you want to delete.
     * </p>
     * 
     * @return Specifies the ID of the policy that you want to delete.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * Specifies the ID of the policy that you want to delete.
     * </p>
     * 
     * @param policyId
     *        Specifies the ID of the policy that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePolicyRequest withPolicyId(String policyId) {
        setPolicyId(policyId);
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
        if (getPolicyStoreId() != null)
            sb.append("PolicyStoreId: ").append(getPolicyStoreId()).append(",");
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePolicyRequest == false)
            return false;
        DeletePolicyRequest other = (DeletePolicyRequest) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        return hashCode;
    }

    @Override
    public DeletePolicyRequest clone() {
        return (DeletePolicyRequest) super.clone();
    }

}
