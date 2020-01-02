/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Membership details, such as member ID and member role.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/MembershipItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MembershipItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The member ID.
     * </p>
     */
    private String memberId;
    /**
     * <p>
     * The member role.
     * </p>
     */
    private String role;

    /**
     * <p>
     * The member ID.
     * </p>
     * 
     * @param memberId
     *        The member ID.
     */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The member ID.
     * </p>
     * 
     * @return The member ID.
     */

    public String getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * The member ID.
     * </p>
     * 
     * @param memberId
     *        The member ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipItem withMemberId(String memberId) {
        setMemberId(memberId);
        return this;
    }

    /**
     * <p>
     * The member role.
     * </p>
     * 
     * @param role
     *        The member role.
     * @see RoomMembershipRole
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The member role.
     * </p>
     * 
     * @return The member role.
     * @see RoomMembershipRole
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The member role.
     * </p>
     * 
     * @param role
     *        The member role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoomMembershipRole
     */

    public MembershipItem withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The member role.
     * </p>
     * 
     * @param role
     *        The member role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoomMembershipRole
     */

    public MembershipItem withRole(RoomMembershipRole role) {
        this.role = role.toString();
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
        if (getMemberId() != null)
            sb.append("MemberId: ").append(getMemberId()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MembershipItem == false)
            return false;
        MembershipItem other = (MembershipItem) obj;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        return hashCode;
    }

    @Override
    public MembershipItem clone() {
        try {
            return (MembershipItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.MembershipItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
