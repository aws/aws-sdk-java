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
package com.amazonaws.auth.policy.actions;

import javax.annotation.Generated;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for DynamoDB.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DynamoDBv2Actions implements Action {

    /** Represents any action executed on DynamoDB. */
    AllDynamoDBv2Actions("dynamodb:*"),

    /** Action for the BatchGetItem operation. */
    BatchGetItem("dynamodb:BatchGetItem"),
    /** Action for the BatchWriteItem operation. */
    BatchWriteItem("dynamodb:BatchWriteItem"),
    /** Action for the CreateBackup operation. */
    CreateBackup("dynamodb:CreateBackup"),
    /** Action for the CreateGlobalTable operation. */
    CreateGlobalTable("dynamodb:CreateGlobalTable"),
    /** Action for the CreateTable operation. */
    CreateTable("dynamodb:CreateTable"),
    /** Action for the DeleteBackup operation. */
    DeleteBackup("dynamodb:DeleteBackup"),
    /** Action for the DeleteItem operation. */
    DeleteItem("dynamodb:DeleteItem"),
    /** Action for the DeleteTable operation. */
    DeleteTable("dynamodb:DeleteTable"),
    /** Action for the DescribeBackup operation. */
    DescribeBackup("dynamodb:DescribeBackup"),
    /** Action for the DescribeContinuousBackups operation. */
    DescribeContinuousBackups("dynamodb:DescribeContinuousBackups"),
    /** Action for the DescribeEndpoints operation. */
    DescribeEndpoints("dynamodb:DescribeEndpoints"),
    /** Action for the DescribeGlobalTable operation. */
    DescribeGlobalTable("dynamodb:DescribeGlobalTable"),
    /** Action for the DescribeGlobalTableSettings operation. */
    DescribeGlobalTableSettings("dynamodb:DescribeGlobalTableSettings"),
    /** Action for the DescribeLimits operation. */
    DescribeLimits("dynamodb:DescribeLimits"),
    /** Action for the DescribeTable operation. */
    DescribeTable("dynamodb:DescribeTable"),
    /** Action for the DescribeTimeToLive operation. */
    DescribeTimeToLive("dynamodb:DescribeTimeToLive"),
    /** Action for the GetItem operation. */
    GetItem("dynamodb:GetItem"),
    /** Action for the ListBackups operation. */
    ListBackups("dynamodb:ListBackups"),
    /** Action for the ListGlobalTables operation. */
    ListGlobalTables("dynamodb:ListGlobalTables"),
    /** Action for the ListTables operation. */
    ListTables("dynamodb:ListTables"),
    /** Action for the ListTagsOfResource operation. */
    ListTagsOfResource("dynamodb:ListTagsOfResource"),
    /** Action for the PutItem operation. */
    PutItem("dynamodb:PutItem"),
    /** Action for the Query operation. */
    Query("dynamodb:Query"),
    /** Action for the RestoreTableFromBackup operation. */
    RestoreTableFromBackup("dynamodb:RestoreTableFromBackup"),
    /** Action for the RestoreTableToPointInTime operation. */
    RestoreTableToPointInTime("dynamodb:RestoreTableToPointInTime"),
    /** Action for the Scan operation. */
    Scan("dynamodb:Scan"),
    /** Action for the TagResource operation. */
    TagResource("dynamodb:TagResource"),
    /** Action for the TransactGetItems operation. */
    TransactGetItems("dynamodb:TransactGetItems"),
    /** Action for the TransactWriteItems operation. */
    TransactWriteItems("dynamodb:TransactWriteItems"),
    /** Action for the UntagResource operation. */
    UntagResource("dynamodb:UntagResource"),
    /** Action for the UpdateContinuousBackups operation. */
    UpdateContinuousBackups("dynamodb:UpdateContinuousBackups"),
    /** Action for the UpdateGlobalTable operation. */
    UpdateGlobalTable("dynamodb:UpdateGlobalTable"),
    /** Action for the UpdateGlobalTableSettings operation. */
    UpdateGlobalTableSettings("dynamodb:UpdateGlobalTableSettings"),
    /** Action for the UpdateItem operation. */
    UpdateItem("dynamodb:UpdateItem"),
    /** Action for the UpdateTable operation. */
    UpdateTable("dynamodb:UpdateTable"),
    /** Action for the UpdateTimeToLive operation. */
    UpdateTimeToLive("dynamodb:UpdateTimeToLive"),

    ;

    private final String action;

    private DynamoDBv2Actions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
