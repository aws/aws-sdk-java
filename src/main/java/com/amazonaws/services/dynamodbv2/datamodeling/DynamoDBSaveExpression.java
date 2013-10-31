/*
 * Copyright 2011-2013 Amazon Technologies, Inc.
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

import java.util.Map;

import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;

/**
 * Enables adding options to a save operation.
 * For example, you may want to save only if an attribute has a particular value.
 * @see DynamoDBMapper#save(Object, DynamoDBSaveExpression)
 */
public class DynamoDBSaveExpression {
    /** Optional expected attributes */
    private Map<String, ExpectedAttributeValue> expectedAttributes;

    /**
     * Sets the expected condition to the map of attribute names to expected attribute values given.
     * 
     * @param expectedAttributes
     *            The map of attribute names to expected attribute value conditions to check on save
     */
    public void setExpected(Map<String, ExpectedAttributeValue> expectedAttributes) {
        this.expectedAttributes = expectedAttributes;
    }

    /**
     * Gets the map of attribute names to expected attribute values to check on save.
     * 
     * @return The map of attribute names to expected attribute value conditions to check on save
     */
    public Map<String, ExpectedAttributeValue> getExpected() {
        return expectedAttributes;
    }

}
