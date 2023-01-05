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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A policy you want to associate with a resource.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * The policy ID.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * ID of the current policy version. The hash helps to prevent a situation where multiple users attempt to overwrite
     * a policy. You must provide this hash when updating or deleting a policy.
     * </p>
     */
    private String policyHash;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     * </p>
     * 
     * @param resourceArn
     *        Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     * </p>
     * 
     * @param resourceArn
     *        Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A policy you want to associate with a resource.
     * </p>
     * 
     * @param policy
     *        A policy you want to associate with a resource.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * A policy you want to associate with a resource.
     * </p>
     * 
     * @return A policy you want to associate with a resource.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * A policy you want to associate with a resource.
     * </p>
     * 
     * @param policy
     *        A policy you want to associate with a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The policy ID.
     * </p>
     * 
     * @param policyId
     *        The policy ID.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The policy ID.
     * </p>
     * 
     * @return The policy ID.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The policy ID.
     * </p>
     * 
     * @param policyId
     *        The policy ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * ID of the current policy version. The hash helps to prevent a situation where multiple users attempt to overwrite
     * a policy. You must provide this hash when updating or deleting a policy.
     * </p>
     * 
     * @param policyHash
     *        ID of the current policy version. The hash helps to prevent a situation where multiple users attempt to
     *        overwrite a policy. You must provide this hash when updating or deleting a policy.
     */

    public void setPolicyHash(String policyHash) {
        this.policyHash = policyHash;
    }

    /**
     * <p>
     * ID of the current policy version. The hash helps to prevent a situation where multiple users attempt to overwrite
     * a policy. You must provide this hash when updating or deleting a policy.
     * </p>
     * 
     * @return ID of the current policy version. The hash helps to prevent a situation where multiple users attempt to
     *         overwrite a policy. You must provide this hash when updating or deleting a policy.
     */

    public String getPolicyHash() {
        return this.policyHash;
    }

    /**
     * <p>
     * ID of the current policy version. The hash helps to prevent a situation where multiple users attempt to overwrite
     * a policy. You must provide this hash when updating or deleting a policy.
     * </p>
     * 
     * @param policyHash
     *        ID of the current policy version. The hash helps to prevent a situation where multiple users attempt to
     *        overwrite a policy. You must provide this hash when updating or deleting a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicyHash(String policyHash) {
        setPolicyHash(policyHash);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getPolicyHash() != null)
            sb.append("PolicyHash: ").append(getPolicyHash());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getPolicyHash() == null ^ this.getPolicyHash() == null)
            return false;
        if (other.getPolicyHash() != null && other.getPolicyHash().equals(this.getPolicyHash()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getPolicyHash() == null) ? 0 : getPolicyHash().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyRequest clone() {
        return (PutResourcePolicyRequest) super.clone();
    }

}
