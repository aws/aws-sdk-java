/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.document;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.model.AttributeAction;

/**
 * Used to update an attribute. Each instance of AttributeUpdate includes the
 * name, action and new value to be used for modifying the attribute.
 * <p>
 * Typical usages:
 * <blockquote>
 * <code>new AttributeUpdate("strAttr").put("attrValue");</code>
 * <p>
 * <code>new AttributeUpdate("intAttr").addNumeric(42);</code>
 * <p>
 * ...
 * </blockquote>
 * <p>
 * See http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/
 * API_UpdateItem.html#DDB-UpdateItem-request-AttributeUpdates
 */
public class AttributeUpdate {

    private final String attributeName;

    private AttributeAction action;

    private Set<Object> attributeValues;

    private Object value;

    /**
     * Used to update an attribute. Each instance of AttributeUpdate includes the
     * name, action and new value to be used for modifying the attribute.
     * <p>
     * Typical usages:
     * <blockquote>
     * <code>new AttributeUpdate("strAttr").put("attrValue");</code>
     * <p>
     * <code>new AttributeUpdate("intAttr").addNumeric(42);</code>
     * <p>
     * ...
     * </blockquote>
     * <p>
     * See http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/
     * API_UpdateItem.html#DDB-UpdateItem-request-AttributeUpdates
     */
    public AttributeUpdate(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * Used to update an attribute. Each instance of AttributeUpdate includes the
     * name, action and new value to be used for modifying the attribute.
     * <p>
     * Typical usages:
     * <blockquote>
     * <code>new AttributeUpdate("strAttr").put("attrValue");</code>
     * <p>
     * <code>new AttributeUpdate("intAttr").addNumeric(42);</code>
     * <p>
     * ...
     * </blockquote>
     * <p>
     * See http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/
     * API_UpdateItem.html#DDB-UpdateItem-request-AttributeUpdates
     */
    public AttributeUpdate put(Object attributeValue) {
        action = AttributeAction.PUT;
        this.value = attributeValue;
        return this;
    }

    public AttributeUpdate delete() {
        action = AttributeAction.DELETE;
        return this;
    }

    public AttributeUpdate removeElements(Object... elementsToBeRemoved) {
        action = AttributeAction.DELETE;
        this.attributeValues = Collections.unmodifiableSet(new LinkedHashSet<Object>(
                Arrays.asList(elementsToBeRemoved)));
        return this;
    }

    public AttributeUpdate addNumeric(Number value) {
        action = AttributeAction.ADD;
        this.value = value;
        return this;
    }

    public AttributeUpdate addElements(Object... newElements) {
        action = AttributeAction.ADD;
        this.attributeValues = Collections.unmodifiableSet(new LinkedHashSet<Object>(
                Arrays.asList(newElements)));
        return this;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public AttributeAction getAction() {
        return action;
    }

    public Set<Object> getAttributeValues() {
        return attributeValues;
    }

    public Object getValue() {
        return value;
    }
}
