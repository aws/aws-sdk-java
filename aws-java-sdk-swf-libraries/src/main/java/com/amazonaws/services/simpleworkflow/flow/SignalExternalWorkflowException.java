/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow;

import com.amazonaws.services.simpleworkflow.model.SignalExternalWorkflowExecutionFailedCause;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;

/**
 * Exception used to communicate failure of a signal.
 */
@SuppressWarnings("serial")
public class SignalExternalWorkflowException extends DecisionException {

    private SignalExternalWorkflowExecutionFailedCause failureCause;

    private WorkflowExecution signaledExecution;
    
    public SignalExternalWorkflowException(String message) {
        super(message);
    }

    public SignalExternalWorkflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public SignalExternalWorkflowException(long eventId, WorkflowExecution signaledExecution, String cause) {
        super(cause + " for signaledExecution=\"" + signaledExecution, eventId);
        this.signaledExecution = signaledExecution;
        this.failureCause = SignalExternalWorkflowExecutionFailedCause.valueOf(cause);
    }

    public WorkflowExecution getSignaledExecution() {
        return signaledExecution;
    }
    
    public void setFailureCause(SignalExternalWorkflowExecutionFailedCause failureCause) {
        this.failureCause = failureCause;
    }

    public SignalExternalWorkflowExecutionFailedCause getFailureCause() {
        return failureCause;
    }
    
    public void setSignaledExecution(WorkflowExecution signaledExecution) {
        this.signaledExecution = signaledExecution;
    }
}
