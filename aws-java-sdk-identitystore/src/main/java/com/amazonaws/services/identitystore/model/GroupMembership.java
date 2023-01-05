/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitystore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the identifiers for a group, a group member, and a <code>GroupMembership</code> object in the identity
 * store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/GroupMembership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupMembership implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     */
    private String identityStoreId;
    /**
     * <p>
     * The identifier for a <code>GroupMembership</code> object in an identity store.
     * </p>
     */
    private String membershipId;
    /**
     * <p>
     * The identifier for a group in the identity store.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * An object that contains the identifier of a group member. Setting the <code>UserID</code> field to the specific
     * identifier for a user indicates that the user is a member of the group.
     * </p>
     */
    private MemberId memberId;

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @param identityStoreId
     *        The globally unique identifier for the identity store.
     */

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @return The globally unique identifier for the identity store.
     */

    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @param identityStoreId
     *        The globally unique identifier for the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupMembership withIdentityStoreId(String identityStoreId) {
        setIdentityStoreId(identityStoreId);
        return this;
    }

    /**
     * <p>
     * The identifier for a <code>GroupMembership</code> object in an identity store.
     * </p>
     * 
     * @param membershipId
     *        The identifier for a <code>GroupMembership</code> object in an identity store.
     */

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    /**
     * <p>
     * The identifier for a <code>GroupMembership</code> object in an identity store.
     * </p>
     * 
     * @return The identifier for a <code>GroupMembership</code> object in an identity store.
     */

    public String getMembershipId() {
        return this.membershipId;
    }

    /**
     * <p>
     * The identifier for a <code>GroupMembership</code> object in an identity store.
     * </p>
     * 
     * @param membershipId
     *        The identifier for a <code>GroupMembership</code> object in an identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupMembership withMembershipId(String membershipId) {
        setMembershipId(membershipId);
        return this;
    }

    /**
     * <p>
     * The identifier for a group in the identity store.
     * </p>
     * 
     * @param groupId
     *        The identifier for a group in the identity store.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The identifier for a group in the identity store.
     * </p>
     * 
     * @return The identifier for a group in the identity store.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The identifier for a group in the identity store.
     * </p>
     * 
     * @param groupId
     *        The identifier for a group in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupMembership withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * An object that contains the identifier of a group member. Setting the <code>UserID</code> field to the specific
     * identifier for a user indicates that the user is a member of the group.
     * </p>
     * 
     * @param memberId
     *        An object that contains the identifier of a group member. Setting the <code>UserID</code> field to the
     *        specific identifier for a user indicates that the user is a member of the group.
     */

    public void setMemberId(MemberId memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * An object that contains the identifier of a group member. Setting the <code>UserID</code> field to the specific
     * identifier for a user indicates that the user is a member of the group.
     * </p>
     * 
     * @return An object that contains the identifier of a group member. Setting the <code>UserID</code> field to the
     *         specific identifier for a user indicates that the user is a member of the group.
     */

    public MemberId getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * An object that contains the identifier of a group member. Setting the <code>UserID</code> field to the specific
     * identifier for a user indicates that the user is a member of the group.
     * </p>
     * 
     * @param memberId
     *        An object that contains the identifier of a group member. Setting the <code>UserID</code> field to the
     *        specific identifier for a user indicates that the user is a member of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupMembership withMemberId(MemberId memberId) {
        setMemberId(memberId);
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
        if (getIdentityStoreId() != null)
            sb.append("IdentityStoreId: ").append(getIdentityStoreId()).append(",");
        if (getMembershipId() != null)
            sb.append("MembershipId: ").append(getMembershipId()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getMemberId() != null)
            sb.append("MemberId: ").append(getMemberId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupMembership == false)
            return false;
        GroupMembership other = (GroupMembership) obj;
        if (other.getIdentityStoreId() == null ^ this.getIdentityStoreId() == null)
            return false;
        if (other.getIdentityStoreId() != null && other.getIdentityStoreId().equals(this.getIdentityStoreId()) == false)
            return false;
        if (other.getMembershipId() == null ^ this.getMembershipId() == null)
            return false;
        if (other.getMembershipId() != null && other.getMembershipId().equals(this.getMembershipId()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityStoreId() == null) ? 0 : getIdentityStoreId().hashCode());
        hashCode = prime * hashCode + ((getMembershipId() == null) ? 0 : getMembershipId().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        return hashCode;
    }

    @Override
    public GroupMembership clone() {
        try {
            return (GroupMembership) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.identitystore.model.transform.GroupMembershipMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
