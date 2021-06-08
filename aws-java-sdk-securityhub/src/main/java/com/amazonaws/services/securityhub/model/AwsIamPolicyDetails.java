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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an IAM permissions policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsIamPolicyDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamPolicyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of users, groups, and roles that the policy is attached to.
     * </p>
     */
    private Integer attachmentCount;
    /**
     * <p>
     * When the policy was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String createDate;
    /**
     * <p>
     * The identifier of the default version of the policy.
     * </p>
     */
    private String defaultVersionId;
    /**
     * <p>
     * A description of the policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Whether the policy can be attached to a user, group, or role.
     * </p>
     */
    private Boolean isAttachable;
    /**
     * <p>
     * The path to the policy.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The number of users and roles that use the policy to set the permissions boundary.
     * </p>
     */
    private Integer permissionsBoundaryUsageCount;
    /**
     * <p>
     * The unique identifier of the policy.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The name of the policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * List of versions of the policy.
     * </p>
     */
    private java.util.List<AwsIamPolicyVersion> policyVersionList;
    /**
     * <p>
     * When the policy was most recently updated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String updateDate;

    /**
     * <p>
     * The number of users, groups, and roles that the policy is attached to.
     * </p>
     * 
     * @param attachmentCount
     *        The number of users, groups, and roles that the policy is attached to.
     */

    public void setAttachmentCount(Integer attachmentCount) {
        this.attachmentCount = attachmentCount;
    }

    /**
     * <p>
     * The number of users, groups, and roles that the policy is attached to.
     * </p>
     * 
     * @return The number of users, groups, and roles that the policy is attached to.
     */

    public Integer getAttachmentCount() {
        return this.attachmentCount;
    }

    /**
     * <p>
     * The number of users, groups, and roles that the policy is attached to.
     * </p>
     * 
     * @param attachmentCount
     *        The number of users, groups, and roles that the policy is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPolicyDetails withAttachmentCount(Integer attachmentCount) {
        setAttachmentCount(attachmentCount);
        return this;
    }

    /**
     * <p>
     * When the policy was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createDate
     *        When the policy was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * When the policy was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return When the policy was created.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * When the policy was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createDate
     *        When the policy was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPolicyDetails withCreateDate(String createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The identifier of the default version of the policy.
     * </p>
     * 
     * @param defaultVersionId
     *        The identifier of the default version of the policy.
     */

    public void setDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }

    /**
     * <p>
     * The identifier of the default version of the policy.
     * </p>
     * 
     * @return The identifier of the default version of the policy.
     */

    public String getDefaultVersionId() {
        return this.defaultVersionId;
    }

    /**
     * <p>
     * The identifier of the default version of the policy.
     * </p>
     * 
     * @param defaultVersionId
     *        The identifier of the default version of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPolicyDetails withDefaultVersionId(String defaultVersionId) {
        setDefaultVersionId(defaultVersionId);
        return this;
    }

    /**
     * <p>
     * A description of the policy.
     * </p>
     * 
     * @param description
     *        A description of the policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the policy.
     * </p>
     * 
     * @return A description of the policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the policy.
     * </p>
     * 
     * @param description
     *        A description of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPolicyDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Whether the policy can be attached to a user, group, or role.
     * </p>
     * 
     * @param isAttachable
     *        Whether the policy can be attached to a user, group, or role.
     */

    public void setIsAttachable(Boolean isAttachable) {
        this.isAttachable = isAttachable;
    }

    /**
     * <p>
     * Whether the policy can be attached to a user, group, or role.
     * </p>
     * 
     * @return Whether the policy can be attached to a user, group, or role.
     */

    public Boolean getIsAttachable() {
        return this.isAttachable;
    }

    /**
     * <p>
     * Whether the policy can be attached to a user, group, or role.
     * </p>
     * 
     * @param isAttachable
     *        Whether the policy can be attached to a user, group, or role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPolicyDetails withIsAttachable(Boolean isAttachable) {
        setIsAttachable(isAttachable);
        return this;
    }

    /**
     * <p>
     * Whether the policy can be attached to a user, group, or role.
     * </p>
     * 
     * @return Whether the policy can be attached to a user, group, or role.
     */

    public Boolean isAttachable() {
        return this.isAttachable;
    }

    /**
     * <p>
     * The path to the policy.
     * </p>
     * 
     * @param path
     *        The path to the policy.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the policy.
     * </p>
     * 
     * @return The path to the policy.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the policy.
     * </p>
     * 
     * @param path
     *        The path to the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPolicyDetails withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The number of users and roles that use the policy to set the permissions boundary.
     * </p>
     * 
     * @param permissionsBoundaryUsageCount
     *        The number of users and roles that use the policy to set the permissions boundary.
     */

    public void setPermissionsBoundaryUsageCount(Integer permissionsBoundaryUsageCount) {
        this.permissionsBoundaryUsageCount = permissionsBoundaryUsageCount;
    }

    /**
     * <p>
     * The number of users and roles that use the policy to set the permissions boundary.
     * </p>
     * 
     * @return The number of users and roles that use the policy to set the permissions boundary.
     */

    public Integer getPermissionsBoundaryUsageCount() {
        return this.permissionsBoundaryUsageCount;
    }

    /**
     * <p>
     * The number of users and roles that use the policy to set the permissions boundary.
     * </p>
     * 
     * @param permissionsBoundaryUsageCount
     *        The number of users and roles that use the policy to set the permissions boundary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPolicyDetails withPermissionsBoundaryUsageCount(Integer permissionsBoundaryUsageCount) {
        setPermissionsBoundaryUsageCount(permissionsBoundaryUsageCount);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the policy.
     * </p>
     * 
     * @param policyId
     *        The unique identifier of the policy.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The unique identifier of the policy.
     * </p>
     * 
     * @return The unique identifier of the policy.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The unique identifier of the policy.
     * </p>
     * 
     * @param policyId
     *        The unique identifier of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPolicyDetails withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

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

    public AwsIamPolicyDetails withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * List of versions of the policy.
     * </p>
     * 
     * @return List of versions of the policy.
     */

    public java.util.List<AwsIamPolicyVersion> getPolicyVersionList() {
        return policyVersionList;
    }

    /**
     * <p>
     * List of versions of the policy.
     * </p>
     * 
     * @param policyVersionList
     *        List of versions of the policy.
     */

    public void setPolicyVersionList(java.util.Collection<AwsIamPolicyVersion> policyVersionList) {
        if (policyVersionList == null) {
            this.policyVersionList = null;
            return;
        }

        this.policyVersionList = new java.util.ArrayList<AwsIamPolicyVersion>(policyVersionList);
    }

    /**
     * <p>
     * List of versions of the policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyVersionList(java.util.Collection)} or {@link #withPolicyVersionList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param policyVersionList
     *        List of versions of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPolicyDetails withPolicyVersionList(AwsIamPolicyVersion... policyVersionList) {
        if (this.policyVersionList == null) {
            setPolicyVersionList(new java.util.ArrayList<AwsIamPolicyVersion>(policyVersionList.length));
        }
        for (AwsIamPolicyVersion ele : policyVersionList) {
            this.policyVersionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of versions of the policy.
     * </p>
     * 
     * @param policyVersionList
     *        List of versions of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPolicyDetails withPolicyVersionList(java.util.Collection<AwsIamPolicyVersion> policyVersionList) {
        setPolicyVersionList(policyVersionList);
        return this;
    }

    /**
     * <p>
     * When the policy was most recently updated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param updateDate
     *        When the policy was most recently updated.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * When the policy was most recently updated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return When the policy was most recently updated.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getUpdateDate() {
        return this.updateDate;
    }

    /**
     * <p>
     * When the policy was most recently updated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param updateDate
     *        When the policy was most recently updated.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPolicyDetails withUpdateDate(String updateDate) {
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
        if (getAttachmentCount() != null)
            sb.append("AttachmentCount: ").append(getAttachmentCount()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getDefaultVersionId() != null)
            sb.append("DefaultVersionId: ").append(getDefaultVersionId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIsAttachable() != null)
            sb.append("IsAttachable: ").append(getIsAttachable()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getPermissionsBoundaryUsageCount() != null)
            sb.append("PermissionsBoundaryUsageCount: ").append(getPermissionsBoundaryUsageCount()).append(",");
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyVersionList() != null)
            sb.append("PolicyVersionList: ").append(getPolicyVersionList()).append(",");
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

        if (obj instanceof AwsIamPolicyDetails == false)
            return false;
        AwsIamPolicyDetails other = (AwsIamPolicyDetails) obj;
        if (other.getAttachmentCount() == null ^ this.getAttachmentCount() == null)
            return false;
        if (other.getAttachmentCount() != null && other.getAttachmentCount().equals(this.getAttachmentCount()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getDefaultVersionId() == null ^ this.getDefaultVersionId() == null)
            return false;
        if (other.getDefaultVersionId() != null && other.getDefaultVersionId().equals(this.getDefaultVersionId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIsAttachable() == null ^ this.getIsAttachable() == null)
            return false;
        if (other.getIsAttachable() != null && other.getIsAttachable().equals(this.getIsAttachable()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPermissionsBoundaryUsageCount() == null ^ this.getPermissionsBoundaryUsageCount() == null)
            return false;
        if (other.getPermissionsBoundaryUsageCount() != null
                && other.getPermissionsBoundaryUsageCount().equals(this.getPermissionsBoundaryUsageCount()) == false)
            return false;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyVersionList() == null ^ this.getPolicyVersionList() == null)
            return false;
        if (other.getPolicyVersionList() != null && other.getPolicyVersionList().equals(this.getPolicyVersionList()) == false)
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

        hashCode = prime * hashCode + ((getAttachmentCount() == null) ? 0 : getAttachmentCount().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersionId() == null) ? 0 : getDefaultVersionId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIsAttachable() == null) ? 0 : getIsAttachable().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPermissionsBoundaryUsageCount() == null) ? 0 : getPermissionsBoundaryUsageCount().hashCode());
        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyVersionList() == null) ? 0 : getPolicyVersionList().hashCode());
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public AwsIamPolicyDetails clone() {
        try {
            return (AwsIamPolicyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsIamPolicyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
