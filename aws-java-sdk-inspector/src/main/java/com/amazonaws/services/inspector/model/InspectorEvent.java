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
public enum InspectorEvent {

    ASSESSMENT_RUN_STARTED("ASSESSMENT_RUN_STARTED"),
    ASSESSMENT_RUN_COMPLETED("ASSESSMENT_RUN_COMPLETED"),
    ASSESSMENT_RUN_STATE_CHANGED("ASSESSMENT_RUN_STATE_CHANGED"),
    FINDING_REPORTED("FINDING_REPORTED"),
    OTHER("OTHER");

    private String value;

    private InspectorEvent(String value) {
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
     * @return InspectorEvent corresponding to the value
     */
    public static InspectorEvent fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("ASSESSMENT_RUN_STARTED".equals(value)) {
            return ASSESSMENT_RUN_STARTED;
        } else if ("ASSESSMENT_RUN_COMPLETED".equals(value)) {
            return ASSESSMENT_RUN_COMPLETED;
        } else if ("ASSESSMENT_RUN_STATE_CHANGED".equals(value)) {
            return ASSESSMENT_RUN_STATE_CHANGED;
        } else if ("FINDING_REPORTED".equals(value)) {
            return FINDING_REPORTED;
        } else if ("OTHER".equals(value)) {
            return OTHER;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}