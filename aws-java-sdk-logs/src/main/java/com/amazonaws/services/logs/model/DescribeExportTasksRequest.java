/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeExportTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExportTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the export task. Specifying a task ID filters the results to zero or one export tasks.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The status code of the export task. Specifying a status code filters the results to zero or more export tasks.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The ID of the export task. Specifying a task ID filters the results to zero or one export tasks.
     * </p>
     * 
     * @param taskId
     *        The ID of the export task. Specifying a task ID filters the results to zero or one export tasks.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the export task. Specifying a task ID filters the results to zero or one export tasks.
     * </p>
     * 
     * @return The ID of the export task. Specifying a task ID filters the results to zero or one export tasks.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The ID of the export task. Specifying a task ID filters the results to zero or one export tasks.
     * </p>
     * 
     * @param taskId
     *        The ID of the export task. Specifying a task ID filters the results to zero or one export tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The status code of the export task. Specifying a status code filters the results to zero or more export tasks.
     * </p>
     * 
     * @param statusCode
     *        The status code of the export task. Specifying a status code filters the results to zero or more export
     *        tasks.
     * @see ExportTaskStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code of the export task. Specifying a status code filters the results to zero or more export tasks.
     * </p>
     * 
     * @return The status code of the export task. Specifying a status code filters the results to zero or more export
     *         tasks.
     * @see ExportTaskStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code of the export task. Specifying a status code filters the results to zero or more export tasks.
     * </p>
     * 
     * @param statusCode
     *        The status code of the export task. Specifying a status code filters the results to zero or more export
     *        tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportTaskStatusCode
     */

    public DescribeExportTasksRequest withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status code of the export task. Specifying a status code filters the results to zero or more export tasks.
     * </p>
     * 
     * @param statusCode
     *        The status code of the export task. Specifying a status code filters the results to zero or more export
     *        tasks.
     * @see ExportTaskStatusCode
     */

    public void setStatusCode(ExportTaskStatusCode statusCode) {
        withStatusCode(statusCode);
    }

    /**
     * <p>
     * The status code of the export task. Specifying a status code filters the results to zero or more export tasks.
     * </p>
     * 
     * @param statusCode
     *        The status code of the export task. Specifying a status code filters the results to zero or more export
     *        tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportTaskStatusCode
     */

    public DescribeExportTasksRequest withStatusCode(ExportTaskStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     * 
     * @param limit
     *        The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     * 
     * @return The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     * 
     * @param limit
     *        The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
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
