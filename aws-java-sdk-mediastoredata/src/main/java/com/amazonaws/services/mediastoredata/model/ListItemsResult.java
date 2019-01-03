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
package com.amazonaws.services.mediastoredata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/ListItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListItemsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata entries for the folders and objects at the requested path.
     * </p>
     */
    private java.util.List<Item> items;
    /**
     * <p>
     * The token that can be used in a request to view the next set of results. For example, you submit a
     * <code>ListItems</code> request that matches 2,000 items with <code>MaxResults</code> set at 500. The service
     * returns the first batch of results (up to 500) and a <code>NextToken</code> value that can be used to fetch the
     * next batch of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The metadata entries for the folders and objects at the requested path.
     * </p>
     * 
     * @return The metadata entries for the folders and objects at the requested path.
     */

    public java.util.List<Item> getItems() {
        return items;
    }

    /**
     * <p>
     * The metadata entries for the folders and objects at the requested path.
     * </p>
     * 
     * @param items
     *        The metadata entries for the folders and objects at the requested path.
     */

    public void setItems(java.util.Collection<Item> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<Item>(items);
    }

    /**
     * <p>
     * The metadata entries for the folders and objects at the requested path.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The metadata entries for the folders and objects at the requested path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListItemsResult withItems(Item... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<Item>(items.length));
        }
        for (Item ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata entries for the folders and objects at the requested path.
     * </p>
     * 
     * @param items
     *        The metadata entries for the folders and objects at the requested path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListItemsResult withItems(java.util.Collection<Item> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The token that can be used in a request to view the next set of results. For example, you submit a
     * <code>ListItems</code> request that matches 2,000 items with <code>MaxResults</code> set at 500. The service
     * returns the first batch of results (up to 500) and a <code>NextToken</code> value that can be used to fetch the
     * next batch of results.
     * </p>
     * 
     * @param nextToken
     *        The token that can be used in a request to view the next set of results. For example, you submit a
     *        <code>ListItems</code> request that matches 2,000 items with <code>MaxResults</code> set at 500. The
     *        service returns the first batch of results (up to 500) and a <code>NextToken</code> value that can be used
     *        to fetch the next batch of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that can be used in a request to view the next set of results. For example, you submit a
     * <code>ListItems</code> request that matches 2,000 items with <code>MaxResults</code> set at 500. The service
     * returns the first batch of results (up to 500) and a <code>NextToken</code> value that can be used to fetch the
     * next batch of results.
     * </p>
     * 
     * @return The token that can be used in a request to view the next set of results. For example, you submit a
     *         <code>ListItems</code> request that matches 2,000 items with <code>MaxResults</code> set at 500. The
     *         service returns the first batch of results (up to 500) and a <code>NextToken</code> value that can be
     *         used to fetch the next batch of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that can be used in a request to view the next set of results. For example, you submit a
     * <code>ListItems</code> request that matches 2,000 items with <code>MaxResults</code> set at 500. The service
     * returns the first batch of results (up to 500) and a <code>NextToken</code> value that can be used to fetch the
     * next batch of results.
     * </p>
     * 
     * @param nextToken
     *        The token that can be used in a request to view the next set of results. For example, you submit a
     *        <code>ListItems</code> request that matches 2,000 items with <code>MaxResults</code> set at 500. The
     *        service returns the first batch of results (up to 500) and a <code>NextToken</code> value that can be used
     *        to fetch the next batch of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListItemsResult withNextToken(String nextToken) {
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

        if (obj instanceof ListItemsResult == false)
            return false;
        ListItemsResult other = (ListItemsResult) obj;
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
    public ListItemsResult clone() {
        try {
            return (ListItemsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
