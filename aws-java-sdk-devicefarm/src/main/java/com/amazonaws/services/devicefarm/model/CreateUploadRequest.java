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
 * Represents a request to the create upload operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateUpload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUploadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the project for the upload.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * The upload's file name. The name should not contain the '/' character. If uploading an iOS app, the file name
     * needs to end with the <code>.ipa</code> extension. If uploading an Android app, the file name needs to end with
     * the <code>.apk</code> extension. For all others, the file name must end with the <code>.zip</code> file
     * extension.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The upload's upload type.
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
     * WEB_APP: A web application upload.
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
     * <p>
     * <b>Note</b> If you call <code>CreateUpload</code> with <code>WEB_APP</code> specified, AWS Device Farm throws an
     * <code>ArgumentException</code> error.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The upload's content type (for example, "application/octet-stream").
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The ARN of the project for the upload.
     * </p>
     * 
     * @param projectArn
     *        The ARN of the project for the upload.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The ARN of the project for the upload.
     * </p>
     * 
     * @return The ARN of the project for the upload.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The ARN of the project for the upload.
     * </p>
     * 
     * @param projectArn
     *        The ARN of the project for the upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUploadRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * The upload's file name. The name should not contain the '/' character. If uploading an iOS app, the file name
     * needs to end with the <code>.ipa</code> extension. If uploading an Android app, the file name needs to end with
     * the <code>.apk</code> extension. For all others, the file name must end with the <code>.zip</code> file
     * extension.
     * </p>
     * 
     * @param name
     *        The upload's file name. The name should not contain the '/' character. If uploading an iOS app, the file
     *        name needs to end with the <code>.ipa</code> extension. If uploading an Android app, the file name needs
     *        to end with the <code>.apk</code> extension. For all others, the file name must end with the
     *        <code>.zip</code> file extension.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The upload's file name. The name should not contain the '/' character. If uploading an iOS app, the file name
     * needs to end with the <code>.ipa</code> extension. If uploading an Android app, the file name needs to end with
     * the <code>.apk</code> extension. For all others, the file name must end with the <code>.zip</code> file
     * extension.
     * </p>
     * 
     * @return The upload's file name. The name should not contain the '/' character. If uploading an iOS app, the file
     *         name needs to end with the <code>.ipa</code> extension. If uploading an Android app, the file name needs
     *         to end with the <code>.apk</code> extension. For all others, the file name must end with the
     *         <code>.zip</code> file extension.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The upload's file name. The name should not contain the '/' character. If uploading an iOS app, the file name
     * needs to end with the <code>.ipa</code> extension. If uploading an Android app, the file name needs to end with
     * the <code>.apk</code> extension. For all others, the file name must end with the <code>.zip</code> file
     * extension.
     * </p>
     * 
     * @param name
     *        The upload's file name. The name should not contain the '/' character. If uploading an iOS app, the file
     *        name needs to end with the <code>.ipa</code> extension. If uploading an Android app, the file name needs
     *        to end with the <code>.apk</code> extension. For all others, the file name must end with the
     *        <code>.zip</code> file extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUploadRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The upload's upload type.
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
     * WEB_APP: A web application upload.
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
     * <p>
     * <b>Note</b> If you call <code>CreateUpload</code> with <code>WEB_APP</code> specified, AWS Device Farm throws an
     * <code>ArgumentException</code> error.
     * </p>
     * 
     * @param type
     *        The upload's upload type.</p>
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
     *        WEB_APP: A web application upload.
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
     *        </ul>
     *        <p>
     *        <b>Note</b> If you call <code>CreateUpload</code> with <code>WEB_APP</code> specified, AWS Device Farm
     *        throws an <code>ArgumentException</code> error.
     * @see UploadType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The upload's upload type.
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
     * WEB_APP: A web application upload.
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
     * <p>
     * <b>Note</b> If you call <code>CreateUpload</code> with <code>WEB_APP</code> specified, AWS Device Farm throws an
     * <code>ArgumentException</code> error.
     * </p>
     * 
     * @return The upload's upload type.</p>
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
     *         WEB_APP: A web application upload.
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
     *         </ul>
     *         <p>
     *         <b>Note</b> If you call <code>CreateUpload</code> with <code>WEB_APP</code> specified, AWS Device Farm
     *         throws an <code>ArgumentException</code> error.
     * @see UploadType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The upload's upload type.
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
     * WEB_APP: A web application upload.
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
     * <p>
     * <b>Note</b> If you call <code>CreateUpload</code> with <code>WEB_APP</code> specified, AWS Device Farm throws an
     * <code>ArgumentException</code> error.
     * </p>
     * 
     * @param type
     *        The upload's upload type.</p>
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
     *        WEB_APP: A web application upload.
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
     *        </ul>
     *        <p>
     *        <b>Note</b> If you call <code>CreateUpload</code> with <code>WEB_APP</code> specified, AWS Device Farm
     *        throws an <code>ArgumentException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadType
     */

    public CreateUploadRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The upload's upload type.
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
     * WEB_APP: A web application upload.
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
     * <p>
     * <b>Note</b> If you call <code>CreateUpload</code> with <code>WEB_APP</code> specified, AWS Device Farm throws an
     * <code>ArgumentException</code> error.
     * </p>
     * 
     * @param type
     *        The upload's upload type.</p>
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
     *        WEB_APP: A web application upload.
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
     *        </ul>
     *        <p>
     *        <b>Note</b> If you call <code>CreateUpload</code> with <code>WEB_APP</code> specified, AWS Device Farm
     *        throws an <code>ArgumentException</code> error.
     * @see UploadType
     */

    public void setType(UploadType type) {
        withType(type);
    }

    /**
     * <p>
     * The upload's upload type.
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
     * WEB_APP: A web application upload.
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
     * <p>
     * <b>Note</b> If you call <code>CreateUpload</code> with <code>WEB_APP</code> specified, AWS Device Farm throws an
     * <code>ArgumentException</code> error.
     * </p>
     * 
     * @param type
     *        The upload's upload type.</p>
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
     *        WEB_APP: A web application upload.
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
     *        </ul>
     *        <p>
     *        <b>Note</b> If you call <code>CreateUpload</code> with <code>WEB_APP</code> specified, AWS Device Farm
     *        throws an <code>ArgumentException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadType
     */

    public CreateUploadRequest withType(UploadType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The upload's content type (for example, "application/octet-stream").
     * </p>
     * 
     * @param contentType
     *        The upload's content type (for example, "application/octet-stream").
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The upload's content type (for example, "application/octet-stream").
     * </p>
     * 
     * @return The upload's content type (for example, "application/octet-stream").
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The upload's content type (for example, "application/octet-stream").
     * </p>
     * 
     * @param contentType
     *        The upload's content type (for example, "application/octet-stream").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUploadRequest withContentType(String contentType) {
        setContentType(contentType);
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUploadRequest == false)
            return false;
        CreateUploadRequest other = (CreateUploadRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public CreateUploadRequest clone() {
        return (CreateUploadRequest) super.clone();
    }

}
