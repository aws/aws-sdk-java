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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TransactGetItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransactGetItemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An ordered array of up to 10 <code>TransactGetItem</code> objects, each of which contains a <code>Get</code>
     * structure.
     * </p>
     */
    private java.util.List<TransactGetItem> transactItems;
    /**
     * <p>
     * A value of <code>TOTAL</code> causes consumed capacity information to be returned, and a value of
     * <code>NONE</code> prevents that information from being returned. No other value is valid.
     * </p>
     */
    private String returnConsumedCapacity;

    /**
     * <p>
     * An ordered array of up to 10 <code>TransactGetItem</code> objects, each of which contains a <code>Get</code>
     * structure.
     * </p>
     * 
     * @return An ordered array of up to 10 <code>TransactGetItem</code> objects, each of which contains a
     *         <code>Get</code> structure.
     */

    public java.util.List<TransactGetItem> getTransactItems() {
        return transactItems;
    }

    /**
     * <p>
     * An ordered array of up to 10 <code>TransactGetItem</code> objects, each of which contains a <code>Get</code>
     * structure.
     * </p>
     * 
     * @param transactItems
     *        An ordered array of up to 10 <code>TransactGetItem</code> objects, each of which contains a
     *        <code>Get</code> structure.
     */

    public void setTransactItems(java.util.Collection<TransactGetItem> transactItems) {
        if (transactItems == null) {
            this.transactItems = null;
            return;
        }

        this.transactItems = new java.util.ArrayList<TransactGetItem>(transactItems);
    }

    /**
     * <p>
     * An ordered array of up to 10 <code>TransactGetItem</code> objects, each of which contains a <code>Get</code>
     * structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransactItems(java.util.Collection)} or {@link #withTransactItems(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param transactItems
     *        An ordered array of up to 10 <code>TransactGetItem</code> objects, each of which contains a
     *        <code>Get</code> structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactGetItemsRequest withTransactItems(TransactGetItem... transactItems) {
        if (this.transactItems == null) {
            setTransactItems(new java.util.ArrayList<TransactGetItem>(transactItems.length));
        }
        for (TransactGetItem ele : transactItems) {
            this.transactItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An ordered array of up to 10 <code>TransactGetItem</code> objects, each of which contains a <code>Get</code>
     * structure.
     * </p>
     * 
     * @param transactItems
     *        An ordered array of up to 10 <code>TransactGetItem</code> objects, each of which contains a
     *        <code>Get</code> structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactGetItemsRequest withTransactItems(java.util.Collection<TransactGetItem> transactItems) {
        setTransactItems(transactItems);
        return this;
    }

    /**
     * <p>
     * A value of <code>TOTAL</code> causes consumed capacity information to be returned, and a value of
     * <code>NONE</code> prevents that information from being returned. No other value is valid.
     * </p>
     * 
     * @param returnConsumedCapacity
     *        A value of <code>TOTAL</code> causes consumed capacity information to be returned, and a value of
     *        <code>NONE</code> prevents that information from being returned. No other value is valid.
     * @see ReturnConsumedCapacity
     */

    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }

    /**
     * <p>
     * A value of <code>TOTAL</code> causes consumed capacity information to be returned, and a value of
     * <code>NONE</code> prevents that information from being returned. No other value is valid.
     * </p>
     * 
     * @return A value of <code>TOTAL</code> causes consumed capacity information to be returned, and a value of
     *         <code>NONE</code> prevents that information from being returned. No other value is valid.
     * @see ReturnConsumedCapacity
     */

    public String getReturnConsumedCapacity() {
        return this.returnConsumedCapacity;
    }

    /**
     * <p>
     * A value of <code>TOTAL</code> causes consumed capacity information to be returned, and a value of
     * <code>NONE</code> prevents that information from being returned. No other value is valid.
     * </p>
     * 
     * @param returnConsumedCapacity
     *        A value of <code>TOTAL</code> causes consumed capacity information to be returned, and a value of
     *        <code>NONE</code> prevents that information from being returned. No other value is valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnConsumedCapacity
     */

    public TransactGetItemsRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        setReturnConsumedCapacity(returnConsumedCapacity);
        return this;
    }

    /**
     * <p>
     * A value of <code>TOTAL</code> causes consumed capacity information to be returned, and a value of
     * <code>NONE</code> prevents that information from being returned. No other value is valid.
     * </p>
     * 
     * @param returnConsumedCapacity
     *        A value of <code>TOTAL</code> causes consumed capacity information to be returned, and a value of
     *        <code>NONE</code> prevents that information from being returned. No other value is valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnConsumedCapacity
     */

    public TransactGetItemsRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
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
            sb.append("ReturnConsumedCapacity: ").append(getReturnConsumedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransactGetItemsRequest == false)
            return false;
        TransactGetItemsRequest other = (TransactGetItemsRequest) obj;
        if (other.getTransactItems() == null ^ this.getTransactItems() == null)
            return false;
        if (other.getTransactItems() != null && other.getTransactItems().equals(this.getTransactItems()) == false)
            return false;
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null)
            return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransactItems() == null) ? 0 : getTransactItems().hashCode());
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode());
        return hashCode;
    }

    @Override
    public TransactGetItemsRequest clone() {
        return (TransactGetItemsRequest) super.clone();
    }

}
