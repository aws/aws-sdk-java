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
 * The details of the search results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchInventoryResultItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchInventoryResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The asset item included in the search results.
     * </p>
     */
    private AssetItem assetItem;
    /**
     * <p>
     * The data product item included in the search results.
     * </p>
     */
    private DataProductSummary dataProductItem;
    /**
     * <p>
     * The glossary item included in the search results.
     * </p>
     */
    private GlossaryItem glossaryItem;
    /**
     * <p>
     * The glossary term item included in the search results.
     * </p>
     */
    private GlossaryTermItem glossaryTermItem;

    /**
     * <p>
     * The asset item included in the search results.
     * </p>
     * 
     * @param assetItem
     *        The asset item included in the search results.
     */

    public void setAssetItem(AssetItem assetItem) {
        this.assetItem = assetItem;
    }

    /**
     * <p>
     * The asset item included in the search results.
     * </p>
     * 
     * @return The asset item included in the search results.
     */

    public AssetItem getAssetItem() {
        return this.assetItem;
    }

    /**
     * <p>
     * The asset item included in the search results.
     * </p>
     * 
     * @param assetItem
     *        The asset item included in the search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchInventoryResultItem withAssetItem(AssetItem assetItem) {
        setAssetItem(assetItem);
        return this;
    }

    /**
     * <p>
     * The data product item included in the search results.
     * </p>
     * 
     * @param dataProductItem
     *        The data product item included in the search results.
     */

    public void setDataProductItem(DataProductSummary dataProductItem) {
        this.dataProductItem = dataProductItem;
    }

    /**
     * <p>
     * The data product item included in the search results.
     * </p>
     * 
     * @return The data product item included in the search results.
     */

    public DataProductSummary getDataProductItem() {
        return this.dataProductItem;
    }

    /**
     * <p>
     * The data product item included in the search results.
     * </p>
     * 
     * @param dataProductItem
     *        The data product item included in the search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchInventoryResultItem withDataProductItem(DataProductSummary dataProductItem) {
        setDataProductItem(dataProductItem);
        return this;
    }

    /**
     * <p>
     * The glossary item included in the search results.
     * </p>
     * 
     * @param glossaryItem
     *        The glossary item included in the search results.
     */

    public void setGlossaryItem(GlossaryItem glossaryItem) {
        this.glossaryItem = glossaryItem;
    }

    /**
     * <p>
     * The glossary item included in the search results.
     * </p>
     * 
     * @return The glossary item included in the search results.
     */

    public GlossaryItem getGlossaryItem() {
        return this.glossaryItem;
    }

    /**
     * <p>
     * The glossary item included in the search results.
     * </p>
     * 
     * @param glossaryItem
     *        The glossary item included in the search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchInventoryResultItem withGlossaryItem(GlossaryItem glossaryItem) {
        setGlossaryItem(glossaryItem);
        return this;
    }

    /**
     * <p>
     * The glossary term item included in the search results.
     * </p>
     * 
     * @param glossaryTermItem
     *        The glossary term item included in the search results.
     */

    public void setGlossaryTermItem(GlossaryTermItem glossaryTermItem) {
        this.glossaryTermItem = glossaryTermItem;
    }

    /**
     * <p>
     * The glossary term item included in the search results.
     * </p>
     * 
     * @return The glossary term item included in the search results.
     */

    public GlossaryTermItem getGlossaryTermItem() {
        return this.glossaryTermItem;
    }

    /**
     * <p>
     * The glossary term item included in the search results.
     * </p>
     * 
     * @param glossaryTermItem
     *        The glossary term item included in the search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchInventoryResultItem withGlossaryTermItem(GlossaryTermItem glossaryTermItem) {
        setGlossaryTermItem(glossaryTermItem);
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
        if (getAssetItem() != null)
            sb.append("AssetItem: ").append(getAssetItem()).append(",");
        if (getDataProductItem() != null)
            sb.append("DataProductItem: ").append(getDataProductItem()).append(",");
        if (getGlossaryItem() != null)
            sb.append("GlossaryItem: ").append(getGlossaryItem()).append(",");
        if (getGlossaryTermItem() != null)
            sb.append("GlossaryTermItem: ").append(getGlossaryTermItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchInventoryResultItem == false)
            return false;
        SearchInventoryResultItem other = (SearchInventoryResultItem) obj;
        if (other.getAssetItem() == null ^ this.getAssetItem() == null)
            return false;
        if (other.getAssetItem() != null && other.getAssetItem().equals(this.getAssetItem()) == false)
            return false;
        if (other.getDataProductItem() == null ^ this.getDataProductItem() == null)
            return false;
        if (other.getDataProductItem() != null && other.getDataProductItem().equals(this.getDataProductItem()) == false)
            return false;
        if (other.getGlossaryItem() == null ^ this.getGlossaryItem() == null)
            return false;
        if (other.getGlossaryItem() != null && other.getGlossaryItem().equals(this.getGlossaryItem()) == false)
            return false;
        if (other.getGlossaryTermItem() == null ^ this.getGlossaryTermItem() == null)
            return false;
        if (other.getGlossaryTermItem() != null && other.getGlossaryTermItem().equals(this.getGlossaryTermItem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetItem() == null) ? 0 : getAssetItem().hashCode());
        hashCode = prime * hashCode + ((getDataProductItem() == null) ? 0 : getDataProductItem().hashCode());
        hashCode = prime * hashCode + ((getGlossaryItem() == null) ? 0 : getGlossaryItem().hashCode());
        hashCode = prime * hashCode + ((getGlossaryTermItem() == null) ? 0 : getGlossaryTermItem().hashCode());
        return hashCode;
    }

    @Override
    public SearchInventoryResultItem clone() {
        try {
            return (SearchInventoryResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.SearchInventoryResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
