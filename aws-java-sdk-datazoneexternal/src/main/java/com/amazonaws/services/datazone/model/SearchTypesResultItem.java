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
 * The details of the results of the <code>SearchTypes</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchTypesResultItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchTypesResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The asset type included in the results of the <code>SearchTypes</code> action.
     * </p>
     */
    private AssetTypeItem assetTypeItem;
    /**
     * <p>
     * The form type included in the results of the <code>SearchTypes</code> action.
     * </p>
     */
    private FormTypeData formTypeItem;

    /**
     * <p>
     * The asset type included in the results of the <code>SearchTypes</code> action.
     * </p>
     * 
     * @param assetTypeItem
     *        The asset type included in the results of the <code>SearchTypes</code> action.
     */

    public void setAssetTypeItem(AssetTypeItem assetTypeItem) {
        this.assetTypeItem = assetTypeItem;
    }

    /**
     * <p>
     * The asset type included in the results of the <code>SearchTypes</code> action.
     * </p>
     * 
     * @return The asset type included in the results of the <code>SearchTypes</code> action.
     */

    public AssetTypeItem getAssetTypeItem() {
        return this.assetTypeItem;
    }

    /**
     * <p>
     * The asset type included in the results of the <code>SearchTypes</code> action.
     * </p>
     * 
     * @param assetTypeItem
     *        The asset type included in the results of the <code>SearchTypes</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTypesResultItem withAssetTypeItem(AssetTypeItem assetTypeItem) {
        setAssetTypeItem(assetTypeItem);
        return this;
    }

    /**
     * <p>
     * The form type included in the results of the <code>SearchTypes</code> action.
     * </p>
     * 
     * @param formTypeItem
     *        The form type included in the results of the <code>SearchTypes</code> action.
     */

    public void setFormTypeItem(FormTypeData formTypeItem) {
        this.formTypeItem = formTypeItem;
    }

    /**
     * <p>
     * The form type included in the results of the <code>SearchTypes</code> action.
     * </p>
     * 
     * @return The form type included in the results of the <code>SearchTypes</code> action.
     */

    public FormTypeData getFormTypeItem() {
        return this.formTypeItem;
    }

    /**
     * <p>
     * The form type included in the results of the <code>SearchTypes</code> action.
     * </p>
     * 
     * @param formTypeItem
     *        The form type included in the results of the <code>SearchTypes</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTypesResultItem withFormTypeItem(FormTypeData formTypeItem) {
        setFormTypeItem(formTypeItem);
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
        if (getAssetTypeItem() != null)
            sb.append("AssetTypeItem: ").append(getAssetTypeItem()).append(",");
        if (getFormTypeItem() != null)
            sb.append("FormTypeItem: ").append(getFormTypeItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchTypesResultItem == false)
            return false;
        SearchTypesResultItem other = (SearchTypesResultItem) obj;
        if (other.getAssetTypeItem() == null ^ this.getAssetTypeItem() == null)
            return false;
        if (other.getAssetTypeItem() != null && other.getAssetTypeItem().equals(this.getAssetTypeItem()) == false)
            return false;
        if (other.getFormTypeItem() == null ^ this.getFormTypeItem() == null)
            return false;
        if (other.getFormTypeItem() != null && other.getFormTypeItem().equals(this.getFormTypeItem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetTypeItem() == null) ? 0 : getAssetTypeItem().hashCode());
        hashCode = prime * hashCode + ((getFormTypeItem() == null) ? 0 : getFormTypeItem().hashCode());
        return hashCode;
    }

    @Override
    public SearchTypesResultItem clone() {
        try {
            return (SearchTypesResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.SearchTypesResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
