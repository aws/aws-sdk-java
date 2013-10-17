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
 * The SigningCertificate data type contains information about an X.509 signing certificate.
 * </p>
 * <p>
 * This data type is used as a response element in the actions UploadSigningCertificate and ListSigningCertificates.
 * </p>
 */
public class SigningCertificate implements Serializable {

    /**
     * Name of the user the signing certificate is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
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
     * Default constructor for a new SigningCertificate object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SigningCertificate() {}
    
    /**
     * Constructs a new SigningCertificate object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName Name of the user the signing certificate is associated
     * with.
     * @param certificateId The ID for the signing certificate.
     * @param certificateBody The contents of the signing certificate.
     * @param status The status of the signing certificate.
     * <code>Active</code> means the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     */
    public SigningCertificate(String userName, String certificateId, String certificateBody, String status) {
        setUserName(userName);
        setCertificateId(certificateId);
        setCertificateBody(certificateBody);
        setStatus(status);
    }

    /**
     * Constructs a new SigningCertificate object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName Name of the user the signing certificate is associated
     * with.
     * @param certificateId The ID for the signing certificate.
     * @param certificateBody The contents of the signing certificate.
     * @param status The status of the signing certificate.
     * <code>Active</code> means the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     */
    public SigningCertificate(String userName, String certificateId, String certificateBody, StatusType status) {
        this.userName = userName;
        this.certificateId = certificateId;
        this.certificateBody = certificateBody;
        this.status = status.toString();
    }

    /**
     * Name of the user the signing certificate is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user the signing certificate is associated with.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user the signing certificate is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user the signing certificate is associated with.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user the signing certificate is associated with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user the signing certificate is associated with.
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
     * @see StatusType
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
     * @see StatusType
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
     * @see StatusType
     */
    public SigningCertificate withStatus(String status) {
        this.status = status;
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
     * @param status The status of the signing certificate. <code>Active</code> means the
     *         key is valid for API calls, while <code>Inactive</code> means it is
     *         not.
     *
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
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
     * @see StatusType
     */
    public SigningCertificate withStatus(StatusType status) {
        this.status = status.toString();
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
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getCertificateId() != null) sb.append("CertificateId: " + getCertificateId() + ",");
        if (getCertificateBody() != null) sb.append("CertificateBody: " + getCertificateBody() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getUploadDate() != null) sb.append("UploadDate: " + getUploadDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode()); 
        hashCode = prime * hashCode + ((getCertificateBody() == null) ? 0 : getCertificateBody().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getUploadDate() == null) ? 0 : getUploadDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SigningCertificate == false) return false;
        SigningCertificate other = (SigningCertificate)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getCertificateId() == null ^ this.getCertificateId() == null) return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false) return false; 
        if (other.getCertificateBody() == null ^ this.getCertificateBody() == null) return false;
        if (other.getCertificateBody() != null && other.getCertificateBody().equals(this.getCertificateBody()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getUploadDate() == null ^ this.getUploadDate() == null) return false;
        if (other.getUploadDate() != null && other.getUploadDate().equals(this.getUploadDate()) == false) return false; 
        return true;
    }
    
}
    