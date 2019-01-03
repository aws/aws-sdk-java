/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about an X.509 signing certificate.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>UploadSigningCertificate</a> and
 * <a>ListSigningCertificates</a> operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/SigningCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SigningCertificate implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the user the signing certificate is associated with.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The ID for the signing certificate.
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * The contents of the signing certificate.
     * </p>
     */
    private String certificateBody;
    /**
     * <p>
     * The status of the signing certificate. <code>Active</code> means that the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date when the signing certificate was uploaded.
     * </p>
     */
    private java.util.Date uploadDate;

    /**
     * Default constructor for SigningCertificate object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public SigningCertificate() {
    }

    /**
     * Constructs a new SigningCertificate object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName
     *        The name of the user the signing certificate is associated with.
     * @param certificateId
     *        The ID for the signing certificate.
     * @param certificateBody
     *        The contents of the signing certificate.
     * @param status
     *        The status of the signing certificate. <code>Active</code> means that the key is valid for API calls,
     *        while <code>Inactive</code> means it is not.
     */
    public SigningCertificate(String userName, String certificateId, String certificateBody, String status) {
        setUserName(userName);
        setCertificateId(certificateId);
        setCertificateBody(certificateBody);
        setStatus(status);
    }

    /**
     * Constructs a new SigningCertificate object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName
     *        The name of the user the signing certificate is associated with.
     * @param certificateId
     *        The ID for the signing certificate.
     * @param certificateBody
     *        The contents of the signing certificate.
     * @param status
     *        The status of the signing certificate. <code>Active</code> means that the key is valid for API calls,
     *        while <code>Inactive</code> means it is not.
     */
    public SigningCertificate(String userName, String certificateId, String certificateBody, StatusType status) {
        setUserName(userName);
        setCertificateId(certificateId);
        setCertificateBody(certificateBody);
        setStatus(status.toString());
    }

    /**
     * <p>
     * The name of the user the signing certificate is associated with.
     * </p>
     * 
     * @param userName
     *        The name of the user the signing certificate is associated with.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user the signing certificate is associated with.
     * </p>
     * 
     * @return The name of the user the signing certificate is associated with.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user the signing certificate is associated with.
     * </p>
     * 
     * @param userName
     *        The name of the user the signing certificate is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningCertificate withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The ID for the signing certificate.
     * </p>
     * 
     * @param certificateId
     *        The ID for the signing certificate.
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID for the signing certificate.
     * </p>
     * 
     * @return The ID for the signing certificate.
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The ID for the signing certificate.
     * </p>
     * 
     * @param certificateId
     *        The ID for the signing certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningCertificate withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * The contents of the signing certificate.
     * </p>
     * 
     * @param certificateBody
     *        The contents of the signing certificate.
     */

    public void setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
    }

    /**
     * <p>
     * The contents of the signing certificate.
     * </p>
     * 
     * @return The contents of the signing certificate.
     */

    public String getCertificateBody() {
        return this.certificateBody;
    }

    /**
     * <p>
     * The contents of the signing certificate.
     * </p>
     * 
     * @param certificateBody
     *        The contents of the signing certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningCertificate withCertificateBody(String certificateBody) {
        setCertificateBody(certificateBody);
        return this;
    }

    /**
     * <p>
     * The status of the signing certificate. <code>Active</code> means that the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the signing certificate. <code>Active</code> means that the key is valid for API calls,
     *        while <code>Inactive</code> means it is not.
     * @see StatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the signing certificate. <code>Active</code> means that the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @return The status of the signing certificate. <code>Active</code> means that the key is valid for API calls,
     *         while <code>Inactive</code> means it is not.
     * @see StatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the signing certificate. <code>Active</code> means that the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the signing certificate. <code>Active</code> means that the key is valid for API calls,
     *        while <code>Inactive</code> means it is not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public SigningCertificate withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the signing certificate. <code>Active</code> means that the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the signing certificate. <code>Active</code> means that the key is valid for API calls,
     *        while <code>Inactive</code> means it is not.
     * @see StatusType
     */

    public void setStatus(StatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the signing certificate. <code>Active</code> means that the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the signing certificate. <code>Active</code> means that the key is valid for API calls,
     *        while <code>Inactive</code> means it is not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public SigningCertificate withStatus(StatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date when the signing certificate was uploaded.
     * </p>
     * 
     * @param uploadDate
     *        The date when the signing certificate was uploaded.
     */

    public void setUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * <p>
     * The date when the signing certificate was uploaded.
     * </p>
     * 
     * @return The date when the signing certificate was uploaded.
     */

    public java.util.Date getUploadDate() {
        return this.uploadDate;
    }

    /**
     * <p>
     * The date when the signing certificate was uploaded.
     * </p>
     * 
     * @param uploadDate
     *        The date when the signing certificate was uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningCertificate withUploadDate(java.util.Date uploadDate) {
        setUploadDate(uploadDate);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getCertificateId() != null)
            sb.append("CertificateId: ").append(getCertificateId()).append(",");
        if (getCertificateBody() != null)
            sb.append("CertificateBody: ").append(getCertificateBody()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUploadDate() != null)
            sb.append("UploadDate: ").append(getUploadDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SigningCertificate == false)
            return false;
        SigningCertificate other = (SigningCertificate) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getCertificateBody() == null ^ this.getCertificateBody() == null)
            return false;
        if (other.getCertificateBody() != null && other.getCertificateBody().equals(this.getCertificateBody()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUploadDate() == null ^ this.getUploadDate() == null)
            return false;
        if (other.getUploadDate() != null && other.getUploadDate().equals(this.getUploadDate()) == false)
            return false;
        return true;
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
    public SigningCertificate clone() {
        try {
            return (SigningCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
