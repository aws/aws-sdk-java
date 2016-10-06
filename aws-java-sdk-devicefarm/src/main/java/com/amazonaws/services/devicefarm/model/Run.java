/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents an app on a set of devices with a specific test and configuration.
 * </p>
 */
public class Run implements Serializable, Cloneable {

    /**
     * <p>
     * The run's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The run's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The run's type.
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
     * APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for Web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for Web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON: The Appium Python type for Web apps.
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
     * The run's platform.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID: The Android platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS: The iOS platform.
     * </p>
     * </li>
     * </ul>
     */
    private String platform;
    /**
     * <p>
     * When the run was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The run's status.
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
     * The run's result.
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
     * The run's start time.
     * </p>
     */
    private java.util.Date started;
    /**
     * <p>
     * The run's stop time.
     * </p>
     */
    private java.util.Date stopped;
    /**
     * <p>
     * The run's result counters.
     * </p>
     */
    private Counters counters;
    /**
     * <p>
     * A message about the run's result.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The total number of jobs for the run.
     * </p>
     */
    private Integer totalJobs;
    /**
     * <p>
     * The total number of completed jobs.
     * </p>
     */
    private Integer completedJobs;
    /**
     * <p>
     * Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the parameter is
     * not specified, the default value is <code>metered</code>.
     * </p>
     */
    private String billingMethod;
    /**
     * <p>
     * Represents the total (metered or unmetered) minutes used by the test run.
     * </p>
     */
    private DeviceMinutes deviceMinutes;

    /**
     * <p>
     * The run's ARN.
     * </p>
     * 
     * @param arn
     *        The run's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The run's ARN.
     * </p>
     * 
     * @return The run's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The run's ARN.
     * </p>
     * 
     * @param arn
     *        The run's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The run's name.
     * </p>
     * 
     * @param name
     *        The run's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The run's name.
     * </p>
     * 
     * @return The run's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The run's name.
     * </p>
     * 
     * @param name
     *        The run's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The run's type.
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
     * APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for Web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for Web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON: The Appium Python type for Web apps.
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
     *        The run's type.</p>
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
     *        APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for Web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for Web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON: The Appium Python type for Web apps.
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
     * The run's type.
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
     * APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for Web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for Web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON: The Appium Python type for Web apps.
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
     * @return The run's type.</p>
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
     *         APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for Web apps.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for Web apps.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_PYTHON: The Appium Python type for Web apps.
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
     * The run's type.
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
     * APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for Web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for Web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON: The Appium Python type for Web apps.
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
     *        The run's type.</p>
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
     *        APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for Web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for Web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON: The Appium Python type for Web apps.
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

    public Run withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The run's type.
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
     * APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for Web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for Web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON: The Appium Python type for Web apps.
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
     *        The run's type.</p>
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
     *        APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for Web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for Web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON: The Appium Python type for Web apps.
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
        this.type = type.toString();
    }

    /**
     * <p>
     * The run's type.
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
     * APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for Web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for Web apps.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON: The Appium Python type for Web apps.
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
     *        The run's type.</p>
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
     *        APPIUM_WEB_JAVA_JUNIT: The Appium Java JUnit type for Web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG: The Appium Java TestNG type for Web apps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON: The Appium Python type for Web apps.
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

    public Run withType(TestType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The run's platform.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID: The Android platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS: The iOS platform.
     * </p>
     * </li>
     * </ul>
     * 
     * @param platform
     *        The run's platform.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID: The Android platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS: The iOS platform.
     *        </p>
     *        </li>
     * @see DevicePlatform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The run's platform.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID: The Android platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS: The iOS platform.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The run's platform.</p>
     *         <p>
     *         Allowed values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ANDROID: The Android platform.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IOS: The iOS platform.
     *         </p>
     *         </li>
     * @see DevicePlatform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The run's platform.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID: The Android platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS: The iOS platform.
     * </p>
     * </li>
     * </ul>
     * 
     * @param platform
     *        The run's platform.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID: The Android platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS: The iOS platform.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DevicePlatform
     */

    public Run withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The run's platform.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID: The Android platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS: The iOS platform.
     * </p>
     * </li>
     * </ul>
     * 
     * @param platform
     *        The run's platform.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID: The Android platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS: The iOS platform.
     *        </p>
     *        </li>
     * @see DevicePlatform
     */

    public void setPlatform(DevicePlatform platform) {
        this.platform = platform.toString();
    }

    /**
     * <p>
     * The run's platform.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID: The Android platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS: The iOS platform.
     * </p>
     * </li>
     * </ul>
     * 
     * @param platform
     *        The run's platform.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID: The Android platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS: The iOS platform.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DevicePlatform
     */

