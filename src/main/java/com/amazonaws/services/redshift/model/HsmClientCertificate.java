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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Returns information about an HSM client certificate. The certificate is stored in a secure Hardware Storage Module (HSM), and used by the Amazon
 * Redshift cluster to encrypt data files.
 * </p>
 */
public class HsmClientCertificate implements Serializable {

    /**
     * The identifier of the HSM client certificate.
     */
    private String hsmClientCertificateIdentifier;

    /**
     * The public key that the Amazon Redshift cluster will use to retrieve
     * the client certificate from the HSM. You must register the public key
     * in the HSM.
     */
    private String hsmClientCertificatePublicKey;

    /**
     * The identifier of the HSM client certificate.
     *
     * @return The identifier of the HSM client certificate.
     */
    public String getHsmClientCertificateIdentifier() {
        return hsmClientCertificateIdentifier;
    }
    
    /**
     * The identifier of the HSM client certificate.
     *
     * @param hsmClientCertificateIdentifier The identifier of the HSM client certificate.
     */
    public void setHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }
    
    /**
     * The identifier of the HSM client certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmClientCertificateIdentifier The identifier of the HSM client certificate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HsmClientCertificate withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
        return this;
    }

    /**
     * The public key that the Amazon Redshift cluster will use to retrieve
     * the client certificate from the HSM. You must register the public key
     * in the HSM.
     *
     * @return The public key that the Amazon Redshift cluster will use to retrieve
     *         the client certificate from the HSM. You must register the public key
     *         in the HSM.
     */
    public String getHsmClientCertificatePublicKey() {
        return hsmClientCertificatePublicKey;
    }
    
    /**
     * The public key that the Amazon Redshift cluster will use to retrieve
     * the client certificate from the HSM. You must register the public key
     * in the HSM.
     *
     * @param hsmClientCertificatePublicKey The public key that the Amazon Redshift cluster will use to retrieve
     *         the client certificate from the HSM. You must register the public key
     *         in the HSM.
     */
    public void setHsmClientCertificatePublicKey(String hsmClientCertificatePublicKey) {
        this.hsmClientCertificatePublicKey = hsmClientCertificatePublicKey;
    }
    
    /**
     * The public key that the Amazon Redshift cluster will use to retrieve
     * the client certificate from the HSM. You must register the public key
     * in the HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmClientCertificatePublicKey The public key that the Amazon Redshift cluster will use to retrieve
     *         the client certificate from the HSM. You must register the public key
     *         in the HSM.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HsmClientCertificate withHsmClientCertificatePublicKey(String hsmClientCertificatePublicKey) {
        this.hsmClientCertificatePublicKey = hsmClientCertificatePublicKey;
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
        if (getHsmClientCertificateIdentifier() != null) sb.append("HsmClientCertificateIdentifier: " + getHsmClientCertificateIdentifier() + ",");
        if (getHsmClientCertificatePublicKey() != null) sb.append("HsmClientCertificatePublicKey: " + getHsmClientCertificatePublicKey() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHsmClientCertificateIdentifier() == null) ? 0 : getHsmClientCertificateIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getHsmClientCertificatePublicKey() == null) ? 0 : getHsmClientCertificatePublicKey().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HsmClientCertificate == false) return false;
        HsmClientCertificate other = (HsmClientCertificate)obj;
        
        if (other.getHsmClientCertificateIdentifier() == null ^ this.getHsmClientCertificateIdentifier() == null) return false;
        if (other.getHsmClientCertificateIdentifier() != null && other.getHsmClientCertificateIdentifier().equals(this.getHsmClientCertificateIdentifier()) == false) return false; 
        if (other.getHsmClientCertificatePublicKey() == null ^ this.getHsmClientCertificatePublicKey() == null) return false;
        if (other.getHsmClientCertificatePublicKey() != null && other.getHsmClientCertificatePublicKey().equals(this.getHsmClientCertificatePublicKey()) == false) return false; 
        return true;
    }
    
}
    