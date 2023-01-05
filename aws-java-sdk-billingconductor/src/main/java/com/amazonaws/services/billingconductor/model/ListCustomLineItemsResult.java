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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItems"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomLineItemsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>FreeFormLineItemListElements</code> received.
     * </p>
     */
    private java.util.List<CustomLineItemListElement> customLineItems;
    /**
     * <p>
     * The pagination token that's used on subsequent calls to get custom line items (FFLIs).
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>FreeFormLineItemListElements</code> received.
     * </p>
     * 
     * @return A list of <code>FreeFormLineItemListElements</code> received.
     */

    public java.util.List<CustomLineItemListElement> getCustomLineItems() {
        return customLineItems;
    }

    /**
     * <p>
     * A list of <code>FreeFormLineItemListElements</code> received.
     * </p>
     * 
     * @param customLineItems
     *        A list of <code>FreeFormLineItemListElements</code> received.
     */

    public void setCustomLineItems(java.util.Collection<CustomLineItemListElement> customLineItems) {
        if (customLineItems == null) {
            this.customLineItems = null;
            return;
        }

        this.customLineItems = new java.util.ArrayList<CustomLineItemListElement>(customLineItems);
    }

    /**
     * <p>
     * A list of <code>FreeFormLineItemListElements</code> received.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomLineItems(java.util.Collection)} or {@link #withCustomLineItems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param customLineItems
     *        A list of <code>FreeFormLineItemListElements</code> received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemsResult withCustomLineItems(CustomLineItemListElement... customLineItems) {
        if (this.customLineItems == null) {
            setCustomLineItems(new java.util.ArrayList<CustomLineItemListElement>(customLineItems.length));
        }
        for (CustomLineItemListElement ele : customLineItems) {
            this.customLineItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>FreeFormLineItemListElements</code> received.
     * </p>
     * 
     * @param customLineItems
     *        A list of <code>FreeFormLineItemListElements</code> received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemsResult withCustomLineItems(java.util.Collection<CustomLineItemListElement> customLineItems) {
        setCustomLineItems(customLineItems);
        return this;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get custom line items (FFLIs).
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to get custom line items (FFLIs).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get custom line items (FFLIs).
     * </p>
     * 
     * @return The pagination token that's used on subsequent calls to get custom line items (FFLIs).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get custom line items (FFLIs).
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to get custom line items (FFLIs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemsResult withNextToken(String nextToken) {
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
        if (getCustomLineItems() != null)
            sb.append("CustomLineItems: ").append(getCustomLineItems()).append(",");
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

        if (obj instanceof ListCustomLineItemsResult == false)
            return false;
        ListCustomLineItemsResult other = (ListCustomLineItemsResult) obj;
        if (other.getCustomLineItems() == null ^ this.getCustomLineItems() == null)
            return false;
        if (other.getCustomLineItems() != null && other.getCustomLineItems().equals(this.getCustomLineItems()) == false)
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

        hashCode = prime * hashCode + ((getCustomLineItems() == null) ? 0 : getCustomLineItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomLineItemsResult clone() {
        try {
            return (ListCustomLineItemsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
