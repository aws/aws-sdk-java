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
 * Represents the input of a <code>DeleteItem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the table from which to delete the item.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects, representing the primary key of the item to
     * delete.
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
     * Use <code>ReturnValues</code> if you want to get the item attributes as they appeared before they were deleted.
     * For <code>DeleteItem</code>, the valid values are:
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
     * <code>ALL_OLD</code> - The content of the old item is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>ReturnValues</code> parameter is used by several DynamoDB operations; however, <code>DeleteItem</code>
     * does not recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
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
     * A condition that must be satisfied in order for a conditional <code>DeleteItem</code> to succeed.
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
     * Default constructor for DeleteItemRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public DeleteItemRequest() {
    }

    /**
     * Constructs a new DeleteItemRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     *        The name of the table from which to delete the item.
     * @param key
     *        A map of attribute names to <code>AttributeValue</code> objects, representing the primary key of the item
     *        to delete.</p>
     *        <p>
     *        For the primary key, you must provide all of the attributes. For example, with a simple primary key, you
     *        only need to provide a value for the partition key. For a composite primary key, you must provide values
     *        for both the partition key and the sort key.
     */
    public DeleteItemRequest(String tableName, java.util.Map<String, AttributeValue> key) {
        setTableName(tableName);
        setKey(key);
    }

    /**
     * Constructs a new DeleteItemRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     *        The name of the table from which to delete the item.
     * @param key
     *        A map of attribute names to <code>AttributeValue</code> objects, representing the primary key of the item
     *        to delete.</p>
     *        <p>
     *        For the primary key, you must provide all of the attributes. For example, with a simple primary key, you
     *        only need to provide a value for the partition key. For a composite primary key, you must provide values
     *        for both the partition key and the sort key.
     * @param returnValues
     *        Use <code>ReturnValues</code> if you want to get the item attributes as they appeared before they were
     *        deleted. For <code>DeleteItem</code>, the valid values are:
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
     *        <code>ALL_OLD</code> - The content of the old item is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>ReturnValues</code> parameter is used by several DynamoDB operations; however,
     *        <code>DeleteItem</code> does not recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>
     *        .
     *        </p>
     */
    public DeleteItemRequest(String tableName, java.util.Map<String, AttributeValue> key, String returnValues) {
        setTableName(tableName);
        setKey(key);
        setReturnValues(returnValues);
    }

    /**
     * Constructs a new DeleteItemRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     *        The name of the table from which to delete the item.
     * @param key
     *        A map of attribute names to <code>AttributeValue</code> objects, representing the primary key of the item
     *        to delete.</p>
     *        <p>
     *        For the primary key, you must provide all of the attributes. For example, with a simple primary key, you
     *        only need to provide a value for the partition key. For a composite primary key, you must provide values
     *        for both the partition key and the sort key.
     * @param returnValues
     *        Use <code>ReturnValues</code> if you want to get the item attributes as they appeared before they were
     *        deleted. For <code>DeleteItem</code>, the valid values are:
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
     *        <code>ALL_OLD</code> - The content of the old item is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>ReturnValues</code> parameter is used by several DynamoDB operations; however,
     *        <code>DeleteItem</code> does not recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>
     *        .
     *        </p>
     */
    public DeleteItemRequest(String tableName, java.util.Map<String, AttributeValue> key, ReturnValue returnValues) {
        setTableName(tableName);
        setKey(key);
        setReturnValues(returnValues.toString());
    }

    /**
     * <p>
     * The name of the table from which to delete the item.
     * </p>
     * 
     * @param tableName
     *        The name of the table from which to delete the item.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table from which to delete the item.
     * </p>
     * 
     * @return The name of the table from which to delete the item.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table from which to delete the item.
     * </p>
     * 
     * @param tableName
     *        The name of the table from which to delete the item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteItemRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects, representing the primary key of the item to
     * delete.
     * </p>
     * <p>
     * For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only
     * need to provide a value for the partition key. For a composite primary key, you must provide values for both the
     * partition key and the sort key.
     * </p>
     * 
     * @return A map of attribute names to <code>AttributeValue</code> objects, representing the primary key of the item
     *         to delete.</p>
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
     * A map of attribute names to <code>AttributeValue</code> objects, representing the primary key of the item to
     * delete.
     * </p>
     * <p>
     * For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only
     * need to provide a value for the partition key. For a composite primary key, you must provide values for both the
     * partition key and the sort key.
     * </p>
     * 
     * @param key
     *        A map of attribute names to <code>AttributeValue</code> objects, representing the primary key of the item
     *        to delete.</p>
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
     * A map of attribute names to <code>AttributeValue</code> objects, representing the primary key of the item to
     * delete.
     * </p>
     * <p>
     * For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only
     * need to provide a value for the partition key. For a composite primary key, you must provide values for both the
     * partition key and the sort key.
     * </p>
     * 
     * @param key
     *        A map of attribute names to <code>AttributeValue</code> objects, representing the primary key of the item
     *        to delete.</p>
     *        <p>
     *        For the primary key, you must provide all of the attributes. For example, with a simple primary key, you
     *        only need to provide a value for the partition key. For a composite primary key, you must provide values
     *        for both the partition key and the sort key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteItemRequest withKey(java.util.Map<String, AttributeValue> key) {
        setKey(key);
        return this;
    }

    public DeleteItemRequest addKeyEntry(String key, AttributeValue value) {
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

    public DeleteItemRequest clearKeyEntries() {
        this.key = null;
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

    public DeleteItemRequest withExpected(java.util.Map<String, ExpectedAttributeValue> expected) {
        setExpected(expected);
        return this;
    }

    public DeleteItemRequest addExpectedEntry(String key, ExpectedAttributeValue value) {
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

    public DeleteItemRequest clearExpectedEntries() {
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

    public DeleteItemRequest withConditionalOperator(String conditionalOperator) {
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

    public DeleteItemRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
        return this;
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as they appeared before they were deleted.
     * For <code>DeleteItem</code>, the valid values are:
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
     * <code>ALL_OLD</code> - The content of the old item is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>ReturnValues</code> parameter is used by several DynamoDB operations; however, <code>DeleteItem</code>
     * does not recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * 
     * @param returnValues
     *        Use <code>ReturnValues</code> if you want to get the item attributes as they appeared before they were
     *        deleted. For <code>DeleteItem</code>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>,
     *        then nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - The content of the old item is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>ReturnValues</code> parameter is used by several DynamoDB operations; however,
     *        <code>DeleteItem</code> does not recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>
     *        .
     *        </p>
     * @see ReturnValue
     */

    public void setReturnValues(String returnValues) {
        this.returnValues = returnValues;
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as they appeared before they were deleted.
     * For <code>DeleteItem</code>, the valid values are:
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
     * <code>ALL_OLD</code> - The content of the old item is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>ReturnValues</code> parameter is used by several DynamoDB operations; however, <code>DeleteItem</code>
     * does not recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * 
     * @return Use <code>ReturnValues</code> if you want to get the item attributes as they appeared before they were
     *         deleted. For <code>DeleteItem</code>, the valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>,
     *         then nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL_OLD</code> - The content of the old item is returned.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The <code>ReturnValues</code> parameter is used by several DynamoDB operations; however,
     *         <code>DeleteItem</code> does not recognize any values other than <code>NONE</code> or
     *         <code>ALL_OLD</code>.
     *         </p>
     * @see ReturnValue
     */

    public String getReturnValues() {
        return this.returnValues;
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as they appeared before they were deleted.
     * For <code>DeleteItem</code>, the valid values are:
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
     * <code>ALL_OLD</code> - The content of the old item is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>ReturnValues</code> parameter is used by several DynamoDB operations; however, <code>DeleteItem</code>
     * does not recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * 
     * @param returnValues
     *        Use <code>ReturnValues</code> if you want to get the item attributes as they appeared before they were
     *        deleted. For <code>DeleteItem</code>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>,
     *        then nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - The content of the old item is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>ReturnValues</code> parameter is used by several DynamoDB operations; however,
     *        <code>DeleteItem</code> does not recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>
     *        .
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnValue
     */

    public DeleteItemRequest withReturnValues(String returnValues) {
        setReturnValues(returnValues);
        return this;
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as they appeared before they were deleted.
     * For <code>DeleteItem</code>, the valid values are:
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
     * <code>ALL_OLD</code> - The content of the old item is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>ReturnValues</code> parameter is used by several DynamoDB operations; however, <code>DeleteItem</code>
     * does not recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * 
     * @param returnValues
     *        Use <code>ReturnValues</code> if you want to get the item attributes as they appeared before they were
     *        deleted. For <code>DeleteItem</code>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>,
     *        then nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - The content of the old item is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>ReturnValues</code> parameter is used by several DynamoDB operations; however,
     *        <code>DeleteItem</code> does not recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>
     *        .
     *        </p>
     * @see ReturnValue
     */

    public void setReturnValues(ReturnValue returnValues) {
        withReturnValues(returnValues);
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as they appeared before they were deleted.
     * For <code>DeleteItem</code>, the valid values are:
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
     * <code>ALL_OLD</code> - The content of the old item is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>ReturnValues</code> parameter is used by several DynamoDB operations; however, <code>DeleteItem</code>
     * does not recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * 
     * @param returnValues
     *        Use <code>ReturnValues</code> if you want to get the item attributes as they appeared before they were
     *        deleted. For <code>DeleteItem</code>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>,
     *        then nothing is returned. (This setting is the default for <code>ReturnValues</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - The content of the old item is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>ReturnValues</code> parameter is used by several DynamoDB operations; however,
     *        <code>DeleteItem</code> does not recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>
     *        .
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnValue
     */

    public DeleteItemRequest withReturnValues(ReturnValue returnValues) {
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

    public DeleteItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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

    public DeleteItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
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

    public DeleteItemRequest withReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
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

    public DeleteItemRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
        return this;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional <code>DeleteItem</code> to succeed.
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
     *        A condition that must be satisfied in order for a conditional <code>DeleteItem</code> to succeed.</p>
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
     * A condition that must be satisfied in order for a conditional <code>DeleteItem</code> to succeed.
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
     * @return A condition that must be satisfied in order for a conditional <code>DeleteItem</code> to succeed.</p>
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
     * A condition that must be satisfied in order for a conditional <code>DeleteItem</code> to succeed.
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
     *        A condition that must be satisfied in order for a conditional <code>DeleteItem</code> to succeed.</p>
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

    public DeleteItemRequest withConditionExpression(String conditionExpression) {
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

    public DeleteItemRequest withExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        setExpressionAttributeNames(expressionAttributeNames);
        return this;
    }

    public DeleteItemRequest addExpressionAttributeNamesEntry(String key, String value) {
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

    public DeleteItemRequest clearExpressionAttributeNamesEntries() {
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

    public DeleteItemRequest withExpressionAttributeValues(java.util.Map<String, AttributeValue> expressionAttributeValues) {
        setExpressionAttributeValues(expressionAttributeValues);
        return this;
    }

    public DeleteItemRequest addExpressionAttributeValuesEntry(String key, AttributeValue value) {
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

    public DeleteItemRequest clearExpressionAttributeValuesEntries() {
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
    public DeleteItemRequest withKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey)
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

        if (obj instanceof DeleteItemRequest == false)
            return false;
        DeleteItemRequest other = (DeleteItemRequest) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
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
        hashCode = prime * hashCode + ((getExpected() == null) ? 0 : getExpected().hashCode());
        hashCode = prime * hashCode + ((getConditionalOperator() == null) ? 0 : getConditionalOperator().hashCode());
        hashCode = prime * hashCode + ((getReturnValues() == null) ? 0 : getReturnValues().hashCode());
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode());
        hashCode = prime * hashCode + ((getReturnItemCollectionMetrics() == null) ? 0 : getReturnItemCollectionMetrics().hashCode());
        hashCode = prime * hashCode + ((getConditionExpression() == null) ? 0 : getConditionExpression().hashCode());
        hashCode = prime * hashCode + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getExpressionAttributeValues() == null) ? 0 : getExpressionAttributeValues().hashCode());
        return hashCode;
    }

    @Override
    public DeleteItemRequest clone() {
        return (DeleteItemRequest) super.clone();
    }

}
