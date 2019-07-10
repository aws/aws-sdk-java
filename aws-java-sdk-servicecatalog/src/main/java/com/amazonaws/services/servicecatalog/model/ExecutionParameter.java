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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ExecutionParameter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionParameter implements Serializable, Cloneable, StructuredPojo {

    private String name;

    private String type;

    private java.util.List<String> defaultValues;

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionParameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     */

    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionParameter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getDefaultValues() {
        return defaultValues;
    }

    /**
     * @param defaultValues
     */

    public void setDefaultValues(java.util.Collection<String> defaultValues) {
        if (defaultValues == null) {
            this.defaultValues = null;
            return;
        }

        this.defaultValues = new java.util.ArrayList<String>(defaultValues);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultValues(java.util.Collection)} or {@link #withDefaultValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param defaultValues
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionParameter withDefaultValues(String... defaultValues) {
        if (this.defaultValues == null) {
            setDefaultValues(new java.util.ArrayList<String>(defaultValues.length));
        }
        for (String ele : defaultValues) {
            this.defaultValues.add(ele);
        }
        return this;
    }

    /**
     * @param defaultValues
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionParameter withDefaultValues(java.util.Collection<String> defaultValues) {
        setDefaultValues(defaultValues);
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
        if (getDefaultValues() != null)
            sb.append("DefaultValues: ").append(getDefaultValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionParameter == false)
            return false;
        ExecutionParameter other = (ExecutionParameter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDefaultValues() == null ^ this.getDefaultValues() == null)
            return false;
        if (other.getDefaultValues() != null && other.getDefaultValues().equals(this.getDefaultValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDefaultValues() == null) ? 0 : getDefaultValues().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionParameter clone() {
        try {
            return (ExecutionParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ExecutionParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
