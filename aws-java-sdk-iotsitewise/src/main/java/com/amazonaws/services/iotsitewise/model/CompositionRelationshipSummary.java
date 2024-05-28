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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a summary of the components of the composite model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CompositionRelationshipSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompositionRelationshipSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The composite model type. Valid values are <code>AWS/ALARM</code>, <code>CUSTOM</code>, or
     * <code> AWS/L4E_ANOMALY</code>.
     * </p>
     */
    private String assetModelCompositeModelType;

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

    public CompositionRelationshipSummary withAssetModelId(String assetModelId) {
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

    public CompositionRelationshipSummary withAssetModelCompositeModelId(String assetModelCompositeModelId) {
        setAssetModelCompositeModelId(assetModelCompositeModelId);
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

    public CompositionRelationshipSummary withAssetModelCompositeModelType(String assetModelCompositeModelType) {
        setAssetModelCompositeModelType(assetModelCompositeModelType);
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
        if (getAssetModelCompositeModelType() != null)
            sb.append("AssetModelCompositeModelType: ").append(getAssetModelCompositeModelType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompositionRelationshipSummary == false)
            return false;
        CompositionRelationshipSummary other = (CompositionRelationshipSummary) obj;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getAssetModelCompositeModelId() == null ^ this.getAssetModelCompositeModelId() == null)
            return false;
        if (other.getAssetModelCompositeModelId() != null && other.getAssetModelCompositeModelId().equals(this.getAssetModelCompositeModelId()) == false)
            return false;
        if (other.getAssetModelCompositeModelType() == null ^ this.getAssetModelCompositeModelType() == null)
            return false;
        if (other.getAssetModelCompositeModelType() != null && other.getAssetModelCompositeModelType().equals(this.getAssetModelCompositeModelType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelId() == null) ? 0 : getAssetModelCompositeModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelType() == null) ? 0 : getAssetModelCompositeModelType().hashCode());
        return hashCode;
    }

    @Override
    public CompositionRelationshipSummary clone() {
        try {
            return (CompositionRelationshipSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.CompositionRelationshipSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
