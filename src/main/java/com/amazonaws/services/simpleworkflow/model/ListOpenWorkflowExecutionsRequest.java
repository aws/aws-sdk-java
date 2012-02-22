/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#listOpenWorkflowExecutions(ListOpenWorkflowExecutionsRequest) ListOpenWorkflowExecutions operation}.
 * <p>
 * Returns a list of open workflow executions in the specified domain
 * that meet the filtering criteria. The results may be split into
 * multiple pages. To retrieve subsequent pages, make the call again
 * using the nextPageToken returned by the initial call.
 * </p>
 * <p>
 * <b>NOTE:</b> This operation is eventually consistent. The results are
 * best effort and may not exactly reflect recent updates and changes.
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#listOpenWorkflowExecutions(ListOpenWorkflowExecutionsRequest)
 */
public class ListOpenWorkflowExecutionsRequest extends AmazonWebServiceRequest {

    /**
     * The name of the domain that contains the workflow executions to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String domain;

    /**
     * Workflow executions are included in the returned results based on
     * whether their start times are within the range specified by this
     * filter.
     */
    private ExecutionTimeFilter startTimeFilter;

    /**
     * If specified, only executions of the type specified in the filter are
     * returned. <note><code>executionFilter</code>, <code>typeFilter</code>
     * and <code>tagFilter</code> are mutually exclusive. You can specify at
     * most one of these in a request.</note>
     */
    private WorkflowTypeFilter typeFilter;

    /**
     * If specified, only executions that have the matching tag are listed.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     */
    private TagFilter tagFilter;

    /**
     * If on a previous call to this method a <code>NextPageToken</code> was
     * returned, the results are being paginated. To get the next page of
     * results, repeat the call with the returned token and all other
     * arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String nextPageToken;

    /**
     * The maximum number of results returned in each page. The default is
     * 100, but the caller can override this value to a page size
     * <i>smaller</i> than the default. You cannot specify a page size
     * greater than 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     */
    private Integer maximumPageSize;

    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default the results are returned in descending order of the start
     * time of the executions.
     */
    private Boolean reverseOrder;

    /**
     * If specified, only workflow executions matching the workflow id
     * specified in the filter are returned.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     */
    private WorkflowExecutionFilter executionFilter;

    /**
     * The name of the domain that contains the workflow executions to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the domain that contains the workflow executions to list.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The name of the domain that contains the workflow executions to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain that contains the workflow executions to list.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The name of the domain that contains the workflow executions to list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain that contains the workflow executions to list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListOpenWorkflowExecutionsRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    
    /**
     * Workflow executions are included in the returned results based on
     * whether their start times are within the range specified by this
     * filter.
     *
     * @return Workflow executions are included in the returned results based on
     *         whether their start times are within the range specified by this
     *         filter.
     */
    public ExecutionTimeFilter getStartTimeFilter() {
        return startTimeFilter;
    }
    
    /**
     * Workflow executions are included in the returned results based on
     * whether their start times are within the range specified by this
     * filter.
     *
     * @param startTimeFilter Workflow executions are included in the returned results based on
     *         whether their start times are within the range specified by this
     *         filter.
     */
    public void setStartTimeFilter(ExecutionTimeFilter startTimeFilter) {
        this.startTimeFilter = startTimeFilter;
    }
    
    /**
     * Workflow executions are included in the returned results based on
     * whether their start times are within the range specified by this
     * filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTimeFilter Workflow executions are included in the returned results based on
     *         whether their start times are within the range specified by this
     *         filter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListOpenWorkflowExecutionsRequest withStartTimeFilter(ExecutionTimeFilter startTimeFilter) {
        this.startTimeFilter = startTimeFilter;
        return this;
    }
    
    
    /**
     * If specified, only executions of the type specified in the filter are
     * returned. <note><code>executionFilter</code>, <code>typeFilter</code>
     * and <code>tagFilter</code> are mutually exclusive. You can specify at
     * most one of these in a request.</note>
     *
     * @return If specified, only executions of the type specified in the filter are
     *         returned. <note><code>executionFilter</code>, <code>typeFilter</code>
     *         and <code>tagFilter</code> are mutually exclusive. You can specify at
     *         most one of these in a request.</note>
     */
    public WorkflowTypeFilter getTypeFilter() {
        return typeFilter;
    }
    
    /**
     * If specified, only executions of the type specified in the filter are
     * returned. <note><code>executionFilter</code>, <code>typeFilter</code>
     * and <code>tagFilter</code> are mutually exclusive. You can specify at
     * most one of these in a request.</note>
     *
     * @param typeFilter If specified, only executions of the type specified in the filter are
     *         returned. <note><code>executionFilter</code>, <code>typeFilter</code>
     *         and <code>tagFilter</code> are mutually exclusive. You can specify at
     *         most one of these in a request.</note>
     */
    public void setTypeFilter(WorkflowTypeFilter typeFilter) {
        this.typeFilter = typeFilter;
    }
    
