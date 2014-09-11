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

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.simpleworkflow.flow.test.TestDecisionContext;
import com.amazonaws.services.simpleworkflow.flow.test.TestPOJOActivityImplementationGenericActivityClient;
import com.amazonaws.services.simpleworkflow.flow.test.TestPOJOActivityImplementationWorker;
import com.amazonaws.services.simpleworkflow.flow.test.TestPOJOWorkflowImplementationGenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.flow.test.TestWorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.test.TestWorkflowContext;

/**
 * JUnit Rule that should be present as a public field of the test class
 * annotated with @Rule. Requires that test is executed with
 * {@link FlowBlockJUnit4ClassRunner}.
 * 
 * @author fateev
 */
public class WorkflowTest extends WorkflowTestBase {

    private TestPOJOActivityImplementationGenericActivityClient activityClient;

    private TestPOJOWorkflowImplementationGenericWorkflowClient workflowClient;

    private Map<String, TestPOJOActivityImplementationWorker> workers = new HashMap<String, TestPOJOActivityImplementationWorker>();

    public WorkflowTest() {
        super(new TestDecisionContext(new TestPOJOActivityImplementationGenericActivityClient(),
                new TestPOJOWorkflowImplementationGenericWorkflowClient(), new TestWorkflowClock(), new TestWorkflowContext()));
        activityClient = (TestPOJOActivityImplementationGenericActivityClient) decisionContext.getActivityClient();
        workflowClient = (TestPOJOWorkflowImplementationGenericWorkflowClient) decisionContext.getWorkflowClient();
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
            workers.put(taskList, result);
        }
        return result;
    }

    public void addWorkflowImplementationType(Class<?> workflowImplementationType) {
        try {
            workflowClient.addWorkflowImplementationType(workflowImplementationType);
        }
        catch (Exception e) {
            throw new IllegalArgumentException("Invalid workflow type: " + workflowImplementationType, e);
        }
    }

    public void setActivitiesImplementations(Iterable<Object> activitiesImplementationObjects) {
        workers.clear();
        addActivitiesImplementations(defaultActivitiesTaskListToPoll, activitiesImplementationObjects);
    }

    public void setTaskListActivitiesImplementationMap(Map<String, Object> map) {
        workers.clear();
        for (Entry<String, Object> taskImplPair : map.entrySet()) {
            addActivitiesImplementation(taskImplPair.getKey(), taskImplPair.getValue());
        }
    }

    public Map<String, Object> getTaskListActivitiesImplementationMap() {
        Map<String, Object> result = new HashMap<String, Object>();
        for (Entry<String, TestPOJOActivityImplementationWorker> pair : workers.entrySet()) {
            Iterable<Object> implementations = pair.getValue().getActivitiesImplementations();
            for (Object impelementation : implementations) {
                result.put(pair.getKey(), impelementation);
            }
        }
        return result;
    }

    public void addActivitiesImplementations(String taskList, Iterable<Object> activityImplementationObjects) {
        try {
            TestPOJOActivityImplementationWorker worker = getActivityWorker(taskList);
            worker.addActivitiesImplementations(activityImplementationObjects);
            activityClient.addWorker(worker);
        }
        catch (Exception e) {
            throw new IllegalArgumentException("Invalid activities implementation: " + activityImplementationObjects, e);
        }
    }

    public Iterable<Object> getActivitiesImplementations() {
        TestPOJOActivityImplementationWorker worker = getActivityWorker(defaultActivitiesTaskListToPoll);
        return worker.getActivitiesImplementations();
    }

    public void setWorkflowImplementationTypes(Collection<Class<?>> workflowImplementationTypes)
            throws InstantiationException, IllegalAccessException {
        workflowClient.setWorkflowImplementationTypes(workflowImplementationTypes);
    }

}
