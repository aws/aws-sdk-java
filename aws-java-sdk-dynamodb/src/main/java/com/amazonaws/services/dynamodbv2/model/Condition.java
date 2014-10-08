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

/**
 * <p>
 * Represents the selection criteria for a <i>Query</i> or <i>Scan</i>
 * operation:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * For a <i>Query</i> operation, <i>Condition</i> is used for specifying
 * the <i>KeyConditions</i> to use when querying a table or an index. For
 * <i>KeyConditions</i> ,
 * only the following comparison operators are supported:
 * </p>
 * <p>
 * <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
 * </p>
 * <p>
 * <i>Condition</i> is also used in a <i>QueryFilter</i> , which
 * evaluates the query results and returns only the desired values.
 * </p>
 * </li>
 * <li> <p>
 * For a <i>Scan</i> operation, <i>Condition</i> is used in a
 * <i>ScanFilter</i> , which evaluates the scan results and returns only
 * the desired values.
 * </p>
 * </li>
 * 
 * </ul>
 */
public class Condition implements Serializable {

    /**
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
     * query expressions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> attributeValueList;

    /**
     * A comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>The following comparison operators are
     * available: <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL |
     * CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <code>EQ</code> is supported for all
     * datatypes, including lists and maps. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> element of type String, Number,
     * Binary, String Set, Number Set, or Binary Set. If an item contains an
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
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> <p>For usage
     * examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>,
     * see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     */
    private String comparisonOperator;

    /**
     * Default constructor for a new Condition object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Condition() {}
    
    /**
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
     * query expressions.
     *
     * @return One or more values to evaluate against the supplied attribute. The
     *         number of values in the list depends on the <i>ComparisonOperator</i>
     *         being used. <p>For type Number, value comparisons are numeric.
     *         <p>String value comparisons for greater than, equals, or less than are
     *         based on ASCII character code values. For example, <code>a</code> is
     *         greater than <code>A</code>, and <code>aa</code> is greater than
     *         <code>B</code>. For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions.
     */
    public java.util.List<AttributeValue> getAttributeValueList() {
        return attributeValueList;
    }
    
