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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a collection of one or more tests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/Suite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Suite implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The suite's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The suite's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The suite's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BUILTIN_FUZZ: The built-in fuzz type.
     * </p>
     * </li>
     * <li>
     * <p>
     * BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and
     * capturing screenshots at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT: The Appium Java JUnit type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG: The Appium Java TestNG type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON: The Appium Python type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE: The Appium Node.js type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY: The Appium Ruby type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON: The Appium Python type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE: The Appium Node.js type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY: The Appium Ruby type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH: The Calabash type.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION: The Instrumentation type.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION: The uiautomation type.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR: The uiautomator type.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST: The XCode test type.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI: The XCode UI test type.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * When the suite was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The suite's status.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_CONCURRENCY: A pending concurrency status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_DEVICE: A pending device status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING: A processing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULING: A scheduling status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING: A preparing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING: A running status.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED: A completed status.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING: A stopping status.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The suite's result.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * PASSED: A passing condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARNED: A warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: A failed condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED: A skipped condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERRORED: An error condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED: A stopped condition.
     * </p>
     * </li>
     * </ul>
     */
    private String result;
    /**
     * <p>
     * The suite's start time.
     * </p>
     */
    private java.util.Date started;
    /**
     * <p>
     * The suite's stop time.
     * </p>
     */
    private java.util.Date stopped;
    /**
     * <p>
     * The suite's result counters.
     * </p>
     */
    private Counters counters;
    /**
     * <p>
     * A message about the suite's result.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Represents the total (metered or unmetered) minutes used by the test suite.
     * </p>
     */
    private DeviceMinutes deviceMinutes;

    /**
     * <p>
     * The suite's ARN.
     * </p>
     * 
     * @param arn
     *        The suite's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The suite's ARN.
     * </p>
     * 
     * @return The suite's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The suite's ARN.
     * </p>
     * 
     * @param arn
     *        The suite's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Suite withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The suite's name.
     * </p>
     * 
     * @param name
     *        The suite's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The suite's name.
     * </p>
     * 
     * @return The suite's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The suite's name.
     * </p>
     * 
     * @param name
     *        The suite's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Suite withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The suite's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BUILTIN_FUZZ: The built-in fuzz type.
     * </p>
     * </li>
     * <li>
     * <p>
     * BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and
     * capturing screenshots at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT: The Appium Java JUnit type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG: The Appium Java TestNG type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON: The Appium Python type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE: The Appium Node.js type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY: The Appium Ruby type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON: The Appium Python type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE: The Appium Node.js type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY: The Appium Ruby type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH: The Calabash type.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION: The Instrumentation type.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION: The uiautomation type.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR: The uiautomator type.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST: The XCode test type.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI: The XCode UI test type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The suite's type.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        BUILTIN_FUZZ: The built-in fuzz type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and
     *        capturing screenshots at the same time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT: The Appium Java JUnit type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG: The Appium Java TestNG type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON: The Appium Python type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE: The Appium Node.js type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY: The Appium Ruby type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON: The Appium Python type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE: The Appium Node.js type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY: The Appium Ruby type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH: The Calabash type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION: The Instrumentation type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATION: The uiautomation type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATOR: The uiautomator type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST: The XCode test type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI: The XCode UI test type.
     *        </p>
     *        </li>
     * @see TestType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The suite's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BUILTIN_FUZZ: The built-in fuzz type.
     * </p>
     * </li>
     * <li>
     * <p>
     * BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and
     * capturing screenshots at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT: The Appium Java JUnit type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG: The Appium Java TestNG type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON: The Appium Python type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE: The Appium Node.js type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY: The Appium Ruby type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON: The Appium Python type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE: The Appium Node.js type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY: The Appium Ruby type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH: The Calabash type.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION: The Instrumentation type.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION: The uiautomation type.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR: The uiautomator type.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST: The XCode test type.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI: The XCode UI test type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The suite's type.</p>
     *         <p>
     *         Must be one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         BUILTIN_FUZZ: The built-in fuzz type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and
     *         capturing screenshots at the same time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_JAVA_JUNIT: The Appium Java JUnit type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_JAVA_TESTNG: The Appium Java TestNG type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_PYTHON: The Appium Python type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_NODE: The Appium Node.js type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_RUBY: The Appium Ruby type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_PYTHON: The Appium Python type for web apps.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_NODE: The Appium Node.js type for web apps.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_RUBY: The Appium Ruby type for web apps.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CALABASH: The Calabash type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTRUMENTATION: The Instrumentation type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UIAUTOMATION: The uiautomation type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UIAUTOMATOR: The uiautomator type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         XCTEST: The XCode test type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         XCTEST_UI: The XCode UI test type.
     *         </p>
     *         </li>
     * @see TestType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The suite's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BUILTIN_FUZZ: The built-in fuzz type.
     * </p>
     * </li>
     * <li>
     * <p>
     * BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and
     * capturing screenshots at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT: The Appium Java JUnit type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG: The Appium Java TestNG type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON: The Appium Python type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE: The Appium Node.js type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY: The Appium Ruby type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON: The Appium Python type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE: The Appium Node.js type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY: The Appium Ruby type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH: The Calabash type.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION: The Instrumentation type.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION: The uiautomation type.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR: The uiautomator type.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST: The XCode test type.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI: The XCode UI test type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The suite's type.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        BUILTIN_FUZZ: The built-in fuzz type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and
     *        capturing screenshots at the same time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT: The Appium Java JUnit type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG: The Appium Java TestNG type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON: The Appium Python type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE: The Appium Node.js type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY: The Appium Ruby type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON: The Appium Python type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE: The Appium Node.js type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY: The Appium Ruby type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH: The Calabash type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION: The Instrumentation type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATION: The uiautomation type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATOR: The uiautomator type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST: The XCode test type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI: The XCode UI test type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestType
     */

    public Suite withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The suite's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BUILTIN_FUZZ: The built-in fuzz type.
     * </p>
     * </li>
     * <li>
     * <p>
     * BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and
     * capturing screenshots at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT: The Appium Java JUnit type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG: The Appium Java TestNG type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON: The Appium Python type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE: The Appium Node.js type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY: The Appium Ruby type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON: The Appium Python type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE: The Appium Node.js type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY: The Appium Ruby type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH: The Calabash type.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION: The Instrumentation type.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION: The uiautomation type.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR: The uiautomator type.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST: The XCode test type.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI: The XCode UI test type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The suite's type.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        BUILTIN_FUZZ: The built-in fuzz type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and
     *        capturing screenshots at the same time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT: The Appium Java JUnit type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG: The Appium Java TestNG type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON: The Appium Python type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE: The Appium Node.js type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY: The Appium Ruby type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON: The Appium Python type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE: The Appium Node.js type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY: The Appium Ruby type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH: The Calabash type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION: The Instrumentation type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATION: The uiautomation type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATOR: The uiautomator type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST: The XCode test type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI: The XCode UI test type.
     *        </p>
     *        </li>
     * @see TestType
     */

    public void setType(TestType type) {
        withType(type);
    }

    /**
     * <p>
     * The suite's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BUILTIN_FUZZ: The built-in fuzz type.
     * </p>
     * </li>
     * <li>
     * <p>
     * BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and
     * capturing screenshots at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT: The Appium Java JUnit type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG: The Appium Java TestNG type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON: The Appium Python type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE: The Appium Node.js type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY: The Appium Ruby type.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON: The Appium Python type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE: The Appium Node.js type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY: The Appium Ruby type for web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH: The Calabash type.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION: The Instrumentation type.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION: The uiautomation type.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR: The uiautomator type.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST: The XCode test type.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI: The XCode UI test type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The suite's type.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        BUILTIN_FUZZ: The built-in fuzz type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BUILTIN_EXPLORER: For Android, an app explorer that will traverse an Android app, interacting with it and
     *        capturing screenshots at the same time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT: The Appium Java JUnit type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG: The Appium Java TestNG type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON: The Appium Python type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE: The Appium Node.js type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY: The Appium Ruby type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON: The Appium Python type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE: The Appium Node.js type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY: The Appium Ruby type for web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH: The Calabash type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION: The Instrumentation type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATION: The uiautomation type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATOR: The uiautomator type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST: The XCode test type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI: The XCode UI test type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestType
     */

    public Suite withType(TestType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * When the suite was created.
     * </p>
     * 
     * @param created
     *        When the suite was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * When the suite was created.
     * </p>
     * 
     * @return When the suite was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * When the suite was created.
     * </p>
     * 
     * @param created
     *        When the suite was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Suite withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The suite's status.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_CONCURRENCY: A pending concurrency status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_DEVICE: A pending device status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING: A processing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULING: A scheduling status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING: A preparing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING: A running status.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED: A completed status.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING: A stopping status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The suite's status.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_CONCURRENCY: A pending concurrency status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_DEVICE: A pending device status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING: A processing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULING: A scheduling status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARING: A preparing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING: A running status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED: A completed status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPING: A stopping status.
     *        </p>
     *        </li>
     * @see ExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The suite's status.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_CONCURRENCY: A pending concurrency status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_DEVICE: A pending device status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING: A processing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULING: A scheduling status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING: A preparing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING: A running status.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED: A completed status.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING: A stopping status.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The suite's status.</p>
     *         <p>
     *         Allowed values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PENDING: A pending status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PENDING_CONCURRENCY: A pending concurrency status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PENDING_DEVICE: A pending device status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PROCESSING: A processing status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SCHEDULING: A scheduling status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PREPARING: A preparing status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RUNNING: A running status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COMPLETED: A completed status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STOPPING: A stopping status.
     *         </p>
     *         </li>
     * @see ExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The suite's status.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_CONCURRENCY: A pending concurrency status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_DEVICE: A pending device status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING: A processing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULING: A scheduling status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING: A preparing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING: A running status.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED: A completed status.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING: A stopping status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The suite's status.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_CONCURRENCY: A pending concurrency status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_DEVICE: A pending device status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING: A processing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULING: A scheduling status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARING: A preparing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING: A running status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED: A completed status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPING: A stopping status.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public Suite withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The suite's status.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_CONCURRENCY: A pending concurrency status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_DEVICE: A pending device status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING: A processing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULING: A scheduling status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING: A preparing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING: A running status.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED: A completed status.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING: A stopping status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The suite's status.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_CONCURRENCY: A pending concurrency status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_DEVICE: A pending device status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING: A processing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULING: A scheduling status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARING: A preparing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING: A running status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED: A completed status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPING: A stopping status.
     *        </p>
     *        </li>
     * @see ExecutionStatus
     */

    public void setStatus(ExecutionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The suite's status.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_CONCURRENCY: A pending concurrency status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_DEVICE: A pending device status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING: A processing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULING: A scheduling status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING: A preparing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING: A running status.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED: A completed status.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING: A stopping status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The suite's status.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_CONCURRENCY: A pending concurrency status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_DEVICE: A pending device status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING: A processing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULING: A scheduling status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARING: A preparing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING: A running status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED: A completed status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPING: A stopping status.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public Suite withStatus(ExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The suite's result.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * PASSED: A passing condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARNED: A warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: A failed condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED: A skipped condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERRORED: An error condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED: A stopped condition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param result
     *        The suite's result.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PASSED: A passing condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WARNED: A warning condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED: A failed condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SKIPPED: A skipped condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ERRORED: An error condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPED: A stopped condition.
     *        </p>
     *        </li>
     * @see ExecutionResult
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * The suite's result.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * PASSED: A passing condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARNED: A warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: A failed condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED: A skipped condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERRORED: An error condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED: A stopped condition.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The suite's result.</p>
     *         <p>
     *         Allowed values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PENDING: A pending condition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PASSED: A passing condition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         WARNED: A warning condition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FAILED: A failed condition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SKIPPED: A skipped condition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ERRORED: An error condition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STOPPED: A stopped condition.
     *         </p>
     *         </li>
     * @see ExecutionResult
     */

    public String getResult() {
        return this.result;
    }

    /**
     * <p>
     * The suite's result.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * PASSED: A passing condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARNED: A warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: A failed condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED: A skipped condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERRORED: An error condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED: A stopped condition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param result
     *        The suite's result.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PASSED: A passing condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WARNED: A warning condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED: A failed condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SKIPPED: A skipped condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ERRORED: An error condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPED: A stopped condition.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionResult
     */

    public Suite withResult(String result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The suite's result.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * PASSED: A passing condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARNED: A warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: A failed condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED: A skipped condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERRORED: An error condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED: A stopped condition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param result
     *        The suite's result.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PASSED: A passing condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WARNED: A warning condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED: A failed condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SKIPPED: A skipped condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ERRORED: An error condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPED: A stopped condition.
     *        </p>
     *        </li>
     * @see ExecutionResult
     */

    public void setResult(ExecutionResult result) {
        withResult(result);
    }

    /**
     * <p>
     * The suite's result.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * PASSED: A passing condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARNED: A warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: A failed condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED: A skipped condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERRORED: An error condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED: A stopped condition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param result
     *        The suite's result.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PASSED: A passing condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WARNED: A warning condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED: A failed condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SKIPPED: A skipped condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ERRORED: An error condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPED: A stopped condition.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionResult
     */

    public Suite withResult(ExecutionResult result) {
        this.result = result.toString();
        return this;
    }

    /**
     * <p>
     * The suite's start time.
     * </p>
     * 
     * @param started
     *        The suite's start time.
     */

    public void setStarted(java.util.Date started) {
        this.started = started;
    }

    /**
     * <p>
     * The suite's start time.
     * </p>
     * 
     * @return The suite's start time.
     */

    public java.util.Date getStarted() {
        return this.started;
    }

    /**
     * <p>
     * The suite's start time.
     * </p>
     * 
     * @param started
     *        The suite's start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Suite withStarted(java.util.Date started) {
        setStarted(started);
        return this;
    }

    /**
     * <p>
     * The suite's stop time.
     * </p>
     * 
     * @param stopped
     *        The suite's stop time.
     */

    public void setStopped(java.util.Date stopped) {
        this.stopped = stopped;
    }

    /**
     * <p>
     * The suite's stop time.
     * </p>
     * 
     * @return The suite's stop time.
     */

    public java.util.Date getStopped() {
        return this.stopped;
    }

    /**
     * <p>
     * The suite's stop time.
     * </p>
     * 
     * @param stopped
     *        The suite's stop time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Suite withStopped(java.util.Date stopped) {
        setStopped(stopped);
        return this;
    }

    /**
     * <p>
     * The suite's result counters.
     * </p>
     * 
     * @param counters
     *        The suite's result counters.
     */

    public void setCounters(Counters counters) {
        this.counters = counters;
    }

    /**
     * <p>
     * The suite's result counters.
     * </p>
     * 
     * @return The suite's result counters.
     */

    public Counters getCounters() {
        return this.counters;
    }

    /**
     * <p>
     * The suite's result counters.
     * </p>
     * 
     * @param counters
     *        The suite's result counters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Suite withCounters(Counters counters) {
        setCounters(counters);
        return this;
    }

    /**
     * <p>
     * A message about the suite's result.
     * </p>
     * 
     * @param message
     *        A message about the suite's result.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message about the suite's result.
     * </p>
     * 
     * @return A message about the suite's result.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message about the suite's result.
     * </p>
     * 
     * @param message
     *        A message about the suite's result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Suite withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Represents the total (metered or unmetered) minutes used by the test suite.
     * </p>
     * 
     * @param deviceMinutes
     *        Represents the total (metered or unmetered) minutes used by the test suite.
     */

    public void setDeviceMinutes(DeviceMinutes deviceMinutes) {
        this.deviceMinutes = deviceMinutes;
    }

    /**
     * <p>
     * Represents the total (metered or unmetered) minutes used by the test suite.
     * </p>
     * 
     * @return Represents the total (metered or unmetered) minutes used by the test suite.
     */

    public DeviceMinutes getDeviceMinutes() {
        return this.deviceMinutes;
    }

    /**
     * <p>
     * Represents the total (metered or unmetered) minutes used by the test suite.
     * </p>
     * 
     * @param deviceMinutes
     *        Represents the total (metered or unmetered) minutes used by the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Suite withDeviceMinutes(DeviceMinutes deviceMinutes) {
        setDeviceMinutes(deviceMinutes);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
        if (getStarted() != null)
            sb.append("Started: ").append(getStarted()).append(",");
        if (getStopped() != null)
            sb.append("Stopped: ").append(getStopped()).append(",");
        if (getCounters() != null)
            sb.append("Counters: ").append(getCounters()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getDeviceMinutes() != null)
            sb.append("DeviceMinutes: ").append(getDeviceMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Suite == false)
            return false;
        Suite other = (Suite) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getStarted() == null ^ this.getStarted() == null)
            return false;
        if (other.getStarted() != null && other.getStarted().equals(this.getStarted()) == false)
            return false;
        if (other.getStopped() == null ^ this.getStopped() == null)
            return false;
        if (other.getStopped() != null && other.getStopped().equals(this.getStopped()) == false)
            return false;
        if (other.getCounters() == null ^ this.getCounters() == null)
            return false;
        if (other.getCounters() != null && other.getCounters().equals(this.getCounters()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getDeviceMinutes() == null ^ this.getDeviceMinutes() == null)
            return false;
        if (other.getDeviceMinutes() != null && other.getDeviceMinutes().equals(this.getDeviceMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getStarted() == null) ? 0 : getStarted().hashCode());
        hashCode = prime * hashCode + ((getStopped() == null) ? 0 : getStopped().hashCode());
        hashCode = prime * hashCode + ((getCounters() == null) ? 0 : getCounters().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getDeviceMinutes() == null) ? 0 : getDeviceMinutes().hashCode());
        return hashCode;
    }

    @Override
    public Suite clone() {
        try {
            return (Suite) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.SuiteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
