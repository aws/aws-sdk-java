/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Determines the level of detail about provisioned throughput consumption that is returned in the response:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>INDEXES</i> - The response includes the aggregate <i>ConsumedCapacity</i> for the operation, together with
 * <i>ConsumedCapacity</i> for each table and secondary index that was accessed.
 * </p>
 * <p>
 * Note that some operations, such as <i>GetItem</i> and <i>BatchGetItem</i>, do not access any indexes at all. In these
 * cases, specifying <i>INDEXES</i> will only return <i>ConsumedCapacity</i> information for table(s).
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>TOTAL</i> - The response includes only the aggregate <i>ConsumedCapacity</i> for the operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>NONE</i> - No <i>ConsumedCapacity</i> details are included in the response.
 * </p>
 * </li>
 * </ul>
 */
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
