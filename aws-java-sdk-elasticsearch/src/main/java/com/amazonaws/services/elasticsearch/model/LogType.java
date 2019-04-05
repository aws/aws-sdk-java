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
package com.amazonaws.services.elasticsearch.model;

import javax.annotation.Generated;

/**
 * <p>
 * Type of Log File, it can be one of the following:
 * <ul>
 * <li>INDEX_SLOW_LOGS: Index slow logs contain insert requests that took more time than configured index query log
 * threshold to execute.</li>
 * <li>SEARCH_SLOW_LOGS: Search slow logs contain search queries that took more time than configured search query log
 * threshold to execute.</li>
 * <li>ES_APPLICATION_LOGS: Elasticsearch application logs contain information about errors and warnings raised during
 * the operation of the service and can be useful for troubleshooting.</li>
 * </ul>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LogType {

    INDEX_SLOW_LOGS("INDEX_SLOW_LOGS"),
    SEARCH_SLOW_LOGS("SEARCH_SLOW_LOGS"),
    ES_APPLICATION_LOGS("ES_APPLICATION_LOGS");

    private String value;

    private LogType(String value) {
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
     * @return LogType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static LogType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (LogType enumEntry : LogType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
