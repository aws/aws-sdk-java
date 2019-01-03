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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a workflow execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/WorkflowExecutionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowExecutionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The workflow execution this information is about.
     * </p>
     */
    private WorkflowExecution execution;
    /**
     * <p>
     * The type of the workflow execution.
     * </p>
     */
    private WorkflowType workflowType;
    /**
     * <p>
     * The time when the execution was started.
     * </p>
     */
    private java.util.Date startTimestamp;
    /**
     * <p>
     * The time when the workflow execution was closed. Set only if the execution status is CLOSED.
     * </p>
     */
    private java.util.Date closeTimestamp;
    /**
     * <p>
     * The current status of the execution.
     * </p>
     */
    private String executionStatus;
    /**
     * <p>
     * If the execution status is closed then this specifies how the execution was closed:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code> – the execution was successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> – the execution was canceled.Cancellation allows the implementation to gracefully clean up
     * before the execution is closed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code> – the execution was force terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – the execution failed to complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code> – the execution did not complete in the alloted time and was automatically timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUED_AS_NEW</code> – the execution is logically continued. This means the current execution was
     * completed and a new execution was started to carry on the workflow.
     * </p>
     * </li>
     * </ul>
     */
    private String closeStatus;
    /**
     * <p>
     * If this workflow execution is a child of another execution then contains the workflow execution that started this
     * execution.
     * </p>
     */
    private WorkflowExecution parent;
    /**
     * <p>
     * The list of tags associated with the workflow execution. Tags can be used to identify and list workflow
     * executions of interest through the visibility APIs. A workflow execution can have a maximum of 5 tags.
     * </p>
     */
    private java.util.List<String> tagList;
    /**
     * <p>
     * Set to true if a cancellation is requested for this workflow execution.
     * </p>
     */
    private Boolean cancelRequested;

    /**
     * <p>
     * The workflow execution this information is about.
     * </p>
     * 
     * @param execution
     *        The workflow execution this information is about.
     */

    public void setExecution(WorkflowExecution execution) {
        this.execution = execution;
    }

    /**
     * <p>
     * The workflow execution this information is about.
     * </p>
     * 
     * @return The workflow execution this information is about.
     */

    public WorkflowExecution getExecution() {
        return this.execution;
    }

    /**
     * <p>
     * The workflow execution this information is about.
     * </p>
     * 
     * @param execution
     *        The workflow execution this information is about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionInfo withExecution(WorkflowExecution execution) {
        setExecution(execution);
        return this;
    }

    /**
     * <p>
     * The type of the workflow execution.
     * </p>
     * 
     * @param workflowType
     *        The type of the workflow execution.
     */

    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * The type of the workflow execution.
     * </p>
     * 
     * @return The type of the workflow execution.
     */

    public WorkflowType getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * The type of the workflow execution.
     * </p>
     * 
     * @param workflowType
     *        The type of the workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionInfo withWorkflowType(WorkflowType workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * <p>
     * The time when the execution was started.
     * </p>
     * 
     * @param startTimestamp
     *        The time when the execution was started.
     */

    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * The time when the execution was started.
     * </p>
     * 
     * @return The time when the execution was started.
     */

    public java.util.Date getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * <p>
     * The time when the execution was started.
     * </p>
     * 
     * @param startTimestamp
     *        The time when the execution was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionInfo withStartTimestamp(java.util.Date startTimestamp) {
        setStartTimestamp(startTimestamp);
        return this;
    }

    /**
     * <p>
     * The time when the workflow execution was closed. Set only if the execution status is CLOSED.
     * </p>
     * 
     * @param closeTimestamp
     *        The time when the workflow execution was closed. Set only if the execution status is CLOSED.
     */

    public void setCloseTimestamp(java.util.Date closeTimestamp) {
        this.closeTimestamp = closeTimestamp;
    }

    /**
     * <p>
     * The time when the workflow execution was closed. Set only if the execution status is CLOSED.
     * </p>
     * 
     * @return The time when the workflow execution was closed. Set only if the execution status is CLOSED.
     */

    public java.util.Date getCloseTimestamp() {
        return this.closeTimestamp;
    }

    /**
     * <p>
     * The time when the workflow execution was closed. Set only if the execution status is CLOSED.
     * </p>
     * 
     * @param closeTimestamp
     *        The time when the workflow execution was closed. Set only if the execution status is CLOSED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionInfo withCloseTimestamp(java.util.Date closeTimestamp) {
        setCloseTimestamp(closeTimestamp);
        return this;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param executionStatus
     *        The current status of the execution.
     * @see ExecutionStatus
     */

    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @return The current status of the execution.
     * @see ExecutionStatus
     */

    public String getExecutionStatus() {
        return this.executionStatus;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param executionStatus
     *        The current status of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public WorkflowExecutionInfo withExecutionStatus(String executionStatus) {
        setExecutionStatus(executionStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param executionStatus
     *        The current status of the execution.
     * @see ExecutionStatus
     */

    public void setExecutionStatus(ExecutionStatus executionStatus) {
        withExecutionStatus(executionStatus);
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param executionStatus
     *        The current status of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public WorkflowExecutionInfo withExecutionStatus(ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the execution status is closed then this specifies how the execution was closed:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code> – the execution was successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> – the execution was canceled.Cancellation allows the implementation to gracefully clean up
     * before the execution is closed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code> – the execution was force terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – the execution failed to complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code> – the execution did not complete in the alloted time and was automatically timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUED_AS_NEW</code> – the execution is logically continued. This means the current execution was
     * completed and a new execution was started to carry on the workflow.
     * </p>
     * </li>
     * </ul>
     * 
     * @param closeStatus
     *        If the execution status is closed then this specifies how the execution was closed:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> – the execution was successfully completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELED</code> – the execution was canceled.Cancellation allows the implementation to gracefully
     *        clean up before the execution is closed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATED</code> – the execution was force terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – the execution failed to complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMED_OUT</code> – the execution did not complete in the alloted time and was automatically timed
     *        out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTINUED_AS_NEW</code> – the execution is logically continued. This means the current execution was
     *        completed and a new execution was started to carry on the workflow.
     *        </p>
     *        </li>
     * @see CloseStatus
     */

    public void setCloseStatus(String closeStatus) {
        this.closeStatus = closeStatus;
    }

    /**
     * <p>
     * If the execution status is closed then this specifies how the execution was closed:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code> – the execution was successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> – the execution was canceled.Cancellation allows the implementation to gracefully clean up
     * before the execution is closed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code> – the execution was force terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – the execution failed to complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code> – the execution did not complete in the alloted time and was automatically timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUED_AS_NEW</code> – the execution is logically continued. This means the current execution was
     * completed and a new execution was started to carry on the workflow.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If the execution status is closed then this specifies how the execution was closed:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code> – the execution was successfully completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELED</code> – the execution was canceled.Cancellation allows the implementation to gracefully
     *         clean up before the execution is closed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TERMINATED</code> – the execution was force terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> – the execution failed to complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TIMED_OUT</code> – the execution did not complete in the alloted time and was automatically timed
     *         out.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONTINUED_AS_NEW</code> – the execution is logically continued. This means the current execution
     *         was completed and a new execution was started to carry on the workflow.
     *         </p>
     *         </li>
     * @see CloseStatus
     */

    public String getCloseStatus() {
        return this.closeStatus;
    }

    /**
     * <p>
     * If the execution status is closed then this specifies how the execution was closed:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code> – the execution was successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> – the execution was canceled.Cancellation allows the implementation to gracefully clean up
     * before the execution is closed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code> – the execution was force terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – the execution failed to complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code> – the execution did not complete in the alloted time and was automatically timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUED_AS_NEW</code> – the execution is logically continued. This means the current execution was
     * completed and a new execution was started to carry on the workflow.
     * </p>
     * </li>
     * </ul>
     * 
     * @param closeStatus
     *        If the execution status is closed then this specifies how the execution was closed:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> – the execution was successfully completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELED</code> – the execution was canceled.Cancellation allows the implementation to gracefully
     *        clean up before the execution is closed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATED</code> – the execution was force terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – the execution failed to complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMED_OUT</code> – the execution did not complete in the alloted time and was automatically timed
     *        out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTINUED_AS_NEW</code> – the execution is logically continued. This means the current execution was
     *        completed and a new execution was started to carry on the workflow.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloseStatus
     */

    public WorkflowExecutionInfo withCloseStatus(String closeStatus) {
        setCloseStatus(closeStatus);
        return this;
    }

    /**
     * <p>
     * If the execution status is closed then this specifies how the execution was closed:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code> – the execution was successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> – the execution was canceled.Cancellation allows the implementation to gracefully clean up
     * before the execution is closed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code> – the execution was force terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – the execution failed to complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code> – the execution did not complete in the alloted time and was automatically timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUED_AS_NEW</code> – the execution is logically continued. This means the current execution was
     * completed and a new execution was started to carry on the workflow.
     * </p>
     * </li>
     * </ul>
     * 
     * @param closeStatus
     *        If the execution status is closed then this specifies how the execution was closed:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> – the execution was successfully completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELED</code> – the execution was canceled.Cancellation allows the implementation to gracefully
     *        clean up before the execution is closed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATED</code> – the execution was force terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – the execution failed to complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMED_OUT</code> – the execution did not complete in the alloted time and was automatically timed
     *        out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTINUED_AS_NEW</code> – the execution is logically continued. This means the current execution was
     *        completed and a new execution was started to carry on the workflow.
     *        </p>
     *        </li>
     * @see CloseStatus
     */

    public void setCloseStatus(CloseStatus closeStatus) {
        withCloseStatus(closeStatus);
    }

    /**
     * <p>
     * If the execution status is closed then this specifies how the execution was closed:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code> – the execution was successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> – the execution was canceled.Cancellation allows the implementation to gracefully clean up
     * before the execution is closed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code> – the execution was force terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – the execution failed to complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code> – the execution did not complete in the alloted time and was automatically timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUED_AS_NEW</code> – the execution is logically continued. This means the current execution was
     * completed and a new execution was started to carry on the workflow.
     * </p>
     * </li>
     * </ul>
     * 
     * @param closeStatus
     *        If the execution status is closed then this specifies how the execution was closed:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> – the execution was successfully completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELED</code> – the execution was canceled.Cancellation allows the implementation to gracefully
     *        clean up before the execution is closed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATED</code> – the execution was force terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – the execution failed to complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMED_OUT</code> – the execution did not complete in the alloted time and was automatically timed
     *        out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTINUED_AS_NEW</code> – the execution is logically continued. This means the current execution was
     *        completed and a new execution was started to carry on the workflow.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloseStatus
     */

    public WorkflowExecutionInfo withCloseStatus(CloseStatus closeStatus) {
        this.closeStatus = closeStatus.toString();
        return this;
    }

    /**
     * <p>
     * If this workflow execution is a child of another execution then contains the workflow execution that started this
     * execution.
     * </p>
     * 
     * @param parent
     *        If this workflow execution is a child of another execution then contains the workflow execution that
     *        started this execution.
     */

    public void setParent(WorkflowExecution parent) {
        this.parent = parent;
    }

    /**
     * <p>
     * If this workflow execution is a child of another execution then contains the workflow execution that started this
     * execution.
     * </p>
     * 
     * @return If this workflow execution is a child of another execution then contains the workflow execution that
     *         started this execution.
     */

    public WorkflowExecution getParent() {
        return this.parent;
    }

    /**
     * <p>
     * If this workflow execution is a child of another execution then contains the workflow execution that started this
     * execution.
     * </p>
     * 
     * @param parent
     *        If this workflow execution is a child of another execution then contains the workflow execution that
     *        started this execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionInfo withParent(WorkflowExecution parent) {
        setParent(parent);
        return this;
    }

    /**
     * <p>
     * The list of tags associated with the workflow execution. Tags can be used to identify and list workflow
     * executions of interest through the visibility APIs. A workflow execution can have a maximum of 5 tags.
     * </p>
     * 
     * @return The list of tags associated with the workflow execution. Tags can be used to identify and list workflow
     *         executions of interest through the visibility APIs. A workflow execution can have a maximum of 5 tags.
     */

    public java.util.List<String> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * The list of tags associated with the workflow execution. Tags can be used to identify and list workflow
     * executions of interest through the visibility APIs. A workflow execution can have a maximum of 5 tags.
     * </p>
     * 
     * @param tagList
     *        The list of tags associated with the workflow execution. Tags can be used to identify and list workflow
     *        executions of interest through the visibility APIs. A workflow execution can have a maximum of 5 tags.
     */

    public void setTagList(java.util.Collection<String> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new java.util.ArrayList<String>(tagList);
    }

    /**
     * <p>
     * The list of tags associated with the workflow execution. Tags can be used to identify and list workflow
     * executions of interest through the visibility APIs. A workflow execution can have a maximum of 5 tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        The list of tags associated with the workflow execution. Tags can be used to identify and list workflow
     *        executions of interest through the visibility APIs. A workflow execution can have a maximum of 5 tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionInfo withTagList(String... tagList) {
        if (this.tagList == null) {
            setTagList(new java.util.ArrayList<String>(tagList.length));
        }
        for (String ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags associated with the workflow execution. Tags can be used to identify and list workflow
     * executions of interest through the visibility APIs. A workflow execution can have a maximum of 5 tags.
     * </p>
     * 
     * @param tagList
     *        The list of tags associated with the workflow execution. Tags can be used to identify and list workflow
     *        executions of interest through the visibility APIs. A workflow execution can have a maximum of 5 tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionInfo withTagList(java.util.Collection<String> tagList) {
        setTagList(tagList);
        return this;
    }

    /**
     * <p>
     * Set to true if a cancellation is requested for this workflow execution.
     * </p>
     * 
     * @param cancelRequested
     *        Set to true if a cancellation is requested for this workflow execution.
     */

    public void setCancelRequested(Boolean cancelRequested) {
        this.cancelRequested = cancelRequested;
    }

    /**
     * <p>
     * Set to true if a cancellation is requested for this workflow execution.
     * </p>
     * 
     * @return Set to true if a cancellation is requested for this workflow execution.
     */

    public Boolean getCancelRequested() {
        return this.cancelRequested;
    }

    /**
     * <p>
     * Set to true if a cancellation is requested for this workflow execution.
     * </p>
     * 
     * @param cancelRequested
     *        Set to true if a cancellation is requested for this workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionInfo withCancelRequested(Boolean cancelRequested) {
        setCancelRequested(cancelRequested);
        return this;
    }

    /**
     * <p>
     * Set to true if a cancellation is requested for this workflow execution.
     * </p>
     * 
     * @return Set to true if a cancellation is requested for this workflow execution.
     */

    public Boolean isCancelRequested() {
        return this.cancelRequested;
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
        if (getExecution() != null)
            sb.append("Execution: ").append(getExecution()).append(",");
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType()).append(",");
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: ").append(getStartTimestamp()).append(",");
        if (getCloseTimestamp() != null)
            sb.append("CloseTimestamp: ").append(getCloseTimestamp()).append(",");
        if (getExecutionStatus() != null)
            sb.append("ExecutionStatus: ").append(getExecutionStatus()).append(",");
        if (getCloseStatus() != null)
            sb.append("CloseStatus: ").append(getCloseStatus()).append(",");
        if (getParent() != null)
            sb.append("Parent: ").append(getParent()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList()).append(",");
        if (getCancelRequested() != null)
            sb.append("CancelRequested: ").append(getCancelRequested());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowExecutionInfo == false)
            return false;
        WorkflowExecutionInfo other = (WorkflowExecutionInfo) obj;
        if (other.getExecution() == null ^ this.getExecution() == null)
            return false;
        if (other.getExecution() != null && other.getExecution().equals(this.getExecution()) == false)
            return false;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getCloseTimestamp() == null ^ this.getCloseTimestamp() == null)
            return false;
        if (other.getCloseTimestamp() != null && other.getCloseTimestamp().equals(this.getCloseTimestamp()) == false)
            return false;
        if (other.getExecutionStatus() == null ^ this.getExecutionStatus() == null)
            return false;
        if (other.getExecutionStatus() != null && other.getExecutionStatus().equals(this.getExecutionStatus()) == false)
            return false;
        if (other.getCloseStatus() == null ^ this.getCloseStatus() == null)
            return false;
        if (other.getCloseStatus() != null && other.getCloseStatus().equals(this.getCloseStatus()) == false)
            return false;
        if (other.getParent() == null ^ this.getParent() == null)
            return false;
        if (other.getParent() != null && other.getParent().equals(this.getParent()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        if (other.getCancelRequested() == null ^ this.getCancelRequested() == null)
            return false;
        if (other.getCancelRequested() != null && other.getCancelRequested().equals(this.getCancelRequested()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecution() == null) ? 0 : getExecution().hashCode());
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCloseTimestamp() == null) ? 0 : getCloseTimestamp().hashCode());
        hashCode = prime * hashCode + ((getExecutionStatus() == null) ? 0 : getExecutionStatus().hashCode());
        hashCode = prime * hashCode + ((getCloseStatus() == null) ? 0 : getCloseStatus().hashCode());
        hashCode = prime * hashCode + ((getParent() == null) ? 0 : getParent().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        hashCode = prime * hashCode + ((getCancelRequested() == null) ? 0 : getCancelRequested().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowExecutionInfo clone() {
        try {
            return (WorkflowExecutionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.WorkflowExecutionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
