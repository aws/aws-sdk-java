/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.services.dynamodbv2.datamodeling;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ConditionalOperator;
import com.amazonaws.services.dynamodbv2.model.DeleteItemRequest;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;

/**
 * Enables adding options to a delete operation.
 * For example, you may want to delete only if an attribute has a particular value.
 * @see DynamoDBMapper#delete(Object, DynamoDBDeleteExpression)
 */
public class DynamoDBDeleteExpression {

    /** Optional expected attributes */
    private Map<String, ExpectedAttributeValue> expectedAttributes;

    /** The logical operator on the expected attribute conditions */
    private String conditionalOperator;

    /**
     * A condition that must be satisfied in order for a conditional
     * DeleteItem to succeed.
     */
    private String conditionExpression;

    /**
     * One or more substitution variables for simplifying complex
     * expressions.
     */
    private java.util.Map<String,String> expressionAttributeNames;

    /**
     * One or more values that can be substituted in an expression.
     */
    private java.util.Map<String,AttributeValue> expressionAttributeValues;

    /**
     * Gets the map of attribute names to expected attribute values to check on delete.
     *
     * @return The map of attribute names to expected attribute value conditions to check on delete
     */
    public Map<String, ExpectedAttributeValue> getExpected() {
        return expectedAttributes;
    }

    /**
     * Sets the expected condition to the map of attribute names to expected attribute values given.
     *
     * @param expectedAttributes
     *            The map of attribute names to expected attribute value conditions to check on delete
     */
    public void setExpected(Map<String, ExpectedAttributeValue> expectedAttributes) {
        this.expectedAttributes = expectedAttributes;
    }

    /**
     * Sets the expected condition to the map of attribute names to expected
     * attribute values given and returns a pointer to this object for
     * method-chaining.
     *
     * @param expectedAttributes
     *            The map of attribute names to expected attribute value
     *            conditions to check on delete
     */
    public DynamoDBDeleteExpression withExpected(Map<String, ExpectedAttributeValue> expectedAttributes) {
        setExpected(expectedAttributes);
        return this;
    }

    /**
     * Adds one entry to the expected conditions and returns a pointer to this
     * object for method-chaining.
     *
     * @param attributeName
     *            The name of the attribute.
     * @param expected
     *            The expected attribute value.
     */
    public DynamoDBDeleteExpression withExpectedEntry(String attributeName, ExpectedAttributeValue expected) {
        if (expectedAttributes == null) {
            expectedAttributes = new HashMap<String,ExpectedAttributeValue>();
        }
        expectedAttributes.put(attributeName, expected);
        return this;
    }

    /**
     * Returns the logical operator on the expected attribute conditions of this
     * delete operation.
     */
    public String getConditionalOperator() {
        return conditionalOperator;
    }

    /**
     * Sets the logical operator on the expected attribute conditions of this
     * delete operation.
     */
    public void setConditionalOperator(String conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
    }

    /**
     * Sets the logical operator on the expected attribute conditions of this
     * delete operation and returns a pointer to this object for
     * method-chaining.
     */
    public DynamoDBDeleteExpression withConditionalOperator(String conditionalOperator) {
        setConditionalOperator(conditionalOperator);
        return this;
    }

    /**
     * Sets the logical operator on the expected attribute conditions of this
     * delete operation.
     */
    public void setConditionalOperator(ConditionalOperator conditionalOperator) {
        setConditionalOperator(conditionalOperator.toString());
    }

    /**
     * Sets the logical operator on the expected attribute conditions of this
     * delete operation and returns a pointer to this object for
     * method-chaining.
     */
    public DynamoDBDeleteExpression withConditionalOperator(ConditionalOperator conditionalOperator) {
        return withConditionalOperator(conditionalOperator.toString());
    }

    /**
     * A condition that must be satisfied in order for a conditional DeleteItem
     * to succeed.
     *
     * @see DeleteItemRequest#getConditionExpression()
     */
    public String getConditionExpression() {
        return conditionExpression;
    }

