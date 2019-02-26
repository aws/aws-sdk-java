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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The device verifier against which it will be authenticated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeviceSecretVerifierConfigType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceSecretVerifierConfigType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The password verifier.
     * </p>
     */
    private String passwordVerifier;
    /**
     * <p>
     * The salt.
     * </p>
     */
    private String salt;

    /**
     * <p>
     * The password verifier.
     * </p>
     * 
     * @param passwordVerifier
     *        The password verifier.
     */

    public void setPasswordVerifier(String passwordVerifier) {
        this.passwordVerifier = passwordVerifier;
    }

    /**
     * <p>
     * The password verifier.
     * </p>
     * 
     * @return The password verifier.
     */

    public String getPasswordVerifier() {
        return this.passwordVerifier;
    }

    /**
     * <p>
     * The password verifier.
     * </p>
     * 
     * @param passwordVerifier
     *        The password verifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSecretVerifierConfigType withPasswordVerifier(String passwordVerifier) {
        setPasswordVerifier(passwordVerifier);
        return this;
    }

    /**
     * <p>
     * The salt.
     * </p>
     * 
     * @param salt
     *        The salt.
     */

    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * <p>
     * The salt.
     * </p>
     * 
     * @return The salt.
     */

    public String getSalt() {
        return this.salt;
    }

    /**
     * <p>
     * The salt.
     * </p>
     * 
     * @param salt
     *        The salt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSecretVerifierConfigType withSalt(String salt) {
        setSalt(salt);
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
        if (getPasswordVerifier() != null)
            sb.append("PasswordVerifier: ").append(getPasswordVerifier()).append(",");
        if (getSalt() != null)
            sb.append("Salt: ").append(getSalt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceSecretVerifierConfigType == false)
            return false;
        DeviceSecretVerifierConfigType other = (DeviceSecretVerifierConfigType) obj;
        if (other.getPasswordVerifier() == null ^ this.getPasswordVerifier() == null)
            return false;
        if (other.getPasswordVerifier() != null && other.getPasswordVerifier().equals(this.getPasswordVerifier()) == false)
            return false;
        if (other.getSalt() == null ^ this.getSalt() == null)
            return false;
        if (other.getSalt() != null && other.getSalt().equals(this.getSalt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPasswordVerifier() == null) ? 0 : getPasswordVerifier().hashCode());
        hashCode = prime * hashCode + ((getSalt() == null) ? 0 : getSalt().hashCode());
        return hashCode;
    }

    @Override
    public DeviceSecretVerifierConfigType clone() {
        try {
            return (DeviceSecretVerifierConfigType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.DeviceSecretVerifierConfigTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
