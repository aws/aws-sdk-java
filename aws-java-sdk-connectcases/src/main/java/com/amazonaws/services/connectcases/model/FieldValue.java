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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object for case field values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/FieldValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier of a field.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Union of potential field value types.
     * </p>
     */
    private FieldValueUnion value;

    /**
     * <p>
     * Unique identifier of a field.
     * </p>
     * 
     * @param id
     *        Unique identifier of a field.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Unique identifier of a field.
     * </p>
     * 
     * @return Unique identifier of a field.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Unique identifier of a field.
     * </p>
     * 
     * @param id
     *        Unique identifier of a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldValue withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Union of potential field value types.
     * </p>
     * 
     * @param value
     *        Union of potential field value types.
     */

    public void setValue(FieldValueUnion value) {
        this.value = value;
    }

    /**
     * <p>
     * Union of potential field value types.
     * </p>
     * 
     * @return Union of potential field value types.
     */

    public FieldValueUnion getValue() {
        return this.value;
    }

    /**
     * <p>
     * Union of potential field value types.
     * </p>
     * 
     * @param value
     *        Union of potential field value types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldValue withValue(FieldValueUnion value) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof FieldValue == false)
            return false;
        FieldValue other = (FieldValue) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public FieldValue clone() {
        try {
            return (FieldValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.FieldValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
