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
 * Provides details of the <code>SignalExternalWorkflowExecutionInitiated</code> event.
 * </p>
 */
public class SignalExternalWorkflowExecutionInitiatedEventAttributes implements Serializable {

    /**
     * The <code>workflowId</code> of the external workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String workflowId;

    /**
     * The <code>runId</code> of the external workflow execution to send the
     * signal to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String runId;

    /**
     * The name of the signal.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String signalName;

    /**
     * Input provided to the signal (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String input;

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>SignalExternalWorkflowExecution</code> decision for this signal.
     * This information can be useful for diagnosing problems by tracing back
     * the cause of events leading up to this event.
     */
    private Long decisionTaskCompletedEventId;

    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent decision tasks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String control;

    /**
     * The <code>workflowId</code> of the external workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The <code>workflowId</code> of the external workflow execution.
     */
    public String getWorkflowId() {
        return workflowId;
    }
    
    /**
     * The <code>workflowId</code> of the external workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The <code>workflowId</code> of the external workflow execution.
     */
    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }
    
    /**
     * The <code>workflowId</code> of the external workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The <code>workflowId</code> of the external workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SignalExternalWorkflowExecutionInitiatedEventAttributes withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * The <code>runId</code> of the external workflow execution to send the
     * signal to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The <code>runId</code> of the external workflow execution to send the
     *         signal to.
     */
    public String getRunId() {
        return runId;
    }
    
    /**
     * The <code>runId</code> of the external workflow execution to send the
     * signal to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param runId The <code>runId</code> of the external workflow execution to send the
     *         signal to.
     */
    public void setRunId(String runId) {
        this.runId = runId;
    }
    
    /**
     * The <code>runId</code> of the external workflow execution to send the
     * signal to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param runId The <code>runId</code> of the external workflow execution to send the
     *         signal to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SignalExternalWorkflowExecutionInitiatedEventAttributes withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * The name of the signal.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the signal.
     */
    public String getSignalName() {
        return signalName;
    }
    
    /**
     * The name of the signal.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param signalName The name of the signal.
     */
    public void setSignalName(String signalName) {
        this.signalName = signalName;
    }
    
    /**
     * The name of the signal.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param signalName The name of the signal.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SignalExternalWorkflowExecutionInitiatedEventAttributes withSignalName(String signalName) {
        this.signalName = signalName;
        return this;
    }

    /**
     * Input provided to the signal (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return Input provided to the signal (if any).
     */
    public String getInput() {
        return input;
    }
    
    /**
     * Input provided to the signal (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input Input provided to the signal (if any).
     */
    public void setInput(String input) {
        this.input = input;
    }
    
    /**
     * Input provided to the signal (if any).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input Input provided to the signal (if any).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SignalExternalWorkflowExecutionInitiatedEventAttributes withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>SignalExternalWorkflowExecution</code> decision for this signal.
     * This information can be useful for diagnosing problems by tracing back
     * the cause of events leading up to this event.
     *
     * @return The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>SignalExternalWorkflowExecution</code> decision for this signal.
     *         This information can be useful for diagnosing problems by tracing back
     *         the cause of events leading up to this event.
     */
    public Long getDecisionTaskCompletedEventId() {
        return decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>SignalExternalWorkflowExecution</code> decision for this signal.
     * This information can be useful for diagnosing problems by tracing back
     * the cause of events leading up to this event.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>SignalExternalWorkflowExecution</code> decision for this signal.
     *         This information can be useful for diagnosing problems by tracing back
     *         the cause of events leading up to this event.
     */
    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>SignalExternalWorkflowExecution</code> decision for this signal.
     * This information can be useful for diagnosing problems by tracing back
     * the cause of events leading up to this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>SignalExternalWorkflowExecution</code> decision for this signal.
     *         This information can be useful for diagnosing problems by tracing back
     *         the cause of events leading up to this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SignalExternalWorkflowExecutionInitiatedEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
        return this;
    }

    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent decision tasks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return Optional data attached to the event that can be used by the decider in
     *         subsequent decision tasks.
     */
    public String getControl() {
        return control;
    }
    
    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent decision tasks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param control Optional data attached to the event that can be used by the decider in
     *         subsequent decision tasks.
     */
    public void setControl(String control) {
        this.control = control;
    }
    
    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent decision tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param control Optional data attached to the event that can be used by the decider in
     *         subsequent decision tasks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SignalExternalWorkflowExecutionInitiatedEventAttributes withControl(String control) {
        this.control = control;
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
        if (getWorkflowId() != null) sb.append("WorkflowId: " + getWorkflowId() + ",");
        if (getRunId() != null) sb.append("RunId: " + getRunId() + ",");
        if (getSignalName() != null) sb.append("SignalName: " + getSignalName() + ",");
        if (getInput() != null) sb.append("Input: " + getInput() + ",");
        if (getDecisionTaskCompletedEventId() != null) sb.append("DecisionTaskCompletedEventId: " + getDecisionTaskCompletedEventId() + ",");
        if (getControl() != null) sb.append("Control: " + getControl() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode()); 
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode()); 
        hashCode = prime * hashCode + ((getSignalName() == null) ? 0 : getSignalName().hashCode()); 
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode()); 
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode()); 
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SignalExternalWorkflowExecutionInitiatedEventAttributes == false) return false;
        SignalExternalWorkflowExecutionInitiatedEventAttributes other = (SignalExternalWorkflowExecutionInitiatedEventAttributes)obj;
        
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null) return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false) return false; 
        if (other.getRunId() == null ^ this.getRunId() == null) return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false) return false; 
        if (other.getSignalName() == null ^ this.getSignalName() == null) return false;
        if (other.getSignalName() != null && other.getSignalName().equals(this.getSignalName()) == false) return false; 
        if (other.getInput() == null ^ this.getInput() == null) return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false) return false; 
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null) return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false) return false; 
        if (other.getControl() == null ^ this.getControl() == null) return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false) return false; 
        return true;
    }
    
}
    