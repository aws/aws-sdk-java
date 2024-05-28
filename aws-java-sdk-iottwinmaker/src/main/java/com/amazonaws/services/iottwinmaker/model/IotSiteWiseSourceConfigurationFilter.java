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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The AWS IoT SiteWise soucre configuration filter.[need held with desc here]
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/IotSiteWiseSourceConfigurationFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IotSiteWiseSourceConfigurationFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filter by asset model.
     * </p>
     */
    private FilterByAssetModel filterByAssetModel;
    /**
     * <p>
     * Filter by asset.
     * </p>
     */
    private FilterByAsset filterByAsset;

    /**
     * <p>
     * Filter by asset model.
     * </p>
     * 
     * @param filterByAssetModel
     *        Filter by asset model.
     */

    public void setFilterByAssetModel(FilterByAssetModel filterByAssetModel) {
        this.filterByAssetModel = filterByAssetModel;
    }

    /**
     * <p>
     * Filter by asset model.
     * </p>
     * 
     * @return Filter by asset model.
     */

    public FilterByAssetModel getFilterByAssetModel() {
        return this.filterByAssetModel;
    }

    /**
     * <p>
     * Filter by asset model.
     * </p>
     * 
     * @param filterByAssetModel
     *        Filter by asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseSourceConfigurationFilter withFilterByAssetModel(FilterByAssetModel filterByAssetModel) {
        setFilterByAssetModel(filterByAssetModel);
        return this;
    }

    /**
     * <p>
     * Filter by asset.
     * </p>
     * 
     * @param filterByAsset
     *        Filter by asset.
     */

    public void setFilterByAsset(FilterByAsset filterByAsset) {
        this.filterByAsset = filterByAsset;
    }

    /**
     * <p>
     * Filter by asset.
     * </p>
     * 
     * @return Filter by asset.
     */

    public FilterByAsset getFilterByAsset() {
        return this.filterByAsset;
    }

    /**
     * <p>
     * Filter by asset.
     * </p>
     * 
     * @param filterByAsset
     *        Filter by asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseSourceConfigurationFilter withFilterByAsset(FilterByAsset filterByAsset) {
        setFilterByAsset(filterByAsset);
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
        if (getFilterByAssetModel() != null)
            sb.append("FilterByAssetModel: ").append(getFilterByAssetModel()).append(",");
        if (getFilterByAsset() != null)
            sb.append("FilterByAsset: ").append(getFilterByAsset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotSiteWiseSourceConfigurationFilter == false)
            return false;
        IotSiteWiseSourceConfigurationFilter other = (IotSiteWiseSourceConfigurationFilter) obj;
        if (other.getFilterByAssetModel() == null ^ this.getFilterByAssetModel() == null)
            return false;
        if (other.getFilterByAssetModel() != null && other.getFilterByAssetModel().equals(this.getFilterByAssetModel()) == false)
            return false;
        if (other.getFilterByAsset() == null ^ this.getFilterByAsset() == null)
            return false;
        if (other.getFilterByAsset() != null && other.getFilterByAsset().equals(this.getFilterByAsset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterByAssetModel() == null) ? 0 : getFilterByAssetModel().hashCode());
        hashCode = prime * hashCode + ((getFilterByAsset() == null) ? 0 : getFilterByAsset().hashCode());
        return hashCode;
    }

    @Override
    public IotSiteWiseSourceConfigurationFilter clone() {
        try {
            return (IotSiteWiseSourceConfigurationFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.IotSiteWiseSourceConfigurationFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
