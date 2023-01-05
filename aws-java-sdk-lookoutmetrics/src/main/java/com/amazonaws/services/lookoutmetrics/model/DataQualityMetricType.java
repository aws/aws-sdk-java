/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutmetrics.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DataQualityMetricType {

    COLUMN_COMPLETENESS("COLUMN_COMPLETENESS"),
    DIMENSION_UNIQUENESS("DIMENSION_UNIQUENESS"),
    TIME_SERIES_COUNT("TIME_SERIES_COUNT"),
    ROWS_PROCESSED("ROWS_PROCESSED"),
    ROWS_PARTIAL_COMPLIANCE("ROWS_PARTIAL_COMPLIANCE"),
    INVALID_ROWS_COMPLIANCE("INVALID_ROWS_COMPLIANCE"),
    BACKTEST_TRAINING_DATA_START_TIME_STAMP("BACKTEST_TRAINING_DATA_START_TIME_STAMP"),
    BACKTEST_TRAINING_DATA_END_TIME_STAMP("BACKTEST_TRAINING_DATA_END_TIME_STAMP"),
    BACKTEST_INFERENCE_DATA_START_TIME_STAMP("BACKTEST_INFERENCE_DATA_START_TIME_STAMP"),
    BACKTEST_INFERENCE_DATA_END_TIME_STAMP("BACKTEST_INFERENCE_DATA_END_TIME_STAMP");

    private String value;

    private DataQualityMetricType(String value) {
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
     * @return DataQualityMetricType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DataQualityMetricType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DataQualityMetricType enumEntry : DataQualityMetricType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
