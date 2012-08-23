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
package com.amazonaws.services.simpleworkflow.flow.examples.cron;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.examples.common.ConfigHelper;
import com.amazonaws.services.simpleworkflow.model.ActivityType;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecutionAlreadyStartedException;

public class CronWorkflowExecutionStarter {

    private static AmazonSimpleWorkflow swfService;

    private static String domain;

    public static void main(String[] args) throws Exception {

        if (args.length != 3) {
            System.err.println("Usage:\njava com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflowExecutionStarter CRON_PATTERN TIME_ZONE CONTINUE_AS_NEW_AFTER_SECONDS");
            System.exit(1);
        }
        String cronPattern = args[0];
        String timeZone = args[1];
        int continueAsNewAfterSeconds = 0;
        try {
            continueAsNewAfterSeconds = Integer.parseInt(args[2]);
        }
        catch (NumberFormatException e) {
            System.err.println("Value of CONTINUE_AS_NEW_AFTER_SECONDS is not int: " + args[2]);
            System.exit(1);
        }
        // Load configuration
        ConfigHelper configHelper = ConfigHelper.createConfig();

        // Create the client for Simple Workflow Service
        swfService = configHelper.createSWFClient();
        domain = configHelper.getDomain();

        // Name and versions are hardcoded here but they can be passed as args or loaded from configuration file.
        ActivityType activity = new ActivityType();
        activity.setName("CronExampleActivities.doSomeWork");
        activity.setVersion("1.0");
        Object[] arguments = new Object[] { "parameter1" };
        
        // Start Workflow execution
        CronWorkflowClientExternalFactory clientFactory = new CronWorkflowClientExternalFactoryImpl(swfService, domain);

        // Use Activity + cronPattern as instance id to ensure that only one workflow per pattern for a given activity is active at a time.
        CronWorkflowClientExternal workflow = clientFactory.getClient(activity.getName() + ": " + cronPattern);



        try {
            CronWorkflowOptions cronOptions = new CronWorkflowOptions();
            cronOptions.setActivity(activity);
            cronOptions.setActivityArguments(arguments);
            cronOptions.setContinueAsNewAfterSeconds(continueAsNewAfterSeconds);
            cronOptions.setTimeZone(timeZone);

            // Every 10 seconds
            cronOptions.setCronExpression(cronPattern);
            workflow.startCron(cronOptions);
            // WorkflowExecution is available after workflow creation 
            WorkflowExecution workflowExecution = workflow.getWorkflowExecution();
            System.out.println("Started Cron workflow with workflowId=\"" + workflowExecution.getWorkflowId() + "\" and runId=\""
                    + workflowExecution.getRunId() + "\" with cron pattern=" + cronPattern);
        }
        catch (WorkflowExecutionAlreadyStartedException e) {
            // It is expected to get this exception if start is called before workflow run is completed.
            System.out.println("Cron workflow with workflowId=\"" + workflow.getWorkflowExecution().getWorkflowId()
                    + " is already running for the pattern=" + cronPattern);
        }
        System.exit(0);
    }
}
