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
 * Contains information about an IAM role, including all of the role's policies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsIamRoleDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamRoleDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The trust policy that grants permission to assume the role.
     * </p>
     */
    private String assumeRolePolicyDocument;
    /**
     * <p>
     * The list of the managed policies that are attached to the role.
     * </p>
     */
    private java.util.List<AwsIamAttachedManagedPolicy> attachedManagedPolicies;
    /**
     * <p>
     * Indicates when the role was created.
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
     * The list of instance profiles that contain this role.
     * </p>
     */
    private java.util.List<AwsIamInstanceProfile> instanceProfileList;

    private AwsIamPermissionsBoundary permissionsBoundary;
    /**
     * <p>
     * The stable and unique string identifying the role.
     * </p>
     */
    private String roleId;
    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The list of inline policies that are embedded in the role.
     * </p>
     */
    private java.util.List<AwsIamRolePolicy> rolePolicyList;
    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the specified role.
     * </p>
     */
    private Integer maxSessionDuration;
    /**
     * <p>
     * The path to the role.
     * </p>
     */
    private String path;

    /**
     * <p>
     * The trust policy that grants permission to assume the role.
     * </p>
     * 
     * @param assumeRolePolicyDocument
     *        The trust policy that grants permission to assume the role.
     */

    public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The trust policy that grants permission to assume the role.
     * </p>
     * 
     * @return The trust policy that grants permission to assume the role.
     */

    public String getAssumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The trust policy that grants permission to assume the role.
     * </p>
     * 
     * @param assumeRolePolicyDocument
     *        The trust policy that grants permission to assume the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamRoleDetails withAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        setAssumeRolePolicyDocument(assumeRolePolicyDocument);
        return this;
    }

    /**
     * <p>
     * The list of the managed policies that are attached to the role.
     * </p>
     * 
     * @return The list of the managed policies that are attached to the role.
     */

    public java.util.List<AwsIamAttachedManagedPolicy> getAttachedManagedPolicies() {
        return attachedManagedPolicies;
    }

    /**
     * <p>
     * The list of the managed policies that are attached to the role.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        The list of the managed policies that are attached to the role.
     */

    public void setAttachedManagedPolicies(java.util.Collection<AwsIamAttachedManagedPolicy> attachedManagedPolicies) {
        if (attachedManagedPolicies == null) {
            this.attachedManagedPolicies = null;
            return;
        }

        this.attachedManagedPolicies = new java.util.ArrayList<AwsIamAttachedManagedPolicy>(attachedManagedPolicies);
    }

    /**
     * <p>
     * The list of the managed policies that are attached to the role.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachedManagedPolicies(java.util.Collection)} or
     * {@link #withAttachedManagedPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        The list of the managed policies that are attached to the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamRoleDetails withAttachedManagedPolicies(AwsIamAttachedManagedPolicy... attachedManagedPolicies) {
        if (this.attachedManagedPolicies == null) {
            setAttachedManagedPolicies(new java.util.ArrayList<AwsIamAttachedManagedPolicy>(attachedManagedPolicies.length));
        }
        for (AwsIamAttachedManagedPolicy ele : attachedManagedPolicies) {
            this.attachedManagedPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of the managed policies that are attached to the role.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        The list of the managed policies that are attached to the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamRoleDetails withAttachedManagedPolicies(java.util.Collection<AwsIamAttachedManagedPolicy> attachedManagedPolicies) {
        setAttachedManagedPolicies(attachedManagedPolicies);
        return this;
    }

    /**
     * <p>
     * Indicates when the role was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createDate
     *        Indicates when the role was created.</p>
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
     * Indicates when the role was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the role was created.</p>
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
     * Indicates when the role was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createDate
     *        Indicates when the role was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamRoleDetails withCreateDate(String createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The list of instance profiles that contain this role.
     * </p>
     * 
     * @return The list of instance profiles that contain this role.
     */

    public java.util.List<AwsIamInstanceProfile> getInstanceProfileList() {
        return instanceProfileList;
    }

    /**
     * <p>
     * The list of instance profiles that contain this role.
     * </p>
     * 
     * @param instanceProfileList
     *        The list of instance profiles that contain this role.
     */

    public void setInstanceProfileList(java.util.Collection<AwsIamInstanceProfile> instanceProfileList) {
        if (instanceProfileList == null) {
            this.instanceProfileList = null;
            return;
        }

        this.instanceProfileList = new java.util.ArrayList<AwsIamInstanceProfile>(instanceProfileList);
    }

    /**
     * <p>
     * The list of instance profiles that contain this role.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceProfileList(java.util.Collection)} or {@link #withInstanceProfileList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param instanceProfileList
     *        The list of instance profiles that contain this role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamRoleDetails withInstanceProfileList(AwsIamInstanceProfile... instanceProfileList) {
        if (this.instanceProfileList == null) {
            setInstanceProfileList(new java.util.ArrayList<AwsIamInstanceProfile>(instanceProfileList.length));
        }
        for (AwsIamInstanceProfile ele : instanceProfileList) {
            this.instanceProfileList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of instance profiles that contain this role.
     * </p>
     * 
     * @param instanceProfileList
     *        The list of instance profiles that contain this role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamRoleDetails withInstanceProfileList(java.util.Collection<AwsIamInstanceProfile> instanceProfileList) {
        setInstanceProfileList(instanceProfileList);
        return this;
    }

    /**
     * @param permissionsBoundary
     */

    public void setPermissionsBoundary(AwsIamPermissionsBoundary permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
    }

    /**
     * @return
     */

    public AwsIamPermissionsBoundary getPermissionsBoundary() {
        return this.permissionsBoundary;
    }

    /**
     * @param permissionsBoundary
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamRoleDetails withPermissionsBoundary(AwsIamPermissionsBoundary permissionsBoundary) {
        setPermissionsBoundary(permissionsBoundary);
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the role.
     * </p>
     * 
     * @param roleId
     *        The stable and unique string identifying the role.
     */

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * <p>
     * The stable and unique string identifying the role.
     * </p>
     * 
     * @return The stable and unique string identifying the role.
     */

    public String getRoleId() {
        return this.roleId;
    }

    /**
     * <p>
     * The stable and unique string identifying the role.
     * </p>
     * 
     * @param roleId
     *        The stable and unique string identifying the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamRoleDetails withRoleId(String roleId) {
        setRoleId(roleId);
        return this;
    }

    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     * 
     * @param roleName
     *        The friendly name that identifies the role.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     * 
     * @return The friendly name that identifies the role.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     * 
     * @param roleName
     *        The friendly name that identifies the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamRoleDetails withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The list of inline policies that are embedded in the role.
     * </p>
     * 
     * @return The list of inline policies that are embedded in the role.
     */

    public java.util.List<AwsIamRolePolicy> getRolePolicyList() {
        return rolePolicyList;
    }

    /**
     * <p>
     * The list of inline policies that are embedded in the role.
     * </p>
     * 
     * @param rolePolicyList
     *        The list of inline policies that are embedded in the role.
     */

    public void setRolePolicyList(java.util.Collection<AwsIamRolePolicy> rolePolicyList) {
        if (rolePolicyList == null) {
            this.rolePolicyList = null;
            return;
        }

        this.rolePolicyList = new java.util.ArrayList<AwsIamRolePolicy>(rolePolicyList);
    }

    /**
     * <p>
     * The list of inline policies that are embedded in the role.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRolePolicyList(java.util.Collection)} or {@link #withRolePolicyList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param rolePolicyList
     *        The list of inline policies that are embedded in the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamRoleDetails withRolePolicyList(AwsIamRolePolicy... rolePolicyList) {
        if (this.rolePolicyList == null) {
            setRolePolicyList(new java.util.ArrayList<AwsIamRolePolicy>(rolePolicyList.length));
        }
        for (AwsIamRolePolicy ele : rolePolicyList) {
            this.rolePolicyList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of inline policies that are embedded in the role.
     * </p>
     * 
     * @param rolePolicyList
     *        The list of inline policies that are embedded in the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamRoleDetails withRolePolicyList(java.util.Collection<AwsIamRolePolicy> rolePolicyList) {
        setRolePolicyList(rolePolicyList);
        return this;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the specified role.
     * </p>
     * 
     * @param maxSessionDuration
     *        The maximum session duration (in seconds) that you want to set for the specified role.
     */

    public void setMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the specified role.
     * </p>
     * 
     * @return The maximum session duration (in seconds) that you want to set for the specified role.
     */

    public Integer getMaxSessionDuration() {
        return this.maxSessionDuration;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the specified role.
     * </p>
     * 
     * @param maxSessionDuration
     *        The maximum session duration (in seconds) that you want to set for the specified role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamRoleDetails withMaxSessionDuration(Integer maxSessionDuration) {
        setMaxSessionDuration(maxSessionDuration);
        return this;
    }

    /**
     * <p>
     * The path to the role.
     * </p>
     * 
     * @param path
     *        The path to the role.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the role.
     * </p>
     * 
     * @return The path to the role.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the role.
     * </p>
     * 
     * @param path
     *        The path to the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamRoleDetails withPath(String path) {
        setPath(path);
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
        if (getAssumeRolePolicyDocument() != null)
            sb.append("AssumeRolePolicyDocument: ").append(getAssumeRolePolicyDocument()).append(",");
        if (getAttachedManagedPolicies() != null)
            sb.append("AttachedManagedPolicies: ").append(getAttachedManagedPolicies()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getInstanceProfileList() != null)
            sb.append("InstanceProfileList: ").append(getInstanceProfileList()).append(",");
        if (getPermissionsBoundary() != null)
            sb.append("PermissionsBoundary: ").append(getPermissionsBoundary()).append(",");
        if (getRoleId() != null)
            sb.append("RoleId: ").append(getRoleId()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getRolePolicyList() != null)
            sb.append("RolePolicyList: ").append(getRolePolicyList()).append(",");
        if (getMaxSessionDuration() != null)
            sb.append("MaxSessionDuration: ").append(getMaxSessionDuration()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsIamRoleDetails == false)
            return false;
        AwsIamRoleDetails other = (AwsIamRoleDetails) obj;
        if (other.getAssumeRolePolicyDocument() == null ^ this.getAssumeRolePolicyDocument() == null)
            return false;
        if (other.getAssumeRolePolicyDocument() != null && other.getAssumeRolePolicyDocument().equals(this.getAssumeRolePolicyDocument()) == false)
            return false;
        if (other.getAttachedManagedPolicies() == null ^ this.getAttachedManagedPolicies() == null)
            return false;
        if (other.getAttachedManagedPolicies() != null && other.getAttachedManagedPolicies().equals(this.getAttachedManagedPolicies()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getInstanceProfileList() == null ^ this.getInstanceProfileList() == null)
            return false;
        if (other.getInstanceProfileList() != null && other.getInstanceProfileList().equals(this.getInstanceProfileList()) == false)
            return false;
        if (other.getPermissionsBoundary() == null ^ this.getPermissionsBoundary() == null)
            return false;
        if (other.getPermissionsBoundary() != null && other.getPermissionsBoundary().equals(this.getPermissionsBoundary()) == false)
            return false;
        if (other.getRoleId() == null ^ this.getRoleId() == null)
            return false;
        if (other.getRoleId() != null && other.getRoleId().equals(this.getRoleId()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getRolePolicyList() == null ^ this.getRolePolicyList() == null)
            return false;
        if (other.getRolePolicyList() != null && other.getRolePolicyList().equals(this.getRolePolicyList()) == false)
            return false;
        if (other.getMaxSessionDuration() == null ^ this.getMaxSessionDuration() == null)
            return false;
        if (other.getMaxSessionDuration() != null && other.getMaxSessionDuration().equals(this.getMaxSessionDuration()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssumeRolePolicyDocument() == null) ? 0 : getAssumeRolePolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getAttachedManagedPolicies() == null) ? 0 : getAttachedManagedPolicies().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileList() == null) ? 0 : getInstanceProfileList().hashCode());
        hashCode = prime * hashCode + ((getPermissionsBoundary() == null) ? 0 : getPermissionsBoundary().hashCode());
        hashCode = prime * hashCode + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getRolePolicyList() == null) ? 0 : getRolePolicyList().hashCode());
        hashCode = prime * hashCode + ((getMaxSessionDuration() == null) ? 0 : getMaxSessionDuration().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public AwsIamRoleDetails clone() {
        try {
            return (AwsIamRoleDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsIamRoleDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
