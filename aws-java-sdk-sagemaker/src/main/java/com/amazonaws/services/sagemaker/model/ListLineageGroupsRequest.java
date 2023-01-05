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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLineageGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLineageGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A timestamp to filter against lineage groups created after a certain point in time.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * A timestamp to filter against lineage groups created before a certain point in time.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use it in the
     * subsequent request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of endpoints to return in the response. This value defaults to 10.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A timestamp to filter against lineage groups created after a certain point in time.
     * </p>
     * 
     * @param createdAfter
     *        A timestamp to filter against lineage groups created after a certain point in time.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * A timestamp to filter against lineage groups created after a certain point in time.
     * </p>
     * 
     * @return A timestamp to filter against lineage groups created after a certain point in time.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * A timestamp to filter against lineage groups created after a certain point in time.
     * </p>
     * 
     * @param createdAfter
     *        A timestamp to filter against lineage groups created after a certain point in time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageGroupsRequest withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * A timestamp to filter against lineage groups created before a certain point in time.
     * </p>
     * 
     * @param createdBefore
     *        A timestamp to filter against lineage groups created before a certain point in time.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * A timestamp to filter against lineage groups created before a certain point in time.
     * </p>
     * 
     * @return A timestamp to filter against lineage groups created before a certain point in time.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * A timestamp to filter against lineage groups created before a certain point in time.
     * </p>
     * 
     * @param createdBefore
     *        A timestamp to filter against lineage groups created before a certain point in time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageGroupsRequest withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * @see SortLineageGroupsBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     * 
     * @return The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * @see SortLineageGroupsBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortLineageGroupsBy
     */

    public ListLineageGroupsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortLineageGroupsBy
     */

    public ListLineageGroupsRequest withSortBy(SortLineageGroupsBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is <code>Ascending</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @return The sort order for the results. The default is <code>Ascending</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is <code>Ascending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListLineageGroupsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is <code>Ascending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListLineageGroupsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use it in the
     * subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use it
     *        in the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use it in the
     * subsequent request.
     * </p>
     * 
     * @return If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use
     *         it in the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use it in the
     * subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use it
     *        in the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageGroupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of endpoints to return in the response. This value defaults to 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of endpoints to return in the response. This value defaults to 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of endpoints to return in the response. This value defaults to 10.
     * </p>
     * 
     * @return The maximum number of endpoints to return in the response. This value defaults to 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of endpoints to return in the response. This value defaults to 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of endpoints to return in the response. This value defaults to 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLineageGroupsRequest == false)
            return false;
        ListLineageGroupsRequest other = (ListLineageGroupsRequest) obj;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListLineageGroupsRequest clone() {
        return (ListLineageGroupsRequest) super.clone();
    }

}