    /**
     * If specified, only executions of the type specified in the filter are
     * returned. <note><code>executionFilter</code>, <code>typeFilter</code>
     * and <code>tagFilter</code> are mutually exclusive. You can specify at
     * most one of these in a request.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param typeFilter If specified, only executions of the type specified in the filter are
     *         returned. <note><code>executionFilter</code>, <code>typeFilter</code>
     *         and <code>tagFilter</code> are mutually exclusive. You can specify at
     *         most one of these in a request.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListOpenWorkflowExecutionsRequest withTypeFilter(WorkflowTypeFilter typeFilter) {
        this.typeFilter = typeFilter;
        return this;
    }
    
    
    /**
     * If specified, only executions that have the matching tag are listed.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     *
     * @return If specified, only executions that have the matching tag are listed.
     *         <note><code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most
     *         one of these in a request.</note>
     */
    public TagFilter getTagFilter() {
        return tagFilter;
    }
    
    /**
     * If specified, only executions that have the matching tag are listed.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     *
     * @param tagFilter If specified, only executions that have the matching tag are listed.
     *         <note><code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most
     *         one of these in a request.</note>
     */
    public void setTagFilter(TagFilter tagFilter) {
        this.tagFilter = tagFilter;
    }
    
    /**
     * If specified, only executions that have the matching tag are listed.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagFilter If specified, only executions that have the matching tag are listed.
     *         <note><code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most
     *         one of these in a request.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListOpenWorkflowExecutionsRequest withTagFilter(TagFilter tagFilter) {
        this.tagFilter = tagFilter;
        return this;
    }
    
    
    /**
     * If on a previous call to this method a <code>NextPageToken</code> was
     * returned, the results are being paginated. To get the next page of
     * results, repeat the call with the returned token and all other
     * arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return If on a previous call to this method a <code>NextPageToken</code> was
     *         returned, the results are being paginated. To get the next page of
     *         results, repeat the call with the returned token and all other
     *         arguments unchanged.
     */
    public String getNextPageToken() {
        return nextPageToken;
    }
    
    /**
     * If on a previous call to this method a <code>NextPageToken</code> was
     * returned, the results are being paginated. To get the next page of
     * results, repeat the call with the returned token and all other
     * arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken If on a previous call to this method a <code>NextPageToken</code> was
     *         returned, the results are being paginated. To get the next page of
     *         results, repeat the call with the returned token and all other
     *         arguments unchanged.
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
    
    /**
     * If on a previous call to this method a <code>NextPageToken</code> was
     * returned, the results are being paginated. To get the next page of
     * results, repeat the call with the returned token and all other
     * arguments unchanged.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken If on a previous call to this method a <code>NextPageToken</code> was
     *         returned, the results are being paginated. To get the next page of
     *         results, repeat the call with the returned token and all other
     *         arguments unchanged.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListOpenWorkflowExecutionsRequest withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    
    
    /**
     * The maximum number of results returned in each page. The default is
     * 100, but the caller can override this value to a page size
     * <i>smaller</i> than the default. You cannot specify a page size
     * greater than 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @return The maximum number of results returned in each page. The default is
     *         100, but the caller can override this value to a page size
     *         <i>smaller</i> than the default. You cannot specify a page size
     *         greater than 100.
     */
    public Integer getMaximumPageSize() {
        return maximumPageSize;
    }
    
    /**
     * The maximum number of results returned in each page. The default is
     * 100, but the caller can override this value to a page size
     * <i>smaller</i> than the default. You cannot specify a page size
     * greater than 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param maximumPageSize The maximum number of results returned in each page. The default is
     *         100, but the caller can override this value to a page size
     *         <i>smaller</i> than the default. You cannot specify a page size
     *         greater than 100.
     */
    public void setMaximumPageSize(Integer maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
    }
    
