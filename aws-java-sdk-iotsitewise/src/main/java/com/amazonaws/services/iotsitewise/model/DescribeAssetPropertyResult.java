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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAssetProperty" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetPropertyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The name of the asset.
     * </p>
     */
    private String assetName;
    /**
     * <p>
     * The ID of the asset model.
     * </p>
     */
    private String assetModelId;
    /**
     * <p>
     * The asset property's definition, alias, and notification state.
     * </p>
     * <p>
     * This response includes this object for normal asset properties. If you describe an asset property in a composite
     * model, this response includes the asset property information in <code>compositeModel</code>.
     * </p>
     */
    private Property assetProperty;
    /**
     * <p>
     * The composite asset model that declares this asset property, if this asset property exists in a composite model.
     * </p>
     */
    private CompositeModelProperty compositeModel;

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

    public DescribeAssetPropertyResult withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @param assetName
     *        The name of the asset.
     */

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @return The name of the asset.
     */

    public String getAssetName() {
        return this.assetName;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @param assetName
     *        The name of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetPropertyResult withAssetName(String assetName) {
        setAssetName(assetName);
        return this;
    }

    /**
     * <p>
     * The ID of the asset model.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model.
     */

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model.
     * </p>
     * 
     * @return The ID of the asset model.
     */

    public String getAssetModelId() {
        return this.assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetPropertyResult withAssetModelId(String assetModelId) {
        setAssetModelId(assetModelId);
        return this;
    }

    /**
     * <p>
     * The asset property's definition, alias, and notification state.
     * </p>
     * <p>
     * This response includes this object for normal asset properties. If you describe an asset property in a composite
     * model, this response includes the asset property information in <code>compositeModel</code>.
     * </p>
     * 
     * @param assetProperty
     *        The asset property's definition, alias, and notification state.</p>
     *        <p>
     *        This response includes this object for normal asset properties. If you describe an asset property in a
     *        composite model, this response includes the asset property information in <code>compositeModel</code>.
     */

    public void setAssetProperty(Property assetProperty) {
        this.assetProperty = assetProperty;
    }

    /**
     * <p>
     * The asset property's definition, alias, and notification state.
     * </p>
     * <p>
     * This response includes this object for normal asset properties. If you describe an asset property in a composite
     * model, this response includes the asset property information in <code>compositeModel</code>.
     * </p>
     * 
     * @return The asset property's definition, alias, and notification state.</p>
     *         <p>
     *         This response includes this object for normal asset properties. If you describe an asset property in a
     *         composite model, this response includes the asset property information in <code>compositeModel</code>.
     */

    public Property getAssetProperty() {
        return this.assetProperty;
    }

    /**
     * <p>
     * The asset property's definition, alias, and notification state.
     * </p>
     * <p>
     * This response includes this object for normal asset properties. If you describe an asset property in a composite
     * model, this response includes the asset property information in <code>compositeModel</code>.
     * </p>
     * 
     * @param assetProperty
     *        The asset property's definition, alias, and notification state.</p>
     *        <p>
     *        This response includes this object for normal asset properties. If you describe an asset property in a
     *        composite model, this response includes the asset property information in <code>compositeModel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetPropertyResult withAssetProperty(Property assetProperty) {
        setAssetProperty(assetProperty);
        return this;
    }

    /**
     * <p>
     * The composite asset model that declares this asset property, if this asset property exists in a composite model.
     * </p>
     * 
     * @param compositeModel
     *        The composite asset model that declares this asset property, if this asset property exists in a composite
     *        model.
     */

    public void setCompositeModel(CompositeModelProperty compositeModel) {
        this.compositeModel = compositeModel;
    }

    /**
     * <p>
     * The composite asset model that declares this asset property, if this asset property exists in a composite model.
     * </p>
     * 
     * @return The composite asset model that declares this asset property, if this asset property exists in a composite
     *         model.
     */

    public CompositeModelProperty getCompositeModel() {
        return this.compositeModel;
    }

    /**
     * <p>
     * The composite asset model that declares this asset property, if this asset property exists in a composite model.
     * </p>
     * 
     * @param compositeModel
     *        The composite asset model that declares this asset property, if this asset property exists in a composite
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetPropertyResult withCompositeModel(CompositeModelProperty compositeModel) {
        setCompositeModel(compositeModel);
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
        if (getAssetName() != null)
            sb.append("AssetName: ").append(getAssetName()).append(",");
        if (getAssetModelId() != null)
            sb.append("AssetModelId: ").append(getAssetModelId()).append(",");
        if (getAssetProperty() != null)
            sb.append("AssetProperty: ").append(getAssetProperty()).append(",");
        if (getCompositeModel() != null)
            sb.append("CompositeModel: ").append(getCompositeModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssetPropertyResult == false)
            return false;
        DescribeAssetPropertyResult other = (DescribeAssetPropertyResult) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getAssetName() == null ^ this.getAssetName() == null)
            return false;
        if (other.getAssetName() != null && other.getAssetName().equals(this.getAssetName()) == false)
            return false;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getAssetProperty() == null ^ this.getAssetProperty() == null)
            return false;
        if (other.getAssetProperty() != null && other.getAssetProperty().equals(this.getAssetProperty()) == false)
            return false;
        if (other.getCompositeModel() == null ^ this.getCompositeModel() == null)
            return false;
        if (other.getCompositeModel() != null && other.getCompositeModel().equals(this.getCompositeModel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getAssetName() == null) ? 0 : getAssetName().hashCode());
        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetProperty() == null) ? 0 : getAssetProperty().hashCode());
        hashCode = prime * hashCode + ((getCompositeModel() == null) ? 0 : getCompositeModel().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssetPropertyResult clone() {
        try {
            return (DescribeAssetPropertyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
