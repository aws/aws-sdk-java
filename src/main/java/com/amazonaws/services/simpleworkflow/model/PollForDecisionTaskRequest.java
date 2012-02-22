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
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#pollForDecisionTask(PollForDecisionTaskRequest) PollForDecisionTask operation}.
 * <p>
 * Used by deciders to get a DecisionTask from the specified decision
 * <code>taskList</code> .
 * A decision task may be returned for any open workflow
 * execution that is using the specified task list. The task includes a
 * paginated view of the history of the workflow execution. The decider
 * should use the workflow type and the history to determine how to
 * properly handle the task.
 * </p>
 * <p>
 * This action initiates a long poll, where the service holds the HTTP
 * connection open and responds as soon a task becomes available. If no
 * decision task is available in the specified task list before the
 * timeout of 60 seconds expires, an empty result is returned. An empty
 * result, in this context, means that a DecisionTask is returned, but
 * that the value of taskToken is an empty string.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> Deciders should set their client side socket timeout
 * to at least 70 seconds (10 seconds higher than the timeout).
 * </p>
 * <p>
 * <b>IMPORTANT:</b> Because the number of workflow history events for a
 * single workflow execution might be very large, the result returned
 * might be split up across a number of pages. To retrieve subsequent
 * pages, make additional calls to PollForDecisionTask using the
 * nextPageToken returned by the initial call. Note that you do not call
 * GetWorkflowExecutionHistory with this nextPageToken. Instead, call
 * PollForDecisionTask again.
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#pollForDecisionTask(PollForDecisionTaskRequest)
 */
public class PollForDecisionTaskRequest extends AmazonWebServiceRequest {

    /**
     * The name of the domain containing the task lists to poll.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String domain;

    /**
     * Specifies the task list to poll for decision tasks. <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     */
    private TaskList taskList;

    /**
     * Identity of the decider making the request, which is recorded in the
     * DecisionTaskStarted event in the workflow history. This enables
     * diagnostic tracing when problems arise. The form of this identity is
     * user defined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String identity;

    /**
     * If on a previous call to this method a <code>NextPageToken</code> was
     * returned, the results are being paginated. To get the next page of
     * results, repeat the call with the returned token and all other
     * arguments unchanged. <note>The <code>nextPageToken</code> returned by
     * this action cannot be used with <a>GetWorkflowExecutionHistory</a> to
     * get the next page. You must call <a>PollForDecisionTask</a> again
     * (with the <code>nextPageToken</code>) to retrieve the next page of
     * history records. Calling <a>PollForDecisionTask</a> with a
     * <code>nextPageToken</code> will not return a new decision
     * task.</note>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String nextPageToken;

    /**
     * The maximum number of history events returned in each page. The
     * default is 100, but the caller can override this value to a page size
     * <i>smaller</i> than the default. You cannot specify a page size
     * greater than 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     */
    private Integer maximumPageSize;

    /**
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimestamp</code> of the events.
     */
    private Boolean reverseOrder;

    /**
     * The name of the domain containing the task lists to poll.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the domain containing the task lists to poll.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The name of the domain containing the task lists to poll.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain containing the task lists to poll.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The name of the domain containing the task lists to poll.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain containing the task lists to poll.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PollForDecisionTaskRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    
    /**
     * Specifies the task list to poll for decision tasks. <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     *
     * @return Specifies the task list to poll for decision tasks. <p>The specified
     *         string must not start or end with whitespace. It must not contain a
     *         <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     *         (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *         \u009f). Also, it must not contain the literal string "arn".
     */
    public TaskList getTaskList() {
        return taskList;
    }
    
    /**
     * Specifies the task list to poll for decision tasks. <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     *
     * @param taskList Specifies the task list to poll for decision tasks. <p>The specified
     *         string must not start or end with whitespace. It must not contain a
     *         <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     *         (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *         \u009f). Also, it must not contain the literal string "arn".
     */
    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
    
    /**
     * Specifies the task list to poll for decision tasks. <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskList Specifies the task list to poll for decision tasks. <p>The specified
     *         string must not start or end with whitespace. It must not contain a
     *         <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     *         (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *         \u009f). Also, it must not contain the literal string "arn".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PollForDecisionTaskRequest withTaskList(TaskList taskList) {
        this.taskList = taskList;
        return this;
    }
    
    
    /**
     * Identity of the decider making the request, which is recorded in the
     * DecisionTaskStarted event in the workflow history. This enables
     * diagnostic tracing when problems arise. The form of this identity is
     * user defined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return Identity of the decider making the request, which is recorded in the
     *         DecisionTaskStarted event in the workflow history. This enables
     *         diagnostic tracing when problems arise. The form of this identity is
     *         user defined.
     */
    public String getIdentity() {
        return identity;
    }
    