    public Run withPlatform(DevicePlatform platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * When the run was created.
     * </p>
     * 
     * @param created
     *        When the run was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * When the run was created.
     * </p>
     * 
     * @return When the run was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * When the run was created.
     * </p>
     * 
     * @param created
     *        When the run was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The run's status.
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
     *        The run's status.</p>
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
     * The run's status.
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
     * @return The run's status.</p>
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
     * The run's status.
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
     *        The run's status.</p>
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

    public Run withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The run's status.
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
     *        The run's status.</p>
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
        this.status = status.toString();
    }

    /**
     * <p>
     * The run's status.
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
     *        The run's status.</p>
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

    public Run withStatus(ExecutionStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The run's result.
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
     *        The run's result.</p>
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
     * The run's result.
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
     * @return The run's result.</p>
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
     * The run's result.
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
     *        The run's result.</p>
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

    public Run withResult(String result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The run's result.
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
     *        The run's result.</p>
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
        this.result = result.toString();
    }

    /**
     * <p>
     * The run's result.
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
     *        The run's result.</p>
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

    public Run withResult(ExecutionResult result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The run's start time.
     * </p>
     * 
     * @param started
     *        The run's start time.
     */

    public void setStarted(java.util.Date started) {
        this.started = started;
    }

    /**
     * <p>
     * The run's start time.
     * </p>
     * 
     * @return The run's start time.
     */

    public java.util.Date getStarted() {
        return this.started;
    }

    /**
     * <p>
     * The run's start time.
     * </p>
     * 
     * @param started
     *        The run's start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withStarted(java.util.Date started) {
        setStarted(started);
        return this;
    }

    /**
     * <p>
     * The run's stop time.
     * </p>
     * 
     * @param stopped
     *        The run's stop time.
     */

    public void setStopped(java.util.Date stopped) {
        this.stopped = stopped;
    }

    /**
     * <p>
     * The run's stop time.
     * </p>
     * 
     * @return The run's stop time.
     */

    public java.util.Date getStopped() {
        return this.stopped;
    }

    /**
     * <p>
     * The run's stop time.
     * </p>
     * 
     * @param stopped
     *        The run's stop time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withStopped(java.util.Date stopped) {
        setStopped(stopped);
        return this;
    }

    /**
     * <p>
     * The run's result counters.
     * </p>
     * 
     * @param counters
     *        The run's result counters.
     */

    public void setCounters(Counters counters) {
        this.counters = counters;
    }

    /**
     * <p>
     * The run's result counters.
     * </p>
     * 
     * @return The run's result counters.
     */

    public Counters getCounters() {
        return this.counters;
    }

    /**
     * <p>
     * The run's result counters.
     * </p>
     * 
     * @param counters
     *        The run's result counters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withCounters(Counters counters) {
        setCounters(counters);
        return this;
    }

    /**
     * <p>
     * A message about the run's result.
     * </p>
     * 
     * @param message
     *        A message about the run's result.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message about the run's result.
     * </p>
     * 
     * @return A message about the run's result.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message about the run's result.
     * </p>
     * 
     * @param message
     *        A message about the run's result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The total number of jobs for the run.
     * </p>
     * 
     * @param totalJobs
     *        The total number of jobs for the run.
     */

    public void setTotalJobs(Integer totalJobs) {
        this.totalJobs = totalJobs;
    }

    /**
     * <p>
     * The total number of jobs for the run.
     * </p>
     * 
     * @return The total number of jobs for the run.
     */

    public Integer getTotalJobs() {
        return this.totalJobs;
    }

    /**
     * <p>
     * The total number of jobs for the run.
     * </p>
     * 
     * @param totalJobs
     *        The total number of jobs for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withTotalJobs(Integer totalJobs) {
        setTotalJobs(totalJobs);
        return this;
    }

    /**
     * <p>
     * The total number of completed jobs.
     * </p>
     * 
     * @param completedJobs
     *        The total number of completed jobs.
     */

    public void setCompletedJobs(Integer completedJobs) {
        this.completedJobs = completedJobs;
    }

    /**
     * <p>
     * The total number of completed jobs.
     * </p>
     * 
     * @return The total number of completed jobs.
     */

    public Integer getCompletedJobs() {
        return this.completedJobs;
    }

    /**
     * <p>
     * The total number of completed jobs.
     * </p>
     * 
     * @param completedJobs
     *        The total number of completed jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withCompletedJobs(Integer completedJobs) {
        setCompletedJobs(completedJobs);
        return this;
    }

    /**
     * <p>
     * Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the parameter is
     * not specified, the default value is <code>metered</code>.
     * </p>
     * 
     * @param billingMethod
     *        Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the
     *        parameter is not specified, the default value is <code>metered</code>.
     * @see BillingMethod
     */