    /**
     * A condition that must be satisfied in order for a conditional DeleteItem
     * to succeed.
     *
     * @see DeleteItemRequest#setConditionExpression()
     */
    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    /**
     * A condition that must be satisfied in order for a conditional DeleteItem
     * to succeed.
     *
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     *
     * @see DeleteItemRequest#withConditionExpression(String)
     */
    public DynamoDBDeleteExpression withConditionExpression(
            String conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    /**
     * One or more substitution variables for simplifying complex expressions.
     *
     * @return One or more substitution variables for simplifying complex
     *         expressions.
     * @see DeleteItemRequest#getExpressionAttributeNames()
     */
    public java.util.Map<String, String> getExpressionAttributeNames() {

        return expressionAttributeNames;
    }

    /**
     * One or more substitution variables for simplifying complex expressions.
     *
     * @param expressionAttributeNames
     *            One or more substitution variables for simplifying complex
     *            expressions.
     * @see DeleteItemRequest#setExpressionAttributeNames(Map)
     */
    public void setExpressionAttributeNames(
            java.util.Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
    }

    /**
     * One or more substitution variables for simplifying complex expressions.
     *
     * @param expressionAttributeNames
     *            One or more substitution variables for simplifying complex
     *            expressions.
     *
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeleteItemRequest#withExpressionAttributeNames(Map)
     */
    public DynamoDBDeleteExpression withExpressionAttributeNames(
            java.util.Map<String, String> expressionAttributeNames) {
        setExpressionAttributeNames(expressionAttributeNames);
        return this;
    }

    /**
     * One or more substitution variables for simplifying complex expressions.
     * The method adds a new key-value pair into ExpressionAttributeNames
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key
     *            The key of the entry to be added into
     *            ExpressionAttributeNames.
     * @param value
     *            The corresponding value of the entry to be added into
     *            ExpressionAttributeNames.
     *
     * @see DeleteItemRequest#addExpressionAttributeNamesEntry(String, String)
     */
    public DynamoDBDeleteExpression addExpressionAttributeNamesEntry(
            String key, String value) {
        if (null == this.expressionAttributeNames) {
            this.expressionAttributeNames = new java.util.HashMap<String, String>();
        }
        if (this.expressionAttributeNames.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.expressionAttributeNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeNames.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DynamoDBDeleteExpression clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
        return this;
    }

    /**
     * One or more values that can be substituted in an expression.
     *
     * @return One or more values that can be substituted in an expression.
     * @see DeleteItemRequest#getExpressionAttributeValues()
     */
    public java.util.Map<String, AttributeValue> getExpressionAttributeValues() {
        return expressionAttributeValues;
    }

    /**
     * One or more values that can be substituted in an expression.
     *
     * @param expressionAttributeValues
     *            One or more values that can be substituted in an expression.
     *
     * @see DeleteItemRequest#setExpressionAttributeValues(Map)
     */
    public void setExpressionAttributeValues(
            java.util.Map<String, AttributeValue> expressionAttributeValues) {
        this.expressionAttributeValues = expressionAttributeValues;
    }

    /**
     * One or more values that can be substituted in an expression.
     *
     * @param expressionAttributeValues
     *            One or more values that can be substituted in an expression.
     *
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeleteItemRequest#withExpressionAttributeValues(Map)
     */
    public DynamoDBDeleteExpression withExpressionAttributeValues(
            java.util.Map<String, AttributeValue> expressionAttributeValues) {
        setExpressionAttributeValues(expressionAttributeValues);
        return this;
    }

    /**
     * One or more values that can be substituted in an expression. The method
     * adds a new key-value pair into ExpressionAttributeValues parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key
     *            The key of the entry to be added into
     *            ExpressionAttributeValues.
     * @param value
     *            The corresponding value of the entry to be added into
     *            ExpressionAttributeValues.
     *
     * @see DeleteItemRequest#addExpressionAttributeValuesEntry(String,
     *      AttributeValue)
     */
    public DynamoDBDeleteExpression addExpressionAttributeValuesEntry(
            String key, AttributeValue value) {
        if (null == this.expressionAttributeValues) {
            this.expressionAttributeValues = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.expressionAttributeValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.expressionAttributeValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeValues.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DynamoDBDeleteExpression clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
        return this;
    }
}
