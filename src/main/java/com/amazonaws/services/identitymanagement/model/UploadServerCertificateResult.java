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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the result of a successful invocation of the UploadServerCertificate action.
 * </p>
 */
public class UploadServerCertificateResult implements Serializable {

    /**
     * The meta information of the uploaded server certificate without its
     * certificate body, certificate chain, and private key.
     */
    private ServerCertificateMetadata serverCertificateMetadata;

    /**
     * The meta information of the uploaded server certificate without its
     * certificate body, certificate chain, and private key.
     *
     * @return The meta information of the uploaded server certificate without its
     *         certificate body, certificate chain, and private key.
     */
    public ServerCertificateMetadata getServerCertificateMetadata() {
        return serverCertificateMetadata;
    }
    
    /**
     * The meta information of the uploaded server certificate without its
     * certificate body, certificate chain, and private key.
     *
     * @param serverCertificateMetadata The meta information of the uploaded server certificate without its
     *         certificate body, certificate chain, and private key.
     */
    public void setServerCertificateMetadata(ServerCertificateMetadata serverCertificateMetadata) {
        this.serverCertificateMetadata = serverCertificateMetadata;
    }
    
    /**
     * The meta information of the uploaded server certificate without its
     * certificate body, certificate chain, and private key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serverCertificateMetadata The meta information of the uploaded server certificate without its
     *         certificate body, certificate chain, and private key.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadServerCertificateResult withServerCertificateMetadata(ServerCertificateMetadata serverCertificateMetadata) {
        this.serverCertificateMetadata = serverCertificateMetadata;
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
        if (getServerCertificateMetadata() != null) sb.append("ServerCertificateMetadata: " + getServerCertificateMetadata() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getServerCertificateMetadata() == null) ? 0 : getServerCertificateMetadata().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UploadServerCertificateResult == false) return false;
        UploadServerCertificateResult other = (UploadServerCertificateResult)obj;
        
        if (other.getServerCertificateMetadata() == null ^ this.getServerCertificateMetadata() == null) return false;
        if (other.getServerCertificateMetadata() != null && other.getServerCertificateMetadata().equals(this.getServerCertificateMetadata()) == false) return false; 
        return true;
    }
    
}
    