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

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.util.Map;

/**
 * Enables adding condition expression parameter to transactionWrite operation via TransactionWriteRequest.
 * For example, you may want to update only if an attribute has a particular value.
 * @see TransactionWriteRequest#addPut(Object, DynamoDBTransactionWriteExpression)
 * @see DynamoDBMapper#transactionWrite(TransactionWriteRequest)
 */
public class DynamoDBTransactionWriteExpression {
    /**
     * A condition that must be satisfied in order for a conditional write to succeed.
     */
    private String conditionExpression;

    /**
     * One or more substitution tokens for attribute names in an expression.
     */
    private Map<String, String> expressionAttributeNames;

    /**
     * One or more values that can be substituted in an expression.
     */
    private Map<String, AttributeValue> expressionAttributeValues;

    /**
     * A condition that must be satisfied in order for a conditional write to succeed.
     */
    public DynamoDBTransactionWriteExpression withConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    /**
     * A condition that must be satisfied in order for a conditional write to succeed.
     */
    public String getConditionExpression() {
        return conditionExpression;
    }

    /**
     * One or more substitution tokens for attribute names in an expression.
     */
    public DynamoDBTransactionWriteExpression withExpressionAttributeNames(Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
        return this;
    }

    /**
     * One or more substitution tokens for attribute names in an expression.
     */
    public Map<String, String> getExpressionAttributeNames() {
        return expressionAttributeNames;
    }

    /**
     * One or more values that can be substituted in an expression.
     */
    public DynamoDBTransactionWriteExpression withExpressionAttributeValues(Map<String, AttributeValue> expressionAttributeValues) {
        this.expressionAttributeValues = expressionAttributeValues;
        return this;
    }

    /**
     * One or more values that can be substituted in an expression.
     */
    public Map<String, AttributeValue> getExpressionAttributeValues() {
        return expressionAttributeValues;
    }
}
