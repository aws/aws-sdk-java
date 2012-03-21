/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.generic;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;

public interface GenericWorkflowClient {

    /**
     * Start child workflow.
     * 
     * @return becomes ready when child successfully started.
     *         {@link StartChildWorkflowReply#getResult()} becomes ready upon
     *         child completion.
     */
    public Promise<StartChildWorkflowReply> startChildWorkflow(StartChildWorkflowExecutionParameters parameters);

    public Promise<String> startChildWorkflow(String workflow, String version, String input);

    public Promise<String> startChildWorkflow(String workflow, String version, Promise<String> input);

    public Promise<Void> signalWorkflowExecution(SignalExternalWorkflowParameters signalParameters);

    public void requestCancelWorkflowExecution(WorkflowExecution execution);

    public void continueAsNewOnCompletion(ContinueAsNewWorkflowExecutionParameters parameters);

    /**
     * Deterministic unique Id generator
     */
    public String generateUniqueId();

}
