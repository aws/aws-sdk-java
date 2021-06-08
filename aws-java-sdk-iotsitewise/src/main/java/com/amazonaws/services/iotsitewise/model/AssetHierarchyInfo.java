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
 * Contains information about a parent asset and a child asset that are related through an asset hierarchy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetHierarchyInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetHierarchyInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the parent asset in this asset relationship.
     * </p>
     */
    private String parentAssetId;
    /**
     * <p>
     * The ID of the child asset in this asset relationship.
     * </p>
     */
    private String childAssetId;

    /**
     * <p>
     * The ID of the parent asset in this asset relationship.
     * </p>
     * 
     * @param parentAssetId
     *        The ID of the parent asset in this asset relationship.
     */

    public void setParentAssetId(String parentAssetId) {
        this.parentAssetId = parentAssetId;
    }

    /**
     * <p>
     * The ID of the parent asset in this asset relationship.
     * </p>
     * 
     * @return The ID of the parent asset in this asset relationship.
     */

    public String getParentAssetId() {
        return this.parentAssetId;
    }

    /**
     * <p>
     * The ID of the parent asset in this asset relationship.
     * </p>
     * 
     * @param parentAssetId
     *        The ID of the parent asset in this asset relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetHierarchyInfo withParentAssetId(String parentAssetId) {
        setParentAssetId(parentAssetId);
        return this;
    }

    /**
     * <p>
     * The ID of the child asset in this asset relationship.
     * </p>
     * 
     * @param childAssetId
     *        The ID of the child asset in this asset relationship.
     */

    public void setChildAssetId(String childAssetId) {
        this.childAssetId = childAssetId;
    }

    /**
     * <p>
     * The ID of the child asset in this asset relationship.
     * </p>
     * 
     * @return The ID of the child asset in this asset relationship.
     */

    public String getChildAssetId() {
        return this.childAssetId;
    }

    /**
     * <p>
     * The ID of the child asset in this asset relationship.
     * </p>
     * 
     * @param childAssetId
     *        The ID of the child asset in this asset relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetHierarchyInfo withChildAssetId(String childAssetId) {
        setChildAssetId(childAssetId);
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
        if (getParentAssetId() != null)
            sb.append("ParentAssetId: ").append(getParentAssetId()).append(",");
        if (getChildAssetId() != null)
            sb.append("ChildAssetId: ").append(getChildAssetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetHierarchyInfo == false)
            return false;
        AssetHierarchyInfo other = (AssetHierarchyInfo) obj;
        if (other.getParentAssetId() == null ^ this.getParentAssetId() == null)
            return false;
        if (other.getParentAssetId() != null && other.getParentAssetId().equals(this.getParentAssetId()) == false)
            return false;
        if (other.getChildAssetId() == null ^ this.getChildAssetId() == null)
            return false;
        if (other.getChildAssetId() != null && other.getChildAssetId().equals(this.getChildAssetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParentAssetId() == null) ? 0 : getParentAssetId().hashCode());
        hashCode = prime * hashCode + ((getChildAssetId() == null) ? 0 : getChildAssetId().hashCode());
        return hashCode;
    }

    @Override
    public AssetHierarchyInfo clone() {
        try {
            return (AssetHierarchyInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AssetHierarchyInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
