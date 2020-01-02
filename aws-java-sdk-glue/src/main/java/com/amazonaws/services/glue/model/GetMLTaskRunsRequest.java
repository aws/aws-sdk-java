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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTaskRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMLTaskRunsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     */
    private String transformId;
    /**
     * <p>
     * A token for pagination of the results. The default is empty.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The filter criteria, in the <code>TaskRunFilterCriteria</code> structure, for the task run.
     * </p>
     */
    private TaskRunFilterCriteria filter;
    /**
     * <p>
     * The sorting criteria, in the <code>TaskRunSortCriteria</code> structure, for the task run.
     * </p>
     */
    private TaskRunSortCriteria sort;

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * 
     * @param transformId
     *        The unique identifier of the machine learning transform.
     */

    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * 
     * @return The unique identifier of the machine learning transform.
     */

    public String getTransformId() {
        return this.transformId;
    }

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * 
     * @param transformId
     *        The unique identifier of the machine learning transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunsRequest withTransformId(String transformId) {
        setTransformId(transformId);
        return this;
    }

    /**
     * <p>
     * A token for pagination of the results. The default is empty.
     * </p>
     * 
     * @param nextToken
     *        A token for pagination of the results. The default is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for pagination of the results. The default is empty.
     * </p>
     * 
     * @return A token for pagination of the results. The default is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for pagination of the results. The default is empty.
     * </p>
     * 
     * @param nextToken
     *        A token for pagination of the results. The default is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The filter criteria, in the <code>TaskRunFilterCriteria</code> structure, for the task run.
     * </p>
     * 
     * @param filter
     *        The filter criteria, in the <code>TaskRunFilterCriteria</code> structure, for the task run.
     */

    public void setFilter(TaskRunFilterCriteria filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filter criteria, in the <code>TaskRunFilterCriteria</code> structure, for the task run.
     * </p>
     * 
     * @return The filter criteria, in the <code>TaskRunFilterCriteria</code> structure, for the task run.
     */

    public TaskRunFilterCriteria getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The filter criteria, in the <code>TaskRunFilterCriteria</code> structure, for the task run.
     * </p>
     * 
     * @param filter
     *        The filter criteria, in the <code>TaskRunFilterCriteria</code> structure, for the task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunsRequest withFilter(TaskRunFilterCriteria filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The sorting criteria, in the <code>TaskRunSortCriteria</code> structure, for the task run.
     * </p>
     * 
     * @param sort
     *        The sorting criteria, in the <code>TaskRunSortCriteria</code> structure, for the task run.
     */

    public void setSort(TaskRunSortCriteria sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * The sorting criteria, in the <code>TaskRunSortCriteria</code> structure, for the task run.
     * </p>
     * 
     * @return The sorting criteria, in the <code>TaskRunSortCriteria</code> structure, for the task run.
     */

    public TaskRunSortCriteria getSort() {
        return this.sort;
    }

    /**
     * <p>
     * The sorting criteria, in the <code>TaskRunSortCriteria</code> structure, for the task run.
     * </p>
     * 
     * @param sort
     *        The sorting criteria, in the <code>TaskRunSortCriteria</code> structure, for the task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunsRequest withSort(TaskRunSortCriteria sort) {
        setSort(sort);
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
        if (getTransformId() != null)
            sb.append("TransformId: ").append(getTransformId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLTaskRunsRequest == false)
            return false;
        GetMLTaskRunsRequest other = (GetMLTaskRunsRequest) obj;
        if (other.getTransformId() == null ^ this.getTransformId() == null)
            return false;
        if (other.getTransformId() != null && other.getTransformId().equals(this.getTransformId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransformId() == null) ? 0 : getTransformId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        return hashCode;
    }

    @Override
    public GetMLTaskRunsRequest clone() {
        return (GetMLTaskRunsRequest) super.clone();
    }

}
