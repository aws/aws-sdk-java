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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListBatchLoadTasks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBatchLoadTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of items to return in the output. If the total number of items available is more than the value
     * specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value as argument
     * of a subsequent API invocation.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Status of the batch load task.
     * </p>
     */
    private String taskStatus;

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @return A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchLoadTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of items to return in the output. If the total number of items available is more than the value
     * specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value as argument
     * of a subsequent API invocation.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return in the output. If the total number of items available is more than the
     *        value specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value
     *        as argument of a subsequent API invocation.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of items to return in the output. If the total number of items available is more than the value
     * specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value as argument
     * of a subsequent API invocation.
     * </p>
     * 
     * @return The total number of items to return in the output. If the total number of items available is more than
     *         the value specified, a NextToken is provided in the output. To resume pagination, provide the NextToken
     *         value as argument of a subsequent API invocation.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of items to return in the output. If the total number of items available is more than the value
     * specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value as argument
     * of a subsequent API invocation.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return in the output. If the total number of items available is more than the
     *        value specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value
     *        as argument of a subsequent API invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchLoadTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Status of the batch load task.
     * </p>
     * 
     * @param taskStatus
     *        Status of the batch load task.
     * @see BatchLoadStatus
     */

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * Status of the batch load task.
     * </p>
     * 
     * @return Status of the batch load task.
     * @see BatchLoadStatus
     */

    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * <p>
     * Status of the batch load task.
     * </p>
     * 
     * @param taskStatus
     *        Status of the batch load task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchLoadStatus
     */

    public ListBatchLoadTasksRequest withTaskStatus(String taskStatus) {
        setTaskStatus(taskStatus);
        return this;
    }

    /**
     * <p>
     * Status of the batch load task.
     * </p>
     * 
     * @param taskStatus
     *        Status of the batch load task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchLoadStatus
     */

    public ListBatchLoadTasksRequest withTaskStatus(BatchLoadStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getTaskStatus() != null)
            sb.append("TaskStatus: ").append(getTaskStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBatchLoadTasksRequest == false)
            return false;
        ListBatchLoadTasksRequest other = (ListBatchLoadTasksRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListBatchLoadTasksRequest clone() {
        return (ListBatchLoadTasksRequest) super.clone();
    }

}
