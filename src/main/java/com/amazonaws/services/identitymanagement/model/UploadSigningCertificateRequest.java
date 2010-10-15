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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#uploadSigningCertificate(UploadSigningCertificateRequest) UploadSigningCertificate operation}.
 * <p>
 * Uploads an X.509 signing certificate and associates it with the
 * specified User. Some AWS services use X.509 signing certificates to
 * validate requests that are signed with a corresponding private key.
 * When you upload the certificate, its default status is
 * <code>Active</code> .
 * </p>
 * <p>
 * If the <code>UserName</code> field is not specified, the User name is
 * determined implicitly based on the AWS Access Key ID used to sign the
 * request. Because this action works for access keys under the AWS
 * Account, this API can be used to manage root credentials even if the
 * AWS Account has no associated Users.
 * </p>
 * <p>
 * <b>NOTE:</b>Because the body of a X.509 certificate can be large, you
 * should use POST rather than GET when calling UploadSigningCertificate.
 * For more information, see Making Query Requests in Using AWS Identity
 * and Access Management.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#uploadSigningCertificate(UploadSigningCertificateRequest)
 */
public class UploadSigningCertificateRequest extends AmazonWebServiceRequest {

    /**
     * Name of the User the signing certificate is for.
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
     * Name of the User the signing certificate is for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the User the signing certificate is for.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the User the signing certificate is for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User the signing certificate is for.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the User the signing certificate is for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User the signing certificate is for.
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
        sb.append("UserName: " + userName + ", ");
        sb.append("CertificateBody: " + certificateBody + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    