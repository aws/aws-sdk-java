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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains error details for the requested associate project asset action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetErrorDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetErrorDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the asset.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The error code.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The error message.
     * </p>
     */
    private String message;

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

    public AssetErrorDetails withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param code
     *        The error code.
     * @see AssetErrorCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @return The error code.
     * @see AssetErrorCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param code
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetErrorCode
     */

    public AssetErrorDetails withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param code
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetErrorCode
     */

    public AssetErrorDetails withCode(AssetErrorCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * The error message.
     * </p>
     * 
     * @param message
     *        The error message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error message.
     * </p>
     * 
     * @return The error message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The error message.
     * </p>
     * 
     * @param message
     *        The error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetErrorDetails withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetErrorDetails == false)
            return false;
        AssetErrorDetails other = (AssetErrorDetails) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public AssetErrorDetails clone() {
        try {
            return (AssetErrorDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AssetErrorDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
