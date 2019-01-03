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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TransactWriteItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransactWriteItemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An ordered array of up to 10 <code>TransactWriteItem</code> objects, each of which contains a
     * <code>ConditionCheck</code>, <code>Put</code>, <code>Update</code>, or <code>Delete</code> object. These can
     * operate on items in different tables, but the tables must reside in the same AWS account and region, and no two
     * of them can operate on the same item.
     * </p>
     */
    private java.util.List<TransactWriteItem> transactItems;

    private String returnConsumedCapacity;
    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections (if any), that were modified during the operation and are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     */
    private String returnItemCollectionMetrics;
    /**
     * <p>
     * Providing a <code>ClientRequestToken</code> makes the call to <code>TransactWriteItems</code> idempotent, meaning
     * that multiple identical calls have the same effect as one single call.
     * </p>
     * <p>
     * Although multiple identical calls using the same client request token produce the same result on the server (no
     * side effects), the responses to the calls may not be the same. If the <code>ReturnConsumedCapacity&gt;</code>
     * parameter is set, then the initial <code>TransactWriteItems</code> call returns the amount of write capacity
     * units consumed in making the changes, and subsequent <code>TransactWriteItems</code> calls with the same client
     * token return the amount of read capacity units consumed in reading the item.
     * </p>
     * <p>
     * A client request token is valid for 10 minutes after the first request that uses it completes. After 10 minutes,
     * any request with the same client token is treated as a new request. Do not resubmit the same request with the
     * same client token for more than 10 minutes or the result may not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 10 minute
     * idempotency window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * An ordered array of up to 10 <code>TransactWriteItem</code> objects, each of which contains a
     * <code>ConditionCheck</code>, <code>Put</code>, <code>Update</code>, or <code>Delete</code> object. These can
     * operate on items in different tables, but the tables must reside in the same AWS account and region, and no two
     * of them can operate on the same item.
     * </p>
     * 
     * @return An ordered array of up to 10 <code>TransactWriteItem</code> objects, each of which contains a
     *         <code>ConditionCheck</code>, <code>Put</code>, <code>Update</code>, or <code>Delete</code> object. These
     *         can operate on items in different tables, but the tables must reside in the same AWS account and region,
     *         and no two of them can operate on the same item.
     */

    public java.util.List<TransactWriteItem> getTransactItems() {
        return transactItems;
    }

    /**
     * <p>
     * An ordered array of up to 10 <code>TransactWriteItem</code> objects, each of which contains a
     * <code>ConditionCheck</code>, <code>Put</code>, <code>Update</code>, or <code>Delete</code> object. These can
     * operate on items in different tables, but the tables must reside in the same AWS account and region, and no two
     * of them can operate on the same item.
     * </p>
     * 
     * @param transactItems
     *        An ordered array of up to 10 <code>TransactWriteItem</code> objects, each of which contains a
     *        <code>ConditionCheck</code>, <code>Put</code>, <code>Update</code>, or <code>Delete</code> object. These
     *        can operate on items in different tables, but the tables must reside in the same AWS account and region,
     *        and no two of them can operate on the same item.
     */

    public void setTransactItems(java.util.Collection<TransactWriteItem> transactItems) {
        if (transactItems == null) {
            this.transactItems = null;
            return;
        }

        this.transactItems = new java.util.ArrayList<TransactWriteItem>(transactItems);
    }

    /**
     * <p>
     * An ordered array of up to 10 <code>TransactWriteItem</code> objects, each of which contains a
     * <code>ConditionCheck</code>, <code>Put</code>, <code>Update</code>, or <code>Delete</code> object. These can
     * operate on items in different tables, but the tables must reside in the same AWS account and region, and no two
     * of them can operate on the same item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransactItems(java.util.Collection)} or {@link #withTransactItems(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param transactItems
     *        An ordered array of up to 10 <code>TransactWriteItem</code> objects, each of which contains a
     *        <code>ConditionCheck</code>, <code>Put</code>, <code>Update</code>, or <code>Delete</code> object. These
     *        can operate on items in different tables, but the tables must reside in the same AWS account and region,
     *        and no two of them can operate on the same item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactWriteItemsRequest withTransactItems(TransactWriteItem... transactItems) {
        if (this.transactItems == null) {
            setTransactItems(new java.util.ArrayList<TransactWriteItem>(transactItems.length));
        }
        for (TransactWriteItem ele : transactItems) {
            this.transactItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An ordered array of up to 10 <code>TransactWriteItem</code> objects, each of which contains a
     * <code>ConditionCheck</code>, <code>Put</code>, <code>Update</code>, or <code>Delete</code> object. These can
     * operate on items in different tables, but the tables must reside in the same AWS account and region, and no two
     * of them can operate on the same item.
     * </p>
     * 
     * @param transactItems
     *        An ordered array of up to 10 <code>TransactWriteItem</code> objects, each of which contains a
     *        <code>ConditionCheck</code>, <code>Put</code>, <code>Update</code>, or <code>Delete</code> object. These
     *        can operate on items in different tables, but the tables must reside in the same AWS account and region,
     *        and no two of them can operate on the same item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactWriteItemsRequest withTransactItems(java.util.Collection<TransactWriteItem> transactItems) {
        setTransactItems(transactItems);
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

    public TransactWriteItemsRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        setReturnConsumedCapacity(returnConsumedCapacity);
        return this;
    }

    /**
     * @param returnConsumedCapacity
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnConsumedCapacity
     */

    public TransactWriteItemsRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections (if any), that were modified during the operation and are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     * 
     * @param returnItemCollectionMetrics
     *        Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response
     *        includes statistics about item collections (if any), that were modified during the operation and are
     *        returned in the response. If set to <code>NONE</code> (the default), no statistics are returned.
     * @see ReturnItemCollectionMetrics
     */

    public void setReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections (if any), that were modified during the operation and are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     * 
     * @return Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response
     *         includes statistics about item collections (if any), that were modified during the operation and are
     *         returned in the response. If set to <code>NONE</code> (the default), no statistics are returned.
     * @see ReturnItemCollectionMetrics
     */

    public String getReturnItemCollectionMetrics() {
        return this.returnItemCollectionMetrics;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections (if any), that were modified during the operation and are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     * 
     * @param returnItemCollectionMetrics
     *        Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response
     *        includes statistics about item collections (if any), that were modified during the operation and are
     *        returned in the response. If set to <code>NONE</code> (the default), no statistics are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnItemCollectionMetrics
     */

    public TransactWriteItemsRequest withReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        setReturnItemCollectionMetrics(returnItemCollectionMetrics);
        return this;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections (if any), that were modified during the operation and are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     * 
     * @param returnItemCollectionMetrics
     *        Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response
     *        includes statistics about item collections (if any), that were modified during the operation and are
     *        returned in the response. If set to <code>NONE</code> (the default), no statistics are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnItemCollectionMetrics
     */

    public TransactWriteItemsRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
        return this;
    }

    /**
     * <p>
     * Providing a <code>ClientRequestToken</code> makes the call to <code>TransactWriteItems</code> idempotent, meaning
     * that multiple identical calls have the same effect as one single call.
     * </p>
     * <p>
     * Although multiple identical calls using the same client request token produce the same result on the server (no
     * side effects), the responses to the calls may not be the same. If the <code>ReturnConsumedCapacity&gt;</code>
     * parameter is set, then the initial <code>TransactWriteItems</code> call returns the amount of write capacity
     * units consumed in making the changes, and subsequent <code>TransactWriteItems</code> calls with the same client
     * token return the amount of read capacity units consumed in reading the item.
     * </p>
     * <p>
     * A client request token is valid for 10 minutes after the first request that uses it completes. After 10 minutes,
     * any request with the same client token is treated as a new request. Do not resubmit the same request with the
     * same client token for more than 10 minutes or the result may not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 10 minute
     * idempotency window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * </p>
     * 
     * @param clientRequestToken
     *        Providing a <code>ClientRequestToken</code> makes the call to <code>TransactWriteItems</code> idempotent,
     *        meaning that multiple identical calls have the same effect as one single call.</p>
     *        <p>
     *        Although multiple identical calls using the same client request token produce the same result on the
     *        server (no side effects), the responses to the calls may not be the same. If the
     *        <code>ReturnConsumedCapacity&gt;</code> parameter is set, then the initial <code>TransactWriteItems</code>
     *        call returns the amount of write capacity units consumed in making the changes, and subsequent
     *        <code>TransactWriteItems</code> calls with the same client token return the amount of read capacity units
     *        consumed in reading the item.
     *        </p>
     *        <p>
     *        A client request token is valid for 10 minutes after the first request that uses it completes. After 10
     *        minutes, any request with the same client token is treated as a new request. Do not resubmit the same
     *        request with the same client token for more than 10 minutes or the result may not be idempotent.
     *        </p>
     *        <p>
     *        If you submit a request with the same client token but a change in other parameters within the 10 minute
     *        idempotency window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Providing a <code>ClientRequestToken</code> makes the call to <code>TransactWriteItems</code> idempotent, meaning
     * that multiple identical calls have the same effect as one single call.
     * </p>
     * <p>
     * Although multiple identical calls using the same client request token produce the same result on the server (no
     * side effects), the responses to the calls may not be the same. If the <code>ReturnConsumedCapacity&gt;</code>
     * parameter is set, then the initial <code>TransactWriteItems</code> call returns the amount of write capacity
     * units consumed in making the changes, and subsequent <code>TransactWriteItems</code> calls with the same client
     * token return the amount of read capacity units consumed in reading the item.
     * </p>
     * <p>
     * A client request token is valid for 10 minutes after the first request that uses it completes. After 10 minutes,
     * any request with the same client token is treated as a new request. Do not resubmit the same request with the
     * same client token for more than 10 minutes or the result may not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 10 minute
     * idempotency window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * </p>
     * 
     * @return Providing a <code>ClientRequestToken</code> makes the call to <code>TransactWriteItems</code> idempotent,
     *         meaning that multiple identical calls have the same effect as one single call.</p>
     *         <p>
     *         Although multiple identical calls using the same client request token produce the same result on the
     *         server (no side effects), the responses to the calls may not be the same. If the
     *         <code>ReturnConsumedCapacity&gt;</code> parameter is set, then the initial
     *         <code>TransactWriteItems</code> call returns the amount of write capacity units consumed in making the
     *         changes, and subsequent <code>TransactWriteItems</code> calls with the same client token return the
     *         amount of read capacity units consumed in reading the item.
     *         </p>
     *         <p>
     *         A client request token is valid for 10 minutes after the first request that uses it completes. After 10
     *         minutes, any request with the same client token is treated as a new request. Do not resubmit the same
     *         request with the same client token for more than 10 minutes or the result may not be idempotent.
     *         </p>
     *         <p>
     *         If you submit a request with the same client token but a change in other parameters within the 10 minute
     *         idempotency window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Providing a <code>ClientRequestToken</code> makes the call to <code>TransactWriteItems</code> idempotent, meaning
     * that multiple identical calls have the same effect as one single call.
     * </p>
     * <p>
     * Although multiple identical calls using the same client request token produce the same result on the server (no
     * side effects), the responses to the calls may not be the same. If the <code>ReturnConsumedCapacity&gt;</code>
     * parameter is set, then the initial <code>TransactWriteItems</code> call returns the amount of write capacity
     * units consumed in making the changes, and subsequent <code>TransactWriteItems</code> calls with the same client
     * token return the amount of read capacity units consumed in reading the item.
     * </p>
     * <p>
     * A client request token is valid for 10 minutes after the first request that uses it completes. After 10 minutes,
     * any request with the same client token is treated as a new request. Do not resubmit the same request with the
     * same client token for more than 10 minutes or the result may not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 10 minute
     * idempotency window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * </p>
     * 
     * @param clientRequestToken
     *        Providing a <code>ClientRequestToken</code> makes the call to <code>TransactWriteItems</code> idempotent,
     *        meaning that multiple identical calls have the same effect as one single call.</p>
     *        <p>
     *        Although multiple identical calls using the same client request token produce the same result on the
     *        server (no side effects), the responses to the calls may not be the same. If the
     *        <code>ReturnConsumedCapacity&gt;</code> parameter is set, then the initial <code>TransactWriteItems</code>
     *        call returns the amount of write capacity units consumed in making the changes, and subsequent
     *        <code>TransactWriteItems</code> calls with the same client token return the amount of read capacity units
     *        consumed in reading the item.
     *        </p>
     *        <p>
     *        A client request token is valid for 10 minutes after the first request that uses it completes. After 10
     *        minutes, any request with the same client token is treated as a new request. Do not resubmit the same
     *        request with the same client token for more than 10 minutes or the result may not be idempotent.
     *        </p>
     *        <p>
     *        If you submit a request with the same client token but a change in other parameters within the 10 minute
     *        idempotency window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactWriteItemsRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getTransactItems() != null)
            sb.append("TransactItems: ").append(getTransactItems()).append(",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: ").append(getReturnConsumedCapacity()).append(",");
        if (getReturnItemCollectionMetrics() != null)
            sb.append("ReturnItemCollectionMetrics: ").append(getReturnItemCollectionMetrics()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransactWriteItemsRequest == false)
            return false;
        TransactWriteItemsRequest other = (TransactWriteItemsRequest) obj;
        if (other.getTransactItems() == null ^ this.getTransactItems() == null)
            return false;
        if (other.getTransactItems() != null && other.getTransactItems().equals(this.getTransactItems()) == false)
            return false;
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null)
            return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false)
            return false;
        if (other.getReturnItemCollectionMetrics() == null ^ this.getReturnItemCollectionMetrics() == null)
            return false;
        if (other.getReturnItemCollectionMetrics() != null && other.getReturnItemCollectionMetrics().equals(this.getReturnItemCollectionMetrics()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransactItems() == null) ? 0 : getTransactItems().hashCode());
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode());
        hashCode = prime * hashCode + ((getReturnItemCollectionMetrics() == null) ? 0 : getReturnItemCollectionMetrics().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public TransactWriteItemsRequest clone() {
        return (TransactWriteItemsRequest) super.clone();
    }

}
