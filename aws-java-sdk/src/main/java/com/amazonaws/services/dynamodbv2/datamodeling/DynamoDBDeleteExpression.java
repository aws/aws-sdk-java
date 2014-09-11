/*
 * Copyright 2011-2014 Amazon Technologies, Inc.
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

import com.amazonaws.services.dynamodbv2.model.ConditionalOperator;
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
}
