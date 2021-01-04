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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListWorkforces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkforcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Sort workforces using the workforce name or creation date.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * Sort workforces in ascending or descending order.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * A filter you can use to search for workforces using part of the workforce name.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * A token to resume pagination.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of workforces returned in the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Sort workforces using the workforce name or creation date.
     * </p>
     * 
     * @param sortBy
     *        Sort workforces using the workforce name or creation date.
     * @see ListWorkforcesSortByOptions
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Sort workforces using the workforce name or creation date.
     * </p>
     * 
     * @return Sort workforces using the workforce name or creation date.
     * @see ListWorkforcesSortByOptions
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Sort workforces using the workforce name or creation date.
     * </p>
     * 
     * @param sortBy
     *        Sort workforces using the workforce name or creation date.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListWorkforcesSortByOptions
     */

    public ListWorkforcesRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Sort workforces using the workforce name or creation date.
     * </p>
     * 
     * @param sortBy
     *        Sort workforces using the workforce name or creation date.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListWorkforcesSortByOptions
     */

    public ListWorkforcesRequest withSortBy(ListWorkforcesSortByOptions sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Sort workforces in ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort workforces in ascending or descending order.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Sort workforces in ascending or descending order.
     * </p>
     * 
     * @return Sort workforces in ascending or descending order.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Sort workforces in ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort workforces in ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListWorkforcesRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Sort workforces in ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort workforces in ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListWorkforcesRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * A filter you can use to search for workforces using part of the workforce name.
     * </p>
     * 
     * @param nameContains
     *        A filter you can use to search for workforces using part of the workforce name.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * A filter you can use to search for workforces using part of the workforce name.
     * </p>
     * 
     * @return A filter you can use to search for workforces using part of the workforce name.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * A filter you can use to search for workforces using part of the workforce name.
     * </p>
     * 
     * @param nameContains
     *        A filter you can use to search for workforces using part of the workforce name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkforcesRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * 
     * @return A token to resume pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkforcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of workforces returned in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of workforces returned in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of workforces returned in the response.
     * </p>
     * 
     * @return The maximum number of workforces returned in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of workforces returned in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of workforces returned in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkforcesRequest withMaxResults(Integer maxResults) {
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
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
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

        if (obj instanceof ListWorkforcesRequest == false)
            return false;
        ListWorkforcesRequest other = (ListWorkforcesRequest) obj;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
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

        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkforcesRequest clone() {
        return (ListWorkforcesRequest) super.clone();
    }

}
