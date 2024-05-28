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
 * Contains an asset model hierarchy used in asset model creation. An asset model hierarchy determines the kind (or
 * type) of asset that can belong to a hierarchy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetModelHierarchyDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetModelHierarchyDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the asset model hierarchy definition (as specified in the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> API operation).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of an asset model for this hierarchy. This can be either the actual ID in UUID format, or else
     * <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String childAssetModelId;
    /**
     * <p>
     * The ID to assign to the asset model hierarchy, if desired. IoT SiteWise automatically generates a unique ID for
     * you, so this parameter is never required. However, if you prefer to supply your own ID instead, you can specify
     * it here in UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     */
    private String id;
    /**
     * <p>
     * An external ID to assign to the asset model hierarchy. The external ID must be unique among asset model
     * hierarchies within this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The name of the asset model hierarchy definition (as specified in the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> API operation).
     * </p>
     * 
     * @param name
     *        The name of the asset model hierarchy definition (as specified in the <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     *        >CreateAssetModel</a> or <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *        >UpdateAssetModel</a> API operation).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the asset model hierarchy definition (as specified in the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> API operation).
     * </p>
     * 
     * @return The name of the asset model hierarchy definition (as specified in the <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     *         >CreateAssetModel</a> or <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *         >UpdateAssetModel</a> API operation).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the asset model hierarchy definition (as specified in the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> API operation).
     * </p>
     * 
     * @param name
     *        The name of the asset model hierarchy definition (as specified in the <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     *        >CreateAssetModel</a> or <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *        >UpdateAssetModel</a> API operation).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelHierarchyDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of an asset model for this hierarchy. This can be either the actual ID in UUID format, or else
     * <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param childAssetModelId
     *        The ID of an asset model for this hierarchy. This can be either the actual ID in UUID format, or else
     *        <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *        >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setChildAssetModelId(String childAssetModelId) {
        this.childAssetModelId = childAssetModelId;
    }

    /**
     * <p>
     * The ID of an asset model for this hierarchy. This can be either the actual ID in UUID format, or else
     * <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The ID of an asset model for this hierarchy. This can be either the actual ID in UUID format, or else
     *         <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *         >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getChildAssetModelId() {
        return this.childAssetModelId;
    }

    /**
     * <p>
     * The ID of an asset model for this hierarchy. This can be either the actual ID in UUID format, or else
     * <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param childAssetModelId
     *        The ID of an asset model for this hierarchy. This can be either the actual ID in UUID format, or else
     *        <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *        >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelHierarchyDefinition withChildAssetModelId(String childAssetModelId) {
        setChildAssetModelId(childAssetModelId);
        return this;
    }

    /**
     * <p>
     * The ID to assign to the asset model hierarchy, if desired. IoT SiteWise automatically generates a unique ID for
     * you, so this parameter is never required. However, if you prefer to supply your own ID instead, you can specify
     * it here in UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @param id
     *        The ID to assign to the asset model hierarchy, if desired. IoT SiteWise automatically generates a unique
     *        ID for you, so this parameter is never required. However, if you prefer to supply your own ID instead, you
     *        can specify it here in UUID format. If you specify your own ID, it must be globally unique.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID to assign to the asset model hierarchy, if desired. IoT SiteWise automatically generates a unique ID for
     * you, so this parameter is never required. However, if you prefer to supply your own ID instead, you can specify
     * it here in UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @return The ID to assign to the asset model hierarchy, if desired. IoT SiteWise automatically generates a unique
     *         ID for you, so this parameter is never required. However, if you prefer to supply your own ID instead,
     *         you can specify it here in UUID format. If you specify your own ID, it must be globally unique.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID to assign to the asset model hierarchy, if desired. IoT SiteWise automatically generates a unique ID for
     * you, so this parameter is never required. However, if you prefer to supply your own ID instead, you can specify
     * it here in UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @param id
     *        The ID to assign to the asset model hierarchy, if desired. IoT SiteWise automatically generates a unique
     *        ID for you, so this parameter is never required. However, if you prefer to supply your own ID instead, you
     *        can specify it here in UUID format. If you specify your own ID, it must be globally unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelHierarchyDefinition withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * An external ID to assign to the asset model hierarchy. The external ID must be unique among asset model
     * hierarchies within this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param externalId
     *        An external ID to assign to the asset model hierarchy. The external ID must be unique among asset model
     *        hierarchies within this asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * An external ID to assign to the asset model hierarchy. The external ID must be unique among asset model
     * hierarchies within this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return An external ID to assign to the asset model hierarchy. The external ID must be unique among asset model
     *         hierarchies within this asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *         external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * An external ID to assign to the asset model hierarchy. The external ID must be unique among asset model
     * hierarchies within this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param externalId
     *        An external ID to assign to the asset model hierarchy. The external ID must be unique among asset model
     *        hierarchies within this asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelHierarchyDefinition withExternalId(String externalId) {
        setExternalId(externalId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getChildAssetModelId() != null)
            sb.append("ChildAssetModelId: ").append(getChildAssetModelId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetModelHierarchyDefinition == false)
            return false;
        AssetModelHierarchyDefinition other = (AssetModelHierarchyDefinition) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getChildAssetModelId() == null ^ this.getChildAssetModelId() == null)
            return false;
        if (other.getChildAssetModelId() != null && other.getChildAssetModelId().equals(this.getChildAssetModelId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getChildAssetModelId() == null) ? 0 : getChildAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public AssetModelHierarchyDefinition clone() {
        try {
            return (AssetModelHierarchyDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AssetModelHierarchyDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
