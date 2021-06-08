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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetUsageStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUsageStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of objects that contains the results of the query. Each object contains the data for an account that
     * meets the filter criteria specified in the request.
     * </p>
     */
    private java.util.List<UsageRecord> records;
    /**
     * <p>
     * The inclusive time period that the usage data applies to. Possible values are: MONTH_TO_DATE, for the current
     * calendar month to date; and, PAST_30_DAYS, for the preceding 30 days.
     * </p>
     */
    private String timeRange;

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @return The string to use in a subsequent request to get the next page of results in a paginated response. This
     *         value is null if there are no additional pages.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object contains the data for an account that
     * meets the filter criteria specified in the request.
     * </p>
     * 
     * @return An array of objects that contains the results of the query. Each object contains the data for an account
     *         that meets the filter criteria specified in the request.
     */

    public java.util.List<UsageRecord> getRecords() {
        return records;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object contains the data for an account that
     * meets the filter criteria specified in the request.
     * </p>
     * 
     * @param records
     *        An array of objects that contains the results of the query. Each object contains the data for an account
     *        that meets the filter criteria specified in the request.
     */

    public void setRecords(java.util.Collection<UsageRecord> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<UsageRecord>(records);
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object contains the data for an account that
     * meets the filter criteria specified in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        An array of objects that contains the results of the query. Each object contains the data for an account
     *        that meets the filter criteria specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsResult withRecords(UsageRecord... records) {
        if (this.records == null) {
            setRecords(new java.util.ArrayList<UsageRecord>(records.length));
        }
        for (UsageRecord ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object contains the data for an account that
     * meets the filter criteria specified in the request.
     * </p>
     * 
     * @param records
     *        An array of objects that contains the results of the query. Each object contains the data for an account
     *        that meets the filter criteria specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsResult withRecords(java.util.Collection<UsageRecord> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * The inclusive time period that the usage data applies to. Possible values are: MONTH_TO_DATE, for the current
     * calendar month to date; and, PAST_30_DAYS, for the preceding 30 days.
     * </p>
     * 
     * @param timeRange
     *        The inclusive time period that the usage data applies to. Possible values are: MONTH_TO_DATE, for the
     *        current calendar month to date; and, PAST_30_DAYS, for the preceding 30 days.
     * @see TimeRange
     */

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    /**
     * <p>
     * The inclusive time period that the usage data applies to. Possible values are: MONTH_TO_DATE, for the current
     * calendar month to date; and, PAST_30_DAYS, for the preceding 30 days.
     * </p>
     * 
     * @return The inclusive time period that the usage data applies to. Possible values are: MONTH_TO_DATE, for the
     *         current calendar month to date; and, PAST_30_DAYS, for the preceding 30 days.
     * @see TimeRange
     */

    public String getTimeRange() {
        return this.timeRange;
    }

    /**
     * <p>
     * The inclusive time period that the usage data applies to. Possible values are: MONTH_TO_DATE, for the current
     * calendar month to date; and, PAST_30_DAYS, for the preceding 30 days.
     * </p>
     * 
     * @param timeRange
     *        The inclusive time period that the usage data applies to. Possible values are: MONTH_TO_DATE, for the
     *        current calendar month to date; and, PAST_30_DAYS, for the preceding 30 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeRange
     */

    public GetUsageStatisticsResult withTimeRange(String timeRange) {
        setTimeRange(timeRange);
        return this;
    }

    /**
     * <p>
     * The inclusive time period that the usage data applies to. Possible values are: MONTH_TO_DATE, for the current
     * calendar month to date; and, PAST_30_DAYS, for the preceding 30 days.
     * </p>
     * 
     * @param timeRange
     *        The inclusive time period that the usage data applies to. Possible values are: MONTH_TO_DATE, for the
     *        current calendar month to date; and, PAST_30_DAYS, for the preceding 30 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeRange
     */

    public GetUsageStatisticsResult withTimeRange(TimeRange timeRange) {
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRecords() != null)
            sb.append("Records: ").append(getRecords()).append(",");
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

        if (obj instanceof GetUsageStatisticsResult == false)
            return false;
        GetUsageStatisticsResult other = (GetUsageStatisticsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode + ((getTimeRange() == null) ? 0 : getTimeRange().hashCode());
        return hashCode;
    }

    @Override
    public GetUsageStatisticsResult clone() {
        try {
            return (GetUsageStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
