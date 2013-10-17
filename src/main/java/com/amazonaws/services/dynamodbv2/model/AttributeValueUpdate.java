/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;


/**
 * <p>
 * For the <i>UpdateItem</i> operation, represents the attributes to be modified,the action to perform on each, and the new value for each.
 * </p>
 * <p>
 * <b>NOTE:</b> You cannot use UpdateItem to update any primary key attributes. Instead, you will need to delete the item, and then use PutItem to create
 * a new item with new attributes.
 * </p>
 * <p>
 * Attribute values cannot be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty.
 * Requests with empty values will be rejected with a <i>ValidationException</i> .
 * </p>
 */
public class AttributeValueUpdate implements Serializable {

    /**
     * Represents the data for an attribute. You can set one, and only one,
     * of the elements.
     */
    private AttributeValue value;

    /**
     * Specifies how to perform the update. Valid values are
     * <code>PUT</code>, <code>DELETE</code>, and <code>ADD</code>. The
     * behavior depends on whether the specified primary key already exists
     * in the table. <p> <b>If an item with the specified <i>Key</i> is found
     * in the table:</b> <ul> <li> <p><code>PUT</code> - Adds the specified
     * attribute to the item. If the attribute already exists, it is replaced
     * by the new value. </li> <li> <p><code>DELETE</code> - If no value is
     * specified, the attribute and its value are removed from the item. The
     * data type of the specified value must match the existing value's data
     * type. <p>If a <i>set</i> of values is specified, then those values are
     * subtracted from the old set. For example, if the attribute value was
     * the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     * <code>[a,c]</code>, then the final attribute value would be
     * <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     * <p><code>ADD</code> - If the attribute does not already exist, then
     * the attribute and its values are added to the item. If the attribute
     * does exist, then the behavior of <code>ADD</code> depends on the data
     * type of the attribute: <ul> <li> <p>If the existing attribute is a
     * number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     * mathematically added to the existing attribute. If <i>Value</i> is a
     * negative number, then it is subtracted from the existing attribute.
     * <note> <p> If you use <code>ADD</code> to increment or decrement a
     * number value for an item that doesn't exist before the update, Amazon
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, Amazon
     * DynamoDB uses <code>0</code> as the initial value. For example,
     * suppose that the item you want to update does not yet have an
     * attribute named <i>itemcount</i>, but you decide to <code>ADD</code>
     * the number <code>3</code> to this attribute anyway, even though it
     * currently does not exist. Amazon DynamoDB will create the
     * <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     * and finally add <code>3</code> to it. The result will be a new
     * <i>itemcount</i> attribute in the item, with a value of
     * <code>3</code>. </note> </li> <li> <p>If the existing data type is a
     * set, and if the <i>Value</i> is also a set, then the <i>Value</i> is
     * added to the existing set. (This is a <i>set</i> operation, not
     * mathematical addition.) For example, if the attribute value was the
     * set <code>[1,2]</code>, and the <code>ADD</code> action specified
     * <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - Amazon DynamoDB creates a new item with the
     * specified primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - Amazon DynamoDB creates an
     * item with the supplied primary key and number (or set of numbers) for
     * the attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     */
    private String action;

    /**
     * Default constructor for a new AttributeValueUpdate object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AttributeValueUpdate() {}
    
    /**
     * Constructs a new AttributeValueUpdate object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param value Represents the data for an attribute. You can set one,
     * and only one, of the elements.
     * @param action Specifies how to perform the update. Valid values are
     * <code>PUT</code>, <code>DELETE</code>, and <code>ADD</code>. The
     * behavior depends on whether the specified primary key already exists
     * in the table. <p> <b>If an item with the specified <i>Key</i> is found
     * in the table:</b> <ul> <li> <p><code>PUT</code> - Adds the specified
     * attribute to the item. If the attribute already exists, it is replaced
     * by the new value. </li> <li> <p><code>DELETE</code> - If no value is
     * specified, the attribute and its value are removed from the item. The
     * data type of the specified value must match the existing value's data
     * type. <p>If a <i>set</i> of values is specified, then those values are
     * subtracted from the old set. For example, if the attribute value was
     * the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     * <code>[a,c]</code>, then the final attribute value would be
     * <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     * <p><code>ADD</code> - If the attribute does not already exist, then
     * the attribute and its values are added to the item. If the attribute
     * does exist, then the behavior of <code>ADD</code> depends on the data
     * type of the attribute: <ul> <li> <p>If the existing attribute is a
     * number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     * mathematically added to the existing attribute. If <i>Value</i> is a
     * negative number, then it is subtracted from the existing attribute.
     * <note> <p> If you use <code>ADD</code> to increment or decrement a
     * number value for an item that doesn't exist before the update, Amazon
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, Amazon
     * DynamoDB uses <code>0</code> as the initial value. For example,
     * suppose that the item you want to update does not yet have an
     * attribute named <i>itemcount</i>, but you decide to <code>ADD</code>
     * the number <code>3</code> to this attribute anyway, even though it
     * currently does not exist. Amazon DynamoDB will create the
     * <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     * and finally add <code>3</code> to it. The result will be a new
     * <i>itemcount</i> attribute in the item, with a value of
     * <code>3</code>. </note> </li> <li> <p>If the existing data type is a
     * set, and if the <i>Value</i> is also a set, then the <i>Value</i> is
     * added to the existing set. (This is a <i>set</i> operation, not
     * mathematical addition.) For example, if the attribute value was the
     * set <code>[1,2]</code>, and the <code>ADD</code> action specified
     * <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - Amazon DynamoDB creates a new item with the
     * specified primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - Amazon DynamoDB creates an
     * item with the supplied primary key and number (or set of numbers) for
     * the attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul>
     */
    public AttributeValueUpdate(AttributeValue value, String action) {
        setValue(value);
        setAction(action);
    }

