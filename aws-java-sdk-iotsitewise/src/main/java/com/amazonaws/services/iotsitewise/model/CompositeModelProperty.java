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
 * Contains information about a composite model property on an asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CompositeModelProperty" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompositeModelProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the property.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the composite model that defines this property.
     * </p>
     */
    private String type;

    private Property assetProperty;

    /**
     * <p>
     * The name of the property.
     * </p>
     * 
     * @param name
     *        The name of the property.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the property.
     * </p>
     * 
     * @return The name of the property.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the property.
     * </p>
     * 
     * @param name
     *        The name of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeModelProperty withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the composite model that defines this property.
     * </p>
     * 
     * @param type
     *        The type of the composite model that defines this property.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the composite model that defines this property.
     * </p>
     * 
     * @return The type of the composite model that defines this property.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the composite model that defines this property.
     * </p>
     * 
     * @param type
     *        The type of the composite model that defines this property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeModelProperty withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param assetProperty
     */

    public void setAssetProperty(Property assetProperty) {
        this.assetProperty = assetProperty;
    }

    /**
     * @return
     */

    public Property getAssetProperty() {
        return this.assetProperty;
    }

    /**
     * @param assetProperty
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeModelProperty withAssetProperty(Property assetProperty) {
        setAssetProperty(assetProperty);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAssetProperty() != null)
            sb.append("AssetProperty: ").append(getAssetProperty());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompositeModelProperty == false)
            return false;
        CompositeModelProperty other = (CompositeModelProperty) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAssetProperty() == null ^ this.getAssetProperty() == null)
            return false;
        if (other.getAssetProperty() != null && other.getAssetProperty().equals(this.getAssetProperty()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAssetProperty() == null) ? 0 : getAssetProperty().hashCode());
        return hashCode;
    }

    @Override
    public CompositeModelProperty clone() {
        try {
            return (CompositeModelProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.CompositeModelPropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
