/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.smoketest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.Arrays;
import java.util.Map;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.util.Classes;
import com.google.inject.Inject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;

/**
 * Step definitions that perform actions for every matcher that is agreed.
 */
@ScenarioScoped
public class AWSCucumberStepdefs {

    private AmazonWebServiceClient client;
    private String packageName;
    private Object result;
    private AmazonServiceException exception;

    @Inject
    public AWSCucumberStepdefs(AmazonWebServiceClient client) {
        this.client = client;
        this.client.setRegion(RegionUtils.getRegion("us-east-1"));

        Class<?> httpClientClass = Classes.childClassOf(AmazonWebServiceClient.class, this.client);

        this.packageName = httpClientClass.getPackage().getName();
    }

    @When("^I call the \"(.*?)\" API$")
    public void when_I_call_the_API(String operation)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        call(operation, null);
    }

    @When("^I call the \"(.*?)\" API with:$")
    public void when_I_call_the_API(String operation, Map<String, String> args)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        call(operation, args);
    }

    @When("^I attempt to call the \"(.+?)\" API with:$")
    public void when_I_attempt_to_call_API(String operation, Map<String, String> args)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        attemptCall(operation, args);
    }

    @Then("^the response should contain a \"([^\"]*)\"$")
    public void the_response_should_contain_a(String memberName) throws Throwable {
        String[] path = memberName.split("[.]");

        Object member = ReflectionUtils.getByPath(result, Arrays.asList(path));

        assertNotNull(member);
    }

    @Then("^the value at \"(.*?)\" should be a list")
    public void then_the_value_at_should_be_a_list(String memberName) {

        String[] path = memberName.split("[.]");

        Object member = ReflectionUtils.getByPath(result, Arrays.asList(path));

        assertTrue(member instanceof java.util.List);
    }

    @Then("^the value at \"(.*?)\" should be a map")
    public void then_the_value_at_should_be_a_map(String memberName) {

        String[] path = memberName.split("[.]");

        Object member = ReflectionUtils.getByPath(result, Arrays.asList(path));

        assertTrue(member instanceof java.util.Map);
    }

    @Then("^I expect the response error code to be \"(.+?)\"$")
    public void then_I_expect_response_error_code(String expected) {
        assertNotNull(exception);
        assertTrue(exception instanceof AmazonServiceException);
        String actual = exception.getErrorCode();
        assertEquals("Error code doesn't match. Expected : " + expected + ". Actual :" + actual, expected, actual);
    }

    @And("^I expect the response error message to include:$")
    public void and_I_expect_the_response_error_message_include(String expected) {
        assertNotNull(exception);
        assertTrue(exception instanceof AmazonServiceException);
        String actual = exception.getErrorMessage().toLowerCase();
        assertTrue("Error message doesn't match. Expected : " + expected + ". Actual :" + actual,
                actual.contains(expected.toLowerCase()));
    }

    private void attemptCall(String operation, Map<String, String> args)
             throws IllegalAccessException, IllegalArgumentException {
        try {
            call(operation, args);
        } catch (InvocationTargetException ite) {
            exception = (AmazonServiceException) ite.getCause();
        }
    }

    private void call(String operation, Map<String, String> args)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        final String requestClassName = packageName + ".model." + operation + "Request";
        final String operationMethodName = operation.substring(0, 1).toLowerCase() + operation.substring(1);
        Class<Object> requestClass = ReflectionUtils.loadClass(this.getClass(), requestClassName);
        Object requestObject = ReflectionUtils.newInstance(requestClass);

        if (args != null && !args.isEmpty()) {
            for (Map.Entry<String, String> entry : args.entrySet()) {

                String key = entry.getKey().substring(0, 1).toUpperCase() + entry.getKey().substring(1);
                Object value = convertTo(
                        ReflectionUtils.getParameterTypes(requestObject, Arrays.asList(key)),
                        entry.getValue());

                ReflectionUtils.setByPath(requestObject, value, Arrays.asList(key));
            }
        }

        Method method = ReflectionUtils.findMethod(client, operationMethodName, requestClass);

        result = method.invoke(client, requestObject);
    }


    private Object convertTo(Class<?> type, String value) {

        if (type.equals(Integer.class))
            return Integer.valueOf(value);
        else if (type.equals(Boolean.class))
            return Boolean.valueOf(value);
        else if(type.equals(List.class)) {
            return Arrays.asList(value);
        }
        return value;
    }

    static class ServiceConfig {
        private String serviceInterfaceName;
        private String sourcePackageName;

        public void setServiceInterfaceName(String serviceInterfaceName) {
            this.serviceInterfaceName = serviceInterfaceName;
        }

        public String getServiceInterfaceName() {
            return this.serviceInterfaceName;
        }

        public void setSourcePackageName(String sourcePackageName) {
            this.sourcePackageName = sourcePackageName;
        }

        public String getSourcePackageName() {
            return this.sourcePackageName;
        }
    }
}