    /**
     * Constructs a new AttributeValueUpdate object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param value Represents the data for an attribute. You can set one,
     * and only one, of the elements.
     * @param action Specifies how to perform the update. Valid values are
     * <code>PUT</code>, <code>DELETE</code>, and <code>ADD</code>. The
     * behavior depends on whether the specified primary key already exists
     * in the table. <p> <b>If an item with the specified <i>Key</i> is found
     * in the table:</b> <ul> <li> <p><code>PUT</code> - Adds the specified
     * attribute to the item. If the attribute already exists, it is replaced
     * by the new value. </li> <li> <p><code>DELETE</code> - If no value is
     * specified, the attribute and its value are removed from the item. The
     * data type of the specified value must match the existing value's data
     * type. <p>If a <i>set</i> of values is specified, then those values are
     * subtracted from the old set. For example, if the attribute value was
     * the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     * <code>[a,c]</code>, then the final attribute value would be
     * <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     * <p><code>ADD</code> - If the attribute does not already exist, then
     * the attribute and its values are added to the item. If the attribute
     * does exist, then the behavior of <code>ADD</code> depends on the data
     * type of the attribute: <ul> <li> <p>If the existing attribute is a
     * number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     * mathematically added to the existing attribute. If <i>Value</i> is a
     * negative number, then it is subtracted from the existing attribute.
     * <note> <p> If you use <code>ADD</code> to increment or decrement a
     * number value for an item that doesn't exist before the update, Amazon
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, Amazon
     * DynamoDB uses <code>0</code> as the initial value. For example,
     * suppose that the item you want to update does not yet have an
     * attribute named <i>itemcount</i>, but you decide to <code>ADD</code>
     * the number <code>3</code> to this attribute anyway, even though it
     * currently does not exist. Amazon DynamoDB will create the
     * <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     * and finally add <code>3</code> to it. The result will be a new
     * <i>itemcount</i> attribute in the item, with a value of
     * <code>3</code>. </note> </li> <li> <p>If the existing data type is a
     * set, and if the <i>Value</i> is also a set, then the <i>Value</i> is
     * added to the existing set. (This is a <i>set</i> operation, not
     * mathematical addition.) For example, if the attribute value was the
     * set <code>[1,2]</code>, and the <code>ADD</code> action specified
     * <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - Amazon DynamoDB creates a new item with the
     * specified primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - Amazon DynamoDB creates an
     * item with the supplied primary key and number (or set of numbers) for
     * the attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul>
     */
    public AttributeValueUpdate(AttributeValue value, AttributeAction action) {
        this.value = value;
        this.action = action.toString();
    }

    /**
     * Represents the data for an attribute. You can set one, and only one,
     * of the elements.
     *
     * @return Represents the data for an attribute. You can set one, and only one,
     *         of the elements.
     */
    public AttributeValue getValue() {
        return value;
    }
    
    /**
     * Represents the data for an attribute. You can set one, and only one,
     * of the elements.
     *
     * @param value Represents the data for an attribute. You can set one, and only one,
     *         of the elements.
     */
    public void setValue(AttributeValue value) {
        this.value = value;
    }
    
