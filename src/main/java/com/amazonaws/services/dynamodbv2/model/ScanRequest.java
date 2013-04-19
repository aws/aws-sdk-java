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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

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
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#scan(ScanRequest)
 */
public class ScanRequest extends AmazonWebServiceRequest  implements Serializable  {

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
    private java.util.List<String> attributesToGet;

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
     * and Scan</a> of the <i>Amazon DynamoDB Developer Guide</i>.
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
     * <i>Select</i>. <p>If you are querying an index and only request
     * attributes that are projected into that index, the operation will
     * consult the index and bypass the table. If any of the requested
     * attributes are not projected into the index, Amazon DynamoDB will need
     * to fetch each matching item from the table. This extra fetching incurs
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
     * <li><p><i>AttributeValueList</i>-One or more values to evaluate
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
     * query expressions. </note> </li> <li><p><i>ComparisonOperator</i>-A
     * comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>Valid comparison operators for Scan:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     * specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> of the <i>Amazon DynamoDB Developer Guide</i>. <p>The
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
     * The primary key of the item from which to continue an earlier
     * operation. An earlier operation might provide this value as the
     * <i>LastEvaluatedKey</i> if that operation was interrupted before
     * completion; either because of the result set size or because of the
     * setting for <i>Limit</i>. The <i>LastEvaluatedKey</i> can be passed
     * back in a new request to continue the operation from that point.
     * <p>The data type for <i>ExclusiveStartKey</i> must be String, Number
     * or Binary. No set data types are allowed.
     */
    private java.util.Map<String,AttributeValue> exclusiveStartKey;

    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     */
    private String returnConsumedCapacity;

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
        this.tableName = tableName;
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

