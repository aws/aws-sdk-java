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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteAssetModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAssetModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the asset model, which contains a state (<code>DELETING</code> after successfully calling this
     * operation) and any error message.
     * </p>
     */
    private AssetModelStatus assetModelStatus;

    /**
     * <p>
     * The status of the asset model, which contains a state (<code>DELETING</code> after successfully calling this
     * operation) and any error message.
     * </p>
     * 
     * @param assetModelStatus
     *        The status of the asset model, which contains a state (<code>DELETING</code> after successfully calling
     *        this operation) and any error message.
     */

    public void setAssetModelStatus(AssetModelStatus assetModelStatus) {
        this.assetModelStatus = assetModelStatus;
    }

    /**
     * <p>
     * The status of the asset model, which contains a state (<code>DELETING</code> after successfully calling this
     * operation) and any error message.
     * </p>
     * 
     * @return The status of the asset model, which contains a state (<code>DELETING</code> after successfully calling
     *         this operation) and any error message.
     */

    public AssetModelStatus getAssetModelStatus() {
        return this.assetModelStatus;
    }

    /**
     * <p>
     * The status of the asset model, which contains a state (<code>DELETING</code> after successfully calling this
     * operation) and any error message.
     * </p>
     * 
     * @param assetModelStatus
     *        The status of the asset model, which contains a state (<code>DELETING</code> after successfully calling
     *        this operation) and any error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAssetModelResult withAssetModelStatus(AssetModelStatus assetModelStatus) {
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

        if (obj instanceof DeleteAssetModelResult == false)
            return false;
        DeleteAssetModelResult other = (DeleteAssetModelResult) obj;
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

        hashCode = prime * hashCode + ((getAssetModelStatus() == null) ? 0 : getAssetModelStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAssetModelResult clone() {
        try {
            return (DeleteAssetModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
