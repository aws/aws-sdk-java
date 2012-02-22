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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;

public class DeploymentWorkflowImpl implements DeploymentWorkflow {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public Promise<String> deploy(String springTemplate) {
        Resource templateResource = new ByteArrayResource(springTemplate.getBytes());
        GenericXmlApplicationContext appContext = new GenericXmlApplicationContext();
        appContext.setParent(applicationContext);
        appContext.load(templateResource);
        appContext.refresh();
        ApplicationStack applicationStack = appContext.getBean("applicationStack", ApplicationStack.class);
        applicationStack.deploy();
        return applicationStack.getUrl();
    }

}