    /**
     * Represents the data for an attribute. You can set one, and only one,
     * of the elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value Represents the data for an attribute. You can set one, and only one,
     *         of the elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttributeValueUpdate withValue(AttributeValue value) {
        this.value = value;
        return this;
    }

    /**
     * Specifies how to perform the update. Valid values are
     * <code>PUT</code>, <code>DELETE</code>, and <code>ADD</code>. The
     * behavior depends on whether the specified primary key already exists
     * in the table. <p> <b>If an item with the specified <i>Key</i> is found
     * in the table:</b> <ul> <li> <p><code>PUT</code> - Adds the specified
     * attribute to the item. If the attribute already exists, it is replaced
     * by the new value. </li> <li> <p><code>DELETE</code> - If no value is
     * specified, the attribute and its value are removed from the item. The
     * data type of the specified value must match the existing value's data
     * type. <p>If a <i>set</i> of values is specified, then those values are
     * subtracted from the old set. For example, if the attribute value was
     * the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     * <code>[a,c]</code>, then the final attribute value would be
     * <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     * <p><code>ADD</code> - If the attribute does not already exist, then
     * the attribute and its values are added to the item. If the attribute
     * does exist, then the behavior of <code>ADD</code> depends on the data
     * type of the attribute: <ul> <li> <p>If the existing attribute is a
     * number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     * mathematically added to the existing attribute. If <i>Value</i> is a
     * negative number, then it is subtracted from the existing attribute.
     * <note> <p> If you use <code>ADD</code> to increment or decrement a
     * number value for an item that doesn't exist before the update, Amazon
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, Amazon
     * DynamoDB uses <code>0</code> as the initial value. For example,
     * suppose that the item you want to update does not yet have an
     * attribute named <i>itemcount</i>, but you decide to <code>ADD</code>
     * the number <code>3</code> to this attribute anyway, even though it
     * currently does not exist. Amazon DynamoDB will create the
     * <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     * and finally add <code>3</code> to it. The result will be a new
     * <i>itemcount</i> attribute in the item, with a value of
     * <code>3</code>. </note> </li> <li> <p>If the existing data type is a
     * set, and if the <i>Value</i> is also a set, then the <i>Value</i> is
     * added to the existing set. (This is a <i>set</i> operation, not
     * mathematical addition.) For example, if the attribute value was the
     * set <code>[1,2]</code>, and the <code>ADD</code> action specified
     * <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - Amazon DynamoDB creates a new item with the
     * specified primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - Amazon DynamoDB creates an
     * item with the supplied primary key and number (or set of numbers) for
     * the attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @return Specifies how to perform the update. Valid values are
     *         <code>PUT</code>, <code>DELETE</code>, and <code>ADD</code>. The
     *         behavior depends on whether the specified primary key already exists
     *         in the table. <p> <b>If an item with the specified <i>Key</i> is found
     *         in the table:</b> <ul> <li> <p><code>PUT</code> - Adds the specified
     *         attribute to the item. If the attribute already exists, it is replaced
     *         by the new value. </li> <li> <p><code>DELETE</code> - If no value is
     *         specified, the attribute and its value are removed from the item. The
     *         data type of the specified value must match the existing value's data
     *         type. <p>If a <i>set</i> of values is specified, then those values are
     *         subtracted from the old set. For example, if the attribute value was
     *         the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     *         <code>[a,c]</code>, then the final attribute value would be
     *         <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     *         <p><code>ADD</code> - If the attribute does not already exist, then
     *         the attribute and its values are added to the item. If the attribute
     *         does exist, then the behavior of <code>ADD</code> depends on the data
     *         type of the attribute: <ul> <li> <p>If the existing attribute is a
     *         number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     *         mathematically added to the existing attribute. If <i>Value</i> is a
     *         negative number, then it is subtracted from the existing attribute.
     *         <note> <p> If you use <code>ADD</code> to increment or decrement a
     *         number value for an item that doesn't exist before the update, Amazon
     *         DynamoDB uses 0 as the initial value. <p>In addition, if you use
     *         <code>ADD</code> to update an existing item, and intend to increment
     *         or decrement an attribute value which does not yet exist, Amazon
     *         DynamoDB uses <code>0</code> as the initial value. For example,
     *         suppose that the item you want to update does not yet have an
     *         attribute named <i>itemcount</i>, but you decide to <code>ADD</code>
     *         the number <code>3</code> to this attribute anyway, even though it
     *         currently does not exist. Amazon DynamoDB will create the
     *         <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     *         and finally add <code>3</code> to it. The result will be a new
     *         <i>itemcount</i> attribute in the item, with a value of
     *         <code>3</code>. </note> </li> <li> <p>If the existing data type is a
     *         set, and if the <i>Value</i> is also a set, then the <i>Value</i> is
     *         added to the existing set. (This is a <i>set</i> operation, not
     *         mathematical addition.) For example, if the attribute value was the
     *         set <code>[1,2]</code>, and the <code>ADD</code> action specified
     *         <code>[3]</code>, then the final attribute value would be
     *         <code>[1,2,3]</code>. An error occurs if an Add action is specified
     *         for a set attribute and the attribute type specified does not match
     *         the existing set type. <p>Both sets must have the same primitive data
     *         type. For example, if the existing data type is a set of strings, the
     *         <i>Value</i> must also be a set of strings. The same holds true for
     *         number sets and binary sets. </li> </ul> <p>This action is only valid
     *         for an existing attribute whose data type is number or is a set. Do
     *         not use <code>ADD</code> for any other data types. </li> </ul> <p>
     *         <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     *         <p><code>PUT</code> - Amazon DynamoDB creates a new item with the
     *         specified primary key, and then adds the attribute. </li> <li>
     *         <p><code>DELETE</code> - Nothing happens; there is no attribute to
     *         delete. </li> <li> <p><code>ADD</code> - Amazon DynamoDB creates an
     *         item with the supplied primary key and number (or set of numbers) for
     *         the attribute value. The only data types allowed are number and number
     *         set; no other data types can be specified. </li> </ul>
     *
     * @see AttributeAction
     */
    public String getAction() {
        return action;
    }
    
