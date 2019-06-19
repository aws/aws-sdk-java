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
 * Represents the input of a <code>Query</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Query" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the table containing the requested items.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The name of an index to query. This index can be any local secondary index or global secondary index on the
     * table. Note that if you use the <code>IndexName</code> parameter, you must also provide <code>TableName.</code>
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the
     * count of matching items, or in the case of an index, some or all of the attributes projected into the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the specified table or index. If you query
     * a local secondary index, then for each matching item in the index DynamoDB will fetch the entire item from the
     * parent table. If the index is configured to project all item attributes, then all of the data can be obtained
     * from the local secondary index, and no fetching is required.
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
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <code>AttributesToGet</code>. This
     * return value is equivalent to specifying <code>AttributesToGet</code> without specifying any value for
     * <code>Select</code>.
     * </p>
     * <p>
     * If you query or scan a local secondary index and request only attributes that are projected into that index, the
     * operation will read only the index and not the table. If any of the requested attributes are not projected into
     * the local secondary index, DynamoDB will fetch each of these attributes from the parent table. This extra
     * fetching incurs additional throughput cost and latency.
     * </p>
     * <p>
     * If you query or scan a global secondary index, you can only request attributes that are projected into the index.
     * Global secondary index queries cannot fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <code>Select</code> nor <code>AttributesToGet</code> are specified, DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code> when accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     * index. You cannot use both <code>Select</code> and <code>AttributesToGet</code> together in a single request,
     * unless the value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <code>AttributesToGet</code> without any value for <code>Select</code>.)
     * </p>
     * <note>
     * <p>
     * If you use the <code>ProjectionExpression</code> parameter, then the value for <code>Select</code> can only be
     * <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code> will return an error.
     * </p>
     * </note>
     */
    private String select;
    /**
     * <p>
     * This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     * >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.List<String> attributesToGet;
    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the
     * number of items up to the limit while processing the results, it stops the operation and returns the matching
     * values up to that point, and a key in <code>LastEvaluatedKey</code> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set size exceeds 1 MB before DynamoDB reaches
     * this limit, it stops the operation and returns the matching values up to the limit, and a key in
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation to continue the operation. For more information,
     * see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and
     * Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then the operation uses strongly consistent
     * reads; otherwise, the operation uses eventually consistent reads.
     * </p>
     * <p>
     * Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary index
     * with <code>ConsistentRead</code> set to <code>true</code>, you will receive a <code>ValidationException</code>.
     * </p>
     */
    private Boolean consistentRead;
    /**
     * <p>
     * This is a legacy parameter. Use <code>KeyConditionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     * >KeyConditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, Condition> keyConditions;
    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     * >QueryFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, Condition> queryFilter;
    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private String conditionalOperator;
    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default), the traversal is performed in ascending
     * order; if <code>false</code>, the traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by sort key. If the sort key data type is
     * Number, the results are stored in numeric order. For type String, the results are stored in order of UTF-8 bytes.
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned.
     * </p>
     * <p>
     * If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns the results in the order in which they
     * are stored (by sort key value). This is the default behavior. If <code>ScanIndexForward</code> is
     * <code>false</code>, DynamoDB reads the results in reverse order by sort key value, and then returns the results
     * to the client.
     * </p>
     */
    private Boolean scanIndexForward;
    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use the value that was returned for
     * <code>LastEvaluatedKey</code> in the previous operation.
     * </p>
     * <p>
     * The data type for <code>ExclusiveStartKey</code> must be String, Number or Binary. No set data types are allowed.
     * </p>
     */
    private java.util.Map<String, AttributeValue> exclusiveStartKey;

    private String returnConsumedCapacity;
    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars,
     * sets, or elements of a JSON document. The attributes in the expression must be separated by commas.
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
     */
    private String projectionExpression;
    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the <code>Query</code> operation, but before the
     * data is returned to you. Items that do not satisfy the <code>FilterExpression</code> criteria are not returned.
     * </p>
     * <p>
     * A <code>FilterExpression</code> does not allow key attributes. You cannot define a filter expression based on a
     * partition key or a sort key.
     * </p>
     * <note>
     * <p>
     * A <code>FilterExpression</code> is applied after the items have already been read; the process of filtering does
     * not consume any additional read capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults">Filter
     * Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private String filterExpression;
    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved by the <code>Query</code> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key value.
     * </p>
     * <p>
     * The condition can optionally perform one of several comparison tests on a single sort key value. This allows
     * <code>Query</code> to retrieve one item with a given partition key value and sort key value, or several items
     * that have the same partition key value but different sort key values.
     * </p>
     * <p>
     * The partition key equality test is required, and must be specified in the following format:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * </p>
     * <p>
     * If you also want to provide a condition for the sort key, it must be combined using <code>AND</code> with the
     * condition for the sort key. Following is an example, using the <b>=</b> comparison operator for the sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <code>=</code> <code>:partitionkeyval</code> <code>AND</code>
     * <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code> - true if the sort key value is equal to
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;</code> <code>:sortkeyval</code> - true if the sort key value is less than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;=</code> <code>:sortkeyval</code> - true if the sort key value is less than or
     * equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;</code> <code>:sortkeyval</code> - true if the sort key value is greater than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;= </code> <code>:sortkeyval</code> - true if the sort key value is greater
     * than or equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>BETWEEN</code> <code>:sortkeyval1</code> <code>AND</code>
     * <code>:sortkeyval2</code> - true if the sort key value is greater than or equal to <code>:sortkeyval1</code>, and
     * less than or equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>begins_with (</code> <code>sortKeyName</code>, <code>:sortkeyval</code> <code>)</code> - true if the sort
     * key value begins with a particular operand. (You cannot use this function with a sort key that is of type
     * Number.) Note that the function name <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <code>ExpressionAttributeValues</code> parameter to replace tokens such as <code>:partitionval</code> and
     * <code>:sortval</code> with actual values at runtime.
     * </p>
     * <p>
     * You can optionally use the <code>ExpressionAttributeNames</code> parameter to replace the names of the partition
     * key and sort key with placeholder tokens. This option might be necessary if an attribute name conflicts with a
     * DynamoDB reserved word. For example, the following <code>KeyConditionExpression</code> parameter causes an error
     * because <i>Size</i> is a reserved word:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Size = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To work around this, define a placeholder (such a <code>#S</code>) to represent the attribute name <i>Size</i>.
     * <code>KeyConditionExpression</code> then is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#S = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of reserved words, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For more information on <code>ExpressionAttributeNames</code> and <code>ExpressionAttributeValues</code>, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html">Using
     * Placeholders for Attribute Names and Values</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private String keyConditionExpression;
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
     * Default constructor for QueryRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public QueryRequest() {
    }

    /**
     * Constructs a new QueryRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     *        The name of the table containing the requested items.
     */
    public QueryRequest(String tableName) {
        setTableName(tableName);
    }

    /**
     * <p>
     * The name of the table containing the requested items.
     * </p>
     * 
     * @param tableName
     *        The name of the table containing the requested items.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table containing the requested items.
     * </p>
     * 
     * @return The name of the table containing the requested items.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table containing the requested items.
     * </p>
     * 
     * @param tableName
     *        The name of the table containing the requested items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The name of an index to query. This index can be any local secondary index or global secondary index on the
     * table. Note that if you use the <code>IndexName</code> parameter, you must also provide <code>TableName.</code>
     * </p>
     * 
     * @param indexName
     *        The name of an index to query. This index can be any local secondary index or global secondary index on
     *        the table. Note that if you use the <code>IndexName</code> parameter, you must also provide
     *        <code>TableName.</code>
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of an index to query. This index can be any local secondary index or global secondary index on the
     * table. Note that if you use the <code>IndexName</code> parameter, you must also provide <code>TableName.</code>
     * </p>
     * 
     * @return The name of an index to query. This index can be any local secondary index or global secondary index on
     *         the table. Note that if you use the <code>IndexName</code> parameter, you must also provide
     *         <code>TableName.</code>
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of an index to query. This index can be any local secondary index or global secondary index on the
     * table. Note that if you use the <code>IndexName</code> parameter, you must also provide <code>TableName.</code>
     * </p>
     * 
     * @param indexName
     *        The name of an index to query. This index can be any local secondary index or global secondary index on
     *        the table. Note that if you use the <code>IndexName</code> parameter, you must also provide
     *        <code>TableName.</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the
     * count of matching items, or in the case of an index, some or all of the attributes projected into the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the specified table or index. If you query
     * a local secondary index, then for each matching item in the index DynamoDB will fetch the entire item from the
     * parent table. If the index is configured to project all item attributes, then all of the data can be obtained
     * from the local secondary index, and no fetching is required.
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
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <code>AttributesToGet</code>. This
     * return value is equivalent to specifying <code>AttributesToGet</code> without specifying any value for
     * <code>Select</code>.
     * </p>
     * <p>
     * If you query or scan a local secondary index and request only attributes that are projected into that index, the
     * operation will read only the index and not the table. If any of the requested attributes are not projected into
     * the local secondary index, DynamoDB will fetch each of these attributes from the parent table. This extra
     * fetching incurs additional throughput cost and latency.
     * </p>
     * <p>
     * If you query or scan a global secondary index, you can only request attributes that are projected into the index.
     * Global secondary index queries cannot fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <code>Select</code> nor <code>AttributesToGet</code> are specified, DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code> when accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     * index. You cannot use both <code>Select</code> and <code>AttributesToGet</code> together in a single request,
     * unless the value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <code>AttributesToGet</code> without any value for <code>Select</code>.)
     * </p>
     * <note>
     * <p>
     * If you use the <code>ProjectionExpression</code> parameter, then the value for <code>Select</code> can only be
     * <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code> will return an error.
     * </p>
     * </note>
     * 
     * @param select
     *        The attributes to be returned in the result. You can retrieve all item attributes, specific item
     *        attributes, the count of matching items, or in the case of an index, some or all of the attributes
     *        projected into the index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the specified table or index. If you
     *        query a local secondary index, then for each matching item in the index DynamoDB will fetch the entire
     *        item from the parent table. If the index is configured to project all item attributes, then all of the
     *        data can be obtained from the local secondary index, and no fetching is required.
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
     *        <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <code>AttributesToGet</code>.
     *        This return value is equivalent to specifying <code>AttributesToGet</code> without specifying any value
     *        for <code>Select</code>.
     *        </p>
     *        <p>
     *        If you query or scan a local secondary index and request only attributes that are projected into that
     *        index, the operation will read only the index and not the table. If any of the requested attributes are
     *        not projected into the local secondary index, DynamoDB will fetch each of these attributes from the parent
     *        table. This extra fetching incurs additional throughput cost and latency.
     *        </p>
     *        <p>
     *        If you query or scan a global secondary index, you can only request attributes that are projected into the
     *        index. Global secondary index queries cannot fetch attributes from the parent table.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If neither <code>Select</code> nor <code>AttributesToGet</code> are specified, DynamoDB defaults to
     *        <code>ALL_ATTRIBUTES</code> when accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     *        accessing an index. You cannot use both <code>Select</code> and <code>AttributesToGet</code> together in a
     *        single request, unless the value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage
     *        is equivalent to specifying <code>AttributesToGet</code> without any value for <code>Select</code>.)
     *        </p>
     *        <note>
     *        <p>
     *        If you use the <code>ProjectionExpression</code> parameter, then the value for <code>Select</code> can
     *        only be <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code> will return an error.
     *        </p>
     * @see Select
     */

    public void setSelect(String select) {
        this.select = select;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the
     * count of matching items, or in the case of an index, some or all of the attributes projected into the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the specified table or index. If you query
     * a local secondary index, then for each matching item in the index DynamoDB will fetch the entire item from the
     * parent table. If the index is configured to project all item attributes, then all of the data can be obtained
     * from the local secondary index, and no fetching is required.
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
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <code>AttributesToGet</code>. This
     * return value is equivalent to specifying <code>AttributesToGet</code> without specifying any value for
     * <code>Select</code>.
     * </p>
     * <p>
     * If you query or scan a local secondary index and request only attributes that are projected into that index, the
     * operation will read only the index and not the table. If any of the requested attributes are not projected into
     * the local secondary index, DynamoDB will fetch each of these attributes from the parent table. This extra
     * fetching incurs additional throughput cost and latency.
     * </p>
     * <p>
     * If you query or scan a global secondary index, you can only request attributes that are projected into the index.
     * Global secondary index queries cannot fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <code>Select</code> nor <code>AttributesToGet</code> are specified, DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code> when accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     * index. You cannot use both <code>Select</code> and <code>AttributesToGet</code> together in a single request,
     * unless the value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <code>AttributesToGet</code> without any value for <code>Select</code>.)
     * </p>
     * <note>
     * <p>
     * If you use the <code>ProjectionExpression</code> parameter, then the value for <code>Select</code> can only be
     * <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code> will return an error.
     * </p>
     * </note>
     * 
     * @return The attributes to be returned in the result. You can retrieve all item attributes, specific item
     *         attributes, the count of matching items, or in the case of an index, some or all of the attributes
     *         projected into the index.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the specified table or index. If
     *         you query a local secondary index, then for each matching item in the index DynamoDB will fetch the
     *         entire item from the parent table. If the index is configured to project all item attributes, then all of
     *         the data can be obtained from the local secondary index, and no fetching is required.
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
     *         <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <code>AttributesToGet</code>.
     *         This return value is equivalent to specifying <code>AttributesToGet</code> without specifying any value
     *         for <code>Select</code>.
     *         </p>
     *         <p>
     *         If you query or scan a local secondary index and request only attributes that are projected into that
     *         index, the operation will read only the index and not the table. If any of the requested attributes are
     *         not projected into the local secondary index, DynamoDB will fetch each of these attributes from the
     *         parent table. This extra fetching incurs additional throughput cost and latency.
     *         </p>
     *         <p>
     *         If you query or scan a global secondary index, you can only request attributes that are projected into
     *         the index. Global secondary index queries cannot fetch attributes from the parent table.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If neither <code>Select</code> nor <code>AttributesToGet</code> are specified, DynamoDB defaults to
     *         <code>ALL_ATTRIBUTES</code> when accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     *         accessing an index. You cannot use both <code>Select</code> and <code>AttributesToGet</code> together in
     *         a single request, unless the value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This
     *         usage is equivalent to specifying <code>AttributesToGet</code> without any value for <code>Select</code>
     *         .)
     *         </p>
     *         <note>
     *         <p>
     *         If you use the <code>ProjectionExpression</code> parameter, then the value for <code>Select</code> can
     *         only be <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code> will return an error.
     *         </p>
     * @see Select
     */

    public String getSelect() {
        return this.select;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the
     * count of matching items, or in the case of an index, some or all of the attributes projected into the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the specified table or index. If you query
     * a local secondary index, then for each matching item in the index DynamoDB will fetch the entire item from the
     * parent table. If the index is configured to project all item attributes, then all of the data can be obtained
     * from the local secondary index, and no fetching is required.
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
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <code>AttributesToGet</code>. This
     * return value is equivalent to specifying <code>AttributesToGet</code> without specifying any value for
     * <code>Select</code>.
     * </p>
     * <p>
     * If you query or scan a local secondary index and request only attributes that are projected into that index, the
     * operation will read only the index and not the table. If any of the requested attributes are not projected into
     * the local secondary index, DynamoDB will fetch each of these attributes from the parent table. This extra
     * fetching incurs additional throughput cost and latency.
     * </p>
     * <p>
     * If you query or scan a global secondary index, you can only request attributes that are projected into the index.
     * Global secondary index queries cannot fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <code>Select</code> nor <code>AttributesToGet</code> are specified, DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code> when accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     * index. You cannot use both <code>Select</code> and <code>AttributesToGet</code> together in a single request,
     * unless the value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <code>AttributesToGet</code> without any value for <code>Select</code>.)
     * </p>
     * <note>
     * <p>
     * If you use the <code>ProjectionExpression</code> parameter, then the value for <code>Select</code> can only be
     * <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code> will return an error.
     * </p>
     * </note>
     * 
     * @param select
     *        The attributes to be returned in the result. You can retrieve all item attributes, specific item
     *        attributes, the count of matching items, or in the case of an index, some or all of the attributes
     *        projected into the index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the specified table or index. If you
     *        query a local secondary index, then for each matching item in the index DynamoDB will fetch the entire
     *        item from the parent table. If the index is configured to project all item attributes, then all of the
     *        data can be obtained from the local secondary index, and no fetching is required.
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
     *        <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <code>AttributesToGet</code>.
     *        This return value is equivalent to specifying <code>AttributesToGet</code> without specifying any value
     *        for <code>Select</code>.
     *        </p>
     *        <p>
     *        If you query or scan a local secondary index and request only attributes that are projected into that
     *        index, the operation will read only the index and not the table. If any of the requested attributes are
     *        not projected into the local secondary index, DynamoDB will fetch each of these attributes from the parent
     *        table. This extra fetching incurs additional throughput cost and latency.
     *        </p>
     *        <p>
     *        If you query or scan a global secondary index, you can only request attributes that are projected into the
     *        index. Global secondary index queries cannot fetch attributes from the parent table.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If neither <code>Select</code> nor <code>AttributesToGet</code> are specified, DynamoDB defaults to
     *        <code>ALL_ATTRIBUTES</code> when accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     *        accessing an index. You cannot use both <code>Select</code> and <code>AttributesToGet</code> together in a
     *        single request, unless the value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage
     *        is equivalent to specifying <code>AttributesToGet</code> without any value for <code>Select</code>.)
     *        </p>
     *        <note>
     *        <p>
     *        If you use the <code>ProjectionExpression</code> parameter, then the value for <code>Select</code> can
     *        only be <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code> will return an error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Select
     */

    public QueryRequest withSelect(String select) {
        setSelect(select);
        return this;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the
     * count of matching items, or in the case of an index, some or all of the attributes projected into the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the specified table or index. If you query
     * a local secondary index, then for each matching item in the index DynamoDB will fetch the entire item from the
     * parent table. If the index is configured to project all item attributes, then all of the data can be obtained
     * from the local secondary index, and no fetching is required.
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
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <code>AttributesToGet</code>. This
     * return value is equivalent to specifying <code>AttributesToGet</code> without specifying any value for
     * <code>Select</code>.
     * </p>
     * <p>
     * If you query or scan a local secondary index and request only attributes that are projected into that index, the
     * operation will read only the index and not the table. If any of the requested attributes are not projected into
     * the local secondary index, DynamoDB will fetch each of these attributes from the parent table. This extra
     * fetching incurs additional throughput cost and latency.
     * </p>
     * <p>
     * If you query or scan a global secondary index, you can only request attributes that are projected into the index.
     * Global secondary index queries cannot fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <code>Select</code> nor <code>AttributesToGet</code> are specified, DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code> when accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     * index. You cannot use both <code>Select</code> and <code>AttributesToGet</code> together in a single request,
     * unless the value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <code>AttributesToGet</code> without any value for <code>Select</code>.)
     * </p>
     * <note>
     * <p>
     * If you use the <code>ProjectionExpression</code> parameter, then the value for <code>Select</code> can only be
     * <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code> will return an error.
     * </p>
     * </note>
     * 
     * @param select
     *        The attributes to be returned in the result. You can retrieve all item attributes, specific item
     *        attributes, the count of matching items, or in the case of an index, some or all of the attributes
     *        projected into the index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the specified table or index. If you
     *        query a local secondary index, then for each matching item in the index DynamoDB will fetch the entire
     *        item from the parent table. If the index is configured to project all item attributes, then all of the
     *        data can be obtained from the local secondary index, and no fetching is required.
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
     *        <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <code>AttributesToGet</code>.
     *        This return value is equivalent to specifying <code>AttributesToGet</code> without specifying any value
     *        for <code>Select</code>.
     *        </p>
     *        <p>
     *        If you query or scan a local secondary index and request only attributes that are projected into that
     *        index, the operation will read only the index and not the table. If any of the requested attributes are
     *        not projected into the local secondary index, DynamoDB will fetch each of these attributes from the parent
     *        table. This extra fetching incurs additional throughput cost and latency.
     *        </p>
     *        <p>
     *        If you query or scan a global secondary index, you can only request attributes that are projected into the
     *        index. Global secondary index queries cannot fetch attributes from the parent table.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If neither <code>Select</code> nor <code>AttributesToGet</code> are specified, DynamoDB defaults to
     *        <code>ALL_ATTRIBUTES</code> when accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     *        accessing an index. You cannot use both <code>Select</code> and <code>AttributesToGet</code> together in a
     *        single request, unless the value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage
     *        is equivalent to specifying <code>AttributesToGet</code> without any value for <code>Select</code>.)
     *        </p>
     *        <note>
     *        <p>
     *        If you use the <code>ProjectionExpression</code> parameter, then the value for <code>Select</code> can
     *        only be <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code> will return an error.
     *        </p>
     * @see Select
     */

    public void setSelect(Select select) {
        withSelect(select);
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the
     * count of matching items, or in the case of an index, some or all of the attributes projected into the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the specified table or index. If you query
     * a local secondary index, then for each matching item in the index DynamoDB will fetch the entire item from the
     * parent table. If the index is configured to project all item attributes, then all of the data can be obtained
     * from the local secondary index, and no fetching is required.
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
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <code>AttributesToGet</code>. This
     * return value is equivalent to specifying <code>AttributesToGet</code> without specifying any value for
     * <code>Select</code>.
     * </p>
     * <p>
     * If you query or scan a local secondary index and request only attributes that are projected into that index, the
     * operation will read only the index and not the table. If any of the requested attributes are not projected into
     * the local secondary index, DynamoDB will fetch each of these attributes from the parent table. This extra
     * fetching incurs additional throughput cost and latency.
     * </p>
     * <p>
     * If you query or scan a global secondary index, you can only request attributes that are projected into the index.
     * Global secondary index queries cannot fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <code>Select</code> nor <code>AttributesToGet</code> are specified, DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code> when accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     * index. You cannot use both <code>Select</code> and <code>AttributesToGet</code> together in a single request,
     * unless the value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <code>AttributesToGet</code> without any value for <code>Select</code>.)
     * </p>
     * <note>
     * <p>
     * If you use the <code>ProjectionExpression</code> parameter, then the value for <code>Select</code> can only be
     * <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code> will return an error.
     * </p>
     * </note>
     * 
     * @param select
     *        The attributes to be returned in the result. You can retrieve all item attributes, specific item
     *        attributes, the count of matching items, or in the case of an index, some or all of the attributes
     *        projected into the index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the specified table or index. If you
     *        query a local secondary index, then for each matching item in the index DynamoDB will fetch the entire
     *        item from the parent table. If the index is configured to project all item attributes, then all of the
     *        data can be obtained from the local secondary index, and no fetching is required.
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
     *        <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in <code>AttributesToGet</code>.
     *        This return value is equivalent to specifying <code>AttributesToGet</code> without specifying any value
     *        for <code>Select</code>.
     *        </p>
     *        <p>
     *        If you query or scan a local secondary index and request only attributes that are projected into that
     *        index, the operation will read only the index and not the table. If any of the requested attributes are
     *        not projected into the local secondary index, DynamoDB will fetch each of these attributes from the parent
     *        table. This extra fetching incurs additional throughput cost and latency.
     *        </p>
     *        <p>
     *        If you query or scan a global secondary index, you can only request attributes that are projected into the
     *        index. Global secondary index queries cannot fetch attributes from the parent table.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If neither <code>Select</code> nor <code>AttributesToGet</code> are specified, DynamoDB defaults to
     *        <code>ALL_ATTRIBUTES</code> when accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     *        accessing an index. You cannot use both <code>Select</code> and <code>AttributesToGet</code> together in a
     *        single request, unless the value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage
     *        is equivalent to specifying <code>AttributesToGet</code> without any value for <code>Select</code>.)
     *        </p>
     *        <note>
     *        <p>
     *        If you use the <code>ProjectionExpression</code> parameter, then the value for <code>Select</code> can
     *        only be <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code> will return an error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Select
     */

    public QueryRequest withSelect(Select select) {
        this.select = select.toString();
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     * >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *         >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     * >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param attributesToGet
     *        This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *        >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        this.attributesToGet = new java.util.ArrayList<String>(attributesToGet);
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     * >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributesToGet(java.util.Collection)} or {@link #withAttributesToGet(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributesToGet
     *        This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *        >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withAttributesToGet(String... attributesToGet) {
        if (this.attributesToGet == null) {
            setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        }
        for (String ele : attributesToGet) {
            this.attributesToGet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     * >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param attributesToGet
     *        This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *        >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        setAttributesToGet(attributesToGet);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the
     * number of items up to the limit while processing the results, it stops the operation and returns the matching
     * values up to that point, and a key in <code>LastEvaluatedKey</code> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set size exceeds 1 MB before DynamoDB reaches
     * this limit, it stops the operation and returns the matching values up to the limit, and a key in
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation to continue the operation. For more information,
     * see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and
     * Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB
     *        processes the number of items up to the limit while processing the results, it stops the operation and
     *        returns the matching values up to that point, and a key in <code>LastEvaluatedKey</code> to apply in a
     *        subsequent operation, so that you can pick up where you left off. Also, if the processed data set size
     *        exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up
     *        to the limit, and a key in <code>LastEvaluatedKey</code> to apply in a subsequent operation to continue
     *        the operation. For more information, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and
     *        Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the
     * number of items up to the limit while processing the results, it stops the operation and returns the matching
     * values up to that point, and a key in <code>LastEvaluatedKey</code> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set size exceeds 1 MB before DynamoDB reaches
     * this limit, it stops the operation and returns the matching values up to the limit, and a key in
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation to continue the operation. For more information,
     * see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and
     * Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB
     *         processes the number of items up to the limit while processing the results, it stops the operation and
     *         returns the matching values up to that point, and a key in <code>LastEvaluatedKey</code> to apply in a
     *         subsequent operation, so that you can pick up where you left off. Also, if the processed data set size
     *         exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values
     *         up to the limit, and a key in <code>LastEvaluatedKey</code> to apply in a subsequent operation to
     *         continue the operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and
     *         Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the
     * number of items up to the limit while processing the results, it stops the operation and returns the matching
     * values up to that point, and a key in <code>LastEvaluatedKey</code> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set size exceeds 1 MB before DynamoDB reaches
     * this limit, it stops the operation and returns the matching values up to the limit, and a key in
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation to continue the operation. For more information,
     * see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and
     * Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB
     *        processes the number of items up to the limit while processing the results, it stops the operation and
     *        returns the matching values up to that point, and a key in <code>LastEvaluatedKey</code> to apply in a
     *        subsequent operation, so that you can pick up where you left off. Also, if the processed data set size
     *        exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up
     *        to the limit, and a key in <code>LastEvaluatedKey</code> to apply in a subsequent operation to continue
     *        the operation. For more information, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and
     *        Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then the operation uses strongly consistent
     * reads; otherwise, the operation uses eventually consistent reads.
     * </p>
     * <p>
     * Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary index
     * with <code>ConsistentRead</code> set to <code>true</code>, you will receive a <code>ValidationException</code>.
     * </p>
     * 
     * @param consistentRead
     *        Determines the read consistency model: If set to <code>true</code>, then the operation uses strongly
     *        consistent reads; otherwise, the operation uses eventually consistent reads.</p>
     *        <p>
     *        Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary
     *        index with <code>ConsistentRead</code> set to <code>true</code>, you will receive a
     *        <code>ValidationException</code>.
     */

    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then the operation uses strongly consistent
     * reads; otherwise, the operation uses eventually consistent reads.
     * </p>
     * <p>
     * Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary index
     * with <code>ConsistentRead</code> set to <code>true</code>, you will receive a <code>ValidationException</code>.
     * </p>
     * 
     * @return Determines the read consistency model: If set to <code>true</code>, then the operation uses strongly
     *         consistent reads; otherwise, the operation uses eventually consistent reads.</p>
     *         <p>
     *         Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary
     *         index with <code>ConsistentRead</code> set to <code>true</code>, you will receive a
     *         <code>ValidationException</code>.
     */

    public Boolean getConsistentRead() {
        return this.consistentRead;
    }

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then the operation uses strongly consistent
     * reads; otherwise, the operation uses eventually consistent reads.
     * </p>
     * <p>
     * Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary index
     * with <code>ConsistentRead</code> set to <code>true</code>, you will receive a <code>ValidationException</code>.
     * </p>
     * 
     * @param consistentRead
     *        Determines the read consistency model: If set to <code>true</code>, then the operation uses strongly
     *        consistent reads; otherwise, the operation uses eventually consistent reads.</p>
     *        <p>
     *        Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary
     *        index with <code>ConsistentRead</code> set to <code>true</code>, you will receive a
     *        <code>ValidationException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withConsistentRead(Boolean consistentRead) {
        setConsistentRead(consistentRead);
        return this;
    }

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then the operation uses strongly consistent
     * reads; otherwise, the operation uses eventually consistent reads.
     * </p>
     * <p>
     * Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary index
     * with <code>ConsistentRead</code> set to <code>true</code>, you will receive a <code>ValidationException</code>.
     * </p>
     * 
     * @return Determines the read consistency model: If set to <code>true</code>, then the operation uses strongly
     *         consistent reads; otherwise, the operation uses eventually consistent reads.</p>
     *         <p>
     *         Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary
     *         index with <code>ConsistentRead</code> set to <code>true</code>, you will receive a
     *         <code>ValidationException</code>.
     */

    public Boolean isConsistentRead() {
        return this.consistentRead;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>KeyConditionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     * >KeyConditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return This is a legacy parameter. Use <code>KeyConditionExpression</code> instead. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     *         >KeyConditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public java.util.Map<String, Condition> getKeyConditions() {
        return keyConditions;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>KeyConditionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     * >KeyConditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param keyConditions
     *        This is a legacy parameter. Use <code>KeyConditionExpression</code> instead. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     *        >KeyConditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setKeyConditions(java.util.Map<String, Condition> keyConditions) {
        this.keyConditions = keyConditions;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>KeyConditionExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     * >KeyConditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param keyConditions
     *        This is a legacy parameter. Use <code>KeyConditionExpression</code> instead. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     *        >KeyConditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withKeyConditions(java.util.Map<String, Condition> keyConditions) {
        setKeyConditions(keyConditions);
        return this;
    }

    public QueryRequest addKeyConditionsEntry(String key, Condition value) {
        if (null == this.keyConditions) {
            this.keyConditions = new java.util.HashMap<String, Condition>();
        }
        if (this.keyConditions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.keyConditions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into KeyConditions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest clearKeyConditionsEntries() {
        this.keyConditions = null;
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     * >QueryFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     *         >QueryFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public java.util.Map<String, Condition> getQueryFilter() {
        return queryFilter;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     * >QueryFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param queryFilter
     *        This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     *        >QueryFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setQueryFilter(java.util.Map<String, Condition> queryFilter) {
        this.queryFilter = queryFilter;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     * >QueryFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param queryFilter
     *        This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     *        >QueryFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withQueryFilter(java.util.Map<String, Condition> queryFilter) {
        setQueryFilter(queryFilter);
        return this;
    }

    public QueryRequest addQueryFilterEntry(String key, Condition value) {
        if (null == this.queryFilter) {
            this.queryFilter = new java.util.HashMap<String, Condition>();
        }
        if (this.queryFilter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.queryFilter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into QueryFilter.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest clearQueryFilterEntries() {
        this.queryFilter = null;
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param conditionalOperator
     *        This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *        >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @see ConditionalOperator
     */

    public void setConditionalOperator(String conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *         >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @see ConditionalOperator
     */

    public String getConditionalOperator() {
        return this.conditionalOperator;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param conditionalOperator
     *        This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *        >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionalOperator
     */

    public QueryRequest withConditionalOperator(String conditionalOperator) {
        setConditionalOperator(conditionalOperator);
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param conditionalOperator
     *        This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *        >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @see ConditionalOperator
     */

    public void setConditionalOperator(ConditionalOperator conditionalOperator) {
        withConditionalOperator(conditionalOperator);
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param conditionalOperator
     *        This is a legacy parameter. Use <code>FilterExpression</code> instead. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *        >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionalOperator
     */

    public QueryRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default), the traversal is performed in ascending
     * order; if <code>false</code>, the traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by sort key. If the sort key data type is
     * Number, the results are stored in numeric order. For type String, the results are stored in order of UTF-8 bytes.
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned.
     * </p>
     * <p>
     * If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns the results in the order in which they
     * are stored (by sort key value). This is the default behavior. If <code>ScanIndexForward</code> is
     * <code>false</code>, DynamoDB reads the results in reverse order by sort key value, and then returns the results
     * to the client.
     * </p>
     * 
     * @param scanIndexForward
     *        Specifies the order for index traversal: If <code>true</code> (default), the traversal is performed in
     *        ascending order; if <code>false</code>, the traversal is performed in descending order. </p>
     *        <p>
     *        Items with the same partition key value are stored in sorted order by sort key. If the sort key data type
     *        is Number, the results are stored in numeric order. For type String, the results are stored in order of
     *        UTF-8 bytes. For type Binary, DynamoDB treats each byte of the binary data as unsigned.
     *        </p>
     *        <p>
     *        If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns the results in the order in which
     *        they are stored (by sort key value). This is the default behavior. If <code>ScanIndexForward</code> is
     *        <code>false</code>, DynamoDB reads the results in reverse order by sort key value, and then returns the
     *        results to the client.
     */

    public void setScanIndexForward(Boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
    }

    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default), the traversal is performed in ascending
     * order; if <code>false</code>, the traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by sort key. If the sort key data type is
     * Number, the results are stored in numeric order. For type String, the results are stored in order of UTF-8 bytes.
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned.
     * </p>
     * <p>
     * If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns the results in the order in which they
     * are stored (by sort key value). This is the default behavior. If <code>ScanIndexForward</code> is
     * <code>false</code>, DynamoDB reads the results in reverse order by sort key value, and then returns the results
     * to the client.
     * </p>
     * 
     * @return Specifies the order for index traversal: If <code>true</code> (default), the traversal is performed in
     *         ascending order; if <code>false</code>, the traversal is performed in descending order. </p>
     *         <p>
     *         Items with the same partition key value are stored in sorted order by sort key. If the sort key data type
     *         is Number, the results are stored in numeric order. For type String, the results are stored in order of
     *         UTF-8 bytes. For type Binary, DynamoDB treats each byte of the binary data as unsigned.
     *         </p>
     *         <p>
     *         If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns the results in the order in which
     *         they are stored (by sort key value). This is the default behavior. If <code>ScanIndexForward</code> is
     *         <code>false</code>, DynamoDB reads the results in reverse order by sort key value, and then returns the
     *         results to the client.
     */

    public Boolean getScanIndexForward() {
        return this.scanIndexForward;
    }

    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default), the traversal is performed in ascending
     * order; if <code>false</code>, the traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by sort key. If the sort key data type is
     * Number, the results are stored in numeric order. For type String, the results are stored in order of UTF-8 bytes.
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned.
     * </p>
     * <p>
     * If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns the results in the order in which they
     * are stored (by sort key value). This is the default behavior. If <code>ScanIndexForward</code> is
     * <code>false</code>, DynamoDB reads the results in reverse order by sort key value, and then returns the results
     * to the client.
     * </p>
     * 
     * @param scanIndexForward
     *        Specifies the order for index traversal: If <code>true</code> (default), the traversal is performed in
     *        ascending order; if <code>false</code>, the traversal is performed in descending order. </p>
     *        <p>
     *        Items with the same partition key value are stored in sorted order by sort key. If the sort key data type
     *        is Number, the results are stored in numeric order. For type String, the results are stored in order of
     *        UTF-8 bytes. For type Binary, DynamoDB treats each byte of the binary data as unsigned.
     *        </p>
     *        <p>
     *        If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns the results in the order in which
     *        they are stored (by sort key value). This is the default behavior. If <code>ScanIndexForward</code> is
     *        <code>false</code>, DynamoDB reads the results in reverse order by sort key value, and then returns the
     *        results to the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withScanIndexForward(Boolean scanIndexForward) {
        setScanIndexForward(scanIndexForward);
        return this;
    }

    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default), the traversal is performed in ascending
     * order; if <code>false</code>, the traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by sort key. If the sort key data type is
     * Number, the results are stored in numeric order. For type String, the results are stored in order of UTF-8 bytes.
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned.
     * </p>
     * <p>
     * If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns the results in the order in which they
     * are stored (by sort key value). This is the default behavior. If <code>ScanIndexForward</code> is
     * <code>false</code>, DynamoDB reads the results in reverse order by sort key value, and then returns the results
     * to the client.
     * </p>
     * 
     * @return Specifies the order for index traversal: If <code>true</code> (default), the traversal is performed in
     *         ascending order; if <code>false</code>, the traversal is performed in descending order. </p>
     *         <p>
     *         Items with the same partition key value are stored in sorted order by sort key. If the sort key data type
     *         is Number, the results are stored in numeric order. For type String, the results are stored in order of
     *         UTF-8 bytes. For type Binary, DynamoDB treats each byte of the binary data as unsigned.
     *         </p>
     *         <p>
     *         If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns the results in the order in which
     *         they are stored (by sort key value). This is the default behavior. If <code>ScanIndexForward</code> is
     *         <code>false</code>, DynamoDB reads the results in reverse order by sort key value, and then returns the
     *         results to the client.
     */

    public Boolean isScanIndexForward() {
        return this.scanIndexForward;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use the value that was returned for
     * <code>LastEvaluatedKey</code> in the previous operation.
     * </p>
     * <p>
     * The data type for <code>ExclusiveStartKey</code> must be String, Number or Binary. No set data types are allowed.
     * </p>
     * 
     * @return The primary key of the first item that this operation will evaluate. Use the value that was returned for
     *         <code>LastEvaluatedKey</code> in the previous operation.</p>
     *         <p>
     *         The data type for <code>ExclusiveStartKey</code> must be String, Number or Binary. No set data types are
     *         allowed.
     */

    public java.util.Map<String, AttributeValue> getExclusiveStartKey() {
        return exclusiveStartKey;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use the value that was returned for
     * <code>LastEvaluatedKey</code> in the previous operation.
     * </p>
     * <p>
     * The data type for <code>ExclusiveStartKey</code> must be String, Number or Binary. No set data types are allowed.
     * </p>
     * 
     * @param exclusiveStartKey
     *        The primary key of the first item that this operation will evaluate. Use the value that was returned for
     *        <code>LastEvaluatedKey</code> in the previous operation.</p>
     *        <p>
     *        The data type for <code>ExclusiveStartKey</code> must be String, Number or Binary. No set data types are
     *        allowed.
     */

    public void setExclusiveStartKey(java.util.Map<String, AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use the value that was returned for
     * <code>LastEvaluatedKey</code> in the previous operation.
     * </p>
     * <p>
     * The data type for <code>ExclusiveStartKey</code> must be String, Number or Binary. No set data types are allowed.
     * </p>
     * 
     * @param exclusiveStartKey
     *        The primary key of the first item that this operation will evaluate. Use the value that was returned for
     *        <code>LastEvaluatedKey</code> in the previous operation.</p>
     *        <p>
     *        The data type for <code>ExclusiveStartKey</code> must be String, Number or Binary. No set data types are
     *        allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withExclusiveStartKey(java.util.Map<String, AttributeValue> exclusiveStartKey) {
        setExclusiveStartKey(exclusiveStartKey);
        return this;
    }

    public QueryRequest addExclusiveStartKeyEntry(String key, AttributeValue value) {
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

    public QueryRequest clearExclusiveStartKeyEntries() {
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

    public QueryRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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

    public QueryRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars,
     * sets, or elements of a JSON document. The attributes in the expression must be separated by commas.
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
     * 
     * @param projectionExpression
     *        A string that identifies one or more attributes to retrieve from the table. These attributes can include
     *        scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by
     *        commas.</p>
     *        <p>
     *        If no attribute names are specified, then all attributes will be returned. If any of the requested
     *        attributes are not found, they will not appear in the result.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
    }

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars,
     * sets, or elements of a JSON document. The attributes in the expression must be separated by commas.
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
     * 
     * @return A string that identifies one or more attributes to retrieve from the table. These attributes can include
     *         scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by
     *         commas.</p>
     *         <p>
     *         If no attribute names are specified, then all attributes will be returned. If any of the requested
     *         attributes are not found, they will not appear in the result.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *         >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public String getProjectionExpression() {
        return this.projectionExpression;
    }

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars,
     * sets, or elements of a JSON document. The attributes in the expression must be separated by commas.
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
     * 
     * @param projectionExpression
     *        A string that identifies one or more attributes to retrieve from the table. These attributes can include
     *        scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by
     *        commas.</p>
     *        <p>
     *        If no attribute names are specified, then all attributes will be returned. If any of the requested
     *        attributes are not found, they will not appear in the result.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withProjectionExpression(String projectionExpression) {
        setProjectionExpression(projectionExpression);
        return this;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the <code>Query</code> operation, but before the
     * data is returned to you. Items that do not satisfy the <code>FilterExpression</code> criteria are not returned.
     * </p>
     * <p>
     * A <code>FilterExpression</code> does not allow key attributes. You cannot define a filter expression based on a
     * partition key or a sort key.
     * </p>
     * <note>
     * <p>
     * A <code>FilterExpression</code> is applied after the items have already been read; the process of filtering does
     * not consume any additional read capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults">Filter
     * Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param filterExpression
     *        A string that contains conditions that DynamoDB applies after the <code>Query</code> operation, but before
     *        the data is returned to you. Items that do not satisfy the <code>FilterExpression</code> criteria are not
     *        returned.</p>
     *        <p>
     *        A <code>FilterExpression</code> does not allow key attributes. You cannot define a filter expression based
     *        on a partition key or a sort key.
     *        </p>
     *        <note>
     *        <p>
     *        A <code>FilterExpression</code> is applied after the items have already been read; the process of
     *        filtering does not consume any additional read capacity units.
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *        >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the <code>Query</code> operation, but before the
     * data is returned to you. Items that do not satisfy the <code>FilterExpression</code> criteria are not returned.
     * </p>
     * <p>
     * A <code>FilterExpression</code> does not allow key attributes. You cannot define a filter expression based on a
     * partition key or a sort key.
     * </p>
     * <note>
     * <p>
     * A <code>FilterExpression</code> is applied after the items have already been read; the process of filtering does
     * not consume any additional read capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults">Filter
     * Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return A string that contains conditions that DynamoDB applies after the <code>Query</code> operation, but
     *         before the data is returned to you. Items that do not satisfy the <code>FilterExpression</code> criteria
     *         are not returned.</p>
     *         <p>
     *         A <code>FilterExpression</code> does not allow key attributes. You cannot define a filter expression
     *         based on a partition key or a sort key.
     *         </p>
     *         <note>
     *         <p>
     *         A <code>FilterExpression</code> is applied after the items have already been read; the process of
     *         filtering does not consume any additional read capacity units.
     *         </p>
     *         </note>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *         >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public String getFilterExpression() {
        return this.filterExpression;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the <code>Query</code> operation, but before the
     * data is returned to you. Items that do not satisfy the <code>FilterExpression</code> criteria are not returned.
     * </p>
     * <p>
     * A <code>FilterExpression</code> does not allow key attributes. You cannot define a filter expression based on a
     * partition key or a sort key.
     * </p>
     * <note>
     * <p>
     * A <code>FilterExpression</code> is applied after the items have already been read; the process of filtering does
     * not consume any additional read capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults">Filter
     * Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param filterExpression
     *        A string that contains conditions that DynamoDB applies after the <code>Query</code> operation, but before
     *        the data is returned to you. Items that do not satisfy the <code>FilterExpression</code> criteria are not
     *        returned.</p>
     *        <p>
     *        A <code>FilterExpression</code> does not allow key attributes. You cannot define a filter expression based
     *        on a partition key or a sort key.
     *        </p>
     *        <note>
     *        <p>
     *        A <code>FilterExpression</code> is applied after the items have already been read; the process of
     *        filtering does not consume any additional read capacity units.
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *        >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withFilterExpression(String filterExpression) {
        setFilterExpression(filterExpression);
        return this;
    }

    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved by the <code>Query</code> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key value.
     * </p>
     * <p>
     * The condition can optionally perform one of several comparison tests on a single sort key value. This allows
     * <code>Query</code> to retrieve one item with a given partition key value and sort key value, or several items
     * that have the same partition key value but different sort key values.
     * </p>
     * <p>
     * The partition key equality test is required, and must be specified in the following format:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * </p>
     * <p>
     * If you also want to provide a condition for the sort key, it must be combined using <code>AND</code> with the
     * condition for the sort key. Following is an example, using the <b>=</b> comparison operator for the sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <code>=</code> <code>:partitionkeyval</code> <code>AND</code>
     * <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code> - true if the sort key value is equal to
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;</code> <code>:sortkeyval</code> - true if the sort key value is less than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;=</code> <code>:sortkeyval</code> - true if the sort key value is less than or
     * equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;</code> <code>:sortkeyval</code> - true if the sort key value is greater than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;= </code> <code>:sortkeyval</code> - true if the sort key value is greater
     * than or equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>BETWEEN</code> <code>:sortkeyval1</code> <code>AND</code>
     * <code>:sortkeyval2</code> - true if the sort key value is greater than or equal to <code>:sortkeyval1</code>, and
     * less than or equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>begins_with (</code> <code>sortKeyName</code>, <code>:sortkeyval</code> <code>)</code> - true if the sort
     * key value begins with a particular operand. (You cannot use this function with a sort key that is of type
     * Number.) Note that the function name <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <code>ExpressionAttributeValues</code> parameter to replace tokens such as <code>:partitionval</code> and
     * <code>:sortval</code> with actual values at runtime.
     * </p>
     * <p>
     * You can optionally use the <code>ExpressionAttributeNames</code> parameter to replace the names of the partition
     * key and sort key with placeholder tokens. This option might be necessary if an attribute name conflicts with a
     * DynamoDB reserved word. For example, the following <code>KeyConditionExpression</code> parameter causes an error
     * because <i>Size</i> is a reserved word:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Size = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To work around this, define a placeholder (such a <code>#S</code>) to represent the attribute name <i>Size</i>.
     * <code>KeyConditionExpression</code> then is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#S = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of reserved words, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For more information on <code>ExpressionAttributeNames</code> and <code>ExpressionAttributeValues</code>, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html">Using
     * Placeholders for Attribute Names and Values</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param keyConditionExpression
     *        The condition that specifies the key value(s) for items to be retrieved by the <code>Query</code>
     *        action.</p>
     *        <p>
     *        The condition must perform an equality test on a single partition key value.
     *        </p>
     *        <p>
     *        The condition can optionally perform one of several comparison tests on a single sort key value. This
     *        allows <code>Query</code> to retrieve one item with a given partition key value and sort key value, or
     *        several items that have the same partition key value but different sort key values.
     *        </p>
     *        <p>
     *        The partition key equality test is required, and must be specified in the following format:
     *        </p>
     *        <p>
     *        <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     *        </p>
     *        <p>
     *        If you also want to provide a condition for the sort key, it must be combined using <code>AND</code> with
     *        the condition for the sort key. Following is an example, using the <b>=</b> comparison operator for the
     *        sort key:
     *        </p>
     *        <p>
     *        <code>partitionKeyName</code> <code>=</code> <code>:partitionkeyval</code> <code>AND</code>
     *        <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code>
     *        </p>
     *        <p>
     *        Valid comparisons for the sort key condition are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code> - true if the sort key value is equal to
     *        <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <code>&lt;</code> <code>:sortkeyval</code> - true if the sort key value is less
     *        than <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <code>&lt;=</code> <code>:sortkeyval</code> - true if the sort key value is less
     *        than or equal to <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <code>&gt;</code> <code>:sortkeyval</code> - true if the sort key value is
     *        greater than <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <code>&gt;= </code> <code>:sortkeyval</code> - true if the sort key value is
     *        greater than or equal to <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <code>BETWEEN</code> <code>:sortkeyval1</code> <code>AND</code>
     *        <code>:sortkeyval2</code> - true if the sort key value is greater than or equal to
     *        <code>:sortkeyval1</code>, and less than or equal to <code>:sortkeyval2</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>begins_with (</code> <code>sortKeyName</code>, <code>:sortkeyval</code> <code>)</code> - true if the
     *        sort key value begins with a particular operand. (You cannot use this function with a sort key that is of
     *        type Number.) Note that the function name <code>begins_with</code> is case-sensitive.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use the <code>ExpressionAttributeValues</code> parameter to replace tokens such as
     *        <code>:partitionval</code> and <code>:sortval</code> with actual values at runtime.
     *        </p>
     *        <p>
     *        You can optionally use the <code>ExpressionAttributeNames</code> parameter to replace the names of the
     *        partition key and sort key with placeholder tokens. This option might be necessary if an attribute name
     *        conflicts with a DynamoDB reserved word. For example, the following <code>KeyConditionExpression</code>
     *        parameter causes an error because <i>Size</i> is a reserved word:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Size = :myval</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To work around this, define a placeholder (such a <code>#S</code>) to represent the attribute name
     *        <i>Size</i>. <code>KeyConditionExpression</code> then is as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>#S = :myval</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a list of reserved words, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     *        Words</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <p>
     *        For more information on <code>ExpressionAttributeNames</code> and <code>ExpressionAttributeValues</code>,
     *        see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html">Using
     *        Placeholders for Attribute Names and Values</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setKeyConditionExpression(String keyConditionExpression) {
        this.keyConditionExpression = keyConditionExpression;
    }

    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved by the <code>Query</code> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key value.
     * </p>
     * <p>
     * The condition can optionally perform one of several comparison tests on a single sort key value. This allows
     * <code>Query</code> to retrieve one item with a given partition key value and sort key value, or several items
     * that have the same partition key value but different sort key values.
     * </p>
     * <p>
     * The partition key equality test is required, and must be specified in the following format:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * </p>
     * <p>
     * If you also want to provide a condition for the sort key, it must be combined using <code>AND</code> with the
     * condition for the sort key. Following is an example, using the <b>=</b> comparison operator for the sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <code>=</code> <code>:partitionkeyval</code> <code>AND</code>
     * <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code> - true if the sort key value is equal to
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;</code> <code>:sortkeyval</code> - true if the sort key value is less than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;=</code> <code>:sortkeyval</code> - true if the sort key value is less than or
     * equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;</code> <code>:sortkeyval</code> - true if the sort key value is greater than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;= </code> <code>:sortkeyval</code> - true if the sort key value is greater
     * than or equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>BETWEEN</code> <code>:sortkeyval1</code> <code>AND</code>
     * <code>:sortkeyval2</code> - true if the sort key value is greater than or equal to <code>:sortkeyval1</code>, and
     * less than or equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>begins_with (</code> <code>sortKeyName</code>, <code>:sortkeyval</code> <code>)</code> - true if the sort
     * key value begins with a particular operand. (You cannot use this function with a sort key that is of type
     * Number.) Note that the function name <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <code>ExpressionAttributeValues</code> parameter to replace tokens such as <code>:partitionval</code> and
     * <code>:sortval</code> with actual values at runtime.
     * </p>
     * <p>
     * You can optionally use the <code>ExpressionAttributeNames</code> parameter to replace the names of the partition
     * key and sort key with placeholder tokens. This option might be necessary if an attribute name conflicts with a
     * DynamoDB reserved word. For example, the following <code>KeyConditionExpression</code> parameter causes an error
     * because <i>Size</i> is a reserved word:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Size = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To work around this, define a placeholder (such a <code>#S</code>) to represent the attribute name <i>Size</i>.
     * <code>KeyConditionExpression</code> then is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#S = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of reserved words, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For more information on <code>ExpressionAttributeNames</code> and <code>ExpressionAttributeValues</code>, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html">Using
     * Placeholders for Attribute Names and Values</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return The condition that specifies the key value(s) for items to be retrieved by the <code>Query</code>
     *         action.</p>
     *         <p>
     *         The condition must perform an equality test on a single partition key value.
     *         </p>
     *         <p>
     *         The condition can optionally perform one of several comparison tests on a single sort key value. This
     *         allows <code>Query</code> to retrieve one item with a given partition key value and sort key value, or
     *         several items that have the same partition key value but different sort key values.
     *         </p>
     *         <p>
     *         The partition key equality test is required, and must be specified in the following format:
     *         </p>
     *         <p>
     *         <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     *         </p>
     *         <p>
     *         If you also want to provide a condition for the sort key, it must be combined using <code>AND</code> with
     *         the condition for the sort key. Following is an example, using the <b>=</b> comparison operator for the
     *         sort key:
     *         </p>
     *         <p>
     *         <code>partitionKeyName</code> <code>=</code> <code>:partitionkeyval</code> <code>AND</code>
     *         <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code>
     *         </p>
     *         <p>
     *         Valid comparisons for the sort key condition are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code> - true if the sort key value is equal to
     *         <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <code>&lt;</code> <code>:sortkeyval</code> - true if the sort key value is less
     *         than <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <code>&lt;=</code> <code>:sortkeyval</code> - true if the sort key value is less
     *         than or equal to <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <code>&gt;</code> <code>:sortkeyval</code> - true if the sort key value is
     *         greater than <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <code>&gt;= </code> <code>:sortkeyval</code> - true if the sort key value is
     *         greater than or equal to <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <code>BETWEEN</code> <code>:sortkeyval1</code> <code>AND</code>
     *         <code>:sortkeyval2</code> - true if the sort key value is greater than or equal to
     *         <code>:sortkeyval1</code>, and less than or equal to <code>:sortkeyval2</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>begins_with (</code> <code>sortKeyName</code>, <code>:sortkeyval</code> <code>)</code> - true if
     *         the sort key value begins with a particular operand. (You cannot use this function with a sort key that
     *         is of type Number.) Note that the function name <code>begins_with</code> is case-sensitive.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use the <code>ExpressionAttributeValues</code> parameter to replace tokens such as
     *         <code>:partitionval</code> and <code>:sortval</code> with actual values at runtime.
     *         </p>
     *         <p>
     *         You can optionally use the <code>ExpressionAttributeNames</code> parameter to replace the names of the
     *         partition key and sort key with placeholder tokens. This option might be necessary if an attribute name
     *         conflicts with a DynamoDB reserved word. For example, the following <code>KeyConditionExpression</code>
     *         parameter causes an error because <i>Size</i> is a reserved word:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Size = :myval</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To work around this, define a placeholder (such a <code>#S</code>) to represent the attribute name
     *         <i>Size</i>. <code>KeyConditionExpression</code> then is as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>#S = :myval</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a list of reserved words, see <a
     *         href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     *         Words</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     *         <p>
     *         For more information on <code>ExpressionAttributeNames</code> and <code>ExpressionAttributeValues</code>,
     *         see <a
     *         href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html">Using
     *         Placeholders for Attribute Names and Values</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public String getKeyConditionExpression() {
        return this.keyConditionExpression;
    }

    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved by the <code>Query</code> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key value.
     * </p>
     * <p>
     * The condition can optionally perform one of several comparison tests on a single sort key value. This allows
     * <code>Query</code> to retrieve one item with a given partition key value and sort key value, or several items
     * that have the same partition key value but different sort key values.
     * </p>
     * <p>
     * The partition key equality test is required, and must be specified in the following format:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * </p>
     * <p>
     * If you also want to provide a condition for the sort key, it must be combined using <code>AND</code> with the
     * condition for the sort key. Following is an example, using the <b>=</b> comparison operator for the sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <code>=</code> <code>:partitionkeyval</code> <code>AND</code>
     * <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code> - true if the sort key value is equal to
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;</code> <code>:sortkeyval</code> - true if the sort key value is less than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;=</code> <code>:sortkeyval</code> - true if the sort key value is less than or
     * equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;</code> <code>:sortkeyval</code> - true if the sort key value is greater than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;= </code> <code>:sortkeyval</code> - true if the sort key value is greater
     * than or equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>BETWEEN</code> <code>:sortkeyval1</code> <code>AND</code>
     * <code>:sortkeyval2</code> - true if the sort key value is greater than or equal to <code>:sortkeyval1</code>, and
     * less than or equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>begins_with (</code> <code>sortKeyName</code>, <code>:sortkeyval</code> <code>)</code> - true if the sort
     * key value begins with a particular operand. (You cannot use this function with a sort key that is of type
     * Number.) Note that the function name <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <code>ExpressionAttributeValues</code> parameter to replace tokens such as <code>:partitionval</code> and
     * <code>:sortval</code> with actual values at runtime.
     * </p>
     * <p>
     * You can optionally use the <code>ExpressionAttributeNames</code> parameter to replace the names of the partition
     * key and sort key with placeholder tokens. This option might be necessary if an attribute name conflicts with a
     * DynamoDB reserved word. For example, the following <code>KeyConditionExpression</code> parameter causes an error
     * because <i>Size</i> is a reserved word:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Size = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To work around this, define a placeholder (such a <code>#S</code>) to represent the attribute name <i>Size</i>.
     * <code>KeyConditionExpression</code> then is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#S = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of reserved words, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For more information on <code>ExpressionAttributeNames</code> and <code>ExpressionAttributeValues</code>, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html">Using
     * Placeholders for Attribute Names and Values</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param keyConditionExpression
     *        The condition that specifies the key value(s) for items to be retrieved by the <code>Query</code>
     *        action.</p>
     *        <p>
     *        The condition must perform an equality test on a single partition key value.
     *        </p>
     *        <p>
     *        The condition can optionally perform one of several comparison tests on a single sort key value. This
     *        allows <code>Query</code> to retrieve one item with a given partition key value and sort key value, or
     *        several items that have the same partition key value but different sort key values.
     *        </p>
     *        <p>
     *        The partition key equality test is required, and must be specified in the following format:
     *        </p>
     *        <p>
     *        <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     *        </p>
     *        <p>
     *        If you also want to provide a condition for the sort key, it must be combined using <code>AND</code> with
     *        the condition for the sort key. Following is an example, using the <b>=</b> comparison operator for the
     *        sort key:
     *        </p>
     *        <p>
     *        <code>partitionKeyName</code> <code>=</code> <code>:partitionkeyval</code> <code>AND</code>
     *        <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code>
     *        </p>
     *        <p>
     *        Valid comparisons for the sort key condition are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code> - true if the sort key value is equal to
     *        <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <code>&lt;</code> <code>:sortkeyval</code> - true if the sort key value is less
     *        than <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <code>&lt;=</code> <code>:sortkeyval</code> - true if the sort key value is less
     *        than or equal to <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <code>&gt;</code> <code>:sortkeyval</code> - true if the sort key value is
     *        greater than <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <code>&gt;= </code> <code>:sortkeyval</code> - true if the sort key value is
     *        greater than or equal to <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <code>BETWEEN</code> <code>:sortkeyval1</code> <code>AND</code>
     *        <code>:sortkeyval2</code> - true if the sort key value is greater than or equal to
     *        <code>:sortkeyval1</code>, and less than or equal to <code>:sortkeyval2</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>begins_with (</code> <code>sortKeyName</code>, <code>:sortkeyval</code> <code>)</code> - true if the
     *        sort key value begins with a particular operand. (You cannot use this function with a sort key that is of
     *        type Number.) Note that the function name <code>begins_with</code> is case-sensitive.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use the <code>ExpressionAttributeValues</code> parameter to replace tokens such as
     *        <code>:partitionval</code> and <code>:sortval</code> with actual values at runtime.
     *        </p>
     *        <p>
     *        You can optionally use the <code>ExpressionAttributeNames</code> parameter to replace the names of the
     *        partition key and sort key with placeholder tokens. This option might be necessary if an attribute name
     *        conflicts with a DynamoDB reserved word. For example, the following <code>KeyConditionExpression</code>
     *        parameter causes an error because <i>Size</i> is a reserved word:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Size = :myval</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To work around this, define a placeholder (such a <code>#S</code>) to represent the attribute name
     *        <i>Size</i>. <code>KeyConditionExpression</code> then is as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>#S = :myval</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a list of reserved words, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     *        Words</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <p>
     *        For more information on <code>ExpressionAttributeNames</code> and <code>ExpressionAttributeValues</code>,
     *        see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html">Using
     *        Placeholders for Attribute Names and Values</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withKeyConditionExpression(String keyConditionExpression) {
        setKeyConditionExpression(keyConditionExpression);
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

    public QueryRequest withExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        setExpressionAttributeNames(expressionAttributeNames);
        return this;
    }

    public QueryRequest addExpressionAttributeNamesEntry(String key, String value) {
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

    public QueryRequest clearExpressionAttributeNamesEntries() {
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

    public QueryRequest withExpressionAttributeValues(java.util.Map<String, AttributeValue> expressionAttributeValues) {
        setExpressionAttributeValues(expressionAttributeValues);
        return this;
    }

    public QueryRequest addExpressionAttributeValuesEntry(String key, AttributeValue value) {
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

    public QueryRequest clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
        return this;
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
    public QueryRequest withExclusiveStartKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey)
            throws IllegalArgumentException {
        setExclusiveStartKey(hashKey, rangeKey);
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
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getSelect() != null)
            sb.append("Select: ").append(getSelect()).append(",");
        if (getAttributesToGet() != null)
            sb.append("AttributesToGet: ").append(getAttributesToGet()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getConsistentRead() != null)
            sb.append("ConsistentRead: ").append(getConsistentRead()).append(",");
        if (getKeyConditions() != null)
            sb.append("KeyConditions: ").append(getKeyConditions()).append(",");
        if (getQueryFilter() != null)
            sb.append("QueryFilter: ").append(getQueryFilter()).append(",");
        if (getConditionalOperator() != null)
            sb.append("ConditionalOperator: ").append(getConditionalOperator()).append(",");
        if (getScanIndexForward() != null)
            sb.append("ScanIndexForward: ").append(getScanIndexForward()).append(",");
        if (getExclusiveStartKey() != null)
            sb.append("ExclusiveStartKey: ").append(getExclusiveStartKey()).append(",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: ").append(getReturnConsumedCapacity()).append(",");
        if (getProjectionExpression() != null)
            sb.append("ProjectionExpression: ").append(getProjectionExpression()).append(",");
        if (getFilterExpression() != null)
            sb.append("FilterExpression: ").append(getFilterExpression()).append(",");
        if (getKeyConditionExpression() != null)
            sb.append("KeyConditionExpression: ").append(getKeyConditionExpression()).append(",");
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

        if (obj instanceof QueryRequest == false)
            return false;
        QueryRequest other = (QueryRequest) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getSelect() == null ^ this.getSelect() == null)
            return false;
        if (other.getSelect() != null && other.getSelect().equals(this.getSelect()) == false)
            return false;
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null)
            return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getConsistentRead() == null ^ this.getConsistentRead() == null)
            return false;
        if (other.getConsistentRead() != null && other.getConsistentRead().equals(this.getConsistentRead()) == false)
            return false;
        if (other.getKeyConditions() == null ^ this.getKeyConditions() == null)
            return false;
        if (other.getKeyConditions() != null && other.getKeyConditions().equals(this.getKeyConditions()) == false)
            return false;
        if (other.getQueryFilter() == null ^ this.getQueryFilter() == null)
            return false;
        if (other.getQueryFilter() != null && other.getQueryFilter().equals(this.getQueryFilter()) == false)
            return false;
        if (other.getConditionalOperator() == null ^ this.getConditionalOperator() == null)
            return false;
        if (other.getConditionalOperator() != null && other.getConditionalOperator().equals(this.getConditionalOperator()) == false)
            return false;
        if (other.getScanIndexForward() == null ^ this.getScanIndexForward() == null)
            return false;
        if (other.getScanIndexForward() != null && other.getScanIndexForward().equals(this.getScanIndexForward()) == false)
            return false;
        if (other.getExclusiveStartKey() == null ^ this.getExclusiveStartKey() == null)
            return false;
        if (other.getExclusiveStartKey() != null && other.getExclusiveStartKey().equals(this.getExclusiveStartKey()) == false)
            return false;
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null)
            return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false)
            return false;
        if (other.getProjectionExpression() == null ^ this.getProjectionExpression() == null)
            return false;
        if (other.getProjectionExpression() != null && other.getProjectionExpression().equals(this.getProjectionExpression()) == false)
            return false;
        if (other.getFilterExpression() == null ^ this.getFilterExpression() == null)
            return false;
        if (other.getFilterExpression() != null && other.getFilterExpression().equals(this.getFilterExpression()) == false)
            return false;
        if (other.getKeyConditionExpression() == null ^ this.getKeyConditionExpression() == null)
            return false;
        if (other.getKeyConditionExpression() != null && other.getKeyConditionExpression().equals(this.getKeyConditionExpression()) == false)
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
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getSelect() == null) ? 0 : getSelect().hashCode());
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getConsistentRead() == null) ? 0 : getConsistentRead().hashCode());
        hashCode = prime * hashCode + ((getKeyConditions() == null) ? 0 : getKeyConditions().hashCode());
        hashCode = prime * hashCode + ((getQueryFilter() == null) ? 0 : getQueryFilter().hashCode());
        hashCode = prime * hashCode + ((getConditionalOperator() == null) ? 0 : getConditionalOperator().hashCode());
        hashCode = prime * hashCode + ((getScanIndexForward() == null) ? 0 : getScanIndexForward().hashCode());
        hashCode = prime * hashCode + ((getExclusiveStartKey() == null) ? 0 : getExclusiveStartKey().hashCode());
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode());
        hashCode = prime * hashCode + ((getProjectionExpression() == null) ? 0 : getProjectionExpression().hashCode());
        hashCode = prime * hashCode + ((getFilterExpression() == null) ? 0 : getFilterExpression().hashCode());
        hashCode = prime * hashCode + ((getKeyConditionExpression() == null) ? 0 : getKeyConditionExpression().hashCode());
        hashCode = prime * hashCode + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getExpressionAttributeValues() == null) ? 0 : getExpressionAttributeValues().hashCode());
        return hashCode;
    }

    @Override
    public QueryRequest clone() {
        return (QueryRequest) super.clone();
    }

}