    /**
     * Identity of the decider making the request, which is recorded in the
     * DecisionTaskStarted event in the workflow history. This enables
     * diagnostic tracing when problems arise. The form of this identity is
     * user defined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param identity Identity of the decider making the request, which is recorded in the
     *         DecisionTaskStarted event in the workflow history. This enables
     *         diagnostic tracing when problems arise. The form of this identity is
     *         user defined.
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    
    /**
     * Identity of the decider making the request, which is recorded in the
     * DecisionTaskStarted event in the workflow history. This enables
     * diagnostic tracing when problems arise. The form of this identity is
     * user defined.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param identity Identity of the decider making the request, which is recorded in the
     *         DecisionTaskStarted event in the workflow history. This enables
     *         diagnostic tracing when problems arise. The form of this identity is
     *         user defined.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PollForDecisionTaskRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    
    
    /**
     * If on a previous call to this method a <code>NextPageToken</code> was
     * returned, the results are being paginated. To get the next page of
     * results, repeat the call with the returned token and all other
     * arguments unchanged. <note>The <code>nextPageToken</code> returned by
     * this action cannot be used with <a>GetWorkflowExecutionHistory</a> to
     * get the next page. You must call <a>PollForDecisionTask</a> again
     * (with the <code>nextPageToken</code>) to retrieve the next page of
     * history records. Calling <a>PollForDecisionTask</a> with a
     * <code>nextPageToken</code> will not return a new decision
     * task.</note>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return If on a previous call to this method a <code>NextPageToken</code> was
     *         returned, the results are being paginated. To get the next page of
     *         results, repeat the call with the returned token and all other
     *         arguments unchanged. <note>The <code>nextPageToken</code> returned by
     *         this action cannot be used with <a>GetWorkflowExecutionHistory</a> to
     *         get the next page. You must call <a>PollForDecisionTask</a> again
     *         (with the <code>nextPageToken</code>) to retrieve the next page of
     *         history records. Calling <a>PollForDecisionTask</a> with a
     *         <code>nextPageToken</code> will not return a new decision
     *         task.</note>.
     */
    public String getNextPageToken() {
        return nextPageToken;
    }
    
    /**
     * If on a previous call to this method a <code>NextPageToken</code> was
     * returned, the results are being paginated. To get the next page of
     * results, repeat the call with the returned token and all other
     * arguments unchanged. <note>The <code>nextPageToken</code> returned by
     * this action cannot be used with <a>GetWorkflowExecutionHistory</a> to
     * get the next page. You must call <a>PollForDecisionTask</a> again
     * (with the <code>nextPageToken</code>) to retrieve the next page of
     * history records. Calling <a>PollForDecisionTask</a> with a
     * <code>nextPageToken</code> will not return a new decision
     * task.</note>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken If on a previous call to this method a <code>NextPageToken</code> was
     *         returned, the results are being paginated. To get the next page of
     *         results, repeat the call with the returned token and all other
     *         arguments unchanged. <note>The <code>nextPageToken</code> returned by
     *         this action cannot be used with <a>GetWorkflowExecutionHistory</a> to
     *         get the next page. You must call <a>PollForDecisionTask</a> again
     *         (with the <code>nextPageToken</code>) to retrieve the next page of
     *         history records. Calling <a>PollForDecisionTask</a> with a
     *         <code>nextPageToken</code> will not return a new decision
     *         task.</note>.
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
    
    /**
     * If on a previous call to this method a <code>NextPageToken</code> was
     * returned, the results are being paginated. To get the next page of
     * results, repeat the call with the returned token and all other
     * arguments unchanged. <note>The <code>nextPageToken</code> returned by
     * this action cannot be used with <a>GetWorkflowExecutionHistory</a> to
     * get the next page. You must call <a>PollForDecisionTask</a> again
     * (with the <code>nextPageToken</code>) to retrieve the next page of
     * history records. Calling <a>PollForDecisionTask</a> with a
     * <code>nextPageToken</code> will not return a new decision
     * task.</note>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken If on a previous call to this method a <code>NextPageToken</code> was
     *         returned, the results are being paginated. To get the next page of
     *         results, repeat the call with the returned token and all other
     *         arguments unchanged. <note>The <code>nextPageToken</code> returned by
     *         this action cannot be used with <a>GetWorkflowExecutionHistory</a> to
     *         get the next page. You must call <a>PollForDecisionTask</a> again
     *         (with the <code>nextPageToken</code>) to retrieve the next page of
     *         history records. Calling <a>PollForDecisionTask</a> with a
     *         <code>nextPageToken</code> will not return a new decision
     *         task.</note>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PollForDecisionTaskRequest withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    
    
    /**
     * The maximum number of history events returned in each page. The
     * default is 100, but the caller can override this value to a page size
     * <i>smaller</i> than the default. You cannot specify a page size
     * greater than 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @return The maximum number of history events returned in each page. The
     *         default is 100, but the caller can override this value to a page size
     *         <i>smaller</i> than the default. You cannot specify a page size
     *         greater than 100.
     */
    public Integer getMaximumPageSize() {
        return maximumPageSize;
    }
    
