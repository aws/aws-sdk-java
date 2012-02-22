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

/**
 * <p>
 * Provides details of the <code>SignalExternalWorkflowExecution</code>
 * decision.
 * </p>
 */
public class SignalExternalWorkflowExecutionDecisionAttributes {

    /**
     * The <code>workflowId</code> of the workflow execution to be signaled.
     * This field is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String workflowId;

    /**
     * The <code>runId</code> of the workflow execution to be signaled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String runId;

    /**
     * The name of the signal.The target workflow execution will use the
     * signal name and input to process the signal. This field is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String signalName;

    /**
     * Optional input to be provided with the signal.The target workflow
     * execution will use the signal name and input to process the signal.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String input;

    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent decision tasks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String control;

    /**
     * The <code>workflowId</code> of the workflow execution to be signaled.
     * This field is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The <code>workflowId</code> of the workflow execution to be signaled.
     *         This field is required.
     */
    public String getWorkflowId() {
        return workflowId;
    }
    
    /**
     * The <code>workflowId</code> of the workflow execution to be signaled.
     * This field is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The <code>workflowId</code> of the workflow execution to be signaled.
     *         This field is required.
     */
    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }
    
    /**
     * The <code>workflowId</code> of the workflow execution to be signaled.
     * This field is required.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The <code>workflowId</code> of the workflow execution to be signaled.
     *         This field is required.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SignalExternalWorkflowExecutionDecisionAttributes withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    
    
    /**
     * The <code>runId</code> of the workflow execution to be signaled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The <code>runId</code> of the workflow execution to be signaled.
     */
    public String getRunId() {
        return runId;
    }
    
    /**
     * The <code>runId</code> of the workflow execution to be signaled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param runId The <code>runId</code> of the workflow execution to be signaled.
     */
    public void setRunId(String runId) {
        this.runId = runId;
    }
    
    /**
     * The <code>runId</code> of the workflow execution to be signaled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param runId The <code>runId</code> of the workflow execution to be signaled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SignalExternalWorkflowExecutionDecisionAttributes withRunId(String runId) {
        this.runId = runId;
        return this;
    }
    
    
    /**
     * The name of the signal.The target workflow execution will use the
     * signal name and input to process the signal. This field is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the signal.The target workflow execution will use the
     *         signal name and input to process the signal. This field is required.
     */
    public String getSignalName() {
        return signalName;
    }
    
    /**
     * The name of the signal.The target workflow execution will use the
     * signal name and input to process the signal. This field is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param signalName The name of the signal.The target workflow execution will use the
     *         signal name and input to process the signal. This field is required.
     */
    public void setSignalName(String signalName) {
        this.signalName = signalName;
    }
    
    /**
     * The name of the signal.The target workflow execution will use the
     * signal name and input to process the signal. This field is required.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param signalName The name of the signal.The target workflow execution will use the
     *         signal name and input to process the signal. This field is required.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SignalExternalWorkflowExecutionDecisionAttributes withSignalName(String signalName) {
        this.signalName = signalName;
        return this;
    }
    
    
    /**
     * Optional input to be provided with the signal.The target workflow
     * execution will use the signal name and input to process the signal.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return Optional input to be provided with the signal.The target workflow
     *         execution will use the signal name and input to process the signal.
     */
    public String getInput() {
        return input;
    }
    
    /**
     * Optional input to be provided with the signal.The target workflow
     * execution will use the signal name and input to process the signal.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input Optional input to be provided with the signal.The target workflow
     *         execution will use the signal name and input to process the signal.
     */
    public void setInput(String input) {
        this.input = input;
    }
    
    /**
     * Optional input to be provided with the signal.The target workflow
     * execution will use the signal name and input to process the signal.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input Optional input to be provided with the signal.The target workflow
     *         execution will use the signal name and input to process the signal.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SignalExternalWorkflowExecutionDecisionAttributes withInput(String input) {
        this.input = input;
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
    public SignalExternalWorkflowExecutionDecisionAttributes withControl(String control) {
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
        if (workflowId != null) sb.append("WorkflowId: " + workflowId + ", ");
        if (runId != null) sb.append("RunId: " + runId + ", ");
        if (signalName != null) sb.append("SignalName: " + signalName + ", ");
        if (input != null) sb.append("Input: " + input + ", ");
        if (control != null) sb.append("Control: " + control + ", ");
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
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof SignalExternalWorkflowExecutionDecisionAttributes == false) return false;
        SignalExternalWorkflowExecutionDecisionAttributes other = (SignalExternalWorkflowExecutionDecisionAttributes)obj;
        
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null) return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false) return false; 
        if (other.getRunId() == null ^ this.getRunId() == null) return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false) return false; 
        if (other.getSignalName() == null ^ this.getSignalName() == null) return false;
        if (other.getSignalName() != null && other.getSignalName().equals(this.getSignalName()) == false) return false; 
        if (other.getInput() == null ^ this.getInput() == null) return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false) return false; 
        if (other.getControl() == null ^ this.getControl() == null) return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false) return false; 
        return true;
    }
    
}
    