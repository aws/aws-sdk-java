/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simplesystemsmanagement.smoketests;

import javax.annotation.Generated;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

import cucumber.api.guice.CucumberModules;
import cucumber.runtime.java.guice.InjectorSource;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClient;

/**
 * Injector that binds the AmazonWebServiceClient interface to the
 * com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClient
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSimpleSystemsManagementModuleInjector implements InjectorSource {

    @Override
    public Injector getInjector() {
        return Guice.createInjector(Stage.PRODUCTION, CucumberModules.SCENARIO, new AWSSimpleSystemsManagementModule());
    }

    static class AWSSimpleSystemsManagementModule extends AbstractModule {

        @Override
        protected void configure() {
            bind(AmazonWebServiceClient.class).to(AWSSimpleSystemsManagementClient.class);
        }
    }
}