    /**
     * The maximum number of history events returned in each page. The
     * default is 100, but the caller can override this value to a page size
     * <i>smaller</i> than the default. You cannot specify a page size
     * greater than 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param maximumPageSize The maximum number of history events returned in each page. The
     *         default is 100, but the caller can override this value to a page size
     *         <i>smaller</i> than the default. You cannot specify a page size
     *         greater than 100.
     */
    public void setMaximumPageSize(Integer maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
    }
    
    /**
     * The maximum number of history events returned in each page. The
     * default is 100, but the caller can override this value to a page size
     * <i>smaller</i> than the default. You cannot specify a page size
     * greater than 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param maximumPageSize The maximum number of history events returned in each page. The
     *         default is 100, but the caller can override this value to a page size
     *         <i>smaller</i> than the default. You cannot specify a page size
     *         greater than 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PollForDecisionTaskRequest withMaximumPageSize(Integer maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }
    
    
    /**
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimestamp</code> of the events.
     *
     * @return When set to <code>true</code>, returns the events in reverse order. By
     *         default the results are returned in ascending order of the
     *         <code>eventTimestamp</code> of the events.
     */
    public Boolean isReverseOrder() {
        return reverseOrder;
    }
    
    /**
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimestamp</code> of the events.
     *
     * @param reverseOrder When set to <code>true</code>, returns the events in reverse order. By
     *         default the results are returned in ascending order of the
     *         <code>eventTimestamp</code> of the events.
     */
    public void setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }
    
    /**
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimestamp</code> of the events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reverseOrder When set to <code>true</code>, returns the events in reverse order. By
     *         default the results are returned in ascending order of the
     *         <code>eventTimestamp</code> of the events.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PollForDecisionTaskRequest withReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
        return this;
    }
    
    
    /**
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimestamp</code> of the events.
     *
     * @return When set to <code>true</code>, returns the events in reverse order. By
     *         default the results are returned in ascending order of the
     *         <code>eventTimestamp</code> of the events.
     */
    public Boolean getReverseOrder() {
        return reverseOrder;
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
        if (taskList != null) sb.append("TaskList: " + taskList + ", ");
        if (identity != null) sb.append("Identity: " + identity + ", ");
        if (nextPageToken != null) sb.append("NextPageToken: " + nextPageToken + ", ");
        if (maximumPageSize != null) sb.append("MaximumPageSize: " + maximumPageSize + ", ");
        if (reverseOrder != null) sb.append("ReverseOrder: " + reverseOrder + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode()); 
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode()); 
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaximumPageSize() == null) ? 0 : getMaximumPageSize().hashCode()); 
        hashCode = prime * hashCode + ((isReverseOrder() == null) ? 0 : isReverseOrder().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof PollForDecisionTaskRequest == false) return false;
        PollForDecisionTaskRequest other = (PollForDecisionTaskRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getTaskList() == null ^ this.getTaskList() == null) return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false) return false; 
        if (other.getIdentity() == null ^ this.getIdentity() == null) return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false) return false; 
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null) return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false) return false; 
        if (other.getMaximumPageSize() == null ^ this.getMaximumPageSize() == null) return false;
        if (other.getMaximumPageSize() != null && other.getMaximumPageSize().equals(this.getMaximumPageSize()) == false) return false; 
        if (other.isReverseOrder() == null ^ this.isReverseOrder() == null) return false;
        if (other.isReverseOrder() != null && other.isReverseOrder().equals(this.isReverseOrder()) == false) return false; 
        return true;
    }
    
}
    