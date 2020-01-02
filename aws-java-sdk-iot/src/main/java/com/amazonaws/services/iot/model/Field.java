/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the name and data type at a field.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Field implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the field.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The datatype of the field.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the field.
     * </p>
     * 
     * @param name
     *        The name of the field.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the field.
     * </p>
     * 
     * @return The name of the field.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the field.
     * </p>
     * 
     * @param name
     *        The name of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Field withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The datatype of the field.
     * </p>
     * 
     * @param type
     *        The datatype of the field.
     * @see FieldType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The datatype of the field.
     * </p>
     * 
     * @return The datatype of the field.
     * @see FieldType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The datatype of the field.
     * </p>
     * 
     * @param type
     *        The datatype of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldType
     */

    public Field withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The datatype of the field.
     * </p>
     * 
     * @param type
     *        The datatype of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldType
     */

    public Field withType(FieldType type) {
        this.type = type.toString();
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
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Field == false)
            return false;
        Field other = (Field) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Field clone() {
        try {
            return (Field) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.FieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
