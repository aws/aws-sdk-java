/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeEffectivePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEffectivePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of policy that you want information about. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     * BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     */
    private String policyType;
    /**
     * <p>
     * When you're signed in as the management account, specify the ID of the account that you want details about.
     * Specifying an organization root or organizational unit (OU) as the target is not supported.
     * </p>
     */
    private String targetId;

    /**
     * <p>
     * The type of policy that you want information about. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     * BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyType
     *        The type of policy that you want information about. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     *        AISERVICES_OPT_OUT_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     *        BACKUP_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *        >TAG_POLICY</a>
     *        </p>
     *        </li>
     * @see EffectivePolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The type of policy that you want information about. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     * BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of policy that you want information about. You can specify one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     *         AISERVICES_OPT_OUT_POLICY</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     *         BACKUP_POLICY</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >TAG_POLICY</a>
     *         </p>
     *         </li>
     * @see EffectivePolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The type of policy that you want information about. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     * BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyType
     *        The type of policy that you want information about. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     *        AISERVICES_OPT_OUT_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     *        BACKUP_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *        >TAG_POLICY</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EffectivePolicyType
     */

    public DescribeEffectivePolicyRequest withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The type of policy that you want information about. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     * BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyType
     *        The type of policy that you want information about. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     *        AISERVICES_OPT_OUT_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     *        BACKUP_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *        >TAG_POLICY</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EffectivePolicyType
     */

    public DescribeEffectivePolicyRequest withPolicyType(EffectivePolicyType policyType) {
        this.policyType = policyType.toString();
        return this;
    }

    /**
     * <p>
     * When you're signed in as the management account, specify the ID of the account that you want details about.
     * Specifying an organization root or organizational unit (OU) as the target is not supported.
     * </p>
     * 
     * @param targetId
     *        When you're signed in as the management account, specify the ID of the account that you want details
     *        about. Specifying an organization root or organizational unit (OU) as the target is not supported.
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * When you're signed in as the management account, specify the ID of the account that you want details about.
     * Specifying an organization root or organizational unit (OU) as the target is not supported.
     * </p>
     * 
     * @return When you're signed in as the management account, specify the ID of the account that you want details
     *         about. Specifying an organization root or organizational unit (OU) as the target is not supported.
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * When you're signed in as the management account, specify the ID of the account that you want details about.
     * Specifying an organization root or organizational unit (OU) as the target is not supported.
     * </p>
     * 
     * @param targetId
     *        When you're signed in as the management account, specify the ID of the account that you want details
     *        about. Specifying an organization root or organizational unit (OU) as the target is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEffectivePolicyRequest withTargetId(String targetId) {
        setTargetId(targetId);
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
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType()).append(",");
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEffectivePolicyRequest == false)
            return false;
        DescribeEffectivePolicyRequest other = (DescribeEffectivePolicyRequest) obj;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEffectivePolicyRequest clone() {
        return (DescribeEffectivePolicyRequest) super.clone();
    }

}
