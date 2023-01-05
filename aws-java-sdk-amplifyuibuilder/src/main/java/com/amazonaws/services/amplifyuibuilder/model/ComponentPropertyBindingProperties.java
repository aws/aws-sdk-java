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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Associates a component property to a binding property. This enables exposed properties on the top level component to
 * propagate data to the component's property values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ComponentPropertyBindingProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentPropertyBindingProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data field to bind the property to.
     * </p>
     */
    private String field;
    /**
     * <p>
     * The component property to bind to the data field.
     * </p>
     */
    private String property;

    /**
     * <p>
     * The data field to bind the property to.
     * </p>
     * 
     * @param field
     *        The data field to bind the property to.
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The data field to bind the property to.
     * </p>
     * 
     * @return The data field to bind the property to.
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The data field to bind the property to.
     * </p>
     * 
     * @param field
     *        The data field to bind the property to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentPropertyBindingProperties withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The component property to bind to the data field.
     * </p>
     * 
     * @param property
     *        The component property to bind to the data field.
     */

    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * <p>
     * The component property to bind to the data field.
     * </p>
     * 
     * @return The component property to bind to the data field.
     */

    public String getProperty() {
        return this.property;
    }

    /**
     * <p>
     * The component property to bind to the data field.
     * </p>
     * 
     * @param property
     *        The component property to bind to the data field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentPropertyBindingProperties withProperty(String property) {
        setProperty(property);
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
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getProperty() != null)
            sb.append("Property: ").append(getProperty());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentPropertyBindingProperties == false)
            return false;
        ComponentPropertyBindingProperties other = (ComponentPropertyBindingProperties) obj;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getProperty() == null ^ this.getProperty() == null)
            return false;
        if (other.getProperty() != null && other.getProperty().equals(this.getProperty()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getProperty() == null) ? 0 : getProperty().hashCode());
        return hashCode;
    }

    @Override
    public ComponentPropertyBindingProperties clone() {
        try {
            return (ComponentPropertyBindingProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ComponentPropertyBindingPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
