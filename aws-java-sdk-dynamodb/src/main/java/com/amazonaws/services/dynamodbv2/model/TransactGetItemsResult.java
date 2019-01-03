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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TransactGetItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransactGetItemsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this is an array of
     * <code>ConsumedCapacity</code> objects, one for each table addressed by <code>TransactGetItem</code> objects in
     * the <i>TransactItems</i> parameter. These <code>ConsumedCapacity</code> objects report the read-capacity units
     * consumed by the <code>TransactGetItems</code> call in that table.
     * </p>
     */
    private java.util.List<ConsumedCapacity> consumedCapacity;
    /**
     * <p>
     * An ordered array of up to 10 <code>ItemResponse</code> objects, each of which corresponds to the
     * <code>TransactGetItem</code> object in the same position in the <i>TransactItems</i> array. Each
     * <code>ItemResponse</code> object contains a Map of the name-value pairs that are the projected attributes of the
     * requested item.
     * </p>
     * <p>
     * If a requested item could not be retrieved, the corresponding <code>ItemResponse</code> object is Null, or if the
     * requested item has no projected attributes, the corresponding <code>ItemResponse</code> object is an empty Map.
     * </p>
     */
    private java.util.List<ItemResponse> responses;

    /**
     * <p>
     * If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this is an array of
     * <code>ConsumedCapacity</code> objects, one for each table addressed by <code>TransactGetItem</code> objects in
     * the <i>TransactItems</i> parameter. These <code>ConsumedCapacity</code> objects report the read-capacity units
     * consumed by the <code>TransactGetItems</code> call in that table.
     * </p>
     * 
     * @return If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this is an array of
     *         <code>ConsumedCapacity</code> objects, one for each table addressed by <code>TransactGetItem</code>
     *         objects in the <i>TransactItems</i> parameter. These <code>ConsumedCapacity</code> objects report the
     *         read-capacity units consumed by the <code>TransactGetItems</code> call in that table.
     */

    public java.util.List<ConsumedCapacity> getConsumedCapacity() {
        return consumedCapacity;
    }

    /**
     * <p>
     * If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this is an array of
     * <code>ConsumedCapacity</code> objects, one for each table addressed by <code>TransactGetItem</code> objects in
     * the <i>TransactItems</i> parameter. These <code>ConsumedCapacity</code> objects report the read-capacity units
     * consumed by the <code>TransactGetItems</code> call in that table.
     * </p>
     * 
     * @param consumedCapacity
     *        If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this is an array of
     *        <code>ConsumedCapacity</code> objects, one for each table addressed by <code>TransactGetItem</code>
     *        objects in the <i>TransactItems</i> parameter. These <code>ConsumedCapacity</code> objects report the
     *        read-capacity units consumed by the <code>TransactGetItems</code> call in that table.
     */

    public void setConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
        if (consumedCapacity == null) {
            this.consumedCapacity = null;
            return;
        }

        this.consumedCapacity = new java.util.ArrayList<ConsumedCapacity>(consumedCapacity);
    }

    /**
     * <p>
     * If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this is an array of
     * <code>ConsumedCapacity</code> objects, one for each table addressed by <code>TransactGetItem</code> objects in
     * the <i>TransactItems</i> parameter. These <code>ConsumedCapacity</code> objects report the read-capacity units
     * consumed by the <code>TransactGetItems</code> call in that table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConsumedCapacity(java.util.Collection)} or {@link #withConsumedCapacity(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param consumedCapacity
     *        If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this is an array of
     *        <code>ConsumedCapacity</code> objects, one for each table addressed by <code>TransactGetItem</code>
     *        objects in the <i>TransactItems</i> parameter. These <code>ConsumedCapacity</code> objects report the
     *        read-capacity units consumed by the <code>TransactGetItems</code> call in that table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactGetItemsResult withConsumedCapacity(ConsumedCapacity... consumedCapacity) {
        if (this.consumedCapacity == null) {
            setConsumedCapacity(new java.util.ArrayList<ConsumedCapacity>(consumedCapacity.length));
        }
        for (ConsumedCapacity ele : consumedCapacity) {
            this.consumedCapacity.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this is an array of
     * <code>ConsumedCapacity</code> objects, one for each table addressed by <code>TransactGetItem</code> objects in
     * the <i>TransactItems</i> parameter. These <code>ConsumedCapacity</code> objects report the read-capacity units
     * consumed by the <code>TransactGetItems</code> call in that table.
     * </p>
     * 
     * @param consumedCapacity
     *        If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this is an array of
     *        <code>ConsumedCapacity</code> objects, one for each table addressed by <code>TransactGetItem</code>
     *        objects in the <i>TransactItems</i> parameter. These <code>ConsumedCapacity</code> objects report the
     *        read-capacity units consumed by the <code>TransactGetItems</code> call in that table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactGetItemsResult withConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
        setConsumedCapacity(consumedCapacity);
        return this;
    }

    /**
     * <p>
     * An ordered array of up to 10 <code>ItemResponse</code> objects, each of which corresponds to the
     * <code>TransactGetItem</code> object in the same position in the <i>TransactItems</i> array. Each
     * <code>ItemResponse</code> object contains a Map of the name-value pairs that are the projected attributes of the
     * requested item.
     * </p>
     * <p>
     * If a requested item could not be retrieved, the corresponding <code>ItemResponse</code> object is Null, or if the
     * requested item has no projected attributes, the corresponding <code>ItemResponse</code> object is an empty Map.
     * </p>
     * 
     * @return An ordered array of up to 10 <code>ItemResponse</code> objects, each of which corresponds to the
     *         <code>TransactGetItem</code> object in the same position in the <i>TransactItems</i> array. Each
     *         <code>ItemResponse</code> object contains a Map of the name-value pairs that are the projected attributes
     *         of the requested item.</p>
     *         <p>
     *         If a requested item could not be retrieved, the corresponding <code>ItemResponse</code> object is Null,
     *         or if the requested item has no projected attributes, the corresponding <code>ItemResponse</code> object
     *         is an empty Map.
     */

    public java.util.List<ItemResponse> getResponses() {
        return responses;
    }

    /**
     * <p>
     * An ordered array of up to 10 <code>ItemResponse</code> objects, each of which corresponds to the
     * <code>TransactGetItem</code> object in the same position in the <i>TransactItems</i> array. Each
     * <code>ItemResponse</code> object contains a Map of the name-value pairs that are the projected attributes of the
     * requested item.
     * </p>
     * <p>
     * If a requested item could not be retrieved, the corresponding <code>ItemResponse</code> object is Null, or if the
     * requested item has no projected attributes, the corresponding <code>ItemResponse</code> object is an empty Map.
     * </p>
     * 
     * @param responses
     *        An ordered array of up to 10 <code>ItemResponse</code> objects, each of which corresponds to the
     *        <code>TransactGetItem</code> object in the same position in the <i>TransactItems</i> array. Each
     *        <code>ItemResponse</code> object contains a Map of the name-value pairs that are the projected attributes
     *        of the requested item.</p>
     *        <p>
     *        If a requested item could not be retrieved, the corresponding <code>ItemResponse</code> object is Null, or
     *        if the requested item has no projected attributes, the corresponding <code>ItemResponse</code> object is
     *        an empty Map.
     */

    public void setResponses(java.util.Collection<ItemResponse> responses) {
        if (responses == null) {
            this.responses = null;
            return;
        }

        this.responses = new java.util.ArrayList<ItemResponse>(responses);
    }

    /**
     * <p>
     * An ordered array of up to 10 <code>ItemResponse</code> objects, each of which corresponds to the
     * <code>TransactGetItem</code> object in the same position in the <i>TransactItems</i> array. Each
     * <code>ItemResponse</code> object contains a Map of the name-value pairs that are the projected attributes of the
     * requested item.
     * </p>
     * <p>
     * If a requested item could not be retrieved, the corresponding <code>ItemResponse</code> object is Null, or if the
     * requested item has no projected attributes, the corresponding <code>ItemResponse</code> object is an empty Map.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResponses(java.util.Collection)} or {@link #withResponses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param responses
     *        An ordered array of up to 10 <code>ItemResponse</code> objects, each of which corresponds to the
     *        <code>TransactGetItem</code> object in the same position in the <i>TransactItems</i> array. Each
     *        <code>ItemResponse</code> object contains a Map of the name-value pairs that are the projected attributes
     *        of the requested item.</p>
     *        <p>
     *        If a requested item could not be retrieved, the corresponding <code>ItemResponse</code> object is Null, or
     *        if the requested item has no projected attributes, the corresponding <code>ItemResponse</code> object is
     *        an empty Map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactGetItemsResult withResponses(ItemResponse... responses) {
        if (this.responses == null) {
            setResponses(new java.util.ArrayList<ItemResponse>(responses.length));
        }
        for (ItemResponse ele : responses) {
            this.responses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An ordered array of up to 10 <code>ItemResponse</code> objects, each of which corresponds to the
     * <code>TransactGetItem</code> object in the same position in the <i>TransactItems</i> array. Each
     * <code>ItemResponse</code> object contains a Map of the name-value pairs that are the projected attributes of the
     * requested item.
     * </p>
     * <p>
     * If a requested item could not be retrieved, the corresponding <code>ItemResponse</code> object is Null, or if the
     * requested item has no projected attributes, the corresponding <code>ItemResponse</code> object is an empty Map.
     * </p>
     * 
     * @param responses
     *        An ordered array of up to 10 <code>ItemResponse</code> objects, each of which corresponds to the
     *        <code>TransactGetItem</code> object in the same position in the <i>TransactItems</i> array. Each
     *        <code>ItemResponse</code> object contains a Map of the name-value pairs that are the projected attributes
     *        of the requested item.</p>
     *        <p>
     *        If a requested item could not be retrieved, the corresponding <code>ItemResponse</code> object is Null, or
     *        if the requested item has no projected attributes, the corresponding <code>ItemResponse</code> object is
     *        an empty Map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactGetItemsResult withResponses(java.util.Collection<ItemResponse> responses) {
        setResponses(responses);
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
        if (getConsumedCapacity() != null)
            sb.append("ConsumedCapacity: ").append(getConsumedCapacity()).append(",");
        if (getResponses() != null)
            sb.append("Responses: ").append(getResponses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransactGetItemsResult == false)
            return false;
        TransactGetItemsResult other = (TransactGetItemsResult) obj;
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null)
            return false;
        if (other.getConsumedCapacity() != null && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false)
            return false;
        if (other.getResponses() == null ^ this.getResponses() == null)
            return false;
        if (other.getResponses() != null && other.getResponses().equals(this.getResponses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode());
        hashCode = prime * hashCode + ((getResponses() == null) ? 0 : getResponses().hashCode());
        return hashCode;
    }

    @Override
    public TransactGetItemsResult clone() {
        try {
            return (TransactGetItemsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
