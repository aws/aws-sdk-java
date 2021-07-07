/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssociateAssets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateAssetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the parent asset.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The ID of a hierarchy in the parent asset's model. Hierarchies allow different groupings of assets to be formed
     * that all come from the same asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String hierarchyId;
    /**
     * <p>
     * The ID of the child asset to be associated.
     * </p>
     */
    private String childAssetId;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the parent asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the parent asset.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the parent asset.
     * </p>
     * 
     * @return The ID of the parent asset.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the parent asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the parent asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAssetsRequest withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The ID of a hierarchy in the parent asset's model. Hierarchies allow different groupings of assets to be formed
     * that all come from the same asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param hierarchyId
     *        The ID of a hierarchy in the parent asset's model. Hierarchies allow different groupings of assets to be
     *        formed that all come from the same asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *        hierarchies</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setHierarchyId(String hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    /**
     * <p>
     * The ID of a hierarchy in the parent asset's model. Hierarchies allow different groupings of assets to be formed
     * that all come from the same asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The ID of a hierarchy in the parent asset's model. Hierarchies allow different groupings of assets to be
     *         formed that all come from the same asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *         hierarchies</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getHierarchyId() {
        return this.hierarchyId;
    }

    /**
     * <p>
     * The ID of a hierarchy in the parent asset's model. Hierarchies allow different groupings of assets to be formed
     * that all come from the same asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param hierarchyId
     *        The ID of a hierarchy in the parent asset's model. Hierarchies allow different groupings of assets to be
     *        formed that all come from the same asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *        hierarchies</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAssetsRequest withHierarchyId(String hierarchyId) {
        setHierarchyId(hierarchyId);
        return this;
    }

    /**
     * <p>
     * The ID of the child asset to be associated.
     * </p>
     * 
     * @param childAssetId
     *        The ID of the child asset to be associated.
     */

    public void setChildAssetId(String childAssetId) {
        this.childAssetId = childAssetId;
    }

    /**
     * <p>
     * The ID of the child asset to be associated.
     * </p>
     * 
     * @return The ID of the child asset to be associated.
     */

    public String getChildAssetId() {
        return this.childAssetId;
    }

    /**
     * <p>
     * The ID of the child asset to be associated.
     * </p>
     * 
     * @param childAssetId
     *        The ID of the child asset to be associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAssetsRequest withChildAssetId(String childAssetId) {
        setChildAssetId(childAssetId);
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @return A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *         reuse this client token if a new idempotent request is required.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAssetsRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getHierarchyId() != null)
            sb.append("HierarchyId: ").append(getHierarchyId()).append(",");
        if (getChildAssetId() != null)
            sb.append("ChildAssetId: ").append(getChildAssetId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateAssetsRequest == false)
            return false;
        AssociateAssetsRequest other = (AssociateAssetsRequest) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getHierarchyId() == null ^ this.getHierarchyId() == null)
            return false;
        if (other.getHierarchyId() != null && other.getHierarchyId().equals(this.getHierarchyId()) == false)
            return false;
        if (other.getChildAssetId() == null ^ this.getChildAssetId() == null)
            return false;
        if (other.getChildAssetId() != null && other.getChildAssetId().equals(this.getChildAssetId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getHierarchyId() == null) ? 0 : getHierarchyId().hashCode());
        hashCode = prime * hashCode + ((getChildAssetId() == null) ? 0 : getChildAssetId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public AssociateAssetsRequest clone() {
        return (AssociateAssetsRequest) super.clone();
    }

}
