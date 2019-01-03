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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/CountClosedWorkflowExecutions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CountClosedWorkflowExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain containing the workflow executions to count.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * If specified, only workflow executions that meet the start time criteria of the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one of
     * these in a request but not both.
     * </p>
     * </note>
     */
    private ExecutionTimeFilter startTimeFilter;
    /**
     * <p>
     * If specified, only workflow executions that meet the close time criteria of the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one of
     * these in a request but not both.
     * </p>
     * </note>
     */
    private ExecutionTimeFilter closeTimeFilter;
    /**
     * <p>
     * If specified, only workflow executions matching the <code>WorkflowId</code> in the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     */
    private WorkflowExecutionFilter executionFilter;
    /**
     * <p>
     * If specified, indicates the type of the workflow executions to be counted.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     */
    private WorkflowTypeFilter typeFilter;
    /**
     * <p>
     * If specified, only executions that have a tag that matches the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     */
    private TagFilter tagFilter;
    /**
     * <p>
     * If specified, only workflow executions that match this close status are counted. This filter has an affect only
     * if <code>executionStatus</code> is specified as <code>CLOSED</code>.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     */
    private CloseStatusFilter closeStatusFilter;

    /**
     * <p>
     * The name of the domain containing the workflow executions to count.
     * </p>
     * 
     * @param domain
     *        The name of the domain containing the workflow executions to count.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain containing the workflow executions to count.
     * </p>
     * 
     * @return The name of the domain containing the workflow executions to count.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain containing the workflow executions to count.
     * </p>
     * 
     * @param domain
     *        The name of the domain containing the workflow executions to count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountClosedWorkflowExecutionsRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * If specified, only workflow executions that meet the start time criteria of the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one of
     * these in a request but not both.
     * </p>
     * </note>
     * 
     * @param startTimeFilter
     *        If specified, only workflow executions that meet the start time criteria of the filter are counted.</p>
     *        <note>
     *        <p>
     *        <code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one
     *        of these in a request but not both.
     *        </p>
     */

    public void setStartTimeFilter(ExecutionTimeFilter startTimeFilter) {
        this.startTimeFilter = startTimeFilter;
    }

    /**
     * <p>
     * If specified, only workflow executions that meet the start time criteria of the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one of
     * these in a request but not both.
     * </p>
     * </note>
     * 
     * @return If specified, only workflow executions that meet the start time criteria of the filter are counted.</p>
     *         <note>
     *         <p>
     *         <code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify
     *         one of these in a request but not both.
     *         </p>
     */

    public ExecutionTimeFilter getStartTimeFilter() {
        return this.startTimeFilter;
    }

    /**
     * <p>
     * If specified, only workflow executions that meet the start time criteria of the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one of
     * these in a request but not both.
     * </p>
     * </note>
     * 
     * @param startTimeFilter
     *        If specified, only workflow executions that meet the start time criteria of the filter are counted.</p>
     *        <note>
     *        <p>
     *        <code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one
     *        of these in a request but not both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountClosedWorkflowExecutionsRequest withStartTimeFilter(ExecutionTimeFilter startTimeFilter) {
        setStartTimeFilter(startTimeFilter);
        return this;
    }

    /**
     * <p>
     * If specified, only workflow executions that meet the close time criteria of the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one of
     * these in a request but not both.
     * </p>
     * </note>
     * 
     * @param closeTimeFilter
     *        If specified, only workflow executions that meet the close time criteria of the filter are counted.</p>
     *        <note>
     *        <p>
     *        <code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one
     *        of these in a request but not both.
     *        </p>
     */

    public void setCloseTimeFilter(ExecutionTimeFilter closeTimeFilter) {
        this.closeTimeFilter = closeTimeFilter;
    }

    /**
     * <p>
     * If specified, only workflow executions that meet the close time criteria of the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one of
     * these in a request but not both.
     * </p>
     * </note>
     * 
     * @return If specified, only workflow executions that meet the close time criteria of the filter are counted.</p>
     *         <note>
     *         <p>
     *         <code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify
     *         one of these in a request but not both.
     *         </p>
     */

    public ExecutionTimeFilter getCloseTimeFilter() {
        return this.closeTimeFilter;
    }

    /**
     * <p>
     * If specified, only workflow executions that meet the close time criteria of the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one of
     * these in a request but not both.
     * </p>
     * </note>
     * 
     * @param closeTimeFilter
     *        If specified, only workflow executions that meet the close time criteria of the filter are counted.</p>
     *        <note>
     *        <p>
     *        <code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one
     *        of these in a request but not both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountClosedWorkflowExecutionsRequest withCloseTimeFilter(ExecutionTimeFilter closeTimeFilter) {
        setCloseTimeFilter(closeTimeFilter);
        return this;
    }

    /**
     * <p>
     * If specified, only workflow executions matching the <code>WorkflowId</code> in the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     * 
     * @param executionFilter
     *        If specified, only workflow executions matching the <code>WorkflowId</code> in the filter are counted.</p>
     *        <note>
     *        <p>
     *        <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     *        </p>
     */

    public void setExecutionFilter(WorkflowExecutionFilter executionFilter) {
        this.executionFilter = executionFilter;
    }

    /**
     * <p>
     * If specified, only workflow executions matching the <code>WorkflowId</code> in the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     * 
     * @return If specified, only workflow executions matching the <code>WorkflowId</code> in the filter are
     *         counted.</p> <note>
     *         <p>
     *         <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     *         </p>
     */

    public WorkflowExecutionFilter getExecutionFilter() {
        return this.executionFilter;
    }

    /**
     * <p>
     * If specified, only workflow executions matching the <code>WorkflowId</code> in the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     * 
     * @param executionFilter
     *        If specified, only workflow executions matching the <code>WorkflowId</code> in the filter are counted.</p>
     *        <note>
     *        <p>
     *        <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountClosedWorkflowExecutionsRequest withExecutionFilter(WorkflowExecutionFilter executionFilter) {
        setExecutionFilter(executionFilter);
        return this;
    }

    /**
     * <p>
     * If specified, indicates the type of the workflow executions to be counted.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     * 
     * @param typeFilter
     *        If specified, indicates the type of the workflow executions to be counted.</p> <note>
     *        <p>
     *        <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     *        </p>
     */

    public void setTypeFilter(WorkflowTypeFilter typeFilter) {
        this.typeFilter = typeFilter;
    }

    /**
     * <p>
     * If specified, indicates the type of the workflow executions to be counted.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     * 
     * @return If specified, indicates the type of the workflow executions to be counted.</p> <note>
     *         <p>
     *         <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     *         </p>
     */

    public WorkflowTypeFilter getTypeFilter() {
        return this.typeFilter;
    }

    /**
     * <p>
     * If specified, indicates the type of the workflow executions to be counted.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     * 
     * @param typeFilter
     *        If specified, indicates the type of the workflow executions to be counted.</p> <note>
     *        <p>
     *        <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountClosedWorkflowExecutionsRequest withTypeFilter(WorkflowTypeFilter typeFilter) {
        setTypeFilter(typeFilter);
        return this;
    }

    /**
     * <p>
     * If specified, only executions that have a tag that matches the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     * 
     * @param tagFilter
     *        If specified, only executions that have a tag that matches the filter are counted.</p> <note>
     *        <p>
     *        <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     *        </p>
     */

    public void setTagFilter(TagFilter tagFilter) {
        this.tagFilter = tagFilter;
    }

    /**
     * <p>
     * If specified, only executions that have a tag that matches the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     * 
     * @return If specified, only executions that have a tag that matches the filter are counted.</p> <note>
     *         <p>
     *         <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     *         </p>
     */

    public TagFilter getTagFilter() {
        return this.tagFilter;
    }

    /**
     * <p>
     * If specified, only executions that have a tag that matches the filter are counted.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     * 
     * @param tagFilter
     *        If specified, only executions that have a tag that matches the filter are counted.</p> <note>
     *        <p>
     *        <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountClosedWorkflowExecutionsRequest withTagFilter(TagFilter tagFilter) {
        setTagFilter(tagFilter);
        return this;
    }

    /**
     * <p>
     * If specified, only workflow executions that match this close status are counted. This filter has an affect only
     * if <code>executionStatus</code> is specified as <code>CLOSED</code>.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     * 
     * @param closeStatusFilter
     *        If specified, only workflow executions that match this close status are counted. This filter has an affect
     *        only if <code>executionStatus</code> is specified as <code>CLOSED</code>.</p> <note>
     *        <p>
     *        <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     *        </p>
     */

    public void setCloseStatusFilter(CloseStatusFilter closeStatusFilter) {
        this.closeStatusFilter = closeStatusFilter;
    }

    /**
     * <p>
     * If specified, only workflow executions that match this close status are counted. This filter has an affect only
     * if <code>executionStatus</code> is specified as <code>CLOSED</code>.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     * 
     * @return If specified, only workflow executions that match this close status are counted. This filter has an
     *         affect only if <code>executionStatus</code> is specified as <code>CLOSED</code>.</p> <note>
     *         <p>
     *         <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     *         </p>
     */

    public CloseStatusFilter getCloseStatusFilter() {
        return this.closeStatusFilter;
    }

    /**
     * <p>
     * If specified, only workflow executions that match this close status are counted. This filter has an affect only
     * if <code>executionStatus</code> is specified as <code>CLOSED</code>.
     * </p>
     * <note>
     * <p>
     * <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and <code>tagFilter</code>
     * are mutually exclusive. You can specify at most one of these in a request.
     * </p>
     * </note>
     * 
     * @param closeStatusFilter
     *        If specified, only workflow executions that match this close status are counted. This filter has an affect
     *        only if <code>executionStatus</code> is specified as <code>CLOSED</code>.</p> <note>
     *        <p>
     *        <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountClosedWorkflowExecutionsRequest withCloseStatusFilter(CloseStatusFilter closeStatusFilter) {
        setCloseStatusFilter(closeStatusFilter);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getStartTimeFilter() != null)
            sb.append("StartTimeFilter: ").append(getStartTimeFilter()).append(",");
        if (getCloseTimeFilter() != null)
            sb.append("CloseTimeFilter: ").append(getCloseTimeFilter()).append(",");
        if (getExecutionFilter() != null)
            sb.append("ExecutionFilter: ").append(getExecutionFilter()).append(",");
        if (getTypeFilter() != null)
            sb.append("TypeFilter: ").append(getTypeFilter()).append(",");
        if (getTagFilter() != null)
            sb.append("TagFilter: ").append(getTagFilter()).append(",");
        if (getCloseStatusFilter() != null)
            sb.append("CloseStatusFilter: ").append(getCloseStatusFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CountClosedWorkflowExecutionsRequest == false)
            return false;
        CountClosedWorkflowExecutionsRequest other = (CountClosedWorkflowExecutionsRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getStartTimeFilter() == null ^ this.getStartTimeFilter() == null)
            return false;
        if (other.getStartTimeFilter() != null && other.getStartTimeFilter().equals(this.getStartTimeFilter()) == false)
            return false;
        if (other.getCloseTimeFilter() == null ^ this.getCloseTimeFilter() == null)
            return false;
        if (other.getCloseTimeFilter() != null && other.getCloseTimeFilter().equals(this.getCloseTimeFilter()) == false)
            return false;
        if (other.getExecutionFilter() == null ^ this.getExecutionFilter() == null)
            return false;
        if (other.getExecutionFilter() != null && other.getExecutionFilter().equals(this.getExecutionFilter()) == false)
            return false;
        if (other.getTypeFilter() == null ^ this.getTypeFilter() == null)
            return false;
        if (other.getTypeFilter() != null && other.getTypeFilter().equals(this.getTypeFilter()) == false)
            return false;
        if (other.getTagFilter() == null ^ this.getTagFilter() == null)
            return false;
        if (other.getTagFilter() != null && other.getTagFilter().equals(this.getTagFilter()) == false)
            return false;
        if (other.getCloseStatusFilter() == null ^ this.getCloseStatusFilter() == null)
            return false;
        if (other.getCloseStatusFilter() != null && other.getCloseStatusFilter().equals(this.getCloseStatusFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getStartTimeFilter() == null) ? 0 : getStartTimeFilter().hashCode());
        hashCode = prime * hashCode + ((getCloseTimeFilter() == null) ? 0 : getCloseTimeFilter().hashCode());
        hashCode = prime * hashCode + ((getExecutionFilter() == null) ? 0 : getExecutionFilter().hashCode());
        hashCode = prime * hashCode + ((getTypeFilter() == null) ? 0 : getTypeFilter().hashCode());
        hashCode = prime * hashCode + ((getTagFilter() == null) ? 0 : getTagFilter().hashCode());
        hashCode = prime * hashCode + ((getCloseStatusFilter() == null) ? 0 : getCloseStatusFilter().hashCode());
        return hashCode;
    }

    @Override
    public CountClosedWorkflowExecutionsRequest clone() {
        return (CountClosedWorkflowExecutionsRequest) super.clone();
    }

}
