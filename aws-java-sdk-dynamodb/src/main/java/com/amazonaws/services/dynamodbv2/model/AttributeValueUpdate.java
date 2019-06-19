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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * For the <code>UpdateItem</code> operation, represents the attributes to be modified, the action to perform on each,
 * and the new value for each.
 * </p>
 * <note>
 * <p>
 * You cannot use <code>UpdateItem</code> to update any primary key attributes. Instead, you will need to delete the
 * item, and then use <code>PutItem</code> to create a new item with new attributes.
 * </p>
 * </note>
 * <p>
 * Attribute values cannot be null; string and binary type attributes must have lengths greater than zero; and set type
 * attributes must not be empty. Requests with empty values will be rejected with a <code>ValidationException</code>
 * exception.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/AttributeValueUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeValueUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents the data for an attribute.
     * </p>
     * <p>
     * Each attribute value is described as a name-value pair. The name is the data type, and the value is the data
     * itself.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes"
     * >Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private AttributeValue value;
    /**
     * <p>
     * Specifies how to perform the update. Valid values are <code>PUT</code> (default), <code>DELETE</code>, and
     * <code>ADD</code>. The behavior depends on whether the specified primary key already exists in the table.
     * </p>
     * <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - Adds the specified attribute to the item. If the attribute already exists, it is replaced by
     * the new value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - If no value is specified, the attribute and its value are removed from the item. The data
     * type of the specified value must match the existing value's data type.
     * </p>
     * <p>
     * If a <i>set</i> of values is specified, then those values are subtracted from the old set. For example, if the
     * attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specified <code>[a,c]</code>,
     * then the final attribute value would be <code>[b]</code>. Specifying an empty set is an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - If the attribute does not already exist, then the attribute and its values are added to the
     * item. If the attribute does exist, then the behavior of <code>ADD</code> depends on the data type of the
     * attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the existing attribute is a number, and if <code>Value</code> is also a number, then the <code>Value</code> is
     * mathematically added to the existing attribute. If <code>Value</code> is a negative number, then it is subtracted
     * from the existing attribute.
     * </p>
     * <note>
     * <p>
     * If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the
     * update, DynamoDB uses 0 as the initial value.
     * </p>
     * <p>
     * In addition, if you use <code>ADD</code> to update an existing item, and intend to increment or decrement an
     * attribute value which does not yet exist, DynamoDB uses <code>0</code> as the initial value. For example, suppose
     * that the item you want to update does not yet have an attribute named <i>itemcount</i>, but you decide to
     * <code>ADD</code> the number <code>3</code> to this attribute anyway, even though it currently does not exist.
     * DynamoDB will create the <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add
     * <code>3</code> to it. The result will be a new <i>itemcount</i> attribute in the item, with a value of
     * <code>3</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If the existing data type is a set, and if the <code>Value</code> is also a set, then the <code>Value</code> is
     * added to the existing set. (This is a <i>set</i> operation, not mathematical addition.) For example, if the
     * attribute value was the set <code>[1,2]</code>, and the <code>ADD</code> action specified <code>[3]</code>, then
     * the final attribute value would be <code>[1,2,3]</code>. An error occurs if an Add action is specified for a set
     * attribute and the attribute type specified does not match the existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the
     * <code>Value</code> must also be a set of strings. The same holds true for number sets and binary sets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action is only valid for an existing attribute whose data type is number or is a set. Do not use
     * <code>ADD</code> for any other data types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>If no item with the specified <i>Key</i> is found:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - DynamoDB creates a new item with the specified primary key, and then adds the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - Nothing happens; there is no attribute to delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - DynamoDB creates an item with the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number set; no other data types can be specified.
     * </p>
     * </li>
     * </ul>
     */
    private String action;

    /**
     * Default constructor for AttributeValueUpdate object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public AttributeValueUpdate() {
    }

    /**
     * Constructs a new AttributeValueUpdate object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param value
     *        Represents the data for an attribute.</p>
     *        <p>
     *        Each attribute value is described as a name-value pair. The name is the data type, and the value is the
     *        data itself.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes"
     *        >Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @param action
     *        Specifies how to perform the update. Valid values are <code>PUT</code> (default), <code>DELETE</code>, and
     *        <code>ADD</code>. The behavior depends on whether the specified primary key already exists in the table.
     *        </p>
     *        <p>
     *        <b>If an item with the specified <i>Key</i> is found in the table:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - Adds the specified attribute to the item. If the attribute already exists, it is
     *        replaced by the new value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - If no value is specified, the attribute and its value are removed from the item. The
     *        data type of the specified value must match the existing value's data type.
     *        </p>
     *        <p>
     *        If a <i>set</i> of values is specified, then those values are subtracted from the old set. For example, if
     *        the attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specified
     *        <code>[a,c]</code>, then the final attribute value would be <code>[b]</code>. Specifying an empty set is
     *        an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - If the attribute does not already exist, then the attribute and its values are added to
     *        the item. If the attribute does exist, then the behavior of <code>ADD</code> depends on the data type of
     *        the attribute:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the existing attribute is a number, and if <code>Value</code> is also a number, then the
     *        <code>Value</code> is mathematically added to the existing attribute. If <code>Value</code> is a negative
     *        number, then it is subtracted from the existing attribute.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before
     *        the update, DynamoDB uses 0 as the initial value.
     *        </p>
     *        <p>
     *        In addition, if you use <code>ADD</code> to update an existing item, and intend to increment or decrement
     *        an attribute value which does not yet exist, DynamoDB uses <code>0</code> as the initial value. For
     *        example, suppose that the item you want to update does not yet have an attribute named <i>itemcount</i>,
     *        but you decide to <code>ADD</code> the number <code>3</code> to this attribute anyway, even though it
     *        currently does not exist. DynamoDB will create the <i>itemcount</i> attribute, set its initial value to
     *        <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i> attribute
     *        in the item, with a value of <code>3</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        If the existing data type is a set, and if the <code>Value</code> is also a set, then the
     *        <code>Value</code> is added to the existing set. (This is a <i>set</i> operation, not mathematical
     *        addition.) For example, if the attribute value was the set <code>[1,2]</code>, and the <code>ADD</code>
     *        action specified <code>[3]</code>, then the final attribute value would be <code>[1,2,3]</code>. An error
     *        occurs if an Add action is specified for a set attribute and the attribute type specified does not match
     *        the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, the <code>Value</code> must also be a set of strings. The same holds true for number sets and
     *        binary sets.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This action is only valid for an existing attribute whose data type is number or is a set. Do not use
     *        <code>ADD</code> for any other data types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>If no item with the specified <i>Key</i> is found:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - DynamoDB creates a new item with the specified primary key, and then adds the
     *        attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - Nothing happens; there is no attribute to delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - DynamoDB creates an item with the supplied primary key and number (or set of numbers)
     *        for the attribute value. The only data types allowed are number and number set; no other data types can be
     *        specified.
     *        </p>
     *        </li>
     */
    public AttributeValueUpdate(AttributeValue value, String action) {
        setValue(value);
        setAction(action);
    }

    /**
     * Constructs a new AttributeValueUpdate object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param value
     *        Represents the data for an attribute.</p>
     *        <p>
     *        Each attribute value is described as a name-value pair. The name is the data type, and the value is the
     *        data itself.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes"
     *        >Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @param action
     *        Specifies how to perform the update. Valid values are <code>PUT</code> (default), <code>DELETE</code>, and
     *        <code>ADD</code>. The behavior depends on whether the specified primary key already exists in the table.
     *        </p>
     *        <p>
     *        <b>If an item with the specified <i>Key</i> is found in the table:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - Adds the specified attribute to the item. If the attribute already exists, it is
     *        replaced by the new value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - If no value is specified, the attribute and its value are removed from the item. The
     *        data type of the specified value must match the existing value's data type.
     *        </p>
     *        <p>
     *        If a <i>set</i> of values is specified, then those values are subtracted from the old set. For example, if
     *        the attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specified
     *        <code>[a,c]</code>, then the final attribute value would be <code>[b]</code>. Specifying an empty set is
     *        an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - If the attribute does not already exist, then the attribute and its values are added to
     *        the item. If the attribute does exist, then the behavior of <code>ADD</code> depends on the data type of
     *        the attribute:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the existing attribute is a number, and if <code>Value</code> is also a number, then the
     *        <code>Value</code> is mathematically added to the existing attribute. If <code>Value</code> is a negative
     *        number, then it is subtracted from the existing attribute.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before
     *        the update, DynamoDB uses 0 as the initial value.
     *        </p>
     *        <p>
     *        In addition, if you use <code>ADD</code> to update an existing item, and intend to increment or decrement
     *        an attribute value which does not yet exist, DynamoDB uses <code>0</code> as the initial value. For
     *        example, suppose that the item you want to update does not yet have an attribute named <i>itemcount</i>,
     *        but you decide to <code>ADD</code> the number <code>3</code> to this attribute anyway, even though it
     *        currently does not exist. DynamoDB will create the <i>itemcount</i> attribute, set its initial value to
     *        <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i> attribute
     *        in the item, with a value of <code>3</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        If the existing data type is a set, and if the <code>Value</code> is also a set, then the
     *        <code>Value</code> is added to the existing set. (This is a <i>set</i> operation, not mathematical
     *        addition.) For example, if the attribute value was the set <code>[1,2]</code>, and the <code>ADD</code>
     *        action specified <code>[3]</code>, then the final attribute value would be <code>[1,2,3]</code>. An error
     *        occurs if an Add action is specified for a set attribute and the attribute type specified does not match
     *        the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, the <code>Value</code> must also be a set of strings. The same holds true for number sets and
     *        binary sets.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This action is only valid for an existing attribute whose data type is number or is a set. Do not use
     *        <code>ADD</code> for any other data types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>If no item with the specified <i>Key</i> is found:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - DynamoDB creates a new item with the specified primary key, and then adds the
     *        attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - Nothing happens; there is no attribute to delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - DynamoDB creates an item with the supplied primary key and number (or set of numbers)
     *        for the attribute value. The only data types allowed are number and number set; no other data types can be
     *        specified.
     *        </p>
     *        </li>
     */
    public AttributeValueUpdate(AttributeValue value, AttributeAction action) {
        setValue(value);
        setAction(action.toString());
    }

    /**
     * <p>
     * Represents the data for an attribute.
     * </p>
     * <p>
     * Each attribute value is described as a name-value pair. The name is the data type, and the value is the data
     * itself.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes"
     * >Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param value
     *        Represents the data for an attribute.</p>
     *        <p>
     *        Each attribute value is described as a name-value pair. The name is the data type, and the value is the
     *        data itself.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes"
     *        >Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setValue(AttributeValue value) {
        this.value = value;
    }

    /**
     * <p>
     * Represents the data for an attribute.
     * </p>
     * <p>
     * Each attribute value is described as a name-value pair. The name is the data type, and the value is the data
     * itself.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes"
     * >Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return Represents the data for an attribute.</p>
     *         <p>
     *         Each attribute value is described as a name-value pair. The name is the data type, and the value is the
     *         data itself.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes"
     *         >Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public AttributeValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * Represents the data for an attribute.
     * </p>
     * <p>
     * Each attribute value is described as a name-value pair. The name is the data type, and the value is the data
     * itself.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes"
     * >Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param value
     *        Represents the data for an attribute.</p>
     *        <p>
     *        Each attribute value is described as a name-value pair. The name is the data type, and the value is the
     *        data itself.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes"
     *        >Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValueUpdate withValue(AttributeValue value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Specifies how to perform the update. Valid values are <code>PUT</code> (default), <code>DELETE</code>, and
     * <code>ADD</code>. The behavior depends on whether the specified primary key already exists in the table.
     * </p>
     * <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - Adds the specified attribute to the item. If the attribute already exists, it is replaced by
     * the new value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - If no value is specified, the attribute and its value are removed from the item. The data
     * type of the specified value must match the existing value's data type.
     * </p>
     * <p>
     * If a <i>set</i> of values is specified, then those values are subtracted from the old set. For example, if the
     * attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specified <code>[a,c]</code>,
     * then the final attribute value would be <code>[b]</code>. Specifying an empty set is an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - If the attribute does not already exist, then the attribute and its values are added to the
     * item. If the attribute does exist, then the behavior of <code>ADD</code> depends on the data type of the
     * attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the existing attribute is a number, and if <code>Value</code> is also a number, then the <code>Value</code> is
     * mathematically added to the existing attribute. If <code>Value</code> is a negative number, then it is subtracted
     * from the existing attribute.
     * </p>
     * <note>
     * <p>
     * If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the
     * update, DynamoDB uses 0 as the initial value.
     * </p>
     * <p>
     * In addition, if you use <code>ADD</code> to update an existing item, and intend to increment or decrement an
     * attribute value which does not yet exist, DynamoDB uses <code>0</code> as the initial value. For example, suppose
     * that the item you want to update does not yet have an attribute named <i>itemcount</i>, but you decide to
     * <code>ADD</code> the number <code>3</code> to this attribute anyway, even though it currently does not exist.
     * DynamoDB will create the <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add
     * <code>3</code> to it. The result will be a new <i>itemcount</i> attribute in the item, with a value of
     * <code>3</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If the existing data type is a set, and if the <code>Value</code> is also a set, then the <code>Value</code> is
     * added to the existing set. (This is a <i>set</i> operation, not mathematical addition.) For example, if the
     * attribute value was the set <code>[1,2]</code>, and the <code>ADD</code> action specified <code>[3]</code>, then
     * the final attribute value would be <code>[1,2,3]</code>. An error occurs if an Add action is specified for a set
     * attribute and the attribute type specified does not match the existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the
     * <code>Value</code> must also be a set of strings. The same holds true for number sets and binary sets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action is only valid for an existing attribute whose data type is number or is a set. Do not use
     * <code>ADD</code> for any other data types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>If no item with the specified <i>Key</i> is found:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - DynamoDB creates a new item with the specified primary key, and then adds the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - Nothing happens; there is no attribute to delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - DynamoDB creates an item with the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number set; no other data types can be specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Specifies how to perform the update. Valid values are <code>PUT</code> (default), <code>DELETE</code>, and
     *        <code>ADD</code>. The behavior depends on whether the specified primary key already exists in the
     *        table.</p>
     *        <p>
     *        <b>If an item with the specified <i>Key</i> is found in the table:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - Adds the specified attribute to the item. If the attribute already exists, it is
     *        replaced by the new value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - If no value is specified, the attribute and its value are removed from the item. The
     *        data type of the specified value must match the existing value's data type.
     *        </p>
     *        <p>
     *        If a <i>set</i> of values is specified, then those values are subtracted from the old set. For example, if
     *        the attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specified
     *        <code>[a,c]</code>, then the final attribute value would be <code>[b]</code>. Specifying an empty set is
     *        an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - If the attribute does not already exist, then the attribute and its values are added to
     *        the item. If the attribute does exist, then the behavior of <code>ADD</code> depends on the data type of
     *        the attribute:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the existing attribute is a number, and if <code>Value</code> is also a number, then the
     *        <code>Value</code> is mathematically added to the existing attribute. If <code>Value</code> is a negative
     *        number, then it is subtracted from the existing attribute.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before
     *        the update, DynamoDB uses 0 as the initial value.
     *        </p>
     *        <p>
     *        In addition, if you use <code>ADD</code> to update an existing item, and intend to increment or decrement
     *        an attribute value which does not yet exist, DynamoDB uses <code>0</code> as the initial value. For
     *        example, suppose that the item you want to update does not yet have an attribute named <i>itemcount</i>,
     *        but you decide to <code>ADD</code> the number <code>3</code> to this attribute anyway, even though it
     *        currently does not exist. DynamoDB will create the <i>itemcount</i> attribute, set its initial value to
     *        <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i> attribute
     *        in the item, with a value of <code>3</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        If the existing data type is a set, and if the <code>Value</code> is also a set, then the
     *        <code>Value</code> is added to the existing set. (This is a <i>set</i> operation, not mathematical
     *        addition.) For example, if the attribute value was the set <code>[1,2]</code>, and the <code>ADD</code>
     *        action specified <code>[3]</code>, then the final attribute value would be <code>[1,2,3]</code>. An error
     *        occurs if an Add action is specified for a set attribute and the attribute type specified does not match
     *        the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, the <code>Value</code> must also be a set of strings. The same holds true for number sets and
     *        binary sets.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This action is only valid for an existing attribute whose data type is number or is a set. Do not use
     *        <code>ADD</code> for any other data types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>If no item with the specified <i>Key</i> is found:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - DynamoDB creates a new item with the specified primary key, and then adds the
     *        attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - Nothing happens; there is no attribute to delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - DynamoDB creates an item with the supplied primary key and number (or set of numbers)
     *        for the attribute value. The only data types allowed are number and number set; no other data types can be
     *        specified.
     *        </p>
     *        </li>
     * @see AttributeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies how to perform the update. Valid values are <code>PUT</code> (default), <code>DELETE</code>, and
     * <code>ADD</code>. The behavior depends on whether the specified primary key already exists in the table.
     * </p>
     * <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - Adds the specified attribute to the item. If the attribute already exists, it is replaced by
     * the new value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - If no value is specified, the attribute and its value are removed from the item. The data
     * type of the specified value must match the existing value's data type.
     * </p>
     * <p>
     * If a <i>set</i> of values is specified, then those values are subtracted from the old set. For example, if the
     * attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specified <code>[a,c]</code>,
     * then the final attribute value would be <code>[b]</code>. Specifying an empty set is an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - If the attribute does not already exist, then the attribute and its values are added to the
     * item. If the attribute does exist, then the behavior of <code>ADD</code> depends on the data type of the
     * attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the existing attribute is a number, and if <code>Value</code> is also a number, then the <code>Value</code> is
     * mathematically added to the existing attribute. If <code>Value</code> is a negative number, then it is subtracted
     * from the existing attribute.
     * </p>
     * <note>
     * <p>
     * If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the
     * update, DynamoDB uses 0 as the initial value.
     * </p>
     * <p>
     * In addition, if you use <code>ADD</code> to update an existing item, and intend to increment or decrement an
     * attribute value which does not yet exist, DynamoDB uses <code>0</code> as the initial value. For example, suppose
     * that the item you want to update does not yet have an attribute named <i>itemcount</i>, but you decide to
     * <code>ADD</code> the number <code>3</code> to this attribute anyway, even though it currently does not exist.
     * DynamoDB will create the <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add
     * <code>3</code> to it. The result will be a new <i>itemcount</i> attribute in the item, with a value of
     * <code>3</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If the existing data type is a set, and if the <code>Value</code> is also a set, then the <code>Value</code> is
     * added to the existing set. (This is a <i>set</i> operation, not mathematical addition.) For example, if the
     * attribute value was the set <code>[1,2]</code>, and the <code>ADD</code> action specified <code>[3]</code>, then
     * the final attribute value would be <code>[1,2,3]</code>. An error occurs if an Add action is specified for a set
     * attribute and the attribute type specified does not match the existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the
     * <code>Value</code> must also be a set of strings. The same holds true for number sets and binary sets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action is only valid for an existing attribute whose data type is number or is a set. Do not use
     * <code>ADD</code> for any other data types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>If no item with the specified <i>Key</i> is found:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - DynamoDB creates a new item with the specified primary key, and then adds the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - Nothing happens; there is no attribute to delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - DynamoDB creates an item with the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number set; no other data types can be specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies how to perform the update. Valid values are <code>PUT</code> (default), <code>DELETE</code>,
     *         and <code>ADD</code>. The behavior depends on whether the specified primary key already exists in the
     *         table.</p>
     *         <p>
     *         <b>If an item with the specified <i>Key</i> is found in the table:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PUT</code> - Adds the specified attribute to the item. If the attribute already exists, it is
     *         replaced by the new value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE</code> - If no value is specified, the attribute and its value are removed from the item.
     *         The data type of the specified value must match the existing value's data type.
     *         </p>
     *         <p>
     *         If a <i>set</i> of values is specified, then those values are subtracted from the old set. For example,
     *         if the attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specified
     *         <code>[a,c]</code>, then the final attribute value would be <code>[b]</code>. Specifying an empty set is
     *         an error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADD</code> - If the attribute does not already exist, then the attribute and its values are added
     *         to the item. If the attribute does exist, then the behavior of <code>ADD</code> depends on the data type
     *         of the attribute:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the existing attribute is a number, and if <code>Value</code> is also a number, then the
     *         <code>Value</code> is mathematically added to the existing attribute. If <code>Value</code> is a negative
     *         number, then it is subtracted from the existing attribute.
     *         </p>
     *         <note>
     *         <p>
     *         If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist
     *         before the update, DynamoDB uses 0 as the initial value.
     *         </p>
     *         <p>
     *         In addition, if you use <code>ADD</code> to update an existing item, and intend to increment or decrement
     *         an attribute value which does not yet exist, DynamoDB uses <code>0</code> as the initial value. For
     *         example, suppose that the item you want to update does not yet have an attribute named <i>itemcount</i>,
     *         but you decide to <code>ADD</code> the number <code>3</code> to this attribute anyway, even though it
     *         currently does not exist. DynamoDB will create the <i>itemcount</i> attribute, set its initial value to
     *         <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i> attribute
     *         in the item, with a value of <code>3</code>.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         If the existing data type is a set, and if the <code>Value</code> is also a set, then the
     *         <code>Value</code> is added to the existing set. (This is a <i>set</i> operation, not mathematical
     *         addition.) For example, if the attribute value was the set <code>[1,2]</code>, and the <code>ADD</code>
     *         action specified <code>[3]</code>, then the final attribute value would be <code>[1,2,3]</code>. An error
     *         occurs if an Add action is specified for a set attribute and the attribute type specified does not match
     *         the existing set type.
     *         </p>
     *         <p>
     *         Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *         strings, the <code>Value</code> must also be a set of strings. The same holds true for number sets and
     *         binary sets.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This action is only valid for an existing attribute whose data type is number or is a set. Do not use
     *         <code>ADD</code> for any other data types.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>If no item with the specified <i>Key</i> is found:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PUT</code> - DynamoDB creates a new item with the specified primary key, and then adds the
     *         attribute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE</code> - Nothing happens; there is no attribute to delete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADD</code> - DynamoDB creates an item with the supplied primary key and number (or set of numbers)
     *         for the attribute value. The only data types allowed are number and number set; no other data types can
     *         be specified.
     *         </p>
     *         </li>
     * @see AttributeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies how to perform the update. Valid values are <code>PUT</code> (default), <code>DELETE</code>, and
     * <code>ADD</code>. The behavior depends on whether the specified primary key already exists in the table.
     * </p>
     * <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - Adds the specified attribute to the item. If the attribute already exists, it is replaced by
     * the new value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - If no value is specified, the attribute and its value are removed from the item. The data
     * type of the specified value must match the existing value's data type.
     * </p>
     * <p>
     * If a <i>set</i> of values is specified, then those values are subtracted from the old set. For example, if the
     * attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specified <code>[a,c]</code>,
     * then the final attribute value would be <code>[b]</code>. Specifying an empty set is an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - If the attribute does not already exist, then the attribute and its values are added to the
     * item. If the attribute does exist, then the behavior of <code>ADD</code> depends on the data type of the
     * attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the existing attribute is a number, and if <code>Value</code> is also a number, then the <code>Value</code> is
     * mathematically added to the existing attribute. If <code>Value</code> is a negative number, then it is subtracted
     * from the existing attribute.
     * </p>
     * <note>
     * <p>
     * If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the
     * update, DynamoDB uses 0 as the initial value.
     * </p>
     * <p>
     * In addition, if you use <code>ADD</code> to update an existing item, and intend to increment or decrement an
     * attribute value which does not yet exist, DynamoDB uses <code>0</code> as the initial value. For example, suppose
     * that the item you want to update does not yet have an attribute named <i>itemcount</i>, but you decide to
     * <code>ADD</code> the number <code>3</code> to this attribute anyway, even though it currently does not exist.
     * DynamoDB will create the <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add
     * <code>3</code> to it. The result will be a new <i>itemcount</i> attribute in the item, with a value of
     * <code>3</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If the existing data type is a set, and if the <code>Value</code> is also a set, then the <code>Value</code> is
     * added to the existing set. (This is a <i>set</i> operation, not mathematical addition.) For example, if the
     * attribute value was the set <code>[1,2]</code>, and the <code>ADD</code> action specified <code>[3]</code>, then
     * the final attribute value would be <code>[1,2,3]</code>. An error occurs if an Add action is specified for a set
     * attribute and the attribute type specified does not match the existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the
     * <code>Value</code> must also be a set of strings. The same holds true for number sets and binary sets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action is only valid for an existing attribute whose data type is number or is a set. Do not use
     * <code>ADD</code> for any other data types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>If no item with the specified <i>Key</i> is found:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - DynamoDB creates a new item with the specified primary key, and then adds the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - Nothing happens; there is no attribute to delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - DynamoDB creates an item with the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number set; no other data types can be specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Specifies how to perform the update. Valid values are <code>PUT</code> (default), <code>DELETE</code>, and
     *        <code>ADD</code>. The behavior depends on whether the specified primary key already exists in the
     *        table.</p>
     *        <p>
     *        <b>If an item with the specified <i>Key</i> is found in the table:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - Adds the specified attribute to the item. If the attribute already exists, it is
     *        replaced by the new value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - If no value is specified, the attribute and its value are removed from the item. The
     *        data type of the specified value must match the existing value's data type.
     *        </p>
     *        <p>
     *        If a <i>set</i> of values is specified, then those values are subtracted from the old set. For example, if
     *        the attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specified
     *        <code>[a,c]</code>, then the final attribute value would be <code>[b]</code>. Specifying an empty set is
     *        an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - If the attribute does not already exist, then the attribute and its values are added to
     *        the item. If the attribute does exist, then the behavior of <code>ADD</code> depends on the data type of
     *        the attribute:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the existing attribute is a number, and if <code>Value</code> is also a number, then the
     *        <code>Value</code> is mathematically added to the existing attribute. If <code>Value</code> is a negative
     *        number, then it is subtracted from the existing attribute.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before
     *        the update, DynamoDB uses 0 as the initial value.
     *        </p>
     *        <p>
     *        In addition, if you use <code>ADD</code> to update an existing item, and intend to increment or decrement
     *        an attribute value which does not yet exist, DynamoDB uses <code>0</code> as the initial value. For
     *        example, suppose that the item you want to update does not yet have an attribute named <i>itemcount</i>,
     *        but you decide to <code>ADD</code> the number <code>3</code> to this attribute anyway, even though it
     *        currently does not exist. DynamoDB will create the <i>itemcount</i> attribute, set its initial value to
     *        <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i> attribute
     *        in the item, with a value of <code>3</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        If the existing data type is a set, and if the <code>Value</code> is also a set, then the
     *        <code>Value</code> is added to the existing set. (This is a <i>set</i> operation, not mathematical
     *        addition.) For example, if the attribute value was the set <code>[1,2]</code>, and the <code>ADD</code>
     *        action specified <code>[3]</code>, then the final attribute value would be <code>[1,2,3]</code>. An error
     *        occurs if an Add action is specified for a set attribute and the attribute type specified does not match
     *        the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, the <code>Value</code> must also be a set of strings. The same holds true for number sets and
     *        binary sets.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This action is only valid for an existing attribute whose data type is number or is a set. Do not use
     *        <code>ADD</code> for any other data types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>If no item with the specified <i>Key</i> is found:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - DynamoDB creates a new item with the specified primary key, and then adds the
     *        attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - Nothing happens; there is no attribute to delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - DynamoDB creates an item with the supplied primary key and number (or set of numbers)
     *        for the attribute value. The only data types allowed are number and number set; no other data types can be
     *        specified.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeAction
     */

    public AttributeValueUpdate withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies how to perform the update. Valid values are <code>PUT</code> (default), <code>DELETE</code>, and
     * <code>ADD</code>. The behavior depends on whether the specified primary key already exists in the table.
     * </p>
     * <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - Adds the specified attribute to the item. If the attribute already exists, it is replaced by
     * the new value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - If no value is specified, the attribute and its value are removed from the item. The data
     * type of the specified value must match the existing value's data type.
     * </p>
     * <p>
     * If a <i>set</i> of values is specified, then those values are subtracted from the old set. For example, if the
     * attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specified <code>[a,c]</code>,
     * then the final attribute value would be <code>[b]</code>. Specifying an empty set is an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - If the attribute does not already exist, then the attribute and its values are added to the
     * item. If the attribute does exist, then the behavior of <code>ADD</code> depends on the data type of the
     * attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the existing attribute is a number, and if <code>Value</code> is also a number, then the <code>Value</code> is
     * mathematically added to the existing attribute. If <code>Value</code> is a negative number, then it is subtracted
     * from the existing attribute.
     * </p>
     * <note>
     * <p>
     * If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the
     * update, DynamoDB uses 0 as the initial value.
     * </p>
     * <p>
     * In addition, if you use <code>ADD</code> to update an existing item, and intend to increment or decrement an
     * attribute value which does not yet exist, DynamoDB uses <code>0</code> as the initial value. For example, suppose
     * that the item you want to update does not yet have an attribute named <i>itemcount</i>, but you decide to
     * <code>ADD</code> the number <code>3</code> to this attribute anyway, even though it currently does not exist.
     * DynamoDB will create the <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add
     * <code>3</code> to it. The result will be a new <i>itemcount</i> attribute in the item, with a value of
     * <code>3</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If the existing data type is a set, and if the <code>Value</code> is also a set, then the <code>Value</code> is
     * added to the existing set. (This is a <i>set</i> operation, not mathematical addition.) For example, if the
     * attribute value was the set <code>[1,2]</code>, and the <code>ADD</code> action specified <code>[3]</code>, then
     * the final attribute value would be <code>[1,2,3]</code>. An error occurs if an Add action is specified for a set
     * attribute and the attribute type specified does not match the existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the
     * <code>Value</code> must also be a set of strings. The same holds true for number sets and binary sets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action is only valid for an existing attribute whose data type is number or is a set. Do not use
     * <code>ADD</code> for any other data types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>If no item with the specified <i>Key</i> is found:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - DynamoDB creates a new item with the specified primary key, and then adds the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - Nothing happens; there is no attribute to delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - DynamoDB creates an item with the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number set; no other data types can be specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Specifies how to perform the update. Valid values are <code>PUT</code> (default), <code>DELETE</code>, and
     *        <code>ADD</code>. The behavior depends on whether the specified primary key already exists in the
     *        table.</p>
     *        <p>
     *        <b>If an item with the specified <i>Key</i> is found in the table:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - Adds the specified attribute to the item. If the attribute already exists, it is
     *        replaced by the new value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - If no value is specified, the attribute and its value are removed from the item. The
     *        data type of the specified value must match the existing value's data type.
     *        </p>
     *        <p>
     *        If a <i>set</i> of values is specified, then those values are subtracted from the old set. For example, if
     *        the attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specified
     *        <code>[a,c]</code>, then the final attribute value would be <code>[b]</code>. Specifying an empty set is
     *        an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - If the attribute does not already exist, then the attribute and its values are added to
     *        the item. If the attribute does exist, then the behavior of <code>ADD</code> depends on the data type of
     *        the attribute:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the existing attribute is a number, and if <code>Value</code> is also a number, then the
     *        <code>Value</code> is mathematically added to the existing attribute. If <code>Value</code> is a negative
     *        number, then it is subtracted from the existing attribute.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before
     *        the update, DynamoDB uses 0 as the initial value.
     *        </p>
     *        <p>
     *        In addition, if you use <code>ADD</code> to update an existing item, and intend to increment or decrement
     *        an attribute value which does not yet exist, DynamoDB uses <code>0</code> as the initial value. For
     *        example, suppose that the item you want to update does not yet have an attribute named <i>itemcount</i>,
     *        but you decide to <code>ADD</code> the number <code>3</code> to this attribute anyway, even though it
     *        currently does not exist. DynamoDB will create the <i>itemcount</i> attribute, set its initial value to
     *        <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i> attribute
     *        in the item, with a value of <code>3</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        If the existing data type is a set, and if the <code>Value</code> is also a set, then the
     *        <code>Value</code> is added to the existing set. (This is a <i>set</i> operation, not mathematical
     *        addition.) For example, if the attribute value was the set <code>[1,2]</code>, and the <code>ADD</code>
     *        action specified <code>[3]</code>, then the final attribute value would be <code>[1,2,3]</code>. An error
     *        occurs if an Add action is specified for a set attribute and the attribute type specified does not match
     *        the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, the <code>Value</code> must also be a set of strings. The same holds true for number sets and
     *        binary sets.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This action is only valid for an existing attribute whose data type is number or is a set. Do not use
     *        <code>ADD</code> for any other data types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>If no item with the specified <i>Key</i> is found:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - DynamoDB creates a new item with the specified primary key, and then adds the
     *        attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - Nothing happens; there is no attribute to delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - DynamoDB creates an item with the supplied primary key and number (or set of numbers)
     *        for the attribute value. The only data types allowed are number and number set; no other data types can be
     *        specified.
     *        </p>
     *        </li>
     * @see AttributeAction
     */

    public void setAction(AttributeAction action) {
        withAction(action);
    }

    /**
     * <p>
     * Specifies how to perform the update. Valid values are <code>PUT</code> (default), <code>DELETE</code>, and
     * <code>ADD</code>. The behavior depends on whether the specified primary key already exists in the table.
     * </p>
     * <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - Adds the specified attribute to the item. If the attribute already exists, it is replaced by
     * the new value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - If no value is specified, the attribute and its value are removed from the item. The data
     * type of the specified value must match the existing value's data type.
     * </p>
     * <p>
     * If a <i>set</i> of values is specified, then those values are subtracted from the old set. For example, if the
     * attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specified <code>[a,c]</code>,
     * then the final attribute value would be <code>[b]</code>. Specifying an empty set is an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - If the attribute does not already exist, then the attribute and its values are added to the
     * item. If the attribute does exist, then the behavior of <code>ADD</code> depends on the data type of the
     * attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the existing attribute is a number, and if <code>Value</code> is also a number, then the <code>Value</code> is
     * mathematically added to the existing attribute. If <code>Value</code> is a negative number, then it is subtracted
     * from the existing attribute.
     * </p>
     * <note>
     * <p>
     * If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the
     * update, DynamoDB uses 0 as the initial value.
     * </p>
     * <p>
     * In addition, if you use <code>ADD</code> to update an existing item, and intend to increment or decrement an
     * attribute value which does not yet exist, DynamoDB uses <code>0</code> as the initial value. For example, suppose
     * that the item you want to update does not yet have an attribute named <i>itemcount</i>, but you decide to
     * <code>ADD</code> the number <code>3</code> to this attribute anyway, even though it currently does not exist.
     * DynamoDB will create the <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add
     * <code>3</code> to it. The result will be a new <i>itemcount</i> attribute in the item, with a value of
     * <code>3</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If the existing data type is a set, and if the <code>Value</code> is also a set, then the <code>Value</code> is
     * added to the existing set. (This is a <i>set</i> operation, not mathematical addition.) For example, if the
     * attribute value was the set <code>[1,2]</code>, and the <code>ADD</code> action specified <code>[3]</code>, then
     * the final attribute value would be <code>[1,2,3]</code>. An error occurs if an Add action is specified for a set
     * attribute and the attribute type specified does not match the existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the
     * <code>Value</code> must also be a set of strings. The same holds true for number sets and binary sets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action is only valid for an existing attribute whose data type is number or is a set. Do not use
     * <code>ADD</code> for any other data types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>If no item with the specified <i>Key</i> is found:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - DynamoDB creates a new item with the specified primary key, and then adds the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - Nothing happens; there is no attribute to delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - DynamoDB creates an item with the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number set; no other data types can be specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Specifies how to perform the update. Valid values are <code>PUT</code> (default), <code>DELETE</code>, and
     *        <code>ADD</code>. The behavior depends on whether the specified primary key already exists in the
     *        table.</p>
     *        <p>
     *        <b>If an item with the specified <i>Key</i> is found in the table:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - Adds the specified attribute to the item. If the attribute already exists, it is
     *        replaced by the new value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - If no value is specified, the attribute and its value are removed from the item. The
     *        data type of the specified value must match the existing value's data type.
     *        </p>
     *        <p>
     *        If a <i>set</i> of values is specified, then those values are subtracted from the old set. For example, if
     *        the attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specified
     *        <code>[a,c]</code>, then the final attribute value would be <code>[b]</code>. Specifying an empty set is
     *        an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - If the attribute does not already exist, then the attribute and its values are added to
     *        the item. If the attribute does exist, then the behavior of <code>ADD</code> depends on the data type of
     *        the attribute:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the existing attribute is a number, and if <code>Value</code> is also a number, then the
     *        <code>Value</code> is mathematically added to the existing attribute. If <code>Value</code> is a negative
     *        number, then it is subtracted from the existing attribute.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before
     *        the update, DynamoDB uses 0 as the initial value.
     *        </p>
     *        <p>
     *        In addition, if you use <code>ADD</code> to update an existing item, and intend to increment or decrement
     *        an attribute value which does not yet exist, DynamoDB uses <code>0</code> as the initial value. For
     *        example, suppose that the item you want to update does not yet have an attribute named <i>itemcount</i>,
     *        but you decide to <code>ADD</code> the number <code>3</code> to this attribute anyway, even though it
     *        currently does not exist. DynamoDB will create the <i>itemcount</i> attribute, set its initial value to
     *        <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i> attribute
     *        in the item, with a value of <code>3</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        If the existing data type is a set, and if the <code>Value</code> is also a set, then the
     *        <code>Value</code> is added to the existing set. (This is a <i>set</i> operation, not mathematical
     *        addition.) For example, if the attribute value was the set <code>[1,2]</code>, and the <code>ADD</code>
     *        action specified <code>[3]</code>, then the final attribute value would be <code>[1,2,3]</code>. An error
     *        occurs if an Add action is specified for a set attribute and the attribute type specified does not match
     *        the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, the <code>Value</code> must also be a set of strings. The same holds true for number sets and
     *        binary sets.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This action is only valid for an existing attribute whose data type is number or is a set. Do not use
     *        <code>ADD</code> for any other data types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>If no item with the specified <i>Key</i> is found:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - DynamoDB creates a new item with the specified primary key, and then adds the
     *        attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - Nothing happens; there is no attribute to delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - DynamoDB creates an item with the supplied primary key and number (or set of numbers)
     *        for the attribute value. The only data types allowed are number and number set; no other data types can be
     *        specified.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeAction
     */

    public AttributeValueUpdate withAction(AttributeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeValueUpdate == false)
            return false;
        AttributeValueUpdate other = (AttributeValueUpdate) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
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
    public AttributeValueUpdate clone() {
        try {
            return (AttributeValueUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.AttributeValueUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
