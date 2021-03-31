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
package com.amazonaws.services.machinelearning.model;

import javax.annotation.Generated;

/**
 * <p>
 * A list of the variables to use in searching or filtering <code>Evaluation</code>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreatedAt</code> - Sets the search criteria to <code>Evaluation</code> creation date.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Status</code> - Sets the search criteria to <code>Evaluation</code> status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> <b> </b> <code>Name</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>IAMUser</code> - Sets the search criteria to the user account that invoked an evaluation.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>MLModelId</code> - Sets the search criteria to the <code>Predictor</code> that was evaluated.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in evaluation.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DataUri</code> - Sets the search criteria to the data file(s) used in evaluation. The URL can identify either a
 * file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum EvaluationFilterVariable {

    CreatedAt("CreatedAt"),
    LastUpdatedAt("LastUpdatedAt"),
    Status("Status"),
    Name("Name"),
    IAMUser("IAMUser"),
    MLModelId("MLModelId"),
    DataSourceId("DataSourceId"),
    DataURI("DataURI");

    private String value;

    private EvaluationFilterVariable(String value) {
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
     * @return EvaluationFilterVariable corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static EvaluationFilterVariable fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (EvaluationFilterVariable enumEntry : EvaluationFilterVariable.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
