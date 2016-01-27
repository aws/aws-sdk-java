/*
 * Copyright 2012-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.examples.hellolambda;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.examples.common.ConfigHelper;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;

public class WorkflowExecutionStarter {

    public static void main(String[] args) throws Exception {
        ConfigHelper configHelper = ConfigHelper.createConfig();
        AmazonSimpleWorkflow swfService = configHelper.createSWFClient();
        String domain = configHelper.getDomain();
        String defaultLambdaRoleArn = configHelper.getSwfLambdaRoleArn();

        HelloLambdaWorkflowClientExternalFactory clientFactory = new HelloLambdaWorkflowClientExternalFactoryImpl(swfService,
                domain);
        HelloLambdaWorkflowClientExternal workflow = clientFactory.getClient();

        // give the ARN of an IAM role that allows SWF to invoke lambda functions on your behalf
        StartWorkflowOptions options = new StartWorkflowOptions().withLambdaRole(defaultLambdaRoleArn);

        // Start Workflow Execution
        workflow.helloWorld("User", options);
        
        // WorkflowExecution is available after workflow creation 
        WorkflowExecution workflowExecution = workflow.getWorkflowExecution();
        System.out.println("Started helloLambda workflow with workflowId=\"" + workflowExecution.getWorkflowId()
                + "\" and runId=\"" + workflowExecution.getRunId() + "\"");
    }

}
