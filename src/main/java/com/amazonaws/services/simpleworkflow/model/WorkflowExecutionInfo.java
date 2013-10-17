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


/**
 * <p>
 * Contains information about a workflow execution.
 * </p>
 */
public class WorkflowExecutionInfo implements Serializable {

    /**
     * The workflow execution this information is about.
     */
    private WorkflowExecution execution;

    /**
     * The type of the workflow execution.
     */
    private WorkflowType workflowType;

    /**
     * The time when the execution was started.
     */
    private java.util.Date startTimestamp;

    /**
     * The time when the workflow execution was closed. Set only if the
     * execution status is CLOSED.
     */
    private java.util.Date closeTimestamp;

    /**
     * The current status of the execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     */
    private String executionStatus;

    /**
     * If the execution status is closed then this specifies how the
     * execution was closed: <ul> <li>COMPLETED: the execution was
     * successfully completed.</li> <li>CANCELED: the execution was
     * canceled.Cancellation allows the implementation to gracefully clean up
     * before the execution is closed.</li> <li>TERMINATED: the execution was
     * force terminated.</li> <li>FAILED: the execution failed to
     * complete.</li> <li>TIMED_OUT: the execution did not complete in the
     * alloted time and was automatically timed out.</li>
     * <li>CONTINUED_AS_NEW: the execution is logically continued. This means
     * the current execution was completed and a new execution was started to
     * carry on the workflow.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT
     */
    private String closeStatus;

    /**
     * If this workflow execution is a child of another execution then
     * contains the workflow execution that started this execution.
     */
    private WorkflowExecution parent;

    /**
     * The list of tags associated with the workflow execution. Tags can be
     * used to identify and list workflow executions of interest through the
     * visibility APIs. A workflow execution can have a maximum of 5 tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagList;

    /**
     * Set to true if a cancellation is requested for this workflow
     * execution.
     */
    private Boolean cancelRequested;

    /**
     * The workflow execution this information is about.
     *
     * @return The workflow execution this information is about.
     */
    public WorkflowExecution getExecution() {
        return execution;
    }
    
    /**
     * The workflow execution this information is about.
     *
     * @param execution The workflow execution this information is about.
     */
    public void setExecution(WorkflowExecution execution) {
        this.execution = execution;
    }
    
    /**
     * The workflow execution this information is about.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param execution The workflow execution this information is about.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionInfo withExecution(WorkflowExecution execution) {
        this.execution = execution;
        return this;
    }

    /**
     * The type of the workflow execution.
     *
     * @return The type of the workflow execution.
     */
    public WorkflowType getWorkflowType() {
        return workflowType;
    }
    
