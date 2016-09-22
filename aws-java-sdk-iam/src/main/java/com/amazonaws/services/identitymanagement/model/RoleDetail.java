/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains information about an IAM role, including all of the role's policies.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> action.
 * </p>
 */
public class RoleDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The stable and unique string identifying the role. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     */
    private String roleId;

    private String arn;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the role was
     * created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The trust policy that grants permission to assume the role.
     * </p>
     */
    private String assumeRolePolicyDocument;

    private com.amazonaws.internal.SdkInternalList<InstanceProfile> instanceProfileList;
    /**
     * <p>
     * A list of inline policies embedded in the role. These policies are the role's access (permissions) policies.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PolicyDetail> rolePolicyList;
    /**
     * <p>
     * A list of managed policies attached to the role. These policies are the role's access (permissions) policies.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AttachedPolicy> attachedManagedPolicies;

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the role. For more information about paths, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @return The path to the role. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the role. For more information about paths, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleDetail withPath(String path) {
        setPath(path);
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

    public RoleDetail withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the role. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param roleId
     *        The stable and unique string identifying the role. For more information about IDs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * <p>
     * The stable and unique string identifying the role. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @return The stable and unique string identifying the role. For more information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getRoleId() {
        return this.roleId;
    }

    /**
     * <p>
     * The stable and unique string identifying the role. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param roleId
     *        The stable and unique string identifying the role. For more information about IDs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleDetail withRoleId(String roleId) {
        setRoleId(roleId);
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

    public RoleDetail withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the role was
     * created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        role was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the role was
     * created.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         role was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the role was
     * created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        role was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleDetail withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

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

    public RoleDetail withAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        setAssumeRolePolicyDocument(assumeRolePolicyDocument);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<InstanceProfile> getInstanceProfileList() {
        if (instanceProfileList == null) {
            instanceProfileList = new com.amazonaws.internal.SdkInternalList<InstanceProfile>();
        }
        return instanceProfileList;
    }

    /**
     * @param instanceProfileList
     */

    public void setInstanceProfileList(java.util.Collection<InstanceProfile> instanceProfileList) {
        if (instanceProfileList == null) {
            this.instanceProfileList = null;
            return;
        }

        this.instanceProfileList = new com.amazonaws.internal.SdkInternalList<InstanceProfile>(instanceProfileList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceProfileList(java.util.Collection)} or {@link #withInstanceProfileList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param instanceProfileList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleDetail withInstanceProfileList(InstanceProfile... instanceProfileList) {
        if (this.instanceProfileList == null) {
            setInstanceProfileList(new com.amazonaws.internal.SdkInternalList<InstanceProfile>(instanceProfileList.length));
        }
        for (InstanceProfile ele : instanceProfileList) {
            this.instanceProfileList.add(ele);
        }
        return this;
    }

    /**
     * @param instanceProfileList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleDetail withInstanceProfileList(java.util.Collection<InstanceProfile> instanceProfileList) {
        setInstanceProfileList(instanceProfileList);
        return this;
    }

    /**
     * <p>
     * A list of inline policies embedded in the role. These policies are the role's access (permissions) policies.
     * </p>
     * 
     * @return A list of inline policies embedded in the role. These policies are the role's access (permissions)
     *         policies.
     */

    public java.util.List<PolicyDetail> getRolePolicyList() {
        if (rolePolicyList == null) {
            rolePolicyList = new com.amazonaws.internal.SdkInternalList<PolicyDetail>();
        }
        return rolePolicyList;
    }

    /**
     * <p>
     * A list of inline policies embedded in the role. These policies are the role's access (permissions) policies.
     * </p>
     * 
     * @param rolePolicyList
     *        A list of inline policies embedded in the role. These policies are the role's access (permissions)
     *        policies.
     */

    public void setRolePolicyList(java.util.Collection<PolicyDetail> rolePolicyList) {
        if (rolePolicyList == null) {
            this.rolePolicyList = null;
            return;
        }

        this.rolePolicyList = new com.amazonaws.internal.SdkInternalList<PolicyDetail>(rolePolicyList);
    }

    /**
     * <p>
     * A list of inline policies embedded in the role. These policies are the role's access (permissions) policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRolePolicyList(java.util.Collection)} or {@link #withRolePolicyList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param rolePolicyList
     *        A list of inline policies embedded in the role. These policies are the role's access (permissions)
     *        policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleDetail withRolePolicyList(PolicyDetail... rolePolicyList) {
        if (this.rolePolicyList == null) {
            setRolePolicyList(new com.amazonaws.internal.SdkInternalList<PolicyDetail>(rolePolicyList.length));
        }
        for (PolicyDetail ele : rolePolicyList) {
            this.rolePolicyList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of inline policies embedded in the role. These policies are the role's access (permissions) policies.
     * </p>
     * 
     * @param rolePolicyList
     *        A list of inline policies embedded in the role. These policies are the role's access (permissions)
     *        policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleDetail withRolePolicyList(java.util.Collection<PolicyDetail> rolePolicyList) {
        setRolePolicyList(rolePolicyList);
        return this;
    }

    /**
     * <p>
     * A list of managed policies attached to the role. These policies are the role's access (permissions) policies.
     * </p>
     * 
     * @return A list of managed policies attached to the role. These policies are the role's access (permissions)
     *         policies.
     */

    public java.util.List<AttachedPolicy> getAttachedManagedPolicies() {
        if (attachedManagedPolicies == null) {
            attachedManagedPolicies = new com.amazonaws.internal.SdkInternalList<AttachedPolicy>();
        }
        return attachedManagedPolicies;
    }

    /**
     * <p>
     * A list of managed policies attached to the role. These policies are the role's access (permissions) policies.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of managed policies attached to the role. These policies are the role's access (permissions)
     *        policies.
     */

    public void setAttachedManagedPolicies(java.util.Collection<AttachedPolicy> attachedManagedPolicies) {
        if (attachedManagedPolicies == null) {
            this.attachedManagedPolicies = null;
            return;
        }

        this.attachedManagedPolicies = new com.amazonaws.internal.SdkInternalList<AttachedPolicy>(attachedManagedPolicies);
    }

    /**
     * <p>
     * A list of managed policies attached to the role. These policies are the role's access (permissions) policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachedManagedPolicies(java.util.Collection)} or
     * {@link #withAttachedManagedPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of managed policies attached to the role. These policies are the role's access (permissions)
     *        policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleDetail withAttachedManagedPolicies(AttachedPolicy... attachedManagedPolicies) {
        if (this.attachedManagedPolicies == null) {
            setAttachedManagedPolicies(new com.amazonaws.internal.SdkInternalList<AttachedPolicy>(attachedManagedPolicies.length));
        }
        for (AttachedPolicy ele : attachedManagedPolicies) {
            this.attachedManagedPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of managed policies attached to the role. These policies are the role's access (permissions) policies.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of managed policies attached to the role. These policies are the role's access (permissions)
     *        policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleDetail withAttachedManagedPolicies(java.util.Collection<AttachedPolicy> attachedManagedPolicies) {
        setAttachedManagedPolicies(attachedManagedPolicies);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getRoleId() != null)
            sb.append("RoleId: " + getRoleId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getAssumeRolePolicyDocument() != null)
            sb.append("AssumeRolePolicyDocument: " + getAssumeRolePolicyDocument() + ",");
        if (getInstanceProfileList() != null)
            sb.append("InstanceProfileList: " + getInstanceProfileList() + ",");
        if (getRolePolicyList() != null)
            sb.append("RolePolicyList: " + getRolePolicyList() + ",");
        if (getAttachedManagedPolicies() != null)
            sb.append("AttachedManagedPolicies: " + getAttachedManagedPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoleDetail == false)
            return false;
        RoleDetail other = (RoleDetail) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getRoleId() == null ^ this.getRoleId() == null)
            return false;
        if (other.getRoleId() != null && other.getRoleId().equals(this.getRoleId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getAssumeRolePolicyDocument() == null ^ this.getAssumeRolePolicyDocument() == null)
            return false;
        if (other.getAssumeRolePolicyDocument() != null && other.getAssumeRolePolicyDocument().equals(this.getAssumeRolePolicyDocument()) == false)
            return false;
        if (other.getInstanceProfileList() == null ^ this.getInstanceProfileList() == null)
            return false;
        if (other.getInstanceProfileList() != null && other.getInstanceProfileList().equals(this.getInstanceProfileList()) == false)
            return false;
        if (other.getRolePolicyList() == null ^ this.getRolePolicyList() == null)
            return false;
        if (other.getRolePolicyList() != null && other.getRolePolicyList().equals(this.getRolePolicyList()) == false)
            return false;
        if (other.getAttachedManagedPolicies() == null ^ this.getAttachedManagedPolicies() == null)
            return false;
        if (other.getAttachedManagedPolicies() != null && other.getAttachedManagedPolicies().equals(this.getAttachedManagedPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getAssumeRolePolicyDocument() == null) ? 0 : getAssumeRolePolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileList() == null) ? 0 : getInstanceProfileList().hashCode());
        hashCode = prime * hashCode + ((getRolePolicyList() == null) ? 0 : getRolePolicyList().hashCode());
        hashCode = prime * hashCode + ((getAttachedManagedPolicies() == null) ? 0 : getAttachedManagedPolicies().hashCode());
        return hashCode;
    }

    @Override
    public RoleDetail clone() {
        try {
            return (RoleDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
