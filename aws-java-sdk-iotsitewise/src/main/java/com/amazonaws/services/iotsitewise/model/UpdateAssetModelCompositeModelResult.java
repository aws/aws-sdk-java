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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAssetModelCompositeModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAssetModelCompositeModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The path to the composite model listing the parent composite models.
     * </p>
     */
    private java.util.List<AssetModelCompositeModelPathSegment> assetModelCompositeModelPath;

    private AssetModelStatus assetModelStatus;

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

    public UpdateAssetModelCompositeModelResult withAssetModelCompositeModelPath(AssetModelCompositeModelPathSegment... assetModelCompositeModelPath) {
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

    public UpdateAssetModelCompositeModelResult withAssetModelCompositeModelPath(
            java.util.Collection<AssetModelCompositeModelPathSegment> assetModelCompositeModelPath) {
        setAssetModelCompositeModelPath(assetModelCompositeModelPath);
        return this;
    }

    /**
     * @param assetModelStatus
     */

    public void setAssetModelStatus(AssetModelStatus assetModelStatus) {
        this.assetModelStatus = assetModelStatus;
    }

    /**
     * @return
     */

    public AssetModelStatus getAssetModelStatus() {
        return this.assetModelStatus;
    }

    /**
     * @param assetModelStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetModelCompositeModelResult withAssetModelStatus(AssetModelStatus assetModelStatus) {
        setAssetModelStatus(assetModelStatus);
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
        if (getAssetModelCompositeModelPath() != null)
            sb.append("AssetModelCompositeModelPath: ").append(getAssetModelCompositeModelPath()).append(",");
        if (getAssetModelStatus() != null)
            sb.append("AssetModelStatus: ").append(getAssetModelStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssetModelCompositeModelResult == false)
            return false;
        UpdateAssetModelCompositeModelResult other = (UpdateAssetModelCompositeModelResult) obj;
        if (other.getAssetModelCompositeModelPath() == null ^ this.getAssetModelCompositeModelPath() == null)
            return false;
        if (other.getAssetModelCompositeModelPath() != null && other.getAssetModelCompositeModelPath().equals(this.getAssetModelCompositeModelPath()) == false)
            return false;
        if (other.getAssetModelStatus() == null ^ this.getAssetModelStatus() == null)
            return false;
        if (other.getAssetModelStatus() != null && other.getAssetModelStatus().equals(this.getAssetModelStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetModelCompositeModelPath() == null) ? 0 : getAssetModelCompositeModelPath().hashCode());
        hashCode = prime * hashCode + ((getAssetModelStatus() == null) ? 0 : getAssetModelStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssetModelCompositeModelResult clone() {
        try {
            return (UpdateAssetModelCompositeModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
