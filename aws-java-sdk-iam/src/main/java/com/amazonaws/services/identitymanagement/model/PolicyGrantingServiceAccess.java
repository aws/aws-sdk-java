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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains details about the permissions policies that are attached to the specified identity (user, group, or role).
 * </p>
 * <p>
 * This data type is an element of the <a>ListPoliciesGrantingServiceAccessEntry</a> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/PolicyGrantingServiceAccess" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyGrantingServiceAccess implements Serializable, Cloneable {

    /**
     * <p>
     * The policy name.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The policy type. For more information about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private String policyType;

    private String policyArn;
    /**
     * <p>
     * The type of entity (user or role) that used the policy to access the service to which the inline policy is
     * attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * The name of the entity (user or role) to which the inline policy is attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private String entityName;

    /**
     * <p>
     * The policy name.
     * </p>
     * 
     * @param policyName
     *        The policy name.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * 
     * @return The policy name.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * 
     * @param policyName
     *        The policy name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyGrantingServiceAccess withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The policy type. For more information about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param policyType
     *        The policy type. For more information about these policy types, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed
     *        Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * @see PolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The policy type. For more information about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The policy type. For more information about these policy types, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed
     *         Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * @see PolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The policy type. For more information about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param policyType
     *        The policy type. For more information about these policy types, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed
     *        Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PolicyGrantingServiceAccess withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The policy type. For more information about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param policyType
     *        The policy type. For more information about these policy types, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed
     *        Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PolicyGrantingServiceAccess withPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
        return this;
    }

    /**
     * @param policyArn
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * @return
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * @param policyArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyGrantingServiceAccess withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * The type of entity (user or role) that used the policy to access the service to which the inline policy is
     * attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param entityType
     *        The type of entity (user or role) that used the policy to access the service to which the inline policy is
     *        attached.</p>
     *        <p>
     *        This field is null for managed policies. For more information about these policy types, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed
     *        Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * @see PolicyOwnerEntityType
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The type of entity (user or role) that used the policy to access the service to which the inline policy is
     * attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The type of entity (user or role) that used the policy to access the service to which the inline policy
     *         is attached.</p>
     *         <p>
     *         This field is null for managed policies. For more information about these policy types, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed
     *         Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * @see PolicyOwnerEntityType
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The type of entity (user or role) that used the policy to access the service to which the inline policy is
     * attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param entityType
     *        The type of entity (user or role) that used the policy to access the service to which the inline policy is
     *        attached.</p>
     *        <p>
     *        This field is null for managed policies. For more information about these policy types, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed
     *        Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyOwnerEntityType
     */

    public PolicyGrantingServiceAccess withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * The type of entity (user or role) that used the policy to access the service to which the inline policy is
     * attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param entityType
     *        The type of entity (user or role) that used the policy to access the service to which the inline policy is
     *        attached.</p>
     *        <p>
     *        This field is null for managed policies. For more information about these policy types, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed
     *        Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyOwnerEntityType
     */

    public PolicyGrantingServiceAccess withEntityType(PolicyOwnerEntityType entityType) {
        this.entityType = entityType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the entity (user or role) to which the inline policy is attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param entityName
     *        The name of the entity (user or role) to which the inline policy is attached.</p>
     *        <p>
     *        This field is null for managed policies. For more information about these policy types, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed
     *        Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     */

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    /**
     * <p>
     * The name of the entity (user or role) to which the inline policy is attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The name of the entity (user or role) to which the inline policy is attached.</p>
     *         <p>
     *         This field is null for managed policies. For more information about these policy types, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed
     *         Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     */

    public String getEntityName() {
        return this.entityName;
    }

    /**
     * <p>
     * The name of the entity (user or role) to which the inline policy is attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param entityName
     *        The name of the entity (user or role) to which the inline policy is attached.</p>
     *        <p>
     *        This field is null for managed policies. For more information about these policy types, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed
     *        Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyGrantingServiceAccess withEntityName(String entityName) {
        setEntityName(entityName);
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
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType()).append(",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getEntityName() != null)
            sb.append("EntityName: ").append(getEntityName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyGrantingServiceAccess == false)
            return false;
        PolicyGrantingServiceAccess other = (PolicyGrantingServiceAccess) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getEntityName() == null ^ this.getEntityName() == null)
            return false;
        if (other.getEntityName() != null && other.getEntityName().equals(this.getEntityName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getEntityName() == null) ? 0 : getEntityName().hashCode());
        return hashCode;
    }

    @Override
    public PolicyGrantingServiceAccess clone() {
        try {
            return (PolicyGrantingServiceAccess) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
