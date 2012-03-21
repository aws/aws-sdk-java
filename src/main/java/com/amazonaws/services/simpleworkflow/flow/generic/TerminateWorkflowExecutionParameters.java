package com.amazonaws.services.simpleworkflow.flow.generic;

import com.amazonaws.services.simpleworkflow.model.ChildPolicy;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;

public class TerminateWorkflowExecutionParameters {

    private WorkflowExecution workflowExecution;

    private ChildPolicy childPolicy;

    private String reason;

    private String details;

    public TerminateWorkflowExecutionParameters() {
    }

    public TerminateWorkflowExecutionParameters(WorkflowExecution workflowExecution, ChildPolicy childPolicy, String reason,
            String details) {
        this.workflowExecution = workflowExecution;
        this.childPolicy = childPolicy;
        this.reason = reason;
        this.details = details;
    }

    public WorkflowExecution getWorkflowExecution() {
        return workflowExecution;
    }

    public void setWorkflowExecution(WorkflowExecution workflowExecution) {
        this.workflowExecution = workflowExecution;
    }

    public TerminateWorkflowExecutionParameters withWorkflowExecution(WorkflowExecution workflowExecution) {
        this.workflowExecution = workflowExecution;
        return this;
    }

    public ChildPolicy getChildPolicy() {
        return childPolicy;
    }

    public void setChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy;
    }

    public TerminateWorkflowExecutionParameters withChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public TerminateWorkflowExecutionParameters withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public TerminateWorkflowExecutionParameters withDetails(String details) {
        this.details = details;
        return this;
    }

}
