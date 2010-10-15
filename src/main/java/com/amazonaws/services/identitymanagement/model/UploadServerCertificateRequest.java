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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#uploadServerCertificate(UploadServerCertificateRequest) UploadServerCertificate operation}.
 * <p>
 * Uploads a server certificate entity for the AWS Account. The server
 * certificate entity includes a public key certificate, a private key,
 * and an optional certificate chain, which should all be PEM-encoded.
 * </p>
 * <p>
 * For information about the number of server certificates you can
 * upload, see <a
 * vices.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html">
 * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access
 * Management</i> .
 * </p>
 * <p>
 * <b>NOTE:</b>Because the body of the public key certificate, private
 * key, and the certificate chain can be large, you should use POST
 * rather than GET when calling UploadServerCertificate. For more
 * information, see Making Query Requests in Using AWS Identity and
 * Access Management.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#uploadServerCertificate(UploadServerCertificateRequest)
 */
public class UploadServerCertificateRequest extends AmazonWebServiceRequest {

    /**
     * The path for the server certificate. For more information about paths,
     * see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
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
     * The path for the server certificate. For more information about paths,
     * see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
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
     *         ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
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
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
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
     *         ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
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
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
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
     *         ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
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
        sb.append("Path: " + path + ", ");
        sb.append("ServerCertificateName: " + serverCertificateName + ", ");
        sb.append("CertificateBody: " + certificateBody + ", ");
        sb.append("PrivateKey: " + privateKey + ", ");
        sb.append("CertificateChain: " + certificateChain + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    