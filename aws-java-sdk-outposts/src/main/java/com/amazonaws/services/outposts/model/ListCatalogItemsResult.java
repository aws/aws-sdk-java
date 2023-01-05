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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListCatalogItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCatalogItemsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the catalog items.
     * </p>
     */
    private java.util.List<CatalogItem> catalogItems;

    private String nextToken;

    /**
     * <p>
     * Information about the catalog items.
     * </p>
     * 
     * @return Information about the catalog items.
     */

    public java.util.List<CatalogItem> getCatalogItems() {
        return catalogItems;
    }

    /**
     * <p>
     * Information about the catalog items.
     * </p>
     * 
     * @param catalogItems
     *        Information about the catalog items.
     */

    public void setCatalogItems(java.util.Collection<CatalogItem> catalogItems) {
        if (catalogItems == null) {
            this.catalogItems = null;
            return;
        }

        this.catalogItems = new java.util.ArrayList<CatalogItem>(catalogItems);
    }

    /**
     * <p>
     * Information about the catalog items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCatalogItems(java.util.Collection)} or {@link #withCatalogItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param catalogItems
     *        Information about the catalog items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCatalogItemsResult withCatalogItems(CatalogItem... catalogItems) {
        if (this.catalogItems == null) {
            setCatalogItems(new java.util.ArrayList<CatalogItem>(catalogItems.length));
        }
        for (CatalogItem ele : catalogItems) {
            this.catalogItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the catalog items.
     * </p>
     * 
     * @param catalogItems
     *        Information about the catalog items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCatalogItemsResult withCatalogItems(java.util.Collection<CatalogItem> catalogItems) {
        setCatalogItems(catalogItems);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCatalogItemsResult withNextToken(String nextToken) {
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
        if (getCatalogItems() != null)
            sb.append("CatalogItems: ").append(getCatalogItems()).append(",");
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

        if (obj instanceof ListCatalogItemsResult == false)
            return false;
        ListCatalogItemsResult other = (ListCatalogItemsResult) obj;
        if (other.getCatalogItems() == null ^ this.getCatalogItems() == null)
            return false;
        if (other.getCatalogItems() != null && other.getCatalogItems().equals(this.getCatalogItems()) == false)
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

        hashCode = prime * hashCode + ((getCatalogItems() == null) ? 0 : getCatalogItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCatalogItemsResult clone() {
        try {
            return (ListCatalogItemsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
