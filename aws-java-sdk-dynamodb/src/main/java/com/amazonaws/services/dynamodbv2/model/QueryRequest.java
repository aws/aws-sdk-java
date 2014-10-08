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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#query(QueryRequest) Query operation}.
 * <p>
 * A <i>Query</i> operation directly accesses items from a table using
 * the table primary key, or from an index using the index key. You must
 * provide a specific hash key value. You can narrow the scope of the
 * query by using comparison operators on the range key value, or on the
 * index key. You can use the <i>ScanIndexForward</i> parameter to get
 * results in forward or reverse order, by range key or by index key.
 * </p>
 * <p>
 * Queries that do not return results consume the minimum number of read
 * capacity units for that type of read operation.
 * </p>
 * <p>
 * If the total number of items meeting the query criteria exceeds the
 * result set size limit of 1 MB, the query stops and results are
 * returned to the user with <i>LastEvaluatedKey</i> to continue the
 * query in a subsequent operation. Unlike a <i>Scan</i> operation, a
 * <i>Query</i> operation never returns both an empty result set and a
 * <i>LastEvaluatedKey</i> . The <i>LastEvaluatedKey</i> is only provided
 * if the results exceed 1 MB, or if you have used <i>Limit</i> .
 * </p>
 * <p>
 * You can query a table, a local secondary index, or a global secondary
 * index. For a query on a table or on a local secondary index, you can
 * set <i>ConsistentRead</i> to true and obtain a strongly consistent
 * result. Global secondary indexes support eventually consistent reads
 * only, so do not specify <i>ConsistentRead</i> when querying a global
 * secondary index.
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#query(QueryRequest)
 */
