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

/**
 * <p>
 * Represents the output of a <code>Query</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Query" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of item attributes that match the query criteria. Each element in this array consists of an attribute
     * name and the value for that attribute.
     * </p>
     */
    private java.util.List<java.util.Map<String, AttributeValue>> items;
    /**
     * <p>
     * The number of items in the response.
     * </p>
     * <p>
     * If you used a <code>QueryFilter</code> in the request, then <code>Count</code> is the number of items returned
     * after the filter was applied, and <code>ScannedCount</code> is the number of matching items before the filter was
     * applied.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <code>Count</code> and <code>ScannedCount</code> are the same.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The number of items evaluated, before any <code>QueryFilter</code> is applied. A high <code>ScannedCount</code>
     * value with few, or no, <code>Count</code> results indicates an inefficient <code>Query</code> operation. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
     * ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <code>ScannedCount</code> is the same as <code>Count</code>.
     * </p>
     */
    private Integer scannedCount;
    /**
     * <p>
     * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is empty, then the "last page" of results has been processed and there is no
     * more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the result
     * set. The only way to know when you have reached the end of the result set is when <code>LastEvaluatedKey</code>
     * is empty.
     * </p>
     */
    private java.util.Map<String, AttributeValue> lastEvaluatedKey;
    /**
     * <p>
     * The capacity units consumed by the <code>Query</code> operation. The data returned includes the total provisioned
     * throughput consumed, along with statistics for the table and any indexes involved in the operation.
     * <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code> parameter was specified
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private ConsumedCapacity consumedCapacity;

    /**
     * <p>
     * An array of item attributes that match the query criteria. Each element in this array consists of an attribute
     * name and the value for that attribute.
     * </p>
     * 
     * @return An array of item attributes that match the query criteria. Each element in this array consists of an
     *         attribute name and the value for that attribute.
     */

    public java.util.List<java.util.Map<String, AttributeValue>> getItems() {
        return items;
    }

    /**
     * <p>
     * An array of item attributes that match the query criteria. Each element in this array consists of an attribute
     * name and the value for that attribute.
     * </p>
     * 
     * @param items
     *        An array of item attributes that match the query criteria. Each element in this array consists of an
     *        attribute name and the value for that attribute.
     */

    public void setItems(java.util.Collection<java.util.Map<String, AttributeValue>> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<java.util.Map<String, AttributeValue>>(items);
    }

    /**
     * <p>
     * An array of item attributes that match the query criteria. Each element in this array consists of an attribute
     * name and the value for that attribute.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        An array of item attributes that match the query criteria. Each element in this array consists of an
     *        attribute name and the value for that attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withItems(java.util.Map<String, AttributeValue>... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<java.util.Map<String, AttributeValue>>(items.length));
        }
        for (java.util.Map<String, AttributeValue> ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of item attributes that match the query criteria. Each element in this array consists of an attribute
     * name and the value for that attribute.
     * </p>
     * 
     * @param items
     *        An array of item attributes that match the query criteria. Each element in this array consists of an
     *        attribute name and the value for that attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withItems(java.util.Collection<java.util.Map<String, AttributeValue>> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The number of items in the response.
     * </p>
     * <p>
     * If you used a <code>QueryFilter</code> in the request, then <code>Count</code> is the number of items returned
     * after the filter was applied, and <code>ScannedCount</code> is the number of matching items before the filter was
     * applied.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <code>Count</code> and <code>ScannedCount</code> are the same.
     * </p>
     * 
     * @param count
     *        The number of items in the response.</p>
     *        <p>
     *        If you used a <code>QueryFilter</code> in the request, then <code>Count</code> is the number of items
     *        returned after the filter was applied, and <code>ScannedCount</code> is the number of matching items
     *        before the filter was applied.
     *        </p>
     *        <p>
     *        If you did not use a filter in the request, then <code>Count</code> and <code>ScannedCount</code> are the
     *        same.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of items in the response.
     * </p>
     * <p>
     * If you used a <code>QueryFilter</code> in the request, then <code>Count</code> is the number of items returned
     * after the filter was applied, and <code>ScannedCount</code> is the number of matching items before the filter was
     * applied.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <code>Count</code> and <code>ScannedCount</code> are the same.
     * </p>
     * 
     * @return The number of items in the response.</p>
     *         <p>
     *         If you used a <code>QueryFilter</code> in the request, then <code>Count</code> is the number of items
     *         returned after the filter was applied, and <code>ScannedCount</code> is the number of matching items
     *         before the filter was applied.
     *         </p>
     *         <p>
     *         If you did not use a filter in the request, then <code>Count</code> and <code>ScannedCount</code> are the
     *         same.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of items in the response.
     * </p>
     * <p>
     * If you used a <code>QueryFilter</code> in the request, then <code>Count</code> is the number of items returned
     * after the filter was applied, and <code>ScannedCount</code> is the number of matching items before the filter was
     * applied.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <code>Count</code> and <code>ScannedCount</code> are the same.
     * </p>
     * 
     * @param count
     *        The number of items in the response.</p>
     *        <p>
     *        If you used a <code>QueryFilter</code> in the request, then <code>Count</code> is the number of items
     *        returned after the filter was applied, and <code>ScannedCount</code> is the number of matching items
     *        before the filter was applied.
     *        </p>
     *        <p>
     *        If you did not use a filter in the request, then <code>Count</code> and <code>ScannedCount</code> are the
     *        same.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The number of items evaluated, before any <code>QueryFilter</code> is applied. A high <code>ScannedCount</code>
     * value with few, or no, <code>Count</code> results indicates an inefficient <code>Query</code> operation. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
     * ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <code>ScannedCount</code> is the same as <code>Count</code>.
     * </p>
     * 
     * @param scannedCount
     *        The number of items evaluated, before any <code>QueryFilter</code> is applied. A high
     *        <code>ScannedCount</code> value with few, or no, <code>Count</code> results indicates an inefficient
     *        <code>Query</code> operation. For more information, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
     *        ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
     *        <p>
     *        If you did not use a filter in the request, then <code>ScannedCount</code> is the same as
     *        <code>Count</code>.
     */

    public void setScannedCount(Integer scannedCount) {
        this.scannedCount = scannedCount;
    }

    /**
     * <p>
     * The number of items evaluated, before any <code>QueryFilter</code> is applied. A high <code>ScannedCount</code>
     * value with few, or no, <code>Count</code> results indicates an inefficient <code>Query</code> operation. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
     * ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <code>ScannedCount</code> is the same as <code>Count</code>.
     * </p>
     * 
     * @return The number of items evaluated, before any <code>QueryFilter</code> is applied. A high
     *         <code>ScannedCount</code> value with few, or no, <code>Count</code> results indicates an inefficient
     *         <code>Query</code> operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
     *         ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
     *         <p>
     *         If you did not use a filter in the request, then <code>ScannedCount</code> is the same as
     *         <code>Count</code>.
     */

    public Integer getScannedCount() {
        return this.scannedCount;
    }

    /**
     * <p>
     * The number of items evaluated, before any <code>QueryFilter</code> is applied. A high <code>ScannedCount</code>
     * value with few, or no, <code>Count</code> results indicates an inefficient <code>Query</code> operation. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
     * ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <code>ScannedCount</code> is the same as <code>Count</code>.
     * </p>
     * 
     * @param scannedCount
     *        The number of items evaluated, before any <code>QueryFilter</code> is applied. A high
     *        <code>ScannedCount</code> value with few, or no, <code>Count</code> results indicates an inefficient
     *        <code>Query</code> operation. For more information, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
     *        ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
     *        <p>
     *        If you did not use a filter in the request, then <code>ScannedCount</code> is the same as
     *        <code>Count</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withScannedCount(Integer scannedCount) {
        setScannedCount(scannedCount);
        return this;
    }

    /**
     * <p>
     * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is empty, then the "last page" of results has been processed and there is no
     * more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the result
     * set. The only way to know when you have reached the end of the result set is when <code>LastEvaluatedKey</code>
     * is empty.
     * </p>
     * 
     * @return The primary key of the item where the operation stopped, inclusive of the previous result set. Use this
     *         value to start a new operation, excluding this value in the new request.</p>
     *         <p>
     *         If <code>LastEvaluatedKey</code> is empty, then the "last page" of results has been processed and there
     *         is no more data to be retrieved.
     *         </p>
     *         <p>
     *         If <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in
     *         the result set. The only way to know when you have reached the end of the result set is when
     *         <code>LastEvaluatedKey</code> is empty.
     */

    public java.util.Map<String, AttributeValue> getLastEvaluatedKey() {
        return lastEvaluatedKey;
    }

    /**
     * <p>
     * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is empty, then the "last page" of results has been processed and there is no
     * more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the result
     * set. The only way to know when you have reached the end of the result set is when <code>LastEvaluatedKey</code>
     * is empty.
     * </p>
     * 
     * @param lastEvaluatedKey
     *        The primary key of the item where the operation stopped, inclusive of the previous result set. Use this
     *        value to start a new operation, excluding this value in the new request.</p>
     *        <p>
     *        If <code>LastEvaluatedKey</code> is empty, then the "last page" of results has been processed and there is
     *        no more data to be retrieved.
     *        </p>
     *        <p>
     *        If <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the
     *        result set. The only way to know when you have reached the end of the result set is when
     *        <code>LastEvaluatedKey</code> is empty.
     */

    public void setLastEvaluatedKey(java.util.Map<String, AttributeValue> lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
    }

    /**
     * <p>
     * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is empty, then the "last page" of results has been processed and there is no
     * more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the result
     * set. The only way to know when you have reached the end of the result set is when <code>LastEvaluatedKey</code>
     * is empty.
     * </p>
     * 
     * @param lastEvaluatedKey
     *        The primary key of the item where the operation stopped, inclusive of the previous result set. Use this
     *        value to start a new operation, excluding this value in the new request.</p>
     *        <p>
     *        If <code>LastEvaluatedKey</code> is empty, then the "last page" of results has been processed and there is
     *        no more data to be retrieved.
     *        </p>
     *        <p>
     *        If <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the
     *        result set. The only way to know when you have reached the end of the result set is when
     *        <code>LastEvaluatedKey</code> is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withLastEvaluatedKey(java.util.Map<String, AttributeValue> lastEvaluatedKey) {
        setLastEvaluatedKey(lastEvaluatedKey);
        return this;
    }

    public QueryResult addLastEvaluatedKeyEntry(String key, AttributeValue value) {
        if (null == this.lastEvaluatedKey) {
            this.lastEvaluatedKey = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.lastEvaluatedKey.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.lastEvaluatedKey.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LastEvaluatedKey.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult clearLastEvaluatedKeyEntries() {
        this.lastEvaluatedKey = null;
        return this;
    }

    /**
     * <p>
     * The capacity units consumed by the <code>Query</code> operation. The data returned includes the total provisioned
     * throughput consumed, along with statistics for the table and any indexes involved in the operation.
     * <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code> parameter was specified
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param consumedCapacity
     *        The capacity units consumed by the <code>Query</code> operation. The data returned includes the total
     *        provisioned throughput consumed, along with statistics for the table and any indexes involved in the
     *        operation. <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code>
     *        parameter was specified For more information, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     *        >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
    }

    /**
     * <p>
     * The capacity units consumed by the <code>Query</code> operation. The data returned includes the total provisioned
     * throughput consumed, along with statistics for the table and any indexes involved in the operation.
     * <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code> parameter was specified
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return The capacity units consumed by the <code>Query</code> operation. The data returned includes the total
     *         provisioned throughput consumed, along with statistics for the table and any indexes involved in the
     *         operation. <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code>
     *         parameter was specified For more information, see <a
     *         href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     *         >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public ConsumedCapacity getConsumedCapacity() {
        return this.consumedCapacity;
    }

    /**
     * <p>
     * The capacity units consumed by the <code>Query</code> operation. The data returned includes the total provisioned
     * throughput consumed, along with statistics for the table and any indexes involved in the operation.
     * <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code> parameter was specified
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param consumedCapacity
     *        The capacity units consumed by the <code>Query</code> operation. The data returned includes the total
     *        provisioned throughput consumed, along with statistics for the table and any indexes involved in the
     *        operation. <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code>
     *        parameter was specified For more information, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     *        >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
        setConsumedCapacity(consumedCapacity);
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
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getScannedCount() != null)
            sb.append("ScannedCount: ").append(getScannedCount()).append(",");
        if (getLastEvaluatedKey() != null)
            sb.append("LastEvaluatedKey: ").append(getLastEvaluatedKey()).append(",");
        if (getConsumedCapacity() != null)
            sb.append("ConsumedCapacity: ").append(getConsumedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryResult == false)
            return false;
        QueryResult other = (QueryResult) obj;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getScannedCount() == null ^ this.getScannedCount() == null)
            return false;
        if (other.getScannedCount() != null && other.getScannedCount().equals(this.getScannedCount()) == false)
            return false;
        if (other.getLastEvaluatedKey() == null ^ this.getLastEvaluatedKey() == null)
            return false;
        if (other.getLastEvaluatedKey() != null && other.getLastEvaluatedKey().equals(this.getLastEvaluatedKey()) == false)
            return false;
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null)
            return false;
        if (other.getConsumedCapacity() != null && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getScannedCount() == null) ? 0 : getScannedCount().hashCode());
        hashCode = prime * hashCode + ((getLastEvaluatedKey() == null) ? 0 : getLastEvaluatedKey().hashCode());
        hashCode = prime * hashCode + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode());
        return hashCode;
    }

    @Override
    public QueryResult clone() {
        try {
            return (QueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
