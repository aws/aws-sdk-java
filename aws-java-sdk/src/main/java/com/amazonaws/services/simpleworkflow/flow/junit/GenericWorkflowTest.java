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
package com.amazonaws.services.simpleworkflow.flow.junit;

import com.amazonaws.services.simpleworkflow.flow.generic.ActivityImplementationFactory;
import com.amazonaws.services.simpleworkflow.flow.generic.WorkflowDefinitionFactoryFactory;
import com.amazonaws.services.simpleworkflow.flow.test.TestDecisionContext;
import com.amazonaws.services.simpleworkflow.flow.test.TestGenericActivityClient;
import com.amazonaws.services.simpleworkflow.flow.test.TestGenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.flow.test.TestWorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.test.TestWorkflowContext;

public class GenericWorkflowTest extends WorkflowTestBase {

    private TestGenericActivityClient activityClient;

    public GenericWorkflowTest(WorkflowDefinitionFactoryFactory factoryFactory) {
        super(new TestDecisionContext(new TestGenericActivityClient(),
                new TestGenericWorkflowClient(factoryFactory), new TestWorkflowClock(), new TestWorkflowContext()));
        activityClient = (TestGenericActivityClient) decisionContext.getActivityClient();
    }

    public void addFactory(String taskListToListen, ActivityImplementationFactory factory) {
        activityClient.addFactory(taskListToListen, factory);
    }

    public void addFactory(ActivityImplementationFactory factory) {
        addFactory(defaultActivitiesTaskListToPoll, factory);
    }

}
