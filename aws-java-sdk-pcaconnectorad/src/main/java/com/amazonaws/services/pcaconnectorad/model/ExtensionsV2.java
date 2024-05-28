/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Certificate extensions for v2 template schema
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ExtensionsV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtensionsV2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Application policies specify what the certificate is used for and its purpose.
     * </p>
     */
    private ApplicationPolicies applicationPolicies;
    /**
     * <p>
     * The key usage extension defines the purpose (e.g., encipherment, signature, certificate signing) of the key
     * contained in the certificate.
     * </p>
     */
    private KeyUsage keyUsage;

    /**
     * <p>
     * Application policies specify what the certificate is used for and its purpose.
     * </p>
     * 
     * @param applicationPolicies
     *        Application policies specify what the certificate is used for and its purpose.
     */

    public void setApplicationPolicies(ApplicationPolicies applicationPolicies) {
        this.applicationPolicies = applicationPolicies;
    }

    /**
     * <p>
     * Application policies specify what the certificate is used for and its purpose.
     * </p>
     * 
     * @return Application policies specify what the certificate is used for and its purpose.
     */

    public ApplicationPolicies getApplicationPolicies() {
        return this.applicationPolicies;
    }

    /**
     * <p>
     * Application policies specify what the certificate is used for and its purpose.
     * </p>
     * 
     * @param applicationPolicies
     *        Application policies specify what the certificate is used for and its purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtensionsV2 withApplicationPolicies(ApplicationPolicies applicationPolicies) {
        setApplicationPolicies(applicationPolicies);
        return this;
    }

    /**
     * <p>
     * The key usage extension defines the purpose (e.g., encipherment, signature, certificate signing) of the key
     * contained in the certificate.
     * </p>
     * 
     * @param keyUsage
     *        The key usage extension defines the purpose (e.g., encipherment, signature, certificate signing) of the
     *        key contained in the certificate.
     */

    public void setKeyUsage(KeyUsage keyUsage) {
        this.keyUsage = keyUsage;
    }

    /**
     * <p>
     * The key usage extension defines the purpose (e.g., encipherment, signature, certificate signing) of the key
     * contained in the certificate.
     * </p>
     * 
     * @return The key usage extension defines the purpose (e.g., encipherment, signature, certificate signing) of the
     *         key contained in the certificate.
     */

    public KeyUsage getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * <p>
     * The key usage extension defines the purpose (e.g., encipherment, signature, certificate signing) of the key
     * contained in the certificate.
     * </p>
     * 
     * @param keyUsage
     *        The key usage extension defines the purpose (e.g., encipherment, signature, certificate signing) of the
     *        key contained in the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtensionsV2 withKeyUsage(KeyUsage keyUsage) {
        setKeyUsage(keyUsage);
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
        if (getApplicationPolicies() != null)
            sb.append("ApplicationPolicies: ").append(getApplicationPolicies()).append(",");
        if (getKeyUsage() != null)
            sb.append("KeyUsage: ").append(getKeyUsage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtensionsV2 == false)
            return false;
        ExtensionsV2 other = (ExtensionsV2) obj;
        if (other.getApplicationPolicies() == null ^ this.getApplicationPolicies() == null)
            return false;
        if (other.getApplicationPolicies() != null && other.getApplicationPolicies().equals(this.getApplicationPolicies()) == false)
            return false;
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null)
            return false;
        if (other.getKeyUsage() != null && other.getKeyUsage().equals(this.getKeyUsage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationPolicies() == null) ? 0 : getApplicationPolicies().hashCode());
        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        return hashCode;
    }

    @Override
    public ExtensionsV2 clone() {
        try {
            return (ExtensionsV2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.ExtensionsV2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
