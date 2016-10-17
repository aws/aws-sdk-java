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
 * Represents the input of a <i>Scan</i> operation.
 * </p>
 */
public class ScanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the table containing the requested items; or, if you provide <code>IndexName</code>, the name of the
     * table to which that index belongs.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The name of a secondary index to scan. This index can be any local secondary index or global secondary index.
     * Note that if you use the <code>IndexName</code> parameter, you must also provide <code>TableName</code>.
     * </p>
     */
    private String indexName;
    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ProjectionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map; however, it cannot retrieve individual
     * elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names are provided, then all attributes will be
     * returned. If any of the requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput consumption. DynamoDB determines
     * capacity units consumed based on item size, not on the amount of data that is returned to an application.
     * </p>
     */
    private java.util.List<String> attributesToGet;
    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the
     * number of items up to the limit while processing the results, it stops the operation and returns the matching
     * values up to that point, and a key in <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that you can
     * pick up where you left off. Also, if the processed data set size exceeds 1 MB before DynamoDB reaches this limit,
     * it stops the operation and returns the matching values up to the limit, and a key in <i>LastEvaluatedKey</i> to
     * apply in a subsequent operation to continue the operation. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and Scan</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, or
     * the count of matching items.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an index. Retrieves all attributes that have
     * been projected into the index. If the index is configured to project all attributes, this return value is
     * equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <i>AttributesToGet</i>. This return
     * value is equivalent to specifying <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified, DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code>. You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in a single
     * request, unless the value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     */
    private String select;
    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>FilterExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A condition that evaluates the scan results and returns only the desired values.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * <p>
     * If you specify more than one condition in the <i>ScanFilter</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together. (You can use the <i>ConditionalOperator</i>
     * parameter to OR the conditions instead. If you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.)
     * </p>
     * <p>
     * Each <i>ScanFilter</i> element consists of an attribute name to compare, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the supplied attribute. The number of values
     * in the list depends on the operator specified in <i>ComparisonOperator</i> .
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
     * For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
     * </p>
     * <p>
     * For information on specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON Data Format</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes. For example, equals, greater than, less than,
     * etc.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * For complete descriptions of all comparison operators, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">Condition</a>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, Condition> scanFilter;
    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>FilterExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>ScanFilter</i> map:
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
     * The primary key of the first item that this operation will evaluate. Use the value that was returned for
     * <i>LastEvaluatedKey</i> in the previous operation.
     * </p>
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or Binary. No set data types are allowed.
     * </p>
     * <p>
     * In a parallel scan, a <i>Scan</i> request that includes <i>ExclusiveStartKey</i> must specify the same segment
     * whose previous <i>Scan</i> returned the corresponding value of <i>LastEvaluatedKey</i>.
     * </p>
     */
    private java.util.Map<String, AttributeValue> exclusiveStartKey;

    private String returnConsumedCapacity;
    /**
     * <p>
     * For a parallel <i>Scan</i> request, <i>TotalSegments</i> represents the total number of segments into which the
     * <i>Scan</i> operation will be divided. The value of <i>TotalSegments</i> corresponds to the number of application
     * workers that will perform the parallel scan. For example, if you want to use four application threads to scan a
     * table or an index, specify a <i>TotalSegments</i> value of 4.
     * </p>
     * <p>
     * The value for <i>TotalSegments</i> must be greater than or equal to 1, and less than or equal to 1000000. If you
     * specify a <i>TotalSegments</i> value of 1, the <i>Scan</i> operation will be sequential rather than parallel.
     * </p>
     * <p>
     * If you specify <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     * </p>
     */
    private Integer totalSegments;
    /**
     * <p>
     * For a parallel <i>Scan</i> request, <i>Segment</i> identifies an individual segment to be scanned by an
     * application worker.
     * </p>
     * <p>
     * Segment IDs are zero-based, so the first segment is always 0. For example, if you want to use four application
     * threads to scan a table or an index, then the first thread specifies a <i>Segment</i> value of 0, the second
     * thread specifies 1, and so on.
     * </p>
     * <p>
     * The value of <i>LastEvaluatedKey</i> returned from a parallel <i>Scan</i> request must be used as
     * <i>ExclusiveStartKey</i> with the same segment ID in a subsequent <i>Scan</i> operation.
     * </p>
     * <p>
     * The value for <i>Segment</i> must be greater than or equal to 0, and less than the value provided for
     * <i>TotalSegments</i>.
     * </p>
     * <p>
     * If you provide <i>Segment</i>, you must also provide <i>TotalSegments</i>.
     * </p>
     */
    private Integer segment;
    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the specified table or index. These attributes
     * can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by
     * commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are
     * not found, they will not appear in the result.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i> parameter.
     * </p>
     * </note>
     */
    private String projectionExpression;
    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the <i>Scan</i> operation, but before the data is
     * returned to you. Items that do not satisfy the <i>FilterExpression</i> criteria are not returned.
     * </p>
     * <note>
     * <p>
     * A <i>FilterExpression</i> is applied after the items have already been read; the process of filtering does not
     * consume any additional read capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults">Filter
     * Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>FilterExpression</i> replaces the legacy <i>ScanFilter</i> and <i>ConditionalOperator</i> parameters.
     * </p>
     * </note>
     */
    private String filterExpression;
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
     * <p>
     * A Boolean value that determines the read consistency model during the scan:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <i>ConsistentRead</i> is <code>false</code>, then the data returned from <i>Scan</i> might not contain the
     * results from other recently completed write operations (PutItem, UpdateItem or DeleteItem).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <i>ConsistentRead</i> is <code>true</code>, then all of the write operations that completed before the
     * <i>Scan</i> began are guaranteed to be contained in the <i>Scan</i> response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting for <i>ConsistentRead</i> is <code>false</code>.
     * </p>
     * <p>
     * The <i>ConsistentRead</i> parameter is not supported on global secondary indexes. If you scan a global secondary
     * index with <i>ConsistentRead</i> set to true, you will receive a <i>ValidationException</i>.
     * </p>
     */
    private Boolean consistentRead;

    /**
     * Default constructor for ScanRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public ScanRequest() {
    }

    /**
     * Constructs a new ScanRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     *        The name of the table containing the requested items; or, if you provide <code>IndexName</code>, the name
     *        of the table to which that index belongs.
     */
    public ScanRequest(String tableName) {
        setTableName(tableName);
    }

    /**
     * <p>
     * The name of the table containing the requested items; or, if you provide <code>IndexName</code>, the name of the
     * table to which that index belongs.
     * </p>
     * 
     * @param tableName
     *        The name of the table containing the requested items; or, if you provide <code>IndexName</code>, the name
     *        of the table to which that index belongs.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table containing the requested items; or, if you provide <code>IndexName</code>, the name of the
     * table to which that index belongs.
     * </p>
     * 
     * @return The name of the table containing the requested items; or, if you provide <code>IndexName</code>, the name
     *         of the table to which that index belongs.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table containing the requested items; or, if you provide <code>IndexName</code>, the name of the
     * table to which that index belongs.
     * </p>
     * 
     * @param tableName
     *        The name of the table containing the requested items; or, if you provide <code>IndexName</code>, the name
     *        of the table to which that index belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The name of a secondary index to scan. This index can be any local secondary index or global secondary index.
     * Note that if you use the <code>IndexName</code> parameter, you must also provide <code>TableName</code>.
     * </p>
     * 
     * @param indexName
     *        The name of a secondary index to scan. This index can be any local secondary index or global secondary
     *        index. Note that if you use the <code>IndexName</code> parameter, you must also provide
     *        <code>TableName</code>.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of a secondary index to scan. This index can be any local secondary index or global secondary index.
     * Note that if you use the <code>IndexName</code> parameter, you must also provide <code>TableName</code>.
     * </p>
     * 
     * @return The name of a secondary index to scan. This index can be any local secondary index or global secondary
     *         index. Note that if you use the <code>IndexName</code> parameter, you must also provide
     *         <code>TableName</code>.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of a secondary index to scan. This index can be any local secondary index or global secondary index.
     * Note that if you use the <code>IndexName</code> parameter, you must also provide <code>TableName</code>.
     * </p>
     * 
     * @param indexName
     *        The name of a secondary index to scan. This index can be any local secondary index or global secondary
     *        index. Note that if you use the <code>IndexName</code> parameter, you must also provide
     *        <code>TableName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ProjectionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map; however, it cannot retrieve individual
     * elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names are provided, then all attributes will be
     * returned. If any of the requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput consumption. DynamoDB determines
     * capacity units consumed based on item size, not on the amount of data that is returned to an application.
     * </p>
     * 
     * @return <p>
     *         This is a legacy parameter, for backward compatibility. New applications should use
     *         <i>ProjectionExpression</i> instead. Do not combine legacy parameters and expression parameters in a
     *         single API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *         </p>
     *         <p>
     *         This parameter allows you to retrieve attributes of type List or Map; however, it cannot retrieve
     *         individual elements within a List or a Map.
     *         </p>
     *         </important>
     *         <p>
     *         The names of one or more attributes to retrieve. If no attribute names are provided, then all attributes
     *         will be returned. If any of the requested attributes are not found, they will not appear in the result.
     *         </p>
     *         <p>
     *         Note that <i>AttributesToGet</i> has no effect on provisioned throughput consumption. DynamoDB determines
     *         capacity units consumed based on item size, not on the amount of data that is returned to an application.
     */

    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ProjectionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map; however, it cannot retrieve individual
     * elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names are provided, then all attributes will be
     * returned. If any of the requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput consumption. DynamoDB determines
     * capacity units consumed based on item size, not on the amount of data that is returned to an application.
     * </p>
     * 
     * @param attributesToGet
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>ProjectionExpression</i> instead. Do not combine legacy parameters and expression parameters in a
     *        single API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        <p>
     *        This parameter allows you to retrieve attributes of type List or Map; however, it cannot retrieve
     *        individual elements within a List or a Map.
     *        </p>
     *        </important>
     *        <p>
     *        The names of one or more attributes to retrieve. If no attribute names are provided, then all attributes
     *        will be returned. If any of the requested attributes are not found, they will not appear in the result.
     *        </p>
     *        <p>
     *        Note that <i>AttributesToGet</i> has no effect on provisioned throughput consumption. DynamoDB determines
     *        capacity units consumed based on item size, not on the amount of data that is returned to an application.
     */

    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        this.attributesToGet = new java.util.ArrayList<String>(attributesToGet);
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ProjectionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map; however, it cannot retrieve individual
     * elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names are provided, then all attributes will be
     * returned. If any of the requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput consumption. DynamoDB determines
     * capacity units consumed based on item size, not on the amount of data that is returned to an application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributesToGet(java.util.Collection)} or {@link #withAttributesToGet(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributesToGet
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>ProjectionExpression</i> instead. Do not combine legacy parameters and expression parameters in a
     *        single API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        <p>
     *        This parameter allows you to retrieve attributes of type List or Map; however, it cannot retrieve
     *        individual elements within a List or a Map.
     *        </p>
     *        </important>
     *        <p>
     *        The names of one or more attributes to retrieve. If no attribute names are provided, then all attributes
     *        will be returned. If any of the requested attributes are not found, they will not appear in the result.
     *        </p>
     *        <p>
     *        Note that <i>AttributesToGet</i> has no effect on provisioned throughput consumption. DynamoDB determines
     *        capacity units consumed based on item size, not on the amount of data that is returned to an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanRequest withAttributesToGet(String... attributesToGet) {
        if (this.attributesToGet == null) {
            setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        }
        for (String ele : attributesToGet) {
            this.attributesToGet.add(ele);
        }
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>ProjectionExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map; however, it cannot retrieve individual
     * elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names are provided, then all attributes will be
     * returned. If any of the requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput consumption. DynamoDB determines
     * capacity units consumed based on item size, not on the amount of data that is returned to an application.
     * </p>
     * 
     * @param attributesToGet
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>ProjectionExpression</i> instead. Do not combine legacy parameters and expression parameters in a
     *        single API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        <p>
     *        This parameter allows you to retrieve attributes of type List or Map; however, it cannot retrieve
     *        individual elements within a List or a Map.
     *        </p>
     *        </important>
     *        <p>
     *        The names of one or more attributes to retrieve. If no attribute names are provided, then all attributes
     *        will be returned. If any of the requested attributes are not found, they will not appear in the result.
     *        </p>
     *        <p>
     *        Note that <i>AttributesToGet</i> has no effect on provisioned throughput consumption. DynamoDB determines
     *        capacity units consumed based on item size, not on the amount of data that is returned to an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        setAttributesToGet(attributesToGet);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the
     * number of items up to the limit while processing the results, it stops the operation and returns the matching
     * values up to that point, and a key in <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that you can
     * pick up where you left off. Also, if the processed data set size exceeds 1 MB before DynamoDB reaches this limit,
     * it stops the operation and returns the matching values up to the limit, and a key in <i>LastEvaluatedKey</i> to
     * apply in a subsequent operation to continue the operation. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and Scan</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB
     *        processes the number of items up to the limit while processing the results, it stops the operation and
     *        returns the matching values up to that point, and a key in <i>LastEvaluatedKey</i> to apply in a
     *        subsequent operation, so that you can pick up where you left off. Also, if the processed data set size
     *        exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up
     *        to the limit, and a key in <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue the
     *        operation. For more information, see <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and
     *        Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the
     * number of items up to the limit while processing the results, it stops the operation and returns the matching
     * values up to that point, and a key in <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that you can
     * pick up where you left off. Also, if the processed data set size exceeds 1 MB before DynamoDB reaches this limit,
     * it stops the operation and returns the matching values up to the limit, and a key in <i>LastEvaluatedKey</i> to
     * apply in a subsequent operation to continue the operation. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and Scan</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB
     *         processes the number of items up to the limit while processing the results, it stops the operation and
     *         returns the matching values up to that point, and a key in <i>LastEvaluatedKey</i> to apply in a
     *         subsequent operation, so that you can pick up where you left off. Also, if the processed data set size
     *         exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values
     *         up to the limit, and a key in <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue the
     *         operation. For more information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and
     *         Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the
     * number of items up to the limit while processing the results, it stops the operation and returns the matching
     * values up to that point, and a key in <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that you can
     * pick up where you left off. Also, if the processed data set size exceeds 1 MB before DynamoDB reaches this limit,
     * it stops the operation and returns the matching values up to the limit, and a key in <i>LastEvaluatedKey</i> to
     * apply in a subsequent operation to continue the operation. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and Scan</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB
     *        processes the number of items up to the limit while processing the results, it stops the operation and
     *        returns the matching values up to that point, and a key in <i>LastEvaluatedKey</i> to apply in a
     *        subsequent operation, so that you can pick up where you left off. Also, if the processed data set size
     *        exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up
     *        to the limit, and a key in <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue the
     *        operation. For more information, see <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and
     *        Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, or
     * the count of matching items.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an index. Retrieves all attributes that have
     * been projected into the index. If the index is configured to project all attributes, this return value is
     * equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <i>AttributesToGet</i>. This return
     * value is equivalent to specifying <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified, DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code>. You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in a single
     * request, unless the value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * 
     * @param select
     *        The attributes to be returned in the result. You can retrieve all item attributes, specific item
     *        attributes, or the count of matching items.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an index. Retrieves all attributes that
     *        have been projected into the index. If the index is configured to project all attributes, this return
     *        value is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code> - Returns the number of matching items, rather than the matching items themselves.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <i>AttributesToGet</i>. This
     *        return value is equivalent to specifying <i>AttributesToGet</i> without specifying any value for
     *        <i>Select</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If neither <i>Select</i> nor <i>AttributesToGet</i> are specified, DynamoDB defaults to
     *        <code>ALL_ATTRIBUTES</code>. You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in a
     *        single request, unless the value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *        equivalent to specifying <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * @see Select
     */

    public void setSelect(String select) {
        this.select = select;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, or
     * the count of matching items.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an index. Retrieves all attributes that have
     * been projected into the index. If the index is configured to project all attributes, this return value is
     * equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <i>AttributesToGet</i>. This return
     * value is equivalent to specifying <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified, DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code>. You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in a single
     * request, unless the value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * 
     * @return The attributes to be returned in the result. You can retrieve all item attributes, specific item
     *         attributes, or the count of matching items.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an index. Retrieves all attributes
     *         that have been projected into the index. If the index is configured to project all attributes, this
     *         return value is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COUNT</code> - Returns the number of matching items, rather than the matching items themselves.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <i>AttributesToGet</i>. This
     *         return value is equivalent to specifying <i>AttributesToGet</i> without specifying any value for
     *         <i>Select</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If neither <i>Select</i> nor <i>AttributesToGet</i> are specified, DynamoDB defaults to
     *         <code>ALL_ATTRIBUTES</code>. You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in a
     *         single request, unless the value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *         equivalent to specifying <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * @see Select
     */

    public String getSelect() {
        return this.select;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, or
     * the count of matching items.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an index. Retrieves all attributes that have
     * been projected into the index. If the index is configured to project all attributes, this return value is
     * equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <i>AttributesToGet</i>. This return
     * value is equivalent to specifying <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified, DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code>. You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in a single
     * request, unless the value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * 
     * @param select
     *        The attributes to be returned in the result. You can retrieve all item attributes, specific item
     *        attributes, or the count of matching items.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an index. Retrieves all attributes that
     *        have been projected into the index. If the index is configured to project all attributes, this return
     *        value is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code> - Returns the number of matching items, rather than the matching items themselves.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <i>AttributesToGet</i>. This
     *        return value is equivalent to specifying <i>AttributesToGet</i> without specifying any value for
     *        <i>Select</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If neither <i>Select</i> nor <i>AttributesToGet</i> are specified, DynamoDB defaults to
     *        <code>ALL_ATTRIBUTES</code>. You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in a
     *        single request, unless the value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *        equivalent to specifying <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Select
     */

    public ScanRequest withSelect(String select) {
        setSelect(select);
        return this;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, or
     * the count of matching items.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an index. Retrieves all attributes that have
     * been projected into the index. If the index is configured to project all attributes, this return value is
     * equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <i>AttributesToGet</i>. This return
     * value is equivalent to specifying <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified, DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code>. You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in a single
     * request, unless the value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * 
     * @param select
     *        The attributes to be returned in the result. You can retrieve all item attributes, specific item
     *        attributes, or the count of matching items.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an index. Retrieves all attributes that
     *        have been projected into the index. If the index is configured to project all attributes, this return
     *        value is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code> - Returns the number of matching items, rather than the matching items themselves.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <i>AttributesToGet</i>. This
     *        return value is equivalent to specifying <i>AttributesToGet</i> without specifying any value for
     *        <i>Select</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If neither <i>Select</i> nor <i>AttributesToGet</i> are specified, DynamoDB defaults to
     *        <code>ALL_ATTRIBUTES</code>. You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in a
     *        single request, unless the value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *        equivalent to specifying <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * @see Select
     */

    public void setSelect(Select select) {
        this.select = select.toString();
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, or
     * the count of matching items.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an index. Retrieves all attributes that have
     * been projected into the index. If the index is configured to project all attributes, this return value is
     * equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <i>AttributesToGet</i>. This return
     * value is equivalent to specifying <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified, DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code>. You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in a single
     * request, unless the value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * 
     * @param select
     *        The attributes to be returned in the result. You can retrieve all item attributes, specific item
     *        attributes, or the count of matching items.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an index. Retrieves all attributes that
     *        have been projected into the index. If the index is configured to project all attributes, this return
     *        value is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code> - Returns the number of matching items, rather than the matching items themselves.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <i>AttributesToGet</i>. This
     *        return value is equivalent to specifying <i>AttributesToGet</i> without specifying any value for
     *        <i>Select</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If neither <i>Select</i> nor <i>AttributesToGet</i> are specified, DynamoDB defaults to
     *        <code>ALL_ATTRIBUTES</code>. You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in a
     *        single request, unless the value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *        equivalent to specifying <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Select
     */

    public ScanRequest withSelect(Select select) {
        setSelect(select);
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>FilterExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A condition that evaluates the scan results and returns only the desired values.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * <p>
     * If you specify more than one condition in the <i>ScanFilter</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together. (You can use the <i>ConditionalOperator</i>
     * parameter to OR the conditions instead. If you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.)
     * </p>
     * <p>
     * Each <i>ScanFilter</i> element consists of an attribute name to compare, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the supplied attribute. The number of values
     * in the list depends on the operator specified in <i>ComparisonOperator</i> .
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
     * For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
     * </p>
     * <p>
     * For information on specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON Data Format</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes. For example, equals, greater than, less than,
     * etc.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * For complete descriptions of all comparison operators, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">Condition</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <p>
     *         This is a legacy parameter, for backward compatibility. New applications should use
     *         <i>FilterExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *         API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *         </p>
     *         </important>
     *         <p>
     *         A condition that evaluates the scan results and returns only the desired values.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter does not support attributes of type List or Map.
     *         </p>
     *         </note>
     *         <p>
     *         If you specify more than one condition in the <i>ScanFilter</i> map, then by default all of the
     *         conditions must evaluate to true. In other words, the conditions are ANDed together. (You can use the
     *         <i>ConditionalOperator</i> parameter to OR the conditions instead. If you do this, then at least one of
     *         the conditions must evaluate to true, rather than all of them.)
     *         </p>
     *         <p>
     *         Each <i>ScanFilter</i> element consists of an attribute name to compare, along with the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>AttributeValueList</i> - One or more values to evaluate against the supplied attribute. The number of
     *         values in the list depends on the operator specified in <i>ComparisonOperator</i> .
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
     *         For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
     *         </p>
     *         <p>
     *         For information on specifying data types in JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON Data
     *         Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>ComparisonOperator</i> - A comparator for evaluating attributes. For example, equals, greater than,
     *         less than, etc.
     *         </p>
     *         <p>
     *         The following comparison operators are available:
     *         </p>
     *         <p>
     *         <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     *         </p>
     *         <p>
     *         For complete descriptions of all comparison operators, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">Condition</a>.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, Condition> getScanFilter() {
        return scanFilter;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>FilterExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A condition that evaluates the scan results and returns only the desired values.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * <p>
     * If you specify more than one condition in the <i>ScanFilter</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together. (You can use the <i>ConditionalOperator</i>
     * parameter to OR the conditions instead. If you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.)
     * </p>
     * <p>
     * Each <i>ScanFilter</i> element consists of an attribute name to compare, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the supplied attribute. The number of values
     * in the list depends on the operator specified in <i>ComparisonOperator</i> .
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
     * For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
     * </p>
     * <p>
     * For information on specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON Data Format</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes. For example, equals, greater than, less than,
     * etc.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * For complete descriptions of all comparison operators, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">Condition</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scanFilter
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>FilterExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A condition that evaluates the scan results and returns only the desired values.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     *        </note>
     *        <p>
     *        If you specify more than one condition in the <i>ScanFilter</i> map, then by default all of the conditions
     *        must evaluate to true. In other words, the conditions are ANDed together. (You can use the
     *        <i>ConditionalOperator</i> parameter to OR the conditions instead. If you do this, then at least one of
     *        the conditions must evaluate to true, rather than all of them.)
     *        </p>
     *        <p>
     *        Each <i>ScanFilter</i> element consists of an attribute name to compare, along with the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeValueList</i> - One or more values to evaluate against the supplied attribute. The number of
     *        values in the list depends on the operator specified in <i>ComparisonOperator</i> .
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
     *        For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
     *        </p>
     *        <p>
     *        For information on specifying data types in JSON, see <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON Data
     *        Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ComparisonOperator</i> - A comparator for evaluating attributes. For example, equals, greater than,
     *        less than, etc.
     *        </p>
     *        <p>
     *        The following comparison operators are available:
     *        </p>
     *        <p>
     *        <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     *        </p>
     *        <p>
     *        For complete descriptions of all comparison operators, see <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">Condition</a>.
     *        </p>
     *        </li>
     */

    public void setScanFilter(java.util.Map<String, Condition> scanFilter) {
        this.scanFilter = scanFilter;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>FilterExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A condition that evaluates the scan results and returns only the desired values.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * <p>
     * If you specify more than one condition in the <i>ScanFilter</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together. (You can use the <i>ConditionalOperator</i>
     * parameter to OR the conditions instead. If you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.)
     * </p>
     * <p>
     * Each <i>ScanFilter</i> element consists of an attribute name to compare, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the supplied attribute. The number of values
     * in the list depends on the operator specified in <i>ComparisonOperator</i> .
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
     * For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
     * </p>
     * <p>
     * For information on specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON Data Format</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes. For example, equals, greater than, less than,
     * etc.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * For complete descriptions of all comparison operators, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">Condition</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scanFilter
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New applications should use
     *        <i>FilterExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A condition that evaluates the scan results and returns only the desired values.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     *        </note>
     *        <p>
     *        If you specify more than one condition in the <i>ScanFilter</i> map, then by default all of the conditions
     *        must evaluate to true. In other words, the conditions are ANDed together. (You can use the
     *        <i>ConditionalOperator</i> parameter to OR the conditions instead. If you do this, then at least one of
     *        the conditions must evaluate to true, rather than all of them.)
     *        </p>
     *        <p>
     *        Each <i>ScanFilter</i> element consists of an attribute name to compare, along with the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeValueList</i> - One or more values to evaluate against the supplied attribute. The number of
     *        values in the list depends on the operator specified in <i>ComparisonOperator</i> .
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
     *        For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
     *        </p>
     *        <p>
     *        For information on specifying data types in JSON, see <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON Data
     *        Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ComparisonOperator</i> - A comparator for evaluating attributes. For example, equals, greater than,
     *        less than, etc.
     *        </p>
     *        <p>
     *        The following comparison operators are available:
     *        </p>
     *        <p>
     *        <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     *        </p>
     *        <p>
     *        For complete descriptions of all comparison operators, see <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">Condition</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanRequest withScanFilter(java.util.Map<String, Condition> scanFilter) {
        setScanFilter(scanFilter);
        return this;
    }

    public ScanRequest addScanFilterEntry(String key, Condition value) {
        if (null == this.scanFilter) {
            this.scanFilter = new java.util.HashMap<String, Condition>();
        }
        if (this.scanFilter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.scanFilter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ScanFilter.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanRequest clearScanFilterEntries() {
        this.scanFilter = null;
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>FilterExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>ScanFilter</i> map:
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
     *        <i>FilterExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A logical operator to apply to the conditions in a <i>ScanFilter</i> map:
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
     * This is a legacy parameter, for backward compatibility. New applications should use <i>FilterExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>ScanFilter</i> map:
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
     *         <i>FilterExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *         API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *         </p>
     *         </important>
     *         <p>
     *         A logical operator to apply to the conditions in a <i>ScanFilter</i> map:
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
     * This is a legacy parameter, for backward compatibility. New applications should use <i>FilterExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>ScanFilter</i> map:
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
     *        <i>FilterExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A logical operator to apply to the conditions in a <i>ScanFilter</i> map:
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

    public ScanRequest withConditionalOperator(String conditionalOperator) {
        setConditionalOperator(conditionalOperator);
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications should use <i>FilterExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>ScanFilter</i> map:
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
     *        <i>FilterExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A logical operator to apply to the conditions in a <i>ScanFilter</i> map:
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
     * This is a legacy parameter, for backward compatibility. New applications should use <i>FilterExpression</i>
     * instead. Do not combine legacy parameters and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>ScanFilter</i> map:
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
     *        <i>FilterExpression</i> instead. Do not combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A logical operator to apply to the conditions in a <i>ScanFilter</i> map:
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

    public ScanRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        setConditionalOperator(conditionalOperator);
        return this;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use the value that was returned for
     * <i>LastEvaluatedKey</i> in the previous operation.
     * </p>
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or Binary. No set data types are allowed.
     * </p>
     * <p>
     * In a parallel scan, a <i>Scan</i> request that includes <i>ExclusiveStartKey</i> must specify the same segment
     * whose previous <i>Scan</i> returned the corresponding value of <i>LastEvaluatedKey</i>.
     * </p>
     * 
     * @return The primary key of the first item that this operation will evaluate. Use the value that was returned for
     *         <i>LastEvaluatedKey</i> in the previous operation.</p>
     *         <p>
     *         The data type for <i>ExclusiveStartKey</i> must be String, Number or Binary. No set data types are
     *         allowed.
     *         </p>
     *         <p>
     *         In a parallel scan, a <i>Scan</i> request that includes <i>ExclusiveStartKey</i> must specify the same
     *         segment whose previous <i>Scan</i> returned the corresponding value of <i>LastEvaluatedKey</i>.
     */

    public java.util.Map<String, AttributeValue> getExclusiveStartKey() {
        return exclusiveStartKey;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use the value that was returned for
     * <i>LastEvaluatedKey</i> in the previous operation.
     * </p>
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or Binary. No set data types are allowed.
     * </p>
     * <p>
     * In a parallel scan, a <i>Scan</i> request that includes <i>ExclusiveStartKey</i> must specify the same segment
     * whose previous <i>Scan</i> returned the corresponding value of <i>LastEvaluatedKey</i>.
     * </p>
     * 
     * @param exclusiveStartKey
     *        The primary key of the first item that this operation will evaluate. Use the value that was returned for
     *        <i>LastEvaluatedKey</i> in the previous operation.</p>
     *        <p>
     *        The data type for <i>ExclusiveStartKey</i> must be String, Number or Binary. No set data types are
     *        allowed.
     *        </p>
     *        <p>
     *        In a parallel scan, a <i>Scan</i> request that includes <i>ExclusiveStartKey</i> must specify the same
     *        segment whose previous <i>Scan</i> returned the corresponding value of <i>LastEvaluatedKey</i>.
     */

    public void setExclusiveStartKey(java.util.Map<String, AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use the value that was returned for
     * <i>LastEvaluatedKey</i> in the previous operation.
     * </p>
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or Binary. No set data types are allowed.
     * </p>
     * <p>
     * In a parallel scan, a <i>Scan</i> request that includes <i>ExclusiveStartKey</i> must specify the same segment
     * whose previous <i>Scan</i> returned the corresponding value of <i>LastEvaluatedKey</i>.
     * </p>
     * 
     * @param exclusiveStartKey
     *        The primary key of the first item that this operation will evaluate. Use the value that was returned for
     *        <i>LastEvaluatedKey</i> in the previous operation.</p>
     *        <p>
     *        The data type for <i>ExclusiveStartKey</i> must be String, Number or Binary. No set data types are
     *        allowed.
     *        </p>
     *        <p>
     *        In a parallel scan, a <i>Scan</i> request that includes <i>ExclusiveStartKey</i> must specify the same
     *        segment whose previous <i>Scan</i> returned the corresponding value of <i>LastEvaluatedKey</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanRequest withExclusiveStartKey(java.util.Map<String, AttributeValue> exclusiveStartKey) {
        setExclusiveStartKey(exclusiveStartKey);
        return this;
    }

    public ScanRequest addExclusiveStartKeyEntry(String key, AttributeValue value) {
        if (null == this.exclusiveStartKey) {
            this.exclusiveStartKey = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.exclusiveStartKey.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.exclusiveStartKey.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExclusiveStartKey.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanRequest clearExclusiveStartKeyEntries() {
        this.exclusiveStartKey = null;
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

    public ScanRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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

    public ScanRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        setReturnConsumedCapacity(returnConsumedCapacity);
        return this;
    }

    /**
     * <p>
     * For a parallel <i>Scan</i> request, <i>TotalSegments</i> represents the total number of segments into which the
     * <i>Scan</i> operation will be divided. The value of <i>TotalSegments</i> corresponds to the number of application
     * workers that will perform the parallel scan. For example, if you want to use four application threads to scan a
     * table or an index, specify a <i>TotalSegments</i> value of 4.
     * </p>
     * <p>
     * The value for <i>TotalSegments</i> must be greater than or equal to 1, and less than or equal to 1000000. If you
     * specify a <i>TotalSegments</i> value of 1, the <i>Scan</i> operation will be sequential rather than parallel.
     * </p>
     * <p>
     * If you specify <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     * </p>
     * 
     * @param totalSegments
     *        For a parallel <i>Scan</i> request, <i>TotalSegments</i> represents the total number of segments into
     *        which the <i>Scan</i> operation will be divided. The value of <i>TotalSegments</i> corresponds to the
     *        number of application workers that will perform the parallel scan. For example, if you want to use four
     *        application threads to scan a table or an index, specify a <i>TotalSegments</i> value of 4.</p>
     *        <p>
     *        The value for <i>TotalSegments</i> must be greater than or equal to 1, and less than or equal to 1000000.
     *        If you specify a <i>TotalSegments</i> value of 1, the <i>Scan</i> operation will be sequential rather than
     *        parallel.
     *        </p>
     *        <p>
     *        If you specify <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     */

    public void setTotalSegments(Integer totalSegments) {
        this.totalSegments = totalSegments;
    }

    /**
     * <p>
     * For a parallel <i>Scan</i> request, <i>TotalSegments</i> represents the total number of segments into which the
     * <i>Scan</i> operation will be divided. The value of <i>TotalSegments</i> corresponds to the number of application
     * workers that will perform the parallel scan. For example, if you want to use four application threads to scan a
     * table or an index, specify a <i>TotalSegments</i> value of 4.
     * </p>
     * <p>
     * The value for <i>TotalSegments</i> must be greater than or equal to 1, and less than or equal to 1000000. If you
     * specify a <i>TotalSegments</i> value of 1, the <i>Scan</i> operation will be sequential rather than parallel.
     * </p>
     * <p>
     * If you specify <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     * </p>
     * 
     * @return For a parallel <i>Scan</i> request, <i>TotalSegments</i> represents the total number of segments into
     *         which the <i>Scan</i> operation will be divided. The value of <i>TotalSegments</i> corresponds to the
     *         number of application workers that will perform the parallel scan. For example, if you want to use four
     *         application threads to scan a table or an index, specify a <i>TotalSegments</i> value of 4.</p>
     *         <p>
     *         The value for <i>TotalSegments</i> must be greater than or equal to 1, and less than or equal to 1000000.
     *         If you specify a <i>TotalSegments</i> value of 1, the <i>Scan</i> operation will be sequential rather
     *         than parallel.
     *         </p>
     *         <p>
     *         If you specify <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     */

    public Integer getTotalSegments() {
        return this.totalSegments;
    }

    /**
     * <p>
     * For a parallel <i>Scan</i> request, <i>TotalSegments</i> represents the total number of segments into which the
     * <i>Scan</i> operation will be divided. The value of <i>TotalSegments</i> corresponds to the number of application
     * workers that will perform the parallel scan. For example, if you want to use four application threads to scan a
     * table or an index, specify a <i>TotalSegments</i> value of 4.
     * </p>
     * <p>
     * The value for <i>TotalSegments</i> must be greater than or equal to 1, and less than or equal to 1000000. If you
     * specify a <i>TotalSegments</i> value of 1, the <i>Scan</i> operation will be sequential rather than parallel.
     * </p>
     * <p>
     * If you specify <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     * </p>
     * 
     * @param totalSegments
     *        For a parallel <i>Scan</i> request, <i>TotalSegments</i> represents the total number of segments into
     *        which the <i>Scan</i> operation will be divided. The value of <i>TotalSegments</i> corresponds to the
     *        number of application workers that will perform the parallel scan. For example, if you want to use four
     *        application threads to scan a table or an index, specify a <i>TotalSegments</i> value of 4.</p>
     *        <p>
     *        The value for <i>TotalSegments</i> must be greater than or equal to 1, and less than or equal to 1000000.
     *        If you specify a <i>TotalSegments</i> value of 1, the <i>Scan</i> operation will be sequential rather than
     *        parallel.
     *        </p>
     *        <p>
     *        If you specify <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanRequest withTotalSegments(Integer totalSegments) {
        setTotalSegments(totalSegments);
        return this;
    }

    /**
     * <p>
     * For a parallel <i>Scan</i> request, <i>Segment</i> identifies an individual segment to be scanned by an
     * application worker.
     * </p>
     * <p>
     * Segment IDs are zero-based, so the first segment is always 0. For example, if you want to use four application
     * threads to scan a table or an index, then the first thread specifies a <i>Segment</i> value of 0, the second
     * thread specifies 1, and so on.
     * </p>
     * <p>
     * The value of <i>LastEvaluatedKey</i> returned from a parallel <i>Scan</i> request must be used as
     * <i>ExclusiveStartKey</i> with the same segment ID in a subsequent <i>Scan</i> operation.
     * </p>
     * <p>
     * The value for <i>Segment</i> must be greater than or equal to 0, and less than the value provided for
     * <i>TotalSegments</i>.
     * </p>
     * <p>
     * If you provide <i>Segment</i>, you must also provide <i>TotalSegments</i>.
     * </p>
     * 
     * @param segment
     *        For a parallel <i>Scan</i> request, <i>Segment</i> identifies an individual segment to be scanned by an
     *        application worker.</p>
     *        <p>
     *        Segment IDs are zero-based, so the first segment is always 0. For example, if you want to use four
     *        application threads to scan a table or an index, then the first thread specifies a <i>Segment</i> value of
     *        0, the second thread specifies 1, and so on.
     *        </p>
     *        <p>
     *        The value of <i>LastEvaluatedKey</i> returned from a parallel <i>Scan</i> request must be used as
     *        <i>ExclusiveStartKey</i> with the same segment ID in a subsequent <i>Scan</i> operation.
     *        </p>
     *        <p>
     *        The value for <i>Segment</i> must be greater than or equal to 0, and less than the value provided for
     *        <i>TotalSegments</i>.
     *        </p>
     *        <p>
     *        If you provide <i>Segment</i>, you must also provide <i>TotalSegments</i>.
     */

    public void setSegment(Integer segment) {
        this.segment = segment;
    }

    /**
     * <p>
     * For a parallel <i>Scan</i> request, <i>Segment</i> identifies an individual segment to be scanned by an
     * application worker.
     * </p>
     * <p>
     * Segment IDs are zero-based, so the first segment is always 0. For example, if you want to use four application
     * threads to scan a table or an index, then the first thread specifies a <i>Segment</i> value of 0, the second
     * thread specifies 1, and so on.
     * </p>
     * <p>
     * The value of <i>LastEvaluatedKey</i> returned from a parallel <i>Scan</i> request must be used as
     * <i>ExclusiveStartKey</i> with the same segment ID in a subsequent <i>Scan</i> operation.
     * </p>
     * <p>
     * The value for <i>Segment</i> must be greater than or equal to 0, and less than the value provided for
     * <i>TotalSegments</i>.
     * </p>
     * <p>
     * If you provide <i>Segment</i>, you must also provide <i>TotalSegments</i>.
     * </p>
     * 
     * @return For a parallel <i>Scan</i> request, <i>Segment</i> identifies an individual segment to be scanned by an
     *         application worker.</p>
     *         <p>
     *         Segment IDs are zero-based, so the first segment is always 0. For example, if you want to use four
     *         application threads to scan a table or an index, then the first thread specifies a <i>Segment</i> value
     *         of 0, the second thread specifies 1, and so on.
     *         </p>
     *         <p>
     *         The value of <i>LastEvaluatedKey</i> returned from a parallel <i>Scan</i> request must be used as
     *         <i>ExclusiveStartKey</i> with the same segment ID in a subsequent <i>Scan</i> operation.
     *         </p>
     *         <p>
     *         The value for <i>Segment</i> must be greater than or equal to 0, and less than the value provided for
     *         <i>TotalSegments</i>.
     *         </p>
     *         <p>
     *         If you provide <i>Segment</i>, you must also provide <i>TotalSegments</i>.
     */

    public Integer getSegment() {
        return this.segment;
    }

    /**
     * <p>
     * For a parallel <i>Scan</i> request, <i>Segment</i> identifies an individual segment to be scanned by an
     * application worker.
     * </p>
     * <p>
     * Segment IDs are zero-based, so the first segment is always 0. For example, if you want to use four application
     * threads to scan a table or an index, then the first thread specifies a <i>Segment</i> value of 0, the second
     * thread specifies 1, and so on.
     * </p>
     * <p>
     * The value of <i>LastEvaluatedKey</i> returned from a parallel <i>Scan</i> request must be used as
     * <i>ExclusiveStartKey</i> with the same segment ID in a subsequent <i>Scan</i> operation.
     * </p>
     * <p>
     * The value for <i>Segment</i> must be greater than or equal to 0, and less than the value provided for
     * <i>TotalSegments</i>.
     * </p>
     * <p>
     * If you provide <i>Segment</i>, you must also provide <i>TotalSegments</i>.
     * </p>
     * 
     * @param segment
     *        For a parallel <i>Scan</i> request, <i>Segment</i> identifies an individual segment to be scanned by an
     *        application worker.</p>
     *        <p>
     *        Segment IDs are zero-based, so the first segment is always 0. For example, if you want to use four
     *        application threads to scan a table or an index, then the first thread specifies a <i>Segment</i> value of
     *        0, the second thread specifies 1, and so on.
     *        </p>
     *        <p>
     *        The value of <i>LastEvaluatedKey</i> returned from a parallel <i>Scan</i> request must be used as
     *        <i>ExclusiveStartKey</i> with the same segment ID in a subsequent <i>Scan</i> operation.
     *        </p>
     *        <p>
     *        The value for <i>Segment</i> must be greater than or equal to 0, and less than the value provided for
     *        <i>TotalSegments</i>.
     *        </p>
     *        <p>
     *        If you provide <i>Segment</i>, you must also provide <i>TotalSegments</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanRequest withSegment(Integer segment) {
        setSegment(segment);
        return this;
    }

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the specified table or index. These attributes
     * can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by
     * commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are
     * not found, they will not appear in the result.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i> parameter.
     * </p>
     * </note>
     * 
     * @param projectionExpression
     *        A string that identifies one or more attributes to retrieve from the specified table or index. These
     *        attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression
     *        must be separated by commas.</p>
     *        <p>
     *        If no attribute names are specified, then all attributes will be returned. If any of the requested
     *        attributes are not found, they will not appear in the result.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i> parameter.
     *        </p>
     */

    public void setProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
    }

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the specified table or index. These attributes
     * can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by
     * commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are
     * not found, they will not appear in the result.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i> parameter.
     * </p>
     * </note>
     * 
     * @return A string that identifies one or more attributes to retrieve from the specified table or index. These
     *         attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression
     *         must be separated by commas.</p>
     *         <p>
     *         If no attribute names are specified, then all attributes will be returned. If any of the requested
     *         attributes are not found, they will not appear in the result.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *         >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i> parameter.
     *         </p>
     */

    public String getProjectionExpression() {
        return this.projectionExpression;
    }

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the specified table or index. These attributes
     * can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by
     * commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are
     * not found, they will not appear in the result.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i> parameter.
     * </p>
     * </note>
     * 
     * @param projectionExpression
     *        A string that identifies one or more attributes to retrieve from the specified table or index. These
     *        attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression
     *        must be separated by commas.</p>
     *        <p>
     *        If no attribute names are specified, then all attributes will be returned. If any of the requested
     *        attributes are not found, they will not appear in the result.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i> parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanRequest withProjectionExpression(String projectionExpression) {
        setProjectionExpression(projectionExpression);
        return this;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the <i>Scan</i> operation, but before the data is
     * returned to you. Items that do not satisfy the <i>FilterExpression</i> criteria are not returned.
     * </p>
     * <note>
     * <p>
     * A <i>FilterExpression</i> is applied after the items have already been read; the process of filtering does not
     * consume any additional read capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults">Filter
     * Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>FilterExpression</i> replaces the legacy <i>ScanFilter</i> and <i>ConditionalOperator</i> parameters.
     * </p>
     * </note>
     * 
     * @param filterExpression
     *        A string that contains conditions that DynamoDB applies after the <i>Scan</i> operation, but before the
     *        data is returned to you. Items that do not satisfy the <i>FilterExpression</i> criteria are not
     *        returned.</p> <note>
     *        <p>
     *        A <i>FilterExpression</i> is applied after the items have already been read; the process of filtering does
     *        not consume any additional read capacity units.
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *        >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <i>FilterExpression</i> replaces the legacy <i>ScanFilter</i> and <i>ConditionalOperator</i> parameters.
     *        </p>
     */

    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the <i>Scan</i> operation, but before the data is
     * returned to you. Items that do not satisfy the <i>FilterExpression</i> criteria are not returned.
     * </p>
     * <note>
     * <p>
     * A <i>FilterExpression</i> is applied after the items have already been read; the process of filtering does not
     * consume any additional read capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults">Filter
     * Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>FilterExpression</i> replaces the legacy <i>ScanFilter</i> and <i>ConditionalOperator</i> parameters.
     * </p>
     * </note>
     * 
     * @return A string that contains conditions that DynamoDB applies after the <i>Scan</i> operation, but before the
     *         data is returned to you. Items that do not satisfy the <i>FilterExpression</i> criteria are not
     *         returned.</p> <note>
     *         <p>
     *         A <i>FilterExpression</i> is applied after the items have already been read; the process of filtering
     *         does not consume any additional read capacity units.
     *         </p>
     *         </note>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *         >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         <i>FilterExpression</i> replaces the legacy <i>ScanFilter</i> and <i>ConditionalOperator</i> parameters.
     *         </p>
     */

    public String getFilterExpression() {
        return this.filterExpression;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the <i>Scan</i> operation, but before the data is
     * returned to you. Items that do not satisfy the <i>FilterExpression</i> criteria are not returned.
     * </p>
     * <note>
     * <p>
     * A <i>FilterExpression</i> is applied after the items have already been read; the process of filtering does not
     * consume any additional read capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults">Filter
     * Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>FilterExpression</i> replaces the legacy <i>ScanFilter</i> and <i>ConditionalOperator</i> parameters.
     * </p>
     * </note>
     * 
     * @param filterExpression
     *        A string that contains conditions that DynamoDB applies after the <i>Scan</i> operation, but before the
     *        data is returned to you. Items that do not satisfy the <i>FilterExpression</i> criteria are not
     *        returned.</p> <note>
     *        <p>
     *        A <i>FilterExpression</i> is applied after the items have already been read; the process of filtering does
     *        not consume any additional read capacity units.
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *        >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <i>FilterExpression</i> replaces the legacy <i>ScanFilter</i> and <i>ConditionalOperator</i> parameters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanRequest withFilterExpression(String filterExpression) {
        setFilterExpression(filterExpression);
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

    public ScanRequest withExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        setExpressionAttributeNames(expressionAttributeNames);
        return this;
    }

    public ScanRequest addExpressionAttributeNamesEntry(String key, String value) {
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

    public ScanRequest clearExpressionAttributeNamesEntries() {
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

    public ScanRequest withExpressionAttributeValues(java.util.Map<String, AttributeValue> expressionAttributeValues) {
        setExpressionAttributeValues(expressionAttributeValues);
        return this;
    }

    public ScanRequest addExpressionAttributeValuesEntry(String key, AttributeValue value) {
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

    public ScanRequest clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
        return this;
    }

    /**
     * <p>
     * A Boolean value that determines the read consistency model during the scan:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <i>ConsistentRead</i> is <code>false</code>, then the data returned from <i>Scan</i> might not contain the
     * results from other recently completed write operations (PutItem, UpdateItem or DeleteItem).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <i>ConsistentRead</i> is <code>true</code>, then all of the write operations that completed before the
     * <i>Scan</i> began are guaranteed to be contained in the <i>Scan</i> response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting for <i>ConsistentRead</i> is <code>false</code>.
     * </p>
     * <p>
     * The <i>ConsistentRead</i> parameter is not supported on global secondary indexes. If you scan a global secondary
     * index with <i>ConsistentRead</i> set to true, you will receive a <i>ValidationException</i>.
     * </p>
     * 
     * @param consistentRead
     *        A Boolean value that determines the read consistency model during the scan:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <i>ConsistentRead</i> is <code>false</code>, then the data returned from <i>Scan</i> might not contain
     *        the results from other recently completed write operations (PutItem, UpdateItem or DeleteItem).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <i>ConsistentRead</i> is <code>true</code>, then all of the write operations that completed before the
     *        <i>Scan</i> began are guaranteed to be contained in the <i>Scan</i> response.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default setting for <i>ConsistentRead</i> is <code>false</code>.
     *        </p>
     *        <p>
     *        The <i>ConsistentRead</i> parameter is not supported on global secondary indexes. If you scan a global
     *        secondary index with <i>ConsistentRead</i> set to true, you will receive a <i>ValidationException</i>.
     */

    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }

    /**
     * <p>
     * A Boolean value that determines the read consistency model during the scan:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <i>ConsistentRead</i> is <code>false</code>, then the data returned from <i>Scan</i> might not contain the
     * results from other recently completed write operations (PutItem, UpdateItem or DeleteItem).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <i>ConsistentRead</i> is <code>true</code>, then all of the write operations that completed before the
     * <i>Scan</i> began are guaranteed to be contained in the <i>Scan</i> response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting for <i>ConsistentRead</i> is <code>false</code>.
     * </p>
     * <p>
     * The <i>ConsistentRead</i> parameter is not supported on global secondary indexes. If you scan a global secondary
     * index with <i>ConsistentRead</i> set to true, you will receive a <i>ValidationException</i>.
     * </p>
     * 
     * @return A Boolean value that determines the read consistency model during the scan:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <i>ConsistentRead</i> is <code>false</code>, then the data returned from <i>Scan</i> might not contain
     *         the results from other recently completed write operations (PutItem, UpdateItem or DeleteItem).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <i>ConsistentRead</i> is <code>true</code>, then all of the write operations that completed before the
     *         <i>Scan</i> began are guaranteed to be contained in the <i>Scan</i> response.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default setting for <i>ConsistentRead</i> is <code>false</code>.
     *         </p>
     *         <p>
     *         The <i>ConsistentRead</i> parameter is not supported on global secondary indexes. If you scan a global
     *         secondary index with <i>ConsistentRead</i> set to true, you will receive a <i>ValidationException</i>.
     */

    public Boolean getConsistentRead() {
        return this.consistentRead;
    }

    /**
     * <p>
     * A Boolean value that determines the read consistency model during the scan:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <i>ConsistentRead</i> is <code>false</code>, then the data returned from <i>Scan</i> might not contain the
     * results from other recently completed write operations (PutItem, UpdateItem or DeleteItem).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <i>ConsistentRead</i> is <code>true</code>, then all of the write operations that completed before the
     * <i>Scan</i> began are guaranteed to be contained in the <i>Scan</i> response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting for <i>ConsistentRead</i> is <code>false</code>.
     * </p>
     * <p>
     * The <i>ConsistentRead</i> parameter is not supported on global secondary indexes. If you scan a global secondary
     * index with <i>ConsistentRead</i> set to true, you will receive a <i>ValidationException</i>.
     * </p>
     * 
     * @param consistentRead
     *        A Boolean value that determines the read consistency model during the scan:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <i>ConsistentRead</i> is <code>false</code>, then the data returned from <i>Scan</i> might not contain
     *        the results from other recently completed write operations (PutItem, UpdateItem or DeleteItem).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <i>ConsistentRead</i> is <code>true</code>, then all of the write operations that completed before the
     *        <i>Scan</i> began are guaranteed to be contained in the <i>Scan</i> response.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default setting for <i>ConsistentRead</i> is <code>false</code>.
     *        </p>
     *        <p>
     *        The <i>ConsistentRead</i> parameter is not supported on global secondary indexes. If you scan a global
     *        secondary index with <i>ConsistentRead</i> set to true, you will receive a <i>ValidationException</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanRequest withConsistentRead(Boolean consistentRead) {
        setConsistentRead(consistentRead);
        return this;
    }

    /**
     * <p>
     * A Boolean value that determines the read consistency model during the scan:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <i>ConsistentRead</i> is <code>false</code>, then the data returned from <i>Scan</i> might not contain the
     * results from other recently completed write operations (PutItem, UpdateItem or DeleteItem).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <i>ConsistentRead</i> is <code>true</code>, then all of the write operations that completed before the
     * <i>Scan</i> began are guaranteed to be contained in the <i>Scan</i> response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting for <i>ConsistentRead</i> is <code>false</code>.
     * </p>
     * <p>
     * The <i>ConsistentRead</i> parameter is not supported on global secondary indexes. If you scan a global secondary
     * index with <i>ConsistentRead</i> set to true, you will receive a <i>ValidationException</i>.
     * </p>
     * 
     * @return A Boolean value that determines the read consistency model during the scan:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <i>ConsistentRead</i> is <code>false</code>, then the data returned from <i>Scan</i> might not contain
     *         the results from other recently completed write operations (PutItem, UpdateItem or DeleteItem).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <i>ConsistentRead</i> is <code>true</code>, then all of the write operations that completed before the
     *         <i>Scan</i> began are guaranteed to be contained in the <i>Scan</i> response.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default setting for <i>ConsistentRead</i> is <code>false</code>.
     *         </p>
     *         <p>
     *         The <i>ConsistentRead</i> parameter is not supported on global secondary indexes. If you scan a global
     *         secondary index with <i>ConsistentRead</i> set to true, you will receive a <i>ValidationException</i>.
     */

    public Boolean isConsistentRead() {
        return this.consistentRead;
    }

    /**
     * The primary hash and range keys of the first item that this operation will evaluate. Use the value that was
     * returned for <i>LastEvaluatedKey</i> in the previous operation.
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or Binary. No set data types are allowed.
     *
     * @param hashKey
     *        a map entry including the name and value of the primary hash key.
     * @param rangeKey
     *        a map entry including the name and value of the primary range key, or null if it is a hash-only table.
     */
    public void setExclusiveStartKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey)
            throws IllegalArgumentException {
        java.util.HashMap<String, AttributeValue> exclusiveStartKey = new java.util.HashMap<String, AttributeValue>();
        if (hashKey != null) {
            exclusiveStartKey.put(hashKey.getKey(), hashKey.getValue());
        } else {
            throw new IllegalArgumentException("hashKey must be non-null object.");
        }
        if (rangeKey != null) {
            exclusiveStartKey.put(rangeKey.getKey(), rangeKey.getValue());
        }
        setExclusiveStartKey(exclusiveStartKey);
    }

    /**
     * The primary hash and range keys of the first item that this operation will evaluate. Use the value that was
     * returned for <i>LastEvaluatedKey</i> in the previous operation.
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or Binary. No set data types are allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hashKey
     *        a map entry including the name and value of the primary hash key.
     * @param rangeKey
     *        a map entry including the name and value of the primary range key, or null if it is a hash-only table.
     */
    public ScanRequest withExclusiveStartKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey)
            throws IllegalArgumentException {
        setExclusiveStartKey(hashKey, rangeKey);
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
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
        if (getAttributesToGet() != null)
            sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getSelect() != null)
            sb.append("Select: " + getSelect() + ",");
        if (getScanFilter() != null)
            sb.append("ScanFilter: " + getScanFilter() + ",");
        if (getConditionalOperator() != null)
            sb.append("ConditionalOperator: " + getConditionalOperator() + ",");
        if (getExclusiveStartKey() != null)
            sb.append("ExclusiveStartKey: " + getExclusiveStartKey() + ",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getTotalSegments() != null)
            sb.append("TotalSegments: " + getTotalSegments() + ",");
        if (getSegment() != null)
            sb.append("Segment: " + getSegment() + ",");
        if (getProjectionExpression() != null)
            sb.append("ProjectionExpression: " + getProjectionExpression() + ",");
        if (getFilterExpression() != null)
            sb.append("FilterExpression: " + getFilterExpression() + ",");
        if (getExpressionAttributeNames() != null)
            sb.append("ExpressionAttributeNames: " + getExpressionAttributeNames() + ",");
        if (getExpressionAttributeValues() != null)
            sb.append("ExpressionAttributeValues: " + getExpressionAttributeValues() + ",");
        if (getConsistentRead() != null)
            sb.append("ConsistentRead: " + getConsistentRead());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanRequest == false)
            return false;
        ScanRequest other = (ScanRequest) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null)
            return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getSelect() == null ^ this.getSelect() == null)
            return false;
        if (other.getSelect() != null && other.getSelect().equals(this.getSelect()) == false)
            return false;
        if (other.getScanFilter() == null ^ this.getScanFilter() == null)
            return false;
        if (other.getScanFilter() != null && other.getScanFilter().equals(this.getScanFilter()) == false)
            return false;
        if (other.getConditionalOperator() == null ^ this.getConditionalOperator() == null)
            return false;
        if (other.getConditionalOperator() != null && other.getConditionalOperator().equals(this.getConditionalOperator()) == false)
            return false;
        if (other.getExclusiveStartKey() == null ^ this.getExclusiveStartKey() == null)
            return false;
        if (other.getExclusiveStartKey() != null && other.getExclusiveStartKey().equals(this.getExclusiveStartKey()) == false)
            return false;
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null)
            return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false)
            return false;
        if (other.getTotalSegments() == null ^ this.getTotalSegments() == null)
            return false;
        if (other.getTotalSegments() != null && other.getTotalSegments().equals(this.getTotalSegments()) == false)
            return false;
        if (other.getSegment() == null ^ this.getSegment() == null)
            return false;
        if (other.getSegment() != null && other.getSegment().equals(this.getSegment()) == false)
            return false;
        if (other.getProjectionExpression() == null ^ this.getProjectionExpression() == null)
            return false;
        if (other.getProjectionExpression() != null && other.getProjectionExpression().equals(this.getProjectionExpression()) == false)
            return false;
        if (other.getFilterExpression() == null ^ this.getFilterExpression() == null)
            return false;
        if (other.getFilterExpression() != null && other.getFilterExpression().equals(this.getFilterExpression()) == false)
            return false;
        if (other.getExpressionAttributeNames() == null ^ this.getExpressionAttributeNames() == null)
            return false;
        if (other.getExpressionAttributeNames() != null && other.getExpressionAttributeNames().equals(this.getExpressionAttributeNames()) == false)
            return false;
        if (other.getExpressionAttributeValues() == null ^ this.getExpressionAttributeValues() == null)
            return false;
        if (other.getExpressionAttributeValues() != null && other.getExpressionAttributeValues().equals(this.getExpressionAttributeValues()) == false)
            return false;
        if (other.getConsistentRead() == null ^ this.getConsistentRead() == null)
            return false;
        if (other.getConsistentRead() != null && other.getConsistentRead().equals(this.getConsistentRead()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getSelect() == null) ? 0 : getSelect().hashCode());
        hashCode = prime * hashCode + ((getScanFilter() == null) ? 0 : getScanFilter().hashCode());
        hashCode = prime * hashCode + ((getConditionalOperator() == null) ? 0 : getConditionalOperator().hashCode());
        hashCode = prime * hashCode + ((getExclusiveStartKey() == null) ? 0 : getExclusiveStartKey().hashCode());
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode());
        hashCode = prime * hashCode + ((getTotalSegments() == null) ? 0 : getTotalSegments().hashCode());
        hashCode = prime * hashCode + ((getSegment() == null) ? 0 : getSegment().hashCode());
        hashCode = prime * hashCode + ((getProjectionExpression() == null) ? 0 : getProjectionExpression().hashCode());
        hashCode = prime * hashCode + ((getFilterExpression() == null) ? 0 : getFilterExpression().hashCode());
        hashCode = prime * hashCode + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getExpressionAttributeValues() == null) ? 0 : getExpressionAttributeValues().hashCode());
        hashCode = prime * hashCode + ((getConsistentRead() == null) ? 0 : getConsistentRead().hashCode());
        return hashCode;
    }

    @Override
    public ScanRequest clone() {
        return (ScanRequest) super.clone();
    }
}
