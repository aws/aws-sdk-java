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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#putItem(PutItemRequest) PutItem operation}.
 * <p>
 * Creates a new item, or replaces an old item with a new item. If an
 * item already exists in the specified table with the same primary key,
 * the new item completely replaces the existing item. You can perform a
 * conditional put (insert a new item if one with the specified primary
 * key doesn't exist), or replace an existing item if it has certain
 * attribute values.
 * </p>
 * <p>
 * In addition to putting an item, you can also return the item's
 * attribute values in the same operation, using the <i>ReturnValues</i>
 * parameter.
 * </p>
 * <p>
 * When you add an item, the primary key attribute(s) are the only
 * required attributes. Attribute values cannot be null. String and
 * binary type attributes must have lengths greater than zero. Set type
 * attributes cannot be empty. Requests with empty values will be
 * rejected with a <i>ValidationException</i> .
 * </p>
 * <p>
 * You can request that <i>PutItem</i> return either a copy of the old
 * item (before the update) or a copy of the new item (after the update).
 * For more information, see the <i>ReturnValues</i> description.
 * </p>
 * <p>
 * <b>NOTE:</b> To prevent a new item from replacing an existing item,
 * use a conditional put operation with ComparisonOperator set to NULL
 * for the primary key attribute, or attributes.
 * </p>
 * <p>
 * For more information about using this API, see
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"> Working with Items </a>
 * in the Amazon DynamoDB Developer Guide.
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#putItem(PutItemRequest)
 */
public class PutItemRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the table to contain the item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition. <p>For more information about primary keys, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     */
    private java.util.Map<String,AttributeValue> item;

    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>PutItem</i> operation. <p>Each element of <i>Expected</i>
     * consists of an attribute name, a comparison operator, and one or more
     * values. DynamoDB compares the attribute with the value(s) you
     * supplied, using the comparison operator. For each <i>Expected</i>
     * element, the result of the evaluation is either true or false. <p>If
     * you specify more than one element in the <i>Expected</i> map, then by
     * default all of the conditions must evaluate to true. In other words,
     * the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     * you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.) <p>If the <i>Expected</i> map
     * evaluates to true, then the conditional operation succeeds; otherwise,
     * it fails. <p>Each item in <i>Expected</i> represents an attribute name
     * for DynamoDB to check, along with an <i>AttributeValueList</i> and a
     * <i>ComparisonOperator</i>: <ul> <li> <p><i>AttributeValueList</i> -
     * One or more values to evaluate against the supplied attribute. The
     * number of values in the list depends on the <i>ComparisonOperator</i>
     * being used. <p>For type Number, value comparisons are numeric.
     * <p>String value comparisons for greater than, equals, or less than are
     * based on ASCII character code values. For example, <code>a</code> is
     * greater than <code>A</code>, and <code>aa</code> is greater than
     * <code>B</code>. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes in the <i>AttributeValueList</i>.
     * When performing the comparison, DynamoDB uses strongly consistent
     * reads. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     * or equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     * attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     * not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     * subsequence, or value in a set. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set). If the target attribute of the comparison is a
     * String, then the operation checks for a substring match. If the target
     * attribute of the comparison is Binary, then the operation looks for a
     * subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     * operation checks for a member of the set (not as a substring). </li>
     * <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     * subsequence, or absence of a value in a set.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If the target attribute of the comparison is a String, then the
     * operation checks for the absence of a substring match. If the target
     * attribute of the comparison is Binary, then the operation checks for
     * the absence of a subsequence of the target that matches the input. If
     * the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     * then the operation checks for the absence of a member of the set (not
     * as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     * checks for exact matches. <p><i>AttributeValueList</i> can contain
     * more than one <i>AttributeValue</i> of type String, Number, or Binary
     * (not a set). The target attribute of the comparison must be of the
     * same type and exact value to match. A String never matches a String
     * set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     * first value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a
     * set). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     * usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html#ConditionalExpressions">Conditional
     * Expressions</a> in the Amazon DynamoDB Developer Guide. <note> <p>For
     * backward compatibility with previous DynamoDB releases, the following
     * parameters can be used instead of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>: <ul> <li><p><i>Value</i> - A value for
     * DynamoDB to compare with an attribute.</li> <li><p><i>Exists</i> -
     * Causes DynamoDB to evaluate the value vefore attempting the
     * conditional operation: <ul> <li><p>If <i>Exists</i> is
     * <code>true</code>, DynamoDB will check to see if that attribute???
     * value already exists in the table. If it is found, then the condition
     * evaluates to true; otherwise the condition evaluate to false.</li>
     * <li><p>If <i>Exists</i> is <code>false</code>, DynamoDB assumes that
     * the attribute value does??? <i>not</i> exist in the table. If in fact
     * the value does not exist, then the??? assumption is valid and the
     * condition evaluates to true. If the value is found, despite the
     * assumption that it does not exist, the condition evaluates to
     * false.???</li> </ul> </li> </ul> <p>Even though DynamoDB continues to
     * accept the <i>Value</i> and <i>Exists</i> parameters, they are now
     * deprecated. We recommend that you use <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i> instead, since they allow you to constuct a
     * much wider range of conditions. <p>The <i>Value</i> and <i>Exists</i>
     * parameters are incompatible with <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>. If you attempt to use both sets of
     * parameters at once, DynamoDB will throw a <i>ValidationException</i>.
     * </note>
     */
    private java.util.Map<String,ExpectedAttributeValue> expected;

    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were updated with the <i>PutItem</i> request. For
     * <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     * If <i>ReturnValues</i> is not specified, or if its value is
     * <code>NONE</code>, then nothing is returned. (This is the default for
     * <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     * <i>PutItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     */
    private String returnValues;

    /**
     * If set to <code>TOTAL</code>, the response includes
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
     * If set to <code>SIZE</code>, statistics about item collections, if
     * any, that were modified during the operation are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are
     * returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     */
    private String returnItemCollectionMetrics;

    /**
     * A logical operator to apply to the conditions in the <i>Expected</i>
     * map: <ul> <li><p><code>AND</code> - If <i>all</i> of the conditions
     * evaluate to true, then the entire map evaluates to true.</li>
     * <li><p><code>OR</code> - If <i>at least one</i> of the conditions
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
     * Default constructor for a new PutItemRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PutItemRequest() {}
    
    /**
     * Constructs a new PutItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table to contain the item.
     * @param item A map of attribute name/value pairs, one for each
     * attribute. Only the primary key attributes are required; you can
     * optionally provide other attribute name-value pairs for the item.
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition. <p>For more information about
     * primary keys, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     */
    public PutItemRequest(String tableName, java.util.Map<String,AttributeValue> item) {
        setTableName(tableName);
        setItem(item);
    }

    /**
     * Constructs a new PutItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table to contain the item.
     * @param item A map of attribute name/value pairs, one for each
     * attribute. Only the primary key attributes are required; you can
     * optionally provide other attribute name-value pairs for the item.
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition. <p>For more information about
     * primary keys, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared before they were updated with the
     * <i>PutItem</i> request. For <i>PutItem</i>, the valid values are: <ul>
     * <li> <p><code>NONE</code> - If <i>ReturnValues</i> is not specified,
     * or if its value is <code>NONE</code>, then nothing is returned. (This
     * is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute
     * name-value pair, then the content of the old item is returned. </li>
     * </ul>
     */
    public PutItemRequest(String tableName, java.util.Map<String,AttributeValue> item, String returnValues) {
        setTableName(tableName);
        setItem(item);
        setReturnValues(returnValues);
    }

    /**
     * Constructs a new PutItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table to contain the item.
     * @param item A map of attribute name/value pairs, one for each
     * attribute. Only the primary key attributes are required; you can
     * optionally provide other attribute name-value pairs for the item.
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition. <p>For more information about
     * primary keys, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared before they were updated with the
     * <i>PutItem</i> request. For <i>PutItem</i>, the valid values are: <ul>
     * <li> <p><code>NONE</code> - If <i>ReturnValues</i> is not specified,
     * or if its value is <code>NONE</code>, then nothing is returned. (This
     * is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute
     * name-value pair, then the content of the old item is returned. </li>
     * </ul>
     */
    public PutItemRequest(String tableName, java.util.Map<String,AttributeValue> item, ReturnValue returnValues) {
        this.tableName = tableName;
        this.item = item;
        this.returnValues = returnValues.toString();
    }

    /**
     * The name of the table to contain the item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table to contain the item.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table to contain the item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table to contain the item.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table to contain the item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table to contain the item.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutItemRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition. <p>For more information about primary keys, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     *
     * @return A map of attribute name/value pairs, one for each attribute. Only the
     *         primary key attributes are required; you can optionally provide other
     *         attribute name-value pairs for the item. <p>If you specify any
     *         attributes that are part of an index key, then the data types for
     *         those attributes must match those of the schema in the table's
     *         attribute definition. <p>For more information about primary keys, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     *         Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     *         <i>Item</i> map is an <i>AttributeValue</i> object.
     */
    public java.util.Map<String,AttributeValue> getItem() {
        
        return item;
    }
    
    /**
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition. <p>For more information about primary keys, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     *
     * @param item A map of attribute name/value pairs, one for each attribute. Only the
     *         primary key attributes are required; you can optionally provide other
     *         attribute name-value pairs for the item. <p>If you specify any
     *         attributes that are part of an index key, then the data types for
     *         those attributes must match those of the schema in the table's
     *         attribute definition. <p>For more information about primary keys, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     *         Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     *         <i>Item</i> map is an <i>AttributeValue</i> object.
     */
    public void setItem(java.util.Map<String,AttributeValue> item) {
        this.item = item;
    }
    
    /**
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition. <p>For more information about primary keys, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param item A map of attribute name/value pairs, one for each attribute. Only the
     *         primary key attributes are required; you can optionally provide other
     *         attribute name-value pairs for the item. <p>If you specify any
     *         attributes that are part of an index key, then the data types for
     *         those attributes must match those of the schema in the table's
     *         attribute definition. <p>For more information about primary keys, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     *         Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     *         <i>Item</i> map is an <i>AttributeValue</i> object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutItemRequest withItem(java.util.Map<String,AttributeValue> item) {
        setItem(item);
        return this;
    }

    /**
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition. <p>For more information about primary keys, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     * <p>
     * The method adds a new key-value pair into Item parameter, and returns
     * a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Item.
     * @param value The corresponding value of the entry to be added into Item.
     */
    public PutItemRequest addItemEntry(String key, AttributeValue value) {
        if (null == this.item) {
            this.item = new java.util.HashMap<String,AttributeValue>();
        }
        if (this.item.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.item.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public PutItemRequest clearItemEntries() {
        this.item = null;
        return this;
    }
    
    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>PutItem</i> operation. <p>Each element of <i>Expected</i>
     * consists of an attribute name, a comparison operator, and one or more
     * values. DynamoDB compares the attribute with the value(s) you
     * supplied, using the comparison operator. For each <i>Expected</i>
     * element, the result of the evaluation is either true or false. <p>If
     * you specify more than one element in the <i>Expected</i> map, then by
     * default all of the conditions must evaluate to true. In other words,
     * the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     * you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.) <p>If the <i>Expected</i> map
     * evaluates to true, then the conditional operation succeeds; otherwise,
     * it fails. <p>Each item in <i>Expected</i> represents an attribute name
     * for DynamoDB to check, along with an <i>AttributeValueList</i> and a
     * <i>ComparisonOperator</i>: <ul> <li> <p><i>AttributeValueList</i> -
     * One or more values to evaluate against the supplied attribute. The
     * number of values in the list depends on the <i>ComparisonOperator</i>
     * being used. <p>For type Number, value comparisons are numeric.
     * <p>String value comparisons for greater than, equals, or less than are
     * based on ASCII character code values. For example, <code>a</code> is
     * greater than <code>A</code>, and <code>aa</code> is greater than
     * <code>B</code>. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes in the <i>AttributeValueList</i>.
     * When performing the comparison, DynamoDB uses strongly consistent
     * reads. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     * or equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     * attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     * not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     * subsequence, or value in a set. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set). If the target attribute of the comparison is a
     * String, then the operation checks for a substring match. If the target
     * attribute of the comparison is Binary, then the operation looks for a
     * subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     * operation checks for a member of the set (not as a substring). </li>
     * <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     * subsequence, or absence of a value in a set.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If the target attribute of the comparison is a String, then the
     * operation checks for the absence of a substring match. If the target
     * attribute of the comparison is Binary, then the operation checks for
     * the absence of a subsequence of the target that matches the input. If
     * the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     * then the operation checks for the absence of a member of the set (not
     * as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     * checks for exact matches. <p><i>AttributeValueList</i> can contain
     * more than one <i>AttributeValue</i> of type String, Number, or Binary
     * (not a set). The target attribute of the comparison must be of the
     * same type and exact value to match. A String never matches a String
     * set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     * first value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a
     * set). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     * usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html#ConditionalExpressions">Conditional
     * Expressions</a> in the Amazon DynamoDB Developer Guide. <note> <p>For
     * backward compatibility with previous DynamoDB releases, the following
     * parameters can be used instead of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>: <ul> <li><p><i>Value</i> - A value for
     * DynamoDB to compare with an attribute.</li> <li><p><i>Exists</i> -
     * Causes DynamoDB to evaluate the value vefore attempting the
     * conditional operation: <ul> <li><p>If <i>Exists</i> is
     * <code>true</code>, DynamoDB will check to see if that attribute???
     * value already exists in the table. If it is found, then the condition
     * evaluates to true; otherwise the condition evaluate to false.</li>
     * <li><p>If <i>Exists</i> is <code>false</code>, DynamoDB assumes that
     * the attribute value does??? <i>not</i> exist in the table. If in fact
     * the value does not exist, then the??? assumption is valid and the
     * condition evaluates to true. If the value is found, despite the
     * assumption that it does not exist, the condition evaluates to
     * false.???</li> </ul> </li> </ul> <p>Even though DynamoDB continues to
     * accept the <i>Value</i> and <i>Exists</i> parameters, they are now
     * deprecated. We recommend that you use <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i> instead, since they allow you to constuct a
     * much wider range of conditions. <p>The <i>Value</i> and <i>Exists</i>
     * parameters are incompatible with <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>. If you attempt to use both sets of
     * parameters at once, DynamoDB will throw a <i>ValidationException</i>.
     * </note>
     *
     * @return A map of attribute/condition pairs. This is the conditional block for
     *         the <i>PutItem</i> operation. <p>Each element of <i>Expected</i>
     *         consists of an attribute name, a comparison operator, and one or more
     *         values. DynamoDB compares the attribute with the value(s) you
     *         supplied, using the comparison operator. For each <i>Expected</i>
     *         element, the result of the evaluation is either true or false. <p>If
     *         you specify more than one element in the <i>Expected</i> map, then by
     *         default all of the conditions must evaluate to true. In other words,
     *         the conditions are ANDed together. (You can use the
     *         <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     *         you do this, then at least one of the conditions must evaluate to
     *         true, rather than all of them.) <p>If the <i>Expected</i> map
     *         evaluates to true, then the conditional operation succeeds; otherwise,
     *         it fails. <p>Each item in <i>Expected</i> represents an attribute name
     *         for DynamoDB to check, along with an <i>AttributeValueList</i> and a
     *         <i>ComparisonOperator</i>: <ul> <li> <p><i>AttributeValueList</i> -
     *         One or more values to evaluate against the supplied attribute. The
     *         number of values in the list depends on the <i>ComparisonOperator</i>
     *         being used. <p>For type Number, value comparisons are numeric.
     *         <p>String value comparisons for greater than, equals, or less than are
     *         based on ASCII character code values. For example, <code>a</code> is
     *         greater than <code>A</code>, and <code>aa</code> is greater than
     *         <code>B</code>. For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     *         comparator for evaluating attributes in the <i>AttributeValueList</i>.
     *         When performing the comparison, DynamoDB uses strongly consistent
     *         reads. <p>The following comparison operators are available:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     *         descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     *         : Equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     *         or equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     *         attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     *         not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     *         subsequence, or value in a set. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> of type String, Number, or
     *         Binary (not a set). If the target attribute of the comparison is a
     *         String, then the operation checks for a substring match. If the target
     *         attribute of the comparison is Binary, then the operation looks for a
     *         subsequence of the target that matches the input. If the target
     *         attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     *         operation checks for a member of the set (not as a substring). </li>
     *         <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     *         subsequence, or absence of a value in a set.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If the target attribute of the comparison is a String, then the
     *         operation checks for the absence of a substring match. If the target
     *         attribute of the comparison is Binary, then the operation checks for
     *         the absence of a subsequence of the target that matches the input. If
     *         the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     *         then the operation checks for the absence of a member of the set (not
     *         as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     *         prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set). The target attribute of the comparison must be a String or
     *         Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     *         checks for exact matches. <p><i>AttributeValueList</i> can contain
     *         more than one <i>AttributeValue</i> of type String, Number, or Binary
     *         (not a set). The target attribute of the comparison must be of the
     *         same type and exact value to match. A String never matches a String
     *         set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     *         first value, and less than or equal to the second value.
     *         <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *         elements of the same type, either String, Number, or Binary (not a
     *         set). A target attribute matches if the target value is greater than,
     *         or equal to, the first element and less than, or equal to, the second
     *         element. If an item contains an <i>AttributeValue</i> of a different
     *         type than the one specified in the request, the value does not match.
     *         For example, <code>{"S":"6"}</code> does not compare to
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     *         usage examples of <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html#ConditionalExpressions">Conditional
     *         Expressions</a> in the Amazon DynamoDB Developer Guide. <note> <p>For
     *         backward compatibility with previous DynamoDB releases, the following
     *         parameters can be used instead of <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>: <ul> <li><p><i>Value</i> - A value for
     *         DynamoDB to compare with an attribute.</li> <li><p><i>Exists</i> -
     *         Causes DynamoDB to evaluate the value vefore attempting the
     *         conditional operation: <ul> <li><p>If <i>Exists</i> is
     *         <code>true</code>, DynamoDB will check to see if that attribute???
     *         value already exists in the table. If it is found, then the condition
     *         evaluates to true; otherwise the condition evaluate to false.</li>
     *         <li><p>If <i>Exists</i> is <code>false</code>, DynamoDB assumes that
     *         the attribute value does??? <i>not</i> exist in the table. If in fact
     *         the value does not exist, then the??? assumption is valid and the
     *         condition evaluates to true. If the value is found, despite the
     *         assumption that it does not exist, the condition evaluates to
     *         false.???</li> </ul> </li> </ul> <p>Even though DynamoDB continues to
     *         accept the <i>Value</i> and <i>Exists</i> parameters, they are now
     *         deprecated. We recommend that you use <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i> instead, since they allow you to constuct a
     *         much wider range of conditions. <p>The <i>Value</i> and <i>Exists</i>
     *         parameters are incompatible with <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>. If you attempt to use both sets of
     *         parameters at once, DynamoDB will throw a <i>ValidationException</i>.
     *         </note>
     */
    public java.util.Map<String,ExpectedAttributeValue> getExpected() {
        
        return expected;
    }
    
    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>PutItem</i> operation. <p>Each element of <i>Expected</i>
     * consists of an attribute name, a comparison operator, and one or more
     * values. DynamoDB compares the attribute with the value(s) you
     * supplied, using the comparison operator. For each <i>Expected</i>
     * element, the result of the evaluation is either true or false. <p>If
     * you specify more than one element in the <i>Expected</i> map, then by
     * default all of the conditions must evaluate to true. In other words,
     * the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     * you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.) <p>If the <i>Expected</i> map
     * evaluates to true, then the conditional operation succeeds; otherwise,
     * it fails. <p>Each item in <i>Expected</i> represents an attribute name
     * for DynamoDB to check, along with an <i>AttributeValueList</i> and a
     * <i>ComparisonOperator</i>: <ul> <li> <p><i>AttributeValueList</i> -
     * One or more values to evaluate against the supplied attribute. The
     * number of values in the list depends on the <i>ComparisonOperator</i>
     * being used. <p>For type Number, value comparisons are numeric.
     * <p>String value comparisons for greater than, equals, or less than are
     * based on ASCII character code values. For example, <code>a</code> is
     * greater than <code>A</code>, and <code>aa</code> is greater than
     * <code>B</code>. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes in the <i>AttributeValueList</i>.
     * When performing the comparison, DynamoDB uses strongly consistent
     * reads. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     * or equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     * attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     * not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     * subsequence, or value in a set. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set). If the target attribute of the comparison is a
     * String, then the operation checks for a substring match. If the target
     * attribute of the comparison is Binary, then the operation looks for a
     * subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     * operation checks for a member of the set (not as a substring). </li>
     * <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     * subsequence, or absence of a value in a set.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If the target attribute of the comparison is a String, then the
     * operation checks for the absence of a substring match. If the target
     * attribute of the comparison is Binary, then the operation checks for
     * the absence of a subsequence of the target that matches the input. If
     * the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     * then the operation checks for the absence of a member of the set (not
     * as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     * checks for exact matches. <p><i>AttributeValueList</i> can contain
     * more than one <i>AttributeValue</i> of type String, Number, or Binary
     * (not a set). The target attribute of the comparison must be of the
     * same type and exact value to match. A String never matches a String
     * set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     * first value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a
     * set). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     * usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html#ConditionalExpressions">Conditional
     * Expressions</a> in the Amazon DynamoDB Developer Guide. <note> <p>For
     * backward compatibility with previous DynamoDB releases, the following
     * parameters can be used instead of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>: <ul> <li><p><i>Value</i> - A value for
     * DynamoDB to compare with an attribute.</li> <li><p><i>Exists</i> -
     * Causes DynamoDB to evaluate the value vefore attempting the
     * conditional operation: <ul> <li><p>If <i>Exists</i> is
     * <code>true</code>, DynamoDB will check to see if that attribute???
     * value already exists in the table. If it is found, then the condition
     * evaluates to true; otherwise the condition evaluate to false.</li>
     * <li><p>If <i>Exists</i> is <code>false</code>, DynamoDB assumes that
     * the attribute value does??? <i>not</i> exist in the table. If in fact
     * the value does not exist, then the??? assumption is valid and the
     * condition evaluates to true. If the value is found, despite the
     * assumption that it does not exist, the condition evaluates to
     * false.???</li> </ul> </li> </ul> <p>Even though DynamoDB continues to
     * accept the <i>Value</i> and <i>Exists</i> parameters, they are now
     * deprecated. We recommend that you use <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i> instead, since they allow you to constuct a
     * much wider range of conditions. <p>The <i>Value</i> and <i>Exists</i>
     * parameters are incompatible with <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>. If you attempt to use both sets of
     * parameters at once, DynamoDB will throw a <i>ValidationException</i>.
     * </note>
     *
     * @param expected A map of attribute/condition pairs. This is the conditional block for
     *         the <i>PutItem</i> operation. <p>Each element of <i>Expected</i>
     *         consists of an attribute name, a comparison operator, and one or more
     *         values. DynamoDB compares the attribute with the value(s) you
     *         supplied, using the comparison operator. For each <i>Expected</i>
     *         element, the result of the evaluation is either true or false. <p>If
     *         you specify more than one element in the <i>Expected</i> map, then by
     *         default all of the conditions must evaluate to true. In other words,
     *         the conditions are ANDed together. (You can use the
     *         <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     *         you do this, then at least one of the conditions must evaluate to
     *         true, rather than all of them.) <p>If the <i>Expected</i> map
     *         evaluates to true, then the conditional operation succeeds; otherwise,
     *         it fails. <p>Each item in <i>Expected</i> represents an attribute name
     *         for DynamoDB to check, along with an <i>AttributeValueList</i> and a
     *         <i>ComparisonOperator</i>: <ul> <li> <p><i>AttributeValueList</i> -
     *         One or more values to evaluate against the supplied attribute. The
     *         number of values in the list depends on the <i>ComparisonOperator</i>
     *         being used. <p>For type Number, value comparisons are numeric.
     *         <p>String value comparisons for greater than, equals, or less than are
     *         based on ASCII character code values. For example, <code>a</code> is
     *         greater than <code>A</code>, and <code>aa</code> is greater than
     *         <code>B</code>. For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     *         comparator for evaluating attributes in the <i>AttributeValueList</i>.
     *         When performing the comparison, DynamoDB uses strongly consistent
     *         reads. <p>The following comparison operators are available:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     *         descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     *         : Equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     *         or equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     *         attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     *         not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     *         subsequence, or value in a set. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> of type String, Number, or
     *         Binary (not a set). If the target attribute of the comparison is a
     *         String, then the operation checks for a substring match. If the target
     *         attribute of the comparison is Binary, then the operation looks for a
     *         subsequence of the target that matches the input. If the target
     *         attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     *         operation checks for a member of the set (not as a substring). </li>
     *         <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     *         subsequence, or absence of a value in a set.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If the target attribute of the comparison is a String, then the
     *         operation checks for the absence of a substring match. If the target
     *         attribute of the comparison is Binary, then the operation checks for
     *         the absence of a subsequence of the target that matches the input. If
     *         the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     *         then the operation checks for the absence of a member of the set (not
     *         as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     *         prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set). The target attribute of the comparison must be a String or
     *         Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     *         checks for exact matches. <p><i>AttributeValueList</i> can contain
     *         more than one <i>AttributeValue</i> of type String, Number, or Binary
     *         (not a set). The target attribute of the comparison must be of the
     *         same type and exact value to match. A String never matches a String
     *         set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     *         first value, and less than or equal to the second value.
     *         <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *         elements of the same type, either String, Number, or Binary (not a
     *         set). A target attribute matches if the target value is greater than,
     *         or equal to, the first element and less than, or equal to, the second
     *         element. If an item contains an <i>AttributeValue</i> of a different
     *         type than the one specified in the request, the value does not match.
     *         For example, <code>{"S":"6"}</code> does not compare to
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     *         usage examples of <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html#ConditionalExpressions">Conditional
     *         Expressions</a> in the Amazon DynamoDB Developer Guide. <note> <p>For
     *         backward compatibility with previous DynamoDB releases, the following
     *         parameters can be used instead of <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>: <ul> <li><p><i>Value</i> - A value for
     *         DynamoDB to compare with an attribute.</li> <li><p><i>Exists</i> -
     *         Causes DynamoDB to evaluate the value vefore attempting the
     *         conditional operation: <ul> <li><p>If <i>Exists</i> is
     *         <code>true</code>, DynamoDB will check to see if that attribute???
     *         value already exists in the table. If it is found, then the condition
     *         evaluates to true; otherwise the condition evaluate to false.</li>
     *         <li><p>If <i>Exists</i> is <code>false</code>, DynamoDB assumes that
     *         the attribute value does??? <i>not</i> exist in the table. If in fact
     *         the value does not exist, then the??? assumption is valid and the
     *         condition evaluates to true. If the value is found, despite the
     *         assumption that it does not exist, the condition evaluates to
     *         false.???</li> </ul> </li> </ul> <p>Even though DynamoDB continues to
     *         accept the <i>Value</i> and <i>Exists</i> parameters, they are now
     *         deprecated. We recommend that you use <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i> instead, since they allow you to constuct a
     *         much wider range of conditions. <p>The <i>Value</i> and <i>Exists</i>
     *         parameters are incompatible with <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>. If you attempt to use both sets of
     *         parameters at once, DynamoDB will throw a <i>ValidationException</i>.
     *         </note>
     */
    public void setExpected(java.util.Map<String,ExpectedAttributeValue> expected) {
        this.expected = expected;
    }
    
    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>PutItem</i> operation. <p>Each element of <i>Expected</i>
     * consists of an attribute name, a comparison operator, and one or more
     * values. DynamoDB compares the attribute with the value(s) you
     * supplied, using the comparison operator. For each <i>Expected</i>
     * element, the result of the evaluation is either true or false. <p>If
     * you specify more than one element in the <i>Expected</i> map, then by
     * default all of the conditions must evaluate to true. In other words,
     * the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     * you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.) <p>If the <i>Expected</i> map
     * evaluates to true, then the conditional operation succeeds; otherwise,
     * it fails. <p>Each item in <i>Expected</i> represents an attribute name
     * for DynamoDB to check, along with an <i>AttributeValueList</i> and a
     * <i>ComparisonOperator</i>: <ul> <li> <p><i>AttributeValueList</i> -
     * One or more values to evaluate against the supplied attribute. The
     * number of values in the list depends on the <i>ComparisonOperator</i>
     * being used. <p>For type Number, value comparisons are numeric.
     * <p>String value comparisons for greater than, equals, or less than are
     * based on ASCII character code values. For example, <code>a</code> is
     * greater than <code>A</code>, and <code>aa</code> is greater than
     * <code>B</code>. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes in the <i>AttributeValueList</i>.
     * When performing the comparison, DynamoDB uses strongly consistent
     * reads. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     * or equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     * attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     * not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     * subsequence, or value in a set. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set). If the target attribute of the comparison is a
     * String, then the operation checks for a substring match. If the target
     * attribute of the comparison is Binary, then the operation looks for a
     * subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     * operation checks for a member of the set (not as a substring). </li>
     * <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     * subsequence, or absence of a value in a set.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If the target attribute of the comparison is a String, then the
     * operation checks for the absence of a substring match. If the target
     * attribute of the comparison is Binary, then the operation checks for
     * the absence of a subsequence of the target that matches the input. If
     * the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     * then the operation checks for the absence of a member of the set (not
     * as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     * checks for exact matches. <p><i>AttributeValueList</i> can contain
     * more than one <i>AttributeValue</i> of type String, Number, or Binary
     * (not a set). The target attribute of the comparison must be of the
     * same type and exact value to match. A String never matches a String
     * set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     * first value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a
     * set). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     * usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html#ConditionalExpressions">Conditional
     * Expressions</a> in the Amazon DynamoDB Developer Guide. <note> <p>For
     * backward compatibility with previous DynamoDB releases, the following
     * parameters can be used instead of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>: <ul> <li><p><i>Value</i> - A value for
     * DynamoDB to compare with an attribute.</li> <li><p><i>Exists</i> -
     * Causes DynamoDB to evaluate the value vefore attempting the
     * conditional operation: <ul> <li><p>If <i>Exists</i> is
     * <code>true</code>, DynamoDB will check to see if that attribute???
     * value already exists in the table. If it is found, then the condition
     * evaluates to true; otherwise the condition evaluate to false.</li>
     * <li><p>If <i>Exists</i> is <code>false</code>, DynamoDB assumes that
     * the attribute value does??? <i>not</i> exist in the table. If in fact
     * the value does not exist, then the??? assumption is valid and the
     * condition evaluates to true. If the value is found, despite the
     * assumption that it does not exist, the condition evaluates to
     * false.???</li> </ul> </li> </ul> <p>Even though DynamoDB continues to
     * accept the <i>Value</i> and <i>Exists</i> parameters, they are now
     * deprecated. We recommend that you use <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i> instead, since they allow you to constuct a
     * much wider range of conditions. <p>The <i>Value</i> and <i>Exists</i>
     * parameters are incompatible with <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>. If you attempt to use both sets of
     * parameters at once, DynamoDB will throw a <i>ValidationException</i>.
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expected A map of attribute/condition pairs. This is the conditional block for
     *         the <i>PutItem</i> operation. <p>Each element of <i>Expected</i>
     *         consists of an attribute name, a comparison operator, and one or more
     *         values. DynamoDB compares the attribute with the value(s) you
     *         supplied, using the comparison operator. For each <i>Expected</i>
     *         element, the result of the evaluation is either true or false. <p>If
     *         you specify more than one element in the <i>Expected</i> map, then by
     *         default all of the conditions must evaluate to true. In other words,
     *         the conditions are ANDed together. (You can use the
     *         <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     *         you do this, then at least one of the conditions must evaluate to
     *         true, rather than all of them.) <p>If the <i>Expected</i> map
     *         evaluates to true, then the conditional operation succeeds; otherwise,
     *         it fails. <p>Each item in <i>Expected</i> represents an attribute name
     *         for DynamoDB to check, along with an <i>AttributeValueList</i> and a
     *         <i>ComparisonOperator</i>: <ul> <li> <p><i>AttributeValueList</i> -
     *         One or more values to evaluate against the supplied attribute. The
     *         number of values in the list depends on the <i>ComparisonOperator</i>
     *         being used. <p>For type Number, value comparisons are numeric.
     *         <p>String value comparisons for greater than, equals, or less than are
     *         based on ASCII character code values. For example, <code>a</code> is
     *         greater than <code>A</code>, and <code>aa</code> is greater than
     *         <code>B</code>. For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     *         comparator for evaluating attributes in the <i>AttributeValueList</i>.
     *         When performing the comparison, DynamoDB uses strongly consistent
     *         reads. <p>The following comparison operators are available:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     *         descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     *         : Equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     *         or equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     *         attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     *         not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     *         subsequence, or value in a set. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> of type String, Number, or
     *         Binary (not a set). If the target attribute of the comparison is a
     *         String, then the operation checks for a substring match. If the target
     *         attribute of the comparison is Binary, then the operation looks for a
     *         subsequence of the target that matches the input. If the target
     *         attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     *         operation checks for a member of the set (not as a substring). </li>
     *         <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     *         subsequence, or absence of a value in a set.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If the target attribute of the comparison is a String, then the
     *         operation checks for the absence of a substring match. If the target
     *         attribute of the comparison is Binary, then the operation checks for
     *         the absence of a subsequence of the target that matches the input. If
     *         the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     *         then the operation checks for the absence of a member of the set (not
     *         as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     *         prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set). The target attribute of the comparison must be a String or
     *         Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     *         checks for exact matches. <p><i>AttributeValueList</i> can contain
     *         more than one <i>AttributeValue</i> of type String, Number, or Binary
     *         (not a set). The target attribute of the comparison must be of the
     *         same type and exact value to match. A String never matches a String
     *         set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     *         first value, and less than or equal to the second value.
     *         <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *         elements of the same type, either String, Number, or Binary (not a
     *         set). A target attribute matches if the target value is greater than,
     *         or equal to, the first element and less than, or equal to, the second
     *         element. If an item contains an <i>AttributeValue</i> of a different
     *         type than the one specified in the request, the value does not match.
     *         For example, <code>{"S":"6"}</code> does not compare to
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     *         usage examples of <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html#ConditionalExpressions">Conditional
     *         Expressions</a> in the Amazon DynamoDB Developer Guide. <note> <p>For
     *         backward compatibility with previous DynamoDB releases, the following
     *         parameters can be used instead of <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>: <ul> <li><p><i>Value</i> - A value for
     *         DynamoDB to compare with an attribute.</li> <li><p><i>Exists</i> -
     *         Causes DynamoDB to evaluate the value vefore attempting the
     *         conditional operation: <ul> <li><p>If <i>Exists</i> is
     *         <code>true</code>, DynamoDB will check to see if that attribute???
     *         value already exists in the table. If it is found, then the condition
     *         evaluates to true; otherwise the condition evaluate to false.</li>
     *         <li><p>If <i>Exists</i> is <code>false</code>, DynamoDB assumes that
     *         the attribute value does??? <i>not</i> exist in the table. If in fact
     *         the value does not exist, then the??? assumption is valid and the
     *         condition evaluates to true. If the value is found, despite the
     *         assumption that it does not exist, the condition evaluates to
     *         false.???</li> </ul> </li> </ul> <p>Even though DynamoDB continues to
     *         accept the <i>Value</i> and <i>Exists</i> parameters, they are now
     *         deprecated. We recommend that you use <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i> instead, since they allow you to constuct a
     *         much wider range of conditions. <p>The <i>Value</i> and <i>Exists</i>
     *         parameters are incompatible with <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>. If you attempt to use both sets of
     *         parameters at once, DynamoDB will throw a <i>ValidationException</i>.
     *         </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutItemRequest withExpected(java.util.Map<String,ExpectedAttributeValue> expected) {
        setExpected(expected);
        return this;
    }

    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>PutItem</i> operation. <p>Each element of <i>Expected</i>
     * consists of an attribute name, a comparison operator, and one or more
     * values. DynamoDB compares the attribute with the value(s) you
     * supplied, using the comparison operator. For each <i>Expected</i>
     * element, the result of the evaluation is either true or false. <p>If
     * you specify more than one element in the <i>Expected</i> map, then by
     * default all of the conditions must evaluate to true. In other words,
     * the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     * you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.) <p>If the <i>Expected</i> map
     * evaluates to true, then the conditional operation succeeds; otherwise,
     * it fails. <p>Each item in <i>Expected</i> represents an attribute name
     * for DynamoDB to check, along with an <i>AttributeValueList</i> and a
     * <i>ComparisonOperator</i>: <ul> <li> <p><i>AttributeValueList</i> -
     * One or more values to evaluate against the supplied attribute. The
     * number of values in the list depends on the <i>ComparisonOperator</i>
     * being used. <p>For type Number, value comparisons are numeric.
     * <p>String value comparisons for greater than, equals, or less than are
     * based on ASCII character code values. For example, <code>a</code> is
     * greater than <code>A</code>, and <code>aa</code> is greater than
     * <code>B</code>. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes in the <i>AttributeValueList</i>.
     * When performing the comparison, DynamoDB uses strongly consistent
     * reads. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     * or equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     * attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     * not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     * subsequence, or value in a set. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set). If the target attribute of the comparison is a
     * String, then the operation checks for a substring match. If the target
     * attribute of the comparison is Binary, then the operation looks for a
     * subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     * operation checks for a member of the set (not as a substring). </li>
     * <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     * subsequence, or absence of a value in a set.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If the target attribute of the comparison is a String, then the
     * operation checks for the absence of a substring match. If the target
     * attribute of the comparison is Binary, then the operation checks for
     * the absence of a subsequence of the target that matches the input. If
     * the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     * then the operation checks for the absence of a member of the set (not
     * as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     * checks for exact matches. <p><i>AttributeValueList</i> can contain
     * more than one <i>AttributeValue</i> of type String, Number, or Binary
     * (not a set). The target attribute of the comparison must be of the
     * same type and exact value to match. A String never matches a String
     * set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     * first value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a
     * set). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul> <p>For
     * usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html#ConditionalExpressions">Conditional
     * Expressions</a> in the Amazon DynamoDB Developer Guide. <note> <p>For
     * backward compatibility with previous DynamoDB releases, the following
     * parameters can be used instead of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>: <ul> <li><p><i>Value</i> - A value for
     * DynamoDB to compare with an attribute.</li> <li><p><i>Exists</i> -
     * Causes DynamoDB to evaluate the value vefore attempting the
     * conditional operation: <ul> <li><p>If <i>Exists</i> is
     * <code>true</code>, DynamoDB will check to see if that attribute???
     * value already exists in the table. If it is found, then the condition
     * evaluates to true; otherwise the condition evaluate to false.</li>
     * <li><p>If <i>Exists</i> is <code>false</code>, DynamoDB assumes that
     * the attribute value does??? <i>not</i> exist in the table. If in fact
     * the value does not exist, then the??? assumption is valid and the
     * condition evaluates to true. If the value is found, despite the
     * assumption that it does not exist, the condition evaluates to
     * false.???</li> </ul> </li> </ul> <p>Even though DynamoDB continues to
     * accept the <i>Value</i> and <i>Exists</i> parameters, they are now
     * deprecated. We recommend that you use <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i> instead, since they allow you to constuct a
     * much wider range of conditions. <p>The <i>Value</i> and <i>Exists</i>
     * parameters are incompatible with <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>. If you attempt to use both sets of
     * parameters at once, DynamoDB will throw a <i>ValidationException</i>.
     * </note>
     * <p>
     * The method adds a new key-value pair into Expected parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Expected.
     * @param value The corresponding value of the entry to be added into Expected.
     */
    public PutItemRequest addExpectedEntry(String key, ExpectedAttributeValue value) {
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
    public PutItemRequest clearExpectedEntries() {
        this.expected = null;
        return this;
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were updated with the <i>PutItem</i> request. For
     * <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     * If <i>ReturnValues</i> is not specified, or if its value is
     * <code>NONE</code>, then nothing is returned. (This is the default for
     * <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     * <i>PutItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @return Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were updated with the <i>PutItem</i> request. For
     *         <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     *         If <i>ReturnValues</i> is not specified, or if its value is
     *         <code>NONE</code>, then nothing is returned. (This is the default for
     *         <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     *         <i>PutItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> </ul>
     *
     * @see ReturnValue
     */
    public String getReturnValues() {
        return returnValues;
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were updated with the <i>PutItem</i> request. For
     * <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     * If <i>ReturnValues</i> is not specified, or if its value is
     * <code>NONE</code>, then nothing is returned. (This is the default for
     * <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     * <i>PutItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were updated with the <i>PutItem</i> request. For
     *         <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     *         If <i>ReturnValues</i> is not specified, or if its value is
     *         <code>NONE</code>, then nothing is returned. (This is the default for
     *         <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     *         <i>PutItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> </ul>
     *
     * @see ReturnValue
     */
    public void setReturnValues(String returnValues) {
        this.returnValues = returnValues;
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were updated with the <i>PutItem</i> request. For
     * <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     * If <i>ReturnValues</i> is not specified, or if its value is
     * <code>NONE</code>, then nothing is returned. (This is the default for
     * <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     * <i>PutItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were updated with the <i>PutItem</i> request. For
     *         <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     *         If <i>ReturnValues</i> is not specified, or if its value is
     *         <code>NONE</code>, then nothing is returned. (This is the default for
     *         <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     *         <i>PutItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReturnValue
     */
    public PutItemRequest withReturnValues(String returnValues) {
        this.returnValues = returnValues;
        return this;
    }

    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were updated with the <i>PutItem</i> request. For
     * <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     * If <i>ReturnValues</i> is not specified, or if its value is
     * <code>NONE</code>, then nothing is returned. (This is the default for
     * <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     * <i>PutItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were updated with the <i>PutItem</i> request. For
     *         <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     *         If <i>ReturnValues</i> is not specified, or if its value is
     *         <code>NONE</code>, then nothing is returned. (This is the default for
     *         <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     *         <i>PutItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> </ul>
     *
     * @see ReturnValue
     */
    public void setReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were updated with the <i>PutItem</i> request. For
     * <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     * If <i>ReturnValues</i> is not specified, or if its value is
     * <code>NONE</code>, then nothing is returned. (This is the default for
     * <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     * <i>PutItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were updated with the <i>PutItem</i> request. For
     *         <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     *         If <i>ReturnValues</i> is not specified, or if its value is
     *         <code>NONE</code>, then nothing is returned. (This is the default for
     *         <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     *         <i>PutItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReturnValue
     */
    public PutItemRequest withReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
        return this;
    }

    /**
     * If set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @return If set to <code>TOTAL</code>, the response includes
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
     * If set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity If set to <code>TOTAL</code>, the response includes
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
     * If set to <code>TOTAL</code>, the response includes
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
     * @param returnConsumedCapacity If set to <code>TOTAL</code>, the response includes
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
    public PutItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
        return this;
    }

    /**
     * If set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity If set to <code>TOTAL</code>, the response includes
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
     * If set to <code>TOTAL</code>, the response includes
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
     * @param returnConsumedCapacity If set to <code>TOTAL</code>, the response includes
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
    public PutItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    /**
     * If set to <code>SIZE</code>, statistics about item collections, if
     * any, that were modified during the operation are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are
     * returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @return If set to <code>SIZE</code>, statistics about item collections, if
     *         any, that were modified during the operation are returned in the
     *         response. If set to <code>NONE</code> (the default), no statistics are
     *         returned.
     *
     * @see ReturnItemCollectionMetrics
     */
    public String getReturnItemCollectionMetrics() {
        return returnItemCollectionMetrics;
    }
    
    /**
     * If set to <code>SIZE</code>, statistics about item collections, if
     * any, that were modified during the operation are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are
     * returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics If set to <code>SIZE</code>, statistics about item collections, if
     *         any, that were modified during the operation are returned in the
     *         response. If set to <code>NONE</code> (the default), no statistics are
     *         returned.
     *
     * @see ReturnItemCollectionMetrics
     */
    public void setReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
    }
    
    /**
     * If set to <code>SIZE</code>, statistics about item collections, if
     * any, that were modified during the operation are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are
     * returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics If set to <code>SIZE</code>, statistics about item collections, if
     *         any, that were modified during the operation are returned in the
     *         response. If set to <code>NONE</code> (the default), no statistics are
     *         returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReturnItemCollectionMetrics
     */
    public PutItemRequest withReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
        return this;
    }

    /**
     * If set to <code>SIZE</code>, statistics about item collections, if
     * any, that were modified during the operation are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are
     * returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics If set to <code>SIZE</code>, statistics about item collections, if
     *         any, that were modified during the operation are returned in the
     *         response. If set to <code>NONE</code> (the default), no statistics are
     *         returned.
     *
     * @see ReturnItemCollectionMetrics
     */
    public void setReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
    }
    
    /**
     * If set to <code>SIZE</code>, statistics about item collections, if
     * any, that were modified during the operation are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are
     * returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics If set to <code>SIZE</code>, statistics about item collections, if
     *         any, that were modified during the operation are returned in the
     *         response. If set to <code>NONE</code> (the default), no statistics are
     *         returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReturnItemCollectionMetrics
     */
    public PutItemRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
        return this;
    }

    /**
     * A logical operator to apply to the conditions in the <i>Expected</i>
     * map: <ul> <li><p><code>AND</code> - If <i>all</i> of the conditions
     * evaluate to true, then the entire map evaluates to true.</li>
     * <li><p><code>OR</code> - If <i>at least one</i> of the conditions
     * evaluate to true, then the entire map evaluates to true.</li> </ul>
     * <p>If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     * the default. <p>The operation will succeed only if the entire map
     * evaluates to true.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @return A logical operator to apply to the conditions in the <i>Expected</i>
     *         map: <ul> <li><p><code>AND</code> - If <i>all</i> of the conditions
     *         evaluate to true, then the entire map evaluates to true.</li>
     *         <li><p><code>OR</code> - If <i>at least one</i> of the conditions
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
     * A logical operator to apply to the conditions in the <i>Expected</i>
     * map: <ul> <li><p><code>AND</code> - If <i>all</i> of the conditions
     * evaluate to true, then the entire map evaluates to true.</li>
     * <li><p><code>OR</code> - If <i>at least one</i> of the conditions
     * evaluate to true, then the entire map evaluates to true.</li> </ul>
     * <p>If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     * the default. <p>The operation will succeed only if the entire map
     * evaluates to true.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator A logical operator to apply to the conditions in the <i>Expected</i>
     *         map: <ul> <li><p><code>AND</code> - If <i>all</i> of the conditions
     *         evaluate to true, then the entire map evaluates to true.</li>
     *         <li><p><code>OR</code> - If <i>at least one</i> of the conditions
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
     * A logical operator to apply to the conditions in the <i>Expected</i>
     * map: <ul> <li><p><code>AND</code> - If <i>all</i> of the conditions
     * evaluate to true, then the entire map evaluates to true.</li>
     * <li><p><code>OR</code> - If <i>at least one</i> of the conditions
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
     * @param conditionalOperator A logical operator to apply to the conditions in the <i>Expected</i>
     *         map: <ul> <li><p><code>AND</code> - If <i>all</i> of the conditions
     *         evaluate to true, then the entire map evaluates to true.</li>
     *         <li><p><code>OR</code> - If <i>at least one</i> of the conditions
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
    public PutItemRequest withConditionalOperator(String conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
        return this;
    }

    /**
     * A logical operator to apply to the conditions in the <i>Expected</i>
     * map: <ul> <li><p><code>AND</code> - If <i>all</i> of the conditions
     * evaluate to true, then the entire map evaluates to true.</li>
     * <li><p><code>OR</code> - If <i>at least one</i> of the conditions
     * evaluate to true, then the entire map evaluates to true.</li> </ul>
     * <p>If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     * the default. <p>The operation will succeed only if the entire map
     * evaluates to true.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator A logical operator to apply to the conditions in the <i>Expected</i>
     *         map: <ul> <li><p><code>AND</code> - If <i>all</i> of the conditions
     *         evaluate to true, then the entire map evaluates to true.</li>
     *         <li><p><code>OR</code> - If <i>at least one</i> of the conditions
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
     * A logical operator to apply to the conditions in the <i>Expected</i>
     * map: <ul> <li><p><code>AND</code> - If <i>all</i> of the conditions
     * evaluate to true, then the entire map evaluates to true.</li>
     * <li><p><code>OR</code> - If <i>at least one</i> of the conditions
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
     * @param conditionalOperator A logical operator to apply to the conditions in the <i>Expected</i>
     *         map: <ul> <li><p><code>AND</code> - If <i>all</i> of the conditions
     *         evaluate to true, then the entire map evaluates to true.</li>
     *         <li><p><code>OR</code> - If <i>at least one</i> of the conditions
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
    public PutItemRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
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
        if (getItem() != null) sb.append("Item: " + getItem() + ",");
        if (getExpected() != null) sb.append("Expected: " + getExpected() + ",");
        if (getReturnValues() != null) sb.append("ReturnValues: " + getReturnValues() + ",");
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getReturnItemCollectionMetrics() != null) sb.append("ReturnItemCollectionMetrics: " + getReturnItemCollectionMetrics() + ",");
        if (getConditionalOperator() != null) sb.append("ConditionalOperator: " + getConditionalOperator() );
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutItemRequest == false) return false;
        PutItemRequest other = (PutItemRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getItem() == null ^ this.getItem() == null) return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false) return false; 
        if (other.getExpected() == null ^ this.getExpected() == null) return false;
        if (other.getExpected() != null && other.getExpected().equals(this.getExpected()) == false) return false; 
        if (other.getReturnValues() == null ^ this.getReturnValues() == null) return false;
        if (other.getReturnValues() != null && other.getReturnValues().equals(this.getReturnValues()) == false) return false; 
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null) return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false) return false; 
        if (other.getReturnItemCollectionMetrics() == null ^ this.getReturnItemCollectionMetrics() == null) return false;
        if (other.getReturnItemCollectionMetrics() != null && other.getReturnItemCollectionMetrics().equals(this.getReturnItemCollectionMetrics()) == false) return false; 
        if (other.getConditionalOperator() == null ^ this.getConditionalOperator() == null) return false;
        if (other.getConditionalOperator() != null && other.getConditionalOperator().equals(this.getConditionalOperator()) == false) return false; 
        return true;
    }
    
}
    