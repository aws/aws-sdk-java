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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#uploadSigningCertificate(UploadSigningCertificateRequest) UploadSigningCertificate operation}.
 * <p>
 * Uploads an X.509 signing certificate and associates it with the specified user. Some AWS services use X.509 signing certificates to validate requests
 * that are signed with a corresponding private key. When you upload the certificate, its default status is <code>Active</code> .
 * </p>
 * <p>
 * If the <code>UserName</code> field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request.
 * Because this action works for access keys under the AWS account, this API can be used to manage root credentials even if the AWS account has no
 * associated users.
 * </p>
 * <p>
 * <b>NOTE:</b>Because the body of a X.509 certificate can be large, you should use POST rather than GET when calling UploadSigningCertificate. For
 * information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general
 * information about using the Query API with IAM, go to Making Query Requests in Using IAM.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#uploadSigningCertificate(UploadSigningCertificateRequest)
 */
public class UploadSigningCertificateRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the user the signing certificate is for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The contents of the signing certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     */
    private String certificateBody;

    /**
     * Default constructor for a new UploadSigningCertificateRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UploadSigningCertificateRequest() {}
    
    /**
     * Constructs a new UploadSigningCertificateRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param certificateBody The contents of the signing certificate.
     */
    public UploadSigningCertificateRequest(String certificateBody) {
        setCertificateBody(certificateBody);
    }

    /**
     * Name of the user the signing certificate is for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user the signing certificate is for.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user the signing certificate is for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user the signing certificate is for.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user the signing certificate is for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user the signing certificate is for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadSigningCertificateRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * The contents of the signing certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @return The contents of the signing certificate.
     */
    public String getCertificateBody() {
        return certificateBody;
    }
    
    /**
     * The contents of the signing certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param certificateBody The contents of the signing certificate.
     */
    public void setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
    }
    
    /**
     * The contents of the signing certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param certificateBody The contents of the signing certificate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadSigningCertificateRequest withCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
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
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getCertificateBody() != null) sb.append("CertificateBody: " + getCertificateBody() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getCertificateBody() == null) ? 0 : getCertificateBody().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UploadSigningCertificateRequest == false) return false;
        UploadSigningCertificateRequest other = (UploadSigningCertificateRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getCertificateBody() == null ^ this.getCertificateBody() == null) return false;
        if (other.getCertificateBody() != null && other.getCertificateBody().equals(this.getCertificateBody()) == false) return false; 
        return true;
    }
    
}
    