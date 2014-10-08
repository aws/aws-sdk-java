/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#deleteItem(DeleteItemRequest) DeleteItem operation}.
 * <p>
 * Deletes a single item in a table by primary key. You can perform a
 * conditional delete operation that deletes the item if it exists, or if
 * it has an expected attribute value.
 * </p>
 * <p>
 * In addition to deleting an item, you can also return the item's
 * attribute values in the same operation, using the <i>ReturnValues</i>
 * parameter.
 * </p>
 * <p>
 * Unless you specify conditions, the <i>DeleteItem</i> is an idempotent
 * operation; running it multiple times on the same item or attribute
 * does <i>not</i> result in an error response.
 * </p>
 * <p>
 * Conditional deletes are useful for deleting items only if specific
 * conditions are met. If those conditions are met, DynamoDB performs the
 * delete. Otherwise, the item is not deleted.
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#deleteItem(DeleteItemRequest)
 */
public class DeleteItemRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the table from which to delete the item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete. <p>For the primary
     * key, you must provide all of the attributes. For example, with a hash
     * type primary key, you only need to specify the hash attribute. For a
     * hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     */
    private java.util.Map<String,AttributeValue> key;

    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>ConditionExpression</i> instead. Note that if you use
     * <i>Expected</i> and <i> ConditionExpression </i> at the same time,
     * DynamoDB will return a <i>ValidationException</i> exception. <p>This
     * parameter does not support lists or maps. </important> <p>A map of
     * attribute/condition pairs. <i>Expected</i> provides a conditional
     * block for the <i>DeleteItem</i> operation. <p>Each element of
     * <i>Expected</i> consists of an attribute name, a comparison operator,
     * and one or more values. DynamoDB compares the attribute with the
     * value(s) you supplied, using the comparison operator. For each
     * <i>Expected</i> element, the result of the evaluation is either true
     * or false. <p>If you specify more than one element in the
     * <i>Expected</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together.
     * (You can use the <i>ConditionalOperator</i> parameter to OR the
     * conditions instead. If you do this, then at least one of the
     * conditions must evaluate to true, rather than all of them.) <p>If the
     * <i>Expected</i> map evaluates to true, then the conditional operation
     * succeeds; otherwise, it fails. <p><i>Expected</i> contains the
     * following: <ul> <li> <p><i>AttributeValueList</i> - One or more values
     * to evaluate against the supplied attribute. The number of values in
     * the list depends on the <i>ComparisonOperator</i> being used. <p>For
     * type Number, value comparisons are numeric. <p>String value
     * comparisons for greater than, equals, or less than are based on ASCII
     * character code values. For example, <code>a</code> is greater than
     * <code>A</code>, and <code>aa</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes in the <i>AttributeValueList</i>.
     * When performing the comparison, DynamoDB uses strongly consistent
     * reads. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <code>EQ</code> is supported for all datatypes, including
     * lists and maps. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, Binary, String
     * Set, Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <code>NE</code> is supported for all datatypes, including lists and
     * maps. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>LT</code> : Less than. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set type). If an item contains an <i>AttributeValue</i>
     * element of a different type than the one specified in the request, the
     * value does not match. For example, <code>{"S":"6"}</code> does not
     * equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     * compare to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>GE</code> : Greater than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>GT</code> : Greater than. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> element of type String, Number,
     * or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The attribute
     * exists. <code>NOT_NULL</code> is supported for all datatypes,
     * including lists and maps. <note><p>This operator tests for the
     * existence of an attribute, not its data type. If the data type of
     * attribute "<code>a</code>" is null, and you evaluate it using
     * <code>NOT_NULL</code>, the result is a Boolean <i>true</i>. This
     * result is because the attribute "<code>a</code>" exists; its data type
     * is not relevant to the <code>NOT_NULL</code> comparison operator.
     * </note> </li> <li> <p><code>NULL</code> : The attribute does not
     * exist. <code>NULL</code> is supported for all datatypes, including
     * lists and maps. <note><p>This operator tests for the nonexistence of
     * an attribute, not its data type. If the data type of attribute
     * "<code>a</code>" is null, and you evaluate it using <code>NULL</code>,
     * the result is a Boolean <i>false</i>. This is because the attribute
     * "<code>a</code>" exists; its data type is not relevant to the
     * <code>NULL</code> comparison operator. </note> </li> <li>
     * <p><code>CONTAINS</code> : Checks for a subsequence, or value in a
     * set. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If the target attribute of the comparison is of type
     * String, then the operator checks for a substring match. If the target
     * attribute of the comparison is of type Binary, then the operator looks
     * for a subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("<code>SS</code>",
     * "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates
     * to true if it finds an exact match with any member of the set.
     * <p>CONTAINS is supported for lists: When evaluating "<code>a CONTAINS
     * b</code>", "<code>a</code>" can be a list; however, "<code>b</code>"
     * cannot be a set, a map, or a list. </li> <li>
     * <p><code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or
     * absence of a value in a set. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> element of type String, Number, or
     * Binary (not a set type). If the target attribute of the comparison is
     * a String, then the operator checks for the absence of a substring
     * match. If the target attribute of the comparison is Binary, then the
     * operator checks for the absence of a subsequence of the target that
     * matches the input. If the target attribute of the comparison is a set
     * ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the
     * operator evaluates to true if it <i>does not</i> find an exact match
     * with any member of the set. <p>NOT_CONTAINS is supported for lists:
     * When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>" can
     * be a list; however, "<code>b</code>" cannot be a set, a map, or a
     * list. </li> <li> <p><code>BEGINS_WITH</code> : Checks for a prefix.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a set
     * type). The target attribute of the comparison must be of type String
     * or Binary (not a Number or a set type). <p/> </li> <li>
     * <p><code>IN</code> : Checks for matching elements within two sets.
     * <p><i>AttributeValueList</i> can contain one or more
     * <i>AttributeValue</i> elements of type String, Number, or Binary (not
     * a set type). These attributes are compared against an existing set
     * type attribute of an item. If any elements of the input set are
     * present in the item attribute, the expression evaluates to true. </li>
     * <li> <p><code>BETWEEN</code> : Greater than or equal to the first
     * value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a set
     * type). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     * usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>. <p>For backward compatibility with previous DynamoDB
     * releases, the following parameters can be used instead of
     * <i>AttributeValueList</i> and <i>ComparisonOperator</i>: <ul> <li>
     * <p><i>Value</i> - A value for DynamoDB to compare with an attribute.
     * </li> <li> <p><i>Exists</i> - A Boolean value that causes DynamoDB to
     * evaluate the value before attempting the conditional operation: <ul>
     * <li> <p>If <i>Exists</i> is <code>true</code>, DynamoDB will check to
     * see if that attribute value already exists in the table. If it is
     * found, then the condition evaluates to true; otherwise the condition
     * evaluate to false. </li> <li><p>If <i>Exists</i> is
     * <code>false</code>, DynamoDB assumes that the attribute value does
     * <i>not</i> exist in the table. If in fact the value does not exist,
     * then the assumption is valid and the condition evaluates to true. If
     * the value is found, despite the assumption that it does not exist, the
     * condition evaluates to false.</li> </ul> </li> </ul> <p>The
     * <i>Value</i> and <i>Exists</i> parameters are incompatible with
     * <i>AttributeValueList</i> and <i>ComparisonOperator</i>. Note that if
     * you use both sets of parameters at once, DynamoDB will return a
     * <i>ValidationException</i> exception.
     */
    private java.util.Map<String,ExpectedAttributeValue> expected;

    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>ConditionExpression</i> instead. Note that if you use
     * <i>ConditionalOperator</i> and <i> ConditionExpression </i> at the
     * same time, DynamoDB will return a <i>ValidationException</i>
     * exception. <p>This parameter does not support lists or maps.
     * </important> <p>A logical operator to apply to the conditions in the
     * <i>Expected</i> map: <ul> <li><p><code>AND</code> - If all of the
     * conditions evaluate to true, then the entire map evaluates to
     * true.</li> <li><p><code>OR</code> - If at least one of the conditions
     * evaluate to true, then the entire map evaluates to true.</li> </ul>
     * <p>If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     * the default. <p>The operation will succeed only if the entire map
     * evaluates to true.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     */
    private String conditionalOperator;

    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were deleted. For <i>DeleteItem</i>, the valid
     * values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     * not specified, or if its value is <code>NONE</code>, then nothing is
     * returned. (This setting is the default for <i>ReturnValues</i>.) </li>
     * <li> <p><code>ALL_OLD</code> - The content of the old item is
     * returned. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     */
    private String returnValues;

    /**
     * A value that if set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     */
    private String returnConsumedCapacity;

    /**
     * A value that if set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during
     * the operation are returned in the response. If set to
     * <code>NONE</code> (the default), no statistics are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     */
    private String returnItemCollectionMetrics;

    /**
     * A condition that must be satisfied in order for a conditional
     * <i>DeleteItem</i> to succeed. <p>An expression can contain any of the
     * following: <ul> <li> <p>Boolean functions: <code>ATTRIBUTE_EXIST |
     * CONTAINS | BEGINS_WITH</code> </li> <li> <p>Comparison operators:
     * <code> = | <> | < | > | <= | >= | BETWEEN | IN</code> </li> <li>
     * <p>Logical operators: <code>NOT | AND | OR</code> </li> </ul>
     */
    private String conditionExpression;

    /**
     * One or more substitution tokens for simplifying complex expressions.
     * The following are some use cases for an
     * <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     * attribute name that is very long or unwieldy in an expression. </li>
     * <li> <p>To create a placeholder for repeating occurrences of an
     * attribute name in an expression. </li> <li> <p>To prevent special
     * characters in an attribute name from being misinterpreted in an
     * expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     * to dereference an attribute name. For example, consider the following
     * expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     * order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     * that you specified the following for <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     * <p>The expression can now be simplified as follows:
     * <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     */
    private java.util.Map<String,String> expressionAttributeNames;

    /**
     * One or more values that can be substituted in an expression. <p>Use
     * the <b>:</b> character in an expression to dereference an attribute
     * value. For example, consider the following expression:
     * <ul><li><p><code>ProductStatus IN
     * ("Available","Backordered","Discontinued")</code></li></ul> <p>Now
     * suppose that you specified the following for
     * <i>ExpressionAttributeValues</i>: <ul><li><p><code>{
     * "a":{"S":"Available"}, "b":{"S":"Backordered"},
     * "d":{"S":"Discontinued"} }</code></li></ul> <p>The expression can now
     * be simplified as follows: <ul><li> <p><code>ProductStatus IN
     * (:a,:b,:c)</code></li></ul>
     */
    private java.util.Map<String,AttributeValue> expressionAttributeValues;

    /**
     * Default constructor for a new DeleteItemRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteItemRequest() {}
    
    /**
     * Constructs a new DeleteItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table from which to delete the item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete. <p>For the primary
     * key, you must provide all of the attributes. For example, with a hash
     * type primary key, you only need to specify the hash attribute. For a
     * hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     */
    public DeleteItemRequest(String tableName, java.util.Map<String,AttributeValue> key) {
        setTableName(tableName);
        setKey(key);
    }

    /**
     * Constructs a new DeleteItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table from which to delete the item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete. <p>For the primary
     * key, you must provide all of the attributes. For example, with a hash
     * type primary key, you only need to specify the hash attribute. For a
     * hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared before they were deleted. For
     * <i>DeleteItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This
     * setting is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - The content of the old item is returned.
     * </li> </ul>
     */
    public DeleteItemRequest(String tableName, java.util.Map<String,AttributeValue> key, String returnValues) {
        setTableName(tableName);
        setKey(key);
        setReturnValues(returnValues);
    }

    /**
     * Constructs a new DeleteItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table from which to delete the item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete. <p>For the primary
     * key, you must provide all of the attributes. For example, with a hash
     * type primary key, you only need to specify the hash attribute. For a
     * hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared before they were deleted. For
     * <i>DeleteItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This
     * setting is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - The content of the old item is returned.
     * </li> </ul>
     */
    public DeleteItemRequest(String tableName, java.util.Map<String,AttributeValue> key, ReturnValue returnValues) {
        this.tableName = tableName;
        this.key = key;
        this.returnValues = returnValues.toString();
    }

    /**
     * The name of the table from which to delete the item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table from which to delete the item.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table from which to delete the item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table from which to delete the item.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table from which to delete the item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table from which to delete the item.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteItemRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete. <p>For the primary
     * key, you must provide all of the attributes. For example, with a hash
     * type primary key, you only need to specify the hash attribute. For a
     * hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     *
     * @return A map of attribute names to <i>AttributeValue</i> objects,
     *         representing the primary key of the item to delete. <p>For the primary
     *         key, you must provide all of the attributes. For example, with a hash
     *         type primary key, you only need to specify the hash attribute. For a
     *         hash-and-range type primary key, you must specify both the hash
     *         attribute and the range attribute.
     */
    public java.util.Map<String,AttributeValue> getKey() {
        
        return key;
    }
    
    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete. <p>For the primary
     * key, you must provide all of the attributes. For example, with a hash
     * type primary key, you only need to specify the hash attribute. For a
     * hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     *
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     *         representing the primary key of the item to delete. <p>For the primary
     *         key, you must provide all of the attributes. For example, with a hash
     *         type primary key, you only need to specify the hash attribute. For a
     *         hash-and-range type primary key, you must specify both the hash
     *         attribute and the range attribute.
     */
    public void setKey(java.util.Map<String,AttributeValue> key) {
        this.key = key;
    }
    
    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete. <p>For the primary
     * key, you must provide all of the attributes. For example, with a hash
     * type primary key, you only need to specify the hash attribute. For a
     * hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     *         representing the primary key of the item to delete. <p>For the primary
     *         key, you must provide all of the attributes. For example, with a hash
     *         type primary key, you only need to specify the hash attribute. For a
     *         hash-and-range type primary key, you must specify both the hash
     *         attribute and the range attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteItemRequest withKey(java.util.Map<String,AttributeValue> key) {
        setKey(key);
        return this;
    }

    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete. <p>For the primary
     * key, you must provide all of the attributes. For example, with a hash
     * type primary key, you only need to specify the hash attribute. For a
     * hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     * <p>
     * This method accepts the hashKey, rangeKey of Key as
     * java.util.Map.Entry<String, AttributeValue> objects.
     *
     * @param hashKey Primary hash key.
     * @param rangeKey Primary range key. (null if it a hash-only table)
     */
    public void setKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey) throws IllegalArgumentException {
        java.util.HashMap<String,AttributeValue> key = new java.util.HashMap<String,AttributeValue>();
        
        if (hashKey != null) {
            key.put(hashKey.getKey(), hashKey.getValue());
        } else
            throw new IllegalArgumentException("hashKey must be non-null object.");
        if (rangeKey != null) {
            key.put(rangeKey.getKey(), rangeKey.getValue());
        } 
        setKey(key);
    }
    
    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete. <p>For the primary
     * key, you must provide all of the attributes. For example, with a hash
     * type primary key, you only need to specify the hash attribute. For a
     * hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     * <p>
     * This method accepts the hashKey, rangeKey of Key as
     * java.util.Map.Entry<String, AttributeValue> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hashKey Primary hash key.
     * @param rangeKey Primary range key. (null if it a hash-only table)
     */
    public DeleteItemRequest withKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey) throws IllegalArgumentException {
        setKey(hashKey, rangeKey);
        return this;
    }

    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete. <p>For the primary
     * key, you must provide all of the attributes. For example, with a hash
     * type primary key, you only need to specify the hash attribute. For a
     * hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     * <p>
     * The method adds a new key-value pair into Key parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Key.
     * @param value The corresponding value of the entry to be added into Key.
     */
    public DeleteItemRequest addKeyEntry(String key, AttributeValue value) {
        if (null == this.key) {
            this.key = new java.util.HashMap<String,AttributeValue>();
        }
        if (this.key.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.key.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public DeleteItemRequest clearKeyEntries() {
        this.key = null;
        return this;
    }
    
    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>ConditionExpression</i> instead. Note that if you use
     * <i>Expected</i> and <i> ConditionExpression </i> at the same time,
     * DynamoDB will return a <i>ValidationException</i> exception. <p>This
     * parameter does not support lists or maps. </important> <p>A map of
     * attribute/condition pairs. <i>Expected</i> provides a conditional
     * block for the <i>DeleteItem</i> operation. <p>Each element of
     * <i>Expected</i> consists of an attribute name, a comparison operator,
     * and one or more values. DynamoDB compares the attribute with the
     * value(s) you supplied, using the comparison operator. For each
     * <i>Expected</i> element, the result of the evaluation is either true
     * or false. <p>If you specify more than one element in the
     * <i>Expected</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together.
     * (You can use the <i>ConditionalOperator</i> parameter to OR the
     * conditions instead. If you do this, then at least one of the
     * conditions must evaluate to true, rather than all of them.) <p>If the
     * <i>Expected</i> map evaluates to true, then the conditional operation
     * succeeds; otherwise, it fails. <p><i>Expected</i> contains the
     * following: <ul> <li> <p><i>AttributeValueList</i> - One or more values
     * to evaluate against the supplied attribute. The number of values in
     * the list depends on the <i>ComparisonOperator</i> being used. <p>For
     * type Number, value comparisons are numeric. <p>String value
     * comparisons for greater than, equals, or less than are based on ASCII
     * character code values. For example, <code>a</code> is greater than
     * <code>A</code>, and <code>aa</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes in the <i>AttributeValueList</i>.
     * When performing the comparison, DynamoDB uses strongly consistent
     * reads. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <code>EQ</code> is supported for all datatypes, including
     * lists and maps. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, Binary, String
     * Set, Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <code>NE</code> is supported for all datatypes, including lists and
     * maps. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>LT</code> : Less than. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set type). If an item contains an <i>AttributeValue</i>
     * element of a different type than the one specified in the request, the
     * value does not match. For example, <code>{"S":"6"}</code> does not
     * equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     * compare to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>GE</code> : Greater than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>GT</code> : Greater than. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> element of type String, Number,
     * or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The attribute
     * exists. <code>NOT_NULL</code> is supported for all datatypes,
     * including lists and maps. <note><p>This operator tests for the
     * existence of an attribute, not its data type. If the data type of
     * attribute "<code>a</code>" is null, and you evaluate it using
     * <code>NOT_NULL</code>, the result is a Boolean <i>true</i>. This
     * result is because the attribute "<code>a</code>" exists; its data type
     * is not relevant to the <code>NOT_NULL</code> comparison operator.
     * </note> </li> <li> <p><code>NULL</code> : The attribute does not
     * exist. <code>NULL</code> is supported for all datatypes, including
     * lists and maps. <note><p>This operator tests for the nonexistence of
     * an attribute, not its data type. If the data type of attribute
     * "<code>a</code>" is null, and you evaluate it using <code>NULL</code>,
     * the result is a Boolean <i>false</i>. This is because the attribute
     * "<code>a</code>" exists; its data type is not relevant to the
     * <code>NULL</code> comparison operator. </note> </li> <li>
     * <p><code>CONTAINS</code> : Checks for a subsequence, or value in a
     * set. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If the target attribute of the comparison is of type
     * String, then the operator checks for a substring match. If the target
     * attribute of the comparison is of type Binary, then the operator looks
     * for a subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("<code>SS</code>",
     * "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates
     * to true if it finds an exact match with any member of the set.
     * <p>CONTAINS is supported for lists: When evaluating "<code>a CONTAINS
     * b</code>", "<code>a</code>" can be a list; however, "<code>b</code>"
     * cannot be a set, a map, or a list. </li> <li>
     * <p><code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or
     * absence of a value in a set. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> element of type String, Number, or
     * Binary (not a set type). If the target attribute of the comparison is
     * a String, then the operator checks for the absence of a substring
     * match. If the target attribute of the comparison is Binary, then the
     * operator checks for the absence of a subsequence of the target that
     * matches the input. If the target attribute of the comparison is a set
     * ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the
     * operator evaluates to true if it <i>does not</i> find an exact match
     * with any member of the set. <p>NOT_CONTAINS is supported for lists:
     * When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>" can
     * be a list; however, "<code>b</code>" cannot be a set, a map, or a
     * list. </li> <li> <p><code>BEGINS_WITH</code> : Checks for a prefix.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a set
     * type). The target attribute of the comparison must be of type String
     * or Binary (not a Number or a set type). <p/> </li> <li>
     * <p><code>IN</code> : Checks for matching elements within two sets.
     * <p><i>AttributeValueList</i> can contain one or more
     * <i>AttributeValue</i> elements of type String, Number, or Binary (not
     * a set type). These attributes are compared against an existing set
     * type attribute of an item. If any elements of the input set are
     * present in the item attribute, the expression evaluates to true. </li>
     * <li> <p><code>BETWEEN</code> : Greater than or equal to the first
     * value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a set
     * type). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     * usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>. <p>For backward compatibility with previous DynamoDB
     * releases, the following parameters can be used instead of
     * <i>AttributeValueList</i> and <i>ComparisonOperator</i>: <ul> <li>
     * <p><i>Value</i> - A value for DynamoDB to compare with an attribute.
     * </li> <li> <p><i>Exists</i> - A Boolean value that causes DynamoDB to
     * evaluate the value before attempting the conditional operation: <ul>
     * <li> <p>If <i>Exists</i> is <code>true</code>, DynamoDB will check to
     * see if that attribute value already exists in the table. If it is
     * found, then the condition evaluates to true; otherwise the condition
     * evaluate to false. </li> <li><p>If <i>Exists</i> is
     * <code>false</code>, DynamoDB assumes that the attribute value does
     * <i>not</i> exist in the table. If in fact the value does not exist,
     * then the assumption is valid and the condition evaluates to true. If
     * the value is found, despite the assumption that it does not exist, the
     * condition evaluates to false.</li> </ul> </li> </ul> <p>The
     * <i>Value</i> and <i>Exists</i> parameters are incompatible with
     * <i>AttributeValueList</i> and <i>ComparisonOperator</i>. Note that if
     * you use both sets of parameters at once, DynamoDB will return a
     * <i>ValidationException</i> exception.
     *
     * @return <important> <p>There is a newer parameter available. Use
     *         <i>ConditionExpression</i> instead. Note that if you use
     *         <i>Expected</i> and <i> ConditionExpression </i> at the same time,
     *         DynamoDB will return a <i>ValidationException</i> exception. <p>This
     *         parameter does not support lists or maps. </important> <p>A map of
     *         attribute/condition pairs. <i>Expected</i> provides a conditional
     *         block for the <i>DeleteItem</i> operation. <p>Each element of
     *         <i>Expected</i> consists of an attribute name, a comparison operator,
     *         and one or more values. DynamoDB compares the attribute with the
     *         value(s) you supplied, using the comparison operator. For each
     *         <i>Expected</i> element, the result of the evaluation is either true
     *         or false. <p>If you specify more than one element in the
     *         <i>Expected</i> map, then by default all of the conditions must
     *         evaluate to true. In other words, the conditions are ANDed together.
     *         (You can use the <i>ConditionalOperator</i> parameter to OR the
     *         conditions instead. If you do this, then at least one of the
     *         conditions must evaluate to true, rather than all of them.) <p>If the
     *         <i>Expected</i> map evaluates to true, then the conditional operation
     *         succeeds; otherwise, it fails. <p><i>Expected</i> contains the
     *         following: <ul> <li> <p><i>AttributeValueList</i> - One or more values
     *         to evaluate against the supplied attribute. The number of values in
     *         the list depends on the <i>ComparisonOperator</i> being used. <p>For
     *         type Number, value comparisons are numeric. <p>String value
     *         comparisons for greater than, equals, or less than are based on ASCII
     *         character code values. For example, <code>a</code> is greater than
     *         <code>A</code>, and <code>aa</code> is greater than <code>B</code>.
     *         For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For type Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     *         comparator for evaluating attributes in the <i>AttributeValueList</i>.
     *         When performing the comparison, DynamoDB uses strongly consistent
     *         reads. <p>The following comparison operators are available:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     *         descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     *         : Equal. <code>EQ</code> is supported for all datatypes, including
     *         lists and maps. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, Binary, String
     *         Set, Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> element of a different type than the one
     *         specified in the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     *         <code>NE</code> is supported for all datatypes, including lists and
     *         maps. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary (not a
     *         set type). If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     *         <p><code>LT</code> : Less than. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> of type String, Number, or
     *         Binary (not a set type). If an item contains an <i>AttributeValue</i>
     *         element of a different type than the one specified in the request, the
     *         value does not match. For example, <code>{"S":"6"}</code> does not
     *         equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     *         compare to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     *         <p><code>GE</code> : Greater than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary (not a
     *         set type). If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     *         <p><code>GT</code> : Greater than. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> element of type String, Number,
     *         or Binary (not a set type). If an item contains an
     *         <i>AttributeValue</i> element of a different type than the one
     *         specified in the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The attribute
     *         exists. <code>NOT_NULL</code> is supported for all datatypes,
     *         including lists and maps. <note><p>This operator tests for the
     *         existence of an attribute, not its data type. If the data type of
     *         attribute "<code>a</code>" is null, and you evaluate it using
     *         <code>NOT_NULL</code>, the result is a Boolean <i>true</i>. This
     *         result is because the attribute "<code>a</code>" exists; its data type
     *         is not relevant to the <code>NOT_NULL</code> comparison operator.
     *         </note> </li> <li> <p><code>NULL</code> : The attribute does not
     *         exist. <code>NULL</code> is supported for all datatypes, including
     *         lists and maps. <note><p>This operator tests for the nonexistence of
     *         an attribute, not its data type. If the data type of attribute
     *         "<code>a</code>" is null, and you evaluate it using <code>NULL</code>,
     *         the result is a Boolean <i>false</i>. This is because the attribute
     *         "<code>a</code>" exists; its data type is not relevant to the
     *         <code>NULL</code> comparison operator. </note> </li> <li>
     *         <p><code>CONTAINS</code> : Checks for a subsequence, or value in a
     *         set. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary (not a
     *         set type). If the target attribute of the comparison is of type
     *         String, then the operator checks for a substring match. If the target
     *         attribute of the comparison is of type Binary, then the operator looks
     *         for a subsequence of the target that matches the input. If the target
     *         attribute of the comparison is a set ("<code>SS</code>",
     *         "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates
     *         to true if it finds an exact match with any member of the set.
     *         <p>CONTAINS is supported for lists: When evaluating "<code>a CONTAINS
     *         b</code>", "<code>a</code>" can be a list; however, "<code>b</code>"
     *         cannot be a set, a map, or a list. </li> <li>
     *         <p><code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or
     *         absence of a value in a set. <p><i>AttributeValueList</i> can contain
     *         only one <i>AttributeValue</i> element of type String, Number, or
     *         Binary (not a set type). If the target attribute of the comparison is
     *         a String, then the operator checks for the absence of a substring
     *         match. If the target attribute of the comparison is Binary, then the
     *         operator checks for the absence of a subsequence of the target that
     *         matches the input. If the target attribute of the comparison is a set
     *         ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the
     *         operator evaluates to true if it <i>does not</i> find an exact match
     *         with any member of the set. <p>NOT_CONTAINS is supported for lists:
     *         When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>" can
     *         be a list; however, "<code>b</code>" cannot be a set, a map, or a
     *         list. </li> <li> <p><code>BEGINS_WITH</code> : Checks for a prefix.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a set
     *         type). The target attribute of the comparison must be of type String
     *         or Binary (not a Number or a set type). <p/> </li> <li>
     *         <p><code>IN</code> : Checks for matching elements within two sets.
     *         <p><i>AttributeValueList</i> can contain one or more
     *         <i>AttributeValue</i> elements of type String, Number, or Binary (not
     *         a set type). These attributes are compared against an existing set
     *         type attribute of an item. If any elements of the input set are
     *         present in the item attribute, the expression evaluates to true. </li>
     *         <li> <p><code>BETWEEN</code> : Greater than or equal to the first
     *         value, and less than or equal to the second value.
     *         <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *         elements of the same type, either String, Number, or Binary (not a set
     *         type). A target attribute matches if the target value is greater than,
     *         or equal to, the first element and less than, or equal to, the second
     *         element. If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not compare to
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     *         usage examples of <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     *         Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>. <p>For backward compatibility with previous DynamoDB
     *         releases, the following parameters can be used instead of
     *         <i>AttributeValueList</i> and <i>ComparisonOperator</i>: <ul> <li>
     *         <p><i>Value</i> - A value for DynamoDB to compare with an attribute.
     *         </li> <li> <p><i>Exists</i> - A Boolean value that causes DynamoDB to
     *         evaluate the value before attempting the conditional operation: <ul>
     *         <li> <p>If <i>Exists</i> is <code>true</code>, DynamoDB will check to
     *         see if that attribute value already exists in the table. If it is
     *         found, then the condition evaluates to true; otherwise the condition
     *         evaluate to false. </li> <li><p>If <i>Exists</i> is
     *         <code>false</code>, DynamoDB assumes that the attribute value does
     *         <i>not</i> exist in the table. If in fact the value does not exist,
     *         then the assumption is valid and the condition evaluates to true. If
     *         the value is found, despite the assumption that it does not exist, the
     *         condition evaluates to false.</li> </ul> </li> </ul> <p>The
     *         <i>Value</i> and <i>Exists</i> parameters are incompatible with
     *         <i>AttributeValueList</i> and <i>ComparisonOperator</i>. Note that if
     *         you use both sets of parameters at once, DynamoDB will return a
     *         <i>ValidationException</i> exception.
     */
    public java.util.Map<String,ExpectedAttributeValue> getExpected() {
        
        return expected;
    }
    
    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>ConditionExpression</i> instead. Note that if you use
     * <i>Expected</i> and <i> ConditionExpression </i> at the same time,
     * DynamoDB will return a <i>ValidationException</i> exception. <p>This
     * parameter does not support lists or maps. </important> <p>A map of
     * attribute/condition pairs. <i>Expected</i> provides a conditional
     * block for the <i>DeleteItem</i> operation. <p>Each element of
     * <i>Expected</i> consists of an attribute name, a comparison operator,
     * and one or more values. DynamoDB compares the attribute with the
     * value(s) you supplied, using the comparison operator. For each
     * <i>Expected</i> element, the result of the evaluation is either true
     * or false. <p>If you specify more than one element in the
     * <i>Expected</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together.
     * (You can use the <i>ConditionalOperator</i> parameter to OR the
     * conditions instead. If you do this, then at least one of the
     * conditions must evaluate to true, rather than all of them.) <p>If the
     * <i>Expected</i> map evaluates to true, then the conditional operation
     * succeeds; otherwise, it fails. <p><i>Expected</i> contains the
     * following: <ul> <li> <p><i>AttributeValueList</i> - One or more values
     * to evaluate against the supplied attribute. The number of values in
     * the list depends on the <i>ComparisonOperator</i> being used. <p>For
     * type Number, value comparisons are numeric. <p>String value
     * comparisons for greater than, equals, or less than are based on ASCII
     * character code values. For example, <code>a</code> is greater than
     * <code>A</code>, and <code>aa</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes in the <i>AttributeValueList</i>.
     * When performing the comparison, DynamoDB uses strongly consistent
     * reads. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <code>EQ</code> is supported for all datatypes, including
     * lists and maps. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, Binary, String
     * Set, Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <code>NE</code> is supported for all datatypes, including lists and
     * maps. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>LT</code> : Less than. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set type). If an item contains an <i>AttributeValue</i>
     * element of a different type than the one specified in the request, the
     * value does not match. For example, <code>{"S":"6"}</code> does not
     * equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     * compare to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>GE</code> : Greater than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>GT</code> : Greater than. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> element of type String, Number,
     * or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The attribute
     * exists. <code>NOT_NULL</code> is supported for all datatypes,
     * including lists and maps. <note><p>This operator tests for the
     * existence of an attribute, not its data type. If the data type of
     * attribute "<code>a</code>" is null, and you evaluate it using
     * <code>NOT_NULL</code>, the result is a Boolean <i>true</i>. This
     * result is because the attribute "<code>a</code>" exists; its data type
     * is not relevant to the <code>NOT_NULL</code> comparison operator.
     * </note> </li> <li> <p><code>NULL</code> : The attribute does not
     * exist. <code>NULL</code> is supported for all datatypes, including
     * lists and maps. <note><p>This operator tests for the nonexistence of
     * an attribute, not its data type. If the data type of attribute
     * "<code>a</code>" is null, and you evaluate it using <code>NULL</code>,
     * the result is a Boolean <i>false</i>. This is because the attribute
     * "<code>a</code>" exists; its data type is not relevant to the
     * <code>NULL</code> comparison operator. </note> </li> <li>
     * <p><code>CONTAINS</code> : Checks for a subsequence, or value in a
     * set. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If the target attribute of the comparison is of type
     * String, then the operator checks for a substring match. If the target
     * attribute of the comparison is of type Binary, then the operator looks
     * for a subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("<code>SS</code>",
     * "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates
     * to true if it finds an exact match with any member of the set.
     * <p>CONTAINS is supported for lists: When evaluating "<code>a CONTAINS
     * b</code>", "<code>a</code>" can be a list; however, "<code>b</code>"
     * cannot be a set, a map, or a list. </li> <li>
     * <p><code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or
     * absence of a value in a set. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> element of type String, Number, or
     * Binary (not a set type). If the target attribute of the comparison is
     * a String, then the operator checks for the absence of a substring
     * match. If the target attribute of the comparison is Binary, then the
     * operator checks for the absence of a subsequence of the target that
     * matches the input. If the target attribute of the comparison is a set
     * ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the
     * operator evaluates to true if it <i>does not</i> find an exact match
     * with any member of the set. <p>NOT_CONTAINS is supported for lists:
     * When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>" can
     * be a list; however, "<code>b</code>" cannot be a set, a map, or a
     * list. </li> <li> <p><code>BEGINS_WITH</code> : Checks for a prefix.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a set
     * type). The target attribute of the comparison must be of type String
     * or Binary (not a Number or a set type). <p/> </li> <li>
     * <p><code>IN</code> : Checks for matching elements within two sets.
     * <p><i>AttributeValueList</i> can contain one or more
     * <i>AttributeValue</i> elements of type String, Number, or Binary (not
     * a set type). These attributes are compared against an existing set
     * type attribute of an item. If any elements of the input set are
     * present in the item attribute, the expression evaluates to true. </li>
     * <li> <p><code>BETWEEN</code> : Greater than or equal to the first
     * value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a set
     * type). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     * usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>. <p>For backward compatibility with previous DynamoDB
     * releases, the following parameters can be used instead of
     * <i>AttributeValueList</i> and <i>ComparisonOperator</i>: <ul> <li>
     * <p><i>Value</i> - A value for DynamoDB to compare with an attribute.
     * </li> <li> <p><i>Exists</i> - A Boolean value that causes DynamoDB to
     * evaluate the value before attempting the conditional operation: <ul>
     * <li> <p>If <i>Exists</i> is <code>true</code>, DynamoDB will check to
     * see if that attribute value already exists in the table. If it is
     * found, then the condition evaluates to true; otherwise the condition
     * evaluate to false. </li> <li><p>If <i>Exists</i> is
     * <code>false</code>, DynamoDB assumes that the attribute value does
     * <i>not</i> exist in the table. If in fact the value does not exist,
     * then the assumption is valid and the condition evaluates to true. If
     * the value is found, despite the assumption that it does not exist, the
     * condition evaluates to false.</li> </ul> </li> </ul> <p>The
     * <i>Value</i> and <i>Exists</i> parameters are incompatible with
     * <i>AttributeValueList</i> and <i>ComparisonOperator</i>. Note that if
     * you use both sets of parameters at once, DynamoDB will return a
     * <i>ValidationException</i> exception.
     *
     * @param expected <important> <p>There is a newer parameter available. Use
     *         <i>ConditionExpression</i> instead. Note that if you use
     *         <i>Expected</i> and <i> ConditionExpression </i> at the same time,
     *         DynamoDB will return a <i>ValidationException</i> exception. <p>This
     *         parameter does not support lists or maps. </important> <p>A map of
     *         attribute/condition pairs. <i>Expected</i> provides a conditional
     *         block for the <i>DeleteItem</i> operation. <p>Each element of
     *         <i>Expected</i> consists of an attribute name, a comparison operator,
     *         and one or more values. DynamoDB compares the attribute with the
     *         value(s) you supplied, using the comparison operator. For each
     *         <i>Expected</i> element, the result of the evaluation is either true
     *         or false. <p>If you specify more than one element in the
     *         <i>Expected</i> map, then by default all of the conditions must
     *         evaluate to true. In other words, the conditions are ANDed together.
     *         (You can use the <i>ConditionalOperator</i> parameter to OR the
     *         conditions instead. If you do this, then at least one of the
     *         conditions must evaluate to true, rather than all of them.) <p>If the
     *         <i>Expected</i> map evaluates to true, then the conditional operation
     *         succeeds; otherwise, it fails. <p><i>Expected</i> contains the
     *         following: <ul> <li> <p><i>AttributeValueList</i> - One or more values
     *         to evaluate against the supplied attribute. The number of values in
     *         the list depends on the <i>ComparisonOperator</i> being used. <p>For
     *         type Number, value comparisons are numeric. <p>String value
     *         comparisons for greater than, equals, or less than are based on ASCII
     *         character code values. For example, <code>a</code> is greater than
     *         <code>A</code>, and <code>aa</code> is greater than <code>B</code>.
     *         For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For type Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     *         comparator for evaluating attributes in the <i>AttributeValueList</i>.
     *         When performing the comparison, DynamoDB uses strongly consistent
     *         reads. <p>The following comparison operators are available:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     *         descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     *         : Equal. <code>EQ</code> is supported for all datatypes, including
     *         lists and maps. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, Binary, String
     *         Set, Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> element of a different type than the one
     *         specified in the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     *         <code>NE</code> is supported for all datatypes, including lists and
     *         maps. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary (not a
     *         set type). If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     *         <p><code>LT</code> : Less than. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> of type String, Number, or
     *         Binary (not a set type). If an item contains an <i>AttributeValue</i>
     *         element of a different type than the one specified in the request, the
     *         value does not match. For example, <code>{"S":"6"}</code> does not
     *         equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     *         compare to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     *         <p><code>GE</code> : Greater than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary (not a
     *         set type). If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     *         <p><code>GT</code> : Greater than. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> element of type String, Number,
     *         or Binary (not a set type). If an item contains an
     *         <i>AttributeValue</i> element of a different type than the one
     *         specified in the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The attribute
     *         exists. <code>NOT_NULL</code> is supported for all datatypes,
     *         including lists and maps. <note><p>This operator tests for the
     *         existence of an attribute, not its data type. If the data type of
     *         attribute "<code>a</code>" is null, and you evaluate it using
     *         <code>NOT_NULL</code>, the result is a Boolean <i>true</i>. This
     *         result is because the attribute "<code>a</code>" exists; its data type
     *         is not relevant to the <code>NOT_NULL</code> comparison operator.
     *         </note> </li> <li> <p><code>NULL</code> : The attribute does not
     *         exist. <code>NULL</code> is supported for all datatypes, including
     *         lists and maps. <note><p>This operator tests for the nonexistence of
     *         an attribute, not its data type. If the data type of attribute
     *         "<code>a</code>" is null, and you evaluate it using <code>NULL</code>,
     *         the result is a Boolean <i>false</i>. This is because the attribute
     *         "<code>a</code>" exists; its data type is not relevant to the
     *         <code>NULL</code> comparison operator. </note> </li> <li>
     *         <p><code>CONTAINS</code> : Checks for a subsequence, or value in a
     *         set. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary (not a
     *         set type). If the target attribute of the comparison is of type
     *         String, then the operator checks for a substring match. If the target
     *         attribute of the comparison is of type Binary, then the operator looks
     *         for a subsequence of the target that matches the input. If the target
     *         attribute of the comparison is a set ("<code>SS</code>",
     *         "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates
     *         to true if it finds an exact match with any member of the set.
     *         <p>CONTAINS is supported for lists: When evaluating "<code>a CONTAINS
     *         b</code>", "<code>a</code>" can be a list; however, "<code>b</code>"
     *         cannot be a set, a map, or a list. </li> <li>
     *         <p><code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or
     *         absence of a value in a set. <p><i>AttributeValueList</i> can contain
     *         only one <i>AttributeValue</i> element of type String, Number, or
     *         Binary (not a set type). If the target attribute of the comparison is
     *         a String, then the operator checks for the absence of a substring
     *         match. If the target attribute of the comparison is Binary, then the
     *         operator checks for the absence of a subsequence of the target that
     *         matches the input. If the target attribute of the comparison is a set
     *         ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the
     *         operator evaluates to true if it <i>does not</i> find an exact match
     *         with any member of the set. <p>NOT_CONTAINS is supported for lists:
     *         When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>" can
     *         be a list; however, "<code>b</code>" cannot be a set, a map, or a
     *         list. </li> <li> <p><code>BEGINS_WITH</code> : Checks for a prefix.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a set
     *         type). The target attribute of the comparison must be of type String
     *         or Binary (not a Number or a set type). <p/> </li> <li>
     *         <p><code>IN</code> : Checks for matching elements within two sets.
     *         <p><i>AttributeValueList</i> can contain one or more
     *         <i>AttributeValue</i> elements of type String, Number, or Binary (not
     *         a set type). These attributes are compared against an existing set
     *         type attribute of an item. If any elements of the input set are
     *         present in the item attribute, the expression evaluates to true. </li>
     *         <li> <p><code>BETWEEN</code> : Greater than or equal to the first
     *         value, and less than or equal to the second value.
     *         <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *         elements of the same type, either String, Number, or Binary (not a set
     *         type). A target attribute matches if the target value is greater than,
     *         or equal to, the first element and less than, or equal to, the second
     *         element. If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not compare to
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     *         usage examples of <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     *         Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>. <p>For backward compatibility with previous DynamoDB
     *         releases, the following parameters can be used instead of
     *         <i>AttributeValueList</i> and <i>ComparisonOperator</i>: <ul> <li>
     *         <p><i>Value</i> - A value for DynamoDB to compare with an attribute.
     *         </li> <li> <p><i>Exists</i> - A Boolean value that causes DynamoDB to
     *         evaluate the value before attempting the conditional operation: <ul>
     *         <li> <p>If <i>Exists</i> is <code>true</code>, DynamoDB will check to
     *         see if that attribute value already exists in the table. If it is
     *         found, then the condition evaluates to true; otherwise the condition
     *         evaluate to false. </li> <li><p>If <i>Exists</i> is
     *         <code>false</code>, DynamoDB assumes that the attribute value does
     *         <i>not</i> exist in the table. If in fact the value does not exist,
     *         then the assumption is valid and the condition evaluates to true. If
     *         the value is found, despite the assumption that it does not exist, the
     *         condition evaluates to false.</li> </ul> </li> </ul> <p>The
     *         <i>Value</i> and <i>Exists</i> parameters are incompatible with
     *         <i>AttributeValueList</i> and <i>ComparisonOperator</i>. Note that if
     *         you use both sets of parameters at once, DynamoDB will return a
     *         <i>ValidationException</i> exception.
     */
    public void setExpected(java.util.Map<String,ExpectedAttributeValue> expected) {
        this.expected = expected;
    }
    
    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>ConditionExpression</i> instead. Note that if you use
     * <i>Expected</i> and <i> ConditionExpression </i> at the same time,
     * DynamoDB will return a <i>ValidationException</i> exception. <p>This
     * parameter does not support lists or maps. </important> <p>A map of
     * attribute/condition pairs. <i>Expected</i> provides a conditional
     * block for the <i>DeleteItem</i> operation. <p>Each element of
     * <i>Expected</i> consists of an attribute name, a comparison operator,
     * and one or more values. DynamoDB compares the attribute with the
     * value(s) you supplied, using the comparison operator. For each
     * <i>Expected</i> element, the result of the evaluation is either true
     * or false. <p>If you specify more than one element in the
     * <i>Expected</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together.
     * (You can use the <i>ConditionalOperator</i> parameter to OR the
     * conditions instead. If you do this, then at least one of the
     * conditions must evaluate to true, rather than all of them.) <p>If the
     * <i>Expected</i> map evaluates to true, then the conditional operation
     * succeeds; otherwise, it fails. <p><i>Expected</i> contains the
     * following: <ul> <li> <p><i>AttributeValueList</i> - One or more values
     * to evaluate against the supplied attribute. The number of values in
     * the list depends on the <i>ComparisonOperator</i> being used. <p>For
     * type Number, value comparisons are numeric. <p>String value
     * comparisons for greater than, equals, or less than are based on ASCII
     * character code values. For example, <code>a</code> is greater than
     * <code>A</code>, and <code>aa</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes in the <i>AttributeValueList</i>.
     * When performing the comparison, DynamoDB uses strongly consistent
     * reads. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <code>EQ</code> is supported for all datatypes, including
     * lists and maps. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, Binary, String
     * Set, Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <code>NE</code> is supported for all datatypes, including lists and
     * maps. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>LT</code> : Less than. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set type). If an item contains an <i>AttributeValue</i>
     * element of a different type than the one specified in the request, the
     * value does not match. For example, <code>{"S":"6"}</code> does not
     * equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     * compare to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>GE</code> : Greater than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>GT</code> : Greater than. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> element of type String, Number,
     * or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The attribute
     * exists. <code>NOT_NULL</code> is supported for all datatypes,
     * including lists and maps. <note><p>This operator tests for the
     * existence of an attribute, not its data type. If the data type of
     * attribute "<code>a</code>" is null, and you evaluate it using
     * <code>NOT_NULL</code>, the result is a Boolean <i>true</i>. This
     * result is because the attribute "<code>a</code>" exists; its data type
     * is not relevant to the <code>NOT_NULL</code> comparison operator.
     * </note> </li> <li> <p><code>NULL</code> : The attribute does not
     * exist. <code>NULL</code> is supported for all datatypes, including
     * lists and maps. <note><p>This operator tests for the nonexistence of
     * an attribute, not its data type. If the data type of attribute
     * "<code>a</code>" is null, and you evaluate it using <code>NULL</code>,
     * the result is a Boolean <i>false</i>. This is because the attribute
     * "<code>a</code>" exists; its data type is not relevant to the
     * <code>NULL</code> comparison operator. </note> </li> <li>
     * <p><code>CONTAINS</code> : Checks for a subsequence, or value in a
     * set. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If the target attribute of the comparison is of type
     * String, then the operator checks for a substring match. If the target
     * attribute of the comparison is of type Binary, then the operator looks
     * for a subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("<code>SS</code>",
     * "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates
     * to true if it finds an exact match with any member of the set.
     * <p>CONTAINS is supported for lists: When evaluating "<code>a CONTAINS
     * b</code>", "<code>a</code>" can be a list; however, "<code>b</code>"
     * cannot be a set, a map, or a list. </li> <li>
     * <p><code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or
     * absence of a value in a set. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> element of type String, Number, or
     * Binary (not a set type). If the target attribute of the comparison is
     * a String, then the operator checks for the absence of a substring
     * match. If the target attribute of the comparison is Binary, then the
     * operator checks for the absence of a subsequence of the target that
     * matches the input. If the target attribute of the comparison is a set
     * ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the
     * operator evaluates to true if it <i>does not</i> find an exact match
     * with any member of the set. <p>NOT_CONTAINS is supported for lists:
     * When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>" can
     * be a list; however, "<code>b</code>" cannot be a set, a map, or a
     * list. </li> <li> <p><code>BEGINS_WITH</code> : Checks for a prefix.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a set
     * type). The target attribute of the comparison must be of type String
     * or Binary (not a Number or a set type). <p/> </li> <li>
     * <p><code>IN</code> : Checks for matching elements within two sets.
     * <p><i>AttributeValueList</i> can contain one or more
     * <i>AttributeValue</i> elements of type String, Number, or Binary (not
     * a set type). These attributes are compared against an existing set
     * type attribute of an item. If any elements of the input set are
     * present in the item attribute, the expression evaluates to true. </li>
     * <li> <p><code>BETWEEN</code> : Greater than or equal to the first
     * value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a set
     * type). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     * usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>. <p>For backward compatibility with previous DynamoDB
     * releases, the following parameters can be used instead of
     * <i>AttributeValueList</i> and <i>ComparisonOperator</i>: <ul> <li>
     * <p><i>Value</i> - A value for DynamoDB to compare with an attribute.
     * </li> <li> <p><i>Exists</i> - A Boolean value that causes DynamoDB to
     * evaluate the value before attempting the conditional operation: <ul>
     * <li> <p>If <i>Exists</i> is <code>true</code>, DynamoDB will check to
     * see if that attribute value already exists in the table. If it is
     * found, then the condition evaluates to true; otherwise the condition
     * evaluate to false. </li> <li><p>If <i>Exists</i> is
     * <code>false</code>, DynamoDB assumes that the attribute value does
     * <i>not</i> exist in the table. If in fact the value does not exist,
     * then the assumption is valid and the condition evaluates to true. If
     * the value is found, despite the assumption that it does not exist, the
     * condition evaluates to false.</li> </ul> </li> </ul> <p>The
     * <i>Value</i> and <i>Exists</i> parameters are incompatible with
     * <i>AttributeValueList</i> and <i>ComparisonOperator</i>. Note that if
     * you use both sets of parameters at once, DynamoDB will return a
     * <i>ValidationException</i> exception.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expected <important> <p>There is a newer parameter available. Use
     *         <i>ConditionExpression</i> instead. Note that if you use
     *         <i>Expected</i> and <i> ConditionExpression </i> at the same time,
     *         DynamoDB will return a <i>ValidationException</i> exception. <p>This
     *         parameter does not support lists or maps. </important> <p>A map of
     *         attribute/condition pairs. <i>Expected</i> provides a conditional
     *         block for the <i>DeleteItem</i> operation. <p>Each element of
     *         <i>Expected</i> consists of an attribute name, a comparison operator,
     *         and one or more values. DynamoDB compares the attribute with the
     *         value(s) you supplied, using the comparison operator. For each
     *         <i>Expected</i> element, the result of the evaluation is either true
     *         or false. <p>If you specify more than one element in the
     *         <i>Expected</i> map, then by default all of the conditions must
     *         evaluate to true. In other words, the conditions are ANDed together.
     *         (You can use the <i>ConditionalOperator</i> parameter to OR the
     *         conditions instead. If you do this, then at least one of the
     *         conditions must evaluate to true, rather than all of them.) <p>If the
     *         <i>Expected</i> map evaluates to true, then the conditional operation
     *         succeeds; otherwise, it fails. <p><i>Expected</i> contains the
     *         following: <ul> <li> <p><i>AttributeValueList</i> - One or more values
     *         to evaluate against the supplied attribute. The number of values in
     *         the list depends on the <i>ComparisonOperator</i> being used. <p>For
     *         type Number, value comparisons are numeric. <p>String value
     *         comparisons for greater than, equals, or less than are based on ASCII
     *         character code values. For example, <code>a</code> is greater than
     *         <code>A</code>, and <code>aa</code> is greater than <code>B</code>.
     *         For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For type Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     *         comparator for evaluating attributes in the <i>AttributeValueList</i>.
     *         When performing the comparison, DynamoDB uses strongly consistent
     *         reads. <p>The following comparison operators are available:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     *         descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     *         : Equal. <code>EQ</code> is supported for all datatypes, including
     *         lists and maps. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, Binary, String
     *         Set, Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> element of a different type than the one
     *         specified in the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     *         <code>NE</code> is supported for all datatypes, including lists and
     *         maps. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary (not a
     *         set type). If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     *         <p><code>LT</code> : Less than. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> of type String, Number, or
     *         Binary (not a set type). If an item contains an <i>AttributeValue</i>
     *         element of a different type than the one specified in the request, the
     *         value does not match. For example, <code>{"S":"6"}</code> does not
     *         equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     *         compare to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     *         <p><code>GE</code> : Greater than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary (not a
     *         set type). If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     *         <p><code>GT</code> : Greater than. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> element of type String, Number,
     *         or Binary (not a set type). If an item contains an
     *         <i>AttributeValue</i> element of a different type than the one
     *         specified in the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The attribute
     *         exists. <code>NOT_NULL</code> is supported for all datatypes,
     *         including lists and maps. <note><p>This operator tests for the
     *         existence of an attribute, not its data type. If the data type of
     *         attribute "<code>a</code>" is null, and you evaluate it using
     *         <code>NOT_NULL</code>, the result is a Boolean <i>true</i>. This
     *         result is because the attribute "<code>a</code>" exists; its data type
     *         is not relevant to the <code>NOT_NULL</code> comparison operator.
     *         </note> </li> <li> <p><code>NULL</code> : The attribute does not
     *         exist. <code>NULL</code> is supported for all datatypes, including
     *         lists and maps. <note><p>This operator tests for the nonexistence of
     *         an attribute, not its data type. If the data type of attribute
     *         "<code>a</code>" is null, and you evaluate it using <code>NULL</code>,
     *         the result is a Boolean <i>false</i>. This is because the attribute
     *         "<code>a</code>" exists; its data type is not relevant to the
     *         <code>NULL</code> comparison operator. </note> </li> <li>
     *         <p><code>CONTAINS</code> : Checks for a subsequence, or value in a
     *         set. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary (not a
     *         set type). If the target attribute of the comparison is of type
     *         String, then the operator checks for a substring match. If the target
     *         attribute of the comparison is of type Binary, then the operator looks
     *         for a subsequence of the target that matches the input. If the target
     *         attribute of the comparison is a set ("<code>SS</code>",
     *         "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates
     *         to true if it finds an exact match with any member of the set.
     *         <p>CONTAINS is supported for lists: When evaluating "<code>a CONTAINS
     *         b</code>", "<code>a</code>" can be a list; however, "<code>b</code>"
     *         cannot be a set, a map, or a list. </li> <li>
     *         <p><code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or
     *         absence of a value in a set. <p><i>AttributeValueList</i> can contain
     *         only one <i>AttributeValue</i> element of type String, Number, or
     *         Binary (not a set type). If the target attribute of the comparison is
     *         a String, then the operator checks for the absence of a substring
     *         match. If the target attribute of the comparison is Binary, then the
     *         operator checks for the absence of a subsequence of the target that
     *         matches the input. If the target attribute of the comparison is a set
     *         ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the
     *         operator evaluates to true if it <i>does not</i> find an exact match
     *         with any member of the set. <p>NOT_CONTAINS is supported for lists:
     *         When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>" can
     *         be a list; however, "<code>b</code>" cannot be a set, a map, or a
     *         list. </li> <li> <p><code>BEGINS_WITH</code> : Checks for a prefix.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a set
     *         type). The target attribute of the comparison must be of type String
     *         or Binary (not a Number or a set type). <p/> </li> <li>
     *         <p><code>IN</code> : Checks for matching elements within two sets.
     *         <p><i>AttributeValueList</i> can contain one or more
     *         <i>AttributeValue</i> elements of type String, Number, or Binary (not
     *         a set type). These attributes are compared against an existing set
     *         type attribute of an item. If any elements of the input set are
     *         present in the item attribute, the expression evaluates to true. </li>
     *         <li> <p><code>BETWEEN</code> : Greater than or equal to the first
     *         value, and less than or equal to the second value.
     *         <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *         elements of the same type, either String, Number, or Binary (not a set
     *         type). A target attribute matches if the target value is greater than,
     *         or equal to, the first element and less than, or equal to, the second
     *         element. If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not compare to
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     *         usage examples of <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     *         Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>. <p>For backward compatibility with previous DynamoDB
     *         releases, the following parameters can be used instead of
     *         <i>AttributeValueList</i> and <i>ComparisonOperator</i>: <ul> <li>
     *         <p><i>Value</i> - A value for DynamoDB to compare with an attribute.
     *         </li> <li> <p><i>Exists</i> - A Boolean value that causes DynamoDB to
     *         evaluate the value before attempting the conditional operation: <ul>
     *         <li> <p>If <i>Exists</i> is <code>true</code>, DynamoDB will check to
     *         see if that attribute value already exists in the table. If it is
     *         found, then the condition evaluates to true; otherwise the condition
     *         evaluate to false. </li> <li><p>If <i>Exists</i> is
     *         <code>false</code>, DynamoDB assumes that the attribute value does
     *         <i>not</i> exist in the table. If in fact the value does not exist,
     *         then the assumption is valid and the condition evaluates to true. If
     *         the value is found, despite the assumption that it does not exist, the
     *         condition evaluates to false.</li> </ul> </li> </ul> <p>The
     *         <i>Value</i> and <i>Exists</i> parameters are incompatible with
     *         <i>AttributeValueList</i> and <i>ComparisonOperator</i>. Note that if
     *         you use both sets of parameters at once, DynamoDB will return a
     *         <i>ValidationException</i> exception.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteItemRequest withExpected(java.util.Map<String,ExpectedAttributeValue> expected) {
        setExpected(expected);
        return this;
    }

    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>ConditionExpression</i> instead. Note that if you use
     * <i>Expected</i> and <i> ConditionExpression </i> at the same time,
     * DynamoDB will return a <i>ValidationException</i> exception. <p>This
     * parameter does not support lists or maps. </important> <p>A map of
     * attribute/condition pairs. <i>Expected</i> provides a conditional
     * block for the <i>DeleteItem</i> operation. <p>Each element of
     * <i>Expected</i> consists of an attribute name, a comparison operator,
     * and one or more values. DynamoDB compares the attribute with the
     * value(s) you supplied, using the comparison operator. For each
     * <i>Expected</i> element, the result of the evaluation is either true
     * or false. <p>If you specify more than one element in the
     * <i>Expected</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together.
     * (You can use the <i>ConditionalOperator</i> parameter to OR the
     * conditions instead. If you do this, then at least one of the
     * conditions must evaluate to true, rather than all of them.) <p>If the
     * <i>Expected</i> map evaluates to true, then the conditional operation
     * succeeds; otherwise, it fails. <p><i>Expected</i> contains the
     * following: <ul> <li> <p><i>AttributeValueList</i> - One or more values
     * to evaluate against the supplied attribute. The number of values in
     * the list depends on the <i>ComparisonOperator</i> being used. <p>For
     * type Number, value comparisons are numeric. <p>String value
     * comparisons for greater than, equals, or less than are based on ASCII
     * character code values. For example, <code>a</code> is greater than
     * <code>A</code>, and <code>aa</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes in the <i>AttributeValueList</i>.
     * When performing the comparison, DynamoDB uses strongly consistent
     * reads. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <code>EQ</code> is supported for all datatypes, including
     * lists and maps. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, Binary, String
     * Set, Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <code>NE</code> is supported for all datatypes, including lists and
     * maps. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>LT</code> : Less than. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set type). If an item contains an <i>AttributeValue</i>
     * element of a different type than the one specified in the request, the
     * value does not match. For example, <code>{"S":"6"}</code> does not
     * equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     * compare to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>GE</code> : Greater than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>GT</code> : Greater than. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> element of type String, Number,
     * or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The attribute
     * exists. <code>NOT_NULL</code> is supported for all datatypes,
     * including lists and maps. <note><p>This operator tests for the
     * existence of an attribute, not its data type. If the data type of
     * attribute "<code>a</code>" is null, and you evaluate it using
     * <code>NOT_NULL</code>, the result is a Boolean <i>true</i>. This
     * result is because the attribute "<code>a</code>" exists; its data type
     * is not relevant to the <code>NOT_NULL</code> comparison operator.
     * </note> </li> <li> <p><code>NULL</code> : The attribute does not
     * exist. <code>NULL</code> is supported for all datatypes, including
     * lists and maps. <note><p>This operator tests for the nonexistence of
     * an attribute, not its data type. If the data type of attribute
     * "<code>a</code>" is null, and you evaluate it using <code>NULL</code>,
     * the result is a Boolean <i>false</i>. This is because the attribute
     * "<code>a</code>" exists; its data type is not relevant to the
     * <code>NULL</code> comparison operator. </note> </li> <li>
     * <p><code>CONTAINS</code> : Checks for a subsequence, or value in a
     * set. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> element of type String, Number, or Binary (not a
     * set type). If the target attribute of the comparison is of type
     * String, then the operator checks for a substring match. If the target
     * attribute of the comparison is of type Binary, then the operator looks
     * for a subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("<code>SS</code>",
     * "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates
     * to true if it finds an exact match with any member of the set.
     * <p>CONTAINS is supported for lists: When evaluating "<code>a CONTAINS
     * b</code>", "<code>a</code>" can be a list; however, "<code>b</code>"
     * cannot be a set, a map, or a list. </li> <li>
     * <p><code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or
     * absence of a value in a set. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> element of type String, Number, or
     * Binary (not a set type). If the target attribute of the comparison is
     * a String, then the operator checks for the absence of a substring
     * match. If the target attribute of the comparison is Binary, then the
     * operator checks for the absence of a subsequence of the target that
     * matches the input. If the target attribute of the comparison is a set
     * ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the
     * operator evaluates to true if it <i>does not</i> find an exact match
     * with any member of the set. <p>NOT_CONTAINS is supported for lists:
     * When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>" can
     * be a list; however, "<code>b</code>" cannot be a set, a map, or a
     * list. </li> <li> <p><code>BEGINS_WITH</code> : Checks for a prefix.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a set
     * type). The target attribute of the comparison must be of type String
     * or Binary (not a Number or a set type). <p/> </li> <li>
     * <p><code>IN</code> : Checks for matching elements within two sets.
     * <p><i>AttributeValueList</i> can contain one or more
     * <i>AttributeValue</i> elements of type String, Number, or Binary (not
     * a set type). These attributes are compared against an existing set
     * type attribute of an item. If any elements of the input set are
     * present in the item attribute, the expression evaluates to true. </li>
     * <li> <p><code>BETWEEN</code> : Greater than or equal to the first
     * value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a set
     * type). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     * usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>. <p>For backward compatibility with previous DynamoDB
     * releases, the following parameters can be used instead of
     * <i>AttributeValueList</i> and <i>ComparisonOperator</i>: <ul> <li>
     * <p><i>Value</i> - A value for DynamoDB to compare with an attribute.
     * </li> <li> <p><i>Exists</i> - A Boolean value that causes DynamoDB to
     * evaluate the value before attempting the conditional operation: <ul>
     * <li> <p>If <i>Exists</i> is <code>true</code>, DynamoDB will check to
     * see if that attribute value already exists in the table. If it is
     * found, then the condition evaluates to true; otherwise the condition
     * evaluate to false. </li> <li><p>If <i>Exists</i> is
     * <code>false</code>, DynamoDB assumes that the attribute value does
     * <i>not</i> exist in the table. If in fact the value does not exist,
     * then the assumption is valid and the condition evaluates to true. If
     * the value is found, despite the assumption that it does not exist, the
     * condition evaluates to false.</li> </ul> </li> </ul> <p>The
     * <i>Value</i> and <i>Exists</i> parameters are incompatible with
     * <i>AttributeValueList</i> and <i>ComparisonOperator</i>. Note that if
     * you use both sets of parameters at once, DynamoDB will return a
     * <i>ValidationException</i> exception.
     * <p>
     * The method adds a new key-value pair into Expected parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Expected.
     * @param value The corresponding value of the entry to be added into Expected.
     */
    public DeleteItemRequest addExpectedEntry(String key, ExpectedAttributeValue value) {
        if (null == this.expected) {
            this.expected = new java.util.HashMap<String,ExpectedAttributeValue>();
        }
        if (this.expected.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.expected.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Expected.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public DeleteItemRequest clearExpectedEntries() {
        this.expected = null;
        return this;
    }
    
    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>ConditionExpression</i> instead. Note that if you use
     * <i>ConditionalOperator</i> and <i> ConditionExpression </i> at the
     * same time, DynamoDB will return a <i>ValidationException</i>
     * exception. <p>This parameter does not support lists or maps.
     * </important> <p>A logical operator to apply to the conditions in the
     * <i>Expected</i> map: <ul> <li><p><code>AND</code> - If all of the
     * conditions evaluate to true, then the entire map evaluates to
     * true.</li> <li><p><code>OR</code> - If at least one of the conditions
     * evaluate to true, then the entire map evaluates to true.</li> </ul>
     * <p>If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     * the default. <p>The operation will succeed only if the entire map
     * evaluates to true.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @return <important> <p>There is a newer parameter available. Use
     *         <i>ConditionExpression</i> instead. Note that if you use
     *         <i>ConditionalOperator</i> and <i> ConditionExpression </i> at the
     *         same time, DynamoDB will return a <i>ValidationException</i>
     *         exception. <p>This parameter does not support lists or maps.
     *         </important> <p>A logical operator to apply to the conditions in the
     *         <i>Expected</i> map: <ul> <li><p><code>AND</code> - If all of the
     *         conditions evaluate to true, then the entire map evaluates to
     *         true.</li> <li><p><code>OR</code> - If at least one of the conditions
     *         evaluate to true, then the entire map evaluates to true.</li> </ul>
     *         <p>If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     *         the default. <p>The operation will succeed only if the entire map
     *         evaluates to true.
     *
     * @see ConditionalOperator
     */
    public String getConditionalOperator() {
        return conditionalOperator;
    }
    
    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>ConditionExpression</i> instead. Note that if you use
     * <i>ConditionalOperator</i> and <i> ConditionExpression </i> at the
     * same time, DynamoDB will return a <i>ValidationException</i>
     * exception. <p>This parameter does not support lists or maps.
     * </important> <p>A logical operator to apply to the conditions in the
     * <i>Expected</i> map: <ul> <li><p><code>AND</code> - If all of the
     * conditions evaluate to true, then the entire map evaluates to
     * true.</li> <li><p><code>OR</code> - If at least one of the conditions
     * evaluate to true, then the entire map evaluates to true.</li> </ul>
     * <p>If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     * the default. <p>The operation will succeed only if the entire map
     * evaluates to true.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator <important> <p>There is a newer parameter available. Use
     *         <i>ConditionExpression</i> instead. Note that if you use
     *         <i>ConditionalOperator</i> and <i> ConditionExpression </i> at the
     *         same time, DynamoDB will return a <i>ValidationException</i>
     *         exception. <p>This parameter does not support lists or maps.
     *         </important> <p>A logical operator to apply to the conditions in the
     *         <i>Expected</i> map: <ul> <li><p><code>AND</code> - If all of the
     *         conditions evaluate to true, then the entire map evaluates to
     *         true.</li> <li><p><code>OR</code> - If at least one of the conditions
     *         evaluate to true, then the entire map evaluates to true.</li> </ul>
     *         <p>If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     *         the default. <p>The operation will succeed only if the entire map
     *         evaluates to true.
     *
     * @see ConditionalOperator
     */
    public void setConditionalOperator(String conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
    }
    
    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>ConditionExpression</i> instead. Note that if you use
     * <i>ConditionalOperator</i> and <i> ConditionExpression </i> at the
     * same time, DynamoDB will return a <i>ValidationException</i>
     * exception. <p>This parameter does not support lists or maps.
     * </important> <p>A logical operator to apply to the conditions in the
     * <i>Expected</i> map: <ul> <li><p><code>AND</code> - If all of the
     * conditions evaluate to true, then the entire map evaluates to
     * true.</li> <li><p><code>OR</code> - If at least one of the conditions
     * evaluate to true, then the entire map evaluates to true.</li> </ul>
     * <p>If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     * the default. <p>The operation will succeed only if the entire map
     * evaluates to true.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator <important> <p>There is a newer parameter available. Use
     *         <i>ConditionExpression</i> instead. Note that if you use
     *         <i>ConditionalOperator</i> and <i> ConditionExpression </i> at the
     *         same time, DynamoDB will return a <i>ValidationException</i>
     *         exception. <p>This parameter does not support lists or maps.
     *         </important> <p>A logical operator to apply to the conditions in the
     *         <i>Expected</i> map: <ul> <li><p><code>AND</code> - If all of the
     *         conditions evaluate to true, then the entire map evaluates to
     *         true.</li> <li><p><code>OR</code> - If at least one of the conditions
     *         evaluate to true, then the entire map evaluates to true.</li> </ul>
     *         <p>If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     *         the default. <p>The operation will succeed only if the entire map
     *         evaluates to true.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ConditionalOperator
     */
    public DeleteItemRequest withConditionalOperator(String conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
        return this;
    }

    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>ConditionExpression</i> instead. Note that if you use
     * <i>ConditionalOperator</i> and <i> ConditionExpression </i> at the
     * same time, DynamoDB will return a <i>ValidationException</i>
     * exception. <p>This parameter does not support lists or maps.
     * </important> <p>A logical operator to apply to the conditions in the
     * <i>Expected</i> map: <ul> <li><p><code>AND</code> - If all of the
     * conditions evaluate to true, then the entire map evaluates to
     * true.</li> <li><p><code>OR</code> - If at least one of the conditions
     * evaluate to true, then the entire map evaluates to true.</li> </ul>
     * <p>If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     * the default. <p>The operation will succeed only if the entire map
     * evaluates to true.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator <important> <p>There is a newer parameter available. Use
     *         <i>ConditionExpression</i> instead. Note that if you use
     *         <i>ConditionalOperator</i> and <i> ConditionExpression </i> at the
     *         same time, DynamoDB will return a <i>ValidationException</i>
     *         exception. <p>This parameter does not support lists or maps.
     *         </important> <p>A logical operator to apply to the conditions in the
     *         <i>Expected</i> map: <ul> <li><p><code>AND</code> - If all of the
     *         conditions evaluate to true, then the entire map evaluates to
     *         true.</li> <li><p><code>OR</code> - If at least one of the conditions
     *         evaluate to true, then the entire map evaluates to true.</li> </ul>
     *         <p>If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     *         the default. <p>The operation will succeed only if the entire map
     *         evaluates to true.
     *
     * @see ConditionalOperator
     */
    public void setConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
    }
    
    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>ConditionExpression</i> instead. Note that if you use
     * <i>ConditionalOperator</i> and <i> ConditionExpression </i> at the
     * same time, DynamoDB will return a <i>ValidationException</i>
     * exception. <p>This parameter does not support lists or maps.
     * </important> <p>A logical operator to apply to the conditions in the
     * <i>Expected</i> map: <ul> <li><p><code>AND</code> - If all of the
     * conditions evaluate to true, then the entire map evaluates to
     * true.</li> <li><p><code>OR</code> - If at least one of the conditions
     * evaluate to true, then the entire map evaluates to true.</li> </ul>
     * <p>If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     * the default. <p>The operation will succeed only if the entire map
     * evaluates to true.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator <important> <p>There is a newer parameter available. Use
     *         <i>ConditionExpression</i> instead. Note that if you use
     *         <i>ConditionalOperator</i> and <i> ConditionExpression </i> at the
     *         same time, DynamoDB will return a <i>ValidationException</i>
     *         exception. <p>This parameter does not support lists or maps.
     *         </important> <p>A logical operator to apply to the conditions in the
     *         <i>Expected</i> map: <ul> <li><p><code>AND</code> - If all of the
     *         conditions evaluate to true, then the entire map evaluates to
     *         true.</li> <li><p><code>OR</code> - If at least one of the conditions
     *         evaluate to true, then the entire map evaluates to true.</li> </ul>
     *         <p>If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     *         the default. <p>The operation will succeed only if the entire map
     *         evaluates to true.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ConditionalOperator
     */
    public DeleteItemRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
        return this;
    }

    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were deleted. For <i>DeleteItem</i>, the valid
     * values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     * not specified, or if its value is <code>NONE</code>, then nothing is
     * returned. (This setting is the default for <i>ReturnValues</i>.) </li>
     * <li> <p><code>ALL_OLD</code> - The content of the old item is
     * returned. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @return Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were deleted. For <i>DeleteItem</i>, the valid
     *         values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     *         not specified, or if its value is <code>NONE</code>, then nothing is
     *         returned. (This setting is the default for <i>ReturnValues</i>.) </li>
     *         <li> <p><code>ALL_OLD</code> - The content of the old item is
     *         returned. </li> </ul>
     *
     * @see ReturnValue
     */
    public String getReturnValues() {
        return returnValues;
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were deleted. For <i>DeleteItem</i>, the valid
     * values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     * not specified, or if its value is <code>NONE</code>, then nothing is
     * returned. (This setting is the default for <i>ReturnValues</i>.) </li>
     * <li> <p><code>ALL_OLD</code> - The content of the old item is
     * returned. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were deleted. For <i>DeleteItem</i>, the valid
     *         values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     *         not specified, or if its value is <code>NONE</code>, then nothing is
     *         returned. (This setting is the default for <i>ReturnValues</i>.) </li>
     *         <li> <p><code>ALL_OLD</code> - The content of the old item is
     *         returned. </li> </ul>
     *
     * @see ReturnValue
     */
    public void setReturnValues(String returnValues) {
        this.returnValues = returnValues;
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were deleted. For <i>DeleteItem</i>, the valid
     * values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     * not specified, or if its value is <code>NONE</code>, then nothing is
     * returned. (This setting is the default for <i>ReturnValues</i>.) </li>
     * <li> <p><code>ALL_OLD</code> - The content of the old item is
     * returned. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were deleted. For <i>DeleteItem</i>, the valid
     *         values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     *         not specified, or if its value is <code>NONE</code>, then nothing is
     *         returned. (This setting is the default for <i>ReturnValues</i>.) </li>
     *         <li> <p><code>ALL_OLD</code> - The content of the old item is
     *         returned. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ReturnValue
     */
    public DeleteItemRequest withReturnValues(String returnValues) {
        this.returnValues = returnValues;
        return this;
    }

    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were deleted. For <i>DeleteItem</i>, the valid
     * values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     * not specified, or if its value is <code>NONE</code>, then nothing is
     * returned. (This setting is the default for <i>ReturnValues</i>.) </li>
     * <li> <p><code>ALL_OLD</code> - The content of the old item is
     * returned. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were deleted. For <i>DeleteItem</i>, the valid
     *         values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     *         not specified, or if its value is <code>NONE</code>, then nothing is
     *         returned. (This setting is the default for <i>ReturnValues</i>.) </li>
     *         <li> <p><code>ALL_OLD</code> - The content of the old item is
     *         returned. </li> </ul>
     *
     * @see ReturnValue
     */
    public void setReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were deleted. For <i>DeleteItem</i>, the valid
     * values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     * not specified, or if its value is <code>NONE</code>, then nothing is
     * returned. (This setting is the default for <i>ReturnValues</i>.) </li>
     * <li> <p><code>ALL_OLD</code> - The content of the old item is
     * returned. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were deleted. For <i>DeleteItem</i>, the valid
     *         values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     *         not specified, or if its value is <code>NONE</code>, then nothing is
     *         returned. (This setting is the default for <i>ReturnValues</i>.) </li>
     *         <li> <p><code>ALL_OLD</code> - The content of the old item is
     *         returned. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ReturnValue
     */
    public DeleteItemRequest withReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
        return this;
    }

    /**
     * A value that if set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @return A value that if set to <code>TOTAL</code>, the response includes
     *         <i>ConsumedCapacity</i> data for tables and indexes. If set to
     *         <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     *         for indexes. If set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included in the response.
     *
     * @see ReturnConsumedCapacity
     */
    public String getReturnConsumedCapacity() {
        return returnConsumedCapacity;
    }
    
    /**
     * A value that if set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity A value that if set to <code>TOTAL</code>, the response includes
     *         <i>ConsumedCapacity</i> data for tables and indexes. If set to
     *         <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     *         for indexes. If set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included in the response.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }
    
    /**
     * A value that if set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity A value that if set to <code>TOTAL</code>, the response includes
     *         <i>ConsumedCapacity</i> data for tables and indexes. If set to
     *         <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     *         for indexes. If set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included in the response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ReturnConsumedCapacity
     */
    public DeleteItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
        return this;
    }

    /**
     * A value that if set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity A value that if set to <code>TOTAL</code>, the response includes
     *         <i>ConsumedCapacity</i> data for tables and indexes. If set to
     *         <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     *         for indexes. If set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included in the response.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }
    
    /**
     * A value that if set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity A value that if set to <code>TOTAL</code>, the response includes
     *         <i>ConsumedCapacity</i> data for tables and indexes. If set to
     *         <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     *         for indexes. If set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included in the response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ReturnConsumedCapacity
     */
    public DeleteItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    /**
     * A value that if set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during
     * the operation are returned in the response. If set to
     * <code>NONE</code> (the default), no statistics are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @return A value that if set to <code>SIZE</code>, the response includes
     *         statistics about item collections, if any, that were modified during
     *         the operation are returned in the response. If set to
     *         <code>NONE</code> (the default), no statistics are returned.
     *
     * @see ReturnItemCollectionMetrics
     */
    public String getReturnItemCollectionMetrics() {
        return returnItemCollectionMetrics;
    }
    
    /**
     * A value that if set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during
     * the operation are returned in the response. If set to
     * <code>NONE</code> (the default), no statistics are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics A value that if set to <code>SIZE</code>, the response includes
     *         statistics about item collections, if any, that were modified during
     *         the operation are returned in the response. If set to
     *         <code>NONE</code> (the default), no statistics are returned.
     *
     * @see ReturnItemCollectionMetrics
     */
    public void setReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
    }
    
    /**
     * A value that if set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during
     * the operation are returned in the response. If set to
     * <code>NONE</code> (the default), no statistics are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics A value that if set to <code>SIZE</code>, the response includes
     *         statistics about item collections, if any, that were modified during
     *         the operation are returned in the response. If set to
     *         <code>NONE</code> (the default), no statistics are returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ReturnItemCollectionMetrics
     */
    public DeleteItemRequest withReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
        return this;
    }

    /**
     * A value that if set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during
     * the operation are returned in the response. If set to
     * <code>NONE</code> (the default), no statistics are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics A value that if set to <code>SIZE</code>, the response includes
     *         statistics about item collections, if any, that were modified during
     *         the operation are returned in the response. If set to
     *         <code>NONE</code> (the default), no statistics are returned.
     *
     * @see ReturnItemCollectionMetrics
     */
    public void setReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
    }
    
    /**
     * A value that if set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during
     * the operation are returned in the response. If set to
     * <code>NONE</code> (the default), no statistics are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics A value that if set to <code>SIZE</code>, the response includes
     *         statistics about item collections, if any, that were modified during
     *         the operation are returned in the response. If set to
     *         <code>NONE</code> (the default), no statistics are returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ReturnItemCollectionMetrics
     */
    public DeleteItemRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
        return this;
    }

    /**
     * A condition that must be satisfied in order for a conditional
     * <i>DeleteItem</i> to succeed. <p>An expression can contain any of the
     * following: <ul> <li> <p>Boolean functions: <code>ATTRIBUTE_EXIST |
     * CONTAINS | BEGINS_WITH</code> </li> <li> <p>Comparison operators:
     * <code> = | <> | < | > | <= | >= | BETWEEN | IN</code> </li> <li>
     * <p>Logical operators: <code>NOT | AND | OR</code> </li> </ul>
     *
     * @return A condition that must be satisfied in order for a conditional
     *         <i>DeleteItem</i> to succeed. <p>An expression can contain any of the
     *         following: <ul> <li> <p>Boolean functions: <code>ATTRIBUTE_EXIST |
     *         CONTAINS | BEGINS_WITH</code> </li> <li> <p>Comparison operators:
     *         <code> = | <> | < | > | <= | >= | BETWEEN | IN</code> </li> <li>
     *         <p>Logical operators: <code>NOT | AND | OR</code> </li> </ul>
     */
    public String getConditionExpression() {
        return conditionExpression;
    }
    
    /**
     * A condition that must be satisfied in order for a conditional
     * <i>DeleteItem</i> to succeed. <p>An expression can contain any of the
     * following: <ul> <li> <p>Boolean functions: <code>ATTRIBUTE_EXIST |
     * CONTAINS | BEGINS_WITH</code> </li> <li> <p>Comparison operators:
     * <code> = | <> | < | > | <= | >= | BETWEEN | IN</code> </li> <li>
     * <p>Logical operators: <code>NOT | AND | OR</code> </li> </ul>
     *
     * @param conditionExpression A condition that must be satisfied in order for a conditional
     *         <i>DeleteItem</i> to succeed. <p>An expression can contain any of the
     *         following: <ul> <li> <p>Boolean functions: <code>ATTRIBUTE_EXIST |
     *         CONTAINS | BEGINS_WITH</code> </li> <li> <p>Comparison operators:
     *         <code> = | <> | < | > | <= | >= | BETWEEN | IN</code> </li> <li>
     *         <p>Logical operators: <code>NOT | AND | OR</code> </li> </ul>
     */
    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }
    
    /**
     * A condition that must be satisfied in order for a conditional
     * <i>DeleteItem</i> to succeed. <p>An expression can contain any of the
     * following: <ul> <li> <p>Boolean functions: <code>ATTRIBUTE_EXIST |
     * CONTAINS | BEGINS_WITH</code> </li> <li> <p>Comparison operators:
     * <code> = | <> | < | > | <= | >= | BETWEEN | IN</code> </li> <li>
     * <p>Logical operators: <code>NOT | AND | OR</code> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param conditionExpression A condition that must be satisfied in order for a conditional
     *         <i>DeleteItem</i> to succeed. <p>An expression can contain any of the
     *         following: <ul> <li> <p>Boolean functions: <code>ATTRIBUTE_EXIST |
     *         CONTAINS | BEGINS_WITH</code> </li> <li> <p>Comparison operators:
     *         <code> = | <> | < | > | <= | >= | BETWEEN | IN</code> </li> <li>
     *         <p>Logical operators: <code>NOT | AND | OR</code> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteItemRequest withConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    /**
     * One or more substitution tokens for simplifying complex expressions.
     * The following are some use cases for an
     * <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     * attribute name that is very long or unwieldy in an expression. </li>
     * <li> <p>To create a placeholder for repeating occurrences of an
     * attribute name in an expression. </li> <li> <p>To prevent special
     * characters in an attribute name from being misinterpreted in an
     * expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     * to dereference an attribute name. For example, consider the following
     * expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     * order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     * that you specified the following for <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     * <p>The expression can now be simplified as follows:
     * <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     *
     * @return One or more substitution tokens for simplifying complex expressions.
     *         The following are some use cases for an
     *         <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     *         attribute name that is very long or unwieldy in an expression. </li>
     *         <li> <p>To create a placeholder for repeating occurrences of an
     *         attribute name in an expression. </li> <li> <p>To prevent special
     *         characters in an attribute name from being misinterpreted in an
     *         expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     *         to dereference an attribute name. For example, consider the following
     *         expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     *         order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     *         that you specified the following for <i>ExpressionAttributeNames</i>:
     *         <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     *         <p>The expression can now be simplified as follows:
     *         <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     */
    public java.util.Map<String,String> getExpressionAttributeNames() {
        
        return expressionAttributeNames;
    }
    
    /**
     * One or more substitution tokens for simplifying complex expressions.
     * The following are some use cases for an
     * <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     * attribute name that is very long or unwieldy in an expression. </li>
     * <li> <p>To create a placeholder for repeating occurrences of an
     * attribute name in an expression. </li> <li> <p>To prevent special
     * characters in an attribute name from being misinterpreted in an
     * expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     * to dereference an attribute name. For example, consider the following
     * expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     * order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     * that you specified the following for <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     * <p>The expression can now be simplified as follows:
     * <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     *
     * @param expressionAttributeNames One or more substitution tokens for simplifying complex expressions.
     *         The following are some use cases for an
     *         <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     *         attribute name that is very long or unwieldy in an expression. </li>
     *         <li> <p>To create a placeholder for repeating occurrences of an
     *         attribute name in an expression. </li> <li> <p>To prevent special
     *         characters in an attribute name from being misinterpreted in an
     *         expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     *         to dereference an attribute name. For example, consider the following
     *         expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     *         order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     *         that you specified the following for <i>ExpressionAttributeNames</i>:
     *         <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     *         <p>The expression can now be simplified as follows:
     *         <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     */
    public void setExpressionAttributeNames(java.util.Map<String,String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
    }
    
    /**
     * One or more substitution tokens for simplifying complex expressions.
     * The following are some use cases for an
     * <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     * attribute name that is very long or unwieldy in an expression. </li>
     * <li> <p>To create a placeholder for repeating occurrences of an
     * attribute name in an expression. </li> <li> <p>To prevent special
     * characters in an attribute name from being misinterpreted in an
     * expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     * to dereference an attribute name. For example, consider the following
     * expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     * order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     * that you specified the following for <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     * <p>The expression can now be simplified as follows:
     * <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expressionAttributeNames One or more substitution tokens for simplifying complex expressions.
     *         The following are some use cases for an
     *         <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     *         attribute name that is very long or unwieldy in an expression. </li>
     *         <li> <p>To create a placeholder for repeating occurrences of an
     *         attribute name in an expression. </li> <li> <p>To prevent special
     *         characters in an attribute name from being misinterpreted in an
     *         expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     *         to dereference an attribute name. For example, consider the following
     *         expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     *         order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     *         that you specified the following for <i>ExpressionAttributeNames</i>:
     *         <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     *         <p>The expression can now be simplified as follows:
     *         <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteItemRequest withExpressionAttributeNames(java.util.Map<String,String> expressionAttributeNames) {
        setExpressionAttributeNames(expressionAttributeNames);
        return this;
    }

    /**
     * One or more substitution tokens for simplifying complex expressions.
     * The following are some use cases for an
     * <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     * attribute name that is very long or unwieldy in an expression. </li>
     * <li> <p>To create a placeholder for repeating occurrences of an
     * attribute name in an expression. </li> <li> <p>To prevent special
     * characters in an attribute name from being misinterpreted in an
     * expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     * to dereference an attribute name. For example, consider the following
     * expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     * order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     * that you specified the following for <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     * <p>The expression can now be simplified as follows:
     * <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     * <p>
     * The method adds a new key-value pair into ExpressionAttributeNames
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into ExpressionAttributeNames.
     * @param value The corresponding value of the entry to be added into ExpressionAttributeNames.
     */
    public DeleteItemRequest addExpressionAttributeNamesEntry(String key, String value) {
        if (null == this.expressionAttributeNames) {
            this.expressionAttributeNames = new java.util.HashMap<String,String>();
        }
        if (this.expressionAttributeNames.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.expressionAttributeNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeNames.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public DeleteItemRequest clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
        return this;
    }
    
    /**
     * One or more values that can be substituted in an expression. <p>Use
     * the <b>:</b> character in an expression to dereference an attribute
     * value. For example, consider the following expression:
     * <ul><li><p><code>ProductStatus IN
     * ("Available","Backordered","Discontinued")</code></li></ul> <p>Now
     * suppose that you specified the following for
     * <i>ExpressionAttributeValues</i>: <ul><li><p><code>{
     * "a":{"S":"Available"}, "b":{"S":"Backordered"},
     * "d":{"S":"Discontinued"} }</code></li></ul> <p>The expression can now
     * be simplified as follows: <ul><li> <p><code>ProductStatus IN
     * (:a,:b,:c)</code></li></ul>
     *
     * @return One or more values that can be substituted in an expression. <p>Use
     *         the <b>:</b> character in an expression to dereference an attribute
     *         value. For example, consider the following expression:
     *         <ul><li><p><code>ProductStatus IN
     *         ("Available","Backordered","Discontinued")</code></li></ul> <p>Now
     *         suppose that you specified the following for
     *         <i>ExpressionAttributeValues</i>: <ul><li><p><code>{
     *         "a":{"S":"Available"}, "b":{"S":"Backordered"},
     *         "d":{"S":"Discontinued"} }</code></li></ul> <p>The expression can now
     *         be simplified as follows: <ul><li> <p><code>ProductStatus IN
     *         (:a,:b,:c)</code></li></ul>
     */
    public java.util.Map<String,AttributeValue> getExpressionAttributeValues() {
        
        return expressionAttributeValues;
    }
    
    /**
     * One or more values that can be substituted in an expression. <p>Use
     * the <b>:</b> character in an expression to dereference an attribute
     * value. For example, consider the following expression:
     * <ul><li><p><code>ProductStatus IN
     * ("Available","Backordered","Discontinued")</code></li></ul> <p>Now
     * suppose that you specified the following for
     * <i>ExpressionAttributeValues</i>: <ul><li><p><code>{
     * "a":{"S":"Available"}, "b":{"S":"Backordered"},
     * "d":{"S":"Discontinued"} }</code></li></ul> <p>The expression can now
     * be simplified as follows: <ul><li> <p><code>ProductStatus IN
     * (:a,:b,:c)</code></li></ul>
     *
     * @param expressionAttributeValues One or more values that can be substituted in an expression. <p>Use
     *         the <b>:</b> character in an expression to dereference an attribute
     *         value. For example, consider the following expression:
     *         <ul><li><p><code>ProductStatus IN
     *         ("Available","Backordered","Discontinued")</code></li></ul> <p>Now
     *         suppose that you specified the following for
     *         <i>ExpressionAttributeValues</i>: <ul><li><p><code>{
     *         "a":{"S":"Available"}, "b":{"S":"Backordered"},
     *         "d":{"S":"Discontinued"} }</code></li></ul> <p>The expression can now
     *         be simplified as follows: <ul><li> <p><code>ProductStatus IN
     *         (:a,:b,:c)</code></li></ul>
     */
    public void setExpressionAttributeValues(java.util.Map<String,AttributeValue> expressionAttributeValues) {
        this.expressionAttributeValues = expressionAttributeValues;
    }
    
    /**
     * One or more values that can be substituted in an expression. <p>Use
     * the <b>:</b> character in an expression to dereference an attribute
     * value. For example, consider the following expression:
     * <ul><li><p><code>ProductStatus IN
     * ("Available","Backordered","Discontinued")</code></li></ul> <p>Now
     * suppose that you specified the following for
     * <i>ExpressionAttributeValues</i>: <ul><li><p><code>{
     * "a":{"S":"Available"}, "b":{"S":"Backordered"},
     * "d":{"S":"Discontinued"} }</code></li></ul> <p>The expression can now
     * be simplified as follows: <ul><li> <p><code>ProductStatus IN
     * (:a,:b,:c)</code></li></ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expressionAttributeValues One or more values that can be substituted in an expression. <p>Use
     *         the <b>:</b> character in an expression to dereference an attribute
     *         value. For example, consider the following expression:
     *         <ul><li><p><code>ProductStatus IN
     *         ("Available","Backordered","Discontinued")</code></li></ul> <p>Now
     *         suppose that you specified the following for
     *         <i>ExpressionAttributeValues</i>: <ul><li><p><code>{
     *         "a":{"S":"Available"}, "b":{"S":"Backordered"},
     *         "d":{"S":"Discontinued"} }</code></li></ul> <p>The expression can now
     *         be simplified as follows: <ul><li> <p><code>ProductStatus IN
     *         (:a,:b,:c)</code></li></ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteItemRequest withExpressionAttributeValues(java.util.Map<String,AttributeValue> expressionAttributeValues) {
        setExpressionAttributeValues(expressionAttributeValues);
        return this;
    }

    /**
     * One or more values that can be substituted in an expression. <p>Use
     * the <b>:</b> character in an expression to dereference an attribute
     * value. For example, consider the following expression:
     * <ul><li><p><code>ProductStatus IN
     * ("Available","Backordered","Discontinued")</code></li></ul> <p>Now
     * suppose that you specified the following for
     * <i>ExpressionAttributeValues</i>: <ul><li><p><code>{
     * "a":{"S":"Available"}, "b":{"S":"Backordered"},
     * "d":{"S":"Discontinued"} }</code></li></ul> <p>The expression can now
     * be simplified as follows: <ul><li> <p><code>ProductStatus IN
     * (:a,:b,:c)</code></li></ul>
     * <p>
     * The method adds a new key-value pair into ExpressionAttributeValues
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into ExpressionAttributeValues.
     * @param value The corresponding value of the entry to be added into ExpressionAttributeValues.
     */
    public DeleteItemRequest addExpressionAttributeValuesEntry(String key, AttributeValue value) {
        if (null == this.expressionAttributeValues) {
            this.expressionAttributeValues = new java.util.HashMap<String,AttributeValue>();
        }
        if (this.expressionAttributeValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.expressionAttributeValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeValues.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public DeleteItemRequest clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
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
        if (getTableName() != null) sb.append("TableName: " + getTableName() + ",");
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getExpected() != null) sb.append("Expected: " + getExpected() + ",");
        if (getConditionalOperator() != null) sb.append("ConditionalOperator: " + getConditionalOperator() + ",");
        if (getReturnValues() != null) sb.append("ReturnValues: " + getReturnValues() + ",");
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getReturnItemCollectionMetrics() != null) sb.append("ReturnItemCollectionMetrics: " + getReturnItemCollectionMetrics() + ",");
        if (getConditionExpression() != null) sb.append("ConditionExpression: " + getConditionExpression() + ",");
        if (getExpressionAttributeNames() != null) sb.append("ExpressionAttributeNames: " + getExpressionAttributeNames() + ",");
        if (getExpressionAttributeValues() != null) sb.append("ExpressionAttributeValues: " + getExpressionAttributeValues() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteItemRequest == false) return false;
        DeleteItemRequest other = (DeleteItemRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getExpected() == null ^ this.getExpected() == null) return false;
        if (other.getExpected() != null && other.getExpected().equals(this.getExpected()) == false) return false; 
        if (other.getConditionalOperator() == null ^ this.getConditionalOperator() == null) return false;
        if (other.getConditionalOperator() != null && other.getConditionalOperator().equals(this.getConditionalOperator()) == false) return false; 
        if (other.getReturnValues() == null ^ this.getReturnValues() == null) return false;
        if (other.getReturnValues() != null && other.getReturnValues().equals(this.getReturnValues()) == false) return false; 
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null) return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false) return false; 
        if (other.getReturnItemCollectionMetrics() == null ^ this.getReturnItemCollectionMetrics() == null) return false;
        if (other.getReturnItemCollectionMetrics() != null && other.getReturnItemCollectionMetrics().equals(this.getReturnItemCollectionMetrics()) == false) return false; 
        if (other.getConditionExpression() == null ^ this.getConditionExpression() == null) return false;
        if (other.getConditionExpression() != null && other.getConditionExpression().equals(this.getConditionExpression()) == false) return false; 
        if (other.getExpressionAttributeNames() == null ^ this.getExpressionAttributeNames() == null) return false;
        if (other.getExpressionAttributeNames() != null && other.getExpressionAttributeNames().equals(this.getExpressionAttributeNames()) == false) return false; 
        if (other.getExpressionAttributeValues() == null ^ this.getExpressionAttributeValues() == null) return false;
        if (other.getExpressionAttributeValues() != null && other.getExpressionAttributeValues().equals(this.getExpressionAttributeValues()) == false) return false; 
        return true;
    }
    
}
    