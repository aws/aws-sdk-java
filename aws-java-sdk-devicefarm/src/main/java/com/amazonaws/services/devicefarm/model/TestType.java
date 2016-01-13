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
public enum TestType {

    BUILTIN_FUZZ("BUILTIN_FUZZ"),
    BUILTIN_EXPLORER("BUILTIN_EXPLORER"),
    APPIUM_JAVA_JUNIT("APPIUM_JAVA_JUNIT"),
    APPIUM_JAVA_TESTNG("APPIUM_JAVA_TESTNG"),
    APPIUM_WEB_JAVA_JUNIT("APPIUM_WEB_JAVA_JUNIT"),
    APPIUM_WEB_JAVA_TESTNG("APPIUM_WEB_JAVA_TESTNG"),
    CALABASH("CALABASH"),
    INSTRUMENTATION("INSTRUMENTATION"),
    UIAUTOMATION("UIAUTOMATION"),
    UIAUTOMATOR("UIAUTOMATOR"),
    XCTEST("XCTEST");

    private String value;

    private TestType(String value) {
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
     * @return TestType corresponding to the value
     */
    public static TestType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("BUILTIN_FUZZ".equals(value)) {
            return BUILTIN_FUZZ;
        } else if ("BUILTIN_EXPLORER".equals(value)) {
            return BUILTIN_EXPLORER;
        } else if ("APPIUM_JAVA_JUNIT".equals(value)) {
            return APPIUM_JAVA_JUNIT;
        } else if ("APPIUM_JAVA_TESTNG".equals(value)) {
            return APPIUM_JAVA_TESTNG;
        } else if ("APPIUM_WEB_JAVA_JUNIT".equals(value)) {
            return APPIUM_WEB_JAVA_JUNIT;
        } else if ("APPIUM_WEB_JAVA_TESTNG".equals(value)) {
            return APPIUM_WEB_JAVA_TESTNG;
        } else if ("CALABASH".equals(value)) {
            return CALABASH;
        } else if ("INSTRUMENTATION".equals(value)) {
            return INSTRUMENTATION;
        } else if ("UIAUTOMATION".equals(value)) {
            return UIAUTOMATION;
        } else if ("UIAUTOMATOR".equals(value)) {
            return UIAUTOMATOR;
        } else if ("XCTEST".equals(value)) {
            return XCTEST;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}