/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The structure representing the listProfileTimesRequest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfileTimes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfileTimesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The end time of the time range from which to list the profiles.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The maximum number of profile time results returned by <code>ListProfileTimes</code> in paginated output. When
     * this parameter is used, <code>ListProfileTimes</code> only returns <code>maxResults</code> results in a single
     * page with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListProfileTimes</code> request with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListProfileTimes</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;
    /**
     * <p>
     * The order (ascending or descending by start time of the profile) to use when listing profiles. Defaults to
     * <code>TIMESTAMP_DESCENDING</code>.
     * </p>
     */
    private String orderBy;
    /**
     * <p>
     * The aggregation period.
     * </p>
     */
    private String period;
    /**
     * <p>
     * The name of the profiling group.
     * </p>
     */
    private String profilingGroupName;
    /**
     * <p>
     * The start time of the time range from which to list the profiles.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The end time of the time range from which to list the profiles.
     * </p>
     * 
     * @param endTime
     *        The end time of the time range from which to list the profiles.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the time range from which to list the profiles.
     * </p>
     * 
     * @return The end time of the time range from which to list the profiles.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the time range from which to list the profiles.
     * </p>
     * 
     * @param endTime
     *        The end time of the time range from which to list the profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileTimesRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The maximum number of profile time results returned by <code>ListProfileTimes</code> in paginated output. When
     * this parameter is used, <code>ListProfileTimes</code> only returns <code>maxResults</code> results in a single
     * page with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListProfileTimes</code> request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of profile time results returned by <code>ListProfileTimes</code> in paginated output.
     *        When this parameter is used, <code>ListProfileTimes</code> only returns <code>maxResults</code> results in
     *        a single page with a <code>nextToken</code> response element. The remaining results of the initial request
     *        can be seen by sending another <code>ListProfileTimes</code> request with the returned
     *        <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of profile time results returned by <code>ListProfileTimes</code> in paginated output. When
     * this parameter is used, <code>ListProfileTimes</code> only returns <code>maxResults</code> results in a single
     * page with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListProfileTimes</code> request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of profile time results returned by <code>ListProfileTimes</code> in paginated output.
     *         When this parameter is used, <code>ListProfileTimes</code> only returns <code>maxResults</code> results
     *         in a single page with a <code>nextToken</code> response element. The remaining results of the initial
     *         request can be seen by sending another <code>ListProfileTimes</code> request with the returned
     *         <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of profile time results returned by <code>ListProfileTimes</code> in paginated output. When
     * this parameter is used, <code>ListProfileTimes</code> only returns <code>maxResults</code> results in a single
     * page with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListProfileTimes</code> request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of profile time results returned by <code>ListProfileTimes</code> in paginated output.
     *        When this parameter is used, <code>ListProfileTimes</code> only returns <code>maxResults</code> results in
     *        a single page with a <code>nextToken</code> response element. The remaining results of the initial request
     *        can be seen by sending another <code>ListProfileTimes</code> request with the returned
     *        <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileTimesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListProfileTimes</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListProfileTimes</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value. </p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListProfileTimes</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListProfileTimes</code> request
     *         where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value. </p>
     *         <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListProfileTimes</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListProfileTimes</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value. </p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileTimesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The order (ascending or descending by start time of the profile) to use when listing profiles. Defaults to
     * <code>TIMESTAMP_DESCENDING</code>.
     * </p>
     * 
     * @param orderBy
     *        The order (ascending or descending by start time of the profile) to use when listing profiles. Defaults to
     *        <code>TIMESTAMP_DESCENDING</code>.
     * @see OrderBy
     */

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * <p>
     * The order (ascending or descending by start time of the profile) to use when listing profiles. Defaults to
     * <code>TIMESTAMP_DESCENDING</code>.
     * </p>
     * 
     * @return The order (ascending or descending by start time of the profile) to use when listing profiles. Defaults
     *         to <code>TIMESTAMP_DESCENDING</code>.
     * @see OrderBy
     */

    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * <p>
     * The order (ascending or descending by start time of the profile) to use when listing profiles. Defaults to
     * <code>TIMESTAMP_DESCENDING</code>.
     * </p>
     * 
     * @param orderBy
     *        The order (ascending or descending by start time of the profile) to use when listing profiles. Defaults to
     *        <code>TIMESTAMP_DESCENDING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderBy
     */

    public ListProfileTimesRequest withOrderBy(String orderBy) {
        setOrderBy(orderBy);
        return this;
    }

    /**
     * <p>
     * The order (ascending or descending by start time of the profile) to use when listing profiles. Defaults to
     * <code>TIMESTAMP_DESCENDING</code>.
     * </p>
     * 
     * @param orderBy
     *        The order (ascending or descending by start time of the profile) to use when listing profiles. Defaults to
     *        <code>TIMESTAMP_DESCENDING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderBy
     */

    public ListProfileTimesRequest withOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy.toString();
        return this;
    }

    /**
     * <p>
     * The aggregation period.
     * </p>
     * 
     * @param period
     *        The aggregation period.
     * @see AggregationPeriod
     */

    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * <p>
     * The aggregation period.
     * </p>
     * 
     * @return The aggregation period.
     * @see AggregationPeriod
     */

    public String getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The aggregation period.
     * </p>
     * 
     * @param period
     *        The aggregation period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationPeriod
     */

    public ListProfileTimesRequest withPeriod(String period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The aggregation period.
     * </p>
     * 
     * @param period
     *        The aggregation period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationPeriod
     */

    public ListProfileTimesRequest withPeriod(AggregationPeriod period) {
        this.period = period.toString();
        return this;
    }

    /**
     * <p>
     * The name of the profiling group.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group.
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group.
     * </p>
     * 
     * @return The name of the profiling group.
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileTimesRequest withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
        return this;
    }

    /**
     * <p>
     * The start time of the time range from which to list the profiles.
     * </p>
     * 
     * @param startTime
     *        The start time of the time range from which to list the profiles.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the time range from which to list the profiles.
     * </p>
     * 
     * @return The start time of the time range from which to list the profiles.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the time range from which to list the profiles.
     * </p>
     * 
     * @param startTime
     *        The start time of the time range from which to list the profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileTimesRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOrderBy() != null)
            sb.append("OrderBy: ").append(getOrderBy()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getProfilingGroupName() != null)
            sb.append("ProfilingGroupName: ").append(getProfilingGroupName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProfileTimesRequest == false)
            return false;
        ListProfileTimesRequest other = (ListProfileTimesRequest) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOrderBy() == null ^ this.getOrderBy() == null)
            return false;
        if (other.getOrderBy() != null && other.getOrderBy().equals(this.getOrderBy()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getProfilingGroupName() == null ^ this.getProfilingGroupName() == null)
            return false;
        if (other.getProfilingGroupName() != null && other.getProfilingGroupName().equals(this.getProfilingGroupName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOrderBy() == null) ? 0 : getOrderBy().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public ListProfileTimesRequest clone() {
        return (ListProfileTimesRequest) super.clone();
    }

}
