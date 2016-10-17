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
 * Represents the input of an <i>UpdateItem</i> operation.
 * </p>
 */
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
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>UpdateExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter can be used for modifying top-level attributes; however, it does not support individual list or
     * map elements.
     * </p>
     * </important>
     * <p>
     * The names of attributes to be modified, the action to perform on each, and the new value for each. If you are
     * updating an attribute that is an index key attribute for any indexes on that table, the attribute type must match
     * the index key type defined in the <i>AttributesDefinition</i> of the table description. You can use
     * <i>UpdateItem</i> to update any non-key attributes.
     * </p>
     * <p>
     * Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero. Set type
     * attributes must not be empty. Requests with empty values will be rejected with a <i>ValidationException</i>
     * exception.
     * </p>
     * <p>
     * Each <i>AttributeUpdates</i> element consists of an attribute name to modify, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Value</i> - The new value, if applicable, for this attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Action</i> - A value that specifies how to perform the update. This action is only valid for an existing
     * attribute whose data type is Number or is a set; do not use <code>ADD</code> for other data types.
     * </p>
     * <p>
     * If an item with the specified primary key is found in the table, the following values perform the following
     * actions:
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
     * <code>DELETE</code> - Removes the attribute and its value, if no value is specified for <code>DELETE</code>. The
     * data type of the specified value must match the existing value's data type.
     * </p>
     * <p>
     * If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute
     * value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies <code>[a,c]</code>, then the
     * final attribute value is <code>[b]</code>. Specifying an empty set is an error.
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
     * If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is mathematically
     * added to the existing attribute. If <i>Value</i> is a negative number, then it is subtracted from the existing
     * attribute.
     * </p>
     * <note>
     * <p>
     * If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the
     * update, DynamoDB uses 0 as the initial value.
     * </p>
     * <p>
     * Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value that
     * doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example, suppose that the
     * item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide to <code>ADD</code> the
     * number <code>3</code> to this attribute anyway. DynamoDB will create the <i>itemcount</i> attribute, set its
     * initial value to <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i>
     * attribute, with a value of <code>3</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If the existing data type is a set, and if <i>Value</i> is also a set, then <i>Value</i> is appended to the
     * existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code> action
     * specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs if an
     * <code>ADD</code> action is specified for a set attribute and the attribute type specified does not match the
     * existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings,
     * <i>Value</i> must also be a set of strings.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If no item with the specified key is found in the table, the following values perform the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - Causes DynamoDB to create a new item with the specified primary key, and then adds the
     * attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - Nothing happens, because attributes cannot be deleted from a nonexistent item. The
     * operation succeeds, but DynamoDB does not create a new item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - Causes DynamoDB to create an item with the supplied primary key and number (or set of numbers)
     * for the attribute value. The only data types allowed are Number and Number Set.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If you provide any attributes that are part of an index key, then the data types for those attributes must match
     * those of the schema in the table's attribute definition.
     * </p>
     */
    private java.util.Map<String, AttributeValueUpdate> attributeUpdates;
    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i> ConditionExpression </i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A map of attribute/condition pairs. <i>Expected</i> provides a conditional block for the <i>UpdateItem</i>
     * operation.
     * </p>
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
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     */
    private java.util.Map<String, ExpectedAttributeValue> expected;
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
     * Use <i>ReturnValues</i> if you want to get the item attributes as they appeared either before or after they were
     * updated. For <i>UpdateItem</i>, the valid values are:
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
     * <code>ALL_OLD</code> - If <i>UpdateItem</i> overwrote an attribute name-value pair, then the content of the old
     * item is returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OLD</code> - The old versions of only the updated attributes are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_NEW</code> - All of the attributes of the new version of the item are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_NEW</code> - The new versions of only the updated attributes are returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is no additional cost associated with requesting a return value aside from the small network and processing
     * overhead of receiving a larger response. No Read Capacity Units are consumed.
     * </p>
     * <p>
     * Values returned are strongly consistent
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
     * The following action values are available for <i>UpdateExpression</i>.
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
     * If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is mathematically
     * added to the existing attribute. If <i>Value</i> is a negative number, then it is subtracted from the existing
     * attribute.
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
     * If the existing data type is a set and if <i>Value</i> is also a set, then <i>Value</i> is added to the existing
     * set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code> action specified
     * <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs if an <code>ADD</code>
     * action is specified for a set attribute and the attribute type specified does not match the existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings.
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html">Modifying Items
     * and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>UpdateExpression</i> replaces the legacy <i>AttributeUpdates</i> parameter.
     * </p>
     * </note>
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
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>UpdateExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        <p>
     *        This parameter can be used for modifying top-level attributes; however, it does not support individual
     *        list or map elements.
     *        </p>
     *        </important>
     *        <p>
     *        The names of attributes to be modified, the action to perform on each, and the new value for each. If you
     *        are updating an attribute that is an index key attribute for any indexes on that table, the attribute type
     *        must match the index key type defined in the <i>AttributesDefinition</i> of the table description. You can
     *        use <i>UpdateItem</i> to update any non-key attributes.
     *        </p>
     *        <p>
     *        Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero.
     *        Set type attributes must not be empty. Requests with empty values will be rejected with a
     *        <i>ValidationException</i> exception.
     *        </p>
     *        <p>
     *        Each <i>AttributeUpdates</i> element consists of an attribute name to modify, along with the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Value</i> - The new value, if applicable, for this attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Action</i> - A value that specifies how to perform the update. This action is only valid for an
     *        existing attribute whose data type is Number or is a set; do not use <code>ADD</code> for other data
     *        types.
     *        </p>
     *        <p>
     *        If an item with the specified primary key is found in the table, the following values perform the
     *        following actions:
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
     *        <code>DELETE</code> - Removes the attribute and its value, if no value is specified for
     *        <code>DELETE</code>. The data type of the specified value must match the existing value's data type.
     *        </p>
     *        <p>
     *        If a set of values is specified, then those values are subtracted from the old set. For example, if the
     *        attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies
     *        <code>[a,c]</code>, then the final attribute value is <code>[b]</code>. Specifying an empty set is an
     *        error.
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
     *        If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is
     *        mathematically added to the existing attribute. If <i>Value</i> is a negative number, then it is
     *        subtracted from the existing attribute.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before
     *        the update, DynamoDB uses 0 as the initial value.
     *        </p>
     *        <p>
     *        Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value
     *        that doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example,
     *        suppose that the item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide
     *        to <code>ADD</code> the number <code>3</code> to this attribute anyway. DynamoDB will create the
     *        <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add <code>3</code> to it.
     *        The result will be a new <i>itemcount</i> attribute, with a value of <code>3</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        If the existing data type is a set, and if <i>Value</i> is also a set, then <i>Value</i> is appended to
     *        the existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the
     *        <code>ADD</code> action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>
     *        . An error occurs if an <code>ADD</code> action is specified for a set attribute and the attribute type
     *        specified does not match the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, <i>Value</i> must also be a set of strings.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        If no item with the specified key is found in the table, the following values perform the following
     *        actions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - Causes DynamoDB to create a new item with the specified primary key, and then adds the
     *        attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - Nothing happens, because attributes cannot be deleted from a nonexistent item. The
     *        operation succeeds, but DynamoDB does not create a new item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - Causes DynamoDB to create an item with the supplied primary key and number (or set of
     *        numbers) for the attribute value. The only data types allowed are Number and Number Set.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        If you provide any attributes that are part of an index key, then the data types for those attributes must
     *        match those of the schema in the table's attribute definition.
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
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>UpdateExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        <p>
     *        This parameter can be used for modifying top-level attributes; however, it does not support individual
     *        list or map elements.
     *        </p>
     *        </important>
     *        <p>
     *        The names of attributes to be modified, the action to perform on each, and the new value for each. If you
     *        are updating an attribute that is an index key attribute for any indexes on that table, the attribute type
     *        must match the index key type defined in the <i>AttributesDefinition</i> of the table description. You can
     *        use <i>UpdateItem</i> to update any non-key attributes.
     *        </p>
     *        <p>
     *        Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero.
     *        Set type attributes must not be empty. Requests with empty values will be rejected with a
     *        <i>ValidationException</i> exception.
     *        </p>
     *        <p>
     *        Each <i>AttributeUpdates</i> element consists of an attribute name to modify, along with the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Value</i> - The new value, if applicable, for this attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Action</i> - A value that specifies how to perform the update. This action is only valid for an
     *        existing attribute whose data type is Number or is a set; do not use <code>ADD</code> for other data
     *        types.
     *        </p>
     *        <p>
     *        If an item with the specified primary key is found in the table, the following values perform the
     *        following actions:
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
     *        <code>DELETE</code> - Removes the attribute and its value, if no value is specified for
     *        <code>DELETE</code>. The data type of the specified value must match the existing value's data type.
     *        </p>
     *        <p>
     *        If a set of values is specified, then those values are subtracted from the old set. For example, if the
     *        attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies
     *        <code>[a,c]</code>, then the final attribute value is <code>[b]</code>. Specifying an empty set is an
     *        error.
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
     *        If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is
     *        mathematically added to the existing attribute. If <i>Value</i> is a negative number, then it is
     *        subtracted from the existing attribute.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before
     *        the update, DynamoDB uses 0 as the initial value.
     *        </p>
     *        <p>
     *        Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value
     *        that doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example,
     *        suppose that the item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide
     *        to <code>ADD</code> the number <code>3</code> to this attribute anyway. DynamoDB will create the
     *        <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add <code>3</code> to it.
     *        The result will be a new <i>itemcount</i> attribute, with a value of <code>3</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        If the existing data type is a set, and if <i>Value</i> is also a set, then <i>Value</i> is appended to
     *        the existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the
     *        <code>ADD</code> action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>
     *        . An error occurs if an <code>ADD</code> action is specified for a set attribute and the attribute type
     *        specified does not match the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, <i>Value</i> must also be a set of strings.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        If no item with the specified key is found in the table, the following values perform the following
     *        actions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - Causes DynamoDB to create a new item with the specified primary key, and then adds the
     *        attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - Nothing happens, because attributes cannot be deleted from a nonexistent item. The
     *        operation succeeds, but DynamoDB does not create a new item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - Causes DynamoDB to create an item with the supplied primary key and number (or set of
     *        numbers) for the attribute value. The only data types allowed are Number and Number Set.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        If you provide any attributes that are part of an index key, then the data types for those attributes must
     *        match those of the schema in the table's attribute definition.
     * @param returnValues
     *        Use <i>ReturnValues</i> if you want to get the item attributes as they appeared either before or after
     *        they were updated. For <i>UpdateItem</i>, the valid values are:
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
     *        <code>ALL_OLD</code> - If <i>UpdateItem</i> overwrote an attribute name-value pair, then the content of
     *        the old item is returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OLD</code> - The old versions of only the updated attributes are returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_NEW</code> - All of the attributes of the new version of the item are returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_NEW</code> - The new versions of only the updated attributes are returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is no additional cost associated with requesting a return value aside from the small network and
     *        processing overhead of receiving a larger response. No Read Capacity Units are consumed.
     *        </p>
     *        <p>
     *        Values returned are strongly consistent
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
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>UpdateExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        <p>
     *        This parameter can be used for modifying top-level attributes; however, it does not support individual
     *        list or map elements.
     *        </p>
     *        </important>
     *        <p>
     *        The names of attributes to be modified, the action to perform on each, and the new value for each. If you
     *        are updating an attribute that is an index key attribute for any indexes on that table, the attribute type
     *        must match the index key type defined in the <i>AttributesDefinition</i> of the table description. You can
     *        use <i>UpdateItem</i> to update any non-key attributes.
     *        </p>
     *        <p>
     *        Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero.
     *        Set type attributes must not be empty. Requests with empty values will be rejected with a
     *        <i>ValidationException</i> exception.
     *        </p>
     *        <p>
     *        Each <i>AttributeUpdates</i> element consists of an attribute name to modify, along with the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Value</i> - The new value, if applicable, for this attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Action</i> - A value that specifies how to perform the update. This action is only valid for an
     *        existing attribute whose data type is Number or is a set; do not use <code>ADD</code> for other data
     *        types.
     *        </p>
     *        <p>
     *        If an item with the specified primary key is found in the table, the following values perform the
     *        following actions:
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
     *        <code>DELETE</code> - Removes the attribute and its value, if no value is specified for
     *        <code>DELETE</code>. The data type of the specified value must match the existing value's data type.
     *        </p>
     *        <p>
     *        If a set of values is specified, then those values are subtracted from the old set. For example, if the
     *        attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies
     *        <code>[a,c]</code>, then the final attribute value is <code>[b]</code>. Specifying an empty set is an
     *        error.
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
     *        If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is
     *        mathematically added to the existing attribute. If <i>Value</i> is a negative number, then it is
     *        subtracted from the existing attribute.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before
     *        the update, DynamoDB uses 0 as the initial value.
     *        </p>
     *        <p>
     *        Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value
     *        that doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example,
     *        suppose that the item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide
     *        to <code>ADD</code> the number <code>3</code> to this attribute anyway. DynamoDB will create the
     *        <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add <code>3</code> to it.
     *        The result will be a new <i>itemcount</i> attribute, with a value of <code>3</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        If the existing data type is a set, and if <i>Value</i> is also a set, then <i>Value</i> is appended to
     *        the existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the
     *        <code>ADD</code> action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>
     *        . An error occurs if an <code>ADD</code> action is specified for a set attribute and the attribute type
     *        specified does not match the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, <i>Value</i> must also be a set of strings.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        If no item with the specified key is found in the table, the following values perform the following
     *        actions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - Causes DynamoDB to create a new item with the specified primary key, and then adds the
     *        attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - Nothing happens, because attributes cannot be deleted from a nonexistent item. The
     *        operation succeeds, but DynamoDB does not create a new item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - Causes DynamoDB to create an item with the supplied primary key and number (or set of
     *        numbers) for the attribute value. The only data types allowed are Number and Number Set.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        If you provide any attributes that are part of an index key, then the data types for those attributes must
     *        match those of the schema in the table's attribute definition.
     * @param returnValues
     *        Use <i>ReturnValues</i> if you want to get the item attributes as they appeared either before or after
     *        they were updated. For <i>UpdateItem</i>, the valid values are:
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
     *        <code>ALL_OLD</code> - If <i>UpdateItem</i> overwrote an attribute name-value pair, then the content of
     *        the old item is returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OLD</code> - The old versions of only the updated attributes are returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_NEW</code> - All of the attributes of the new version of the item are returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_NEW</code> - The new versions of only the updated attributes are returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is no additional cost associated with requesting a return value aside from the small network and
     *        processing overhead of receiving a larger response. No Read Capacity Units are consumed.
     *        </p>
     *        <p>
     *        Values returned are strongly consistent
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
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>UpdateExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter can be used for modifying top-level attributes; however, it does not support individual list or
     * map elements.
     * </p>
     * </important>
     * <p>
     * The names of attributes to be modified, the action to perform on each, and the new value for each. If you are
     * updating an attribute that is an index key attribute for any indexes on that table, the attribute type must match
     * the index key type defined in the <i>AttributesDefinition</i> of the table description. You can use
     * <i>UpdateItem</i> to update any non-key attributes.
     * </p>
     * <p>
     * Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero. Set type
     * attributes must not be empty. Requests with empty values will be rejected with a <i>ValidationException</i>
     * exception.
     * </p>
     * <p>
     * Each <i>AttributeUpdates</i> element consists of an attribute name to modify, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Value</i> - The new value, if applicable, for this attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Action</i> - A value that specifies how to perform the update. This action is only valid for an existing
     * attribute whose data type is Number or is a set; do not use <code>ADD</code> for other data types.
     * </p>
     * <p>
     * If an item with the specified primary key is found in the table, the following values perform the following
     * actions:
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
     * <code>DELETE</code> - Removes the attribute and its value, if no value is specified for <code>DELETE</code>. The
     * data type of the specified value must match the existing value's data type.
     * </p>
     * <p>
     * If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute
     * value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies <code>[a,c]</code>, then the
     * final attribute value is <code>[b]</code>. Specifying an empty set is an error.
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
     * If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is mathematically
     * added to the existing attribute. If <i>Value</i> is a negative number, then it is subtracted from the existing
     * attribute.
     * </p>
     * <note>
     * <p>
     * If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the
     * update, DynamoDB uses 0 as the initial value.
     * </p>
     * <p>
     * Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value that
     * doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example, suppose that the
     * item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide to <code>ADD</code> the
     * number <code>3</code> to this attribute anyway. DynamoDB will create the <i>itemcount</i> attribute, set its
     * initial value to <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i>
     * attribute, with a value of <code>3</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If the existing data type is a set, and if <i>Value</i> is also a set, then <i>Value</i> is appended to the
     * existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code> action
     * specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs if an
     * <code>ADD</code> action is specified for a set attribute and the attribute type specified does not match the
     * existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings,
     * <i>Value</i> must also be a set of strings.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If no item with the specified key is found in the table, the following values perform the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - Causes DynamoDB to create a new item with the specified primary key, and then adds the
     * attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - Nothing happens, because attributes cannot be deleted from a nonexistent item. The
     * operation succeeds, but DynamoDB does not create a new item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - Causes DynamoDB to create an item with the supplied primary key and number (or set of numbers)
     * for the attribute value. The only data types allowed are Number and Number Set.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If you provide any attributes that are part of an index key, then the data types for those attributes must match
     * those of the schema in the table's attribute definition.
     * </p>
     * 
     * @return <p>
     *         This is a legacy parameter, for backward compatibility. New applications should use
     *         <i>UpdateExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *         API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *         </p>
     *         <p>
     *         This parameter can be used for modifying top-level attributes; however, it does not support individual
     *         list or map elements.
     *         </p>
     *         </important>
     *         <p>
     *         The names of attributes to be modified, the action to perform on each, and the new value for each. If you
     *         are updating an attribute that is an index key attribute for any indexes on that table, the attribute
     *         type must match the index key type defined in the <i>AttributesDefinition</i> of the table description.
     *         You can use <i>UpdateItem</i> to update any non-key attributes.
     *         </p>
     *         <p>
     *         Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero.
     *         Set type attributes must not be empty. Requests with empty values will be rejected with a
     *         <i>ValidationException</i> exception.
     *         </p>
     *         <p>
     *         Each <i>AttributeUpdates</i> element consists of an attribute name to modify, along with the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Value</i> - The new value, if applicable, for this attribute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Action</i> - A value that specifies how to perform the update. This action is only valid for an
     *         existing attribute whose data type is Number or is a set; do not use <code>ADD</code> for other data
     *         types.
     *         </p>
     *         <p>
     *         If an item with the specified primary key is found in the table, the following values perform the
     *         following actions:
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
     *         <code>DELETE</code> - Removes the attribute and its value, if no value is specified for
     *         <code>DELETE</code>. The data type of the specified value must match the existing value's data type.
     *         </p>
     *         <p>
     *         If a set of values is specified, then those values are subtracted from the old set. For example, if the
     *         attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies
     *         <code>[a,c]</code>, then the final attribute value is <code>[b]</code>. Specifying an empty set is an
     *         error.
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
     *         If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is
     *         mathematically added to the existing attribute. If <i>Value</i> is a negative number, then it is
     *         subtracted from the existing attribute.
     *         </p>
     *         <note>
     *         <p>
     *         If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist
     *         before the update, DynamoDB uses 0 as the initial value.
     *         </p>
     *         <p>
     *         Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value
     *         that doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example,
     *         suppose that the item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide
     *         to <code>ADD</code> the number <code>3</code> to this attribute anyway. DynamoDB will create the
     *         <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add <code>3</code> to
     *         it. The result will be a new <i>itemcount</i> attribute, with a value of <code>3</code>.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         If the existing data type is a set, and if <i>Value</i> is also a set, then <i>Value</i> is appended to
     *         the existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the
     *         <code>ADD</code> action specified <code>[3]</code>, then the final attribute value is
     *         <code>[1,2,3]</code>. An error occurs if an <code>ADD</code> action is specified for a set attribute and
     *         the attribute type specified does not match the existing set type.
     *         </p>
     *         <p>
     *         Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *         strings, <i>Value</i> must also be a set of strings.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         If no item with the specified key is found in the table, the following values perform the following
     *         actions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PUT</code> - Causes DynamoDB to create a new item with the specified primary key, and then adds the
     *         attribute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE</code> - Nothing happens, because attributes cannot be deleted from a nonexistent item. The
     *         operation succeeds, but DynamoDB does not create a new item.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADD</code> - Causes DynamoDB to create an item with the supplied primary key and number (or set of
     *         numbers) for the attribute value. The only data types allowed are Number and Number Set.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         If you provide any attributes that are part of an index key, then the data types for those attributes
     *         must match those of the schema in the table's attribute definition.
     */

    public java.util.Map<String, AttributeValueUpdate> getAttributeUpdates() {
        return attributeUpdates;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>UpdateExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter can be used for modifying top-level attributes; however, it does not support individual list or
     * map elements.
     * </p>
     * </important>
     * <p>
     * The names of attributes to be modified, the action to perform on each, and the new value for each. If you are
     * updating an attribute that is an index key attribute for any indexes on that table, the attribute type must match
     * the index key type defined in the <i>AttributesDefinition</i> of the table description. You can use
     * <i>UpdateItem</i> to update any non-key attributes.
     * </p>
     * <p>
     * Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero. Set type
     * attributes must not be empty. Requests with empty values will be rejected with a <i>ValidationException</i>
     * exception.
     * </p>
     * <p>
     * Each <i>AttributeUpdates</i> element consists of an attribute name to modify, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Value</i> - The new value, if applicable, for this attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Action</i> - A value that specifies how to perform the update. This action is only valid for an existing
     * attribute whose data type is Number or is a set; do not use <code>ADD</code> for other data types.
     * </p>
     * <p>
     * If an item with the specified primary key is found in the table, the following values perform the following
     * actions:
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
     * <code>DELETE</code> - Removes the attribute and its value, if no value is specified for <code>DELETE</code>. The
     * data type of the specified value must match the existing value's data type.
     * </p>
     * <p>
     * If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute
     * value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies <code>[a,c]</code>, then the
     * final attribute value is <code>[b]</code>. Specifying an empty set is an error.
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
     * If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is mathematically
     * added to the existing attribute. If <i>Value</i> is a negative number, then it is subtracted from the existing
     * attribute.
     * </p>
     * <note>
     * <p>
     * If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the
     * update, DynamoDB uses 0 as the initial value.
     * </p>
     * <p>
     * Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value that
     * doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example, suppose that the
     * item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide to <code>ADD</code> the
     * number <code>3</code> to this attribute anyway. DynamoDB will create the <i>itemcount</i> attribute, set its
     * initial value to <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i>
     * attribute, with a value of <code>3</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If the existing data type is a set, and if <i>Value</i> is also a set, then <i>Value</i> is appended to the
     * existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code> action
     * specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs if an
     * <code>ADD</code> action is specified for a set attribute and the attribute type specified does not match the
     * existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings,
     * <i>Value</i> must also be a set of strings.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If no item with the specified key is found in the table, the following values perform the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - Causes DynamoDB to create a new item with the specified primary key, and then adds the
     * attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - Nothing happens, because attributes cannot be deleted from a nonexistent item. The
     * operation succeeds, but DynamoDB does not create a new item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - Causes DynamoDB to create an item with the supplied primary key and number (or set of numbers)
     * for the attribute value. The only data types allowed are Number and Number Set.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If you provide any attributes that are part of an index key, then the data types for those attributes must match
     * those of the schema in the table's attribute definition.
     * </p>
     * 
     * @param attributeUpdates
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>UpdateExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        <p>
     *        This parameter can be used for modifying top-level attributes; however, it does not support individual
     *        list or map elements.
     *        </p>
     *        </important>
     *        <p>
     *        The names of attributes to be modified, the action to perform on each, and the new value for each. If you
     *        are updating an attribute that is an index key attribute for any indexes on that table, the attribute type
     *        must match the index key type defined in the <i>AttributesDefinition</i> of the table description. You can
     *        use <i>UpdateItem</i> to update any non-key attributes.
     *        </p>
     *        <p>
     *        Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero.
     *        Set type attributes must not be empty. Requests with empty values will be rejected with a
     *        <i>ValidationException</i> exception.
     *        </p>
     *        <p>
     *        Each <i>AttributeUpdates</i> element consists of an attribute name to modify, along with the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Value</i> - The new value, if applicable, for this attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Action</i> - A value that specifies how to perform the update. This action is only valid for an
     *        existing attribute whose data type is Number or is a set; do not use <code>ADD</code> for other data
     *        types.
     *        </p>
     *        <p>
     *        If an item with the specified primary key is found in the table, the following values perform the
     *        following actions:
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
     *        <code>DELETE</code> - Removes the attribute and its value, if no value is specified for
     *        <code>DELETE</code>. The data type of the specified value must match the existing value's data type.
     *        </p>
     *        <p>
     *        If a set of values is specified, then those values are subtracted from the old set. For example, if the
     *        attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies
     *        <code>[a,c]</code>, then the final attribute value is <code>[b]</code>. Specifying an empty set is an
     *        error.
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
     *        If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is
     *        mathematically added to the existing attribute. If <i>Value</i> is a negative number, then it is
     *        subtracted from the existing attribute.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before
     *        the update, DynamoDB uses 0 as the initial value.
     *        </p>
     *        <p>
     *        Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value
     *        that doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example,
     *        suppose that the item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide
     *        to <code>ADD</code> the number <code>3</code> to this attribute anyway. DynamoDB will create the
     *        <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add <code>3</code> to it.
     *        The result will be a new <i>itemcount</i> attribute, with a value of <code>3</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        If the existing data type is a set, and if <i>Value</i> is also a set, then <i>Value</i> is appended to
     *        the existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the
     *        <code>ADD</code> action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>
     *        . An error occurs if an <code>ADD</code> action is specified for a set attribute and the attribute type
     *        specified does not match the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, <i>Value</i> must also be a set of strings.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        If no item with the specified key is found in the table, the following values perform the following
     *        actions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - Causes DynamoDB to create a new item with the specified primary key, and then adds the
     *        attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - Nothing happens, because attributes cannot be deleted from a nonexistent item. The
     *        operation succeeds, but DynamoDB does not create a new item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - Causes DynamoDB to create an item with the supplied primary key and number (or set of
     *        numbers) for the attribute value. The only data types allowed are Number and Number Set.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        If you provide any attributes that are part of an index key, then the data types for those attributes must
     *        match those of the schema in the table's attribute definition.
     */

    public void setAttributeUpdates(java.util.Map<String, AttributeValueUpdate> attributeUpdates) {
        this.attributeUpdates = attributeUpdates;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>UpdateExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter can be used for modifying top-level attributes; however, it does not support individual list or
     * map elements.
     * </p>
     * </important>
     * <p>
     * The names of attributes to be modified, the action to perform on each, and the new value for each. If you are
     * updating an attribute that is an index key attribute for any indexes on that table, the attribute type must match
     * the index key type defined in the <i>AttributesDefinition</i> of the table description. You can use
     * <i>UpdateItem</i> to update any non-key attributes.
     * </p>
     * <p>
     * Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero. Set type
     * attributes must not be empty. Requests with empty values will be rejected with a <i>ValidationException</i>
     * exception.
     * </p>
     * <p>
     * Each <i>AttributeUpdates</i> element consists of an attribute name to modify, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Value</i> - The new value, if applicable, for this attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Action</i> - A value that specifies how to perform the update. This action is only valid for an existing
     * attribute whose data type is Number or is a set; do not use <code>ADD</code> for other data types.
     * </p>
     * <p>
     * If an item with the specified primary key is found in the table, the following values perform the following
     * actions:
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
     * <code>DELETE</code> - Removes the attribute and its value, if no value is specified for <code>DELETE</code>. The
     * data type of the specified value must match the existing value's data type.
     * </p>
     * <p>
     * If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute
     * value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies <code>[a,c]</code>, then the
     * final attribute value is <code>[b]</code>. Specifying an empty set is an error.
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
     * If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is mathematically
     * added to the existing attribute. If <i>Value</i> is a negative number, then it is subtracted from the existing
     * attribute.
     * </p>
     * <note>
     * <p>
     * If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the
     * update, DynamoDB uses 0 as the initial value.
     * </p>
     * <p>
     * Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value that
     * doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example, suppose that the
     * item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide to <code>ADD</code> the
     * number <code>3</code> to this attribute anyway. DynamoDB will create the <i>itemcount</i> attribute, set its
     * initial value to <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i>
     * attribute, with a value of <code>3</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If the existing data type is a set, and if <i>Value</i> is also a set, then <i>Value</i> is appended to the
     * existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code> action
     * specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs if an
     * <code>ADD</code> action is specified for a set attribute and the attribute type specified does not match the
     * existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings,
     * <i>Value</i> must also be a set of strings.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If no item with the specified key is found in the table, the following values perform the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUT</code> - Causes DynamoDB to create a new item with the specified primary key, and then adds the
     * attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - Nothing happens, because attributes cannot be deleted from a nonexistent item. The
     * operation succeeds, but DynamoDB does not create a new item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADD</code> - Causes DynamoDB to create an item with the supplied primary key and number (or set of numbers)
     * for the attribute value. The only data types allowed are Number and Number Set.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If you provide any attributes that are part of an index key, then the data types for those attributes must match
     * those of the schema in the table's attribute definition.
     * </p>
     * 
     * @param attributeUpdates
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>UpdateExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        <p>
     *        This parameter can be used for modifying top-level attributes; however, it does not support individual
     *        list or map elements.
     *        </p>
     *        </important>
     *        <p>
     *        The names of attributes to be modified, the action to perform on each, and the new value for each. If you
     *        are updating an attribute that is an index key attribute for any indexes on that table, the attribute type
     *        must match the index key type defined in the <i>AttributesDefinition</i> of the table description. You can
     *        use <i>UpdateItem</i> to update any non-key attributes.
     *        </p>
     *        <p>
     *        Attribute values cannot be null. String and Binary type attributes must have lengths greater than zero.
     *        Set type attributes must not be empty. Requests with empty values will be rejected with a
     *        <i>ValidationException</i> exception.
     *        </p>
     *        <p>
     *        Each <i>AttributeUpdates</i> element consists of an attribute name to modify, along with the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Value</i> - The new value, if applicable, for this attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Action</i> - A value that specifies how to perform the update. This action is only valid for an
     *        existing attribute whose data type is Number or is a set; do not use <code>ADD</code> for other data
     *        types.
     *        </p>
     *        <p>
     *        If an item with the specified primary key is found in the table, the following values perform the
     *        following actions:
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
     *        <code>DELETE</code> - Removes the attribute and its value, if no value is specified for
     *        <code>DELETE</code>. The data type of the specified value must match the existing value's data type.
     *        </p>
     *        <p>
     *        If a set of values is specified, then those values are subtracted from the old set. For example, if the
     *        attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies
     *        <code>[a,c]</code>, then the final attribute value is <code>[b]</code>. Specifying an empty set is an
     *        error.
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
     *        If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is
     *        mathematically added to the existing attribute. If <i>Value</i> is a negative number, then it is
     *        subtracted from the existing attribute.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before
     *        the update, DynamoDB uses 0 as the initial value.
     *        </p>
     *        <p>
     *        Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value
     *        that doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example,
     *        suppose that the item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide
     *        to <code>ADD</code> the number <code>3</code> to this attribute anyway. DynamoDB will create the
     *        <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add <code>3</code> to it.
     *        The result will be a new <i>itemcount</i> attribute, with a value of <code>3</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        If the existing data type is a set, and if <i>Value</i> is also a set, then <i>Value</i> is appended to
     *        the existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the
     *        <code>ADD</code> action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>
     *        . An error occurs if an <code>ADD</code> action is specified for a set attribute and the attribute type
     *        specified does not match the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, <i>Value</i> must also be a set of strings.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        If no item with the specified key is found in the table, the following values perform the following
     *        actions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUT</code> - Causes DynamoDB to create a new item with the specified primary key, and then adds the
     *        attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - Nothing happens, because attributes cannot be deleted from a nonexistent item. The
     *        operation succeeds, but DynamoDB does not create a new item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADD</code> - Causes DynamoDB to create an item with the supplied primary key and number (or set of
     *        numbers) for the attribute value. The only data types allowed are Number and Number Set.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        If you provide any attributes that are part of an index key, then the data types for those attributes must
     *        match those of the schema in the table's attribute definition.
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
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i> ConditionExpression </i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A map of attribute/condition pairs. <i>Expected</i> provides a conditional block for the <i>UpdateItem</i>
     * operation.
     * </p>
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
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * 
     * @return <p>
     *         This is a legacy parameter, for backward compatibility. New applications should use <i>
     *         ConditionExpression </i> instead. Do not combine legacy parameters and expression parameters in a single
     *         API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *         </p>
     *         </important>
     *         <p>
     *         A map of attribute/condition pairs. <i>Expected</i> provides a conditional block for the
     *         <i>UpdateItem</i> operation.
     *         </p>
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
     *         </p>
     *         <note>
     *         <p>
     *         This parameter does not support attributes of type List or Map.
     *         </p>
     */

    public java.util.Map<String, ExpectedAttributeValue> getExpected() {
        return expected;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i> ConditionExpression </i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A map of attribute/condition pairs. <i>Expected</i> provides a conditional block for the <i>UpdateItem</i>
     * operation.
     * </p>
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
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * 
     * @param expected
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use <i>
     *        ConditionExpression </i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A map of attribute/condition pairs. <i>Expected</i> provides a conditional block for the <i>UpdateItem</i>
     *        operation.
     *        </p>
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
     *        </p>
     *        <note>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     */

    public void setExpected(java.util.Map<String, ExpectedAttributeValue> expected) {
        this.expected = expected;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i> ConditionExpression </i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A map of attribute/condition pairs. <i>Expected</i> provides a conditional block for the <i>UpdateItem</i>
     * operation.
     * </p>
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
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * 
     * @param expected
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use <i>
     *        ConditionExpression </i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A map of attribute/condition pairs. <i>Expected</i> provides a conditional block for the <i>UpdateItem</i>
     *        operation.
     *        </p>
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
     *        </p>
     *        <note>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
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

    public UpdateItemRequest withConditionalOperator(String conditionalOperator) {
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

    public UpdateItemRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        setConditionalOperator(conditionalOperator);
        return this;
    }

    /**
     * <p>
     * Use <i>ReturnValues</i> if you want to get the item attributes as they appeared either before or after they were
     * updated. For <i>UpdateItem</i>, the valid values are:
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
     * <code>ALL_OLD</code> - If <i>UpdateItem</i> overwrote an attribute name-value pair, then the content of the old
     * item is returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OLD</code> - The old versions of only the updated attributes are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_NEW</code> - All of the attributes of the new version of the item are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_NEW</code> - The new versions of only the updated attributes are returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is no additional cost associated with requesting a return value aside from the small network and processing
     * overhead of receiving a larger response. No Read Capacity Units are consumed.
     * </p>
     * <p>
     * Values returned are strongly consistent
     * </p>
     * 
     * @param returnValues
     *        Use <i>ReturnValues</i> if you want to get the item attributes as they appeared either before or after
     *        they were updated. For <i>UpdateItem</i>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then
     *        nothing is returned. (This setting is the default for <i>ReturnValues</i>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - If <i>UpdateItem</i> overwrote an attribute name-value pair, then the content of
     *        the old item is returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OLD</code> - The old versions of only the updated attributes are returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_NEW</code> - All of the attributes of the new version of the item are returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_NEW</code> - The new versions of only the updated attributes are returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is no additional cost associated with requesting a return value aside from the small network and
     *        processing overhead of receiving a larger response. No Read Capacity Units are consumed.
     *        </p>
     *        <p>
     *        Values returned are strongly consistent
     * @see ReturnValue
     */

    public void setReturnValues(String returnValues) {
        this.returnValues = returnValues;
    }

    /**
     * <p>
     * Use <i>ReturnValues</i> if you want to get the item attributes as they appeared either before or after they were
     * updated. For <i>UpdateItem</i>, the valid values are:
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
     * <code>ALL_OLD</code> - If <i>UpdateItem</i> overwrote an attribute name-value pair, then the content of the old
     * item is returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OLD</code> - The old versions of only the updated attributes are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_NEW</code> - All of the attributes of the new version of the item are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_NEW</code> - The new versions of only the updated attributes are returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is no additional cost associated with requesting a return value aside from the small network and processing
     * overhead of receiving a larger response. No Read Capacity Units are consumed.
     * </p>
     * <p>
     * Values returned are strongly consistent
     * </p>
     * 
     * @return Use <i>ReturnValues</i> if you want to get the item attributes as they appeared either before or after
     *         they were updated. For <i>UpdateItem</i>, the valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then
     *         nothing is returned. (This setting is the default for <i>ReturnValues</i>.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL_OLD</code> - If <i>UpdateItem</i> overwrote an attribute name-value pair, then the content of
     *         the old item is returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATED_OLD</code> - The old versions of only the updated attributes are returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL_NEW</code> - All of the attributes of the new version of the item are returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATED_NEW</code> - The new versions of only the updated attributes are returned.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         There is no additional cost associated with requesting a return value aside from the small network and
     *         processing overhead of receiving a larger response. No Read Capacity Units are consumed.
     *         </p>
     *         <p>
     *         Values returned are strongly consistent
     * @see ReturnValue
     */

    public String getReturnValues() {
        return this.returnValues;
    }

    /**
     * <p>
     * Use <i>ReturnValues</i> if you want to get the item attributes as they appeared either before or after they were
     * updated. For <i>UpdateItem</i>, the valid values are:
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
     * <code>ALL_OLD</code> - If <i>UpdateItem</i> overwrote an attribute name-value pair, then the content of the old
     * item is returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OLD</code> - The old versions of only the updated attributes are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_NEW</code> - All of the attributes of the new version of the item are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_NEW</code> - The new versions of only the updated attributes are returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is no additional cost associated with requesting a return value aside from the small network and processing
     * overhead of receiving a larger response. No Read Capacity Units are consumed.
     * </p>
     * <p>
     * Values returned are strongly consistent
     * </p>
     * 
     * @param returnValues
     *        Use <i>ReturnValues</i> if you want to get the item attributes as they appeared either before or after
     *        they were updated. For <i>UpdateItem</i>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then
     *        nothing is returned. (This setting is the default for <i>ReturnValues</i>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - If <i>UpdateItem</i> overwrote an attribute name-value pair, then the content of
     *        the old item is returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OLD</code> - The old versions of only the updated attributes are returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_NEW</code> - All of the attributes of the new version of the item are returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_NEW</code> - The new versions of only the updated attributes are returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is no additional cost associated with requesting a return value aside from the small network and
     *        processing overhead of receiving a larger response. No Read Capacity Units are consumed.
     *        </p>
     *        <p>
     *        Values returned are strongly consistent
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnValue
     */

    public UpdateItemRequest withReturnValues(String returnValues) {
        setReturnValues(returnValues);
        return this;
    }

    /**
     * <p>
     * Use <i>ReturnValues</i> if you want to get the item attributes as they appeared either before or after they were
     * updated. For <i>UpdateItem</i>, the valid values are:
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
     * <code>ALL_OLD</code> - If <i>UpdateItem</i> overwrote an attribute name-value pair, then the content of the old
     * item is returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OLD</code> - The old versions of only the updated attributes are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_NEW</code> - All of the attributes of the new version of the item are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_NEW</code> - The new versions of only the updated attributes are returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is no additional cost associated with requesting a return value aside from the small network and processing
     * overhead of receiving a larger response. No Read Capacity Units are consumed.
     * </p>
     * <p>
     * Values returned are strongly consistent
     * </p>
     * 
     * @param returnValues
     *        Use <i>ReturnValues</i> if you want to get the item attributes as they appeared either before or after
     *        they were updated. For <i>UpdateItem</i>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then
     *        nothing is returned. (This setting is the default for <i>ReturnValues</i>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - If <i>UpdateItem</i> overwrote an attribute name-value pair, then the content of
     *        the old item is returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OLD</code> - The old versions of only the updated attributes are returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_NEW</code> - All of the attributes of the new version of the item are returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_NEW</code> - The new versions of only the updated attributes are returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is no additional cost associated with requesting a return value aside from the small network and
     *        processing overhead of receiving a larger response. No Read Capacity Units are consumed.
     *        </p>
     *        <p>
     *        Values returned are strongly consistent
     * @see ReturnValue
     */

    public void setReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
    }

    /**
     * <p>
     * Use <i>ReturnValues</i> if you want to get the item attributes as they appeared either before or after they were
     * updated. For <i>UpdateItem</i>, the valid values are:
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
     * <code>ALL_OLD</code> - If <i>UpdateItem</i> overwrote an attribute name-value pair, then the content of the old
     * item is returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OLD</code> - The old versions of only the updated attributes are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_NEW</code> - All of the attributes of the new version of the item are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_NEW</code> - The new versions of only the updated attributes are returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is no additional cost associated with requesting a return value aside from the small network and processing
     * overhead of receiving a larger response. No Read Capacity Units are consumed.
     * </p>
     * <p>
     * Values returned are strongly consistent
     * </p>
     * 
     * @param returnValues
     *        Use <i>ReturnValues</i> if you want to get the item attributes as they appeared either before or after
     *        they were updated. For <i>UpdateItem</i>, the valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - If <i>ReturnValues</i> is not specified, or if its value is <code>NONE</code>, then
     *        nothing is returned. (This setting is the default for <i>ReturnValues</i>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_OLD</code> - If <i>UpdateItem</i> overwrote an attribute name-value pair, then the content of
     *        the old item is returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OLD</code> - The old versions of only the updated attributes are returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_NEW</code> - All of the attributes of the new version of the item are returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_NEW</code> - The new versions of only the updated attributes are returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is no additional cost associated with requesting a return value aside from the small network and
     *        processing overhead of receiving a larger response. No Read Capacity Units are consumed.
     *        </p>
     *        <p>
     *        Values returned are strongly consistent
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnValue
     */

    public UpdateItemRequest withReturnValues(ReturnValue returnValues) {
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

    public UpdateItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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

    public UpdateItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
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

    public UpdateItemRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        setReturnItemCollectionMetrics(returnItemCollectionMetrics);
        return this;
    }

    /**
     * <p>
     * An expression that defines one or more attributes to be updated, the action to be performed on them, and new
     * value(s) for them.
     * </p>
     * <p>
     * The following action values are available for <i>UpdateExpression</i>.
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
     * If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is mathematically
     * added to the existing attribute. If <i>Value</i> is a negative number, then it is subtracted from the existing
     * attribute.
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
     * If the existing data type is a set and if <i>Value</i> is also a set, then <i>Value</i> is added to the existing
     * set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code> action specified
     * <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs if an <code>ADD</code>
     * action is specified for a set attribute and the attribute type specified does not match the existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings.
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html">Modifying Items
     * and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>UpdateExpression</i> replaces the legacy <i>AttributeUpdates</i> parameter.
     * </p>
     * </note>
     * 
     * @param updateExpression
     *        An expression that defines one or more attributes to be updated, the action to be performed on them, and
     *        new value(s) for them.</p>
     *        <p>
     *        The following action values are available for <i>UpdateExpression</i>.
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
     *        If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is
     *        mathematically added to the existing attribute. If <i>Value</i> is a negative number, then it is
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
     *        If the existing data type is a set and if <i>Value</i> is also a set, then <i>Value</i> is added to the
     *        existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code>
     *        action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs
     *        if an <code>ADD</code> action is specified for a set attribute and the attribute type specified does not
     *        match the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, the <i>Value</i> must also be a set of strings.
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
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     *        >Modifying Items and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <i>UpdateExpression</i> replaces the legacy <i>AttributeUpdates</i> parameter.
     *        </p>
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
     * The following action values are available for <i>UpdateExpression</i>.
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
     * If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is mathematically
     * added to the existing attribute. If <i>Value</i> is a negative number, then it is subtracted from the existing
     * attribute.
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
     * If the existing data type is a set and if <i>Value</i> is also a set, then <i>Value</i> is added to the existing
     * set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code> action specified
     * <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs if an <code>ADD</code>
     * action is specified for a set attribute and the attribute type specified does not match the existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings.
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html">Modifying Items
     * and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>UpdateExpression</i> replaces the legacy <i>AttributeUpdates</i> parameter.
     * </p>
     * </note>
     * 
     * @return An expression that defines one or more attributes to be updated, the action to be performed on them, and
     *         new value(s) for them.</p>
     *         <p>
     *         The following action values are available for <i>UpdateExpression</i>.
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
     *         If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is
     *         mathematically added to the existing attribute. If <i>Value</i> is a negative number, then it is
     *         subtracted from the existing attribute.
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
     *         If the existing data type is a set and if <i>Value</i> is also a set, then <i>Value</i> is added to the
     *         existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code>
     *         action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error
     *         occurs if an <code>ADD</code> action is specified for a set attribute and the attribute type specified
     *         does not match the existing set type.
     *         </p>
     *         <p>
     *         Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *         strings, the <i>Value</i> must also be a set of strings.
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
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     *         >Modifying Items and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         <i>UpdateExpression</i> replaces the legacy <i>AttributeUpdates</i> parameter.
     *         </p>
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
     * The following action values are available for <i>UpdateExpression</i>.
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
     * If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is mathematically
     * added to the existing attribute. If <i>Value</i> is a negative number, then it is subtracted from the existing
     * attribute.
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
     * If the existing data type is a set and if <i>Value</i> is also a set, then <i>Value</i> is added to the existing
     * set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code> action specified
     * <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs if an <code>ADD</code>
     * action is specified for a set attribute and the attribute type specified does not match the existing set type.
     * </p>
     * <p>
     * Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings.
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html">Modifying Items
     * and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>UpdateExpression</i> replaces the legacy <i>AttributeUpdates</i> parameter.
     * </p>
     * </note>
     * 
     * @param updateExpression
     *        An expression that defines one or more attributes to be updated, the action to be performed on them, and
     *        new value(s) for them.</p>
     *        <p>
     *        The following action values are available for <i>UpdateExpression</i>.
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
     *        If the existing attribute is a number, and if <i>Value</i> is also a number, then <i>Value</i> is
     *        mathematically added to the existing attribute. If <i>Value</i> is a negative number, then it is
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
     *        If the existing data type is a set and if <i>Value</i> is also a set, then <i>Value</i> is added to the
     *        existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code>
     *        action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs
     *        if an <code>ADD</code> action is specified for a set attribute and the attribute type specified does not
     *        match the existing set type.
     *        </p>
     *        <p>
     *        Both sets must have the same primitive data type. For example, if the existing data type is a set of
     *        strings, the <i>Value</i> must also be a set of strings.
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
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     *        >Modifying Items and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <i>UpdateExpression</i> replaces the legacy <i>AttributeUpdates</i> parameter.
     *        </p>
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

    public UpdateItemRequest withConditionExpression(String conditionExpression) {
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getAttributeUpdates() != null)
            sb.append("AttributeUpdates: " + getAttributeUpdates() + ",");
        if (getExpected() != null)
            sb.append("Expected: " + getExpected() + ",");
        if (getConditionalOperator() != null)
            sb.append("ConditionalOperator: " + getConditionalOperator() + ",");
        if (getReturnValues() != null)
            sb.append("ReturnValues: " + getReturnValues() + ",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getReturnItemCollectionMetrics() != null)
            sb.append("ReturnItemCollectionMetrics: " + getReturnItemCollectionMetrics() + ",");
        if (getUpdateExpression() != null)
            sb.append("UpdateExpression: " + getUpdateExpression() + ",");
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
