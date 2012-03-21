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
package com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.examples.common.ConfigHelper;
import com.amazonaws.services.simpleworkflow.model.ActivityType;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecutionAlreadyStartedException;

public class WorkflowExecutionStarter {

    private static AmazonSimpleWorkflow swfService;

    private static String domain;

    public static void main(String[] args) throws Exception {

        // Load configuration
        ConfigHelper configHelper = ConfigHelper.createConfig();

        // Create the client for Simple Workflow Service
        swfService = configHelper.createSWFClient();
        domain = configHelper.getDomain();

        // Start Workflow execution
        PeriodicWorkflowClientExternalFactory clientFactory = new PeriodicWorkflowClientExternalFactoryImpl(swfService, domain);

        // Passing instance id to ensure that only one periodic workflow can be active at a time.
        // Use different id for each schedule.
        PeriodicWorkflowClientExternal workflow = clientFactory.getClient("periodic1");

        // Execute activity every two 10 seconds, wait for it to complete before starting the new one, 
        // create new run every 30 seconds and stop the workflow after two minutes.
        // Obviously these periods are so low to make example run fast enough to not be boring.
        // In production case there is no need to create new runs so frequently.
        PeriodicWorkflowOptions options = new PeriodicWorkflowOptions();
        options.setExecutionPeriodSeconds(10);
        options.setContinueAsNewAfterSeconds(30);
        options.setCompleteAfterSeconds(120);
        options.setWaitForActivityCompletion(true);

        ActivityType activityType = new ActivityType();
        activityType.setName("PeriodicWorkflowActivities.doSomeWork");
        activityType.setVersion("1.0");
        Object[] parameters = new Object[] { "parameter1" };

        try {
            workflow.startPeriodicWorkflow(activityType, parameters, options);
            // WorkflowExecution is available after workflow creation 
            WorkflowExecution workflowExecution = workflow.getWorkflowExecution();
            System.out.println("Started periodic workflow with workflowId=\"" + workflowExecution.getWorkflowId()
                    + "\" and runId=\"" + workflowExecution.getRunId() + "\"");
        }
        catch (WorkflowExecutionAlreadyStartedException e) {
            // It is expected to get this exception if start is called before workflow run is completed.
            System.out.println("Periodic workflow with workflowId=\"" + workflow.getWorkflowExecution().getWorkflowId()
                    + " is already running");
        }

        System.exit(0);
    }
}