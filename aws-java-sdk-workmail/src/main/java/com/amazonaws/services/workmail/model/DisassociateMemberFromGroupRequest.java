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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DisassociateMemberFromGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateMemberFromGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the organization under which the group exists.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The identifier for the group from which members are removed.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The identifier for the member to be removed to the group.
     * </p>
     */
    private String memberId;

    /**
     * <p>
     * The identifier for the organization under which the group exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization under which the group exists.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the group exists.
     * </p>
     * 
     * @return The identifier for the organization under which the group exists.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the group exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization under which the group exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateMemberFromGroupRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The identifier for the group from which members are removed.
     * </p>
     * 
     * @param groupId
     *        The identifier for the group from which members are removed.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The identifier for the group from which members are removed.
     * </p>
     * 
     * @return The identifier for the group from which members are removed.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The identifier for the group from which members are removed.
     * </p>
     * 
     * @param groupId
     *        The identifier for the group from which members are removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateMemberFromGroupRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The identifier for the member to be removed to the group.
     * </p>
     * 
     * @param memberId
     *        The identifier for the member to be removed to the group.
     */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The identifier for the member to be removed to the group.
     * </p>
     * 
     * @return The identifier for the member to be removed to the group.
     */

    public String getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * The identifier for the member to be removed to the group.
     * </p>
     * 
     * @param memberId
     *        The identifier for the member to be removed to the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateMemberFromGroupRequest withMemberId(String memberId) {
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
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

        if (obj instanceof DisassociateMemberFromGroupRequest == false)
            return false;
        DisassociateMemberFromGroupRequest other = (DisassociateMemberFromGroupRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateMemberFromGroupRequest clone() {
        return (DisassociateMemberFromGroupRequest) super.clone();
    }

}
