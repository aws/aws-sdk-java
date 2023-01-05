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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a resiliency policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ResiliencyPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResiliencyPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp for when the resiliency policy was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Specifies a high-level geographical location constraint for where your resilience policy data can be stored.
     * </p>
     */
    private String dataLocationConstraint;
    /**
     * <p>
     * Specifies the estimated cost tier of the resiliency policy.
     * </p>
     */
    private String estimatedCostTier;
    /**
     * <p>
     * The resiliency policy.
     * </p>
     */
    private java.util.Map<String, FailurePolicy> policy;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String policyArn;
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
     * The timestamp for when the resiliency policy was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp for when the resiliency policy was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp for when the resiliency policy was created.
     * </p>
     * 
     * @return The timestamp for when the resiliency policy was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp for when the resiliency policy was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp for when the resiliency policy was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResiliencyPolicy withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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

    public ResiliencyPolicy withDataLocationConstraint(String dataLocationConstraint) {
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

    public ResiliencyPolicy withDataLocationConstraint(DataLocationConstraint dataLocationConstraint) {
        this.dataLocationConstraint = dataLocationConstraint.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the estimated cost tier of the resiliency policy.
     * </p>
     * 
     * @param estimatedCostTier
     *        Specifies the estimated cost tier of the resiliency policy.
     * @see EstimatedCostTier
     */

    public void setEstimatedCostTier(String estimatedCostTier) {
        this.estimatedCostTier = estimatedCostTier;
    }

    /**
     * <p>
     * Specifies the estimated cost tier of the resiliency policy.
     * </p>
     * 
     * @return Specifies the estimated cost tier of the resiliency policy.
     * @see EstimatedCostTier
     */

    public String getEstimatedCostTier() {
        return this.estimatedCostTier;
    }

    /**
     * <p>
     * Specifies the estimated cost tier of the resiliency policy.
     * </p>
     * 
     * @param estimatedCostTier
     *        Specifies the estimated cost tier of the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EstimatedCostTier
     */

    public ResiliencyPolicy withEstimatedCostTier(String estimatedCostTier) {
        setEstimatedCostTier(estimatedCostTier);
        return this;
    }

    /**
     * <p>
     * Specifies the estimated cost tier of the resiliency policy.
     * </p>
     * 
     * @param estimatedCostTier
     *        Specifies the estimated cost tier of the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EstimatedCostTier
     */

    public ResiliencyPolicy withEstimatedCostTier(EstimatedCostTier estimatedCostTier) {
        this.estimatedCostTier = estimatedCostTier.toString();
        return this;
    }

    /**
     * <p>
     * The resiliency policy.
     * </p>
     * 
     * @return The resiliency policy.
     */

    public java.util.Map<String, FailurePolicy> getPolicy() {
        return policy;
    }

    /**
     * <p>
     * The resiliency policy.
     * </p>
     * 
     * @param policy
     *        The resiliency policy.
     */

    public void setPolicy(java.util.Map<String, FailurePolicy> policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The resiliency policy.
     * </p>
     * 
     * @param policy
     *        The resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResiliencyPolicy withPolicy(java.util.Map<String, FailurePolicy> policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * Add a single Policy entry
     *
     * @see ResiliencyPolicy#withPolicy
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ResiliencyPolicy addPolicyEntry(String key, FailurePolicy value) {
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

    public ResiliencyPolicy clearPolicyEntries() {
        this.policy = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *        <code>policy-id</code>. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *         <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *         <code>policy-id</code>. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *        <code>policy-id</code>. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResiliencyPolicy withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
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

    public ResiliencyPolicy withPolicyDescription(String policyDescription) {
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

    public ResiliencyPolicy withPolicyName(String policyName) {
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

    public ResiliencyPolicy withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ResiliencyPolicy#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ResiliencyPolicy addTagsEntry(String key, String value) {
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

    public ResiliencyPolicy clearTagsEntries() {
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

    public ResiliencyPolicy withTier(String tier) {
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

    public ResiliencyPolicy withTier(ResiliencyPolicyTier tier) {
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDataLocationConstraint() != null)
            sb.append("DataLocationConstraint: ").append(getDataLocationConstraint()).append(",");
        if (getEstimatedCostTier() != null)
            sb.append("EstimatedCostTier: ").append(getEstimatedCostTier()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
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

        if (obj instanceof ResiliencyPolicy == false)
            return false;
        ResiliencyPolicy other = (ResiliencyPolicy) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDataLocationConstraint() == null ^ this.getDataLocationConstraint() == null)
            return false;
        if (other.getDataLocationConstraint() != null && other.getDataLocationConstraint().equals(this.getDataLocationConstraint()) == false)
            return false;
        if (other.getEstimatedCostTier() == null ^ this.getEstimatedCostTier() == null)
            return false;
        if (other.getEstimatedCostTier() != null && other.getEstimatedCostTier().equals(this.getEstimatedCostTier()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
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

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDataLocationConstraint() == null) ? 0 : getDataLocationConstraint().hashCode());
        hashCode = prime * hashCode + ((getEstimatedCostTier() == null) ? 0 : getEstimatedCostTier().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyDescription() == null) ? 0 : getPolicyDescription().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        return hashCode;
    }

    @Override
    public ResiliencyPolicy clone() {
        try {
            return (ResiliencyPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.ResiliencyPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
