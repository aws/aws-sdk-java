/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeLockedSnapshotsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLockedSnapshotsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeLockedSnapshotsRequest> {

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>lock-state</code> - The state of the snapshot lock (<code>compliance-cooloff</code> |
     * <code>governance</code> | <code>compliance</code> | <code>expired</code>).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The IDs of the snapshots for which to view the lock status.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> snapshotIds;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>lock-state</code> - The state of the snapshot lock (<code>compliance-cooloff</code> |
     * <code>governance</code> | <code>compliance</code> | <code>expired</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>lock-state</code> - The state of the snapshot lock (<code>compliance-cooloff</code> |
     *         <code>governance</code> | <code>compliance</code> | <code>expired</code>).
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>lock-state</code> - The state of the snapshot lock (<code>compliance-cooloff</code> |
     * <code>governance</code> | <code>compliance</code> | <code>expired</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>lock-state</code> - The state of the snapshot lock (<code>compliance-cooloff</code> |
     *        <code>governance</code> | <code>compliance</code> | <code>expired</code>).
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>lock-state</code> - The state of the snapshot lock (<code>compliance-cooloff</code> |
     * <code>governance</code> | <code>compliance</code> | <code>expired</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>lock-state</code> - The state of the snapshot lock (<code>compliance-cooloff</code> |
     *        <code>governance</code> | <code>compliance</code> | <code>expired</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLockedSnapshotsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>lock-state</code> - The state of the snapshot lock (<code>compliance-cooloff</code> |
     * <code>governance</code> | <code>compliance</code> | <code>expired</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>lock-state</code> - The state of the snapshot lock (<code>compliance-cooloff</code> |
     *        <code>governance</code> | <code>compliance</code> | <code>expired</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLockedSnapshotsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. To get the next page of items, make another
     *        request with the token returned in the output. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *        >Pagination</a>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * 
     * @return The maximum number of items to return for this request. To get the next page of items, make another
     *         request with the token returned in the output. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *         >Pagination</a>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. To get the next page of items, make another
     *        request with the token returned in the output. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *        >Pagination</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLockedSnapshotsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @param nextToken
     *        The token returned from a previous paginated request. Pagination continues from the end of the items
     *        returned by the previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @return The token returned from a previous paginated request. Pagination continues from the end of the items
     *         returned by the previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @param nextToken
     *        The token returned from a previous paginated request. Pagination continues from the end of the items
     *        returned by the previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLockedSnapshotsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The IDs of the snapshots for which to view the lock status.
     * </p>
     * 
     * @return The IDs of the snapshots for which to view the lock status.
     */

    public java.util.List<String> getSnapshotIds() {
        if (snapshotIds == null) {
            snapshotIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return snapshotIds;
    }

    /**
     * <p>
     * The IDs of the snapshots for which to view the lock status.
     * </p>
     * 
     * @param snapshotIds
     *        The IDs of the snapshots for which to view the lock status.
     */

    public void setSnapshotIds(java.util.Collection<String> snapshotIds) {
        if (snapshotIds == null) {
            this.snapshotIds = null;
            return;
        }

        this.snapshotIds = new com.amazonaws.internal.SdkInternalList<String>(snapshotIds);
    }

    /**
     * <p>
     * The IDs of the snapshots for which to view the lock status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotIds(java.util.Collection)} or {@link #withSnapshotIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param snapshotIds
     *        The IDs of the snapshots for which to view the lock status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLockedSnapshotsRequest withSnapshotIds(String... snapshotIds) {
        if (this.snapshotIds == null) {
            setSnapshotIds(new com.amazonaws.internal.SdkInternalList<String>(snapshotIds.length));
        }
        for (String ele : snapshotIds) {
            this.snapshotIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the snapshots for which to view the lock status.
     * </p>
     * 
     * @param snapshotIds
     *        The IDs of the snapshots for which to view the lock status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLockedSnapshotsRequest withSnapshotIds(java.util.Collection<String> snapshotIds) {
        setSnapshotIds(snapshotIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeLockedSnapshotsRequest> getDryRunRequest() {
        Request<DescribeLockedSnapshotsRequest> request = new DescribeLockedSnapshotsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSnapshotIds() != null)
            sb.append("SnapshotIds: ").append(getSnapshotIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLockedSnapshotsRequest == false)
            return false;
        DescribeLockedSnapshotsRequest other = (DescribeLockedSnapshotsRequest) obj;
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
        if (other.getSnapshotIds() == null ^ this.getSnapshotIds() == null)
            return false;
        if (other.getSnapshotIds() != null && other.getSnapshotIds().equals(this.getSnapshotIds()) == false)
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
        hashCode = prime * hashCode + ((getSnapshotIds() == null) ? 0 : getSnapshotIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLockedSnapshotsRequest clone() {
        return (DescribeLockedSnapshotsRequest) super.clone();
    }
}
