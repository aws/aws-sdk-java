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
 * Contains a composite model definition in an asset model. This composite model definition is applied to all assets
 * created from the asset model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetModelCompositeModelDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetModelCompositeModelDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the composite model.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the composite model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of the composite model. For alarm composite models, this type is <code>AWS/ALARM</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The asset property definitions for this composite model.
     * </p>
     */
    private java.util.List<AssetModelPropertyDefinition> properties;
    /**
     * <p>
     * The ID to assign to the composite model, if desired. IoT SiteWise automatically generates a unique ID for you, so
     * this parameter is never required. However, if you prefer to supply your own ID instead, you can specify it here
     * in UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     */
    private String id;
    /**
     * <p>
     * An external ID to assign to the composite model. The external ID must be unique among composite models within
     * this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The name of the composite model.
     * </p>
     * 
     * @param name
     *        The name of the composite model.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the composite model.
     * </p>
     * 
     * @return The name of the composite model.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the composite model.
     * </p>
     * 
     * @param name
     *        The name of the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelCompositeModelDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the composite model.
     * </p>
     * 
     * @param description
     *        The description of the composite model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the composite model.
     * </p>
     * 
     * @return The description of the composite model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the composite model.
     * </p>
     * 
     * @param description
     *        The description of the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelCompositeModelDefinition withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of the composite model. For alarm composite models, this type is <code>AWS/ALARM</code>.
     * </p>
     * 
     * @param type
     *        The type of the composite model. For alarm composite models, this type is <code>AWS/ALARM</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the composite model. For alarm composite models, this type is <code>AWS/ALARM</code>.
     * </p>
     * 
     * @return The type of the composite model. For alarm composite models, this type is <code>AWS/ALARM</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the composite model. For alarm composite models, this type is <code>AWS/ALARM</code>.
     * </p>
     * 
     * @param type
     *        The type of the composite model. For alarm composite models, this type is <code>AWS/ALARM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelCompositeModelDefinition withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The asset property definitions for this composite model.
     * </p>
     * 
     * @return The asset property definitions for this composite model.
     */

    public java.util.List<AssetModelPropertyDefinition> getProperties() {
        return properties;
    }

    /**
     * <p>
     * The asset property definitions for this composite model.
     * </p>
     * 
     * @param properties
     *        The asset property definitions for this composite model.
     */

    public void setProperties(java.util.Collection<AssetModelPropertyDefinition> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }

        this.properties = new java.util.ArrayList<AssetModelPropertyDefinition>(properties);
    }

    /**
     * <p>
     * The asset property definitions for this composite model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProperties(java.util.Collection)} or {@link #withProperties(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param properties
     *        The asset property definitions for this composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelCompositeModelDefinition withProperties(AssetModelPropertyDefinition... properties) {
        if (this.properties == null) {
            setProperties(new java.util.ArrayList<AssetModelPropertyDefinition>(properties.length));
        }
        for (AssetModelPropertyDefinition ele : properties) {
            this.properties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The asset property definitions for this composite model.
     * </p>
     * 
     * @param properties
     *        The asset property definitions for this composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelCompositeModelDefinition withProperties(java.util.Collection<AssetModelPropertyDefinition> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * <p>
     * The ID to assign to the composite model, if desired. IoT SiteWise automatically generates a unique ID for you, so
     * this parameter is never required. However, if you prefer to supply your own ID instead, you can specify it here
     * in UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @param id
     *        The ID to assign to the composite model, if desired. IoT SiteWise automatically generates a unique ID for
     *        you, so this parameter is never required. However, if you prefer to supply your own ID instead, you can
     *        specify it here in UUID format. If you specify your own ID, it must be globally unique.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID to assign to the composite model, if desired. IoT SiteWise automatically generates a unique ID for you, so
     * this parameter is never required. However, if you prefer to supply your own ID instead, you can specify it here
     * in UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @return The ID to assign to the composite model, if desired. IoT SiteWise automatically generates a unique ID for
     *         you, so this parameter is never required. However, if you prefer to supply your own ID instead, you can
     *         specify it here in UUID format. If you specify your own ID, it must be globally unique.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID to assign to the composite model, if desired. IoT SiteWise automatically generates a unique ID for you, so
     * this parameter is never required. However, if you prefer to supply your own ID instead, you can specify it here
     * in UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @param id
     *        The ID to assign to the composite model, if desired. IoT SiteWise automatically generates a unique ID for
     *        you, so this parameter is never required. However, if you prefer to supply your own ID instead, you can
     *        specify it here in UUID format. If you specify your own ID, it must be globally unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelCompositeModelDefinition withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * An external ID to assign to the composite model. The external ID must be unique among composite models within
     * this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param externalId
     *        An external ID to assign to the composite model. The external ID must be unique among composite models
     *        within this asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * An external ID to assign to the composite model. The external ID must be unique among composite models within
     * this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return An external ID to assign to the composite model. The external ID must be unique among composite models
     *         within this asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *         external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * An external ID to assign to the composite model. The external ID must be unique among composite models within
     * this asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param externalId
     *        An external ID to assign to the composite model. The external ID must be unique among composite models
     *        within this asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelCompositeModelDefinition withExternalId(String externalId) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
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

        if (obj instanceof AssetModelCompositeModelDefinition == false)
            return false;
        AssetModelCompositeModelDefinition other = (AssetModelCompositeModelDefinition) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public AssetModelCompositeModelDefinition clone() {
        try {
            return (AssetModelCompositeModelDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AssetModelCompositeModelDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
