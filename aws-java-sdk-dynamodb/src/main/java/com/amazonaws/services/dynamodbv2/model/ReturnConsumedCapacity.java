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
package com.amazonaws.services.dynamodbv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * Determines the level of detail about provisioned throughput consumption that is returned in the response:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>INDEXES</code> - The response includes the aggregate <code>ConsumedCapacity</code> for the operation, together
 * with <code>ConsumedCapacity</code> for each table and secondary index that was accessed.
 * </p>
 * <p>
 * Note that some operations, such as <code>GetItem</code> and <code>BatchGetItem</code>, do not access any indexes at
 * all. In these cases, specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code> information for
 * table(s).
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TOTAL</code> - The response includes only the aggregate <code>ConsumedCapacity</code> for the operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the response.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ReturnConsumedCapacity {

    INDEXES("INDEXES"),
    TOTAL("TOTAL"),
    NONE("NONE");

    private String value;

    private ReturnConsumedCapacity(String value) {
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
     * @return ReturnConsumedCapacity corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ReturnConsumedCapacity fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ReturnConsumedCapacity enumEntry : ReturnConsumedCapacity.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
