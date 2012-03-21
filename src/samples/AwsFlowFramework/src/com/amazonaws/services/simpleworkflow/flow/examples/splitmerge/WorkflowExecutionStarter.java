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
package com.amazonaws.services.simpleworkflow.flow.examples.splitmerge;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.examples.common.ConfigHelper;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;

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
        String bucketName = configHelper.getValueFromConfig(SplitMergeConfigKeys.S3_BUCKET_NAME);
        String fileName = configHelper.getValueFromConfig(SplitMergeConfigKeys.S3_INPUT_FILENAME);
        String val = configHelper.getValueFromConfig(SplitMergeConfigKeys.NUMBER_OF_WORKERS);
        int numberOfWorkers = Integer.parseInt(val);
        
        AverageCalculatorWorkflowClientExternalFactory clientFactory = new AverageCalculatorWorkflowClientExternalFactoryImpl(swfService, domain);
        AverageCalculatorWorkflowClientExternal workflow = clientFactory.getClient();
        workflow.average(bucketName, fileName, numberOfWorkers);

        // WorkflowExecution is available after workflow creation 
        WorkflowExecution workflowExecution = workflow.getWorkflowExecution();
        System.out.println("Started periodic workflow with workflowId=\"" + workflowExecution.getWorkflowId()
                + "\" and runId=\"" + workflowExecution.getRunId() + "\"");

        System.exit(0);
    }    
}