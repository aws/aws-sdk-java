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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeExportImageTasksRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExportImageTasksRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeExportImageTasksRequest> {

    /**
     * <p>
     * Filter tasks using the <code>task-state</code> filter and one of the following values: <code>active</code>,
     * <code>completed</code>, <code>deleting</code>, or <code>deleted</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The IDs of the export image tasks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> exportImageTaskIds;
    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token that indicates the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Filter tasks using the <code>task-state</code> filter and one of the following values: <code>active</code>,
     * <code>completed</code>, <code>deleting</code>, or <code>deleted</code>.
     * </p>
     * 
     * @return Filter tasks using the <code>task-state</code> filter and one of the following values:
     *         <code>active</code>, <code>completed</code>, <code>deleting</code>, or <code>deleted</code>.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * Filter tasks using the <code>task-state</code> filter and one of the following values: <code>active</code>,
     * <code>completed</code>, <code>deleting</code>, or <code>deleted</code>.
     * </p>
     * 
     * @param filters
     *        Filter tasks using the <code>task-state</code> filter and one of the following values: <code>active</code>
     *        , <code>completed</code>, <code>deleting</code>, or <code>deleted</code>.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * Filter tasks using the <code>task-state</code> filter and one of the following values: <code>active</code>,
     * <code>completed</code>, <code>deleting</code>, or <code>deleted</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filter tasks using the <code>task-state</code> filter and one of the following values: <code>active</code>
     *        , <code>completed</code>, <code>deleting</code>, or <code>deleted</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportImageTasksRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filter tasks using the <code>task-state</code> filter and one of the following values: <code>active</code>,
     * <code>completed</code>, <code>deleting</code>, or <code>deleted</code>.
     * </p>
     * 
     * @param filters
     *        Filter tasks using the <code>task-state</code> filter and one of the following values: <code>active</code>
     *        , <code>completed</code>, <code>deleting</code>, or <code>deleted</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportImageTasksRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The IDs of the export image tasks.
     * </p>
     * 
     * @return The IDs of the export image tasks.
     */

    public java.util.List<String> getExportImageTaskIds() {
        if (exportImageTaskIds == null) {
            exportImageTaskIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return exportImageTaskIds;
    }

    /**
     * <p>
     * The IDs of the export image tasks.
     * </p>
     * 
     * @param exportImageTaskIds
     *        The IDs of the export image tasks.
     */

    public void setExportImageTaskIds(java.util.Collection<String> exportImageTaskIds) {
        if (exportImageTaskIds == null) {
            this.exportImageTaskIds = null;
            return;
        }

        this.exportImageTaskIds = new com.amazonaws.internal.SdkInternalList<String>(exportImageTaskIds);
    }

    /**
     * <p>
     * The IDs of the export image tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportImageTaskIds(java.util.Collection)} or {@link #withExportImageTaskIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exportImageTaskIds
     *        The IDs of the export image tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportImageTasksRequest withExportImageTaskIds(String... exportImageTaskIds) {
        if (this.exportImageTaskIds == null) {
            setExportImageTaskIds(new com.amazonaws.internal.SdkInternalList<String>(exportImageTaskIds.length));
        }
        for (String ele : exportImageTaskIds) {
            this.exportImageTaskIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the export image tasks.
     * </p>
     * 
     * @param exportImageTaskIds
     *        The IDs of the export image tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportImageTasksRequest withExportImageTaskIds(java.util.Collection<String> exportImageTaskIds) {
        setExportImageTaskIds(exportImageTaskIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @return The maximum number of results to return in a single call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportImageTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token that indicates the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates the next page of results.
     * </p>
     * 
     * @return A token that indicates the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportImageTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeExportImageTasksRequest> getDryRunRequest() {
        Request<DescribeExportImageTasksRequest> request = new DescribeExportImageTasksRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getExportImageTaskIds() != null)
            sb.append("ExportImageTaskIds: ").append(getExportImageTaskIds()).append(",");
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

        if (obj instanceof DescribeExportImageTasksRequest == false)
            return false;
        DescribeExportImageTasksRequest other = (DescribeExportImageTasksRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getExportImageTaskIds() == null ^ this.getExportImageTaskIds() == null)
            return false;
        if (other.getExportImageTaskIds() != null && other.getExportImageTaskIds().equals(this.getExportImageTaskIds()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getExportImageTaskIds() == null) ? 0 : getExportImageTaskIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExportImageTasksRequest clone() {
        return (DescribeExportImageTasksRequest) super.clone();
    }
}
