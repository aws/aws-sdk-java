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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The password data for the Windows Server-based instance, including the ciphertext and the key pair name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PasswordData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PasswordData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encrypted password. Ciphertext will be an empty string if access to your new instance is not ready yet. When
     * you create an instance, it can take up to 15 minutes for the instance to be ready.
     * </p>
     * <note>
     * <p>
     * If you use the default key pair (<code>LightsailDefaultKeyPair</code>), the decrypted password will be available
     * in the password field.
     * </p>
     * <p>
     * If you are using a custom key pair, you need to use your own means of decryption.
     * </p>
     * <p>
     * If you change the Administrator password on the instance, Lightsail will continue to return the original
     * ciphertext value. When accessing the instance using RDP, you need to manually enter the Administrator password
     * after changing it from the default.
     * </p>
     * </note>
     */
    private String ciphertext;
    /**
     * <p>
     * The name of the key pair that you used when creating your instance. If no key pair name was specified when
     * creating the instance, Lightsail uses the default key pair (<code>LightsailDefaultKeyPair</code>).
     * </p>
     * <p>
     * If you are using a custom key pair, you need to use your own means of decrypting your password using the
     * <code>ciphertext</code>. Lightsail creates the ciphertext by encrypting your password with the public key part of
     * this key pair.
     * </p>
     */
    private String keyPairName;

    /**
     * <p>
     * The encrypted password. Ciphertext will be an empty string if access to your new instance is not ready yet. When
     * you create an instance, it can take up to 15 minutes for the instance to be ready.
     * </p>
     * <note>
     * <p>
     * If you use the default key pair (<code>LightsailDefaultKeyPair</code>), the decrypted password will be available
     * in the password field.
     * </p>
     * <p>
     * If you are using a custom key pair, you need to use your own means of decryption.
     * </p>
     * <p>
     * If you change the Administrator password on the instance, Lightsail will continue to return the original
     * ciphertext value. When accessing the instance using RDP, you need to manually enter the Administrator password
     * after changing it from the default.
     * </p>
     * </note>
     * 
     * @param ciphertext
     *        The encrypted password. Ciphertext will be an empty string if access to your new instance is not ready
     *        yet. When you create an instance, it can take up to 15 minutes for the instance to be ready.</p> <note>
     *        <p>
     *        If you use the default key pair (<code>LightsailDefaultKeyPair</code>), the decrypted password will be
     *        available in the password field.
     *        </p>
     *        <p>
     *        If you are using a custom key pair, you need to use your own means of decryption.
     *        </p>
     *        <p>
     *        If you change the Administrator password on the instance, Lightsail will continue to return the original
     *        ciphertext value. When accessing the instance using RDP, you need to manually enter the Administrator
     *        password after changing it from the default.
     *        </p>
     */

    public void setCiphertext(String ciphertext) {
        this.ciphertext = ciphertext;
    }

    /**
     * <p>
     * The encrypted password. Ciphertext will be an empty string if access to your new instance is not ready yet. When
     * you create an instance, it can take up to 15 minutes for the instance to be ready.
     * </p>
     * <note>
     * <p>
     * If you use the default key pair (<code>LightsailDefaultKeyPair</code>), the decrypted password will be available
     * in the password field.
     * </p>
     * <p>
     * If you are using a custom key pair, you need to use your own means of decryption.
     * </p>
     * <p>
     * If you change the Administrator password on the instance, Lightsail will continue to return the original
     * ciphertext value. When accessing the instance using RDP, you need to manually enter the Administrator password
     * after changing it from the default.
     * </p>
     * </note>
     * 
     * @return The encrypted password. Ciphertext will be an empty string if access to your new instance is not ready
     *         yet. When you create an instance, it can take up to 15 minutes for the instance to be ready.</p> <note>
     *         <p>
     *         If you use the default key pair (<code>LightsailDefaultKeyPair</code>), the decrypted password will be
     *         available in the password field.
     *         </p>
     *         <p>
     *         If you are using a custom key pair, you need to use your own means of decryption.
     *         </p>
     *         <p>
     *         If you change the Administrator password on the instance, Lightsail will continue to return the original
     *         ciphertext value. When accessing the instance using RDP, you need to manually enter the Administrator
     *         password after changing it from the default.
     *         </p>
     */

    public String getCiphertext() {
        return this.ciphertext;
    }

    /**
     * <p>
     * The encrypted password. Ciphertext will be an empty string if access to your new instance is not ready yet. When
     * you create an instance, it can take up to 15 minutes for the instance to be ready.
     * </p>
     * <note>
     * <p>
     * If you use the default key pair (<code>LightsailDefaultKeyPair</code>), the decrypted password will be available
     * in the password field.
     * </p>
     * <p>
     * If you are using a custom key pair, you need to use your own means of decryption.
     * </p>
     * <p>
     * If you change the Administrator password on the instance, Lightsail will continue to return the original
     * ciphertext value. When accessing the instance using RDP, you need to manually enter the Administrator password
     * after changing it from the default.
     * </p>
     * </note>
     * 
     * @param ciphertext
     *        The encrypted password. Ciphertext will be an empty string if access to your new instance is not ready
     *        yet. When you create an instance, it can take up to 15 minutes for the instance to be ready.</p> <note>
     *        <p>
     *        If you use the default key pair (<code>LightsailDefaultKeyPair</code>), the decrypted password will be
     *        available in the password field.
     *        </p>
     *        <p>
     *        If you are using a custom key pair, you need to use your own means of decryption.
     *        </p>
     *        <p>
     *        If you change the Administrator password on the instance, Lightsail will continue to return the original
     *        ciphertext value. When accessing the instance using RDP, you need to manually enter the Administrator
     *        password after changing it from the default.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordData withCiphertext(String ciphertext) {
        setCiphertext(ciphertext);
        return this;
    }

    /**
     * <p>
     * The name of the key pair that you used when creating your instance. If no key pair name was specified when
     * creating the instance, Lightsail uses the default key pair (<code>LightsailDefaultKeyPair</code>).
     * </p>
     * <p>
     * If you are using a custom key pair, you need to use your own means of decrypting your password using the
     * <code>ciphertext</code>. Lightsail creates the ciphertext by encrypting your password with the public key part of
     * this key pair.
     * </p>
     * 
     * @param keyPairName
     *        The name of the key pair that you used when creating your instance. If no key pair name was specified when
     *        creating the instance, Lightsail uses the default key pair (<code>LightsailDefaultKeyPair</code>).</p>
     *        <p>
     *        If you are using a custom key pair, you need to use your own means of decrypting your password using the
     *        <code>ciphertext</code>. Lightsail creates the ciphertext by encrypting your password with the public key
     *        part of this key pair.
     */

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    /**
     * <p>
     * The name of the key pair that you used when creating your instance. If no key pair name was specified when
     * creating the instance, Lightsail uses the default key pair (<code>LightsailDefaultKeyPair</code>).
     * </p>
     * <p>
     * If you are using a custom key pair, you need to use your own means of decrypting your password using the
     * <code>ciphertext</code>. Lightsail creates the ciphertext by encrypting your password with the public key part of
     * this key pair.
     * </p>
     * 
     * @return The name of the key pair that you used when creating your instance. If no key pair name was specified
     *         when creating the instance, Lightsail uses the default key pair (<code>LightsailDefaultKeyPair</code>
     *         ).</p>
     *         <p>
     *         If you are using a custom key pair, you need to use your own means of decrypting your password using the
     *         <code>ciphertext</code>. Lightsail creates the ciphertext by encrypting your password with the public key
     *         part of this key pair.
     */

    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * <p>
     * The name of the key pair that you used when creating your instance. If no key pair name was specified when
     * creating the instance, Lightsail uses the default key pair (<code>LightsailDefaultKeyPair</code>).
     * </p>
     * <p>
     * If you are using a custom key pair, you need to use your own means of decrypting your password using the
     * <code>ciphertext</code>. Lightsail creates the ciphertext by encrypting your password with the public key part of
     * this key pair.
     * </p>
     * 
     * @param keyPairName
     *        The name of the key pair that you used when creating your instance. If no key pair name was specified when
     *        creating the instance, Lightsail uses the default key pair (<code>LightsailDefaultKeyPair</code>).</p>
     *        <p>
     *        If you are using a custom key pair, you need to use your own means of decrypting your password using the
     *        <code>ciphertext</code>. Lightsail creates the ciphertext by encrypting your password with the public key
     *        part of this key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordData withKeyPairName(String keyPairName) {
        setKeyPairName(keyPairName);
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
        if (getCiphertext() != null)
            sb.append("Ciphertext: ").append(getCiphertext()).append(",");
        if (getKeyPairName() != null)
            sb.append("KeyPairName: ").append(getKeyPairName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PasswordData == false)
            return false;
        PasswordData other = (PasswordData) obj;
        if (other.getCiphertext() == null ^ this.getCiphertext() == null)
            return false;
        if (other.getCiphertext() != null && other.getCiphertext().equals(this.getCiphertext()) == false)
            return false;
        if (other.getKeyPairName() == null ^ this.getKeyPairName() == null)
            return false;
        if (other.getKeyPairName() != null && other.getKeyPairName().equals(this.getKeyPairName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCiphertext() == null) ? 0 : getCiphertext().hashCode());
        hashCode = prime * hashCode + ((getKeyPairName() == null) ? 0 : getKeyPairName().hashCode());
        return hashCode;
    }

    @Override
    public PasswordData clone() {
        try {
            return (PasswordData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.PasswordDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
