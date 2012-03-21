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
package com.amazonaws.services.simpleworkflow.flow.worker;

import com.amazonaws.services.simpleworkflow.flow.WorkflowContext;
import com.amazonaws.services.simpleworkflow.flow.generic.ContinueAsNewWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.model.DecisionTask;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;


class WorkfowContextImpl implements WorkflowContext {

    private final DecisionTask decisionTask;
    private boolean cancelRequested;
    private ContinueAsNewWorkflowExecutionParameters continueAsNewOnCompletion;
    
    public WorkfowContextImpl(DecisionTask decisionTask) {
        this.decisionTask = decisionTask;
    }
    
    @Override
    public WorkflowExecution getWorkflowExecution() {
        return decisionTask.getWorkflowExecution();
    }

    @Override
    public WorkflowType getWorkflowType() {
        return decisionTask.getWorkflowType();
    }

    @Override
    public boolean isCancelRequested() {
        return cancelRequested;
    }

    void setCancelRequested(boolean flag) {
        cancelRequested = flag;
    }

    @Override
    public ContinueAsNewWorkflowExecutionParameters getContinueAsNewOnCompletion() {
        return continueAsNewOnCompletion;
    }

    @Override
    public void setContinueAsNewOnCompletion(ContinueAsNewWorkflowExecutionParameters continueParameters) {
        this.continueAsNewOnCompletion = continueParameters;
    }

}
