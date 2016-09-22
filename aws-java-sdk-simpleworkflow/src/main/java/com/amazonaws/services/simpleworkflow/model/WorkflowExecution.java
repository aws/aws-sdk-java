/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents a workflow execution.
 * </p>
 */
public class WorkflowExecution implements Serializable, Cloneable {

    /**
     * <p>
     * The user defined identifier associated with the workflow execution.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * A system-generated unique identifier for the workflow execution.
     * </p>
     */
    private String runId;

    /**
     * <p>
     * The user defined identifier associated with the workflow execution.
     * </p>
     * 
     * @param workflowId
     *        The user defined identifier associated with the workflow execution.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * The user defined identifier associated with the workflow execution.
     * </p>
     * 
     * @return The user defined identifier associated with the workflow execution.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * The user defined identifier associated with the workflow execution.
     * </p>
     * 
     * @param workflowId
     *        The user defined identifier associated with the workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecution withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * A system-generated unique identifier for the workflow execution.
     * </p>
     * 
     * @param runId
     *        A system-generated unique identifier for the workflow execution.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * A system-generated unique identifier for the workflow execution.
     * </p>
     * 
     * @return A system-generated unique identifier for the workflow execution.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * A system-generated unique identifier for the workflow execution.
     * </p>
     * 
     * @param runId
     *        A system-generated unique identifier for the workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecution withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkflowId() != null)
            sb.append("WorkflowId: " + getWorkflowId() + ",");
        if (getRunId() != null)
            sb.append("RunId: " + getRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowExecution == false)
            return false;
        WorkflowExecution other = (WorkflowExecution) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowExecution clone() {
        try {
            return (WorkflowExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
