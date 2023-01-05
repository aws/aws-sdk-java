/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ExecuteStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteStatementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If a read operation was used, this property will contain the result of the read operation; a map of attribute
     * names and their values. For the write operations this value will be empty.
     * </p>
     */
    private java.util.List<java.util.Map<String, AttributeValue>> items;
    /**
     * <p>
     * If the response of a read request exceeds the response payload limit DynamoDB will set this value in the
     * response. If set, you can use that this value in the subsequent request to get the remaining results.
     * </p>
     */
    private String nextToken;

    private ConsumedCapacity consumedCapacity;
    /**
     * <p>
     * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request. If <code>LastEvaluatedKey</code> is empty, then
     * the "last page" of results has been processed and there is no more data to be retrieved. If
     * <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the result
     * set. The only way to know when you have reached the end of the result set is when <code>LastEvaluatedKey</code>
     * is empty.
     * </p>
     */
    private java.util.Map<String, AttributeValue> lastEvaluatedKey;

    /**
     * <p>
     * If a read operation was used, this property will contain the result of the read operation; a map of attribute
     * names and their values. For the write operations this value will be empty.
     * </p>
     * 
     * @return If a read operation was used, this property will contain the result of the read operation; a map of
     *         attribute names and their values. For the write operations this value will be empty.
     */

    public java.util.List<java.util.Map<String, AttributeValue>> getItems() {
        return items;
    }

    /**
     * <p>
     * If a read operation was used, this property will contain the result of the read operation; a map of attribute
     * names and their values. For the write operations this value will be empty.
     * </p>
     * 
     * @param items
     *        If a read operation was used, this property will contain the result of the read operation; a map of
     *        attribute names and their values. For the write operations this value will be empty.
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
     * If a read operation was used, this property will contain the result of the read operation; a map of attribute
     * names and their values. For the write operations this value will be empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        If a read operation was used, this property will contain the result of the read operation; a map of
     *        attribute names and their values. For the write operations this value will be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withItems(java.util.Map<String, AttributeValue>... items) {
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
     * If a read operation was used, this property will contain the result of the read operation; a map of attribute
     * names and their values. For the write operations this value will be empty.
     * </p>
     * 
     * @param items
     *        If a read operation was used, this property will contain the result of the read operation; a map of
     *        attribute names and their values. For the write operations this value will be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withItems(java.util.Collection<java.util.Map<String, AttributeValue>> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * If the response of a read request exceeds the response payload limit DynamoDB will set this value in the
     * response. If set, you can use that this value in the subsequent request to get the remaining results.
     * </p>
     * 
     * @param nextToken
     *        If the response of a read request exceeds the response payload limit DynamoDB will set this value in the
     *        response. If set, you can use that this value in the subsequent request to get the remaining results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response of a read request exceeds the response payload limit DynamoDB will set this value in the
     * response. If set, you can use that this value in the subsequent request to get the remaining results.
     * </p>
     * 
     * @return If the response of a read request exceeds the response payload limit DynamoDB will set this value in the
     *         response. If set, you can use that this value in the subsequent request to get the remaining results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response of a read request exceeds the response payload limit DynamoDB will set this value in the
     * response. If set, you can use that this value in the subsequent request to get the remaining results.
     * </p>
     * 
     * @param nextToken
     *        If the response of a read request exceeds the response payload limit DynamoDB will set this value in the
     *        response. If set, you can use that this value in the subsequent request to get the remaining results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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

    public ExecuteStatementResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
        setConsumedCapacity(consumedCapacity);
        return this;
    }

    /**
     * <p>
     * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request. If <code>LastEvaluatedKey</code> is empty, then
     * the "last page" of results has been processed and there is no more data to be retrieved. If
     * <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the result
     * set. The only way to know when you have reached the end of the result set is when <code>LastEvaluatedKey</code>
     * is empty.
     * </p>
     * 
     * @return The primary key of the item where the operation stopped, inclusive of the previous result set. Use this
     *         value to start a new operation, excluding this value in the new request. If <code>LastEvaluatedKey</code>
     *         is empty, then the "last page" of results has been processed and there is no more data to be retrieved.
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
     * start a new operation, excluding this value in the new request. If <code>LastEvaluatedKey</code> is empty, then
     * the "last page" of results has been processed and there is no more data to be retrieved. If
     * <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the result
     * set. The only way to know when you have reached the end of the result set is when <code>LastEvaluatedKey</code>
     * is empty.
     * </p>
     * 
     * @param lastEvaluatedKey
     *        The primary key of the item where the operation stopped, inclusive of the previous result set. Use this
     *        value to start a new operation, excluding this value in the new request. If <code>LastEvaluatedKey</code>
     *        is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If
     *        <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the
     *        result set. The only way to know when you have reached the end of the result set is when
     *        <code>LastEvaluatedKey</code> is empty.
     */

    public void setLastEvaluatedKey(java.util.Map<String, AttributeValue> lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
    }

    /**
     * <p>
     * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request. If <code>LastEvaluatedKey</code> is empty, then
     * the "last page" of results has been processed and there is no more data to be retrieved. If
     * <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the result
     * set. The only way to know when you have reached the end of the result set is when <code>LastEvaluatedKey</code>
     * is empty.
     * </p>
     * 
     * @param lastEvaluatedKey
     *        The primary key of the item where the operation stopped, inclusive of the previous result set. Use this
     *        value to start a new operation, excluding this value in the new request. If <code>LastEvaluatedKey</code>
     *        is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If
     *        <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the
     *        result set. The only way to know when you have reached the end of the result set is when
     *        <code>LastEvaluatedKey</code> is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withLastEvaluatedKey(java.util.Map<String, AttributeValue> lastEvaluatedKey) {
        setLastEvaluatedKey(lastEvaluatedKey);
        return this;
    }

    /**
     * Add a single LastEvaluatedKey entry
     *
     * @see ExecuteStatementResult#withLastEvaluatedKey
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult addLastEvaluatedKeyEntry(String key, AttributeValue value) {
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

    public ExecuteStatementResult clearLastEvaluatedKeyEntries() {
        this.lastEvaluatedKey = null;
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getConsumedCapacity() != null)
            sb.append("ConsumedCapacity: ").append(getConsumedCapacity()).append(",");
        if (getLastEvaluatedKey() != null)
            sb.append("LastEvaluatedKey: ").append(getLastEvaluatedKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteStatementResult == false)
            return false;
        ExecuteStatementResult other = (ExecuteStatementResult) obj;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null)
            return false;
        if (other.getConsumedCapacity() != null && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false)
            return false;
        if (other.getLastEvaluatedKey() == null ^ this.getLastEvaluatedKey() == null)
            return false;
        if (other.getLastEvaluatedKey() != null && other.getLastEvaluatedKey().equals(this.getLastEvaluatedKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode());
        hashCode = prime * hashCode + ((getLastEvaluatedKey() == null) ? 0 : getLastEvaluatedKey().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteStatementResult clone() {
        try {
            return (ExecuteStatementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
