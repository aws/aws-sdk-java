/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.pojos;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * This class has same name has TestItem but different hashKeyName. This will
 * help test schema violations
 */
@DynamoDBTable(tableName = "aws-java-sdk-dynamodb-mapper-save-config-test")
public class SchemaViolatingTestItem {

    private String hashKey;
    private Long rangeKey;

    @DynamoDBHashKey(attributeName = "fakeHashKey")
    public String getHashKey() {
        return hashKey;
    }

    public void setHashKey(String hashKey) {
        this.hashKey = hashKey;
    }

    @DynamoDBRangeKey(attributeName = "rangeKey")
    public Long getRangeKey() {
        return rangeKey;
    }

    public void setRangeKey(Long rangeKey) {
        this.rangeKey = rangeKey;
    }
}
