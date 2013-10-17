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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteServerCertificate(DeleteServerCertificateRequest) DeleteServerCertificate operation}.
 * <p>
 * Deletes the specified server certificate.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have implications for your
 * application. If Elastic Load Balancing doesn't detect the deletion of bound certificates, it may continue to use the certificates. This could cause
 * Elastic Load Balancing to stop accepting traffic. We recommend that you remove the reference to the certificate from Elastic Load Balancing before
 * using this command to delete the certificate. For more information, go to DeleteLoadBalancerListeners in the Elastic Load Balancing API Reference.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteServerCertificate(DeleteServerCertificateRequest)
 */
public class DeleteServerCertificateRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the server certificate you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String serverCertificateName;

    /**
     * Default constructor for a new DeleteServerCertificateRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteServerCertificateRequest() {}
    
    /**
     * Constructs a new DeleteServerCertificateRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param serverCertificateName The name of the server certificate you
     * want to delete.
     */
    public DeleteServerCertificateRequest(String serverCertificateName) {
        setServerCertificateName(serverCertificateName);
    }

    /**
     * The name of the server certificate you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The name of the server certificate you want to delete.
     */
    public String getServerCertificateName() {
        return serverCertificateName;
    }
    
    /**
     * The name of the server certificate you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param serverCertificateName The name of the server certificate you want to delete.
     */
    public void setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
    }
    
    /**
     * The name of the server certificate you want to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param serverCertificateName The name of the server certificate you want to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteServerCertificateRequest withServerCertificateName(String serverCertificateName) {
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

        if (obj instanceof DeleteServerCertificateRequest == false) return false;
        DeleteServerCertificateRequest other = (DeleteServerCertificateRequest)obj;
        
        if (other.getServerCertificateName() == null ^ this.getServerCertificateName() == null) return false;
        if (other.getServerCertificateName() != null && other.getServerCertificateName().equals(this.getServerCertificateName()) == false) return false; 
        return true;
    }
    
}
    