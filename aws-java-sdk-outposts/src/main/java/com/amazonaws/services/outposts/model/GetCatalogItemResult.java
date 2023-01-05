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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetCatalogItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCatalogItemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about this catalog item.
     * </p>
     */
    private CatalogItem catalogItem;

    /**
     * <p>
     * Information about this catalog item.
     * </p>
     * 
     * @param catalogItem
     *        Information about this catalog item.
     */

    public void setCatalogItem(CatalogItem catalogItem) {
        this.catalogItem = catalogItem;
    }

    /**
     * <p>
     * Information about this catalog item.
     * </p>
     * 
     * @return Information about this catalog item.
     */

    public CatalogItem getCatalogItem() {
        return this.catalogItem;
    }

    /**
     * <p>
     * Information about this catalog item.
     * </p>
     * 
     * @param catalogItem
     *        Information about this catalog item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCatalogItemResult withCatalogItem(CatalogItem catalogItem) {
        setCatalogItem(catalogItem);
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
        if (getCatalogItem() != null)
            sb.append("CatalogItem: ").append(getCatalogItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCatalogItemResult == false)
            return false;
        GetCatalogItemResult other = (GetCatalogItemResult) obj;
        if (other.getCatalogItem() == null ^ this.getCatalogItem() == null)
            return false;
        if (other.getCatalogItem() != null && other.getCatalogItem().equals(this.getCatalogItem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogItem() == null) ? 0 : getCatalogItem().hashCode());
        return hashCode;
    }

    @Override
    public GetCatalogItemResult clone() {
        try {
            return (GetCatalogItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
