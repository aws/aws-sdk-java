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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that defines the value of the key and its type in the OperationalData map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/OpsItemDataValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsItemDataValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the OperationalData key.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The type of key-value pair. Valid types include <code>SearchableString</code> and <code>String</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The value of the OperationalData key.
     * </p>
     * 
     * @param value
     *        The value of the OperationalData key.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the OperationalData key.
     * </p>
     * 
     * @return The value of the OperationalData key.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the OperationalData key.
     * </p>
     * 
     * @param value
     *        The value of the OperationalData key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemDataValue withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The type of key-value pair. Valid types include <code>SearchableString</code> and <code>String</code>.
     * </p>
     * 
     * @param type
     *        The type of key-value pair. Valid types include <code>SearchableString</code> and <code>String</code>.
     * @see OpsItemDataType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of key-value pair. Valid types include <code>SearchableString</code> and <code>String</code>.
     * </p>
     * 
     * @return The type of key-value pair. Valid types include <code>SearchableString</code> and <code>String</code>.
     * @see OpsItemDataType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of key-value pair. Valid types include <code>SearchableString</code> and <code>String</code>.
     * </p>
     * 
     * @param type
     *        The type of key-value pair. Valid types include <code>SearchableString</code> and <code>String</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpsItemDataType
     */

    public OpsItemDataValue withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of key-value pair. Valid types include <code>SearchableString</code> and <code>String</code>.
     * </p>
     * 
     * @param type
     *        The type of key-value pair. Valid types include <code>SearchableString</code> and <code>String</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpsItemDataType
     */

    public OpsItemDataValue withType(OpsItemDataType type) {
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
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

        if (obj instanceof OpsItemDataValue == false)
            return false;
        OpsItemDataValue other = (OpsItemDataValue) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
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

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public OpsItemDataValue clone() {
        try {
            return (OpsItemDataValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.OpsItemDataValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
