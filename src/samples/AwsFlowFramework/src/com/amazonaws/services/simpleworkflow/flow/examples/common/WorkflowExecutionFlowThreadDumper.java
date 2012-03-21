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
package com.amazonaws.services.simpleworkflow.flow.examples.common;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.WorkflowException;
import com.amazonaws.services.simpleworkflow.flow.WorkflowReplayer;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;

/**
 * Simple example utility to pretty print workflow execution history.
 * 
 * @author fateev
 */
public class WorkflowExecutionFlowThreadDumper {

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.err.println("Usage: java " + WorkflowExecutionFlowThreadDumper.class.getName()
                    + "<workflow implementation class> <workflowId> <runId>");
            System.exit(1);
        }
        ConfigHelper configHelper = ConfigHelper.createConfig();
        AmazonSimpleWorkflow swfService = configHelper.createSWFClient();
        String domain = configHelper.getDomain();

        WorkflowExecution workflowExecution = new WorkflowExecution();
        String workflowId = args[1];
        workflowExecution.setWorkflowId(workflowId);
        String runId = args[2];
        workflowExecution.setRunId(runId);

        String implementationTypeName = args[0];
        @SuppressWarnings("unchecked")
        Class<Object> workflowImplementationType = (Class<Object>) Class.forName(implementationTypeName);
        WorkflowReplayer<Object> replayer = new WorkflowReplayer<Object>(swfService, domain, workflowExecution,
                workflowImplementationType);

        System.out.println("Beginning workflow replay for " + workflowExecution);
        try {
            String flowThreadDump = replayer.getAsynchronousThreadDumpAsString();
            System.out.println("Workflow asynchronous thread dump:");
            System.out.println(flowThreadDump);
        }
        catch (WorkflowException e) {
            System.out.println("No asynchronous thread dump available as workflow has failed: " + e);
        }
    }

}
