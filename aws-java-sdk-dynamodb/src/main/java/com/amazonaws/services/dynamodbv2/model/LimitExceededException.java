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
 * The number of concurrent table requests (cumulative number of tables in the <code>CREATING</code>,
 * <code>DELETING</code> or <code>UPDATING</code> state) exceeds the maximum allowed of 10.
 * </p>
 * <p>
 * Also, for tables with secondary indexes, only one of those tables can be in the <code>CREATING</code> state at any
 * point in time. Do not attempt to create more than one such table simultaneously.
 * </p>
 * <p>
 * The total limit of tables in the <code>ACTIVE</code> state is 250.
 * </p>
 */
public class LimitExceededException extends com.amazonaws.services.dynamodbv2.model.AmazonDynamoDBException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new LimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public LimitExceededException(String message) {
        super(message);
    }

}
