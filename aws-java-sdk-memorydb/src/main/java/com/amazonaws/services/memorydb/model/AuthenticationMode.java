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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Denotes the user's authentication properties, such as whether it requires a password to authenticate. Used in output
 * responses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/AuthenticationMode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationMode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the user requires a password to authenticate. All newly-created users require a password.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The password(s) used for authentication
     * </p>
     */
    private java.util.List<String> passwords;

    /**
     * <p>
     * Indicates whether the user requires a password to authenticate. All newly-created users require a password.
     * </p>
     * 
     * @param type
     *        Indicates whether the user requires a password to authenticate. All newly-created users require a
     *        password.
     * @see InputAuthenticationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates whether the user requires a password to authenticate. All newly-created users require a password.
     * </p>
     * 
     * @return Indicates whether the user requires a password to authenticate. All newly-created users require a
     *         password.
     * @see InputAuthenticationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Indicates whether the user requires a password to authenticate. All newly-created users require a password.
     * </p>
     * 
     * @param type
     *        Indicates whether the user requires a password to authenticate. All newly-created users require a
     *        password.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputAuthenticationType
     */

    public AuthenticationMode withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates whether the user requires a password to authenticate. All newly-created users require a password.
     * </p>
     * 
     * @param type
     *        Indicates whether the user requires a password to authenticate. All newly-created users require a
     *        password.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputAuthenticationType
     */

    public AuthenticationMode withType(InputAuthenticationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The password(s) used for authentication
     * </p>
     * 
     * @return The password(s) used for authentication
     */

    public java.util.List<String> getPasswords() {
        return passwords;
    }

    /**
     * <p>
     * The password(s) used for authentication
     * </p>
     * 
     * @param passwords
     *        The password(s) used for authentication
     */

    public void setPasswords(java.util.Collection<String> passwords) {
        if (passwords == null) {
            this.passwords = null;
            return;
        }

        this.passwords = new java.util.ArrayList<String>(passwords);
    }

    /**
     * <p>
     * The password(s) used for authentication
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPasswords(java.util.Collection)} or {@link #withPasswords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param passwords
     *        The password(s) used for authentication
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationMode withPasswords(String... passwords) {
        if (this.passwords == null) {
            setPasswords(new java.util.ArrayList<String>(passwords.length));
        }
        for (String ele : passwords) {
            this.passwords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The password(s) used for authentication
     * </p>
     * 
     * @param passwords
     *        The password(s) used for authentication
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationMode withPasswords(java.util.Collection<String> passwords) {
        setPasswords(passwords);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPasswords() != null)
            sb.append("Passwords: ").append(getPasswords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationMode == false)
            return false;
        AuthenticationMode other = (AuthenticationMode) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPasswords() == null ^ this.getPasswords() == null)
            return false;
        if (other.getPasswords() != null && other.getPasswords().equals(this.getPasswords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPasswords() == null) ? 0 : getPasswords().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticationMode clone() {
        try {
            return (AuthenticationMode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.AuthenticationModeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
