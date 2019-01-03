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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/PolicyDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The name of the policy type.
     * </p>
     */
    private String policyTypeName;
    /**
     * <p>
     * The policy attributes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PolicyAttributeDescription> policyAttributeDescriptions;

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param policyName
     *        The name of the policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @return The name of the policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param policyName
     *        The name of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDescription withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * 
     * @param policyTypeName
     *        The name of the policy type.
     */

    public void setPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * 
     * @return The name of the policy type.
     */

    public String getPolicyTypeName() {
        return this.policyTypeName;
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * 
     * @param policyTypeName
     *        The name of the policy type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDescription withPolicyTypeName(String policyTypeName) {
        setPolicyTypeName(policyTypeName);
        return this;
    }

    /**
     * <p>
     * The policy attributes.
     * </p>
     * 
     * @return The policy attributes.
     */

    public java.util.List<PolicyAttributeDescription> getPolicyAttributeDescriptions() {
        if (policyAttributeDescriptions == null) {
            policyAttributeDescriptions = new com.amazonaws.internal.SdkInternalList<PolicyAttributeDescription>();
        }
        return policyAttributeDescriptions;
    }

    /**
     * <p>
     * The policy attributes.
     * </p>
     * 
     * @param policyAttributeDescriptions
     *        The policy attributes.
     */

    public void setPolicyAttributeDescriptions(java.util.Collection<PolicyAttributeDescription> policyAttributeDescriptions) {
        if (policyAttributeDescriptions == null) {
            this.policyAttributeDescriptions = null;
            return;
        }

        this.policyAttributeDescriptions = new com.amazonaws.internal.SdkInternalList<PolicyAttributeDescription>(policyAttributeDescriptions);
    }

    /**
     * <p>
     * The policy attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyAttributeDescriptions(java.util.Collection)} or
     * {@link #withPolicyAttributeDescriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param policyAttributeDescriptions
     *        The policy attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDescription withPolicyAttributeDescriptions(PolicyAttributeDescription... policyAttributeDescriptions) {
        if (this.policyAttributeDescriptions == null) {
            setPolicyAttributeDescriptions(new com.amazonaws.internal.SdkInternalList<PolicyAttributeDescription>(policyAttributeDescriptions.length));
        }
        for (PolicyAttributeDescription ele : policyAttributeDescriptions) {
            this.policyAttributeDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The policy attributes.
     * </p>
     * 
     * @param policyAttributeDescriptions
     *        The policy attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDescription withPolicyAttributeDescriptions(java.util.Collection<PolicyAttributeDescription> policyAttributeDescriptions) {
        setPolicyAttributeDescriptions(policyAttributeDescriptions);
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
        if (getPolicyTypeName() != null)
            sb.append("PolicyTypeName: ").append(getPolicyTypeName()).append(",");
        if (getPolicyAttributeDescriptions() != null)
            sb.append("PolicyAttributeDescriptions: ").append(getPolicyAttributeDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyDescription == false)
            return false;
        PolicyDescription other = (PolicyDescription) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyTypeName() == null ^ this.getPolicyTypeName() == null)
            return false;
        if (other.getPolicyTypeName() != null && other.getPolicyTypeName().equals(this.getPolicyTypeName()) == false)
            return false;
        if (other.getPolicyAttributeDescriptions() == null ^ this.getPolicyAttributeDescriptions() == null)
            return false;
        if (other.getPolicyAttributeDescriptions() != null && other.getPolicyAttributeDescriptions().equals(this.getPolicyAttributeDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyTypeName() == null) ? 0 : getPolicyTypeName().hashCode());
        hashCode = prime * hashCode + ((getPolicyAttributeDescriptions() == null) ? 0 : getPolicyAttributeDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public PolicyDescription clone() {
        try {
            return (PolicyDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
