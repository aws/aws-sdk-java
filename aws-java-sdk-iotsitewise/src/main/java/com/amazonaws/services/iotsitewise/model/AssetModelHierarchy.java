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
 * Describes an asset hierarchy that contains a hierarchy's name, ID, and child asset model ID that specifies the type
 * of asset that can be in this hierarchy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetModelHierarchy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetModelHierarchy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the asset model hierarchy. This ID is a <code>hierarchyId</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the asset model hierarchy that you specify by using the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> API operation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the asset model. All assets in this hierarchy must be instances of the <code>childAssetModelId</code>
     * asset model.
     * </p>
     */
    private String childAssetModelId;

    /**
     * <p>
     * The ID of the asset model hierarchy. This ID is a <code>hierarchyId</code>.
     * </p>
     * 
     * @param id
     *        The ID of the asset model hierarchy. This ID is a <code>hierarchyId</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the asset model hierarchy. This ID is a <code>hierarchyId</code>.
     * </p>
     * 
     * @return The ID of the asset model hierarchy. This ID is a <code>hierarchyId</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the asset model hierarchy. This ID is a <code>hierarchyId</code>.
     * </p>
     * 
     * @param id
     *        The ID of the asset model hierarchy. This ID is a <code>hierarchyId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelHierarchy withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the asset model hierarchy that you specify by using the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> API operation.
     * </p>
     * 
     * @param name
     *        The name of the asset model hierarchy that you specify by using the <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     *        >CreateAssetModel</a> or <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *        >UpdateAssetModel</a> API operation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the asset model hierarchy that you specify by using the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> API operation.
     * </p>
     * 
     * @return The name of the asset model hierarchy that you specify by using the <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     *         >CreateAssetModel</a> or <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *         >UpdateAssetModel</a> API operation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the asset model hierarchy that you specify by using the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> API operation.
     * </p>
     * 
     * @param name
     *        The name of the asset model hierarchy that you specify by using the <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     *        >CreateAssetModel</a> or <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *        >UpdateAssetModel</a> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelHierarchy withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the asset model. All assets in this hierarchy must be instances of the <code>childAssetModelId</code>
     * asset model.
     * </p>
     * 
     * @param childAssetModelId
     *        The ID of the asset model. All assets in this hierarchy must be instances of the
     *        <code>childAssetModelId</code> asset model.
     */

    public void setChildAssetModelId(String childAssetModelId) {
        this.childAssetModelId = childAssetModelId;
    }

    /**
     * <p>
     * The ID of the asset model. All assets in this hierarchy must be instances of the <code>childAssetModelId</code>
     * asset model.
     * </p>
     * 
     * @return The ID of the asset model. All assets in this hierarchy must be instances of the
     *         <code>childAssetModelId</code> asset model.
     */

    public String getChildAssetModelId() {
        return this.childAssetModelId;
    }

    /**
     * <p>
     * The ID of the asset model. All assets in this hierarchy must be instances of the <code>childAssetModelId</code>
     * asset model.
     * </p>
     * 
     * @param childAssetModelId
     *        The ID of the asset model. All assets in this hierarchy must be instances of the
     *        <code>childAssetModelId</code> asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelHierarchy withChildAssetModelId(String childAssetModelId) {
        setChildAssetModelId(childAssetModelId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getChildAssetModelId() != null)
            sb.append("ChildAssetModelId: ").append(getChildAssetModelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetModelHierarchy == false)
            return false;
        AssetModelHierarchy other = (AssetModelHierarchy) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getChildAssetModelId() == null ^ this.getChildAssetModelId() == null)
            return false;
        if (other.getChildAssetModelId() != null && other.getChildAssetModelId().equals(this.getChildAssetModelId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getChildAssetModelId() == null) ? 0 : getChildAssetModelId().hashCode());
        return hashCode;
    }

    @Override
    public AssetModelHierarchy clone() {
        try {
            return (AssetModelHierarchy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AssetModelHierarchyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
