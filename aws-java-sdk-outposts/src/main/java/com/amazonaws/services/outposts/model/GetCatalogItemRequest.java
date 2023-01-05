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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetCatalogItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCatalogItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the catalog item.
     * </p>
     */
    private String catalogItemId;

    /**
     * <p>
     * The ID of the catalog item.
     * </p>
     * 
     * @param catalogItemId
     *        The ID of the catalog item.
     */

    public void setCatalogItemId(String catalogItemId) {
        this.catalogItemId = catalogItemId;
    }

    /**
     * <p>
     * The ID of the catalog item.
     * </p>
     * 
     * @return The ID of the catalog item.
     */

    public String getCatalogItemId() {
        return this.catalogItemId;
    }

    /**
     * <p>
     * The ID of the catalog item.
     * </p>
     * 
     * @param catalogItemId
     *        The ID of the catalog item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCatalogItemRequest withCatalogItemId(String catalogItemId) {
        setCatalogItemId(catalogItemId);
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
        if (getCatalogItemId() != null)
            sb.append("CatalogItemId: ").append(getCatalogItemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCatalogItemRequest == false)
            return false;
        GetCatalogItemRequest other = (GetCatalogItemRequest) obj;
        if (other.getCatalogItemId() == null ^ this.getCatalogItemId() == null)
            return false;
        if (other.getCatalogItemId() != null && other.getCatalogItemId().equals(this.getCatalogItemId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogItemId() == null) ? 0 : getCatalogItemId().hashCode());
        return hashCode;
    }

    @Override
    public GetCatalogItemRequest clone() {
        return (GetCatalogItemRequest) super.clone();
    }

}
