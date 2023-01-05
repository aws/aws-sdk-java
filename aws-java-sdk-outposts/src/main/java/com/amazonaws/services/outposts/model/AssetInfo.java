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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about hardware assets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/AssetInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the asset.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The rack ID of the asset.
     * </p>
     */
    private String rackId;
    /**
     * <p>
     * The type of the asset.
     * </p>
     */
    private String assetType;
    /**
     * <p>
     * Information about compute hardware assets.
     * </p>
     */
    private ComputeAttributes computeAttributes;
    /**
     * <p>
     * The position of an asset in a rack.
     * </p>
     */
    private AssetLocation assetLocation;

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @return The ID of the asset.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetInfo withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The rack ID of the asset.
     * </p>
     * 
     * @param rackId
     *        The rack ID of the asset.
     */

    public void setRackId(String rackId) {
        this.rackId = rackId;
    }

    /**
     * <p>
     * The rack ID of the asset.
     * </p>
     * 
     * @return The rack ID of the asset.
     */

    public String getRackId() {
        return this.rackId;
    }

    /**
     * <p>
     * The rack ID of the asset.
     * </p>
     * 
     * @param rackId
     *        The rack ID of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetInfo withRackId(String rackId) {
        setRackId(rackId);
        return this;
    }

    /**
     * <p>
     * The type of the asset.
     * </p>
     * 
     * @param assetType
     *        The type of the asset.
     * @see AssetType
     */

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    /**
     * <p>
     * The type of the asset.
     * </p>
     * 
     * @return The type of the asset.
     * @see AssetType
     */

    public String getAssetType() {
        return this.assetType;
    }

    /**
     * <p>
     * The type of the asset.
     * </p>
     * 
     * @param assetType
     *        The type of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetType
     */

    public AssetInfo withAssetType(String assetType) {
        setAssetType(assetType);
        return this;
    }

    /**
     * <p>
     * The type of the asset.
     * </p>
     * 
     * @param assetType
     *        The type of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetType
     */

    public AssetInfo withAssetType(AssetType assetType) {
        this.assetType = assetType.toString();
        return this;
    }

    /**
     * <p>
     * Information about compute hardware assets.
     * </p>
     * 
     * @param computeAttributes
     *        Information about compute hardware assets.
     */

    public void setComputeAttributes(ComputeAttributes computeAttributes) {
        this.computeAttributes = computeAttributes;
    }

    /**
     * <p>
     * Information about compute hardware assets.
     * </p>
     * 
     * @return Information about compute hardware assets.
     */

    public ComputeAttributes getComputeAttributes() {
        return this.computeAttributes;
    }

    /**
     * <p>
     * Information about compute hardware assets.
     * </p>
     * 
     * @param computeAttributes
     *        Information about compute hardware assets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetInfo withComputeAttributes(ComputeAttributes computeAttributes) {
        setComputeAttributes(computeAttributes);
        return this;
    }

    /**
     * <p>
     * The position of an asset in a rack.
     * </p>
     * 
     * @param assetLocation
     *        The position of an asset in a rack.
     */

    public void setAssetLocation(AssetLocation assetLocation) {
        this.assetLocation = assetLocation;
    }

    /**
     * <p>
     * The position of an asset in a rack.
     * </p>
     * 
     * @return The position of an asset in a rack.
     */

    public AssetLocation getAssetLocation() {
        return this.assetLocation;
    }

    /**
     * <p>
     * The position of an asset in a rack.
     * </p>
     * 
     * @param assetLocation
     *        The position of an asset in a rack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetInfo withAssetLocation(AssetLocation assetLocation) {
        setAssetLocation(assetLocation);
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getRackId() != null)
            sb.append("RackId: ").append(getRackId()).append(",");
        if (getAssetType() != null)
            sb.append("AssetType: ").append(getAssetType()).append(",");
        if (getComputeAttributes() != null)
            sb.append("ComputeAttributes: ").append(getComputeAttributes()).append(",");
        if (getAssetLocation() != null)
            sb.append("AssetLocation: ").append(getAssetLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetInfo == false)
            return false;
        AssetInfo other = (AssetInfo) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getRackId() == null ^ this.getRackId() == null)
            return false;
        if (other.getRackId() != null && other.getRackId().equals(this.getRackId()) == false)
            return false;
        if (other.getAssetType() == null ^ this.getAssetType() == null)
            return false;
        if (other.getAssetType() != null && other.getAssetType().equals(this.getAssetType()) == false)
            return false;
        if (other.getComputeAttributes() == null ^ this.getComputeAttributes() == null)
            return false;
        if (other.getComputeAttributes() != null && other.getComputeAttributes().equals(this.getComputeAttributes()) == false)
            return false;
        if (other.getAssetLocation() == null ^ this.getAssetLocation() == null)
            return false;
        if (other.getAssetLocation() != null && other.getAssetLocation().equals(this.getAssetLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getRackId() == null) ? 0 : getRackId().hashCode());
        hashCode = prime * hashCode + ((getAssetType() == null) ? 0 : getAssetType().hashCode());
        hashCode = prime * hashCode + ((getComputeAttributes() == null) ? 0 : getComputeAttributes().hashCode());
        hashCode = prime * hashCode + ((getAssetLocation() == null) ? 0 : getAssetLocation().hashCode());
        return hashCode;
    }

    @Override
    public AssetInfo clone() {
        try {
            return (AssetInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.AssetInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
