/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that sets information about a property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/PropertyRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that specifies information about a property.
     * </p>
     */
    private PropertyDefinitionRequest definition;
    /**
     * <p>
     * The value of the property.
     * </p>
     */
    private DataValue value;
    /**
     * <p>
     * The update type of the update property request.
     * </p>
     */
    private String updateType;

    /**
     * <p>
     * An object that specifies information about a property.
     * </p>
     * 
     * @param definition
     *        An object that specifies information about a property.
     */

    public void setDefinition(PropertyDefinitionRequest definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * An object that specifies information about a property.
     * </p>
     * 
     * @return An object that specifies information about a property.
     */

    public PropertyDefinitionRequest getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * An object that specifies information about a property.
     * </p>
     * 
     * @param definition
     *        An object that specifies information about a property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyRequest withDefinition(PropertyDefinitionRequest definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The value of the property.
     * </p>
     * 
     * @param value
     *        The value of the property.
     */

    public void setValue(DataValue value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the property.
     * </p>
     * 
     * @return The value of the property.
     */

    public DataValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the property.
     * </p>
     * 
     * @param value
     *        The value of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyRequest withValue(DataValue value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The update type of the update property request.
     * </p>
     * 
     * @param updateType
     *        The update type of the update property request.
     * @see PropertyUpdateType
     */

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    /**
     * <p>
     * The update type of the update property request.
     * </p>
     * 
     * @return The update type of the update property request.
     * @see PropertyUpdateType
     */

    public String getUpdateType() {
        return this.updateType;
    }

    /**
     * <p>
     * The update type of the update property request.
     * </p>
     * 
     * @param updateType
     *        The update type of the update property request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyUpdateType
     */

    public PropertyRequest withUpdateType(String updateType) {
        setUpdateType(updateType);
        return this;
    }

    /**
     * <p>
     * The update type of the update property request.
     * </p>
     * 
     * @param updateType
     *        The update type of the update property request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyUpdateType
     */

    public PropertyRequest withUpdateType(PropertyUpdateType updateType) {
        this.updateType = updateType.toString();
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
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getUpdateType() != null)
            sb.append("UpdateType: ").append(getUpdateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyRequest == false)
            return false;
        PropertyRequest other = (PropertyRequest) obj;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getUpdateType() == null ^ this.getUpdateType() == null)
            return false;
        if (other.getUpdateType() != null && other.getUpdateType().equals(this.getUpdateType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getUpdateType() == null) ? 0 : getUpdateType().hashCode());
        return hashCode;
    }

    @Override
    public PropertyRequest clone() {
        try {
            return (PropertyRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.PropertyRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
