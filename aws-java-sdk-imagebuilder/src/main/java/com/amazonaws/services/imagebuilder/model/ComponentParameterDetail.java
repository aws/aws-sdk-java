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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a parameter that is used to provide configuration details for the component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ComponentParameterDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentParameterDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of this input parameter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of input this parameter provides. The currently supported value is "string".
     * </p>
     */
    private String type;
    /**
     * <p>
     * The default value of this parameter if no input is provided.
     * </p>
     */
    private java.util.List<String> defaultValue;
    /**
     * <p>
     * Describes this parameter.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of this input parameter.
     * </p>
     * 
     * @param name
     *        The name of this input parameter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this input parameter.
     * </p>
     * 
     * @return The name of this input parameter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this input parameter.
     * </p>
     * 
     * @param name
     *        The name of this input parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentParameterDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of input this parameter provides. The currently supported value is "string".
     * </p>
     * 
     * @param type
     *        The type of input this parameter provides. The currently supported value is "string".
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of input this parameter provides. The currently supported value is "string".
     * </p>
     * 
     * @return The type of input this parameter provides. The currently supported value is "string".
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of input this parameter provides. The currently supported value is "string".
     * </p>
     * 
     * @param type
     *        The type of input this parameter provides. The currently supported value is "string".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentParameterDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The default value of this parameter if no input is provided.
     * </p>
     * 
     * @return The default value of this parameter if no input is provided.
     */

    public java.util.List<String> getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The default value of this parameter if no input is provided.
     * </p>
     * 
     * @param defaultValue
     *        The default value of this parameter if no input is provided.
     */

    public void setDefaultValue(java.util.Collection<String> defaultValue) {
        if (defaultValue == null) {
            this.defaultValue = null;
            return;
        }

        this.defaultValue = new java.util.ArrayList<String>(defaultValue);
    }

    /**
     * <p>
     * The default value of this parameter if no input is provided.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultValue(java.util.Collection)} or {@link #withDefaultValue(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param defaultValue
     *        The default value of this parameter if no input is provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentParameterDetail withDefaultValue(String... defaultValue) {
        if (this.defaultValue == null) {
            setDefaultValue(new java.util.ArrayList<String>(defaultValue.length));
        }
        for (String ele : defaultValue) {
            this.defaultValue.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The default value of this parameter if no input is provided.
     * </p>
     * 
     * @param defaultValue
     *        The default value of this parameter if no input is provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentParameterDetail withDefaultValue(java.util.Collection<String> defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * Describes this parameter.
     * </p>
     * 
     * @param description
     *        Describes this parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes this parameter.
     * </p>
     * 
     * @return Describes this parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Describes this parameter.
     * </p>
     * 
     * @param description
     *        Describes this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentParameterDetail withDescription(String description) {
        setDescription(description);
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
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentParameterDetail == false)
            return false;
        ComponentParameterDetail other = (ComponentParameterDetail) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ComponentParameterDetail clone() {
        try {
            return (ComponentParameterDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ComponentParameterDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
