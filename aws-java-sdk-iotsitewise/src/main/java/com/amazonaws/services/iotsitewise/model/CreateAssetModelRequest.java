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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAssetModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssetModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The property definitions of the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset properties</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 200 properties per asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     */
    private java.util.List<AssetModelPropertyDefinition> assetModelProperties;
    /**
     * <p>
     * The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be
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
    private java.util.List<AssetModelHierarchyDefinition> assetModelHierarchies;
    /**
     * <p>
     * The composite models that are part of this asset model. It groups properties (such as attributes, measurements,
     * transforms, and metrics) and child composite models that model parts of your industrial equipment. Each composite
     * model has a type that defines the properties that the composite model supports. Use composite models to define
     * alarms on this asset model.
     * </p>
     * <note>
     * <p>
     * When creating custom composite models, you need to use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html"
     * >CreateAssetModelCompositeModel</a>. For more information, see &lt;LINK&gt;.
     * </p>
     * </note>
     */
    private java.util.List<AssetModelCompositeModelDefinition> assetModelCompositeModels;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A list of key-value pairs that contain metadata for the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The ID to assign to the asset model, if desired. IoT SiteWise automatically generates a unique ID for you, so
     * this parameter is never required. However, if you prefer to supply your own ID instead, you can specify it here
     * in UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     */
    private String assetModelId;
    /**
     * <p>
     * An external ID to assign to the asset model. The external ID must be unique within your Amazon Web Services
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String assetModelExternalId;
    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     */
    private String assetModelType;

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

    public CreateAssetModelRequest withAssetModelName(String assetModelName) {
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

    public CreateAssetModelRequest withAssetModelDescription(String assetModelDescription) {
        setAssetModelDescription(assetModelDescription);
        return this;
    }

    /**
     * <p>
     * The property definitions of the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset properties</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 200 properties per asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * 
     * @return The property definitions of the asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset
     *         properties</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *         <p>
     *         You can specify up to 200 properties per asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *         SiteWise User Guide</i>.
     */

    public java.util.List<AssetModelPropertyDefinition> getAssetModelProperties() {
        return assetModelProperties;
    }

    /**
     * <p>
     * The property definitions of the asset model. For more information, see <a
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
     *        The property definitions of the asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset
     *        properties</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        You can specify up to 200 properties per asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     */

    public void setAssetModelProperties(java.util.Collection<AssetModelPropertyDefinition> assetModelProperties) {
        if (assetModelProperties == null) {
            this.assetModelProperties = null;
            return;
        }

        this.assetModelProperties = new java.util.ArrayList<AssetModelPropertyDefinition>(assetModelProperties);
    }

    /**
     * <p>
     * The property definitions of the asset model. For more information, see <a
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
     *        The property definitions of the asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset
     *        properties</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        You can specify up to 200 properties per asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelRequest withAssetModelProperties(AssetModelPropertyDefinition... assetModelProperties) {
        if (this.assetModelProperties == null) {
            setAssetModelProperties(new java.util.ArrayList<AssetModelPropertyDefinition>(assetModelProperties.length));
        }
        for (AssetModelPropertyDefinition ele : assetModelProperties) {
            this.assetModelProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The property definitions of the asset model. For more information, see <a
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
     *        The property definitions of the asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html">Asset
     *        properties</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        You can specify up to 200 properties per asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelRequest withAssetModelProperties(java.util.Collection<AssetModelPropertyDefinition> assetModelProperties) {
        setAssetModelProperties(assetModelProperties);
        return this;
    }

    /**
     * <p>
     * The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be
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
     * @return The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be
     *         children of any other assets created from this asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *         hierarchies</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *         <p>
     *         You can specify up to 10 hierarchies per asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *         SiteWise User Guide</i>.
     */

    public java.util.List<AssetModelHierarchyDefinition> getAssetModelHierarchies() {
        return assetModelHierarchies;
    }

    /**
     * <p>
     * The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be
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
     *        The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be
     *        children of any other assets created from this asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *        hierarchies</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        You can specify up to 10 hierarchies per asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     */

    public void setAssetModelHierarchies(java.util.Collection<AssetModelHierarchyDefinition> assetModelHierarchies) {
        if (assetModelHierarchies == null) {
            this.assetModelHierarchies = null;
            return;
        }

        this.assetModelHierarchies = new java.util.ArrayList<AssetModelHierarchyDefinition>(assetModelHierarchies);
    }

    /**
     * <p>
     * The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be
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
     *        The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be
     *        children of any other assets created from this asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *        hierarchies</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        You can specify up to 10 hierarchies per asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelRequest withAssetModelHierarchies(AssetModelHierarchyDefinition... assetModelHierarchies) {
        if (this.assetModelHierarchies == null) {
            setAssetModelHierarchies(new java.util.ArrayList<AssetModelHierarchyDefinition>(assetModelHierarchies.length));
        }
        for (AssetModelHierarchyDefinition ele : assetModelHierarchies) {
            this.assetModelHierarchies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be
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
     *        The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be
     *        children of any other assets created from this asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *        hierarchies</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        You can specify up to 10 hierarchies per asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelRequest withAssetModelHierarchies(java.util.Collection<AssetModelHierarchyDefinition> assetModelHierarchies) {
        setAssetModelHierarchies(assetModelHierarchies);
        return this;
    }

    /**
     * <p>
     * The composite models that are part of this asset model. It groups properties (such as attributes, measurements,
     * transforms, and metrics) and child composite models that model parts of your industrial equipment. Each composite
     * model has a type that defines the properties that the composite model supports. Use composite models to define
     * alarms on this asset model.
     * </p>
     * <note>
     * <p>
     * When creating custom composite models, you need to use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html"
     * >CreateAssetModelCompositeModel</a>. For more information, see &lt;LINK&gt;.
     * </p>
     * </note>
     * 
     * @return The composite models that are part of this asset model. It groups properties (such as attributes,
     *         measurements, transforms, and metrics) and child composite models that model parts of your industrial
     *         equipment. Each composite model has a type that defines the properties that the composite model supports.
     *         Use composite models to define alarms on this asset model.</p> <note>
     *         <p>
     *         When creating custom composite models, you need to use <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html"
     *         >CreateAssetModelCompositeModel</a>. For more information, see &lt;LINK&gt;.
     *         </p>
     */

    public java.util.List<AssetModelCompositeModelDefinition> getAssetModelCompositeModels() {
        return assetModelCompositeModels;
    }

    /**
     * <p>
     * The composite models that are part of this asset model. It groups properties (such as attributes, measurements,
     * transforms, and metrics) and child composite models that model parts of your industrial equipment. Each composite
     * model has a type that defines the properties that the composite model supports. Use composite models to define
     * alarms on this asset model.
     * </p>
     * <note>
     * <p>
     * When creating custom composite models, you need to use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html"
     * >CreateAssetModelCompositeModel</a>. For more information, see &lt;LINK&gt;.
     * </p>
     * </note>
     * 
     * @param assetModelCompositeModels
     *        The composite models that are part of this asset model. It groups properties (such as attributes,
     *        measurements, transforms, and metrics) and child composite models that model parts of your industrial
     *        equipment. Each composite model has a type that defines the properties that the composite model supports.
     *        Use composite models to define alarms on this asset model.</p> <note>
     *        <p>
     *        When creating custom composite models, you need to use <a href=
     *        "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html"
     *        >CreateAssetModelCompositeModel</a>. For more information, see &lt;LINK&gt;.
     *        </p>
     */

    public void setAssetModelCompositeModels(java.util.Collection<AssetModelCompositeModelDefinition> assetModelCompositeModels) {
        if (assetModelCompositeModels == null) {
            this.assetModelCompositeModels = null;
            return;
        }

        this.assetModelCompositeModels = new java.util.ArrayList<AssetModelCompositeModelDefinition>(assetModelCompositeModels);
    }

    /**
     * <p>
     * The composite models that are part of this asset model. It groups properties (such as attributes, measurements,
     * transforms, and metrics) and child composite models that model parts of your industrial equipment. Each composite
     * model has a type that defines the properties that the composite model supports. Use composite models to define
     * alarms on this asset model.
     * </p>
     * <note>
     * <p>
     * When creating custom composite models, you need to use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html"
     * >CreateAssetModelCompositeModel</a>. For more information, see &lt;LINK&gt;.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetModelCompositeModels(java.util.Collection)} or
     * {@link #withAssetModelCompositeModels(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assetModelCompositeModels
     *        The composite models that are part of this asset model. It groups properties (such as attributes,
     *        measurements, transforms, and metrics) and child composite models that model parts of your industrial
     *        equipment. Each composite model has a type that defines the properties that the composite model supports.
     *        Use composite models to define alarms on this asset model.</p> <note>
     *        <p>
     *        When creating custom composite models, you need to use <a href=
     *        "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html"
     *        >CreateAssetModelCompositeModel</a>. For more information, see &lt;LINK&gt;.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelRequest withAssetModelCompositeModels(AssetModelCompositeModelDefinition... assetModelCompositeModels) {
        if (this.assetModelCompositeModels == null) {
            setAssetModelCompositeModels(new java.util.ArrayList<AssetModelCompositeModelDefinition>(assetModelCompositeModels.length));
        }
        for (AssetModelCompositeModelDefinition ele : assetModelCompositeModels) {
            this.assetModelCompositeModels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The composite models that are part of this asset model. It groups properties (such as attributes, measurements,
     * transforms, and metrics) and child composite models that model parts of your industrial equipment. Each composite
     * model has a type that defines the properties that the composite model supports. Use composite models to define
     * alarms on this asset model.
     * </p>
     * <note>
     * <p>
     * When creating custom composite models, you need to use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html"
     * >CreateAssetModelCompositeModel</a>. For more information, see &lt;LINK&gt;.
     * </p>
     * </note>
     * 
     * @param assetModelCompositeModels
     *        The composite models that are part of this asset model. It groups properties (such as attributes,
     *        measurements, transforms, and metrics) and child composite models that model parts of your industrial
     *        equipment. Each composite model has a type that defines the properties that the composite model supports.
     *        Use composite models to define alarms on this asset model.</p> <note>
     *        <p>
     *        When creating custom composite models, you need to use <a href=
     *        "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html"
     *        >CreateAssetModelCompositeModel</a>. For more information, see &lt;LINK&gt;.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelRequest withAssetModelCompositeModels(java.util.Collection<AssetModelCompositeModelDefinition> assetModelCompositeModels) {
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

    public CreateAssetModelRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return A list of key-value pairs that contain metadata for the asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *         SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *        SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *        SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAssetModelRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The ID to assign to the asset model, if desired. IoT SiteWise automatically generates a unique ID for you, so
     * this parameter is never required. However, if you prefer to supply your own ID instead, you can specify it here
     * in UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @param assetModelId
     *        The ID to assign to the asset model, if desired. IoT SiteWise automatically generates a unique ID for you,
     *        so this parameter is never required. However, if you prefer to supply your own ID instead, you can specify
     *        it here in UUID format. If you specify your own ID, it must be globally unique.
     */

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID to assign to the asset model, if desired. IoT SiteWise automatically generates a unique ID for you, so
     * this parameter is never required. However, if you prefer to supply your own ID instead, you can specify it here
     * in UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @return The ID to assign to the asset model, if desired. IoT SiteWise automatically generates a unique ID for
     *         you, so this parameter is never required. However, if you prefer to supply your own ID instead, you can
     *         specify it here in UUID format. If you specify your own ID, it must be globally unique.
     */

    public String getAssetModelId() {
        return this.assetModelId;
    }

    /**
     * <p>
     * The ID to assign to the asset model, if desired. IoT SiteWise automatically generates a unique ID for you, so
     * this parameter is never required. However, if you prefer to supply your own ID instead, you can specify it here
     * in UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @param assetModelId
     *        The ID to assign to the asset model, if desired. IoT SiteWise automatically generates a unique ID for you,
     *        so this parameter is never required. However, if you prefer to supply your own ID instead, you can specify
     *        it here in UUID format. If you specify your own ID, it must be globally unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelRequest withAssetModelId(String assetModelId) {
        setAssetModelId(assetModelId);
        return this;
    }

    /**
     * <p>
     * An external ID to assign to the asset model. The external ID must be unique within your Amazon Web Services
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param assetModelExternalId
     *        An external ID to assign to the asset model. The external ID must be unique within your Amazon Web
     *        Services account. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setAssetModelExternalId(String assetModelExternalId) {
        this.assetModelExternalId = assetModelExternalId;
    }

    /**
     * <p>
     * An external ID to assign to the asset model. The external ID must be unique within your Amazon Web Services
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return An external ID to assign to the asset model. The external ID must be unique within your Amazon Web
     *         Services account. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *         external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getAssetModelExternalId() {
        return this.assetModelExternalId;
    }

    /**
     * <p>
     * An external ID to assign to the asset model. The external ID must be unique within your Amazon Web Services
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param assetModelExternalId
     *        An external ID to assign to the asset model. The external ID must be unique within your Amazon Web
     *        Services account. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelRequest withAssetModelExternalId(String assetModelExternalId) {
        setAssetModelExternalId(assetModelExternalId);
        return this;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assetModelType
     *        The type of asset model.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *        component in another asset model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *        models. You can't create assets directly from this type of asset model.
     *        </p>
     *        </li>
     * @see AssetModelType
     */

    public void setAssetModelType(String assetModelType) {
        this.assetModelType = assetModelType;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of asset model.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *         component in another asset model.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *         models. You can't create assets directly from this type of asset model.
     *         </p>
     *         </li>
     * @see AssetModelType
     */

    public String getAssetModelType() {
        return this.assetModelType;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assetModelType
     *        The type of asset model.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *        component in another asset model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *        models. You can't create assets directly from this type of asset model.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetModelType
     */

    public CreateAssetModelRequest withAssetModelType(String assetModelType) {
        setAssetModelType(assetModelType);
        return this;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assetModelType
     *        The type of asset model.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *        component in another asset model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *        models. You can't create assets directly from this type of asset model.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetModelType
     */

    public CreateAssetModelRequest withAssetModelType(AssetModelType assetModelType) {
        this.assetModelType = assetModelType.toString();
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
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAssetModelId() != null)
            sb.append("AssetModelId: ").append(getAssetModelId()).append(",");
        if (getAssetModelExternalId() != null)
            sb.append("AssetModelExternalId: ").append(getAssetModelExternalId()).append(",");
        if (getAssetModelType() != null)
            sb.append("AssetModelType: ").append(getAssetModelType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssetModelRequest == false)
            return false;
        CreateAssetModelRequest other = (CreateAssetModelRequest) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getAssetModelExternalId() == null ^ this.getAssetModelExternalId() == null)
            return false;
        if (other.getAssetModelExternalId() != null && other.getAssetModelExternalId().equals(this.getAssetModelExternalId()) == false)
            return false;
        if (other.getAssetModelType() == null ^ this.getAssetModelType() == null)
            return false;
        if (other.getAssetModelType() != null && other.getAssetModelType().equals(this.getAssetModelType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetModelName() == null) ? 0 : getAssetModelName().hashCode());
        hashCode = prime * hashCode + ((getAssetModelDescription() == null) ? 0 : getAssetModelDescription().hashCode());
        hashCode = prime * hashCode + ((getAssetModelProperties() == null) ? 0 : getAssetModelProperties().hashCode());
        hashCode = prime * hashCode + ((getAssetModelHierarchies() == null) ? 0 : getAssetModelHierarchies().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModels() == null) ? 0 : getAssetModelCompositeModels().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelExternalId() == null) ? 0 : getAssetModelExternalId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelType() == null) ? 0 : getAssetModelType().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssetModelRequest clone() {
        return (CreateAssetModelRequest) super.clone();
    }

}
