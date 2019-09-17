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
package com.amazonaws.services.simpledb.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.simpledb.SimpleDBResponseMetadata> implements Serializable,
        Cloneable {

    /** A list of items that match the select expression. */
    private com.amazonaws.internal.SdkInternalList<Item> items;
    /**
     * An opaque token indicating that more items than <code>MaxNumberOfItems</code> were matched, the response size
     * exceeded 1 megabyte, or the execution time exceeded 5 seconds.
     */
    private String nextToken;

    /**
     * A list of items that match the select expression.
     * 
     * @return A list of items that match the select expression.
     */

    public java.util.List<Item> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<Item>();
        }
        return items;
    }

    /**
     * A list of items that match the select expression.
     * 
     * @param items
     *        A list of items that match the select expression.
     */

    public void setItems(java.util.Collection<Item> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<Item>(items);
    }

    /**
     * A list of items that match the select expression.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A list of items that match the select expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectResult withItems(Item... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<Item>(items.length));
        }
        for (Item ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * A list of items that match the select expression.
     * 
     * @param items
     *        A list of items that match the select expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectResult withItems(java.util.Collection<Item> items) {
        setItems(items);
        return this;
    }

    /**
     * An opaque token indicating that more items than <code>MaxNumberOfItems</code> were matched, the response size
     * exceeded 1 megabyte, or the execution time exceeded 5 seconds.
     * 
     * @param nextToken
     *        An opaque token indicating that more items than <code>MaxNumberOfItems</code> were matched, the response
     *        size exceeded 1 megabyte, or the execution time exceeded 5 seconds.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * An opaque token indicating that more items than <code>MaxNumberOfItems</code> were matched, the response size
     * exceeded 1 megabyte, or the execution time exceeded 5 seconds.
     * 
     * @return An opaque token indicating that more items than <code>MaxNumberOfItems</code> were matched, the response
     *         size exceeded 1 megabyte, or the execution time exceeded 5 seconds.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * An opaque token indicating that more items than <code>MaxNumberOfItems</code> were matched, the response size
     * exceeded 1 megabyte, or the execution time exceeded 5 seconds.
     * 
     * @param nextToken
     *        An opaque token indicating that more items than <code>MaxNumberOfItems</code> were matched, the response
     *        size exceeded 1 megabyte, or the execution time exceeded 5 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelectResult == false)
            return false;
        SelectResult other = (SelectResult) obj;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SelectResult clone() {
        try {
            return (SelectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
