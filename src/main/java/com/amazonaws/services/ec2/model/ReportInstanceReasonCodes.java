/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

/**
 * Report Instance Reason Codes
 */
public enum ReportInstanceReasonCodes {
    
    InstanceStuckInState("instance-stuck-in-state"),
    Unresponsive("unresponsive"),
    NotAcceptingCredentials("not-accepting-credentials"),
    PasswordNotAvailable("password-not-available"),
    PerformanceNetwork("performance-network"),
    PerformanceInstanceStore("performance-instance-store"),
    PerformanceEbsVolume("performance-ebs-volume"),
    PerformanceOther("performance-other"),
    Other("other");

    private String value;

    private ReportInstanceReasonCodes(String value) {
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
     *            real value
     * @return ReportInstanceReasonCodes corresponding to the value
     */
    public static ReportInstanceReasonCodes fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("instance-stuck-in-state".equals(value)) {
            return ReportInstanceReasonCodes.InstanceStuckInState;
        } else if ("unresponsive".equals(value)) {
            return ReportInstanceReasonCodes.Unresponsive;
        } else if ("not-accepting-credentials".equals(value)) {
            return ReportInstanceReasonCodes.NotAcceptingCredentials;
        } else if ("password-not-available".equals(value)) {
            return ReportInstanceReasonCodes.PasswordNotAvailable;
        } else if ("performance-network".equals(value)) {
            return ReportInstanceReasonCodes.PerformanceNetwork;
        } else if ("performance-instance-store".equals(value)) {
            return ReportInstanceReasonCodes.PerformanceInstanceStore;
        } else if ("performance-ebs-volume".equals(value)) {
            return ReportInstanceReasonCodes.PerformanceEbsVolume;
        } else if ("performance-other".equals(value)) {
            return ReportInstanceReasonCodes.PerformanceOther;
        } else if ("other".equals(value)) {
            return ReportInstanceReasonCodes.Other;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    