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
 * Contains information about an IAM role, including all of the role's policies.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/RoleDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoleDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
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
    /**
     * <p>
     * A list of instance profiles that contain this role.
     * </p>
     */
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
     * The ARN of the policy used to set the permissions boundary for the role.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a
     * href="IAM/latest/UserGuide/access_policies_boundaries.html">Permissions Boundaries for IAM Identities </a> in the
     * <i>IAM User Guide</i>.
     * </p>
     */
    private AttachedPermissionsBoundary permissionsBoundary;
    /**
     * <p>
     * A list of tags that are attached to the specified role. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the role. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @return The path to the role. For more information about paths, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the role. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param roleId
     *        The stable and unique string identifying the role. For more information about IDs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * <p>
     * The stable and unique string identifying the role. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @return The stable and unique string identifying the role. For more information about IDs, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getRoleId() {
        return this.roleId;
    }

    /**
     * <p>
     * The stable and unique string identifying the role. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param roleId
     *        The stable and unique string identifying the role. For more information about IDs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
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
     * <p>
     * A list of instance profiles that contain this role.
     * </p>
     * 
     * @return A list of instance profiles that contain this role.
     */

    public java.util.List<InstanceProfile> getInstanceProfileList() {
        if (instanceProfileList == null) {
            instanceProfileList = new com.amazonaws.internal.SdkInternalList<InstanceProfile>();
        }
        return instanceProfileList;
    }

    /**
     * <p>
     * A list of instance profiles that contain this role.
     * </p>
     * 
     * @param instanceProfileList
     *        A list of instance profiles that contain this role.
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
     * A list of instance profiles that contain this role.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceProfileList(java.util.Collection)} or {@link #withInstanceProfileList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param instanceProfileList
     *        A list of instance profiles that contain this role.
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
     * <p>
     * A list of instance profiles that contain this role.
     * </p>
     * 
     * @param instanceProfileList
     *        A list of instance profiles that contain this role.
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
     * <p>
     * The ARN of the policy used to set the permissions boundary for the role.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a
     * href="IAM/latest/UserGuide/access_policies_boundaries.html">Permissions Boundaries for IAM Identities </a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * 
     * @param permissionsBoundary
     *        The ARN of the policy used to set the permissions boundary for the role.</p>
     *        <p>
     *        For more information about permissions boundaries, see <a
     *        href="IAM/latest/UserGuide/access_policies_boundaries.html">Permissions Boundaries for IAM Identities </a>
     *        in the <i>IAM User Guide</i>.
     */

    public void setPermissionsBoundary(AttachedPermissionsBoundary permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the role.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a
     * href="IAM/latest/UserGuide/access_policies_boundaries.html">Permissions Boundaries for IAM Identities </a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The ARN of the policy used to set the permissions boundary for the role.</p>
     *         <p>
     *         For more information about permissions boundaries, see <a
     *         href="IAM/latest/UserGuide/access_policies_boundaries.html">Permissions Boundaries for IAM Identities
     *         </a> in the <i>IAM User Guide</i>.
     */

    public AttachedPermissionsBoundary getPermissionsBoundary() {
        return this.permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the role.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a
     * href="IAM/latest/UserGuide/access_policies_boundaries.html">Permissions Boundaries for IAM Identities </a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * 
     * @param permissionsBoundary
     *        The ARN of the policy used to set the permissions boundary for the role.</p>
     *        <p>
     *        For more information about permissions boundaries, see <a
     *        href="IAM/latest/UserGuide/access_policies_boundaries.html">Permissions Boundaries for IAM Identities </a>
     *        in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleDetail withPermissionsBoundary(AttachedPermissionsBoundary permissionsBoundary) {
        setPermissionsBoundary(permissionsBoundary);
        return this;
    }

    /**
     * <p>
     * A list of tags that are attached to the specified role. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * 
     * @return A list of tags that are attached to the specified role. For more information about tagging, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the
     *         <i>IAM User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags that are attached to the specified role. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of tags that are attached to the specified role. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the
     *        <i>IAM User Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags that are attached to the specified role. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags that are attached to the specified role. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the
     *        <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleDetail withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags that are attached to the specified role. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of tags that are attached to the specified role. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the
     *        <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleDetail withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getRoleId() != null)
            sb.append("RoleId: ").append(getRoleId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getAssumeRolePolicyDocument() != null)
            sb.append("AssumeRolePolicyDocument: ").append(getAssumeRolePolicyDocument()).append(",");
        if (getInstanceProfileList() != null)
            sb.append("InstanceProfileList: ").append(getInstanceProfileList()).append(",");
        if (getRolePolicyList() != null)
            sb.append("RolePolicyList: ").append(getRolePolicyList()).append(",");
        if (getAttachedManagedPolicies() != null)
            sb.append("AttachedManagedPolicies: ").append(getAttachedManagedPolicies()).append(",");
        if (getPermissionsBoundary() != null)
            sb.append("PermissionsBoundary: ").append(getPermissionsBoundary()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
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
        if (other.getPermissionsBoundary() == null ^ this.getPermissionsBoundary() == null)
            return false;
        if (other.getPermissionsBoundary() != null && other.getPermissionsBoundary().equals(this.getPermissionsBoundary()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getPermissionsBoundary() == null) ? 0 : getPermissionsBoundary().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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
