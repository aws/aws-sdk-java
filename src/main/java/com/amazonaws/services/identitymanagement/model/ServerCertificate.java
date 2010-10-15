/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The ServerCertificate data type contains information about a server
 * certificate.
 * </p>
 * <p>
 * This data type is used as a response element in the action
 * GetServerCertificate.
 * </p>
 */
public class ServerCertificate {

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
        sb.append("ServerCertificateMetadata: " + serverCertificateMetadata + ", ");
        sb.append("CertificateBody: " + certificateBody + ", ");
        sb.append("CertificateChain: " + certificateChain + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    