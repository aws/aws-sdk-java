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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/IsMemberInGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IsMemberInGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     */
    private String identityStoreId;
    /**
     * <p>
     * An object containing the identifier of a group member.
     * </p>
     */
    private MemberId memberId;
    /**
     * <p>
     * A list of identifiers for groups in the identity store.
     * </p>
     */
    private java.util.List<String> groupIds;

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

    public IsMemberInGroupsRequest withIdentityStoreId(String identityStoreId) {
        setIdentityStoreId(identityStoreId);
        return this;
    }

    /**
     * <p>
     * An object containing the identifier of a group member.
     * </p>
     * 
     * @param memberId
     *        An object containing the identifier of a group member.
     */

    public void setMemberId(MemberId memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * An object containing the identifier of a group member.
     * </p>
     * 
     * @return An object containing the identifier of a group member.
     */

    public MemberId getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * An object containing the identifier of a group member.
     * </p>
     * 
     * @param memberId
     *        An object containing the identifier of a group member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsMemberInGroupsRequest withMemberId(MemberId memberId) {
        setMemberId(memberId);
        return this;
    }

    /**
     * <p>
     * A list of identifiers for groups in the identity store.
     * </p>
     * 
     * @return A list of identifiers for groups in the identity store.
     */

    public java.util.List<String> getGroupIds() {
        return groupIds;
    }

    /**
     * <p>
     * A list of identifiers for groups in the identity store.
     * </p>
     * 
     * @param groupIds
     *        A list of identifiers for groups in the identity store.
     */

    public void setGroupIds(java.util.Collection<String> groupIds) {
        if (groupIds == null) {
            this.groupIds = null;
            return;
        }

        this.groupIds = new java.util.ArrayList<String>(groupIds);
    }

    /**
     * <p>
     * A list of identifiers for groups in the identity store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupIds(java.util.Collection)} or {@link #withGroupIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param groupIds
     *        A list of identifiers for groups in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsMemberInGroupsRequest withGroupIds(String... groupIds) {
        if (this.groupIds == null) {
            setGroupIds(new java.util.ArrayList<String>(groupIds.length));
        }
        for (String ele : groupIds) {
            this.groupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of identifiers for groups in the identity store.
     * </p>
     * 
     * @param groupIds
     *        A list of identifiers for groups in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsMemberInGroupsRequest withGroupIds(java.util.Collection<String> groupIds) {
        setGroupIds(groupIds);
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
        if (getMemberId() != null)
            sb.append("MemberId: ").append(getMemberId()).append(",");
        if (getGroupIds() != null)
            sb.append("GroupIds: ").append(getGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IsMemberInGroupsRequest == false)
            return false;
        IsMemberInGroupsRequest other = (IsMemberInGroupsRequest) obj;
        if (other.getIdentityStoreId() == null ^ this.getIdentityStoreId() == null)
            return false;
        if (other.getIdentityStoreId() != null && other.getIdentityStoreId().equals(this.getIdentityStoreId()) == false)
            return false;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getGroupIds() == null ^ this.getGroupIds() == null)
            return false;
        if (other.getGroupIds() != null && other.getGroupIds().equals(this.getGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityStoreId() == null) ? 0 : getIdentityStoreId().hashCode());
        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getGroupIds() == null) ? 0 : getGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public IsMemberInGroupsRequest clone() {
        return (IsMemberInGroupsRequest) super.clone();
    }

}
