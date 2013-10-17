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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#scan(ScanRequest) Scan operation}.
 * <p>
 * The <i>Scan</i> operation returns one or more items and item attributes by accessing every item in the table. To have Amazon DynamoDB return fewer
 * items, you can provide a <i>ScanFilter</i> .
 * </p>
 * <p>
 * If the total number of scanned items exceeds the maximum data set size limit of 1 MB, the scan stops and results are returned to the user with a
 * <i>LastEvaluatedKey</i> to continue the scan in a subsequent operation. The results also include the number of items exceeding the limit. A scan can
 * result in no table data meeting the filter criteria.
 * </p>
 * <p>
 * The result set is eventually consistent.
 * </p>
 * <p>
 * By default, <i>Scan</i> operations proceed sequentially; however, for faster performance on large tables, applications can request a parallel
 * <i>Scan</i> by specifying the <i>Segment</i> and <i>TotalSegments</i> parameters. For more information, see <a
 * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#QueryAndScanParallelScan"> Parallel Scan </a> in the Amazon
 * DynamoDB Developer Guide.
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#scan(ScanRequest)
 */
public class ScanRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the table containing the requested items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * The names of one or more attributes to retrieve. If no attribute names
     * are specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result.
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
     * <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Retrieves all attributes
     * which have been projected into the index. If the index is configured
     * to project all attributes, this is equivalent to specifying
     * <i>ALL_ATTRIBUTES</i>. </li> <li> <p><code>COUNT</code>: Returns the
     * number of matching items, rather than the matching items themselves.
     * </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> : Returns only the
     * attributes listed in <i>AttributesToGet</i>. This is equivalent to
     * specifying <i>AttributesToGet</i> without specifying any value for
     * <i>Select</i>. <p>If you are querying an index and request only
     * attributes that are projected into that index, the operation will read
     * only the index and not the table. If any of the requested attributes
     * are not projected into the index, Amazon DynamoDB will need to fetch
     * each matching item from the table. This extra fetching incurs
     * additional throughput cost and latency. </li> </ul> <p>When neither
     * <i>Select</i> nor <i>AttributesToGet</i> are specified, Amazon
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     * table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     * index. You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     * together in a single request, <i>unless</i> the value for
     * <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     * equivalent to specifying <i>AttributesToGet</i> without any value for
     * <i>Select</i>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     */
    private String select;

    /**
     * Evaluates the scan results and returns only the desired values.
     * Multiple conditions are treated as "AND" operations: all conditions
     * must be met to be included in the results. <p>Each
     * <i>ScanConditions</i> element consists of an attribute name to
     * compare, along with the following: <ul>
     * <li><p><i>AttributeValueList</i> - One or more values to evaluate
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
     * than, less than, etc. <p>Valid comparison operators for Scan:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     * specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set). If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>NE</code>
     * : Not equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
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
     * "2", "1"]}</code>. <p> </li> <li> <p><code>NOT_NULL</code> : The
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
     * as a substring). </li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p> </li> <li> <p><code>IN</code> :
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
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul>
     */
    private java.util.Map<String,Condition> scanFilter;

    /**
     * The primary key of the first item that this operation will evaluate.
     * Use the value that was returned for <i>LastEvaluatedKey</i> in the
     * previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     * be String, Number or Binary. No set data types are allowed. <p>In a
     * parallel scan, a <i>Scan</i> request that includes
     * <i>ExclusiveStartKey</i> must specify the same segment whose previous
     * <i>Scan</i> returned the corresponding value of
     * <i>LastEvaluatedKey</i>.
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
     * For a parallel <i>Scan</i> request, <i>TotalSegments</i> represents
     * the total number of segments into which the <i>Scan</i> operation will
     * be divided. The value of <i>TotalSegments</i> corresponds to the
     * number of application workers that will perform the parallel scan. For
     * example, if you want to scan a table using four application threads,
     * you would specify a <i>TotalSegments</i> value of 4. <p>The value for
     * <i>TotalSegments</i> must be greater than or equal to 1, and less than
     * or equal to 4096. If you specify a <i>TotalSegments</i> value of 1,
     * the <i>Scan</i> will be sequential rather than parallel. <p>If you
     * specify <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     */
    private Integer totalSegments;

    /**
     * For a parallel <i>Scan</i> request, <i>Segment</i> identifies an
     * individual segment to be scanned by an application worker. <p>Segment
     * IDs are zero-based, so the first segment is always 0. For example, if
     * you want to scan a table using four application threads, the first
     * thread would specify a <i>Segment</i> value of 0, the second thread
     * would specify 1, and so on. <p>The value of <i>LastEvaluatedKey</i>
     * returned from a parallel <i>Scan</i> request must be used as
     * <i>ExclusiveStartKey</i> with the same Segment ID in a subsequent
     * <i>Scan</i> operation. <p>The value for <i>Segment</i> must be greater
     * than or equal to 0, and less than the value provided for
     * <i>TotalSegments</i>. <p>If you specify <i>Segment</i>, you must also
     * specify <i>TotalSegments</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4095<br/>
     */
    private Integer segment;

    /**
     * Default constructor for a new ScanRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ScanRequest() {}
    
    /**
     * Constructs a new ScanRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table containing the requested items.
     */
    public ScanRequest(String tableName) {
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
    public ScanRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * The names of one or more attributes to retrieve. If no attribute names
     * are specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The names of one or more attributes to retrieve. If no attribute names
     *         are specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result.
     */
    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }
    
    /**
     * The names of one or more attributes to retrieve. If no attribute names
     * are specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The names of one or more attributes to retrieve. If no attribute names
     *         are specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result.
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
     * result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The names of one or more attributes to retrieve. If no attribute names
     *         are specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScanRequest withAttributesToGet(String... attributesToGet) {
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
     * result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The names of one or more attributes to retrieve. If no attribute names
     *         are specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScanRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
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
    public ScanRequest withLimit(Integer limit) {
        this.limit = limit;
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
     * <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Retrieves all attributes
     * which have been projected into the index. If the index is configured
     * to project all attributes, this is equivalent to specifying
     * <i>ALL_ATTRIBUTES</i>. </li> <li> <p><code>COUNT</code>: Returns the
     * number of matching items, rather than the matching items themselves.
     * </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> : Returns only the
     * attributes listed in <i>AttributesToGet</i>. This is equivalent to
     * specifying <i>AttributesToGet</i> without specifying any value for
     * <i>Select</i>. <p>If you are querying an index and request only
     * attributes that are projected into that index, the operation will read
     * only the index and not the table. If any of the requested attributes
     * are not projected into the index, Amazon DynamoDB will need to fetch
     * each matching item from the table. This extra fetching incurs
     * additional throughput cost and latency. </li> </ul> <p>When neither
     * <i>Select</i> nor <i>AttributesToGet</i> are specified, Amazon
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     * table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     * index. You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     * together in a single request, <i>unless</i> the value for
     * <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     * equivalent to specifying <i>AttributesToGet</i> without any value for
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
     *         <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Retrieves all attributes
     *         which have been projected into the index. If the index is configured
     *         to project all attributes, this is equivalent to specifying
     *         <i>ALL_ATTRIBUTES</i>. </li> <li> <p><code>COUNT</code>: Returns the
     *         number of matching items, rather than the matching items themselves.
     *         </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> : Returns only the
     *         attributes listed in <i>AttributesToGet</i>. This is equivalent to
     *         specifying <i>AttributesToGet</i> without specifying any value for
     *         <i>Select</i>. <p>If you are querying an index and request only
     *         attributes that are projected into that index, the operation will read
     *         only the index and not the table. If any of the requested attributes
     *         are not projected into the index, Amazon DynamoDB will need to fetch
     *         each matching item from the table. This extra fetching incurs
     *         additional throughput cost and latency. </li> </ul> <p>When neither
     *         <i>Select</i> nor <i>AttributesToGet</i> are specified, Amazon
     *         DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     *         table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     *         index. You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     *         together in a single request, <i>unless</i> the value for
     *         <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
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
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     * the item attributes. For a table, this is the default. For an index,
     * this mode causes Amazon DynamoDB to fetch the full item from the table
     * for each matching item in the index. If the index is configured to
     * project all item attributes, the matching items will not be fetched
     * from the table. Fetching items from the table incurs additional
     * throughput cost and latency. </li> <li>
     * <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Retrieves all attributes
     * which have been projected into the index. If the index is configured
     * to project all attributes, this is equivalent to specifying
     * <i>ALL_ATTRIBUTES</i>. </li> <li> <p><code>COUNT</code>: Returns the
     * number of matching items, rather than the matching items themselves.
     * </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> : Returns only the
     * attributes listed in <i>AttributesToGet</i>. This is equivalent to
     * specifying <i>AttributesToGet</i> without specifying any value for
     * <i>Select</i>. <p>If you are querying an index and request only
     * attributes that are projected into that index, the operation will read
     * only the index and not the table. If any of the requested attributes
     * are not projected into the index, Amazon DynamoDB will need to fetch
     * each matching item from the table. This extra fetching incurs
     * additional throughput cost and latency. </li> </ul> <p>When neither
     * <i>Select</i> nor <i>AttributesToGet</i> are specified, Amazon
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     * table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     * index. You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     * together in a single request, <i>unless</i> the value for
     * <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     * equivalent to specifying <i>AttributesToGet</i> without any value for
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
     *         <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Retrieves all attributes
     *         which have been projected into the index. If the index is configured
     *         to project all attributes, this is equivalent to specifying
     *         <i>ALL_ATTRIBUTES</i>. </li> <li> <p><code>COUNT</code>: Returns the
     *         number of matching items, rather than the matching items themselves.
     *         </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> : Returns only the
     *         attributes listed in <i>AttributesToGet</i>. This is equivalent to
     *         specifying <i>AttributesToGet</i> without specifying any value for
     *         <i>Select</i>. <p>If you are querying an index and request only
     *         attributes that are projected into that index, the operation will read
     *         only the index and not the table. If any of the requested attributes
     *         are not projected into the index, Amazon DynamoDB will need to fetch
     *         each matching item from the table. This extra fetching incurs
     *         additional throughput cost and latency. </li> </ul> <p>When neither
     *         <i>Select</i> nor <i>AttributesToGet</i> are specified, Amazon
     *         DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     *         table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     *         index. You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     *         together in a single request, <i>unless</i> the value for
     *         <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
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
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     * the item attributes. For a table, this is the default. For an index,
     * this mode causes Amazon DynamoDB to fetch the full item from the table
     * for each matching item in the index. If the index is configured to
     * project all item attributes, the matching items will not be fetched
     * from the table. Fetching items from the table incurs additional
     * throughput cost and latency. </li> <li>
     * <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Retrieves all attributes
     * which have been projected into the index. If the index is configured
     * to project all attributes, this is equivalent to specifying
     * <i>ALL_ATTRIBUTES</i>. </li> <li> <p><code>COUNT</code>: Returns the
     * number of matching items, rather than the matching items themselves.
     * </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> : Returns only the
     * attributes listed in <i>AttributesToGet</i>. This is equivalent to
     * specifying <i>AttributesToGet</i> without specifying any value for
     * <i>Select</i>. <p>If you are querying an index and request only
     * attributes that are projected into that index, the operation will read
     * only the index and not the table. If any of the requested attributes
     * are not projected into the index, Amazon DynamoDB will need to fetch
     * each matching item from the table. This extra fetching incurs
     * additional throughput cost and latency. </li> </ul> <p>When neither
     * <i>Select</i> nor <i>AttributesToGet</i> are specified, Amazon
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     * table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     * index. You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     * together in a single request, <i>unless</i> the value for
     * <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
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
     *         the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     *         the item attributes. For a table, this is the default. For an index,
     *         this mode causes Amazon DynamoDB to fetch the full item from the table
     *         for each matching item in the index. If the index is configured to
     *         project all item attributes, the matching items will not be fetched
     *         from the table. Fetching items from the table incurs additional
     *         throughput cost and latency. </li> <li>
     *         <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Retrieves all attributes
     *         which have been projected into the index. If the index is configured
     *         to project all attributes, this is equivalent to specifying
     *         <i>ALL_ATTRIBUTES</i>. </li> <li> <p><code>COUNT</code>: Returns the
     *         number of matching items, rather than the matching items themselves.
     *         </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> : Returns only the
     *         attributes listed in <i>AttributesToGet</i>. This is equivalent to
     *         specifying <i>AttributesToGet</i> without specifying any value for
     *         <i>Select</i>. <p>If you are querying an index and request only
     *         attributes that are projected into that index, the operation will read
     *         only the index and not the table. If any of the requested attributes
     *         are not projected into the index, Amazon DynamoDB will need to fetch
     *         each matching item from the table. This extra fetching incurs
     *         additional throughput cost and latency. </li> </ul> <p>When neither
     *         <i>Select</i> nor <i>AttributesToGet</i> are specified, Amazon
     *         DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     *         table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     *         index. You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     *         together in a single request, <i>unless</i> the value for
     *         <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *         equivalent to specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.)
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see Select
     */
    public ScanRequest withSelect(String select) {
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
     * <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Retrieves all attributes
     * which have been projected into the index. If the index is configured
     * to project all attributes, this is equivalent to specifying
     * <i>ALL_ATTRIBUTES</i>. </li> <li> <p><code>COUNT</code>: Returns the
     * number of matching items, rather than the matching items themselves.
     * </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> : Returns only the
     * attributes listed in <i>AttributesToGet</i>. This is equivalent to
     * specifying <i>AttributesToGet</i> without specifying any value for
     * <i>Select</i>. <p>If you are querying an index and request only
     * attributes that are projected into that index, the operation will read
     * only the index and not the table. If any of the requested attributes
     * are not projected into the index, Amazon DynamoDB will need to fetch
     * each matching item from the table. This extra fetching incurs
     * additional throughput cost and latency. </li> </ul> <p>When neither
     * <i>Select</i> nor <i>AttributesToGet</i> are specified, Amazon
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     * table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     * index. You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     * together in a single request, <i>unless</i> the value for
     * <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     * equivalent to specifying <i>AttributesToGet</i> without any value for
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
     *         <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Retrieves all attributes
     *         which have been projected into the index. If the index is configured
     *         to project all attributes, this is equivalent to specifying
     *         <i>ALL_ATTRIBUTES</i>. </li> <li> <p><code>COUNT</code>: Returns the
     *         number of matching items, rather than the matching items themselves.
     *         </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> : Returns only the
     *         attributes listed in <i>AttributesToGet</i>. This is equivalent to
     *         specifying <i>AttributesToGet</i> without specifying any value for
     *         <i>Select</i>. <p>If you are querying an index and request only
     *         attributes that are projected into that index, the operation will read
     *         only the index and not the table. If any of the requested attributes
     *         are not projected into the index, Amazon DynamoDB will need to fetch
     *         each matching item from the table. This extra fetching incurs
     *         additional throughput cost and latency. </li> </ul> <p>When neither
     *         <i>Select</i> nor <i>AttributesToGet</i> are specified, Amazon
     *         DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     *         table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     *         index. You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     *         together in a single request, <i>unless</i> the value for
     *         <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
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
     * the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     * the item attributes. For a table, this is the default. For an index,
     * this mode causes Amazon DynamoDB to fetch the full item from the table
     * for each matching item in the index. If the index is configured to
     * project all item attributes, the matching items will not be fetched
     * from the table. Fetching items from the table incurs additional
     * throughput cost and latency. </li> <li>
     * <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Retrieves all attributes
     * which have been projected into the index. If the index is configured
     * to project all attributes, this is equivalent to specifying
     * <i>ALL_ATTRIBUTES</i>. </li> <li> <p><code>COUNT</code>: Returns the
     * number of matching items, rather than the matching items themselves.
     * </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> : Returns only the
     * attributes listed in <i>AttributesToGet</i>. This is equivalent to
     * specifying <i>AttributesToGet</i> without specifying any value for
     * <i>Select</i>. <p>If you are querying an index and request only
     * attributes that are projected into that index, the operation will read
     * only the index and not the table. If any of the requested attributes
     * are not projected into the index, Amazon DynamoDB will need to fetch
     * each matching item from the table. This extra fetching incurs
     * additional throughput cost and latency. </li> </ul> <p>When neither
     * <i>Select</i> nor <i>AttributesToGet</i> are specified, Amazon
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     * table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     * index. You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     * together in a single request, <i>unless</i> the value for
     * <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
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
     *         the index. <ul> <li> <p><code>ALL_ATTRIBUTES</code>: Returns all of
     *         the item attributes. For a table, this is the default. For an index,
     *         this mode causes Amazon DynamoDB to fetch the full item from the table
     *         for each matching item in the index. If the index is configured to
     *         project all item attributes, the matching items will not be fetched
     *         from the table. Fetching items from the table incurs additional
     *         throughput cost and latency. </li> <li>
     *         <p><code>ALL_PROJECTED_ATTRIBUTES</code>: Retrieves all attributes
     *         which have been projected into the index. If the index is configured
     *         to project all attributes, this is equivalent to specifying
     *         <i>ALL_ATTRIBUTES</i>. </li> <li> <p><code>COUNT</code>: Returns the
     *         number of matching items, rather than the matching items themselves.
     *         </li> <li> <p> <code>SPECIFIC_ATTRIBUTES</code> : Returns only the
     *         attributes listed in <i>AttributesToGet</i>. This is equivalent to
     *         specifying <i>AttributesToGet</i> without specifying any value for
     *         <i>Select</i>. <p>If you are querying an index and request only
     *         attributes that are projected into that index, the operation will read
     *         only the index and not the table. If any of the requested attributes
     *         are not projected into the index, Amazon DynamoDB will need to fetch
     *         each matching item from the table. This extra fetching incurs
     *         additional throughput cost and latency. </li> </ul> <p>When neither
     *         <i>Select</i> nor <i>AttributesToGet</i> are specified, Amazon
     *         DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     *         table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     *         index. You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     *         together in a single request, <i>unless</i> the value for
     *         <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *         equivalent to specifying <i>AttributesToGet</i> without any value for
     *         <i>Select</i>.)
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see Select
     */
    public ScanRequest withSelect(Select select) {
        this.select = select.toString();
        return this;
    }

    /**
     * Evaluates the scan results and returns only the desired values.
     * Multiple conditions are treated as "AND" operations: all conditions
     * must be met to be included in the results. <p>Each
     * <i>ScanConditions</i> element consists of an attribute name to
     * compare, along with the following: <ul>
     * <li><p><i>AttributeValueList</i> - One or more values to evaluate
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
     * than, less than, etc. <p>Valid comparison operators for Scan:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     * specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set). If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>NE</code>
     * : Not equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
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
     * "2", "1"]}</code>. <p> </li> <li> <p><code>NOT_NULL</code> : The
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
     * as a substring). </li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p> </li> <li> <p><code>IN</code> :
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
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul>
     *
     * @return Evaluates the scan results and returns only the desired values.
     *         Multiple conditions are treated as "AND" operations: all conditions
     *         must be met to be included in the results. <p>Each
     *         <i>ScanConditions</i> element consists of an attribute name to
     *         compare, along with the following: <ul>
     *         <li><p><i>AttributeValueList</i> - One or more values to evaluate
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
     *         than, less than, etc. <p>Valid comparison operators for Scan:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     *         specifying data types in JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     *         following are descriptions of each comparison operator. <ul> <li>
     *         <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     *         only one <i>AttributeValue</i> of type String, Number, or Binary (not
     *         a set). If an item contains an <i>AttributeValue</i> of a different
     *         type than the one specified in the request, the value does not match.
     *         For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *         <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>NE</code>
     *         : Not equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p> </li> <li> <p><code>LE</code> : Less than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
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
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>NOT_NULL</code> : The
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
     *         as a substring). </li> <li> <p><code>BEGINS_WITH</code> : checks for a
     *         prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set). The target attribute of the comparison must be a String or
     *         Binary (not a Number or a set). <p> </li> <li> <p><code>IN</code> :
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
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul>
     */
    public java.util.Map<String,Condition> getScanFilter() {
        
        return scanFilter;
    }
    
    /**
     * Evaluates the scan results and returns only the desired values.
     * Multiple conditions are treated as "AND" operations: all conditions
     * must be met to be included in the results. <p>Each
     * <i>ScanConditions</i> element consists of an attribute name to
     * compare, along with the following: <ul>
     * <li><p><i>AttributeValueList</i> - One or more values to evaluate
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
     * than, less than, etc. <p>Valid comparison operators for Scan:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     * specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set). If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>NE</code>
     * : Not equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
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
     * "2", "1"]}</code>. <p> </li> <li> <p><code>NOT_NULL</code> : The
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
     * as a substring). </li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p> </li> <li> <p><code>IN</code> :
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
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul>
     *
     * @param scanFilter Evaluates the scan results and returns only the desired values.
     *         Multiple conditions are treated as "AND" operations: all conditions
     *         must be met to be included in the results. <p>Each
     *         <i>ScanConditions</i> element consists of an attribute name to
     *         compare, along with the following: <ul>
     *         <li><p><i>AttributeValueList</i> - One or more values to evaluate
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
     *         than, less than, etc. <p>Valid comparison operators for Scan:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     *         specifying data types in JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     *         following are descriptions of each comparison operator. <ul> <li>
     *         <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     *         only one <i>AttributeValue</i> of type String, Number, or Binary (not
     *         a set). If an item contains an <i>AttributeValue</i> of a different
     *         type than the one specified in the request, the value does not match.
     *         For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *         <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>NE</code>
     *         : Not equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p> </li> <li> <p><code>LE</code> : Less than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
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
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>NOT_NULL</code> : The
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
     *         as a substring). </li> <li> <p><code>BEGINS_WITH</code> : checks for a
     *         prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set). The target attribute of the comparison must be a String or
     *         Binary (not a Number or a set). <p> </li> <li> <p><code>IN</code> :
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
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul>
     */
    public void setScanFilter(java.util.Map<String,Condition> scanFilter) {
        this.scanFilter = scanFilter;
    }
    
    /**
     * Evaluates the scan results and returns only the desired values.
     * Multiple conditions are treated as "AND" operations: all conditions
     * must be met to be included in the results. <p>Each
     * <i>ScanConditions</i> element consists of an attribute name to
     * compare, along with the following: <ul>
     * <li><p><i>AttributeValueList</i> - One or more values to evaluate
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
     * than, less than, etc. <p>Valid comparison operators for Scan:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     * specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set). If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>NE</code>
     * : Not equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
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
     * "2", "1"]}</code>. <p> </li> <li> <p><code>NOT_NULL</code> : The
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
     * as a substring). </li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p> </li> <li> <p><code>IN</code> :
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
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scanFilter Evaluates the scan results and returns only the desired values.
     *         Multiple conditions are treated as "AND" operations: all conditions
     *         must be met to be included in the results. <p>Each
     *         <i>ScanConditions</i> element consists of an attribute name to
     *         compare, along with the following: <ul>
     *         <li><p><i>AttributeValueList</i> - One or more values to evaluate
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
     *         than, less than, etc. <p>Valid comparison operators for Scan:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     *         specifying data types in JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     *         following are descriptions of each comparison operator. <ul> <li>
     *         <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     *         only one <i>AttributeValue</i> of type String, Number, or Binary (not
     *         a set). If an item contains an <i>AttributeValue</i> of a different
     *         type than the one specified in the request, the value does not match.
     *         For example, <code>{"S":"6"}</code> does not equal
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     *         <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>NE</code>
     *         : Not equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p> </li> <li> <p><code>LE</code> : Less than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
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
     *         "2", "1"]}</code>. <p> </li> <li> <p><code>NOT_NULL</code> : The
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
     *         as a substring). </li> <li> <p><code>BEGINS_WITH</code> : checks for a
     *         prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set). The target attribute of the comparison must be a String or
     *         Binary (not a Number or a set). <p> </li> <li> <p><code>IN</code> :
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
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScanRequest withScanFilter(java.util.Map<String,Condition> scanFilter) {
        setScanFilter(scanFilter);
        return this;
    }

    /**
     * Evaluates the scan results and returns only the desired values.
     * Multiple conditions are treated as "AND" operations: all conditions
     * must be met to be included in the results. <p>Each
     * <i>ScanConditions</i> element consists of an attribute name to
     * compare, along with the following: <ul>
     * <li><p><i>AttributeValueList</i> - One or more values to evaluate
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
     * than, less than, etc. <p>Valid comparison operators for Scan:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     * specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide. <p>The
     * following are descriptions of each comparison operator. <ul> <li>
     * <p><code>EQ</code> : Equal. <p><i>AttributeValueList</i> can contain
     * only one <i>AttributeValue</i> of type String, Number, or Binary (not
     * a set). If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not equal
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal
     * <code>{"NS":["6", "2", "1"]}</code>. <p> </li> <li> <p><code>NE</code>
     * : Not equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
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
     * "2", "1"]}</code>. <p> </li> <li> <p><code>NOT_NULL</code> : The
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
     * as a substring). </li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p> </li> <li> <p><code>IN</code> :
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
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul> </li> </ul>
     * <p>
     * The method adds a new key-value pair into ScanFilter parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into ScanFilter.
     * @param value The corresponding value of the entry to be added into ScanFilter.
     */
	public ScanRequest addScanFilterEntry(String key, Condition value) {
		if (null == this.scanFilter) {
			this.scanFilter = new java.util.HashMap<String,Condition>();
		}
		if (this.scanFilter.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.scanFilter.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into ScanFilter.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public ScanRequest clearScanFilterEntries() {
		this.scanFilter = null;
		return this;
	}
	
    /**
     * The primary key of the first item that this operation will evaluate.
     * Use the value that was returned for <i>LastEvaluatedKey</i> in the
     * previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     * be String, Number or Binary. No set data types are allowed. <p>In a
     * parallel scan, a <i>Scan</i> request that includes
     * <i>ExclusiveStartKey</i> must specify the same segment whose previous
     * <i>Scan</i> returned the corresponding value of
     * <i>LastEvaluatedKey</i>.
     *
     * @return The primary key of the first item that this operation will evaluate.
     *         Use the value that was returned for <i>LastEvaluatedKey</i> in the
     *         previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     *         be String, Number or Binary. No set data types are allowed. <p>In a
     *         parallel scan, a <i>Scan</i> request that includes
     *         <i>ExclusiveStartKey</i> must specify the same segment whose previous
     *         <i>Scan</i> returned the corresponding value of
     *         <i>LastEvaluatedKey</i>.
     */
    public java.util.Map<String,AttributeValue> getExclusiveStartKey() {
        
        return exclusiveStartKey;
    }
    
    /**
     * The primary key of the first item that this operation will evaluate.
     * Use the value that was returned for <i>LastEvaluatedKey</i> in the
     * previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     * be String, Number or Binary. No set data types are allowed. <p>In a
     * parallel scan, a <i>Scan</i> request that includes
     * <i>ExclusiveStartKey</i> must specify the same segment whose previous
     * <i>Scan</i> returned the corresponding value of
     * <i>LastEvaluatedKey</i>.
     *
     * @param exclusiveStartKey The primary key of the first item that this operation will evaluate.
     *         Use the value that was returned for <i>LastEvaluatedKey</i> in the
     *         previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     *         be String, Number or Binary. No set data types are allowed. <p>In a
     *         parallel scan, a <i>Scan</i> request that includes
     *         <i>ExclusiveStartKey</i> must specify the same segment whose previous
     *         <i>Scan</i> returned the corresponding value of
     *         <i>LastEvaluatedKey</i>.
     */
    public void setExclusiveStartKey(java.util.Map<String,AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }
    
    /**
     * The primary key of the first item that this operation will evaluate.
     * Use the value that was returned for <i>LastEvaluatedKey</i> in the
     * previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     * be String, Number or Binary. No set data types are allowed. <p>In a
     * parallel scan, a <i>Scan</i> request that includes
     * <i>ExclusiveStartKey</i> must specify the same segment whose previous
     * <i>Scan</i> returned the corresponding value of
     * <i>LastEvaluatedKey</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exclusiveStartKey The primary key of the first item that this operation will evaluate.
     *         Use the value that was returned for <i>LastEvaluatedKey</i> in the
     *         previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     *         be String, Number or Binary. No set data types are allowed. <p>In a
     *         parallel scan, a <i>Scan</i> request that includes
     *         <i>ExclusiveStartKey</i> must specify the same segment whose previous
     *         <i>Scan</i> returned the corresponding value of
     *         <i>LastEvaluatedKey</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScanRequest withExclusiveStartKey(java.util.Map<String,AttributeValue> exclusiveStartKey) {
        setExclusiveStartKey(exclusiveStartKey);
        return this;
    }

    /**
     * The primary key of the first item that this operation will evaluate.
     * Use the value that was returned for <i>LastEvaluatedKey</i> in the
     * previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     * be String, Number or Binary. No set data types are allowed. <p>In a
     * parallel scan, a <i>Scan</i> request that includes
     * <i>ExclusiveStartKey</i> must specify the same segment whose previous
     * <i>Scan</i> returned the corresponding value of
     * <i>LastEvaluatedKey</i>.
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
     * be String, Number or Binary. No set data types are allowed. <p>In a
     * parallel scan, a <i>Scan</i> request that includes
     * <i>ExclusiveStartKey</i> must specify the same segment whose previous
     * <i>Scan</i> returned the corresponding value of
     * <i>LastEvaluatedKey</i>.
     * <p>
     * This method accepts the hashKey, rangeKey of ExclusiveStartKey as
     * java.util.Map.Entry<String, AttributeValue> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hashKey Primary hash key.
     * @param rangeKey Primary range key. (null if it a hash-only table)
     */
    public ScanRequest withExclusiveStartKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey) throws IllegalArgumentException {
    	setExclusiveStartKey(hashKey, rangeKey);
    	return this;
    }

    /**
     * The primary key of the first item that this operation will evaluate.
     * Use the value that was returned for <i>LastEvaluatedKey</i> in the
     * previous operation. <p>The data type for <i>ExclusiveStartKey</i> must
     * be String, Number or Binary. No set data types are allowed. <p>In a
     * parallel scan, a <i>Scan</i> request that includes
     * <i>ExclusiveStartKey</i> must specify the same segment whose previous
     * <i>Scan</i> returned the corresponding value of
     * <i>LastEvaluatedKey</i>.
     * <p>
     * The method adds a new key-value pair into ExclusiveStartKey parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into ExclusiveStartKey.
     * @param value The corresponding value of the entry to be added into ExclusiveStartKey.
     */
	public ScanRequest addExclusiveStartKeyEntry(String key, AttributeValue value) {
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
	public ScanRequest clearExclusiveStartKeyEntries() {
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
    public ScanRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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
    public ScanRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    /**
     * For a parallel <i>Scan</i> request, <i>TotalSegments</i> represents
     * the total number of segments into which the <i>Scan</i> operation will
     * be divided. The value of <i>TotalSegments</i> corresponds to the
     * number of application workers that will perform the parallel scan. For
     * example, if you want to scan a table using four application threads,
     * you would specify a <i>TotalSegments</i> value of 4. <p>The value for
     * <i>TotalSegments</i> must be greater than or equal to 1, and less than
     * or equal to 4096. If you specify a <i>TotalSegments</i> value of 1,
     * the <i>Scan</i> will be sequential rather than parallel. <p>If you
     * specify <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     *
     * @return For a parallel <i>Scan</i> request, <i>TotalSegments</i> represents
     *         the total number of segments into which the <i>Scan</i> operation will
     *         be divided. The value of <i>TotalSegments</i> corresponds to the
     *         number of application workers that will perform the parallel scan. For
     *         example, if you want to scan a table using four application threads,
     *         you would specify a <i>TotalSegments</i> value of 4. <p>The value for
     *         <i>TotalSegments</i> must be greater than or equal to 1, and less than
     *         or equal to 4096. If you specify a <i>TotalSegments</i> value of 1,
     *         the <i>Scan</i> will be sequential rather than parallel. <p>If you
     *         specify <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     */
    public Integer getTotalSegments() {
        return totalSegments;
    }
    
    /**
     * For a parallel <i>Scan</i> request, <i>TotalSegments</i> represents
     * the total number of segments into which the <i>Scan</i> operation will
     * be divided. The value of <i>TotalSegments</i> corresponds to the
     * number of application workers that will perform the parallel scan. For
     * example, if you want to scan a table using four application threads,
     * you would specify a <i>TotalSegments</i> value of 4. <p>The value for
     * <i>TotalSegments</i> must be greater than or equal to 1, and less than
     * or equal to 4096. If you specify a <i>TotalSegments</i> value of 1,
     * the <i>Scan</i> will be sequential rather than parallel. <p>If you
     * specify <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     *
     * @param totalSegments For a parallel <i>Scan</i> request, <i>TotalSegments</i> represents
     *         the total number of segments into which the <i>Scan</i> operation will
     *         be divided. The value of <i>TotalSegments</i> corresponds to the
     *         number of application workers that will perform the parallel scan. For
     *         example, if you want to scan a table using four application threads,
     *         you would specify a <i>TotalSegments</i> value of 4. <p>The value for
     *         <i>TotalSegments</i> must be greater than or equal to 1, and less than
     *         or equal to 4096. If you specify a <i>TotalSegments</i> value of 1,
     *         the <i>Scan</i> will be sequential rather than parallel. <p>If you
     *         specify <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     */
    public void setTotalSegments(Integer totalSegments) {
        this.totalSegments = totalSegments;
    }
    
    /**
     * For a parallel <i>Scan</i> request, <i>TotalSegments</i> represents
     * the total number of segments into which the <i>Scan</i> operation will
     * be divided. The value of <i>TotalSegments</i> corresponds to the
     * number of application workers that will perform the parallel scan. For
     * example, if you want to scan a table using four application threads,
     * you would specify a <i>TotalSegments</i> value of 4. <p>The value for
     * <i>TotalSegments</i> must be greater than or equal to 1, and less than
     * or equal to 4096. If you specify a <i>TotalSegments</i> value of 1,
     * the <i>Scan</i> will be sequential rather than parallel. <p>If you
     * specify <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     *
     * @param totalSegments For a parallel <i>Scan</i> request, <i>TotalSegments</i> represents
     *         the total number of segments into which the <i>Scan</i> operation will
     *         be divided. The value of <i>TotalSegments</i> corresponds to the
     *         number of application workers that will perform the parallel scan. For
     *         example, if you want to scan a table using four application threads,
     *         you would specify a <i>TotalSegments</i> value of 4. <p>The value for
     *         <i>TotalSegments</i> must be greater than or equal to 1, and less than
     *         or equal to 4096. If you specify a <i>TotalSegments</i> value of 1,
     *         the <i>Scan</i> will be sequential rather than parallel. <p>If you
     *         specify <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScanRequest withTotalSegments(Integer totalSegments) {
        this.totalSegments = totalSegments;
        return this;
    }

    /**
     * For a parallel <i>Scan</i> request, <i>Segment</i> identifies an
     * individual segment to be scanned by an application worker. <p>Segment
     * IDs are zero-based, so the first segment is always 0. For example, if
     * you want to scan a table using four application threads, the first
     * thread would specify a <i>Segment</i> value of 0, the second thread
     * would specify 1, and so on. <p>The value of <i>LastEvaluatedKey</i>
     * returned from a parallel <i>Scan</i> request must be used as
     * <i>ExclusiveStartKey</i> with the same Segment ID in a subsequent
     * <i>Scan</i> operation. <p>The value for <i>Segment</i> must be greater
     * than or equal to 0, and less than the value provided for
     * <i>TotalSegments</i>. <p>If you specify <i>Segment</i>, you must also
     * specify <i>TotalSegments</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4095<br/>
     *
     * @return For a parallel <i>Scan</i> request, <i>Segment</i> identifies an
     *         individual segment to be scanned by an application worker. <p>Segment
     *         IDs are zero-based, so the first segment is always 0. For example, if
     *         you want to scan a table using four application threads, the first
     *         thread would specify a <i>Segment</i> value of 0, the second thread
     *         would specify 1, and so on. <p>The value of <i>LastEvaluatedKey</i>
     *         returned from a parallel <i>Scan</i> request must be used as
     *         <i>ExclusiveStartKey</i> with the same Segment ID in a subsequent
     *         <i>Scan</i> operation. <p>The value for <i>Segment</i> must be greater
     *         than or equal to 0, and less than the value provided for
     *         <i>TotalSegments</i>. <p>If you specify <i>Segment</i>, you must also
     *         specify <i>TotalSegments</i>.
     */
    public Integer getSegment() {
        return segment;
    }
    
    /**
     * For a parallel <i>Scan</i> request, <i>Segment</i> identifies an
     * individual segment to be scanned by an application worker. <p>Segment
     * IDs are zero-based, so the first segment is always 0. For example, if
     * you want to scan a table using four application threads, the first
     * thread would specify a <i>Segment</i> value of 0, the second thread
     * would specify 1, and so on. <p>The value of <i>LastEvaluatedKey</i>
     * returned from a parallel <i>Scan</i> request must be used as
     * <i>ExclusiveStartKey</i> with the same Segment ID in a subsequent
     * <i>Scan</i> operation. <p>The value for <i>Segment</i> must be greater
     * than or equal to 0, and less than the value provided for
     * <i>TotalSegments</i>. <p>If you specify <i>Segment</i>, you must also
     * specify <i>TotalSegments</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4095<br/>
     *
     * @param segment For a parallel <i>Scan</i> request, <i>Segment</i> identifies an
     *         individual segment to be scanned by an application worker. <p>Segment
     *         IDs are zero-based, so the first segment is always 0. For example, if
     *         you want to scan a table using four application threads, the first
     *         thread would specify a <i>Segment</i> value of 0, the second thread
     *         would specify 1, and so on. <p>The value of <i>LastEvaluatedKey</i>
     *         returned from a parallel <i>Scan</i> request must be used as
     *         <i>ExclusiveStartKey</i> with the same Segment ID in a subsequent
     *         <i>Scan</i> operation. <p>The value for <i>Segment</i> must be greater
     *         than or equal to 0, and less than the value provided for
     *         <i>TotalSegments</i>. <p>If you specify <i>Segment</i>, you must also
     *         specify <i>TotalSegments</i>.
     */
    public void setSegment(Integer segment) {
        this.segment = segment;
    }
    
    /**
     * For a parallel <i>Scan</i> request, <i>Segment</i> identifies an
     * individual segment to be scanned by an application worker. <p>Segment
     * IDs are zero-based, so the first segment is always 0. For example, if
     * you want to scan a table using four application threads, the first
     * thread would specify a <i>Segment</i> value of 0, the second thread
     * would specify 1, and so on. <p>The value of <i>LastEvaluatedKey</i>
     * returned from a parallel <i>Scan</i> request must be used as
     * <i>ExclusiveStartKey</i> with the same Segment ID in a subsequent
     * <i>Scan</i> operation. <p>The value for <i>Segment</i> must be greater
     * than or equal to 0, and less than the value provided for
     * <i>TotalSegments</i>. <p>If you specify <i>Segment</i>, you must also
     * specify <i>TotalSegments</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4095<br/>
     *
     * @param segment For a parallel <i>Scan</i> request, <i>Segment</i> identifies an
     *         individual segment to be scanned by an application worker. <p>Segment
     *         IDs are zero-based, so the first segment is always 0. For example, if
     *         you want to scan a table using four application threads, the first
     *         thread would specify a <i>Segment</i> value of 0, the second thread
     *         would specify 1, and so on. <p>The value of <i>LastEvaluatedKey</i>
     *         returned from a parallel <i>Scan</i> request must be used as
     *         <i>ExclusiveStartKey</i> with the same Segment ID in a subsequent
     *         <i>Scan</i> operation. <p>The value for <i>Segment</i> must be greater
     *         than or equal to 0, and less than the value provided for
     *         <i>TotalSegments</i>. <p>If you specify <i>Segment</i>, you must also
     *         specify <i>TotalSegments</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScanRequest withSegment(Integer segment) {
        this.segment = segment;
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
        if (getAttributesToGet() != null) sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (getSelect() != null) sb.append("Select: " + getSelect() + ",");
        if (getScanFilter() != null) sb.append("ScanFilter: " + getScanFilter() + ",");
        if (getExclusiveStartKey() != null) sb.append("ExclusiveStartKey: " + getExclusiveStartKey() + ",");
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getTotalSegments() != null) sb.append("TotalSegments: " + getTotalSegments() + ",");
        if (getSegment() != null) sb.append("Segment: " + getSegment() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((getSelect() == null) ? 0 : getSelect().hashCode()); 
        hashCode = prime * hashCode + ((getScanFilter() == null) ? 0 : getScanFilter().hashCode()); 
        hashCode = prime * hashCode + ((getExclusiveStartKey() == null) ? 0 : getExclusiveStartKey().hashCode()); 
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode()); 
        hashCode = prime * hashCode + ((getTotalSegments() == null) ? 0 : getTotalSegments().hashCode()); 
        hashCode = prime * hashCode + ((getSegment() == null) ? 0 : getSegment().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScanRequest == false) return false;
        ScanRequest other = (ScanRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null) return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.getSelect() == null ^ this.getSelect() == null) return false;
        if (other.getSelect() != null && other.getSelect().equals(this.getSelect()) == false) return false; 
        if (other.getScanFilter() == null ^ this.getScanFilter() == null) return false;
        if (other.getScanFilter() != null && other.getScanFilter().equals(this.getScanFilter()) == false) return false; 
        if (other.getExclusiveStartKey() == null ^ this.getExclusiveStartKey() == null) return false;
        if (other.getExclusiveStartKey() != null && other.getExclusiveStartKey().equals(this.getExclusiveStartKey()) == false) return false; 
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null) return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false) return false; 
        if (other.getTotalSegments() == null ^ this.getTotalSegments() == null) return false;
        if (other.getTotalSegments() != null && other.getTotalSegments().equals(this.getTotalSegments()) == false) return false; 
        if (other.getSegment() == null ^ this.getSegment() == null) return false;
        if (other.getSegment() != null && other.getSegment().equals(this.getSegment()) == false) return false; 
        return true;
    }
    
}
    