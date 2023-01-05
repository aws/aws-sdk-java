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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeSnapshots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the snapshots that you want to retrieve. This parameter value overrides any filters. If any IDs aren't
     * found, a <code>SnapshotNotFound</code> error occurs.
     * </p>
     */
    private java.util.List<String> snapshotIds;
    /**
     * <p>
     * The filters structure. The supported names are <code>file-system-id</code> or <code>volume-id</code>.
     * </p>
     */
    private java.util.List<SnapshotFilter> filters;

    private Integer maxResults;

    private String nextToken;

    /**
     * <p>
     * The IDs of the snapshots that you want to retrieve. This parameter value overrides any filters. If any IDs aren't
     * found, a <code>SnapshotNotFound</code> error occurs.
     * </p>
     * 
     * @return The IDs of the snapshots that you want to retrieve. This parameter value overrides any filters. If any
     *         IDs aren't found, a <code>SnapshotNotFound</code> error occurs.
     */

    public java.util.List<String> getSnapshotIds() {
        return snapshotIds;
    }

    /**
     * <p>
     * The IDs of the snapshots that you want to retrieve. This parameter value overrides any filters. If any IDs aren't
     * found, a <code>SnapshotNotFound</code> error occurs.
     * </p>
     * 
     * @param snapshotIds
     *        The IDs of the snapshots that you want to retrieve. This parameter value overrides any filters. If any IDs
     *        aren't found, a <code>SnapshotNotFound</code> error occurs.
     */

    public void setSnapshotIds(java.util.Collection<String> snapshotIds) {
        if (snapshotIds == null) {
            this.snapshotIds = null;
            return;
        }

        this.snapshotIds = new java.util.ArrayList<String>(snapshotIds);
    }

    /**
     * <p>
     * The IDs of the snapshots that you want to retrieve. This parameter value overrides any filters. If any IDs aren't
     * found, a <code>SnapshotNotFound</code> error occurs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotIds(java.util.Collection)} or {@link #withSnapshotIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param snapshotIds
     *        The IDs of the snapshots that you want to retrieve. This parameter value overrides any filters. If any IDs
     *        aren't found, a <code>SnapshotNotFound</code> error occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withSnapshotIds(String... snapshotIds) {
        if (this.snapshotIds == null) {
            setSnapshotIds(new java.util.ArrayList<String>(snapshotIds.length));
        }
        for (String ele : snapshotIds) {
            this.snapshotIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the snapshots that you want to retrieve. This parameter value overrides any filters. If any IDs aren't
     * found, a <code>SnapshotNotFound</code> error occurs.
     * </p>
     * 
     * @param snapshotIds
     *        The IDs of the snapshots that you want to retrieve. This parameter value overrides any filters. If any IDs
     *        aren't found, a <code>SnapshotNotFound</code> error occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withSnapshotIds(java.util.Collection<String> snapshotIds) {
        setSnapshotIds(snapshotIds);
        return this;
    }

    /**
     * <p>
     * The filters structure. The supported names are <code>file-system-id</code> or <code>volume-id</code>.
     * </p>
     * 
     * @return The filters structure. The supported names are <code>file-system-id</code> or <code>volume-id</code>.
     */

    public java.util.List<SnapshotFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters structure. The supported names are <code>file-system-id</code> or <code>volume-id</code>.
     * </p>
     * 
     * @param filters
     *        The filters structure. The supported names are <code>file-system-id</code> or <code>volume-id</code>.
     */

    public void setFilters(java.util.Collection<SnapshotFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<SnapshotFilter>(filters);
    }

    /**
     * <p>
     * The filters structure. The supported names are <code>file-system-id</code> or <code>volume-id</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters structure. The supported names are <code>file-system-id</code> or <code>volume-id</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withFilters(SnapshotFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<SnapshotFilter>(filters.length));
        }
        for (SnapshotFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters structure. The supported names are <code>file-system-id</code> or <code>volume-id</code>.
     * </p>
     * 
     * @param filters
     *        The filters structure. The supported names are <code>file-system-id</code> or <code>volume-id</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withFilters(java.util.Collection<SnapshotFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withNextToken(String nextToken) {
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
        if (getSnapshotIds() != null)
            sb.append("SnapshotIds: ").append(getSnapshotIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeSnapshotsRequest == false)
            return false;
        DescribeSnapshotsRequest other = (DescribeSnapshotsRequest) obj;
        if (other.getSnapshotIds() == null ^ this.getSnapshotIds() == null)
            return false;
        if (other.getSnapshotIds() != null && other.getSnapshotIds().equals(this.getSnapshotIds()) == false)
            return false;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotIds() == null) ? 0 : getSnapshotIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotsRequest clone() {
        return (DescribeSnapshotsRequest) super.clone();
    }

}
