/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#countOpenWorkflowExecutions(CountOpenWorkflowExecutionsRequest) CountOpenWorkflowExecutions operation}.
 * <p>
 * Returns the number of open workflow executions within the given domain that meet the specified filtering criteria.
 * </p>
 * <p>
 * <b>NOTE:</b> This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
 * </p>
 * 
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
 * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
 * <ul>
 * <li> <code>tag</code> : String constraint. The key is <code>swf:tagFilter.tag</code> .</li>
 * <li> <code>typeFilter.name</code> : String constraint. String constraint. The key is <code>swf:typeFilter.name</code> .</li>
 * <li> <code>typeFilter.version</code> : String constraint. String constraint. The key is <code>swf:typeFilter.version</code> .</li>
 * 
 * </ul>
 * </li>
 * 
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action
 * fails by throwing <code>OperationNotPermitted</code> . For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a> .
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#countOpenWorkflowExecutions(CountOpenWorkflowExecutionsRequest)
 */
public class CountOpenWorkflowExecutionsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the domain containing the workflow executions to count.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String domain;

    /**
     * Specifies the start time criteria that workflow executions must meet
     * in order to be counted.
     */
    private ExecutionTimeFilter startTimeFilter;

    /**
     * Specifies the type of the workflow executions to be counted.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     */
    private WorkflowTypeFilter typeFilter;

    /**
     * If specified, only executions that have a tag that matches the filter
     * are counted. <note><code>executionFilter</code>,
     * <code>typeFilter</code> and <code>tagFilter</code> are mutually
     * exclusive. You can specify at most one of these in a request.</note>
     */
    private TagFilter tagFilter;

    /**
     * If specified, only workflow executions matching the
     * <code>WorkflowId</code> in the filter are counted.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     */
    private WorkflowExecutionFilter executionFilter;

    /**
     * The name of the domain containing the workflow executions to count.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the domain containing the workflow executions to count.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The name of the domain containing the workflow executions to count.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain containing the workflow executions to count.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The name of the domain containing the workflow executions to count.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain containing the workflow executions to count.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CountOpenWorkflowExecutionsRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Specifies the start time criteria that workflow executions must meet
     * in order to be counted.
     *
     * @return Specifies the start time criteria that workflow executions must meet
     *         in order to be counted.
     */
    public ExecutionTimeFilter getStartTimeFilter() {
        return startTimeFilter;
    }
    
    /**
     * Specifies the start time criteria that workflow executions must meet
     * in order to be counted.
     *
     * @param startTimeFilter Specifies the start time criteria that workflow executions must meet
     *         in order to be counted.
     */
    public void setStartTimeFilter(ExecutionTimeFilter startTimeFilter) {
        this.startTimeFilter = startTimeFilter;
    }
    
    /**
     * Specifies the start time criteria that workflow executions must meet
     * in order to be counted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTimeFilter Specifies the start time criteria that workflow executions must meet
     *         in order to be counted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CountOpenWorkflowExecutionsRequest withStartTimeFilter(ExecutionTimeFilter startTimeFilter) {
        this.startTimeFilter = startTimeFilter;
        return this;
    }

    /**
     * Specifies the type of the workflow executions to be counted.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     *
     * @return Specifies the type of the workflow executions to be counted.
     *         <note><code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most
     *         one of these in a request.</note>
     */
    public WorkflowTypeFilter getTypeFilter() {
        return typeFilter;
    }
    
    /**
     * Specifies the type of the workflow executions to be counted.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     *
     * @param typeFilter Specifies the type of the workflow executions to be counted.
     *         <note><code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most
     *         one of these in a request.</note>
     */
    public void setTypeFilter(WorkflowTypeFilter typeFilter) {
        this.typeFilter = typeFilter;
    }
    
    /**
     * Specifies the type of the workflow executions to be counted.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param typeFilter Specifies the type of the workflow executions to be counted.
     *         <note><code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most
     *         one of these in a request.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CountOpenWorkflowExecutionsRequest withTypeFilter(WorkflowTypeFilter typeFilter) {
        this.typeFilter = typeFilter;
        return this;
    }

    /**
     * If specified, only executions that have a tag that matches the filter
     * are counted. <note><code>executionFilter</code>,
     * <code>typeFilter</code> and <code>tagFilter</code> are mutually
     * exclusive. You can specify at most one of these in a request.</note>
     *
     * @return If specified, only executions that have a tag that matches the filter
     *         are counted. <note><code>executionFilter</code>,
     *         <code>typeFilter</code> and <code>tagFilter</code> are mutually
     *         exclusive. You can specify at most one of these in a request.</note>
     */
    public TagFilter getTagFilter() {
        return tagFilter;
    }
    
    /**
     * If specified, only executions that have a tag that matches the filter
     * are counted. <note><code>executionFilter</code>,
     * <code>typeFilter</code> and <code>tagFilter</code> are mutually
     * exclusive. You can specify at most one of these in a request.</note>
     *
     * @param tagFilter If specified, only executions that have a tag that matches the filter
     *         are counted. <note><code>executionFilter</code>,
     *         <code>typeFilter</code> and <code>tagFilter</code> are mutually
     *         exclusive. You can specify at most one of these in a request.</note>
     */
    public void setTagFilter(TagFilter tagFilter) {
        this.tagFilter = tagFilter;
    }
    
    /**
     * If specified, only executions that have a tag that matches the filter
     * are counted. <note><code>executionFilter</code>,
     * <code>typeFilter</code> and <code>tagFilter</code> are mutually
     * exclusive. You can specify at most one of these in a request.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagFilter If specified, only executions that have a tag that matches the filter
     *         are counted. <note><code>executionFilter</code>,
     *         <code>typeFilter</code> and <code>tagFilter</code> are mutually
     *         exclusive. You can specify at most one of these in a request.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CountOpenWorkflowExecutionsRequest withTagFilter(TagFilter tagFilter) {
        this.tagFilter = tagFilter;
        return this;
    }

    /**
     * If specified, only workflow executions matching the
     * <code>WorkflowId</code> in the filter are counted.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     *
     * @return If specified, only workflow executions matching the
     *         <code>WorkflowId</code> in the filter are counted.
     *         <note><code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most
     *         one of these in a request.</note>
     */
    public WorkflowExecutionFilter getExecutionFilter() {
        return executionFilter;
    }
    
    /**
     * If specified, only workflow executions matching the
     * <code>WorkflowId</code> in the filter are counted.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     *
     * @param executionFilter If specified, only workflow executions matching the
     *         <code>WorkflowId</code> in the filter are counted.
     *         <note><code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most
     *         one of these in a request.</note>
     */
    public void setExecutionFilter(WorkflowExecutionFilter executionFilter) {
        this.executionFilter = executionFilter;
    }
    
    /**
     * If specified, only workflow executions matching the
     * <code>WorkflowId</code> in the filter are counted.
     * <note><code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most
     * one of these in a request.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionFilter If specified, only workflow executions matching the
     *         <code>WorkflowId</code> in the filter are counted.
     *         <note><code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most
     *         one of these in a request.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CountOpenWorkflowExecutionsRequest withExecutionFilter(WorkflowExecutionFilter executionFilter) {
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
        if (getDomain() != null) sb.append("Domain: " + getDomain() + ",");
        if (getStartTimeFilter() != null) sb.append("StartTimeFilter: " + getStartTimeFilter() + ",");
        if (getTypeFilter() != null) sb.append("TypeFilter: " + getTypeFilter() + ",");
        if (getTagFilter() != null) sb.append("TagFilter: " + getTagFilter() + ",");
        if (getExecutionFilter() != null) sb.append("ExecutionFilter: " + getExecutionFilter() );
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
        hashCode = prime * hashCode + ((getExecutionFilter() == null) ? 0 : getExecutionFilter().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CountOpenWorkflowExecutionsRequest == false) return false;
        CountOpenWorkflowExecutionsRequest other = (CountOpenWorkflowExecutionsRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getStartTimeFilter() == null ^ this.getStartTimeFilter() == null) return false;
        if (other.getStartTimeFilter() != null && other.getStartTimeFilter().equals(this.getStartTimeFilter()) == false) return false; 
        if (other.getTypeFilter() == null ^ this.getTypeFilter() == null) return false;
        if (other.getTypeFilter() != null && other.getTypeFilter().equals(this.getTypeFilter()) == false) return false; 
        if (other.getTagFilter() == null ^ this.getTagFilter() == null) return false;
        if (other.getTagFilter() != null && other.getTagFilter().equals(this.getTagFilter()) == false) return false; 
        if (other.getExecutionFilter() == null ^ this.getExecutionFilter() == null) return false;
        if (other.getExecutionFilter() != null && other.getExecutionFilter().equals(this.getExecutionFilter()) == false) return false; 
        return true;
    }
    
}
    