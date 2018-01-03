/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents a test run on a set of devices with a given app package, test parameters, etc.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/Run" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Run implements Serializable, Cloneable, StructuredPojo {

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
     * The network profile being used for a test run.
     * </p>
     */
    private NetworkProfile networkProfile;
    /**
     * <p>
     * Read-only URL for an object in S3 bucket where you can get the parsing results of the test package. If the test
     * package doesn't parse, the reason why it doesn't parse appears in the file that this URL points to.
     * </p>
     */
    private String parsingResultUrl;
    /**
     * <p>
     * Supporting field for the result field. Set only if <code>result</code> is <code>SKIPPED</code>.
     * <code>PARSING_FAILED</code> if the result is skipped because of test package parsing failure.
     * </p>
     */
    private String resultCode;
    /**
     * <p>
     * Output <code>CustomerArtifactPaths</code> object for the test run.
     * </p>
     */
    private CustomerArtifactPaths customerArtifactPaths;

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
        withType(type);
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
        this.type = type.toString();
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
        withPlatform(platform);
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
        this.platform = platform.toString();
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
        withStatus(status);
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
        this.status = status.toString();
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
        withResult(result);
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
        this.result = result.toString();
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
        withBillingMethod(billingMethod);
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
        this.billingMethod = billingMethod.toString();
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
     * <p>
     * The network profile being used for a test run.
     * </p>
     * 
     * @param networkProfile
     *        The network profile being used for a test run.
     */

    public void setNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
    }

    /**
     * <p>
     * The network profile being used for a test run.
     * </p>
     * 
     * @return The network profile being used for a test run.
     */

    public NetworkProfile getNetworkProfile() {
        return this.networkProfile;
    }

    /**
     * <p>
     * The network profile being used for a test run.
     * </p>
     * 
     * @param networkProfile
     *        The network profile being used for a test run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withNetworkProfile(NetworkProfile networkProfile) {
        setNetworkProfile(networkProfile);
        return this;
    }

    /**
     * <p>
     * Read-only URL for an object in S3 bucket where you can get the parsing results of the test package. If the test
     * package doesn't parse, the reason why it doesn't parse appears in the file that this URL points to.
     * </p>
     * 
     * @param parsingResultUrl
     *        Read-only URL for an object in S3 bucket where you can get the parsing results of the test package. If the
     *        test package doesn't parse, the reason why it doesn't parse appears in the file that this URL points to.
     */

    public void setParsingResultUrl(String parsingResultUrl) {
        this.parsingResultUrl = parsingResultUrl;
    }

    /**
     * <p>
     * Read-only URL for an object in S3 bucket where you can get the parsing results of the test package. If the test
     * package doesn't parse, the reason why it doesn't parse appears in the file that this URL points to.
     * </p>
     * 
     * @return Read-only URL for an object in S3 bucket where you can get the parsing results of the test package. If
     *         the test package doesn't parse, the reason why it doesn't parse appears in the file that this URL points
     *         to.
     */

    public String getParsingResultUrl() {
        return this.parsingResultUrl;
    }

    /**
     * <p>
     * Read-only URL for an object in S3 bucket where you can get the parsing results of the test package. If the test
     * package doesn't parse, the reason why it doesn't parse appears in the file that this URL points to.
     * </p>
     * 
     * @param parsingResultUrl
     *        Read-only URL for an object in S3 bucket where you can get the parsing results of the test package. If the
     *        test package doesn't parse, the reason why it doesn't parse appears in the file that this URL points to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withParsingResultUrl(String parsingResultUrl) {
        setParsingResultUrl(parsingResultUrl);
        return this;
    }

    /**
     * <p>
     * Supporting field for the result field. Set only if <code>result</code> is <code>SKIPPED</code>.
     * <code>PARSING_FAILED</code> if the result is skipped because of test package parsing failure.
     * </p>
     * 
     * @param resultCode
     *        Supporting field for the result field. Set only if <code>result</code> is <code>SKIPPED</code>.
     *        <code>PARSING_FAILED</code> if the result is skipped because of test package parsing failure.
     * @see ExecutionResultCode
     */

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * <p>
     * Supporting field for the result field. Set only if <code>result</code> is <code>SKIPPED</code>.
     * <code>PARSING_FAILED</code> if the result is skipped because of test package parsing failure.
     * </p>
     * 
     * @return Supporting field for the result field. Set only if <code>result</code> is <code>SKIPPED</code>.
     *         <code>PARSING_FAILED</code> if the result is skipped because of test package parsing failure.
     * @see ExecutionResultCode
     */

    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * <p>
     * Supporting field for the result field. Set only if <code>result</code> is <code>SKIPPED</code>.
     * <code>PARSING_FAILED</code> if the result is skipped because of test package parsing failure.
     * </p>
     * 
     * @param resultCode
     *        Supporting field for the result field. Set only if <code>result</code> is <code>SKIPPED</code>.
     *        <code>PARSING_FAILED</code> if the result is skipped because of test package parsing failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionResultCode
     */

    public Run withResultCode(String resultCode) {
        setResultCode(resultCode);
        return this;
    }

    /**
     * <p>
     * Supporting field for the result field. Set only if <code>result</code> is <code>SKIPPED</code>.
     * <code>PARSING_FAILED</code> if the result is skipped because of test package parsing failure.
     * </p>
     * 
     * @param resultCode
     *        Supporting field for the result field. Set only if <code>result</code> is <code>SKIPPED</code>.
     *        <code>PARSING_FAILED</code> if the result is skipped because of test package parsing failure.
     * @see ExecutionResultCode
     */

    public void setResultCode(ExecutionResultCode resultCode) {
        withResultCode(resultCode);
    }

    /**
     * <p>
     * Supporting field for the result field. Set only if <code>result</code> is <code>SKIPPED</code>.
     * <code>PARSING_FAILED</code> if the result is skipped because of test package parsing failure.
     * </p>
     * 
     * @param resultCode
     *        Supporting field for the result field. Set only if <code>result</code> is <code>SKIPPED</code>.
     *        <code>PARSING_FAILED</code> if the result is skipped because of test package parsing failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionResultCode
     */

    public Run withResultCode(ExecutionResultCode resultCode) {
        this.resultCode = resultCode.toString();
        return this;
    }

    /**
     * <p>
     * Output <code>CustomerArtifactPaths</code> object for the test run.
     * </p>
     * 
     * @param customerArtifactPaths
     *        Output <code>CustomerArtifactPaths</code> object for the test run.
     */

    public void setCustomerArtifactPaths(CustomerArtifactPaths customerArtifactPaths) {
        this.customerArtifactPaths = customerArtifactPaths;
    }

    /**
     * <p>
     * Output <code>CustomerArtifactPaths</code> object for the test run.
     * </p>
     * 
     * @return Output <code>CustomerArtifactPaths</code> object for the test run.
     */

    public CustomerArtifactPaths getCustomerArtifactPaths() {
        return this.customerArtifactPaths;
    }

    /**
     * <p>
     * Output <code>CustomerArtifactPaths</code> object for the test run.
     * </p>
     * 
     * @param customerArtifactPaths
     *        Output <code>CustomerArtifactPaths</code> object for the test run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withCustomerArtifactPaths(CustomerArtifactPaths customerArtifactPaths) {
        setCustomerArtifactPaths(customerArtifactPaths);
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
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
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
        if (getTotalJobs() != null)
            sb.append("TotalJobs: ").append(getTotalJobs()).append(",");
        if (getCompletedJobs() != null)
            sb.append("CompletedJobs: ").append(getCompletedJobs()).append(",");
        if (getBillingMethod() != null)
            sb.append("BillingMethod: ").append(getBillingMethod()).append(",");
        if (getDeviceMinutes() != null)
            sb.append("DeviceMinutes: ").append(getDeviceMinutes()).append(",");
        if (getNetworkProfile() != null)
            sb.append("NetworkProfile: ").append(getNetworkProfile()).append(",");
        if (getParsingResultUrl() != null)
            sb.append("ParsingResultUrl: ").append(getParsingResultUrl()).append(",");
        if (getResultCode() != null)
            sb.append("ResultCode: ").append(getResultCode()).append(",");
        if (getCustomerArtifactPaths() != null)
            sb.append("CustomerArtifactPaths: ").append(getCustomerArtifactPaths());
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
        if (other.getNetworkProfile() == null ^ this.getNetworkProfile() == null)
            return false;
        if (other.getNetworkProfile() != null && other.getNetworkProfile().equals(this.getNetworkProfile()) == false)
            return false;
        if (other.getParsingResultUrl() == null ^ this.getParsingResultUrl() == null)
            return false;
        if (other.getParsingResultUrl() != null && other.getParsingResultUrl().equals(this.getParsingResultUrl()) == false)
            return false;
        if (other.getResultCode() == null ^ this.getResultCode() == null)
            return false;
        if (other.getResultCode() != null && other.getResultCode().equals(this.getResultCode()) == false)
            return false;
        if (other.getCustomerArtifactPaths() == null ^ this.getCustomerArtifactPaths() == null)
            return false;
        if (other.getCustomerArtifactPaths() != null && other.getCustomerArtifactPaths().equals(this.getCustomerArtifactPaths()) == false)
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
        hashCode = prime * hashCode + ((getNetworkProfile() == null) ? 0 : getNetworkProfile().hashCode());
        hashCode = prime * hashCode + ((getParsingResultUrl() == null) ? 0 : getParsingResultUrl().hashCode());
        hashCode = prime * hashCode + ((getResultCode() == null) ? 0 : getResultCode().hashCode());
        hashCode = prime * hashCode + ((getCustomerArtifactPaths() == null) ? 0 : getCustomerArtifactPaths().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.RunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
