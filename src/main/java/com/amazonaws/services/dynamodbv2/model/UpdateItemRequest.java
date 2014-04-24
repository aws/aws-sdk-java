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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#updateItem(UpdateItemRequest) UpdateItem operation}.
 * <p>
 * Edits an existing item's attributes, or inserts a new item if it does
 * not already exist. You can put, delete, or add attribute values. You
 * can also perform a conditional update (insert a new attribute
 * name-value pair if it doesn't exist, or replace an existing name-value
 * pair if it has certain expected attribute values).
 * </p>
 * <p>
 * In addition to updating an item, you can also return the item's
 * attribute values in the same operation, using the <i>ReturnValues</i>
 * parameter.
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#updateItem(UpdateItemRequest)
 */
public class UpdateItemRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the table containing the item to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * The primary key that defines the item. Each element consists of an
     * attribute name and a value for that attribute.
     */
    private java.util.Map<String,AttributeValue> key;

    /**
     * The names of attributes to be modified, the action to perform on each,
     * and the new value for each. If you are updating an attribute that is
     * an index key attribute for any indexes on that table, the attribute
     * type must match the index key type defined in the
     * <i>AttributesDefinition</i> of the table description. You can use
     * <i>UpdateItem</i> to update any non-key attributes. <p>Attribute
     * values cannot be null. String and binary type attributes must have
     * lengths greater than zero. Set type attributes must not be empty.
     * Requests with empty values will be rejected with a
     * <i>ValidationException</i>. <p>Each <i>AttributeUpdates</i> element
     * consists of an attribute name to modify, along with the following:
     * <ul> <li> <p><i>Value</i> - The new value, if applicable, for this
     * attribute. </li> <li> <p><i>Action</i> - Specifies how to perform the
     * update. Valid values for <i>Action</i> are <code>PUT</code>,
     * <code>DELETE</code>, and <code>ADD</code>. The behavior depends on
     * whether the specified primary key already exists in the table. <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * <ul> <li> <p><code>PUT</code> - Adds the specified attribute to the
     * item. If the attribute already exists, it is replaced by the new
     * value. </li> <li> <p><code>DELETE</code> - If no value is specified,
     * the attribute and its value are removed from the item. The data type
     * of the specified value must match the existing value's data type.
     * <p>If a <i>set</i> of values is specified, then those values are
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
     * number value for an item that doesn't exist before the update,
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, DynamoDB
     * uses <code>0</code> as the initial value. For example, suppose that
     * the item you want to update does not yet have an attribute named
     * <i>itemcount</i>, but you decide to <code>ADD</code> the number
     * <code>3</code> to this attribute anyway, even though it currently does
     * not exist. DynamoDB will create the <i>itemcount</i> attribute, set
     * its initial value to <code>0</code>, and finally add <code>3</code> to
     * it. The result will be a new <i>itemcount</i> attribute in the item,
     * with a value of <code>3</code>. </note> </li> <li> <p>If the existing
     * data type is a set, and if the <i>Value</i> is also a set, then the
     * <i>Value</i> is added to the existing set. (This is a <i>set</i>
     * operation, not mathematical addition.) For example, if the attribute
     * value was the set <code>[1,2]</code>, and the <code>ADD</code> action
     * specified <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - DynamoDB creates a new item with the specified
     * primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - DynamoDB creates an item with
     * the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul> </li> </ul>
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition.
     */
    private java.util.Map<String,AttributeValueUpdate> attributeUpdates;

    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>UpdateItem</i> operation. <p>Each element of <i>Expected</i>
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
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared either before or after they were updated. For
     * <i>UpdateItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This is the
     * default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     * If <i>UpdateItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> <li>
     * <p><code>UPDATED_OLD</code> - The old versions of only the updated
     * attributes are returned. </li> <li> <p><code>ALL_NEW</code> - All of
     * the attributes of the new version of the item are returned. </li> <li>
     * <p><code>UPDATED_NEW</code> - The new versions of only the updated
     * attributes are returned. </li> </ul>
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
     * Default constructor for a new UpdateItemRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateItemRequest() {}
    
    /**
     * Constructs a new UpdateItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table containing the item to update.
     * @param key The primary key that defines the item. Each element
     * consists of an attribute name and a value for that attribute.
     * @param attributeUpdates The names of attributes to be modified, the
     * action to perform on each, and the new value for each. If you are
     * updating an attribute that is an index key attribute for any indexes
     * on that table, the attribute type must match the index key type
     * defined in the <i>AttributesDefinition</i> of the table description.
     * You can use <i>UpdateItem</i> to update any non-key attributes.
     * <p>Attribute values cannot be null. String and binary type attributes
     * must have lengths greater than zero. Set type attributes must not be
     * empty. Requests with empty values will be rejected with a
     * <i>ValidationException</i>. <p>Each <i>AttributeUpdates</i> element
     * consists of an attribute name to modify, along with the following:
     * <ul> <li> <p><i>Value</i> - The new value, if applicable, for this
     * attribute. </li> <li> <p><i>Action</i> - Specifies how to perform the
     * update. Valid values for <i>Action</i> are <code>PUT</code>,
     * <code>DELETE</code>, and <code>ADD</code>. The behavior depends on
     * whether the specified primary key already exists in the table. <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * <ul> <li> <p><code>PUT</code> - Adds the specified attribute to the
     * item. If the attribute already exists, it is replaced by the new
     * value. </li> <li> <p><code>DELETE</code> - If no value is specified,
     * the attribute and its value are removed from the item. The data type
     * of the specified value must match the existing value's data type.
     * <p>If a <i>set</i> of values is specified, then those values are
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
     * number value for an item that doesn't exist before the update,
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, DynamoDB
     * uses <code>0</code> as the initial value. For example, suppose that
     * the item you want to update does not yet have an attribute named
     * <i>itemcount</i>, but you decide to <code>ADD</code> the number
     * <code>3</code> to this attribute anyway, even though it currently does
     * not exist. DynamoDB will create the <i>itemcount</i> attribute, set
     * its initial value to <code>0</code>, and finally add <code>3</code> to
     * it. The result will be a new <i>itemcount</i> attribute in the item,
     * with a value of <code>3</code>. </note> </li> <li> <p>If the existing
     * data type is a set, and if the <i>Value</i> is also a set, then the
     * <i>Value</i> is added to the existing set. (This is a <i>set</i>
     * operation, not mathematical addition.) For example, if the attribute
     * value was the set <code>[1,2]</code>, and the <code>ADD</code> action
     * specified <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - DynamoDB creates a new item with the specified
     * primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - DynamoDB creates an item with
     * the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul> </li> </ul>
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition.
     */
    public UpdateItemRequest(String tableName, java.util.Map<String,AttributeValue> key, java.util.Map<String,AttributeValueUpdate> attributeUpdates) {
        setTableName(tableName);
        setKey(key);
        setAttributeUpdates(attributeUpdates);
    }

    /**
     * Constructs a new UpdateItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table containing the item to update.
     * @param key The primary key that defines the item. Each element
     * consists of an attribute name and a value for that attribute.
     * @param attributeUpdates The names of attributes to be modified, the
     * action to perform on each, and the new value for each. If you are
     * updating an attribute that is an index key attribute for any indexes
     * on that table, the attribute type must match the index key type
     * defined in the <i>AttributesDefinition</i> of the table description.
     * You can use <i>UpdateItem</i> to update any non-key attributes.
     * <p>Attribute values cannot be null. String and binary type attributes
     * must have lengths greater than zero. Set type attributes must not be
     * empty. Requests with empty values will be rejected with a
     * <i>ValidationException</i>. <p>Each <i>AttributeUpdates</i> element
     * consists of an attribute name to modify, along with the following:
     * <ul> <li> <p><i>Value</i> - The new value, if applicable, for this
     * attribute. </li> <li> <p><i>Action</i> - Specifies how to perform the
     * update. Valid values for <i>Action</i> are <code>PUT</code>,
     * <code>DELETE</code>, and <code>ADD</code>. The behavior depends on
     * whether the specified primary key already exists in the table. <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * <ul> <li> <p><code>PUT</code> - Adds the specified attribute to the
     * item. If the attribute already exists, it is replaced by the new
     * value. </li> <li> <p><code>DELETE</code> - If no value is specified,
     * the attribute and its value are removed from the item. The data type
     * of the specified value must match the existing value's data type.
     * <p>If a <i>set</i> of values is specified, then those values are
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
     * number value for an item that doesn't exist before the update,
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, DynamoDB
     * uses <code>0</code> as the initial value. For example, suppose that
     * the item you want to update does not yet have an attribute named
     * <i>itemcount</i>, but you decide to <code>ADD</code> the number
     * <code>3</code> to this attribute anyway, even though it currently does
     * not exist. DynamoDB will create the <i>itemcount</i> attribute, set
     * its initial value to <code>0</code>, and finally add <code>3</code> to
     * it. The result will be a new <i>itemcount</i> attribute in the item,
     * with a value of <code>3</code>. </note> </li> <li> <p>If the existing
     * data type is a set, and if the <i>Value</i> is also a set, then the
     * <i>Value</i> is added to the existing set. (This is a <i>set</i>
     * operation, not mathematical addition.) For example, if the attribute
     * value was the set <code>[1,2]</code>, and the <code>ADD</code> action
     * specified <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - DynamoDB creates a new item with the specified
     * primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - DynamoDB creates an item with
     * the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul> </li> </ul>
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared either before or after they were
     * updated. For <i>UpdateItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This is the
     * default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     * If <i>UpdateItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> <li>
     * <p><code>UPDATED_OLD</code> - The old versions of only the updated
     * attributes are returned. </li> <li> <p><code>ALL_NEW</code> - All of
     * the attributes of the new version of the item are returned. </li> <li>
     * <p><code>UPDATED_NEW</code> - The new versions of only the updated
     * attributes are returned. </li> </ul>
     */
    public UpdateItemRequest(String tableName, java.util.Map<String,AttributeValue> key, java.util.Map<String,AttributeValueUpdate> attributeUpdates, String returnValues) {
        setTableName(tableName);
        setKey(key);
        setAttributeUpdates(attributeUpdates);
        setReturnValues(returnValues);
    }

    /**
     * Constructs a new UpdateItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table containing the item to update.
     * @param key The primary key that defines the item. Each element
     * consists of an attribute name and a value for that attribute.
     * @param attributeUpdates The names of attributes to be modified, the
     * action to perform on each, and the new value for each. If you are
     * updating an attribute that is an index key attribute for any indexes
     * on that table, the attribute type must match the index key type
     * defined in the <i>AttributesDefinition</i> of the table description.
     * You can use <i>UpdateItem</i> to update any non-key attributes.
     * <p>Attribute values cannot be null. String and binary type attributes
     * must have lengths greater than zero. Set type attributes must not be
     * empty. Requests with empty values will be rejected with a
     * <i>ValidationException</i>. <p>Each <i>AttributeUpdates</i> element
     * consists of an attribute name to modify, along with the following:
     * <ul> <li> <p><i>Value</i> - The new value, if applicable, for this
     * attribute. </li> <li> <p><i>Action</i> - Specifies how to perform the
     * update. Valid values for <i>Action</i> are <code>PUT</code>,
     * <code>DELETE</code>, and <code>ADD</code>. The behavior depends on
     * whether the specified primary key already exists in the table. <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * <ul> <li> <p><code>PUT</code> - Adds the specified attribute to the
     * item. If the attribute already exists, it is replaced by the new
     * value. </li> <li> <p><code>DELETE</code> - If no value is specified,
     * the attribute and its value are removed from the item. The data type
     * of the specified value must match the existing value's data type.
     * <p>If a <i>set</i> of values is specified, then those values are
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
     * number value for an item that doesn't exist before the update,
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, DynamoDB
     * uses <code>0</code> as the initial value. For example, suppose that
     * the item you want to update does not yet have an attribute named
     * <i>itemcount</i>, but you decide to <code>ADD</code> the number
     * <code>3</code> to this attribute anyway, even though it currently does
     * not exist. DynamoDB will create the <i>itemcount</i> attribute, set
     * its initial value to <code>0</code>, and finally add <code>3</code> to
     * it. The result will be a new <i>itemcount</i> attribute in the item,
     * with a value of <code>3</code>. </note> </li> <li> <p>If the existing
     * data type is a set, and if the <i>Value</i> is also a set, then the
     * <i>Value</i> is added to the existing set. (This is a <i>set</i>
     * operation, not mathematical addition.) For example, if the attribute
     * value was the set <code>[1,2]</code>, and the <code>ADD</code> action
     * specified <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - DynamoDB creates a new item with the specified
     * primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - DynamoDB creates an item with
     * the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul> </li> </ul>
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared either before or after they were
     * updated. For <i>UpdateItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This is the
     * default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     * If <i>UpdateItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> <li>
     * <p><code>UPDATED_OLD</code> - The old versions of only the updated
     * attributes are returned. </li> <li> <p><code>ALL_NEW</code> - All of
     * the attributes of the new version of the item are returned. </li> <li>
     * <p><code>UPDATED_NEW</code> - The new versions of only the updated
     * attributes are returned. </li> </ul>
     */
    public UpdateItemRequest(String tableName, java.util.Map<String,AttributeValue> key, java.util.Map<String,AttributeValueUpdate> attributeUpdates, ReturnValue returnValues) {
        this.tableName = tableName;
        this.key = key;
        this.attributeUpdates = attributeUpdates;
        this.returnValues = returnValues.toString();
    }

    /**
     * The name of the table containing the item to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table containing the item to update.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table containing the item to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table containing the item to update.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table containing the item to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table containing the item to update.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateItemRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * The primary key that defines the item. Each element consists of an
     * attribute name and a value for that attribute.
     *
     * @return The primary key that defines the item. Each element consists of an
     *         attribute name and a value for that attribute.
     */
    public java.util.Map<String,AttributeValue> getKey() {
        
        return key;
    }
    
    /**
     * The primary key that defines the item. Each element consists of an
     * attribute name and a value for that attribute.
     *
     * @param key The primary key that defines the item. Each element consists of an
     *         attribute name and a value for that attribute.
     */
    public void setKey(java.util.Map<String,AttributeValue> key) {
        this.key = key;
    }
    
    /**
     * The primary key that defines the item. Each element consists of an
     * attribute name and a value for that attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key The primary key that defines the item. Each element consists of an
     *         attribute name and a value for that attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateItemRequest withKey(java.util.Map<String,AttributeValue> key) {
        setKey(key);
        return this;
    }

    /**
     * The primary key that defines the item. Each element consists of an
     * attribute name and a value for that attribute.
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
     * The primary key that defines the item. Each element consists of an
     * attribute name and a value for that attribute.
     * <p>
     * This method accepts the hashKey, rangeKey of Key as
     * java.util.Map.Entry<String, AttributeValue> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hashKey Primary hash key.
     * @param rangeKey Primary range key. (null if it a hash-only table)
     */
    public UpdateItemRequest withKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey) throws IllegalArgumentException {
        setKey(hashKey, rangeKey);
        return this;
    }

    /**
     * The primary key that defines the item. Each element consists of an
     * attribute name and a value for that attribute.
     * <p>
     * The method adds a new key-value pair into Key parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Key.
     * @param value The corresponding value of the entry to be added into Key.
     */
    public UpdateItemRequest addKeyEntry(String key, AttributeValue value) {
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
    public UpdateItemRequest clearKeyEntries() {
        this.key = null;
        return this;
    }
    
    /**
     * The names of attributes to be modified, the action to perform on each,
     * and the new value for each. If you are updating an attribute that is
     * an index key attribute for any indexes on that table, the attribute
     * type must match the index key type defined in the
     * <i>AttributesDefinition</i> of the table description. You can use
     * <i>UpdateItem</i> to update any non-key attributes. <p>Attribute
     * values cannot be null. String and binary type attributes must have
     * lengths greater than zero. Set type attributes must not be empty.
     * Requests with empty values will be rejected with a
     * <i>ValidationException</i>. <p>Each <i>AttributeUpdates</i> element
     * consists of an attribute name to modify, along with the following:
     * <ul> <li> <p><i>Value</i> - The new value, if applicable, for this
     * attribute. </li> <li> <p><i>Action</i> - Specifies how to perform the
     * update. Valid values for <i>Action</i> are <code>PUT</code>,
     * <code>DELETE</code>, and <code>ADD</code>. The behavior depends on
     * whether the specified primary key already exists in the table. <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * <ul> <li> <p><code>PUT</code> - Adds the specified attribute to the
     * item. If the attribute already exists, it is replaced by the new
     * value. </li> <li> <p><code>DELETE</code> - If no value is specified,
     * the attribute and its value are removed from the item. The data type
     * of the specified value must match the existing value's data type.
     * <p>If a <i>set</i> of values is specified, then those values are
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
     * number value for an item that doesn't exist before the update,
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, DynamoDB
     * uses <code>0</code> as the initial value. For example, suppose that
     * the item you want to update does not yet have an attribute named
     * <i>itemcount</i>, but you decide to <code>ADD</code> the number
     * <code>3</code> to this attribute anyway, even though it currently does
     * not exist. DynamoDB will create the <i>itemcount</i> attribute, set
     * its initial value to <code>0</code>, and finally add <code>3</code> to
     * it. The result will be a new <i>itemcount</i> attribute in the item,
     * with a value of <code>3</code>. </note> </li> <li> <p>If the existing
     * data type is a set, and if the <i>Value</i> is also a set, then the
     * <i>Value</i> is added to the existing set. (This is a <i>set</i>
     * operation, not mathematical addition.) For example, if the attribute
     * value was the set <code>[1,2]</code>, and the <code>ADD</code> action
     * specified <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - DynamoDB creates a new item with the specified
     * primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - DynamoDB creates an item with
     * the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul> </li> </ul>
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition.
     *
     * @return The names of attributes to be modified, the action to perform on each,
     *         and the new value for each. If you are updating an attribute that is
     *         an index key attribute for any indexes on that table, the attribute
     *         type must match the index key type defined in the
     *         <i>AttributesDefinition</i> of the table description. You can use
     *         <i>UpdateItem</i> to update any non-key attributes. <p>Attribute
     *         values cannot be null. String and binary type attributes must have
     *         lengths greater than zero. Set type attributes must not be empty.
     *         Requests with empty values will be rejected with a
     *         <i>ValidationException</i>. <p>Each <i>AttributeUpdates</i> element
     *         consists of an attribute name to modify, along with the following:
     *         <ul> <li> <p><i>Value</i> - The new value, if applicable, for this
     *         attribute. </li> <li> <p><i>Action</i> - Specifies how to perform the
     *         update. Valid values for <i>Action</i> are <code>PUT</code>,
     *         <code>DELETE</code>, and <code>ADD</code>. The behavior depends on
     *         whether the specified primary key already exists in the table. <p>
     *         <b>If an item with the specified <i>Key</i> is found in the table:</b>
     *         <ul> <li> <p><code>PUT</code> - Adds the specified attribute to the
     *         item. If the attribute already exists, it is replaced by the new
     *         value. </li> <li> <p><code>DELETE</code> - If no value is specified,
     *         the attribute and its value are removed from the item. The data type
     *         of the specified value must match the existing value's data type.
     *         <p>If a <i>set</i> of values is specified, then those values are
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
     *         number value for an item that doesn't exist before the update,
     *         DynamoDB uses 0 as the initial value. <p>In addition, if you use
     *         <code>ADD</code> to update an existing item, and intend to increment
     *         or decrement an attribute value which does not yet exist, DynamoDB
     *         uses <code>0</code> as the initial value. For example, suppose that
     *         the item you want to update does not yet have an attribute named
     *         <i>itemcount</i>, but you decide to <code>ADD</code> the number
     *         <code>3</code> to this attribute anyway, even though it currently does
     *         not exist. DynamoDB will create the <i>itemcount</i> attribute, set
     *         its initial value to <code>0</code>, and finally add <code>3</code> to
     *         it. The result will be a new <i>itemcount</i> attribute in the item,
     *         with a value of <code>3</code>. </note> </li> <li> <p>If the existing
     *         data type is a set, and if the <i>Value</i> is also a set, then the
     *         <i>Value</i> is added to the existing set. (This is a <i>set</i>
     *         operation, not mathematical addition.) For example, if the attribute
     *         value was the set <code>[1,2]</code>, and the <code>ADD</code> action
     *         specified <code>[3]</code>, then the final attribute value would be
     *         <code>[1,2,3]</code>. An error occurs if an Add action is specified
     *         for a set attribute and the attribute type specified does not match
     *         the existing set type. <p>Both sets must have the same primitive data
     *         type. For example, if the existing data type is a set of strings, the
     *         <i>Value</i> must also be a set of strings. The same holds true for
     *         number sets and binary sets. </li> </ul> <p>This action is only valid
     *         for an existing attribute whose data type is number or is a set. Do
     *         not use <code>ADD</code> for any other data types. </li> </ul> <p>
     *         <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     *         <p><code>PUT</code> - DynamoDB creates a new item with the specified
     *         primary key, and then adds the attribute. </li> <li>
     *         <p><code>DELETE</code> - Nothing happens; there is no attribute to
     *         delete. </li> <li> <p><code>ADD</code> - DynamoDB creates an item with
     *         the supplied primary key and number (or set of numbers) for the
     *         attribute value. The only data types allowed are number and number
     *         set; no other data types can be specified. </li> </ul> </li> </ul>
     *         <p>If you specify any attributes that are part of an index key, then
     *         the data types for those attributes must match those of the schema in
     *         the table's attribute definition.
     */
    public java.util.Map<String,AttributeValueUpdate> getAttributeUpdates() {
        
        return attributeUpdates;
    }
    
    /**
     * The names of attributes to be modified, the action to perform on each,
     * and the new value for each. If you are updating an attribute that is
     * an index key attribute for any indexes on that table, the attribute
     * type must match the index key type defined in the
     * <i>AttributesDefinition</i> of the table description. You can use
     * <i>UpdateItem</i> to update any non-key attributes. <p>Attribute
     * values cannot be null. String and binary type attributes must have
     * lengths greater than zero. Set type attributes must not be empty.
     * Requests with empty values will be rejected with a
     * <i>ValidationException</i>. <p>Each <i>AttributeUpdates</i> element
     * consists of an attribute name to modify, along with the following:
     * <ul> <li> <p><i>Value</i> - The new value, if applicable, for this
     * attribute. </li> <li> <p><i>Action</i> - Specifies how to perform the
     * update. Valid values for <i>Action</i> are <code>PUT</code>,
     * <code>DELETE</code>, and <code>ADD</code>. The behavior depends on
     * whether the specified primary key already exists in the table. <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * <ul> <li> <p><code>PUT</code> - Adds the specified attribute to the
     * item. If the attribute already exists, it is replaced by the new
     * value. </li> <li> <p><code>DELETE</code> - If no value is specified,
     * the attribute and its value are removed from the item. The data type
     * of the specified value must match the existing value's data type.
     * <p>If a <i>set</i> of values is specified, then those values are
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
     * number value for an item that doesn't exist before the update,
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, DynamoDB
     * uses <code>0</code> as the initial value. For example, suppose that
     * the item you want to update does not yet have an attribute named
     * <i>itemcount</i>, but you decide to <code>ADD</code> the number
     * <code>3</code> to this attribute anyway, even though it currently does
     * not exist. DynamoDB will create the <i>itemcount</i> attribute, set
     * its initial value to <code>0</code>, and finally add <code>3</code> to
     * it. The result will be a new <i>itemcount</i> attribute in the item,
     * with a value of <code>3</code>. </note> </li> <li> <p>If the existing
     * data type is a set, and if the <i>Value</i> is also a set, then the
     * <i>Value</i> is added to the existing set. (This is a <i>set</i>
     * operation, not mathematical addition.) For example, if the attribute
     * value was the set <code>[1,2]</code>, and the <code>ADD</code> action
     * specified <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - DynamoDB creates a new item with the specified
     * primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - DynamoDB creates an item with
     * the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul> </li> </ul>
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition.
     *
     * @param attributeUpdates The names of attributes to be modified, the action to perform on each,
     *         and the new value for each. If you are updating an attribute that is
     *         an index key attribute for any indexes on that table, the attribute
     *         type must match the index key type defined in the
     *         <i>AttributesDefinition</i> of the table description. You can use
     *         <i>UpdateItem</i> to update any non-key attributes. <p>Attribute
     *         values cannot be null. String and binary type attributes must have
     *         lengths greater than zero. Set type attributes must not be empty.
     *         Requests with empty values will be rejected with a
     *         <i>ValidationException</i>. <p>Each <i>AttributeUpdates</i> element
     *         consists of an attribute name to modify, along with the following:
     *         <ul> <li> <p><i>Value</i> - The new value, if applicable, for this
     *         attribute. </li> <li> <p><i>Action</i> - Specifies how to perform the
     *         update. Valid values for <i>Action</i> are <code>PUT</code>,
     *         <code>DELETE</code>, and <code>ADD</code>. The behavior depends on
     *         whether the specified primary key already exists in the table. <p>
     *         <b>If an item with the specified <i>Key</i> is found in the table:</b>
     *         <ul> <li> <p><code>PUT</code> - Adds the specified attribute to the
     *         item. If the attribute already exists, it is replaced by the new
     *         value. </li> <li> <p><code>DELETE</code> - If no value is specified,
     *         the attribute and its value are removed from the item. The data type
     *         of the specified value must match the existing value's data type.
     *         <p>If a <i>set</i> of values is specified, then those values are
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
     *         number value for an item that doesn't exist before the update,
     *         DynamoDB uses 0 as the initial value. <p>In addition, if you use
     *         <code>ADD</code> to update an existing item, and intend to increment
     *         or decrement an attribute value which does not yet exist, DynamoDB
     *         uses <code>0</code> as the initial value. For example, suppose that
     *         the item you want to update does not yet have an attribute named
     *         <i>itemcount</i>, but you decide to <code>ADD</code> the number
     *         <code>3</code> to this attribute anyway, even though it currently does
     *         not exist. DynamoDB will create the <i>itemcount</i> attribute, set
     *         its initial value to <code>0</code>, and finally add <code>3</code> to
     *         it. The result will be a new <i>itemcount</i> attribute in the item,
     *         with a value of <code>3</code>. </note> </li> <li> <p>If the existing
     *         data type is a set, and if the <i>Value</i> is also a set, then the
     *         <i>Value</i> is added to the existing set. (This is a <i>set</i>
     *         operation, not mathematical addition.) For example, if the attribute
     *         value was the set <code>[1,2]</code>, and the <code>ADD</code> action
     *         specified <code>[3]</code>, then the final attribute value would be
     *         <code>[1,2,3]</code>. An error occurs if an Add action is specified
     *         for a set attribute and the attribute type specified does not match
     *         the existing set type. <p>Both sets must have the same primitive data
     *         type. For example, if the existing data type is a set of strings, the
     *         <i>Value</i> must also be a set of strings. The same holds true for
     *         number sets and binary sets. </li> </ul> <p>This action is only valid
     *         for an existing attribute whose data type is number or is a set. Do
     *         not use <code>ADD</code> for any other data types. </li> </ul> <p>
     *         <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     *         <p><code>PUT</code> - DynamoDB creates a new item with the specified
     *         primary key, and then adds the attribute. </li> <li>
     *         <p><code>DELETE</code> - Nothing happens; there is no attribute to
     *         delete. </li> <li> <p><code>ADD</code> - DynamoDB creates an item with
     *         the supplied primary key and number (or set of numbers) for the
     *         attribute value. The only data types allowed are number and number
     *         set; no other data types can be specified. </li> </ul> </li> </ul>
     *         <p>If you specify any attributes that are part of an index key, then
     *         the data types for those attributes must match those of the schema in
     *         the table's attribute definition.
     */
    public void setAttributeUpdates(java.util.Map<String,AttributeValueUpdate> attributeUpdates) {
        this.attributeUpdates = attributeUpdates;
    }
    
    /**
     * The names of attributes to be modified, the action to perform on each,
     * and the new value for each. If you are updating an attribute that is
     * an index key attribute for any indexes on that table, the attribute
     * type must match the index key type defined in the
     * <i>AttributesDefinition</i> of the table description. You can use
     * <i>UpdateItem</i> to update any non-key attributes. <p>Attribute
     * values cannot be null. String and binary type attributes must have
     * lengths greater than zero. Set type attributes must not be empty.
     * Requests with empty values will be rejected with a
     * <i>ValidationException</i>. <p>Each <i>AttributeUpdates</i> element
     * consists of an attribute name to modify, along with the following:
     * <ul> <li> <p><i>Value</i> - The new value, if applicable, for this
     * attribute. </li> <li> <p><i>Action</i> - Specifies how to perform the
     * update. Valid values for <i>Action</i> are <code>PUT</code>,
     * <code>DELETE</code>, and <code>ADD</code>. The behavior depends on
     * whether the specified primary key already exists in the table. <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * <ul> <li> <p><code>PUT</code> - Adds the specified attribute to the
     * item. If the attribute already exists, it is replaced by the new
     * value. </li> <li> <p><code>DELETE</code> - If no value is specified,
     * the attribute and its value are removed from the item. The data type
     * of the specified value must match the existing value's data type.
     * <p>If a <i>set</i> of values is specified, then those values are
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
     * number value for an item that doesn't exist before the update,
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, DynamoDB
     * uses <code>0</code> as the initial value. For example, suppose that
     * the item you want to update does not yet have an attribute named
     * <i>itemcount</i>, but you decide to <code>ADD</code> the number
     * <code>3</code> to this attribute anyway, even though it currently does
     * not exist. DynamoDB will create the <i>itemcount</i> attribute, set
     * its initial value to <code>0</code>, and finally add <code>3</code> to
     * it. The result will be a new <i>itemcount</i> attribute in the item,
     * with a value of <code>3</code>. </note> </li> <li> <p>If the existing
     * data type is a set, and if the <i>Value</i> is also a set, then the
     * <i>Value</i> is added to the existing set. (This is a <i>set</i>
     * operation, not mathematical addition.) For example, if the attribute
     * value was the set <code>[1,2]</code>, and the <code>ADD</code> action
     * specified <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - DynamoDB creates a new item with the specified
     * primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - DynamoDB creates an item with
     * the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul> </li> </ul>
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeUpdates The names of attributes to be modified, the action to perform on each,
     *         and the new value for each. If you are updating an attribute that is
     *         an index key attribute for any indexes on that table, the attribute
     *         type must match the index key type defined in the
     *         <i>AttributesDefinition</i> of the table description. You can use
     *         <i>UpdateItem</i> to update any non-key attributes. <p>Attribute
     *         values cannot be null. String and binary type attributes must have
     *         lengths greater than zero. Set type attributes must not be empty.
     *         Requests with empty values will be rejected with a
     *         <i>ValidationException</i>. <p>Each <i>AttributeUpdates</i> element
     *         consists of an attribute name to modify, along with the following:
     *         <ul> <li> <p><i>Value</i> - The new value, if applicable, for this
     *         attribute. </li> <li> <p><i>Action</i> - Specifies how to perform the
     *         update. Valid values for <i>Action</i> are <code>PUT</code>,
     *         <code>DELETE</code>, and <code>ADD</code>. The behavior depends on
     *         whether the specified primary key already exists in the table. <p>
     *         <b>If an item with the specified <i>Key</i> is found in the table:</b>
     *         <ul> <li> <p><code>PUT</code> - Adds the specified attribute to the
     *         item. If the attribute already exists, it is replaced by the new
     *         value. </li> <li> <p><code>DELETE</code> - If no value is specified,
     *         the attribute and its value are removed from the item. The data type
     *         of the specified value must match the existing value's data type.
     *         <p>If a <i>set</i> of values is specified, then those values are
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
     *         number value for an item that doesn't exist before the update,
     *         DynamoDB uses 0 as the initial value. <p>In addition, if you use
     *         <code>ADD</code> to update an existing item, and intend to increment
     *         or decrement an attribute value which does not yet exist, DynamoDB
     *         uses <code>0</code> as the initial value. For example, suppose that
     *         the item you want to update does not yet have an attribute named
     *         <i>itemcount</i>, but you decide to <code>ADD</code> the number
     *         <code>3</code> to this attribute anyway, even though it currently does
     *         not exist. DynamoDB will create the <i>itemcount</i> attribute, set
     *         its initial value to <code>0</code>, and finally add <code>3</code> to
     *         it. The result will be a new <i>itemcount</i> attribute in the item,
     *         with a value of <code>3</code>. </note> </li> <li> <p>If the existing
     *         data type is a set, and if the <i>Value</i> is also a set, then the
     *         <i>Value</i> is added to the existing set. (This is a <i>set</i>
     *         operation, not mathematical addition.) For example, if the attribute
     *         value was the set <code>[1,2]</code>, and the <code>ADD</code> action
     *         specified <code>[3]</code>, then the final attribute value would be
     *         <code>[1,2,3]</code>. An error occurs if an Add action is specified
     *         for a set attribute and the attribute type specified does not match
     *         the existing set type. <p>Both sets must have the same primitive data
     *         type. For example, if the existing data type is a set of strings, the
     *         <i>Value</i> must also be a set of strings. The same holds true for
     *         number sets and binary sets. </li> </ul> <p>This action is only valid
     *         for an existing attribute whose data type is number or is a set. Do
     *         not use <code>ADD</code> for any other data types. </li> </ul> <p>
     *         <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     *         <p><code>PUT</code> - DynamoDB creates a new item with the specified
     *         primary key, and then adds the attribute. </li> <li>
     *         <p><code>DELETE</code> - Nothing happens; there is no attribute to
     *         delete. </li> <li> <p><code>ADD</code> - DynamoDB creates an item with
     *         the supplied primary key and number (or set of numbers) for the
     *         attribute value. The only data types allowed are number and number
     *         set; no other data types can be specified. </li> </ul> </li> </ul>
     *         <p>If you specify any attributes that are part of an index key, then
     *         the data types for those attributes must match those of the schema in
     *         the table's attribute definition.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateItemRequest withAttributeUpdates(java.util.Map<String,AttributeValueUpdate> attributeUpdates) {
        setAttributeUpdates(attributeUpdates);
        return this;
    }

    /**
     * The names of attributes to be modified, the action to perform on each,
     * and the new value for each. If you are updating an attribute that is
     * an index key attribute for any indexes on that table, the attribute
     * type must match the index key type defined in the
     * <i>AttributesDefinition</i> of the table description. You can use
     * <i>UpdateItem</i> to update any non-key attributes. <p>Attribute
     * values cannot be null. String and binary type attributes must have
     * lengths greater than zero. Set type attributes must not be empty.
     * Requests with empty values will be rejected with a
     * <i>ValidationException</i>. <p>Each <i>AttributeUpdates</i> element
     * consists of an attribute name to modify, along with the following:
     * <ul> <li> <p><i>Value</i> - The new value, if applicable, for this
     * attribute. </li> <li> <p><i>Action</i> - Specifies how to perform the
     * update. Valid values for <i>Action</i> are <code>PUT</code>,
     * <code>DELETE</code>, and <code>ADD</code>. The behavior depends on
     * whether the specified primary key already exists in the table. <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * <ul> <li> <p><code>PUT</code> - Adds the specified attribute to the
     * item. If the attribute already exists, it is replaced by the new
     * value. </li> <li> <p><code>DELETE</code> - If no value is specified,
     * the attribute and its value are removed from the item. The data type
     * of the specified value must match the existing value's data type.
     * <p>If a <i>set</i> of values is specified, then those values are
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
     * number value for an item that doesn't exist before the update,
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, DynamoDB
     * uses <code>0</code> as the initial value. For example, suppose that
     * the item you want to update does not yet have an attribute named
     * <i>itemcount</i>, but you decide to <code>ADD</code> the number
     * <code>3</code> to this attribute anyway, even though it currently does
     * not exist. DynamoDB will create the <i>itemcount</i> attribute, set
     * its initial value to <code>0</code>, and finally add <code>3</code> to
     * it. The result will be a new <i>itemcount</i> attribute in the item,
     * with a value of <code>3</code>. </note> </li> <li> <p>If the existing
     * data type is a set, and if the <i>Value</i> is also a set, then the
     * <i>Value</i> is added to the existing set. (This is a <i>set</i>
     * operation, not mathematical addition.) For example, if the attribute
     * value was the set <code>[1,2]</code>, and the <code>ADD</code> action
     * specified <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - DynamoDB creates a new item with the specified
     * primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - DynamoDB creates an item with
     * the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul> </li> </ul>
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition.
     * <p>
     * The method adds a new key-value pair into AttributeUpdates parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into AttributeUpdates.
     * @param value The corresponding value of the entry to be added into AttributeUpdates.
     */
    public UpdateItemRequest addAttributeUpdatesEntry(String key, AttributeValueUpdate value) {
        if (null == this.attributeUpdates) {
            this.attributeUpdates = new java.util.HashMap<String,AttributeValueUpdate>();
        }
        if (this.attributeUpdates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributeUpdates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AttributeUpdates.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public UpdateItemRequest clearAttributeUpdatesEntries() {
        this.attributeUpdates = null;
        return this;
    }
    
    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>UpdateItem</i> operation. <p>Each element of <i>Expected</i>
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
     *         the <i>UpdateItem</i> operation. <p>Each element of <i>Expected</i>
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
     * the <i>UpdateItem</i> operation. <p>Each element of <i>Expected</i>
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
     *         the <i>UpdateItem</i> operation. <p>Each element of <i>Expected</i>
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
     * the <i>UpdateItem</i> operation. <p>Each element of <i>Expected</i>
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
     *         the <i>UpdateItem</i> operation. <p>Each element of <i>Expected</i>
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
    public UpdateItemRequest withExpected(java.util.Map<String,ExpectedAttributeValue> expected) {
        setExpected(expected);
        return this;
    }

    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>UpdateItem</i> operation. <p>Each element of <i>Expected</i>
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
    public UpdateItemRequest addExpectedEntry(String key, ExpectedAttributeValue value) {
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
    public UpdateItemRequest clearExpectedEntries() {
        this.expected = null;
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
    public UpdateItemRequest withConditionalOperator(String conditionalOperator) {
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
    public UpdateItemRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
        return this;
    }

    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared either before or after they were updated. For
     * <i>UpdateItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This is the
     * default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     * If <i>UpdateItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> <li>
     * <p><code>UPDATED_OLD</code> - The old versions of only the updated
     * attributes are returned. </li> <li> <p><code>ALL_NEW</code> - All of
     * the attributes of the new version of the item are returned. </li> <li>
     * <p><code>UPDATED_NEW</code> - The new versions of only the updated
     * attributes are returned. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @return Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared either before or after they were updated. For
     *         <i>UpdateItem</i>, the valid values are: <ul> <li>
     *         <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     *         its value is <code>NONE</code>, then nothing is returned. (This is the
     *         default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     *         If <i>UpdateItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> <li>
     *         <p><code>UPDATED_OLD</code> - The old versions of only the updated
     *         attributes are returned. </li> <li> <p><code>ALL_NEW</code> - All of
     *         the attributes of the new version of the item are returned. </li> <li>
     *         <p><code>UPDATED_NEW</code> - The new versions of only the updated
     *         attributes are returned. </li> </ul>
     *
     * @see ReturnValue
     */
    public String getReturnValues() {
        return returnValues;
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared either before or after they were updated. For
     * <i>UpdateItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This is the
     * default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     * If <i>UpdateItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> <li>
     * <p><code>UPDATED_OLD</code> - The old versions of only the updated
     * attributes are returned. </li> <li> <p><code>ALL_NEW</code> - All of
     * the attributes of the new version of the item are returned. </li> <li>
     * <p><code>UPDATED_NEW</code> - The new versions of only the updated
     * attributes are returned. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared either before or after they were updated. For
     *         <i>UpdateItem</i>, the valid values are: <ul> <li>
     *         <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     *         its value is <code>NONE</code>, then nothing is returned. (This is the
     *         default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     *         If <i>UpdateItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> <li>
     *         <p><code>UPDATED_OLD</code> - The old versions of only the updated
     *         attributes are returned. </li> <li> <p><code>ALL_NEW</code> - All of
     *         the attributes of the new version of the item are returned. </li> <li>
     *         <p><code>UPDATED_NEW</code> - The new versions of only the updated
     *         attributes are returned. </li> </ul>
     *
     * @see ReturnValue
     */
    public void setReturnValues(String returnValues) {
        this.returnValues = returnValues;
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared either before or after they were updated. For
     * <i>UpdateItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This is the
     * default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     * If <i>UpdateItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> <li>
     * <p><code>UPDATED_OLD</code> - The old versions of only the updated
     * attributes are returned. </li> <li> <p><code>ALL_NEW</code> - All of
     * the attributes of the new version of the item are returned. </li> <li>
     * <p><code>UPDATED_NEW</code> - The new versions of only the updated
     * attributes are returned. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared either before or after they were updated. For
     *         <i>UpdateItem</i>, the valid values are: <ul> <li>
     *         <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     *         its value is <code>NONE</code>, then nothing is returned. (This is the
     *         default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     *         If <i>UpdateItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> <li>
     *         <p><code>UPDATED_OLD</code> - The old versions of only the updated
     *         attributes are returned. </li> <li> <p><code>ALL_NEW</code> - All of
     *         the attributes of the new version of the item are returned. </li> <li>
     *         <p><code>UPDATED_NEW</code> - The new versions of only the updated
     *         attributes are returned. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReturnValue
     */
    public UpdateItemRequest withReturnValues(String returnValues) {
        this.returnValues = returnValues;
        return this;
    }

    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared either before or after they were updated. For
     * <i>UpdateItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This is the
     * default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     * If <i>UpdateItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> <li>
     * <p><code>UPDATED_OLD</code> - The old versions of only the updated
     * attributes are returned. </li> <li> <p><code>ALL_NEW</code> - All of
     * the attributes of the new version of the item are returned. </li> <li>
     * <p><code>UPDATED_NEW</code> - The new versions of only the updated
     * attributes are returned. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared either before or after they were updated. For
     *         <i>UpdateItem</i>, the valid values are: <ul> <li>
     *         <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     *         its value is <code>NONE</code>, then nothing is returned. (This is the
     *         default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     *         If <i>UpdateItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> <li>
     *         <p><code>UPDATED_OLD</code> - The old versions of only the updated
     *         attributes are returned. </li> <li> <p><code>ALL_NEW</code> - All of
     *         the attributes of the new version of the item are returned. </li> <li>
     *         <p><code>UPDATED_NEW</code> - The new versions of only the updated
     *         attributes are returned. </li> </ul>
     *
     * @see ReturnValue
     */
    public void setReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared either before or after they were updated. For
     * <i>UpdateItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This is the
     * default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     * If <i>UpdateItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> <li>
     * <p><code>UPDATED_OLD</code> - The old versions of only the updated
     * attributes are returned. </li> <li> <p><code>ALL_NEW</code> - All of
     * the attributes of the new version of the item are returned. </li> <li>
     * <p><code>UPDATED_NEW</code> - The new versions of only the updated
     * attributes are returned. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared either before or after they were updated. For
     *         <i>UpdateItem</i>, the valid values are: <ul> <li>
     *         <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     *         its value is <code>NONE</code>, then nothing is returned. (This is the
     *         default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     *         If <i>UpdateItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> <li>
     *         <p><code>UPDATED_OLD</code> - The old versions of only the updated
     *         attributes are returned. </li> <li> <p><code>ALL_NEW</code> - All of
     *         the attributes of the new version of the item are returned. </li> <li>
     *         <p><code>UPDATED_NEW</code> - The new versions of only the updated
     *         attributes are returned. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReturnValue
     */
    public UpdateItemRequest withReturnValues(ReturnValue returnValues) {
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
    public UpdateItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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
    public UpdateItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
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
    public UpdateItemRequest withReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
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
    public UpdateItemRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
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
        if (getAttributeUpdates() != null) sb.append("AttributeUpdates: " + getAttributeUpdates() + ",");
        if (getExpected() != null) sb.append("Expected: " + getExpected() + ",");
        if (getConditionalOperator() != null) sb.append("ConditionalOperator: " + getConditionalOperator() + ",");
        if (getReturnValues() != null) sb.append("ReturnValues: " + getReturnValues() + ",");
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getReturnItemCollectionMetrics() != null) sb.append("ReturnItemCollectionMetrics: " + getReturnItemCollectionMetrics() );
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateItemRequest == false) return false;
        UpdateItemRequest other = (UpdateItemRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getAttributeUpdates() == null ^ this.getAttributeUpdates() == null) return false;
        if (other.getAttributeUpdates() != null && other.getAttributeUpdates().equals(this.getAttributeUpdates()) == false) return false; 
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
        return true;
    }
    
}
    