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
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#pollForActivityTask(PollForActivityTaskRequest) PollForActivityTask operation}.
 * <p>
 * Used by workers to get an ActivityTask from the specified activity <code>taskList</code> .
 * This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available. The maximum time
 * the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll will return an empty result.
 * An empty result, in this context, means that an ActivityTask is returned, but that the value of taskToken is an empty string. If a task is returned,
 * the worker should use its type to identify and process it correctly.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> Workers should set their client side socket timeout to at least 70 seconds (10 seconds higher than the maximum time service may hold
 * the poll request).
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
 * <li>Use a <b>Condition</b> element with the <code>swf:taskList.name</code> key to allow the action to access only certain task lists.</li>
 * 
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action
 * fails by throwing <code>OperationNotPermitted</code> . For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a> .
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#pollForActivityTask(PollForActivityTaskRequest)
 */
public class PollForActivityTaskRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the domain that contains the task lists being polled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String domain;

    /**
     * Specifies the task list to poll for activity tasks. <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     */
    private TaskList taskList;

    /**
     * Identity of the worker making the request, which is recorded in the
     * <code>ActivityTaskStarted</code> event in the workflow history. This
     * enables diagnostic tracing when problems arise. The form of this
     * identity is user defined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String identity;

    /**
     * The name of the domain that contains the task lists being polled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the domain that contains the task lists being polled.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The name of the domain that contains the task lists being polled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain that contains the task lists being polled.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The name of the domain that contains the task lists being polled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain that contains the task lists being polled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PollForActivityTaskRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Specifies the task list to poll for activity tasks. <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     *
     * @return Specifies the task list to poll for activity tasks. <p>The specified
     *         string must not start or end with whitespace. It must not contain a
     *         <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     *         (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *         \u009f). Also, it must not contain the literal string "arn".
     */
    public TaskList getTaskList() {
        return taskList;
    }
    
    /**
     * Specifies the task list to poll for activity tasks. <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     *
     * @param taskList Specifies the task list to poll for activity tasks. <p>The specified
     *         string must not start or end with whitespace. It must not contain a
     *         <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     *         (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *         \u009f). Also, it must not contain the literal string "arn".
     */
    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
    
    /**
     * Specifies the task list to poll for activity tasks. <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskList Specifies the task list to poll for activity tasks. <p>The specified
     *         string must not start or end with whitespace. It must not contain a
     *         <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     *         (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *         \u009f). Also, it must not contain the literal string "arn".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PollForActivityTaskRequest withTaskList(TaskList taskList) {
        this.taskList = taskList;
        return this;
    }

    /**
     * Identity of the worker making the request, which is recorded in the
     * <code>ActivityTaskStarted</code> event in the workflow history. This
     * enables diagnostic tracing when problems arise. The form of this
     * identity is user defined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return Identity of the worker making the request, which is recorded in the
     *         <code>ActivityTaskStarted</code> event in the workflow history. This
     *         enables diagnostic tracing when problems arise. The form of this
     *         identity is user defined.
     */
    public String getIdentity() {
        return identity;
    }
    
    /**
     * Identity of the worker making the request, which is recorded in the
     * <code>ActivityTaskStarted</code> event in the workflow history. This
     * enables diagnostic tracing when problems arise. The form of this
     * identity is user defined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param identity Identity of the worker making the request, which is recorded in the
     *         <code>ActivityTaskStarted</code> event in the workflow history. This
     *         enables diagnostic tracing when problems arise. The form of this
     *         identity is user defined.
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    
    /**
     * Identity of the worker making the request, which is recorded in the
     * <code>ActivityTaskStarted</code> event in the workflow history. This
     * enables diagnostic tracing when problems arise. The form of this
     * identity is user defined.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param identity Identity of the worker making the request, which is recorded in the
     *         <code>ActivityTaskStarted</code> event in the workflow history. This
     *         enables diagnostic tracing when problems arise. The form of this
     *         identity is user defined.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PollForActivityTaskRequest withIdentity(String identity) {
        this.identity = identity;
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
        if (getTaskList() != null) sb.append("TaskList: " + getTaskList() + ",");
        if (getIdentity() != null) sb.append("Identity: " + getIdentity() );
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PollForActivityTaskRequest == false) return false;
        PollForActivityTaskRequest other = (PollForActivityTaskRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getTaskList() == null ^ this.getTaskList() == null) return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false) return false; 
        if (other.getIdentity() == null ^ this.getIdentity() == null) return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false) return false; 
        return true;
    }
    
}
    