    /**
     * Specifies how to perform the update. Valid values are
     * <code>PUT</code>, <code>DELETE</code>, and <code>ADD</code>. The
     * behavior depends on whether the specified primary key already exists
     * in the table. <p> <b>If an item with the specified <i>Key</i> is found
     * in the table:</b> <ul> <li> <p><code>PUT</code> - Adds the specified
     * attribute to the item. If the attribute already exists, it is replaced
     * by the new value. </li> <li> <p><code>DELETE</code> - If no value is
     * specified, the attribute and its value are removed from the item. The
     * data type of the specified value must match the existing value's data
     * type. <p>If a <i>set</i> of values is specified, then those values are
     * subtracted from the old set. For example, if the attribute value was
     * the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     * <code>[a,c]</code>, then the final attribute value would be
     * <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     * <p><code>ADD</code> - If the attribute does not already exist, then
     * the attribute and its values are added to the item. If the attribute
     * does exist, then the behavior of <code>ADD</code> depends on the data
     * type of the attribute: <ul> <li> <p>If the existing attribute is a
     * number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     * mathematically added to the existing attribute. If <i>Value</i> is a
     * negative number, then it is subtracted from the existing attribute.
     * <note> <p> If you use <code>ADD</code> to increment or decrement a
     * number value for an item that doesn't exist before the update, Amazon
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, Amazon
     * DynamoDB uses <code>0</code> as the initial value. For example,
     * suppose that the item you want to update does not yet have an
     * attribute named <i>itemcount</i>, but you decide to <code>ADD</code>
     * the number <code>3</code> to this attribute anyway, even though it
     * currently does not exist. Amazon DynamoDB will create the
     * <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     * and finally add <code>3</code> to it. The result will be a new
     * <i>itemcount</i> attribute in the item, with a value of
     * <code>3</code>. </note> </li> <li> <p>If the existing data type is a
     * set, and if the <i>Value</i> is also a set, then the <i>Value</i> is
     * added to the existing set. (This is a <i>set</i> operation, not
     * mathematical addition.) For example, if the attribute value was the
     * set <code>[1,2]</code>, and the <code>ADD</code> action specified
     * <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - Amazon DynamoDB creates a new item with the
     * specified primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - Amazon DynamoDB creates an
     * item with the supplied primary key and number (or set of numbers) for
     * the attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @param action Specifies how to perform the update. Valid values are
     *         <code>PUT</code>, <code>DELETE</code>, and <code>ADD</code>. The
     *         behavior depends on whether the specified primary key already exists
     *         in the table. <p> <b>If an item with the specified <i>Key</i> is found
     *         in the table:</b> <ul> <li> <p><code>PUT</code> - Adds the specified
     *         attribute to the item. If the attribute already exists, it is replaced
     *         by the new value. </li> <li> <p><code>DELETE</code> - If no value is
     *         specified, the attribute and its value are removed from the item. The
     *         data type of the specified value must match the existing value's data
     *         type. <p>If a <i>set</i> of values is specified, then those values are
     *         subtracted from the old set. For example, if the attribute value was
     *         the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     *         <code>[a,c]</code>, then the final attribute value would be
     *         <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     *         <p><code>ADD</code> - If the attribute does not already exist, then
     *         the attribute and its values are added to the item. If the attribute
     *         does exist, then the behavior of <code>ADD</code> depends on the data
     *         type of the attribute: <ul> <li> <p>If the existing attribute is a
     *         number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     *         mathematically added to the existing attribute. If <i>Value</i> is a
     *         negative number, then it is subtracted from the existing attribute.
     *         <note> <p> If you use <code>ADD</code> to increment or decrement a
     *         number value for an item that doesn't exist before the update, Amazon
     *         DynamoDB uses 0 as the initial value. <p>In addition, if you use
     *         <code>ADD</code> to update an existing item, and intend to increment
     *         or decrement an attribute value which does not yet exist, Amazon
     *         DynamoDB uses <code>0</code> as the initial value. For example,
     *         suppose that the item you want to update does not yet have an
     *         attribute named <i>itemcount</i>, but you decide to <code>ADD</code>
     *         the number <code>3</code> to this attribute anyway, even though it
     *         currently does not exist. Amazon DynamoDB will create the
     *         <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     *         and finally add <code>3</code> to it. The result will be a new
     *         <i>itemcount</i> attribute in the item, with a value of
     *         <code>3</code>. </note> </li> <li> <p>If the existing data type is a
     *         set, and if the <i>Value</i> is also a set, then the <i>Value</i> is
     *         added to the existing set. (This is a <i>set</i> operation, not
     *         mathematical addition.) For example, if the attribute value was the
     *         set <code>[1,2]</code>, and the <code>ADD</code> action specified
     *         <code>[3]</code>, then the final attribute value would be
     *         <code>[1,2,3]</code>. An error occurs if an Add action is specified
     *         for a set attribute and the attribute type specified does not match
     *         the existing set type. <p>Both sets must have the same primitive data
     *         type. For example, if the existing data type is a set of strings, the
     *         <i>Value</i> must also be a set of strings. The same holds true for
     *         number sets and binary sets. </li> </ul> <p>This action is only valid
     *         for an existing attribute whose data type is number or is a set. Do
     *         not use <code>ADD</code> for any other data types. </li> </ul> <p>
     *         <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     *         <p><code>PUT</code> - Amazon DynamoDB creates a new item with the
     *         specified primary key, and then adds the attribute. </li> <li>
     *         <p><code>DELETE</code> - Nothing happens; there is no attribute to
     *         delete. </li> <li> <p><code>ADD</code> - Amazon DynamoDB creates an
     *         item with the supplied primary key and number (or set of numbers) for
     *         the attribute value. The only data types allowed are number and number
     *         set; no other data types can be specified. </li> </ul>
     *
     * @see AttributeAction
     */
    public void setAction(String action) {
        this.action = action;
    }
    
