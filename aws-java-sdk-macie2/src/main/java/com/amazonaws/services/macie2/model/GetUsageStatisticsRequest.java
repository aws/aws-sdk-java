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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetUsageStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUsageStatisticsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects, one for each condition to use to filter the query results. If you specify more than one
     * condition, Amazon Macie uses an AND operator to join the conditions.
     * </p>
     */
    private java.util.List<UsageStatisticsFilter> filterBy;
    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     */
    private UsageStatisticsSortBy sortBy;
    /**
     * <p>
     * The inclusive time period to query usage data for. Valid values are: MONTH_TO_DATE, for the current calendar
     * month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value, Amazon Macie provides
     * usage data for the preceding 30 days.
     * </p>
     */
    private String timeRange;

    /**
     * <p>
     * An array of objects, one for each condition to use to filter the query results. If you specify more than one
     * condition, Amazon Macie uses an AND operator to join the conditions.
     * </p>
     * 
     * @return An array of objects, one for each condition to use to filter the query results. If you specify more than
     *         one condition, Amazon Macie uses an AND operator to join the conditions.
     */

    public java.util.List<UsageStatisticsFilter> getFilterBy() {
        return filterBy;
    }

    /**
     * <p>
     * An array of objects, one for each condition to use to filter the query results. If you specify more than one
     * condition, Amazon Macie uses an AND operator to join the conditions.
     * </p>
     * 
     * @param filterBy
     *        An array of objects, one for each condition to use to filter the query results. If you specify more than
     *        one condition, Amazon Macie uses an AND operator to join the conditions.
     */

    public void setFilterBy(java.util.Collection<UsageStatisticsFilter> filterBy) {
        if (filterBy == null) {
            this.filterBy = null;
            return;
        }

        this.filterBy = new java.util.ArrayList<UsageStatisticsFilter>(filterBy);
    }

    /**
     * <p>
     * An array of objects, one for each condition to use to filter the query results. If you specify more than one
     * condition, Amazon Macie uses an AND operator to join the conditions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterBy(java.util.Collection)} or {@link #withFilterBy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filterBy
     *        An array of objects, one for each condition to use to filter the query results. If you specify more than
     *        one condition, Amazon Macie uses an AND operator to join the conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsRequest withFilterBy(UsageStatisticsFilter... filterBy) {
        if (this.filterBy == null) {
            setFilterBy(new java.util.ArrayList<UsageStatisticsFilter>(filterBy.length));
        }
        for (UsageStatisticsFilter ele : filterBy) {
            this.filterBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each condition to use to filter the query results. If you specify more than one
     * condition, Amazon Macie uses an AND operator to join the conditions.
     * </p>
     * 
     * @param filterBy
     *        An array of objects, one for each condition to use to filter the query results. If you specify more than
     *        one condition, Amazon Macie uses an AND operator to join the conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsRequest withFilterBy(java.util.Collection<UsageStatisticsFilter> filterBy) {
        setFilterBy(filterBy);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to include in each page of the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     * 
     * @return The maximum number of items to include in each page of the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to include in each page of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string that specifies which page of results to return in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @return The nextToken string that specifies which page of results to return in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string that specifies which page of results to return in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     * 
     * @param sortBy
     *        The criteria to use to sort the query results.
     */

    public void setSortBy(UsageStatisticsSortBy sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     * 
     * @return The criteria to use to sort the query results.
     */

    public UsageStatisticsSortBy getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     * 
     * @param sortBy
     *        The criteria to use to sort the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsRequest withSortBy(UsageStatisticsSortBy sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The inclusive time period to query usage data for. Valid values are: MONTH_TO_DATE, for the current calendar
     * month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value, Amazon Macie provides
     * usage data for the preceding 30 days.
     * </p>
     * 
     * @param timeRange
     *        The inclusive time period to query usage data for. Valid values are: MONTH_TO_DATE, for the current
     *        calendar month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value, Amazon
     *        Macie provides usage data for the preceding 30 days.
     * @see TimeRange
     */

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    /**
     * <p>
     * The inclusive time period to query usage data for. Valid values are: MONTH_TO_DATE, for the current calendar
     * month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value, Amazon Macie provides
     * usage data for the preceding 30 days.
     * </p>
     * 
     * @return The inclusive time period to query usage data for. Valid values are: MONTH_TO_DATE, for the current
     *         calendar month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value,
     *         Amazon Macie provides usage data for the preceding 30 days.
     * @see TimeRange
     */

    public String getTimeRange() {
        return this.timeRange;
    }

    /**
     * <p>
     * The inclusive time period to query usage data for. Valid values are: MONTH_TO_DATE, for the current calendar
     * month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value, Amazon Macie provides
     * usage data for the preceding 30 days.
     * </p>
     * 
     * @param timeRange
     *        The inclusive time period to query usage data for. Valid values are: MONTH_TO_DATE, for the current
     *        calendar month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value, Amazon
     *        Macie provides usage data for the preceding 30 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeRange
     */

    public GetUsageStatisticsRequest withTimeRange(String timeRange) {
        setTimeRange(timeRange);
        return this;
    }

    /**
     * <p>
     * The inclusive time period to query usage data for. Valid values are: MONTH_TO_DATE, for the current calendar
     * month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value, Amazon Macie provides
     * usage data for the preceding 30 days.
     * </p>
     * 
     * @param timeRange
     *        The inclusive time period to query usage data for. Valid values are: MONTH_TO_DATE, for the current
     *        calendar month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value, Amazon
     *        Macie provides usage data for the preceding 30 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeRange
     */

    public GetUsageStatisticsRequest withTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange.toString();
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
        if (getFilterBy() != null)
            sb.append("FilterBy: ").append(getFilterBy()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getTimeRange() != null)
            sb.append("TimeRange: ").append(getTimeRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsageStatisticsRequest == false)
            return false;
        GetUsageStatisticsRequest other = (GetUsageStatisticsRequest) obj;
        if (other.getFilterBy() == null ^ this.getFilterBy() == null)
            return false;
        if (other.getFilterBy() != null && other.getFilterBy().equals(this.getFilterBy()) == false)
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
        if (other.getTimeRange() == null ^ this.getTimeRange() == null)
            return false;
        if (other.getTimeRange() != null && other.getTimeRange().equals(this.getTimeRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterBy() == null) ? 0 : getFilterBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getTimeRange() == null) ? 0 : getTimeRange().hashCode());
        return hashCode;
    }

    @Override
    public GetUsageStatisticsRequest clone() {
        return (GetUsageStatisticsRequest) super.clone();
    }

}
