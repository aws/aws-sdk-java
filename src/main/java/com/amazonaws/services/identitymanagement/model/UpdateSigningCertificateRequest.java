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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateSigningCertificate(UpdateSigningCertificateRequest) UpdateSigningCertificate operation}.
 * <p>
 * Changes the status of the specified signing certificate from active to
 * disabled, or vice versa. This action can be used to disable a user's
 * signing certificate as part of a certificate rotation workflow.
 * </p>
 * <p>
 * If the <code>UserName</code> field is not specified, the UserName is
 * determined implicitly based on the AWS Access Key ID used to sign the
 * request. Because this action works for access keys under the account,
 * this API can be used to manage root credentials even if the account
 * has no associated users.
 * </p>
 * <p>
 * For information about rotating certificates, see Managing Keys and
 * Certificates in the <a href="http://aws.amazon.com/documentation/">
 * AWS Identity and Access Management User Guide </a> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateSigningCertificate(UpdateSigningCertificateRequest)
 */
public class UpdateSigningCertificateRequest extends AmazonWebServiceRequest {

    /**
     * Name of the user the signing certificate belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The ID of the signing certificate you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String certificateId;

    /**
     * The status you want to assign to the certificate. <code>Active</code>
     * means the certificate can be used for API calls to AWS, while
     * <code>Inactive</code> means the certificate cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String status;

    /**
     * Name of the user the signing certificate belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user the signing certificate belongs to.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user the signing certificate belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user the signing certificate belongs to.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user the signing certificate belongs to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user the signing certificate belongs to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateSigningCertificateRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    
    /**
     * The ID of the signing certificate you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return The ID of the signing certificate you want to update.
     */
    public String getCertificateId() {
        return certificateId;
    }
    
    /**
     * The ID of the signing certificate you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param certificateId The ID of the signing certificate you want to update.
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }
    
    /**
     * The ID of the signing certificate you want to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param certificateId The ID of the signing certificate you want to update.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateSigningCertificateRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    
    
    /**
     * The status you want to assign to the certificate. <code>Active</code>
     * means the certificate can be used for API calls to AWS, while
     * <code>Inactive</code> means the certificate cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return The status you want to assign to the certificate. <code>Active</code>
     *         means the certificate can be used for API calls to AWS, while
     *         <code>Inactive</code> means the certificate cannot be used.
     *
     * @see statusType
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status you want to assign to the certificate. <code>Active</code>
     * means the certificate can be used for API calls to AWS, while
     * <code>Inactive</code> means the certificate cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status you want to assign to the certificate. <code>Active</code>
     *         means the certificate can be used for API calls to AWS, while
     *         <code>Inactive</code> means the certificate cannot be used.
     *
     * @see statusType
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status you want to assign to the certificate. <code>Active</code>
     * means the certificate can be used for API calls to AWS, while
     * <code>Inactive</code> means the certificate cannot be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status you want to assign to the certificate. <code>Active</code>
     *         means the certificate can be used for API calls to AWS, while
     *         <code>Inactive</code> means the certificate cannot be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see statusType
     */
    public UpdateSigningCertificateRequest withStatus(String status) {
        this.status = status;
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
        sb.append("CertificateId: " + certificateId + ", ");
        sb.append("Status: " + status + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    