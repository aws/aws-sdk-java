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
 * Filter by asset model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/FilterByAssetModel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterByAssetModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The asset model Id.
     * </p>
     */
    private String assetModelId;
    /**
     * <p>
     * The external-Id property of an asset model.
     * </p>
     */
    private String assetModelExternalId;
    /**
     * <p>
     * Include asset offspring. [need desc.]
     * </p>
     */
    private Boolean includeOffspring;
    /**
     * <p>
     * Bolean to include assets.
     * </p>
     */
    private Boolean includeAssets;

    /**
     * <p>
     * The asset model Id.
     * </p>
     * 
     * @param assetModelId
     *        The asset model Id.
     */

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The asset model Id.
     * </p>
     * 
     * @return The asset model Id.
     */

    public String getAssetModelId() {
        return this.assetModelId;
    }

    /**
     * <p>
     * The asset model Id.
     * </p>
     * 
     * @param assetModelId
     *        The asset model Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterByAssetModel withAssetModelId(String assetModelId) {
        setAssetModelId(assetModelId);
        return this;
    }

    /**
     * <p>
     * The external-Id property of an asset model.
     * </p>
     * 
     * @param assetModelExternalId
     *        The external-Id property of an asset model.
     */

    public void setAssetModelExternalId(String assetModelExternalId) {
        this.assetModelExternalId = assetModelExternalId;
    }

    /**
     * <p>
     * The external-Id property of an asset model.
     * </p>
     * 
     * @return The external-Id property of an asset model.
     */

    public String getAssetModelExternalId() {
        return this.assetModelExternalId;
    }

    /**
     * <p>
     * The external-Id property of an asset model.
     * </p>
     * 
     * @param assetModelExternalId
     *        The external-Id property of an asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterByAssetModel withAssetModelExternalId(String assetModelExternalId) {
        setAssetModelExternalId(assetModelExternalId);
        return this;
    }

    /**
     * <p>
     * Include asset offspring. [need desc.]
     * </p>
     * 
     * @param includeOffspring
     *        Include asset offspring. [need desc.]
     */

    public void setIncludeOffspring(Boolean includeOffspring) {
        this.includeOffspring = includeOffspring;
    }

    /**
     * <p>
     * Include asset offspring. [need desc.]
     * </p>
     * 
     * @return Include asset offspring. [need desc.]
     */

    public Boolean getIncludeOffspring() {
        return this.includeOffspring;
    }

    /**
     * <p>
     * Include asset offspring. [need desc.]
     * </p>
     * 
     * @param includeOffspring
     *        Include asset offspring. [need desc.]
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterByAssetModel withIncludeOffspring(Boolean includeOffspring) {
        setIncludeOffspring(includeOffspring);
        return this;
    }

    /**
     * <p>
     * Include asset offspring. [need desc.]
     * </p>
     * 
     * @return Include asset offspring. [need desc.]
     */

    public Boolean isIncludeOffspring() {
        return this.includeOffspring;
    }

    /**
     * <p>
     * Bolean to include assets.
     * </p>
     * 
     * @param includeAssets
     *        Bolean to include assets.
     */

    public void setIncludeAssets(Boolean includeAssets) {
        this.includeAssets = includeAssets;
    }

    /**
     * <p>
     * Bolean to include assets.
     * </p>
     * 
     * @return Bolean to include assets.
     */

    public Boolean getIncludeAssets() {
        return this.includeAssets;
    }

    /**
     * <p>
     * Bolean to include assets.
     * </p>
     * 
     * @param includeAssets
     *        Bolean to include assets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterByAssetModel withIncludeAssets(Boolean includeAssets) {
        setIncludeAssets(includeAssets);
        return this;
    }

    /**
     * <p>
     * Bolean to include assets.
     * </p>
     * 
     * @return Bolean to include assets.
     */

    public Boolean isIncludeAssets() {
        return this.includeAssets;
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
        if (getAssetModelId() != null)
            sb.append("AssetModelId: ").append(getAssetModelId()).append(",");
        if (getAssetModelExternalId() != null)
            sb.append("AssetModelExternalId: ").append(getAssetModelExternalId()).append(",");
        if (getIncludeOffspring() != null)
            sb.append("IncludeOffspring: ").append(getIncludeOffspring()).append(",");
        if (getIncludeAssets() != null)
            sb.append("IncludeAssets: ").append(getIncludeAssets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterByAssetModel == false)
            return false;
        FilterByAssetModel other = (FilterByAssetModel) obj;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getAssetModelExternalId() == null ^ this.getAssetModelExternalId() == null)
            return false;
        if (other.getAssetModelExternalId() != null && other.getAssetModelExternalId().equals(this.getAssetModelExternalId()) == false)
            return false;
        if (other.getIncludeOffspring() == null ^ this.getIncludeOffspring() == null)
            return false;
        if (other.getIncludeOffspring() != null && other.getIncludeOffspring().equals(this.getIncludeOffspring()) == false)
            return false;
        if (other.getIncludeAssets() == null ^ this.getIncludeAssets() == null)
            return false;
        if (other.getIncludeAssets() != null && other.getIncludeAssets().equals(this.getIncludeAssets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelExternalId() == null) ? 0 : getAssetModelExternalId().hashCode());
        hashCode = prime * hashCode + ((getIncludeOffspring() == null) ? 0 : getIncludeOffspring().hashCode());
        hashCode = prime * hashCode + ((getIncludeAssets() == null) ? 0 : getIncludeAssets().hashCode());
        return hashCode;
    }

    @Override
    public FilterByAssetModel clone() {
        try {
            return (FilterByAssetModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.FilterByAssetModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
