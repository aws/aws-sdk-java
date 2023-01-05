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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateResiliencyPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResiliencyPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies a high-level geographical location constraint for where your resilience policy data can be stored.
     * </p>
     */
    private String dataLocationConstraint;
    /**
     * <p>
     * The type of resiliency policy to be created, including the recovery time objective (RTO) and recovery point
     * objective (RPO) in seconds.
     * </p>
     */
    private java.util.Map<String, FailurePolicy> policy;
    /**
     * <p>
     * The description for the policy.
     * </p>
     */
    private String policyDescription;
    /**
     * <p>
     * The name of the policy
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The tier for this resiliency policy, ranging from the highest severity (<code>MissionCritical</code>) to lowest (
     * <code>NonCritical</code>).
     * </p>
     */
    private String tier;

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @param clientToken
     *        Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *        characters. You should not reuse the same client token for other API requests.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @return Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *         characters. You should not reuse the same client token for other API requests.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @param clientToken
     *        Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *        characters. You should not reuse the same client token for other API requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResiliencyPolicyRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies a high-level geographical location constraint for where your resilience policy data can be stored.
     * </p>
     * 
     * @param dataLocationConstraint
     *        Specifies a high-level geographical location constraint for where your resilience policy data can be
     *        stored.
     * @see DataLocationConstraint
     */

    public void setDataLocationConstraint(String dataLocationConstraint) {
        this.dataLocationConstraint = dataLocationConstraint;
    }

    /**
     * <p>
     * Specifies a high-level geographical location constraint for where your resilience policy data can be stored.
     * </p>
     * 
     * @return Specifies a high-level geographical location constraint for where your resilience policy data can be
     *         stored.
     * @see DataLocationConstraint
     */

    public String getDataLocationConstraint() {
        return this.dataLocationConstraint;
    }

    /**
     * <p>
     * Specifies a high-level geographical location constraint for where your resilience policy data can be stored.
     * </p>
     * 
     * @param dataLocationConstraint
     *        Specifies a high-level geographical location constraint for where your resilience policy data can be
     *        stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLocationConstraint
     */

    public CreateResiliencyPolicyRequest withDataLocationConstraint(String dataLocationConstraint) {
        setDataLocationConstraint(dataLocationConstraint);
        return this;
    }

    /**
     * <p>
     * Specifies a high-level geographical location constraint for where your resilience policy data can be stored.
     * </p>
     * 
     * @param dataLocationConstraint
     *        Specifies a high-level geographical location constraint for where your resilience policy data can be
     *        stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLocationConstraint
     */

    public CreateResiliencyPolicyRequest withDataLocationConstraint(DataLocationConstraint dataLocationConstraint) {
        this.dataLocationConstraint = dataLocationConstraint.toString();
        return this;
    }

    /**
     * <p>
     * The type of resiliency policy to be created, including the recovery time objective (RTO) and recovery point
     * objective (RPO) in seconds.
     * </p>
     * 
     * @return The type of resiliency policy to be created, including the recovery time objective (RTO) and recovery
     *         point objective (RPO) in seconds.
     */

    public java.util.Map<String, FailurePolicy> getPolicy() {
        return policy;
    }

    /**
     * <p>
     * The type of resiliency policy to be created, including the recovery time objective (RTO) and recovery point
     * objective (RPO) in seconds.
     * </p>
     * 
     * @param policy
     *        The type of resiliency policy to be created, including the recovery time objective (RTO) and recovery
     *        point objective (RPO) in seconds.
     */

    public void setPolicy(java.util.Map<String, FailurePolicy> policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The type of resiliency policy to be created, including the recovery time objective (RTO) and recovery point
     * objective (RPO) in seconds.
     * </p>
     * 
     * @param policy
     *        The type of resiliency policy to be created, including the recovery time objective (RTO) and recovery
     *        point objective (RPO) in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResiliencyPolicyRequest withPolicy(java.util.Map<String, FailurePolicy> policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * Add a single Policy entry
     *
     * @see CreateResiliencyPolicyRequest#withPolicy
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateResiliencyPolicyRequest addPolicyEntry(String key, FailurePolicy value) {
        if (null == this.policy) {
            this.policy = new java.util.HashMap<String, FailurePolicy>();
        }
        if (this.policy.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.policy.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Policy.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResiliencyPolicyRequest clearPolicyEntries() {
        this.policy = null;
        return this;
    }

    /**
     * <p>
     * The description for the policy.
     * </p>
     * 
     * @param policyDescription
     *        The description for the policy.
     */

    public void setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
    }

    /**
     * <p>
     * The description for the policy.
     * </p>
     * 
     * @return The description for the policy.
     */

    public String getPolicyDescription() {
        return this.policyDescription;
    }

    /**
     * <p>
     * The description for the policy.
     * </p>
     * 
     * @param policyDescription
     *        The description for the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResiliencyPolicyRequest withPolicyDescription(String policyDescription) {
        setPolicyDescription(policyDescription);
        return this;
    }

    /**
     * <p>
     * The name of the policy
     * </p>
     * 
     * @param policyName
     *        The name of the policy
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy
     * </p>
     * 
     * @return The name of the policy
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy
     * </p>
     * 
     * @param policyName
     *        The name of the policy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResiliencyPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @return The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *         Each tag consists of a key/value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key/value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key/value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResiliencyPolicyRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateResiliencyPolicyRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateResiliencyPolicyRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResiliencyPolicyRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The tier for this resiliency policy, ranging from the highest severity (<code>MissionCritical</code>) to lowest (
     * <code>NonCritical</code>).
     * </p>
     * 
     * @param tier
     *        The tier for this resiliency policy, ranging from the highest severity (<code>MissionCritical</code>) to
     *        lowest (<code>NonCritical</code>).
     * @see ResiliencyPolicyTier
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The tier for this resiliency policy, ranging from the highest severity (<code>MissionCritical</code>) to lowest (
     * <code>NonCritical</code>).
     * </p>
     * 
     * @return The tier for this resiliency policy, ranging from the highest severity (<code>MissionCritical</code>) to
     *         lowest (<code>NonCritical</code>).
     * @see ResiliencyPolicyTier
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The tier for this resiliency policy, ranging from the highest severity (<code>MissionCritical</code>) to lowest (
     * <code>NonCritical</code>).
     * </p>
     * 
     * @param tier
     *        The tier for this resiliency policy, ranging from the highest severity (<code>MissionCritical</code>) to
     *        lowest (<code>NonCritical</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResiliencyPolicyTier
     */

    public CreateResiliencyPolicyRequest withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * The tier for this resiliency policy, ranging from the highest severity (<code>MissionCritical</code>) to lowest (
     * <code>NonCritical</code>).
     * </p>
     * 
     * @param tier
     *        The tier for this resiliency policy, ranging from the highest severity (<code>MissionCritical</code>) to
     *        lowest (<code>NonCritical</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResiliencyPolicyTier
     */

    public CreateResiliencyPolicyRequest withTier(ResiliencyPolicyTier tier) {
        this.tier = tier.toString();
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDataLocationConstraint() != null)
            sb.append("DataLocationConstraint: ").append(getDataLocationConstraint()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getPolicyDescription() != null)
            sb.append("PolicyDescription: ").append(getPolicyDescription()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResiliencyPolicyRequest == false)
            return false;
        CreateResiliencyPolicyRequest other = (CreateResiliencyPolicyRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDataLocationConstraint() == null ^ this.getDataLocationConstraint() == null)
            return false;
        if (other.getDataLocationConstraint() != null && other.getDataLocationConstraint().equals(this.getDataLocationConstraint()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getPolicyDescription() == null ^ this.getPolicyDescription() == null)
            return false;
        if (other.getPolicyDescription() != null && other.getPolicyDescription().equals(this.getPolicyDescription()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDataLocationConstraint() == null) ? 0 : getDataLocationConstraint().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getPolicyDescription() == null) ? 0 : getPolicyDescription().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        return hashCode;
    }

    @Override
    public CreateResiliencyPolicyRequest clone() {
        return (CreateResiliencyPolicyRequest) super.clone();
    }

}
