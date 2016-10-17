/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <i>PutItem</i> operation.
 * </p>
 */
public class PutItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the table to contain the item.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you
     * can optionally provide other attribute name-value pairs for the item.
     * </p>
     * <p>
     * You must provide all of the attributes for the primary key. For example, with a simple primary key, you only need
     * to provide a value for the partition key. For a composite primary key, you must provide both values for both the
     * partition key and the sort key.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the data types for those attributes must match
     * those of the schema in the table's attribute definition.
     * </p>
     * <p>
     * For more information about primary keys, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Each element in the <i>Item</i> map is an <i>AttributeValue</i> object.
     * </p>
     */
    private java.util.Map<String, AttributeValue> item;
    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ConditionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A map of attribute/condition pairs. <i>Expected</i> provides a conditional block for the <i>PutItem</i>
     * operation.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * <p>
     * Each element of <i>Expected</i> consists of an attribute name, a comparison operator, and one or more values.
     * DynamoDB compares the attribute with the value(s) you supplied, using the comparison operator. For each
     * <i>Expected</i> element, the result of the evaluation is either true or false.
     * </p>
     * <p>
     * If you specify more than one element in the <i>Expected</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together. (You can use the <i>ConditionalOperator</i>
     * parameter to OR the conditions instead. If you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.)
     * </p>
     * <p>
     * If the <i>Expected</i> map evaluates to true, then the conditional operation succeeds; otherwise, it fails.
     * </p>
     * <p>
     * <i>Expected</i> contains the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the supplied attribute. The number of values
     * in the list depends on the <i>ComparisonOperator</i> being used.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based on ASCII character code values. For
     * example, <code>a</code> is greater than <code>A</code>, and <code>a</code> is greater than <code>B</code>. For a
     * list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia
     * .org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes in the <i>AttributeValueList</i>. When
     * performing the comparison, DynamoDB uses strongly consistent reads.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * The following are descriptions of each comparison operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code> : Equal. <code>EQ</code> is supported for all datatypes, including lists and maps.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, Binary,
     * String Set, Number Set, or Binary Set. If an item contains an <i>AttributeValue</i> element of a different type
     * than the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not
     * equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>NE</code> : Not equal. <code>NE</code> is supported for all datatypes, including lists and maps.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an <i>AttributeValue</i> of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LE</code> : Less than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LT</code> : Less than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String, Number, or Binary (not a set
     * type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided in the
     * request, the value does not match. For example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GE</code> : Greater than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GT</code> : Greater than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>NOT_NULL</code> : The attribute exists. <code>NOT_NULL</code> is supported for all datatypes, including
     * lists and maps.
     * </p>
     * <note>
     * <p>
     * This operator tests for the existence of an attribute, not its data type. If the data type of attribute "
     * <code>a</code>" is null, and you evaluate it using <code>NOT_NULL</code>, the result is a Boolean <i>true</i>.
     * This result is because the attribute "<code>a</code>" exists; its data type is not relevant to the
     * <code>NOT_NULL</code> comparison operator.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>NULL</code> : The attribute does not exist. <code>NULL</code> is supported for all datatypes, including
     * lists and maps.
     * </p>
     * <note>
     * <p>
     * This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "
     * <code>a</code>" is null, and you evaluate it using <code>NULL</code>, the result is a Boolean <i>false</i>. This
     * is because the attribute "<code>a</code>" exists; its data type is not relevant to the <code>NULL</code>
     * comparison operator.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>CONTAINS</code> : Checks for a subsequence, or value in a set.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If the target attribute of the comparison is of type String, then the operator checks for a
     * substring match. If the target attribute of the comparison is of type Binary, then the operator looks for a
     * subsequence of the target that matches the input. If the target attribute of the comparison is a set ("
     * <code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates to true if it finds an
     * exact match with any member of the set.
     * </p>
     * <p>
     * CONTAINS is supported for lists: When evaluating "<code>a CONTAINS b</code>", "<code>a</code>
     * " can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or absence of a value in a set.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If the target attribute of the comparison is a String, then the operator checks for the absence
     * of a substring match. If the target attribute of the comparison is Binary, then the operator checks for the
     * absence of a subsequence of the target that matches the input. If the target attribute of the comparison is a set
     * ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates to true if it <i>does
     * not</i> find an exact match with any member of the set.
     * </p>
     * <p>
     * NOT_CONTAINS is supported for lists: When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>
     * " can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code> : Checks for a prefix.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set type). The target attribute of the comparison must be of type String or Binary (not a Number or a set type).
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>IN</code> : Checks for matching elements within two sets.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain one or more <i>AttributeValue</i> elements of type String, Number, or
     * Binary (not a set type). These attributes are compared against an existing set type attribute of an item. If any
     * elements of the input set are present in the item attribute, the expression evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code> : Greater than or equal to the first value, and less than or equal to the second value.
     * </p>
     * <p>
     * <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements of the same type, either String,
     * Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or equal to,
     * the first element and less than, or equal to, the second element. If an item contains an <i>AttributeValue</i>
     * element of a different type than the one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For usage examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For backward compatibility with previous DynamoDB releases, the following parameters can be used instead of
     * <i>AttributeValueList</i> and <i>ComparisonOperator</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Value</i> - A value for DynamoDB to compare with an attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Exists</i> - A Boolean value that causes DynamoDB to evaluate the value before attempting the conditional
     * operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <i>Exists</i> is <code>true</code>, DynamoDB will check to see if that attribute value already exists in the
     * table. If it is found, then the condition evaluates to true; otherwise the condition evaluate to false.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <i>Exists</i> is <code>false</code>, DynamoDB assumes that the attribute value does <i>not</i> exist in the
     * table. If in fact the value does not exist, then the assumption is valid and the condition evaluates to true. If
     * the value is found, despite the assumption that it does not exist, the condition evaluates to false.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the default value for <i>Exists</i> is <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <i>Value</i> and <i>Exists</i> parameters are incompatible with <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>. Note that if you use both sets of parameters at once, DynamoDB will return a
     * <i>ValidationException</i> exception.
     * </p>
     */
    private java.util.Map<String, ExpectedAttributeValue> expected;
    /**
     * <p>
     * Use <i>ReturnValues</i> if you want to get the item attributes as they appeared before they were updated with the
     * <i>PutItem</i> request. For <i>PutItem</i>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then nothing
     * is returned. (This setting is the default for <i>ReturnValues</i>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute name-value pair, then the content of the old item
     * is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <i>ReturnValues</i> parameter is used by several DynamoDB operations; however, <i>PutItem</i> does not
     * recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
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
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ConditionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in the <i>Expected</i> map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true, then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     */
    private String conditionalOperator;
    /**
     * <p>
     * A condition that must be satisfied in order for a conditional <i>PutItem</i> operation to succeed.
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
     * Comparison operators:
     * <code> = | &amp;#x3C;&amp;#x3E; | &amp;#x3C; | &amp;#x3E; | &amp;#x3C;= | &amp;#x3E;= | BETWEEN | IN</code>
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>ConditionExpression</i> replaces the legacy <i>ConditionalOperator</i> and <i>Expected</i> parameters.
     * </p>
     * </note>
     */
    private String conditionExpression;
    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The following are some use cases for using
     * <i>ExpressionAttributeNames</i>:
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
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
     * For more information on expression attribute names, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
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
     * You would first need to specify <i>ExpressionAttributeValues</i> as follows:
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, AttributeValue> expressionAttributeValues;

    /**
     * Default constructor for PutItemRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize the object after creating it.
     */
    public PutItemRequest() {
    }

    /**
     * Constructs a new PutItemRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     *        The name of the table to contain the item.
     * @param item
     *        A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required;
     *        you can optionally provide other attribute name-value pairs for the item.</p>
     *        <p>
     *        You must provide all of the attributes for the primary key. For example, with a simple primary key, you
     *        only need to provide a value for the partition key. For a composite primary key, you must provide both
     *        values for both the partition key and the sort key.
     *        </p>
     *        <p>
     *        If you specify any attributes that are part of an index key, then the data types for those attributes must
     *        match those of the schema in the table's attribute definition.
     *        </p>
     *        <p>
     *        For more information about primary keys, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *        >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <p>
     *        Each element in the <i>Item</i> map is an <i>AttributeValue</i> object.
     */
    public PutItemRequest(String tableName, java.util.Map<String, AttributeValue> item) {
        setTableName(tableName);
        setItem(item);
    }

    /**
     * Constructs a new PutItemRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     *        The name of the table to contain the item.
     * @param item
     *        A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required;
     *        you can optionally provide other attribute name-value pairs for the item.</p>
     *        <p>
     *        You must provide all of the attributes for the primary key. For example, with a simple primary key, you
     *        only need to provide a value for the partition key. For a composite primary key, you must provide both
     *        values for both the partition key and the sort key.
     *        </p>
     *        <p>
     *        If you specify any attributes that are part of an index key, then the data types for those attributes must
     *        match those of the schema in the table's attribute definition.
     *        </p>
     *        <p>
     *        For more information about primary keys, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *        >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <p>
     *        Each element in the <i>Item</i> map is an <i>AttributeValue</i> object.
     * @param returnValues
     *        Use <i>ReturnValues</i> if you want to get the item attributes as they appeared before they were updated
     *        with the <i>PutItem</i> request. For <i>PutItem</i>, the valid values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then
     *        nothing is returned. (This setting is the default for <i>ReturnValues</i>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute name-value pair, then the content of the
     *        old item is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <i>ReturnValues</i> parameter is used by several DynamoDB operations; however, <i>PutItem</i> does not
     *        recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     *        </p>
     */
    public PutItemRequest(String tableName, java.util.Map<String, AttributeValue> item, String returnValues) {
        setTableName(tableName);
        setItem(item);
        setReturnValues(returnValues);
    }

    /**
     * Constructs a new PutItemRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     *        The name of the table to contain the item.
     * @param item
     *        A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required;
     *        you can optionally provide other attribute name-value pairs for the item.</p>
     *        <p>
     *        You must provide all of the attributes for the primary key. For example, with a simple primary key, you
     *        only need to provide a value for the partition key. For a composite primary key, you must provide both
     *        values for both the partition key and the sort key.
     *        </p>
     *        <p>
     *        If you specify any attributes that are part of an index key, then the data types for those attributes must
     *        match those of the schema in the table's attribute definition.
     *        </p>
     *        <p>
     *        For more information about primary keys, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *        >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <p>
     *        Each element in the <i>Item</i> map is an <i>AttributeValue</i> object.
     * @param returnValues
     *        Use <i>ReturnValues</i> if you want to get the item attributes as they appeared before they were updated
     *        with the <i>PutItem</i> request. For <i>PutItem</i>, the valid values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then
     *        nothing is returned. (This setting is the default for <i>ReturnValues</i>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute name-value pair, then the content of the
     *        old item is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <i>ReturnValues</i> parameter is used by several DynamoDB operations; however, <i>PutItem</i> does not
     *        recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     *        </p>
     */
    public PutItemRequest(String tableName, java.util.Map<String, AttributeValue> item, ReturnValue returnValues) {
        setTableName(tableName);
        setItem(item);
        setReturnValues(returnValues.toString());
    }

    /**
     * <p>
     * The name of the table to contain the item.
     * </p>
     * 
     * @param tableName
     *        The name of the table to contain the item.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table to contain the item.
     * </p>
     * 
     * @return The name of the table to contain the item.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table to contain the item.
     * </p>
     * 
     * @param tableName
     *        The name of the table to contain the item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutItemRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you
     * can optionally provide other attribute name-value pairs for the item.
     * </p>
     * <p>
     * You must provide all of the attributes for the primary key. For example, with a simple primary key, you only need
     * to provide a value for the partition key. For a composite primary key, you must provide both values for both the
     * partition key and the sort key.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the data types for those attributes must match
     * those of the schema in the table's attribute definition.
     * </p>
     * <p>
     * For more information about primary keys, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Each element in the <i>Item</i> map is an <i>AttributeValue</i> object.
     * </p>
     * 
     * @return A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are
     *         required; you can optionally provide other attribute name-value pairs for the item.</p>
     *         <p>
     *         You must provide all of the attributes for the primary key. For example, with a simple primary key, you
     *         only need to provide a value for the partition key. For a composite primary key, you must provide both
     *         values for both the partition key and the sort key.
     *         </p>
     *         <p>
     *         If you specify any attributes that are part of an index key, then the data types for those attributes
     *         must match those of the schema in the table's attribute definition.
     *         </p>
     *         <p>
     *         For more information about primary keys, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *         >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     *         <p>
     *         Each element in the <i>Item</i> map is an <i>AttributeValue</i> object.
     */

    public java.util.Map<String, AttributeValue> getItem() {
        return item;
    }

    /**
     * <p>
     * A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you
     * can optionally provide other attribute name-value pairs for the item.
     * </p>
     * <p>
     * You must provide all of the attributes for the primary key. For example, with a simple primary key, you only need
     * to provide a value for the partition key. For a composite primary key, you must provide both values for both the
     * partition key and the sort key.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the data types for those attributes must match
     * those of the schema in the table's attribute definition.
     * </p>
     * <p>
     * For more information about primary keys, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Each element in the <i>Item</i> map is an <i>AttributeValue</i> object.
     * </p>
     * 
     * @param item
     *        A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required;
     *        you can optionally provide other attribute name-value pairs for the item.</p>
     *        <p>
     *        You must provide all of the attributes for the primary key. For example, with a simple primary key, you
     *        only need to provide a value for the partition key. For a composite primary key, you must provide both
     *        values for both the partition key and the sort key.
     *        </p>
     *        <p>
     *        If you specify any attributes that are part of an index key, then the data types for those attributes must
     *        match those of the schema in the table's attribute definition.
     *        </p>
     *        <p>
     *        For more information about primary keys, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *        >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <p>
     *        Each element in the <i>Item</i> map is an <i>AttributeValue</i> object.
     */

    public void setItem(java.util.Map<String, AttributeValue> item) {
        this.item = item;
    }

    /**
     * <p>
     * A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you
     * can optionally provide other attribute name-value pairs for the item.
     * </p>
     * <p>
     * You must provide all of the attributes for the primary key. For example, with a simple primary key, you only need
     * to provide a value for the partition key. For a composite primary key, you must provide both values for both the
     * partition key and the sort key.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the data types for those attributes must match
     * those of the schema in the table's attribute definition.
     * </p>
     * <p>
     * For more information about primary keys, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Each element in the <i>Item</i> map is an <i>AttributeValue</i> object.
     * </p>
     * 
     * @param item
     *        A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required;
     *        you can optionally provide other attribute name-value pairs for the item.</p>
     *        <p>
     *        You must provide all of the attributes for the primary key. For example, with a simple primary key, you
     *        only need to provide a value for the partition key. For a composite primary key, you must provide both
     *        values for both the partition key and the sort key.
     *        </p>
     *        <p>
     *        If you specify any attributes that are part of an index key, then the data types for those attributes must
     *        match those of the schema in the table's attribute definition.
     *        </p>
     *        <p>
     *        For more information about primary keys, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *        >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <p>
     *        Each element in the <i>Item</i> map is an <i>AttributeValue</i> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutItemRequest withItem(java.util.Map<String, AttributeValue> item) {
        setItem(item);
        return this;
    }

    public PutItemRequest addItemEntry(String key, AttributeValue value) {
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

    public PutItemRequest clearItemEntries() {
        this.item = null;
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ConditionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A map of attribute/condition pairs. <i>Expected</i> provides a conditional block for the <i>PutItem</i>
     * operation.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * <p>
     * Each element of <i>Expected</i> consists of an attribute name, a comparison operator, and one or more values.
     * DynamoDB compares the attribute with the value(s) you supplied, using the comparison operator. For each
     * <i>Expected</i> element, the result of the evaluation is either true or false.
     * </p>
     * <p>
     * If you specify more than one element in the <i>Expected</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together. (You can use the <i>ConditionalOperator</i>
     * parameter to OR the conditions instead. If you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.)
     * </p>
     * <p>
     * If the <i>Expected</i> map evaluates to true, then the conditional operation succeeds; otherwise, it fails.
     * </p>
     * <p>
     * <i>Expected</i> contains the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the supplied attribute. The number of values
     * in the list depends on the <i>ComparisonOperator</i> being used.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based on ASCII character code values. For
     * example, <code>a</code> is greater than <code>A</code>, and <code>a</code> is greater than <code>B</code>. For a
     * list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia
     * .org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes in the <i>AttributeValueList</i>. When
     * performing the comparison, DynamoDB uses strongly consistent reads.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * The following are descriptions of each comparison operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code> : Equal. <code>EQ</code> is supported for all datatypes, including lists and maps.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, Binary,
     * String Set, Number Set, or Binary Set. If an item contains an <i>AttributeValue</i> element of a different type
     * than the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not
     * equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>NE</code> : Not equal. <code>NE</code> is supported for all datatypes, including lists and maps.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an <i>AttributeValue</i> of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LE</code> : Less than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LT</code> : Less than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String, Number, or Binary (not a set
     * type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided in the
     * request, the value does not match. For example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GE</code> : Greater than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GT</code> : Greater than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>NOT_NULL</code> : The attribute exists. <code>NOT_NULL</code> is supported for all datatypes, including
     * lists and maps.
     * </p>
     * <note>
     * <p>
     * This operator tests for the existence of an attribute, not its data type. If the data type of attribute "
     * <code>a</code>" is null, and you evaluate it using <code>NOT_NULL</code>, the result is a Boolean <i>true</i>.
     * This result is because the attribute "<code>a</code>" exists; its data type is not relevant to the
     * <code>NOT_NULL</code> comparison operator.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>NULL</code> : The attribute does not exist. <code>NULL</code> is supported for all datatypes, including
     * lists and maps.
     * </p>
     * <note>
     * <p>
     * This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "
     * <code>a</code>" is null, and you evaluate it using <code>NULL</code>, the result is a Boolean <i>false</i>. This
     * is because the attribute "<code>a</code>" exists; its data type is not relevant to the <code>NULL</code>
     * comparison operator.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>CONTAINS</code> : Checks for a subsequence, or value in a set.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If the target attribute of the comparison is of type String, then the operator checks for a
     * substring match. If the target attribute of the comparison is of type Binary, then the operator looks for a
     * subsequence of the target that matches the input. If the target attribute of the comparison is a set ("
     * <code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates to true if it finds an
     * exact match with any member of the set.
     * </p>
     * <p>
     * CONTAINS is supported for lists: When evaluating "<code>a CONTAINS b</code>", "<code>a</code>
     * " can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or absence of a value in a set.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If the target attribute of the comparison is a String, then the operator checks for the absence
     * of a substring match. If the target attribute of the comparison is Binary, then the operator checks for the
     * absence of a subsequence of the target that matches the input. If the target attribute of the comparison is a set
     * ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates to true if it <i>does
     * not</i> find an exact match with any member of the set.
     * </p>
     * <p>
     * NOT_CONTAINS is supported for lists: When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>
     * " can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code> : Checks for a prefix.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set type). The target attribute of the comparison must be of type String or Binary (not a Number or a set type).
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>IN</code> : Checks for matching elements within two sets.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain one or more <i>AttributeValue</i> elements of type String, Number, or
     * Binary (not a set type). These attributes are compared against an existing set type attribute of an item. If any
     * elements of the input set are present in the item attribute, the expression evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code> : Greater than or equal to the first value, and less than or equal to the second value.
     * </p>
     * <p>
     * <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements of the same type, either String,
     * Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or equal to,
     * the first element and less than, or equal to, the second element. If an item contains an <i>AttributeValue</i>
     * element of a different type than the one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For usage examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For backward compatibility with previous DynamoDB releases, the following parameters can be used instead of
     * <i>AttributeValueList</i> and <i>ComparisonOperator</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Value</i> - A value for DynamoDB to compare with an attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Exists</i> - A Boolean value that causes DynamoDB to evaluate the value before attempting the conditional
     * operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <i>Exists</i> is <code>true</code>, DynamoDB will check to see if that attribute value already exists in the
     * table. If it is found, then the condition evaluates to true; otherwise the condition evaluate to false.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <i>Exists</i> is <code>false</code>, DynamoDB assumes that the attribute value does <i>not</i> exist in the
     * table. If in fact the value does not exist, then the assumption is valid and the condition evaluates to true. If
     * the value is found, despite the assumption that it does not exist, the condition evaluates to false.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the default value for <i>Exists</i> is <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <i>Value</i> and <i>Exists</i> parameters are incompatible with <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>. Note that if you use both sets of parameters at once, DynamoDB will return a
     * <i>ValidationException</i> exception.
     * </p>
     * 
     * @return <p>
     *         This is a legacy parameter, for backward compatibility. New applications should use
     *         <i>ConditionExpression</i> instead. Do not combine legacy parameters and expression parameters in a
     *         single API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *         </p>
     *         </important>
     *         <p>
     *         A map of attribute/condition pairs. <i>Expected</i> provides a conditional block for the <i>PutItem</i>
     *         operation.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter does not support attributes of type List or Map.
     *         </p>
     *         </note>
     *         <p>
     *         Each element of <i>Expected</i> consists of an attribute name, a comparison operator, and one or more
     *         values. DynamoDB compares the attribute with the value(s) you supplied, using the comparison operator.
     *         For each <i>Expected</i> element, the result of the evaluation is either true or false.
     *         </p>
     *         <p>
     *         If you specify more than one element in the <i>Expected</i> map, then by default all of the conditions
     *         must evaluate to true. In other words, the conditions are ANDed together. (You can use the
     *         <i>ConditionalOperator</i> parameter to OR the conditions instead. If you do this, then at least one of
     *         the conditions must evaluate to true, rather than all of them.)
     *         </p>
     *         <p>
     *         If the <i>Expected</i> map evaluates to true, then the conditional operation succeeds; otherwise, it
     *         fails.
     *         </p>
     *         <p>
     *         <i>Expected</i> contains the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>AttributeValueList</i> - One or more values to evaluate against the supplied attribute. The number of
     *         values in the list depends on the <i>ComparisonOperator</i> being used.
     *         </p>
     *         <p>
     *         For type Number, value comparisons are numeric.
     *         </p>
     *         <p>
     *         String value comparisons for greater than, equals, or less than are based on ASCII character code values.
     *         For example, <code>a</code> is greater than <code>A</code>, and <code>a</code> is greater than
     *         <code>B</code>. For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *         >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         </p>
     *         <p>
     *         For type Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>ComparisonOperator</i> - A comparator for evaluating attributes in the <i>AttributeValueList</i>. When
     *         performing the comparison, DynamoDB uses strongly consistent reads.
     *         </p>
     *         <p>
     *         The following comparison operators are available:
     *         </p>
     *         <p>
     *         <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     *         </p>
     *         <p>
     *         The following are descriptions of each comparison operator.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>EQ</code> : Equal. <code>EQ</code> is supported for all datatypes, including lists and maps.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number,
     *         Binary, String Set, Number Set, or Binary Set. If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one provided in the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *         <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>NE</code> : Not equal. <code>NE</code> is supported for all datatypes, including lists and maps.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String, Number, Binary,
     *         String Set, Number Set, or Binary Set. If an item contains an <i>AttributeValue</i> of a different type
     *         than the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does
     *         not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *         <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>LE</code> : Less than or equal.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *         Binary (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than
     *         the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not
     *         equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     *         <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>LT</code> : Less than.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String, Number, or Binary
     *         (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one
     *         provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     *         <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>GE</code> : Greater than or equal.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *         Binary (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than
     *         the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not
     *         equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     *         <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>GT</code> : Greater than.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *         Binary (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than
     *         the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not
     *         equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     *         <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>NOT_NULL</code> : The attribute exists. <code>NOT_NULL</code> is supported for all datatypes,
     *         including lists and maps.
     *         </p>
     *         <note>
     *         <p>
     *         This operator tests for the existence of an attribute, not its data type. If the data type of attribute "
     *         <code>a</code>" is null, and you evaluate it using <code>NOT_NULL</code>, the result is a Boolean
     *         <i>true</i>. This result is because the attribute "<code>a</code>" exists; its data type is not relevant
     *         to the <code>NOT_NULL</code> comparison operator.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>NULL</code> : The attribute does not exist. <code>NULL</code> is supported for all datatypes,
     *         including lists and maps.
     *         </p>
     *         <note>
     *         <p>
     *         This operator tests for the nonexistence of an attribute, not its data type. If the data type of
     *         attribute "<code>a</code>" is null, and you evaluate it using <code>NULL</code>, the result is a Boolean
     *         <i>false</i>. This is because the attribute "<code>a</code>" exists; its data type is not relevant to the
     *         <code>NULL</code> comparison operator.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>CONTAINS</code> : Checks for a subsequence, or value in a set.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *         Binary (not a set type). If the target attribute of the comparison is of type String, then the operator
     *         checks for a substring match. If the target attribute of the comparison is of type Binary, then the
     *         operator looks for a subsequence of the target that matches the input. If the target attribute of the
     *         comparison is a set ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the operator
     *         evaluates to true if it finds an exact match with any member of the set.
     *         </p>
     *         <p>
     *         CONTAINS is supported for lists: When evaluating "<code>a CONTAINS b</code>", "<code>a</code>
     *         " can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or absence of a value in a set.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *         Binary (not a set type). If the target attribute of the comparison is a String, then the operator checks
     *         for the absence of a substring match. If the target attribute of the comparison is Binary, then the
     *         operator checks for the absence of a subsequence of the target that matches the input. If the target
     *         attribute of the comparison is a set ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then
     *         the operator evaluates to true if it <i>does not</i> find an exact match with any member of the set.
     *         </p>
     *         <p>
     *         NOT_CONTAINS is supported for lists: When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>
     *         " can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BEGINS_WITH</code> : Checks for a prefix.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String or Binary (not a
     *         Number or a set type). The target attribute of the comparison must be of type String or Binary (not a
     *         Number or a set type).
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>IN</code> : Checks for matching elements within two sets.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain one or more <i>AttributeValue</i> elements of type String, Number,
     *         or Binary (not a set type). These attributes are compared against an existing set type attribute of an
     *         item. If any elements of the input set are present in the item attribute, the expression evaluates to
     *         true.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BETWEEN</code> : Greater than or equal to the first value, and less than or equal to the second
     *         value.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements of the same type, either
     *         String, Number, or Binary (not a set type). A target attribute matches if the target value is greater
     *         than, or equal to, the first element and less than, or equal to, the second element. If an item contains
     *         an <i>AttributeValue</i> element of a different type than the one provided in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         For usage examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     *         >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     *         <p>
     *         For backward compatibility with previous DynamoDB releases, the following parameters can be used instead
     *         of <i>AttributeValueList</i> and <i>ComparisonOperator</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Value</i> - A value for DynamoDB to compare with an attribute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Exists</i> - A Boolean value that causes DynamoDB to evaluate the value before attempting the
     *         conditional operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <i>Exists</i> is <code>true</code>, DynamoDB will check to see if that attribute value already exists
     *         in the table. If it is found, then the condition evaluates to true; otherwise the condition evaluate to
     *         false.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <i>Exists</i> is <code>false</code>, DynamoDB assumes that the attribute value does <i>not</i> exist
     *         in the table. If in fact the value does not exist, then the assumption is valid and the condition
     *         evaluates to true. If the value is found, despite the assumption that it does not exist, the condition
     *         evaluates to false.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Note that the default value for <i>Exists</i> is <code>true</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The <i>Value</i> and <i>Exists</i> parameters are incompatible with <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>. Note that if you use both sets of parameters at once, DynamoDB will return a
     *         <i>ValidationException</i> exception.
     */

    public java.util.Map<String, ExpectedAttributeValue> getExpected() {
        return expected;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ConditionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A map of attribute/condition pairs. <i>Expected</i> provides a conditional block for the <i>PutItem</i>
     * operation.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * <p>
     * Each element of <i>Expected</i> consists of an attribute name, a comparison operator, and one or more values.
     * DynamoDB compares the attribute with the value(s) you supplied, using the comparison operator. For each
     * <i>Expected</i> element, the result of the evaluation is either true or false.
     * </p>
     * <p>
     * If you specify more than one element in the <i>Expected</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together. (You can use the <i>ConditionalOperator</i>
     * parameter to OR the conditions instead. If you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.)
     * </p>
     * <p>
     * If the <i>Expected</i> map evaluates to true, then the conditional operation succeeds; otherwise, it fails.
     * </p>
     * <p>
     * <i>Expected</i> contains the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the supplied attribute. The number of values
     * in the list depends on the <i>ComparisonOperator</i> being used.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based on ASCII character code values. For
     * example, <code>a</code> is greater than <code>A</code>, and <code>a</code> is greater than <code>B</code>. For a
     * list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia
     * .org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes in the <i>AttributeValueList</i>. When
     * performing the comparison, DynamoDB uses strongly consistent reads.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * The following are descriptions of each comparison operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code> : Equal. <code>EQ</code> is supported for all datatypes, including lists and maps.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, Binary,
     * String Set, Number Set, or Binary Set. If an item contains an <i>AttributeValue</i> element of a different type
     * than the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not
     * equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>NE</code> : Not equal. <code>NE</code> is supported for all datatypes, including lists and maps.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an <i>AttributeValue</i> of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LE</code> : Less than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LT</code> : Less than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String, Number, or Binary (not a set
     * type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided in the
     * request, the value does not match. For example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GE</code> : Greater than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GT</code> : Greater than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>NOT_NULL</code> : The attribute exists. <code>NOT_NULL</code> is supported for all datatypes, including
     * lists and maps.
     * </p>
     * <note>
     * <p>
     * This operator tests for the existence of an attribute, not its data type. If the data type of attribute "
     * <code>a</code>" is null, and you evaluate it using <code>NOT_NULL</code>, the result is a Boolean <i>true</i>.
     * This result is because the attribute "<code>a</code>" exists; its data type is not relevant to the
     * <code>NOT_NULL</code> comparison operator.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>NULL</code> : The attribute does not exist. <code>NULL</code> is supported for all datatypes, including
     * lists and maps.
     * </p>
     * <note>
     * <p>
     * This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "
     * <code>a</code>" is null, and you evaluate it using <code>NULL</code>, the result is a Boolean <i>false</i>. This
     * is because the attribute "<code>a</code>" exists; its data type is not relevant to the <code>NULL</code>
     * comparison operator.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>CONTAINS</code> : Checks for a subsequence, or value in a set.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If the target attribute of the comparison is of type String, then the operator checks for a
     * substring match. If the target attribute of the comparison is of type Binary, then the operator looks for a
     * subsequence of the target that matches the input. If the target attribute of the comparison is a set ("
     * <code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates to true if it finds an
     * exact match with any member of the set.
     * </p>
     * <p>
     * CONTAINS is supported for lists: When evaluating "<code>a CONTAINS b</code>", "<code>a</code>
     * " can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or absence of a value in a set.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If the target attribute of the comparison is a String, then the operator checks for the absence
     * of a substring match. If the target attribute of the comparison is Binary, then the operator checks for the
     * absence of a subsequence of the target that matches the input. If the target attribute of the comparison is a set
     * ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates to true if it <i>does
     * not</i> find an exact match with any member of the set.
     * </p>
     * <p>
     * NOT_CONTAINS is supported for lists: When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>
     * " can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code> : Checks for a prefix.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set type). The target attribute of the comparison must be of type String or Binary (not a Number or a set type).
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>IN</code> : Checks for matching elements within two sets.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain one or more <i>AttributeValue</i> elements of type String, Number, or
     * Binary (not a set type). These attributes are compared against an existing set type attribute of an item. If any
     * elements of the input set are present in the item attribute, the expression evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code> : Greater than or equal to the first value, and less than or equal to the second value.
     * </p>
     * <p>
     * <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements of the same type, either String,
     * Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or equal to,
     * the first element and less than, or equal to, the second element. If an item contains an <i>AttributeValue</i>
     * element of a different type than the one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For usage examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For backward compatibility with previous DynamoDB releases, the following parameters can be used instead of
     * <i>AttributeValueList</i> and <i>ComparisonOperator</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Value</i> - A value for DynamoDB to compare with an attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Exists</i> - A Boolean value that causes DynamoDB to evaluate the value before attempting the conditional
     * operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <i>Exists</i> is <code>true</code>, DynamoDB will check to see if that attribute value already exists in the
     * table. If it is found, then the condition evaluates to true; otherwise the condition evaluate to false.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <i>Exists</i> is <code>false</code>, DynamoDB assumes that the attribute value does <i>not</i> exist in the
     * table. If in fact the value does not exist, then the assumption is valid and the condition evaluates to true. If
     * the value is found, despite the assumption that it does not exist, the condition evaluates to false.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the default value for <i>Exists</i> is <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <i>Value</i> and <i>Exists</i> parameters are incompatible with <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>. Note that if you use both sets of parameters at once, DynamoDB will return a
     * <i>ValidationException</i> exception.
     * </p>
     * 
     * @param expected
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>ConditionExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A map of attribute/condition pairs. <i>Expected</i> provides a conditional block for the <i>PutItem</i>
     *        operation.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     *        </note>
     *        <p>
     *        Each element of <i>Expected</i> consists of an attribute name, a comparison operator, and one or more
     *        values. DynamoDB compares the attribute with the value(s) you supplied, using the comparison operator. For
     *        each <i>Expected</i> element, the result of the evaluation is either true or false.
     *        </p>
     *        <p>
     *        If you specify more than one element in the <i>Expected</i> map, then by default all of the conditions
     *        must evaluate to true. In other words, the conditions are ANDed together. (You can use the
     *        <i>ConditionalOperator</i> parameter to OR the conditions instead. If you do this, then at least one of
     *        the conditions must evaluate to true, rather than all of them.)
     *        </p>
     *        <p>
     *        If the <i>Expected</i> map evaluates to true, then the conditional operation succeeds; otherwise, it
     *        fails.
     *        </p>
     *        <p>
     *        <i>Expected</i> contains the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeValueList</i> - One or more values to evaluate against the supplied attribute. The number of
     *        values in the list depends on the <i>ComparisonOperator</i> being used.
     *        </p>
     *        <p>
     *        For type Number, value comparisons are numeric.
     *        </p>
     *        <p>
     *        String value comparisons for greater than, equals, or less than are based on ASCII character code values.
     *        For example, <code>a</code> is greater than <code>A</code>, and <code>a</code> is greater than
     *        <code>B</code>. For a list of code values, see <a
     *        href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *        >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *        </p>
     *        <p>
     *        For type Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ComparisonOperator</i> - A comparator for evaluating attributes in the <i>AttributeValueList</i>. When
     *        performing the comparison, DynamoDB uses strongly consistent reads.
     *        </p>
     *        <p>
     *        The following comparison operators are available:
     *        </p>
     *        <p>
     *        <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     *        </p>
     *        <p>
     *        The following are descriptions of each comparison operator.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EQ</code> : Equal. <code>EQ</code> is supported for all datatypes, including lists and maps.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number,
     *        Binary, String Set, Number Set, or Binary Set. If an item contains an <i>AttributeValue</i> element of a
     *        different type than the one provided in the request, the value does not match. For example,
     *        <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *        <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>NE</code> : Not equal. <code>NE</code> is supported for all datatypes, including lists and maps.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String, Number, Binary,
     *        String Set, Number Set, or Binary Set. If an item contains an <i>AttributeValue</i> of a different type
     *        than the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does
     *        not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *        <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>LE</code> : Less than or equal.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *        Binary (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the
     *        one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     *        <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     *        <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>LT</code> : Less than.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String, Number, or Binary
     *        (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one
     *        provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     *        <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     *        <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>GE</code> : Greater than or equal.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *        Binary (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the
     *        one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     *        <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     *        <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>GT</code> : Greater than.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *        Binary (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the
     *        one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     *        <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     *        <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>NOT_NULL</code> : The attribute exists. <code>NOT_NULL</code> is supported for all datatypes,
     *        including lists and maps.
     *        </p>
     *        <note>
     *        <p>
     *        This operator tests for the existence of an attribute, not its data type. If the data type of attribute "
     *        <code>a</code>" is null, and you evaluate it using <code>NOT_NULL</code>, the result is a Boolean
     *        <i>true</i>. This result is because the attribute "<code>a</code>" exists; its data type is not relevant
     *        to the <code>NOT_NULL</code> comparison operator.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>NULL</code> : The attribute does not exist. <code>NULL</code> is supported for all datatypes,
     *        including lists and maps.
     *        </p>
     *        <note>
     *        <p>
     *        This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute
     *        "<code>a</code>" is null, and you evaluate it using <code>NULL</code>, the result is a Boolean
     *        <i>false</i>. This is because the attribute "<code>a</code>" exists; its data type is not relevant to the
     *        <code>NULL</code> comparison operator.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>CONTAINS</code> : Checks for a subsequence, or value in a set.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *        Binary (not a set type). If the target attribute of the comparison is of type String, then the operator
     *        checks for a substring match. If the target attribute of the comparison is of type Binary, then the
     *        operator looks for a subsequence of the target that matches the input. If the target attribute of the
     *        comparison is a set ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the operator
     *        evaluates to true if it finds an exact match with any member of the set.
     *        </p>
     *        <p>
     *        CONTAINS is supported for lists: When evaluating "<code>a CONTAINS b</code>", "<code>a</code>
     *        " can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or absence of a value in a set.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *        Binary (not a set type). If the target attribute of the comparison is a String, then the operator checks
     *        for the absence of a substring match. If the target attribute of the comparison is Binary, then the
     *        operator checks for the absence of a subsequence of the target that matches the input. If the target
     *        attribute of the comparison is a set ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then
     *        the operator evaluates to true if it <i>does not</i> find an exact match with any member of the set.
     *        </p>
     *        <p>
     *        NOT_CONTAINS is supported for lists: When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>
     *        " can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BEGINS_WITH</code> : Checks for a prefix.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String or Binary (not a
     *        Number or a set type). The target attribute of the comparison must be of type String or Binary (not a
     *        Number or a set type).
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>IN</code> : Checks for matching elements within two sets.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain one or more <i>AttributeValue</i> elements of type String, Number,
     *        or Binary (not a set type). These attributes are compared against an existing set type attribute of an
     *        item. If any elements of the input set are present in the item attribute, the expression evaluates to
     *        true.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BETWEEN</code> : Greater than or equal to the first value, and less than or equal to the second
     *        value.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements of the same type, either String,
     *        Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or
     *        equal to, the first element and less than, or equal to, the second element. If an item contains an
     *        <i>AttributeValue</i> element of a different type than the one provided in the request, the value does not
     *        match. For example, <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>. Also,
     *        <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For usage examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>, see <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     *        >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <p>
     *        For backward compatibility with previous DynamoDB releases, the following parameters can be used instead
     *        of <i>AttributeValueList</i> and <i>ComparisonOperator</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Value</i> - A value for DynamoDB to compare with an attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Exists</i> - A Boolean value that causes DynamoDB to evaluate the value before attempting the
     *        conditional operation:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <i>Exists</i> is <code>true</code>, DynamoDB will check to see if that attribute value already exists
     *        in the table. If it is found, then the condition evaluates to true; otherwise the condition evaluate to
     *        false.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <i>Exists</i> is <code>false</code>, DynamoDB assumes that the attribute value does <i>not</i> exist in
     *        the table. If in fact the value does not exist, then the assumption is valid and the condition evaluates
     *        to true. If the value is found, despite the assumption that it does not exist, the condition evaluates to
     *        false.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note that the default value for <i>Exists</i> is <code>true</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The <i>Value</i> and <i>Exists</i> parameters are incompatible with <i>AttributeValueList</i> and
     *        <i>ComparisonOperator</i>. Note that if you use both sets of parameters at once, DynamoDB will return a
     *        <i>ValidationException</i> exception.
     */

    public void setExpected(java.util.Map<String, ExpectedAttributeValue> expected) {
        this.expected = expected;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ConditionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A map of attribute/condition pairs. <i>Expected</i> provides a conditional block for the <i>PutItem</i>
     * operation.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * <p>
     * Each element of <i>Expected</i> consists of an attribute name, a comparison operator, and one or more values.
     * DynamoDB compares the attribute with the value(s) you supplied, using the comparison operator. For each
     * <i>Expected</i> element, the result of the evaluation is either true or false.
     * </p>
     * <p>
     * If you specify more than one element in the <i>Expected</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together. (You can use the <i>ConditionalOperator</i>
     * parameter to OR the conditions instead. If you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.)
     * </p>
     * <p>
     * If the <i>Expected</i> map evaluates to true, then the conditional operation succeeds; otherwise, it fails.
     * </p>
     * <p>
     * <i>Expected</i> contains the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the supplied attribute. The number of values
     * in the list depends on the <i>ComparisonOperator</i> being used.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based on ASCII character code values. For
     * example, <code>a</code> is greater than <code>A</code>, and <code>a</code> is greater than <code>B</code>. For a
     * list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia
     * .org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes in the <i>AttributeValueList</i>. When
     * performing the comparison, DynamoDB uses strongly consistent reads.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * The following are descriptions of each comparison operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code> : Equal. <code>EQ</code> is supported for all datatypes, including lists and maps.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, Binary,
     * String Set, Number Set, or Binary Set. If an item contains an <i>AttributeValue</i> element of a different type
     * than the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not
     * equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>NE</code> : Not equal. <code>NE</code> is supported for all datatypes, including lists and maps.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an <i>AttributeValue</i> of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LE</code> : Less than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LT</code> : Less than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String, Number, or Binary (not a set
     * type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided in the
     * request, the value does not match. For example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GE</code> : Greater than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GT</code> : Greater than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>NOT_NULL</code> : The attribute exists. <code>NOT_NULL</code> is supported for all datatypes, including
     * lists and maps.
     * </p>
     * <note>
     * <p>
     * This operator tests for the existence of an attribute, not its data type. If the data type of attribute "
     * <code>a</code>" is null, and you evaluate it using <code>NOT_NULL</code>, the result is a Boolean <i>true</i>.
     * This result is because the attribute "<code>a</code>" exists; its data type is not relevant to the
     * <code>NOT_NULL</code> comparison operator.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>NULL</code> : The attribute does not exist. <code>NULL</code> is supported for all datatypes, including
     * lists and maps.
     * </p>
     * <note>
     * <p>
     * This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "
     * <code>a</code>" is null, and you evaluate it using <code>NULL</code>, the result is a Boolean <i>false</i>. This
     * is because the attribute "<code>a</code>" exists; its data type is not relevant to the <code>NULL</code>
     * comparison operator.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>CONTAINS</code> : Checks for a subsequence, or value in a set.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If the target attribute of the comparison is of type String, then the operator checks for a
     * substring match. If the target attribute of the comparison is of type Binary, then the operator looks for a
     * subsequence of the target that matches the input. If the target attribute of the comparison is a set ("
     * <code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates to true if it finds an
     * exact match with any member of the set.
     * </p>
     * <p>
     * CONTAINS is supported for lists: When evaluating "<code>a CONTAINS b</code>", "<code>a</code>
     * " can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or absence of a value in a set.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or Binary
     * (not a set type). If the target attribute of the comparison is a String, then the operator checks for the absence
     * of a substring match. If the target attribute of the comparison is Binary, then the operator checks for the
     * absence of a subsequence of the target that matches the input. If the target attribute of the comparison is a set
     * ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates to true if it <i>does
     * not</i> find an exact match with any member of the set.
     * </p>
     * <p>
     * NOT_CONTAINS is supported for lists: When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>
     * " can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code> : Checks for a prefix.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set type). The target attribute of the comparison must be of type String or Binary (not a Number or a set type).
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>IN</code> : Checks for matching elements within two sets.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain one or more <i>AttributeValue</i> elements of type String, Number, or
     * Binary (not a set type). These attributes are compared against an existing set type attribute of an item. If any
     * elements of the input set are present in the item attribute, the expression evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code> : Greater than or equal to the first value, and less than or equal to the second value.
     * </p>
     * <p>
     * <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements of the same type, either String,
     * Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or equal to,
     * the first element and less than, or equal to, the second element. If an item contains an <i>AttributeValue</i>
     * element of a different type than the one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For usage examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For backward compatibility with previous DynamoDB releases, the following parameters can be used instead of
     * <i>AttributeValueList</i> and <i>ComparisonOperator</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Value</i> - A value for DynamoDB to compare with an attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Exists</i> - A Boolean value that causes DynamoDB to evaluate the value before attempting the conditional
     * operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <i>Exists</i> is <code>true</code>, DynamoDB will check to see if that attribute value already exists in the
     * table. If it is found, then the condition evaluates to true; otherwise the condition evaluate to false.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <i>Exists</i> is <code>false</code>, DynamoDB assumes that the attribute value does <i>not</i> exist in the
     * table. If in fact the value does not exist, then the assumption is valid and the condition evaluates to true. If
     * the value is found, despite the assumption that it does not exist, the condition evaluates to false.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the default value for <i>Exists</i> is <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <i>Value</i> and <i>Exists</i> parameters are incompatible with <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>. Note that if you use both sets of parameters at once, DynamoDB will return a
     * <i>ValidationException</i> exception.
     * </p>
     * 
     * @param expected
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>ConditionExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A map of attribute/condition pairs. <i>Expected</i> provides a conditional block for the <i>PutItem</i>
     *        operation.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     *        </note>
     *        <p>
     *        Each element of <i>Expected</i> consists of an attribute name, a comparison operator, and one or more
     *        values. DynamoDB compares the attribute with the value(s) you supplied, using the comparison operator. For
     *        each <i>Expected</i> element, the result of the evaluation is either true or false.
     *        </p>
     *        <p>
     *        If you specify more than one element in the <i>Expected</i> map, then by default all of the conditions
     *        must evaluate to true. In other words, the conditions are ANDed together. (You can use the
     *        <i>ConditionalOperator</i> parameter to OR the conditions instead. If you do this, then at least one of
     *        the conditions must evaluate to true, rather than all of them.)
     *        </p>
     *        <p>
     *        If the <i>Expected</i> map evaluates to true, then the conditional operation succeeds; otherwise, it
     *        fails.
     *        </p>
     *        <p>
     *        <i>Expected</i> contains the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeValueList</i> - One or more values to evaluate against the supplied attribute. The number of
     *        values in the list depends on the <i>ComparisonOperator</i> being used.
     *        </p>
     *        <p>
     *        For type Number, value comparisons are numeric.
     *        </p>
     *        <p>
     *        String value comparisons for greater than, equals, or less than are based on ASCII character code values.
     *        For example, <code>a</code> is greater than <code>A</code>, and <code>a</code> is greater than
     *        <code>B</code>. For a list of code values, see <a
     *        href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *        >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *        </p>
     *        <p>
     *        For type Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ComparisonOperator</i> - A comparator for evaluating attributes in the <i>AttributeValueList</i>. When
     *        performing the comparison, DynamoDB uses strongly consistent reads.
     *        </p>
     *        <p>
     *        The following comparison operators are available:
     *        </p>
     *        <p>
     *        <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     *        </p>
     *        <p>
     *        The following are descriptions of each comparison operator.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EQ</code> : Equal. <code>EQ</code> is supported for all datatypes, including lists and maps.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number,
     *        Binary, String Set, Number Set, or Binary Set. If an item contains an <i>AttributeValue</i> element of a
     *        different type than the one provided in the request, the value does not match. For example,
     *        <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *        <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>NE</code> : Not equal. <code>NE</code> is supported for all datatypes, including lists and maps.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String, Number, Binary,
     *        String Set, Number Set, or Binary Set. If an item contains an <i>AttributeValue</i> of a different type
     *        than the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does
     *        not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *        <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>LE</code> : Less than or equal.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *        Binary (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the
     *        one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     *        <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     *        <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>LT</code> : Less than.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String, Number, or Binary
     *        (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the one
     *        provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     *        <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     *        <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>GE</code> : Greater than or equal.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *        Binary (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the
     *        one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     *        <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     *        <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>GT</code> : Greater than.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *        Binary (not a set type). If an item contains an <i>AttributeValue</i> element of a different type than the
     *        one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal
     *        <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     *        <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>NOT_NULL</code> : The attribute exists. <code>NOT_NULL</code> is supported for all datatypes,
     *        including lists and maps.
     *        </p>
     *        <note>
     *        <p>
     *        This operator tests for the existence of an attribute, not its data type. If the data type of attribute "
     *        <code>a</code>" is null, and you evaluate it using <code>NOT_NULL</code>, the result is a Boolean
     *        <i>true</i>. This result is because the attribute "<code>a</code>" exists; its data type is not relevant
     *        to the <code>NOT_NULL</code> comparison operator.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>NULL</code> : The attribute does not exist. <code>NULL</code> is supported for all datatypes,
     *        including lists and maps.
     *        </p>
     *        <note>
     *        <p>
     *        This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute
     *        "<code>a</code>" is null, and you evaluate it using <code>NULL</code>, the result is a Boolean
     *        <i>false</i>. This is because the attribute "<code>a</code>" exists; its data type is not relevant to the
     *        <code>NULL</code> comparison operator.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>CONTAINS</code> : Checks for a subsequence, or value in a set.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *        Binary (not a set type). If the target attribute of the comparison is of type String, then the operator
     *        checks for a substring match. If the target attribute of the comparison is of type Binary, then the
     *        operator looks for a subsequence of the target that matches the input. If the target attribute of the
     *        comparison is a set ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the operator
     *        evaluates to true if it finds an exact match with any member of the set.
     *        </p>
     *        <p>
     *        CONTAINS is supported for lists: When evaluating "<code>a CONTAINS b</code>", "<code>a</code>
     *        " can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or absence of a value in a set.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> element of type String, Number, or
     *        Binary (not a set type). If the target attribute of the comparison is a String, then the operator checks
     *        for the absence of a substring match. If the target attribute of the comparison is Binary, then the
     *        operator checks for the absence of a subsequence of the target that matches the input. If the target
     *        attribute of the comparison is a set ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then
     *        the operator evaluates to true if it <i>does not</i> find an exact match with any member of the set.
     *        </p>
     *        <p>
     *        NOT_CONTAINS is supported for lists: When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>
     *        " can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BEGINS_WITH</code> : Checks for a prefix.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of type String or Binary (not a
     *        Number or a set type). The target attribute of the comparison must be of type String or Binary (not a
     *        Number or a set type).
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>IN</code> : Checks for matching elements within two sets.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain one or more <i>AttributeValue</i> elements of type String, Number,
     *        or Binary (not a set type). These attributes are compared against an existing set type attribute of an
     *        item. If any elements of the input set are present in the item attribute, the expression evaluates to
     *        true.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BETWEEN</code> : Greater than or equal to the first value, and less than or equal to the second
     *        value.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements of the same type, either String,
     *        Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or
     *        equal to, the first element and less than, or equal to, the second element. If an item contains an
     *        <i>AttributeValue</i> element of a different type than the one provided in the request, the value does not
     *        match. For example, <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>. Also,
     *        <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For usage examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>, see <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     *        >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <p>
     *        For backward compatibility with previous DynamoDB releases, the following parameters can be used instead
     *        of <i>AttributeValueList</i> and <i>ComparisonOperator</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Value</i> - A value for DynamoDB to compare with an attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Exists</i> - A Boolean value that causes DynamoDB to evaluate the value before attempting the
     *        conditional operation:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <i>Exists</i> is <code>true</code>, DynamoDB will check to see if that attribute value already exists
     *        in the table. If it is found, then the condition evaluates to true; otherwise the condition evaluate to
     *        false.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <i>Exists</i> is <code>false</code>, DynamoDB assumes that the attribute value does <i>not</i> exist in
     *        the table. If in fact the value does not exist, then the assumption is valid and the condition evaluates
     *        to true. If the value is found, despite the assumption that it does not exist, the condition evaluates to
     *        false.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note that the default value for <i>Exists</i> is <code>true</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The <i>Value</i> and <i>Exists</i> parameters are incompatible with <i>AttributeValueList</i> and
     *        <i>ComparisonOperator</i>. Note that if you use both sets of parameters at once, DynamoDB will return a
     *        <i>ValidationException</i> exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutItemRequest withExpected(java.util.Map<String, ExpectedAttributeValue> expected) {
        setExpected(expected);
        return this;
    }

    public PutItemRequest addExpectedEntry(String key, ExpectedAttributeValue value) {
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

    public PutItemRequest clearExpectedEntries() {
        this.expected = null;
        return this;
    }

    /**
     * <p>
     * Use <i>ReturnValues</i> if you want to get the item attributes as they appeared before they were updated with the
     * <i>PutItem</i> request. For <i>PutItem</i>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then nothing
     * is returned. (This setting is the default for <i>ReturnValues</i>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute name-value pair, then the content of the old item
     * is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <i>ReturnValues</i> parameter is used by several DynamoDB operations; however, <i>PutItem</i> does not
     * recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * 
     * @param returnValues
     *        Use <i>ReturnValues</i> if you want to get the item attributes as they appeared before they were updated
     *        with the <i>PutItem</i> request. For <i>PutItem</i>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then
     *        nothing is returned. (This setting is the default for <i>ReturnValues</i>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute name-value pair, then the content of the
     *        old item is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <i>ReturnValues</i> parameter is used by several DynamoDB operations; however, <i>PutItem</i> does not
     *        recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     *        </p>
     * @see ReturnValue
     */

    public void setReturnValues(String returnValues) {
        this.returnValues = returnValues;
    }

    /**
     * <p>
     * Use <i>ReturnValues</i> if you want to get the item attributes as they appeared before they were updated with the
     * <i>PutItem</i> request. For <i>PutItem</i>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then nothing
     * is returned. (This setting is the default for <i>ReturnValues</i>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute name-value pair, then the content of the old item
     * is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <i>ReturnValues</i> parameter is used by several DynamoDB operations; however, <i>PutItem</i> does not
     * recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * 
     * @return Use <i>ReturnValues</i> if you want to get the item attributes as they appeared before they were updated
     *         with the <i>PutItem</i> request. For <i>PutItem</i>, the valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then
     *         nothing is returned. (This setting is the default for <i>ReturnValues</i>.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute name-value pair, then the content of the
     *         old item is returned.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The <i>ReturnValues</i> parameter is used by several DynamoDB operations; however, <i>PutItem</i> does
     *         not recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     *         </p>
     * @see ReturnValue
     */

    public String getReturnValues() {
        return this.returnValues;
    }

    /**
     * <p>
     * Use <i>ReturnValues</i> if you want to get the item attributes as they appeared before they were updated with the
     * <i>PutItem</i> request. For <i>PutItem</i>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then nothing
     * is returned. (This setting is the default for <i>ReturnValues</i>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute name-value pair, then the content of the old item
     * is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <i>ReturnValues</i> parameter is used by several DynamoDB operations; however, <i>PutItem</i> does not
     * recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * 
     * @param returnValues
     *        Use <i>ReturnValues</i> if you want to get the item attributes as they appeared before they were updated
     *        with the <i>PutItem</i> request. For <i>PutItem</i>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then
     *        nothing is returned. (This setting is the default for <i>ReturnValues</i>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute name-value pair, then the content of the
     *        old item is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <i>ReturnValues</i> parameter is used by several DynamoDB operations; however, <i>PutItem</i> does not
     *        recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnValue
     */

    public PutItemRequest withReturnValues(String returnValues) {
        setReturnValues(returnValues);
        return this;
    }

    /**
     * <p>
     * Use <i>ReturnValues</i> if you want to get the item attributes as they appeared before they were updated with the
     * <i>PutItem</i> request. For <i>PutItem</i>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then nothing
     * is returned. (This setting is the default for <i>ReturnValues</i>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute name-value pair, then the content of the old item
     * is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <i>ReturnValues</i> parameter is used by several DynamoDB operations; however, <i>PutItem</i> does not
     * recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * 
     * @param returnValues
     *        Use <i>ReturnValues</i> if you want to get the item attributes as they appeared before they were updated
     *        with the <i>PutItem</i> request. For <i>PutItem</i>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then
     *        nothing is returned. (This setting is the default for <i>ReturnValues</i>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute name-value pair, then the content of the
     *        old item is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <i>ReturnValues</i> parameter is used by several DynamoDB operations; however, <i>PutItem</i> does not
     *        recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     *        </p>
     * @see ReturnValue
     */

    public void setReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
    }

    /**
     * <p>
     * Use <i>ReturnValues</i> if you want to get the item attributes as they appeared before they were updated with the
     * <i>PutItem</i> request. For <i>PutItem</i>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then nothing
     * is returned. (This setting is the default for <i>ReturnValues</i>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute name-value pair, then the content of the old item
     * is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <i>ReturnValues</i> parameter is used by several DynamoDB operations; however, <i>PutItem</i> does not
     * recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * 
     * @param returnValues
     *        Use <i>ReturnValues</i> if you want to get the item attributes as they appeared before they were updated
     *        with the <i>PutItem</i> request. For <i>PutItem</i>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then
     *        nothing is returned. (This setting is the default for <i>ReturnValues</i>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute name-value pair, then the content of the
     *        old item is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <i>ReturnValues</i> parameter is used by several DynamoDB operations; however, <i>PutItem</i> does not
     *        recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnValue
     */

    public PutItemRequest withReturnValues(ReturnValue returnValues) {
        setReturnValues(returnValues);
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

    public PutItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        setReturnConsumedCapacity(returnConsumedCapacity);
        return this;
    }

    /**
     * @param returnConsumedCapacity
     * @see ReturnConsumedCapacity
     */

    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }

    /**
     * @param returnConsumedCapacity
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnConsumedCapacity
     */

    public PutItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        setReturnConsumedCapacity(returnConsumedCapacity);
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

    public PutItemRequest withReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
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
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
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

    public PutItemRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        setReturnItemCollectionMetrics(returnItemCollectionMetrics);
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ConditionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in the <i>Expected</i> map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true, then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * 
     * @param conditionalOperator
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>ConditionExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A logical operator to apply to the conditions in the <i>Expected</i> map:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AND</code> - If all of the conditions evaluate to true, then the entire map evaluates to true.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OR</code> - If at least one of the conditions evaluate to true, then the entire map evaluates to
     *        true.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the default.
     *        </p>
     *        <p>
     *        The operation will succeed only if the entire map evaluates to true.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     * @see ConditionalOperator
     */

    public void setConditionalOperator(String conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ConditionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in the <i>Expected</i> map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true, then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * 
     * @return <p>
     *         This is a legacy parameter, for backward compatibility. New applications should use
     *         <i>ConditionExpression</i> instead. Do not combine legacy parameters and expression parameters in a
     *         single API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *         </p>
     *         </important>
     *         <p>
     *         A logical operator to apply to the conditions in the <i>Expected</i> map:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AND</code> - If all of the conditions evaluate to true, then the entire map evaluates to true.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OR</code> - If at least one of the conditions evaluate to true, then the entire map evaluates to
     *         true.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the default.
     *         </p>
     *         <p>
     *         The operation will succeed only if the entire map evaluates to true.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter does not support attributes of type List or Map.
     *         </p>
     * @see ConditionalOperator
     */

    public String getConditionalOperator() {
        return this.conditionalOperator;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ConditionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in the <i>Expected</i> map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true, then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * 
     * @param conditionalOperator
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>ConditionExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A logical operator to apply to the conditions in the <i>Expected</i> map:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AND</code> - If all of the conditions evaluate to true, then the entire map evaluates to true.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OR</code> - If at least one of the conditions evaluate to true, then the entire map evaluates to
     *        true.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the default.
     *        </p>
     *        <p>
     *        The operation will succeed only if the entire map evaluates to true.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionalOperator
     */

    public PutItemRequest withConditionalOperator(String conditionalOperator) {
        setConditionalOperator(conditionalOperator);
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ConditionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in the <i>Expected</i> map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true, then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * 
     * @param conditionalOperator
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>ConditionExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A logical operator to apply to the conditions in the <i>Expected</i> map:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AND</code> - If all of the conditions evaluate to true, then the entire map evaluates to true.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OR</code> - If at least one of the conditions evaluate to true, then the entire map evaluates to
     *        true.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the default.
     *        </p>
     *        <p>
     *        The operation will succeed only if the entire map evaluates to true.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     * @see ConditionalOperator
     */

    public void setConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ConditionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in the <i>Expected</i> map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true, then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * 
     * @param conditionalOperator
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>ConditionExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A logical operator to apply to the conditions in the <i>Expected</i> map:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AND</code> - If all of the conditions evaluate to true, then the entire map evaluates to true.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OR</code> - If at least one of the conditions evaluate to true, then the entire map evaluates to
     *        true.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the default.
     *        </p>
     *        <p>
     *        The operation will succeed only if the entire map evaluates to true.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionalOperator
     */

    public PutItemRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        setConditionalOperator(conditionalOperator);
        return this;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional <i>PutItem</i> operation to succeed.
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
     * Comparison operators:
     * <code> = | &amp;#x3C;&amp;#x3E; | &amp;#x3C; | &amp;#x3E; | &amp;#x3C;= | &amp;#x3E;= | BETWEEN | IN</code>
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>ConditionExpression</i> replaces the legacy <i>ConditionalOperator</i> and <i>Expected</i> parameters.
     * </p>
     * </note>
     * 
     * @param conditionExpression
     *        A condition that must be satisfied in order for a conditional <i>PutItem</i> operation to succeed.</p>
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
     *        Comparison operators:
     *        <code> = | &amp;#x3C;&amp;#x3E; | &amp;#x3C; | &amp;#x3E; | &amp;#x3C;= | &amp;#x3E;= | BETWEEN | IN</code>
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
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *        >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <i>ConditionExpression</i> replaces the legacy <i>ConditionalOperator</i> and <i>Expected</i> parameters.
     *        </p>
     */

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional <i>PutItem</i> operation to succeed.
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
     * Comparison operators:
     * <code> = | &amp;#x3C;&amp;#x3E; | &amp;#x3C; | &amp;#x3E; | &amp;#x3C;= | &amp;#x3E;= | BETWEEN | IN</code>
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>ConditionExpression</i> replaces the legacy <i>ConditionalOperator</i> and <i>Expected</i> parameters.
     * </p>
     * </note>
     * 
     * @return A condition that must be satisfied in order for a conditional <i>PutItem</i> operation to succeed.</p>
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
     *         Comparison operators:
     *         <code> = | &amp;#x3C;&amp;#x3E; | &amp;#x3C; | &amp;#x3E; | &amp;#x3C;= | &amp;#x3E;= | BETWEEN | IN</code>
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
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *         >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         <i>ConditionExpression</i> replaces the legacy <i>ConditionalOperator</i> and <i>Expected</i> parameters.
     *         </p>
     */

    public String getConditionExpression() {
        return this.conditionExpression;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional <i>PutItem</i> operation to succeed.
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
     * Comparison operators:
     * <code> = | &amp;#x3C;&amp;#x3E; | &amp;#x3C; | &amp;#x3E; | &amp;#x3C;= | &amp;#x3E;= | BETWEEN | IN</code>
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>ConditionExpression</i> replaces the legacy <i>ConditionalOperator</i> and <i>Expected</i> parameters.
     * </p>
     * </note>
     * 
     * @param conditionExpression
     *        A condition that must be satisfied in order for a conditional <i>PutItem</i> operation to succeed.</p>
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
     *        Comparison operators:
     *        <code> = | &amp;#x3C;&amp;#x3E; | &amp;#x3C; | &amp;#x3E; | &amp;#x3C;= | &amp;#x3E;= | BETWEEN | IN</code>
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
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *        >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <i>ConditionExpression</i> replaces the legacy <i>ConditionalOperator</i> and <i>Expected</i> parameters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutItemRequest withConditionExpression(String conditionExpression) {
        setConditionExpression(conditionExpression);
        return this;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The following are some use cases for using
     * <i>ExpressionAttributeNames</i>:
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
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
     * For more information on expression attribute names, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return One or more substitution tokens for attribute names in an expression. The following are some use cases
     *         for using <i>ExpressionAttributeNames</i>:</p>
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
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     *         Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the
     *         following for <i>ExpressionAttributeNames</i>:
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
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *         >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public java.util.Map<String, String> getExpressionAttributeNames() {
        return expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The following are some use cases for using
     * <i>ExpressionAttributeNames</i>:
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
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
     * For more information on expression attribute names, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param expressionAttributeNames
     *        One or more substitution tokens for attribute names in an expression. The following are some use cases for
     *        using <i>ExpressionAttributeNames</i>:</p>
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
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     *        Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the
     *        following for <i>ExpressionAttributeNames</i>:
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
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The following are some use cases for using
     * <i>ExpressionAttributeNames</i>:
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
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
     * For more information on expression attribute names, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param expressionAttributeNames
     *        One or more substitution tokens for attribute names in an expression. The following are some use cases for
     *        using <i>ExpressionAttributeNames</i>:</p>
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
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     *        Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the
     *        following for <i>ExpressionAttributeNames</i>:
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
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutItemRequest withExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        setExpressionAttributeNames(expressionAttributeNames);
        return this;
    }

    public PutItemRequest addExpressionAttributeNamesEntry(String key, String value) {
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

    public PutItemRequest clearExpressionAttributeNamesEntries() {
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
     * You would first need to specify <i>ExpressionAttributeValues</i> as follows:
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
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
     *         You would first need to specify <i>ExpressionAttributeValues</i> as follows:
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
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
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
     * You would first need to specify <i>ExpressionAttributeValues</i> as follows:
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
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
     *        You would first need to specify <i>ExpressionAttributeValues</i> as follows:
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
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
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
     * You would first need to specify <i>ExpressionAttributeValues</i> as follows:
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
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
     *        You would first need to specify <i>ExpressionAttributeValues</i> as follows:
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
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *        >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutItemRequest withExpressionAttributeValues(java.util.Map<String, AttributeValue> expressionAttributeValues) {
        setExpressionAttributeValues(expressionAttributeValues);
        return this;
    }

    public PutItemRequest addExpressionAttributeValuesEntry(String key, AttributeValue value) {
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

    public PutItemRequest clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("TableName: " + getTableName() + ",");
        if (getItem() != null)
            sb.append("Item: " + getItem() + ",");
        if (getExpected() != null)
            sb.append("Expected: " + getExpected() + ",");
        if (getReturnValues() != null)
            sb.append("ReturnValues: " + getReturnValues() + ",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getReturnItemCollectionMetrics() != null)
            sb.append("ReturnItemCollectionMetrics: " + getReturnItemCollectionMetrics() + ",");
        if (getConditionalOperator() != null)
            sb.append("ConditionalOperator: " + getConditionalOperator() + ",");
        if (getConditionExpression() != null)
            sb.append("ConditionExpression: " + getConditionExpression() + ",");
        if (getExpressionAttributeNames() != null)
            sb.append("ExpressionAttributeNames: " + getExpressionAttributeNames() + ",");
        if (getExpressionAttributeValues() != null)
            sb.append("ExpressionAttributeValues: " + getExpressionAttributeValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutItemRequest == false)
            return false;
        PutItemRequest other = (PutItemRequest) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        if (other.getExpected() == null ^ this.getExpected() == null)
            return false;
        if (other.getExpected() != null && other.getExpected().equals(this.getExpected()) == false)
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
        if (other.getConditionalOperator() == null ^ this.getConditionalOperator() == null)
            return false;
        if (other.getConditionalOperator() != null && other.getConditionalOperator().equals(this.getConditionalOperator()) == false)
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
        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode + ((getExpected() == null) ? 0 : getExpected().hashCode());
        hashCode = prime * hashCode + ((getReturnValues() == null) ? 0 : getReturnValues().hashCode());
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode());
        hashCode = prime * hashCode + ((getReturnItemCollectionMetrics() == null) ? 0 : getReturnItemCollectionMetrics().hashCode());
        hashCode = prime * hashCode + ((getConditionalOperator() == null) ? 0 : getConditionalOperator().hashCode());
        hashCode = prime * hashCode + ((getConditionExpression() == null) ? 0 : getConditionExpression().hashCode());
        hashCode = prime * hashCode + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getExpressionAttributeValues() == null) ? 0 : getExpressionAttributeValues().hashCode());
        return hashCode;
    }

    @Override
    public PutItemRequest clone() {
        return (PutItemRequest) super.clone();
    }
}
