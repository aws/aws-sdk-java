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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#createHsmClientCertificate(CreateHsmClientCertificateRequest) CreateHsmClientCertificate operation}.
 * <p>
 * Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client's HSM in order to store and retrieve the keys used
 * to encrypt the cluster databases.
 * </p>
 * <p>
 * The command returns a public key, which you must store in the HSM. After creating the HSM certificate, you must create an Amazon Redshift HSM
 * configuration that provides a cluster the information needed to store and retrieve database encryption keys in the HSM. For more information, go to
 * aLinkToHSMTopic in the Amazon Redshift Management Guide.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#createHsmClientCertificate(CreateHsmClientCertificateRequest)
 */
public class CreateHsmClientCertificateRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier to be assigned to the new HSM client certificate that
     * the cluster will use to connect to the HSM to retrieve the database
     * encryption keys.
     */
    private String hsmClientCertificateIdentifier;

    /**
     * The identifier to be assigned to the new HSM client certificate that
     * the cluster will use to connect to the HSM to retrieve the database
     * encryption keys.
     *
     * @return The identifier to be assigned to the new HSM client certificate that
     *         the cluster will use to connect to the HSM to retrieve the database
     *         encryption keys.
     */
    public String getHsmClientCertificateIdentifier() {
        return hsmClientCertificateIdentifier;
    }
    
    /**
     * The identifier to be assigned to the new HSM client certificate that
     * the cluster will use to connect to the HSM to retrieve the database
     * encryption keys.
     *
     * @param hsmClientCertificateIdentifier The identifier to be assigned to the new HSM client certificate that
     *         the cluster will use to connect to the HSM to retrieve the database
     *         encryption keys.
     */
    public void setHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }
    
    /**
     * The identifier to be assigned to the new HSM client certificate that
     * the cluster will use to connect to the HSM to retrieve the database
     * encryption keys.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmClientCertificateIdentifier The identifier to be assigned to the new HSM client certificate that
     *         the cluster will use to connect to the HSM to retrieve the database
     *         encryption keys.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateHsmClientCertificateRequest withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
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
        if (getHsmClientCertificateIdentifier() != null) sb.append("HsmClientCertificateIdentifier: " + getHsmClientCertificateIdentifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHsmClientCertificateIdentifier() == null) ? 0 : getHsmClientCertificateIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateHsmClientCertificateRequest == false) return false;
        CreateHsmClientCertificateRequest other = (CreateHsmClientCertificateRequest)obj;
        
        if (other.getHsmClientCertificateIdentifier() == null ^ this.getHsmClientCertificateIdentifier() == null) return false;
        if (other.getHsmClientCertificateIdentifier() != null && other.getHsmClientCertificateIdentifier().equals(this.getHsmClientCertificateIdentifier()) == false) return false; 
        return true;
    }
    
}
    