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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListNodes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNodesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the network for which to list nodes.
     * </p>
     */
    private String networkId;
    /**
     * <p>
     * The unique identifier of the member who owns the nodes to list.
     * </p>
     */
    private String memberId;
    /**
     * <p>
     * An optional status specifier. If provided, only nodes currently in this status are listed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The maximum number of nodes to list.
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
     * The unique identifier of the network for which to list nodes.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network for which to list nodes.
     */

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * <p>
     * The unique identifier of the network for which to list nodes.
     * </p>
     * 
     * @return The unique identifier of the network for which to list nodes.
     */

    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * <p>
     * The unique identifier of the network for which to list nodes.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network for which to list nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodesRequest withNetworkId(String networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the member who owns the nodes to list.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member who owns the nodes to list.
     */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The unique identifier of the member who owns the nodes to list.
     * </p>
     * 
     * @return The unique identifier of the member who owns the nodes to list.
     */

    public String getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * The unique identifier of the member who owns the nodes to list.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member who owns the nodes to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodesRequest withMemberId(String memberId) {
        setMemberId(memberId);
        return this;
    }

    /**
     * <p>
     * An optional status specifier. If provided, only nodes currently in this status are listed.
     * </p>
     * 
     * @param status
     *        An optional status specifier. If provided, only nodes currently in this status are listed.
     * @see NodeStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * An optional status specifier. If provided, only nodes currently in this status are listed.
     * </p>
     * 
     * @return An optional status specifier. If provided, only nodes currently in this status are listed.
     * @see NodeStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * An optional status specifier. If provided, only nodes currently in this status are listed.
     * </p>
     * 
     * @param status
     *        An optional status specifier. If provided, only nodes currently in this status are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeStatus
     */

    public ListNodesRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * An optional status specifier. If provided, only nodes currently in this status are listed.
     * </p>
     * 
     * @param status
     *        An optional status specifier. If provided, only nodes currently in this status are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeStatus
     */

    public ListNodesRequest withStatus(NodeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of nodes to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of nodes to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of nodes to list.
     * </p>
     * 
     * @return The maximum number of nodes to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of nodes to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of nodes to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodesRequest withMaxResults(Integer maxResults) {
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

    public ListNodesRequest withNextToken(String nextToken) {
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
        if (getMemberId() != null)
            sb.append("MemberId: ").append(getMemberId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof ListNodesRequest == false)
            return false;
        ListNodesRequest other = (ListNodesRequest) obj;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListNodesRequest clone() {
        return (ListNodesRequest) super.clone();
    }

}
