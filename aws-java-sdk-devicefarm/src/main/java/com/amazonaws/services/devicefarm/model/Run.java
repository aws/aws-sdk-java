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
     * For fuzz tests, this is a seed to use for randomizing the UI fuzz test. Using the same seed value between tests
     * ensures identical event sequences.
     * </p>
     */
    private Integer seed;
    /**
     * <p>
     * An app to upload or that has been uploaded.
     * </p>
     */
    private String appUpload;
    /**
     * <p>
     * For fuzz tests, this is the number of events, between 1 and 10000, that the UI fuzz test should perform.
     * </p>
     */
    private Integer eventCount;
    /**
     * <p>
     * The number of minutes the job will execute before it times out.
     * </p>
     */
    private Integer jobTimeoutMinutes;
    /**
     * <p>
     * The ARN of the device pool for the run.
     * </p>
     */
    private String devicePoolArn;
    /**
     * <p>
     * Information about the locale that is used for the run.
     * </p>
     */
    private String locale;
    /**
     * <p>
     * Information about the radio states for the run.
     * </p>
     */
    private Radios radios;
    /**
     * <p>
     * Information about the location that is used for the run.
     * </p>
     */
    private Location location;
    /**
     * <p>
     * Output <code>CustomerArtifactPaths</code> object for the test run.
     * </p>
     */
    private CustomerArtifactPaths customerArtifactPaths;
    /**
     * <p>
     * The Device Farm console URL for the recording of the run.
     * </p>
     */
    private String webUrl;
    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     */
    private Boolean skipAppResign;
    /**
     * <p>
     * The ARN of the YAML-formatted test specification for the run.
     * </p>
     */
    private String testSpecArn;
    /**
     * <p>
     * The results of a device filter used to select the devices for a test run.
     * </p>
     */
    private DeviceSelectionResult deviceSelectionResult;

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
     * For fuzz tests, this is a seed to use for randomizing the UI fuzz test. Using the same seed value between tests
     * ensures identical event sequences.
     * </p>
     * 
     * @param seed
     *        For fuzz tests, this is a seed to use for randomizing the UI fuzz test. Using the same seed value between
     *        tests ensures identical event sequences.
     */

    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    /**
     * <p>
     * For fuzz tests, this is a seed to use for randomizing the UI fuzz test. Using the same seed value between tests
     * ensures identical event sequences.
     * </p>
     * 
     * @return For fuzz tests, this is a seed to use for randomizing the UI fuzz test. Using the same seed value between
     *         tests ensures identical event sequences.
     */

    public Integer getSeed() {
        return this.seed;
    }

    /**
     * <p>
     * For fuzz tests, this is a seed to use for randomizing the UI fuzz test. Using the same seed value between tests
     * ensures identical event sequences.
     * </p>
     * 
     * @param seed
     *        For fuzz tests, this is a seed to use for randomizing the UI fuzz test. Using the same seed value between
     *        tests ensures identical event sequences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withSeed(Integer seed) {
        setSeed(seed);
        return this;
    }

    /**
     * <p>
     * An app to upload or that has been uploaded.
     * </p>
     * 
     * @param appUpload
     *        An app to upload or that has been uploaded.
     */

    public void setAppUpload(String appUpload) {
        this.appUpload = appUpload;
    }

    /**
     * <p>
     * An app to upload or that has been uploaded.
     * </p>
     * 
     * @return An app to upload or that has been uploaded.
     */

    public String getAppUpload() {
        return this.appUpload;
    }

    /**
     * <p>
     * An app to upload or that has been uploaded.
     * </p>
     * 
     * @param appUpload
     *        An app to upload or that has been uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withAppUpload(String appUpload) {
        setAppUpload(appUpload);
        return this;
    }

    /**
     * <p>
     * For fuzz tests, this is the number of events, between 1 and 10000, that the UI fuzz test should perform.
     * </p>
     * 
     * @param eventCount
     *        For fuzz tests, this is the number of events, between 1 and 10000, that the UI fuzz test should perform.
     */

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    /**
     * <p>
     * For fuzz tests, this is the number of events, between 1 and 10000, that the UI fuzz test should perform.
     * </p>
     * 
     * @return For fuzz tests, this is the number of events, between 1 and 10000, that the UI fuzz test should perform.
     */

    public Integer getEventCount() {
        return this.eventCount;
    }

    /**
     * <p>
     * For fuzz tests, this is the number of events, between 1 and 10000, that the UI fuzz test should perform.
     * </p>
     * 
     * @param eventCount
     *        For fuzz tests, this is the number of events, between 1 and 10000, that the UI fuzz test should perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withEventCount(Integer eventCount) {
        setEventCount(eventCount);
        return this;
    }

    /**
     * <p>
     * The number of minutes the job will execute before it times out.
     * </p>
     * 
     * @param jobTimeoutMinutes
     *        The number of minutes the job will execute before it times out.
     */

    public void setJobTimeoutMinutes(Integer jobTimeoutMinutes) {
        this.jobTimeoutMinutes = jobTimeoutMinutes;
    }

    /**
     * <p>
     * The number of minutes the job will execute before it times out.
     * </p>
     * 
     * @return The number of minutes the job will execute before it times out.
     */

    public Integer getJobTimeoutMinutes() {
        return this.jobTimeoutMinutes;
    }

    /**
     * <p>
     * The number of minutes the job will execute before it times out.
     * </p>
     * 
     * @param jobTimeoutMinutes
     *        The number of minutes the job will execute before it times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withJobTimeoutMinutes(Integer jobTimeoutMinutes) {
        setJobTimeoutMinutes(jobTimeoutMinutes);
        return this;
    }

    /**
     * <p>
     * The ARN of the device pool for the run.
     * </p>
     * 
     * @param devicePoolArn
     *        The ARN of the device pool for the run.
     */

    public void setDevicePoolArn(String devicePoolArn) {
        this.devicePoolArn = devicePoolArn;
    }

    /**
     * <p>
     * The ARN of the device pool for the run.
     * </p>
     * 
     * @return The ARN of the device pool for the run.
     */

    public String getDevicePoolArn() {
        return this.devicePoolArn;
    }

    /**
     * <p>
     * The ARN of the device pool for the run.
     * </p>
     * 
     * @param devicePoolArn
     *        The ARN of the device pool for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withDevicePoolArn(String devicePoolArn) {
        setDevicePoolArn(devicePoolArn);
        return this;
    }

    /**
     * <p>
     * Information about the locale that is used for the run.
     * </p>
     * 
     * @param locale
     *        Information about the locale that is used for the run.
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * Information about the locale that is used for the run.
     * </p>
     * 
     * @return Information about the locale that is used for the run.
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * Information about the locale that is used for the run.
     * </p>
     * 
     * @param locale
     *        Information about the locale that is used for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * Information about the radio states for the run.
     * </p>
     * 
     * @param radios
     *        Information about the radio states for the run.
     */

    public void setRadios(Radios radios) {
        this.radios = radios;
    }

    /**
     * <p>
     * Information about the radio states for the run.
     * </p>
     * 
     * @return Information about the radio states for the run.
     */

    public Radios getRadios() {
        return this.radios;
    }

    /**
     * <p>
     * Information about the radio states for the run.
     * </p>
     * 
     * @param radios
     *        Information about the radio states for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withRadios(Radios radios) {
        setRadios(radios);
        return this;
    }

    /**
     * <p>
     * Information about the location that is used for the run.
     * </p>
     * 
     * @param location
     *        Information about the location that is used for the run.
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the location that is used for the run.
     * </p>
     * 
     * @return Information about the location that is used for the run.
     */

    public Location getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Information about the location that is used for the run.
     * </p>
     * 
     * @param location
     *        Information about the location that is used for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withLocation(Location location) {
        setLocation(location);
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
     * <p>
     * The Device Farm console URL for the recording of the run.
     * </p>
     * 
     * @param webUrl
     *        The Device Farm console URL for the recording of the run.
     */

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    /**
     * <p>
     * The Device Farm console URL for the recording of the run.
     * </p>
     * 
     * @return The Device Farm console URL for the recording of the run.
     */

    public String getWebUrl() {
        return this.webUrl;
    }

    /**
     * <p>
     * The Device Farm console URL for the recording of the run.
     * </p>
     * 
     * @param webUrl
     *        The Device Farm console URL for the recording of the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withWebUrl(String webUrl) {
        setWebUrl(webUrl);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     * 
     * @param skipAppResign
     *        When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public
     *        devices, Device Farm always signs your apps again and this parameter has no effect.</p>
     *        <p>
     *        For more information about how Device Farm re-signs your app(s), see <a
     *        href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm
     *        FAQs</i>.
     */

    public void setSkipAppResign(Boolean skipAppResign) {
        this.skipAppResign = skipAppResign;
    }

    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     * 
     * @return When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public
     *         devices, Device Farm always signs your apps again and this parameter has no effect.</p>
     *         <p>
     *         For more information about how Device Farm re-signs your app(s), see <a
     *         href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm
     *         FAQs</i>.
     */

    public Boolean getSkipAppResign() {
        return this.skipAppResign;
    }

    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     * 
     * @param skipAppResign
     *        When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public
     *        devices, Device Farm always signs your apps again and this parameter has no effect.</p>
     *        <p>
     *        For more information about how Device Farm re-signs your app(s), see <a
     *        href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm
     *        FAQs</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withSkipAppResign(Boolean skipAppResign) {
        setSkipAppResign(skipAppResign);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     * 
     * @return When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public
     *         devices, Device Farm always signs your apps again and this parameter has no effect.</p>
     *         <p>
     *         For more information about how Device Farm re-signs your app(s), see <a
     *         href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm
     *         FAQs</i>.
     */

    public Boolean isSkipAppResign() {
        return this.skipAppResign;
    }

    /**
     * <p>
     * The ARN of the YAML-formatted test specification for the run.
     * </p>
     * 
     * @param testSpecArn
     *        The ARN of the YAML-formatted test specification for the run.
     */

    public void setTestSpecArn(String testSpecArn) {
        this.testSpecArn = testSpecArn;
    }

    /**
     * <p>
     * The ARN of the YAML-formatted test specification for the run.
     * </p>
     * 
     * @return The ARN of the YAML-formatted test specification for the run.
     */

    public String getTestSpecArn() {
        return this.testSpecArn;
    }

    /**
     * <p>
     * The ARN of the YAML-formatted test specification for the run.
     * </p>
     * 
     * @param testSpecArn
     *        The ARN of the YAML-formatted test specification for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withTestSpecArn(String testSpecArn) {
        setTestSpecArn(testSpecArn);
        return this;
    }

    /**
     * <p>
     * The results of a device filter used to select the devices for a test run.
     * </p>
     * 
     * @param deviceSelectionResult
     *        The results of a device filter used to select the devices for a test run.
     */

    public void setDeviceSelectionResult(DeviceSelectionResult deviceSelectionResult) {
        this.deviceSelectionResult = deviceSelectionResult;
    }

    /**
     * <p>
     * The results of a device filter used to select the devices for a test run.
     * </p>
     * 
     * @return The results of a device filter used to select the devices for a test run.
     */

    public DeviceSelectionResult getDeviceSelectionResult() {
        return this.deviceSelectionResult;
    }

    /**
     * <p>
     * The results of a device filter used to select the devices for a test run.
     * </p>
     * 
     * @param deviceSelectionResult
     *        The results of a device filter used to select the devices for a test run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Run withDeviceSelectionResult(DeviceSelectionResult deviceSelectionResult) {
        setDeviceSelectionResult(deviceSelectionResult);
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
        if (getSeed() != null)
            sb.append("Seed: ").append(getSeed()).append(",");
        if (getAppUpload() != null)
            sb.append("AppUpload: ").append(getAppUpload()).append(",");
        if (getEventCount() != null)
            sb.append("EventCount: ").append(getEventCount()).append(",");
        if (getJobTimeoutMinutes() != null)
            sb.append("JobTimeoutMinutes: ").append(getJobTimeoutMinutes()).append(",");
        if (getDevicePoolArn() != null)
            sb.append("DevicePoolArn: ").append(getDevicePoolArn()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale()).append(",");
        if (getRadios() != null)
            sb.append("Radios: ").append(getRadios()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getCustomerArtifactPaths() != null)
            sb.append("CustomerArtifactPaths: ").append(getCustomerArtifactPaths()).append(",");
        if (getWebUrl() != null)
            sb.append("WebUrl: ").append(getWebUrl()).append(",");
        if (getSkipAppResign() != null)
            sb.append("SkipAppResign: ").append(getSkipAppResign()).append(",");
        if (getTestSpecArn() != null)
            sb.append("TestSpecArn: ").append(getTestSpecArn()).append(",");
        if (getDeviceSelectionResult() != null)
            sb.append("DeviceSelectionResult: ").append(getDeviceSelectionResult());
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
        if (other.getSeed() == null ^ this.getSeed() == null)
            return false;
        if (other.getSeed() != null && other.getSeed().equals(this.getSeed()) == false)
            return false;
        if (other.getAppUpload() == null ^ this.getAppUpload() == null)
            return false;
        if (other.getAppUpload() != null && other.getAppUpload().equals(this.getAppUpload()) == false)
            return false;
        if (other.getEventCount() == null ^ this.getEventCount() == null)
            return false;
        if (other.getEventCount() != null && other.getEventCount().equals(this.getEventCount()) == false)
            return false;
        if (other.getJobTimeoutMinutes() == null ^ this.getJobTimeoutMinutes() == null)
            return false;
        if (other.getJobTimeoutMinutes() != null && other.getJobTimeoutMinutes().equals(this.getJobTimeoutMinutes()) == false)
            return false;
        if (other.getDevicePoolArn() == null ^ this.getDevicePoolArn() == null)
            return false;
        if (other.getDevicePoolArn() != null && other.getDevicePoolArn().equals(this.getDevicePoolArn()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getRadios() == null ^ this.getRadios() == null)
            return false;
        if (other.getRadios() != null && other.getRadios().equals(this.getRadios()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getCustomerArtifactPaths() == null ^ this.getCustomerArtifactPaths() == null)
            return false;
        if (other.getCustomerArtifactPaths() != null && other.getCustomerArtifactPaths().equals(this.getCustomerArtifactPaths()) == false)
            return false;
        if (other.getWebUrl() == null ^ this.getWebUrl() == null)
            return false;
        if (other.getWebUrl() != null && other.getWebUrl().equals(this.getWebUrl()) == false)
            return false;
        if (other.getSkipAppResign() == null ^ this.getSkipAppResign() == null)
            return false;
        if (other.getSkipAppResign() != null && other.getSkipAppResign().equals(this.getSkipAppResign()) == false)
            return false;
        if (other.getTestSpecArn() == null ^ this.getTestSpecArn() == null)
            return false;
        if (other.getTestSpecArn() != null && other.getTestSpecArn().equals(this.getTestSpecArn()) == false)
            return false;
        if (other.getDeviceSelectionResult() == null ^ this.getDeviceSelectionResult() == null)
            return false;
        if (other.getDeviceSelectionResult() != null && other.getDeviceSelectionResult().equals(this.getDeviceSelectionResult()) == false)
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
        hashCode = prime * hashCode + ((getSeed() == null) ? 0 : getSeed().hashCode());
        hashCode = prime * hashCode + ((getAppUpload() == null) ? 0 : getAppUpload().hashCode());
        hashCode = prime * hashCode + ((getEventCount() == null) ? 0 : getEventCount().hashCode());
        hashCode = prime * hashCode + ((getJobTimeoutMinutes() == null) ? 0 : getJobTimeoutMinutes().hashCode());
        hashCode = prime * hashCode + ((getDevicePoolArn() == null) ? 0 : getDevicePoolArn().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getRadios() == null) ? 0 : getRadios().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getCustomerArtifactPaths() == null) ? 0 : getCustomerArtifactPaths().hashCode());
        hashCode = prime * hashCode + ((getWebUrl() == null) ? 0 : getWebUrl().hashCode());
        hashCode = prime * hashCode + ((getSkipAppResign() == null) ? 0 : getSkipAppResign().hashCode());
        hashCode = prime * hashCode + ((getTestSpecArn() == null) ? 0 : getTestSpecArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceSelectionResult() == null) ? 0 : getDeviceSelectionResult().hashCode());
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
