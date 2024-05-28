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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetCisScanResultDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCisScanResultDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The filter criteria.
     * </p>
     */
    private CisScanResultDetailsFilterCriteria filterCriteria;
    /**
     * <p>
     * The maximum number of CIS scan result details to be returned in a single page of results.
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
     * The scan ARN.
     * </p>
     */
    private String scanArn;
    /**
     * <p>
     * The sort by order.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The target resource ID.
     * </p>
     */
    private String targetResourceId;

    /**
     * <p>
     * The account ID.
     * </p>
     * 
     * @param accountId
     *        The account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID.
     * </p>
     * 
     * @return The account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID.
     * </p>
     * 
     * @param accountId
     *        The account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCisScanResultDetailsRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The filter criteria.
     * </p>
     * 
     * @param filterCriteria
     *        The filter criteria.
     */

    public void setFilterCriteria(CisScanResultDetailsFilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * <p>
     * The filter criteria.
     * </p>
     * 
     * @return The filter criteria.
     */

    public CisScanResultDetailsFilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }

    /**
     * <p>
     * The filter criteria.
     * </p>
     * 
     * @param filterCriteria
     *        The filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCisScanResultDetailsRequest withFilterCriteria(CisScanResultDetailsFilterCriteria filterCriteria) {
        setFilterCriteria(filterCriteria);
        return this;
    }

    /**
     * <p>
     * The maximum number of CIS scan result details to be returned in a single page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of CIS scan result details to be returned in a single page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of CIS scan result details to be returned in a single page of results.
     * </p>
     * 
     * @return The maximum number of CIS scan result details to be returned in a single page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of CIS scan result details to be returned in a single page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of CIS scan result details to be returned in a single page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCisScanResultDetailsRequest withMaxResults(Integer maxResults) {
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

    public GetCisScanResultDetailsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The scan ARN.
     * </p>
     * 
     * @param scanArn
     *        The scan ARN.
     */

    public void setScanArn(String scanArn) {
        this.scanArn = scanArn;
    }

    /**
     * <p>
     * The scan ARN.
     * </p>
     * 
     * @return The scan ARN.
     */

    public String getScanArn() {
        return this.scanArn;
    }

    /**
     * <p>
     * The scan ARN.
     * </p>
     * 
     * @param scanArn
     *        The scan ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCisScanResultDetailsRequest withScanArn(String scanArn) {
        setScanArn(scanArn);
        return this;
    }

    /**
     * <p>
     * The sort by order.
     * </p>
     * 
     * @param sortBy
     *        The sort by order.
     * @see CisScanResultDetailsSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The sort by order.
     * </p>
     * 
     * @return The sort by order.
     * @see CisScanResultDetailsSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The sort by order.
     * </p>
     * 
     * @param sortBy
     *        The sort by order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisScanResultDetailsSortBy
     */

    public GetCisScanResultDetailsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The sort by order.
     * </p>
     * 
     * @param sortBy
     *        The sort by order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisScanResultDetailsSortBy
     */

    public GetCisScanResultDetailsRequest withSortBy(CisScanResultDetailsSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order.
     * </p>
     * 
     * @param sortOrder
     *        The sort order.
     * @see CisSortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order.
     * </p>
     * 
     * @return The sort order.
     * @see CisSortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order.
     * </p>
     * 
     * @param sortOrder
     *        The sort order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSortOrder
     */

    public GetCisScanResultDetailsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order.
     * </p>
     * 
     * @param sortOrder
     *        The sort order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSortOrder
     */

    public GetCisScanResultDetailsRequest withSortOrder(CisSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The target resource ID.
     * </p>
     * 
     * @param targetResourceId
     *        The target resource ID.
     */

    public void setTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
    }

    /**
     * <p>
     * The target resource ID.
     * </p>
     * 
     * @return The target resource ID.
     */

    public String getTargetResourceId() {
        return this.targetResourceId;
    }

    /**
     * <p>
     * The target resource ID.
     * </p>
     * 
     * @param targetResourceId
     *        The target resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCisScanResultDetailsRequest withTargetResourceId(String targetResourceId) {
        setTargetResourceId(targetResourceId);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getFilterCriteria() != null)
            sb.append("FilterCriteria: ").append(getFilterCriteria()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getScanArn() != null)
            sb.append("ScanArn: ").append(getScanArn()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getTargetResourceId() != null)
            sb.append("TargetResourceId: ").append(getTargetResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCisScanResultDetailsRequest == false)
            return false;
        GetCisScanResultDetailsRequest other = (GetCisScanResultDetailsRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
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
        if (other.getScanArn() == null ^ this.getScanArn() == null)
            return false;
        if (other.getScanArn() != null && other.getScanArn().equals(this.getScanArn()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getTargetResourceId() == null ^ this.getTargetResourceId() == null)
            return false;
        if (other.getTargetResourceId() != null && other.getTargetResourceId().equals(this.getTargetResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getFilterCriteria() == null) ? 0 : getFilterCriteria().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getScanArn() == null) ? 0 : getScanArn().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceId() == null) ? 0 : getTargetResourceId().hashCode());
        return hashCode;
    }

    @Override
    public GetCisScanResultDetailsRequest clone() {
        return (GetCisScanResultDetailsRequest) super.clone();
    }

}
