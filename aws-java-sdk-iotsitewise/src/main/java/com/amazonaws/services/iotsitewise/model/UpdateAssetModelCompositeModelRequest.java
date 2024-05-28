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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAssetModelCompositeModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAssetModelCompositeModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * An external ID to assign to the asset model. You can only set the external ID of the asset model if it wasn't set
     * when it was created, or you're setting it to the exact same thing as when it was created.
     * </p>
     */
    private String assetModelCompositeModelExternalId;
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
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;
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
    private java.util.List<AssetModelProperty> assetModelCompositeModelProperties;

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

    public UpdateAssetModelCompositeModelRequest withAssetModelId(String assetModelId) {
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

    public UpdateAssetModelCompositeModelRequest withAssetModelCompositeModelId(String assetModelCompositeModelId) {
        setAssetModelCompositeModelId(assetModelCompositeModelId);
        return this;
    }

    /**
     * <p>
     * An external ID to assign to the asset model. You can only set the external ID of the asset model if it wasn't set
     * when it was created, or you're setting it to the exact same thing as when it was created.
     * </p>
     * 
     * @param assetModelCompositeModelExternalId
     *        An external ID to assign to the asset model. You can only set the external ID of the asset model if it
     *        wasn't set when it was created, or you're setting it to the exact same thing as when it was created.
     */

    public void setAssetModelCompositeModelExternalId(String assetModelCompositeModelExternalId) {
        this.assetModelCompositeModelExternalId = assetModelCompositeModelExternalId;
    }

    /**
     * <p>
     * An external ID to assign to the asset model. You can only set the external ID of the asset model if it wasn't set
     * when it was created, or you're setting it to the exact same thing as when it was created.
     * </p>
     * 
     * @return An external ID to assign to the asset model. You can only set the external ID of the asset model if it
     *         wasn't set when it was created, or you're setting it to the exact same thing as when it was created.
     */

    public String getAssetModelCompositeModelExternalId() {
        return this.assetModelCompositeModelExternalId;
    }

    /**
     * <p>
     * An external ID to assign to the asset model. You can only set the external ID of the asset model if it wasn't set
     * when it was created, or you're setting it to the exact same thing as when it was created.
     * </p>
     * 
     * @param assetModelCompositeModelExternalId
     *        An external ID to assign to the asset model. You can only set the external ID of the asset model if it
     *        wasn't set when it was created, or you're setting it to the exact same thing as when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetModelCompositeModelRequest withAssetModelCompositeModelExternalId(String assetModelCompositeModelExternalId) {
        setAssetModelCompositeModelExternalId(assetModelCompositeModelExternalId);
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

    public UpdateAssetModelCompositeModelRequest withAssetModelCompositeModelDescription(String assetModelCompositeModelDescription) {
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

    public UpdateAssetModelCompositeModelRequest withAssetModelCompositeModelName(String assetModelCompositeModelName) {
        setAssetModelCompositeModelName(assetModelCompositeModelName);
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

    public UpdateAssetModelCompositeModelRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public java.util.List<AssetModelProperty> getAssetModelCompositeModelProperties() {
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

    public void setAssetModelCompositeModelProperties(java.util.Collection<AssetModelProperty> assetModelCompositeModelProperties) {
        if (assetModelCompositeModelProperties == null) {
            this.assetModelCompositeModelProperties = null;
            return;
        }

        this.assetModelCompositeModelProperties = new java.util.ArrayList<AssetModelProperty>(assetModelCompositeModelProperties);
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

    public UpdateAssetModelCompositeModelRequest withAssetModelCompositeModelProperties(AssetModelProperty... assetModelCompositeModelProperties) {
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

    public UpdateAssetModelCompositeModelRequest withAssetModelCompositeModelProperties(
            java.util.Collection<AssetModelProperty> assetModelCompositeModelProperties) {
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
        if (getAssetModelCompositeModelId() != null)
            sb.append("AssetModelCompositeModelId: ").append(getAssetModelCompositeModelId()).append(",");
        if (getAssetModelCompositeModelExternalId() != null)
            sb.append("AssetModelCompositeModelExternalId: ").append(getAssetModelCompositeModelExternalId()).append(",");
        if (getAssetModelCompositeModelDescription() != null)
            sb.append("AssetModelCompositeModelDescription: ").append(getAssetModelCompositeModelDescription()).append(",");
        if (getAssetModelCompositeModelName() != null)
            sb.append("AssetModelCompositeModelName: ").append(getAssetModelCompositeModelName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof UpdateAssetModelCompositeModelRequest == false)
            return false;
        UpdateAssetModelCompositeModelRequest other = (UpdateAssetModelCompositeModelRequest) obj;
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
        if (other.getAssetModelCompositeModelDescription() == null ^ this.getAssetModelCompositeModelDescription() == null)
            return false;
        if (other.getAssetModelCompositeModelDescription() != null
                && other.getAssetModelCompositeModelDescription().equals(this.getAssetModelCompositeModelDescription()) == false)
            return false;
        if (other.getAssetModelCompositeModelName() == null ^ this.getAssetModelCompositeModelName() == null)
            return false;
        if (other.getAssetModelCompositeModelName() != null && other.getAssetModelCompositeModelName().equals(this.getAssetModelCompositeModelName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        hashCode = prime * hashCode + ((getAssetModelCompositeModelId() == null) ? 0 : getAssetModelCompositeModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelExternalId() == null) ? 0 : getAssetModelCompositeModelExternalId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelDescription() == null) ? 0 : getAssetModelCompositeModelDescription().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelName() == null) ? 0 : getAssetModelCompositeModelName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelProperties() == null) ? 0 : getAssetModelCompositeModelProperties().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssetModelCompositeModelRequest clone() {
        return (UpdateAssetModelCompositeModelRequest) super.clone();
    }

}
