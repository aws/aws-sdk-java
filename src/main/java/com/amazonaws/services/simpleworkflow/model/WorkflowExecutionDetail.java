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
 * Contains details about a workflow execution.
 * </p>
 */
public class WorkflowExecutionDetail implements Serializable {

    /**
     * Information about the workflow execution.
     */
    private WorkflowExecutionInfo executionInfo;

    /**
     * The configuration settings for this workflow execution including
     * timeout values, tasklist etc.
     */
    private WorkflowExecutionConfiguration executionConfiguration;

    /**
     * The number of tasks for this workflow execution. This includes open
     * and closed tasks of all types.
     */
    private WorkflowExecutionOpenCounts openCounts;

    /**
     * The time when the last activity task was scheduled for this workflow
     * execution. You can use this information to determine if the workflow
     * has not made progress for an unusually long period of time and might
     * require a corrective action.
     */
    private java.util.Date latestActivityTaskTimestamp;

    /**
     * The latest executionContext provided by the decider for this workflow
     * execution. A decider can provide an executionContext, which is a free
     * form string, when closing a decision task using
     * <a>RespondDecisionTaskCompleted</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String latestExecutionContext;

    /**
     * Information about the workflow execution.
     *
     * @return Information about the workflow execution.
     */
    public WorkflowExecutionInfo getExecutionInfo() {
        return executionInfo;
    }
    
    /**
     * Information about the workflow execution.
     *
     * @param executionInfo Information about the workflow execution.
     */
    public void setExecutionInfo(WorkflowExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
    }
    
    /**
     * Information about the workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionInfo Information about the workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionDetail withExecutionInfo(WorkflowExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
        return this;
    }

    /**
     * The configuration settings for this workflow execution including
     * timeout values, tasklist etc.
     *
     * @return The configuration settings for this workflow execution including
     *         timeout values, tasklist etc.
     */
    public WorkflowExecutionConfiguration getExecutionConfiguration() {
        return executionConfiguration;
    }
    
    /**
     * The configuration settings for this workflow execution including
     * timeout values, tasklist etc.
     *
     * @param executionConfiguration The configuration settings for this workflow execution including
     *         timeout values, tasklist etc.
     */
    public void setExecutionConfiguration(WorkflowExecutionConfiguration executionConfiguration) {
        this.executionConfiguration = executionConfiguration;
    }
    
    /**
     * The configuration settings for this workflow execution including
     * timeout values, tasklist etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionConfiguration The configuration settings for this workflow execution including
     *         timeout values, tasklist etc.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionDetail withExecutionConfiguration(WorkflowExecutionConfiguration executionConfiguration) {
        this.executionConfiguration = executionConfiguration;
        return this;
    }

    /**
     * The number of tasks for this workflow execution. This includes open
     * and closed tasks of all types.
     *
     * @return The number of tasks for this workflow execution. This includes open
     *         and closed tasks of all types.
     */
    public WorkflowExecutionOpenCounts getOpenCounts() {
        return openCounts;
    }
    
    /**
     * The number of tasks for this workflow execution. This includes open
     * and closed tasks of all types.
     *
     * @param openCounts The number of tasks for this workflow execution. This includes open
     *         and closed tasks of all types.
     */
    public void setOpenCounts(WorkflowExecutionOpenCounts openCounts) {
        this.openCounts = openCounts;
    }
    
    /**
     * The number of tasks for this workflow execution. This includes open
     * and closed tasks of all types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param openCounts The number of tasks for this workflow execution. This includes open
     *         and closed tasks of all types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionDetail withOpenCounts(WorkflowExecutionOpenCounts openCounts) {
        this.openCounts = openCounts;
        return this;
    }

    /**
     * The time when the last activity task was scheduled for this workflow
     * execution. You can use this information to determine if the workflow
     * has not made progress for an unusually long period of time and might
     * require a corrective action.
     *
     * @return The time when the last activity task was scheduled for this workflow
     *         execution. You can use this information to determine if the workflow
     *         has not made progress for an unusually long period of time and might
     *         require a corrective action.
     */
    public java.util.Date getLatestActivityTaskTimestamp() {
        return latestActivityTaskTimestamp;
    }
    
    /**
     * The time when the last activity task was scheduled for this workflow
     * execution. You can use this information to determine if the workflow
     * has not made progress for an unusually long period of time and might
     * require a corrective action.
     *
     * @param latestActivityTaskTimestamp The time when the last activity task was scheduled for this workflow
     *         execution. You can use this information to determine if the workflow
     *         has not made progress for an unusually long period of time and might
     *         require a corrective action.
     */
    public void setLatestActivityTaskTimestamp(java.util.Date latestActivityTaskTimestamp) {
        this.latestActivityTaskTimestamp = latestActivityTaskTimestamp;
    }
    