public class QueryRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the table containing the requested items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * The name of an index to query. This index can be any local secondary
     * index or global secondary index on the table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String indexName;

    /**
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or
     * in the case of an index, some or all of the attributes projected into
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code> - Returns all of
     * the item attributes from the specified table or index. If you query a
     * local secondary index, then for each matching item in the index
     * DynamoDB will fetch the entire item from the parent table. If the
     * index is configured to project all item attributes, then all of the
     * data can be obtained from the local secondary index, and no fetching
     * is required. </li> <li> <p><code>ALL_PROJECTED_ATTRIBUTES</code> -
     * Allowed only when querying an index. Retrieves all attributes that
     * have been projected into the index. If the index is configured to
     * project all attributes, this return value is equivalent to specifying
     * <code>ALL_ATTRIBUTES</code>. </li> <li> <p><code>COUNT</code> -
     * Returns the number of matching items, rather than the matching items
     * themselves. </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> - Returns
     * only the attributes listed in <i>AttributesToGet</i>. This return
     * value is equivalent to specifying <i>AttributesToGet</i> without
     * specifying any value for <i>Select</i>. <p>If you query a local
     * secondary index and request only attributes that are projected into
     * that index, the operation will read only the index and not the table.
     * If any of the requested attributes are not projected into the local
     * secondary index, DynamoDB will fetch each of these attributes from the
     * parent table. This extra fetching incurs additional throughput cost
     * and latency. <p>If you query a global secondary index, you can only
     * request attributes that are projected into the index. Global secondary
     * index queries cannot fetch attributes from the parent table. </li>
     * </ul> <p>If neither <i>Select</i> nor <i>AttributesToGet</i> are
     * specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     * accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     * accessing an index. You cannot use both <i>Select</i> and
     * <i>AttributesToGet</i> together in a single request, unless the value
     * for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     * equivalent to specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     */
    private String select;

    /**
     * <important><p>There is a newer parameter available. Use
     * <i>ProjectionExpression</i> instead. Note that if you use
     * <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     * time, DynamoDB will return a <i>ValidationException</i> exception.
     * <p>This parameter allows you to retrieve lists or maps; however, it
     * cannot retrieve individual list or map elements.</important> <p>The
     * names of one or more attributes to retrieve. If no attribute names are
     * specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>Note that <i>AttributesToGet</i> has no effect on
     * provisioned throughput consumption. DynamoDB determines capacity units
     * consumed based on item size, not on the amount of data that is
     * returned to an application. <p>You cannot use both
     * <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     * request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.) <p>If you query a local secondary index and request
     * only attributes that are projected into that index, the operation will
     * read only the index and not the table. If any of the requested
     * attributes are not projected into the local secondary index, DynamoDB
     * will fetch each of these attributes from the parent table. This extra
     * fetching incurs additional throughput cost and latency. <p>If you
     * query a global secondary index, you can only request attributes that
     * are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGet;

    /**
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If DynamoDB processes the number of items up to the
     * limit while processing the results, it stops the operation and returns
     * the matching values up to that point, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set
     * size exceeds 1 MB before DynamoDB reaches this limit, it stops the
     * operation and returns the matching values up to the limit, and a key
     * in <i>LastEvaluatedKey</i> to apply in a subsequent operation to
     * continue the operation. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query
     * and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer limit;

    /**
     * A value that if set to <code>true</code>, then the operation uses
     * strongly consistent reads; otherwise, eventually consistent reads are
     * used. <p>Strongly consistent reads are not supported on global
     * secondary indexes. If you query a global secondary index with
     * <i>ConsistentRead</i> set to <code>true</code>, you will receive an
     * error message.
     */
    private Boolean consistentRead;

    /**
     * The selection criteria for the query. For a query on a table, you can
     * have conditions only on the table primary key attributes. You must
     * specify the hash key attribute name and value as an <code>EQ</code>
     * condition. You can optionally specify a second condition, referring to
     * the range key attribute. <p>For a query on an index, you can have
     * conditions only on the index key attributes. You must specify the
     * index hash attribute name and value as an EQ condition. You can
     * optionally specify a second condition, referring to the index key
     * range attribute. <p>Each <i>KeyConditions</i> element consists of an
     * attribute name to compare, along with the following: <ul> <li>
     * <p><i>AttributeValueList</i> - One or more values to evaluate against
     * the supplied attribute. The number of values in the list depends on
     * the <i>ComparisonOperator</i> being used. <p>For type Number, value
     * comparisons are numeric. <p>String value comparisons for greater than,
     * equals, or less than are based on ASCII character code values. For
     * example, <code>a</code> is greater than <code>A</code>, and
     * <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes, for example, equals, greater
     * than, less than, and so on. <p>For <i>KeyConditions</i>, only the
     * following comparison operators are supported: <p> <code>EQ | LE | LT |
     * GE | GT | BEGINS_WITH | BETWEEN</code> <p>The following are
     * descriptions of these comparison operators. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>LE</code> : Less than or equal. <p><i>AttributeValueList</i>
     * can contain only one <i>AttributeValue</i> element of type String,
     * Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set
     * type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
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
     * "1"]}</code>. <p/> </li> <li> <p><code>BEGINS_WITH</code> : Checks for
     * a prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a set
     * type). The target attribute of the comparison must be of type String
     * or Binary (not a Number or a set type). <p/> </li> <li>
     * <p><code>BETWEEN</code> : Greater than or equal to the first value,
     * and less than or equal to the second value.
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
     * Guide</i>.
     */
    private java.util.Map<String,Condition> keyConditions;

    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>FilterExpression</i> instead. Note that if you use
     * <i>QueryFilter</i> and <i>FilterExpression</i> at the same time,
     * DynamoDB will return a <i>ValidationException</i> exception. <p>This
     * parameter does not support lists or maps. </important> <p>A condition
     * that evaluates the query results and returns only the desired values.
     * <p>If you specify more than one condition in the <i>QueryFilter</i>
     * map, then by default all of the conditions must evaluate to true. In
     * other words, the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     * you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.) <note><p><i>QueryFilter</i> does not
     * allow key attrbutes. You cannot define a filter condition on a hash
     * key or range key.</note> <p>Each <i>QueryFilter</i> element consists
     * of an attribute name to compare, along with the following: <ul> <li>
     * <p><i>AttributeValueList</i> - One or more values to evaluate against
     * the supplied attribute. The number of values in the list depends on
     * the operator specified in <i>ComparisonOperator</i>. <p>For type
     * Number, value comparisons are numeric. <p>String value comparisons for
     * greater than, equals, or less than are based on ASCII character code
     * values. For example, <code>a</code> is greater than <code>A</code>,
     * and <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. <p>For information on specifying data types in
     * JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>. </li>
     * <li><p><i>ComparisonOperator</i> - A comparator for evaluating
     * attributes. For example, equals, greater than, less than, etc. <p>The
     * following comparison operators are available: <p><code>EQ | NE | LE |
     * LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH
     * | IN | BETWEEN</code> <p>For complete descriptions of all comparison
     * operators, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">API_Condition.html</a>.
     * </li> </ul>
     */
    private java.util.Map<String,Condition> queryFilter;

    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>ConditionExpression</i> instead. Note that if you use
     * <i>ConditionalOperator</i> and <i> ConditionExpression </i> at the
     * same time, DynamoDB will return a <i>ValidationException</i>
     * exception. <p>This parameter does not support lists or maps.
     * </important> <p>A logical operator to apply to the conditions in the
     * <i>QueryFilter</i> map: <ul> <li><p><code>AND</code> - If all of the
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
     * A value that specifies ascending (true) or descending (false)
     * traversal of the index. DynamoDB returns results reflecting the
     * requested order determined by the range key. If the data type is
     * Number, the results are returned in numeric order. For type String,
     * the results are returned in order of ASCII character code values. For
     * type Binary, DynamoDB treats each byte of the binary data as unsigned
     * when it compares binary values. <p>If <i>ScanIndexForward</i> is not
     * specified, the results are returned in ascending order.
     */
    private Boolean scanIndexForward;

    /**
     * The primary key of the first item that this operation will evaluate.
     * Use the value that was returned for <i>LastEvaluatedKey</i> in the
     * previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     * be String, Number or Binary. No set data types are allowed.
     */
    private java.util.Map<String,AttributeValue> exclusiveStartKey;

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
     * One or more attributes to retrieve from the table. These attributes
     * can include scalars, sets, or elements of a JSON document. The
     * attributes in the expression must be separated by commas. <p>If no
     * attribute names are specified, then all attributes will be returned.
     * If any of the requested attributes are not found, they will not appear
     * in the result.
     */
    private String projectionExpression;

    /**
     * A condition that evaluates the query results and returns only the
     * desired values. <p>The condition you specify is applied to the items
     * queried; any items that do not match the expression are not returned.
     */
    private String filterExpression;

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
     * Default constructor for a new QueryRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public QueryRequest() {}
    
    /**
     * Constructs a new QueryRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table containing the requested items.
     */
    public QueryRequest(String tableName) {
        setTableName(tableName);
    }

    /**
     * The name of the table containing the requested items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table containing the requested items.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table containing the requested items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table containing the requested items.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table containing the requested items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table containing the requested items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * The name of an index to query. This index can be any local secondary
     * index or global secondary index on the table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of an index to query. This index can be any local secondary
     *         index or global secondary index on the table.
     */
    public String getIndexName() {
        return indexName;
    }
    
    /**
     * The name of an index to query. This index can be any local secondary
     * index or global secondary index on the table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName The name of an index to query. This index can be any local secondary
     *         index or global secondary index on the table.
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
    
    /**
     * The name of an index to query. This index can be any local secondary
     * index or global secondary index on the table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName The name of an index to query. This index can be any local secondary
     *         index or global secondary index on the table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryRequest withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or
     * in the case of an index, some or all of the attributes projected into
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code> - Returns all of
     * the item attributes from the specified table or index. If you query a
     * local secondary index, then for each matching item in the index
     * DynamoDB will fetch the entire item from the parent table. If the
     * index is configured to project all item attributes, then all of the
     * data can be obtained from the local secondary index, and no fetching
     * is required. </li> <li> <p><code>ALL_PROJECTED_ATTRIBUTES</code> -
     * Allowed only when querying an index. Retrieves all attributes that
     * have been projected into the index. If the index is configured to
     * project all attributes, this return value is equivalent to specifying
     * <code>ALL_ATTRIBUTES</code>. </li> <li> <p><code>COUNT</code> -
     * Returns the number of matching items, rather than the matching items
     * themselves. </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> - Returns
     * only the attributes listed in <i>AttributesToGet</i>. This return
     * value is equivalent to specifying <i>AttributesToGet</i> without
     * specifying any value for <i>Select</i>. <p>If you query a local
     * secondary index and request only attributes that are projected into
     * that index, the operation will read only the index and not the table.
     * If any of the requested attributes are not projected into the local
     * secondary index, DynamoDB will fetch each of these attributes from the
     * parent table. This extra fetching incurs additional throughput cost
     * and latency. <p>If you query a global secondary index, you can only
     * request attributes that are projected into the index. Global secondary
     * index queries cannot fetch attributes from the parent table. </li>
     * </ul> <p>If neither <i>Select</i> nor <i>AttributesToGet</i> are
     * specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     * accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     * accessing an index. You cannot use both <i>Select</i> and
     * <i>AttributesToGet</i> together in a single request, unless the value
     * for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     * equivalent to specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @return The attributes to be returned in the result. You can retrieve all item
     *         attributes, specific item attributes, the count of matching items, or
     *         in the case of an index, some or all of the attributes projected into
     *         the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code> - Returns all of
     *         the item attributes from the specified table or index. If you query a
     *         local secondary index, then for each matching item in the index
     *         DynamoDB will fetch the entire item from the parent table. If the
     *         index is configured to project all item attributes, then all of the
     *         data can be obtained from the local secondary index, and no fetching
     *         is required. </li> <li> <p><code>ALL_PROJECTED_ATTRIBUTES</code> -
     *         Allowed only when querying an index. Retrieves all attributes that
     *         have been projected into the index. If the index is configured to
     *         project all attributes, this return value is equivalent to specifying
     *         <code>ALL_ATTRIBUTES</code>. </li> <li> <p><code>COUNT</code> -
     *         Returns the number of matching items, rather than the matching items
     *         themselves. </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> - Returns
     *         only the attributes listed in <i>AttributesToGet</i>. This return
     *         value is equivalent to specifying <i>AttributesToGet</i> without
     *         specifying any value for <i>Select</i>. <p>If you query a local
     *         secondary index and request only attributes that are projected into
     *         that index, the operation will read only the index and not the table.
     *         If any of the requested attributes are not projected into the local
     *         secondary index, DynamoDB will fetch each of these attributes from the
     *         parent table. This extra fetching incurs additional throughput cost
     *         and latency. <p>If you query a global secondary index, you can only
     *         request attributes that are projected into the index. Global secondary
     *         index queries cannot fetch attributes from the parent table. </li>
     *         </ul> <p>If neither <i>Select</i> nor <i>AttributesToGet</i> are
     *         specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     *         accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     *         accessing an index. You cannot use both <i>Select</i> and
     *         <i>AttributesToGet</i> together in a single request, unless the value
     *         for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *         equivalent to specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.)
     *
     * @see Select
     */
    public String getSelect() {
        return select;
    }
    
    /**
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or
     * in the case of an index, some or all of the attributes projected into
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code> - Returns all of
     * the item attributes from the specified table or index. If you query a
     * local secondary index, then for each matching item in the index
     * DynamoDB will fetch the entire item from the parent table. If the
     * index is configured to project all item attributes, then all of the
     * data can be obtained from the local secondary index, and no fetching
     * is required. </li> <li> <p><code>ALL_PROJECTED_ATTRIBUTES</code> -
     * Allowed only when querying an index. Retrieves all attributes that
     * have been projected into the index. If the index is configured to
     * project all attributes, this return value is equivalent to specifying
     * <code>ALL_ATTRIBUTES</code>. </li> <li> <p><code>COUNT</code> -
     * Returns the number of matching items, rather than the matching items
     * themselves. </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> - Returns
     * only the attributes listed in <i>AttributesToGet</i>. This return
     * value is equivalent to specifying <i>AttributesToGet</i> without
     * specifying any value for <i>Select</i>. <p>If you query a local
     * secondary index and request only attributes that are projected into
     * that index, the operation will read only the index and not the table.
     * If any of the requested attributes are not projected into the local
     * secondary index, DynamoDB will fetch each of these attributes from the
     * parent table. This extra fetching incurs additional throughput cost
     * and latency. <p>If you query a global secondary index, you can only
     * request attributes that are projected into the index. Global secondary
     * index queries cannot fetch attributes from the parent table. </li>
     * </ul> <p>If neither <i>Select</i> nor <i>AttributesToGet</i> are
     * specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     * accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     * accessing an index. You cannot use both <i>Select</i> and
     * <i>AttributesToGet</i> together in a single request, unless the value
     * for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     * equivalent to specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select The attributes to be returned in the result. You can retrieve all item
     *         attributes, specific item attributes, the count of matching items, or
     *         in the case of an index, some or all of the attributes projected into
     *         the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code> - Returns all of
     *         the item attributes from the specified table or index. If you query a
     *         local secondary index, then for each matching item in the index
     *         DynamoDB will fetch the entire item from the parent table. If the
     *         index is configured to project all item attributes, then all of the
     *         data can be obtained from the local secondary index, and no fetching
     *         is required. </li> <li> <p><code>ALL_PROJECTED_ATTRIBUTES</code> -
     *         Allowed only when querying an index. Retrieves all attributes that
     *         have been projected into the index. If the index is configured to
     *         project all attributes, this return value is equivalent to specifying
     *         <code>ALL_ATTRIBUTES</code>. </li> <li> <p><code>COUNT</code> -
     *         Returns the number of matching items, rather than the matching items
     *         themselves. </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> - Returns
     *         only the attributes listed in <i>AttributesToGet</i>. This return
     *         value is equivalent to specifying <i>AttributesToGet</i> without
     *         specifying any value for <i>Select</i>. <p>If you query a local
     *         secondary index and request only attributes that are projected into
     *         that index, the operation will read only the index and not the table.
     *         If any of the requested attributes are not projected into the local
     *         secondary index, DynamoDB will fetch each of these attributes from the
     *         parent table. This extra fetching incurs additional throughput cost
     *         and latency. <p>If you query a global secondary index, you can only
     *         request attributes that are projected into the index. Global secondary
     *         index queries cannot fetch attributes from the parent table. </li>
     *         </ul> <p>If neither <i>Select</i> nor <i>AttributesToGet</i> are
     *         specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     *         accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     *         accessing an index. You cannot use both <i>Select</i> and
     *         <i>AttributesToGet</i> together in a single request, unless the value
     *         for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *         equivalent to specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.)
     *
     * @see Select
     */
    public void setSelect(String select) {
        this.select = select;
    }
    
    /**
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or
     * in the case of an index, some or all of the attributes projected into
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code> - Returns all of
     * the item attributes from the specified table or index. If you query a
     * local secondary index, then for each matching item in the index
     * DynamoDB will fetch the entire item from the parent table. If the
     * index is configured to project all item attributes, then all of the
     * data can be obtained from the local secondary index, and no fetching
     * is required. </li> <li> <p><code>ALL_PROJECTED_ATTRIBUTES</code> -
     * Allowed only when querying an index. Retrieves all attributes that
     * have been projected into the index. If the index is configured to
     * project all attributes, this return value is equivalent to specifying
     * <code>ALL_ATTRIBUTES</code>. </li> <li> <p><code>COUNT</code> -
     * Returns the number of matching items, rather than the matching items
     * themselves. </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> - Returns
     * only the attributes listed in <i>AttributesToGet</i>. This return
     * value is equivalent to specifying <i>AttributesToGet</i> without
     * specifying any value for <i>Select</i>. <p>If you query a local
     * secondary index and request only attributes that are projected into
     * that index, the operation will read only the index and not the table.
     * If any of the requested attributes are not projected into the local
     * secondary index, DynamoDB will fetch each of these attributes from the
     * parent table. This extra fetching incurs additional throughput cost
     * and latency. <p>If you query a global secondary index, you can only
     * request attributes that are projected into the index. Global secondary
     * index queries cannot fetch attributes from the parent table. </li>
     * </ul> <p>If neither <i>Select</i> nor <i>AttributesToGet</i> are
     * specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     * accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     * accessing an index. You cannot use both <i>Select</i> and
     * <i>AttributesToGet</i> together in a single request, unless the value
     * for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     * equivalent to specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select The attributes to be returned in the result. You can retrieve all item
     *         attributes, specific item attributes, the count of matching items, or
     *         in the case of an index, some or all of the attributes projected into
     *         the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code> - Returns all of
     *         the item attributes from the specified table or index. If you query a
     *         local secondary index, then for each matching item in the index
     *         DynamoDB will fetch the entire item from the parent table. If the
     *         index is configured to project all item attributes, then all of the
     *         data can be obtained from the local secondary index, and no fetching
     *         is required. </li> <li> <p><code>ALL_PROJECTED_ATTRIBUTES</code> -
     *         Allowed only when querying an index. Retrieves all attributes that
     *         have been projected into the index. If the index is configured to
     *         project all attributes, this return value is equivalent to specifying
     *         <code>ALL_ATTRIBUTES</code>. </li> <li> <p><code>COUNT</code> -
     *         Returns the number of matching items, rather than the matching items
     *         themselves. </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> - Returns
     *         only the attributes listed in <i>AttributesToGet</i>. This return
     *         value is equivalent to specifying <i>AttributesToGet</i> without
     *         specifying any value for <i>Select</i>. <p>If you query a local
     *         secondary index and request only attributes that are projected into
     *         that index, the operation will read only the index and not the table.
     *         If any of the requested attributes are not projected into the local
     *         secondary index, DynamoDB will fetch each of these attributes from the
     *         parent table. This extra fetching incurs additional throughput cost
     *         and latency. <p>If you query a global secondary index, you can only
     *         request attributes that are projected into the index. Global secondary
     *         index queries cannot fetch attributes from the parent table. </li>
     *         </ul> <p>If neither <i>Select</i> nor <i>AttributesToGet</i> are
     *         specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     *         accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     *         accessing an index. You cannot use both <i>Select</i> and
     *         <i>AttributesToGet</i> together in a single request, unless the value
     *         for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *         equivalent to specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Select
     */
    public QueryRequest withSelect(String select) {
        this.select = select;
        return this;
    }

    /**
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or
     * in the case of an index, some or all of the attributes projected into
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code> - Returns all of
     * the item attributes from the specified table or index. If you query a
     * local secondary index, then for each matching item in the index
     * DynamoDB will fetch the entire item from the parent table. If the
     * index is configured to project all item attributes, then all of the
     * data can be obtained from the local secondary index, and no fetching
     * is required. </li> <li> <p><code>ALL_PROJECTED_ATTRIBUTES</code> -
     * Allowed only when querying an index. Retrieves all attributes that
     * have been projected into the index. If the index is configured to
     * project all attributes, this return value is equivalent to specifying
     * <code>ALL_ATTRIBUTES</code>. </li> <li> <p><code>COUNT</code> -
     * Returns the number of matching items, rather than the matching items
     * themselves. </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> - Returns
     * only the attributes listed in <i>AttributesToGet</i>. This return
     * value is equivalent to specifying <i>AttributesToGet</i> without
     * specifying any value for <i>Select</i>. <p>If you query a local
     * secondary index and request only attributes that are projected into
     * that index, the operation will read only the index and not the table.
     * If any of the requested attributes are not projected into the local
     * secondary index, DynamoDB will fetch each of these attributes from the
     * parent table. This extra fetching incurs additional throughput cost
     * and latency. <p>If you query a global secondary index, you can only
     * request attributes that are projected into the index. Global secondary
     * index queries cannot fetch attributes from the parent table. </li>
     * </ul> <p>If neither <i>Select</i> nor <i>AttributesToGet</i> are
     * specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     * accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     * accessing an index. You cannot use both <i>Select</i> and
     * <i>AttributesToGet</i> together in a single request, unless the value
     * for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     * equivalent to specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select The attributes to be returned in the result. You can retrieve all item
     *         attributes, specific item attributes, the count of matching items, or
     *         in the case of an index, some or all of the attributes projected into
     *         the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code> - Returns all of
     *         the item attributes from the specified table or index. If you query a
     *         local secondary index, then for each matching item in the index
     *         DynamoDB will fetch the entire item from the parent table. If the
     *         index is configured to project all item attributes, then all of the
     *         data can be obtained from the local secondary index, and no fetching
     *         is required. </li> <li> <p><code>ALL_PROJECTED_ATTRIBUTES</code> -
     *         Allowed only when querying an index. Retrieves all attributes that
     *         have been projected into the index. If the index is configured to
     *         project all attributes, this return value is equivalent to specifying
     *         <code>ALL_ATTRIBUTES</code>. </li> <li> <p><code>COUNT</code> -
     *         Returns the number of matching items, rather than the matching items
     *         themselves. </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> - Returns
     *         only the attributes listed in <i>AttributesToGet</i>. This return
     *         value is equivalent to specifying <i>AttributesToGet</i> without
     *         specifying any value for <i>Select</i>. <p>If you query a local
     *         secondary index and request only attributes that are projected into
     *         that index, the operation will read only the index and not the table.
     *         If any of the requested attributes are not projected into the local
     *         secondary index, DynamoDB will fetch each of these attributes from the
     *         parent table. This extra fetching incurs additional throughput cost
     *         and latency. <p>If you query a global secondary index, you can only
     *         request attributes that are projected into the index. Global secondary
     *         index queries cannot fetch attributes from the parent table. </li>
     *         </ul> <p>If neither <i>Select</i> nor <i>AttributesToGet</i> are
     *         specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     *         accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     *         accessing an index. You cannot use both <i>Select</i> and
     *         <i>AttributesToGet</i> together in a single request, unless the value
     *         for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *         equivalent to specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.)
     *
     * @see Select
     */
    public void setSelect(Select select) {
        this.select = select.toString();
    }
    
    /**
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or
     * in the case of an index, some or all of the attributes projected into
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code> - Returns all of
     * the item attributes from the specified table or index. If you query a
     * local secondary index, then for each matching item in the index
     * DynamoDB will fetch the entire item from the parent table. If the
     * index is configured to project all item attributes, then all of the
     * data can be obtained from the local secondary index, and no fetching
     * is required. </li> <li> <p><code>ALL_PROJECTED_ATTRIBUTES</code> -
     * Allowed only when querying an index. Retrieves all attributes that
     * have been projected into the index. If the index is configured to
     * project all attributes, this return value is equivalent to specifying
     * <code>ALL_ATTRIBUTES</code>. </li> <li> <p><code>COUNT</code> -
     * Returns the number of matching items, rather than the matching items
     * themselves. </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> - Returns
     * only the attributes listed in <i>AttributesToGet</i>. This return
     * value is equivalent to specifying <i>AttributesToGet</i> without
     * specifying any value for <i>Select</i>. <p>If you query a local
     * secondary index and request only attributes that are projected into
     * that index, the operation will read only the index and not the table.
     * If any of the requested attributes are not projected into the local
     * secondary index, DynamoDB will fetch each of these attributes from the
     * parent table. This extra fetching incurs additional throughput cost
     * and latency. <p>If you query a global secondary index, you can only
     * request attributes that are projected into the index. Global secondary
     * index queries cannot fetch attributes from the parent table. </li>
     * </ul> <p>If neither <i>Select</i> nor <i>AttributesToGet</i> are
     * specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     * accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     * accessing an index. You cannot use both <i>Select</i> and
     * <i>AttributesToGet</i> together in a single request, unless the value
     * for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     * equivalent to specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select The attributes to be returned in the result. You can retrieve all item
     *         attributes, specific item attributes, the count of matching items, or
     *         in the case of an index, some or all of the attributes projected into
     *         the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code> - Returns all of
     *         the item attributes from the specified table or index. If you query a
     *         local secondary index, then for each matching item in the index
     *         DynamoDB will fetch the entire item from the parent table. If the
     *         index is configured to project all item attributes, then all of the
     *         data can be obtained from the local secondary index, and no fetching
     *         is required. </li> <li> <p><code>ALL_PROJECTED_ATTRIBUTES</code> -
     *         Allowed only when querying an index. Retrieves all attributes that
     *         have been projected into the index. If the index is configured to
     *         project all attributes, this return value is equivalent to specifying
     *         <code>ALL_ATTRIBUTES</code>. </li> <li> <p><code>COUNT</code> -
     *         Returns the number of matching items, rather than the matching items
     *         themselves. </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> - Returns
     *         only the attributes listed in <i>AttributesToGet</i>. This return
     *         value is equivalent to specifying <i>AttributesToGet</i> without
     *         specifying any value for <i>Select</i>. <p>If you query a local
     *         secondary index and request only attributes that are projected into
     *         that index, the operation will read only the index and not the table.
     *         If any of the requested attributes are not projected into the local
     *         secondary index, DynamoDB will fetch each of these attributes from the
     *         parent table. This extra fetching incurs additional throughput cost
     *         and latency. <p>If you query a global secondary index, you can only
     *         request attributes that are projected into the index. Global secondary
     *         index queries cannot fetch attributes from the parent table. </li>
     *         </ul> <p>If neither <i>Select</i> nor <i>AttributesToGet</i> are
     *         specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     *         accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     *         accessing an index. You cannot use both <i>Select</i> and
     *         <i>AttributesToGet</i> together in a single request, unless the value
     *         for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *         equivalent to specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Select
     */
    public QueryRequest withSelect(Select select) {
        this.select = select.toString();
        return this;
    }

    /**
     * <important><p>There is a newer parameter available. Use
     * <i>ProjectionExpression</i> instead. Note that if you use
     * <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     * time, DynamoDB will return a <i>ValidationException</i> exception.
     * <p>This parameter allows you to retrieve lists or maps; however, it
     * cannot retrieve individual list or map elements.</important> <p>The
     * names of one or more attributes to retrieve. If no attribute names are
     * specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>Note that <i>AttributesToGet</i> has no effect on
     * provisioned throughput consumption. DynamoDB determines capacity units
     * consumed based on item size, not on the amount of data that is
     * returned to an application. <p>You cannot use both
     * <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     * request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.) <p>If you query a local secondary index and request
     * only attributes that are projected into that index, the operation will
     * read only the index and not the table. If any of the requested
     * attributes are not projected into the local secondary index, DynamoDB
     * will fetch each of these attributes from the parent table. This extra
     * fetching incurs additional throughput cost and latency. <p>If you
     * query a global secondary index, you can only request attributes that
     * are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <important><p>There is a newer parameter available. Use
     *         <i>ProjectionExpression</i> instead. Note that if you use
     *         <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     *         time, DynamoDB will return a <i>ValidationException</i> exception.
     *         <p>This parameter allows you to retrieve lists or maps; however, it
     *         cannot retrieve individual list or map elements.</important> <p>The
     *         names of one or more attributes to retrieve. If no attribute names are
     *         specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result. <p>Note that <i>AttributesToGet</i> has no effect on
     *         provisioned throughput consumption. DynamoDB determines capacity units
     *         consumed based on item size, not on the amount of data that is
     *         returned to an application. <p>You cannot use both
     *         <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     *         request, <i>unless</i> the value for <i>Select</i> is
     *         <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *         specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.) <p>If you query a local secondary index and request
     *         only attributes that are projected into that index, the operation will
     *         read only the index and not the table. If any of the requested
     *         attributes are not projected into the local secondary index, DynamoDB
     *         will fetch each of these attributes from the parent table. This extra
     *         fetching incurs additional throughput cost and latency. <p>If you
     *         query a global secondary index, you can only request attributes that
     *         are projected into the index. Global secondary index queries cannot
     *         fetch attributes from the parent table.
     */
    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }
    
    /**
     * <important><p>There is a newer parameter available. Use
     * <i>ProjectionExpression</i> instead. Note that if you use
     * <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     * time, DynamoDB will return a <i>ValidationException</i> exception.
     * <p>This parameter allows you to retrieve lists or maps; however, it
     * cannot retrieve individual list or map elements.</important> <p>The
     * names of one or more attributes to retrieve. If no attribute names are
     * specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>Note that <i>AttributesToGet</i> has no effect on
     * provisioned throughput consumption. DynamoDB determines capacity units
     * consumed based on item size, not on the amount of data that is
     * returned to an application. <p>You cannot use both
     * <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     * request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.) <p>If you query a local secondary index and request
     * only attributes that are projected into that index, the operation will
     * read only the index and not the table. If any of the requested
     * attributes are not projected into the local secondary index, DynamoDB
     * will fetch each of these attributes from the parent table. This extra
     * fetching incurs additional throughput cost and latency. <p>If you
     * query a global secondary index, you can only request attributes that
     * are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet <important><p>There is a newer parameter available. Use
     *         <i>ProjectionExpression</i> instead. Note that if you use
     *         <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     *         time, DynamoDB will return a <i>ValidationException</i> exception.
     *         <p>This parameter allows you to retrieve lists or maps; however, it
     *         cannot retrieve individual list or map elements.</important> <p>The
     *         names of one or more attributes to retrieve. If no attribute names are
     *         specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result. <p>Note that <i>AttributesToGet</i> has no effect on
     *         provisioned throughput consumption. DynamoDB determines capacity units
     *         consumed based on item size, not on the amount of data that is
     *         returned to an application. <p>You cannot use both
     *         <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     *         request, <i>unless</i> the value for <i>Select</i> is
     *         <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *         specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.) <p>If you query a local secondary index and request
     *         only attributes that are projected into that index, the operation will
     *         read only the index and not the table. If any of the requested
     *         attributes are not projected into the local secondary index, DynamoDB
     *         will fetch each of these attributes from the parent table. This extra
     *         fetching incurs additional throughput cost and latency. <p>If you
     *         query a global secondary index, you can only request attributes that
     *         are projected into the index. Global secondary index queries cannot
     *         fetch attributes from the parent table.
     */
    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(attributesToGet.size());
        attributesToGetCopy.addAll(attributesToGet);
        this.attributesToGet = attributesToGetCopy;
    }
    
    /**
     * <important><p>There is a newer parameter available. Use
     * <i>ProjectionExpression</i> instead. Note that if you use
     * <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     * time, DynamoDB will return a <i>ValidationException</i> exception.
     * <p>This parameter allows you to retrieve lists or maps; however, it
     * cannot retrieve individual list or map elements.</important> <p>The
     * names of one or more attributes to retrieve. If no attribute names are
     * specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>Note that <i>AttributesToGet</i> has no effect on
     * provisioned throughput consumption. DynamoDB determines capacity units
     * consumed based on item size, not on the amount of data that is
     * returned to an application. <p>You cannot use both
     * <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     * request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.) <p>If you query a local secondary index and request
     * only attributes that are projected into that index, the operation will
     * read only the index and not the table. If any of the requested
     * attributes are not projected into the local secondary index, DynamoDB
     * will fetch each of these attributes from the parent table. This extra
     * fetching incurs additional throughput cost and latency. <p>If you
     * query a global secondary index, you can only request attributes that
     * are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet <important><p>There is a newer parameter available. Use
     *         <i>ProjectionExpression</i> instead. Note that if you use
     *         <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     *         time, DynamoDB will return a <i>ValidationException</i> exception.
     *         <p>This parameter allows you to retrieve lists or maps; however, it
     *         cannot retrieve individual list or map elements.</important> <p>The
     *         names of one or more attributes to retrieve. If no attribute names are
     *         specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result. <p>Note that <i>AttributesToGet</i> has no effect on
     *         provisioned throughput consumption. DynamoDB determines capacity units
     *         consumed based on item size, not on the amount of data that is
     *         returned to an application. <p>You cannot use both
     *         <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     *         request, <i>unless</i> the value for <i>Select</i> is
     *         <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *         specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.) <p>If you query a local secondary index and request
     *         only attributes that are projected into that index, the operation will
     *         read only the index and not the table. If any of the requested
     *         attributes are not projected into the local secondary index, DynamoDB
     *         will fetch each of these attributes from the parent table. This extra
     *         fetching incurs additional throughput cost and latency. <p>If you
     *         query a global secondary index, you can only request attributes that
     *         are projected into the index. Global secondary index queries cannot
     *         fetch attributes from the parent table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryRequest withAttributesToGet(String... attributesToGet) {
        if (getAttributesToGet() == null) setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        for (String value : attributesToGet) {
            getAttributesToGet().add(value);
        }
        return this;
    }
    
    /**
     * <important><p>There is a newer parameter available. Use
     * <i>ProjectionExpression</i> instead. Note that if you use
     * <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     * time, DynamoDB will return a <i>ValidationException</i> exception.
     * <p>This parameter allows you to retrieve lists or maps; however, it
     * cannot retrieve individual list or map elements.</important> <p>The
     * names of one or more attributes to retrieve. If no attribute names are
     * specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>Note that <i>AttributesToGet</i> has no effect on
     * provisioned throughput consumption. DynamoDB determines capacity units
     * consumed based on item size, not on the amount of data that is
     * returned to an application. <p>You cannot use both
     * <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     * request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.) <p>If you query a local secondary index and request
     * only attributes that are projected into that index, the operation will
     * read only the index and not the table. If any of the requested
     * attributes are not projected into the local secondary index, DynamoDB
     * will fetch each of these attributes from the parent table. This extra
     * fetching incurs additional throughput cost and latency. <p>If you
     * query a global secondary index, you can only request attributes that
     * are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet <important><p>There is a newer parameter available. Use
     *         <i>ProjectionExpression</i> instead. Note that if you use
     *         <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     *         time, DynamoDB will return a <i>ValidationException</i> exception.
     *         <p>This parameter allows you to retrieve lists or maps; however, it
     *         cannot retrieve individual list or map elements.</important> <p>The
     *         names of one or more attributes to retrieve. If no attribute names are
     *         specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result. <p>Note that <i>AttributesToGet</i> has no effect on
     *         provisioned throughput consumption. DynamoDB determines capacity units
     *         consumed based on item size, not on the amount of data that is
     *         returned to an application. <p>You cannot use both
     *         <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     *         request, <i>unless</i> the value for <i>Select</i> is
     *         <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *         specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.) <p>If you query a local secondary index and request
     *         only attributes that are projected into that index, the operation will
     *         read only the index and not the table. If any of the requested
     *         attributes are not projected into the local secondary index, DynamoDB
     *         will fetch each of these attributes from the parent table. This extra
     *         fetching incurs additional throughput cost and latency. <p>If you
     *         query a global secondary index, you can only request attributes that
     *         are projected into the index. Global secondary index queries cannot
     *         fetch attributes from the parent table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(attributesToGet.size());
            attributesToGetCopy.addAll(attributesToGet);
            this.attributesToGet = attributesToGetCopy;
        }

        return this;
    }

    /**
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If DynamoDB processes the number of items up to the
     * limit while processing the results, it stops the operation and returns
     * the matching values up to that point, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set
     * size exceeds 1 MB before DynamoDB reaches this limit, it stops the
     * operation and returns the matching values up to the limit, and a key
     * in <i>LastEvaluatedKey</i> to apply in a subsequent operation to
     * continue the operation. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query
     * and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The maximum number of items to evaluate (not necessarily the number of
     *         matching items). If DynamoDB processes the number of items up to the
     *         limit while processing the results, it stops the operation and returns
     *         the matching values up to that point, and a key in
     *         <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that
     *         you can pick up where you left off. Also, if the processed data set
     *         size exceeds 1 MB before DynamoDB reaches this limit, it stops the
     *         operation and returns the matching values up to the limit, and a key
     *         in <i>LastEvaluatedKey</i> to apply in a subsequent operation to
     *         continue the operation. For more information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query
     *         and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If DynamoDB processes the number of items up to the
     * limit while processing the results, it stops the operation and returns
     * the matching values up to that point, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set
     * size exceeds 1 MB before DynamoDB reaches this limit, it stops the
     * operation and returns the matching values up to the limit, and a key
     * in <i>LastEvaluatedKey</i> to apply in a subsequent operation to
     * continue the operation. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query
     * and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit The maximum number of items to evaluate (not necessarily the number of
     *         matching items). If DynamoDB processes the number of items up to the
     *         limit while processing the results, it stops the operation and returns
     *         the matching values up to that point, and a key in
     *         <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that
     *         you can pick up where you left off. Also, if the processed data set
     *         size exceeds 1 MB before DynamoDB reaches this limit, it stops the
     *         operation and returns the matching values up to the limit, and a key
     *         in <i>LastEvaluatedKey</i> to apply in a subsequent operation to
     *         continue the operation. For more information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query
     *         and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If DynamoDB processes the number of items up to the
     * limit while processing the results, it stops the operation and returns
     * the matching values up to that point, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set
     * size exceeds 1 MB before DynamoDB reaches this limit, it stops the
     * operation and returns the matching values up to the limit, and a key
     * in <i>LastEvaluatedKey</i> to apply in a subsequent operation to
     * continue the operation. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query
     * and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit The maximum number of items to evaluate (not necessarily the number of
     *         matching items). If DynamoDB processes the number of items up to the
     *         limit while processing the results, it stops the operation and returns
     *         the matching values up to that point, and a key in
     *         <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that
     *         you can pick up where you left off. Also, if the processed data set
     *         size exceeds 1 MB before DynamoDB reaches this limit, it stops the
     *         operation and returns the matching values up to the limit, and a key
     *         in <i>LastEvaluatedKey</i> to apply in a subsequent operation to
     *         continue the operation. For more information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query
     *         and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * A value that if set to <code>true</code>, then the operation uses
     * strongly consistent reads; otherwise, eventually consistent reads are
     * used. <p>Strongly consistent reads are not supported on global
     * secondary indexes. If you query a global secondary index with
     * <i>ConsistentRead</i> set to <code>true</code>, you will receive an
     * error message.
     *
     * @return A value that if set to <code>true</code>, then the operation uses
     *         strongly consistent reads; otherwise, eventually consistent reads are
     *         used. <p>Strongly consistent reads are not supported on global
     *         secondary indexes. If you query a global secondary index with
     *         <i>ConsistentRead</i> set to <code>true</code>, you will receive an
     *         error message.
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }
    
    /**
     * A value that if set to <code>true</code>, then the operation uses
     * strongly consistent reads; otherwise, eventually consistent reads are
     * used. <p>Strongly consistent reads are not supported on global
     * secondary indexes. If you query a global secondary index with
     * <i>ConsistentRead</i> set to <code>true</code>, you will receive an
     * error message.
     *
     * @param consistentRead A value that if set to <code>true</code>, then the operation uses
     *         strongly consistent reads; otherwise, eventually consistent reads are
     *         used. <p>Strongly consistent reads are not supported on global
     *         secondary indexes. If you query a global secondary index with
     *         <i>ConsistentRead</i> set to <code>true</code>, you will receive an
     *         error message.
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }
    
    /**
     * A value that if set to <code>true</code>, then the operation uses
     * strongly consistent reads; otherwise, eventually consistent reads are
     * used. <p>Strongly consistent reads are not supported on global
     * secondary indexes. If you query a global secondary index with
     * <i>ConsistentRead</i> set to <code>true</code>, you will receive an
     * error message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consistentRead A value that if set to <code>true</code>, then the operation uses
     *         strongly consistent reads; otherwise, eventually consistent reads are
     *         used. <p>Strongly consistent reads are not supported on global
     *         secondary indexes. If you query a global secondary index with
     *         <i>ConsistentRead</i> set to <code>true</code>, you will receive an
     *         error message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryRequest withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }

    /**
     * A value that if set to <code>true</code>, then the operation uses
     * strongly consistent reads; otherwise, eventually consistent reads are
     * used. <p>Strongly consistent reads are not supported on global
     * secondary indexes. If you query a global secondary index with
     * <i>ConsistentRead</i> set to <code>true</code>, you will receive an
     * error message.
     *
     * @return A value that if set to <code>true</code>, then the operation uses
     *         strongly consistent reads; otherwise, eventually consistent reads are
     *         used. <p>Strongly consistent reads are not supported on global
     *         secondary indexes. If you query a global secondary index with
     *         <i>ConsistentRead</i> set to <code>true</code>, you will receive an
     *         error message.
     */
    public Boolean getConsistentRead() {
        return consistentRead;
    }

    /**
     * The selection criteria for the query. For a query on a table, you can
     * have conditions only on the table primary key attributes. You must
     * specify the hash key attribute name and value as an <code>EQ</code>
     * condition. You can optionally specify a second condition, referring to
     * the range key attribute. <p>For a query on an index, you can have
     * conditions only on the index key attributes. You must specify the
     * index hash attribute name and value as an EQ condition. You can
     * optionally specify a second condition, referring to the index key
     * range attribute. <p>Each <i>KeyConditions</i> element consists of an
     * attribute name to compare, along with the following: <ul> <li>
     * <p><i>AttributeValueList</i> - One or more values to evaluate against
     * the supplied attribute. The number of values in the list depends on
     * the <i>ComparisonOperator</i> being used. <p>For type Number, value
     * comparisons are numeric. <p>String value comparisons for greater than,
     * equals, or less than are based on ASCII character code values. For
     * example, <code>a</code> is greater than <code>A</code>, and
     * <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes, for example, equals, greater
     * than, less than, and so on. <p>For <i>KeyConditions</i>, only the
     * following comparison operators are supported: <p> <code>EQ | LE | LT |
     * GE | GT | BEGINS_WITH | BETWEEN</code> <p>The following are
     * descriptions of these comparison operators. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>LE</code> : Less than or equal. <p><i>AttributeValueList</i>
     * can contain only one <i>AttributeValue</i> element of type String,
     * Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set
     * type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
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
     * "1"]}</code>. <p/> </li> <li> <p><code>BEGINS_WITH</code> : Checks for
     * a prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a set
     * type). The target attribute of the comparison must be of type String
     * or Binary (not a Number or a set type). <p/> </li> <li>
     * <p><code>BETWEEN</code> : Greater than or equal to the first value,
     * and less than or equal to the second value.
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
     * Guide</i>.
     *
     * @return The selection criteria for the query. For a query on a table, you can
     *         have conditions only on the table primary key attributes. You must
     *         specify the hash key attribute name and value as an <code>EQ</code>
     *         condition. You can optionally specify a second condition, referring to
     *         the range key attribute. <p>For a query on an index, you can have
     *         conditions only on the index key attributes. You must specify the
     *         index hash attribute name and value as an EQ condition. You can
     *         optionally specify a second condition, referring to the index key
     *         range attribute. <p>Each <i>KeyConditions</i> element consists of an
     *         attribute name to compare, along with the following: <ul> <li>
     *         <p><i>AttributeValueList</i> - One or more values to evaluate against
     *         the supplied attribute. The number of values in the list depends on
     *         the <i>ComparisonOperator</i> being used. <p>For type Number, value
     *         comparisons are numeric. <p>String value comparisons for greater than,
     *         equals, or less than are based on ASCII character code values. For
     *         example, <code>a</code> is greater than <code>A</code>, and
     *         <code>aa</code> is greater than <code>B</code>. For a list of code
     *         values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     *         comparator for evaluating attributes, for example, equals, greater
     *         than, less than, and so on. <p>For <i>KeyConditions</i>, only the
     *         following comparison operators are supported: <p> <code>EQ | LE | LT |
     *         GE | GT | BEGINS_WITH | BETWEEN</code> <p>The following are
     *         descriptions of these comparison operators. <ul> <li>
     *         <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     *         only one <i>AttributeValue</i> of type String, Number, or Binary (not
     *         a set type). If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *         <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     *         <p><code>LE</code> : Less than or equal. <p><i>AttributeValueList</i>
     *         can contain only one <i>AttributeValue</i> element of type String,
     *         Number, or Binary (not a set type). If an item contains an
     *         <i>AttributeValue</i> element of a different type than the one
     *         specified in the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set
     *         type). If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
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
     *         "1"]}</code>. <p/> </li> <li> <p><code>BEGINS_WITH</code> : Checks for
     *         a prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a set
     *         type). The target attribute of the comparison must be of type String
     *         or Binary (not a Number or a set type). <p/> </li> <li>
     *         <p><code>BETWEEN</code> : Greater than or equal to the first value,
     *         and less than or equal to the second value.
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
     *         Guide</i>.
     */
    public java.util.Map<String,Condition> getKeyConditions() {
        
        return keyConditions;
    }
    
    /**
     * The selection criteria for the query. For a query on a table, you can
     * have conditions only on the table primary key attributes. You must
     * specify the hash key attribute name and value as an <code>EQ</code>
     * condition. You can optionally specify a second condition, referring to
     * the range key attribute. <p>For a query on an index, you can have
     * conditions only on the index key attributes. You must specify the
     * index hash attribute name and value as an EQ condition. You can
     * optionally specify a second condition, referring to the index key
     * range attribute. <p>Each <i>KeyConditions</i> element consists of an
     * attribute name to compare, along with the following: <ul> <li>
     * <p><i>AttributeValueList</i> - One or more values to evaluate against
     * the supplied attribute. The number of values in the list depends on
     * the <i>ComparisonOperator</i> being used. <p>For type Number, value
     * comparisons are numeric. <p>String value comparisons for greater than,
     * equals, or less than are based on ASCII character code values. For
     * example, <code>a</code> is greater than <code>A</code>, and
     * <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes, for example, equals, greater
     * than, less than, and so on. <p>For <i>KeyConditions</i>, only the
     * following comparison operators are supported: <p> <code>EQ | LE | LT |
     * GE | GT | BEGINS_WITH | BETWEEN</code> <p>The following are
     * descriptions of these comparison operators. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>LE</code> : Less than or equal. <p><i>AttributeValueList</i>
     * can contain only one <i>AttributeValue</i> element of type String,
     * Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set
     * type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
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
     * "1"]}</code>. <p/> </li> <li> <p><code>BEGINS_WITH</code> : Checks for
     * a prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a set
     * type). The target attribute of the comparison must be of type String
     * or Binary (not a Number or a set type). <p/> </li> <li>
     * <p><code>BETWEEN</code> : Greater than or equal to the first value,
     * and less than or equal to the second value.
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
     * Guide</i>.
     *
     * @param keyConditions The selection criteria for the query. For a query on a table, you can
     *         have conditions only on the table primary key attributes. You must
     *         specify the hash key attribute name and value as an <code>EQ</code>
     *         condition. You can optionally specify a second condition, referring to
     *         the range key attribute. <p>For a query on an index, you can have
     *         conditions only on the index key attributes. You must specify the
     *         index hash attribute name and value as an EQ condition. You can
     *         optionally specify a second condition, referring to the index key
     *         range attribute. <p>Each <i>KeyConditions</i> element consists of an
     *         attribute name to compare, along with the following: <ul> <li>
     *         <p><i>AttributeValueList</i> - One or more values to evaluate against
     *         the supplied attribute. The number of values in the list depends on
     *         the <i>ComparisonOperator</i> being used. <p>For type Number, value
     *         comparisons are numeric. <p>String value comparisons for greater than,
     *         equals, or less than are based on ASCII character code values. For
     *         example, <code>a</code> is greater than <code>A</code>, and
     *         <code>aa</code> is greater than <code>B</code>. For a list of code
     *         values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     *         comparator for evaluating attributes, for example, equals, greater
     *         than, less than, and so on. <p>For <i>KeyConditions</i>, only the
     *         following comparison operators are supported: <p> <code>EQ | LE | LT |
     *         GE | GT | BEGINS_WITH | BETWEEN</code> <p>The following are
     *         descriptions of these comparison operators. <ul> <li>
     *         <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     *         only one <i>AttributeValue</i> of type String, Number, or Binary (not
     *         a set type). If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *         <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     *         <p><code>LE</code> : Less than or equal. <p><i>AttributeValueList</i>
     *         can contain only one <i>AttributeValue</i> element of type String,
     *         Number, or Binary (not a set type). If an item contains an
     *         <i>AttributeValue</i> element of a different type than the one
     *         specified in the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set
     *         type). If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
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
     *         "1"]}</code>. <p/> </li> <li> <p><code>BEGINS_WITH</code> : Checks for
     *         a prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a set
     *         type). The target attribute of the comparison must be of type String
     *         or Binary (not a Number or a set type). <p/> </li> <li>
     *         <p><code>BETWEEN</code> : Greater than or equal to the first value,
     *         and less than or equal to the second value.
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
     *         Guide</i>.
     */
    public void setKeyConditions(java.util.Map<String,Condition> keyConditions) {
        this.keyConditions = keyConditions;
    }
    
    /**
     * The selection criteria for the query. For a query on a table, you can
     * have conditions only on the table primary key attributes. You must
     * specify the hash key attribute name and value as an <code>EQ</code>
     * condition. You can optionally specify a second condition, referring to
     * the range key attribute. <p>For a query on an index, you can have
     * conditions only on the index key attributes. You must specify the
     * index hash attribute name and value as an EQ condition. You can
     * optionally specify a second condition, referring to the index key
     * range attribute. <p>Each <i>KeyConditions</i> element consists of an
     * attribute name to compare, along with the following: <ul> <li>
     * <p><i>AttributeValueList</i> - One or more values to evaluate against
     * the supplied attribute. The number of values in the list depends on
     * the <i>ComparisonOperator</i> being used. <p>For type Number, value
     * comparisons are numeric. <p>String value comparisons for greater than,
     * equals, or less than are based on ASCII character code values. For
     * example, <code>a</code> is greater than <code>A</code>, and
     * <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes, for example, equals, greater
     * than, less than, and so on. <p>For <i>KeyConditions</i>, only the
     * following comparison operators are supported: <p> <code>EQ | LE | LT |
     * GE | GT | BEGINS_WITH | BETWEEN</code> <p>The following are
     * descriptions of these comparison operators. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>LE</code> : Less than or equal. <p><i>AttributeValueList</i>
     * can contain only one <i>AttributeValue</i> element of type String,
     * Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set
     * type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
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
     * "1"]}</code>. <p/> </li> <li> <p><code>BEGINS_WITH</code> : Checks for
     * a prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a set
     * type). The target attribute of the comparison must be of type String
     * or Binary (not a Number or a set type). <p/> </li> <li>
     * <p><code>BETWEEN</code> : Greater than or equal to the first value,
     * and less than or equal to the second value.
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
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyConditions The selection criteria for the query. For a query on a table, you can
     *         have conditions only on the table primary key attributes. You must
     *         specify the hash key attribute name and value as an <code>EQ</code>
     *         condition. You can optionally specify a second condition, referring to
     *         the range key attribute. <p>For a query on an index, you can have
     *         conditions only on the index key attributes. You must specify the
     *         index hash attribute name and value as an EQ condition. You can
     *         optionally specify a second condition, referring to the index key
     *         range attribute. <p>Each <i>KeyConditions</i> element consists of an
     *         attribute name to compare, along with the following: <ul> <li>
     *         <p><i>AttributeValueList</i> - One or more values to evaluate against
     *         the supplied attribute. The number of values in the list depends on
     *         the <i>ComparisonOperator</i> being used. <p>For type Number, value
     *         comparisons are numeric. <p>String value comparisons for greater than,
     *         equals, or less than are based on ASCII character code values. For
     *         example, <code>a</code> is greater than <code>A</code>, and
     *         <code>aa</code> is greater than <code>B</code>. For a list of code
     *         values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     *         comparator for evaluating attributes, for example, equals, greater
     *         than, less than, and so on. <p>For <i>KeyConditions</i>, only the
     *         following comparison operators are supported: <p> <code>EQ | LE | LT |
     *         GE | GT | BEGINS_WITH | BETWEEN</code> <p>The following are
     *         descriptions of these comparison operators. <ul> <li>
     *         <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     *         only one <i>AttributeValue</i> of type String, Number, or Binary (not
     *         a set type). If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *         <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     *         <p><code>LE</code> : Less than or equal. <p><i>AttributeValueList</i>
     *         can contain only one <i>AttributeValue</i> element of type String,
     *         Number, or Binary (not a set type). If an item contains an
     *         <i>AttributeValue</i> element of a different type than the one
     *         specified in the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set
     *         type). If an item contains an <i>AttributeValue</i> element of a
     *         different type than the one specified in the request, the value does
     *         not match. For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
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
     *         "1"]}</code>. <p/> </li> <li> <p><code>BEGINS_WITH</code> : Checks for
     *         a prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a set
     *         type). The target attribute of the comparison must be of type String
     *         or Binary (not a Number or a set type). <p/> </li> <li>
     *         <p><code>BETWEEN</code> : Greater than or equal to the first value,
     *         and less than or equal to the second value.
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
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryRequest withKeyConditions(java.util.Map<String,Condition> keyConditions) {
        setKeyConditions(keyConditions);
        return this;
    }

    /**
     * The selection criteria for the query. For a query on a table, you can
     * have conditions only on the table primary key attributes. You must
     * specify the hash key attribute name and value as an <code>EQ</code>
     * condition. You can optionally specify a second condition, referring to
     * the range key attribute. <p>For a query on an index, you can have
     * conditions only on the index key attributes. You must specify the
     * index hash attribute name and value as an EQ condition. You can
     * optionally specify a second condition, referring to the index key
     * range attribute. <p>Each <i>KeyConditions</i> element consists of an
     * attribute name to compare, along with the following: <ul> <li>
     * <p><i>AttributeValueList</i> - One or more values to evaluate against
     * the supplied attribute. The number of values in the list depends on
     * the <i>ComparisonOperator</i> being used. <p>For type Number, value
     * comparisons are numeric. <p>String value comparisons for greater than,
     * equals, or less than are based on ASCII character code values. For
     * example, <code>a</code> is greater than <code>A</code>, and
     * <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </li> <li> <p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes, for example, equals, greater
     * than, less than, and so on. <p>For <i>KeyConditions</i>, only the
     * following comparison operators are supported: <p> <code>EQ | LE | LT |
     * GE | GT | BEGINS_WITH | BETWEEN</code> <p>The following are
     * descriptions of these comparison operators. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
     * <p><code>LE</code> : Less than or equal. <p><i>AttributeValueList</i>
     * can contain only one <i>AttributeValue</i> element of type String,
     * Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one
     * specified in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set
     * type). If an item contains an <i>AttributeValue</i> element of a
     * different type than the one specified in the request, the value does
     * not match. For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code>. <p/> </li> <li>
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
     * "1"]}</code>. <p/> </li> <li> <p><code>BEGINS_WITH</code> : Checks for
     * a prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a set
     * type). The target attribute of the comparison must be of type String
     * or Binary (not a Number or a set type). <p/> </li> <li>
     * <p><code>BETWEEN</code> : Greater than or equal to the first value,
     * and less than or equal to the second value.
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
     * Guide</i>.
     * <p>
     * The method adds a new key-value pair into KeyConditions parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into KeyConditions.
     * @param value The corresponding value of the entry to be added into KeyConditions.
     */
    public QueryRequest addKeyConditionsEntry(String key, Condition value) {
        if (null == this.keyConditions) {
            this.keyConditions = new java.util.HashMap<String,Condition>();
        }
        if (this.keyConditions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.keyConditions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into KeyConditions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public QueryRequest clearKeyConditionsEntries() {
        this.keyConditions = null;
        return this;
    }
    
    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>FilterExpression</i> instead. Note that if you use
     * <i>QueryFilter</i> and <i>FilterExpression</i> at the same time,
     * DynamoDB will return a <i>ValidationException</i> exception. <p>This
     * parameter does not support lists or maps. </important> <p>A condition
     * that evaluates the query results and returns only the desired values.
     * <p>If you specify more than one condition in the <i>QueryFilter</i>
     * map, then by default all of the conditions must evaluate to true. In
     * other words, the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     * you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.) <note><p><i>QueryFilter</i> does not
     * allow key attrbutes. You cannot define a filter condition on a hash
     * key or range key.</note> <p>Each <i>QueryFilter</i> element consists
     * of an attribute name to compare, along with the following: <ul> <li>
     * <p><i>AttributeValueList</i> - One or more values to evaluate against
     * the supplied attribute. The number of values in the list depends on
     * the operator specified in <i>ComparisonOperator</i>. <p>For type
     * Number, value comparisons are numeric. <p>String value comparisons for
     * greater than, equals, or less than are based on ASCII character code
     * values. For example, <code>a</code> is greater than <code>A</code>,
     * and <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. <p>For information on specifying data types in
     * JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>. </li>
     * <li><p><i>ComparisonOperator</i> - A comparator for evaluating
     * attributes. For example, equals, greater than, less than, etc. <p>The
     * following comparison operators are available: <p><code>EQ | NE | LE |
     * LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH
     * | IN | BETWEEN</code> <p>For complete descriptions of all comparison
     * operators, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">API_Condition.html</a>.
     * </li> </ul>
     *
     * @return <important> <p>There is a newer parameter available. Use
     *         <i>FilterExpression</i> instead. Note that if you use
     *         <i>QueryFilter</i> and <i>FilterExpression</i> at the same time,
     *         DynamoDB will return a <i>ValidationException</i> exception. <p>This
     *         parameter does not support lists or maps. </important> <p>A condition
     *         that evaluates the query results and returns only the desired values.
     *         <p>If you specify more than one condition in the <i>QueryFilter</i>
     *         map, then by default all of the conditions must evaluate to true. In
     *         other words, the conditions are ANDed together. (You can use the
     *         <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     *         you do this, then at least one of the conditions must evaluate to
     *         true, rather than all of them.) <note><p><i>QueryFilter</i> does not
     *         allow key attrbutes. You cannot define a filter condition on a hash
     *         key or range key.</note> <p>Each <i>QueryFilter</i> element consists
     *         of an attribute name to compare, along with the following: <ul> <li>
     *         <p><i>AttributeValueList</i> - One or more values to evaluate against
     *         the supplied attribute. The number of values in the list depends on
     *         the operator specified in <i>ComparisonOperator</i>. <p>For type
     *         Number, value comparisons are numeric. <p>String value comparisons for
     *         greater than, equals, or less than are based on ASCII character code
     *         values. For example, <code>a</code> is greater than <code>A</code>,
     *         and <code>aa</code> is greater than <code>B</code>. For a list of code
     *         values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For type Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. <p>For information on specifying data types in
     *         JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>. </li>
     *         <li><p><i>ComparisonOperator</i> - A comparator for evaluating
     *         attributes. For example, equals, greater than, less than, etc. <p>The
     *         following comparison operators are available: <p><code>EQ | NE | LE |
     *         LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH
     *         | IN | BETWEEN</code> <p>For complete descriptions of all comparison
     *         operators, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">API_Condition.html</a>.
     *         </li> </ul>
     */
    public java.util.Map<String,Condition> getQueryFilter() {
        
        return queryFilter;
    }
    
    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>FilterExpression</i> instead. Note that if you use
     * <i>QueryFilter</i> and <i>FilterExpression</i> at the same time,
     * DynamoDB will return a <i>ValidationException</i> exception. <p>This
     * parameter does not support lists or maps. </important> <p>A condition
     * that evaluates the query results and returns only the desired values.
     * <p>If you specify more than one condition in the <i>QueryFilter</i>
     * map, then by default all of the conditions must evaluate to true. In
     * other words, the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     * you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.) <note><p><i>QueryFilter</i> does not
     * allow key attrbutes. You cannot define a filter condition on a hash
     * key or range key.</note> <p>Each <i>QueryFilter</i> element consists
     * of an attribute name to compare, along with the following: <ul> <li>
     * <p><i>AttributeValueList</i> - One or more values to evaluate against
     * the supplied attribute. The number of values in the list depends on
     * the operator specified in <i>ComparisonOperator</i>. <p>For type
     * Number, value comparisons are numeric. <p>String value comparisons for
     * greater than, equals, or less than are based on ASCII character code
     * values. For example, <code>a</code> is greater than <code>A</code>,
     * and <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. <p>For information on specifying data types in
     * JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>. </li>
     * <li><p><i>ComparisonOperator</i> - A comparator for evaluating
     * attributes. For example, equals, greater than, less than, etc. <p>The
     * following comparison operators are available: <p><code>EQ | NE | LE |
     * LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH
     * | IN | BETWEEN</code> <p>For complete descriptions of all comparison
     * operators, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">API_Condition.html</a>.
     * </li> </ul>
     *
     * @param queryFilter <important> <p>There is a newer parameter available. Use
     *         <i>FilterExpression</i> instead. Note that if you use
     *         <i>QueryFilter</i> and <i>FilterExpression</i> at the same time,
     *         DynamoDB will return a <i>ValidationException</i> exception. <p>This
     *         parameter does not support lists or maps. </important> <p>A condition
     *         that evaluates the query results and returns only the desired values.
     *         <p>If you specify more than one condition in the <i>QueryFilter</i>
     *         map, then by default all of the conditions must evaluate to true. In
     *         other words, the conditions are ANDed together. (You can use the
     *         <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     *         you do this, then at least one of the conditions must evaluate to
     *         true, rather than all of them.) <note><p><i>QueryFilter</i> does not
     *         allow key attrbutes. You cannot define a filter condition on a hash
     *         key or range key.</note> <p>Each <i>QueryFilter</i> element consists
     *         of an attribute name to compare, along with the following: <ul> <li>
     *         <p><i>AttributeValueList</i> - One or more values to evaluate against
     *         the supplied attribute. The number of values in the list depends on
     *         the operator specified in <i>ComparisonOperator</i>. <p>For type
     *         Number, value comparisons are numeric. <p>String value comparisons for
     *         greater than, equals, or less than are based on ASCII character code
     *         values. For example, <code>a</code> is greater than <code>A</code>,
     *         and <code>aa</code> is greater than <code>B</code>. For a list of code
     *         values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For type Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. <p>For information on specifying data types in
     *         JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>. </li>
     *         <li><p><i>ComparisonOperator</i> - A comparator for evaluating
     *         attributes. For example, equals, greater than, less than, etc. <p>The
     *         following comparison operators are available: <p><code>EQ | NE | LE |
     *         LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH
     *         | IN | BETWEEN</code> <p>For complete descriptions of all comparison
     *         operators, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">API_Condition.html</a>.
     *         </li> </ul>
     */
    public void setQueryFilter(java.util.Map<String,Condition> queryFilter) {
        this.queryFilter = queryFilter;
    }
    
    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>FilterExpression</i> instead. Note that if you use
     * <i>QueryFilter</i> and <i>FilterExpression</i> at the same time,
     * DynamoDB will return a <i>ValidationException</i> exception. <p>This
     * parameter does not support lists or maps. </important> <p>A condition
     * that evaluates the query results and returns only the desired values.
     * <p>If you specify more than one condition in the <i>QueryFilter</i>
     * map, then by default all of the conditions must evaluate to true. In
     * other words, the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     * you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.) <note><p><i>QueryFilter</i> does not
     * allow key attrbutes. You cannot define a filter condition on a hash
     * key or range key.</note> <p>Each <i>QueryFilter</i> element consists
     * of an attribute name to compare, along with the following: <ul> <li>
     * <p><i>AttributeValueList</i> - One or more values to evaluate against
     * the supplied attribute. The number of values in the list depends on
     * the operator specified in <i>ComparisonOperator</i>. <p>For type
     * Number, value comparisons are numeric. <p>String value comparisons for
     * greater than, equals, or less than are based on ASCII character code
     * values. For example, <code>a</code> is greater than <code>A</code>,
     * and <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. <p>For information on specifying data types in
     * JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>. </li>
     * <li><p><i>ComparisonOperator</i> - A comparator for evaluating
     * attributes. For example, equals, greater than, less than, etc. <p>The
     * following comparison operators are available: <p><code>EQ | NE | LE |
     * LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH
     * | IN | BETWEEN</code> <p>For complete descriptions of all comparison
     * operators, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">API_Condition.html</a>.
     * </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queryFilter <important> <p>There is a newer parameter available. Use
     *         <i>FilterExpression</i> instead. Note that if you use
     *         <i>QueryFilter</i> and <i>FilterExpression</i> at the same time,
     *         DynamoDB will return a <i>ValidationException</i> exception. <p>This
     *         parameter does not support lists or maps. </important> <p>A condition
     *         that evaluates the query results and returns only the desired values.
     *         <p>If you specify more than one condition in the <i>QueryFilter</i>
     *         map, then by default all of the conditions must evaluate to true. In
     *         other words, the conditions are ANDed together. (You can use the
     *         <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     *         you do this, then at least one of the conditions must evaluate to
     *         true, rather than all of them.) <note><p><i>QueryFilter</i> does not
     *         allow key attrbutes. You cannot define a filter condition on a hash
     *         key or range key.</note> <p>Each <i>QueryFilter</i> element consists
     *         of an attribute name to compare, along with the following: <ul> <li>
     *         <p><i>AttributeValueList</i> - One or more values to evaluate against
     *         the supplied attribute. The number of values in the list depends on
     *         the operator specified in <i>ComparisonOperator</i>. <p>For type
     *         Number, value comparisons are numeric. <p>String value comparisons for
     *         greater than, equals, or less than are based on ASCII character code
     *         values. For example, <code>a</code> is greater than <code>A</code>,
     *         and <code>aa</code> is greater than <code>B</code>. For a list of code
     *         values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For type Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. <p>For information on specifying data types in
     *         JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>. </li>
     *         <li><p><i>ComparisonOperator</i> - A comparator for evaluating
     *         attributes. For example, equals, greater than, less than, etc. <p>The
     *         following comparison operators are available: <p><code>EQ | NE | LE |
     *         LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH
     *         | IN | BETWEEN</code> <p>For complete descriptions of all comparison
     *         operators, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">API_Condition.html</a>.
     *         </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryRequest withQueryFilter(java.util.Map<String,Condition> queryFilter) {
        setQueryFilter(queryFilter);
        return this;
    }

    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>FilterExpression</i> instead. Note that if you use
     * <i>QueryFilter</i> and <i>FilterExpression</i> at the same time,
     * DynamoDB will return a <i>ValidationException</i> exception. <p>This
     * parameter does not support lists or maps. </important> <p>A condition
     * that evaluates the query results and returns only the desired values.
     * <p>If you specify more than one condition in the <i>QueryFilter</i>
     * map, then by default all of the conditions must evaluate to true. In
     * other words, the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If
     * you do this, then at least one of the conditions must evaluate to
     * true, rather than all of them.) <note><p><i>QueryFilter</i> does not
     * allow key attrbutes. You cannot define a filter condition on a hash
     * key or range key.</note> <p>Each <i>QueryFilter</i> element consists
     * of an attribute name to compare, along with the following: <ul> <li>
     * <p><i>AttributeValueList</i> - One or more values to evaluate against
     * the supplied attribute. The number of values in the list depends on
     * the operator specified in <i>ComparisonOperator</i>. <p>For type
     * Number, value comparisons are numeric. <p>String value comparisons for
     * greater than, equals, or less than are based on ASCII character code
     * values. For example, <code>a</code> is greater than <code>A</code>,
     * and <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. <p>For information on specifying data types in
     * JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>. </li>
     * <li><p><i>ComparisonOperator</i> - A comparator for evaluating
     * attributes. For example, equals, greater than, less than, etc. <p>The
     * following comparison operators are available: <p><code>EQ | NE | LE |
     * LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH
     * | IN | BETWEEN</code> <p>For complete descriptions of all comparison
     * operators, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">API_Condition.html</a>.
     * </li> </ul>
     * <p>
     * The method adds a new key-value pair into QueryFilter parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into QueryFilter.
     * @param value The corresponding value of the entry to be added into QueryFilter.
     */
    public QueryRequest addQueryFilterEntry(String key, Condition value) {
        if (null == this.queryFilter) {
            this.queryFilter = new java.util.HashMap<String,Condition>();
        }
        if (this.queryFilter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.queryFilter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into QueryFilter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public QueryRequest clearQueryFilterEntries() {
        this.queryFilter = null;
        return this;
    }
    
    /**
     * <important> <p>There is a newer parameter available. Use
     * <i>ConditionExpression</i> instead. Note that if you use
     * <i>ConditionalOperator</i> and <i> ConditionExpression </i> at the
     * same time, DynamoDB will return a <i>ValidationException</i>
     * exception. <p>This parameter does not support lists or maps.
     * </important> <p>A logical operator to apply to the conditions in the
     * <i>QueryFilter</i> map: <ul> <li><p><code>AND</code> - If all of the
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
     *         <i>QueryFilter</i> map: <ul> <li><p><code>AND</code> - If all of the
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
     * <i>QueryFilter</i> map: <ul> <li><p><code>AND</code> - If all of the
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
     *         <i>QueryFilter</i> map: <ul> <li><p><code>AND</code> - If all of the
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
     * <i>QueryFilter</i> map: <ul> <li><p><code>AND</code> - If all of the
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
     *         <i>QueryFilter</i> map: <ul> <li><p><code>AND</code> - If all of the
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
    public QueryRequest withConditionalOperator(String conditionalOperator) {
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
     * <i>QueryFilter</i> map: <ul> <li><p><code>AND</code> - If all of the
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
     *         <i>QueryFilter</i> map: <ul> <li><p><code>AND</code> - If all of the
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
     * <i>QueryFilter</i> map: <ul> <li><p><code>AND</code> - If all of the
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
     *         <i>QueryFilter</i> map: <ul> <li><p><code>AND</code> - If all of the
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
    public QueryRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
        return this;
    }

    /**
     * A value that specifies ascending (true) or descending (false)
     * traversal of the index. DynamoDB returns results reflecting the
     * requested order determined by the range key. If the data type is
     * Number, the results are returned in numeric order. For type String,
     * the results are returned in order of ASCII character code values. For
     * type Binary, DynamoDB treats each byte of the binary data as unsigned
     * when it compares binary values. <p>If <i>ScanIndexForward</i> is not
     * specified, the results are returned in ascending order.
     *
     * @return A value that specifies ascending (true) or descending (false)
     *         traversal of the index. DynamoDB returns results reflecting the
     *         requested order determined by the range key. If the data type is
     *         Number, the results are returned in numeric order. For type String,
     *         the results are returned in order of ASCII character code values. For
     *         type Binary, DynamoDB treats each byte of the binary data as unsigned
     *         when it compares binary values. <p>If <i>ScanIndexForward</i> is not
     *         specified, the results are returned in ascending order.
     */
    public Boolean isScanIndexForward() {
        return scanIndexForward;
    }
    
    /**
     * A value that specifies ascending (true) or descending (false)
     * traversal of the index. DynamoDB returns results reflecting the
     * requested order determined by the range key. If the data type is
     * Number, the results are returned in numeric order. For type String,
     * the results are returned in order of ASCII character code values. For
     * type Binary, DynamoDB treats each byte of the binary data as unsigned
     * when it compares binary values. <p>If <i>ScanIndexForward</i> is not
     * specified, the results are returned in ascending order.
     *
     * @param scanIndexForward A value that specifies ascending (true) or descending (false)
     *         traversal of the index. DynamoDB returns results reflecting the
     *         requested order determined by the range key. If the data type is
     *         Number, the results are returned in numeric order. For type String,
     *         the results are returned in order of ASCII character code values. For
     *         type Binary, DynamoDB treats each byte of the binary data as unsigned
     *         when it compares binary values. <p>If <i>ScanIndexForward</i> is not
     *         specified, the results are returned in ascending order.
     */
    public void setScanIndexForward(Boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
    }
    
    /**
     * A value that specifies ascending (true) or descending (false)
     * traversal of the index. DynamoDB returns results reflecting the
     * requested order determined by the range key. If the data type is
     * Number, the results are returned in numeric order. For type String,
     * the results are returned in order of ASCII character code values. For
     * type Binary, DynamoDB treats each byte of the binary data as unsigned
     * when it compares binary values. <p>If <i>ScanIndexForward</i> is not
     * specified, the results are returned in ascending order.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scanIndexForward A value that specifies ascending (true) or descending (false)
     *         traversal of the index. DynamoDB returns results reflecting the
     *         requested order determined by the range key. If the data type is
     *         Number, the results are returned in numeric order. For type String,
     *         the results are returned in order of ASCII character code values. For
     *         type Binary, DynamoDB treats each byte of the binary data as unsigned
     *         when it compares binary values. <p>If <i>ScanIndexForward</i> is not
     *         specified, the results are returned in ascending order.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryRequest withScanIndexForward(Boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
        return this;
    }

    /**
     * A value that specifies ascending (true) or descending (false)
     * traversal of the index. DynamoDB returns results reflecting the
     * requested order determined by the range key. If the data type is
     * Number, the results are returned in numeric order. For type String,
     * the results are returned in order of ASCII character code values. For
     * type Binary, DynamoDB treats each byte of the binary data as unsigned
     * when it compares binary values. <p>If <i>ScanIndexForward</i> is not
     * specified, the results are returned in ascending order.
     *
     * @return A value that specifies ascending (true) or descending (false)
     *         traversal of the index. DynamoDB returns results reflecting the
     *         requested order determined by the range key. If the data type is
     *         Number, the results are returned in numeric order. For type String,
     *         the results are returned in order of ASCII character code values. For
     *         type Binary, DynamoDB treats each byte of the binary data as unsigned
     *         when it compares binary values. <p>If <i>ScanIndexForward</i> is not
     *         specified, the results are returned in ascending order.
     */
    public Boolean getScanIndexForward() {
        return scanIndexForward;
    }

    /**
     * The primary key of the first item that this operation will evaluate.
     * Use the value that was returned for <i>LastEvaluatedKey</i> in the
     * previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     * be String, Number or Binary. No set data types are allowed.
     *
     * @return The primary key of the first item that this operation will evaluate.
     *         Use the value that was returned for <i>LastEvaluatedKey</i> in the
     *         previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     *         be String, Number or Binary. No set data types are allowed.
     */
    public java.util.Map<String,AttributeValue> getExclusiveStartKey() {
        
        return exclusiveStartKey;
    }
    
    /**
     * The primary key of the first item that this operation will evaluate.
     * Use the value that was returned for <i>LastEvaluatedKey</i> in the
     * previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     * be String, Number or Binary. No set data types are allowed.
     *
     * @param exclusiveStartKey The primary key of the first item that this operation will evaluate.
     *         Use the value that was returned for <i>LastEvaluatedKey</i> in the
     *         previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     *         be String, Number or Binary. No set data types are allowed.
     */
    public void setExclusiveStartKey(java.util.Map<String,AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }
    
    /**
     * The primary key of the first item that this operation will evaluate.
     * Use the value that was returned for <i>LastEvaluatedKey</i> in the
     * previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     * be String, Number or Binary. No set data types are allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exclusiveStartKey The primary key of the first item that this operation will evaluate.
     *         Use the value that was returned for <i>LastEvaluatedKey</i> in the
     *         previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     *         be String, Number or Binary. No set data types are allowed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryRequest withExclusiveStartKey(java.util.Map<String,AttributeValue> exclusiveStartKey) {
        setExclusiveStartKey(exclusiveStartKey);
        return this;
    }

    /**
     * The primary key of the first item that this operation will evaluate.
     * Use the value that was returned for <i>LastEvaluatedKey</i> in the
     * previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     * be String, Number or Binary. No set data types are allowed.
     * <p>
     * This method accepts the hashKey, rangeKey of ExclusiveStartKey as
     * java.util.Map.Entry<String, AttributeValue> objects.
     *
     * @param hashKey Primary hash key.
     * @param rangeKey Primary range key. (null if it a hash-only table)
     */
    public void setExclusiveStartKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey) throws IllegalArgumentException {
        java.util.HashMap<String,AttributeValue> exclusiveStartKey = new java.util.HashMap<String,AttributeValue>();
        
        if (hashKey != null) {
            exclusiveStartKey.put(hashKey.getKey(), hashKey.getValue());
        } else
            throw new IllegalArgumentException("hashKey must be non-null object.");
        if (rangeKey != null) {
            exclusiveStartKey.put(rangeKey.getKey(), rangeKey.getValue());
        } 
        setExclusiveStartKey(exclusiveStartKey);
    }
    
    /**
     * The primary key of the first item that this operation will evaluate.
     * Use the value that was returned for <i>LastEvaluatedKey</i> in the
     * previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     * be String, Number or Binary. No set data types are allowed.
     * <p>
     * This method accepts the hashKey, rangeKey of ExclusiveStartKey as
     * java.util.Map.Entry<String, AttributeValue> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hashKey Primary hash key.
     * @param rangeKey Primary range key. (null if it a hash-only table)
     */
    public QueryRequest withExclusiveStartKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey) throws IllegalArgumentException {
        setExclusiveStartKey(hashKey, rangeKey);
        return this;
    }

    /**
     * The primary key of the first item that this operation will evaluate.
     * Use the value that was returned for <i>LastEvaluatedKey</i> in the
     * previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     * be String, Number or Binary. No set data types are allowed.
     * <p>
     * The method adds a new key-value pair into ExclusiveStartKey parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into ExclusiveStartKey.
     * @param value The corresponding value of the entry to be added into ExclusiveStartKey.
     */
    public QueryRequest addExclusiveStartKeyEntry(String key, AttributeValue value) {
        if (null == this.exclusiveStartKey) {
            this.exclusiveStartKey = new java.util.HashMap<String,AttributeValue>();
        }
        if (this.exclusiveStartKey.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.exclusiveStartKey.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExclusiveStartKey.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public QueryRequest clearExclusiveStartKeyEntries() {
        this.exclusiveStartKey = null;
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
    public QueryRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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
    public QueryRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    /**
     * One or more attributes to retrieve from the table. These attributes
     * can include scalars, sets, or elements of a JSON document. The
     * attributes in the expression must be separated by commas. <p>If no
     * attribute names are specified, then all attributes will be returned.
     * If any of the requested attributes are not found, they will not appear
     * in the result.
     *
     * @return One or more attributes to retrieve from the table. These attributes
     *         can include scalars, sets, or elements of a JSON document. The
     *         attributes in the expression must be separated by commas. <p>If no
     *         attribute names are specified, then all attributes will be returned.
     *         If any of the requested attributes are not found, they will not appear
     *         in the result.
     */
    public String getProjectionExpression() {
        return projectionExpression;
    }
    
    /**
     * One or more attributes to retrieve from the table. These attributes
     * can include scalars, sets, or elements of a JSON document. The
     * attributes in the expression must be separated by commas. <p>If no
     * attribute names are specified, then all attributes will be returned.
     * If any of the requested attributes are not found, they will not appear
     * in the result.
     *
     * @param projectionExpression One or more attributes to retrieve from the table. These attributes
     *         can include scalars, sets, or elements of a JSON document. The
     *         attributes in the expression must be separated by commas. <p>If no
     *         attribute names are specified, then all attributes will be returned.
     *         If any of the requested attributes are not found, they will not appear
     *         in the result.
     */
    public void setProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
    }
    
    /**
     * One or more attributes to retrieve from the table. These attributes
     * can include scalars, sets, or elements of a JSON document. The
     * attributes in the expression must be separated by commas. <p>If no
     * attribute names are specified, then all attributes will be returned.
     * If any of the requested attributes are not found, they will not appear
     * in the result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param projectionExpression One or more attributes to retrieve from the table. These attributes
     *         can include scalars, sets, or elements of a JSON document. The
     *         attributes in the expression must be separated by commas. <p>If no
     *         attribute names are specified, then all attributes will be returned.
     *         If any of the requested attributes are not found, they will not appear
     *         in the result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryRequest withProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
        return this;
    }

    /**
     * A condition that evaluates the query results and returns only the
     * desired values. <p>The condition you specify is applied to the items
     * queried; any items that do not match the expression are not returned.
     *
     * @return A condition that evaluates the query results and returns only the
     *         desired values. <p>The condition you specify is applied to the items
     *         queried; any items that do not match the expression are not returned.
     */
    public String getFilterExpression() {
        return filterExpression;
    }
    
    /**
     * A condition that evaluates the query results and returns only the
     * desired values. <p>The condition you specify is applied to the items
     * queried; any items that do not match the expression are not returned.
     *
     * @param filterExpression A condition that evaluates the query results and returns only the
     *         desired values. <p>The condition you specify is applied to the items
     *         queried; any items that do not match the expression are not returned.
     */
    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }
    
    /**
     * A condition that evaluates the query results and returns only the
     * desired values. <p>The condition you specify is applied to the items
     * queried; any items that do not match the expression are not returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filterExpression A condition that evaluates the query results and returns only the
     *         desired values. <p>The condition you specify is applied to the items
     *         queried; any items that do not match the expression are not returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryRequest withFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
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
    public QueryRequest withExpressionAttributeNames(java.util.Map<String,String> expressionAttributeNames) {
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
    public QueryRequest addExpressionAttributeNamesEntry(String key, String value) {
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
    public QueryRequest clearExpressionAttributeNamesEntries() {
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
    public QueryRequest withExpressionAttributeValues(java.util.Map<String,AttributeValue> expressionAttributeValues) {
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
    public QueryRequest addExpressionAttributeValuesEntry(String key, AttributeValue value) {
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
    public QueryRequest clearExpressionAttributeValuesEntries() {
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
        if (getIndexName() != null) sb.append("IndexName: " + getIndexName() + ",");
        if (getSelect() != null) sb.append("Select: " + getSelect() + ",");
        if (getAttributesToGet() != null) sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (isConsistentRead() != null) sb.append("ConsistentRead: " + isConsistentRead() + ",");
        if (getKeyConditions() != null) sb.append("KeyConditions: " + getKeyConditions() + ",");
        if (getQueryFilter() != null) sb.append("QueryFilter: " + getQueryFilter() + ",");
        if (getConditionalOperator() != null) sb.append("ConditionalOperator: " + getConditionalOperator() + ",");
        if (isScanIndexForward() != null) sb.append("ScanIndexForward: " + isScanIndexForward() + ",");
        if (getExclusiveStartKey() != null) sb.append("ExclusiveStartKey: " + getExclusiveStartKey() + ",");
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getProjectionExpression() != null) sb.append("ProjectionExpression: " + getProjectionExpression() + ",");
        if (getFilterExpression() != null) sb.append("FilterExpression: " + getFilterExpression() + ",");
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
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode()); 
        hashCode = prime * hashCode + ((getSelect() == null) ? 0 : getSelect().hashCode()); 
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((isConsistentRead() == null) ? 0 : isConsistentRead().hashCode()); 
        hashCode = prime * hashCode + ((getKeyConditions() == null) ? 0 : getKeyConditions().hashCode()); 
        hashCode = prime * hashCode + ((getQueryFilter() == null) ? 0 : getQueryFilter().hashCode()); 
        hashCode = prime * hashCode + ((getConditionalOperator() == null) ? 0 : getConditionalOperator().hashCode()); 
        hashCode = prime * hashCode + ((isScanIndexForward() == null) ? 0 : isScanIndexForward().hashCode()); 
        hashCode = prime * hashCode + ((getExclusiveStartKey() == null) ? 0 : getExclusiveStartKey().hashCode()); 
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode()); 
        hashCode = prime * hashCode + ((getProjectionExpression() == null) ? 0 : getProjectionExpression().hashCode()); 
        hashCode = prime * hashCode + ((getFilterExpression() == null) ? 0 : getFilterExpression().hashCode()); 
        hashCode = prime * hashCode + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames().hashCode()); 
        hashCode = prime * hashCode + ((getExpressionAttributeValues() == null) ? 0 : getExpressionAttributeValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof QueryRequest == false) return false;
        QueryRequest other = (QueryRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getIndexName() == null ^ this.getIndexName() == null) return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false) return false; 
        if (other.getSelect() == null ^ this.getSelect() == null) return false;
        if (other.getSelect() != null && other.getSelect().equals(this.getSelect()) == false) return false; 
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null) return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.isConsistentRead() == null ^ this.isConsistentRead() == null) return false;
        if (other.isConsistentRead() != null && other.isConsistentRead().equals(this.isConsistentRead()) == false) return false; 
        if (other.getKeyConditions() == null ^ this.getKeyConditions() == null) return false;
        if (other.getKeyConditions() != null && other.getKeyConditions().equals(this.getKeyConditions()) == false) return false; 
        if (other.getQueryFilter() == null ^ this.getQueryFilter() == null) return false;
        if (other.getQueryFilter() != null && other.getQueryFilter().equals(this.getQueryFilter()) == false) return false; 
        if (other.getConditionalOperator() == null ^ this.getConditionalOperator() == null) return false;
        if (other.getConditionalOperator() != null && other.getConditionalOperator().equals(this.getConditionalOperator()) == false) return false; 
        if (other.isScanIndexForward() == null ^ this.isScanIndexForward() == null) return false;
        if (other.isScanIndexForward() != null && other.isScanIndexForward().equals(this.isScanIndexForward()) == false) return false; 
        if (other.getExclusiveStartKey() == null ^ this.getExclusiveStartKey() == null) return false;
        if (other.getExclusiveStartKey() != null && other.getExclusiveStartKey().equals(this.getExclusiveStartKey()) == false) return false; 
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null) return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false) return false; 
        if (other.getProjectionExpression() == null ^ this.getProjectionExpression() == null) return false;
        if (other.getProjectionExpression() != null && other.getProjectionExpression().equals(this.getProjectionExpression()) == false) return false; 
        if (other.getFilterExpression() == null ^ this.getFilterExpression() == null) return false;
        if (other.getFilterExpression() != null && other.getFilterExpression().equals(this.getFilterExpression()) == false) return false; 
        if (other.getExpressionAttributeNames() == null ^ this.getExpressionAttributeNames() == null) return false;
        if (other.getExpressionAttributeNames() != null && other.getExpressionAttributeNames().equals(this.getExpressionAttributeNames()) == false) return false; 
        if (other.getExpressionAttributeValues() == null ^ this.getExpressionAttributeValues() == null) return false;
        if (other.getExpressionAttributeValues() != null && other.getExpressionAttributeValues().equals(this.getExpressionAttributeValues()) == false) return false; 
        return true;
    }
    
}
    