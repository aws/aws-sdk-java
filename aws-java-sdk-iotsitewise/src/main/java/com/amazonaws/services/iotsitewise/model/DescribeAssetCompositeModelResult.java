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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAssetCompositeModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetCompositeModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset, in UUID format. This ID uniquely identifies the asset within IoT SiteWise and can be used
     * with other IoT SiteWise APIs.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The ID of a composite model on this asset.
     * </p>
     */
    private String assetCompositeModelId;
    /**
     * <p>
     * An external ID to assign to the asset model.
     * </p>
     * <p>
     * If the composite model is a component-based composite model, or one nested inside a component model, you can only
     * set the external ID using <code>UpdateAssetModelCompositeModel</code> and specifying the derived ID of the model
     * or property from the created model it's a part of.
     * </p>
     */
    private String assetCompositeModelExternalId;
    /**
     * <p>
     * The path to the composite model listing the parent composite models.
     * </p>
     */
    private java.util.List<AssetCompositeModelPathSegment> assetCompositeModelPath;
    /**
     * <p>
     * The unique, friendly name for the composite model.
     * </p>
     */
    private String assetCompositeModelName;
    /**
     * <p>
     * A description for the composite model.
     * </p>
     */
    private String assetCompositeModelDescription;
    /**
     * <p>
     * The composite model type. Valid values are <code>AWS/ALARM</code>, <code>CUSTOM</code>, or
     * <code> AWS/L4E_ANOMALY</code>.
     * </p>
     */
    private String assetCompositeModelType;
    /**
     * <p>
     * The property definitions of the composite model that was used to create the asset.
     * </p>
     */
    private java.util.List<AssetProperty> assetCompositeModelProperties;
    /**
     * <p>
     * The list of composite model summaries.
     * </p>
     */
    private java.util.List<AssetCompositeModelSummary> assetCompositeModelSummaries;
    /**
     * <p>
     * The available actions for a composite model on this asset.
     * </p>
     */
    private java.util.List<ActionDefinition> actionDefinitions;

    /**
     * <p>
     * The ID of the asset, in UUID format. This ID uniquely identifies the asset within IoT SiteWise and can be used
     * with other IoT SiteWise APIs.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset, in UUID format. This ID uniquely identifies the asset within IoT SiteWise and can be
     *        used with other IoT SiteWise APIs.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset, in UUID format. This ID uniquely identifies the asset within IoT SiteWise and can be used
     * with other IoT SiteWise APIs.
     * </p>
     * 
     * @return The ID of the asset, in UUID format. This ID uniquely identifies the asset within IoT SiteWise and can be
     *         used with other IoT SiteWise APIs.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset, in UUID format. This ID uniquely identifies the asset within IoT SiteWise and can be used
     * with other IoT SiteWise APIs.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset, in UUID format. This ID uniquely identifies the asset within IoT SiteWise and can be
     *        used with other IoT SiteWise APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetCompositeModelResult withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The ID of a composite model on this asset.
     * </p>
     * 
     * @param assetCompositeModelId
     *        The ID of a composite model on this asset.
     */

    public void setAssetCompositeModelId(String assetCompositeModelId) {
        this.assetCompositeModelId = assetCompositeModelId;
    }

    /**
     * <p>
     * The ID of a composite model on this asset.
     * </p>
     * 
     * @return The ID of a composite model on this asset.
     */

    public String getAssetCompositeModelId() {
        return this.assetCompositeModelId;
    }

    /**
     * <p>
     * The ID of a composite model on this asset.
     * </p>
     * 
     * @param assetCompositeModelId
     *        The ID of a composite model on this asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetCompositeModelResult withAssetCompositeModelId(String assetCompositeModelId) {
        setAssetCompositeModelId(assetCompositeModelId);
        return this;
    }

    /**
     * <p>
     * An external ID to assign to the asset model.
     * </p>
     * <p>
     * If the composite model is a component-based composite model, or one nested inside a component model, you can only
     * set the external ID using <code>UpdateAssetModelCompositeModel</code> and specifying the derived ID of the model
     * or property from the created model it's a part of.
     * </p>
     * 
     * @param assetCompositeModelExternalId
     *        An external ID to assign to the asset model.</p>
     *        <p>
     *        If the composite model is a component-based composite model, or one nested inside a component model, you
     *        can only set the external ID using <code>UpdateAssetModelCompositeModel</code> and specifying the derived
     *        ID of the model or property from the created model it's a part of.
     */

    public void setAssetCompositeModelExternalId(String assetCompositeModelExternalId) {
        this.assetCompositeModelExternalId = assetCompositeModelExternalId;
    }

    /**
     * <p>
     * An external ID to assign to the asset model.
     * </p>
     * <p>
     * If the composite model is a component-based composite model, or one nested inside a component model, you can only
     * set the external ID using <code>UpdateAssetModelCompositeModel</code> and specifying the derived ID of the model
     * or property from the created model it's a part of.
     * </p>
     * 
     * @return An external ID to assign to the asset model.</p>
     *         <p>
     *         If the composite model is a component-based composite model, or one nested inside a component model, you
     *         can only set the external ID using <code>UpdateAssetModelCompositeModel</code> and specifying the derived
     *         ID of the model or property from the created model it's a part of.
     */

    public String getAssetCompositeModelExternalId() {
        return this.assetCompositeModelExternalId;
    }

    /**
     * <p>
     * An external ID to assign to the asset model.
     * </p>
     * <p>
     * If the composite model is a component-based composite model, or one nested inside a component model, you can only
     * set the external ID using <code>UpdateAssetModelCompositeModel</code> and specifying the derived ID of the model
     * or property from the created model it's a part of.
     * </p>
     * 
     * @param assetCompositeModelExternalId
     *        An external ID to assign to the asset model.</p>
     *        <p>
     *        If the composite model is a component-based composite model, or one nested inside a component model, you
     *        can only set the external ID using <code>UpdateAssetModelCompositeModel</code> and specifying the derived
     *        ID of the model or property from the created model it's a part of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetCompositeModelResult withAssetCompositeModelExternalId(String assetCompositeModelExternalId) {
        setAssetCompositeModelExternalId(assetCompositeModelExternalId);
        return this;
    }

    /**
     * <p>
     * The path to the composite model listing the parent composite models.
     * </p>
     * 
     * @return The path to the composite model listing the parent composite models.
     */

    public java.util.List<AssetCompositeModelPathSegment> getAssetCompositeModelPath() {
        return assetCompositeModelPath;
    }

    /**
     * <p>
     * The path to the composite model listing the parent composite models.
     * </p>
     * 
     * @param assetCompositeModelPath
     *        The path to the composite model listing the parent composite models.
     */

    public void setAssetCompositeModelPath(java.util.Collection<AssetCompositeModelPathSegment> assetCompositeModelPath) {
        if (assetCompositeModelPath == null) {
            this.assetCompositeModelPath = null;
            return;
        }

        this.assetCompositeModelPath = new java.util.ArrayList<AssetCompositeModelPathSegment>(assetCompositeModelPath);
    }

    /**
     * <p>
     * The path to the composite model listing the parent composite models.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetCompositeModelPath(java.util.Collection)} or
     * {@link #withAssetCompositeModelPath(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assetCompositeModelPath
     *        The path to the composite model listing the parent composite models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetCompositeModelResult withAssetCompositeModelPath(AssetCompositeModelPathSegment... assetCompositeModelPath) {
        if (this.assetCompositeModelPath == null) {
            setAssetCompositeModelPath(new java.util.ArrayList<AssetCompositeModelPathSegment>(assetCompositeModelPath.length));
        }
        for (AssetCompositeModelPathSegment ele : assetCompositeModelPath) {
            this.assetCompositeModelPath.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The path to the composite model listing the parent composite models.
     * </p>
     * 
     * @param assetCompositeModelPath
     *        The path to the composite model listing the parent composite models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetCompositeModelResult withAssetCompositeModelPath(java.util.Collection<AssetCompositeModelPathSegment> assetCompositeModelPath) {
        setAssetCompositeModelPath(assetCompositeModelPath);
        return this;
    }

    /**
     * <p>
     * The unique, friendly name for the composite model.
     * </p>
     * 
     * @param assetCompositeModelName
     *        The unique, friendly name for the composite model.
     */

    public void setAssetCompositeModelName(String assetCompositeModelName) {
        this.assetCompositeModelName = assetCompositeModelName;
    }

    /**
     * <p>
     * The unique, friendly name for the composite model.
     * </p>
     * 
     * @return The unique, friendly name for the composite model.
     */

    public String getAssetCompositeModelName() {
        return this.assetCompositeModelName;
    }

    /**
     * <p>
     * The unique, friendly name for the composite model.
     * </p>
     * 
     * @param assetCompositeModelName
     *        The unique, friendly name for the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetCompositeModelResult withAssetCompositeModelName(String assetCompositeModelName) {
        setAssetCompositeModelName(assetCompositeModelName);
        return this;
    }

    /**
     * <p>
     * A description for the composite model.
     * </p>
     * 
     * @param assetCompositeModelDescription
     *        A description for the composite model.
     */

    public void setAssetCompositeModelDescription(String assetCompositeModelDescription) {
        this.assetCompositeModelDescription = assetCompositeModelDescription;
    }

    /**
     * <p>
     * A description for the composite model.
     * </p>
     * 
     * @return A description for the composite model.
     */

    public String getAssetCompositeModelDescription() {
        return this.assetCompositeModelDescription;
    }

    /**
     * <p>
     * A description for the composite model.
     * </p>
     * 
     * @param assetCompositeModelDescription
     *        A description for the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetCompositeModelResult withAssetCompositeModelDescription(String assetCompositeModelDescription) {
        setAssetCompositeModelDescription(assetCompositeModelDescription);
        return this;
    }

    /**
     * <p>
     * The composite model type. Valid values are <code>AWS/ALARM</code>, <code>CUSTOM</code>, or
     * <code> AWS/L4E_ANOMALY</code>.
     * </p>
     * 
     * @param assetCompositeModelType
     *        The composite model type. Valid values are <code>AWS/ALARM</code>, <code>CUSTOM</code>, or
     *        <code> AWS/L4E_ANOMALY</code>.
     */

    public void setAssetCompositeModelType(String assetCompositeModelType) {
        this.assetCompositeModelType = assetCompositeModelType;
    }

    /**
     * <p>
     * The composite model type. Valid values are <code>AWS/ALARM</code>, <code>CUSTOM</code>, or
     * <code> AWS/L4E_ANOMALY</code>.
     * </p>
     * 
     * @return The composite model type. Valid values are <code>AWS/ALARM</code>, <code>CUSTOM</code>, or
     *         <code> AWS/L4E_ANOMALY</code>.
     */

    public String getAssetCompositeModelType() {
        return this.assetCompositeModelType;
    }

    /**
     * <p>
     * The composite model type. Valid values are <code>AWS/ALARM</code>, <code>CUSTOM</code>, or
     * <code> AWS/L4E_ANOMALY</code>.
     * </p>
     * 
     * @param assetCompositeModelType
     *        The composite model type. Valid values are <code>AWS/ALARM</code>, <code>CUSTOM</code>, or
     *        <code> AWS/L4E_ANOMALY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetCompositeModelResult withAssetCompositeModelType(String assetCompositeModelType) {
        setAssetCompositeModelType(assetCompositeModelType);
        return this;
    }

    /**
     * <p>
     * The property definitions of the composite model that was used to create the asset.
     * </p>
     * 
     * @return The property definitions of the composite model that was used to create the asset.
     */

    public java.util.List<AssetProperty> getAssetCompositeModelProperties() {
        return assetCompositeModelProperties;
    }

    /**
     * <p>
     * The property definitions of the composite model that was used to create the asset.
     * </p>
     * 
     * @param assetCompositeModelProperties
     *        The property definitions of the composite model that was used to create the asset.
     */

    public void setAssetCompositeModelProperties(java.util.Collection<AssetProperty> assetCompositeModelProperties) {
        if (assetCompositeModelProperties == null) {
            this.assetCompositeModelProperties = null;
            return;
        }

        this.assetCompositeModelProperties = new java.util.ArrayList<AssetProperty>(assetCompositeModelProperties);
    }

    /**
     * <p>
     * The property definitions of the composite model that was used to create the asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetCompositeModelProperties(java.util.Collection)} or
     * {@link #withAssetCompositeModelProperties(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assetCompositeModelProperties
     *        The property definitions of the composite model that was used to create the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetCompositeModelResult withAssetCompositeModelProperties(AssetProperty... assetCompositeModelProperties) {
        if (this.assetCompositeModelProperties == null) {
            setAssetCompositeModelProperties(new java.util.ArrayList<AssetProperty>(assetCompositeModelProperties.length));
        }
        for (AssetProperty ele : assetCompositeModelProperties) {
            this.assetCompositeModelProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The property definitions of the composite model that was used to create the asset.
     * </p>
     * 
     * @param assetCompositeModelProperties
     *        The property definitions of the composite model that was used to create the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetCompositeModelResult withAssetCompositeModelProperties(java.util.Collection<AssetProperty> assetCompositeModelProperties) {
        setAssetCompositeModelProperties(assetCompositeModelProperties);
        return this;
    }

    /**
     * <p>
     * The list of composite model summaries.
     * </p>
     * 
     * @return The list of composite model summaries.
     */

    public java.util.List<AssetCompositeModelSummary> getAssetCompositeModelSummaries() {
        return assetCompositeModelSummaries;
    }

    /**
     * <p>
     * The list of composite model summaries.
     * </p>
     * 
     * @param assetCompositeModelSummaries
     *        The list of composite model summaries.
     */

    public void setAssetCompositeModelSummaries(java.util.Collection<AssetCompositeModelSummary> assetCompositeModelSummaries) {
        if (assetCompositeModelSummaries == null) {
            this.assetCompositeModelSummaries = null;
            return;
        }

        this.assetCompositeModelSummaries = new java.util.ArrayList<AssetCompositeModelSummary>(assetCompositeModelSummaries);
    }

    /**
     * <p>
     * The list of composite model summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetCompositeModelSummaries(java.util.Collection)} or
     * {@link #withAssetCompositeModelSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assetCompositeModelSummaries
     *        The list of composite model summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetCompositeModelResult withAssetCompositeModelSummaries(AssetCompositeModelSummary... assetCompositeModelSummaries) {
        if (this.assetCompositeModelSummaries == null) {
            setAssetCompositeModelSummaries(new java.util.ArrayList<AssetCompositeModelSummary>(assetCompositeModelSummaries.length));
        }
        for (AssetCompositeModelSummary ele : assetCompositeModelSummaries) {
            this.assetCompositeModelSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of composite model summaries.
     * </p>
     * 
     * @param assetCompositeModelSummaries
     *        The list of composite model summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetCompositeModelResult withAssetCompositeModelSummaries(java.util.Collection<AssetCompositeModelSummary> assetCompositeModelSummaries) {
        setAssetCompositeModelSummaries(assetCompositeModelSummaries);
        return this;
    }

    /**
     * <p>
     * The available actions for a composite model on this asset.
     * </p>
     * 
     * @return The available actions for a composite model on this asset.
     */

    public java.util.List<ActionDefinition> getActionDefinitions() {
        return actionDefinitions;
    }

    /**
     * <p>
     * The available actions for a composite model on this asset.
     * </p>
     * 
     * @param actionDefinitions
     *        The available actions for a composite model on this asset.
     */

    public void setActionDefinitions(java.util.Collection<ActionDefinition> actionDefinitions) {
        if (actionDefinitions == null) {
            this.actionDefinitions = null;
            return;
        }

        this.actionDefinitions = new java.util.ArrayList<ActionDefinition>(actionDefinitions);
    }

    /**
     * <p>
     * The available actions for a composite model on this asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionDefinitions(java.util.Collection)} or {@link #withActionDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param actionDefinitions
     *        The available actions for a composite model on this asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetCompositeModelResult withActionDefinitions(ActionDefinition... actionDefinitions) {
        if (this.actionDefinitions == null) {
            setActionDefinitions(new java.util.ArrayList<ActionDefinition>(actionDefinitions.length));
        }
        for (ActionDefinition ele : actionDefinitions) {
            this.actionDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The available actions for a composite model on this asset.
     * </p>
     * 
     * @param actionDefinitions
     *        The available actions for a composite model on this asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetCompositeModelResult withActionDefinitions(java.util.Collection<ActionDefinition> actionDefinitions) {
        setActionDefinitions(actionDefinitions);
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
        if (getAssetCompositeModelId() != null)
            sb.append("AssetCompositeModelId: ").append(getAssetCompositeModelId()).append(",");
        if (getAssetCompositeModelExternalId() != null)
            sb.append("AssetCompositeModelExternalId: ").append(getAssetCompositeModelExternalId()).append(",");
        if (getAssetCompositeModelPath() != null)
            sb.append("AssetCompositeModelPath: ").append(getAssetCompositeModelPath()).append(",");
        if (getAssetCompositeModelName() != null)
            sb.append("AssetCompositeModelName: ").append(getAssetCompositeModelName()).append(",");
        if (getAssetCompositeModelDescription() != null)
            sb.append("AssetCompositeModelDescription: ").append(getAssetCompositeModelDescription()).append(",");
        if (getAssetCompositeModelType() != null)
            sb.append("AssetCompositeModelType: ").append(getAssetCompositeModelType()).append(",");
        if (getAssetCompositeModelProperties() != null)
            sb.append("AssetCompositeModelProperties: ").append(getAssetCompositeModelProperties()).append(",");
        if (getAssetCompositeModelSummaries() != null)
            sb.append("AssetCompositeModelSummaries: ").append(getAssetCompositeModelSummaries()).append(",");
        if (getActionDefinitions() != null)
            sb.append("ActionDefinitions: ").append(getActionDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssetCompositeModelResult == false)
            return false;
        DescribeAssetCompositeModelResult other = (DescribeAssetCompositeModelResult) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getAssetCompositeModelId() == null ^ this.getAssetCompositeModelId() == null)
            return false;
        if (other.getAssetCompositeModelId() != null && other.getAssetCompositeModelId().equals(this.getAssetCompositeModelId()) == false)
            return false;
        if (other.getAssetCompositeModelExternalId() == null ^ this.getAssetCompositeModelExternalId() == null)
            return false;
        if (other.getAssetCompositeModelExternalId() != null
                && other.getAssetCompositeModelExternalId().equals(this.getAssetCompositeModelExternalId()) == false)
            return false;
        if (other.getAssetCompositeModelPath() == null ^ this.getAssetCompositeModelPath() == null)
            return false;
        if (other.getAssetCompositeModelPath() != null && other.getAssetCompositeModelPath().equals(this.getAssetCompositeModelPath()) == false)
            return false;
        if (other.getAssetCompositeModelName() == null ^ this.getAssetCompositeModelName() == null)
            return false;
        if (other.getAssetCompositeModelName() != null && other.getAssetCompositeModelName().equals(this.getAssetCompositeModelName()) == false)
            return false;
        if (other.getAssetCompositeModelDescription() == null ^ this.getAssetCompositeModelDescription() == null)
            return false;
        if (other.getAssetCompositeModelDescription() != null
                && other.getAssetCompositeModelDescription().equals(this.getAssetCompositeModelDescription()) == false)
            return false;
        if (other.getAssetCompositeModelType() == null ^ this.getAssetCompositeModelType() == null)
            return false;
        if (other.getAssetCompositeModelType() != null && other.getAssetCompositeModelType().equals(this.getAssetCompositeModelType()) == false)
            return false;
        if (other.getAssetCompositeModelProperties() == null ^ this.getAssetCompositeModelProperties() == null)
            return false;
        if (other.getAssetCompositeModelProperties() != null
                && other.getAssetCompositeModelProperties().equals(this.getAssetCompositeModelProperties()) == false)
            return false;
        if (other.getAssetCompositeModelSummaries() == null ^ this.getAssetCompositeModelSummaries() == null)
            return false;
        if (other.getAssetCompositeModelSummaries() != null && other.getAssetCompositeModelSummaries().equals(this.getAssetCompositeModelSummaries()) == false)
            return false;
        if (other.getActionDefinitions() == null ^ this.getActionDefinitions() == null)
            return false;
        if (other.getActionDefinitions() != null && other.getActionDefinitions().equals(this.getActionDefinitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getAssetCompositeModelId() == null) ? 0 : getAssetCompositeModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetCompositeModelExternalId() == null) ? 0 : getAssetCompositeModelExternalId().hashCode());
        hashCode = prime * hashCode + ((getAssetCompositeModelPath() == null) ? 0 : getAssetCompositeModelPath().hashCode());
        hashCode = prime * hashCode + ((getAssetCompositeModelName() == null) ? 0 : getAssetCompositeModelName().hashCode());
        hashCode = prime * hashCode + ((getAssetCompositeModelDescription() == null) ? 0 : getAssetCompositeModelDescription().hashCode());
        hashCode = prime * hashCode + ((getAssetCompositeModelType() == null) ? 0 : getAssetCompositeModelType().hashCode());
        hashCode = prime * hashCode + ((getAssetCompositeModelProperties() == null) ? 0 : getAssetCompositeModelProperties().hashCode());
        hashCode = prime * hashCode + ((getAssetCompositeModelSummaries() == null) ? 0 : getAssetCompositeModelSummaries().hashCode());
        hashCode = prime * hashCode + ((getActionDefinitions() == null) ? 0 : getActionDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssetCompositeModelResult clone() {
        try {
            return (DescribeAssetCompositeModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
