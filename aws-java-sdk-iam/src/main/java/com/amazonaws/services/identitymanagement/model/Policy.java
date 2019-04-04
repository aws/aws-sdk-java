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
 * Contains information about a managed policy.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>CreatePolicy</a>, <a>GetPolicy</a>, and <a>ListPolicies</a>
 * operations.
 * </p>
 * <p>
 * For more information about managed policies, refer to <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline
 * Policies</a> in the <i>Using IAM</i> guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/Policy" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Policy implements Serializable, Cloneable {

    /**
     * <p>
     * The friendly name (not ARN) identifying the policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The stable and unique string identifying the policy.
     * </p>
     * <p>
     * For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     */
    private String policyId;

    private String arn;
    /**
     * <p>
     * The path to the policy.
     * </p>
     * <p>
     * For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The identifier for the version of the policy that is set as the default version.
     * </p>
     */
    private String defaultVersionId;
    /**
     * <p>
     * The number of entities (users, groups, and roles) that the policy is attached to.
     * </p>
     */
    private Integer attachmentCount;
    /**
     * <p>
     * The number of entities (users and roles) for which the policy is used to set the permissions boundary.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html">Permissions Boundaries
     * for IAM Identities </a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private Integer permissionsBoundaryUsageCount;
    /**
     * <p>
     * Specifies whether the policy can be attached to an IAM user, group, or role.
     * </p>
     */
    private Boolean isAttachable;
    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * This element is included in the response to the <a>GetPolicy</a> operation. It is not included in the response to
     * the <a>ListPolicies</a> operation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the policy was
     * created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the policy was
     * last updated.
     * </p>
     * <p>
     * When a policy has only one version, this field contains the date and time when the policy was created. When a
     * policy has more than one version, this field contains the date and time when the most recent policy version was
     * created.
     * </p>
     */
    private java.util.Date updateDate;

    /**
     * <p>
     * The friendly name (not ARN) identifying the policy.
     * </p>
     * 
     * @param policyName
     *        The friendly name (not ARN) identifying the policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The friendly name (not ARN) identifying the policy.
     * </p>
     * 
     * @return The friendly name (not ARN) identifying the policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The friendly name (not ARN) identifying the policy.
     * </p>
     * 
     * @param policyName
     *        The friendly name (not ARN) identifying the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the policy.
     * </p>
     * <p>
     * For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param policyId
     *        The stable and unique string identifying the policy.</p>
     *        <p>
     *        For more information about IDs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The stable and unique string identifying the policy.
     * </p>
     * <p>
     * For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @return The stable and unique string identifying the policy.</p>
     *         <p>
     *         For more information about IDs, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The stable and unique string identifying the policy.
     * </p>
     * <p>
     * For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param policyId
     *        The stable and unique string identifying the policy.</p>
     *        <p>
     *        For more information about IDs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * @param arn
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * @return
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * @param arn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The path to the policy.
     * </p>
     * <p>
     * For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the policy.</p>
     *        <p>
     *        For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the policy.
     * </p>
     * <p>
     * For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @return The path to the policy.</p>
     *         <p>
     *         For more information about paths, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the policy.
     * </p>
     * <p>
     * For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the policy.</p>
     *        <p>
     *        For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The identifier for the version of the policy that is set as the default version.
     * </p>
     * 
     * @param defaultVersionId
     *        The identifier for the version of the policy that is set as the default version.
     */

    public void setDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }

    /**
     * <p>
     * The identifier for the version of the policy that is set as the default version.
     * </p>
     * 
     * @return The identifier for the version of the policy that is set as the default version.
     */

    public String getDefaultVersionId() {
        return this.defaultVersionId;
    }

    /**
     * <p>
     * The identifier for the version of the policy that is set as the default version.
     * </p>
     * 
     * @param defaultVersionId
     *        The identifier for the version of the policy that is set as the default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withDefaultVersionId(String defaultVersionId) {
        setDefaultVersionId(defaultVersionId);
        return this;
    }

    /**
     * <p>
     * The number of entities (users, groups, and roles) that the policy is attached to.
     * </p>
     * 
     * @param attachmentCount
     *        The number of entities (users, groups, and roles) that the policy is attached to.
     */

    public void setAttachmentCount(Integer attachmentCount) {
        this.attachmentCount = attachmentCount;
    }

    /**
     * <p>
     * The number of entities (users, groups, and roles) that the policy is attached to.
     * </p>
     * 
     * @return The number of entities (users, groups, and roles) that the policy is attached to.
     */

    public Integer getAttachmentCount() {
        return this.attachmentCount;
    }

    /**
     * <p>
     * The number of entities (users, groups, and roles) that the policy is attached to.
     * </p>
     * 
     * @param attachmentCount
     *        The number of entities (users, groups, and roles) that the policy is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withAttachmentCount(Integer attachmentCount) {
        setAttachmentCount(attachmentCount);
        return this;
    }

    /**
     * <p>
     * The number of entities (users and roles) for which the policy is used to set the permissions boundary.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html">Permissions Boundaries
     * for IAM Identities </a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param permissionsBoundaryUsageCount
     *        The number of entities (users and roles) for which the policy is used to set the permissions boundary.
     *        </p>
     *        <p>
     *        For more information about permissions boundaries, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html">Permissions
     *        Boundaries for IAM Identities </a> in the <i>IAM User Guide</i>.
     */

    public void setPermissionsBoundaryUsageCount(Integer permissionsBoundaryUsageCount) {
        this.permissionsBoundaryUsageCount = permissionsBoundaryUsageCount;
    }

    /**
     * <p>
     * The number of entities (users and roles) for which the policy is used to set the permissions boundary.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html">Permissions Boundaries
     * for IAM Identities </a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The number of entities (users and roles) for which the policy is used to set the permissions boundary.
     *         </p>
     *         <p>
     *         For more information about permissions boundaries, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html">Permissions
     *         Boundaries for IAM Identities </a> in the <i>IAM User Guide</i>.
     */

    public Integer getPermissionsBoundaryUsageCount() {
        return this.permissionsBoundaryUsageCount;
    }

    /**
     * <p>
     * The number of entities (users and roles) for which the policy is used to set the permissions boundary.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html">Permissions Boundaries
     * for IAM Identities </a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param permissionsBoundaryUsageCount
     *        The number of entities (users and roles) for which the policy is used to set the permissions boundary.
     *        </p>
     *        <p>
     *        For more information about permissions boundaries, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html">Permissions
     *        Boundaries for IAM Identities </a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withPermissionsBoundaryUsageCount(Integer permissionsBoundaryUsageCount) {
        setPermissionsBoundaryUsageCount(permissionsBoundaryUsageCount);
        return this;
    }

    /**
     * <p>
     * Specifies whether the policy can be attached to an IAM user, group, or role.
     * </p>
     * 
     * @param isAttachable
     *        Specifies whether the policy can be attached to an IAM user, group, or role.
     */

    public void setIsAttachable(Boolean isAttachable) {
        this.isAttachable = isAttachable;
    }

    /**
     * <p>
     * Specifies whether the policy can be attached to an IAM user, group, or role.
     * </p>
     * 
     * @return Specifies whether the policy can be attached to an IAM user, group, or role.
     */

    public Boolean getIsAttachable() {
        return this.isAttachable;
    }

    /**
     * <p>
     * Specifies whether the policy can be attached to an IAM user, group, or role.
     * </p>
     * 
     * @param isAttachable
     *        Specifies whether the policy can be attached to an IAM user, group, or role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withIsAttachable(Boolean isAttachable) {
        setIsAttachable(isAttachable);
        return this;
    }

    /**
     * <p>
     * Specifies whether the policy can be attached to an IAM user, group, or role.
     * </p>
     * 
     * @return Specifies whether the policy can be attached to an IAM user, group, or role.
     */

    public Boolean isAttachable() {
        return this.isAttachable;
    }

    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * This element is included in the response to the <a>GetPolicy</a> operation. It is not included in the response to
     * the <a>ListPolicies</a> operation.
     * </p>
     * 
     * @param description
     *        A friendly description of the policy.</p>
     *        <p>
     *        This element is included in the response to the <a>GetPolicy</a> operation. It is not included in the
     *        response to the <a>ListPolicies</a> operation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * This element is included in the response to the <a>GetPolicy</a> operation. It is not included in the response to
     * the <a>ListPolicies</a> operation.
     * </p>
     * 
     * @return A friendly description of the policy.</p>
     *         <p>
     *         This element is included in the response to the <a>GetPolicy</a> operation. It is not included in the
     *         response to the <a>ListPolicies</a> operation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * This element is included in the response to the <a>GetPolicy</a> operation. It is not included in the response to
     * the <a>ListPolicies</a> operation.
     * </p>
     * 
     * @param description
     *        A friendly description of the policy.</p>
     *        <p>
     *        This element is included in the response to the <a>GetPolicy</a> operation. It is not included in the
     *        response to the <a>ListPolicies</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the policy was
     * created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        policy was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the policy was
     * created.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         policy was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the policy was
     * created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        policy was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the policy was
     * last updated.
     * </p>
     * <p>
     * When a policy has only one version, this field contains the date and time when the policy was created. When a
     * policy has more than one version, this field contains the date and time when the most recent policy version was
     * created.
     * </p>
     * 
     * @param updateDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        policy was last updated.</p>
     *        <p>
     *        When a policy has only one version, this field contains the date and time when the policy was created.
     *        When a policy has more than one version, this field contains the date and time when the most recent policy
     *        version was created.
     */

    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the policy was
     * last updated.
     * </p>
     * <p>
     * When a policy has only one version, this field contains the date and time when the policy was created. When a
     * policy has more than one version, this field contains the date and time when the most recent policy version was
     * created.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         policy was last updated.</p>
     *         <p>
     *         When a policy has only one version, this field contains the date and time when the policy was created.
     *         When a policy has more than one version, this field contains the date and time when the most recent
     *         policy version was created.
     */

    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the policy was
     * last updated.
     * </p>
     * <p>
     * When a policy has only one version, this field contains the date and time when the policy was created. When a
     * policy has more than one version, this field contains the date and time when the most recent policy version was
     * created.
     * </p>
     * 
     * @param updateDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        policy was last updated.</p>
     *        <p>
     *        When a policy has only one version, this field contains the date and time when the policy was created.
     *        When a policy has more than one version, this field contains the date and time when the most recent policy
     *        version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withUpdateDate(java.util.Date updateDate) {
        setUpdateDate(updateDate);
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getDefaultVersionId() != null)
            sb.append("DefaultVersionId: ").append(getDefaultVersionId()).append(",");
        if (getAttachmentCount() != null)
            sb.append("AttachmentCount: ").append(getAttachmentCount()).append(",");
        if (getPermissionsBoundaryUsageCount() != null)
            sb.append("PermissionsBoundaryUsageCount: ").append(getPermissionsBoundaryUsageCount()).append(",");
        if (getIsAttachable() != null)
            sb.append("IsAttachable: ").append(getIsAttachable()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getUpdateDate() != null)
            sb.append("UpdateDate: ").append(getUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Policy == false)
            return false;
        Policy other = (Policy) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getDefaultVersionId() == null ^ this.getDefaultVersionId() == null)
            return false;
        if (other.getDefaultVersionId() != null && other.getDefaultVersionId().equals(this.getDefaultVersionId()) == false)
            return false;
        if (other.getAttachmentCount() == null ^ this.getAttachmentCount() == null)
            return false;
        if (other.getAttachmentCount() != null && other.getAttachmentCount().equals(this.getAttachmentCount()) == false)
            return false;
        if (other.getPermissionsBoundaryUsageCount() == null ^ this.getPermissionsBoundaryUsageCount() == null)
            return false;
        if (other.getPermissionsBoundaryUsageCount() != null
                && other.getPermissionsBoundaryUsageCount().equals(this.getPermissionsBoundaryUsageCount()) == false)
            return false;
        if (other.getIsAttachable() == null ^ this.getIsAttachable() == null)
            return false;
        if (other.getIsAttachable() != null && other.getIsAttachable().equals(this.getIsAttachable()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null)
            return false;
        if (other.getUpdateDate() != null && other.getUpdateDate().equals(this.getUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersionId() == null) ? 0 : getDefaultVersionId().hashCode());
        hashCode = prime * hashCode + ((getAttachmentCount() == null) ? 0 : getAttachmentCount().hashCode());
        hashCode = prime * hashCode + ((getPermissionsBoundaryUsageCount() == null) ? 0 : getPermissionsBoundaryUsageCount().hashCode());
        hashCode = prime * hashCode + ((getIsAttachable() == null) ? 0 : getIsAttachable().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public Policy clone() {
        try {
            return (Policy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
