/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object for a group of fields and associated properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/FieldGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents an ordered list containing field related information.
     * </p>
     */
    private java.util.List<FieldItem> fields;
    /**
     * <p>
     * Name of the field group.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Represents an ordered list containing field related information.
     * </p>
     * 
     * @return Represents an ordered list containing field related information.
     */

    public java.util.List<FieldItem> getFields() {
        return fields;
    }

    /**
     * <p>
     * Represents an ordered list containing field related information.
     * </p>
     * 
     * @param fields
     *        Represents an ordered list containing field related information.
     */

    public void setFields(java.util.Collection<FieldItem> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<FieldItem>(fields);
    }

    /**
     * <p>
     * Represents an ordered list containing field related information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        Represents an ordered list containing field related information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldGroup withFields(FieldItem... fields) {
        if (this.fields == null) {
            setFields(new java.util.ArrayList<FieldItem>(fields.length));
        }
        for (FieldItem ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents an ordered list containing field related information.
     * </p>
     * 
     * @param fields
     *        Represents an ordered list containing field related information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldGroup withFields(java.util.Collection<FieldItem> fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * Name of the field group.
     * </p>
     * 
     * @param name
     *        Name of the field group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the field group.
     * </p>
     * 
     * @return Name of the field group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the field group.
     * </p>
     * 
     * @param name
     *        Name of the field group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldGroup withName(String name) {
        setName(name);
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
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldGroup == false)
            return false;
        FieldGroup other = (FieldGroup) obj;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public FieldGroup clone() {
        try {
            return (FieldGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.FieldGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