        java.util.List<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.size());
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
            java.util.List<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.size());
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
     * and Scan</a> of the <i>Amazon DynamoDB Developer Guide</i>.
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
     *         and Scan</a> of the <i>Amazon DynamoDB Developer Guide</i>.
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
     * and Scan</a> of the <i>Amazon DynamoDB Developer Guide</i>.
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
     *         and Scan</a> of the <i>Amazon DynamoDB Developer Guide</i>.
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
     * and Scan</a> of the <i>Amazon DynamoDB Developer Guide</i>.
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
     *         and Scan</a> of the <i>Amazon DynamoDB Developer Guide</i>.
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
     * <i>Select</i>. <p>If you are querying an index and only request
     * attributes that are projected into that index, the operation will
     * consult the index and bypass the table. If any of the requested
     * attributes are not projected into the index, Amazon DynamoDB will need
     * to fetch each matching item from the table. This extra fetching incurs
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
     *         <i>Select</i>. <p>If you are querying an index and only request
     *         attributes that are projected into that index, the operation will
     *         consult the index and bypass the table. If any of the requested
     *         attributes are not projected into the index, Amazon DynamoDB will need
     *         to fetch each matching item from the table. This extra fetching incurs
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
     * <i>Select</i>. <p>If you are querying an index and only request
     * attributes that are projected into that index, the operation will
     * consult the index and bypass the table. If any of the requested
     * attributes are not projected into the index, Amazon DynamoDB will need
     * to fetch each matching item from the table. This extra fetching incurs
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
     *         <i>Select</i>. <p>If you are querying an index and only request
     *         attributes that are projected into that index, the operation will
     *         consult the index and bypass the table. If any of the requested
     *         attributes are not projected into the index, Amazon DynamoDB will need
     *         to fetch each matching item from the table. This extra fetching incurs
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
     * <i>Select</i>. <p>If you are querying an index and only request
     * attributes that are projected into that index, the operation will
     * consult the index and bypass the table. If any of the requested
     * attributes are not projected into the index, Amazon DynamoDB will need
     * to fetch each matching item from the table. This extra fetching incurs
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
     *         <i>Select</i>. <p>If you are querying an index and only request
     *         attributes that are projected into that index, the operation will
     *         consult the index and bypass the table. If any of the requested
     *         attributes are not projected into the index, Amazon DynamoDB will need
     *         to fetch each matching item from the table. This extra fetching incurs
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
     * <i>Select</i>. <p>If you are querying an index and only request
     * attributes that are projected into that index, the operation will
     * consult the index and bypass the table. If any of the requested
     * attributes are not projected into the index, Amazon DynamoDB will need
     * to fetch each matching item from the table. This extra fetching incurs
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
     *         <i>Select</i>. <p>If you are querying an index and only request
     *         attributes that are projected into that index, the operation will
     *         consult the index and bypass the table. If any of the requested
     *         attributes are not projected into the index, Amazon DynamoDB will need
     *         to fetch each matching item from the table. This extra fetching incurs
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
     * <i>Select</i>. <p>If you are querying an index and only request
     * attributes that are projected into that index, the operation will
     * consult the index and bypass the table. If any of the requested
     * attributes are not projected into the index, Amazon DynamoDB will need
     * to fetch each matching item from the table. This extra fetching incurs
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
     *         <i>Select</i>. <p>If you are querying an index and only request
     *         attributes that are projected into that index, the operation will
     *         consult the index and bypass the table. If any of the requested
     *         attributes are not projected into the index, Amazon DynamoDB will need
     *         to fetch each matching item from the table. This extra fetching incurs
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
     * <li><p><i>AttributeValueList</i>-One or more values to evaluate
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
     * query expressions. </note> </li> <li><p><i>ComparisonOperator</i>-A
     * comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>Valid comparison operators for Scan:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     * specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> of the <i>Amazon DynamoDB Developer Guide</i>. <p>The
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
     *         <li><p><i>AttributeValueList</i>-One or more values to evaluate
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
     *         query expressions. </note> </li> <li><p><i>ComparisonOperator</i>-A
     *         comparator for evaluating attributes. For example, equals, greater
     *         than, less than, etc. <p>Valid comparison operators for Scan:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     *         specifying data types in JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> of the <i>Amazon DynamoDB Developer Guide</i>. <p>The
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
     * <li><p><i>AttributeValueList</i>-One or more values to evaluate
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
     * query expressions. </note> </li> <li><p><i>ComparisonOperator</i>-A
     * comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>Valid comparison operators for Scan:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     * specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> of the <i>Amazon DynamoDB Developer Guide</i>. <p>The
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
     *         <li><p><i>AttributeValueList</i>-One or more values to evaluate
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
     *         query expressions. </note> </li> <li><p><i>ComparisonOperator</i>-A
     *         comparator for evaluating attributes. For example, equals, greater
     *         than, less than, etc. <p>Valid comparison operators for Scan:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     *         specifying data types in JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> of the <i>Amazon DynamoDB Developer Guide</i>. <p>The
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
     * <li><p><i>AttributeValueList</i>-One or more values to evaluate
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
     * query expressions. </note> </li> <li><p><i>ComparisonOperator</i>-A
     * comparator for evaluating attributes. For example, equals, greater
     * than, less than, etc. <p>Valid comparison operators for Scan:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     * specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> of the <i>Amazon DynamoDB Developer Guide</i>. <p>The
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
     *         <li><p><i>AttributeValueList</i>-One or more values to evaluate
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
     *         query expressions. </note> </li> <li><p><i>ComparisonOperator</i>-A
     *         comparator for evaluating attributes. For example, equals, greater
     *         than, less than, etc. <p>Valid comparison operators for Scan:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>For information on
     *         specifying data types in JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> of the <i>Amazon DynamoDB Developer Guide</i>. <p>The
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
     * The primary key of the item from which to continue an earlier
     * operation. An earlier operation might provide this value as the
     * <i>LastEvaluatedKey</i> if that operation was interrupted before
     * completion; either because of the result set size or because of the
     * setting for <i>Limit</i>. The <i>LastEvaluatedKey</i> can be passed
     * back in a new request to continue the operation from that point.
     * <p>The data type for <i>ExclusiveStartKey</i> must be String, Number
     * or Binary. No set data types are allowed.
     *
     * @return The primary key of the item from which to continue an earlier
     *         operation. An earlier operation might provide this value as the
     *         <i>LastEvaluatedKey</i> if that operation was interrupted before
     *         completion; either because of the result set size or because of the
     *         setting for <i>Limit</i>. The <i>LastEvaluatedKey</i> can be passed
     *         back in a new request to continue the operation from that point.
     *         <p>The data type for <i>ExclusiveStartKey</i> must be String, Number
     *         or Binary. No set data types are allowed.
     */
    public java.util.Map<String,AttributeValue> getExclusiveStartKey() {
        
        return exclusiveStartKey;

    }
    
    /**
     * The primary key of the item from which to continue an earlier
     * operation. An earlier operation might provide this value as the
     * <i>LastEvaluatedKey</i> if that operation was interrupted before
     * completion; either because of the result set size or because of the
     * setting for <i>Limit</i>. The <i>LastEvaluatedKey</i> can be passed
     * back in a new request to continue the operation from that point.
     * <p>The data type for <i>ExclusiveStartKey</i> must be String, Number
     * or Binary. No set data types are allowed.
     *
     * @param exclusiveStartKey The primary key of the item from which to continue an earlier
     *         operation. An earlier operation might provide this value as the
     *         <i>LastEvaluatedKey</i> if that operation was interrupted before
     *         completion; either because of the result set size or because of the
     *         setting for <i>Limit</i>. The <i>LastEvaluatedKey</i> can be passed
     *         back in a new request to continue the operation from that point.
     *         <p>The data type for <i>ExclusiveStartKey</i> must be String, Number
     *         or Binary. No set data types are allowed.
     */
    public void setExclusiveStartKey(java.util.Map<String,AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }
    
    /**
     * The primary key of the item from which to continue an earlier
     * operation. An earlier operation might provide this value as the
     * <i>LastEvaluatedKey</i> if that operation was interrupted before
     * completion; either because of the result set size or because of the
     * setting for <i>Limit</i>. The <i>LastEvaluatedKey</i> can be passed
     * back in a new request to continue the operation from that point.
     * <p>The data type for <i>ExclusiveStartKey</i> must be String, Number
     * or Binary. No set data types are allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exclusiveStartKey The primary key of the item from which to continue an earlier
     *         operation. An earlier operation might provide this value as the
     *         <i>LastEvaluatedKey</i> if that operation was interrupted before
     *         completion; either because of the result set size or because of the
     *         setting for <i>Limit</i>. The <i>LastEvaluatedKey</i> can be passed
     *         back in a new request to continue the operation from that point.
     *         <p>The data type for <i>ExclusiveStartKey</i> must be String, Number
     *         or Binary. No set data types are allowed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanRequest withExclusiveStartKey(java.util.Map<String,AttributeValue> exclusiveStartKey) {
        setExclusiveStartKey(exclusiveStartKey);
        return this;
    }
    
    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @return Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
     *
     * @see ReturnConsumedCapacity
     */
    public String getReturnConsumedCapacity() {
        return returnConsumedCapacity;
    }
    
    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }
    
    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
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
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }
    
    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
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
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() );
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
        return true;
    }
    
}
    