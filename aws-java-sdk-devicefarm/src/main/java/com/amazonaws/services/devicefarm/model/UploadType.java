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

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum UploadType {

    ANDROID_APP("ANDROID_APP"),
    IOS_APP("IOS_APP"),
    WEB_APP("WEB_APP"),
    EXTERNAL_DATA("EXTERNAL_DATA"),
    APPIUM_JAVA_JUNIT_TEST_PACKAGE("APPIUM_JAVA_JUNIT_TEST_PACKAGE"),
    APPIUM_JAVA_TESTNG_TEST_PACKAGE("APPIUM_JAVA_TESTNG_TEST_PACKAGE"),
    APPIUM_PYTHON_TEST_PACKAGE("APPIUM_PYTHON_TEST_PACKAGE"),
    APPIUM_NODE_TEST_PACKAGE("APPIUM_NODE_TEST_PACKAGE"),
    APPIUM_RUBY_TEST_PACKAGE("APPIUM_RUBY_TEST_PACKAGE"),
    APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE("APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE"),
    APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE("APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE"),
    APPIUM_WEB_PYTHON_TEST_PACKAGE("APPIUM_WEB_PYTHON_TEST_PACKAGE"),
    APPIUM_WEB_NODE_TEST_PACKAGE("APPIUM_WEB_NODE_TEST_PACKAGE"),
    APPIUM_WEB_RUBY_TEST_PACKAGE("APPIUM_WEB_RUBY_TEST_PACKAGE"),
    CALABASH_TEST_PACKAGE("CALABASH_TEST_PACKAGE"),
    INSTRUMENTATION_TEST_PACKAGE("INSTRUMENTATION_TEST_PACKAGE"),
    UIAUTOMATION_TEST_PACKAGE("UIAUTOMATION_TEST_PACKAGE"),
    UIAUTOMATOR_TEST_PACKAGE("UIAUTOMATOR_TEST_PACKAGE"),
    XCTEST_TEST_PACKAGE("XCTEST_TEST_PACKAGE"),
    XCTEST_UI_TEST_PACKAGE("XCTEST_UI_TEST_PACKAGE"),
    APPIUM_JAVA_JUNIT_TEST_SPEC("APPIUM_JAVA_JUNIT_TEST_SPEC"),
    APPIUM_JAVA_TESTNG_TEST_SPEC("APPIUM_JAVA_TESTNG_TEST_SPEC"),
    APPIUM_PYTHON_TEST_SPEC("APPIUM_PYTHON_TEST_SPEC"),
    APPIUM_NODE_TEST_SPEC("APPIUM_NODE_TEST_SPEC"),
    APPIUM_RUBY_TEST_SPEC("APPIUM_RUBY_TEST_SPEC"),
    APPIUM_WEB_JAVA_JUNIT_TEST_SPEC("APPIUM_WEB_JAVA_JUNIT_TEST_SPEC"),
    APPIUM_WEB_JAVA_TESTNG_TEST_SPEC("APPIUM_WEB_JAVA_TESTNG_TEST_SPEC"),
    APPIUM_WEB_PYTHON_TEST_SPEC("APPIUM_WEB_PYTHON_TEST_SPEC"),
    APPIUM_WEB_NODE_TEST_SPEC("APPIUM_WEB_NODE_TEST_SPEC"),
    APPIUM_WEB_RUBY_TEST_SPEC("APPIUM_WEB_RUBY_TEST_SPEC"),
    INSTRUMENTATION_TEST_SPEC("INSTRUMENTATION_TEST_SPEC"),
    XCTEST_UI_TEST_SPEC("XCTEST_UI_TEST_SPEC");

    private String value;

    private UploadType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return UploadType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static UploadType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (UploadType enumEntry : UploadType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
