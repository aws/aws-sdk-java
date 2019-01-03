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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an app's SSL configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/SslConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SslConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The contents of the certificate's domain.crt file.
     * </p>
     */
    private String certificate;
    /**
     * <p>
     * The private key; the contents of the certificate's domain.kex file.
     * </p>
     */
    private String privateKey;
    /**
     * <p>
     * Optional. Can be used to specify an intermediate certificate authority key or client authentication.
     * </p>
     */
    private String chain;

    /**
     * <p>
     * The contents of the certificate's domain.crt file.
     * </p>
     * 
     * @param certificate
     *        The contents of the certificate's domain.crt file.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The contents of the certificate's domain.crt file.
     * </p>
     * 
     * @return The contents of the certificate's domain.crt file.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The contents of the certificate's domain.crt file.
     * </p>
     * 
     * @param certificate
     *        The contents of the certificate's domain.crt file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SslConfiguration withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * The private key; the contents of the certificate's domain.kex file.
     * </p>
     * 
     * @param privateKey
     *        The private key; the contents of the certificate's domain.kex file.
     */

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * The private key; the contents of the certificate's domain.kex file.
     * </p>
     * 
     * @return The private key; the contents of the certificate's domain.kex file.
     */

    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * <p>
     * The private key; the contents of the certificate's domain.kex file.
     * </p>
     * 
     * @param privateKey
     *        The private key; the contents of the certificate's domain.kex file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SslConfiguration withPrivateKey(String privateKey) {
        setPrivateKey(privateKey);
        return this;
    }

    /**
     * <p>
     * Optional. Can be used to specify an intermediate certificate authority key or client authentication.
     * </p>
     * 
     * @param chain
     *        Optional. Can be used to specify an intermediate certificate authority key or client authentication.
     */

    public void setChain(String chain) {
        this.chain = chain;
    }

    /**
     * <p>
     * Optional. Can be used to specify an intermediate certificate authority key or client authentication.
     * </p>
     * 
     * @return Optional. Can be used to specify an intermediate certificate authority key or client authentication.
     */

    public String getChain() {
        return this.chain;
    }

    /**
     * <p>
     * Optional. Can be used to specify an intermediate certificate authority key or client authentication.
     * </p>
     * 
     * @param chain
     *        Optional. Can be used to specify an intermediate certificate authority key or client authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SslConfiguration withChain(String chain) {
        setChain(chain);
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
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: ").append(getPrivateKey()).append(",");
        if (getChain() != null)
            sb.append("Chain: ").append(getChain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SslConfiguration == false)
            return false;
        SslConfiguration other = (SslConfiguration) obj;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        if (other.getChain() == null ^ this.getChain() == null)
            return false;
        if (other.getChain() != null && other.getChain().equals(this.getChain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        hashCode = prime * hashCode + ((getChain() == null) ? 0 : getChain().hashCode());
        return hashCode;
    }

    @Override
    public SslConfiguration clone() {
        try {
            return (SslConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.SslConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
