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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeletePolicyTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePolicyTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy template that you want to delete.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * Specifies the ID of the policy template that you want to delete.
     * </p>
     */
    private String policyTemplateId;

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy template that you want to delete.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store that contains the policy template that you want to delete.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy template that you want to delete.
     * </p>
     * 
     * @return Specifies the ID of the policy store that contains the policy template that you want to delete.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy template that you want to delete.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store that contains the policy template that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePolicyTemplateRequest withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * Specifies the ID of the policy template that you want to delete.
     * </p>
     * 
     * @param policyTemplateId
     *        Specifies the ID of the policy template that you want to delete.
     */

    public void setPolicyTemplateId(String policyTemplateId) {
        this.policyTemplateId = policyTemplateId;
    }

    /**
     * <p>
     * Specifies the ID of the policy template that you want to delete.
     * </p>
     * 
     * @return Specifies the ID of the policy template that you want to delete.
     */

    public String getPolicyTemplateId() {
        return this.policyTemplateId;
    }

    /**
     * <p>
     * Specifies the ID of the policy template that you want to delete.
     * </p>
     * 
     * @param policyTemplateId
     *        Specifies the ID of the policy template that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePolicyTemplateRequest withPolicyTemplateId(String policyTemplateId) {
        setPolicyTemplateId(policyTemplateId);
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
        if (getPolicyTemplateId() != null)
            sb.append("PolicyTemplateId: ").append(getPolicyTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePolicyTemplateRequest == false)
            return false;
        DeletePolicyTemplateRequest other = (DeletePolicyTemplateRequest) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getPolicyTemplateId() == null ^ this.getPolicyTemplateId() == null)
            return false;
        if (other.getPolicyTemplateId() != null && other.getPolicyTemplateId().equals(this.getPolicyTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getPolicyTemplateId() == null) ? 0 : getPolicyTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public DeletePolicyTemplateRequest clone() {
        return (DeletePolicyTemplateRequest) super.clone();
    }

}