    public void setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
    }

    /**
     * <p>
     * Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the parameter is
     * not specified, the default value is <code>metered</code>.
     * </p>
     * 
     * @return Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the
     *         parameter is not specified, the default value is <code>metered</code>.
     * @see BillingMethod
     */

    public String getBillingMethod() {
        return this.billingMethod;
    }

    /**
     * <p>
     * Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the parameter is
     * not specified, the default value is <code>metered</code>.
     * </p>
     * 
     * @param billingMethod
     *        Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the
     *        parameter is not specified, the default value is <code>metered</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMethod
     */

    public Run withBillingMethod(String billingMethod) {
        setBillingMethod(billingMethod);
        return this;
    }

    /**
     * <p>
     * Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the parameter is
     * not specified, the default value is <code>metered</code>.
     * </p>
     * 
     * @param billingMethod
     *        Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the
     *        parameter is not specified, the default value is <code>metered</code>.
     * @see BillingMethod
     */

    public void setBillingMethod(BillingMethod billingMethod) {
        this.billingMethod = billingMethod.toString();
    }

    /**
     * <p>
     * Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the parameter is
     * not specified, the default value is <code>metered</code>.
     * </p>
     * 
     * @param billingMethod
     *        Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the
     *        parameter is not specified, the default value is <code>metered</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMethod
     */

    public Run withBillingMethod(BillingMethod billingMethod) {
        setBillingMethod(billingMethod);
        return this;
    }

    /**
     * <p>
     * Represents the total (metered or unmetered) minutes used by the test run.
     * </p>
     * 
     * @param deviceMinutes
     *        Represents the total (metered or unmetered) minutes used by the test run.
     */

    public void setDeviceMinutes(DeviceMinutes deviceMinutes) {
        this.deviceMinutes = deviceMinutes;
    }

    /**
     * <p>
     * Represents the total (metered or unmetered) minutes used by the test run.
     * </p>
     * 
     * @return Represents the total (metered or unmetered) minutes used by the test run.
     */

    public DeviceMinutes getDeviceMinutes() {
        return this.deviceMinutes;
    }

    /**
     * <p>
     * Represents the total (metered or unmetered) minutes used by the test run.
     * </p>
     * 
     * @param deviceMinutes
     *        Represents the total (metered or unmetered) minutes used by the test run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withDeviceMinutes(DeviceMinutes deviceMinutes) {
        setDeviceMinutes(deviceMinutes);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getCreated() != null)
            sb.append("Created: " + getCreated() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getResult() != null)
            sb.append("Result: " + getResult() + ",");
        if (getStarted() != null)
            sb.append("Started: " + getStarted() + ",");
        if (getStopped() != null)
            sb.append("Stopped: " + getStopped() + ",");
        if (getCounters() != null)
            sb.append("Counters: " + getCounters() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getTotalJobs() != null)
            sb.append("TotalJobs: " + getTotalJobs() + ",");
        if (getCompletedJobs() != null)
            sb.append("CompletedJobs: " + getCompletedJobs() + ",");
        if (getBillingMethod() != null)
            sb.append("BillingMethod: " + getBillingMethod() + ",");
        if (getDeviceMinutes() != null)
            sb.append("DeviceMinutes: " + getDeviceMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Run == false)
            return false;
        Run other = (Run) obj;
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
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
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
        if (other.getTotalJobs() == null ^ this.getTotalJobs() == null)
            return false;
        if (other.getTotalJobs() != null && other.getTotalJobs().equals(this.getTotalJobs()) == false)
            return false;
        if (other.getCompletedJobs() == null ^ this.getCompletedJobs() == null)
            return false;
        if (other.getCompletedJobs() != null && other.getCompletedJobs().equals(this.getCompletedJobs()) == false)
            return false;
        if (other.getBillingMethod() == null ^ this.getBillingMethod() == null)
            return false;
        if (other.getBillingMethod() != null && other.getBillingMethod().equals(this.getBillingMethod()) == false)
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
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getStarted() == null) ? 0 : getStarted().hashCode());
        hashCode = prime * hashCode + ((getStopped() == null) ? 0 : getStopped().hashCode());
        hashCode = prime * hashCode + ((getCounters() == null) ? 0 : getCounters().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getTotalJobs() == null) ? 0 : getTotalJobs().hashCode());
        hashCode = prime * hashCode + ((getCompletedJobs() == null) ? 0 : getCompletedJobs().hashCode());
        hashCode = prime * hashCode + ((getBillingMethod() == null) ? 0 : getBillingMethod().hashCode());
        hashCode = prime * hashCode + ((getDeviceMinutes() == null) ? 0 : getDeviceMinutes().hashCode());
        return hashCode;
    }

    @Override
    public Run clone() {
        try {
            return (Run) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
