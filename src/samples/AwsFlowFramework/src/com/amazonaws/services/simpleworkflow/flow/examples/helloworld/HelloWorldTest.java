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
package com.amazonaws.services.simpleworkflow.flow.examples.helloworld;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.core.TryFinally;
import com.amazonaws.services.simpleworkflow.flow.junit.FlowBlockJUnit4ClassRunner;
import com.amazonaws.services.simpleworkflow.flow.junit.WorkflowTest;

@RunWith(FlowBlockJUnit4ClassRunner.class)
public class HelloWorldTest {

    private final class TestHelloWorldActivities implements HelloWorldActivities {

        private String greeting;

        @Override
        public void printHello(String name) {
            greeting = "Hello " + name + "!";
        }

        public String getGreeting() {
            return greeting;
        }

    }

    @Rule
    public WorkflowTest workflowTest = new WorkflowTest();

    private final HelloWorldWorkflowClientFactory workflowFactory = new HelloWorldWorkflowClientFactoryImpl();

    private TestHelloWorldActivities activitiesImplementation;

    @Before
    public void setUp() throws Exception {
        workflowTest.addWorkflowImplementationType(HelloWorldWorkflowImpl.class);
        activitiesImplementation = new TestHelloWorldActivities();
        workflowTest.addActivitiesImplementation(activitiesImplementation);
    }

    /**
     * Test through generated workflow client. As workflow unit tests run in
     * dummy workflow context the same client that is used for creation of child
     * workflows is used.
     */
    @Test
    public void testThroughClient() throws Exception {
        HelloWorldWorkflowClient workflow = workflowFactory.getClient();
        Promise<Void> done = workflow.helloWorld("World");
        assertGreeting(done);
    }

    @Asynchronous
    private void assertGreeting(Promise<Void> done) {
        Assert.assertEquals("Hello World!", activitiesImplementation.getGreeting());
    }

    @Test
    public void testThroughClientAssertWithTask() throws Exception {
        HelloWorldWorkflowClient workflow = workflowFactory.getClient();
        Promise<Void> done = workflow.helloWorld("AWS");
        new Task(done) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertEquals("Hello AWS!", activitiesImplementation.getGreeting());
            }
        };
    }

    /**
     * Instantiate workflow implementation object directly. Note that any object
     * that is part of workflow can be unit tested through direct instantiation.
     */
    @Test
    public void directTest() {
        final HelloWorldWorkflow workflow = new HelloWorldWorkflowImpl();
        new TryFinally() {

            @Override
            protected void doTry() throws Throwable {
                // helloWorld returns void so we use TryFinally 
                // to wait for its completion
                workflow.helloWorld("SWF");
            }

            @Override
            protected void doFinally() throws Throwable {
                Assert.assertEquals("Hello SWF!", activitiesImplementation.getGreeting());
            }
        };
    }
}
