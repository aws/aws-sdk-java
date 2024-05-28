/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

/**
 * <p>
 * A condition specified in the operation could not be evaluated.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionalCheckFailedException extends com.amazonaws.services.dynamodbv2.model.AmazonDynamoDBException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Item which caused the <code>ConditionalCheckFailedException</code>.
     * </p>
     */
    private java.util.Map<String, AttributeValue> item;

    /**
     * Constructs a new ConditionalCheckFailedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConditionalCheckFailedException(String message) {
        super(message);
    }

    /**
     * <p>
     * Item which caused the <code>ConditionalCheckFailedException</code>.
     * </p>
     * 
     * @return Item which caused the <code>ConditionalCheckFailedException</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Item")
    public java.util.Map<String, AttributeValue> getItem() {
        return item;
    }

    /**
     * <p>
     * Item which caused the <code>ConditionalCheckFailedException</code>.
     * </p>
     * 
     * @param item
     *        Item which caused the <code>ConditionalCheckFailedException</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Item")
    public void setItem(java.util.Map<String, AttributeValue> item) {
        this.item = item;
    }

    /**
     * <p>
     * Item which caused the <code>ConditionalCheckFailedException</code>.
     * </p>
     * 
     * @param item
     *        Item which caused the <code>ConditionalCheckFailedException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalCheckFailedException withItem(java.util.Map<String, AttributeValue> item) {
        setItem(item);
        return this;
    }

    /**
     * Add a single Item entry
     *
     * @see ConditionalCheckFailedException#withItem
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalCheckFailedException addItemEntry(String key, AttributeValue value) {
        if (null == this.item) {
            this.item = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.item.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.item.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Item.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalCheckFailedException clearItemEntries() {
        this.item = null;
        return this;
    }

}