    /**
     * The time when the last activity task was scheduled for this workflow
     * execution. You can use this information to determine if the workflow
     * has not made progress for an unusually long period of time and might
     * require a corrective action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestActivityTaskTimestamp The time when the last activity task was scheduled for this workflow
     *         execution. You can use this information to determine if the workflow
     *         has not made progress for an unusually long period of time and might
     *         require a corrective action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionDetail withLatestActivityTaskTimestamp(java.util.Date latestActivityTaskTimestamp) {
        this.latestActivityTaskTimestamp = latestActivityTaskTimestamp;
        return this;
    }

    /**
     * The latest executionContext provided by the decider for this workflow
     * execution. A decider can provide an executionContext, which is a free
     * form string, when closing a decision task using
     * <a>RespondDecisionTaskCompleted</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return The latest executionContext provided by the decider for this workflow
     *         execution. A decider can provide an executionContext, which is a free
     *         form string, when closing a decision task using
     *         <a>RespondDecisionTaskCompleted</a>.
     */
    public String getLatestExecutionContext() {
        return latestExecutionContext;
    }
    
    /**
     * The latest executionContext provided by the decider for this workflow
     * execution. A decider can provide an executionContext, which is a free
     * form string, when closing a decision task using
     * <a>RespondDecisionTaskCompleted</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param latestExecutionContext The latest executionContext provided by the decider for this workflow
     *         execution. A decider can provide an executionContext, which is a free
     *         form string, when closing a decision task using
     *         <a>RespondDecisionTaskCompleted</a>.
     */
    public void setLatestExecutionContext(String latestExecutionContext) {
        this.latestExecutionContext = latestExecutionContext;
    }
    
    /**
     * The latest executionContext provided by the decider for this workflow
     * execution. A decider can provide an executionContext, which is a free
     * form string, when closing a decision task using
     * <a>RespondDecisionTaskCompleted</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param latestExecutionContext The latest executionContext provided by the decider for this workflow
     *         execution. A decider can provide an executionContext, which is a free
     *         form string, when closing a decision task using
     *         <a>RespondDecisionTaskCompleted</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionDetail withLatestExecutionContext(String latestExecutionContext) {
        this.latestExecutionContext = latestExecutionContext;
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
        if (getExecutionInfo() != null) sb.append("ExecutionInfo: " + getExecutionInfo() + ",");
        if (getExecutionConfiguration() != null) sb.append("ExecutionConfiguration: " + getExecutionConfiguration() + ",");
        if (getOpenCounts() != null) sb.append("OpenCounts: " + getOpenCounts() + ",");
        if (getLatestActivityTaskTimestamp() != null) sb.append("LatestActivityTaskTimestamp: " + getLatestActivityTaskTimestamp() + ",");
        if (getLatestExecutionContext() != null) sb.append("LatestExecutionContext: " + getLatestExecutionContext() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getExecutionInfo() == null) ? 0 : getExecutionInfo().hashCode()); 
        hashCode = prime * hashCode + ((getExecutionConfiguration() == null) ? 0 : getExecutionConfiguration().hashCode()); 
        hashCode = prime * hashCode + ((getOpenCounts() == null) ? 0 : getOpenCounts().hashCode()); 
        hashCode = prime * hashCode + ((getLatestActivityTaskTimestamp() == null) ? 0 : getLatestActivityTaskTimestamp().hashCode()); 
        hashCode = prime * hashCode + ((getLatestExecutionContext() == null) ? 0 : getLatestExecutionContext().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkflowExecutionDetail == false) return false;
        WorkflowExecutionDetail other = (WorkflowExecutionDetail)obj;
        
        if (other.getExecutionInfo() == null ^ this.getExecutionInfo() == null) return false;
        if (other.getExecutionInfo() != null && other.getExecutionInfo().equals(this.getExecutionInfo()) == false) return false; 
        if (other.getExecutionConfiguration() == null ^ this.getExecutionConfiguration() == null) return false;
        if (other.getExecutionConfiguration() != null && other.getExecutionConfiguration().equals(this.getExecutionConfiguration()) == false) return false; 
        if (other.getOpenCounts() == null ^ this.getOpenCounts() == null) return false;
        if (other.getOpenCounts() != null && other.getOpenCounts().equals(this.getOpenCounts()) == false) return false; 
        if (other.getLatestActivityTaskTimestamp() == null ^ this.getLatestActivityTaskTimestamp() == null) return false;
        if (other.getLatestActivityTaskTimestamp() != null && other.getLatestActivityTaskTimestamp().equals(this.getLatestActivityTaskTimestamp()) == false) return false; 
        if (other.getLatestExecutionContext() == null ^ this.getLatestExecutionContext() == null) return false;
        if (other.getLatestExecutionContext() != null && other.getLatestExecutionContext().equals(this.getLatestExecutionContext()) == false) return false; 
        return true;
    }
    
}
    