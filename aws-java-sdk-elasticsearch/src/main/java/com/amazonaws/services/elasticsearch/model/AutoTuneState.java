/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies the Auto-Tune state for the Elasticsearch domain. For valid states see the <a
 * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
 * target="_blank">Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AutoTuneState {

    ENABLED("ENABLED"),
    DISABLED("DISABLED"),
    ENABLE_IN_PROGRESS("ENABLE_IN_PROGRESS"),
    DISABLE_IN_PROGRESS("DISABLE_IN_PROGRESS"),
    DISABLED_AND_ROLLBACK_SCHEDULED("DISABLED_AND_ROLLBACK_SCHEDULED"),
    DISABLED_AND_ROLLBACK_IN_PROGRESS("DISABLED_AND_ROLLBACK_IN_PROGRESS"),
    DISABLED_AND_ROLLBACK_COMPLETE("DISABLED_AND_ROLLBACK_COMPLETE"),
    DISABLED_AND_ROLLBACK_ERROR("DISABLED_AND_ROLLBACK_ERROR"),
    ERROR("ERROR");

    private String value;

    private AutoTuneState(String value) {
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
     * @return AutoTuneState corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AutoTuneState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AutoTuneState enumEntry : AutoTuneState.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
