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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a reference when the <code>referenceType</code> is <code>STRING</code>. Otherwise, null.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StringReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StringReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the string reference.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A valid string.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Identifier of the string reference.
     * </p>
     * 
     * @param name
     *        Identifier of the string reference.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Identifier of the string reference.
     * </p>
     * 
     * @return Identifier of the string reference.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Identifier of the string reference.
     * </p>
     * 
     * @param name
     *        Identifier of the string reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringReference withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A valid string.
     * </p>
     * 
     * @param value
     *        A valid string.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A valid string.
     * </p>
     * 
     * @return A valid string.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A valid string.
     * </p>
     * 
     * @param value
     *        A valid string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringReference withValue(String value) {
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

        if (obj instanceof StringReference == false)
            return false;
        StringReference other = (StringReference) obj;
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
    public StringReference clone() {
        try {
            return (StringReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.StringReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
