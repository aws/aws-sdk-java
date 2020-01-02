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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListMonitoringExecutions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMonitoringExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of a specific schedule to fetch jobs for.
     * </p>
     */
    private String monitoringScheduleName;
    /**
     * <p>
     * Name of a specific endpoint to fetch jobs for.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * Whether to sort results by <code>Status</code>, <code>CreationTime</code>, <code>ScheduledTime</code> field. The
     * default is <code>CreationTime</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     * <code>Descending</code>.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next
     * request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of jobs to return in the response. The default value is 10.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Filter for jobs scheduled before a specified time.
     * </p>
     */
    private java.util.Date scheduledTimeBefore;
    /**
     * <p>
     * Filter for jobs scheduled after a specified time.
     * </p>
     */
    private java.util.Date scheduledTimeAfter;
    /**
     * <p>
     * A filter that returns only jobs created before a specified time.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * A filter that returns only jobs created after a specified time.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * A filter that returns only jobs modified after a specified time.
     * </p>
     */
    private java.util.Date lastModifiedTimeBefore;
    /**
     * <p>
     * A filter that returns only jobs modified before a specified time.
     * </p>
     */
    private java.util.Date lastModifiedTimeAfter;
    /**
     * <p>
     * A filter that retrieves only jobs with a specific status.
     * </p>
     */
    private String statusEquals;

    /**
     * <p>
     * Name of a specific schedule to fetch jobs for.
     * </p>
     * 
     * @param monitoringScheduleName
     *        Name of a specific schedule to fetch jobs for.
     */

    public void setMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
    }

    /**
     * <p>
     * Name of a specific schedule to fetch jobs for.
     * </p>
     * 
     * @return Name of a specific schedule to fetch jobs for.
     */

    public String getMonitoringScheduleName() {
        return this.monitoringScheduleName;
    }

    /**
     * <p>
     * Name of a specific schedule to fetch jobs for.
     * </p>
     * 
     * @param monitoringScheduleName
     *        Name of a specific schedule to fetch jobs for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringExecutionsRequest withMonitoringScheduleName(String monitoringScheduleName) {
        setMonitoringScheduleName(monitoringScheduleName);
        return this;
    }

    /**
     * <p>
     * Name of a specific endpoint to fetch jobs for.
     * </p>
     * 
     * @param endpointName
     *        Name of a specific endpoint to fetch jobs for.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * Name of a specific endpoint to fetch jobs for.
     * </p>
     * 
     * @return Name of a specific endpoint to fetch jobs for.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * Name of a specific endpoint to fetch jobs for.
     * </p>
     * 
     * @param endpointName
     *        Name of a specific endpoint to fetch jobs for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringExecutionsRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * Whether to sort results by <code>Status</code>, <code>CreationTime</code>, <code>ScheduledTime</code> field. The
     * default is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        Whether to sort results by <code>Status</code>, <code>CreationTime</code>, <code>ScheduledTime</code>
     *        field. The default is <code>CreationTime</code>.
     * @see MonitoringExecutionSortKey
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Whether to sort results by <code>Status</code>, <code>CreationTime</code>, <code>ScheduledTime</code> field. The
     * default is <code>CreationTime</code>.
     * </p>
     * 
     * @return Whether to sort results by <code>Status</code>, <code>CreationTime</code>, <code>ScheduledTime</code>
     *         field. The default is <code>CreationTime</code>.
     * @see MonitoringExecutionSortKey
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Whether to sort results by <code>Status</code>, <code>CreationTime</code>, <code>ScheduledTime</code> field. The
     * default is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        Whether to sort results by <code>Status</code>, <code>CreationTime</code>, <code>ScheduledTime</code>
     *        field. The default is <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitoringExecutionSortKey
     */

    public ListMonitoringExecutionsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Whether to sort results by <code>Status</code>, <code>CreationTime</code>, <code>ScheduledTime</code> field. The
     * default is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        Whether to sort results by <code>Status</code>, <code>CreationTime</code>, <code>ScheduledTime</code>
     *        field. The default is <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitoringExecutionSortKey
     */

    public ListMonitoringExecutionsRequest withSortBy(MonitoringExecutionSortKey sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     * <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     *        <code>Descending</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     * <code>Descending</code>.
     * </p>
     * 
     * @return Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     *         <code>Descending</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     * <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     *        <code>Descending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListMonitoringExecutionsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     * <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     *        <code>Descending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListMonitoringExecutionsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next
     * request.
     * </p>
     * 
     * @param nextToken
     *        The token returned if the response is truncated. To retrieve the next set of job executions, use it in the
     *        next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next
     * request.
     * </p>
     * 
     * @return The token returned if the response is truncated. To retrieve the next set of job executions, use it in
     *         the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next
     * request.
     * </p>
     * 
     * @param nextToken
     *        The token returned if the response is truncated. To retrieve the next set of job executions, use it in the
     *        next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringExecutionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of jobs to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of jobs to return in the response. The default value is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of jobs to return in the response. The default value is 10.
     * </p>
     * 
     * @return The maximum number of jobs to return in the response. The default value is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of jobs to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of jobs to return in the response. The default value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringExecutionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filter for jobs scheduled before a specified time.
     * </p>
     * 
     * @param scheduledTimeBefore
     *        Filter for jobs scheduled before a specified time.
     */

    public void setScheduledTimeBefore(java.util.Date scheduledTimeBefore) {
        this.scheduledTimeBefore = scheduledTimeBefore;
    }

    /**
     * <p>
     * Filter for jobs scheduled before a specified time.
     * </p>
     * 
     * @return Filter for jobs scheduled before a specified time.
     */

    public java.util.Date getScheduledTimeBefore() {
        return this.scheduledTimeBefore;
    }

    /**
     * <p>
     * Filter for jobs scheduled before a specified time.
     * </p>
     * 
     * @param scheduledTimeBefore
     *        Filter for jobs scheduled before a specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringExecutionsRequest withScheduledTimeBefore(java.util.Date scheduledTimeBefore) {
        setScheduledTimeBefore(scheduledTimeBefore);
        return this;
    }

    /**
     * <p>
     * Filter for jobs scheduled after a specified time.
     * </p>
     * 
     * @param scheduledTimeAfter
     *        Filter for jobs scheduled after a specified time.
     */

    public void setScheduledTimeAfter(java.util.Date scheduledTimeAfter) {
        this.scheduledTimeAfter = scheduledTimeAfter;
    }

    /**
     * <p>
     * Filter for jobs scheduled after a specified time.
     * </p>
     * 
     * @return Filter for jobs scheduled after a specified time.
     */

    public java.util.Date getScheduledTimeAfter() {
        return this.scheduledTimeAfter;
    }

    /**
     * <p>
     * Filter for jobs scheduled after a specified time.
     * </p>
     * 
     * @param scheduledTimeAfter
     *        Filter for jobs scheduled after a specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringExecutionsRequest withScheduledTimeAfter(java.util.Date scheduledTimeAfter) {
        setScheduledTimeAfter(scheduledTimeAfter);
        return this;
    }

    /**
     * <p>
     * A filter that returns only jobs created before a specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that returns only jobs created before a specified time.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only jobs created before a specified time.
     * </p>
     * 
     * @return A filter that returns only jobs created before a specified time.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only jobs created before a specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that returns only jobs created before a specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringExecutionsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * A filter that returns only jobs created after a specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that returns only jobs created after a specified time.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only jobs created after a specified time.
     * </p>
     * 
     * @return A filter that returns only jobs created after a specified time.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only jobs created after a specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that returns only jobs created after a specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringExecutionsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * A filter that returns only jobs modified after a specified time.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        A filter that returns only jobs modified after a specified time.
     */

    public void setLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        this.lastModifiedTimeBefore = lastModifiedTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only jobs modified after a specified time.
     * </p>
     * 
     * @return A filter that returns only jobs modified after a specified time.
     */

    public java.util.Date getLastModifiedTimeBefore() {
        return this.lastModifiedTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only jobs modified after a specified time.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        A filter that returns only jobs modified after a specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringExecutionsRequest withLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        setLastModifiedTimeBefore(lastModifiedTimeBefore);
        return this;
    }

    /**
     * <p>
     * A filter that returns only jobs modified before a specified time.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        A filter that returns only jobs modified before a specified time.
     */

    public void setLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        this.lastModifiedTimeAfter = lastModifiedTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only jobs modified before a specified time.
     * </p>
     * 
     * @return A filter that returns only jobs modified before a specified time.
     */

    public java.util.Date getLastModifiedTimeAfter() {
        return this.lastModifiedTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only jobs modified before a specified time.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        A filter that returns only jobs modified before a specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringExecutionsRequest withLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        setLastModifiedTimeAfter(lastModifiedTimeAfter);
        return this;
    }

    /**
     * <p>
     * A filter that retrieves only jobs with a specific status.
     * </p>
     * 
     * @param statusEquals
     *        A filter that retrieves only jobs with a specific status.
     * @see ExecutionStatus
     */

    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * A filter that retrieves only jobs with a specific status.
     * </p>
     * 
     * @return A filter that retrieves only jobs with a specific status.
     * @see ExecutionStatus
     */

    public String getStatusEquals() {
        return this.statusEquals;
    }

    /**
     * <p>
     * A filter that retrieves only jobs with a specific status.
     * </p>
     * 
     * @param statusEquals
     *        A filter that retrieves only jobs with a specific status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public ListMonitoringExecutionsRequest withStatusEquals(String statusEquals) {
        setStatusEquals(statusEquals);
        return this;
    }

    /**
     * <p>
     * A filter that retrieves only jobs with a specific status.
     * </p>
     * 
     * @param statusEquals
     *        A filter that retrieves only jobs with a specific status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public ListMonitoringExecutionsRequest withStatusEquals(ExecutionStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
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
        if (getMonitoringScheduleName() != null)
            sb.append("MonitoringScheduleName: ").append(getMonitoringScheduleName()).append(",");
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getScheduledTimeBefore() != null)
            sb.append("ScheduledTimeBefore: ").append(getScheduledTimeBefore()).append(",");
        if (getScheduledTimeAfter() != null)
            sb.append("ScheduledTimeAfter: ").append(getScheduledTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getLastModifiedTimeBefore() != null)
            sb.append("LastModifiedTimeBefore: ").append(getLastModifiedTimeBefore()).append(",");
        if (getLastModifiedTimeAfter() != null)
            sb.append("LastModifiedTimeAfter: ").append(getLastModifiedTimeAfter()).append(",");
        if (getStatusEquals() != null)
            sb.append("StatusEquals: ").append(getStatusEquals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMonitoringExecutionsRequest == false)
            return false;
        ListMonitoringExecutionsRequest other = (ListMonitoringExecutionsRequest) obj;
        if (other.getMonitoringScheduleName() == null ^ this.getMonitoringScheduleName() == null)
            return false;
        if (other.getMonitoringScheduleName() != null && other.getMonitoringScheduleName().equals(this.getMonitoringScheduleName()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getScheduledTimeBefore() == null ^ this.getScheduledTimeBefore() == null)
            return false;
        if (other.getScheduledTimeBefore() != null && other.getScheduledTimeBefore().equals(this.getScheduledTimeBefore()) == false)
            return false;
        if (other.getScheduledTimeAfter() == null ^ this.getScheduledTimeAfter() == null)
            return false;
        if (other.getScheduledTimeAfter() != null && other.getScheduledTimeAfter().equals(this.getScheduledTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getLastModifiedTimeBefore() == null ^ this.getLastModifiedTimeBefore() == null)
            return false;
        if (other.getLastModifiedTimeBefore() != null && other.getLastModifiedTimeBefore().equals(this.getLastModifiedTimeBefore()) == false)
            return false;
        if (other.getLastModifiedTimeAfter() == null ^ this.getLastModifiedTimeAfter() == null)
            return false;
        if (other.getLastModifiedTimeAfter() != null && other.getLastModifiedTimeAfter().equals(this.getLastModifiedTimeAfter()) == false)
            return false;
        if (other.getStatusEquals() == null ^ this.getStatusEquals() == null)
            return false;
        if (other.getStatusEquals() != null && other.getStatusEquals().equals(this.getStatusEquals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoringScheduleName() == null) ? 0 : getMonitoringScheduleName().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getScheduledTimeBefore() == null) ? 0 : getScheduledTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getScheduledTimeAfter() == null) ? 0 : getScheduledTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeBefore() == null) ? 0 : getLastModifiedTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeAfter() == null) ? 0 : getLastModifiedTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
        return hashCode;
    }

    @Override
    public ListMonitoringExecutionsRequest clone() {
        return (ListMonitoringExecutionsRequest) super.clone();
    }

}
