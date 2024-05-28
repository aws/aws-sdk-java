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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A parameter that a security control accepts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/SecurityControlParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityControlParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current value of a control parameter.
     * </p>
     */
    private java.util.List<String> value;

    /**
     * <p>
     * The name of a
     * </p>
     * 
     * @param name
     *        The name of a
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a
     * </p>
     * 
     * @return The name of a
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a
     * </p>
     * 
     * @param name
     *        The name of a
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlParameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current value of a control parameter.
     * </p>
     * 
     * @return The current value of a control parameter.
     */

    public java.util.List<String> getValue() {
        return value;
    }

    /**
     * <p>
     * The current value of a control parameter.
     * </p>
     * 
     * @param value
     *        The current value of a control parameter.
     */

    public void setValue(java.util.Collection<String> value) {
        if (value == null) {
            this.value = null;
            return;
        }

        this.value = new java.util.ArrayList<String>(value);
    }

    /**
     * <p>
     * The current value of a control parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValue(java.util.Collection)} or {@link #withValue(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param value
     *        The current value of a control parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlParameter withValue(String... value) {
        if (this.value == null) {
            setValue(new java.util.ArrayList<String>(value.length));
        }
        for (String ele : value) {
            this.value.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The current value of a control parameter.
     * </p>
     * 
     * @param value
     *        The current value of a control parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlParameter withValue(java.util.Collection<String> value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityControlParameter == false)
            return false;
        SecurityControlParameter other = (SecurityControlParameter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public SecurityControlParameter clone() {
        try {
            return (SecurityControlParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.SecurityControlParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
