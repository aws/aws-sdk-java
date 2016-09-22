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
package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for DynamoDB.
 */

public enum DynamoDBv2Actions implements Action {

    /** Represents any action executed on DynamoDB. */
    AllDynamoDBv2Actions("dynamodb:*"),

    /** Action for the BatchGetItem operation. */
    BatchGetItem("dynamodb:BatchGetItem"),
    /** Action for the BatchWriteItem operation. */
    BatchWriteItem("dynamodb:BatchWriteItem"),
    /** Action for the CreateTable operation. */
    CreateTable("dynamodb:CreateTable"),
    /** Action for the DeleteItem operation. */
    DeleteItem("dynamodb:DeleteItem"),
    /** Action for the DeleteTable operation. */
    DeleteTable("dynamodb:DeleteTable"),
    /** Action for the DescribeLimits operation. */
    DescribeLimits("dynamodb:DescribeLimits"),
    /** Action for the DescribeTable operation. */
    DescribeTable("dynamodb:DescribeTable"),
    /** Action for the GetItem operation. */
    GetItem("dynamodb:GetItem"),
    /** Action for the ListTables operation. */
    ListTables("dynamodb:ListTables"),
    /** Action for the PutItem operation. */
    PutItem("dynamodb:PutItem"),
    /** Action for the Query operation. */
    Query("dynamodb:Query"),
    /** Action for the Scan operation. */
    Scan("dynamodb:Scan"),
    /** Action for the UpdateItem operation. */
    UpdateItem("dynamodb:UpdateItem"),
    /** Action for the UpdateTable operation. */
    UpdateTable("dynamodb:UpdateTable"),

    ;

    private final String action;

    private DynamoDBv2Actions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
