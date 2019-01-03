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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListGroupMemberships" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupMembershipsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of the members of the group.
     * </p>
     */
    private java.util.List<GroupMember> groupMemberList;
    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The http status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The list of the members of the group.
     * </p>
     * 
     * @return The list of the members of the group.
     */

    public java.util.List<GroupMember> getGroupMemberList() {
        return groupMemberList;
    }

    /**
     * <p>
     * The list of the members of the group.
     * </p>
     * 
     * @param groupMemberList
     *        The list of the members of the group.
     */

    public void setGroupMemberList(java.util.Collection<GroupMember> groupMemberList) {
        if (groupMemberList == null) {
            this.groupMemberList = null;
            return;
        }

        this.groupMemberList = new java.util.ArrayList<GroupMember>(groupMemberList);
    }

    /**
     * <p>
     * The list of the members of the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupMemberList(java.util.Collection)} or {@link #withGroupMemberList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param groupMemberList
     *        The list of the members of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupMembershipsResult withGroupMemberList(GroupMember... groupMemberList) {
        if (this.groupMemberList == null) {
            setGroupMemberList(new java.util.ArrayList<GroupMember>(groupMemberList.length));
        }
        for (GroupMember ele : groupMemberList) {
            this.groupMemberList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of the members of the group.
     * </p>
     * 
     * @param groupMemberList
     *        The list of the members of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupMembershipsResult withGroupMemberList(java.util.Collection<GroupMember> groupMemberList) {
        setGroupMemberList(groupMemberList);
        return this;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that can be used in a subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @return A pagination token that can be used in a subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that can be used in a subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupMembershipsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupMembershipsResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The http status of the request.
     * </p>
     * 
     * @param status
     *        The http status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The http status of the request.
     * </p>
     * 
     * @return The http status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The http status of the request.
     * </p>
     * 
     * @param status
     *        The http status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupMembershipsResult withStatus(Integer status) {
        setStatus(status);
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
        if (getGroupMemberList() != null)
            sb.append("GroupMemberList: ").append(getGroupMemberList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGroupMembershipsResult == false)
            return false;
        ListGroupMembershipsResult other = (ListGroupMembershipsResult) obj;
        if (other.getGroupMemberList() == null ^ this.getGroupMemberList() == null)
            return false;
        if (other.getGroupMemberList() != null && other.getGroupMemberList().equals(this.getGroupMemberList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupMemberList() == null) ? 0 : getGroupMemberList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupMembershipsResult clone() {
        try {
            return (ListGroupMembershipsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
