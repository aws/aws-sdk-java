/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListRelatedItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRelatedItemsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Details about each related item.
     * </p>
     */
    private java.util.List<RelatedItem> relatedItems;

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @return The pagination token to continue to the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRelatedItemsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Details about each related item.
     * </p>
     * 
     * @return Details about each related item.
     */

    public java.util.List<RelatedItem> getRelatedItems() {
        return relatedItems;
    }

    /**
     * <p>
     * Details about each related item.
     * </p>
     * 
     * @param relatedItems
     *        Details about each related item.
     */

    public void setRelatedItems(java.util.Collection<RelatedItem> relatedItems) {
        if (relatedItems == null) {
            this.relatedItems = null;
            return;
        }

        this.relatedItems = new java.util.ArrayList<RelatedItem>(relatedItems);
    }

    /**
     * <p>
     * Details about each related item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedItems(java.util.Collection)} or {@link #withRelatedItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param relatedItems
     *        Details about each related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRelatedItemsResult withRelatedItems(RelatedItem... relatedItems) {
        if (this.relatedItems == null) {
            setRelatedItems(new java.util.ArrayList<RelatedItem>(relatedItems.length));
        }
        for (RelatedItem ele : relatedItems) {
            this.relatedItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about each related item.
     * </p>
     * 
     * @param relatedItems
     *        Details about each related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRelatedItemsResult withRelatedItems(java.util.Collection<RelatedItem> relatedItems) {
        setRelatedItems(relatedItems);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRelatedItems() != null)
            sb.append("RelatedItems: ").append(getRelatedItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRelatedItemsResult == false)
            return false;
        ListRelatedItemsResult other = (ListRelatedItemsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRelatedItems() == null ^ this.getRelatedItems() == null)
            return false;
        if (other.getRelatedItems() != null && other.getRelatedItems().equals(this.getRelatedItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRelatedItems() == null) ? 0 : getRelatedItems().hashCode());
        return hashCode;
    }

    @Override
    public ListRelatedItemsResult clone() {
        try {
            return (ListRelatedItemsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
