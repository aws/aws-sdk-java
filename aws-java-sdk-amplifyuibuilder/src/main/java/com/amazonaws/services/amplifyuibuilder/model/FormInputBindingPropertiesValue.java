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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the data binding configuration for a form's input fields at runtime.You can use
 * <code>FormInputBindingPropertiesValue</code> to add exposed properties to a form to allow different values to be
 * entered when a form is reused in different places in an app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/FormInputBindingPropertiesValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormInputBindingPropertiesValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The property type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Describes the properties to customize with data at runtime.
     * </p>
     */
    private FormInputBindingPropertiesValueProperties bindingProperties;

    /**
     * <p>
     * The property type.
     * </p>
     * 
     * @param type
     *        The property type.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The property type.
     * </p>
     * 
     * @return The property type.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The property type.
     * </p>
     * 
     * @param type
     *        The property type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormInputBindingPropertiesValue withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Describes the properties to customize with data at runtime.
     * </p>
     * 
     * @param bindingProperties
     *        Describes the properties to customize with data at runtime.
     */

    public void setBindingProperties(FormInputBindingPropertiesValueProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

    /**
     * <p>
     * Describes the properties to customize with data at runtime.
     * </p>
     * 
     * @return Describes the properties to customize with data at runtime.
     */

    public FormInputBindingPropertiesValueProperties getBindingProperties() {
        return this.bindingProperties;
    }

    /**
     * <p>
     * Describes the properties to customize with data at runtime.
     * </p>
     * 
     * @param bindingProperties
     *        Describes the properties to customize with data at runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormInputBindingPropertiesValue withBindingProperties(FormInputBindingPropertiesValueProperties bindingProperties) {
        setBindingProperties(bindingProperties);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getBindingProperties() != null)
            sb.append("BindingProperties: ").append(getBindingProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FormInputBindingPropertiesValue == false)
            return false;
        FormInputBindingPropertiesValue other = (FormInputBindingPropertiesValue) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getBindingProperties() == null ^ this.getBindingProperties() == null)
            return false;
        if (other.getBindingProperties() != null && other.getBindingProperties().equals(this.getBindingProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getBindingProperties() == null) ? 0 : getBindingProperties().hashCode());
        return hashCode;
    }

    @Override
    public FormInputBindingPropertiesValue clone() {
        try {
            return (FormInputBindingPropertiesValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.FormInputBindingPropertiesValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
