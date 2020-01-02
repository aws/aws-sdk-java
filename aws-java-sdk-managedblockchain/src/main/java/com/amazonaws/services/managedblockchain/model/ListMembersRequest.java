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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMembersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the network for which to list members.
     * </p>
     */
    private String networkId;
    /**
     * <p>
     * The optional name of the member to list.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional status specifier. If provided, only members currently in this status are listed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An optional Boolean value. If provided, the request is limited either to members that the current AWS account
     * owns (<code>true</code>) or that other AWS accounts own (<code>false</code>). If omitted, all members are listed.
     * </p>
     */
    private Boolean isOwned;
    /**
     * <p>
     * The maximum number of members to return in the request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier of the network for which to list members.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network for which to list members.
     */

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * <p>
     * The unique identifier of the network for which to list members.
     * </p>
     * 
     * @return The unique identifier of the network for which to list members.
     */

    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * <p>
     * The unique identifier of the network for which to list members.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network for which to list members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersRequest withNetworkId(String networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * <p>
     * The optional name of the member to list.
     * </p>
     * 
     * @param name
     *        The optional name of the member to list.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The optional name of the member to list.
     * </p>
     * 
     * @return The optional name of the member to list.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The optional name of the member to list.
     * </p>
     * 
     * @param name
     *        The optional name of the member to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional status specifier. If provided, only members currently in this status are listed.
     * </p>
     * 
     * @param status
     *        An optional status specifier. If provided, only members currently in this status are listed.
     * @see MemberStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * An optional status specifier. If provided, only members currently in this status are listed.
     * </p>
     * 
     * @return An optional status specifier. If provided, only members currently in this status are listed.
     * @see MemberStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * An optional status specifier. If provided, only members currently in this status are listed.
     * </p>
     * 
     * @param status
     *        An optional status specifier. If provided, only members currently in this status are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberStatus
     */

    public ListMembersRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * An optional status specifier. If provided, only members currently in this status are listed.
     * </p>
     * 
     * @param status
     *        An optional status specifier. If provided, only members currently in this status are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberStatus
     */

    public ListMembersRequest withStatus(MemberStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An optional Boolean value. If provided, the request is limited either to members that the current AWS account
     * owns (<code>true</code>) or that other AWS accounts own (<code>false</code>). If omitted, all members are listed.
     * </p>
     * 
     * @param isOwned
     *        An optional Boolean value. If provided, the request is limited either to members that the current AWS
     *        account owns (<code>true</code>) or that other AWS accounts own (<code>false</code>). If omitted, all
     *        members are listed.
     */

    public void setIsOwned(Boolean isOwned) {
        this.isOwned = isOwned;
    }

    /**
     * <p>
     * An optional Boolean value. If provided, the request is limited either to members that the current AWS account
     * owns (<code>true</code>) or that other AWS accounts own (<code>false</code>). If omitted, all members are listed.
     * </p>
     * 
     * @return An optional Boolean value. If provided, the request is limited either to members that the current AWS
     *         account owns (<code>true</code>) or that other AWS accounts own (<code>false</code>). If omitted, all
     *         members are listed.
     */

    public Boolean getIsOwned() {
        return this.isOwned;
    }

    /**
     * <p>
     * An optional Boolean value. If provided, the request is limited either to members that the current AWS account
     * owns (<code>true</code>) or that other AWS accounts own (<code>false</code>). If omitted, all members are listed.
     * </p>
     * 
     * @param isOwned
     *        An optional Boolean value. If provided, the request is limited either to members that the current AWS
     *        account owns (<code>true</code>) or that other AWS accounts own (<code>false</code>). If omitted, all
     *        members are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersRequest withIsOwned(Boolean isOwned) {
        setIsOwned(isOwned);
        return this;
    }

    /**
     * <p>
     * An optional Boolean value. If provided, the request is limited either to members that the current AWS account
     * owns (<code>true</code>) or that other AWS accounts own (<code>false</code>). If omitted, all members are listed.
     * </p>
     * 
     * @return An optional Boolean value. If provided, the request is limited either to members that the current AWS
     *         account owns (<code>true</code>) or that other AWS accounts own (<code>false</code>). If omitted, all
     *         members are listed.
     */

    public Boolean isOwned() {
        return this.isOwned;
    }

    /**
     * <p>
     * The maximum number of members to return in the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of members to return in the request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of members to return in the request.
     * </p>
     * 
     * @return The maximum number of members to return in the request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of members to return in the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of members to return in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getNetworkId() != null)
            sb.append("NetworkId: ").append(getNetworkId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getIsOwned() != null)
            sb.append("IsOwned: ").append(getIsOwned()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMembersRequest == false)
            return false;
        ListMembersRequest other = (ListMembersRequest) obj;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getIsOwned() == null ^ this.getIsOwned() == null)
            return false;
        if (other.getIsOwned() != null && other.getIsOwned().equals(this.getIsOwned()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getIsOwned() == null) ? 0 : getIsOwned().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMembersRequest clone() {
        return (ListMembersRequest) super.clone();
    }

}
