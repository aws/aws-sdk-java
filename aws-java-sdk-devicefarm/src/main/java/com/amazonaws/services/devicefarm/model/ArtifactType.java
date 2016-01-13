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
public enum ArtifactType {

    UNKNOWN("UNKNOWN"),
    SCREENSHOT("SCREENSHOT"),
    DEVICE_LOG("DEVICE_LOG"),
    MESSAGE_LOG("MESSAGE_LOG"),
    RESULT_LOG("RESULT_LOG"),
    SERVICE_LOG("SERVICE_LOG"),
    WEBKIT_LOG("WEBKIT_LOG"),
    INSTRUMENTATION_OUTPUT("INSTRUMENTATION_OUTPUT"),
    EXERCISER_MONKEY_OUTPUT("EXERCISER_MONKEY_OUTPUT"),
    CALABASH_JSON_OUTPUT("CALABASH_JSON_OUTPUT"),
    CALABASH_PRETTY_OUTPUT("CALABASH_PRETTY_OUTPUT"),
    CALABASH_STANDARD_OUTPUT("CALABASH_STANDARD_OUTPUT"),
    CALABASH_JAVA_XML_OUTPUT("CALABASH_JAVA_XML_OUTPUT"),
    AUTOMATION_OUTPUT("AUTOMATION_OUTPUT"),
    APPIUM_SERVER_OUTPUT("APPIUM_SERVER_OUTPUT"),
    APPIUM_JAVA_OUTPUT("APPIUM_JAVA_OUTPUT"),
    APPIUM_JAVA_XML_OUTPUT("APPIUM_JAVA_XML_OUTPUT"),
    EXPLORER_EVENT_LOG("EXPLORER_EVENT_LOG"),
    EXPLORER_SUMMARY_LOG("EXPLORER_SUMMARY_LOG"),
    APPLICATION_CRASH_REPORT("APPLICATION_CRASH_REPORT");

    private String value;

    private ArtifactType(String value) {
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
     * @return ArtifactType corresponding to the value
     */
    public static ArtifactType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("UNKNOWN".equals(value)) {
            return UNKNOWN;
        } else if ("SCREENSHOT".equals(value)) {
            return SCREENSHOT;
        } else if ("DEVICE_LOG".equals(value)) {
            return DEVICE_LOG;
        } else if ("MESSAGE_LOG".equals(value)) {
            return MESSAGE_LOG;
        } else if ("RESULT_LOG".equals(value)) {
            return RESULT_LOG;
        } else if ("SERVICE_LOG".equals(value)) {
            return SERVICE_LOG;
        } else if ("WEBKIT_LOG".equals(value)) {
            return WEBKIT_LOG;
        } else if ("INSTRUMENTATION_OUTPUT".equals(value)) {
            return INSTRUMENTATION_OUTPUT;
        } else if ("EXERCISER_MONKEY_OUTPUT".equals(value)) {
            return EXERCISER_MONKEY_OUTPUT;
        } else if ("CALABASH_JSON_OUTPUT".equals(value)) {
            return CALABASH_JSON_OUTPUT;
        } else if ("CALABASH_PRETTY_OUTPUT".equals(value)) {
            return CALABASH_PRETTY_OUTPUT;
        } else if ("CALABASH_STANDARD_OUTPUT".equals(value)) {
            return CALABASH_STANDARD_OUTPUT;
        } else if ("CALABASH_JAVA_XML_OUTPUT".equals(value)) {
            return CALABASH_JAVA_XML_OUTPUT;
        } else if ("AUTOMATION_OUTPUT".equals(value)) {
            return AUTOMATION_OUTPUT;
        } else if ("APPIUM_SERVER_OUTPUT".equals(value)) {
            return APPIUM_SERVER_OUTPUT;
        } else if ("APPIUM_JAVA_OUTPUT".equals(value)) {
            return APPIUM_JAVA_OUTPUT;
        } else if ("APPIUM_JAVA_XML_OUTPUT".equals(value)) {
            return APPIUM_JAVA_XML_OUTPUT;
        } else if ("EXPLORER_EVENT_LOG".equals(value)) {
            return EXPLORER_EVENT_LOG;
        } else if ("EXPLORER_SUMMARY_LOG".equals(value)) {
            return EXPLORER_SUMMARY_LOG;
        } else if ("APPLICATION_CRASH_REPORT".equals(value)) {
            return APPLICATION_CRASH_REPORT;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}