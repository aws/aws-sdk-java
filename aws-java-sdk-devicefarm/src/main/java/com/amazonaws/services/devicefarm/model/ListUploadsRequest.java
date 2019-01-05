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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to the list uploads operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListUploads" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUploadsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to list uploads.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of upload.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID_APP: An Android upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS_APP: An iOS upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * WEB_APP: A web appliction upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * EXTERNAL_DATA: An external data upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_PACKAGE: An Appium Python test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_PACKAGE: An Appium Node.js test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_PACKAGE: An Appium Ruby test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_PACKAGE: An Appium Python test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_PACKAGE: An Appium Node.js test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_PACKAGE: An Appium Ruby test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_TEST_PACKAGE: A Calabash test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_PACKAGE: An instrumentation upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION_TEST_PACKAGE: A uiautomation test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR_TEST_PACKAGE: A uiautomator test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_TEST_PACKAGE: An XCode test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_PACKAGE: An XCode UI test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_SPEC: An Appium Python test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_SPEC: An Appium Node.js test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_SPEC: An Appium Ruby test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_SPEC: An Appium Python test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_SPEC: An Appium Node.js test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_SPEC: An Appium Ruby test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_SPEC: An instrumentation test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_SPEC: An XCode UI test spec upload.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to list uploads.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the project for which you want to list uploads.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to list uploads.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project for which you want to list uploads.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to list uploads.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the project for which you want to list uploads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUploadsRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of upload.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID_APP: An Android upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS_APP: An iOS upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * WEB_APP: A web appliction upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * EXTERNAL_DATA: An external data upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_PACKAGE: An Appium Python test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_PACKAGE: An Appium Node.js test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_PACKAGE: An Appium Ruby test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_PACKAGE: An Appium Python test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_PACKAGE: An Appium Node.js test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_PACKAGE: An Appium Ruby test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_TEST_PACKAGE: A Calabash test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_PACKAGE: An instrumentation upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION_TEST_PACKAGE: A uiautomation test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR_TEST_PACKAGE: A uiautomator test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_TEST_PACKAGE: An XCode test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_PACKAGE: An XCode UI test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_SPEC: An Appium Python test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_SPEC: An Appium Node.js test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_SPEC: An Appium Ruby test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_SPEC: An Appium Python test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_SPEC: An Appium Node.js test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_SPEC: An Appium Ruby test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_SPEC: An instrumentation test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_SPEC: An XCode UI test spec upload.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of upload.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID_APP: An Android upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS_APP: An iOS upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WEB_APP: A web appliction upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXTERNAL_DATA: An external data upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_TEST_PACKAGE: An Appium Python test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE_TEST_PACKAGE: An Appium Node.js test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY_TEST_PACKAGE: An Appium Ruby test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON_TEST_PACKAGE: An Appium Python test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE_TEST_PACKAGE: An Appium Node.js test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY_TEST_PACKAGE: An Appium Ruby test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_TEST_PACKAGE: A Calabash test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_TEST_PACKAGE: An instrumentation upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATION_TEST_PACKAGE: A uiautomation test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATOR_TEST_PACKAGE: A uiautomator test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_TEST_PACKAGE: An XCode test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI_TEST_PACKAGE: An XCode UI test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_TEST_SPEC: An Appium Python test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE_TEST_SPEC: An Appium Node.js test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY_TEST_SPEC: An Appium Ruby test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON_TEST_SPEC: An Appium Python test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE_TEST_SPEC: An Appium Node.js test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY_TEST_SPEC: An Appium Ruby test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_TEST_SPEC: An instrumentation test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI_TEST_SPEC: An XCode UI test spec upload.
     *        </p>
     *        </li>
     * @see UploadType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of upload.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID_APP: An Android upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS_APP: An iOS upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * WEB_APP: A web appliction upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * EXTERNAL_DATA: An external data upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_PACKAGE: An Appium Python test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_PACKAGE: An Appium Node.js test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_PACKAGE: An Appium Ruby test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_PACKAGE: An Appium Python test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_PACKAGE: An Appium Node.js test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_PACKAGE: An Appium Ruby test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_TEST_PACKAGE: A Calabash test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_PACKAGE: An instrumentation upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION_TEST_PACKAGE: A uiautomation test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR_TEST_PACKAGE: A uiautomator test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_TEST_PACKAGE: An XCode test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_PACKAGE: An XCode UI test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_SPEC: An Appium Python test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_SPEC: An Appium Node.js test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_SPEC: An Appium Ruby test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_SPEC: An Appium Python test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_SPEC: An Appium Node.js test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_SPEC: An Appium Ruby test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_SPEC: An instrumentation test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_SPEC: An XCode UI test spec upload.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of upload.</p>
     *         <p>
     *         Must be one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ANDROID_APP: An Android upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IOS_APP: An iOS upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         WEB_APP: A web appliction upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EXTERNAL_DATA: An external data upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_PYTHON_TEST_PACKAGE: An Appium Python test package upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_NODE_TEST_PACKAGE: An Appium Node.js test package upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_RUBY_TEST_PACKAGE: An Appium Ruby test package upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload for a web app.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload for a web app.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_PYTHON_TEST_PACKAGE: An Appium Python test package upload for a web app.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_NODE_TEST_PACKAGE: An Appium Node.js test package upload for a web app.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_RUBY_TEST_PACKAGE: An Appium Ruby test package upload for a web app.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CALABASH_TEST_PACKAGE: A Calabash test package upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTRUMENTATION_TEST_PACKAGE: An instrumentation upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UIAUTOMATION_TEST_PACKAGE: A uiautomation test package upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UIAUTOMATOR_TEST_PACKAGE: A uiautomator test package upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         XCTEST_TEST_PACKAGE: An XCode test package upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         XCTEST_UI_TEST_PACKAGE: An XCode UI test package upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_PYTHON_TEST_SPEC: An Appium Python test spec upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_NODE_TEST_SPEC: An Appium Node.js test spec upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_RUBY_TEST_SPEC: An Appium Ruby test spec upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload for a web app.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload for a web app.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_PYTHON_TEST_SPEC: An Appium Python test spec upload for a web app.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_NODE_TEST_SPEC: An Appium Node.js test spec upload for a web app.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_WEB_RUBY_TEST_SPEC: An Appium Ruby test spec upload for a web app.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTRUMENTATION_TEST_SPEC: An instrumentation test spec upload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         XCTEST_UI_TEST_SPEC: An XCode UI test spec upload.
     *         </p>
     *         </li>
     * @see UploadType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of upload.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID_APP: An Android upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS_APP: An iOS upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * WEB_APP: A web appliction upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * EXTERNAL_DATA: An external data upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_PACKAGE: An Appium Python test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_PACKAGE: An Appium Node.js test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_PACKAGE: An Appium Ruby test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_PACKAGE: An Appium Python test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_PACKAGE: An Appium Node.js test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_PACKAGE: An Appium Ruby test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_TEST_PACKAGE: A Calabash test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_PACKAGE: An instrumentation upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION_TEST_PACKAGE: A uiautomation test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR_TEST_PACKAGE: A uiautomator test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_TEST_PACKAGE: An XCode test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_PACKAGE: An XCode UI test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_SPEC: An Appium Python test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_SPEC: An Appium Node.js test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_SPEC: An Appium Ruby test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_SPEC: An Appium Python test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_SPEC: An Appium Node.js test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_SPEC: An Appium Ruby test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_SPEC: An instrumentation test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_SPEC: An XCode UI test spec upload.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of upload.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID_APP: An Android upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS_APP: An iOS upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WEB_APP: A web appliction upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXTERNAL_DATA: An external data upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_TEST_PACKAGE: An Appium Python test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE_TEST_PACKAGE: An Appium Node.js test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY_TEST_PACKAGE: An Appium Ruby test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON_TEST_PACKAGE: An Appium Python test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE_TEST_PACKAGE: An Appium Node.js test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY_TEST_PACKAGE: An Appium Ruby test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_TEST_PACKAGE: A Calabash test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_TEST_PACKAGE: An instrumentation upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATION_TEST_PACKAGE: A uiautomation test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATOR_TEST_PACKAGE: A uiautomator test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_TEST_PACKAGE: An XCode test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI_TEST_PACKAGE: An XCode UI test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_TEST_SPEC: An Appium Python test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE_TEST_SPEC: An Appium Node.js test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY_TEST_SPEC: An Appium Ruby test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON_TEST_SPEC: An Appium Python test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE_TEST_SPEC: An Appium Node.js test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY_TEST_SPEC: An Appium Ruby test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_TEST_SPEC: An instrumentation test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI_TEST_SPEC: An XCode UI test spec upload.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadType
     */

    public ListUploadsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of upload.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID_APP: An Android upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS_APP: An iOS upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * WEB_APP: A web appliction upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * EXTERNAL_DATA: An external data upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_PACKAGE: An Appium Python test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_PACKAGE: An Appium Node.js test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_PACKAGE: An Appium Ruby test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_PACKAGE: An Appium Python test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_PACKAGE: An Appium Node.js test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_PACKAGE: An Appium Ruby test package upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_TEST_PACKAGE: A Calabash test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_PACKAGE: An instrumentation upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATION_TEST_PACKAGE: A uiautomation test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * UIAUTOMATOR_TEST_PACKAGE: A uiautomator test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_TEST_PACKAGE: An XCode test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_PACKAGE: An XCode UI test package upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_TEST_SPEC: An Appium Python test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_NODE_TEST_SPEC: An Appium Node.js test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_RUBY_TEST_SPEC: An Appium Ruby test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_PYTHON_TEST_SPEC: An Appium Python test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_NODE_TEST_SPEC: An Appium Node.js test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_WEB_RUBY_TEST_SPEC: An Appium Ruby test spec upload for a web app.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_TEST_SPEC: An instrumentation test spec upload.
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_UI_TEST_SPEC: An XCode UI test spec upload.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of upload.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID_APP: An Android upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS_APP: An iOS upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WEB_APP: A web appliction upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXTERNAL_DATA: An external data upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_TEST_PACKAGE: An Appium Python test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE_TEST_PACKAGE: An Appium Node.js test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY_TEST_PACKAGE: An Appium Ruby test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON_TEST_PACKAGE: An Appium Python test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE_TEST_PACKAGE: An Appium Node.js test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY_TEST_PACKAGE: An Appium Ruby test package upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_TEST_PACKAGE: A Calabash test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_TEST_PACKAGE: An instrumentation upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATION_TEST_PACKAGE: A uiautomation test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UIAUTOMATOR_TEST_PACKAGE: A uiautomator test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_TEST_PACKAGE: An XCode test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI_TEST_PACKAGE: An XCode UI test package upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_TEST_SPEC: An Appium Python test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_NODE_TEST_SPEC: An Appium Node.js test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_RUBY_TEST_SPEC: An Appium Ruby test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_PYTHON_TEST_SPEC: An Appium Python test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_NODE_TEST_SPEC: An Appium Node.js test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_WEB_RUBY_TEST_SPEC: An Appium Ruby test spec upload for a web app.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_TEST_SPEC: An instrumentation test spec upload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_UI_TEST_SPEC: An XCode UI test spec upload.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadType
     */

    public ListUploadsRequest withType(UploadType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUploadsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUploadsRequest == false)
            return false;
        ListUploadsRequest other = (ListUploadsRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUploadsRequest clone() {
        return (ListUploadsRequest) super.clone();
    }

}
