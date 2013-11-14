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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateSigningCertificate(UpdateSigningCertificateRequest) UpdateSigningCertificate operation}.
 * <p>
 * Changes the status of the specified signing certificate from active to disabled, or vice versa. This action can be used to disable a user's signing
 * certificate as part of a certificate rotation work flow.
 * </p>
 * <p>
 * If the <code>UserName</code> field is not specified, the UserName is determined implicitly based on the AWS access key ID used to sign the request.
 * Because this action works for access keys under the AWS account, this API can be used to manage root credentials even if the AWS account has no
 * associated users.
 * </p>
 * <p>
 * For information about rotating certificates, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?ManagingCredentials.html">
 * Managing Keys and Certificates </a> in <i>Using AWS Identity and Access Management</i> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateSigningCertificate(UpdateSigningCertificateRequest)
 */
public class UpdateSigningCertificateRequest extends AmazonWebServiceRequest implements Serializable {

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
     * Default constructor for a new UpdateSigningCertificateRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateSigningCertificateRequest() {}
    
    /**
     * Constructs a new UpdateSigningCertificateRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param certificateId The ID of the signing certificate you want to
     * update.
     * @param status The status you want to assign to the certificate.
     * <code>Active</code> means the certificate can be used for API calls to
     * AWS, while <code>Inactive</code> means the certificate cannot be used.
     */
    public UpdateSigningCertificateRequest(String certificateId, String status) {
        setCertificateId(certificateId);
        setStatus(status);
    }

    /**
     * Constructs a new UpdateSigningCertificateRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param certificateId The ID of the signing certificate you want to
     * update.
     * @param status The status you want to assign to the certificate.
     * <code>Active</code> means the certificate can be used for API calls to
     * AWS, while <code>Inactive</code> means the certificate cannot be used.
     */
    public UpdateSigningCertificateRequest(String certificateId, StatusType status) {
        this.certificateId = certificateId;
        this.status = status.toString();
    }

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
     * @see StatusType
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
     * @see StatusType
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
     * @see StatusType
     */
    public UpdateSigningCertificateRequest withStatus(String status) {
        this.status = status;
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
     * @param status The status you want to assign to the certificate. <code>Active</code>
     *         means the certificate can be used for API calls to AWS, while
     *         <code>Inactive</code> means the certificate cannot be used.
     *
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
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
     * @see StatusType
     */
    public UpdateSigningCertificateRequest withStatus(StatusType status) {
        this.status = status.toString();
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
        if (getCertificateId() != null) sb.append("CertificateId: " + getCertificateId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateSigningCertificateRequest == false) return false;
        UpdateSigningCertificateRequest other = (UpdateSigningCertificateRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getCertificateId() == null ^ this.getCertificateId() == null) return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    