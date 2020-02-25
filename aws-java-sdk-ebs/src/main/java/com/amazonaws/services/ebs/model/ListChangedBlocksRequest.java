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
package com.amazonaws.services.ebs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/ListChangedBlocks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChangedBlocksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the first snapshot to use for the comparison.
     * </p>
     * <important>
     * <p>
     * The <code>FirstSnapshotID</code> parameter must be specified with a <code>SecondSnapshotId</code> parameter;
     * otherwise, an error occurs.
     * </p>
     * </important>
     */
    private String firstSnapshotId;
    /**
     * <p>
     * The ID of the second snapshot to use for the comparison.
     * </p>
     * <important>
     * <p>
     * The <code>SecondSnapshotId</code> parameter must be specified with a <code>FirstSnapshotID</code> parameter;
     * otherwise, an error occurs.
     * </p>
     * </important>
     */
    private String secondSnapshotId;
    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The block index from which the comparison should start.
     * </p>
     * <p>
     * The list in the response will start from this block index or the next valid block index in the snapshots.
     * </p>
     */
    private Integer startingBlockIndex;

    /**
     * <p>
     * The ID of the first snapshot to use for the comparison.
     * </p>
     * <important>
     * <p>
     * The <code>FirstSnapshotID</code> parameter must be specified with a <code>SecondSnapshotId</code> parameter;
     * otherwise, an error occurs.
     * </p>
     * </important>
     * 
     * @param firstSnapshotId
     *        The ID of the first snapshot to use for the comparison.</p> <important>
     *        <p>
     *        The <code>FirstSnapshotID</code> parameter must be specified with a <code>SecondSnapshotId</code>
     *        parameter; otherwise, an error occurs.
     *        </p>
     */

    public void setFirstSnapshotId(String firstSnapshotId) {
        this.firstSnapshotId = firstSnapshotId;
    }

    /**
     * <p>
     * The ID of the first snapshot to use for the comparison.
     * </p>
     * <important>
     * <p>
     * The <code>FirstSnapshotID</code> parameter must be specified with a <code>SecondSnapshotId</code> parameter;
     * otherwise, an error occurs.
     * </p>
     * </important>
     * 
     * @return The ID of the first snapshot to use for the comparison.</p> <important>
     *         <p>
     *         The <code>FirstSnapshotID</code> parameter must be specified with a <code>SecondSnapshotId</code>
     *         parameter; otherwise, an error occurs.
     *         </p>
     */

    public String getFirstSnapshotId() {
        return this.firstSnapshotId;
    }

    /**
     * <p>
     * The ID of the first snapshot to use for the comparison.
     * </p>
     * <important>
     * <p>
     * The <code>FirstSnapshotID</code> parameter must be specified with a <code>SecondSnapshotId</code> parameter;
     * otherwise, an error occurs.
     * </p>
     * </important>
     * 
     * @param firstSnapshotId
     *        The ID of the first snapshot to use for the comparison.</p> <important>
     *        <p>
     *        The <code>FirstSnapshotID</code> parameter must be specified with a <code>SecondSnapshotId</code>
     *        parameter; otherwise, an error occurs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangedBlocksRequest withFirstSnapshotId(String firstSnapshotId) {
        setFirstSnapshotId(firstSnapshotId);
        return this;
    }

    /**
     * <p>
     * The ID of the second snapshot to use for the comparison.
     * </p>
     * <important>
     * <p>
     * The <code>SecondSnapshotId</code> parameter must be specified with a <code>FirstSnapshotID</code> parameter;
     * otherwise, an error occurs.
     * </p>
     * </important>
     * 
     * @param secondSnapshotId
     *        The ID of the second snapshot to use for the comparison.</p> <important>
     *        <p>
     *        The <code>SecondSnapshotId</code> parameter must be specified with a <code>FirstSnapshotID</code>
     *        parameter; otherwise, an error occurs.
     *        </p>
     */

    public void setSecondSnapshotId(String secondSnapshotId) {
        this.secondSnapshotId = secondSnapshotId;
    }

    /**
     * <p>
     * The ID of the second snapshot to use for the comparison.
     * </p>
     * <important>
     * <p>
     * The <code>SecondSnapshotId</code> parameter must be specified with a <code>FirstSnapshotID</code> parameter;
     * otherwise, an error occurs.
     * </p>
     * </important>
     * 
     * @return The ID of the second snapshot to use for the comparison.</p> <important>
     *         <p>
     *         The <code>SecondSnapshotId</code> parameter must be specified with a <code>FirstSnapshotID</code>
     *         parameter; otherwise, an error occurs.
     *         </p>
     */

    public String getSecondSnapshotId() {
        return this.secondSnapshotId;
    }

    /**
     * <p>
     * The ID of the second snapshot to use for the comparison.
     * </p>
     * <important>
     * <p>
     * The <code>SecondSnapshotId</code> parameter must be specified with a <code>FirstSnapshotID</code> parameter;
     * otherwise, an error occurs.
     * </p>
     * </important>
     * 
     * @param secondSnapshotId
     *        The ID of the second snapshot to use for the comparison.</p> <important>
     *        <p>
     *        The <code>SecondSnapshotId</code> parameter must be specified with a <code>FirstSnapshotID</code>
     *        parameter; otherwise, an error occurs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangedBlocksRequest withSecondSnapshotId(String secondSnapshotId) {
        setSecondSnapshotId(secondSnapshotId);
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @return The token to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangedBlocksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of results to return.
     * </p>
     * 
     * @return The number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangedBlocksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The block index from which the comparison should start.
     * </p>
     * <p>
     * The list in the response will start from this block index or the next valid block index in the snapshots.
     * </p>
     * 
     * @param startingBlockIndex
     *        The block index from which the comparison should start.</p>
     *        <p>
     *        The list in the response will start from this block index or the next valid block index in the snapshots.
     */

    public void setStartingBlockIndex(Integer startingBlockIndex) {
        this.startingBlockIndex = startingBlockIndex;
    }

    /**
     * <p>
     * The block index from which the comparison should start.
     * </p>
     * <p>
     * The list in the response will start from this block index or the next valid block index in the snapshots.
     * </p>
     * 
     * @return The block index from which the comparison should start.</p>
     *         <p>
     *         The list in the response will start from this block index or the next valid block index in the snapshots.
     */

    public Integer getStartingBlockIndex() {
        return this.startingBlockIndex;
    }

    /**
     * <p>
     * The block index from which the comparison should start.
     * </p>
     * <p>
     * The list in the response will start from this block index or the next valid block index in the snapshots.
     * </p>
     * 
     * @param startingBlockIndex
     *        The block index from which the comparison should start.</p>
     *        <p>
     *        The list in the response will start from this block index or the next valid block index in the snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangedBlocksRequest withStartingBlockIndex(Integer startingBlockIndex) {
        setStartingBlockIndex(startingBlockIndex);
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
        if (getFirstSnapshotId() != null)
            sb.append("FirstSnapshotId: ").append(getFirstSnapshotId()).append(",");
        if (getSecondSnapshotId() != null)
            sb.append("SecondSnapshotId: ").append(getSecondSnapshotId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStartingBlockIndex() != null)
            sb.append("StartingBlockIndex: ").append(getStartingBlockIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChangedBlocksRequest == false)
            return false;
        ListChangedBlocksRequest other = (ListChangedBlocksRequest) obj;
        if (other.getFirstSnapshotId() == null ^ this.getFirstSnapshotId() == null)
            return false;
        if (other.getFirstSnapshotId() != null && other.getFirstSnapshotId().equals(this.getFirstSnapshotId()) == false)
            return false;
        if (other.getSecondSnapshotId() == null ^ this.getSecondSnapshotId() == null)
            return false;
        if (other.getSecondSnapshotId() != null && other.getSecondSnapshotId().equals(this.getSecondSnapshotId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStartingBlockIndex() == null ^ this.getStartingBlockIndex() == null)
            return false;
        if (other.getStartingBlockIndex() != null && other.getStartingBlockIndex().equals(this.getStartingBlockIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstSnapshotId() == null) ? 0 : getFirstSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getSecondSnapshotId() == null) ? 0 : getSecondSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStartingBlockIndex() == null) ? 0 : getStartingBlockIndex().hashCode());
        return hashCode;
    }

    @Override
    public ListChangedBlocksRequest clone() {
        return (ListChangedBlocksRequest) super.clone();
    }

}
