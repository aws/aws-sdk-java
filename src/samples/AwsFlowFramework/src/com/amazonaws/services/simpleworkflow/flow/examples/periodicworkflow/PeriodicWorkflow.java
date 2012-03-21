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
package com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow;

import com.amazonaws.services.simpleworkflow.flow.annotations.Execute;
import com.amazonaws.services.simpleworkflow.flow.annotations.Workflow;
import com.amazonaws.services.simpleworkflow.flow.annotations.WorkflowRegistrationOptions;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

@Workflow
@WorkflowRegistrationOptions(defaultExecutionStartToCloseTimeoutSeconds = 300, defaultTaskStartToCloseTimeoutSeconds = 10)
public interface PeriodicWorkflow {

    /**
     * Start workflow that executes activity according to options.
     * 
     * @param activity
     *            activity type to execute
     * @param options
     *            define the schedule of the execution.
     */
    @Execute(name = "PeriodicWorkflow", version = "1.0")
    void startPeriodicWorkflow(ActivityType activity, Object[] activityArguments, PeriodicWorkflowOptions options);

}
