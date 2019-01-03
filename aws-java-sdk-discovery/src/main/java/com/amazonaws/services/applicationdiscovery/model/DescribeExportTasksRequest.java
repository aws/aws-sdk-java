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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExportTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more unique identifiers used to query the status of an export request.
     * </p>
     */
    private java.util.List<String> exportIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AgentId</code> - ID of the agent whose collected data will be exported
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<ExportFilter> filters;
    /**
     * <p>
     * The maximum number of volume results returned by <code>DescribeExportTasks</code> in paginated output. When this
     * parameter is used, <code>DescribeExportTasks</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeExportTasks</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value. This value is null when
     * there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more unique identifiers used to query the status of an export request.
     * </p>
     * 
     * @return One or more unique identifiers used to query the status of an export request.
     */

    public java.util.List<String> getExportIds() {
        return exportIds;
    }

    /**
     * <p>
     * One or more unique identifiers used to query the status of an export request.
     * </p>
     * 
     * @param exportIds
     *        One or more unique identifiers used to query the status of an export request.
     */

    public void setExportIds(java.util.Collection<String> exportIds) {
        if (exportIds == null) {
            this.exportIds = null;
            return;
        }

        this.exportIds = new java.util.ArrayList<String>(exportIds);
    }

    /**
     * <p>
     * One or more unique identifiers used to query the status of an export request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportIds(java.util.Collection)} or {@link #withExportIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exportIds
     *        One or more unique identifiers used to query the status of an export request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withExportIds(String... exportIds) {
        if (this.exportIds == null) {
            setExportIds(new java.util.ArrayList<String>(exportIds.length));
        }
        for (String ele : exportIds) {
            this.exportIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more unique identifiers used to query the status of an export request.
     * </p>
     * 
     * @param exportIds
     *        One or more unique identifiers used to query the status of an export request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withExportIds(java.util.Collection<String> exportIds) {
        setExportIds(exportIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AgentId</code> - ID of the agent whose collected data will be exported
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AgentId</code> - ID of the agent whose collected data will be exported
     *         </p>
     *         </li>
     */

    public java.util.List<ExportFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AgentId</code> - ID of the agent whose collected data will be exported
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AgentId</code> - ID of the agent whose collected data will be exported
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<ExportFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ExportFilter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AgentId</code> - ID of the agent whose collected data will be exported
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AgentId</code> - ID of the agent whose collected data will be exported
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withFilters(ExportFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ExportFilter>(filters.length));
        }
        for (ExportFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AgentId</code> - ID of the agent whose collected data will be exported
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AgentId</code> - ID of the agent whose collected data will be exported
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withFilters(java.util.Collection<ExportFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of volume results returned by <code>DescribeExportTasks</code> in paginated output. When this
     * parameter is used, <code>DescribeExportTasks</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of volume results returned by <code>DescribeExportTasks</code> in paginated output.
     *        When this parameter is used, <code>DescribeExportTasks</code> only returns <code>maxResults</code> results
     *        in a single page along with a <code>nextToken</code> response element.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of volume results returned by <code>DescribeExportTasks</code> in paginated output. When this
     * parameter is used, <code>DescribeExportTasks</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element.
     * </p>
     * 
     * @return The maximum number of volume results returned by <code>DescribeExportTasks</code> in paginated output.
     *         When this parameter is used, <code>DescribeExportTasks</code> only returns <code>maxResults</code>
     *         results in a single page along with a <code>nextToken</code> response element.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of volume results returned by <code>DescribeExportTasks</code> in paginated output. When this
     * parameter is used, <code>DescribeExportTasks</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of volume results returned by <code>DescribeExportTasks</code> in paginated output.
     *        When this parameter is used, <code>DescribeExportTasks</code> only returns <code>maxResults</code> results
     *        in a single page along with a <code>nextToken</code> response element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeExportTasks</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value. This value is null when
     * there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>DescribeExportTasks</code>
     *        request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>nextToken</code> value.
     *        This value is null when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeExportTasks</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value. This value is null when
     * there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>DescribeExportTasks</code>
     *         request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *         Pagination continues from the end of the previous results that returned the <code>nextToken</code> value.
     *         This value is null when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeExportTasks</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value. This value is null when
     * there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>DescribeExportTasks</code>
     *        request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>nextToken</code> value.
     *        This value is null when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withNextToken(String nextToken) {
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
        if (getExportIds() != null)
            sb.append("ExportIds: ").append(getExportIds()).append(",");
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

        if (obj instanceof DescribeExportTasksRequest == false)
            return false;
        DescribeExportTasksRequest other = (DescribeExportTasksRequest) obj;
        if (other.getExportIds() == null ^ this.getExportIds() == null)
            return false;
        if (other.getExportIds() != null && other.getExportIds().equals(this.getExportIds()) == false)
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

        hashCode = prime * hashCode + ((getExportIds() == null) ? 0 : getExportIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExportTasksRequest clone() {
        return (DescribeExportTasksRequest) super.clone();
    }

}
