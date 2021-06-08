/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListBuildBatches" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBuildBatchesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>BuildBatchFilter</code> object that specifies the filters for the search.
     * </p>
     */
    private BuildBatchFilter filter;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies the sort order of the returned items. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the batch build identifiers in ascending order by identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the batch build identifiers in descending order by identifier.
     * </p>
     * </li>
     * </ul>
     */
    private String sortOrder;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous call to <code>ListBuildBatches</code>. This specifies
     * the next item to return. To return the beginning of the list, exclude this parameter.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A <code>BuildBatchFilter</code> object that specifies the filters for the search.
     * </p>
     * 
     * @param filter
     *        A <code>BuildBatchFilter</code> object that specifies the filters for the search.
     */

    public void setFilter(BuildBatchFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A <code>BuildBatchFilter</code> object that specifies the filters for the search.
     * </p>
     * 
     * @return A <code>BuildBatchFilter</code> object that specifies the filters for the search.
     */

    public BuildBatchFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * A <code>BuildBatchFilter</code> object that specifies the filters for the search.
     * </p>
     * 
     * @param filter
     *        A <code>BuildBatchFilter</code> object that specifies the filters for the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuildBatchesRequest withFilter(BuildBatchFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuildBatchesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies the sort order of the returned items. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the batch build identifiers in ascending order by identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the batch build identifiers in descending order by identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sortOrder
     *        Specifies the sort order of the returned items. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASCENDING</code>: List the batch build identifiers in ascending order by identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESCENDING</code>: List the batch build identifiers in descending order by identifier.
     *        </p>
     *        </li>
     * @see SortOrderType
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Specifies the sort order of the returned items. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the batch build identifiers in ascending order by identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the batch build identifiers in descending order by identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the sort order of the returned items. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASCENDING</code>: List the batch build identifiers in ascending order by identifier.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DESCENDING</code>: List the batch build identifiers in descending order by identifier.
     *         </p>
     *         </li>
     * @see SortOrderType
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Specifies the sort order of the returned items. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the batch build identifiers in ascending order by identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the batch build identifiers in descending order by identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sortOrder
     *        Specifies the sort order of the returned items. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASCENDING</code>: List the batch build identifiers in ascending order by identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESCENDING</code>: List the batch build identifiers in descending order by identifier.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListBuildBatchesRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Specifies the sort order of the returned items. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the batch build identifiers in ascending order by identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the batch build identifiers in descending order by identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sortOrder
     *        Specifies the sort order of the returned items. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASCENDING</code>: List the batch build identifiers in ascending order by identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESCENDING</code>: List the batch build identifiers in descending order by identifier.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListBuildBatchesRequest withSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous call to <code>ListBuildBatches</code>. This specifies
     * the next item to return. To return the beginning of the list, exclude this parameter.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous call to <code>ListBuildBatches</code>. This
     *        specifies the next item to return. To return the beginning of the list, exclude this parameter.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous call to <code>ListBuildBatches</code>. This specifies
     * the next item to return. To return the beginning of the list, exclude this parameter.
     * </p>
     * 
     * @return The <code>nextToken</code> value returned from a previous call to <code>ListBuildBatches</code>. This
     *         specifies the next item to return. To return the beginning of the list, exclude this parameter.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous call to <code>ListBuildBatches</code>. This specifies
     * the next item to return. To return the beginning of the list, exclude this parameter.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous call to <code>ListBuildBatches</code>. This
     *        specifies the next item to return. To return the beginning of the list, exclude this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuildBatchesRequest withNextToken(String nextToken) {
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
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

        if (obj instanceof ListBuildBatchesRequest == false)
            return false;
        ListBuildBatchesRequest other = (ListBuildBatchesRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
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

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBuildBatchesRequest clone() {
        return (ListBuildBatchesRequest) super.clone();
    }

}
