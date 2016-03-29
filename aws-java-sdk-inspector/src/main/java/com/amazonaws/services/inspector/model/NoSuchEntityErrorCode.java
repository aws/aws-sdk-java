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

package com.amazonaws.services.inspector.model;

/**
 * 
 */
public enum NoSuchEntityErrorCode {

    ASSESSMENT_TARGET_DOES_NOT_EXIST("ASSESSMENT_TARGET_DOES_NOT_EXIST"),
    ASSESSMENT_TEMPLATE_DOES_NOT_EXIST("ASSESSMENT_TEMPLATE_DOES_NOT_EXIST"),
    ASSESSMENT_RUN_DOES_NOT_EXIST("ASSESSMENT_RUN_DOES_NOT_EXIST"),
    FINDING_DOES_NOT_EXIST("FINDING_DOES_NOT_EXIST"),
    RESOURCE_GROUP_DOES_NOT_EXIST("RESOURCE_GROUP_DOES_NOT_EXIST"),
    RULES_PACKAGE_DOES_NOT_EXIST("RULES_PACKAGE_DOES_NOT_EXIST"),
    SNS_TOPIC_DOES_NOT_EXIST("SNS_TOPIC_DOES_NOT_EXIST"),
    IAM_ROLE_DOES_NOT_EXIST("IAM_ROLE_DOES_NOT_EXIST");

    private String value;

    private NoSuchEntityErrorCode(String value) {
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
     * @return NoSuchEntityErrorCode corresponding to the value
     */
    public static NoSuchEntityErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("ASSESSMENT_TARGET_DOES_NOT_EXIST".equals(value)) {
            return ASSESSMENT_TARGET_DOES_NOT_EXIST;
        } else if ("ASSESSMENT_TEMPLATE_DOES_NOT_EXIST".equals(value)) {
            return ASSESSMENT_TEMPLATE_DOES_NOT_EXIST;
        } else if ("ASSESSMENT_RUN_DOES_NOT_EXIST".equals(value)) {
            return ASSESSMENT_RUN_DOES_NOT_EXIST;
        } else if ("FINDING_DOES_NOT_EXIST".equals(value)) {
            return FINDING_DOES_NOT_EXIST;
        } else if ("RESOURCE_GROUP_DOES_NOT_EXIST".equals(value)) {
            return RESOURCE_GROUP_DOES_NOT_EXIST;
        } else if ("RULES_PACKAGE_DOES_NOT_EXIST".equals(value)) {
            return RULES_PACKAGE_DOES_NOT_EXIST;
        } else if ("SNS_TOPIC_DOES_NOT_EXIST".equals(value)) {
            return SNS_TOPIC_DOES_NOT_EXIST;
        } else if ("IAM_ROLE_DOES_NOT_EXIST".equals(value)) {
            return IAM_ROLE_DOES_NOT_EXIST;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}