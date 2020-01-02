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
 * The member details, such as email address, name, member ID, and member type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/Member" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Member implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The member ID (user ID or bot ID).
     * </p>
     */
    private String memberId;
    /**
     * <p>
     * The member type.
     * </p>
     */
    private String memberType;
    /**
     * <p>
     * The member email address.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The member name.
     * </p>
     */
    private String fullName;
    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The member ID (user ID or bot ID).
     * </p>
     * 
     * @param memberId
     *        The member ID (user ID or bot ID).
     */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The member ID (user ID or bot ID).
     * </p>
     * 
     * @return The member ID (user ID or bot ID).
     */

    public String getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * The member ID (user ID or bot ID).
     * </p>
     * 
     * @param memberId
     *        The member ID (user ID or bot ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withMemberId(String memberId) {
        setMemberId(memberId);
        return this;
    }

    /**
     * <p>
     * The member type.
     * </p>
     * 
     * @param memberType
     *        The member type.
     * @see MemberType
     */

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    /**
     * <p>
     * The member type.
     * </p>
     * 
     * @return The member type.
     * @see MemberType
     */

    public String getMemberType() {
        return this.memberType;
    }

    /**
     * <p>
     * The member type.
     * </p>
     * 
     * @param memberType
     *        The member type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberType
     */

    public Member withMemberType(String memberType) {
        setMemberType(memberType);
        return this;
    }

    /**
     * <p>
     * The member type.
     * </p>
     * 
     * @param memberType
     *        The member type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberType
     */

    public Member withMemberType(MemberType memberType) {
        this.memberType = memberType.toString();
        return this;
    }

    /**
     * <p>
     * The member email address.
     * </p>
     * 
     * @param email
     *        The member email address.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The member email address.
     * </p>
     * 
     * @return The member email address.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The member email address.
     * </p>
     * 
     * @param email
     *        The member email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The member name.
     * </p>
     * 
     * @param fullName
     *        The member name.
     */

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * <p>
     * The member name.
     * </p>
     * 
     * @return The member name.
     */

    public String getFullName() {
        return this.fullName;
    }

    /**
     * <p>
     * The member name.
     * </p>
     * 
     * @param fullName
     *        The member name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withFullName(String fullName) {
        setFullName(fullName);
        return this;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @return The Amazon Chime account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withAccountId(String accountId) {
        setAccountId(accountId);
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
        if (getMemberType() != null)
            sb.append("MemberType: ").append(getMemberType()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append("***Sensitive Data Redacted***").append(",");
        if (getFullName() != null)
            sb.append("FullName: ").append("***Sensitive Data Redacted***").append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Member == false)
            return false;
        Member other = (Member) obj;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getMemberType() == null ^ this.getMemberType() == null)
            return false;
        if (other.getMemberType() != null && other.getMemberType().equals(this.getMemberType()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getFullName() == null ^ this.getFullName() == null)
            return false;
        if (other.getFullName() != null && other.getFullName().equals(this.getFullName()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getMemberType() == null) ? 0 : getMemberType().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getFullName() == null) ? 0 : getFullName().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public Member clone() {
        try {
            return (Member) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.MemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
