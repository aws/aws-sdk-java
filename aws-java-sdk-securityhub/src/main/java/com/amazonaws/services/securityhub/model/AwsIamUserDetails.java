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
 * Information about an IAM user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsIamUserDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamUserDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the managed policies that are attached to the user.
     * </p>
     */
    private java.util.List<AwsIamAttachedManagedPolicy> attachedManagedPolicies;
    /**
     * <p>
     * Indicates when the user was created.
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
     * A list of IAM groups that the user belongs to.
     * </p>
     */
    private java.util.List<String> groupList;
    /**
     * <p>
     * The path to the user.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The permissions boundary for the user.
     * </p>
     */
    private AwsIamPermissionsBoundary permissionsBoundary;
    /**
     * <p>
     * The unique identifier for the user.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The name of the user.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The list of inline policies that are embedded in the user.
     * </p>
     */
    private java.util.List<AwsIamUserPolicy> userPolicyList;

    /**
     * <p>
     * A list of the managed policies that are attached to the user.
     * </p>
     * 
     * @return A list of the managed policies that are attached to the user.
     */

    public java.util.List<AwsIamAttachedManagedPolicy> getAttachedManagedPolicies() {
        return attachedManagedPolicies;
    }

    /**
     * <p>
     * A list of the managed policies that are attached to the user.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of the managed policies that are attached to the user.
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
     * A list of the managed policies that are attached to the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachedManagedPolicies(java.util.Collection)} or
     * {@link #withAttachedManagedPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of the managed policies that are attached to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamUserDetails withAttachedManagedPolicies(AwsIamAttachedManagedPolicy... attachedManagedPolicies) {
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
     * A list of the managed policies that are attached to the user.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of the managed policies that are attached to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamUserDetails withAttachedManagedPolicies(java.util.Collection<AwsIamAttachedManagedPolicy> attachedManagedPolicies) {
        setAttachedManagedPolicies(attachedManagedPolicies);
        return this;
    }

    /**
     * <p>
     * Indicates when the user was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createDate
     *        Indicates when the user was created.</p>
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
     * Indicates when the user was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the user was created.</p>
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
     * Indicates when the user was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createDate
     *        Indicates when the user was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamUserDetails withCreateDate(String createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * A list of IAM groups that the user belongs to.
     * </p>
     * 
     * @return A list of IAM groups that the user belongs to.
     */

    public java.util.List<String> getGroupList() {
        return groupList;
    }

    /**
     * <p>
     * A list of IAM groups that the user belongs to.
     * </p>
     * 
     * @param groupList
     *        A list of IAM groups that the user belongs to.
     */

    public void setGroupList(java.util.Collection<String> groupList) {
        if (groupList == null) {
            this.groupList = null;
            return;
        }

        this.groupList = new java.util.ArrayList<String>(groupList);
    }

    /**
     * <p>
     * A list of IAM groups that the user belongs to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupList(java.util.Collection)} or {@link #withGroupList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param groupList
     *        A list of IAM groups that the user belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamUserDetails withGroupList(String... groupList) {
        if (this.groupList == null) {
            setGroupList(new java.util.ArrayList<String>(groupList.length));
        }
        for (String ele : groupList) {
            this.groupList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IAM groups that the user belongs to.
     * </p>
     * 
     * @param groupList
     *        A list of IAM groups that the user belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamUserDetails withGroupList(java.util.Collection<String> groupList) {
        setGroupList(groupList);
        return this;
    }

    /**
     * <p>
     * The path to the user.
     * </p>
     * 
     * @param path
     *        The path to the user.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the user.
     * </p>
     * 
     * @return The path to the user.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the user.
     * </p>
     * 
     * @param path
     *        The path to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamUserDetails withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The permissions boundary for the user.
     * </p>
     * 
     * @param permissionsBoundary
     *        The permissions boundary for the user.
     */

    public void setPermissionsBoundary(AwsIamPermissionsBoundary permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
    }

    /**
     * <p>
     * The permissions boundary for the user.
     * </p>
     * 
     * @return The permissions boundary for the user.
     */

    public AwsIamPermissionsBoundary getPermissionsBoundary() {
        return this.permissionsBoundary;
    }

    /**
     * <p>
     * The permissions boundary for the user.
     * </p>
     * 
     * @param permissionsBoundary
     *        The permissions boundary for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamUserDetails withPermissionsBoundary(AwsIamPermissionsBoundary permissionsBoundary) {
        setPermissionsBoundary(permissionsBoundary);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the user.
     * </p>
     * 
     * @param userId
     *        The unique identifier for the user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The unique identifier for the user.
     * </p>
     * 
     * @return The unique identifier for the user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The unique identifier for the user.
     * </p>
     * 
     * @param userId
     *        The unique identifier for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamUserDetails withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param userName
     *        The name of the user.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @return The name of the user.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param userName
     *        The name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamUserDetails withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The list of inline policies that are embedded in the user.
     * </p>
     * 
     * @return The list of inline policies that are embedded in the user.
     */

    public java.util.List<AwsIamUserPolicy> getUserPolicyList() {
        return userPolicyList;
    }

    /**
     * <p>
     * The list of inline policies that are embedded in the user.
     * </p>
     * 
     * @param userPolicyList
     *        The list of inline policies that are embedded in the user.
     */

    public void setUserPolicyList(java.util.Collection<AwsIamUserPolicy> userPolicyList) {
        if (userPolicyList == null) {
            this.userPolicyList = null;
            return;
        }

        this.userPolicyList = new java.util.ArrayList<AwsIamUserPolicy>(userPolicyList);
    }

    /**
     * <p>
     * The list of inline policies that are embedded in the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserPolicyList(java.util.Collection)} or {@link #withUserPolicyList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userPolicyList
     *        The list of inline policies that are embedded in the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamUserDetails withUserPolicyList(AwsIamUserPolicy... userPolicyList) {
        if (this.userPolicyList == null) {
            setUserPolicyList(new java.util.ArrayList<AwsIamUserPolicy>(userPolicyList.length));
        }
        for (AwsIamUserPolicy ele : userPolicyList) {
            this.userPolicyList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of inline policies that are embedded in the user.
     * </p>
     * 
     * @param userPolicyList
     *        The list of inline policies that are embedded in the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamUserDetails withUserPolicyList(java.util.Collection<AwsIamUserPolicy> userPolicyList) {
        setUserPolicyList(userPolicyList);
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
        if (getGroupList() != null)
            sb.append("GroupList: ").append(getGroupList()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getPermissionsBoundary() != null)
            sb.append("PermissionsBoundary: ").append(getPermissionsBoundary()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getUserPolicyList() != null)
            sb.append("UserPolicyList: ").append(getUserPolicyList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsIamUserDetails == false)
            return false;
        AwsIamUserDetails other = (AwsIamUserDetails) obj;
        if (other.getAttachedManagedPolicies() == null ^ this.getAttachedManagedPolicies() == null)
            return false;
        if (other.getAttachedManagedPolicies() != null && other.getAttachedManagedPolicies().equals(this.getAttachedManagedPolicies()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getGroupList() == null ^ this.getGroupList() == null)
            return false;
        if (other.getGroupList() != null && other.getGroupList().equals(this.getGroupList()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPermissionsBoundary() == null ^ this.getPermissionsBoundary() == null)
            return false;
        if (other.getPermissionsBoundary() != null && other.getPermissionsBoundary().equals(this.getPermissionsBoundary()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getUserPolicyList() == null ^ this.getUserPolicyList() == null)
            return false;
        if (other.getUserPolicyList() != null && other.getUserPolicyList().equals(this.getUserPolicyList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachedManagedPolicies() == null) ? 0 : getAttachedManagedPolicies().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getGroupList() == null) ? 0 : getGroupList().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPermissionsBoundary() == null) ? 0 : getPermissionsBoundary().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getUserPolicyList() == null) ? 0 : getUserPolicyList().hashCode());
        return hashCode;
    }

    @Override
    public AwsIamUserDetails clone() {
        try {
            return (AwsIamUserDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsIamUserDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
