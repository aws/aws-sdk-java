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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAssetModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAssetModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset model to update.
     * </p>
     */
    private String assetModelId;
    /**
     * <p>
     * A unique, friendly name for the asset model.
     * </p>
     */
    private String assetModelName;
    /**
     * <p>
     * A description for the asset model.
     * </p>
     */
    private String assetModelDescription;
    /**
     * <p>
     * The updated property definitions of the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset properties</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 200 properties per asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     */
    private java.util.List<AssetModelProperty> assetModelProperties;
    /**
     * <p>
     * The updated hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be
     * children of any other assets created from this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 10 hierarchies per asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     */
    private java.util.List<AssetModelHierarchy> assetModelHierarchies;
    /**
     * <p>
     * The composite asset models that are part of this asset model. Composite asset models are asset models that
     * contain specific properties. Each composite model has a type that defines the properties that the composite model
     * supports. Use composite asset models to define alarms on this asset model.
     * </p>
     */
    private java.util.List<AssetModelCompositeModel> assetModelCompositeModels;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the asset model to update.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model to update.
     */

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model to update.
     * </p>
     * 
     * @return The ID of the asset model to update.
     */

    public String getAssetModelId() {
        return this.assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model to update.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetModelRequest withAssetModelId(String assetModelId) {
        setAssetModelId(assetModelId);
        return this;
    }

    /**
     * <p>
     * A unique, friendly name for the asset model.
     * </p>
     * 
     * @param assetModelName
     *        A unique, friendly name for the asset model.
     */

    public void setAssetModelName(String assetModelName) {
        this.assetModelName = assetModelName;
    }

    /**
     * <p>
     * A unique, friendly name for the asset model.
     * </p>
     * 
     * @return A unique, friendly name for the asset model.
     */

    public String getAssetModelName() {
        return this.assetModelName;
    }

    /**
     * <p>
     * A unique, friendly name for the asset model.
     * </p>
     * 
     * @param assetModelName
     *        A unique, friendly name for the asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetModelRequest withAssetModelName(String assetModelName) {
        setAssetModelName(assetModelName);
        return this;
    }

    /**
     * <p>
     * A description for the asset model.
     * </p>
     * 
     * @param assetModelDescription
     *        A description for the asset model.
     */

    public void setAssetModelDescription(String assetModelDescription) {
        this.assetModelDescription = assetModelDescription;
    }

    /**
     * <p>
     * A description for the asset model.
     * </p>
     * 
     * @return A description for the asset model.
     */

    public String getAssetModelDescription() {
        return this.assetModelDescription;
    }

    /**
     * <p>
     * A description for the asset model.
     * </p>
     * 
     * @param assetModelDescription
     *        A description for the asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetModelRequest withAssetModelDescription(String assetModelDescription) {
        setAssetModelDescription(assetModelDescription);
        return this;
    }

    /**
     * <p>
     * The updated property definitions of the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset properties</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 200 properties per asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * 
     * @return The updated property definitions of the asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset
     *         properties</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *         <p>
     *         You can specify up to 200 properties per asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *         SiteWise User Guide</i>.
     */

    public java.util.List<AssetModelProperty> getAssetModelProperties() {
        return assetModelProperties;
    }

    /**
     * <p>
     * The updated property definitions of the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset properties</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 200 properties per asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * 
     * @param assetModelProperties
     *        The updated property definitions of the asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset
     *        properties</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        You can specify up to 200 properties per asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     */

    public void setAssetModelProperties(java.util.Collection<AssetModelProperty> assetModelProperties) {
        if (assetModelProperties == null) {
            this.assetModelProperties = null;
            return;
        }

        this.assetModelProperties = new java.util.ArrayList<AssetModelProperty>(assetModelProperties);
    }

    /**
     * <p>
     * The updated property definitions of the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset properties</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 200 properties per asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetModelProperties(java.util.Collection)} or {@link #withAssetModelProperties(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param assetModelProperties
     *        The updated property definitions of the asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset
     *        properties</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        You can specify up to 200 properties per asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetModelRequest withAssetModelProperties(AssetModelProperty... assetModelProperties) {
        if (this.assetModelProperties == null) {
            setAssetModelProperties(new java.util.ArrayList<AssetModelProperty>(assetModelProperties.length));
        }
        for (AssetModelProperty ele : assetModelProperties) {
            this.assetModelProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The updated property definitions of the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset properties</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 200 properties per asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * 
     * @param assetModelProperties
     *        The updated property definitions of the asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset
     *        properties</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        You can specify up to 200 properties per asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetModelRequest withAssetModelProperties(java.util.Collection<AssetModelProperty> assetModelProperties) {
        setAssetModelProperties(assetModelProperties);
        return this;
    }

    /**
     * <p>
     * The updated hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be
     * children of any other assets created from this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 10 hierarchies per asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * 
     * @return The updated hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose
     *         assets can be children of any other assets created from this asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *         hierarchies</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *         <p>
     *         You can specify up to 10 hierarchies per asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *         SiteWise User Guide</i>.
     */

    public java.util.List<AssetModelHierarchy> getAssetModelHierarchies() {
        return assetModelHierarchies;
    }

    /**
     * <p>
     * The updated hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be
     * children of any other assets created from this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 10 hierarchies per asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * 
     * @param assetModelHierarchies
     *        The updated hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets
     *        can be children of any other assets created from this asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *        hierarchies</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        You can specify up to 10 hierarchies per asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     */

    public void setAssetModelHierarchies(java.util.Collection<AssetModelHierarchy> assetModelHierarchies) {
        if (assetModelHierarchies == null) {
            this.assetModelHierarchies = null;
            return;
        }

        this.assetModelHierarchies = new java.util.ArrayList<AssetModelHierarchy>(assetModelHierarchies);
    }

    /**
     * <p>
     * The updated hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be
     * children of any other assets created from this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 10 hierarchies per asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetModelHierarchies(java.util.Collection)} or
     * {@link #withAssetModelHierarchies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assetModelHierarchies
     *        The updated hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets
     *        can be children of any other assets created from this asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *        hierarchies</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        You can specify up to 10 hierarchies per asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetModelRequest withAssetModelHierarchies(AssetModelHierarchy... assetModelHierarchies) {
        if (this.assetModelHierarchies == null) {
            setAssetModelHierarchies(new java.util.ArrayList<AssetModelHierarchy>(assetModelHierarchies.length));
        }
        for (AssetModelHierarchy ele : assetModelHierarchies) {
            this.assetModelHierarchies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The updated hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be
     * children of any other assets created from this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 10 hierarchies per asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * 
     * @param assetModelHierarchies
     *        The updated hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets
     *        can be children of any other assets created from this asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *        hierarchies</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        You can specify up to 10 hierarchies per asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetModelRequest withAssetModelHierarchies(java.util.Collection<AssetModelHierarchy> assetModelHierarchies) {
        setAssetModelHierarchies(assetModelHierarchies);
        return this;
    }

    /**
     * <p>
     * The composite asset models that are part of this asset model. Composite asset models are asset models that
     * contain specific properties. Each composite model has a type that defines the properties that the composite model
     * supports. Use composite asset models to define alarms on this asset model.
     * </p>
     * 
     * @return The composite asset models that are part of this asset model. Composite asset models are asset models
     *         that contain specific properties. Each composite model has a type that defines the properties that the
     *         composite model supports. Use composite asset models to define alarms on this asset model.
     */

    public java.util.List<AssetModelCompositeModel> getAssetModelCompositeModels() {
        return assetModelCompositeModels;
    }

    /**
     * <p>
     * The composite asset models that are part of this asset model. Composite asset models are asset models that
     * contain specific properties. Each composite model has a type that defines the properties that the composite model
     * supports. Use composite asset models to define alarms on this asset model.
     * </p>
     * 
     * @param assetModelCompositeModels
     *        The composite asset models that are part of this asset model. Composite asset models are asset models that
     *        contain specific properties. Each composite model has a type that defines the properties that the
     *        composite model supports. Use composite asset models to define alarms on this asset model.
     */

    public void setAssetModelCompositeModels(java.util.Collection<AssetModelCompositeModel> assetModelCompositeModels) {
        if (assetModelCompositeModels == null) {
            this.assetModelCompositeModels = null;
            return;
        }

        this.assetModelCompositeModels = new java.util.ArrayList<AssetModelCompositeModel>(assetModelCompositeModels);
    }

    /**
     * <p>
     * The composite asset models that are part of this asset model. Composite asset models are asset models that
     * contain specific properties. Each composite model has a type that defines the properties that the composite model
     * supports. Use composite asset models to define alarms on this asset model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetModelCompositeModels(java.util.Collection)} or
     * {@link #withAssetModelCompositeModels(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assetModelCompositeModels
     *        The composite asset models that are part of this asset model. Composite asset models are asset models that
     *        contain specific properties. Each composite model has a type that defines the properties that the
     *        composite model supports. Use composite asset models to define alarms on this asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetModelRequest withAssetModelCompositeModels(AssetModelCompositeModel... assetModelCompositeModels) {
        if (this.assetModelCompositeModels == null) {
            setAssetModelCompositeModels(new java.util.ArrayList<AssetModelCompositeModel>(assetModelCompositeModels.length));
        }
        for (AssetModelCompositeModel ele : assetModelCompositeModels) {
            this.assetModelCompositeModels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The composite asset models that are part of this asset model. Composite asset models are asset models that
     * contain specific properties. Each composite model has a type that defines the properties that the composite model
     * supports. Use composite asset models to define alarms on this asset model.
     * </p>
     * 
     * @param assetModelCompositeModels
     *        The composite asset models that are part of this asset model. Composite asset models are asset models that
     *        contain specific properties. Each composite model has a type that defines the properties that the
     *        composite model supports. Use composite asset models to define alarms on this asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetModelRequest withAssetModelCompositeModels(java.util.Collection<AssetModelCompositeModel> assetModelCompositeModels) {
        setAssetModelCompositeModels(assetModelCompositeModels);
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

    public UpdateAssetModelRequest withClientToken(String clientToken) {
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
        if (getAssetModelId() != null)
            sb.append("AssetModelId: ").append(getAssetModelId()).append(",");
        if (getAssetModelName() != null)
            sb.append("AssetModelName: ").append(getAssetModelName()).append(",");
        if (getAssetModelDescription() != null)
            sb.append("AssetModelDescription: ").append(getAssetModelDescription()).append(",");
        if (getAssetModelProperties() != null)
            sb.append("AssetModelProperties: ").append(getAssetModelProperties()).append(",");
        if (getAssetModelHierarchies() != null)
            sb.append("AssetModelHierarchies: ").append(getAssetModelHierarchies()).append(",");
        if (getAssetModelCompositeModels() != null)
            sb.append("AssetModelCompositeModels: ").append(getAssetModelCompositeModels()).append(",");
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

        if (obj instanceof UpdateAssetModelRequest == false)
            return false;
        UpdateAssetModelRequest other = (UpdateAssetModelRequest) obj;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getAssetModelName() == null ^ this.getAssetModelName() == null)
            return false;
        if (other.getAssetModelName() != null && other.getAssetModelName().equals(this.getAssetModelName()) == false)
            return false;
        if (other.getAssetModelDescription() == null ^ this.getAssetModelDescription() == null)
            return false;
        if (other.getAssetModelDescription() != null && other.getAssetModelDescription().equals(this.getAssetModelDescription()) == false)
            return false;
        if (other.getAssetModelProperties() == null ^ this.getAssetModelProperties() == null)
            return false;
        if (other.getAssetModelProperties() != null && other.getAssetModelProperties().equals(this.getAssetModelProperties()) == false)
            return false;
        if (other.getAssetModelHierarchies() == null ^ this.getAssetModelHierarchies() == null)
            return false;
        if (other.getAssetModelHierarchies() != null && other.getAssetModelHierarchies().equals(this.getAssetModelHierarchies()) == false)
            return false;
        if (other.getAssetModelCompositeModels() == null ^ this.getAssetModelCompositeModels() == null)
            return false;
        if (other.getAssetModelCompositeModels() != null && other.getAssetModelCompositeModels().equals(this.getAssetModelCompositeModels()) == false)
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

        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelName() == null) ? 0 : getAssetModelName().hashCode());
        hashCode = prime * hashCode + ((getAssetModelDescription() == null) ? 0 : getAssetModelDescription().hashCode());
        hashCode = prime * hashCode + ((getAssetModelProperties() == null) ? 0 : getAssetModelProperties().hashCode());
        hashCode = prime * hashCode + ((getAssetModelHierarchies() == null) ? 0 : getAssetModelHierarchies().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModels() == null) ? 0 : getAssetModelCompositeModels().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssetModelRequest clone() {
        return (UpdateAssetModelRequest) super.clone();
    }

}