    /**
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
     * query expressions.
     *
     * @param attributeValueList One or more values to evaluate against the supplied attribute. The
     *         number of values in the list depends on the <i>ComparisonOperator</i>
     *         being used. <p>For type Number, value comparisons are numeric.
     *         <p>String value comparisons for greater than, equals, or less than are
     *         based on ASCII character code values. For example, <code>a</code> is
     *         greater than <code>A</code>, and <code>aa</code> is greater than
     *         <code>B</code>. For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions.
     */
    public void setAttributeValueList(java.util.Collection<AttributeValue> attributeValueList) {
        if (attributeValueList == null) {
            this.attributeValueList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> attributeValueListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue>(attributeValueList.size());
        attributeValueListCopy.addAll(attributeValueList);
        this.attributeValueList = attributeValueListCopy;
    }
    
    /**
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
     * query expressions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValueList One or more values to evaluate against the supplied attribute. The
     *         number of values in the list depends on the <i>ComparisonOperator</i>
     *         being used. <p>For type Number, value comparisons are numeric.
     *         <p>String value comparisons for greater than, equals, or less than are
     *         based on ASCII character code values. For example, <code>a</code> is
     *         greater than <code>A</code>, and <code>aa</code> is greater than
     *         <code>B</code>. For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Condition withAttributeValueList(AttributeValue... attributeValueList) {
        if (getAttributeValueList() == null) setAttributeValueList(new java.util.ArrayList<AttributeValue>(attributeValueList.length));
        for (AttributeValue value : attributeValueList) {
            getAttributeValueList().add(value);
        }
        return this;
    }
    
    /**
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
     * query expressions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValueList One or more values to evaluate against the supplied attribute. The
     *         number of values in the list depends on the <i>ComparisonOperator</i>
     *         being used. <p>For type Number, value comparisons are numeric.
     *         <p>String value comparisons for greater than, equals, or less than are
     *         based on ASCII character code values. For example, <code>a</code> is
     *         greater than <code>A</code>, and <code>aa</code> is greater than
     *         <code>B</code>. For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Condition withAttributeValueList(java.util.Collection<AttributeValue> attributeValueList) {
        if (attributeValueList == null) {
            this.attributeValueList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> attributeValueListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue>(attributeValueList.size());
            attributeValueListCopy.addAll(attributeValueList);
            this.attributeValueList = attributeValueListCopy;
        }

        return this;
    }

    /**
     * A comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>The following comparison operators are
     * available: <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL |
     * CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <code>EQ</code> is supported for all
     * datatypes, including lists and maps. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> element of type String, Number,
     * Binary, String Set, Number Set, or Binary Set. If an item contains an
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
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> <p>For usage
     * examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>,
     * see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @return A comparator for evaluating attributes. For example, equals, greater
     *         than, less than, etc. <p>The following comparison operators are
     *         available: <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL |
     *         CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The
     *         following are descriptions of each comparison operator. <ul> <li>
     *         <p><code>EQ</code> : Equal. <code>EQ</code> is supported for all
     *         datatypes, including lists and maps. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> element of type String, Number,
     *         Binary, String Set, Number Set, or Binary Set. If an item contains an
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
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> <p>For usage
     *         examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     *         Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *
     * @see ComparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }
    
    /**
     * A comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>The following comparison operators are
     * available: <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL |
     * CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <code>EQ</code> is supported for all
     * datatypes, including lists and maps. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> element of type String, Number,
     * Binary, String Set, Number Set, or Binary Set. If an item contains an
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
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> <p>For usage
     * examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>,
     * see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator A comparator for evaluating attributes. For example, equals, greater
     *         than, less than, etc. <p>The following comparison operators are
     *         available: <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL |
     *         CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The
     *         following are descriptions of each comparison operator. <ul> <li>
     *         <p><code>EQ</code> : Equal. <code>EQ</code> is supported for all
     *         datatypes, including lists and maps. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> element of type String, Number,
     *         Binary, String Set, Number Set, or Binary Set. If an item contains an
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
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> <p>For usage
     *         examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     *         Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *
     * @see ComparisonOperator
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }
    
    /**
     * A comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>The following comparison operators are
     * available: <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL |
     * CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <code>EQ</code> is supported for all
     * datatypes, including lists and maps. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> element of type String, Number,
     * Binary, String Set, Number Set, or Binary Set. If an item contains an
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
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> <p>For usage
     * examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>,
     * see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator A comparator for evaluating attributes. For example, equals, greater
     *         than, less than, etc. <p>The following comparison operators are
     *         available: <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL |
     *         CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The
     *         following are descriptions of each comparison operator. <ul> <li>
     *         <p><code>EQ</code> : Equal. <code>EQ</code> is supported for all
     *         datatypes, including lists and maps. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> element of type String, Number,
     *         Binary, String Set, Number Set, or Binary Set. If an item contains an
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
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> <p>For usage
     *         examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     *         Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ComparisonOperator
     */
    public Condition withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * A comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>The following comparison operators are
     * available: <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL |
     * CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <code>EQ</code> is supported for all
     * datatypes, including lists and maps. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> element of type String, Number,
     * Binary, String Set, Number Set, or Binary Set. If an item contains an
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
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> <p>For usage
     * examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>,
     * see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator A comparator for evaluating attributes. For example, equals, greater
     *         than, less than, etc. <p>The following comparison operators are
     *         available: <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL |
     *         CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The
     *         following are descriptions of each comparison operator. <ul> <li>
     *         <p><code>EQ</code> : Equal. <code>EQ</code> is supported for all
     *         datatypes, including lists and maps. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> element of type String, Number,
     *         Binary, String Set, Number Set, or Binary Set. If an item contains an
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
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> <p>For usage
     *         examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     *         Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *
     * @see ComparisonOperator
     */
    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }
    
    /**
     * A comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>The following comparison operators are
     * available: <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL |
     * CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <code>EQ</code> is supported for all
     * datatypes, including lists and maps. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> element of type String, Number,
     * Binary, String Set, Number Set, or Binary Set. If an item contains an
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
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> <p>For usage
     * examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>,
     * see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     * Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator A comparator for evaluating attributes. For example, equals, greater
     *         than, less than, etc. <p>The following comparison operators are
     *         available: <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL |
     *         CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The
     *         following are descriptions of each comparison operator. <ul> <li>
     *         <p><code>EQ</code> : Equal. <code>EQ</code> is supported for all
     *         datatypes, including lists and maps. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> element of type String, Number,
     *         Binary, String Set, Number Set, or Binary Set. If an item contains an
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
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> <p>For usage
     *         examples of <i>AttributeValueList</i> and <i>ComparisonOperator</i>,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
     *         Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ComparisonOperator
     */
    public Condition withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
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
        if (getAttributeValueList() != null) sb.append("AttributeValueList: " + getAttributeValueList() + ",");
        if (getComparisonOperator() != null) sb.append("ComparisonOperator: " + getComparisonOperator() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributeValueList() == null) ? 0 : getAttributeValueList().hashCode()); 
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Condition == false) return false;
        Condition other = (Condition)obj;
        
        if (other.getAttributeValueList() == null ^ this.getAttributeValueList() == null) return false;
        if (other.getAttributeValueList() != null && other.getAttributeValueList().equals(this.getAttributeValueList()) == false) return false; 
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null) return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false) return false; 
        return true;
    }
    
}
    