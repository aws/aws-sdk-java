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
 * Contains information about an IAM user, including all the user's policies and all the IAM groups the user is in.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> action.
 * </p>
 */
public class UserDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The path to the user. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The stable and unique string identifying the user. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     */
    private String userId;

    private String arn;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the user was
     * created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * A list of the inline policies embedded in the user.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PolicyDetail> userPolicyList;
    /**
     * <p>
     * A list of IAM groups that the user is in.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groupList;
    /**
     * <p>
     * A list of the managed policies attached to the user.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AttachedPolicy> attachedManagedPolicies;

    /**
     * <p>
     * The path to the user. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the user. For more information about paths, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the user. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @return The path to the user. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the user. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the user. For more information about paths, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDetail withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * 
     * @param userName
     *        The friendly name identifying the user.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * 
     * @return The friendly name identifying the user.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * 
     * @param userName
     *        The friendly name identifying the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDetail withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the user. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param userId
     *        The stable and unique string identifying the user. For more information about IDs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The stable and unique string identifying the user. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @return The stable and unique string identifying the user. For more information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The stable and unique string identifying the user. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param userId
     *        The stable and unique string identifying the user. For more information about IDs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDetail withUserId(String userId) {
        setUserId(userId);
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

    public UserDetail withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the user was
     * created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        user was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the user was
     * created.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         user was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the user was
     * created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        user was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDetail withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * A list of the inline policies embedded in the user.
     * </p>
     * 
     * @return A list of the inline policies embedded in the user.
     */

    public java.util.List<PolicyDetail> getUserPolicyList() {
        if (userPolicyList == null) {
            userPolicyList = new com.amazonaws.internal.SdkInternalList<PolicyDetail>();
        }
        return userPolicyList;
    }

    /**
     * <p>
     * A list of the inline policies embedded in the user.
     * </p>
     * 
     * @param userPolicyList
     *        A list of the inline policies embedded in the user.
     */

    public void setUserPolicyList(java.util.Collection<PolicyDetail> userPolicyList) {
        if (userPolicyList == null) {
            this.userPolicyList = null;
            return;
        }

        this.userPolicyList = new com.amazonaws.internal.SdkInternalList<PolicyDetail>(userPolicyList);
    }

    /**
     * <p>
     * A list of the inline policies embedded in the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserPolicyList(java.util.Collection)} or {@link #withUserPolicyList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userPolicyList
     *        A list of the inline policies embedded in the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDetail withUserPolicyList(PolicyDetail... userPolicyList) {
        if (this.userPolicyList == null) {
            setUserPolicyList(new com.amazonaws.internal.SdkInternalList<PolicyDetail>(userPolicyList.length));
        }
        for (PolicyDetail ele : userPolicyList) {
            this.userPolicyList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the inline policies embedded in the user.
     * </p>
     * 
     * @param userPolicyList
     *        A list of the inline policies embedded in the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDetail withUserPolicyList(java.util.Collection<PolicyDetail> userPolicyList) {
        setUserPolicyList(userPolicyList);
        return this;
    }

    /**
     * <p>
     * A list of IAM groups that the user is in.
     * </p>
     * 
     * @return A list of IAM groups that the user is in.
     */

    public java.util.List<String> getGroupList() {
        if (groupList == null) {
            groupList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groupList;
    }

    /**
     * <p>
     * A list of IAM groups that the user is in.
     * </p>
     * 
     * @param groupList
     *        A list of IAM groups that the user is in.
     */

    public void setGroupList(java.util.Collection<String> groupList) {
        if (groupList == null) {
            this.groupList = null;
            return;
        }

        this.groupList = new com.amazonaws.internal.SdkInternalList<String>(groupList);
    }

    /**
     * <p>
     * A list of IAM groups that the user is in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupList(java.util.Collection)} or {@link #withGroupList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param groupList
     *        A list of IAM groups that the user is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDetail withGroupList(String... groupList) {
        if (this.groupList == null) {
            setGroupList(new com.amazonaws.internal.SdkInternalList<String>(groupList.length));
        }
        for (String ele : groupList) {
            this.groupList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IAM groups that the user is in.
     * </p>
     * 
     * @param groupList
     *        A list of IAM groups that the user is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDetail withGroupList(java.util.Collection<String> groupList) {
        setGroupList(groupList);
        return this;
    }

    /**
     * <p>
     * A list of the managed policies attached to the user.
     * </p>
     * 
     * @return A list of the managed policies attached to the user.
     */

    public java.util.List<AttachedPolicy> getAttachedManagedPolicies() {
        if (attachedManagedPolicies == null) {
            attachedManagedPolicies = new com.amazonaws.internal.SdkInternalList<AttachedPolicy>();
        }
        return attachedManagedPolicies;
    }

    /**
     * <p>
     * A list of the managed policies attached to the user.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of the managed policies attached to the user.
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
     * A list of the managed policies attached to the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachedManagedPolicies(java.util.Collection)} or
     * {@link #withAttachedManagedPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of the managed policies attached to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDetail withAttachedManagedPolicies(AttachedPolicy... attachedManagedPolicies) {
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
     * A list of the managed policies attached to the user.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        A list of the managed policies attached to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDetail withAttachedManagedPolicies(java.util.Collection<AttachedPolicy> attachedManagedPolicies) {
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getUserPolicyList() != null)
            sb.append("UserPolicyList: " + getUserPolicyList() + ",");
        if (getGroupList() != null)
            sb.append("GroupList: " + getGroupList() + ",");
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

        if (obj instanceof UserDetail == false)
            return false;
        UserDetail other = (UserDetail) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getUserPolicyList() == null ^ this.getUserPolicyList() == null)
            return false;
        if (other.getUserPolicyList() != null && other.getUserPolicyList().equals(this.getUserPolicyList()) == false)
            return false;
        if (other.getGroupList() == null ^ this.getGroupList() == null)
            return false;
        if (other.getGroupList() != null && other.getGroupList().equals(this.getGroupList()) == false)
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
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getUserPolicyList() == null) ? 0 : getUserPolicyList().hashCode());
        hashCode = prime * hashCode + ((getGroupList() == null) ? 0 : getGroupList().hashCode());
        hashCode = prime * hashCode + ((getAttachedManagedPolicies() == null) ? 0 : getAttachedManagedPolicies().hashCode());
        return hashCode;
    }

    @Override
    public UserDetail clone() {
        try {
            return (UserDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
