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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryTasks" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataRepositoryTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) IDs of the tasks whose descriptions you want to retrieve (String).
     * </p>
     */
    private java.util.List<String> taskIds;
    /**
     * <p>
     * (Optional) You can use filters to narrow the <code>DescribeDataRepositoryTasks</code> response to include just
     * tasks for specific file systems, or tasks in a specific lifecycle state.
     * </p>
     */
    private java.util.List<DataRepositoryTaskFilter> filters;

    private Integer maxResults;

    private String nextToken;

    /**
     * <p>
     * (Optional) IDs of the tasks whose descriptions you want to retrieve (String).
     * </p>
     * 
     * @return (Optional) IDs of the tasks whose descriptions you want to retrieve (String).
     */

    public java.util.List<String> getTaskIds() {
        return taskIds;
    }

    /**
     * <p>
     * (Optional) IDs of the tasks whose descriptions you want to retrieve (String).
     * </p>
     * 
     * @param taskIds
     *        (Optional) IDs of the tasks whose descriptions you want to retrieve (String).
     */

    public void setTaskIds(java.util.Collection<String> taskIds) {
        if (taskIds == null) {
            this.taskIds = null;
            return;
        }

        this.taskIds = new java.util.ArrayList<String>(taskIds);
    }

    /**
     * <p>
     * (Optional) IDs of the tasks whose descriptions you want to retrieve (String).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskIds(java.util.Collection)} or {@link #withTaskIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param taskIds
     *        (Optional) IDs of the tasks whose descriptions you want to retrieve (String).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryTasksRequest withTaskIds(String... taskIds) {
        if (this.taskIds == null) {
            setTaskIds(new java.util.ArrayList<String>(taskIds.length));
        }
        for (String ele : taskIds) {
            this.taskIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) IDs of the tasks whose descriptions you want to retrieve (String).
     * </p>
     * 
     * @param taskIds
     *        (Optional) IDs of the tasks whose descriptions you want to retrieve (String).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryTasksRequest withTaskIds(java.util.Collection<String> taskIds) {
        setTaskIds(taskIds);
        return this;
    }

    /**
     * <p>
     * (Optional) You can use filters to narrow the <code>DescribeDataRepositoryTasks</code> response to include just
     * tasks for specific file systems, or tasks in a specific lifecycle state.
     * </p>
     * 
     * @return (Optional) You can use filters to narrow the <code>DescribeDataRepositoryTasks</code> response to include
     *         just tasks for specific file systems, or tasks in a specific lifecycle state.
     */

    public java.util.List<DataRepositoryTaskFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * (Optional) You can use filters to narrow the <code>DescribeDataRepositoryTasks</code> response to include just
     * tasks for specific file systems, or tasks in a specific lifecycle state.
     * </p>
     * 
     * @param filters
     *        (Optional) You can use filters to narrow the <code>DescribeDataRepositoryTasks</code> response to include
     *        just tasks for specific file systems, or tasks in a specific lifecycle state.
     */

    public void setFilters(java.util.Collection<DataRepositoryTaskFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<DataRepositoryTaskFilter>(filters);
    }

    /**
     * <p>
     * (Optional) You can use filters to narrow the <code>DescribeDataRepositoryTasks</code> response to include just
     * tasks for specific file systems, or tasks in a specific lifecycle state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        (Optional) You can use filters to narrow the <code>DescribeDataRepositoryTasks</code> response to include
     *        just tasks for specific file systems, or tasks in a specific lifecycle state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryTasksRequest withFilters(DataRepositoryTaskFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<DataRepositoryTaskFilter>(filters.length));
        }
        for (DataRepositoryTaskFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) You can use filters to narrow the <code>DescribeDataRepositoryTasks</code> response to include just
     * tasks for specific file systems, or tasks in a specific lifecycle state.
     * </p>
     * 
     * @param filters
     *        (Optional) You can use filters to narrow the <code>DescribeDataRepositoryTasks</code> response to include
     *        just tasks for specific file systems, or tasks in a specific lifecycle state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryTasksRequest withFilters(java.util.Collection<DataRepositoryTaskFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getTaskIds() != null)
            sb.append("TaskIds: ").append(getTaskIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDataRepositoryTasksRequest == false)
            return false;
        DescribeDataRepositoryTasksRequest other = (DescribeDataRepositoryTasksRequest) obj;
        if (other.getTaskIds() == null ^ this.getTaskIds() == null)
            return false;
        if (other.getTaskIds() != null && other.getTaskIds().equals(this.getTaskIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskIds() == null) ? 0 : getTaskIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDataRepositoryTasksRequest clone() {
        return (DescribeDataRepositoryTasksRequest) super.clone();
    }

}
