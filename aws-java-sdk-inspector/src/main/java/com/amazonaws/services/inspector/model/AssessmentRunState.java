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
public enum AssessmentRunState {

    CREATED("CREATED"),
    START_DATA_COLLECTION_PENDING("START_DATA_COLLECTION_PENDING"),
    START_DATA_COLLECTION_IN_PROGRESS("START_DATA_COLLECTION_IN_PROGRESS"),
    COLLECTING_DATA("COLLECTING_DATA"),
    STOP_DATA_COLLECTION_PENDING("STOP_DATA_COLLECTION_PENDING"),
    DATA_COLLECTED("DATA_COLLECTED"),
    EVALUATING_RULES("EVALUATING_RULES"),
    FAILED("FAILED"),
    COMPLETED("COMPLETED"),
    COMPLETED_WITH_ERRORS("COMPLETED_WITH_ERRORS");

    private String value;

    private AssessmentRunState(String value) {
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
     * @return AssessmentRunState corresponding to the value
     */
    public static AssessmentRunState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("CREATED".equals(value)) {
            return CREATED;
        } else if ("START_DATA_COLLECTION_PENDING".equals(value)) {
            return START_DATA_COLLECTION_PENDING;
        } else if ("START_DATA_COLLECTION_IN_PROGRESS".equals(value)) {
            return START_DATA_COLLECTION_IN_PROGRESS;
        } else if ("COLLECTING_DATA".equals(value)) {
            return COLLECTING_DATA;
        } else if ("STOP_DATA_COLLECTION_PENDING".equals(value)) {
            return STOP_DATA_COLLECTION_PENDING;
        } else if ("DATA_COLLECTED".equals(value)) {
            return DATA_COLLECTED;
        } else if ("EVALUATING_RULES".equals(value)) {
            return EVALUATING_RULES;
        } else if ("FAILED".equals(value)) {
            return FAILED;
        } else if ("COMPLETED".equals(value)) {
            return COMPLETED;
        } else if ("COMPLETED_WITH_ERRORS".equals(value)) {
            return COMPLETED_WITH_ERRORS;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}