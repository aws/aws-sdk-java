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
 * Contains a summary of the composite model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetModelCompositeModelSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetModelCompositeModelSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the the composite model that this summary describes..
     * </p>
     */
    private String id;
    /**
     * <p>
     * The external ID of a composite model on this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The name of the the composite model that this summary describes..
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The description of the the composite model that this summary describes..
     * </p>
     */
    private String description;
    /**
     * <p>
     * The path that includes all the pieces that make up the composite model.
     * </p>
     */
    private java.util.List<AssetModelCompositeModelPathSegment> path;

    /**
     * <p>
     * The ID of the the composite model that this summary describes..
     * </p>
     * 
     * @param id
     *        The ID of the the composite model that this summary describes..
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the the composite model that this summary describes..
     * </p>
     * 
     * @return The ID of the the composite model that this summary describes..
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the the composite model that this summary describes..
     * </p>
     * 
     * @param id
     *        The ID of the the composite model that this summary describes..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelCompositeModelSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The external ID of a composite model on this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param externalId
     *        The external ID of a composite model on this asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID of a composite model on this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The external ID of a composite model on this asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *         external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID of a composite model on this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param externalId
     *        The external ID of a composite model on this asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelCompositeModelSummary withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The name of the the composite model that this summary describes..
     * </p>
     * 
     * @param name
     *        The name of the the composite model that this summary describes..
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the the composite model that this summary describes..
     * </p>
     * 
     * @return The name of the the composite model that this summary describes..
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the the composite model that this summary describes..
     * </p>
     * 
     * @param name
     *        The name of the the composite model that this summary describes..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelCompositeModelSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of asset model.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *        component in another asset model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *        models. You can't create assets directly from this type of asset model.
     *        </p>
     *        </li>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of asset model.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *         component in another asset model.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *         models. You can't create assets directly from this type of asset model.
     *         </p>
     *         </li>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of asset model.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *        component in another asset model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *        models. You can't create assets directly from this type of asset model.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelCompositeModelSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The description of the the composite model that this summary describes..
     * </p>
     * 
     * @param description
     *        The description of the the composite model that this summary describes..
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the the composite model that this summary describes..
     * </p>
     * 
     * @return The description of the the composite model that this summary describes..
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the the composite model that this summary describes..
     * </p>
     * 
     * @param description
     *        The description of the the composite model that this summary describes..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelCompositeModelSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The path that includes all the pieces that make up the composite model.
     * </p>
     * 
     * @return The path that includes all the pieces that make up the composite model.
     */

    public java.util.List<AssetModelCompositeModelPathSegment> getPath() {
        return path;
    }

    /**
     * <p>
     * The path that includes all the pieces that make up the composite model.
     * </p>
     * 
     * @param path
     *        The path that includes all the pieces that make up the composite model.
     */

    public void setPath(java.util.Collection<AssetModelCompositeModelPathSegment> path) {
        if (path == null) {
            this.path = null;
            return;
        }

        this.path = new java.util.ArrayList<AssetModelCompositeModelPathSegment>(path);
    }

    /**
     * <p>
     * The path that includes all the pieces that make up the composite model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPath(java.util.Collection)} or {@link #withPath(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param path
     *        The path that includes all the pieces that make up the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelCompositeModelSummary withPath(AssetModelCompositeModelPathSegment... path) {
        if (this.path == null) {
            setPath(new java.util.ArrayList<AssetModelCompositeModelPathSegment>(path.length));
        }
        for (AssetModelCompositeModelPathSegment ele : path) {
            this.path.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The path that includes all the pieces that make up the composite model.
     * </p>
     * 
     * @param path
     *        The path that includes all the pieces that make up the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelCompositeModelSummary withPath(java.util.Collection<AssetModelCompositeModelPathSegment> path) {
        setPath(path);
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
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetModelCompositeModelSummary == false)
            return false;
        AssetModelCompositeModelSummary other = (AssetModelCompositeModelSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public AssetModelCompositeModelSummary clone() {
        try {
            return (AssetModelCompositeModelSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AssetModelCompositeModelSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
