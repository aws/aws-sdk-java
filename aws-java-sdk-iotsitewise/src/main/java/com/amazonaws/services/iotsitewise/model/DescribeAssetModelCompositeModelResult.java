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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAssetModelCompositeModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetModelCompositeModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the asset model, in UUID format.
     * </p>
     */
    private String assetModelId;
    /**
     * <p>
     * The ID of a composite model on this asset model.
     * </p>
     */
    private String assetModelCompositeModelId;
    /**
     * <p>
     * The external ID of a composite model on this asset model.
     * </p>
     */
    private String assetModelCompositeModelExternalId;
    /**
     * <p>
     * The path to the composite model listing the parent composite models.
     * </p>
     */
    private java.util.List<AssetModelCompositeModelPathSegment> assetModelCompositeModelPath;
    /**
     * <p>
     * The unique, friendly name for the composite model.
     * </p>
     */
    private String assetModelCompositeModelName;
    /**
     * <p>
     * The description for the composite model.
     * </p>
     */
    private String assetModelCompositeModelDescription;
    /**
     * <p>
     * The composite model type. Valid values are <code>AWS/ALARM</code>, <code>CUSTOM</code>, or
     * <code> AWS/L4E_ANOMALY</code>.
     * </p>
     */
    private String assetModelCompositeModelType;
    /**
     * <p>
     * The property definitions of the composite model.
     * </p>
     */
    private java.util.List<AssetModelProperty> assetModelCompositeModelProperties;
    /**
     * <p>
     * Metadata for the composition relationship established by using <code>composedAssetModelId</code> in <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html">
     * <code>CreateAssetModelCompositeModel</code> </a>. For instance, an array detailing the path of the composition
     * relationship for this composite model.
     * </p>
     */
    private CompositionDetails compositionDetails;
    /**
     * <p>
     * The list of composite model summaries for the composite model.
     * </p>
     */
    private java.util.List<AssetModelCompositeModelSummary> assetModelCompositeModelSummaries;
    /**
     * <p>
     * The available actions for a composite model on this asset model.
     * </p>
     */
    private java.util.List<ActionDefinition> actionDefinitions;

    /**
     * <p>
     * The ID of the asset model, in UUID format.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model, in UUID format.
     */

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model, in UUID format.
     * </p>
     * 
     * @return The ID of the asset model, in UUID format.
     */

    public String getAssetModelId() {
        return this.assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model, in UUID format.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model, in UUID format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withAssetModelId(String assetModelId) {
        setAssetModelId(assetModelId);
        return this;
    }

    /**
     * <p>
     * The ID of a composite model on this asset model.
     * </p>
     * 
     * @param assetModelCompositeModelId
     *        The ID of a composite model on this asset model.
     */

    public void setAssetModelCompositeModelId(String assetModelCompositeModelId) {
        this.assetModelCompositeModelId = assetModelCompositeModelId;
    }

    /**
     * <p>
     * The ID of a composite model on this asset model.
     * </p>
     * 
     * @return The ID of a composite model on this asset model.
     */

    public String getAssetModelCompositeModelId() {
        return this.assetModelCompositeModelId;
    }

    /**
     * <p>
     * The ID of a composite model on this asset model.
     * </p>
     * 
     * @param assetModelCompositeModelId
     *        The ID of a composite model on this asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withAssetModelCompositeModelId(String assetModelCompositeModelId) {
        setAssetModelCompositeModelId(assetModelCompositeModelId);
        return this;
    }

    /**
     * <p>
     * The external ID of a composite model on this asset model.
     * </p>
     * 
     * @param assetModelCompositeModelExternalId
     *        The external ID of a composite model on this asset model.
     */

    public void setAssetModelCompositeModelExternalId(String assetModelCompositeModelExternalId) {
        this.assetModelCompositeModelExternalId = assetModelCompositeModelExternalId;
    }

    /**
     * <p>
     * The external ID of a composite model on this asset model.
     * </p>
     * 
     * @return The external ID of a composite model on this asset model.
     */

    public String getAssetModelCompositeModelExternalId() {
        return this.assetModelCompositeModelExternalId;
    }

    /**
     * <p>
     * The external ID of a composite model on this asset model.
     * </p>
     * 
     * @param assetModelCompositeModelExternalId
     *        The external ID of a composite model on this asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withAssetModelCompositeModelExternalId(String assetModelCompositeModelExternalId) {
        setAssetModelCompositeModelExternalId(assetModelCompositeModelExternalId);
        return this;
    }

    /**
     * <p>
     * The path to the composite model listing the parent composite models.
     * </p>
     * 
     * @return The path to the composite model listing the parent composite models.
     */

    public java.util.List<AssetModelCompositeModelPathSegment> getAssetModelCompositeModelPath() {
        return assetModelCompositeModelPath;
    }

    /**
     * <p>
     * The path to the composite model listing the parent composite models.
     * </p>
     * 
     * @param assetModelCompositeModelPath
     *        The path to the composite model listing the parent composite models.
     */

    public void setAssetModelCompositeModelPath(java.util.Collection<AssetModelCompositeModelPathSegment> assetModelCompositeModelPath) {
        if (assetModelCompositeModelPath == null) {
            this.assetModelCompositeModelPath = null;
            return;
        }

        this.assetModelCompositeModelPath = new java.util.ArrayList<AssetModelCompositeModelPathSegment>(assetModelCompositeModelPath);
    }

    /**
     * <p>
     * The path to the composite model listing the parent composite models.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetModelCompositeModelPath(java.util.Collection)} or
     * {@link #withAssetModelCompositeModelPath(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assetModelCompositeModelPath
     *        The path to the composite model listing the parent composite models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withAssetModelCompositeModelPath(AssetModelCompositeModelPathSegment... assetModelCompositeModelPath) {
        if (this.assetModelCompositeModelPath == null) {
            setAssetModelCompositeModelPath(new java.util.ArrayList<AssetModelCompositeModelPathSegment>(assetModelCompositeModelPath.length));
        }
        for (AssetModelCompositeModelPathSegment ele : assetModelCompositeModelPath) {
            this.assetModelCompositeModelPath.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The path to the composite model listing the parent composite models.
     * </p>
     * 
     * @param assetModelCompositeModelPath
     *        The path to the composite model listing the parent composite models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withAssetModelCompositeModelPath(
            java.util.Collection<AssetModelCompositeModelPathSegment> assetModelCompositeModelPath) {
        setAssetModelCompositeModelPath(assetModelCompositeModelPath);
        return this;
    }

    /**
     * <p>
     * The unique, friendly name for the composite model.
     * </p>
     * 
     * @param assetModelCompositeModelName
     *        The unique, friendly name for the composite model.
     */

    public void setAssetModelCompositeModelName(String assetModelCompositeModelName) {
        this.assetModelCompositeModelName = assetModelCompositeModelName;
    }

    /**
     * <p>
     * The unique, friendly name for the composite model.
     * </p>
     * 
     * @return The unique, friendly name for the composite model.
     */

    public String getAssetModelCompositeModelName() {
        return this.assetModelCompositeModelName;
    }

    /**
     * <p>
     * The unique, friendly name for the composite model.
     * </p>
     * 
     * @param assetModelCompositeModelName
     *        The unique, friendly name for the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withAssetModelCompositeModelName(String assetModelCompositeModelName) {
        setAssetModelCompositeModelName(assetModelCompositeModelName);
        return this;
    }

    /**
     * <p>
     * The description for the composite model.
     * </p>
     * 
     * @param assetModelCompositeModelDescription
     *        The description for the composite model.
     */

    public void setAssetModelCompositeModelDescription(String assetModelCompositeModelDescription) {
        this.assetModelCompositeModelDescription = assetModelCompositeModelDescription;
    }

    /**
     * <p>
     * The description for the composite model.
     * </p>
     * 
     * @return The description for the composite model.
     */

    public String getAssetModelCompositeModelDescription() {
        return this.assetModelCompositeModelDescription;
    }

    /**
     * <p>
     * The description for the composite model.
     * </p>
     * 
     * @param assetModelCompositeModelDescription
     *        The description for the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withAssetModelCompositeModelDescription(String assetModelCompositeModelDescription) {
        setAssetModelCompositeModelDescription(assetModelCompositeModelDescription);
        return this;
    }

    /**
     * <p>
     * The composite model type. Valid values are <code>AWS/ALARM</code>, <code>CUSTOM</code>, or
     * <code> AWS/L4E_ANOMALY</code>.
     * </p>
     * 
     * @param assetModelCompositeModelType
     *        The composite model type. Valid values are <code>AWS/ALARM</code>, <code>CUSTOM</code>, or
     *        <code> AWS/L4E_ANOMALY</code>.
     */

    public void setAssetModelCompositeModelType(String assetModelCompositeModelType) {
        this.assetModelCompositeModelType = assetModelCompositeModelType;
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

    public String getAssetModelCompositeModelType() {
        return this.assetModelCompositeModelType;
    }

    /**
     * <p>
     * The composite model type. Valid values are <code>AWS/ALARM</code>, <code>CUSTOM</code>, or
     * <code> AWS/L4E_ANOMALY</code>.
     * </p>
     * 
     * @param assetModelCompositeModelType
     *        The composite model type. Valid values are <code>AWS/ALARM</code>, <code>CUSTOM</code>, or
     *        <code> AWS/L4E_ANOMALY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withAssetModelCompositeModelType(String assetModelCompositeModelType) {
        setAssetModelCompositeModelType(assetModelCompositeModelType);
        return this;
    }

    /**
     * <p>
     * The property definitions of the composite model.
     * </p>
     * 
     * @return The property definitions of the composite model.
     */

    public java.util.List<AssetModelProperty> getAssetModelCompositeModelProperties() {
        return assetModelCompositeModelProperties;
    }

    /**
     * <p>
     * The property definitions of the composite model.
     * </p>
     * 
     * @param assetModelCompositeModelProperties
     *        The property definitions of the composite model.
     */

    public void setAssetModelCompositeModelProperties(java.util.Collection<AssetModelProperty> assetModelCompositeModelProperties) {
        if (assetModelCompositeModelProperties == null) {
            this.assetModelCompositeModelProperties = null;
            return;
        }

        this.assetModelCompositeModelProperties = new java.util.ArrayList<AssetModelProperty>(assetModelCompositeModelProperties);
    }

    /**
     * <p>
     * The property definitions of the composite model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetModelCompositeModelProperties(java.util.Collection)} or
     * {@link #withAssetModelCompositeModelProperties(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param assetModelCompositeModelProperties
     *        The property definitions of the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withAssetModelCompositeModelProperties(AssetModelProperty... assetModelCompositeModelProperties) {
        if (this.assetModelCompositeModelProperties == null) {
            setAssetModelCompositeModelProperties(new java.util.ArrayList<AssetModelProperty>(assetModelCompositeModelProperties.length));
        }
        for (AssetModelProperty ele : assetModelCompositeModelProperties) {
            this.assetModelCompositeModelProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The property definitions of the composite model.
     * </p>
     * 
     * @param assetModelCompositeModelProperties
     *        The property definitions of the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withAssetModelCompositeModelProperties(
            java.util.Collection<AssetModelProperty> assetModelCompositeModelProperties) {
        setAssetModelCompositeModelProperties(assetModelCompositeModelProperties);
        return this;
    }

    /**
     * <p>
     * Metadata for the composition relationship established by using <code>composedAssetModelId</code> in <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html">
     * <code>CreateAssetModelCompositeModel</code> </a>. For instance, an array detailing the path of the composition
     * relationship for this composite model.
     * </p>
     * 
     * @param compositionDetails
     *        Metadata for the composition relationship established by using <code>composedAssetModelId</code> in <a
     *        href
     *        ="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html">
     *        <code>CreateAssetModelCompositeModel</code> </a>. For instance, an array detailing the path of the
     *        composition relationship for this composite model.
     */

    public void setCompositionDetails(CompositionDetails compositionDetails) {
        this.compositionDetails = compositionDetails;
    }

    /**
     * <p>
     * Metadata for the composition relationship established by using <code>composedAssetModelId</code> in <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html">
     * <code>CreateAssetModelCompositeModel</code> </a>. For instance, an array detailing the path of the composition
     * relationship for this composite model.
     * </p>
     * 
     * @return Metadata for the composition relationship established by using <code>composedAssetModelId</code> in <a
     *         href
     *         ="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html">
     *         <code>CreateAssetModelCompositeModel</code> </a>. For instance, an array detailing the path of the
     *         composition relationship for this composite model.
     */

    public CompositionDetails getCompositionDetails() {
        return this.compositionDetails;
    }

    /**
     * <p>
     * Metadata for the composition relationship established by using <code>composedAssetModelId</code> in <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html">
     * <code>CreateAssetModelCompositeModel</code> </a>. For instance, an array detailing the path of the composition
     * relationship for this composite model.
     * </p>
     * 
     * @param compositionDetails
     *        Metadata for the composition relationship established by using <code>composedAssetModelId</code> in <a
     *        href
     *        ="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html">
     *        <code>CreateAssetModelCompositeModel</code> </a>. For instance, an array detailing the path of the
     *        composition relationship for this composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withCompositionDetails(CompositionDetails compositionDetails) {
        setCompositionDetails(compositionDetails);
        return this;
    }

    /**
     * <p>
     * The list of composite model summaries for the composite model.
     * </p>
     * 
     * @return The list of composite model summaries for the composite model.
     */

    public java.util.List<AssetModelCompositeModelSummary> getAssetModelCompositeModelSummaries() {
        return assetModelCompositeModelSummaries;
    }

    /**
     * <p>
     * The list of composite model summaries for the composite model.
     * </p>
     * 
     * @param assetModelCompositeModelSummaries
     *        The list of composite model summaries for the composite model.
     */

    public void setAssetModelCompositeModelSummaries(java.util.Collection<AssetModelCompositeModelSummary> assetModelCompositeModelSummaries) {
        if (assetModelCompositeModelSummaries == null) {
            this.assetModelCompositeModelSummaries = null;
            return;
        }

        this.assetModelCompositeModelSummaries = new java.util.ArrayList<AssetModelCompositeModelSummary>(assetModelCompositeModelSummaries);
    }

    /**
     * <p>
     * The list of composite model summaries for the composite model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetModelCompositeModelSummaries(java.util.Collection)} or
     * {@link #withAssetModelCompositeModelSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assetModelCompositeModelSummaries
     *        The list of composite model summaries for the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withAssetModelCompositeModelSummaries(AssetModelCompositeModelSummary... assetModelCompositeModelSummaries) {
        if (this.assetModelCompositeModelSummaries == null) {
            setAssetModelCompositeModelSummaries(new java.util.ArrayList<AssetModelCompositeModelSummary>(assetModelCompositeModelSummaries.length));
        }
        for (AssetModelCompositeModelSummary ele : assetModelCompositeModelSummaries) {
            this.assetModelCompositeModelSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of composite model summaries for the composite model.
     * </p>
     * 
     * @param assetModelCompositeModelSummaries
     *        The list of composite model summaries for the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withAssetModelCompositeModelSummaries(
            java.util.Collection<AssetModelCompositeModelSummary> assetModelCompositeModelSummaries) {
        setAssetModelCompositeModelSummaries(assetModelCompositeModelSummaries);
        return this;
    }

    /**
     * <p>
     * The available actions for a composite model on this asset model.
     * </p>
     * 
     * @return The available actions for a composite model on this asset model.
     */

    public java.util.List<ActionDefinition> getActionDefinitions() {
        return actionDefinitions;
    }

    /**
     * <p>
     * The available actions for a composite model on this asset model.
     * </p>
     * 
     * @param actionDefinitions
     *        The available actions for a composite model on this asset model.
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
     * The available actions for a composite model on this asset model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionDefinitions(java.util.Collection)} or {@link #withActionDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param actionDefinitions
     *        The available actions for a composite model on this asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withActionDefinitions(ActionDefinition... actionDefinitions) {
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
     * The available actions for a composite model on this asset model.
     * </p>
     * 
     * @param actionDefinitions
     *        The available actions for a composite model on this asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelResult withActionDefinitions(java.util.Collection<ActionDefinition> actionDefinitions) {
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
        if (getAssetModelId() != null)
            sb.append("AssetModelId: ").append(getAssetModelId()).append(",");
        if (getAssetModelCompositeModelId() != null)
            sb.append("AssetModelCompositeModelId: ").append(getAssetModelCompositeModelId()).append(",");
        if (getAssetModelCompositeModelExternalId() != null)
            sb.append("AssetModelCompositeModelExternalId: ").append(getAssetModelCompositeModelExternalId()).append(",");
        if (getAssetModelCompositeModelPath() != null)
            sb.append("AssetModelCompositeModelPath: ").append(getAssetModelCompositeModelPath()).append(",");
        if (getAssetModelCompositeModelName() != null)
            sb.append("AssetModelCompositeModelName: ").append(getAssetModelCompositeModelName()).append(",");
        if (getAssetModelCompositeModelDescription() != null)
            sb.append("AssetModelCompositeModelDescription: ").append(getAssetModelCompositeModelDescription()).append(",");
        if (getAssetModelCompositeModelType() != null)
            sb.append("AssetModelCompositeModelType: ").append(getAssetModelCompositeModelType()).append(",");
        if (getAssetModelCompositeModelProperties() != null)
            sb.append("AssetModelCompositeModelProperties: ").append(getAssetModelCompositeModelProperties()).append(",");
        if (getCompositionDetails() != null)
            sb.append("CompositionDetails: ").append(getCompositionDetails()).append(",");
        if (getAssetModelCompositeModelSummaries() != null)
            sb.append("AssetModelCompositeModelSummaries: ").append(getAssetModelCompositeModelSummaries()).append(",");
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

        if (obj instanceof DescribeAssetModelCompositeModelResult == false)
            return false;
        DescribeAssetModelCompositeModelResult other = (DescribeAssetModelCompositeModelResult) obj;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getAssetModelCompositeModelId() == null ^ this.getAssetModelCompositeModelId() == null)
            return false;
        if (other.getAssetModelCompositeModelId() != null && other.getAssetModelCompositeModelId().equals(this.getAssetModelCompositeModelId()) == false)
            return false;
        if (other.getAssetModelCompositeModelExternalId() == null ^ this.getAssetModelCompositeModelExternalId() == null)
            return false;
        if (other.getAssetModelCompositeModelExternalId() != null
                && other.getAssetModelCompositeModelExternalId().equals(this.getAssetModelCompositeModelExternalId()) == false)
            return false;
        if (other.getAssetModelCompositeModelPath() == null ^ this.getAssetModelCompositeModelPath() == null)
            return false;
        if (other.getAssetModelCompositeModelPath() != null && other.getAssetModelCompositeModelPath().equals(this.getAssetModelCompositeModelPath()) == false)
            return false;
        if (other.getAssetModelCompositeModelName() == null ^ this.getAssetModelCompositeModelName() == null)
            return false;
        if (other.getAssetModelCompositeModelName() != null && other.getAssetModelCompositeModelName().equals(this.getAssetModelCompositeModelName()) == false)
            return false;
        if (other.getAssetModelCompositeModelDescription() == null ^ this.getAssetModelCompositeModelDescription() == null)
            return false;
        if (other.getAssetModelCompositeModelDescription() != null
                && other.getAssetModelCompositeModelDescription().equals(this.getAssetModelCompositeModelDescription()) == false)
            return false;
        if (other.getAssetModelCompositeModelType() == null ^ this.getAssetModelCompositeModelType() == null)
            return false;
        if (other.getAssetModelCompositeModelType() != null && other.getAssetModelCompositeModelType().equals(this.getAssetModelCompositeModelType()) == false)
            return false;
        if (other.getAssetModelCompositeModelProperties() == null ^ this.getAssetModelCompositeModelProperties() == null)
            return false;
        if (other.getAssetModelCompositeModelProperties() != null
                && other.getAssetModelCompositeModelProperties().equals(this.getAssetModelCompositeModelProperties()) == false)
            return false;
        if (other.getCompositionDetails() == null ^ this.getCompositionDetails() == null)
            return false;
        if (other.getCompositionDetails() != null && other.getCompositionDetails().equals(this.getCompositionDetails()) == false)
            return false;
        if (other.getAssetModelCompositeModelSummaries() == null ^ this.getAssetModelCompositeModelSummaries() == null)
            return false;
        if (other.getAssetModelCompositeModelSummaries() != null
                && other.getAssetModelCompositeModelSummaries().equals(this.getAssetModelCompositeModelSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelId() == null) ? 0 : getAssetModelCompositeModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelExternalId() == null) ? 0 : getAssetModelCompositeModelExternalId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelPath() == null) ? 0 : getAssetModelCompositeModelPath().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelName() == null) ? 0 : getAssetModelCompositeModelName().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelDescription() == null) ? 0 : getAssetModelCompositeModelDescription().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelType() == null) ? 0 : getAssetModelCompositeModelType().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelProperties() == null) ? 0 : getAssetModelCompositeModelProperties().hashCode());
        hashCode = prime * hashCode + ((getCompositionDetails() == null) ? 0 : getCompositionDetails().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelSummaries() == null) ? 0 : getAssetModelCompositeModelSummaries().hashCode());
        hashCode = prime * hashCode + ((getActionDefinitions() == null) ? 0 : getActionDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssetModelCompositeModelResult clone() {
        try {
            return (DescribeAssetModelCompositeModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
