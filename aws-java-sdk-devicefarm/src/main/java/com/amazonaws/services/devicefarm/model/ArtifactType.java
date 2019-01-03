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
public enum ArtifactType {

    UNKNOWN("UNKNOWN"),
    SCREENSHOT("SCREENSHOT"),
    DEVICE_LOG("DEVICE_LOG"),
    MESSAGE_LOG("MESSAGE_LOG"),
    VIDEO_LOG("VIDEO_LOG"),
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
    APPIUM_PYTHON_OUTPUT("APPIUM_PYTHON_OUTPUT"),
    APPIUM_PYTHON_XML_OUTPUT("APPIUM_PYTHON_XML_OUTPUT"),
    EXPLORER_EVENT_LOG("EXPLORER_EVENT_LOG"),
    EXPLORER_SUMMARY_LOG("EXPLORER_SUMMARY_LOG"),
    APPLICATION_CRASH_REPORT("APPLICATION_CRASH_REPORT"),
    XCTEST_LOG("XCTEST_LOG"),
    VIDEO("VIDEO"),
    CUSTOMER_ARTIFACT("CUSTOMER_ARTIFACT"),
    CUSTOMER_ARTIFACT_LOG("CUSTOMER_ARTIFACT_LOG"),
    TESTSPEC_OUTPUT("TESTSPEC_OUTPUT");

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
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ArtifactType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ArtifactType enumEntry : ArtifactType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
