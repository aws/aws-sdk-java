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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of users or sub groups that belong to a group. Users and groups are useful for filtering search results to
 * different users based on their group's access to documents.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GroupMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupMembers implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of sub groups that belong to a group. For example, the sub groups "Research", "Engineering", and
     * "Sales and Marketing" all belong to the group "Company".
     * </p>
     */
    private java.util.List<MemberGroup> memberGroups;
    /**
     * <p>
     * A list of users that belong to a group. For example, a list of interns all belong to the "Interns" group.
     * </p>
     */
    private java.util.List<MemberUser> memberUsers;
    /**
     * <p>
     * If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the S3
     * file that lists your users and sub groups for a group. Your sub groups can contain more than 1000 users, but the
     * list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * </p>
     */
    private S3Path s3PathforGroupMembers;

    /**
     * <p>
     * A list of sub groups that belong to a group. For example, the sub groups "Research", "Engineering", and
     * "Sales and Marketing" all belong to the group "Company".
     * </p>
     * 
     * @return A list of sub groups that belong to a group. For example, the sub groups "Research", "Engineering", and
     *         "Sales and Marketing" all belong to the group "Company".
     */

    public java.util.List<MemberGroup> getMemberGroups() {
        return memberGroups;
    }

    /**
     * <p>
     * A list of sub groups that belong to a group. For example, the sub groups "Research", "Engineering", and
     * "Sales and Marketing" all belong to the group "Company".
     * </p>
     * 
     * @param memberGroups
     *        A list of sub groups that belong to a group. For example, the sub groups "Research", "Engineering", and
     *        "Sales and Marketing" all belong to the group "Company".
     */

    public void setMemberGroups(java.util.Collection<MemberGroup> memberGroups) {
        if (memberGroups == null) {
            this.memberGroups = null;
            return;
        }

        this.memberGroups = new java.util.ArrayList<MemberGroup>(memberGroups);
    }

    /**
     * <p>
     * A list of sub groups that belong to a group. For example, the sub groups "Research", "Engineering", and
     * "Sales and Marketing" all belong to the group "Company".
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberGroups(java.util.Collection)} or {@link #withMemberGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param memberGroups
     *        A list of sub groups that belong to a group. For example, the sub groups "Research", "Engineering", and
     *        "Sales and Marketing" all belong to the group "Company".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupMembers withMemberGroups(MemberGroup... memberGroups) {
        if (this.memberGroups == null) {
            setMemberGroups(new java.util.ArrayList<MemberGroup>(memberGroups.length));
        }
        for (MemberGroup ele : memberGroups) {
            this.memberGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of sub groups that belong to a group. For example, the sub groups "Research", "Engineering", and
     * "Sales and Marketing" all belong to the group "Company".
     * </p>
     * 
     * @param memberGroups
     *        A list of sub groups that belong to a group. For example, the sub groups "Research", "Engineering", and
     *        "Sales and Marketing" all belong to the group "Company".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupMembers withMemberGroups(java.util.Collection<MemberGroup> memberGroups) {
        setMemberGroups(memberGroups);
        return this;
    }

    /**
     * <p>
     * A list of users that belong to a group. For example, a list of interns all belong to the "Interns" group.
     * </p>
     * 
     * @return A list of users that belong to a group. For example, a list of interns all belong to the "Interns" group.
     */

    public java.util.List<MemberUser> getMemberUsers() {
        return memberUsers;
    }

    /**
     * <p>
     * A list of users that belong to a group. For example, a list of interns all belong to the "Interns" group.
     * </p>
     * 
     * @param memberUsers
     *        A list of users that belong to a group. For example, a list of interns all belong to the "Interns" group.
     */

    public void setMemberUsers(java.util.Collection<MemberUser> memberUsers) {
        if (memberUsers == null) {
            this.memberUsers = null;
            return;
        }

        this.memberUsers = new java.util.ArrayList<MemberUser>(memberUsers);
    }

    /**
     * <p>
     * A list of users that belong to a group. For example, a list of interns all belong to the "Interns" group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberUsers(java.util.Collection)} or {@link #withMemberUsers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param memberUsers
     *        A list of users that belong to a group. For example, a list of interns all belong to the "Interns" group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupMembers withMemberUsers(MemberUser... memberUsers) {
        if (this.memberUsers == null) {
            setMemberUsers(new java.util.ArrayList<MemberUser>(memberUsers.length));
        }
        for (MemberUser ele : memberUsers) {
            this.memberUsers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of users that belong to a group. For example, a list of interns all belong to the "Interns" group.
     * </p>
     * 
     * @param memberUsers
     *        A list of users that belong to a group. For example, a list of interns all belong to the "Interns" group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupMembers withMemberUsers(java.util.Collection<MemberUser> memberUsers) {
        setMemberUsers(memberUsers);
        return this;
    }

    /**
     * <p>
     * If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the S3
     * file that lists your users and sub groups for a group. Your sub groups can contain more than 1000 users, but the
     * list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * </p>
     * 
     * @param s3PathforGroupMembers
     *        If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the
     *        S3 file that lists your users and sub groups for a group. Your sub groups can contain more than 1000
     *        users, but the list of sub groups that belong to a group (and/or users) must be no more than 1000.
     */

    public void setS3PathforGroupMembers(S3Path s3PathforGroupMembers) {
        this.s3PathforGroupMembers = s3PathforGroupMembers;
    }

    /**
     * <p>
     * If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the S3
     * file that lists your users and sub groups for a group. Your sub groups can contain more than 1000 users, but the
     * list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * </p>
     * 
     * @return If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to
     *         the S3 file that lists your users and sub groups for a group. Your sub groups can contain more than 1000
     *         users, but the list of sub groups that belong to a group (and/or users) must be no more than 1000.
     */

    public S3Path getS3PathforGroupMembers() {
        return this.s3PathforGroupMembers;
    }

    /**
     * <p>
     * If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the S3
     * file that lists your users and sub groups for a group. Your sub groups can contain more than 1000 users, but the
     * list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * </p>
     * 
     * @param s3PathforGroupMembers
     *        If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the
     *        S3 file that lists your users and sub groups for a group. Your sub groups can contain more than 1000
     *        users, but the list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupMembers withS3PathforGroupMembers(S3Path s3PathforGroupMembers) {
        setS3PathforGroupMembers(s3PathforGroupMembers);
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
        if (getMemberGroups() != null)
            sb.append("MemberGroups: ").append(getMemberGroups()).append(",");
        if (getMemberUsers() != null)
            sb.append("MemberUsers: ").append(getMemberUsers()).append(",");
        if (getS3PathforGroupMembers() != null)
            sb.append("S3PathforGroupMembers: ").append(getS3PathforGroupMembers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupMembers == false)
            return false;
        GroupMembers other = (GroupMembers) obj;
        if (other.getMemberGroups() == null ^ this.getMemberGroups() == null)
            return false;
        if (other.getMemberGroups() != null && other.getMemberGroups().equals(this.getMemberGroups()) == false)
            return false;
        if (other.getMemberUsers() == null ^ this.getMemberUsers() == null)
            return false;
        if (other.getMemberUsers() != null && other.getMemberUsers().equals(this.getMemberUsers()) == false)
            return false;
        if (other.getS3PathforGroupMembers() == null ^ this.getS3PathforGroupMembers() == null)
            return false;
        if (other.getS3PathforGroupMembers() != null && other.getS3PathforGroupMembers().equals(this.getS3PathforGroupMembers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberGroups() == null) ? 0 : getMemberGroups().hashCode());
        hashCode = prime * hashCode + ((getMemberUsers() == null) ? 0 : getMemberUsers().hashCode());
        hashCode = prime * hashCode + ((getS3PathforGroupMembers() == null) ? 0 : getS3PathforGroupMembers().hashCode());
        return hashCode;
    }

    @Override
    public GroupMembers clone() {
        try {
            return (GroupMembers) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.GroupMembersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
