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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListQueries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQueriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN (or the ID suffix of the ARN) of an event data store on which queries were run.
     * </p>
     */
    private String eventDataStore;
    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of queries to show on a page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Use with <code>EndTime</code> to bound a <code>ListQueries</code> request, and limit its results to only those
     * queries run within a specified time period.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Use with <code>StartTime</code> to bound a <code>ListQueries</code> request, and limit its results to only those
     * queries run within a specified time period.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The status of queries that you want to return in results. Valid values for <code>QueryStatus</code> include
     * <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or
     * <code>CANCELLED</code>.
     * </p>
     */
    private String queryStatus;

    /**
     * <p>
     * The ARN (or the ID suffix of the ARN) of an event data store on which queries were run.
     * </p>
     * 
     * @param eventDataStore
     *        The ARN (or the ID suffix of the ARN) of an event data store on which queries were run.
     */

    public void setEventDataStore(String eventDataStore) {
        this.eventDataStore = eventDataStore;
    }

    /**
     * <p>
     * The ARN (or the ID suffix of the ARN) of an event data store on which queries were run.
     * </p>
     * 
     * @return The ARN (or the ID suffix of the ARN) of an event data store on which queries were run.
     */

    public String getEventDataStore() {
        return this.eventDataStore;
    }

    /**
     * <p>
     * The ARN (or the ID suffix of the ARN) of an event data store on which queries were run.
     * </p>
     * 
     * @param eventDataStore
     *        The ARN (or the ID suffix of the ARN) of an event data store on which queries were run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueriesRequest withEventDataStore(String eventDataStore) {
        setEventDataStore(eventDataStore);
        return this;
    }

    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     * 
     * @return A token you can use to get the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueriesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of queries to show on a page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of queries to show on a page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of queries to show on a page.
     * </p>
     * 
     * @return The maximum number of queries to show on a page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of queries to show on a page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of queries to show on a page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueriesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Use with <code>EndTime</code> to bound a <code>ListQueries</code> request, and limit its results to only those
     * queries run within a specified time period.
     * </p>
     * 
     * @param startTime
     *        Use with <code>EndTime</code> to bound a <code>ListQueries</code> request, and limit its results to only
     *        those queries run within a specified time period.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Use with <code>EndTime</code> to bound a <code>ListQueries</code> request, and limit its results to only those
     * queries run within a specified time period.
     * </p>
     * 
     * @return Use with <code>EndTime</code> to bound a <code>ListQueries</code> request, and limit its results to only
     *         those queries run within a specified time period.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Use with <code>EndTime</code> to bound a <code>ListQueries</code> request, and limit its results to only those
     * queries run within a specified time period.
     * </p>
     * 
     * @param startTime
     *        Use with <code>EndTime</code> to bound a <code>ListQueries</code> request, and limit its results to only
     *        those queries run within a specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueriesRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Use with <code>StartTime</code> to bound a <code>ListQueries</code> request, and limit its results to only those
     * queries run within a specified time period.
     * </p>
     * 
     * @param endTime
     *        Use with <code>StartTime</code> to bound a <code>ListQueries</code> request, and limit its results to only
     *        those queries run within a specified time period.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Use with <code>StartTime</code> to bound a <code>ListQueries</code> request, and limit its results to only those
     * queries run within a specified time period.
     * </p>
     * 
     * @return Use with <code>StartTime</code> to bound a <code>ListQueries</code> request, and limit its results to
     *         only those queries run within a specified time period.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Use with <code>StartTime</code> to bound a <code>ListQueries</code> request, and limit its results to only those
     * queries run within a specified time period.
     * </p>
     * 
     * @param endTime
     *        Use with <code>StartTime</code> to bound a <code>ListQueries</code> request, and limit its results to only
     *        those queries run within a specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueriesRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The status of queries that you want to return in results. Valid values for <code>QueryStatus</code> include
     * <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or
     * <code>CANCELLED</code>.
     * </p>
     * 
     * @param queryStatus
     *        The status of queries that you want to return in results. Valid values for <code>QueryStatus</code>
     *        include <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>,
     *        <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * @see QueryStatus
     */

    public void setQueryStatus(String queryStatus) {
        this.queryStatus = queryStatus;
    }

    /**
     * <p>
     * The status of queries that you want to return in results. Valid values for <code>QueryStatus</code> include
     * <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or
     * <code>CANCELLED</code>.
     * </p>
     * 
     * @return The status of queries that you want to return in results. Valid values for <code>QueryStatus</code>
     *         include <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>,
     *         <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * @see QueryStatus
     */

    public String getQueryStatus() {
        return this.queryStatus;
    }

    /**
     * <p>
     * The status of queries that you want to return in results. Valid values for <code>QueryStatus</code> include
     * <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or
     * <code>CANCELLED</code>.
     * </p>
     * 
     * @param queryStatus
     *        The status of queries that you want to return in results. Valid values for <code>QueryStatus</code>
     *        include <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>,
     *        <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public ListQueriesRequest withQueryStatus(String queryStatus) {
        setQueryStatus(queryStatus);
        return this;
    }

    /**
     * <p>
     * The status of queries that you want to return in results. Valid values for <code>QueryStatus</code> include
     * <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or
     * <code>CANCELLED</code>.
     * </p>
     * 
     * @param queryStatus
     *        The status of queries that you want to return in results. Valid values for <code>QueryStatus</code>
     *        include <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>,
     *        <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public ListQueriesRequest withQueryStatus(QueryStatus queryStatus) {
        this.queryStatus = queryStatus.toString();
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
        if (getEventDataStore() != null)
            sb.append("EventDataStore: ").append(getEventDataStore()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getQueryStatus() != null)
            sb.append("QueryStatus: ").append(getQueryStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListQueriesRequest == false)
            return false;
        ListQueriesRequest other = (ListQueriesRequest) obj;
        if (other.getEventDataStore() == null ^ this.getEventDataStore() == null)
            return false;
        if (other.getEventDataStore() != null && other.getEventDataStore().equals(this.getEventDataStore()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getQueryStatus() == null ^ this.getQueryStatus() == null)
            return false;
        if (other.getQueryStatus() != null && other.getQueryStatus().equals(this.getQueryStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventDataStore() == null) ? 0 : getEventDataStore().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getQueryStatus() == null) ? 0 : getQueryStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListQueriesRequest clone() {
        return (ListQueriesRequest) super.clone();
    }

}
