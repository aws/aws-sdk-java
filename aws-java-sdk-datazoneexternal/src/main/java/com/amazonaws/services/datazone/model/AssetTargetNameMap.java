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
 * The name map for assets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AssetTargetNameMap" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetTargetNameMap implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the inventory asset.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The target name in the asset target name map.
     * </p>
     */
    private String targetName;

    /**
     * <p>
     * The identifier of the inventory asset.
     * </p>
     * 
     * @param assetId
     *        The identifier of the inventory asset.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The identifier of the inventory asset.
     * </p>
     * 
     * @return The identifier of the inventory asset.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The identifier of the inventory asset.
     * </p>
     * 
     * @param assetId
     *        The identifier of the inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetTargetNameMap withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The target name in the asset target name map.
     * </p>
     * 
     * @param targetName
     *        The target name in the asset target name map.
     */

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * <p>
     * The target name in the asset target name map.
     * </p>
     * 
     * @return The target name in the asset target name map.
     */

    public String getTargetName() {
        return this.targetName;
    }

    /**
     * <p>
     * The target name in the asset target name map.
     * </p>
     * 
     * @param targetName
     *        The target name in the asset target name map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetTargetNameMap withTargetName(String targetName) {
        setTargetName(targetName);
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
        if (getTargetName() != null)
            sb.append("TargetName: ").append(getTargetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetTargetNameMap == false)
            return false;
        AssetTargetNameMap other = (AssetTargetNameMap) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getTargetName() == null ^ this.getTargetName() == null)
            return false;
        if (other.getTargetName() != null && other.getTargetName().equals(this.getTargetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getTargetName() == null) ? 0 : getTargetName().hashCode());
        return hashCode;
    }

    @Override
    public AssetTargetNameMap clone() {
        try {
            return (AssetTargetNameMap) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.AssetTargetNameMapMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
