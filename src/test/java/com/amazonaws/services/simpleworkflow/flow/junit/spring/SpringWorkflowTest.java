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
package com.amazonaws.services.simpleworkflow.flow.junit.spring;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.DecisionContext;
import com.amazonaws.services.simpleworkflow.flow.junit.WorkflowTestBase;
import com.amazonaws.services.simpleworkflow.flow.spring.WorkflowScope;
import com.amazonaws.services.simpleworkflow.flow.test.TestDecisionContext;
import com.amazonaws.services.simpleworkflow.flow.test.TestPOJOActivityImplementationGenericActivityClient;
import com.amazonaws.services.simpleworkflow.flow.test.TestPOJOActivityImplementationWorker;
import com.amazonaws.services.simpleworkflow.flow.test.TestWorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.test.TestWorkflowContext;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

/**
 * JUnit Rule that should be present as a public field of the test class
 * annotated with @Rule. Requires that test is executed with
 * {@link FlowSpringJUnit4ClassRunner}.
 * 
 */
public class SpringWorkflowTest extends WorkflowTestBase {

    private TestPOJOActivityImplementationGenericActivityClient activityClient;

    private SpringTestPOJOWorkflowImplementationGenericWorkflowClient workflowClient;

    private Map<String, TestPOJOActivityImplementationWorker> workers = new HashMap<String, TestPOJOActivityImplementationWorker>();

    private DataConverter dataConverter;

    public SpringWorkflowTest() {
        super(new TestDecisionContext(new TestPOJOActivityImplementationGenericActivityClient(),
                new SpringTestPOJOWorkflowImplementationGenericWorkflowClient(), new TestWorkflowClock(),
                new TestWorkflowContext()));
        activityClient = (TestPOJOActivityImplementationGenericActivityClient) decisionContext.getActivityClient();
        workflowClient = (SpringTestPOJOWorkflowImplementationGenericWorkflowClient) decisionContext.getWorkflowClient();
    }

    public void addActivitiesImplementation(Object activitiesImplementation) {
        addActivitiesImplementation(defaultActivitiesTaskListToPoll, activitiesImplementation);
    }

    public void addActivitiesImplementation(String taskList, Object activitiesImplementation) {
        try {
            TestPOJOActivityImplementationWorker worker = getActivityWorker(taskList);
            worker.addActivitiesImplementation(activitiesImplementation);
            activityClient.addWorker(worker);
        }
        catch (Exception e) {
            throw new IllegalArgumentException("Invalid activities implementation: " + activitiesImplementation, e);
        }
    }

    private TestPOJOActivityImplementationWorker getActivityWorker(String taskList) {
        TestPOJOActivityImplementationWorker result = workers.get(taskList);
        if (result == null) {
            result = new TestPOJOActivityImplementationWorker(taskList);
            if (dataConverter != null) {
                result.setDataConverter(dataConverter);
            }
            workers.put(taskList, result);
        }
        return result;
    }

    public void setActivitiesImplementations(Iterable<Object> activityImplementationObjects) {
        workers.clear();
        addActivitiesImplementations(defaultActivitiesTaskListToPoll, activityImplementationObjects);
    }

    public void addActivitiesImplementations(String taskList, Iterable<Object> activityImplementationObjects) {
        try {
            TestPOJOActivityImplementationWorker worker = getActivityWorker(taskList);
            worker.setActivitiesImplementations(activityImplementationObjects);
            activityClient.addWorker(worker);
        }
        catch (Exception e) {
            throw new IllegalArgumentException("Invalid activities implementation: " + activityImplementationObjects, e);
        }
    }

    public void setTaskListActivitiesImplementationMap(Map<String, Object> map) {
        workers.clear();
        for (Entry<String, Object> taskImplPair: map.entrySet()) {
            addActivitiesImplementation(taskImplPair.getKey(), taskImplPair.getValue());
        }
    }

    public Map<String, Object> getTaskListActivitiesImplementationMap() {
        Map<String, Object> result = new HashMap<String, Object>();
        for (Entry<String, TestPOJOActivityImplementationWorker> pair: workers.entrySet()) {
            Iterable<Object> implementations = pair.getValue().getActivitiesImplementations();
            for (Object impelementation : implementations) {
                result.put(pair.getKey(), impelementation);
            }
        }
        return result;
    }
    
    public Iterable<Object> getActivitiesImplementations() {
        TestPOJOActivityImplementationWorker worker = getActivityWorker(defaultActivitiesTaskListToPoll);
        return worker.getActivitiesImplementations();
    }

    public void setWorkflowImplementations(Iterable<Object> workflowImplementations)
            throws InstantiationException, IllegalAccessException {
        workflowClient.setWorkflowImplementations(workflowImplementations);
    }

    public Iterable<Object> getWorkflowImplementations() {
        return workflowClient.getWorkflowImplementations();
    }

    public void addWorkflowImplementation(Object workflowImplementation) throws InstantiationException, IllegalAccessException {
        workflowClient.addWorkflowImplementation(workflowImplementation);
    }

    public DataConverter getDataConverter() {
        return dataConverter;
    }

    public void setDataConverter(DataConverter converter) {
        dataConverter = converter;
        workflowClient.setDataConverter(converter);
    }

    public Iterable<WorkflowType> getWorkflowTypesToRegister() {
        return workflowClient.getWorkflowTypesToRegister();
    }

    @Override
    protected void beforeEvaluate(DecisionContext decisionContext) {
        WorkflowScope.setDecisionContext(decisionContext);
    }

    @Override
    protected void afterEvaluate() {
    }


    
}
