/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A <i>Query</i> operation directly accesses items from a table using the table primary key, or from an index using the index key. You must provide a
 * specific hash key value. You can narrow the scope of the query by using comparison operators on the range key value, or on the index key. You can use
 * the <i>ScanIndexForward</i> parameter to get results in forward or reverse order, by range key or by index key.
 * </p>
 * <p>
 * Queries that do not return results consume the minimum read capacity units according to the type of read.
 * </p>
 * <p>
 * If the total number of items meeting the query criteria exceeds the result set size limit of 1 MB, the query stops and results are returned to the
 * user with a <i>LastEvaluatedKey</i> to continue the query in a subsequent operation. Unlike a <i>Scan</i> operation, a <i>Query</i> operation never
 * returns an empty result set <i>and</i> a
 * <i>LastEvaluatedKey</i> . The <i>LastEvaluatedKey</i> is only provided if the results exceed 1 MB, or if you have used
 * <i>Limit</i> .
 * </p>
 * <p>
 * To request a strongly consistent result, set <i>ConsistentRead</i> to true.
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
     * The name of an index on the table to query.
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
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     * the item attributes. For a table, this is the default. For an index,
     * this mode causes Amazon DynamoDB to fetch the full item from the table
     * for each matching item in the index. If the index is configured to
     * project all item attributes, the matching items will not be fetched
     * from the table. Fetching items from the table incurs additional
     * throughput cost and latency. </li> <li>
     * <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Allowed only when querying
     * an index. Retrieves all attributes which have been projected into the
     * index. If the index is configured to project all attributes, this is
     * equivalent to specifying <i>ALL_ATTRIBUTES</i>. </li> <li>
     * <p><code>COUNT</code>: Returns the number of matching items, rather
     * than the matching items themselves. </li> <li> <p>
     * <code>SPECIFIC_ATTRIBUTES</code> : Returns only the attributes listed
     * in <i>AttributesToGet</i>. This is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * <p>If you are querying an index and request only attributes that are
     * projected into that index, the operation will read only the index and
     * not the table. If any of the requested attributes are not projected
     * into the index, Amazon DynamoDB will need to fetch each matching item
     * from the table. This extra fetching incurs additional throughput cost
     * and latency. </li> </ul> <p>When neither <i>Select</i> nor
     * <i>AttributesToGet</i> are specified, Amazon DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code> when accessing a table, and
     * <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     */
    private String select;

    /**
     * The names of one or more attributes to retrieve. If no attribute names
     * are specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>If you are querying an index and request only attributes
     * that are projected into that index, the operation will read only the
     * index and not the table. If any of the requested attributes are not
     * projected into the index, Amazon DynamoDB will need to fetch each
     * matching item from the table. This extra fetching incurs additional
     * throughput cost and latency. <p>You cannot use both
     * <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     * request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGet;

    /**
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If Amazon DynamoDB processes the number of items up
     * to the limit while processing the results, it stops the operation and
     * returns the matching values up to that point, and a
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set
     * size exceeds 1 MB before Amazon DynamoDB reaches this limit, it stops
     * the operation and returns the matching values up to the limit, and a
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     * the operation. For more information see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query
     * and Scan</a> in the Amazon DynamoDB Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer limit;

    /**
     * If set to <code>true</code>, then the operation uses strongly
     * consistent reads; otherwise, eventually consistent reads are used.
     */
    private Boolean consistentRead;

    /**
     * The selection criteria for the query. <p>For a query on a table, you
     * can only have conditions on the table primary key attributes. You must
     * specify the hash key attribute name and value as an <code>EQ</code>
     * condition. You can optionally specify a second condition, referring to
     * the range key attribute. <p>For a query on a secondary index, you can
     * only have conditions on the index key attributes. You must specify the
     * index hash attribute name and value as an EQ condition. You can
     * optionally specify a second condition, referring to the index key
     * range attribute. <p>Multiple conditions are evaluated using "AND"; in
     * other words, all of the conditions must be met in order for an item to
     * appear in the results results. <p>Each <i>KeyConditions</i> element
     * consists of an attribute name to compare, along with the following:
     * <ul> <li><p><i>AttributeValueList</i> - One or more values to evaluate
     * against the supplied attribute. This list contains exactly one value,
     * except for a <code>BETWEEN</code> or <code>IN</code> comparison, in
     * which case the list contains two values. <note> <p>For type Number,
     * value comparisons are numeric. <p>String value comparisons for greater
     * than, equals, or less than are based on ASCII character code values.
     * For example, <code>a</code> is greater than <code>A</code>, and
     * <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, Amazon DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </note> </li> <li><p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>Valid comparison operators for Query:
     * <p><code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code> <p>For
     * information on specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set). If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>LE</code>
     * : Less than or equal. <p><i>AttributeValueList</i> can contain only
     * one <i>AttributeValue</i> of type String, Number, or Binary (not a
     * set). If an item contains an <i>AttributeValue</i> of a different type
     * than the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>GE</code> : Greater than or
     * equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>BEGINS_WITH</code> : checks
     * for a prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p> </li> <li> <p><code>BETWEEN</code>
     * : Greater than or equal to the first value, and less than or equal to
     * the second value. <p><i>AttributeValueList</i> must contain two
     * <i>AttributeValue</i> elements of the same type, either String,
     * Number, or Binary (not a set). A target attribute matches if the
     * target value is greater than, or equal to, the first element and less
     * than, or equal to, the second element. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code> </li> </ul></li> </ul>
     */
    private java.util.Map<String,Condition> keyConditions;

    /**
     * Specifies ascending (true) or descending (false) traversal of the
     * index. Amazon DynamoDB returns results reflecting the requested order
     * determined by the range key. If the data type is Number, the results
     * are returned in numeric order. For String, the results are returned in
     * order of ASCII character code values. For Binary, Amazon DynamoDB
     * treats each byte of the binary data as unsigned when it compares
     * binary values. <p>If <i>ScanIndexForward</i> is not specified, the
     * results are returned in ascending order.
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
     * If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     * the response; if set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     */
    private String returnConsumedCapacity;

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
     * The name of an index on the table to query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of an index on the table to query.
     */
    public String getIndexName() {
        return indexName;
    }
    
    /**
     * The name of an index on the table to query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName The name of an index on the table to query.
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
    
    /**
     * The name of an index on the table to query.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName The name of an index on the table to query.
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
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     * the item attributes. For a table, this is the default. For an index,
     * this mode causes Amazon DynamoDB to fetch the full item from the table
     * for each matching item in the index. If the index is configured to
     * project all item attributes, the matching items will not be fetched
     * from the table. Fetching items from the table incurs additional
     * throughput cost and latency. </li> <li>
     * <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Allowed only when querying
     * an index. Retrieves all attributes which have been projected into the
     * index. If the index is configured to project all attributes, this is
     * equivalent to specifying <i>ALL_ATTRIBUTES</i>. </li> <li>
     * <p><code>COUNT</code>: Returns the number of matching items, rather
     * than the matching items themselves. </li> <li> <p>
     * <code>SPECIFIC_ATTRIBUTES</code> : Returns only the attributes listed
     * in <i>AttributesToGet</i>. This is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * <p>If you are querying an index and request only attributes that are
     * projected into that index, the operation will read only the index and
     * not the table. If any of the requested attributes are not projected
     * into the index, Amazon DynamoDB will need to fetch each matching item
     * from the table. This extra fetching incurs additional throughput cost
     * and latency. </li> </ul> <p>When neither <i>Select</i> nor
     * <i>AttributesToGet</i> are specified, Amazon DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code> when accessing a table, and
     * <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @return The attributes to be returned in the result. You can retrieve all item
     *         attributes, specific item attributes, the count of matching items, or
     *         in the case of an index, some or all of the attributes projected into
     *         the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     *         the item attributes. For a table, this is the default. For an index,
     *         this mode causes Amazon DynamoDB to fetch the full item from the table
     *         for each matching item in the index. If the index is configured to
     *         project all item attributes, the matching items will not be fetched
     *         from the table. Fetching items from the table incurs additional
     *         throughput cost and latency. </li> <li>
     *         <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Allowed only when querying
     *         an index. Retrieves all attributes which have been projected into the
     *         index. If the index is configured to project all attributes, this is
     *         equivalent to specifying <i>ALL_ATTRIBUTES</i>. </li> <li>
     *         <p><code>COUNT</code>: Returns the number of matching items, rather
     *         than the matching items themselves. </li> <li> <p>
     *         <code>SPECIFIC_ATTRIBUTES</code> : Returns only the attributes listed
     *         in <i>AttributesToGet</i>. This is equivalent to specifying
     *         <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     *         <p>If you are querying an index and request only attributes that are
     *         projected into that index, the operation will read only the index and
     *         not the table. If any of the requested attributes are not projected
     *         into the index, Amazon DynamoDB will need to fetch each matching item
     *         from the table. This extra fetching incurs additional throughput cost
     *         and latency. </li> </ul> <p>When neither <i>Select</i> nor
     *         <i>AttributesToGet</i> are specified, Amazon DynamoDB defaults to
     *         <code>ALL_ATTRIBUTES</code> when accessing a table, and
     *         <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     *         cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     *         single request, <i>unless</i> the value for <i>Select</i> is
     *         <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *         specifying <i>AttributesToGet</i> without any value for
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
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     * the item attributes. For a table, this is the default. For an index,
     * this mode causes Amazon DynamoDB to fetch the full item from the table
     * for each matching item in the index. If the index is configured to
     * project all item attributes, the matching items will not be fetched
     * from the table. Fetching items from the table incurs additional
     * throughput cost and latency. </li> <li>
     * <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Allowed only when querying
     * an index. Retrieves all attributes which have been projected into the
     * index. If the index is configured to project all attributes, this is
     * equivalent to specifying <i>ALL_ATTRIBUTES</i>. </li> <li>
     * <p><code>COUNT</code>: Returns the number of matching items, rather
     * than the matching items themselves. </li> <li> <p>
     * <code>SPECIFIC_ATTRIBUTES</code> : Returns only the attributes listed
     * in <i>AttributesToGet</i>. This is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * <p>If you are querying an index and request only attributes that are
     * projected into that index, the operation will read only the index and
     * not the table. If any of the requested attributes are not projected
     * into the index, Amazon DynamoDB will need to fetch each matching item
     * from the table. This extra fetching incurs additional throughput cost
     * and latency. </li> </ul> <p>When neither <i>Select</i> nor
     * <i>AttributesToGet</i> are specified, Amazon DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code> when accessing a table, and
     * <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select The attributes to be returned in the result. You can retrieve all item
     *         attributes, specific item attributes, the count of matching items, or
     *         in the case of an index, some or all of the attributes projected into
     *         the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     *         the item attributes. For a table, this is the default. For an index,
     *         this mode causes Amazon DynamoDB to fetch the full item from the table
     *         for each matching item in the index. If the index is configured to
     *         project all item attributes, the matching items will not be fetched
     *         from the table. Fetching items from the table incurs additional
     *         throughput cost and latency. </li> <li>
     *         <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Allowed only when querying
     *         an index. Retrieves all attributes which have been projected into the
     *         index. If the index is configured to project all attributes, this is
     *         equivalent to specifying <i>ALL_ATTRIBUTES</i>. </li> <li>
     *         <p><code>COUNT</code>: Returns the number of matching items, rather
     *         than the matching items themselves. </li> <li> <p>
     *         <code>SPECIFIC_ATTRIBUTES</code> : Returns only the attributes listed
     *         in <i>AttributesToGet</i>. This is equivalent to specifying
     *         <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     *         <p>If you are querying an index and request only attributes that are
     *         projected into that index, the operation will read only the index and
     *         not the table. If any of the requested attributes are not projected
     *         into the index, Amazon DynamoDB will need to fetch each matching item
     *         from the table. This extra fetching incurs additional throughput cost
     *         and latency. </li> </ul> <p>When neither <i>Select</i> nor
     *         <i>AttributesToGet</i> are specified, Amazon DynamoDB defaults to
     *         <code>ALL_ATTRIBUTES</code> when accessing a table, and
     *         <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     *         cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     *         single request, <i>unless</i> the value for <i>Select</i> is
     *         <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *         specifying <i>AttributesToGet</i> without any value for
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
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     * the item attributes. For a table, this is the default. For an index,
     * this mode causes Amazon DynamoDB to fetch the full item from the table
     * for each matching item in the index. If the index is configured to
     * project all item attributes, the matching items will not be fetched
     * from the table. Fetching items from the table incurs additional
     * throughput cost and latency. </li> <li>
     * <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Allowed only when querying
     * an index. Retrieves all attributes which have been projected into the
     * index. If the index is configured to project all attributes, this is
     * equivalent to specifying <i>ALL_ATTRIBUTES</i>. </li> <li>
     * <p><code>COUNT</code>: Returns the number of matching items, rather
     * than the matching items themselves. </li> <li> <p>
     * <code>SPECIFIC_ATTRIBUTES</code> : Returns only the attributes listed
     * in <i>AttributesToGet</i>. This is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * <p>If you are querying an index and request only attributes that are
     * projected into that index, the operation will read only the index and
     * not the table. If any of the requested attributes are not projected
     * into the index, Amazon DynamoDB will need to fetch each matching item
     * from the table. This extra fetching incurs additional throughput cost
     * and latency. </li> </ul> <p>When neither <i>Select</i> nor
     * <i>AttributesToGet</i> are specified, Amazon DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code> when accessing a table, and
     * <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
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
     *         the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     *         the item attributes. For a table, this is the default. For an index,
     *         this mode causes Amazon DynamoDB to fetch the full item from the table
     *         for each matching item in the index. If the index is configured to
     *         project all item attributes, the matching items will not be fetched
     *         from the table. Fetching items from the table incurs additional
     *         throughput cost and latency. </li> <li>
     *         <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Allowed only when querying
     *         an index. Retrieves all attributes which have been projected into the
     *         index. If the index is configured to project all attributes, this is
     *         equivalent to specifying <i>ALL_ATTRIBUTES</i>. </li> <li>
     *         <p><code>COUNT</code>: Returns the number of matching items, rather
     *         than the matching items themselves. </li> <li> <p>
     *         <code>SPECIFIC_ATTRIBUTES</code> : Returns only the attributes listed
     *         in <i>AttributesToGet</i>. This is equivalent to specifying
     *         <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     *         <p>If you are querying an index and request only attributes that are
     *         projected into that index, the operation will read only the index and
     *         not the table. If any of the requested attributes are not projected
     *         into the index, Amazon DynamoDB will need to fetch each matching item
     *         from the table. This extra fetching incurs additional throughput cost
     *         and latency. </li> </ul> <p>When neither <i>Select</i> nor
     *         <i>AttributesToGet</i> are specified, Amazon DynamoDB defaults to
     *         <code>ALL_ATTRIBUTES</code> when accessing a table, and
     *         <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     *         cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     *         single request, <i>unless</i> the value for <i>Select</i> is
     *         <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *         specifying <i>AttributesToGet</i> without any value for
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
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     * the item attributes. For a table, this is the default. For an index,
     * this mode causes Amazon DynamoDB to fetch the full item from the table
     * for each matching item in the index. If the index is configured to
     * project all item attributes, the matching items will not be fetched
     * from the table. Fetching items from the table incurs additional
     * throughput cost and latency. </li> <li>
     * <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Allowed only when querying
     * an index. Retrieves all attributes which have been projected into the
     * index. If the index is configured to project all attributes, this is
     * equivalent to specifying <i>ALL_ATTRIBUTES</i>. </li> <li>
     * <p><code>COUNT</code>: Returns the number of matching items, rather
     * than the matching items themselves. </li> <li> <p>
     * <code>SPECIFIC_ATTRIBUTES</code> : Returns only the attributes listed
     * in <i>AttributesToGet</i>. This is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * <p>If you are querying an index and request only attributes that are
     * projected into that index, the operation will read only the index and
     * not the table. If any of the requested attributes are not projected
     * into the index, Amazon DynamoDB will need to fetch each matching item
     * from the table. This extra fetching incurs additional throughput cost
     * and latency. </li> </ul> <p>When neither <i>Select</i> nor
     * <i>AttributesToGet</i> are specified, Amazon DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code> when accessing a table, and
     * <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select The attributes to be returned in the result. You can retrieve all item
     *         attributes, specific item attributes, the count of matching items, or
     *         in the case of an index, some or all of the attributes projected into
     *         the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     *         the item attributes. For a table, this is the default. For an index,
     *         this mode causes Amazon DynamoDB to fetch the full item from the table
     *         for each matching item in the index. If the index is configured to
     *         project all item attributes, the matching items will not be fetched
     *         from the table. Fetching items from the table incurs additional
     *         throughput cost and latency. </li> <li>
     *         <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Allowed only when querying
     *         an index. Retrieves all attributes which have been projected into the
     *         index. If the index is configured to project all attributes, this is
     *         equivalent to specifying <i>ALL_ATTRIBUTES</i>. </li> <li>
     *         <p><code>COUNT</code>: Returns the number of matching items, rather
     *         than the matching items themselves. </li> <li> <p>
     *         <code>SPECIFIC_ATTRIBUTES</code> : Returns only the attributes listed
     *         in <i>AttributesToGet</i>. This is equivalent to specifying
     *         <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     *         <p>If you are querying an index and request only attributes that are
     *         projected into that index, the operation will read only the index and
     *         not the table. If any of the requested attributes are not projected
     *         into the index, Amazon DynamoDB will need to fetch each matching item
     *         from the table. This extra fetching incurs additional throughput cost
     *         and latency. </li> </ul> <p>When neither <i>Select</i> nor
     *         <i>AttributesToGet</i> are specified, Amazon DynamoDB defaults to
     *         <code>ALL_ATTRIBUTES</code> when accessing a table, and
     *         <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     *         cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     *         single request, <i>unless</i> the value for <i>Select</i> is
     *         <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *         specifying <i>AttributesToGet</i> without any value for
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
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     * the item attributes. For a table, this is the default. For an index,
     * this mode causes Amazon DynamoDB to fetch the full item from the table
     * for each matching item in the index. If the index is configured to
     * project all item attributes, the matching items will not be fetched
     * from the table. Fetching items from the table incurs additional
     * throughput cost and latency. </li> <li>
     * <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Allowed only when querying
     * an index. Retrieves all attributes which have been projected into the
     * index. If the index is configured to project all attributes, this is
     * equivalent to specifying <i>ALL_ATTRIBUTES</i>. </li> <li>
     * <p><code>COUNT</code>: Returns the number of matching items, rather
     * than the matching items themselves. </li> <li> <p>
     * <code>SPECIFIC_ATTRIBUTES</code> : Returns only the attributes listed
     * in <i>AttributesToGet</i>. This is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * <p>If you are querying an index and request only attributes that are
     * projected into that index, the operation will read only the index and
     * not the table. If any of the requested attributes are not projected
     * into the index, Amazon DynamoDB will need to fetch each matching item
     * from the table. This extra fetching incurs additional throughput cost
     * and latency. </li> </ul> <p>When neither <i>Select</i> nor
     * <i>AttributesToGet</i> are specified, Amazon DynamoDB defaults to
     * <code>ALL_ATTRIBUTES</code> when accessing a table, and
     * <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
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
     *         the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     *         the item attributes. For a table, this is the default. For an index,
     *         this mode causes Amazon DynamoDB to fetch the full item from the table
     *         for each matching item in the index. If the index is configured to
     *         project all item attributes, the matching items will not be fetched
     *         from the table. Fetching items from the table incurs additional
     *         throughput cost and latency. </li> <li>
     *         <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Allowed only when querying
     *         an index. Retrieves all attributes which have been projected into the
     *         index. If the index is configured to project all attributes, this is
     *         equivalent to specifying <i>ALL_ATTRIBUTES</i>. </li> <li>
     *         <p><code>COUNT</code>: Returns the number of matching items, rather
     *         than the matching items themselves. </li> <li> <p>
     *         <code>SPECIFIC_ATTRIBUTES</code> : Returns only the attributes listed
     *         in <i>AttributesToGet</i>. This is equivalent to specifying
     *         <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     *         <p>If you are querying an index and request only attributes that are
     *         projected into that index, the operation will read only the index and
     *         not the table. If any of the requested attributes are not projected
     *         into the index, Amazon DynamoDB will need to fetch each matching item
     *         from the table. This extra fetching incurs additional throughput cost
     *         and latency. </li> </ul> <p>When neither <i>Select</i> nor
     *         <i>AttributesToGet</i> are specified, Amazon DynamoDB defaults to
     *         <code>ALL_ATTRIBUTES</code> when accessing a table, and
     *         <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     *         cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     *         single request, <i>unless</i> the value for <i>Select</i> is
     *         <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *         specifying <i>AttributesToGet</i> without any value for
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
     * The names of one or more attributes to retrieve. If no attribute names
     * are specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>If you are querying an index and request only attributes
     * that are projected into that index, the operation will read only the
     * index and not the table. If any of the requested attributes are not
     * projected into the index, Amazon DynamoDB will need to fetch each
     * matching item from the table. This extra fetching incurs additional
     * throughput cost and latency. <p>You cannot use both
     * <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     * request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The names of one or more attributes to retrieve. If no attribute names
     *         are specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result. <p>If you are querying an index and request only attributes
     *         that are projected into that index, the operation will read only the
     *         index and not the table. If any of the requested attributes are not
     *         projected into the index, Amazon DynamoDB will need to fetch each
     *         matching item from the table. This extra fetching incurs additional
     *         throughput cost and latency. <p>You cannot use both
     *         <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     *         request, <i>unless</i> the value for <i>Select</i> is
     *         <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *         specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.)
     */
    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }
    
    /**
     * The names of one or more attributes to retrieve. If no attribute names
     * are specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>If you are querying an index and request only attributes
     * that are projected into that index, the operation will read only the
     * index and not the table. If any of the requested attributes are not
     * projected into the index, Amazon DynamoDB will need to fetch each
     * matching item from the table. This extra fetching incurs additional
     * throughput cost and latency. <p>You cannot use both
     * <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     * request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The names of one or more attributes to retrieve. If no attribute names
     *         are specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result. <p>If you are querying an index and request only attributes
     *         that are projected into that index, the operation will read only the
     *         index and not the table. If any of the requested attributes are not
     *         projected into the index, Amazon DynamoDB will need to fetch each
     *         matching item from the table. This extra fetching incurs additional
     *         throughput cost and latency. <p>You cannot use both
     *         <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     *         request, <i>unless</i> the value for <i>Select</i> is
     *         <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *         specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.)
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
     * The names of one or more attributes to retrieve. If no attribute names
     * are specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>If you are querying an index and request only attributes
     * that are projected into that index, the operation will read only the
     * index and not the table. If any of the requested attributes are not
     * projected into the index, Amazon DynamoDB will need to fetch each
     * matching item from the table. This extra fetching incurs additional
     * throughput cost and latency. <p>You cannot use both
     * <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     * request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The names of one or more attributes to retrieve. If no attribute names
     *         are specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result. <p>If you are querying an index and request only attributes
     *         that are projected into that index, the operation will read only the
     *         index and not the table. If any of the requested attributes are not
     *         projected into the index, Amazon DynamoDB will need to fetch each
     *         matching item from the table. This extra fetching incurs additional
     *         throughput cost and latency. <p>You cannot use both
     *         <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     *         request, <i>unless</i> the value for <i>Select</i> is
     *         <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *         specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.)
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
     * The names of one or more attributes to retrieve. If no attribute names
     * are specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>If you are querying an index and request only attributes
     * that are projected into that index, the operation will read only the
     * index and not the table. If any of the requested attributes are not
     * projected into the index, Amazon DynamoDB will need to fetch each
     * matching item from the table. This extra fetching incurs additional
     * throughput cost and latency. <p>You cannot use both
     * <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     * request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     * specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The names of one or more attributes to retrieve. If no attribute names
     *         are specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result. <p>If you are querying an index and request only attributes
     *         that are projected into that index, the operation will read only the
     *         index and not the table. If any of the requested attributes are not
     *         projected into the index, Amazon DynamoDB will need to fetch each
     *         matching item from the table. This extra fetching incurs additional
     *         throughput cost and latency. <p>You cannot use both
     *         <i>AttributesToGet</i> and <i>Select</i> together in a <i>Query</i>
     *         request, <i>unless</i> the value for <i>Select</i> is
     *         <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *         specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.)
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
     * matching items). If Amazon DynamoDB processes the number of items up
     * to the limit while processing the results, it stops the operation and
     * returns the matching values up to that point, and a
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set
     * size exceeds 1 MB before Amazon DynamoDB reaches this limit, it stops
     * the operation and returns the matching values up to the limit, and a
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     * the operation. For more information see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query
     * and Scan</a> in the Amazon DynamoDB Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The maximum number of items to evaluate (not necessarily the number of
     *         matching items). If Amazon DynamoDB processes the number of items up
     *         to the limit while processing the results, it stops the operation and
     *         returns the matching values up to that point, and a
     *         <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that
     *         you can pick up where you left off. Also, if the processed data set
     *         size exceeds 1 MB before Amazon DynamoDB reaches this limit, it stops
     *         the operation and returns the matching values up to the limit, and a
     *         <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     *         the operation. For more information see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query
     *         and Scan</a> in the Amazon DynamoDB Developer Guide.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If Amazon DynamoDB processes the number of items up
     * to the limit while processing the results, it stops the operation and
     * returns the matching values up to that point, and a
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set
     * size exceeds 1 MB before Amazon DynamoDB reaches this limit, it stops
     * the operation and returns the matching values up to the limit, and a
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     * the operation. For more information see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query
     * and Scan</a> in the Amazon DynamoDB Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit The maximum number of items to evaluate (not necessarily the number of
     *         matching items). If Amazon DynamoDB processes the number of items up
     *         to the limit while processing the results, it stops the operation and
     *         returns the matching values up to that point, and a
     *         <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that
     *         you can pick up where you left off. Also, if the processed data set
     *         size exceeds 1 MB before Amazon DynamoDB reaches this limit, it stops
     *         the operation and returns the matching values up to the limit, and a
     *         <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     *         the operation. For more information see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query
     *         and Scan</a> in the Amazon DynamoDB Developer Guide.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If Amazon DynamoDB processes the number of items up
     * to the limit while processing the results, it stops the operation and
     * returns the matching values up to that point, and a
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set
     * size exceeds 1 MB before Amazon DynamoDB reaches this limit, it stops
     * the operation and returns the matching values up to the limit, and a
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     * the operation. For more information see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query
     * and Scan</a> in the Amazon DynamoDB Developer Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit The maximum number of items to evaluate (not necessarily the number of
     *         matching items). If Amazon DynamoDB processes the number of items up
     *         to the limit while processing the results, it stops the operation and
     *         returns the matching values up to that point, and a
     *         <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that
     *         you can pick up where you left off. Also, if the processed data set
     *         size exceeds 1 MB before Amazon DynamoDB reaches this limit, it stops
     *         the operation and returns the matching values up to the limit, and a
     *         <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     *         the operation. For more information see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query
     *         and Scan</a> in the Amazon DynamoDB Developer Guide.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public QueryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * If set to <code>true</code>, then the operation uses strongly
     * consistent reads; otherwise, eventually consistent reads are used.
     *
     * @return If set to <code>true</code>, then the operation uses strongly
     *         consistent reads; otherwise, eventually consistent reads are used.
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }
    
    /**
     * If set to <code>true</code>, then the operation uses strongly
     * consistent reads; otherwise, eventually consistent reads are used.
     *
     * @param consistentRead If set to <code>true</code>, then the operation uses strongly
     *         consistent reads; otherwise, eventually consistent reads are used.
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }
    
    /**
     * If set to <code>true</code>, then the operation uses strongly
     * consistent reads; otherwise, eventually consistent reads are used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consistentRead If set to <code>true</code>, then the operation uses strongly
     *         consistent reads; otherwise, eventually consistent reads are used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public QueryRequest withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }

    /**
     * If set to <code>true</code>, then the operation uses strongly
     * consistent reads; otherwise, eventually consistent reads are used.
     *
     * @return If set to <code>true</code>, then the operation uses strongly
     *         consistent reads; otherwise, eventually consistent reads are used.
     */
    public Boolean getConsistentRead() {
        return consistentRead;
    }

    /**
     * The selection criteria for the query. <p>For a query on a table, you
     * can only have conditions on the table primary key attributes. You must
     * specify the hash key attribute name and value as an <code>EQ</code>
     * condition. You can optionally specify a second condition, referring to
     * the range key attribute. <p>For a query on a secondary index, you can
     * only have conditions on the index key attributes. You must specify the
     * index hash attribute name and value as an EQ condition. You can
     * optionally specify a second condition, referring to the index key
     * range attribute. <p>Multiple conditions are evaluated using "AND"; in
     * other words, all of the conditions must be met in order for an item to
     * appear in the results results. <p>Each <i>KeyConditions</i> element
     * consists of an attribute name to compare, along with the following:
     * <ul> <li><p><i>AttributeValueList</i> - One or more values to evaluate
     * against the supplied attribute. This list contains exactly one value,
     * except for a <code>BETWEEN</code> or <code>IN</code> comparison, in
     * which case the list contains two values. <note> <p>For type Number,
     * value comparisons are numeric. <p>String value comparisons for greater
     * than, equals, or less than are based on ASCII character code values.
     * For example, <code>a</code> is greater than <code>A</code>, and
     * <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, Amazon DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </note> </li> <li><p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>Valid comparison operators for Query:
     * <p><code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code> <p>For
     * information on specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set). If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>LE</code>
     * : Less than or equal. <p><i>AttributeValueList</i> can contain only
     * one <i>AttributeValue</i> of type String, Number, or Binary (not a
     * set). If an item contains an <i>AttributeValue</i> of a different type
     * than the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>GE</code> : Greater than or
     * equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>BEGINS_WITH</code> : checks
     * for a prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p> </li> <li> <p><code>BETWEEN</code>
     * : Greater than or equal to the first value, and less than or equal to
     * the second value. <p><i>AttributeValueList</i> must contain two
     * <i>AttributeValue</i> elements of the same type, either String,
     * Number, or Binary (not a set). A target attribute matches if the
     * target value is greater than, or equal to, the first element and less
     * than, or equal to, the second element. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code> </li> </ul></li> </ul>
     *
     * @return The selection criteria for the query. <p>For a query on a table, you
     *         can only have conditions on the table primary key attributes. You must
     *         specify the hash key attribute name and value as an <code>EQ</code>
     *         condition. You can optionally specify a second condition, referring to
     *         the range key attribute. <p>For a query on a secondary index, you can
     *         only have conditions on the index key attributes. You must specify the
     *         index hash attribute name and value as an EQ condition. You can
     *         optionally specify a second condition, referring to the index key
     *         range attribute. <p>Multiple conditions are evaluated using "AND"; in
     *         other words, all of the conditions must be met in order for an item to
     *         appear in the results results. <p>Each <i>KeyConditions</i> element
     *         consists of an attribute name to compare, along with the following:
     *         <ul> <li><p><i>AttributeValueList</i> - One or more values to evaluate
     *         against the supplied attribute. This list contains exactly one value,
     *         except for a <code>BETWEEN</code> or <code>IN</code> comparison, in
     *         which case the list contains two values. <note> <p>For type Number,
     *         value comparisons are numeric. <p>String value comparisons for greater
     *         than, equals, or less than are based on ASCII character code values.
     *         For example, <code>a</code> is greater than <code>A</code>, and
     *         <code>aa</code> is greater than <code>B</code>. For a list of code
     *         values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, Amazon DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. </note> </li> <li><p><i>ComparisonOperator</i> - A
     *         comparator for evaluating attributes. For example, equals, greater
     *         than, less than, etc. <p>Valid comparison operators for Query:
     *         <p><code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code> <p>For
     *         information on specifying data types in JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     *         following are descriptions of each comparison operator. <ul> <li>
     *         <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     *         only one <i>AttributeValue</i> of type String, Number, or Binary (not
     *         a set). If an item contains an <i>AttributeValue</i> of a different
     *         type than the one specified in the request, the value does not match.
     *         For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *         <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>LE</code>
     *         : Less than or equal. <p><i>AttributeValueList</i> can contain only
     *         one <i>AttributeValue</i> of type String, Number, or Binary (not a
     *         set). If an item contains an <i>AttributeValue</i> of a different type
     *         than the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>LT</code> : Less than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>GE</code> : Greater than or
     *         equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>GT</code> : Greater than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>BEGINS_WITH</code> : checks
     *         for a prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set). The target attribute of the comparison must be a String or
     *         Binary (not a Number or a set). <p> </li> <li> <p><code>BETWEEN</code>
     *         : Greater than or equal to the first value, and less than or equal to
     *         the second value. <p><i>AttributeValueList</i> must contain two
     *         <i>AttributeValue</i> elements of the same type, either String,
     *         Number, or Binary (not a set). A target attribute matches if the
     *         target value is greater than, or equal to, the first element and less
     *         than, or equal to, the second element. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code> </li> </ul></li> </ul>
     */
    public java.util.Map<String,Condition> getKeyConditions() {
        
        return keyConditions;
    }
    
    /**
     * The selection criteria for the query. <p>For a query on a table, you
     * can only have conditions on the table primary key attributes. You must
     * specify the hash key attribute name and value as an <code>EQ</code>
     * condition. You can optionally specify a second condition, referring to
     * the range key attribute. <p>For a query on a secondary index, you can
     * only have conditions on the index key attributes. You must specify the
     * index hash attribute name and value as an EQ condition. You can
     * optionally specify a second condition, referring to the index key
     * range attribute. <p>Multiple conditions are evaluated using "AND"; in
     * other words, all of the conditions must be met in order for an item to
     * appear in the results results. <p>Each <i>KeyConditions</i> element
     * consists of an attribute name to compare, along with the following:
     * <ul> <li><p><i>AttributeValueList</i> - One or more values to evaluate
     * against the supplied attribute. This list contains exactly one value,
     * except for a <code>BETWEEN</code> or <code>IN</code> comparison, in
     * which case the list contains two values. <note> <p>For type Number,
     * value comparisons are numeric. <p>String value comparisons for greater
     * than, equals, or less than are based on ASCII character code values.
     * For example, <code>a</code> is greater than <code>A</code>, and
     * <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, Amazon DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </note> </li> <li><p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>Valid comparison operators for Query:
     * <p><code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code> <p>For
     * information on specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set). If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>LE</code>
     * : Less than or equal. <p><i>AttributeValueList</i> can contain only
     * one <i>AttributeValue</i> of type String, Number, or Binary (not a
     * set). If an item contains an <i>AttributeValue</i> of a different type
     * than the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>GE</code> : Greater than or
     * equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>BEGINS_WITH</code> : checks
     * for a prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p> </li> <li> <p><code>BETWEEN</code>
     * : Greater than or equal to the first value, and less than or equal to
     * the second value. <p><i>AttributeValueList</i> must contain two
     * <i>AttributeValue</i> elements of the same type, either String,
     * Number, or Binary (not a set). A target attribute matches if the
     * target value is greater than, or equal to, the first element and less
     * than, or equal to, the second element. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code> </li> </ul></li> </ul>
     *
     * @param keyConditions The selection criteria for the query. <p>For a query on a table, you
     *         can only have conditions on the table primary key attributes. You must
     *         specify the hash key attribute name and value as an <code>EQ</code>
     *         condition. You can optionally specify a second condition, referring to
     *         the range key attribute. <p>For a query on a secondary index, you can
     *         only have conditions on the index key attributes. You must specify the
     *         index hash attribute name and value as an EQ condition. You can
     *         optionally specify a second condition, referring to the index key
     *         range attribute. <p>Multiple conditions are evaluated using "AND"; in
     *         other words, all of the conditions must be met in order for an item to
     *         appear in the results results. <p>Each <i>KeyConditions</i> element
     *         consists of an attribute name to compare, along with the following:
     *         <ul> <li><p><i>AttributeValueList</i> - One or more values to evaluate
     *         against the supplied attribute. This list contains exactly one value,
     *         except for a <code>BETWEEN</code> or <code>IN</code> comparison, in
     *         which case the list contains two values. <note> <p>For type Number,
     *         value comparisons are numeric. <p>String value comparisons for greater
     *         than, equals, or less than are based on ASCII character code values.
     *         For example, <code>a</code> is greater than <code>A</code>, and
     *         <code>aa</code> is greater than <code>B</code>. For a list of code
     *         values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, Amazon DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. </note> </li> <li><p><i>ComparisonOperator</i> - A
     *         comparator for evaluating attributes. For example, equals, greater
     *         than, less than, etc. <p>Valid comparison operators for Query:
     *         <p><code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code> <p>For
     *         information on specifying data types in JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     *         following are descriptions of each comparison operator. <ul> <li>
     *         <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     *         only one <i>AttributeValue</i> of type String, Number, or Binary (not
     *         a set). If an item contains an <i>AttributeValue</i> of a different
     *         type than the one specified in the request, the value does not match.
     *         For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *         <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>LE</code>
     *         : Less than or equal. <p><i>AttributeValueList</i> can contain only
     *         one <i>AttributeValue</i> of type String, Number, or Binary (not a
     *         set). If an item contains an <i>AttributeValue</i> of a different type
     *         than the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>LT</code> : Less than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>GE</code> : Greater than or
     *         equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>GT</code> : Greater than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>BEGINS_WITH</code> : checks
     *         for a prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set). The target attribute of the comparison must be a String or
     *         Binary (not a Number or a set). <p> </li> <li> <p><code>BETWEEN</code>
     *         : Greater than or equal to the first value, and less than or equal to
     *         the second value. <p><i>AttributeValueList</i> must contain two
     *         <i>AttributeValue</i> elements of the same type, either String,
     *         Number, or Binary (not a set). A target attribute matches if the
     *         target value is greater than, or equal to, the first element and less
     *         than, or equal to, the second element. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code> </li> </ul></li> </ul>
     */
    public void setKeyConditions(java.util.Map<String,Condition> keyConditions) {
        this.keyConditions = keyConditions;
    }
    
    /**
     * The selection criteria for the query. <p>For a query on a table, you
     * can only have conditions on the table primary key attributes. You must
     * specify the hash key attribute name and value as an <code>EQ</code>
     * condition. You can optionally specify a second condition, referring to
     * the range key attribute. <p>For a query on a secondary index, you can
     * only have conditions on the index key attributes. You must specify the
     * index hash attribute name and value as an EQ condition. You can
     * optionally specify a second condition, referring to the index key
     * range attribute. <p>Multiple conditions are evaluated using "AND"; in
     * other words, all of the conditions must be met in order for an item to
     * appear in the results results. <p>Each <i>KeyConditions</i> element
     * consists of an attribute name to compare, along with the following:
     * <ul> <li><p><i>AttributeValueList</i> - One or more values to evaluate
     * against the supplied attribute. This list contains exactly one value,
     * except for a <code>BETWEEN</code> or <code>IN</code> comparison, in
     * which case the list contains two values. <note> <p>For type Number,
     * value comparisons are numeric. <p>String value comparisons for greater
     * than, equals, or less than are based on ASCII character code values.
     * For example, <code>a</code> is greater than <code>A</code>, and
     * <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, Amazon DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </note> </li> <li><p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>Valid comparison operators for Query:
     * <p><code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code> <p>For
     * information on specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set). If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>LE</code>
     * : Less than or equal. <p><i>AttributeValueList</i> can contain only
     * one <i>AttributeValue</i> of type String, Number, or Binary (not a
     * set). If an item contains an <i>AttributeValue</i> of a different type
     * than the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>GE</code> : Greater than or
     * equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>BEGINS_WITH</code> : checks
     * for a prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p> </li> <li> <p><code>BETWEEN</code>
     * : Greater than or equal to the first value, and less than or equal to
     * the second value. <p><i>AttributeValueList</i> must contain two
     * <i>AttributeValue</i> elements of the same type, either String,
     * Number, or Binary (not a set). A target attribute matches if the
     * target value is greater than, or equal to, the first element and less
     * than, or equal to, the second element. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code> </li> </ul></li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyConditions The selection criteria for the query. <p>For a query on a table, you
     *         can only have conditions on the table primary key attributes. You must
     *         specify the hash key attribute name and value as an <code>EQ</code>
     *         condition. You can optionally specify a second condition, referring to
     *         the range key attribute. <p>For a query on a secondary index, you can
     *         only have conditions on the index key attributes. You must specify the
     *         index hash attribute name and value as an EQ condition. You can
     *         optionally specify a second condition, referring to the index key
     *         range attribute. <p>Multiple conditions are evaluated using "AND"; in
     *         other words, all of the conditions must be met in order for an item to
     *         appear in the results results. <p>Each <i>KeyConditions</i> element
     *         consists of an attribute name to compare, along with the following:
     *         <ul> <li><p><i>AttributeValueList</i> - One or more values to evaluate
     *         against the supplied attribute. This list contains exactly one value,
     *         except for a <code>BETWEEN</code> or <code>IN</code> comparison, in
     *         which case the list contains two values. <note> <p>For type Number,
     *         value comparisons are numeric. <p>String value comparisons for greater
     *         than, equals, or less than are based on ASCII character code values.
     *         For example, <code>a</code> is greater than <code>A</code>, and
     *         <code>aa</code> is greater than <code>B</code>. For a list of code
     *         values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, Amazon DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. </note> </li> <li><p><i>ComparisonOperator</i> - A
     *         comparator for evaluating attributes. For example, equals, greater
     *         than, less than, etc. <p>Valid comparison operators for Query:
     *         <p><code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code> <p>For
     *         information on specifying data types in JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     *         following are descriptions of each comparison operator. <ul> <li>
     *         <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     *         only one <i>AttributeValue</i> of type String, Number, or Binary (not
     *         a set). If an item contains an <i>AttributeValue</i> of a different
     *         type than the one specified in the request, the value does not match.
     *         For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *         <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>LE</code>
     *         : Less than or equal. <p><i>AttributeValueList</i> can contain only
     *         one <i>AttributeValue</i> of type String, Number, or Binary (not a
     *         set). If an item contains an <i>AttributeValue</i> of a different type
     *         than the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>LT</code> : Less than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>GE</code> : Greater than or
     *         equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>GT</code> : Greater than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>BEGINS_WITH</code> : checks
     *         for a prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set). The target attribute of the comparison must be a String or
     *         Binary (not a Number or a set). <p> </li> <li> <p><code>BETWEEN</code>
     *         : Greater than or equal to the first value, and less than or equal to
     *         the second value. <p><i>AttributeValueList</i> must contain two
     *         <i>AttributeValue</i> elements of the same type, either String,
     *         Number, or Binary (not a set). A target attribute matches if the
     *         target value is greater than, or equal to, the first element and less
     *         than, or equal to, the second element. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code> </li> </ul></li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public QueryRequest withKeyConditions(java.util.Map<String,Condition> keyConditions) {
        setKeyConditions(keyConditions);
        return this;
    }

    /**
     * The selection criteria for the query. <p>For a query on a table, you
     * can only have conditions on the table primary key attributes. You must
     * specify the hash key attribute name and value as an <code>EQ</code>
     * condition. You can optionally specify a second condition, referring to
     * the range key attribute. <p>For a query on a secondary index, you can
     * only have conditions on the index key attributes. You must specify the
     * index hash attribute name and value as an EQ condition. You can
     * optionally specify a second condition, referring to the index key
     * range attribute. <p>Multiple conditions are evaluated using "AND"; in
     * other words, all of the conditions must be met in order for an item to
     * appear in the results results. <p>Each <i>KeyConditions</i> element
     * consists of an attribute name to compare, along with the following:
     * <ul> <li><p><i>AttributeValueList</i> - One or more values to evaluate
     * against the supplied attribute. This list contains exactly one value,
     * except for a <code>BETWEEN</code> or <code>IN</code> comparison, in
     * which case the list contains two values. <note> <p>For type Number,
     * value comparisons are numeric. <p>String value comparisons for greater
     * than, equals, or less than are based on ASCII character code values.
     * For example, <code>a</code> is greater than <code>A</code>, and
     * <code>aa</code> is greater than <code>B</code>. For a list of code
     * values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, Amazon DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. </note> </li> <li><p><i>ComparisonOperator</i> - A
     * comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>Valid comparison operators for Query:
     * <p><code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code> <p>For
     * information on specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set). If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>LE</code>
     * : Less than or equal. <p><i>AttributeValueList</i> can contain only
     * one <i>AttributeValue</i> of type String, Number, or Binary (not a
     * set). If an item contains an <i>AttributeValue</i> of a different type
     * than the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>GE</code> : Greater than or
     * equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p> </li> <li> <p><code>BEGINS_WITH</code> : checks
     * for a prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p> </li> <li> <p><code>BETWEEN</code>
     * : Greater than or equal to the first value, and less than or equal to
     * the second value. <p><i>AttributeValueList</i> must contain two
     * <i>AttributeValue</i> elements of the same type, either String,
     * Number, or Binary (not a set). A target attribute matches if the
     * target value is greater than, or equal to, the first element and less
     * than, or equal to, the second element. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code> </li> </ul></li> </ul>
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
     * Specifies ascending (true) or descending (false) traversal of the
     * index. Amazon DynamoDB returns results reflecting the requested order
     * determined by the range key. If the data type is Number, the results
     * are returned in numeric order. For String, the results are returned in
     * order of ASCII character code values. For Binary, Amazon DynamoDB
     * treats each byte of the binary data as unsigned when it compares
     * binary values. <p>If <i>ScanIndexForward</i> is not specified, the
     * results are returned in ascending order.
     *
     * @return Specifies ascending (true) or descending (false) traversal of the
     *         index. Amazon DynamoDB returns results reflecting the requested order
     *         determined by the range key. If the data type is Number, the results
     *         are returned in numeric order. For String, the results are returned in
     *         order of ASCII character code values. For Binary, Amazon DynamoDB
     *         treats each byte of the binary data as unsigned when it compares
     *         binary values. <p>If <i>ScanIndexForward</i> is not specified, the
     *         results are returned in ascending order.
     */
    public Boolean isScanIndexForward() {
        return scanIndexForward;
    }
    
    /**
     * Specifies ascending (true) or descending (false) traversal of the
     * index. Amazon DynamoDB returns results reflecting the requested order
     * determined by the range key. If the data type is Number, the results
     * are returned in numeric order. For String, the results are returned in
     * order of ASCII character code values. For Binary, Amazon DynamoDB
     * treats each byte of the binary data as unsigned when it compares
     * binary values. <p>If <i>ScanIndexForward</i> is not specified, the
     * results are returned in ascending order.
     *
     * @param scanIndexForward Specifies ascending (true) or descending (false) traversal of the
     *         index. Amazon DynamoDB returns results reflecting the requested order
     *         determined by the range key. If the data type is Number, the results
     *         are returned in numeric order. For String, the results are returned in
     *         order of ASCII character code values. For Binary, Amazon DynamoDB
     *         treats each byte of the binary data as unsigned when it compares
     *         binary values. <p>If <i>ScanIndexForward</i> is not specified, the
     *         results are returned in ascending order.
     */
    public void setScanIndexForward(Boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
    }
    
    /**
     * Specifies ascending (true) or descending (false) traversal of the
     * index. Amazon DynamoDB returns results reflecting the requested order
     * determined by the range key. If the data type is Number, the results
     * are returned in numeric order. For String, the results are returned in
     * order of ASCII character code values. For Binary, Amazon DynamoDB
     * treats each byte of the binary data as unsigned when it compares
     * binary values. <p>If <i>ScanIndexForward</i> is not specified, the
     * results are returned in ascending order.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scanIndexForward Specifies ascending (true) or descending (false) traversal of the
     *         index. Amazon DynamoDB returns results reflecting the requested order
     *         determined by the range key. If the data type is Number, the results
     *         are returned in numeric order. For String, the results are returned in
     *         order of ASCII character code values. For Binary, Amazon DynamoDB
     *         treats each byte of the binary data as unsigned when it compares
     *         binary values. <p>If <i>ScanIndexForward</i> is not specified, the
     *         results are returned in ascending order.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public QueryRequest withScanIndexForward(Boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
        return this;
    }

    /**
     * Specifies ascending (true) or descending (false) traversal of the
     * index. Amazon DynamoDB returns results reflecting the requested order
     * determined by the range key. If the data type is Number, the results
     * are returned in numeric order. For String, the results are returned in
     * order of ASCII character code values. For Binary, Amazon DynamoDB
     * treats each byte of the binary data as unsigned when it compares
     * binary values. <p>If <i>ScanIndexForward</i> is not specified, the
     * results are returned in ascending order.
     *
     * @return Specifies ascending (true) or descending (false) traversal of the
     *         index. Amazon DynamoDB returns results reflecting the requested order
     *         determined by the range key. If the data type is Number, the results
     *         are returned in numeric order. For String, the results are returned in
     *         order of ASCII character code values. For Binary, Amazon DynamoDB
     *         treats each byte of the binary data as unsigned when it compares
     *         binary values. <p>If <i>ScanIndexForward</i> is not specified, the
     *         results are returned in ascending order.
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
     * If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     * the response; if set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @return If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     *         the response; if set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included.
     *
     * @see ReturnConsumedCapacity
     */
    public String getReturnConsumedCapacity() {
        return returnConsumedCapacity;
    }
    
    /**
     * If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     * the response; if set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     *         the response; if set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }
    
    /**
     * If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     * the response; if set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     *         the response; if set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included.
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
     * If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     * the response; if set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     *         the response; if set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }
    
    /**
     * If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     * the response; if set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     *         the response; if set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included.
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
        if (isScanIndexForward() != null) sb.append("ScanIndexForward: " + isScanIndexForward() + ",");
        if (getExclusiveStartKey() != null) sb.append("ExclusiveStartKey: " + getExclusiveStartKey() + ",");
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() );
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
        hashCode = prime * hashCode + ((isScanIndexForward() == null) ? 0 : isScanIndexForward().hashCode()); 
        hashCode = prime * hashCode + ((getExclusiveStartKey() == null) ? 0 : getExclusiveStartKey().hashCode()); 
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode()); 
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
        if (other.isScanIndexForward() == null ^ this.isScanIndexForward() == null) return false;
        if (other.isScanIndexForward() != null && other.isScanIndexForward().equals(this.isScanIndexForward()) == false) return false; 
        if (other.getExclusiveStartKey() == null ^ this.getExclusiveStartKey() == null) return false;
        if (other.getExclusiveStartKey() != null && other.getExclusiveStartKey().equals(this.getExclusiveStartKey()) == false) return false; 
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null) return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false) return false; 
        return true;
    }
    
}
    