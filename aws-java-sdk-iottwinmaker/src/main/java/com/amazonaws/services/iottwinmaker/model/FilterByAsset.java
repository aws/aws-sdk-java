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
 * Filter by asset. [TwinMaker asset]
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/FilterByAsset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterByAsset implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filter by asset Id.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The external-Id property of an asset.
     * </p>
     */
    private String assetExternalId;
    /**
     * <p>
     * Includes sub-assets.[need description hekp for this]
     * </p>
     */
    private Boolean includeOffspring;
    /**
     * <p>
     * Boolean to include the asset model.
     * </p>
     */
    private Boolean includeAssetModel;

    /**
     * <p>
     * Filter by asset Id.
     * </p>
     * 
     * @param assetId
     *        Filter by asset Id.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * Filter by asset Id.
     * </p>
     * 
     * @return Filter by asset Id.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * Filter by asset Id.
     * </p>
     * 
     * @param assetId
     *        Filter by asset Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterByAsset withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The external-Id property of an asset.
     * </p>
     * 
     * @param assetExternalId
     *        The external-Id property of an asset.
     */

    public void setAssetExternalId(String assetExternalId) {
        this.assetExternalId = assetExternalId;
    }

    /**
     * <p>
     * The external-Id property of an asset.
     * </p>
     * 
     * @return The external-Id property of an asset.
     */

    public String getAssetExternalId() {
        return this.assetExternalId;
    }

    /**
     * <p>
     * The external-Id property of an asset.
     * </p>
     * 
     * @param assetExternalId
     *        The external-Id property of an asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterByAsset withAssetExternalId(String assetExternalId) {
        setAssetExternalId(assetExternalId);
        return this;
    }

    /**
     * <p>
     * Includes sub-assets.[need description hekp for this]
     * </p>
     * 
     * @param includeOffspring
     *        Includes sub-assets.[need description hekp for this]
     */

    public void setIncludeOffspring(Boolean includeOffspring) {
        this.includeOffspring = includeOffspring;
    }

    /**
     * <p>
     * Includes sub-assets.[need description hekp for this]
     * </p>
     * 
     * @return Includes sub-assets.[need description hekp for this]
     */

    public Boolean getIncludeOffspring() {
        return this.includeOffspring;
    }

    /**
     * <p>
     * Includes sub-assets.[need description hekp for this]
     * </p>
     * 
     * @param includeOffspring
     *        Includes sub-assets.[need description hekp for this]
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterByAsset withIncludeOffspring(Boolean includeOffspring) {
        setIncludeOffspring(includeOffspring);
        return this;
    }

    /**
     * <p>
     * Includes sub-assets.[need description hekp for this]
     * </p>
     * 
     * @return Includes sub-assets.[need description hekp for this]
     */

    public Boolean isIncludeOffspring() {
        return this.includeOffspring;
    }

    /**
     * <p>
     * Boolean to include the asset model.
     * </p>
     * 
     * @param includeAssetModel
     *        Boolean to include the asset model.
     */

    public void setIncludeAssetModel(Boolean includeAssetModel) {
        this.includeAssetModel = includeAssetModel;
    }

    /**
     * <p>
     * Boolean to include the asset model.
     * </p>
     * 
     * @return Boolean to include the asset model.
     */

    public Boolean getIncludeAssetModel() {
        return this.includeAssetModel;
    }

    /**
     * <p>
     * Boolean to include the asset model.
     * </p>
     * 
     * @param includeAssetModel
     *        Boolean to include the asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterByAsset withIncludeAssetModel(Boolean includeAssetModel) {
        setIncludeAssetModel(includeAssetModel);
        return this;
    }

    /**
     * <p>
     * Boolean to include the asset model.
     * </p>
     * 
     * @return Boolean to include the asset model.
     */

    public Boolean isIncludeAssetModel() {
        return this.includeAssetModel;
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getAssetExternalId() != null)
            sb.append("AssetExternalId: ").append(getAssetExternalId()).append(",");
        if (getIncludeOffspring() != null)
            sb.append("IncludeOffspring: ").append(getIncludeOffspring()).append(",");
        if (getIncludeAssetModel() != null)
            sb.append("IncludeAssetModel: ").append(getIncludeAssetModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterByAsset == false)
            return false;
        FilterByAsset other = (FilterByAsset) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getAssetExternalId() == null ^ this.getAssetExternalId() == null)
            return false;
        if (other.getAssetExternalId() != null && other.getAssetExternalId().equals(this.getAssetExternalId()) == false)
            return false;
        if (other.getIncludeOffspring() == null ^ this.getIncludeOffspring() == null)
            return false;
        if (other.getIncludeOffspring() != null && other.getIncludeOffspring().equals(this.getIncludeOffspring()) == false)
            return false;
        if (other.getIncludeAssetModel() == null ^ this.getIncludeAssetModel() == null)
            return false;
        if (other.getIncludeAssetModel() != null && other.getIncludeAssetModel().equals(this.getIncludeAssetModel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getAssetExternalId() == null) ? 0 : getAssetExternalId().hashCode());
        hashCode = prime * hashCode + ((getIncludeOffspring() == null) ? 0 : getIncludeOffspring().hashCode());
        hashCode = prime * hashCode + ((getIncludeAssetModel() == null) ? 0 : getIncludeAssetModel().hashCode());
        return hashCode;
    }

    @Override
    public FilterByAsset clone() {
        try {
            return (FilterByAsset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.FilterByAssetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
