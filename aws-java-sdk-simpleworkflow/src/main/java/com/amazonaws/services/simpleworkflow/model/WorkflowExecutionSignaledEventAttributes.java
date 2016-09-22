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
 * Provides details of the <code>WorkflowExecutionSignaled</code> event.
 * </p>
 */
public class WorkflowExecutionSignaledEventAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the signal received. The decider can use the signal name and inputs to determine how to the process
     * the signal.
     * </p>
     */
    private String signalName;
    /**
     * <p>
     * Inputs provided with the signal (if any). The decider can use the signal name and inputs to determine how to
     * process the signal.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The workflow execution that sent the signal. This is set only of the signal was sent by another workflow
     * execution.
     * </p>
     */
    private WorkflowExecution externalWorkflowExecution;
    /**
     * <p>
     * The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>SignalExternalWorkflow</code> decision to signal this workflow execution.The source event with this ID can
     * be found in the history of the source workflow execution. This information can be useful for diagnosing problems
     * by tracing back the chain of events leading up to this event. This field is set only if the signal was initiated
     * by another workflow execution.
     * </p>
     */
    private Long externalInitiatedEventId;

    /**
     * <p>
     * The name of the signal received. The decider can use the signal name and inputs to determine how to the process
     * the signal.
     * </p>
     * 
     * @param signalName
     *        The name of the signal received. The decider can use the signal name and inputs to determine how to the
     *        process the signal.
     */

    public void setSignalName(String signalName) {
        this.signalName = signalName;
    }

    /**
     * <p>
     * The name of the signal received. The decider can use the signal name and inputs to determine how to the process
     * the signal.
     * </p>
     * 
     * @return The name of the signal received. The decider can use the signal name and inputs to determine how to the
     *         process the signal.
     */

    public String getSignalName() {
        return this.signalName;
    }

    /**
     * <p>
     * The name of the signal received. The decider can use the signal name and inputs to determine how to the process
     * the signal.
     * </p>
     * 
     * @param signalName
     *        The name of the signal received. The decider can use the signal name and inputs to determine how to the
     *        process the signal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionSignaledEventAttributes withSignalName(String signalName) {
        setSignalName(signalName);
        return this;
    }

    /**
     * <p>
     * Inputs provided with the signal (if any). The decider can use the signal name and inputs to determine how to
     * process the signal.
     * </p>
     * 
     * @param input
     *        Inputs provided with the signal (if any). The decider can use the signal name and inputs to determine how
     *        to process the signal.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * Inputs provided with the signal (if any). The decider can use the signal name and inputs to determine how to
     * process the signal.
     * </p>
     * 
     * @return Inputs provided with the signal (if any). The decider can use the signal name and inputs to determine how
     *         to process the signal.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * Inputs provided with the signal (if any). The decider can use the signal name and inputs to determine how to
     * process the signal.
     * </p>
     * 
     * @param input
     *        Inputs provided with the signal (if any). The decider can use the signal name and inputs to determine how
     *        to process the signal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionSignaledEventAttributes withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The workflow execution that sent the signal. This is set only of the signal was sent by another workflow
     * execution.
     * </p>
     * 
     * @param externalWorkflowExecution
     *        The workflow execution that sent the signal. This is set only of the signal was sent by another workflow
     *        execution.
     */

    public void setExternalWorkflowExecution(WorkflowExecution externalWorkflowExecution) {
        this.externalWorkflowExecution = externalWorkflowExecution;
    }

    /**
     * <p>
     * The workflow execution that sent the signal. This is set only of the signal was sent by another workflow
     * execution.
     * </p>
     * 
     * @return The workflow execution that sent the signal. This is set only of the signal was sent by another workflow
     *         execution.
     */

    public WorkflowExecution getExternalWorkflowExecution() {
        return this.externalWorkflowExecution;
    }

    /**
     * <p>
     * The workflow execution that sent the signal. This is set only of the signal was sent by another workflow
     * execution.
     * </p>
     * 
     * @param externalWorkflowExecution
     *        The workflow execution that sent the signal. This is set only of the signal was sent by another workflow
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionSignaledEventAttributes withExternalWorkflowExecution(WorkflowExecution externalWorkflowExecution) {
        setExternalWorkflowExecution(externalWorkflowExecution);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>SignalExternalWorkflow</code> decision to signal this workflow execution.The source event with this ID can
     * be found in the history of the source workflow execution. This information can be useful for diagnosing problems
     * by tracing back the chain of events leading up to this event. This field is set only if the signal was initiated
     * by another workflow execution.
     * </p>
     * 
     * @param externalInitiatedEventId
     *        The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     *        <code>SignalExternalWorkflow</code> decision to signal this workflow execution.The source event with this
     *        ID can be found in the history of the source workflow execution. This information can be useful for
     *        diagnosing problems by tracing back the chain of events leading up to this event. This field is set only
     *        if the signal was initiated by another workflow execution.
     */

    public void setExternalInitiatedEventId(Long externalInitiatedEventId) {
        this.externalInitiatedEventId = externalInitiatedEventId;
    }

    /**
     * <p>
     * The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>SignalExternalWorkflow</code> decision to signal this workflow execution.The source event with this ID can
     * be found in the history of the source workflow execution. This information can be useful for diagnosing problems
     * by tracing back the chain of events leading up to this event. This field is set only if the signal was initiated
     * by another workflow execution.
     * </p>
     * 
     * @return The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     *         <code>SignalExternalWorkflow</code> decision to signal this workflow execution.The source event with this
     *         ID can be found in the history of the source workflow execution. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to this event. This field is set only
     *         if the signal was initiated by another workflow execution.
     */

    public Long getExternalInitiatedEventId() {
        return this.externalInitiatedEventId;
    }

    /**
     * <p>
     * The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>SignalExternalWorkflow</code> decision to signal this workflow execution.The source event with this ID can
     * be found in the history of the source workflow execution. This information can be useful for diagnosing problems
     * by tracing back the chain of events leading up to this event. This field is set only if the signal was initiated
     * by another workflow execution.
     * </p>
     * 
     * @param externalInitiatedEventId
     *        The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     *        <code>SignalExternalWorkflow</code> decision to signal this workflow execution.The source event with this
     *        ID can be found in the history of the source workflow execution. This information can be useful for
     *        diagnosing problems by tracing back the chain of events leading up to this event. This field is set only
     *        if the signal was initiated by another workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionSignaledEventAttributes withExternalInitiatedEventId(Long externalInitiatedEventId) {
        setExternalInitiatedEventId(externalInitiatedEventId);
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
        if (getSignalName() != null)
            sb.append("SignalName: " + getSignalName() + ",");
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getExternalWorkflowExecution() != null)
            sb.append("ExternalWorkflowExecution: " + getExternalWorkflowExecution() + ",");
        if (getExternalInitiatedEventId() != null)
            sb.append("ExternalInitiatedEventId: " + getExternalInitiatedEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowExecutionSignaledEventAttributes == false)
            return false;
        WorkflowExecutionSignaledEventAttributes other = (WorkflowExecutionSignaledEventAttributes) obj;
        if (other.getSignalName() == null ^ this.getSignalName() == null)
            return false;
        if (other.getSignalName() != null && other.getSignalName().equals(this.getSignalName()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getExternalWorkflowExecution() == null ^ this.getExternalWorkflowExecution() == null)
            return false;
        if (other.getExternalWorkflowExecution() != null && other.getExternalWorkflowExecution().equals(this.getExternalWorkflowExecution()) == false)
            return false;
        if (other.getExternalInitiatedEventId() == null ^ this.getExternalInitiatedEventId() == null)
            return false;
        if (other.getExternalInitiatedEventId() != null && other.getExternalInitiatedEventId().equals(this.getExternalInitiatedEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSignalName() == null) ? 0 : getSignalName().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getExternalWorkflowExecution() == null) ? 0 : getExternalWorkflowExecution().hashCode());
        hashCode = prime * hashCode + ((getExternalInitiatedEventId() == null) ? 0 : getExternalInitiatedEventId().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowExecutionSignaledEventAttributes clone() {
        try {
            return (WorkflowExecutionSignaledEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