    /**
     * Specifies how to perform the update. Valid values are
     * <code>PUT</code>, <code>DELETE</code>, and <code>ADD</code>. The
     * behavior depends on whether the specified primary key already exists
     * in the table. <p> <b>If an item with the specified <i>Key</i> is found
     * in the table:</b> <ul> <li> <p><code>PUT</code> - Adds the specified
     * attribute to the item. If the attribute already exists, it is replaced
     * by the new value. </li> <li> <p><code>DELETE</code> - If no value is
     * specified, the attribute and its value are removed from the item. The
     * data type of the specified value must match the existing value's data
     * type. <p>If a <i>set</i> of values is specified, then those values are
     * subtracted from the old set. For example, if the attribute value was
     * the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     * <code>[a,c]</code>, then the final attribute value would be
     * <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     * <p><code>ADD</code> - If the attribute does not already exist, then
     * the attribute and its values are added to the item. If the attribute
     * does exist, then the behavior of <code>ADD</code> depends on the data
     * type of the attribute: <ul> <li> <p>If the existing attribute is a
     * number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     * mathematically added to the existing attribute. If <i>Value</i> is a
     * negative number, then it is subtracted from the existing attribute.
     * <note> <p> If you use <code>ADD</code> to increment or decrement a
     * number value for an item that doesn't exist before the update, Amazon
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, Amazon
     * DynamoDB uses <code>0</code> as the initial value. For example,
     * suppose that the item you want to update does not yet have an
     * attribute named <i>itemcount</i>, but you decide to <code>ADD</code>
     * the number <code>3</code> to this attribute anyway, even though it
     * currently does not exist. Amazon DynamoDB will create the
     * <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     * and finally add <code>3</code> to it. The result will be a new
     * <i>itemcount</i> attribute in the item, with a value of
     * <code>3</code>. </note> </li> <li> <p>If the existing data type is a
     * set, and if the <i>Value</i> is also a set, then the <i>Value</i> is
     * added to the existing set. (This is a <i>set</i> operation, not
     * mathematical addition.) For example, if the attribute value was the
     * set <code>[1,2]</code>, and the <code>ADD</code> action specified
     * <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - Amazon DynamoDB creates a new item with the
     * specified primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - Amazon DynamoDB creates an
     * item with the supplied primary key and number (or set of numbers) for
     * the attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @param action Specifies how to perform the update. Valid values are
     *         <code>PUT</code>, <code>DELETE</code>, and <code>ADD</code>. The
     *         behavior depends on whether the specified primary key already exists
     *         in the table. <p> <b>If an item with the specified <i>Key</i> is found
     *         in the table:</b> <ul> <li> <p><code>PUT</code> - Adds the specified
     *         attribute to the item. If the attribute already exists, it is replaced
     *         by the new value. </li> <li> <p><code>DELETE</code> - If no value is
     *         specified, the attribute and its value are removed from the item. The
     *         data type of the specified value must match the existing value's data
     *         type. <p>If a <i>set</i> of values is specified, then those values are
     *         subtracted from the old set. For example, if the attribute value was
     *         the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     *         <code>[a,c]</code>, then the final attribute value would be
     *         <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     *         <p><code>ADD</code> - If the attribute does not already exist, then
     *         the attribute and its values are added to the item. If the attribute
     *         does exist, then the behavior of <code>ADD</code> depends on the data
     *         type of the attribute: <ul> <li> <p>If the existing attribute is a
     *         number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     *         mathematically added to the existing attribute. If <i>Value</i> is a
     *         negative number, then it is subtracted from the existing attribute.
     *         <note> <p> If you use <code>ADD</code> to increment or decrement a
     *         number value for an item that doesn't exist before the update, Amazon
     *         DynamoDB uses 0 as the initial value. <p>In addition, if you use
     *         <code>ADD</code> to update an existing item, and intend to increment
     *         or decrement an attribute value which does not yet exist, Amazon
     *         DynamoDB uses <code>0</code> as the initial value. For example,
     *         suppose that the item you want to update does not yet have an
     *         attribute named <i>itemcount</i>, but you decide to <code>ADD</code>
     *         the number <code>3</code> to this attribute anyway, even though it
     *         currently does not exist. Amazon DynamoDB will create the
     *         <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     *         and finally add <code>3</code> to it. The result will be a new
     *         <i>itemcount</i> attribute in the item, with a value of
     *         <code>3</code>. </note> </li> <li> <p>If the existing data type is a
     *         set, and if the <i>Value</i> is also a set, then the <i>Value</i> is
     *         added to the existing set. (This is a <i>set</i> operation, not
     *         mathematical addition.) For example, if the attribute value was the
     *         set <code>[1,2]</code>, and the <code>ADD</code> action specified
     *         <code>[3]</code>, then the final attribute value would be
     *         <code>[1,2,3]</code>. An error occurs if an Add action is specified
     *         for a set attribute and the attribute type specified does not match
     *         the existing set type. <p>Both sets must have the same primitive data
     *         type. For example, if the existing data type is a set of strings, the
     *         <i>Value</i> must also be a set of strings. The same holds true for
     *         number sets and binary sets. </li> </ul> <p>This action is only valid
     *         for an existing attribute whose data type is number or is a set. Do
     *         not use <code>ADD</code> for any other data types. </li> </ul> <p>
     *         <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     *         <p><code>PUT</code> - Amazon DynamoDB creates a new item with the
     *         specified primary key, and then adds the attribute. </li> <li>
     *         <p><code>DELETE</code> - Nothing happens; there is no attribute to
     *         delete. </li> <li> <p><code>ADD</code> - Amazon DynamoDB creates an
     *         item with the supplied primary key and number (or set of numbers) for
     *         the attribute value. The only data types allowed are number and number
     *         set; no other data types can be specified. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see AttributeAction
     */
    public AttributeValueUpdate withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Specifies how to perform the update. Valid values are
     * <code>PUT</code>, <code>DELETE</code>, and <code>ADD</code>. The
     * behavior depends on whether the specified primary key already exists
     * in the table. <p> <b>If an item with the specified <i>Key</i> is found
     * in the table:</b> <ul> <li> <p><code>PUT</code> - Adds the specified
     * attribute to the item. If the attribute already exists, it is replaced
     * by the new value. </li> <li> <p><code>DELETE</code> - If no value is
     * specified, the attribute and its value are removed from the item. The
     * data type of the specified value must match the existing value's data
     * type. <p>If a <i>set</i> of values is specified, then those values are
     * subtracted from the old set. For example, if the attribute value was
     * the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     * <code>[a,c]</code>, then the final attribute value would be
     * <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     * <p><code>ADD</code> - If the attribute does not already exist, then
     * the attribute and its values are added to the item. If the attribute
     * does exist, then the behavior of <code>ADD</code> depends on the data
     * type of the attribute: <ul> <li> <p>If the existing attribute is a
     * number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     * mathematically added to the existing attribute. If <i>Value</i> is a
     * negative number, then it is subtracted from the existing attribute.
     * <note> <p> If you use <code>ADD</code> to increment or decrement a
     * number value for an item that doesn't exist before the update, Amazon
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, Amazon
     * DynamoDB uses <code>0</code> as the initial value. For example,
     * suppose that the item you want to update does not yet have an
     * attribute named <i>itemcount</i>, but you decide to <code>ADD</code>
     * the number <code>3</code> to this attribute anyway, even though it
     * currently does not exist. Amazon DynamoDB will create the
     * <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     * and finally add <code>3</code> to it. The result will be a new
     * <i>itemcount</i> attribute in the item, with a value of
     * <code>3</code>. </note> </li> <li> <p>If the existing data type is a
     * set, and if the <i>Value</i> is also a set, then the <i>Value</i> is
     * added to the existing set. (This is a <i>set</i> operation, not
     * mathematical addition.) For example, if the attribute value was the
     * set <code>[1,2]</code>, and the <code>ADD</code> action specified
     * <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - Amazon DynamoDB creates a new item with the
     * specified primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - Amazon DynamoDB creates an
     * item with the supplied primary key and number (or set of numbers) for
     * the attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @param action Specifies how to perform the update. Valid values are
     *         <code>PUT</code>, <code>DELETE</code>, and <code>ADD</code>. The
     *         behavior depends on whether the specified primary key already exists
     *         in the table. <p> <b>If an item with the specified <i>Key</i> is found
     *         in the table:</b> <ul> <li> <p><code>PUT</code> - Adds the specified
     *         attribute to the item. If the attribute already exists, it is replaced
     *         by the new value. </li> <li> <p><code>DELETE</code> - If no value is
     *         specified, the attribute and its value are removed from the item. The
     *         data type of the specified value must match the existing value's data
     *         type. <p>If a <i>set</i> of values is specified, then those values are
     *         subtracted from the old set. For example, if the attribute value was
     *         the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     *         <code>[a,c]</code>, then the final attribute value would be
     *         <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     *         <p><code>ADD</code> - If the attribute does not already exist, then
     *         the attribute and its values are added to the item. If the attribute
     *         does exist, then the behavior of <code>ADD</code> depends on the data
     *         type of the attribute: <ul> <li> <p>If the existing attribute is a
     *         number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     *         mathematically added to the existing attribute. If <i>Value</i> is a
     *         negative number, then it is subtracted from the existing attribute.
     *         <note> <p> If you use <code>ADD</code> to increment or decrement a
     *         number value for an item that doesn't exist before the update, Amazon
     *         DynamoDB uses 0 as the initial value. <p>In addition, if you use
     *         <code>ADD</code> to update an existing item, and intend to increment
     *         or decrement an attribute value which does not yet exist, Amazon
     *         DynamoDB uses <code>0</code> as the initial value. For example,
     *         suppose that the item you want to update does not yet have an
     *         attribute named <i>itemcount</i>, but you decide to <code>ADD</code>
     *         the number <code>3</code> to this attribute anyway, even though it
     *         currently does not exist. Amazon DynamoDB will create the
     *         <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     *         and finally add <code>3</code> to it. The result will be a new
     *         <i>itemcount</i> attribute in the item, with a value of
     *         <code>3</code>. </note> </li> <li> <p>If the existing data type is a
     *         set, and if the <i>Value</i> is also a set, then the <i>Value</i> is
     *         added to the existing set. (This is a <i>set</i> operation, not
     *         mathematical addition.) For example, if the attribute value was the
     *         set <code>[1,2]</code>, and the <code>ADD</code> action specified
     *         <code>[3]</code>, then the final attribute value would be
     *         <code>[1,2,3]</code>. An error occurs if an Add action is specified
     *         for a set attribute and the attribute type specified does not match
     *         the existing set type. <p>Both sets must have the same primitive data
     *         type. For example, if the existing data type is a set of strings, the
     *         <i>Value</i> must also be a set of strings. The same holds true for
     *         number sets and binary sets. </li> </ul> <p>This action is only valid
     *         for an existing attribute whose data type is number or is a set. Do
     *         not use <code>ADD</code> for any other data types. </li> </ul> <p>
     *         <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     *         <p><code>PUT</code> - Amazon DynamoDB creates a new item with the
     *         specified primary key, and then adds the attribute. </li> <li>
     *         <p><code>DELETE</code> - Nothing happens; there is no attribute to
     *         delete. </li> <li> <p><code>ADD</code> - Amazon DynamoDB creates an
     *         item with the supplied primary key and number (or set of numbers) for
     *         the attribute value. The only data types allowed are number and number
     *         set; no other data types can be specified. </li> </ul>
     *
     * @see AttributeAction
     */
    public void setAction(AttributeAction action) {
        this.action = action.toString();
    }
    
