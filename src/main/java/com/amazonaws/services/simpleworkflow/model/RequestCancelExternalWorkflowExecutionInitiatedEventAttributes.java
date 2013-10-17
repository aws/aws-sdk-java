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
 * Provides details of the <code>RequestCancelExternalWorkflowExecutionInitiated</code> event.
 * </p>
 */
public class RequestCancelExternalWorkflowExecutionInitiatedEventAttributes implements Serializable {

    /**
     * The <code>workflowId</code> of the external workflow execution to be
     * canceled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String workflowId;

    /**
     * The <code>runId</code> of the external workflow execution to be
     * canceled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String runId;

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>RequestCancelExternalWorkflowExecution</code> decision for this
     * cancellation request. This information can be useful for diagnosing
     * problems by tracing back the cause of events.
     */
    private Long decisionTaskCompletedEventId;

    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent workflow tasks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String control;

    /**
     * The <code>workflowId</code> of the external workflow execution to be
     * canceled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The <code>workflowId</code> of the external workflow execution to be
     *         canceled.
     */
    public String getWorkflowId() {
        return workflowId;
    }
    
    /**
     * The <code>workflowId</code> of the external workflow execution to be
     * canceled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The <code>workflowId</code> of the external workflow execution to be
     *         canceled.
     */
    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }
    
    /**
     * The <code>workflowId</code> of the external workflow execution to be
     * canceled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The <code>workflowId</code> of the external workflow execution to be
     *         canceled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestCancelExternalWorkflowExecutionInitiatedEventAttributes withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * The <code>runId</code> of the external workflow execution to be
     * canceled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The <code>runId</code> of the external workflow execution to be
     *         canceled.
     */
    public String getRunId() {
        return runId;
    }
    
    /**
     * The <code>runId</code> of the external workflow execution to be
     * canceled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param runId The <code>runId</code> of the external workflow execution to be
     *         canceled.
     */
    public void setRunId(String runId) {
        this.runId = runId;
    }
    
    /**
     * The <code>runId</code> of the external workflow execution to be
     * canceled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param runId The <code>runId</code> of the external workflow execution to be
     *         canceled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestCancelExternalWorkflowExecutionInitiatedEventAttributes withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>RequestCancelExternalWorkflowExecution</code> decision for this
     * cancellation request. This information can be useful for diagnosing
     * problems by tracing back the cause of events.
     *
     * @return The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision for this
     *         cancellation request. This information can be useful for diagnosing
     *         problems by tracing back the cause of events.
     */
    public Long getDecisionTaskCompletedEventId() {
        return decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>RequestCancelExternalWorkflowExecution</code> decision for this
     * cancellation request. This information can be useful for diagnosing
     * problems by tracing back the cause of events.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision for this
     *         cancellation request. This information can be useful for diagnosing
     *         problems by tracing back the cause of events.
     */
    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>RequestCancelExternalWorkflowExecution</code> decision for this
     * cancellation request. This information can be useful for diagnosing
     * problems by tracing back the cause of events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision for this
     *         cancellation request. This information can be useful for diagnosing
     *         problems by tracing back the cause of events.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestCancelExternalWorkflowExecutionInitiatedEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
        return this;
    }

    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent workflow tasks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return Optional data attached to the event that can be used by the decider in
     *         subsequent workflow tasks.
     */
    public String getControl() {
        return control;
    }
    
    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent workflow tasks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param control Optional data attached to the event that can be used by the decider in
     *         subsequent workflow tasks.
     */
    public void setControl(String control) {
        this.control = control;
    }
    
    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent workflow tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param control Optional data attached to the event that can be used by the decider in
     *         subsequent workflow tasks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestCancelExternalWorkflowExecutionInitiatedEventAttributes withControl(String control) {
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
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode()); 
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RequestCancelExternalWorkflowExecutionInitiatedEventAttributes == false) return false;
        RequestCancelExternalWorkflowExecutionInitiatedEventAttributes other = (RequestCancelExternalWorkflowExecutionInitiatedEventAttributes)obj;
        
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null) return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false) return false; 
        if (other.getRunId() == null ^ this.getRunId() == null) return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false) return false; 
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null) return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false) return false; 
        if (other.getControl() == null ^ this.getControl() == null) return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false) return false; 
        return true;
    }
    
}
    