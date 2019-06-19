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
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.util.Map;

/**
 * Enables adding projection expression parameters to transactionLoad operation via TransactionGetRequest.
 * For example, you may want to get only specific attributes of an item.
 * @see TransactionLoadRequest#addLoad(Object, DynamoDBTransactionLoadExpression)
 * @see DynamoDBMapper#transactionLoad(TransactionLoadRequest)
 */
public class DynamoDBTransactionLoadExpression {

    /**
     * A string that identifies one or more attributes of the specified item to retrieve from the table. The attributes
     * in the expression must be separated by commas. If no attribute names are specified, then all attributes of the
     * specified item are returned. If any of the requested attributes are not found, they do not appear in the result.
     */
    private String projectionExpression;

    /**
     * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
     */
    private Map<String, String> expressionAttributeNames;

    /**
     * A string that identifies one or more attributes of the specified item to retrieve from the table. The attributes
     * in the expression must be separated by commas. If no attribute names are specified, then all attributes of the
     * specified item are returned. If any of the requested attributes are not found, they do not appear in the result.
     */
    public DynamoDBTransactionLoadExpression withProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
        return this;
    }

    /**
     * A string that identifies one or more attributes of the specified item to retrieve from the table. The attributes
     * in the expression must be separated by commas. If no attribute names are specified, then all attributes of the
     * specified item are returned. If any of the requested attributes are not found, they do not appear in the result.
     */
    public String getProjectionExpression() {
        return projectionExpression;
    }

    /**
     * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
     */
    public DynamoDBTransactionLoadExpression withExpressionAttributeNames(Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
        return this;
    }

    /**
     * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
     */
    public Map<String, String> getExpressionAttributeNames() {
        return expressionAttributeNames;
    }
}
