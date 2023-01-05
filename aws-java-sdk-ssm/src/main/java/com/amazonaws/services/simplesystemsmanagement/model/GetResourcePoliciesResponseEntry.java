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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A resource policy helps you to define the IAM entity (for example, an Amazon Web Services account) that can manage
 * your Systems Manager resources. Currently, <code>OpsItemGroup</code> is the only resource that supports Systems
 * Manager resource policies. The resource policy for <code>OpsItemGroup</code> enables Amazon Web Services accounts to
 * view and interact with OpsCenter operational work items (OpsItems).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetResourcePoliciesResponseEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourcePoliciesResponseEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A policy ID.
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
     * A resource policy helps you to define the IAM entity (for example, an Amazon Web Services account) that can
     * manage your Systems Manager resources. Currently, <code>OpsItemGroup</code> is the only resource that supports
     * Systems Manager resource policies. The resource policy for <code>OpsItemGroup</code> enables Amazon Web Services
     * accounts to view and interact with OpsCenter operational work items (OpsItems).
     * </p>
     */
    private String policy;

    /**
     * <p>
     * A policy ID.
     * </p>
     * 
     * @param policyId
     *        A policy ID.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * A policy ID.
     * </p>
     * 
     * @return A policy ID.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * A policy ID.
     * </p>
     * 
     * @param policyId
     *        A policy ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePoliciesResponseEntry withPolicyId(String policyId) {
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

    public GetResourcePoliciesResponseEntry withPolicyHash(String policyHash) {
        setPolicyHash(policyHash);
        return this;
    }

    /**
     * <p>
     * A resource policy helps you to define the IAM entity (for example, an Amazon Web Services account) that can
     * manage your Systems Manager resources. Currently, <code>OpsItemGroup</code> is the only resource that supports
     * Systems Manager resource policies. The resource policy for <code>OpsItemGroup</code> enables Amazon Web Services
     * accounts to view and interact with OpsCenter operational work items (OpsItems).
     * </p>
     * 
     * @param policy
     *        A resource policy helps you to define the IAM entity (for example, an Amazon Web Services account) that
     *        can manage your Systems Manager resources. Currently, <code>OpsItemGroup</code> is the only resource that
     *        supports Systems Manager resource policies. The resource policy for <code>OpsItemGroup</code> enables
     *        Amazon Web Services accounts to view and interact with OpsCenter operational work items (OpsItems).
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * A resource policy helps you to define the IAM entity (for example, an Amazon Web Services account) that can
     * manage your Systems Manager resources. Currently, <code>OpsItemGroup</code> is the only resource that supports
     * Systems Manager resource policies. The resource policy for <code>OpsItemGroup</code> enables Amazon Web Services
     * accounts to view and interact with OpsCenter operational work items (OpsItems).
     * </p>
     * 
     * @return A resource policy helps you to define the IAM entity (for example, an Amazon Web Services account) that
     *         can manage your Systems Manager resources. Currently, <code>OpsItemGroup</code> is the only resource that
     *         supports Systems Manager resource policies. The resource policy for <code>OpsItemGroup</code> enables
     *         Amazon Web Services accounts to view and interact with OpsCenter operational work items (OpsItems).
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * A resource policy helps you to define the IAM entity (for example, an Amazon Web Services account) that can
     * manage your Systems Manager resources. Currently, <code>OpsItemGroup</code> is the only resource that supports
     * Systems Manager resource policies. The resource policy for <code>OpsItemGroup</code> enables Amazon Web Services
     * accounts to view and interact with OpsCenter operational work items (OpsItems).
     * </p>
     * 
     * @param policy
     *        A resource policy helps you to define the IAM entity (for example, an Amazon Web Services account) that
     *        can manage your Systems Manager resources. Currently, <code>OpsItemGroup</code> is the only resource that
     *        supports Systems Manager resource policies. The resource policy for <code>OpsItemGroup</code> enables
     *        Amazon Web Services accounts to view and interact with OpsCenter operational work items (OpsItems).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePoliciesResponseEntry withPolicy(String policy) {
        setPolicy(policy);
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getPolicyHash() != null)
            sb.append("PolicyHash: ").append(getPolicyHash()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourcePoliciesResponseEntry == false)
            return false;
        GetResourcePoliciesResponseEntry other = (GetResourcePoliciesResponseEntry) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getPolicyHash() == null ^ this.getPolicyHash() == null)
            return false;
        if (other.getPolicyHash() != null && other.getPolicyHash().equals(this.getPolicyHash()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getPolicyHash() == null) ? 0 : getPolicyHash().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public GetResourcePoliciesResponseEntry clone() {
        try {
            return (GetResourcePoliciesResponseEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.GetResourcePoliciesResponseEntryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
