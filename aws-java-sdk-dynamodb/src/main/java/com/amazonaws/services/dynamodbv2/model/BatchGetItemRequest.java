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
 * Represents the input of a <code>BatchGetItem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchGetItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A map of one or more table names and, for each table, a map that describes one or more items to retrieve from
     * that table. Each table name can be used only once per <code>BatchGetItem</code> request.
     * </p>
     * <p>
     * Each element in the map of items to retrieve consists of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConsistentRead</code> - If <code>true</code>, a strongly consistent read is used; if <code>false</code>
     * (the default), an eventually consistent read is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExpressionAttributeNames</code> - One or more substitution tokens for attribute names in the
     * <code>ProjectionExpression</code> parameter. The following are some use cases for using
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
     * </li>
     * <li>
     * <p>
     * <code>Keys</code> - An array of primary key attribute values that define specific items in the table. For each
     * primary key, you must provide <i>all</i> of the key attributes. For example, with a simple primary key, you only
     * need to provide the partition key value. For a composite key, you must provide <i>both</i> the partition key
     * value and the sort key value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProjectionExpression</code> - A string that identifies one or more attributes to retrieve from the table.
     * These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must
     * be separated by commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are
     * not found, they will not appear in the result.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributesToGet</code> - This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     * >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, KeysAndAttributes> requestItems;

    private String returnConsumedCapacity;

    /**
     * Default constructor for BatchGetItemRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public BatchGetItemRequest() {
    }

    /**
     * Constructs a new BatchGetItemRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param requestItems
     *        A map of one or more table names and, for each table, a map that describes one or more items to retrieve
     *        from that table. Each table name can be used only once per <code>BatchGetItem</code> request.</p>
     *        <p>
     *        Each element in the map of items to retrieve consists of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConsistentRead</code> - If <code>true</code>, a strongly consistent read is used; if
     *        <code>false</code> (the default), an eventually consistent read is used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ExpressionAttributeNames</code> - One or more substitution tokens for attribute names in the
     *        <code>ProjectionExpression</code> parameter. The following are some use cases for using
     *        <code>ExpressionAttributeNames</code>:
     *        </p>
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
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Keys</code> - An array of primary key attribute values that define specific items in the table. For
     *        each primary key, you must provide <i>all</i> of the key attributes. For example, with a simple primary
     *        key, you only need to provide the partition key value. For a composite key, you must provide <i>both</i>
     *        the partition key value and the sort key value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProjectionExpression</code> - A string that identifies one or more attributes to retrieve from the
     *        table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the
     *        expression must be separated by commas.
     *        </p>
     *        <p>
     *        If no attribute names are specified, then all attributes will be returned. If any of the requested
     *        attributes are not found, they will not appear in the result.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AttributesToGet</code> - This is a legacy parameter. Use <code>ProjectionExpression</code> instead.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *        >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        </li>
     */
    public BatchGetItemRequest(java.util.Map<String, KeysAndAttributes> requestItems) {
        setRequestItems(requestItems);
    }

    /**
     * Constructs a new BatchGetItemRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param requestItems
     *        A map of one or more table names and, for each table, a map that describes one or more items to retrieve
     *        from that table. Each table name can be used only once per <code>BatchGetItem</code> request.</p>
     *        <p>
     *        Each element in the map of items to retrieve consists of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConsistentRead</code> - If <code>true</code>, a strongly consistent read is used; if
     *        <code>false</code> (the default), an eventually consistent read is used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ExpressionAttributeNames</code> - One or more substitution tokens for attribute names in the
     *        <code>ProjectionExpression</code> parameter. The following are some use cases for using
     *        <code>ExpressionAttributeNames</code>:
     *        </p>
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
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Keys</code> - An array of primary key attribute values that define specific items in the table. For
     *        each primary key, you must provide <i>all</i> of the key attributes. For example, with a simple primary
     *        key, you only need to provide the partition key value. For a composite key, you must provide <i>both</i>
     *        the partition key value and the sort key value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProjectionExpression</code> - A string that identifies one or more attributes to retrieve from the
     *        table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the
     *        expression must be separated by commas.
     *        </p>
     *        <p>
     *        If no attribute names are specified, then all attributes will be returned. If any of the requested
     *        attributes are not found, they will not appear in the result.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AttributesToGet</code> - This is a legacy parameter. Use <code>ProjectionExpression</code> instead.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *        >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        </li>
     * @param returnConsumedCapacity
     */
    public BatchGetItemRequest(java.util.Map<String, KeysAndAttributes> requestItems, String returnConsumedCapacity) {
        setRequestItems(requestItems);
        setReturnConsumedCapacity(returnConsumedCapacity);
    }

    /**
     * Constructs a new BatchGetItemRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param requestItems
     *        A map of one or more table names and, for each table, a map that describes one or more items to retrieve
     *        from that table. Each table name can be used only once per <code>BatchGetItem</code> request.</p>
     *        <p>
     *        Each element in the map of items to retrieve consists of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConsistentRead</code> - If <code>true</code>, a strongly consistent read is used; if
     *        <code>false</code> (the default), an eventually consistent read is used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ExpressionAttributeNames</code> - One or more substitution tokens for attribute names in the
     *        <code>ProjectionExpression</code> parameter. The following are some use cases for using
     *        <code>ExpressionAttributeNames</code>:
     *        </p>
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
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Keys</code> - An array of primary key attribute values that define specific items in the table. For
     *        each primary key, you must provide <i>all</i> of the key attributes. For example, with a simple primary
     *        key, you only need to provide the partition key value. For a composite key, you must provide <i>both</i>
     *        the partition key value and the sort key value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProjectionExpression</code> - A string that identifies one or more attributes to retrieve from the
     *        table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the
     *        expression must be separated by commas.
     *        </p>
     *        <p>
     *        If no attribute names are specified, then all attributes will be returned. If any of the requested
     *        attributes are not found, they will not appear in the result.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AttributesToGet</code> - This is a legacy parameter. Use <code>ProjectionExpression</code> instead.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *        >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        </li>
     * @param returnConsumedCapacity
     */
    public BatchGetItemRequest(java.util.Map<String, KeysAndAttributes> requestItems, ReturnConsumedCapacity returnConsumedCapacity) {
        setRequestItems(requestItems);
        setReturnConsumedCapacity(returnConsumedCapacity.toString());
    }

    /**
     * <p>
     * A map of one or more table names and, for each table, a map that describes one or more items to retrieve from
     * that table. Each table name can be used only once per <code>BatchGetItem</code> request.
     * </p>
     * <p>
     * Each element in the map of items to retrieve consists of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConsistentRead</code> - If <code>true</code>, a strongly consistent read is used; if <code>false</code>
     * (the default), an eventually consistent read is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExpressionAttributeNames</code> - One or more substitution tokens for attribute names in the
     * <code>ProjectionExpression</code> parameter. The following are some use cases for using
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
     * </li>
     * <li>
     * <p>
     * <code>Keys</code> - An array of primary key attribute values that define specific items in the table. For each
     * primary key, you must provide <i>all</i> of the key attributes. For example, with a simple primary key, you only
     * need to provide the partition key value. For a composite key, you must provide <i>both</i> the partition key
     * value and the sort key value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProjectionExpression</code> - A string that identifies one or more attributes to retrieve from the table.
     * These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must
     * be separated by commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are
     * not found, they will not appear in the result.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributesToGet</code> - This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     * >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A map of one or more table names and, for each table, a map that describes one or more items to retrieve
     *         from that table. Each table name can be used only once per <code>BatchGetItem</code> request.</p>
     *         <p>
     *         Each element in the map of items to retrieve consists of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ConsistentRead</code> - If <code>true</code>, a strongly consistent read is used; if
     *         <code>false</code> (the default), an eventually consistent read is used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ExpressionAttributeNames</code> - One or more substitution tokens for attribute names in the
     *         <code>ProjectionExpression</code> parameter. The following are some use cases for using
     *         <code>ExpressionAttributeNames</code>:
     *         </p>
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
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Keys</code> - An array of primary key attribute values that define specific items in the table. For
     *         each primary key, you must provide <i>all</i> of the key attributes. For example, with a simple primary
     *         key, you only need to provide the partition key value. For a composite key, you must provide <i>both</i>
     *         the partition key value and the sort key value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ProjectionExpression</code> - A string that identifies one or more attributes to retrieve from the
     *         table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the
     *         expression must be separated by commas.
     *         </p>
     *         <p>
     *         If no attribute names are specified, then all attributes will be returned. If any of the requested
     *         attributes are not found, they will not appear in the result.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *         >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AttributesToGet</code> - This is a legacy parameter. Use <code>ProjectionExpression</code> instead.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *         >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, KeysAndAttributes> getRequestItems() {
        return requestItems;
    }

    /**
     * <p>
     * A map of one or more table names and, for each table, a map that describes one or more items to retrieve from
     * that table. Each table name can be used only once per <code>BatchGetItem</code> request.
     * </p>
     * <p>
     * Each element in the map of items to retrieve consists of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConsistentRead</code> - If <code>true</code>, a strongly consistent read is used; if <code>false</code>
     * (the default), an eventually consistent read is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExpressionAttributeNames</code> - One or more substitution tokens for attribute names in the
     * <code>ProjectionExpression</code> parameter. The following are some use cases for using
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
     * </li>
     * <li>
     * <p>
     * <code>Keys</code> - An array of primary key attribute values that define specific items in the table. For each
     * primary key, you must provide <i>all</i> of the key attributes. For example, with a simple primary key, you only
     * need to provide the partition key value. For a composite key, you must provide <i>both</i> the partition key
     * value and the sort key value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProjectionExpression</code> - A string that identifies one or more attributes to retrieve from the table.
     * These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must
     * be separated by commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are
     * not found, they will not appear in the result.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributesToGet</code> - This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     * >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param requestItems
     *        A map of one or more table names and, for each table, a map that describes one or more items to retrieve
     *        from that table. Each table name can be used only once per <code>BatchGetItem</code> request.</p>
     *        <p>
     *        Each element in the map of items to retrieve consists of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConsistentRead</code> - If <code>true</code>, a strongly consistent read is used; if
     *        <code>false</code> (the default), an eventually consistent read is used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ExpressionAttributeNames</code> - One or more substitution tokens for attribute names in the
     *        <code>ProjectionExpression</code> parameter. The following are some use cases for using
     *        <code>ExpressionAttributeNames</code>:
     *        </p>
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
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Keys</code> - An array of primary key attribute values that define specific items in the table. For
     *        each primary key, you must provide <i>all</i> of the key attributes. For example, with a simple primary
     *        key, you only need to provide the partition key value. For a composite key, you must provide <i>both</i>
     *        the partition key value and the sort key value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProjectionExpression</code> - A string that identifies one or more attributes to retrieve from the
     *        table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the
     *        expression must be separated by commas.
     *        </p>
     *        <p>
     *        If no attribute names are specified, then all attributes will be returned. If any of the requested
     *        attributes are not found, they will not appear in the result.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AttributesToGet</code> - This is a legacy parameter. Use <code>ProjectionExpression</code> instead.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *        >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        </li>
     */

    public void setRequestItems(java.util.Map<String, KeysAndAttributes> requestItems) {
        this.requestItems = requestItems;
    }

    /**
     * <p>
     * A map of one or more table names and, for each table, a map that describes one or more items to retrieve from
     * that table. Each table name can be used only once per <code>BatchGetItem</code> request.
     * </p>
     * <p>
     * Each element in the map of items to retrieve consists of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConsistentRead</code> - If <code>true</code>, a strongly consistent read is used; if <code>false</code>
     * (the default), an eventually consistent read is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExpressionAttributeNames</code> - One or more substitution tokens for attribute names in the
     * <code>ProjectionExpression</code> parameter. The following are some use cases for using
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
     * </li>
     * <li>
     * <p>
     * <code>Keys</code> - An array of primary key attribute values that define specific items in the table. For each
     * primary key, you must provide <i>all</i> of the key attributes. For example, with a simple primary key, you only
     * need to provide the partition key value. For a composite key, you must provide <i>both</i> the partition key
     * value and the sort key value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProjectionExpression</code> - A string that identifies one or more attributes to retrieve from the table.
     * These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must
     * be separated by commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are
     * not found, they will not appear in the result.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributesToGet</code> - This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     * >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param requestItems
     *        A map of one or more table names and, for each table, a map that describes one or more items to retrieve
     *        from that table. Each table name can be used only once per <code>BatchGetItem</code> request.</p>
     *        <p>
     *        Each element in the map of items to retrieve consists of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConsistentRead</code> - If <code>true</code>, a strongly consistent read is used; if
     *        <code>false</code> (the default), an eventually consistent read is used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ExpressionAttributeNames</code> - One or more substitution tokens for attribute names in the
     *        <code>ProjectionExpression</code> parameter. The following are some use cases for using
     *        <code>ExpressionAttributeNames</code>:
     *        </p>
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
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Keys</code> - An array of primary key attribute values that define specific items in the table. For
     *        each primary key, you must provide <i>all</i> of the key attributes. For example, with a simple primary
     *        key, you only need to provide the partition key value. For a composite key, you must provide <i>both</i>
     *        the partition key value and the sort key value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProjectionExpression</code> - A string that identifies one or more attributes to retrieve from the
     *        table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the
     *        expression must be separated by commas.
     *        </p>
     *        <p>
     *        If no attribute names are specified, then all attributes will be returned. If any of the requested
     *        attributes are not found, they will not appear in the result.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AttributesToGet</code> - This is a legacy parameter. Use <code>ProjectionExpression</code> instead.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *        >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetItemRequest withRequestItems(java.util.Map<String, KeysAndAttributes> requestItems) {
        setRequestItems(requestItems);
        return this;
    }

    public BatchGetItemRequest addRequestItemsEntry(String key, KeysAndAttributes value) {
        if (null == this.requestItems) {
            this.requestItems = new java.util.HashMap<String, KeysAndAttributes>();
        }
        if (this.requestItems.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestItems.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestItems.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetItemRequest clearRequestItemsEntries() {
        this.requestItems = null;
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

    public BatchGetItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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

    public BatchGetItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
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
        if (getRequestItems() != null)
            sb.append("RequestItems: ").append(getRequestItems()).append(",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: ").append(getReturnConsumedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetItemRequest == false)
            return false;
        BatchGetItemRequest other = (BatchGetItemRequest) obj;
        if (other.getRequestItems() == null ^ this.getRequestItems() == null)
            return false;
        if (other.getRequestItems() != null && other.getRequestItems().equals(this.getRequestItems()) == false)
            return false;
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null)
            return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestItems() == null) ? 0 : getRequestItems().hashCode());
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetItemRequest clone() {
        return (BatchGetItemRequest) super.clone();
    }

}
