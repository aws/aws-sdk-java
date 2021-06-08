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
 * Contains details about an IAM group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsIamGroupDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamGroupDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the managed policies that are attached to the IAM group.
     * </p>
     */
    private java.util.List<AwsIamAttachedManagedPolicy> attachedManagedPolicies;
    /**
     * <p>
     * Indicates when the IAM group was created.
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
     * The identifier of the IAM group.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The name of the IAM group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The list of inline policies that are embedded in the group.
     * </p>
     */
    private java.util.List<AwsIamGroupPolicy> groupPolicyList;
    /**
     * <p>
     * The path to the group.
     * </p>
     */
    private String path;

    /**
     * <p>
     * A list of the managed policies that are attached to the IAM group.
     * </p>
     * 
     * @return A list of the managed policies that are attached to the IAM group.
     */

    public java.util.List<AwsIamAttachedManagedPolicy> getAttachedManagedPolicies() {
        return attachedManagedPolicies;
    }

    /**
     * <p>
     * A list of the managed policies that are attached to the IAM group.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of the managed policies that are attached to the IAM group.
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
     * A list of the managed policies that are attached to the IAM group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachedManagedPolicies(java.util.Collection)} or
     * {@link #withAttachedManagedPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of the managed policies that are attached to the IAM group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamGroupDetails withAttachedManagedPolicies(AwsIamAttachedManagedPolicy... attachedManagedPolicies) {
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
     * A list of the managed policies that are attached to the IAM group.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of the managed policies that are attached to the IAM group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamGroupDetails withAttachedManagedPolicies(java.util.Collection<AwsIamAttachedManagedPolicy> attachedManagedPolicies) {
        setAttachedManagedPolicies(attachedManagedPolicies);
        return this;
    }

    /**
     * <p>
     * Indicates when the IAM group was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createDate
     *        Indicates when the IAM group was created.</p>
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
     * Indicates when the IAM group was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the IAM group was created.</p>
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
     * Indicates when the IAM group was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createDate
     *        Indicates when the IAM group was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamGroupDetails withCreateDate(String createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The identifier of the IAM group.
     * </p>
     * 
     * @param groupId
     *        The identifier of the IAM group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The identifier of the IAM group.
     * </p>
     * 
     * @return The identifier of the IAM group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The identifier of the IAM group.
     * </p>
     * 
     * @param groupId
     *        The identifier of the IAM group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamGroupDetails withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The name of the IAM group.
     * </p>
     * 
     * @param groupName
     *        The name of the IAM group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the IAM group.
     * </p>
     * 
     * @return The name of the IAM group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the IAM group.
     * </p>
     * 
     * @param groupName
     *        The name of the IAM group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamGroupDetails withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The list of inline policies that are embedded in the group.
     * </p>
     * 
     * @return The list of inline policies that are embedded in the group.
     */

    public java.util.List<AwsIamGroupPolicy> getGroupPolicyList() {
        return groupPolicyList;
    }

    /**
     * <p>
     * The list of inline policies that are embedded in the group.
     * </p>
     * 
     * @param groupPolicyList
     *        The list of inline policies that are embedded in the group.
     */

    public void setGroupPolicyList(java.util.Collection<AwsIamGroupPolicy> groupPolicyList) {
        if (groupPolicyList == null) {
            this.groupPolicyList = null;
            return;
        }

        this.groupPolicyList = new java.util.ArrayList<AwsIamGroupPolicy>(groupPolicyList);
    }

    /**
     * <p>
     * The list of inline policies that are embedded in the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupPolicyList(java.util.Collection)} or {@link #withGroupPolicyList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param groupPolicyList
     *        The list of inline policies that are embedded in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamGroupDetails withGroupPolicyList(AwsIamGroupPolicy... groupPolicyList) {
        if (this.groupPolicyList == null) {
            setGroupPolicyList(new java.util.ArrayList<AwsIamGroupPolicy>(groupPolicyList.length));
        }
        for (AwsIamGroupPolicy ele : groupPolicyList) {
            this.groupPolicyList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of inline policies that are embedded in the group.
     * </p>
     * 
     * @param groupPolicyList
     *        The list of inline policies that are embedded in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamGroupDetails withGroupPolicyList(java.util.Collection<AwsIamGroupPolicy> groupPolicyList) {
        setGroupPolicyList(groupPolicyList);
        return this;
    }

    /**
     * <p>
     * The path to the group.
     * </p>
     * 
     * @param path
     *        The path to the group.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the group.
     * </p>
     * 
     * @return The path to the group.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the group.
     * </p>
     * 
     * @param path
     *        The path to the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamGroupDetails withPath(String path) {
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
        if (getAttachedManagedPolicies() != null)
            sb.append("AttachedManagedPolicies: ").append(getAttachedManagedPolicies()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getGroupPolicyList() != null)
            sb.append("GroupPolicyList: ").append(getGroupPolicyList()).append(",");
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

        if (obj instanceof AwsIamGroupDetails == false)
            return false;
        AwsIamGroupDetails other = (AwsIamGroupDetails) obj;
        if (other.getAttachedManagedPolicies() == null ^ this.getAttachedManagedPolicies() == null)
            return false;
        if (other.getAttachedManagedPolicies() != null && other.getAttachedManagedPolicies().equals(this.getAttachedManagedPolicies()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroupPolicyList() == null ^ this.getGroupPolicyList() == null)
            return false;
        if (other.getGroupPolicyList() != null && other.getGroupPolicyList().equals(this.getGroupPolicyList()) == false)
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

        hashCode = prime * hashCode + ((getAttachedManagedPolicies() == null) ? 0 : getAttachedManagedPolicies().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroupPolicyList() == null) ? 0 : getGroupPolicyList().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public AwsIamGroupDetails clone() {
        try {
            return (AwsIamGroupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsIamGroupDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
