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
 * The ServerCertificate data type contains information about a server certificate.
 * </p>
 * <p>
 * This data type is used as a response element in the action GetServerCertificate.
 * </p>
 */
public class ServerCertificate implements Serializable {

    /**
     * The meta information of the server certificate, such as its name,
     * path, ID, and ARN.
     */
    private ServerCertificateMetadata serverCertificateMetadata;

    /**
     * The contents of the public key certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     */
    private String certificateBody;

    /**
     * The contents of the public key certificate chain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2097152<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]*<br/>
     */
    private String certificateChain;

    /**
     * Default constructor for a new ServerCertificate object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ServerCertificate() {}
    
    /**
     * Constructs a new ServerCertificate object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param serverCertificateMetadata The meta information of the server
     * certificate, such as its name, path, ID, and ARN.
     * @param certificateBody The contents of the public key certificate.
     */
    public ServerCertificate(ServerCertificateMetadata serverCertificateMetadata, String certificateBody) {
        setServerCertificateMetadata(serverCertificateMetadata);
        setCertificateBody(certificateBody);
    }

    /**
     * The meta information of the server certificate, such as its name,
     * path, ID, and ARN.
     *
     * @return The meta information of the server certificate, such as its name,
     *         path, ID, and ARN.
     */
    public ServerCertificateMetadata getServerCertificateMetadata() {
        return serverCertificateMetadata;
    }
    
    /**
     * The meta information of the server certificate, such as its name,
     * path, ID, and ARN.
     *
     * @param serverCertificateMetadata The meta information of the server certificate, such as its name,
     *         path, ID, and ARN.
     */
    public void setServerCertificateMetadata(ServerCertificateMetadata serverCertificateMetadata) {
        this.serverCertificateMetadata = serverCertificateMetadata;
    }
    
    /**
     * The meta information of the server certificate, such as its name,
     * path, ID, and ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serverCertificateMetadata The meta information of the server certificate, such as its name,
     *         path, ID, and ARN.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServerCertificate withServerCertificateMetadata(ServerCertificateMetadata serverCertificateMetadata) {
        this.serverCertificateMetadata = serverCertificateMetadata;
        return this;
    }

    /**
     * The contents of the public key certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @return The contents of the public key certificate.
     */
    public String getCertificateBody() {
        return certificateBody;
    }
    
    /**
     * The contents of the public key certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param certificateBody The contents of the public key certificate.
     */
    public void setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
    }
    
    /**
     * The contents of the public key certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param certificateBody The contents of the public key certificate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServerCertificate withCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
        return this;
    }

    /**
     * The contents of the public key certificate chain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2097152<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]*<br/>
     *
     * @return The contents of the public key certificate chain.
     */
    public String getCertificateChain() {
        return certificateChain;
    }
    
    /**
     * The contents of the public key certificate chain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2097152<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]*<br/>
     *
     * @param certificateChain The contents of the public key certificate chain.
     */
    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }
    
    /**
     * The contents of the public key certificate chain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2097152<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]*<br/>
     *
     * @param certificateChain The contents of the public key certificate chain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServerCertificate withCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
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
        if (getServerCertificateMetadata() != null) sb.append("ServerCertificateMetadata: " + getServerCertificateMetadata() + ",");
        if (getCertificateBody() != null) sb.append("CertificateBody: " + getCertificateBody() + ",");
        if (getCertificateChain() != null) sb.append("CertificateChain: " + getCertificateChain() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getServerCertificateMetadata() == null) ? 0 : getServerCertificateMetadata().hashCode()); 
        hashCode = prime * hashCode + ((getCertificateBody() == null) ? 0 : getCertificateBody().hashCode()); 
        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ServerCertificate == false) return false;
        ServerCertificate other = (ServerCertificate)obj;
        
        if (other.getServerCertificateMetadata() == null ^ this.getServerCertificateMetadata() == null) return false;
        if (other.getServerCertificateMetadata() != null && other.getServerCertificateMetadata().equals(this.getServerCertificateMetadata()) == false) return false; 
        if (other.getCertificateBody() == null ^ this.getCertificateBody() == null) return false;
        if (other.getCertificateBody() != null && other.getCertificateBody().equals(this.getCertificateBody()) == false) return false; 
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null) return false;
        if (other.getCertificateChain() != null && other.getCertificateChain().equals(this.getCertificateChain()) == false) return false; 
        return true;
    }
    
}
    