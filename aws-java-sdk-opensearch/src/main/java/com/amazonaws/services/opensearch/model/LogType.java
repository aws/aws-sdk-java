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
package com.amazonaws.services.opensearch.model;

import javax.annotation.Generated;

/**
 * <p>
 * The type of log file. Can be one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>INDEX_SLOW_LOGS</b> - Index slow logs contain insert requests that took more time than the configured index query
 * log threshold to execute.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>SEARCH_SLOW_LOGS</b> - Search slow logs contain search queries that took more time than the configured search
 * query log threshold to execute.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>ES_APPLICATION_LOGS</b> - OpenSearch application logs contain information about errors and warnings raised during
 * the operation of the service and can be useful for troubleshooting.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AUDIT_LOGS</b> - Audit logs contain records of user requests for access to the domain.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LogType {

    INDEX_SLOW_LOGS("INDEX_SLOW_LOGS"),
    SEARCH_SLOW_LOGS("SEARCH_SLOW_LOGS"),
    ES_APPLICATION_LOGS("ES_APPLICATION_LOGS"),
    AUDIT_LOGS("AUDIT_LOGS");

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