    /**
     * The maximum number of results returned in each page. The default is
     * 100, but the caller can override this value to a page size
     * <i>smaller</i> than the default. You cannot specify a page size
     * greater than 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param maximumPageSize The maximum number of results returned in each page. The default is
     *         100, but the caller can override this value to a page size
     *         <i>smaller</i> than the default. You cannot specify a page size
     *         greater than 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListOpenWorkflowExecutionsRequest withMaximumPageSize(Integer maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }
    
    
    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default the results are returned in descending order of the start
     * time of the executions.
     *
     * @return When set to <code>true</code>, returns the results in reverse order.
     *         By default the results are returned in descending order of the start
     *         time of the executions.
     */
    public Boolean isReverseOrder() {
        return reverseOrder;
    }
    
    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default the results are returned in descending order of the start
     * time of the executions.
     *
     * @param reverseOrder When set to <code>true</code>, returns the results in reverse order.
     *         By default the results are returned in descending order of the start
     *         time of the executions.
     */
    public void setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }
    
    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default the results are returned in descending order of the start
     * time of the executions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reverseOrder When set to <code>true</code>, returns the results in reverse order.
     *         By default the results are returned in descending order of the start
     *         time of the executions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListOpenWorkflowExecutionsRequest withReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
        return this;
    }
    
    
    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default the results are returned in descending order of the start
     * time of the executions.
     *
     * @return When set to <code>true</code>, returns the results in reverse order.
     *         By default the results are returned in descending order of the start
     *         time of the executions.
     */
    public Boolean getReverseOrder() {
        return reverseOrder;
    }
    
    /**
     * If specified, only workflow executions matching the workflow id
     * specified in the filter are returned.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     *
     * @return If specified, only workflow executions matching the workflow id
     *         specified in the filter are returned.
     *         <note><code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most
     *         one of these in a request.</note>
     */
    public WorkflowExecutionFilter getExecutionFilter() {
        return executionFilter;
    }
    
    /**
     * If specified, only workflow executions matching the workflow id
     * specified in the filter are returned.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     *
     * @param executionFilter If specified, only workflow executions matching the workflow id
     *         specified in the filter are returned.
     *         <note><code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most
     *         one of these in a request.</note>
     */
    public void setExecutionFilter(WorkflowExecutionFilter executionFilter) {
        this.executionFilter = executionFilter;
    }
    
    /**
     * If specified, only workflow executions matching the workflow id
     * specified in the filter are returned.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionFilter If specified, only workflow executions matching the workflow id
     *         specified in the filter are returned.
     *         <note><code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most
     *         one of these in a request.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListOpenWorkflowExecutionsRequest withExecutionFilter(WorkflowExecutionFilter executionFilter) {
        this.executionFilter = executionFilter;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (domain != null) sb.append("Domain: " + domain + ", ");
        if (startTimeFilter != null) sb.append("StartTimeFilter: " + startTimeFilter + ", ");
        if (typeFilter != null) sb.append("TypeFilter: " + typeFilter + ", ");
        if (tagFilter != null) sb.append("TagFilter: " + tagFilter + ", ");
        if (nextPageToken != null) sb.append("NextPageToken: " + nextPageToken + ", ");
        if (maximumPageSize != null) sb.append("MaximumPageSize: " + maximumPageSize + ", ");
        if (reverseOrder != null) sb.append("ReverseOrder: " + reverseOrder + ", ");
        if (executionFilter != null) sb.append("ExecutionFilter: " + executionFilter + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((getStartTimeFilter() == null) ? 0 : getStartTimeFilter().hashCode()); 
        hashCode = prime * hashCode + ((getTypeFilter() == null) ? 0 : getTypeFilter().hashCode()); 
        hashCode = prime * hashCode + ((getTagFilter() == null) ? 0 : getTagFilter().hashCode()); 
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaximumPageSize() == null) ? 0 : getMaximumPageSize().hashCode()); 
        hashCode = prime * hashCode + ((isReverseOrder() == null) ? 0 : isReverseOrder().hashCode()); 
        hashCode = prime * hashCode + ((getExecutionFilter() == null) ? 0 : getExecutionFilter().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ListOpenWorkflowExecutionsRequest == false) return false;
        ListOpenWorkflowExecutionsRequest other = (ListOpenWorkflowExecutionsRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getStartTimeFilter() == null ^ this.getStartTimeFilter() == null) return false;
        if (other.getStartTimeFilter() != null && other.getStartTimeFilter().equals(this.getStartTimeFilter()) == false) return false; 
        if (other.getTypeFilter() == null ^ this.getTypeFilter() == null) return false;
        if (other.getTypeFilter() != null && other.getTypeFilter().equals(this.getTypeFilter()) == false) return false; 
        if (other.getTagFilter() == null ^ this.getTagFilter() == null) return false;
        if (other.getTagFilter() != null && other.getTagFilter().equals(this.getTagFilter()) == false) return false; 
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null) return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false) return false; 
        if (other.getMaximumPageSize() == null ^ this.getMaximumPageSize() == null) return false;
        if (other.getMaximumPageSize() != null && other.getMaximumPageSize().equals(this.getMaximumPageSize()) == false) return false; 
        if (other.isReverseOrder() == null ^ this.isReverseOrder() == null) return false;
        if (other.isReverseOrder() != null && other.isReverseOrder().equals(this.isReverseOrder()) == false) return false; 
        if (other.getExecutionFilter() == null ^ this.getExecutionFilter() == null) return false;
        if (other.getExecutionFilter() != null && other.getExecutionFilter().equals(this.getExecutionFilter()) == false) return false; 
        return true;
    }
    
}
    