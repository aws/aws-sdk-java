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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getServerCertificate(GetServerCertificateRequest) GetServerCertificate operation}.
 * <p>
 * Retrieves information about the specified server certificate.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getServerCertificate(GetServerCertificateRequest)
 */
public class GetServerCertificateRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the server certificate you want to retrieve information
     * about.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String serverCertificateName;

    /**
     * Default constructor for a new GetServerCertificateRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetServerCertificateRequest() {}
    
    /**
     * Constructs a new GetServerCertificateRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param serverCertificateName The name of the server certificate you
     * want to retrieve information about.
     */
    public GetServerCertificateRequest(String serverCertificateName) {
        setServerCertificateName(serverCertificateName);
    }

    /**
     * The name of the server certificate you want to retrieve information
     * about.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The name of the server certificate you want to retrieve information
     *         about.
     */
    public String getServerCertificateName() {
        return serverCertificateName;
    }
    
    /**
     * The name of the server certificate you want to retrieve information
     * about.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param serverCertificateName The name of the server certificate you want to retrieve information
     *         about.
     */
    public void setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
    }
    
    /**
     * The name of the server certificate you want to retrieve information
     * about.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param serverCertificateName The name of the server certificate you want to retrieve information
     *         about.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetServerCertificateRequest withServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
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
        if (getServerCertificateName() != null) sb.append("ServerCertificateName: " + getServerCertificateName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getServerCertificateName() == null) ? 0 : getServerCertificateName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetServerCertificateRequest == false) return false;
        GetServerCertificateRequest other = (GetServerCertificateRequest)obj;
        
        if (other.getServerCertificateName() == null ^ this.getServerCertificateName() == null) return false;
        if (other.getServerCertificateName() != null && other.getServerCertificateName().equals(this.getServerCertificateName()) == false) return false; 
        return true;
    }
    
}
    