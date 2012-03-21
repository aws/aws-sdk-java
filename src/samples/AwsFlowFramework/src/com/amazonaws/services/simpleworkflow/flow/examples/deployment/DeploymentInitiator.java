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

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeploymentInitiator {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        URL pUrl = DeploymentHost.class.getResource("/com/amazonaws/services/simpleworkflow/flow/examples/log4j.properties");
        PropertyConfigurator.configure(pUrl);

        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                "/com/amazonaws/services/simpleworkflow/flow/examples/deployment/DeploymentInitiator-context.xml");

        DeploymentWorkflowClientExternalFactory workflowFactory = appContext.getBean("workflowFactory",
                DeploymentWorkflowClientExternalFactory.class);

        String applicationStackConfigFile = args[0];
        // Use applicationStackConfig as workflowId to prohibit running multiple deployments of the same stack in parallel
        String workflowId = new File(applicationStackConfigFile).getName();
        DeploymentWorkflowClientExternal worklfowClient = workflowFactory.getClient(workflowId);
        String template = loadFile(applicationStackConfigFile);
        worklfowClient.deploy(template);
        System.out.println("Initiated deployment from " + applicationStackConfigFile);
    }

    public static String loadFile(String fileName) throws IOException {
        int length = (int) new File(fileName).length();
        byte[] buffer = new byte[length];
        BufferedInputStream is = null;
        try {
            is = new BufferedInputStream(new FileInputStream(fileName));
            is.read(buffer);
        }
        finally {
            if (is != null) {
                is.close();
            }
        }
        return new String(buffer);
    }
}
