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

import com.amazonaws.services.simpleworkflow.flow.DecisionContext;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.WorkflowContext;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;

class DecisionContextImpl extends DecisionContext {

    private final GenericActivityClient activityClient;
    
    private final GenericWorkflowClient workflowClient;
    
    private final WorkflowClock workflowClock;
    
    private final WorkflowContext workflowContext;

    DecisionContextImpl(GenericActivityClient activityClient, GenericWorkflowClient workflowClient,
            WorkflowClock workflowClock, WorkflowContext workflowContext) {
        this.activityClient = activityClient;
        this.workflowClient = workflowClient;
        this.workflowClock = workflowClock;
        this.workflowContext = workflowContext;
    }

    @Override
    public GenericActivityClient getActivityClient() {
       return activityClient;
    }

    @Override
    public GenericWorkflowClient getWorkflowClient() {
        return workflowClient;
    }

    @Override
    public WorkflowClock getWorkflowClock() {
        return workflowClock;
    }

    @Override
    public WorkflowContext getWorkflowContext() {
        return workflowContext;
    }

 
}
