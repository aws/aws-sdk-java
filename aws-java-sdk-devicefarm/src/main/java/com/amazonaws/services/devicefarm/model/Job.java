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
 * Represents a device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/Job" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Job implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The job's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The job's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The job's type.
     * </p>
     * <p>
     * Allowed values include the following:
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
     * APPIUM_WEB_RUBY: The Appium Ruby test type for web apps.
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
     * When the job was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The job's status.
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
     * The job's result.
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
     * The job's start time.
     * </p>
     */
    private java.util.Date started;
    /**
     * <p>
     * The job's stop time.
     * </p>
     */
    private java.util.Date stopped;
    /**
     * <p>
     * The job's result counters.
     * </p>
     */
    private Counters counters;
    /**
     * <p>
     * A message about the job's result.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The device (phone or tablet).
     * </p>
     */
    private Device device;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * Represents the total (metered or unmetered) minutes used by the job.
     * </p>
     */
    private DeviceMinutes deviceMinutes;
    /**
     * <p>
     * The endpoint for streaming device video.
     * </p>
     */
    private String videoEndpoint;
    /**
     * <p>
     * This value is set to true if video capture is enabled; otherwise, it is set to false.
     * </p>
     */
    private Boolean videoCapture;

    /**
     * <p>
     * The job's ARN.
     * </p>
     * 
     * @param arn
     *        The job's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The job's ARN.
     * </p>
     * 
     * @return The job's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The job's ARN.
     * </p>
     * 
     * @param arn
     *        The job's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The job's name.
     * </p>
     * 
     * @param name
     *        The job's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The job's name.
     * </p>
     * 
     * @return The job's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The job's name.
     * </p>
     * 
     * @param name
     *        The job's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The job's type.
     * </p>
     * <p>
     * Allowed values include the following:
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
     * APPIUM_WEB_RUBY: The Appium Ruby test type for web apps.
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
     *        The job's type.</p>
     *        <p>
     *        Allowed values include the following:
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
     *        APPIUM_WEB_RUBY: The Appium Ruby test type for web apps.
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
     * The job's type.
     * </p>
     * <p>
     * Allowed values include the following:
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
     * APPIUM_WEB_RUBY: The Appium Ruby test type for web apps.
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
     * @return The job's type.</p>
     *         <p>
     *         Allowed values include the following:
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
     *         APPIUM_WEB_RUBY: The Appium Ruby test type for web apps.
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
     * The job's type.
     * </p>
     * <p>
     * Allowed values include the following:
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
     * APPIUM_WEB_RUBY: The Appium Ruby test type for web apps.
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
     *        The job's type.</p>
     *        <p>
     *        Allowed values include the following:
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
     *        APPIUM_WEB_RUBY: The Appium Ruby test type for web apps.
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

    public Job withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The job's type.
     * </p>
     * <p>
     * Allowed values include the following:
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
     * APPIUM_WEB_RUBY: The Appium Ruby test type for web apps.
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
     *        The job's type.</p>
     *        <p>
     *        Allowed values include the following:
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
     *        APPIUM_WEB_RUBY: The Appium Ruby test type for web apps.
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
     * The job's type.
     * </p>
     * <p>
     * Allowed values include the following:
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
     * APPIUM_WEB_RUBY: The Appium Ruby test type for web apps.
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
     *        The job's type.</p>
     *        <p>
     *        Allowed values include the following:
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
     *        APPIUM_WEB_RUBY: The Appium Ruby test type for web apps.
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

    public Job withType(TestType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @param created
     *        When the job was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @return When the job was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @param created
     *        When the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The job's status.
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
     *        The job's status.</p>
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
     * The job's status.
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
     * @return The job's status.</p>
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
     * The job's status.
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
     *        The job's status.</p>
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

    public Job withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The job's status.
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
     *        The job's status.</p>
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
     * The job's status.
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
     *        The job's status.</p>
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

    public Job withStatus(ExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The job's result.
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
     *        The job's result.</p>
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
     * The job's result.
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
     * @return The job's result.</p>
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
     * The job's result.
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
     *        The job's result.</p>
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

    public Job withResult(String result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The job's result.
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
     *        The job's result.</p>
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
     * The job's result.
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
     *        The job's result.</p>
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

    public Job withResult(ExecutionResult result) {
        this.result = result.toString();
        return this;
    }

    /**
     * <p>
     * The job's start time.
     * </p>
     * 
     * @param started
     *        The job's start time.
     */

    public void setStarted(java.util.Date started) {
        this.started = started;
    }

    /**
     * <p>
     * The job's start time.
     * </p>
     * 
     * @return The job's start time.
     */

    public java.util.Date getStarted() {
        return this.started;
    }

    /**
     * <p>
     * The job's start time.
     * </p>
     * 
     * @param started
     *        The job's start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withStarted(java.util.Date started) {
        setStarted(started);
        return this;
    }

    /**
     * <p>
     * The job's stop time.
     * </p>
     * 
     * @param stopped
     *        The job's stop time.
     */

    public void setStopped(java.util.Date stopped) {
        this.stopped = stopped;
    }

    /**
     * <p>
     * The job's stop time.
     * </p>
     * 
     * @return The job's stop time.
     */

    public java.util.Date getStopped() {
        return this.stopped;
    }

    /**
     * <p>
     * The job's stop time.
     * </p>
     * 
     * @param stopped
     *        The job's stop time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withStopped(java.util.Date stopped) {
        setStopped(stopped);
        return this;
    }

    /**
     * <p>
     * The job's result counters.
     * </p>
     * 
     * @param counters
     *        The job's result counters.
     */

    public void setCounters(Counters counters) {
        this.counters = counters;
    }

    /**
     * <p>
     * The job's result counters.
     * </p>
     * 
     * @return The job's result counters.
     */

    public Counters getCounters() {
        return this.counters;
    }

    /**
     * <p>
     * The job's result counters.
     * </p>
     * 
     * @param counters
     *        The job's result counters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCounters(Counters counters) {
        setCounters(counters);
        return this;
    }

    /**
     * <p>
     * A message about the job's result.
     * </p>
     * 
     * @param message
     *        A message about the job's result.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message about the job's result.
     * </p>
     * 
     * @return A message about the job's result.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message about the job's result.
     * </p>
     * 
     * @param message
     *        A message about the job's result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The device (phone or tablet).
     * </p>
     * 
     * @param device
     *        The device (phone or tablet).
     */

    public void setDevice(Device device) {
        this.device = device;
    }

    /**
     * <p>
     * The device (phone or tablet).
     * </p>
     * 
     * @return The device (phone or tablet).
     */

    public Device getDevice() {
        return this.device;
    }

    /**
     * <p>
     * The device (phone or tablet).
     * </p>
     * 
     * @param device
     *        The device (phone or tablet).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withDevice(Device device) {
        setDevice(device);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the instance.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the instance.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * Represents the total (metered or unmetered) minutes used by the job.
     * </p>
     * 
     * @param deviceMinutes
     *        Represents the total (metered or unmetered) minutes used by the job.
     */

    public void setDeviceMinutes(DeviceMinutes deviceMinutes) {
        this.deviceMinutes = deviceMinutes;
    }

    /**
     * <p>
     * Represents the total (metered or unmetered) minutes used by the job.
     * </p>
     * 
     * @return Represents the total (metered or unmetered) minutes used by the job.
     */

    public DeviceMinutes getDeviceMinutes() {
        return this.deviceMinutes;
    }

    /**
     * <p>
     * Represents the total (metered or unmetered) minutes used by the job.
     * </p>
     * 
     * @param deviceMinutes
     *        Represents the total (metered or unmetered) minutes used by the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withDeviceMinutes(DeviceMinutes deviceMinutes) {
        setDeviceMinutes(deviceMinutes);
        return this;
    }

    /**
     * <p>
     * The endpoint for streaming device video.
     * </p>
     * 
     * @param videoEndpoint
     *        The endpoint for streaming device video.
     */

    public void setVideoEndpoint(String videoEndpoint) {
        this.videoEndpoint = videoEndpoint;
    }

    /**
     * <p>
     * The endpoint for streaming device video.
     * </p>
     * 
     * @return The endpoint for streaming device video.
     */

    public String getVideoEndpoint() {
        return this.videoEndpoint;
    }

    /**
     * <p>
     * The endpoint for streaming device video.
     * </p>
     * 
     * @param videoEndpoint
     *        The endpoint for streaming device video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withVideoEndpoint(String videoEndpoint) {
        setVideoEndpoint(videoEndpoint);
        return this;
    }

    /**
     * <p>
     * This value is set to true if video capture is enabled; otherwise, it is set to false.
     * </p>
     * 
     * @param videoCapture
     *        This value is set to true if video capture is enabled; otherwise, it is set to false.
     */

    public void setVideoCapture(Boolean videoCapture) {
        this.videoCapture = videoCapture;
    }

    /**
     * <p>
     * This value is set to true if video capture is enabled; otherwise, it is set to false.
     * </p>
     * 
     * @return This value is set to true if video capture is enabled; otherwise, it is set to false.
     */

    public Boolean getVideoCapture() {
        return this.videoCapture;
    }

    /**
     * <p>
     * This value is set to true if video capture is enabled; otherwise, it is set to false.
     * </p>
     * 
     * @param videoCapture
     *        This value is set to true if video capture is enabled; otherwise, it is set to false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withVideoCapture(Boolean videoCapture) {
        setVideoCapture(videoCapture);
        return this;
    }

    /**
     * <p>
     * This value is set to true if video capture is enabled; otherwise, it is set to false.
     * </p>
     * 
     * @return This value is set to true if video capture is enabled; otherwise, it is set to false.
     */

    public Boolean isVideoCapture() {
        return this.videoCapture;
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
        if (getDevice() != null)
            sb.append("Device: ").append(getDevice()).append(",");
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getDeviceMinutes() != null)
            sb.append("DeviceMinutes: ").append(getDeviceMinutes()).append(",");
        if (getVideoEndpoint() != null)
            sb.append("VideoEndpoint: ").append(getVideoEndpoint()).append(",");
        if (getVideoCapture() != null)
            sb.append("VideoCapture: ").append(getVideoCapture());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;
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
        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getDeviceMinutes() == null ^ this.getDeviceMinutes() == null)
            return false;
        if (other.getDeviceMinutes() != null && other.getDeviceMinutes().equals(this.getDeviceMinutes()) == false)
            return false;
        if (other.getVideoEndpoint() == null ^ this.getVideoEndpoint() == null)
            return false;
        if (other.getVideoEndpoint() != null && other.getVideoEndpoint().equals(this.getVideoEndpoint()) == false)
            return false;
        if (other.getVideoCapture() == null ^ this.getVideoCapture() == null)
            return false;
        if (other.getVideoCapture() != null && other.getVideoCapture().equals(this.getVideoCapture()) == false)
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
        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceMinutes() == null) ? 0 : getDeviceMinutes().hashCode());
        hashCode = prime * hashCode + ((getVideoEndpoint() == null) ? 0 : getVideoEndpoint().hashCode());
        hashCode = prime * hashCode + ((getVideoCapture() == null) ? 0 : getVideoCapture().hashCode());
        return hashCode;
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.JobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
