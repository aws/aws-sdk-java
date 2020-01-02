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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListDataSourceSyncJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataSourceSyncJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * If the result of the previous request to <code>GetDataSourceSyncJobHistory</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of synchronization jobs to return in the response. If there are fewer results in the list,
     * this response contains only the actual results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When specified, the synchronization jobs returned in the list are limited to jobs between the specified dates.
     * </p>
     */
    private TimeRange startTimeFilter;
    /**
     * <p>
     * When specified, only returns synchronization jobs with the <code>Status</code> field equal to the specified
     * status.
     * </p>
     */
    private String statusFilter;

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * 
     * @param id
     *        The identifier of the data source.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * 
     * @return The identifier of the data source.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * 
     * @param id
     *        The identifier of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceSyncJobsRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that contains the data source.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     * 
     * @return The identifier of the index that contains the data source.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that contains the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceSyncJobsRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * If the result of the previous request to <code>GetDataSourceSyncJobHistory</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous request to <code>GetDataSourceSyncJobHistory</code> was truncated, include
     *        the <code>NextToken</code> to fetch the next set of jobs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous request to <code>GetDataSourceSyncJobHistory</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     * 
     * @return If the result of the previous request to <code>GetDataSourceSyncJobHistory</code> was truncated, include
     *         the <code>NextToken</code> to fetch the next set of jobs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous request to <code>GetDataSourceSyncJobHistory</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous request to <code>GetDataSourceSyncJobHistory</code> was truncated, include
     *        the <code>NextToken</code> to fetch the next set of jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceSyncJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of synchronization jobs to return in the response. If there are fewer results in the list,
     * this response contains only the actual results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of synchronization jobs to return in the response. If there are fewer results in the
     *        list, this response contains only the actual results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of synchronization jobs to return in the response. If there are fewer results in the list,
     * this response contains only the actual results.
     * </p>
     * 
     * @return The maximum number of synchronization jobs to return in the response. If there are fewer results in the
     *         list, this response contains only the actual results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of synchronization jobs to return in the response. If there are fewer results in the list,
     * this response contains only the actual results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of synchronization jobs to return in the response. If there are fewer results in the
     *        list, this response contains only the actual results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceSyncJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When specified, the synchronization jobs returned in the list are limited to jobs between the specified dates.
     * </p>
     * 
     * @param startTimeFilter
     *        When specified, the synchronization jobs returned in the list are limited to jobs between the specified
     *        dates.
     */

    public void setStartTimeFilter(TimeRange startTimeFilter) {
        this.startTimeFilter = startTimeFilter;
    }

    /**
     * <p>
     * When specified, the synchronization jobs returned in the list are limited to jobs between the specified dates.
     * </p>
     * 
     * @return When specified, the synchronization jobs returned in the list are limited to jobs between the specified
     *         dates.
     */

    public TimeRange getStartTimeFilter() {
        return this.startTimeFilter;
    }

    /**
     * <p>
     * When specified, the synchronization jobs returned in the list are limited to jobs between the specified dates.
     * </p>
     * 
     * @param startTimeFilter
     *        When specified, the synchronization jobs returned in the list are limited to jobs between the specified
     *        dates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceSyncJobsRequest withStartTimeFilter(TimeRange startTimeFilter) {
        setStartTimeFilter(startTimeFilter);
        return this;
    }

    /**
     * <p>
     * When specified, only returns synchronization jobs with the <code>Status</code> field equal to the specified
     * status.
     * </p>
     * 
     * @param statusFilter
     *        When specified, only returns synchronization jobs with the <code>Status</code> field equal to the
     *        specified status.
     * @see DataSourceSyncJobStatus
     */

    public void setStatusFilter(String statusFilter) {
        this.statusFilter = statusFilter;
    }

    /**
     * <p>
     * When specified, only returns synchronization jobs with the <code>Status</code> field equal to the specified
     * status.
     * </p>
     * 
     * @return When specified, only returns synchronization jobs with the <code>Status</code> field equal to the
     *         specified status.
     * @see DataSourceSyncJobStatus
     */

    public String getStatusFilter() {
        return this.statusFilter;
    }

    /**
     * <p>
     * When specified, only returns synchronization jobs with the <code>Status</code> field equal to the specified
     * status.
     * </p>
     * 
     * @param statusFilter
     *        When specified, only returns synchronization jobs with the <code>Status</code> field equal to the
     *        specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceSyncJobStatus
     */

    public ListDataSourceSyncJobsRequest withStatusFilter(String statusFilter) {
        setStatusFilter(statusFilter);
        return this;
    }

    /**
     * <p>
     * When specified, only returns synchronization jobs with the <code>Status</code> field equal to the specified
     * status.
     * </p>
     * 
     * @param statusFilter
     *        When specified, only returns synchronization jobs with the <code>Status</code> field equal to the
     *        specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceSyncJobStatus
     */

    public ListDataSourceSyncJobsRequest withStatusFilter(DataSourceSyncJobStatus statusFilter) {
        this.statusFilter = statusFilter.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStartTimeFilter() != null)
            sb.append("StartTimeFilter: ").append(getStartTimeFilter()).append(",");
        if (getStatusFilter() != null)
            sb.append("StatusFilter: ").append(getStatusFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDataSourceSyncJobsRequest == false)
            return false;
        ListDataSourceSyncJobsRequest other = (ListDataSourceSyncJobsRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStartTimeFilter() == null ^ this.getStartTimeFilter() == null)
            return false;
        if (other.getStartTimeFilter() != null && other.getStartTimeFilter().equals(this.getStartTimeFilter()) == false)
            return false;
        if (other.getStatusFilter() == null ^ this.getStatusFilter() == null)
            return false;
        if (other.getStatusFilter() != null && other.getStatusFilter().equals(this.getStatusFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStartTimeFilter() == null) ? 0 : getStartTimeFilter().hashCode());
        hashCode = prime * hashCode + ((getStatusFilter() == null) ? 0 : getStatusFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListDataSourceSyncJobsRequest clone() {
        return (ListDataSourceSyncJobsRequest) super.clone();
    }

}
