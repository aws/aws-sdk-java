/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Describes an app's SSL configuration.
 * </p>
 */
public class SslConfiguration implements Serializable {

    /**
     * The contents of the certificate's domain.crt file.
     */
    private String certificate;

    /**
     * The private key; the contents of the certificate's domain.kex file.
     */
    private String privateKey;

    /**
     * Optional. Can be used to specify an intermediate certificate authority
     * key or client authentication.
     */
    private String chain;

    /**
     * The contents of the certificate's domain.crt file.
     *
     * @return The contents of the certificate's domain.crt file.
     */
    public String getCertificate() {
        return certificate;
    }
    
    /**
     * The contents of the certificate's domain.crt file.
     *
     * @param certificate The contents of the certificate's domain.crt file.
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
    
    /**
     * The contents of the certificate's domain.crt file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificate The contents of the certificate's domain.crt file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SslConfiguration withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * The private key; the contents of the certificate's domain.kex file.
     *
     * @return The private key; the contents of the certificate's domain.kex file.
     */
    public String getPrivateKey() {
        return privateKey;
    }
    
    /**
     * The private key; the contents of the certificate's domain.kex file.
     *
     * @param privateKey The private key; the contents of the certificate's domain.kex file.
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
    
    /**
     * The private key; the contents of the certificate's domain.kex file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateKey The private key; the contents of the certificate's domain.kex file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SslConfiguration withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Optional. Can be used to specify an intermediate certificate authority
     * key or client authentication.
     *
     * @return Optional. Can be used to specify an intermediate certificate authority
     *         key or client authentication.
     */
    public String getChain() {
        return chain;
    }
    
    /**
     * Optional. Can be used to specify an intermediate certificate authority
     * key or client authentication.
     *
     * @param chain Optional. Can be used to specify an intermediate certificate authority
     *         key or client authentication.
     */
    public void setChain(String chain) {
        this.chain = chain;
    }
    
    /**
     * Optional. Can be used to specify an intermediate certificate authority
     * key or client authentication.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param chain Optional. Can be used to specify an intermediate certificate authority
     *         key or client authentication.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SslConfiguration withChain(String chain) {
        this.chain = chain;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCertificate() != null) sb.append("Certificate: " + getCertificate() + ",");
        if (getPrivateKey() != null) sb.append("PrivateKey: " + getPrivateKey() + ",");
        if (getChain() != null) sb.append("Chain: " + getChain() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SslConfiguration == false) return false;
        SslConfiguration other = (SslConfiguration)obj;
        
        if (other.getCertificate() == null ^ this.getCertificate() == null) return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false) return false; 
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null) return false;
        if (other.getPrivateKey() != null && other.getPrivateKey().equals(this.getPrivateKey()) == false) return false; 
        if (other.getChain() == null ^ this.getChain() == null) return false;
        if (other.getChain() != null && other.getChain().equals(this.getChain()) == false) return false; 
        return true;
    }
    
}
    