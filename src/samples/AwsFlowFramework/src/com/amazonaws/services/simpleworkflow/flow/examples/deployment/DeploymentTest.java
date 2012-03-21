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
package com.amazonaws.services.simpleworkflow.flow.examples.deployment;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;
import com.amazonaws.services.simpleworkflow.flow.junit.WorkflowTestBase;
import com.amazonaws.services.simpleworkflow.flow.junit.spring.FlowSpringJUnit4ClassRunner;

@RunWith(FlowSpringJUnit4ClassRunner.class)
@ContextConfiguration("DeploymentTest-context.xml")
public class DeploymentTest {

    public static class TestDeploymentActivities implements DeploymentActivities {

        private final String host;

        public TestDeploymentActivities(String host) {
            this.host = host;
        }

        @Override
        public String deployDatabase() {
            trace.add("Database-" + host);
            return "dbUrl-" + host;
        }

        @Override
        public String deployAppServer(List<String> dataSources) {
            trace.add("appServer-" + host);
            return "appServerUrl-" + host;
        }

        @Override
        public String deployWebServer(List<String> appServerUrls, List<String> dataSources) {
            trace.add("WebServer-" + host);
            return "webServerUrl-" + host;
        }

        @Override
        public String deployLoadBalancer(List<String> frontendUrls) {
            trace.add("LoadBalancer-" + host);
            return "loadBalancerUrl-" + host;
        }

    }

    @Rule
    @Autowired
    public WorkflowTestBase workflowTest;
    
    @Autowired
    public DeploymentWorkflowClientFactory workflowClientFactory;

    private static final List<String> trace = new ArrayList<String>();

    @Test
    public void test() throws IOException {
        new TryCatchFinally() {

            Throwable failure;

            @Override
            protected void doTry() throws Throwable {
                String template = getTemplate("AppStack1.xml");
                DeploymentWorkflowClient workflow = workflowClientFactory.getClient("AppStack1");
                workflow.deploy(template);
            }

            @Override
            protected void doCatch(Throwable e) throws Throwable {
                failure = e;
                throw e;
            }

            @Override
            protected void doFinally() throws Throwable {
                // Without this check assertEquals fails overwriting
                // original exception
                if (failure == null) {
                    List<String> expected = new ArrayList<String>();
                    expected.add("Database-host1");
                    expected.add("Database-host2");
                    expected.add("appServer-host3");
                    expected.add("appServer-host2");
                    expected.add("appServer-host3");
                    expected.add("WebServer-host2");
                    expected.add("WebServer-host1");
                    expected.add("LoadBalancer-host2");
                    Assert.assertEquals(expected, trace);
                }
            }

        };
    }

    private String getTemplate(String resourceName) throws IOException {
        URL resource = DeploymentTest.class.getResource(resourceName);
        String template = new Scanner(resource.openStream()).useDelimiter("\\A").next();
        return template;
    }

}
