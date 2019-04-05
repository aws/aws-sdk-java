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
 * Contains information about an IAM group, including all of the group's policies.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GroupDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The path to the group. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The friendly name that identifies the group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The stable and unique string identifying the group. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     */
    private String groupId;

    private String arn;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the group was
     * created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * A list of the inline policies embedded in the group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PolicyDetail> groupPolicyList;
    /**
     * <p>
     * A list of the managed policies attached to the group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AttachedPolicy> attachedManagedPolicies;

    /**
     * <p>
     * The path to the group. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the group. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the group. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @return The path to the group. For more information about paths, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the group. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the group. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupDetail withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The friendly name that identifies the group.
     * </p>
     * 
     * @param groupName
     *        The friendly name that identifies the group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The friendly name that identifies the group.
     * </p>
     * 
     * @return The friendly name that identifies the group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The friendly name that identifies the group.
     * </p>
     * 
     * @param groupName
     *        The friendly name that identifies the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupDetail withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the group. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param groupId
     *        The stable and unique string identifying the group. For more information about IDs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The stable and unique string identifying the group. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @return The stable and unique string identifying the group. For more information about IDs, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The stable and unique string identifying the group. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param groupId
     *        The stable and unique string identifying the group. For more information about IDs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupDetail withGroupId(String groupId) {
        setGroupId(groupId);
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

    public GroupDetail withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the group was
     * created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        group was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the group was
     * created.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         group was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the group was
     * created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupDetail withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * A list of the inline policies embedded in the group.
     * </p>
     * 
     * @return A list of the inline policies embedded in the group.
     */

    public java.util.List<PolicyDetail> getGroupPolicyList() {
        if (groupPolicyList == null) {
            groupPolicyList = new com.amazonaws.internal.SdkInternalList<PolicyDetail>();
        }
        return groupPolicyList;
    }

    /**
     * <p>
     * A list of the inline policies embedded in the group.
     * </p>
     * 
     * @param groupPolicyList
     *        A list of the inline policies embedded in the group.
     */

    public void setGroupPolicyList(java.util.Collection<PolicyDetail> groupPolicyList) {
        if (groupPolicyList == null) {
            this.groupPolicyList = null;
            return;
        }

        this.groupPolicyList = new com.amazonaws.internal.SdkInternalList<PolicyDetail>(groupPolicyList);
    }

    /**
     * <p>
     * A list of the inline policies embedded in the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupPolicyList(java.util.Collection)} or {@link #withGroupPolicyList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param groupPolicyList
     *        A list of the inline policies embedded in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupDetail withGroupPolicyList(PolicyDetail... groupPolicyList) {
        if (this.groupPolicyList == null) {
            setGroupPolicyList(new com.amazonaws.internal.SdkInternalList<PolicyDetail>(groupPolicyList.length));
        }
        for (PolicyDetail ele : groupPolicyList) {
            this.groupPolicyList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the inline policies embedded in the group.
     * </p>
     * 
     * @param groupPolicyList
     *        A list of the inline policies embedded in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupDetail withGroupPolicyList(java.util.Collection<PolicyDetail> groupPolicyList) {
        setGroupPolicyList(groupPolicyList);
        return this;
    }

    /**
     * <p>
     * A list of the managed policies attached to the group.
     * </p>
     * 
     * @return A list of the managed policies attached to the group.
     */

    public java.util.List<AttachedPolicy> getAttachedManagedPolicies() {
        if (attachedManagedPolicies == null) {
            attachedManagedPolicies = new com.amazonaws.internal.SdkInternalList<AttachedPolicy>();
        }
        return attachedManagedPolicies;
    }

    /**
     * <p>
     * A list of the managed policies attached to the group.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of the managed policies attached to the group.
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
     * A list of the managed policies attached to the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachedManagedPolicies(java.util.Collection)} or
     * {@link #withAttachedManagedPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of the managed policies attached to the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupDetail withAttachedManagedPolicies(AttachedPolicy... attachedManagedPolicies) {
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
     * A list of the managed policies attached to the group.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of the managed policies attached to the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupDetail withAttachedManagedPolicies(java.util.Collection<AttachedPolicy> attachedManagedPolicies) {
        setAttachedManagedPolicies(attachedManagedPolicies);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getGroupPolicyList() != null)
            sb.append("GroupPolicyList: ").append(getGroupPolicyList()).append(",");
        if (getAttachedManagedPolicies() != null)
            sb.append("AttachedManagedPolicies: ").append(getAttachedManagedPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupDetail == false)
            return false;
        GroupDetail other = (GroupDetail) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getGroupPolicyList() == null ^ this.getGroupPolicyList() == null)
            return false;
        if (other.getGroupPolicyList() != null && other.getGroupPolicyList().equals(this.getGroupPolicyList()) == false)
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
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getGroupPolicyList() == null) ? 0 : getGroupPolicyList().hashCode());
        hashCode = prime * hashCode + ((getAttachedManagedPolicies() == null) ? 0 : getAttachedManagedPolicies().hashCode());
        return hashCode;
    }

    @Override
    public GroupDetail clone() {
        try {
            return (GroupDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
