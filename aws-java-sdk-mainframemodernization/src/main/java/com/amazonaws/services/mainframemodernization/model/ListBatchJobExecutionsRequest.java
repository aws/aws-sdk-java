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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListBatchJobExecutions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBatchJobExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The unique identifier of each batch job execution.
     * </p>
     */
    private java.util.List<String> executionIds;
    /**
     * <p>
     * The name of each batch job execution.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The maximum number of batch job executions to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A pagination token to control the number of batch job executions displayed in the list.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The time after which the batch job executions started.
     * </p>
     */
    private java.util.Date startedAfter;
    /**
     * <p>
     * The time before the batch job executions started.
     * </p>
     */
    private java.util.Date startedBefore;
    /**
     * <p>
     * The status of the batch job executions.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @return The unique identifier of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobExecutionsRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of each batch job execution.
     * </p>
     * 
     * @return The unique identifier of each batch job execution.
     */

    public java.util.List<String> getExecutionIds() {
        return executionIds;
    }

    /**
     * <p>
     * The unique identifier of each batch job execution.
     * </p>
     * 
     * @param executionIds
     *        The unique identifier of each batch job execution.
     */

    public void setExecutionIds(java.util.Collection<String> executionIds) {
        if (executionIds == null) {
            this.executionIds = null;
            return;
        }

        this.executionIds = new java.util.ArrayList<String>(executionIds);
    }

    /**
     * <p>
     * The unique identifier of each batch job execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExecutionIds(java.util.Collection)} or {@link #withExecutionIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param executionIds
     *        The unique identifier of each batch job execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobExecutionsRequest withExecutionIds(String... executionIds) {
        if (this.executionIds == null) {
            setExecutionIds(new java.util.ArrayList<String>(executionIds.length));
        }
        for (String ele : executionIds) {
            this.executionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifier of each batch job execution.
     * </p>
     * 
     * @param executionIds
     *        The unique identifier of each batch job execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobExecutionsRequest withExecutionIds(java.util.Collection<String> executionIds) {
        setExecutionIds(executionIds);
        return this;
    }

    /**
     * <p>
     * The name of each batch job execution.
     * </p>
     * 
     * @param jobName
     *        The name of each batch job execution.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of each batch job execution.
     * </p>
     * 
     * @return The name of each batch job execution.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of each batch job execution.
     * </p>
     * 
     * @param jobName
     *        The name of each batch job execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobExecutionsRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The maximum number of batch job executions to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of batch job executions to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of batch job executions to return.
     * </p>
     * 
     * @return The maximum number of batch job executions to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of batch job executions to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of batch job executions to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobExecutionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A pagination token to control the number of batch job executions displayed in the list.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to control the number of batch job executions displayed in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token to control the number of batch job executions displayed in the list.
     * </p>
     * 
     * @return A pagination token to control the number of batch job executions displayed in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token to control the number of batch job executions displayed in the list.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to control the number of batch job executions displayed in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobExecutionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The time after which the batch job executions started.
     * </p>
     * 
     * @param startedAfter
     *        The time after which the batch job executions started.
     */

    public void setStartedAfter(java.util.Date startedAfter) {
        this.startedAfter = startedAfter;
    }

    /**
     * <p>
     * The time after which the batch job executions started.
     * </p>
     * 
     * @return The time after which the batch job executions started.
     */

    public java.util.Date getStartedAfter() {
        return this.startedAfter;
    }

    /**
     * <p>
     * The time after which the batch job executions started.
     * </p>
     * 
     * @param startedAfter
     *        The time after which the batch job executions started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobExecutionsRequest withStartedAfter(java.util.Date startedAfter) {
        setStartedAfter(startedAfter);
        return this;
    }

    /**
     * <p>
     * The time before the batch job executions started.
     * </p>
     * 
     * @param startedBefore
     *        The time before the batch job executions started.
     */

    public void setStartedBefore(java.util.Date startedBefore) {
        this.startedBefore = startedBefore;
    }

    /**
     * <p>
     * The time before the batch job executions started.
     * </p>
     * 
     * @return The time before the batch job executions started.
     */

    public java.util.Date getStartedBefore() {
        return this.startedBefore;
    }

    /**
     * <p>
     * The time before the batch job executions started.
     * </p>
     * 
     * @param startedBefore
     *        The time before the batch job executions started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobExecutionsRequest withStartedBefore(java.util.Date startedBefore) {
        setStartedBefore(startedBefore);
        return this;
    }

    /**
     * <p>
     * The status of the batch job executions.
     * </p>
     * 
     * @param status
     *        The status of the batch job executions.
     * @see BatchJobExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the batch job executions.
     * </p>
     * 
     * @return The status of the batch job executions.
     * @see BatchJobExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the batch job executions.
     * </p>
     * 
     * @param status
     *        The status of the batch job executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchJobExecutionStatus
     */

    public ListBatchJobExecutionsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the batch job executions.
     * </p>
     * 
     * @param status
     *        The status of the batch job executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchJobExecutionStatus
     */

    public ListBatchJobExecutionsRequest withStatus(BatchJobExecutionStatus status) {
        this.status = status.toString();
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getExecutionIds() != null)
            sb.append("ExecutionIds: ").append(getExecutionIds()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStartedAfter() != null)
            sb.append("StartedAfter: ").append(getStartedAfter()).append(",");
        if (getStartedBefore() != null)
            sb.append("StartedBefore: ").append(getStartedBefore()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBatchJobExecutionsRequest == false)
            return false;
        ListBatchJobExecutionsRequest other = (ListBatchJobExecutionsRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getExecutionIds() == null ^ this.getExecutionIds() == null)
            return false;
        if (other.getExecutionIds() != null && other.getExecutionIds().equals(this.getExecutionIds()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStartedAfter() == null ^ this.getStartedAfter() == null)
            return false;
        if (other.getStartedAfter() != null && other.getStartedAfter().equals(this.getStartedAfter()) == false)
            return false;
        if (other.getStartedBefore() == null ^ this.getStartedBefore() == null)
            return false;
        if (other.getStartedBefore() != null && other.getStartedBefore().equals(this.getStartedBefore()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getExecutionIds() == null) ? 0 : getExecutionIds().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStartedAfter() == null) ? 0 : getStartedAfter().hashCode());
        hashCode = prime * hashCode + ((getStartedBefore() == null) ? 0 : getStartedBefore().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListBatchJobExecutionsRequest clone() {
        return (ListBatchJobExecutionsRequest) super.clone();
    }

}
