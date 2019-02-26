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
 * Represents test settings. This data structure is passed in as the "test" parameter to ScheduleRun. For an example of
 * the JSON request syntax, see <a>ScheduleRun</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ScheduleRunTest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleRunTest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The test's type.
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
     * The ARN of the uploaded test that will be run.
     * </p>
     */
    private String testPackageArn;
    /**
     * <p>
     * The ARN of the YAML-formatted test specification.
     * </p>
     */
    private String testSpecArn;
    /**
     * <p>
     * The test's filter.
     * </p>
     */
    private String filter;
    /**
     * <p>
     * The test's parameters, such as test framework parameters and fixture settings. Parameters are represented by
     * name-value pairs of strings.
     * </p>
     * <p>
     * For all tests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * app_performance_monitoring: Performance monitoring is enabled by default. Set this parameter to "false" to
     * disable it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Calabash tests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * profile: A cucumber profile, for example, "my_profile_name".
     * </p>
     * </li>
     * <li>
     * <p>
     * tags: You can limit execution to features or scenarios that have (or don't have) certain tags, for example,
     * "@smoke" or "@smoke,~@wip".
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Appium tests (all types):
     * </p>
     * <ul>
     * <li>
     * <p>
     * appium_version: The Appium version. Currently supported values are "1.6.5" (and higher), "latest", and "default".
     * </p>
     * <ul>
     * <li>
     * <p>
     * “latest” will run the latest Appium version supported by Device Farm (1.9.1).
     * </p>
     * </li>
     * <li>
     * <p>
     * For “default”, Device Farm will choose a compatible version of Appium for the device. The current behavior is to
     * run 1.7.2 on Android devices and iOS 9 and earlier, 1.7.2 for iOS 10 and later.
     * </p>
     * </li>
     * <li>
     * <p>
     * This behavior is subject to change.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For Fuzz tests (Android only):
     * </p>
     * <ul>
     * <li>
     * <p>
     * event_count: The number of events, between 1 and 10000, that the UI fuzz test should perform.
     * </p>
     * </li>
     * <li>
     * <p>
     * throttle: The time, in ms, between 0 and 1000, that the UI fuzz test should wait between events.
     * </p>
     * </li>
     * <li>
     * <p>
     * seed: A seed to use for randomizing the UI fuzz test. Using the same seed value between tests ensures identical
     * event sequences.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Explorer tests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username: A username to use if the Explorer encounters a login form. If not supplied, no username will be
     * inserted.
     * </p>
     * </li>
     * <li>
     * <p>
     * password: A password to use if the Explorer encounters a login form. If not supplied, no password will be
     * inserted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Instrumentation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * filter: A test filter string. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running a single test case: "com.android.abc.Test1"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a single test: "com.android.abc.Test1#smoke"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For XCTest and XCTestUI:
     * </p>
     * <ul>
     * <li>
     * <p>
     * filter: A test filter string. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running a single test class: "LoginTests"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a multiple test classes: "LoginTests,SmokeTests"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a single test: "LoginTests/testValid"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running multiple tests: "LoginTests/testValid,LoginTests/testInvalid"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For UIAutomator:
     * </p>
     * <ul>
     * <li>
     * <p>
     * filter: A test filter string. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running a single test case: "com.android.abc.Test1"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a single test: "com.android.abc.Test1#smoke"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The test's type.
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
     *        The test's type.</p>
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
     * The test's type.
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
     * @return The test's type.</p>
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
     * The test's type.
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
     *        The test's type.</p>
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

    public ScheduleRunTest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The test's type.
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
     *        The test's type.</p>
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
     * The test's type.
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
     *        The test's type.</p>
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

    public ScheduleRunTest withType(TestType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the uploaded test that will be run.
     * </p>
     * 
     * @param testPackageArn
     *        The ARN of the uploaded test that will be run.
     */

    public void setTestPackageArn(String testPackageArn) {
        this.testPackageArn = testPackageArn;
    }

    /**
     * <p>
     * The ARN of the uploaded test that will be run.
     * </p>
     * 
     * @return The ARN of the uploaded test that will be run.
     */

    public String getTestPackageArn() {
        return this.testPackageArn;
    }

    /**
     * <p>
     * The ARN of the uploaded test that will be run.
     * </p>
     * 
     * @param testPackageArn
     *        The ARN of the uploaded test that will be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunTest withTestPackageArn(String testPackageArn) {
        setTestPackageArn(testPackageArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the YAML-formatted test specification.
     * </p>
     * 
     * @param testSpecArn
     *        The ARN of the YAML-formatted test specification.
     */

    public void setTestSpecArn(String testSpecArn) {
        this.testSpecArn = testSpecArn;
    }

    /**
     * <p>
     * The ARN of the YAML-formatted test specification.
     * </p>
     * 
     * @return The ARN of the YAML-formatted test specification.
     */

    public String getTestSpecArn() {
        return this.testSpecArn;
    }

    /**
     * <p>
     * The ARN of the YAML-formatted test specification.
     * </p>
     * 
     * @param testSpecArn
     *        The ARN of the YAML-formatted test specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunTest withTestSpecArn(String testSpecArn) {
        setTestSpecArn(testSpecArn);
        return this;
    }

    /**
     * <p>
     * The test's filter.
     * </p>
     * 
     * @param filter
     *        The test's filter.
     */

    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The test's filter.
     * </p>
     * 
     * @return The test's filter.
     */

    public String getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The test's filter.
     * </p>
     * 
     * @param filter
     *        The test's filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunTest withFilter(String filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The test's parameters, such as test framework parameters and fixture settings. Parameters are represented by
     * name-value pairs of strings.
     * </p>
     * <p>
     * For all tests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * app_performance_monitoring: Performance monitoring is enabled by default. Set this parameter to "false" to
     * disable it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Calabash tests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * profile: A cucumber profile, for example, "my_profile_name".
     * </p>
     * </li>
     * <li>
     * <p>
     * tags: You can limit execution to features or scenarios that have (or don't have) certain tags, for example,
     * "@smoke" or "@smoke,~@wip".
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Appium tests (all types):
     * </p>
     * <ul>
     * <li>
     * <p>
     * appium_version: The Appium version. Currently supported values are "1.6.5" (and higher), "latest", and "default".
     * </p>
     * <ul>
     * <li>
     * <p>
     * “latest” will run the latest Appium version supported by Device Farm (1.9.1).
     * </p>
     * </li>
     * <li>
     * <p>
     * For “default”, Device Farm will choose a compatible version of Appium for the device. The current behavior is to
     * run 1.7.2 on Android devices and iOS 9 and earlier, 1.7.2 for iOS 10 and later.
     * </p>
     * </li>
     * <li>
     * <p>
     * This behavior is subject to change.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For Fuzz tests (Android only):
     * </p>
     * <ul>
     * <li>
     * <p>
     * event_count: The number of events, between 1 and 10000, that the UI fuzz test should perform.
     * </p>
     * </li>
     * <li>
     * <p>
     * throttle: The time, in ms, between 0 and 1000, that the UI fuzz test should wait between events.
     * </p>
     * </li>
     * <li>
     * <p>
     * seed: A seed to use for randomizing the UI fuzz test. Using the same seed value between tests ensures identical
     * event sequences.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Explorer tests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username: A username to use if the Explorer encounters a login form. If not supplied, no username will be
     * inserted.
     * </p>
     * </li>
     * <li>
     * <p>
     * password: A password to use if the Explorer encounters a login form. If not supplied, no password will be
     * inserted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Instrumentation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * filter: A test filter string. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running a single test case: "com.android.abc.Test1"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a single test: "com.android.abc.Test1#smoke"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For XCTest and XCTestUI:
     * </p>
     * <ul>
     * <li>
     * <p>
     * filter: A test filter string. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running a single test class: "LoginTests"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a multiple test classes: "LoginTests,SmokeTests"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a single test: "LoginTests/testValid"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running multiple tests: "LoginTests/testValid,LoginTests/testInvalid"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For UIAutomator:
     * </p>
     * <ul>
     * <li>
     * <p>
     * filter: A test filter string. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running a single test case: "com.android.abc.Test1"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a single test: "com.android.abc.Test1#smoke"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The test's parameters, such as test framework parameters and fixture settings. Parameters are represented
     *         by name-value pairs of strings.</p>
     *         <p>
     *         For all tests:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         app_performance_monitoring: Performance monitoring is enabled by default. Set this parameter to "false"
     *         to disable it.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For Calabash tests:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         profile: A cucumber profile, for example, "my_profile_name".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         tags: You can limit execution to features or scenarios that have (or don't have) certain tags, for
     *         example, "@smoke" or "@smoke,~@wip".
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For Appium tests (all types):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         appium_version: The Appium version. Currently supported values are "1.6.5" (and higher), "latest", and
     *         "default".
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         “latest” will run the latest Appium version supported by Device Farm (1.9.1).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For “default”, Device Farm will choose a compatible version of Appium for the device. The current
     *         behavior is to run 1.7.2 on Android devices and iOS 9 and earlier, 1.7.2 for iOS 10 and later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         This behavior is subject to change.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         For Fuzz tests (Android only):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         event_count: The number of events, between 1 and 10000, that the UI fuzz test should perform.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         throttle: The time, in ms, between 0 and 1000, that the UI fuzz test should wait between events.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         seed: A seed to use for randomizing the UI fuzz test. Using the same seed value between tests ensures
     *         identical event sequences.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For Explorer tests:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         username: A username to use if the Explorer encounters a login form. If not supplied, no username will be
     *         inserted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         password: A password to use if the Explorer encounters a login form. If not supplied, no password will be
     *         inserted.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For Instrumentation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         filter: A test filter string. Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Running a single test case: "com.android.abc.Test1"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Running a single test: "com.android.abc.Test1#smoke"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         For XCTest and XCTestUI:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         filter: A test filter string. Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Running a single test class: "LoginTests"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Running a multiple test classes: "LoginTests,SmokeTests"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Running a single test: "LoginTests/testValid"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Running multiple tests: "LoginTests/testValid,LoginTests/testInvalid"
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         For UIAutomator:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         filter: A test filter string. Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Running a single test case: "com.android.abc.Test1"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Running a single test: "com.android.abc.Test1#smoke"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The test's parameters, such as test framework parameters and fixture settings. Parameters are represented by
     * name-value pairs of strings.
     * </p>
     * <p>
     * For all tests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * app_performance_monitoring: Performance monitoring is enabled by default. Set this parameter to "false" to
     * disable it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Calabash tests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * profile: A cucumber profile, for example, "my_profile_name".
     * </p>
     * </li>
     * <li>
     * <p>
     * tags: You can limit execution to features or scenarios that have (or don't have) certain tags, for example,
     * "@smoke" or "@smoke,~@wip".
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Appium tests (all types):
     * </p>
     * <ul>
     * <li>
     * <p>
     * appium_version: The Appium version. Currently supported values are "1.6.5" (and higher), "latest", and "default".
     * </p>
     * <ul>
     * <li>
     * <p>
     * “latest” will run the latest Appium version supported by Device Farm (1.9.1).
     * </p>
     * </li>
     * <li>
     * <p>
     * For “default”, Device Farm will choose a compatible version of Appium for the device. The current behavior is to
     * run 1.7.2 on Android devices and iOS 9 and earlier, 1.7.2 for iOS 10 and later.
     * </p>
     * </li>
     * <li>
     * <p>
     * This behavior is subject to change.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For Fuzz tests (Android only):
     * </p>
     * <ul>
     * <li>
     * <p>
     * event_count: The number of events, between 1 and 10000, that the UI fuzz test should perform.
     * </p>
     * </li>
     * <li>
     * <p>
     * throttle: The time, in ms, between 0 and 1000, that the UI fuzz test should wait between events.
     * </p>
     * </li>
     * <li>
     * <p>
     * seed: A seed to use for randomizing the UI fuzz test. Using the same seed value between tests ensures identical
     * event sequences.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Explorer tests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username: A username to use if the Explorer encounters a login form. If not supplied, no username will be
     * inserted.
     * </p>
     * </li>
     * <li>
     * <p>
     * password: A password to use if the Explorer encounters a login form. If not supplied, no password will be
     * inserted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Instrumentation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * filter: A test filter string. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running a single test case: "com.android.abc.Test1"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a single test: "com.android.abc.Test1#smoke"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For XCTest and XCTestUI:
     * </p>
     * <ul>
     * <li>
     * <p>
     * filter: A test filter string. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running a single test class: "LoginTests"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a multiple test classes: "LoginTests,SmokeTests"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a single test: "LoginTests/testValid"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running multiple tests: "LoginTests/testValid,LoginTests/testInvalid"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For UIAutomator:
     * </p>
     * <ul>
     * <li>
     * <p>
     * filter: A test filter string. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running a single test case: "com.android.abc.Test1"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a single test: "com.android.abc.Test1#smoke"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param parameters
     *        The test's parameters, such as test framework parameters and fixture settings. Parameters are represented
     *        by name-value pairs of strings.</p>
     *        <p>
     *        For all tests:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        app_performance_monitoring: Performance monitoring is enabled by default. Set this parameter to "false" to
     *        disable it.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For Calabash tests:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        profile: A cucumber profile, for example, "my_profile_name".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        tags: You can limit execution to features or scenarios that have (or don't have) certain tags, for
     *        example, "@smoke" or "@smoke,~@wip".
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For Appium tests (all types):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        appium_version: The Appium version. Currently supported values are "1.6.5" (and higher), "latest", and
     *        "default".
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        “latest” will run the latest Appium version supported by Device Farm (1.9.1).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For “default”, Device Farm will choose a compatible version of Appium for the device. The current behavior
     *        is to run 1.7.2 on Android devices and iOS 9 and earlier, 1.7.2 for iOS 10 and later.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This behavior is subject to change.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For Fuzz tests (Android only):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        event_count: The number of events, between 1 and 10000, that the UI fuzz test should perform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        throttle: The time, in ms, between 0 and 1000, that the UI fuzz test should wait between events.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        seed: A seed to use for randomizing the UI fuzz test. Using the same seed value between tests ensures
     *        identical event sequences.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For Explorer tests:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        username: A username to use if the Explorer encounters a login form. If not supplied, no username will be
     *        inserted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        password: A password to use if the Explorer encounters a login form. If not supplied, no password will be
     *        inserted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For Instrumentation:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        filter: A test filter string. Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Running a single test case: "com.android.abc.Test1"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Running a single test: "com.android.abc.Test1#smoke"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For XCTest and XCTestUI:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        filter: A test filter string. Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Running a single test class: "LoginTests"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Running a multiple test classes: "LoginTests,SmokeTests"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Running a single test: "LoginTests/testValid"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Running multiple tests: "LoginTests/testValid,LoginTests/testInvalid"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For UIAutomator:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        filter: A test filter string. Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Running a single test case: "com.android.abc.Test1"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Running a single test: "com.android.abc.Test1#smoke"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The test's parameters, such as test framework parameters and fixture settings. Parameters are represented by
     * name-value pairs of strings.
     * </p>
     * <p>
     * For all tests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * app_performance_monitoring: Performance monitoring is enabled by default. Set this parameter to "false" to
     * disable it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Calabash tests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * profile: A cucumber profile, for example, "my_profile_name".
     * </p>
     * </li>
     * <li>
     * <p>
     * tags: You can limit execution to features or scenarios that have (or don't have) certain tags, for example,
     * "@smoke" or "@smoke,~@wip".
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Appium tests (all types):
     * </p>
     * <ul>
     * <li>
     * <p>
     * appium_version: The Appium version. Currently supported values are "1.6.5" (and higher), "latest", and "default".
     * </p>
     * <ul>
     * <li>
     * <p>
     * “latest” will run the latest Appium version supported by Device Farm (1.9.1).
     * </p>
     * </li>
     * <li>
     * <p>
     * For “default”, Device Farm will choose a compatible version of Appium for the device. The current behavior is to
     * run 1.7.2 on Android devices and iOS 9 and earlier, 1.7.2 for iOS 10 and later.
     * </p>
     * </li>
     * <li>
     * <p>
     * This behavior is subject to change.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For Fuzz tests (Android only):
     * </p>
     * <ul>
     * <li>
     * <p>
     * event_count: The number of events, between 1 and 10000, that the UI fuzz test should perform.
     * </p>
     * </li>
     * <li>
     * <p>
     * throttle: The time, in ms, between 0 and 1000, that the UI fuzz test should wait between events.
     * </p>
     * </li>
     * <li>
     * <p>
     * seed: A seed to use for randomizing the UI fuzz test. Using the same seed value between tests ensures identical
     * event sequences.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Explorer tests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username: A username to use if the Explorer encounters a login form. If not supplied, no username will be
     * inserted.
     * </p>
     * </li>
     * <li>
     * <p>
     * password: A password to use if the Explorer encounters a login form. If not supplied, no password will be
     * inserted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Instrumentation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * filter: A test filter string. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running a single test case: "com.android.abc.Test1"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a single test: "com.android.abc.Test1#smoke"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For XCTest and XCTestUI:
     * </p>
     * <ul>
     * <li>
     * <p>
     * filter: A test filter string. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running a single test class: "LoginTests"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a multiple test classes: "LoginTests,SmokeTests"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a single test: "LoginTests/testValid"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running multiple tests: "LoginTests/testValid,LoginTests/testInvalid"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For UIAutomator:
     * </p>
     * <ul>
     * <li>
     * <p>
     * filter: A test filter string. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running a single test case: "com.android.abc.Test1"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running a single test: "com.android.abc.Test1#smoke"
     * </p>
     * </li>
     * <li>
     * <p>
     * Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param parameters
     *        The test's parameters, such as test framework parameters and fixture settings. Parameters are represented
     *        by name-value pairs of strings.</p>
     *        <p>
     *        For all tests:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        app_performance_monitoring: Performance monitoring is enabled by default. Set this parameter to "false" to
     *        disable it.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For Calabash tests:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        profile: A cucumber profile, for example, "my_profile_name".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        tags: You can limit execution to features or scenarios that have (or don't have) certain tags, for
     *        example, "@smoke" or "@smoke,~@wip".
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For Appium tests (all types):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        appium_version: The Appium version. Currently supported values are "1.6.5" (and higher), "latest", and
     *        "default".
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        “latest” will run the latest Appium version supported by Device Farm (1.9.1).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For “default”, Device Farm will choose a compatible version of Appium for the device. The current behavior
     *        is to run 1.7.2 on Android devices and iOS 9 and earlier, 1.7.2 for iOS 10 and later.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This behavior is subject to change.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For Fuzz tests (Android only):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        event_count: The number of events, between 1 and 10000, that the UI fuzz test should perform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        throttle: The time, in ms, between 0 and 1000, that the UI fuzz test should wait between events.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        seed: A seed to use for randomizing the UI fuzz test. Using the same seed value between tests ensures
     *        identical event sequences.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For Explorer tests:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        username: A username to use if the Explorer encounters a login form. If not supplied, no username will be
     *        inserted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        password: A password to use if the Explorer encounters a login form. If not supplied, no password will be
     *        inserted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For Instrumentation:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        filter: A test filter string. Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Running a single test case: "com.android.abc.Test1"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Running a single test: "com.android.abc.Test1#smoke"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For XCTest and XCTestUI:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        filter: A test filter string. Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Running a single test class: "LoginTests"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Running a multiple test classes: "LoginTests,SmokeTests"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Running a single test: "LoginTests/testValid"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Running multiple tests: "LoginTests/testValid,LoginTests/testInvalid"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For UIAutomator:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        filter: A test filter string. Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Running a single test case: "com.android.abc.Test1"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Running a single test: "com.android.abc.Test1#smoke"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Running multiple tests: "com.android.abc.Test1,com.android.abc.Test2"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunTest withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public ScheduleRunTest addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunTest clearParametersEntries() {
        this.parameters = null;
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTestPackageArn() != null)
            sb.append("TestPackageArn: ").append(getTestPackageArn()).append(",");
        if (getTestSpecArn() != null)
            sb.append("TestSpecArn: ").append(getTestSpecArn()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleRunTest == false)
            return false;
        ScheduleRunTest other = (ScheduleRunTest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTestPackageArn() == null ^ this.getTestPackageArn() == null)
            return false;
        if (other.getTestPackageArn() != null && other.getTestPackageArn().equals(this.getTestPackageArn()) == false)
            return false;
        if (other.getTestSpecArn() == null ^ this.getTestSpecArn() == null)
            return false;
        if (other.getTestSpecArn() != null && other.getTestSpecArn().equals(this.getTestSpecArn()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTestPackageArn() == null) ? 0 : getTestPackageArn().hashCode());
        hashCode = prime * hashCode + ((getTestSpecArn() == null) ? 0 : getTestSpecArn().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleRunTest clone() {
        try {
            return (ScheduleRunTest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.ScheduleRunTestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
