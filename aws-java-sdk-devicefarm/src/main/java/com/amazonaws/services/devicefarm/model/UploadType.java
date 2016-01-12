/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.devicefarm.model;

/**
 * 
 */
public enum UploadType {

    ANDROID_APP("ANDROID_APP"),
    IOS_APP("IOS_APP"),
    WEB_APP("WEB_APP"),
    EXTERNAL_DATA("EXTERNAL_DATA"),
    APPIUM_JAVA_JUNIT_TEST_PACKAGE("APPIUM_JAVA_JUNIT_TEST_PACKAGE"),
    APPIUM_JAVA_TESTNG_TEST_PACKAGE("APPIUM_JAVA_TESTNG_TEST_PACKAGE"),
    APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE("APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE"),
    APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE("APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE"),
    CALABASH_TEST_PACKAGE("CALABASH_TEST_PACKAGE"),
    INSTRUMENTATION_TEST_PACKAGE("INSTRUMENTATION_TEST_PACKAGE"),
    UIAUTOMATION_TEST_PACKAGE("UIAUTOMATION_TEST_PACKAGE"),
    UIAUTOMATOR_TEST_PACKAGE("UIAUTOMATOR_TEST_PACKAGE"),
    XCTEST_TEST_PACKAGE("XCTEST_TEST_PACKAGE");

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
     */
    public static UploadType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("ANDROID_APP".equals(value)) {
            return ANDROID_APP;
        } else if ("IOS_APP".equals(value)) {
            return IOS_APP;
        } else if ("WEB_APP".equals(value)) {
            return WEB_APP;
        } else if ("EXTERNAL_DATA".equals(value)) {
            return EXTERNAL_DATA;
        } else if ("APPIUM_JAVA_JUNIT_TEST_PACKAGE".equals(value)) {
            return APPIUM_JAVA_JUNIT_TEST_PACKAGE;
        } else if ("APPIUM_JAVA_TESTNG_TEST_PACKAGE".equals(value)) {
            return APPIUM_JAVA_TESTNG_TEST_PACKAGE;
        } else if ("APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE".equals(value)) {
            return APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE;
        } else if ("APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE".equals(value)) {
            return APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE;
        } else if ("CALABASH_TEST_PACKAGE".equals(value)) {
            return CALABASH_TEST_PACKAGE;
        } else if ("INSTRUMENTATION_TEST_PACKAGE".equals(value)) {
            return INSTRUMENTATION_TEST_PACKAGE;
        } else if ("UIAUTOMATION_TEST_PACKAGE".equals(value)) {
            return UIAUTOMATION_TEST_PACKAGE;
        } else if ("UIAUTOMATOR_TEST_PACKAGE".equals(value)) {
            return UIAUTOMATOR_TEST_PACKAGE;
        } else if ("XCTEST_TEST_PACKAGE".equals(value)) {
            return XCTEST_TEST_PACKAGE;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}