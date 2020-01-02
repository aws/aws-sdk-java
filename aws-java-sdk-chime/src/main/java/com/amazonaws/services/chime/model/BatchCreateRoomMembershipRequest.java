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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchCreateRoomMembership" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateRoomMembershipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The room ID.
     * </p>
     */
    private String roomId;
    /**
     * <p>
     * The list of membership items.
     * </p>
     */
    private java.util.List<MembershipItem> membershipItemList;

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

    public BatchCreateRoomMembershipRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The room ID.
     * </p>
     * 
     * @param roomId
     *        The room ID.
     */

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    /**
     * <p>
     * The room ID.
     * </p>
     * 
     * @return The room ID.
     */

    public String getRoomId() {
        return this.roomId;
    }

    /**
     * <p>
     * The room ID.
     * </p>
     * 
     * @param roomId
     *        The room ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateRoomMembershipRequest withRoomId(String roomId) {
        setRoomId(roomId);
        return this;
    }

    /**
     * <p>
     * The list of membership items.
     * </p>
     * 
     * @return The list of membership items.
     */

    public java.util.List<MembershipItem> getMembershipItemList() {
        return membershipItemList;
    }

    /**
     * <p>
     * The list of membership items.
     * </p>
     * 
     * @param membershipItemList
     *        The list of membership items.
     */

    public void setMembershipItemList(java.util.Collection<MembershipItem> membershipItemList) {
        if (membershipItemList == null) {
            this.membershipItemList = null;
            return;
        }

        this.membershipItemList = new java.util.ArrayList<MembershipItem>(membershipItemList);
    }

    /**
     * <p>
     * The list of membership items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMembershipItemList(java.util.Collection)} or {@link #withMembershipItemList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param membershipItemList
     *        The list of membership items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateRoomMembershipRequest withMembershipItemList(MembershipItem... membershipItemList) {
        if (this.membershipItemList == null) {
            setMembershipItemList(new java.util.ArrayList<MembershipItem>(membershipItemList.length));
        }
        for (MembershipItem ele : membershipItemList) {
            this.membershipItemList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of membership items.
     * </p>
     * 
     * @param membershipItemList
     *        The list of membership items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateRoomMembershipRequest withMembershipItemList(java.util.Collection<MembershipItem> membershipItemList) {
        setMembershipItemList(membershipItemList);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getRoomId() != null)
            sb.append("RoomId: ").append(getRoomId()).append(",");
        if (getMembershipItemList() != null)
            sb.append("MembershipItemList: ").append(getMembershipItemList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateRoomMembershipRequest == false)
            return false;
        BatchCreateRoomMembershipRequest other = (BatchCreateRoomMembershipRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getRoomId() == null ^ this.getRoomId() == null)
            return false;
        if (other.getRoomId() != null && other.getRoomId().equals(this.getRoomId()) == false)
            return false;
        if (other.getMembershipItemList() == null ^ this.getMembershipItemList() == null)
            return false;
        if (other.getMembershipItemList() != null && other.getMembershipItemList().equals(this.getMembershipItemList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getRoomId() == null) ? 0 : getRoomId().hashCode());
        hashCode = prime * hashCode + ((getMembershipItemList() == null) ? 0 : getMembershipItemList().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateRoomMembershipRequest clone() {
        return (BatchCreateRoomMembershipRequest) super.clone();
    }

}
