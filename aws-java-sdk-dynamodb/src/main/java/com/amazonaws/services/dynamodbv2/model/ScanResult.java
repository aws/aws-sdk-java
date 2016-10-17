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

/**
 * <p>
 * Represents the output of a <i>Scan</i> operation.
 * </p>
 */
public class ScanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of item attributes that match the scan criteria. Each element in this array consists of an attribute
     * name and the value for that attribute.
     * </p>
     */
    private java.util.List<java.util.Map<String, AttributeValue>> items;
    /**
     * <p>
     * The number of items in the response.
     * </p>
     * <p>
     * If you set <i>ScanFilter</i> in the request, then <i>Count</i> is the number of items returned after the filter
     * was applied, and <i>ScannedCount</i> is the number of matching items before the filter was applied.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <i>Count</i> is the same as <i>ScannedCount</i>.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The number of items evaluated, before any <i>ScanFilter</i> is applied. A high <i>ScannedCount</i> value with
     * few, or no, <i>Count</i> results indicates an inefficient <i>Scan</i> operation. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
     * ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <i>ScannedCount</i> is the same as <i>Count</i>.
     * </p>
     */
    private Integer scannedCount;
    /**
     * <p>
     * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request.
     * </p>
     * <p>
     * If <i>LastEvaluatedKey</i> is empty, then the "last page" of results has been processed and there is no more data
     * to be retrieved.
     * </p>
     * <p>
     * If <i>LastEvaluatedKey</i> is not empty, it does not necessarily mean that there is more data in the result set.
     * The only way to know when you have reached the end of the result set is when <i>LastEvaluatedKey</i> is empty.
     * </p>
     */
    private java.util.Map<String, AttributeValue> lastEvaluatedKey;

    private ConsumedCapacity consumedCapacity;

    /**
     * <p>
     * An array of item attributes that match the scan criteria. Each element in this array consists of an attribute
     * name and the value for that attribute.
     * </p>
     * 
     * @return An array of item attributes that match the scan criteria. Each element in this array consists of an
     *         attribute name and the value for that attribute.
     */

    public java.util.List<java.util.Map<String, AttributeValue>> getItems() {
        return items;
    }

    /**
     * <p>
     * An array of item attributes that match the scan criteria. Each element in this array consists of an attribute
     * name and the value for that attribute.
     * </p>
     * 
     * @param items
     *        An array of item attributes that match the scan criteria. Each element in this array consists of an
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
     * An array of item attributes that match the scan criteria. Each element in this array consists of an attribute
     * name and the value for that attribute.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        An array of item attributes that match the scan criteria. Each element in this array consists of an
     *        attribute name and the value for that attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanResult withItems(java.util.Map<String, AttributeValue>... items) {
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
     * An array of item attributes that match the scan criteria. Each element in this array consists of an attribute
     * name and the value for that attribute.
     * </p>
     * 
     * @param items
     *        An array of item attributes that match the scan criteria. Each element in this array consists of an
     *        attribute name and the value for that attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanResult withItems(java.util.Collection<java.util.Map<String, AttributeValue>> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The number of items in the response.
     * </p>
     * <p>
     * If you set <i>ScanFilter</i> in the request, then <i>Count</i> is the number of items returned after the filter
     * was applied, and <i>ScannedCount</i> is the number of matching items before the filter was applied.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <i>Count</i> is the same as <i>ScannedCount</i>.
     * </p>
     * 
     * @param count
     *        The number of items in the response.</p>
     *        <p>
     *        If you set <i>ScanFilter</i> in the request, then <i>Count</i> is the number of items returned after the
     *        filter was applied, and <i>ScannedCount</i> is the number of matching items before the filter was applied.
     *        </p>
     *        <p>
     *        If you did not use a filter in the request, then <i>Count</i> is the same as <i>ScannedCount</i>.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of items in the response.
     * </p>
     * <p>
     * If you set <i>ScanFilter</i> in the request, then <i>Count</i> is the number of items returned after the filter
     * was applied, and <i>ScannedCount</i> is the number of matching items before the filter was applied.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <i>Count</i> is the same as <i>ScannedCount</i>.
     * </p>
     * 
     * @return The number of items in the response.</p>
     *         <p>
     *         If you set <i>ScanFilter</i> in the request, then <i>Count</i> is the number of items returned after the
     *         filter was applied, and <i>ScannedCount</i> is the number of matching items before the filter was
     *         applied.
     *         </p>
     *         <p>
     *         If you did not use a filter in the request, then <i>Count</i> is the same as <i>ScannedCount</i>.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of items in the response.
     * </p>
     * <p>
     * If you set <i>ScanFilter</i> in the request, then <i>Count</i> is the number of items returned after the filter
     * was applied, and <i>ScannedCount</i> is the number of matching items before the filter was applied.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <i>Count</i> is the same as <i>ScannedCount</i>.
     * </p>
     * 
     * @param count
     *        The number of items in the response.</p>
     *        <p>
     *        If you set <i>ScanFilter</i> in the request, then <i>Count</i> is the number of items returned after the
     *        filter was applied, and <i>ScannedCount</i> is the number of matching items before the filter was applied.
     *        </p>
     *        <p>
     *        If you did not use a filter in the request, then <i>Count</i> is the same as <i>ScannedCount</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanResult withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The number of items evaluated, before any <i>ScanFilter</i> is applied. A high <i>ScannedCount</i> value with
     * few, or no, <i>Count</i> results indicates an inefficient <i>Scan</i> operation. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
     * ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <i>ScannedCount</i> is the same as <i>Count</i>.
     * </p>
     * 
     * @param scannedCount
     *        The number of items evaluated, before any <i>ScanFilter</i> is applied. A high <i>ScannedCount</i> value
     *        with few, or no, <i>Count</i> results indicates an inefficient <i>Scan</i> operation. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
     *        ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
     *        <p>
     *        If you did not use a filter in the request, then <i>ScannedCount</i> is the same as <i>Count</i>.
     */

    public void setScannedCount(Integer scannedCount) {
        this.scannedCount = scannedCount;
    }

    /**
     * <p>
     * The number of items evaluated, before any <i>ScanFilter</i> is applied. A high <i>ScannedCount</i> value with
     * few, or no, <i>Count</i> results indicates an inefficient <i>Scan</i> operation. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
     * ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <i>ScannedCount</i> is the same as <i>Count</i>.
     * </p>
     * 
     * @return The number of items evaluated, before any <i>ScanFilter</i> is applied. A high <i>ScannedCount</i> value
     *         with few, or no, <i>Count</i> results indicates an inefficient <i>Scan</i> operation. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
     *         ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
     *         <p>
     *         If you did not use a filter in the request, then <i>ScannedCount</i> is the same as <i>Count</i>.
     */

    public Integer getScannedCount() {
        return this.scannedCount;
    }

    /**
     * <p>
     * The number of items evaluated, before any <i>ScanFilter</i> is applied. A high <i>ScannedCount</i> value with
     * few, or no, <i>Count</i> results indicates an inefficient <i>Scan</i> operation. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
     * ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <i>ScannedCount</i> is the same as <i>Count</i>.
     * </p>
     * 
     * @param scannedCount
     *        The number of items evaluated, before any <i>ScanFilter</i> is applied. A high <i>ScannedCount</i> value
     *        with few, or no, <i>Count</i> results indicates an inefficient <i>Scan</i> operation. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
     *        ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
     *        <p>
     *        If you did not use a filter in the request, then <i>ScannedCount</i> is the same as <i>Count</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanResult withScannedCount(Integer scannedCount) {
        setScannedCount(scannedCount);
        return this;
    }

    /**
     * <p>
     * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request.
     * </p>
     * <p>
     * If <i>LastEvaluatedKey</i> is empty, then the "last page" of results has been processed and there is no more data
     * to be retrieved.
     * </p>
     * <p>
     * If <i>LastEvaluatedKey</i> is not empty, it does not necessarily mean that there is more data in the result set.
     * The only way to know when you have reached the end of the result set is when <i>LastEvaluatedKey</i> is empty.
     * </p>
     * 
     * @return The primary key of the item where the operation stopped, inclusive of the previous result set. Use this
     *         value to start a new operation, excluding this value in the new request.</p>
     *         <p>
     *         If <i>LastEvaluatedKey</i> is empty, then the "last page" of results has been processed and there is no
     *         more data to be retrieved.
     *         </p>
     *         <p>
     *         If <i>LastEvaluatedKey</i> is not empty, it does not necessarily mean that there is more data in the
     *         result set. The only way to know when you have reached the end of the result set is when
     *         <i>LastEvaluatedKey</i> is empty.
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
     * If <i>LastEvaluatedKey</i> is empty, then the "last page" of results has been processed and there is no more data
     * to be retrieved.
     * </p>
     * <p>
     * If <i>LastEvaluatedKey</i> is not empty, it does not necessarily mean that there is more data in the result set.
     * The only way to know when you have reached the end of the result set is when <i>LastEvaluatedKey</i> is empty.
     * </p>
     * 
     * @param lastEvaluatedKey
     *        The primary key of the item where the operation stopped, inclusive of the previous result set. Use this
     *        value to start a new operation, excluding this value in the new request.</p>
     *        <p>
     *        If <i>LastEvaluatedKey</i> is empty, then the "last page" of results has been processed and there is no
     *        more data to be retrieved.
     *        </p>
     *        <p>
     *        If <i>LastEvaluatedKey</i> is not empty, it does not necessarily mean that there is more data in the
     *        result set. The only way to know when you have reached the end of the result set is when
     *        <i>LastEvaluatedKey</i> is empty.
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
     * If <i>LastEvaluatedKey</i> is empty, then the "last page" of results has been processed and there is no more data
     * to be retrieved.
     * </p>
     * <p>
     * If <i>LastEvaluatedKey</i> is not empty, it does not necessarily mean that there is more data in the result set.
     * The only way to know when you have reached the end of the result set is when <i>LastEvaluatedKey</i> is empty.
     * </p>
     * 
     * @param lastEvaluatedKey
     *        The primary key of the item where the operation stopped, inclusive of the previous result set. Use this
     *        value to start a new operation, excluding this value in the new request.</p>
     *        <p>
     *        If <i>LastEvaluatedKey</i> is empty, then the "last page" of results has been processed and there is no
     *        more data to be retrieved.
     *        </p>
     *        <p>
     *        If <i>LastEvaluatedKey</i> is not empty, it does not necessarily mean that there is more data in the
     *        result set. The only way to know when you have reached the end of the result set is when
     *        <i>LastEvaluatedKey</i> is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanResult withLastEvaluatedKey(java.util.Map<String, AttributeValue> lastEvaluatedKey) {
        setLastEvaluatedKey(lastEvaluatedKey);
        return this;
    }

    public ScanResult addLastEvaluatedKeyEntry(String key, AttributeValue value) {
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

    public ScanResult clearLastEvaluatedKeyEntries() {
        this.lastEvaluatedKey = null;
        return this;
    }

    /**
     * @param consumedCapacity
     */

    public void setConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
    }

    /**
     * @return
     */

    public ConsumedCapacity getConsumedCapacity() {
        return this.consumedCapacity;
    }

    /**
     * @param consumedCapacity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
        setConsumedCapacity(consumedCapacity);
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
        if (getItems() != null)
            sb.append("Items: " + getItems() + ",");
        if (getCount() != null)
            sb.append("Count: " + getCount() + ",");
        if (getScannedCount() != null)
            sb.append("ScannedCount: " + getScannedCount() + ",");
        if (getLastEvaluatedKey() != null)
            sb.append("LastEvaluatedKey: " + getLastEvaluatedKey() + ",");
        if (getConsumedCapacity() != null)
            sb.append("ConsumedCapacity: " + getConsumedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanResult == false)
            return false;
        ScanResult other = (ScanResult) obj;
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
    public ScanResult clone() {
        try {
            return (ScanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
