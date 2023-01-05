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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/DeleteResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource policy to delete.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * Specifies a specific policy revision to delete. Provide a <code>PolicyRevisionId</code> to ensure an atomic
     * delete operation. If the provided revision id does not match the latest policy revision id, an
     * <code>InvalidPolicyRevisionIdException</code> exception is returned.
     * </p>
     */
    private String policyRevisionId;

    /**
     * <p>
     * The name of the resource policy to delete.
     * </p>
     * 
     * @param policyName
     *        The name of the resource policy to delete.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the resource policy to delete.
     * </p>
     * 
     * @return The name of the resource policy to delete.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the resource policy to delete.
     * </p>
     * 
     * @param policyName
     *        The name of the resource policy to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResourcePolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * Specifies a specific policy revision to delete. Provide a <code>PolicyRevisionId</code> to ensure an atomic
     * delete operation. If the provided revision id does not match the latest policy revision id, an
     * <code>InvalidPolicyRevisionIdException</code> exception is returned.
     * </p>
     * 
     * @param policyRevisionId
     *        Specifies a specific policy revision to delete. Provide a <code>PolicyRevisionId</code> to ensure an
     *        atomic delete operation. If the provided revision id does not match the latest policy revision id, an
     *        <code>InvalidPolicyRevisionIdException</code> exception is returned.
     */

    public void setPolicyRevisionId(String policyRevisionId) {
        this.policyRevisionId = policyRevisionId;
    }

    /**
     * <p>
     * Specifies a specific policy revision to delete. Provide a <code>PolicyRevisionId</code> to ensure an atomic
     * delete operation. If the provided revision id does not match the latest policy revision id, an
     * <code>InvalidPolicyRevisionIdException</code> exception is returned.
     * </p>
     * 
     * @return Specifies a specific policy revision to delete. Provide a <code>PolicyRevisionId</code> to ensure an
     *         atomic delete operation. If the provided revision id does not match the latest policy revision id, an
     *         <code>InvalidPolicyRevisionIdException</code> exception is returned.
     */

    public String getPolicyRevisionId() {
        return this.policyRevisionId;
    }

    /**
     * <p>
     * Specifies a specific policy revision to delete. Provide a <code>PolicyRevisionId</code> to ensure an atomic
     * delete operation. If the provided revision id does not match the latest policy revision id, an
     * <code>InvalidPolicyRevisionIdException</code> exception is returned.
     * </p>
     * 
     * @param policyRevisionId
     *        Specifies a specific policy revision to delete. Provide a <code>PolicyRevisionId</code> to ensure an
     *        atomic delete operation. If the provided revision id does not match the latest policy revision id, an
     *        <code>InvalidPolicyRevisionIdException</code> exception is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResourcePolicyRequest withPolicyRevisionId(String policyRevisionId) {
        setPolicyRevisionId(policyRevisionId);
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
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyRevisionId() != null)
            sb.append("PolicyRevisionId: ").append(getPolicyRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteResourcePolicyRequest == false)
            return false;
        DeleteResourcePolicyRequest other = (DeleteResourcePolicyRequest) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyRevisionId() == null ^ this.getPolicyRevisionId() == null)
            return false;
        if (other.getPolicyRevisionId() != null && other.getPolicyRevisionId().equals(this.getPolicyRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyRevisionId() == null) ? 0 : getPolicyRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteResourcePolicyRequest clone() {
        return (DeleteResourcePolicyRequest) super.clone();
    }

}
