/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeExportTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Export task that matches the specified task Id will be returned. This can result in zero or one export task.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * All export tasks that matches the specified status code will be returned. This can return zero or more export
     * tasks.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * response of the previous <code>DescribeExportTasks</code> request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items returned in the response. If you don't specify a value, the request would return up
     * to 50 items.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * Export task that matches the specified task Id will be returned. This can result in zero or one export task.
     * </p>
     * 
     * @param taskId
     *        Export task that matches the specified task Id will be returned. This can result in zero or one export
     *        task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * Export task that matches the specified task Id will be returned. This can result in zero or one export task.
     * </p>
     * 
     * @return Export task that matches the specified task Id will be returned. This can result in zero or one export
     *         task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * Export task that matches the specified task Id will be returned. This can result in zero or one export task.
     * </p>
     * 
     * @param taskId
     *        Export task that matches the specified task Id will be returned. This can result in zero or one export
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * All export tasks that matches the specified status code will be returned. This can return zero or more export
     * tasks.
     * </p>
     * 
     * @param statusCode
     *        All export tasks that matches the specified status code will be returned. This can return zero or more
     *        export tasks.
     * @see ExportTaskStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * All export tasks that matches the specified status code will be returned. This can return zero or more export
     * tasks.
     * </p>
     * 
     * @return All export tasks that matches the specified status code will be returned. This can return zero or more
     *         export tasks.
     * @see ExportTaskStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * All export tasks that matches the specified status code will be returned. This can return zero or more export
     * tasks.
     * </p>
     * 
     * @param statusCode
     *        All export tasks that matches the specified status code will be returned. This can return zero or more
     *        export tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportTaskStatusCode
     */

    public DescribeExportTasksRequest withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * All export tasks that matches the specified status code will be returned. This can return zero or more export
     * tasks.
     * </p>
     * 
     * @param statusCode
     *        All export tasks that matches the specified status code will be returned. This can return zero or more
     *        export tasks.
     * @see ExportTaskStatusCode
     */

    public void setStatusCode(ExportTaskStatusCode statusCode) {
        this.statusCode = statusCode.toString();
    }

    /**
     * <p>
     * All export tasks that matches the specified status code will be returned. This can return zero or more export
     * tasks.
     * </p>
     * 
     * @param statusCode
     *        All export tasks that matches the specified status code will be returned. This can return zero or more
     *        export tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportTaskStatusCode
     */

    public DescribeExportTasksRequest withStatusCode(ExportTaskStatusCode statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * response of the previous <code>DescribeExportTasks</code> request.
     * </p>
     * 
     * @param nextToken
     *        A string token used for pagination that points to the next page of results. It must be a value obtained
     *        from the response of the previous <code>DescribeExportTasks</code> request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * response of the previous <code>DescribeExportTasks</code> request.
     * </p>
     * 
     * @return A string token used for pagination that points to the next page of results. It must be a value obtained
     *         from the response of the previous <code>DescribeExportTasks</code> request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * response of the previous <code>DescribeExportTasks</code> request.
     * </p>
     * 
     * @param nextToken
     *        A string token used for pagination that points to the next page of results. It must be a value obtained
     *        from the response of the previous <code>DescribeExportTasks</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items returned in the response. If you don't specify a value, the request would return up
     * to 50 items.
     * </p>
     * 
     * @param limit
     *        The maximum number of items returned in the response. If you don't specify a value, the request would
     *        return up to 50 items.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items returned in the response. If you don't specify a value, the request would return up
     * to 50 items.
     * </p>
     * 
     * @return The maximum number of items returned in the response. If you don't specify a value, the request would
     *         return up to 50 items.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items returned in the response. If you don't specify a value, the request would return up
     * to 50 items.
     * </p>
     * 
     * @param limit
     *        The maximum number of items returned in the response. If you don't specify a value, the request would
     *        return up to 50 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTaskId() != null)
            sb.append("TaskId: " + getTaskId() + ",");
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExportTasksRequest == false)
            return false;
        DescribeExportTasksRequest other = (DescribeExportTasksRequest) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExportTasksRequest clone() {
        return (DescribeExportTasksRequest) super.clone();
    }
}
