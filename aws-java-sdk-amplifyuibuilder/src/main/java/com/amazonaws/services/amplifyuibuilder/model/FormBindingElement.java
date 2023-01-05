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
 * Describes how to bind a component property to form data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/FormBindingElement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormBindingElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the component to retrieve a value from.
     * </p>
     */
    private String element;
    /**
     * <p>
     * The property to retrieve a value from.
     * </p>
     */
    private String property;

    /**
     * <p>
     * The name of the component to retrieve a value from.
     * </p>
     * 
     * @param element
     *        The name of the component to retrieve a value from.
     */

    public void setElement(String element) {
        this.element = element;
    }

    /**
     * <p>
     * The name of the component to retrieve a value from.
     * </p>
     * 
     * @return The name of the component to retrieve a value from.
     */

    public String getElement() {
        return this.element;
    }

    /**
     * <p>
     * The name of the component to retrieve a value from.
     * </p>
     * 
     * @param element
     *        The name of the component to retrieve a value from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormBindingElement withElement(String element) {
        setElement(element);
        return this;
    }

    /**
     * <p>
     * The property to retrieve a value from.
     * </p>
     * 
     * @param property
     *        The property to retrieve a value from.
     */

    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * <p>
     * The property to retrieve a value from.
     * </p>
     * 
     * @return The property to retrieve a value from.
     */

    public String getProperty() {
        return this.property;
    }

    /**
     * <p>
     * The property to retrieve a value from.
     * </p>
     * 
     * @param property
     *        The property to retrieve a value from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormBindingElement withProperty(String property) {
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
        if (getElement() != null)
            sb.append("Element: ").append(getElement()).append(",");
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

        if (obj instanceof FormBindingElement == false)
            return false;
        FormBindingElement other = (FormBindingElement) obj;
        if (other.getElement() == null ^ this.getElement() == null)
            return false;
        if (other.getElement() != null && other.getElement().equals(this.getElement()) == false)
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

        hashCode = prime * hashCode + ((getElement() == null) ? 0 : getElement().hashCode());
        hashCode = prime * hashCode + ((getProperty() == null) ? 0 : getProperty().hashCode());
        return hashCode;
    }

    @Override
    public FormBindingElement clone() {
        try {
            return (FormBindingElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.FormBindingElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
