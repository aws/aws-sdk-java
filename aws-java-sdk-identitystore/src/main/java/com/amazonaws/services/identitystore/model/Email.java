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
package com.amazonaws.services.identitystore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The email address associated with the user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/Email" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Email implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string containing an email address. For example, "johndoe@amazon.com."
     * </p>
     */
    private String value;
    /**
     * <p>
     * A string representing the type of address. For example, "Work."
     * </p>
     */
    private String type;
    /**
     * <p>
     * A Boolean value representing whether this is the primary email address for the associated resource.
     * </p>
     */
    private Boolean primary;

    /**
     * <p>
     * A string containing an email address. For example, "johndoe@amazon.com."
     * </p>
     * 
     * @param value
     *        A string containing an email address. For example, "johndoe@amazon.com."
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A string containing an email address. For example, "johndoe@amazon.com."
     * </p>
     * 
     * @return A string containing an email address. For example, "johndoe@amazon.com."
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A string containing an email address. For example, "johndoe@amazon.com."
     * </p>
     * 
     * @param value
     *        A string containing an email address. For example, "johndoe@amazon.com."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Email withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * A string representing the type of address. For example, "Work."
     * </p>
     * 
     * @param type
     *        A string representing the type of address. For example, "Work."
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * A string representing the type of address. For example, "Work."
     * </p>
     * 
     * @return A string representing the type of address. For example, "Work."
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * A string representing the type of address. For example, "Work."
     * </p>
     * 
     * @param type
     *        A string representing the type of address. For example, "Work."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Email withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A Boolean value representing whether this is the primary email address for the associated resource.
     * </p>
     * 
     * @param primary
     *        A Boolean value representing whether this is the primary email address for the associated resource.
     */

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    /**
     * <p>
     * A Boolean value representing whether this is the primary email address for the associated resource.
     * </p>
     * 
     * @return A Boolean value representing whether this is the primary email address for the associated resource.
     */

    public Boolean getPrimary() {
        return this.primary;
    }

    /**
     * <p>
     * A Boolean value representing whether this is the primary email address for the associated resource.
     * </p>
     * 
     * @param primary
     *        A Boolean value representing whether this is the primary email address for the associated resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Email withPrimary(Boolean primary) {
        setPrimary(primary);
        return this;
    }

    /**
     * <p>
     * A Boolean value representing whether this is the primary email address for the associated resource.
     * </p>
     * 
     * @return A Boolean value representing whether this is the primary email address for the associated resource.
     */

    public Boolean isPrimary() {
        return this.primary;
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
            sb.append("Value: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append("***Sensitive Data Redacted***").append(",");
        if (getPrimary() != null)
            sb.append("Primary: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Email == false)
            return false;
        Email other = (Email) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPrimary() == null ^ this.getPrimary() == null)
            return false;
        if (other.getPrimary() != null && other.getPrimary().equals(this.getPrimary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPrimary() == null) ? 0 : getPrimary().hashCode());
        return hashCode;
    }

    @Override
    public Email clone() {
        try {
            return (Email) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.identitystore.model.transform.EmailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
