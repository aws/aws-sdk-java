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
 * The SigningCertificate data type contains information about an X.509
 * signing certificate.
 * </p>
 * <p>
 * This data type is used as a response element in the actions
 * UploadSigningCertificate and ListSigningCertificates.
 * </p>
 */
public class SigningCertificate {

    /**
     * Name of the User the signing certificate is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The ID for the signing certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String certificateId;

    /**
     * The contents of the signing certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     */
    private String certificateBody;

    /**
     * The status of the signing certificate. <code>Active</code> means the
     * key is valid for API calls, while <code>Inactive</code> means it is
     * not.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String status;

    /**
     * The date when the signing certificate was uploaded.
     */
    private java.util.Date uploadDate;

    /**
     * Name of the User the signing certificate is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the User the signing certificate is associated with.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the User the signing certificate is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User the signing certificate is associated with.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the User the signing certificate is associated with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User the signing certificate is associated with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SigningCertificate withUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    
    /**
     * The ID for the signing certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return The ID for the signing certificate.
     */
    public String getCertificateId() {
        return certificateId;
    }
    
    /**
     * The ID for the signing certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param certificateId The ID for the signing certificate.
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }
    
    /**
     * The ID for the signing certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param certificateId The ID for the signing certificate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SigningCertificate withCertificateId(String certificateId) {
        this.certificateId = certificateId;
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
    public SigningCertificate withCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
        return this;
    }
    
    
    /**
     * The status of the signing certificate. <code>Active</code> means the
     * key is valid for API calls, while <code>Inactive</code> means it is
     * not.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return The status of the signing certificate. <code>Active</code> means the
     *         key is valid for API calls, while <code>Inactive</code> means it is
     *         not.
     *
     * @see statusType
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the signing certificate. <code>Active</code> means the
     * key is valid for API calls, while <code>Inactive</code> means it is
     * not.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status of the signing certificate. <code>Active</code> means the
     *         key is valid for API calls, while <code>Inactive</code> means it is
     *         not.
     *
     * @see statusType
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the signing certificate. <code>Active</code> means the
     * key is valid for API calls, while <code>Inactive</code> means it is
     * not.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status of the signing certificate. <code>Active</code> means the
     *         key is valid for API calls, while <code>Inactive</code> means it is
     *         not.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see statusType
     */
    public SigningCertificate withStatus(String status) {
        this.status = status;
        return this;
    }
    
    
    /**
     * The date when the signing certificate was uploaded.
     *
     * @return The date when the signing certificate was uploaded.
     */
    public java.util.Date getUploadDate() {
        return uploadDate;
    }
    
    /**
     * The date when the signing certificate was uploaded.
     *
     * @param uploadDate The date when the signing certificate was uploaded.
     */
    public void setUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
    }
    
    /**
     * The date when the signing certificate was uploaded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadDate The date when the signing certificate was uploaded.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SigningCertificate withUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
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
        sb.append("CertificateBody: " + certificateBody + ", ");
        sb.append("Status: " + status + ", ");
        sb.append("UploadDate: " + uploadDate + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    