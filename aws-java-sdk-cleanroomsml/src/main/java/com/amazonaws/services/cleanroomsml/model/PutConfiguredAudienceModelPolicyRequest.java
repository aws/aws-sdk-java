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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/PutConfiguredAudienceModelPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutConfiguredAudienceModelPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that the resource policy will govern.
     * </p>
     */
    private String configuredAudienceModelArn;
    /**
     * <p>
     * The IAM resource policy.
     * </p>
     */
    private String configuredAudienceModelPolicy;
    /**
     * <p>
     * Use this to prevent unexpected concurrent modification of the policy.
     * </p>
     */
    private String policyExistenceCondition;
    /**
     * <p>
     * A cryptographic hash of the contents of the policy used to prevent unexpected concurrent modification of the
     * policy.
     * </p>
     */
    private String previousPolicyHash;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that the resource policy will govern.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model that the resource policy will govern.
     */

    public void setConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        this.configuredAudienceModelArn = configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that the resource policy will govern.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configured audience model that the resource policy will govern.
     */

    public String getConfiguredAudienceModelArn() {
        return this.configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that the resource policy will govern.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model that the resource policy will govern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfiguredAudienceModelPolicyRequest withConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        setConfiguredAudienceModelArn(configuredAudienceModelArn);
        return this;
    }

    /**
     * <p>
     * The IAM resource policy.
     * </p>
     * 
     * @param configuredAudienceModelPolicy
     *        The IAM resource policy.
     */

    public void setConfiguredAudienceModelPolicy(String configuredAudienceModelPolicy) {
        this.configuredAudienceModelPolicy = configuredAudienceModelPolicy;
    }

    /**
     * <p>
     * The IAM resource policy.
     * </p>
     * 
     * @return The IAM resource policy.
     */

    public String getConfiguredAudienceModelPolicy() {
        return this.configuredAudienceModelPolicy;
    }

    /**
     * <p>
     * The IAM resource policy.
     * </p>
     * 
     * @param configuredAudienceModelPolicy
     *        The IAM resource policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfiguredAudienceModelPolicyRequest withConfiguredAudienceModelPolicy(String configuredAudienceModelPolicy) {
        setConfiguredAudienceModelPolicy(configuredAudienceModelPolicy);
        return this;
    }

    /**
     * <p>
     * Use this to prevent unexpected concurrent modification of the policy.
     * </p>
     * 
     * @param policyExistenceCondition
     *        Use this to prevent unexpected concurrent modification of the policy.
     * @see PolicyExistenceCondition
     */

    public void setPolicyExistenceCondition(String policyExistenceCondition) {
        this.policyExistenceCondition = policyExistenceCondition;
    }

    /**
     * <p>
     * Use this to prevent unexpected concurrent modification of the policy.
     * </p>
     * 
     * @return Use this to prevent unexpected concurrent modification of the policy.
     * @see PolicyExistenceCondition
     */

    public String getPolicyExistenceCondition() {
        return this.policyExistenceCondition;
    }

    /**
     * <p>
     * Use this to prevent unexpected concurrent modification of the policy.
     * </p>
     * 
     * @param policyExistenceCondition
     *        Use this to prevent unexpected concurrent modification of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyExistenceCondition
     */

    public PutConfiguredAudienceModelPolicyRequest withPolicyExistenceCondition(String policyExistenceCondition) {
        setPolicyExistenceCondition(policyExistenceCondition);
        return this;
    }

    /**
     * <p>
     * Use this to prevent unexpected concurrent modification of the policy.
     * </p>
     * 
     * @param policyExistenceCondition
     *        Use this to prevent unexpected concurrent modification of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyExistenceCondition
     */

    public PutConfiguredAudienceModelPolicyRequest withPolicyExistenceCondition(PolicyExistenceCondition policyExistenceCondition) {
        this.policyExistenceCondition = policyExistenceCondition.toString();
        return this;
    }

    /**
     * <p>
     * A cryptographic hash of the contents of the policy used to prevent unexpected concurrent modification of the
     * policy.
     * </p>
     * 
     * @param previousPolicyHash
     *        A cryptographic hash of the contents of the policy used to prevent unexpected concurrent modification of
     *        the policy.
     */

    public void setPreviousPolicyHash(String previousPolicyHash) {
        this.previousPolicyHash = previousPolicyHash;
    }

    /**
     * <p>
     * A cryptographic hash of the contents of the policy used to prevent unexpected concurrent modification of the
     * policy.
     * </p>
     * 
     * @return A cryptographic hash of the contents of the policy used to prevent unexpected concurrent modification of
     *         the policy.
     */

    public String getPreviousPolicyHash() {
        return this.previousPolicyHash;
    }

    /**
     * <p>
     * A cryptographic hash of the contents of the policy used to prevent unexpected concurrent modification of the
     * policy.
     * </p>
     * 
     * @param previousPolicyHash
     *        A cryptographic hash of the contents of the policy used to prevent unexpected concurrent modification of
     *        the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfiguredAudienceModelPolicyRequest withPreviousPolicyHash(String previousPolicyHash) {
        setPreviousPolicyHash(previousPolicyHash);
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
        if (getConfiguredAudienceModelArn() != null)
            sb.append("ConfiguredAudienceModelArn: ").append(getConfiguredAudienceModelArn()).append(",");
        if (getConfiguredAudienceModelPolicy() != null)
            sb.append("ConfiguredAudienceModelPolicy: ").append(getConfiguredAudienceModelPolicy()).append(",");
        if (getPolicyExistenceCondition() != null)
            sb.append("PolicyExistenceCondition: ").append(getPolicyExistenceCondition()).append(",");
        if (getPreviousPolicyHash() != null)
            sb.append("PreviousPolicyHash: ").append(getPreviousPolicyHash());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConfiguredAudienceModelPolicyRequest == false)
            return false;
        PutConfiguredAudienceModelPolicyRequest other = (PutConfiguredAudienceModelPolicyRequest) obj;
        if (other.getConfiguredAudienceModelArn() == null ^ this.getConfiguredAudienceModelArn() == null)
            return false;
        if (other.getConfiguredAudienceModelArn() != null && other.getConfiguredAudienceModelArn().equals(this.getConfiguredAudienceModelArn()) == false)
            return false;
        if (other.getConfiguredAudienceModelPolicy() == null ^ this.getConfiguredAudienceModelPolicy() == null)
            return false;
        if (other.getConfiguredAudienceModelPolicy() != null
                && other.getConfiguredAudienceModelPolicy().equals(this.getConfiguredAudienceModelPolicy()) == false)
            return false;
        if (other.getPolicyExistenceCondition() == null ^ this.getPolicyExistenceCondition() == null)
            return false;
        if (other.getPolicyExistenceCondition() != null && other.getPolicyExistenceCondition().equals(this.getPolicyExistenceCondition()) == false)
            return false;
        if (other.getPreviousPolicyHash() == null ^ this.getPreviousPolicyHash() == null)
            return false;
        if (other.getPreviousPolicyHash() != null && other.getPreviousPolicyHash().equals(this.getPreviousPolicyHash()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguredAudienceModelArn() == null) ? 0 : getConfiguredAudienceModelArn().hashCode());
        hashCode = prime * hashCode + ((getConfiguredAudienceModelPolicy() == null) ? 0 : getConfiguredAudienceModelPolicy().hashCode());
        hashCode = prime * hashCode + ((getPolicyExistenceCondition() == null) ? 0 : getPolicyExistenceCondition().hashCode());
        hashCode = prime * hashCode + ((getPreviousPolicyHash() == null) ? 0 : getPreviousPolicyHash().hashCode());
        return hashCode;
    }

    @Override
    public PutConfiguredAudienceModelPolicyRequest clone() {
        return (PutConfiguredAudienceModelPolicyRequest) super.clone();
    }

}
