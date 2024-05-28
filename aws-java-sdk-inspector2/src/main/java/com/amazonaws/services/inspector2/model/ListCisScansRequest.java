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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCisScans" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCisScansRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The detail applied to the CIS scan.
     * </p>
     */
    private String detailLevel;
    /**
     * <p>
     * The CIS scan filter criteria.
     * </p>
     */
    private ListCisScansFilterCriteria filterCriteria;
    /**
     * <p>
     * The maximum number of results to be returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The CIS scans sort by order.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The CIS scans sort order.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The detail applied to the CIS scan.
     * </p>
     * 
     * @param detailLevel
     *        The detail applied to the CIS scan.
     * @see ListCisScansDetailLevel
     */

    public void setDetailLevel(String detailLevel) {
        this.detailLevel = detailLevel;
    }

    /**
     * <p>
     * The detail applied to the CIS scan.
     * </p>
     * 
     * @return The detail applied to the CIS scan.
     * @see ListCisScansDetailLevel
     */

    public String getDetailLevel() {
        return this.detailLevel;
    }

    /**
     * <p>
     * The detail applied to the CIS scan.
     * </p>
     * 
     * @param detailLevel
     *        The detail applied to the CIS scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListCisScansDetailLevel
     */

    public ListCisScansRequest withDetailLevel(String detailLevel) {
        setDetailLevel(detailLevel);
        return this;
    }

    /**
     * <p>
     * The detail applied to the CIS scan.
     * </p>
     * 
     * @param detailLevel
     *        The detail applied to the CIS scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListCisScansDetailLevel
     */

    public ListCisScansRequest withDetailLevel(ListCisScansDetailLevel detailLevel) {
        this.detailLevel = detailLevel.toString();
        return this;
    }

    /**
     * <p>
     * The CIS scan filter criteria.
     * </p>
     * 
     * @param filterCriteria
     *        The CIS scan filter criteria.
     */

    public void setFilterCriteria(ListCisScansFilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * <p>
     * The CIS scan filter criteria.
     * </p>
     * 
     * @return The CIS scan filter criteria.
     */

    public ListCisScansFilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }

    /**
     * <p>
     * The CIS scan filter criteria.
     * </p>
     * 
     * @param filterCriteria
     *        The CIS scan filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansRequest withFilterCriteria(ListCisScansFilterCriteria filterCriteria) {
        setFilterCriteria(filterCriteria);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned.
     * </p>
     * 
     * @return The maximum number of results to be returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from a previous request that's used to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     * 
     * @return The pagination token from a previous request that's used to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from a previous request that's used to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScansRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The CIS scans sort by order.
     * </p>
     * 
     * @param sortBy
     *        The CIS scans sort by order.
     * @see ListCisScansSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The CIS scans sort by order.
     * </p>
     * 
     * @return The CIS scans sort by order.
     * @see ListCisScansSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The CIS scans sort by order.
     * </p>
     * 
     * @param sortBy
     *        The CIS scans sort by order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListCisScansSortBy
     */

    public ListCisScansRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The CIS scans sort by order.
     * </p>
     * 
     * @param sortBy
     *        The CIS scans sort by order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListCisScansSortBy
     */

    public ListCisScansRequest withSortBy(ListCisScansSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The CIS scans sort order.
     * </p>
     * 
     * @param sortOrder
     *        The CIS scans sort order.
     * @see CisSortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The CIS scans sort order.
     * </p>
     * 
     * @return The CIS scans sort order.
     * @see CisSortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The CIS scans sort order.
     * </p>
     * 
     * @param sortOrder
     *        The CIS scans sort order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSortOrder
     */

    public ListCisScansRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The CIS scans sort order.
     * </p>
     * 
     * @param sortOrder
     *        The CIS scans sort order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSortOrder
     */

    public ListCisScansRequest withSortOrder(CisSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getDetailLevel() != null)
            sb.append("DetailLevel: ").append(getDetailLevel()).append(",");
        if (getFilterCriteria() != null)
            sb.append("FilterCriteria: ").append(getFilterCriteria()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCisScansRequest == false)
            return false;
        ListCisScansRequest other = (ListCisScansRequest) obj;
        if (other.getDetailLevel() == null ^ this.getDetailLevel() == null)
            return false;
        if (other.getDetailLevel() != null && other.getDetailLevel().equals(this.getDetailLevel()) == false)
            return false;
        if (other.getFilterCriteria() == null ^ this.getFilterCriteria() == null)
            return false;
        if (other.getFilterCriteria() != null && other.getFilterCriteria().equals(this.getFilterCriteria()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetailLevel() == null) ? 0 : getDetailLevel().hashCode());
        hashCode = prime * hashCode + ((getFilterCriteria() == null) ? 0 : getFilterCriteria().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListCisScansRequest clone() {
        return (ListCisScansRequest) super.clone();
    }

}
