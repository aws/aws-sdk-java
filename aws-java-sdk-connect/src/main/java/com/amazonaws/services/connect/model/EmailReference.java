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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a reference when the <code>referenceType</code> is <code>EMAIL</code>. Otherwise, null.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EmailReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the email reference.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A valid email address.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Identifier of the email reference.
     * </p>
     * 
     * @param name
     *        Identifier of the email reference.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Identifier of the email reference.
     * </p>
     * 
     * @return Identifier of the email reference.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Identifier of the email reference.
     * </p>
     * 
     * @param name
     *        Identifier of the email reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailReference withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A valid email address.
     * </p>
     * 
     * @param value
     *        A valid email address.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A valid email address.
     * </p>
     * 
     * @return A valid email address.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A valid email address.
     * </p>
     * 
     * @param value
     *        A valid email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailReference withValue(String value) {
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

        if (obj instanceof EmailReference == false)
            return false;
        EmailReference other = (EmailReference) obj;
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
    public EmailReference clone() {
        try {
            return (EmailReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EmailReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
