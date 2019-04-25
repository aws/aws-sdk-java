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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of an <code>UpdateItem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the table containing the item to update.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     * attribute.
     * </p>
     * <p>
     * For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only
     * need to provide a value for the partition key. For a composite primary key, you must provide values for both the
     * partition key and the sort key.
     * </p>
     */
    private java.util.Map<String, AttributeValue> key;
    /**
     * <p>
     * This is a legacy parameter. Use <code>UpdateExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributeUpdates.html"
     * >AttributeUpdates</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, AttributeValueUpdate> attributeUpdates;
    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     * >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, ExpectedAttributeValue> expected;
    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private String conditionalOperator;
    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as they appear before or after they are
     * updated. For <code>UpdateItem</code>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>, then
     * nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - Returns all of the attributes of the item, as they appeared before the UpdateItem
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OLD</code> - Returns only the updated attributes, as they appeared before the UpdateItem operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_NEW</code> - Returns all of the attributes of the item, as they appear after the UpdateItem operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_NEW</code> - Returns only the updated attributes, as they appear after the UpdateItem operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is no additional cost associated with requesting a return value aside from the small network and processing
     * overhead of receiving a larger response. No read capacity units are consumed.
     * </p>
     * <p>
     * The values returned are strongly consistent.
     * </p>
     */
    private String returnValues;

    private String returnConsumedCapacity;
    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during the operation are returned in the response.
     * If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     */
    private String returnItemCollectionMetrics;
    /**
     * <p>
     * An expression that defines one or more attributes to be updated, the action to be performed on them, and new
     * value(s) for them.
     * </p>
     * <p>
     * The following action values are available for <code>UpdateExpression</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SET</code> - Adds one or more attributes and values to an item. If any of these attribute already exist,
     * they are replaced by the new values. You can also use <code>SET</code> to add or subtract from an attribute that
     * is of type Number. For example: <code>SET myNum = myNum + :val</code>
     * </p>
     * <p>
     * <code>SET</code> supports the following functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>if_not_exists (path, operand)</code> - if the item does not contain an attribute at the specified path,
     * then <code>if_not_exists</code> evaluates to operand; otherwise, it evaluates to path. You can use this function
     * to avoid overwriting an attribute that may already be present in the item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>list_append (operand, operand)</code> - evaluates to a list with a new element added to it. You can append
     * the new element to the start or the end of the list by reversing the order of the operands.
     * </p>
     * </li>
     * </ul>
     * <p>
     * These function names are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - Removes one or more attributes from an item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - Adds the specified value to the item, if the attribute does not already exist. If the
     * attribute does exist, then the behavior of <code>ADD</code> depends on the data type of the attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the existing attribute is a number, and if <code>Value</code> is also a number, then <code>Value</code> is
     * mathematically added to the existing attribute. If <code>Value</code> is a negative number, then it is subtracted
     * from the existing attribute.
     * </p>
     * <note>
     * <p>
     * If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the
     * update, DynamoDB uses <code>0</code> as the initial value.
     * </p>
     * <p>
     * Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value that
     * doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example, suppose that the
     * item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide to <code>ADD</code> the
     * number <code>3</code> to this attribute anyway. DynamoDB will create the <i>itemcount</i> attribute, set its
     * initial value to <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i>
     * attribute in the item, with a value of <code>3</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If the existing data type is a set and if <code>Value</code> is also a set, then <code>Value</code> is added to
     * the existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code>
     * action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs if an
     * <code>ADD</code> action is specified for a set attribute and the attribute type specified does not match the
     * existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the
     * <code>Value</code> must also be a set of strings.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * The <code>ADD</code> action only supports Number and set data types. In addition, <code>ADD</code> can only be
     * used on top-level attributes, not nested attributes.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>DELETE</code> - Deletes an element from a set.
     * </p>
     * <p>
     * If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute
     * value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies <code>[a,c]</code>, then the
     * final attribute value is <code>[b]</code>. Specifying an empty set is an error.
     * </p>
     * <important>
     * <p>
     * The <code>DELETE</code> action only supports set data types. In addition, <code>DELETE</code> can only be used on
     * top-level attributes, not nested attributes.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * You can have many actions in a single expression, such as the following:
     * <code>SET a=:value1, b=:value2 DELETE :value3, :value4, :value5</code>
     * </p>
     * <p>
     * For more information on update expressions, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html">Modifying
     * Items and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private String updateExpression;
    /**
     * <p>
     * A condition that must be satisfied in order for a conditional update to succeed.
     * </p>
     * <p>
     * An expression can contain any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Functions: <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code>
     * </p>
     * <p>
     * These function names are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Comparison operators: <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Logical operators: <code>AND | OR | NOT</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on condition expressions, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private String conditionExpression;
    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The following are some use cases for using
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To access an attribute whose name conflicts with a DynamoDB reserved word.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a placeholder for repeating occurrences of an attribute name in an expression.
     * </p>
     * </li>
     * <li>
     * <p>
     * To prevent special characters in an attribute name from being misinterpreted in an expression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the following
     * attribute name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Percentile</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For
     * the complete list of reserved words, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>{"#P":"Percentile"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You could then use this substitution in an expression, as in this example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#P = :val</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are placeholders for
     * the actual value at runtime.
     * </p>
     * </note>
     * <p>
     * For more information on expression attribute names, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> expressionAttributeNames;
    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * Use the <b>:</b> (colon) character in an expression to dereference an attribute value. For example, suppose that
     * you wanted to check whether the value of the <i>ProductStatus</i> attribute was one of the following:
     * </p>
     * <p>
     * <code>Available | Backordered | Discontinued</code>
     * </p>
     * <p>
     * You would first need to specify <code>ExpressionAttributeValues</code> as follows:
     * </p>
     * <p>
     * <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     * </p>
     * <p>
     * You could then use these values in an expression, such as this:
     * </p>
     * <p>
     * <code>ProductStatus IN (:avail, :back, :disc)</code>
     * </p>
     * <p>
     * For more information on expression attribute values, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, AttributeValue> expressionAttributeValues;

    /**
     * Default constructor for UpdateItemRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public UpdateItemRequest() {
    }

    /**
     * Constructs a new UpdateItemRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     *        The name of the table containing the item to update.
     * @param key
     *        The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     *        attribute.</p>
     *        <p>
     *        For the primary key, you must provide all of the attributes. For example, with a simple primary key, you
     *        only need to provide a value for the partition key. For a composite primary key, you must provide values
     *        for both the partition key and the sort key.
     * @param attributeUpdates
     *        This is a legacy parameter. Use <code>UpdateExpression</code> instead. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributeUpdates.html"
     *        >AttributeUpdates</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public UpdateItemRequest(String tableName, java.util.Map<String, AttributeValue> key, java.util.Map<String, AttributeValueUpdate> attributeUpdates) {
        setTableName(tableName);
        setKey(key);
        setAttributeUpdates(attributeUpdates);
    }

    /**
     * Constructs a new UpdateItemRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     *        The name of the table containing the item to update.
     * @param key
     *        The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     *        attribute.</p>
     *        <p>
     *        For the primary key, you must provide all of the attributes. For example, with a simple primary key, you
     *        only need to provide a value for the partition key. For a composite primary key, you must provide values
     *        for both the partition key and the sort key.
     * @param attributeUpdates
     *        This is a legacy parameter. Use <code>UpdateExpression</code> instead. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributeUpdates.html"
     *        >AttributeUpdates</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @param returnValues
     *        Use <code>ReturnValues</code> if you want to get the item attributes as they appear before or after they
     *        are updated. For <code>UpdateItem</code>, the valid values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>,
     *        then nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - Returns all of the attributes of the item, as they appeared before the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OLD</code> - Returns only the updated attributes, as they appeared before the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_NEW</code> - Returns all of the attributes of the item, as they appear after the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_NEW</code> - Returns only the updated attributes, as they appear after the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is no additional cost associated with requesting a return value aside from the small network and
     *        processing overhead of receiving a larger response. No read capacity units are consumed.
     *        </p>
     *        <p>
     *        The values returned are strongly consistent.
     */
    public UpdateItemRequest(String tableName, java.util.Map<String, AttributeValue> key, java.util.Map<String, AttributeValueUpdate> attributeUpdates,
            String returnValues) {
        setTableName(tableName);
        setKey(key);
        setAttributeUpdates(attributeUpdates);
        setReturnValues(returnValues);
    }

    /**
     * Constructs a new UpdateItemRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     *        The name of the table containing the item to update.
     * @param key
     *        The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     *        attribute.</p>
     *        <p>
     *        For the primary key, you must provide all of the attributes. For example, with a simple primary key, you
     *        only need to provide a value for the partition key. For a composite primary key, you must provide values
     *        for both the partition key and the sort key.
     * @param attributeUpdates
     *        This is a legacy parameter. Use <code>UpdateExpression</code> instead. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributeUpdates.html"
     *        >AttributeUpdates</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @param returnValues
     *        Use <code>ReturnValues</code> if you want to get the item attributes as they appear before or after they
     *        are updated. For <code>UpdateItem</code>, the valid values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>,
     *        then nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - Returns all of the attributes of the item, as they appeared before the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OLD</code> - Returns only the updated attributes, as they appeared before the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_NEW</code> - Returns all of the attributes of the item, as they appear after the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_NEW</code> - Returns only the updated attributes, as they appear after the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is no additional cost associated with requesting a return value aside from the small network and
     *        processing overhead of receiving a larger response. No read capacity units are consumed.
     *        </p>
     *        <p>
     *        The values returned are strongly consistent.
     */
    public UpdateItemRequest(String tableName, java.util.Map<String, AttributeValue> key, java.util.Map<String, AttributeValueUpdate> attributeUpdates,
            ReturnValue returnValues) {
        setTableName(tableName);
        setKey(key);
        setAttributeUpdates(attributeUpdates);
        setReturnValues(returnValues.toString());
    }

    /**
     * <p>
     * The name of the table containing the item to update.
     * </p>
     * 
     * @param tableName
     *        The name of the table containing the item to update.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table containing the item to update.
     * </p>
     * 
     * @return The name of the table containing the item to update.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table containing the item to update.
     * </p>
     * 
     * @param tableName
     *        The name of the table containing the item to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateItemRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     * attribute.
     * </p>
     * <p>
     * For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only
     * need to provide a value for the partition key. For a composite primary key, you must provide values for both the
     * partition key and the sort key.
     * </p>
     * 
     * @return The primary key of the item to be updated. Each element consists of an attribute name and a value for
     *         that attribute.</p>
     *         <p>
     *         For the primary key, you must provide all of the attributes. For example, with a simple primary key, you
     *         only need to provide a value for the partition key. For a composite primary key, you must provide values
     *         for both the partition key and the sort key.
     */

    public java.util.Map<String, AttributeValue> getKey() {
        return key;
    }

    /**
     * <p>
     * The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     * attribute.
     * </p>
     * <p>
     * For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only
     * need to provide a value for the partition key. For a composite primary key, you must provide values for both the
     * partition key and the sort key.
     * </p>
     * 
     * @param key
     *        The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     *        attribute.</p>
     *        <p>
     *        For the primary key, you must provide all of the attributes. For example, with a simple primary key, you
     *        only need to provide a value for the partition key. For a composite primary key, you must provide values
     *        for both the partition key and the sort key.
     */

    public void setKey(java.util.Map<String, AttributeValue> key) {
        this.key = key;
    }

    /**
     * <p>
     * The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     * attribute.
     * </p>
     * <p>
     * For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only
     * need to provide a value for the partition key. For a composite primary key, you must provide values for both the
     * partition key and the sort key.
     * </p>
     * 
     * @param key
     *        The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     *        attribute.</p>
     *        <p>
     *        For the primary key, you must provide all of the attributes. For example, with a simple primary key, you
     *        only need to provide a value for the partition key. For a composite primary key, you must provide values
     *        for both the partition key and the sort key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateItemRequest withKey(java.util.Map<String, AttributeValue> key) {
        setKey(key);
        return this;
    }

    public UpdateItemRequest addKeyEntry(String key, AttributeValue value) {
        if (null == this.key) {
            this.key = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.key.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.key.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Key.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateItemRequest clearKeyEntries() {
        this.key = null;
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>UpdateExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributeUpdates.html"
     * >AttributeUpdates</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return This is a legacy parameter. Use <code>UpdateExpression</code> instead. For more information, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributeUpdates.html"
     *         >AttributeUpdates</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public java.util.Map<String, AttributeValueUpdate> getAttributeUpdates() {
        return attributeUpdates;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>UpdateExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributeUpdates.html"
     * >AttributeUpdates</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param attributeUpdates
     *        This is a legacy parameter. Use <code>UpdateExpression</code> instead. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributeUpdates.html"
     *        >AttributeUpdates</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setAttributeUpdates(java.util.Map<String, AttributeValueUpdate> attributeUpdates) {
        this.attributeUpdates = attributeUpdates;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>UpdateExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributeUpdates.html"
     * >AttributeUpdates</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param attributeUpdates
     *        This is a legacy parameter. Use <code>UpdateExpression</code> instead. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributeUpdates.html"
     *        >AttributeUpdates</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateItemRequest withAttributeUpdates(java.util.Map<String, AttributeValueUpdate> attributeUpdates) {
        setAttributeUpdates(attributeUpdates);
        return this;
    }

    public UpdateItemRequest addAttributeUpdatesEntry(String key, AttributeValueUpdate value) {
        if (null == this.attributeUpdates) {
            this.attributeUpdates = new java.util.HashMap<String, AttributeValueUpdate>();
        }
        if (this.attributeUpdates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributeUpdates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AttributeUpdates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateItemRequest clearAttributeUpdatesEntries() {
        this.attributeUpdates = null;
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     * >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     *         >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public java.util.Map<String, ExpectedAttributeValue> getExpected() {
        return expected;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     * >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param expected
     *        This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     *        >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setExpected(java.util.Map<String, ExpectedAttributeValue> expected) {
        this.expected = expected;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     * >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param expected
     *        This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     *        >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateItemRequest withExpected(java.util.Map<String, ExpectedAttributeValue> expected) {
        setExpected(expected);
        return this;
    }

    public UpdateItemRequest addExpectedEntry(String key, ExpectedAttributeValue value) {
        if (null == this.expected) {
            this.expected = new java.util.HashMap<String, ExpectedAttributeValue>();
        }
        if (this.expected.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.expected.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Expected.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateItemRequest clearExpectedEntries() {
        this.expected = null;
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param conditionalOperator
     *        This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *        >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @see ConditionalOperator
     */

    public void setConditionalOperator(String conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *         >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @see ConditionalOperator
     */

    public String getConditionalOperator() {
        return this.conditionalOperator;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param conditionalOperator
     *        This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *        >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionalOperator
     */

    public UpdateItemRequest withConditionalOperator(String conditionalOperator) {
        setConditionalOperator(conditionalOperator);
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param conditionalOperator
     *        This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *        >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @see ConditionalOperator
     */

    public void setConditionalOperator(ConditionalOperator conditionalOperator) {
        withConditionalOperator(conditionalOperator);
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param conditionalOperator
     *        This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *        >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionalOperator
     */

    public UpdateItemRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
        return this;
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as they appear before or after they are
     * updated. For <code>UpdateItem</code>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>, then
     * nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - Returns all of the attributes of the item, as they appeared before the UpdateItem
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OLD</code> - Returns only the updated attributes, as they appeared before the UpdateItem operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_NEW</code> - Returns all of the attributes of the item, as they appear after the UpdateItem operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_NEW</code> - Returns only the updated attributes, as they appear after the UpdateItem operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is no additional cost associated with requesting a return value aside from the small network and processing
     * overhead of receiving a larger response. No read capacity units are consumed.
     * </p>
     * <p>
     * The values returned are strongly consistent.
     * </p>
     * 
     * @param returnValues
     *        Use <code>ReturnValues</code> if you want to get the item attributes as they appear before or after they
     *        are updated. For <code>UpdateItem</code>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>,
     *        then nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - Returns all of the attributes of the item, as they appeared before the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OLD</code> - Returns only the updated attributes, as they appeared before the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_NEW</code> - Returns all of the attributes of the item, as they appear after the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_NEW</code> - Returns only the updated attributes, as they appear after the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is no additional cost associated with requesting a return value aside from the small network and
     *        processing overhead of receiving a larger response. No read capacity units are consumed.
     *        </p>
     *        <p>
     *        The values returned are strongly consistent.
     * @see ReturnValue
     */

    public void setReturnValues(String returnValues) {
        this.returnValues = returnValues;
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as they appear before or after they are
     * updated. For <code>UpdateItem</code>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>, then
     * nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - Returns all of the attributes of the item, as they appeared before the UpdateItem
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OLD</code> - Returns only the updated attributes, as they appeared before the UpdateItem operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_NEW</code> - Returns all of the attributes of the item, as they appear after the UpdateItem operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_NEW</code> - Returns only the updated attributes, as they appear after the UpdateItem operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is no additional cost associated with requesting a return value aside from the small network and processing
     * overhead of receiving a larger response. No read capacity units are consumed.
     * </p>
     * <p>
     * The values returned are strongly consistent.
     * </p>
     * 
     * @return Use <code>ReturnValues</code> if you want to get the item attributes as they appear before or after they
     *         are updated. For <code>UpdateItem</code>, the valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>,
     *         then nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL_OLD</code> - Returns all of the attributes of the item, as they appeared before the UpdateItem
     *         operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATED_OLD</code> - Returns only the updated attributes, as they appeared before the UpdateItem
     *         operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL_NEW</code> - Returns all of the attributes of the item, as they appear after the UpdateItem
     *         operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATED_NEW</code> - Returns only the updated attributes, as they appear after the UpdateItem
     *         operation.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         There is no additional cost associated with requesting a return value aside from the small network and
     *         processing overhead of receiving a larger response. No read capacity units are consumed.
     *         </p>
     *         <p>
     *         The values returned are strongly consistent.
     * @see ReturnValue
     */

    public String getReturnValues() {
        return this.returnValues;
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as they appear before or after they are
     * updated. For <code>UpdateItem</code>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>, then
     * nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - Returns all of the attributes of the item, as they appeared before the UpdateItem
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OLD</code> - Returns only the updated attributes, as they appeared before the UpdateItem operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_NEW</code> - Returns all of the attributes of the item, as they appear after the UpdateItem operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_NEW</code> - Returns only the updated attributes, as they appear after the UpdateItem operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is no additional cost associated with requesting a return value aside from the small network and processing
     * overhead of receiving a larger response. No read capacity units are consumed.
     * </p>
     * <p>
     * The values returned are strongly consistent.
     * </p>
     * 
     * @param returnValues
     *        Use <code>ReturnValues</code> if you want to get the item attributes as they appear before or after they
     *        are updated. For <code>UpdateItem</code>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>,
     *        then nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - Returns all of the attributes of the item, as they appeared before the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OLD</code> - Returns only the updated attributes, as they appeared before the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_NEW</code> - Returns all of the attributes of the item, as they appear after the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_NEW</code> - Returns only the updated attributes, as they appear after the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is no additional cost associated with requesting a return value aside from the small network and
     *        processing overhead of receiving a larger response. No read capacity units are consumed.
     *        </p>
     *        <p>
     *        The values returned are strongly consistent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnValue
     */

    public UpdateItemRequest withReturnValues(String returnValues) {
        setReturnValues(returnValues);
        return this;
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as they appear before or after they are
     * updated. For <code>UpdateItem</code>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>, then
     * nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - Returns all of the attributes of the item, as they appeared before the UpdateItem
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OLD</code> - Returns only the updated attributes, as they appeared before the UpdateItem operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_NEW</code> - Returns all of the attributes of the item, as they appear after the UpdateItem operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_NEW</code> - Returns only the updated attributes, as they appear after the UpdateItem operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is no additional cost associated with requesting a return value aside from the small network and processing
     * overhead of receiving a larger response. No read capacity units are consumed.
     * </p>
     * <p>
     * The values returned are strongly consistent.
     * </p>
     * 
     * @param returnValues
     *        Use <code>ReturnValues</code> if you want to get the item attributes as they appear before or after they
     *        are updated. For <code>UpdateItem</code>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>,
     *        then nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - Returns all of the attributes of the item, as they appeared before the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OLD</code> - Returns only the updated attributes, as they appeared before the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_NEW</code> - Returns all of the attributes of the item, as they appear after the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_NEW</code> - Returns only the updated attributes, as they appear after the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is no additional cost associated with requesting a return value aside from the small network and
     *        processing overhead of receiving a larger response. No read capacity units are consumed.
     *        </p>
     *        <p>
     *        The values returned are strongly consistent.
     * @see ReturnValue
     */

    public void setReturnValues(ReturnValue returnValues) {
        withReturnValues(returnValues);
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as they appear before or after they are
     * updated. For <code>UpdateItem</code>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>, then
     * nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - Returns all of the attributes of the item, as they appeared before the UpdateItem
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OLD</code> - Returns only the updated attributes, as they appeared before the UpdateItem operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_NEW</code> - Returns all of the attributes of the item, as they appear after the UpdateItem operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_NEW</code> - Returns only the updated attributes, as they appear after the UpdateItem operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is no additional cost associated with requesting a return value aside from the small network and processing
     * overhead of receiving a larger response. No read capacity units are consumed.
     * </p>
     * <p>
     * The values returned are strongly consistent.
     * </p>
     * 
     * @param returnValues
     *        Use <code>ReturnValues</code> if you want to get the item attributes as they appear before or after they
     *        are updated. For <code>UpdateItem</code>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>,
     *        then nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - Returns all of the attributes of the item, as they appeared before the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OLD</code> - Returns only the updated attributes, as they appeared before the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_NEW</code> - Returns all of the attributes of the item, as they appear after the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_NEW</code> - Returns only the updated attributes, as they appear after the UpdateItem
     *        operation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is no additional cost associated with requesting a return value aside from the small network and
     *        processing overhead of receiving a larger response. No read capacity units are consumed.
     *        </p>
     *        <p>
     *        The values returned are strongly consistent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnValue
     */

    public UpdateItemRequest withReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
        return this;
    }

    /**
     * @param returnConsumedCapacity
     * @see ReturnConsumedCapacity
     */

    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }

    /**
     * @return
     * @see ReturnConsumedCapacity
     */

    public String getReturnConsumedCapacity() {
        return this.returnConsumedCapacity;
    }

    /**
     * @param returnConsumedCapacity
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnConsumedCapacity
     */

    public UpdateItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        setReturnConsumedCapacity(returnConsumedCapacity);
        return this;
    }

    /**
     * @param returnConsumedCapacity
     * @see ReturnConsumedCapacity
     */

    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        withReturnConsumedCapacity(returnConsumedCapacity);
    }

    /**
     * @param returnConsumedCapacity
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnConsumedCapacity
     */

    public UpdateItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during the operation are returned in the response.
     * If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     * 
     * @param returnItemCollectionMetrics
     *        Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response
     *        includes statistics about item collections, if any, that were modified during the operation are returned
     *        in the response. If set to <code>NONE</code> (the default), no statistics are returned.
     * @see ReturnItemCollectionMetrics
     */

    public void setReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during the operation are returned in the response.
     * If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     * 
     * @return Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response
     *         includes statistics about item collections, if any, that were modified during the operation are returned
     *         in the response. If set to <code>NONE</code> (the default), no statistics are returned.
     * @see ReturnItemCollectionMetrics
     */

    public String getReturnItemCollectionMetrics() {
        return this.returnItemCollectionMetrics;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during the operation are returned in the response.
     * If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     * 
     * @param returnItemCollectionMetrics
     *        Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response
     *        includes statistics about item collections, if any, that were modified during the operation are returned
     *        in the response. If set to <code>NONE</code> (the default), no statistics are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnItemCollectionMetrics
     */

    public UpdateItemRequest withReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        setReturnItemCollectionMetrics(returnItemCollectionMetrics);
        return this;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during the operation are returned in the response.
     * If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     * 
     * @param returnItemCollectionMetrics
     *        Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response
     *        includes statistics about item collections, if any, that were modified during the operation are returned
     *        in the response. If set to <code>NONE</code> (the default), no statistics are returned.
     * @see ReturnItemCollectionMetrics
     */

    public void setReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        withReturnItemCollectionMetrics(returnItemCollectionMetrics);
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during the operation are returned in the response.
     * If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     * 
     * @param returnItemCollectionMetrics
     *        Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response
     *        includes statistics about item collections, if any, that were modified during the operation are returned
     *        in the response. If set to <code>NONE</code> (the default), no statistics are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnItemCollectionMetrics
     */

    public UpdateItemRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
        return this;
    }

    /**
     * <p>
     * An expression that defines one or more attributes to be updated, the action to be performed on them, and new
     * value(s) for them.
     * </p>
     * <p>
     * The following action values are available for <code>UpdateExpression</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SET</code> - Adds one or more attributes and values to an item. If any of these attribute already exist,
     * they are replaced by the new values. You can also use <code>SET</code> to add or subtract from an attribute that
     * is of type Number. For example: <code>SET myNum = myNum + :val</code>
     * </p>
     * <p>
     * <code>SET</code> supports the following functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>if_not_exists (path, operand)</code> - if the item does not contain an attribute at the specified path,
     * then <code>if_not_exists</code> evaluates to operand; otherwise, it evaluates to path. You can use this function
     * to avoid overwriting an attribute that may already be present in the item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>list_append (operand, operand)</code> - evaluates to a list with a new element added to it. You can append
     * the new element to the start or the end of the list by reversing the order of the operands.
     * </p>
     * </li>
     * </ul>
     * <p>
     * These function names are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - Removes one or more attributes from an item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - Adds the specified value to the item, if the attribute does not already exist. If the
     * attribute does exist, then the behavior of <code>ADD</code> depends on the data type of the attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the existing attribute is a number, and if <code>Value</code> is also a number, then <code>Value</code> is
     * mathematically added to the existing attribute. If <code>Value</code> is a negative number, then it is subtracted
     * from the existing attribute.
     * </p>
     * <note>
     * <p>
     * If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the
     * update, DynamoDB uses <code>0</code> as the initial value.
     * </p>
     * <p>
     * Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value that
     * doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example, suppose that the
     * item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide to <code>ADD</code> the
     * number <code>3</code> to this attribute anyway. DynamoDB will create the <i>itemcount</i> attribute, set its
     * initial value to <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i>
     * attribute in the item, with a value of <code>3</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If the existing data type is a set and if <code>Value</code> is also a set, then <code>Value</code> is added to
     * the existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code>
     * action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs if an
     * <code>ADD</code> action is specified for a set attribute and the attribute type specified does not match the
     * existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the
     * <code>Value</code> must also be a set of strings.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * The <code>ADD</code> action only supports Number and set data types. In addition, <code>ADD</code> can only be
     * used on top-level attributes, not nested attributes.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>DELETE</code> - Deletes an element from a set.
     * </p>
     * <p>
     * If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute
     * value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies <code>[a,c]</code>, then the
     * final attribute value is <code>[b]</code>. Specifying an empty set is an error.
     * </p>
     * <important>
     * <p>
     * The <code>DELETE</code> action only supports set data types. In addition, <code>DELETE</code> can only be used on
     * top-level attributes, not nested attributes.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * You can have many actions in a single expression, such as the following:
     * <code>SET a=:value1, b=:value2 DELETE :value3, :value4, :value5</code>
     * </p>
     * <p>
     * For more information on update expressions, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html">Modifying
     * Items and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param updateExpression
     *        An expression that defines one or more attributes to be updated, the action to be performed on them, and
     *        new value(s) for them.</p>
     *        <p>
     *        The following action values are available for <code>UpdateExpression</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SET</code> - Adds one or more attributes and values to an item. If any of these attribute already
     *        exist, they are replaced by the new values. You can also use <code>SET</code> to add or subtract from an
     *        attribute that is of type Number. For example: <code>SET myNum = myNum + :val</code>
     *        </p>
     *        <p>
     *        <code>SET</code> supports the following functions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>if_not_exists (path, operand)</code> - if the item does not contain an attribute at the specified
     *        path, then <code>if_not_exists</code> evaluates to operand; otherwise, it evaluates to path. You can use
     *        this function to avoid overwriting an attribute that may already be present in the item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>list_append (operand, operand)</code> - evaluates to a list with a new element added to it. You can
     *        append the new element to the start or the end of the list by reversing the order of the operands.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        These function names are case-sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVE</code> - Removes one or more attributes from an item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - Adds the specified value to the item, if the attribute does not already exist. If the
     *        attribute does exist, then the behavior of <code>ADD</code> depends on the data type of the attribute:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the existing attribute is a number, and if <code>Value</code> is also a number, then <code>Value</code>
     *        is mathematically added to the existing attribute. If <code>Value</code> is a negative number, then it is
     *        subtracted from the existing attribute.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before
     *        the update, DynamoDB uses <code>0</code> as the initial value.
     *        </p>
     *        <p>
     *        Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value
     *        that doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example,
     *        suppose that the item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide
     *        to <code>ADD</code> the number <code>3</code> to this attribute anyway. DynamoDB will create the
     *        <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add <code>3</code> to it.
     *        The result will be a new <i>itemcount</i> attribute in the item, with a value of <code>3</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        If the existing data type is a set and if <code>Value</code> is also a set, then <code>Value</code> is
     *        added to the existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the
     *        <code>ADD</code> action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>
     *        . An error occurs if an <code>ADD</code> action is specified for a set attribute and the attribute type
     *        specified does not match the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, the <code>Value</code> must also be a set of strings.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        The <code>ADD</code> action only supports Number and set data types. In addition, <code>ADD</code> can
     *        only be used on top-level attributes, not nested attributes.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - Deletes an element from a set.
     *        </p>
     *        <p>
     *        If a set of values is specified, then those values are subtracted from the old set. For example, if the
     *        attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies
     *        <code>[a,c]</code>, then the final attribute value is <code>[b]</code>. Specifying an empty set is an
     *        error.
     *        </p>
     *        <important>
     *        <p>
     *        The <code>DELETE</code> action only supports set data types. In addition, <code>DELETE</code> can only be
     *        used on top-level attributes, not nested attributes.
     *        </p>
     *        </important></li>
     *        </ul>
     *        <p>
     *        You can have many actions in a single expression, such as the following:
     *        <code>SET a=:value1, b=:value2 DELETE :value3, :value4, :value5</code>
     *        </p>
     *        <p>
     *        For more information on update expressions, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     *        >Modifying Items and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setUpdateExpression(String updateExpression) {
        this.updateExpression = updateExpression;
    }

    /**
     * <p>
     * An expression that defines one or more attributes to be updated, the action to be performed on them, and new
     * value(s) for them.
     * </p>
     * <p>
     * The following action values are available for <code>UpdateExpression</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SET</code> - Adds one or more attributes and values to an item. If any of these attribute already exist,
     * they are replaced by the new values. You can also use <code>SET</code> to add or subtract from an attribute that
     * is of type Number. For example: <code>SET myNum = myNum + :val</code>
     * </p>
     * <p>
     * <code>SET</code> supports the following functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>if_not_exists (path, operand)</code> - if the item does not contain an attribute at the specified path,
     * then <code>if_not_exists</code> evaluates to operand; otherwise, it evaluates to path. You can use this function
     * to avoid overwriting an attribute that may already be present in the item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>list_append (operand, operand)</code> - evaluates to a list with a new element added to it. You can append
     * the new element to the start or the end of the list by reversing the order of the operands.
     * </p>
     * </li>
     * </ul>
     * <p>
     * These function names are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - Removes one or more attributes from an item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - Adds the specified value to the item, if the attribute does not already exist. If the
     * attribute does exist, then the behavior of <code>ADD</code> depends on the data type of the attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the existing attribute is a number, and if <code>Value</code> is also a number, then <code>Value</code> is
     * mathematically added to the existing attribute. If <code>Value</code> is a negative number, then it is subtracted
     * from the existing attribute.
     * </p>
     * <note>
     * <p>
     * If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the
     * update, DynamoDB uses <code>0</code> as the initial value.
     * </p>
     * <p>
     * Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value that
     * doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example, suppose that the
     * item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide to <code>ADD</code> the
     * number <code>3</code> to this attribute anyway. DynamoDB will create the <i>itemcount</i> attribute, set its
     * initial value to <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i>
     * attribute in the item, with a value of <code>3</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If the existing data type is a set and if <code>Value</code> is also a set, then <code>Value</code> is added to
     * the existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code>
     * action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs if an
     * <code>ADD</code> action is specified for a set attribute and the attribute type specified does not match the
     * existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the
     * <code>Value</code> must also be a set of strings.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * The <code>ADD</code> action only supports Number and set data types. In addition, <code>ADD</code> can only be
     * used on top-level attributes, not nested attributes.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>DELETE</code> - Deletes an element from a set.
     * </p>
     * <p>
     * If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute
     * value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies <code>[a,c]</code>, then the
     * final attribute value is <code>[b]</code>. Specifying an empty set is an error.
     * </p>
     * <important>
     * <p>
     * The <code>DELETE</code> action only supports set data types. In addition, <code>DELETE</code> can only be used on
     * top-level attributes, not nested attributes.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * You can have many actions in a single expression, such as the following:
     * <code>SET a=:value1, b=:value2 DELETE :value3, :value4, :value5</code>
     * </p>
     * <p>
     * For more information on update expressions, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html">Modifying
     * Items and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return An expression that defines one or more attributes to be updated, the action to be performed on them, and
     *         new value(s) for them.</p>
     *         <p>
     *         The following action values are available for <code>UpdateExpression</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SET</code> - Adds one or more attributes and values to an item. If any of these attribute already
     *         exist, they are replaced by the new values. You can also use <code>SET</code> to add or subtract from an
     *         attribute that is of type Number. For example: <code>SET myNum = myNum + :val</code>
     *         </p>
     *         <p>
     *         <code>SET</code> supports the following functions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>if_not_exists (path, operand)</code> - if the item does not contain an attribute at the specified
     *         path, then <code>if_not_exists</code> evaluates to operand; otherwise, it evaluates to path. You can use
     *         this function to avoid overwriting an attribute that may already be present in the item.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>list_append (operand, operand)</code> - evaluates to a list with a new element added to it. You can
     *         append the new element to the start or the end of the list by reversing the order of the operands.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         These function names are case-sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REMOVE</code> - Removes one or more attributes from an item.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADD</code> - Adds the specified value to the item, if the attribute does not already exist. If the
     *         attribute does exist, then the behavior of <code>ADD</code> depends on the data type of the attribute:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the existing attribute is a number, and if <code>Value</code> is also a number, then
     *         <code>Value</code> is mathematically added to the existing attribute. If <code>Value</code> is a negative
     *         number, then it is subtracted from the existing attribute.
     *         </p>
     *         <note>
     *         <p>
     *         If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist
     *         before the update, DynamoDB uses <code>0</code> as the initial value.
     *         </p>
     *         <p>
     *         Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value
     *         that doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example,
     *         suppose that the item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide
     *         to <code>ADD</code> the number <code>3</code> to this attribute anyway. DynamoDB will create the
     *         <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add <code>3</code> to
     *         it. The result will be a new <i>itemcount</i> attribute in the item, with a value of <code>3</code>.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         If the existing data type is a set and if <code>Value</code> is also a set, then <code>Value</code> is
     *         added to the existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the
     *         <code>ADD</code> action specified <code>[3]</code>, then the final attribute value is
     *         <code>[1,2,3]</code>. An error occurs if an <code>ADD</code> action is specified for a set attribute and
     *         the attribute type specified does not match the existing set type.
     *         </p>
     *         <p>
     *         Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *         strings, the <code>Value</code> must also be a set of strings.
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         The <code>ADD</code> action only supports Number and set data types. In addition, <code>ADD</code> can
     *         only be used on top-level attributes, not nested attributes.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         <code>DELETE</code> - Deletes an element from a set.
     *         </p>
     *         <p>
     *         If a set of values is specified, then those values are subtracted from the old set. For example, if the
     *         attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies
     *         <code>[a,c]</code>, then the final attribute value is <code>[b]</code>. Specifying an empty set is an
     *         error.
     *         </p>
     *         <important>
     *         <p>
     *         The <code>DELETE</code> action only supports set data types. In addition, <code>DELETE</code> can only be
     *         used on top-level attributes, not nested attributes.
     *         </p>
     *         </important></li>
     *         </ul>
     *         <p>
     *         You can have many actions in a single expression, such as the following:
     *         <code>SET a=:value1, b=:value2 DELETE :value3, :value4, :value5</code>
     *         </p>
     *         <p>
     *         For more information on update expressions, see <a
     *         href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     *         >Modifying Items and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public String getUpdateExpression() {
        return this.updateExpression;
    }

    /**
     * <p>
     * An expression that defines one or more attributes to be updated, the action to be performed on them, and new
     * value(s) for them.
     * </p>
     * <p>
     * The following action values are available for <code>UpdateExpression</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SET</code> - Adds one or more attributes and values to an item. If any of these attribute already exist,
     * they are replaced by the new values. You can also use <code>SET</code> to add or subtract from an attribute that
     * is of type Number. For example: <code>SET myNum = myNum + :val</code>
     * </p>
     * <p>
     * <code>SET</code> supports the following functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>if_not_exists (path, operand)</code> - if the item does not contain an attribute at the specified path,
     * then <code>if_not_exists</code> evaluates to operand; otherwise, it evaluates to path. You can use this function
     * to avoid overwriting an attribute that may already be present in the item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>list_append (operand, operand)</code> - evaluates to a list with a new element added to it. You can append
     * the new element to the start or the end of the list by reversing the order of the operands.
     * </p>
     * </li>
     * </ul>
     * <p>
     * These function names are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - Removes one or more attributes from an item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - Adds the specified value to the item, if the attribute does not already exist. If the
     * attribute does exist, then the behavior of <code>ADD</code> depends on the data type of the attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the existing attribute is a number, and if <code>Value</code> is also a number, then <code>Value</code> is
     * mathematically added to the existing attribute. If <code>Value</code> is a negative number, then it is subtracted
     * from the existing attribute.
     * </p>
     * <note>
     * <p>
     * If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the
     * update, DynamoDB uses <code>0</code> as the initial value.
     * </p>
     * <p>
     * Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value that
     * doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example, suppose that the
     * item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide to <code>ADD</code> the
     * number <code>3</code> to this attribute anyway. DynamoDB will create the <i>itemcount</i> attribute, set its
     * initial value to <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i>
     * attribute in the item, with a value of <code>3</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If the existing data type is a set and if <code>Value</code> is also a set, then <code>Value</code> is added to
     * the existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code>
     * action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs if an
     * <code>ADD</code> action is specified for a set attribute and the attribute type specified does not match the
     * existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the
     * <code>Value</code> must also be a set of strings.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * The <code>ADD</code> action only supports Number and set data types. In addition, <code>ADD</code> can only be
     * used on top-level attributes, not nested attributes.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>DELETE</code> - Deletes an element from a set.
     * </p>
     * <p>
     * If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute
     * value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies <code>[a,c]</code>, then the
     * final attribute value is <code>[b]</code>. Specifying an empty set is an error.
     * </p>
     * <important>
     * <p>
     * The <code>DELETE</code> action only supports set data types. In addition, <code>DELETE</code> can only be used on
     * top-level attributes, not nested attributes.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * You can have many actions in a single expression, such as the following:
     * <code>SET a=:value1, b=:value2 DELETE :value3, :value4, :value5</code>
     * </p>
     * <p>
     * For more information on update expressions, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html">Modifying
     * Items and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param updateExpression
     *        An expression that defines one or more attributes to be updated, the action to be performed on them, and
     *        new value(s) for them.</p>
     *        <p>
     *        The following action values are available for <code>UpdateExpression</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SET</code> - Adds one or more attributes and values to an item. If any of these attribute already
     *        exist, they are replaced by the new values. You can also use <code>SET</code> to add or subtract from an
     *        attribute that is of type Number. For example: <code>SET myNum = myNum + :val</code>
     *        </p>
     *        <p>
     *        <code>SET</code> supports the following functions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>if_not_exists (path, operand)</code> - if the item does not contain an attribute at the specified
     *        path, then <code>if_not_exists</code> evaluates to operand; otherwise, it evaluates to path. You can use
     *        this function to avoid overwriting an attribute that may already be present in the item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>list_append (operand, operand)</code> - evaluates to a list with a new element added to it. You can
     *        append the new element to the start or the end of the list by reversing the order of the operands.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        These function names are case-sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVE</code> - Removes one or more attributes from an item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - Adds the specified value to the item, if the attribute does not already exist. If the
     *        attribute does exist, then the behavior of <code>ADD</code> depends on the data type of the attribute:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the existing attribute is a number, and if <code>Value</code> is also a number, then <code>Value</code>
     *        is mathematically added to the existing attribute. If <code>Value</code> is a negative number, then it is
     *        subtracted from the existing attribute.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before
     *        the update, DynamoDB uses <code>0</code> as the initial value.
     *        </p>
     *        <p>
     *        Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value
     *        that doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example,
     *        suppose that the item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide
     *        to <code>ADD</code> the number <code>3</code> to this attribute anyway. DynamoDB will create the
     *        <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add <code>3</code> to it.
     *        The result will be a new <i>itemcount</i> attribute in the item, with a value of <code>3</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        If the existing data type is a set and if <code>Value</code> is also a set, then <code>Value</code> is
     *        added to the existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the
     *        <code>ADD</code> action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>
     *        . An error occurs if an <code>ADD</code> action is specified for a set attribute and the attribute type
     *        specified does not match the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, the <code>Value</code> must also be a set of strings.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        The <code>ADD</code> action only supports Number and set data types. In addition, <code>ADD</code> can
     *        only be used on top-level attributes, not nested attributes.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - Deletes an element from a set.
     *        </p>
     *        <p>
     *        If a set of values is specified, then those values are subtracted from the old set. For example, if the
     *        attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies
     *        <code>[a,c]</code>, then the final attribute value is <code>[b]</code>. Specifying an empty set is an
     *        error.
     *        </p>
     *        <important>
     *        <p>
     *        The <code>DELETE</code> action only supports set data types. In addition, <code>DELETE</code> can only be
     *        used on top-level attributes, not nested attributes.
     *        </p>
     *        </important></li>
     *        </ul>
     *        <p>
     *        You can have many actions in a single expression, such as the following:
     *        <code>SET a=:value1, b=:value2 DELETE :value3, :value4, :value5</code>
     *        </p>
     *        <p>
     *        For more information on update expressions, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     *        >Modifying Items and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateItemRequest withUpdateExpression(String updateExpression) {
        setUpdateExpression(updateExpression);
        return this;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional update to succeed.
     * </p>
     * <p>
     * An expression can contain any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Functions: <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code>
     * </p>
     * <p>
     * These function names are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Comparison operators: <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Logical operators: <code>AND | OR | NOT</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on condition expressions, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param conditionExpression
     *        A condition that must be satisfied in order for a conditional update to succeed.</p>
     *        <p>
     *        An expression can contain any of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Functions:
     *        <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code>
     *        </p>
     *        <p>
     *        These function names are case-sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Comparison operators: <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Logical operators: <code>AND | OR | NOT</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information on condition expressions, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *        >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional update to succeed.
     * </p>
     * <p>
     * An expression can contain any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Functions: <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code>
     * </p>
     * <p>
     * These function names are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Comparison operators: <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Logical operators: <code>AND | OR | NOT</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on condition expressions, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return A condition that must be satisfied in order for a conditional update to succeed.</p>
     *         <p>
     *         An expression can contain any of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Functions:
     *         <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code>
     *         </p>
     *         <p>
     *         These function names are case-sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Comparison operators: <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Logical operators: <code>AND | OR | NOT</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information on condition expressions, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *         >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public String getConditionExpression() {
        return this.conditionExpression;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional update to succeed.
     * </p>
     * <p>
     * An expression can contain any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Functions: <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code>
     * </p>
     * <p>
     * These function names are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Comparison operators: <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Logical operators: <code>AND | OR | NOT</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on condition expressions, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param conditionExpression
     *        A condition that must be satisfied in order for a conditional update to succeed.</p>
     *        <p>
     *        An expression can contain any of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Functions:
     *        <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code>
     *        </p>
     *        <p>
     *        These function names are case-sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Comparison operators: <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Logical operators: <code>AND | OR | NOT</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information on condition expressions, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *        >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateItemRequest withConditionExpression(String conditionExpression) {
        setConditionExpression(conditionExpression);
        return this;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The following are some use cases for using
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To access an attribute whose name conflicts with a DynamoDB reserved word.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a placeholder for repeating occurrences of an attribute name in an expression.
     * </p>
     * </li>
     * <li>
     * <p>
     * To prevent special characters in an attribute name from being misinterpreted in an expression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the following
     * attribute name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Percentile</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For
     * the complete list of reserved words, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>{"#P":"Percentile"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You could then use this substitution in an expression, as in this example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#P = :val</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are placeholders for
     * the actual value at runtime.
     * </p>
     * </note>
     * <p>
     * For more information on expression attribute names, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return One or more substitution tokens for attribute names in an expression. The following are some use cases
     *         for using <code>ExpressionAttributeNames</code>:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To access an attribute whose name conflicts with a DynamoDB reserved word.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To create a placeholder for repeating occurrences of an attribute name in an expression.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To prevent special characters in an attribute name from being misinterpreted in an expression.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the
     *         following attribute name:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Percentile</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The name of this attribute conflicts with a reserved word, so it cannot be used directly in an
     *         expression. (For the complete list of reserved words, see <a
     *         href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     *         Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the
     *         following for <code>ExpressionAttributeNames</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>{"#P":"Percentile"}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You could then use this substitution in an expression, as in this example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>#P = :val</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are
     *         placeholders for the actual value at runtime.
     *         </p>
     *         </note>
     *         <p>
     *         For more information on expression attribute names, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *         >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public java.util.Map<String, String> getExpressionAttributeNames() {
        return expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The following are some use cases for using
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To access an attribute whose name conflicts with a DynamoDB reserved word.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a placeholder for repeating occurrences of an attribute name in an expression.
     * </p>
     * </li>
     * <li>
     * <p>
     * To prevent special characters in an attribute name from being misinterpreted in an expression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the following
     * attribute name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Percentile</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For
     * the complete list of reserved words, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>{"#P":"Percentile"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You could then use this substitution in an expression, as in this example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#P = :val</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are placeholders for
     * the actual value at runtime.
     * </p>
     * </note>
     * <p>
     * For more information on expression attribute names, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param expressionAttributeNames
     *        One or more substitution tokens for attribute names in an expression. The following are some use cases for
     *        using <code>ExpressionAttributeNames</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To access an attribute whose name conflicts with a DynamoDB reserved word.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To create a placeholder for repeating occurrences of an attribute name in an expression.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To prevent special characters in an attribute name from being misinterpreted in an expression.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the
     *        following attribute name:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Percentile</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression.
     *        (For the complete list of reserved words, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     *        Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the
     *        following for <code>ExpressionAttributeNames</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>{"#P":"Percentile"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You could then use this substitution in an expression, as in this example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>#P = :val</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are
     *        placeholders for the actual value at runtime.
     *        </p>
     *        </note>
     *        <p>
     *        For more information on expression attribute names, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The following are some use cases for using
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To access an attribute whose name conflicts with a DynamoDB reserved word.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a placeholder for repeating occurrences of an attribute name in an expression.
     * </p>
     * </li>
     * <li>
     * <p>
     * To prevent special characters in an attribute name from being misinterpreted in an expression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the following
     * attribute name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Percentile</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For
     * the complete list of reserved words, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>{"#P":"Percentile"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You could then use this substitution in an expression, as in this example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#P = :val</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are placeholders for
     * the actual value at runtime.
     * </p>
     * </note>
     * <p>
     * For more information on expression attribute names, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param expressionAttributeNames
     *        One or more substitution tokens for attribute names in an expression. The following are some use cases for
     *        using <code>ExpressionAttributeNames</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To access an attribute whose name conflicts with a DynamoDB reserved word.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To create a placeholder for repeating occurrences of an attribute name in an expression.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To prevent special characters in an attribute name from being misinterpreted in an expression.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the
     *        following attribute name:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Percentile</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression.
     *        (For the complete list of reserved words, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     *        Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the
     *        following for <code>ExpressionAttributeNames</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>{"#P":"Percentile"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You could then use this substitution in an expression, as in this example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>#P = :val</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are
     *        placeholders for the actual value at runtime.
     *        </p>
     *        </note>
     *        <p>
     *        For more information on expression attribute names, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateItemRequest withExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        setExpressionAttributeNames(expressionAttributeNames);
        return this;
    }

    public UpdateItemRequest addExpressionAttributeNamesEntry(String key, String value) {
        if (null == this.expressionAttributeNames) {
            this.expressionAttributeNames = new java.util.HashMap<String, String>();
        }
        if (this.expressionAttributeNames.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.expressionAttributeNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeNames.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateItemRequest clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
        return this;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * Use the <b>:</b> (colon) character in an expression to dereference an attribute value. For example, suppose that
     * you wanted to check whether the value of the <i>ProductStatus</i> attribute was one of the following:
     * </p>
     * <p>
     * <code>Available | Backordered | Discontinued</code>
     * </p>
     * <p>
     * You would first need to specify <code>ExpressionAttributeValues</code> as follows:
     * </p>
     * <p>
     * <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     * </p>
     * <p>
     * You could then use these values in an expression, such as this:
     * </p>
     * <p>
     * <code>ProductStatus IN (:avail, :back, :disc)</code>
     * </p>
     * <p>
     * For more information on expression attribute values, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return One or more values that can be substituted in an expression.</p>
     *         <p>
     *         Use the <b>:</b> (colon) character in an expression to dereference an attribute value. For example,
     *         suppose that you wanted to check whether the value of the <i>ProductStatus</i> attribute was one of the
     *         following:
     *         </p>
     *         <p>
     *         <code>Available | Backordered | Discontinued</code>
     *         </p>
     *         <p>
     *         You would first need to specify <code>ExpressionAttributeValues</code> as follows:
     *         </p>
     *         <p>
     *         <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     *         </p>
     *         <p>
     *         You could then use these values in an expression, such as this:
     *         </p>
     *         <p>
     *         <code>ProductStatus IN (:avail, :back, :disc)</code>
     *         </p>
     *         <p>
     *         For more information on expression attribute values, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *         >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public java.util.Map<String, AttributeValue> getExpressionAttributeValues() {
        return expressionAttributeValues;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * Use the <b>:</b> (colon) character in an expression to dereference an attribute value. For example, suppose that
     * you wanted to check whether the value of the <i>ProductStatus</i> attribute was one of the following:
     * </p>
     * <p>
     * <code>Available | Backordered | Discontinued</code>
     * </p>
     * <p>
     * You would first need to specify <code>ExpressionAttributeValues</code> as follows:
     * </p>
     * <p>
     * <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     * </p>
     * <p>
     * You could then use these values in an expression, such as this:
     * </p>
     * <p>
     * <code>ProductStatus IN (:avail, :back, :disc)</code>
     * </p>
     * <p>
     * For more information on expression attribute values, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param expressionAttributeValues
     *        One or more values that can be substituted in an expression.</p>
     *        <p>
     *        Use the <b>:</b> (colon) character in an expression to dereference an attribute value. For example,
     *        suppose that you wanted to check whether the value of the <i>ProductStatus</i> attribute was one of the
     *        following:
     *        </p>
     *        <p>
     *        <code>Available | Backordered | Discontinued</code>
     *        </p>
     *        <p>
     *        You would first need to specify <code>ExpressionAttributeValues</code> as follows:
     *        </p>
     *        <p>
     *        <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     *        </p>
     *        <p>
     *        You could then use these values in an expression, such as this:
     *        </p>
     *        <p>
     *        <code>ProductStatus IN (:avail, :back, :disc)</code>
     *        </p>
     *        <p>
     *        For more information on expression attribute values, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *        >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setExpressionAttributeValues(java.util.Map<String, AttributeValue> expressionAttributeValues) {
        this.expressionAttributeValues = expressionAttributeValues;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * Use the <b>:</b> (colon) character in an expression to dereference an attribute value. For example, suppose that
     * you wanted to check whether the value of the <i>ProductStatus</i> attribute was one of the following:
     * </p>
     * <p>
     * <code>Available | Backordered | Discontinued</code>
     * </p>
     * <p>
     * You would first need to specify <code>ExpressionAttributeValues</code> as follows:
     * </p>
     * <p>
     * <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     * </p>
     * <p>
     * You could then use these values in an expression, such as this:
     * </p>
     * <p>
     * <code>ProductStatus IN (:avail, :back, :disc)</code>
     * </p>
     * <p>
     * For more information on expression attribute values, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param expressionAttributeValues
     *        One or more values that can be substituted in an expression.</p>
     *        <p>
     *        Use the <b>:</b> (colon) character in an expression to dereference an attribute value. For example,
     *        suppose that you wanted to check whether the value of the <i>ProductStatus</i> attribute was one of the
     *        following:
     *        </p>
     *        <p>
     *        <code>Available | Backordered | Discontinued</code>
     *        </p>
     *        <p>
     *        You would first need to specify <code>ExpressionAttributeValues</code> as follows:
     *        </p>
     *        <p>
     *        <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     *        </p>
     *        <p>
     *        You could then use these values in an expression, such as this:
     *        </p>
     *        <p>
     *        <code>ProductStatus IN (:avail, :back, :disc)</code>
     *        </p>
     *        <p>
     *        For more information on expression attribute values, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *        >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateItemRequest withExpressionAttributeValues(java.util.Map<String, AttributeValue> expressionAttributeValues) {
        setExpressionAttributeValues(expressionAttributeValues);
        return this;
    }

    public UpdateItemRequest addExpressionAttributeValuesEntry(String key, AttributeValue value) {
        if (null == this.expressionAttributeValues) {
            this.expressionAttributeValues = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.expressionAttributeValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.expressionAttributeValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeValues.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateItemRequest clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
        return this;
    }

    /**
     * Set the hash and range key attributes of the item.
     * <p>
     * For a hash-only table, you only need to provide the hash attribute. For a hash-and-range table, you must provide
     * both.
     *
     * @param hashKey
     *        a map entry including the name and value of the primary hash key.
     * @param rangeKey
     *        a map entry including the name and value of the primary range key, or null if it is a hash-only table.
     */
    public void setKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey)
            throws IllegalArgumentException {
        java.util.HashMap<String, AttributeValue> key = new java.util.HashMap<String, AttributeValue>();
        if (hashKey != null) {
            key.put(hashKey.getKey(), hashKey.getValue());
        } else {
            throw new IllegalArgumentException("hashKey must be non-null object.");
        }
        if (rangeKey != null) {
            key.put(rangeKey.getKey(), rangeKey.getValue());
        }
        setKey(key);
    }

    /**
     * Set the hash and range key attributes of the item.
     * <p>
     * For a hash-only table, you only need to provide the hash attribute. For a hash-and-range table, you must provide
     * both.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hashKey
     *        a map entry including the name and value of the primary hash key.
     * @param rangeKey
     *        a map entry including the name and value of the primary range key, or null if it is a hash-only table.
     */
    public UpdateItemRequest withKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey)
            throws IllegalArgumentException {
        setKey(hashKey, rangeKey);
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getAttributeUpdates() != null)
            sb.append("AttributeUpdates: ").append(getAttributeUpdates()).append(",");
        if (getExpected() != null)
            sb.append("Expected: ").append(getExpected()).append(",");
        if (getConditionalOperator() != null)
            sb.append("ConditionalOperator: ").append(getConditionalOperator()).append(",");
        if (getReturnValues() != null)
            sb.append("ReturnValues: ").append(getReturnValues()).append(",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: ").append(getReturnConsumedCapacity()).append(",");
        if (getReturnItemCollectionMetrics() != null)
            sb.append("ReturnItemCollectionMetrics: ").append(getReturnItemCollectionMetrics()).append(",");
        if (getUpdateExpression() != null)
            sb.append("UpdateExpression: ").append(getUpdateExpression()).append(",");
        if (getConditionExpression() != null)
            sb.append("ConditionExpression: ").append(getConditionExpression()).append(",");
        if (getExpressionAttributeNames() != null)
            sb.append("ExpressionAttributeNames: ").append(getExpressionAttributeNames()).append(",");
        if (getExpressionAttributeValues() != null)
            sb.append("ExpressionAttributeValues: ").append(getExpressionAttributeValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateItemRequest == false)
            return false;
        UpdateItemRequest other = (UpdateItemRequest) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getAttributeUpdates() == null ^ this.getAttributeUpdates() == null)
            return false;
        if (other.getAttributeUpdates() != null && other.getAttributeUpdates().equals(this.getAttributeUpdates()) == false)
            return false;
        if (other.getExpected() == null ^ this.getExpected() == null)
            return false;
        if (other.getExpected() != null && other.getExpected().equals(this.getExpected()) == false)
            return false;
        if (other.getConditionalOperator() == null ^ this.getConditionalOperator() == null)
            return false;
        if (other.getConditionalOperator() != null && other.getConditionalOperator().equals(this.getConditionalOperator()) == false)
            return false;
        if (other.getReturnValues() == null ^ this.getReturnValues() == null)
            return false;
        if (other.getReturnValues() != null && other.getReturnValues().equals(this.getReturnValues()) == false)
            return false;
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null)
            return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false)
            return false;
        if (other.getReturnItemCollectionMetrics() == null ^ this.getReturnItemCollectionMetrics() == null)
            return false;
        if (other.getReturnItemCollectionMetrics() != null && other.getReturnItemCollectionMetrics().equals(this.getReturnItemCollectionMetrics()) == false)
            return false;
        if (other.getUpdateExpression() == null ^ this.getUpdateExpression() == null)
            return false;
        if (other.getUpdateExpression() != null && other.getUpdateExpression().equals(this.getUpdateExpression()) == false)
            return false;
        if (other.getConditionExpression() == null ^ this.getConditionExpression() == null)
            return false;
        if (other.getConditionExpression() != null && other.getConditionExpression().equals(this.getConditionExpression()) == false)
            return false;
        if (other.getExpressionAttributeNames() == null ^ this.getExpressionAttributeNames() == null)
            return false;
        if (other.getExpressionAttributeNames() != null && other.getExpressionAttributeNames().equals(this.getExpressionAttributeNames()) == false)
            return false;
        if (other.getExpressionAttributeValues() == null ^ this.getExpressionAttributeValues() == null)
            return false;
        if (other.getExpressionAttributeValues() != null && other.getExpressionAttributeValues().equals(this.getExpressionAttributeValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getAttributeUpdates() == null) ? 0 : getAttributeUpdates().hashCode());
        hashCode = prime * hashCode + ((getExpected() == null) ? 0 : getExpected().hashCode());
        hashCode = prime * hashCode + ((getConditionalOperator() == null) ? 0 : getConditionalOperator().hashCode());
        hashCode = prime * hashCode + ((getReturnValues() == null) ? 0 : getReturnValues().hashCode());
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode());
        hashCode = prime * hashCode + ((getReturnItemCollectionMetrics() == null) ? 0 : getReturnItemCollectionMetrics().hashCode());
        hashCode = prime * hashCode + ((getUpdateExpression() == null) ? 0 : getUpdateExpression().hashCode());
        hashCode = prime * hashCode + ((getConditionExpression() == null) ? 0 : getConditionExpression().hashCode());
        hashCode = prime * hashCode + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getExpressionAttributeValues() == null) ? 0 : getExpressionAttributeValues().hashCode());
        return hashCode;
    }

    @Override
    public UpdateItemRequest clone() {
        return (UpdateItemRequest) super.clone();
    }

}