    /**
     * The type of the workflow execution.
     *
     * @param workflowType The type of the workflow execution.
     */
    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }
    
    /**
     * The type of the workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowType The type of the workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionInfo withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
        return this;
    }

    /**
     * The time when the execution was started.
     *
     * @return The time when the execution was started.
     */
    public java.util.Date getStartTimestamp() {
        return startTimestamp;
    }
    
    /**
     * The time when the execution was started.
     *
     * @param startTimestamp The time when the execution was started.
     */
    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }
    
    /**
     * The time when the execution was started.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTimestamp The time when the execution was started.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionInfo withStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * The time when the workflow execution was closed. Set only if the
     * execution status is CLOSED.
     *
     * @return The time when the workflow execution was closed. Set only if the
     *         execution status is CLOSED.
     */
    public java.util.Date getCloseTimestamp() {
        return closeTimestamp;
    }
    
    /**
     * The time when the workflow execution was closed. Set only if the
     * execution status is CLOSED.
     *
     * @param closeTimestamp The time when the workflow execution was closed. Set only if the
     *         execution status is CLOSED.
     */
    public void setCloseTimestamp(java.util.Date closeTimestamp) {
        this.closeTimestamp = closeTimestamp;
    }
    
    /**
     * The time when the workflow execution was closed. Set only if the
     * execution status is CLOSED.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param closeTimestamp The time when the workflow execution was closed. Set only if the
     *         execution status is CLOSED.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionInfo withCloseTimestamp(java.util.Date closeTimestamp) {
        this.closeTimestamp = closeTimestamp;
        return this;
    }

    /**
     * The current status of the execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @return The current status of the execution.
     *
     * @see ExecutionStatus
     */
    public String getExecutionStatus() {
        return executionStatus;
    }
    
    /**
     * The current status of the execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param executionStatus The current status of the execution.
     *
     * @see ExecutionStatus
     */
    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }
    
    /**
     * The current status of the execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param executionStatus The current status of the execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ExecutionStatus
     */
    public WorkflowExecutionInfo withExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }

    /**
     * The current status of the execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param executionStatus The current status of the execution.
     *
     * @see ExecutionStatus
     */
    public void setExecutionStatus(ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus.toString();
    }
    
    /**
     * The current status of the execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param executionStatus The current status of the execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ExecutionStatus
     */
    public WorkflowExecutionInfo withExecutionStatus(ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus.toString();
        return this;
    }

    /**
     * If the execution status is closed then this specifies how the
     * execution was closed: <ul> <li>COMPLETED: the execution was
     * successfully completed.</li> <li>CANCELED: the execution was
     * canceled.Cancellation allows the implementation to gracefully clean up
     * before the execution is closed.</li> <li>TERMINATED: the execution was
     * force terminated.</li> <li>FAILED: the execution failed to
     * complete.</li> <li>TIMED_OUT: the execution did not complete in the
     * alloted time and was automatically timed out.</li>
     * <li>CONTINUED_AS_NEW: the execution is logically continued. This means
     * the current execution was completed and a new execution was started to
     * carry on the workflow.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT
     *
     * @return If the execution status is closed then this specifies how the
     *         execution was closed: <ul> <li>COMPLETED: the execution was
     *         successfully completed.</li> <li>CANCELED: the execution was
     *         canceled.Cancellation allows the implementation to gracefully clean up
     *         before the execution is closed.</li> <li>TERMINATED: the execution was
     *         force terminated.</li> <li>FAILED: the execution failed to
     *         complete.</li> <li>TIMED_OUT: the execution did not complete in the
     *         alloted time and was automatically timed out.</li>
     *         <li>CONTINUED_AS_NEW: the execution is logically continued. This means
     *         the current execution was completed and a new execution was started to
     *         carry on the workflow.</li> </ul>
     *
     * @see CloseStatus
     */
    public String getCloseStatus() {
        return closeStatus;
    }
    
    /**
     * If the execution status is closed then this specifies how the
     * execution was closed: <ul> <li>COMPLETED: the execution was
     * successfully completed.</li> <li>CANCELED: the execution was
     * canceled.Cancellation allows the implementation to gracefully clean up
     * before the execution is closed.</li> <li>TERMINATED: the execution was
     * force terminated.</li> <li>FAILED: the execution failed to
     * complete.</li> <li>TIMED_OUT: the execution did not complete in the
     * alloted time and was automatically timed out.</li>
     * <li>CONTINUED_AS_NEW: the execution is logically continued. This means
     * the current execution was completed and a new execution was started to
     * carry on the workflow.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT
     *
     * @param closeStatus If the execution status is closed then this specifies how the
     *         execution was closed: <ul> <li>COMPLETED: the execution was
     *         successfully completed.</li> <li>CANCELED: the execution was
     *         canceled.Cancellation allows the implementation to gracefully clean up
     *         before the execution is closed.</li> <li>TERMINATED: the execution was
     *         force terminated.</li> <li>FAILED: the execution failed to
     *         complete.</li> <li>TIMED_OUT: the execution did not complete in the
     *         alloted time and was automatically timed out.</li>
     *         <li>CONTINUED_AS_NEW: the execution is logically continued. This means
     *         the current execution was completed and a new execution was started to
     *         carry on the workflow.</li> </ul>
     *
     * @see CloseStatus
     */
    public void setCloseStatus(String closeStatus) {
        this.closeStatus = closeStatus;
    }
    
    /**
     * If the execution status is closed then this specifies how the
     * execution was closed: <ul> <li>COMPLETED: the execution was
     * successfully completed.</li> <li>CANCELED: the execution was
     * canceled.Cancellation allows the implementation to gracefully clean up
     * before the execution is closed.</li> <li>TERMINATED: the execution was
     * force terminated.</li> <li>FAILED: the execution failed to
     * complete.</li> <li>TIMED_OUT: the execution did not complete in the
     * alloted time and was automatically timed out.</li>
     * <li>CONTINUED_AS_NEW: the execution is logically continued. This means
     * the current execution was completed and a new execution was started to
     * carry on the workflow.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT
     *
     * @param closeStatus If the execution status is closed then this specifies how the
     *         execution was closed: <ul> <li>COMPLETED: the execution was
     *         successfully completed.</li> <li>CANCELED: the execution was
     *         canceled.Cancellation allows the implementation to gracefully clean up
     *         before the execution is closed.</li> <li>TERMINATED: the execution was
     *         force terminated.</li> <li>FAILED: the execution failed to
     *         complete.</li> <li>TIMED_OUT: the execution did not complete in the
     *         alloted time and was automatically timed out.</li>
     *         <li>CONTINUED_AS_NEW: the execution is logically continued. This means
     *         the current execution was completed and a new execution was started to
     *         carry on the workflow.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see CloseStatus
     */
    public WorkflowExecutionInfo withCloseStatus(String closeStatus) {
        this.closeStatus = closeStatus;
        return this;
    }

    /**
     * If the execution status is closed then this specifies how the
     * execution was closed: <ul> <li>COMPLETED: the execution was
     * successfully completed.</li> <li>CANCELED: the execution was
     * canceled.Cancellation allows the implementation to gracefully clean up
     * before the execution is closed.</li> <li>TERMINATED: the execution was
     * force terminated.</li> <li>FAILED: the execution failed to
     * complete.</li> <li>TIMED_OUT: the execution did not complete in the
     * alloted time and was automatically timed out.</li>
     * <li>CONTINUED_AS_NEW: the execution is logically continued. This means
     * the current execution was completed and a new execution was started to
     * carry on the workflow.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT
     *
     * @param closeStatus If the execution status is closed then this specifies how the
     *         execution was closed: <ul> <li>COMPLETED: the execution was
     *         successfully completed.</li> <li>CANCELED: the execution was
     *         canceled.Cancellation allows the implementation to gracefully clean up
     *         before the execution is closed.</li> <li>TERMINATED: the execution was
     *         force terminated.</li> <li>FAILED: the execution failed to
     *         complete.</li> <li>TIMED_OUT: the execution did not complete in the
     *         alloted time and was automatically timed out.</li>
     *         <li>CONTINUED_AS_NEW: the execution is logically continued. This means
     *         the current execution was completed and a new execution was started to
     *         carry on the workflow.</li> </ul>
     *
     * @see CloseStatus
     */
    public void setCloseStatus(CloseStatus closeStatus) {
        this.closeStatus = closeStatus.toString();
    }
    
    /**
     * If the execution status is closed then this specifies how the
     * execution was closed: <ul> <li>COMPLETED: the execution was
     * successfully completed.</li> <li>CANCELED: the execution was
     * canceled.Cancellation allows the implementation to gracefully clean up
     * before the execution is closed.</li> <li>TERMINATED: the execution was
     * force terminated.</li> <li>FAILED: the execution failed to
     * complete.</li> <li>TIMED_OUT: the execution did not complete in the
     * alloted time and was automatically timed out.</li>
     * <li>CONTINUED_AS_NEW: the execution is logically continued. This means
     * the current execution was completed and a new execution was started to
     * carry on the workflow.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT
     *
     * @param closeStatus If the execution status is closed then this specifies how the
     *         execution was closed: <ul> <li>COMPLETED: the execution was
     *         successfully completed.</li> <li>CANCELED: the execution was
     *         canceled.Cancellation allows the implementation to gracefully clean up
     *         before the execution is closed.</li> <li>TERMINATED: the execution was
     *         force terminated.</li> <li>FAILED: the execution failed to
     *         complete.</li> <li>TIMED_OUT: the execution did not complete in the
     *         alloted time and was automatically timed out.</li>
     *         <li>CONTINUED_AS_NEW: the execution is logically continued. This means
     *         the current execution was completed and a new execution was started to
     *         carry on the workflow.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see CloseStatus
     */
    public WorkflowExecutionInfo withCloseStatus(CloseStatus closeStatus) {
        this.closeStatus = closeStatus.toString();
        return this;
    }

    /**
     * If this workflow execution is a child of another execution then
     * contains the workflow execution that started this execution.
     *
     * @return If this workflow execution is a child of another execution then
     *         contains the workflow execution that started this execution.
     */
    public WorkflowExecution getParent() {
        return parent;
    }
    
    /**
     * If this workflow execution is a child of another execution then
     * contains the workflow execution that started this execution.
     *
     * @param parent If this workflow execution is a child of another execution then
     *         contains the workflow execution that started this execution.
     */
    public void setParent(WorkflowExecution parent) {
        this.parent = parent;
    }
    
    /**
     * If this workflow execution is a child of another execution then
     * contains the workflow execution that started this execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parent If this workflow execution is a child of another execution then
     *         contains the workflow execution that started this execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionInfo withParent(WorkflowExecution parent) {
        this.parent = parent;
        return this;
    }

    /**
     * The list of tags associated with the workflow execution. Tags can be
     * used to identify and list workflow executions of interest through the
     * visibility APIs. A workflow execution can have a maximum of 5 tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return The list of tags associated with the workflow execution. Tags can be
     *         used to identify and list workflow executions of interest through the
     *         visibility APIs. A workflow execution can have a maximum of 5 tags.
     */
    public java.util.List<String> getTagList() {
        if (tagList == null) {
              tagList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagList.setAutoConstruct(true);
        }
        return tagList;
    }
    
    /**
     * The list of tags associated with the workflow execution. Tags can be
     * used to identify and list workflow executions of interest through the
     * visibility APIs. A workflow execution can have a maximum of 5 tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags associated with the workflow execution. Tags can be
     *         used to identify and list workflow executions of interest through the
     *         visibility APIs. A workflow execution can have a maximum of 5 tags.
     */
    public void setTagList(java.util.Collection<String> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tagListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagList.size());
        tagListCopy.addAll(tagList);
        this.tagList = tagListCopy;
    }
    
    /**
     * The list of tags associated with the workflow execution. Tags can be
     * used to identify and list workflow executions of interest through the
     * visibility APIs. A workflow execution can have a maximum of 5 tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags associated with the workflow execution. Tags can be
     *         used to identify and list workflow executions of interest through the
     *         visibility APIs. A workflow execution can have a maximum of 5 tags.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionInfo withTagList(String... tagList) {
        if (getTagList() == null) setTagList(new java.util.ArrayList<String>(tagList.length));
        for (String value : tagList) {
            getTagList().add(value);
        }
        return this;
    }
    
    /**
     * The list of tags associated with the workflow execution. Tags can be
     * used to identify and list workflow executions of interest through the
     * visibility APIs. A workflow execution can have a maximum of 5 tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags associated with the workflow execution. Tags can be
     *         used to identify and list workflow executions of interest through the
     *         visibility APIs. A workflow execution can have a maximum of 5 tags.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionInfo withTagList(java.util.Collection<String> tagList) {
        if (tagList == null) {
            this.tagList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagList.size());
            tagListCopy.addAll(tagList);
            this.tagList = tagListCopy;
        }

        return this;
    }

    /**
     * Set to true if a cancellation is requested for this workflow
     * execution.
     *
     * @return Set to true if a cancellation is requested for this workflow
     *         execution.
     */
    public Boolean isCancelRequested() {
        return cancelRequested;
    }
    
    /**
     * Set to true if a cancellation is requested for this workflow
     * execution.
     *
     * @param cancelRequested Set to true if a cancellation is requested for this workflow
     *         execution.
     */
    public void setCancelRequested(Boolean cancelRequested) {
        this.cancelRequested = cancelRequested;
    }
    
    /**
     * Set to true if a cancellation is requested for this workflow
     * execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cancelRequested Set to true if a cancellation is requested for this workflow
     *         execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionInfo withCancelRequested(Boolean cancelRequested) {
        this.cancelRequested = cancelRequested;
        return this;
    }

    /**
     * Set to true if a cancellation is requested for this workflow
     * execution.
     *
     * @return Set to true if a cancellation is requested for this workflow
     *         execution.
     */
    public Boolean getCancelRequested() {
        return cancelRequested;
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
        if (getExecution() != null) sb.append("Execution: " + getExecution() + ",");
        if (getWorkflowType() != null) sb.append("WorkflowType: " + getWorkflowType() + ",");
        if (getStartTimestamp() != null) sb.append("StartTimestamp: " + getStartTimestamp() + ",");
        if (getCloseTimestamp() != null) sb.append("CloseTimestamp: " + getCloseTimestamp() + ",");
        if (getExecutionStatus() != null) sb.append("ExecutionStatus: " + getExecutionStatus() + ",");
        if (getCloseStatus() != null) sb.append("CloseStatus: " + getCloseStatus() + ",");
        if (getParent() != null) sb.append("Parent: " + getParent() + ",");
        if (getTagList() != null) sb.append("TagList: " + getTagList() + ",");
        if (isCancelRequested() != null) sb.append("CancelRequested: " + isCancelRequested() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isCancelRequested() == null) ? 0 : isCancelRequested().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkflowExecutionInfo == false) return false;
        WorkflowExecutionInfo other = (WorkflowExecutionInfo)obj;
        
        if (other.getExecution() == null ^ this.getExecution() == null) return false;
        if (other.getExecution() != null && other.getExecution().equals(this.getExecution()) == false) return false; 
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null) return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false) return false; 
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null) return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false) return false; 
        if (other.getCloseTimestamp() == null ^ this.getCloseTimestamp() == null) return false;
        if (other.getCloseTimestamp() != null && other.getCloseTimestamp().equals(this.getCloseTimestamp()) == false) return false; 
        if (other.getExecutionStatus() == null ^ this.getExecutionStatus() == null) return false;
        if (other.getExecutionStatus() != null && other.getExecutionStatus().equals(this.getExecutionStatus()) == false) return false; 
        if (other.getCloseStatus() == null ^ this.getCloseStatus() == null) return false;
        if (other.getCloseStatus() != null && other.getCloseStatus().equals(this.getCloseStatus()) == false) return false; 
        if (other.getParent() == null ^ this.getParent() == null) return false;
        if (other.getParent() != null && other.getParent().equals(this.getParent()) == false) return false; 
        if (other.getTagList() == null ^ this.getTagList() == null) return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false) return false; 
        if (other.isCancelRequested() == null ^ this.isCancelRequested() == null) return false;
        if (other.isCancelRequested() != null && other.isCancelRequested().equals(this.isCancelRequested()) == false) return false; 
        return true;
    }
    
}
    