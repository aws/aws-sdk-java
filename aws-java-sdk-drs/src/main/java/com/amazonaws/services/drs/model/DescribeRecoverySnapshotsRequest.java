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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeRecoverySnapshots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRecoverySnapshotsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A set of filters by which to return Recovery Snapshots.
     * </p>
     */
    private DescribeRecoverySnapshotsRequestFilters filters;
    /**
     * <p>
     * Maximum number of Recovery Snapshots to retrieve.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token of the next Recovery Snapshot to retrieve.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The sorted ordering by which to return Recovery Snapshots.
     * </p>
     */
    private String order;
    /**
     * <p>
     * Filter Recovery Snapshots by Source Server ID.
     * </p>
     */
    private String sourceServerID;

    /**
     * <p>
     * A set of filters by which to return Recovery Snapshots.
     * </p>
     * 
     * @param filters
     *        A set of filters by which to return Recovery Snapshots.
     */

    public void setFilters(DescribeRecoverySnapshotsRequestFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * A set of filters by which to return Recovery Snapshots.
     * </p>
     * 
     * @return A set of filters by which to return Recovery Snapshots.
     */

    public DescribeRecoverySnapshotsRequestFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * A set of filters by which to return Recovery Snapshots.
     * </p>
     * 
     * @param filters
     *        A set of filters by which to return Recovery Snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoverySnapshotsRequest withFilters(DescribeRecoverySnapshotsRequestFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Maximum number of Recovery Snapshots to retrieve.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of Recovery Snapshots to retrieve.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of Recovery Snapshots to retrieve.
     * </p>
     * 
     * @return Maximum number of Recovery Snapshots to retrieve.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of Recovery Snapshots to retrieve.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of Recovery Snapshots to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoverySnapshotsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token of the next Recovery Snapshot to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The token of the next Recovery Snapshot to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token of the next Recovery Snapshot to retrieve.
     * </p>
     * 
     * @return The token of the next Recovery Snapshot to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token of the next Recovery Snapshot to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The token of the next Recovery Snapshot to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoverySnapshotsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The sorted ordering by which to return Recovery Snapshots.
     * </p>
     * 
     * @param order
     *        The sorted ordering by which to return Recovery Snapshots.
     * @see RecoverySnapshotsOrder
     */

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * The sorted ordering by which to return Recovery Snapshots.
     * </p>
     * 
     * @return The sorted ordering by which to return Recovery Snapshots.
     * @see RecoverySnapshotsOrder
     */

    public String getOrder() {
        return this.order;
    }

    /**
     * <p>
     * The sorted ordering by which to return Recovery Snapshots.
     * </p>
     * 
     * @param order
     *        The sorted ordering by which to return Recovery Snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecoverySnapshotsOrder
     */

    public DescribeRecoverySnapshotsRequest withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * The sorted ordering by which to return Recovery Snapshots.
     * </p>
     * 
     * @param order
     *        The sorted ordering by which to return Recovery Snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecoverySnapshotsOrder
     */

    public DescribeRecoverySnapshotsRequest withOrder(RecoverySnapshotsOrder order) {
        this.order = order.toString();
        return this;
    }

    /**
     * <p>
     * Filter Recovery Snapshots by Source Server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Filter Recovery Snapshots by Source Server ID.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * Filter Recovery Snapshots by Source Server ID.
     * </p>
     * 
     * @return Filter Recovery Snapshots by Source Server ID.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * Filter Recovery Snapshots by Source Server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Filter Recovery Snapshots by Source Server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoverySnapshotsRequest withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder()).append(",");
        if (getSourceServerID() != null)
            sb.append("SourceServerID: ").append(getSourceServerID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRecoverySnapshotsRequest == false)
            return false;
        DescribeRecoverySnapshotsRequest other = (DescribeRecoverySnapshotsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        if (other.getSourceServerID() == null ^ this.getSourceServerID() == null)
            return false;
        if (other.getSourceServerID() != null && other.getSourceServerID().equals(this.getSourceServerID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRecoverySnapshotsRequest clone() {
        return (DescribeRecoverySnapshotsRequest) super.clone();
    }

}