    /**
     * Specifies how to perform the update. Valid values are
     * <code>PUT</code>, <code>DELETE</code>, and <code>ADD</code>. The
     * behavior depends on whether the specified primary key already exists
     * in the table. <p> <b>If an item with the specified <i>Key</i> is found
     * in the table:</b> <ul> <li> <p><code>PUT</code> - Adds the specified
     * attribute to the item. If the attribute already exists, it is replaced
     * by the new value. </li> <li> <p><code>DELETE</code> - If no value is
     * specified, the attribute and its value are removed from the item. The
     * data type of the specified value must match the existing value's data
     * type. <p>If a <i>set</i> of values is specified, then those values are
     * subtracted from the old set. For example, if the attribute value was
     * the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     * <code>[a,c]</code>, then the final attribute value would be
     * <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     * <p><code>ADD</code> - If the attribute does not already exist, then
     * the attribute and its values are added to the item. If the attribute
     * does exist, then the behavior of <code>ADD</code> depends on the data
     * type of the attribute: <ul> <li> <p>If the existing attribute is a
     * number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     * mathematically added to the existing attribute. If <i>Value</i> is a
     * negative number, then it is subtracted from the existing attribute.
     * <note> <p> If you use <code>ADD</code> to increment or decrement a
     * number value for an item that doesn't exist before the update, Amazon
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, Amazon
     * DynamoDB uses <code>0</code> as the initial value. For example,
     * suppose that the item you want to update does not yet have an
     * attribute named <i>itemcount</i>, but you decide to <code>ADD</code>
     * the number <code>3</code> to this attribute anyway, even though it
     * currently does not exist. Amazon DynamoDB will create the
     * <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     * and finally add <code>3</code> to it. The result will be a new
     * <i>itemcount</i> attribute in the item, with a value of
     * <code>3</code>. </note> </li> <li> <p>If the existing data type is a
     * set, and if the <i>Value</i> is also a set, then the <i>Value</i> is
     * added to the existing set. (This is a <i>set</i> operation, not
     * mathematical addition.) For example, if the attribute value was the
     * set <code>[1,2]</code>, and the <code>ADD</code> action specified
     * <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - Amazon DynamoDB creates a new item with the
     * specified primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - Amazon DynamoDB creates an
     * item with the supplied primary key and number (or set of numbers) for
     * the attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @param action Specifies how to perform the update. Valid values are
     *         <code>PUT</code>, <code>DELETE</code>, and <code>ADD</code>. The
     *         behavior depends on whether the specified primary key already exists
     *         in the table. <p> <b>If an item with the specified <i>Key</i> is found
     *         in the table:</b> <ul> <li> <p><code>PUT</code> - Adds the specified
     *         attribute to the item. If the attribute already exists, it is replaced
     *         by the new value. </li> <li> <p><code>DELETE</code> - If no value is
     *         specified, the attribute and its value are removed from the item. The
     *         data type of the specified value must match the existing value's data
     *         type. <p>If a <i>set</i> of values is specified, then those values are
     *         subtracted from the old set. For example, if the attribute value was
     *         the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     *         <code>[a,c]</code>, then the final attribute value would be
     *         <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     *         <p><code>ADD</code> - If the attribute does not already exist, then
     *         the attribute and its values are added to the item. If the attribute
     *         does exist, then the behavior of <code>ADD</code> depends on the data
     *         type of the attribute: <ul> <li> <p>If the existing attribute is a
     *         number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     *         mathematically added to the existing attribute. If <i>Value</i> is a
     *         negative number, then it is subtracted from the existing attribute.
     *         <note> <p> If you use <code>ADD</code> to increment or decrement a
     *         number value for an item that doesn't exist before the update, Amazon
     *         DynamoDB uses 0 as the initial value. <p>In addition, if you use
     *         <code>ADD</code> to update an existing item, and intend to increment
     *         or decrement an attribute value which does not yet exist, Amazon
     *         DynamoDB uses <code>0</code> as the initial value. For example,
     *         suppose that the item you want to update does not yet have an
     *         attribute named <i>itemcount</i>, but you decide to <code>ADD</code>
     *         the number <code>3</code> to this attribute anyway, even though it
     *         currently does not exist. Amazon DynamoDB will create the
     *         <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     *         and finally add <code>3</code> to it. The result will be a new
     *         <i>itemcount</i> attribute in the item, with a value of
     *         <code>3</code>. </note> </li> <li> <p>If the existing data type is a
     *         set, and if the <i>Value</i> is also a set, then the <i>Value</i> is
     *         added to the existing set. (This is a <i>set</i> operation, not
     *         mathematical addition.) For example, if the attribute value was the
     *         set <code>[1,2]</code>, and the <code>ADD</code> action specified
     *         <code>[3]</code>, then the final attribute value would be
     *         <code>[1,2,3]</code>. An error occurs if an Add action is specified
     *         for a set attribute and the attribute type specified does not match
     *         the existing set type. <p>Both sets must have the same primitive data
     *         type. For example, if the existing data type is a set of strings, the
     *         <i>Value</i> must also be a set of strings. The same holds true for
     *         number sets and binary sets. </li> </ul> <p>This action is only valid
     *         for an existing attribute whose data type is number or is a set. Do
     *         not use <code>ADD</code> for any other data types. </li> </ul> <p>
     *         <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     *         <p><code>PUT</code> - Amazon DynamoDB creates a new item with the
     *         specified primary key, and then adds the attribute. </li> <li>
     *         <p><code>DELETE</code> - Nothing happens; there is no attribute to
     *         delete. </li> <li> <p><code>ADD</code> - Amazon DynamoDB creates an
     *         item with the supplied primary key and number (or set of numbers) for
     *         the attribute value. The only data types allowed are number and number
     *         set; no other data types can be specified. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see AttributeAction
     */
    public AttributeValueUpdate withAction(AttributeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (getAction() != null) sb.append("Action: " + getAction() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AttributeValueUpdate == false) return false;
        AttributeValueUpdate other = (AttributeValueUpdate)obj;
        
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.getAction() == null ^ this.getAction() == null) return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false) return false; 
        return true;
    }
    
}
    