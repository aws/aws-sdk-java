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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#uploadServerCertificate(UploadServerCertificateRequest) UploadServerCertificate operation}.
 * <p>
 * Uploads a server certificate entity for the AWS account. The server certificate entity includes a public key certificate, a private key, and an
 * optional certificate chain, which should all be PEM-encoded.
 * </p>
 * <p>
 * For information about the number of server certificates you can upload, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html"> Limitations on IAM Entities </a> in <i>Using AWS
 * Identity and Access Management</i> .
 * </p>
 * <p>
 * <b>NOTE:</b>Because the body of the public key certificate, private key, and the certificate chain can be large, you should use POST rather than GET
 * when calling UploadServerCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in
 * the AWS General Reference. For general information about using the Query API with IAM, go to Making Query Requests in Using IAM.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#uploadServerCertificate(UploadServerCertificateRequest)
 */
public class UploadServerCertificateRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The path for the server certificate. For more information about paths,
     * see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>. <p>This parameter is optional. If
     * it is not included, it defaults to a slash (/).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String path;

    /**
     * The name for the server certificate. Do not include the path in this
     * value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String serverCertificateName;

    /**
     * The contents of the public key certificate in PEM-encoded format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     */
    private String certificateBody;

    /**
     * The contents of the private key in PEM-encoded format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]*<br/>
     */
    private String privateKey;

    /**
     * The contents of the certificate chain. This is typically a
     * concatenation of the PEM-encoded public key certificates of the chain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2097152<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]*<br/>
     */
    private String certificateChain;

    /**
     * Default constructor for a new UploadServerCertificateRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UploadServerCertificateRequest() {}
    
    /**
     * Constructs a new UploadServerCertificateRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param serverCertificateName The name for the server certificate. Do
     * not include the path in this value.
     * @param certificateBody The contents of the public key certificate in
     * PEM-encoded format.
     * @param privateKey The contents of the private key in PEM-encoded
     * format.
     */
    public UploadServerCertificateRequest(String serverCertificateName, String certificateBody, String privateKey) {
        setServerCertificateName(serverCertificateName);
        setCertificateBody(certificateBody);
        setPrivateKey(privateKey);
    }

    /**
     * The path for the server certificate. For more information about paths,
     * see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>. <p>This parameter is optional. If
     * it is not included, it defaults to a slash (/).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return The path for the server certificate. For more information about paths,
     *         see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>. <p>This parameter is optional. If
     *         it is not included, it defaults to a slash (/).
     */
    public String getPath() {
        return path;
    }
    
    /**
     * The path for the server certificate. For more information about paths,
     * see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>. <p>This parameter is optional. If
     * it is not included, it defaults to a slash (/).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path The path for the server certificate. For more information about paths,
     *         see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>. <p>This parameter is optional. If
     *         it is not included, it defaults to a slash (/).
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     * The path for the server certificate. For more information about paths,
     * see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>. <p>This parameter is optional. If
     * it is not included, it defaults to a slash (/).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path The path for the server certificate. For more information about paths,
     *         see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>. <p>This parameter is optional. If
     *         it is not included, it defaults to a slash (/).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadServerCertificateRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * The name for the server certificate. Do not include the path in this
     * value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The name for the server certificate. Do not include the path in this
     *         value.
     */
    public String getServerCertificateName() {
        return serverCertificateName;
    }
    
    /**
     * The name for the server certificate. Do not include the path in this
     * value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param serverCertificateName The name for the server certificate. Do not include the path in this
     *         value.
     */
    public void setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
    }
    
    /**
     * The name for the server certificate. Do not include the path in this
     * value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param serverCertificateName The name for the server certificate. Do not include the path in this
     *         value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadServerCertificateRequest withServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
        return this;
    }

    /**
     * The contents of the public key certificate in PEM-encoded format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @return The contents of the public key certificate in PEM-encoded format.
     */
    public String getCertificateBody() {
        return certificateBody;
    }
    
    /**
     * The contents of the public key certificate in PEM-encoded format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param certificateBody The contents of the public key certificate in PEM-encoded format.
     */
    public void setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
    }
    
    /**
     * The contents of the public key certificate in PEM-encoded format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param certificateBody The contents of the public key certificate in PEM-encoded format.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadServerCertificateRequest withCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
        return this;
    }

    /**
     * The contents of the private key in PEM-encoded format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]*<br/>
     *
     * @return The contents of the private key in PEM-encoded format.
     */
    public String getPrivateKey() {
        return privateKey;
    }
    
    /**
     * The contents of the private key in PEM-encoded format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]*<br/>
     *
     * @param privateKey The contents of the private key in PEM-encoded format.
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
    
    /**
     * The contents of the private key in PEM-encoded format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]*<br/>
     *
     * @param privateKey The contents of the private key in PEM-encoded format.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadServerCertificateRequest withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * The contents of the certificate chain. This is typically a
     * concatenation of the PEM-encoded public key certificates of the chain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2097152<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]*<br/>
     *
     * @return The contents of the certificate chain. This is typically a
     *         concatenation of the PEM-encoded public key certificates of the chain.
     */
    public String getCertificateChain() {
        return certificateChain;
    }
    
    /**
     * The contents of the certificate chain. This is typically a
     * concatenation of the PEM-encoded public key certificates of the chain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2097152<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]*<br/>
     *
     * @param certificateChain The contents of the certificate chain. This is typically a
     *         concatenation of the PEM-encoded public key certificates of the chain.
     */
    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }
    
    /**
     * The contents of the certificate chain. This is typically a
     * concatenation of the PEM-encoded public key certificates of the chain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2097152<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]*<br/>
     *
     * @param certificateChain The contents of the certificate chain. This is typically a
     *         concatenation of the PEM-encoded public key certificates of the chain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadServerCertificateRequest withCertificateChain(String certificateChain) {
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
        if (getPath() != null) sb.append("Path: " + getPath() + ",");
        if (getServerCertificateName() != null) sb.append("ServerCertificateName: " + getServerCertificateName() + ",");
        if (getCertificateBody() != null) sb.append("CertificateBody: " + getCertificateBody() + ",");
        if (getPrivateKey() != null) sb.append("PrivateKey: " + getPrivateKey() + ",");
        if (getCertificateChain() != null) sb.append("CertificateChain: " + getCertificateChain() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode()); 
        hashCode = prime * hashCode + ((getServerCertificateName() == null) ? 0 : getServerCertificateName().hashCode()); 
        hashCode = prime * hashCode + ((getCertificateBody() == null) ? 0 : getCertificateBody().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode()); 
        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UploadServerCertificateRequest == false) return false;
        UploadServerCertificateRequest other = (UploadServerCertificateRequest)obj;
        
        if (other.getPath() == null ^ this.getPath() == null) return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false) return false; 
        if (other.getServerCertificateName() == null ^ this.getServerCertificateName() == null) return false;
        if (other.getServerCertificateName() != null && other.getServerCertificateName().equals(this.getServerCertificateName()) == false) return false; 
        if (other.getCertificateBody() == null ^ this.getCertificateBody() == null) return false;
        if (other.getCertificateBody() != null && other.getCertificateBody().equals(this.getCertificateBody()) == false) return false; 
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null) return false;
        if (other.getPrivateKey() != null && other.getPrivateKey().equals(this.getPrivateKey()) == false) return false; 
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null) return false;
        if (other.getCertificateChain() != null && other.getCertificateChain().equals(this.getCertificateChain()) == false) return false; 
        return true;
    }
    
}
    