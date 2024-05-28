/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the results of the <code>SearchListings</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchResultItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The asset listing included in the results of the <code>SearchListings</code> action.
     * </p>
     */
    private AssetListingItem assetListing;

    /**
     * <p>
     * The asset listing included in the results of the <code>SearchListings</code> action.
     * </p>
     * 
     * @param assetListing
     *        The asset listing included in the results of the <code>SearchListings</code> action.
     */

    public void setAssetListing(AssetListingItem assetListing) {
        this.assetListing = assetListing;
    }

    /**
     * <p>
     * The asset listing included in the results of the <code>SearchListings</code> action.
     * </p>
     * 
     * @return The asset listing included in the results of the <code>SearchListings</code> action.
     */

    public AssetListingItem getAssetListing() {
        return this.assetListing;
    }

    /**
     * <p>
     * The asset listing included in the results of the <code>SearchListings</code> action.
     * </p>
     * 
     * @param assetListing
     *        The asset listing included in the results of the <code>SearchListings</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResultItem withAssetListing(AssetListingItem assetListing) {
        setAssetListing(assetListing);
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
        if (getAssetListing() != null)
            sb.append("AssetListing: ").append(getAssetListing());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchResultItem == false)
            return false;
        SearchResultItem other = (SearchResultItem) obj;
        if (other.getAssetListing() == null ^ this.getAssetListing() == null)
            return false;
        if (other.getAssetListing() != null && other.getAssetListing().equals(this.getAssetListing()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetListing() == null) ? 0 : getAssetListing().hashCode());
        return hashCode;
    }

    @Override
    public SearchResultItem clone() {
        try {
            return (SearchResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.SearchResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
