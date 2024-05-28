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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDataSourceSyncJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataSourceSyncJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the data source.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the index used with the Amazon Q Business data source connector.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * If the <code>maxResults</code> response was incpmplete because there is more data to retriever, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * responses.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of synchronization jobs to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The start time of the data source connector sync.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the data source connector sync.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Only returns synchronization jobs with the <code>Status</code> field equal to the specified status.
     * </p>
     */
    private String statusFilter;

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source connector.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @return The identifier of the data source connector.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceSyncJobsRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the data source.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application connected to the data source.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the data source.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application connected to the data source.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the data source.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application connected to the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceSyncJobsRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the index used with the Amazon Q Business data source connector.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index used with the Amazon Q Business data source connector.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index used with the Amazon Q Business data source connector.
     * </p>
     * 
     * @return The identifier of the index used with the Amazon Q Business data source connector.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index used with the Amazon Q Business data source connector.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index used with the Amazon Q Business data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceSyncJobsRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * If the <code>maxResults</code> response was incpmplete because there is more data to retriever, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * responses.
     * </p>
     * 
     * @param nextToken
     *        If the <code>maxResults</code> response was incpmplete because there is more data to retriever, Amazon Q
     *        Business returns a pagination token in the response. You can use this pagination token to retrieve the
     *        next set of responses.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the <code>maxResults</code> response was incpmplete because there is more data to retriever, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * responses.
     * </p>
     * 
     * @return If the <code>maxResults</code> response was incpmplete because there is more data to retriever, Amazon Q
     *         Business returns a pagination token in the response. You can use this pagination token to retrieve the
     *         next set of responses.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the <code>maxResults</code> response was incpmplete because there is more data to retriever, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * responses.
     * </p>
     * 
     * @param nextToken
     *        If the <code>maxResults</code> response was incpmplete because there is more data to retriever, Amazon Q
     *        Business returns a pagination token in the response. You can use this pagination token to retrieve the
     *        next set of responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceSyncJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of synchronization jobs to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of synchronization jobs to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of synchronization jobs to return in the response.
     * </p>
     * 
     * @return The maximum number of synchronization jobs to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of synchronization jobs to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of synchronization jobs to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceSyncJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The start time of the data source connector sync.
     * </p>
     * 
     * @param startTime
     *        The start time of the data source connector sync.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the data source connector sync.
     * </p>
     * 
     * @return The start time of the data source connector sync.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the data source connector sync.
     * </p>
     * 
     * @param startTime
     *        The start time of the data source connector sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceSyncJobsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the data source connector sync.
     * </p>
     * 
     * @param endTime
     *        The end time of the data source connector sync.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the data source connector sync.
     * </p>
     * 
     * @return The end time of the data source connector sync.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the data source connector sync.
     * </p>
     * 
     * @param endTime
     *        The end time of the data source connector sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceSyncJobsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Only returns synchronization jobs with the <code>Status</code> field equal to the specified status.
     * </p>
     * 
     * @param statusFilter
     *        Only returns synchronization jobs with the <code>Status</code> field equal to the specified status.
     * @see DataSourceSyncJobStatus
     */

    public void setStatusFilter(String statusFilter) {
        this.statusFilter = statusFilter;
    }

    /**
     * <p>
     * Only returns synchronization jobs with the <code>Status</code> field equal to the specified status.
     * </p>
     * 
     * @return Only returns synchronization jobs with the <code>Status</code> field equal to the specified status.
     * @see DataSourceSyncJobStatus
     */

    public String getStatusFilter() {
        return this.statusFilter;
    }

    /**
     * <p>
     * Only returns synchronization jobs with the <code>Status</code> field equal to the specified status.
     * </p>
     * 
     * @param statusFilter
     *        Only returns synchronization jobs with the <code>Status</code> field equal to the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceSyncJobStatus
     */

    public ListDataSourceSyncJobsRequest withStatusFilter(String statusFilter) {
        setStatusFilter(statusFilter);
        return this;
    }

    /**
     * <p>
     * Only returns synchronization jobs with the <code>Status</code> field equal to the specified status.
     * </p>
     * 
     * @param statusFilter
     *        Only returns synchronization jobs with the <code>Status</code> field equal to the specified status.
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
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
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
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
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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

        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatusFilter() == null) ? 0 : getStatusFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListDataSourceSyncJobsRequest clone() {
        return (ListDataSourceSyncJobsRequest) super.clone();
    }

}
