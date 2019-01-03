/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Attributes are the entries within the inventory item content. It contains name and value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InventoryItemAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InventoryItemAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the inventory item attribute.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data type of the inventory item attribute.
     * </p>
     */
    private String dataType;

    /**
     * <p>
     * Name of the inventory item attribute.
     * </p>
     * 
     * @param name
     *        Name of the inventory item attribute.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the inventory item attribute.
     * </p>
     * 
     * @return Name of the inventory item attribute.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the inventory item attribute.
     * </p>
     * 
     * @param name
     *        Name of the inventory item attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryItemAttribute withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data type of the inventory item attribute.
     * </p>
     * 
     * @param dataType
     *        The data type of the inventory item attribute.
     * @see InventoryAttributeDataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the inventory item attribute.
     * </p>
     * 
     * @return The data type of the inventory item attribute.
     * @see InventoryAttributeDataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type of the inventory item attribute.
     * </p>
     * 
     * @param dataType
     *        The data type of the inventory item attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InventoryAttributeDataType
     */

    public InventoryItemAttribute withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The data type of the inventory item attribute.
     * </p>
     * 
     * @param dataType
     *        The data type of the inventory item attribute.
     * @see InventoryAttributeDataType
     */

    public void setDataType(InventoryAttributeDataType dataType) {
        withDataType(dataType);
    }

    /**
     * <p>
     * The data type of the inventory item attribute.
     * </p>
     * 
     * @param dataType
     *        The data type of the inventory item attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InventoryAttributeDataType
     */

    public InventoryItemAttribute withDataType(InventoryAttributeDataType dataType) {
        this.dataType = dataType.toString();
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
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryItemAttribute == false)
            return false;
        InventoryItemAttribute other = (InventoryItemAttribute) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        return hashCode;
    }

    @Override
    public InventoryItemAttribute clone() {
        try {
            return (InventoryItemAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.InventoryItemAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
