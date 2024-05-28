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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAssetModelCompositeModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssetModelCompositeModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset model this composite model is a part of.
     * </p>
     */
    private String assetModelId;
    /**
     * <p>
     * The ID of the parent composite model in this asset model relationship.
     * </p>
     */
    private String parentAssetModelCompositeModelId;
    /**
     * <p>
     * An external ID to assign to the composite model.
     * </p>
     * <p>
     * If the composite model is a derived composite model, or one nested inside a component model, you can only set the
     * external ID using <code>UpdateAssetModelCompositeModel</code> and specifying the derived ID of the model or
     * property from the created model it's a part of.
     * </p>
     */
    private String assetModelCompositeModelExternalId;
    /**
     * <p>
     * The ID of the composite model. IoT SiteWise automatically generates a unique ID for you, so this parameter is
     * never required. However, if you prefer to supply your own ID instead, you can specify it here in UUID format. If
     * you specify your own ID, it must be globally unique.
     * </p>
     */
    private String assetModelCompositeModelId;
    /**
     * <p>
     * A description for the composite model.
     * </p>
     */
    private String assetModelCompositeModelDescription;
    /**
     * <p>
     * A unique, friendly name for the composite model.
     * </p>
     */
    private String assetModelCompositeModelName;
    /**
     * <p>
     * The composite model type. Valid values are <code>AWS/ALARM</code>, <code>CUSTOM</code>, or
     * <code> AWS/L4E_ANOMALY</code>.
     * </p>
     */
    private String assetModelCompositeModelType;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ID of a composite model on this asset.
     * </p>
     */
    private String composedAssetModelId;
    /**
     * <p>
     * The property definitions of the composite model. For more information, see &lt;LINK&gt;.
     * </p>
     * <p>
     * You can specify up to 200 properties per composite model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     */
    private java.util.List<AssetModelPropertyDefinition> assetModelCompositeModelProperties;

    /**
     * <p>
     * The ID of the asset model this composite model is a part of.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model this composite model is a part of.
     */

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model this composite model is a part of.
     * </p>
     * 
     * @return The ID of the asset model this composite model is a part of.
     */

    public String getAssetModelId() {
        return this.assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model this composite model is a part of.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model this composite model is a part of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelCompositeModelRequest withAssetModelId(String assetModelId) {
        setAssetModelId(assetModelId);
        return this;
    }

    /**
     * <p>
     * The ID of the parent composite model in this asset model relationship.
     * </p>
     * 
     * @param parentAssetModelCompositeModelId
     *        The ID of the parent composite model in this asset model relationship.
     */

    public void setParentAssetModelCompositeModelId(String parentAssetModelCompositeModelId) {
        this.parentAssetModelCompositeModelId = parentAssetModelCompositeModelId;
    }

    /**
     * <p>
     * The ID of the parent composite model in this asset model relationship.
     * </p>
     * 
     * @return The ID of the parent composite model in this asset model relationship.
     */

    public String getParentAssetModelCompositeModelId() {
        return this.parentAssetModelCompositeModelId;
    }

    /**
     * <p>
     * The ID of the parent composite model in this asset model relationship.
     * </p>
     * 
     * @param parentAssetModelCompositeModelId
     *        The ID of the parent composite model in this asset model relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelCompositeModelRequest withParentAssetModelCompositeModelId(String parentAssetModelCompositeModelId) {
        setParentAssetModelCompositeModelId(parentAssetModelCompositeModelId);
        return this;
    }

    /**
     * <p>
     * An external ID to assign to the composite model.
     * </p>
     * <p>
     * If the composite model is a derived composite model, or one nested inside a component model, you can only set the
     * external ID using <code>UpdateAssetModelCompositeModel</code> and specifying the derived ID of the model or
     * property from the created model it's a part of.
     * </p>
     * 
     * @param assetModelCompositeModelExternalId
     *        An external ID to assign to the composite model.</p>
     *        <p>
     *        If the composite model is a derived composite model, or one nested inside a component model, you can only
     *        set the external ID using <code>UpdateAssetModelCompositeModel</code> and specifying the derived ID of the
     *        model or property from the created model it's a part of.
     */

    public void setAssetModelCompositeModelExternalId(String assetModelCompositeModelExternalId) {
        this.assetModelCompositeModelExternalId = assetModelCompositeModelExternalId;
    }

    /**
     * <p>
     * An external ID to assign to the composite model.
     * </p>
     * <p>
     * If the composite model is a derived composite model, or one nested inside a component model, you can only set the
     * external ID using <code>UpdateAssetModelCompositeModel</code> and specifying the derived ID of the model or
     * property from the created model it's a part of.
     * </p>
     * 
     * @return An external ID to assign to the composite model.</p>
     *         <p>
     *         If the composite model is a derived composite model, or one nested inside a component model, you can only
     *         set the external ID using <code>UpdateAssetModelCompositeModel</code> and specifying the derived ID of
     *         the model or property from the created model it's a part of.
     */

    public String getAssetModelCompositeModelExternalId() {
        return this.assetModelCompositeModelExternalId;
    }

    /**
     * <p>
     * An external ID to assign to the composite model.
     * </p>
     * <p>
     * If the composite model is a derived composite model, or one nested inside a component model, you can only set the
     * external ID using <code>UpdateAssetModelCompositeModel</code> and specifying the derived ID of the model or
     * property from the created model it's a part of.
     * </p>
     * 
     * @param assetModelCompositeModelExternalId
     *        An external ID to assign to the composite model.</p>
     *        <p>
     *        If the composite model is a derived composite model, or one nested inside a component model, you can only
     *        set the external ID using <code>UpdateAssetModelCompositeModel</code> and specifying the derived ID of the
     *        model or property from the created model it's a part of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelCompositeModelRequest withAssetModelCompositeModelExternalId(String assetModelCompositeModelExternalId) {
        setAssetModelCompositeModelExternalId(assetModelCompositeModelExternalId);
        return this;
    }

    /**
     * <p>
     * The ID of the composite model. IoT SiteWise automatically generates a unique ID for you, so this parameter is
     * never required. However, if you prefer to supply your own ID instead, you can specify it here in UUID format. If
     * you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @param assetModelCompositeModelId
     *        The ID of the composite model. IoT SiteWise automatically generates a unique ID for you, so this parameter
     *        is never required. However, if you prefer to supply your own ID instead, you can specify it here in UUID
     *        format. If you specify your own ID, it must be globally unique.
     */

    public void setAssetModelCompositeModelId(String assetModelCompositeModelId) {
        this.assetModelCompositeModelId = assetModelCompositeModelId;
    }

    /**
     * <p>
     * The ID of the composite model. IoT SiteWise automatically generates a unique ID for you, so this parameter is
     * never required. However, if you prefer to supply your own ID instead, you can specify it here in UUID format. If
     * you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @return The ID of the composite model. IoT SiteWise automatically generates a unique ID for you, so this
     *         parameter is never required. However, if you prefer to supply your own ID instead, you can specify it
     *         here in UUID format. If you specify your own ID, it must be globally unique.
     */

    public String getAssetModelCompositeModelId() {
        return this.assetModelCompositeModelId;
    }

    /**
     * <p>
     * The ID of the composite model. IoT SiteWise automatically generates a unique ID for you, so this parameter is
     * never required. However, if you prefer to supply your own ID instead, you can specify it here in UUID format. If
     * you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @param assetModelCompositeModelId
     *        The ID of the composite model. IoT SiteWise automatically generates a unique ID for you, so this parameter
     *        is never required. However, if you prefer to supply your own ID instead, you can specify it here in UUID
     *        format. If you specify your own ID, it must be globally unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelCompositeModelRequest withAssetModelCompositeModelId(String assetModelCompositeModelId) {
        setAssetModelCompositeModelId(assetModelCompositeModelId);
        return this;
    }

    /**
     * <p>
     * A description for the composite model.
     * </p>
     * 
     * @param assetModelCompositeModelDescription
     *        A description for the composite model.
     */

    public void setAssetModelCompositeModelDescription(String assetModelCompositeModelDescription) {
        this.assetModelCompositeModelDescription = assetModelCompositeModelDescription;
    }

    /**
     * <p>
     * A description for the composite model.
     * </p>
     * 
     * @return A description for the composite model.
     */

    public String getAssetModelCompositeModelDescription() {
        return this.assetModelCompositeModelDescription;
    }

    /**
     * <p>
     * A description for the composite model.
     * </p>
     * 
     * @param assetModelCompositeModelDescription
     *        A description for the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelCompositeModelRequest withAssetModelCompositeModelDescription(String assetModelCompositeModelDescription) {
        setAssetModelCompositeModelDescription(assetModelCompositeModelDescription);
        return this;
    }

    /**
     * <p>
     * A unique, friendly name for the composite model.
     * </p>
     * 
     * @param assetModelCompositeModelName
     *        A unique, friendly name for the composite model.
     */

    public void setAssetModelCompositeModelName(String assetModelCompositeModelName) {
        this.assetModelCompositeModelName = assetModelCompositeModelName;
    }

    /**
     * <p>
     * A unique, friendly name for the composite model.
     * </p>
     * 
     * @return A unique, friendly name for the composite model.
     */

    public String getAssetModelCompositeModelName() {
        return this.assetModelCompositeModelName;
    }

    /**
     * <p>
     * A unique, friendly name for the composite model.
     * </p>
     * 
     * @param assetModelCompositeModelName
     *        A unique, friendly name for the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelCompositeModelRequest withAssetModelCompositeModelName(String assetModelCompositeModelName) {
        setAssetModelCompositeModelName(assetModelCompositeModelName);
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

    public CreateAssetModelCompositeModelRequest withAssetModelCompositeModelType(String assetModelCompositeModelType) {
        setAssetModelCompositeModelType(assetModelCompositeModelType);
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

    public CreateAssetModelCompositeModelRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ID of a composite model on this asset.
     * </p>
     * 
     * @param composedAssetModelId
     *        The ID of a composite model on this asset.
     */

    public void setComposedAssetModelId(String composedAssetModelId) {
        this.composedAssetModelId = composedAssetModelId;
    }

    /**
     * <p>
     * The ID of a composite model on this asset.
     * </p>
     * 
     * @return The ID of a composite model on this asset.
     */

    public String getComposedAssetModelId() {
        return this.composedAssetModelId;
    }

    /**
     * <p>
     * The ID of a composite model on this asset.
     * </p>
     * 
     * @param composedAssetModelId
     *        The ID of a composite model on this asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelCompositeModelRequest withComposedAssetModelId(String composedAssetModelId) {
        setComposedAssetModelId(composedAssetModelId);
        return this;
    }

    /**
     * <p>
     * The property definitions of the composite model. For more information, see &lt;LINK&gt;.
     * </p>
     * <p>
     * You can specify up to 200 properties per composite model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * 
     * @return The property definitions of the composite model. For more information, see &lt;LINK&gt;.</p>
     *         <p>
     *         You can specify up to 200 properties per composite model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *         SiteWise User Guide</i>.
     */

    public java.util.List<AssetModelPropertyDefinition> getAssetModelCompositeModelProperties() {
        return assetModelCompositeModelProperties;
    }

    /**
     * <p>
     * The property definitions of the composite model. For more information, see &lt;LINK&gt;.
     * </p>
     * <p>
     * You can specify up to 200 properties per composite model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * 
     * @param assetModelCompositeModelProperties
     *        The property definitions of the composite model. For more information, see &lt;LINK&gt;.</p>
     *        <p>
     *        You can specify up to 200 properties per composite model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     */

    public void setAssetModelCompositeModelProperties(java.util.Collection<AssetModelPropertyDefinition> assetModelCompositeModelProperties) {
        if (assetModelCompositeModelProperties == null) {
            this.assetModelCompositeModelProperties = null;
            return;
        }

        this.assetModelCompositeModelProperties = new java.util.ArrayList<AssetModelPropertyDefinition>(assetModelCompositeModelProperties);
    }

    /**
     * <p>
     * The property definitions of the composite model. For more information, see &lt;LINK&gt;.
     * </p>
     * <p>
     * You can specify up to 200 properties per composite model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetModelCompositeModelProperties(java.util.Collection)} or
     * {@link #withAssetModelCompositeModelProperties(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param assetModelCompositeModelProperties
     *        The property definitions of the composite model. For more information, see &lt;LINK&gt;.</p>
     *        <p>
     *        You can specify up to 200 properties per composite model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelCompositeModelRequest withAssetModelCompositeModelProperties(AssetModelPropertyDefinition... assetModelCompositeModelProperties) {
        if (this.assetModelCompositeModelProperties == null) {
            setAssetModelCompositeModelProperties(new java.util.ArrayList<AssetModelPropertyDefinition>(assetModelCompositeModelProperties.length));
        }
        for (AssetModelPropertyDefinition ele : assetModelCompositeModelProperties) {
            this.assetModelCompositeModelProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The property definitions of the composite model. For more information, see &lt;LINK&gt;.
     * </p>
     * <p>
     * You can specify up to 200 properties per composite model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * 
     * @param assetModelCompositeModelProperties
     *        The property definitions of the composite model. For more information, see &lt;LINK&gt;.</p>
     *        <p>
     *        You can specify up to 200 properties per composite model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetModelCompositeModelRequest withAssetModelCompositeModelProperties(
            java.util.Collection<AssetModelPropertyDefinition> assetModelCompositeModelProperties) {
        setAssetModelCompositeModelProperties(assetModelCompositeModelProperties);
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
        if (getParentAssetModelCompositeModelId() != null)
            sb.append("ParentAssetModelCompositeModelId: ").append(getParentAssetModelCompositeModelId()).append(",");
        if (getAssetModelCompositeModelExternalId() != null)
            sb.append("AssetModelCompositeModelExternalId: ").append(getAssetModelCompositeModelExternalId()).append(",");
        if (getAssetModelCompositeModelId() != null)
            sb.append("AssetModelCompositeModelId: ").append(getAssetModelCompositeModelId()).append(",");
        if (getAssetModelCompositeModelDescription() != null)
            sb.append("AssetModelCompositeModelDescription: ").append(getAssetModelCompositeModelDescription()).append(",");
        if (getAssetModelCompositeModelName() != null)
            sb.append("AssetModelCompositeModelName: ").append(getAssetModelCompositeModelName()).append(",");
        if (getAssetModelCompositeModelType() != null)
            sb.append("AssetModelCompositeModelType: ").append(getAssetModelCompositeModelType()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getComposedAssetModelId() != null)
            sb.append("ComposedAssetModelId: ").append(getComposedAssetModelId()).append(",");
        if (getAssetModelCompositeModelProperties() != null)
            sb.append("AssetModelCompositeModelProperties: ").append(getAssetModelCompositeModelProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssetModelCompositeModelRequest == false)
            return false;
        CreateAssetModelCompositeModelRequest other = (CreateAssetModelCompositeModelRequest) obj;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getParentAssetModelCompositeModelId() == null ^ this.getParentAssetModelCompositeModelId() == null)
            return false;
        if (other.getParentAssetModelCompositeModelId() != null
                && other.getParentAssetModelCompositeModelId().equals(this.getParentAssetModelCompositeModelId()) == false)
            return false;
        if (other.getAssetModelCompositeModelExternalId() == null ^ this.getAssetModelCompositeModelExternalId() == null)
            return false;
        if (other.getAssetModelCompositeModelExternalId() != null
                && other.getAssetModelCompositeModelExternalId().equals(this.getAssetModelCompositeModelExternalId()) == false)
            return false;
        if (other.getAssetModelCompositeModelId() == null ^ this.getAssetModelCompositeModelId() == null)
            return false;
        if (other.getAssetModelCompositeModelId() != null && other.getAssetModelCompositeModelId().equals(this.getAssetModelCompositeModelId()) == false)
            return false;
        if (other.getAssetModelCompositeModelDescription() == null ^ this.getAssetModelCompositeModelDescription() == null)
            return false;
        if (other.getAssetModelCompositeModelDescription() != null
                && other.getAssetModelCompositeModelDescription().equals(this.getAssetModelCompositeModelDescription()) == false)
            return false;
        if (other.getAssetModelCompositeModelName() == null ^ this.getAssetModelCompositeModelName() == null)
            return false;
        if (other.getAssetModelCompositeModelName() != null && other.getAssetModelCompositeModelName().equals(this.getAssetModelCompositeModelName()) == false)
            return false;
        if (other.getAssetModelCompositeModelType() == null ^ this.getAssetModelCompositeModelType() == null)
            return false;
        if (other.getAssetModelCompositeModelType() != null && other.getAssetModelCompositeModelType().equals(this.getAssetModelCompositeModelType()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getComposedAssetModelId() == null ^ this.getComposedAssetModelId() == null)
            return false;
        if (other.getComposedAssetModelId() != null && other.getComposedAssetModelId().equals(this.getComposedAssetModelId()) == false)
            return false;
        if (other.getAssetModelCompositeModelProperties() == null ^ this.getAssetModelCompositeModelProperties() == null)
            return false;
        if (other.getAssetModelCompositeModelProperties() != null
                && other.getAssetModelCompositeModelProperties().equals(this.getAssetModelCompositeModelProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getParentAssetModelCompositeModelId() == null) ? 0 : getParentAssetModelCompositeModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelExternalId() == null) ? 0 : getAssetModelCompositeModelExternalId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelId() == null) ? 0 : getAssetModelCompositeModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelDescription() == null) ? 0 : getAssetModelCompositeModelDescription().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelName() == null) ? 0 : getAssetModelCompositeModelName().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelType() == null) ? 0 : getAssetModelCompositeModelType().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getComposedAssetModelId() == null) ? 0 : getComposedAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelProperties() == null) ? 0 : getAssetModelCompositeModelProperties().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssetModelCompositeModelRequest clone() {
        return (CreateAssetModelCompositeModelRequest) super.clone();
    }

}
