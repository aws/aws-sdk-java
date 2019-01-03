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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateSigningCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSigningCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the IAM user the signing certificate belongs to.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The ID of the signing certificate you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * The status you want to assign to the certificate. <code>Active</code> means that the certificate can be used for
     * API calls to AWS <code>Inactive</code> means that the certificate cannot be used.
     * </p>
     */
    private String status;

    /**
     * Default constructor for UpdateSigningCertificateRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public UpdateSigningCertificateRequest() {
    }

    /**
     * Constructs a new UpdateSigningCertificateRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param certificateId
     *        The ID of the signing certificate you want to update.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     * @param status
     *        The status you want to assign to the certificate. <code>Active</code> means that the certificate can be
     *        used for API calls to AWS <code>Inactive</code> means that the certificate cannot be used.
     */
    public UpdateSigningCertificateRequest(String certificateId, String status) {
        setCertificateId(certificateId);
        setStatus(status);
    }

    /**
     * Constructs a new UpdateSigningCertificateRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param certificateId
     *        The ID of the signing certificate you want to update.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     * @param status
     *        The status you want to assign to the certificate. <code>Active</code> means that the certificate can be
     *        used for API calls to AWS <code>Inactive</code> means that the certificate cannot be used.
     */
    public UpdateSigningCertificateRequest(String certificateId, StatusType status) {
        setCertificateId(certificateId);
        setStatus(status.toString());
    }

    /**
     * <p>
     * The name of the IAM user the signing certificate belongs to.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the IAM user the signing certificate belongs to.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user the signing certificate belongs to.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @return The name of the IAM user the signing certificate belongs to.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: _+=,.@-
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the IAM user the signing certificate belongs to.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the IAM user the signing certificate belongs to.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSigningCertificateRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The ID of the signing certificate you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @param certificateId
     *        The ID of the signing certificate you want to update.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID of the signing certificate you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @return The ID of the signing certificate you want to update.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters that can consist of any upper or lowercased letter or digit.
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The ID of the signing certificate you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @param certificateId
     *        The ID of the signing certificate you want to update.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSigningCertificateRequest withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * The status you want to assign to the certificate. <code>Active</code> means that the certificate can be used for
     * API calls to AWS <code>Inactive</code> means that the certificate cannot be used.
     * </p>
     * 
     * @param status
     *        The status you want to assign to the certificate. <code>Active</code> means that the certificate can be
     *        used for API calls to AWS <code>Inactive</code> means that the certificate cannot be used.
     * @see StatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status you want to assign to the certificate. <code>Active</code> means that the certificate can be used for
     * API calls to AWS <code>Inactive</code> means that the certificate cannot be used.
     * </p>
     * 
     * @return The status you want to assign to the certificate. <code>Active</code> means that the certificate can be
     *         used for API calls to AWS <code>Inactive</code> means that the certificate cannot be used.
     * @see StatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status you want to assign to the certificate. <code>Active</code> means that the certificate can be used for
     * API calls to AWS <code>Inactive</code> means that the certificate cannot be used.
     * </p>
     * 
     * @param status
     *        The status you want to assign to the certificate. <code>Active</code> means that the certificate can be
     *        used for API calls to AWS <code>Inactive</code> means that the certificate cannot be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public UpdateSigningCertificateRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status you want to assign to the certificate. <code>Active</code> means that the certificate can be used for
     * API calls to AWS <code>Inactive</code> means that the certificate cannot be used.
     * </p>
     * 
     * @param status
     *        The status you want to assign to the certificate. <code>Active</code> means that the certificate can be
     *        used for API calls to AWS <code>Inactive</code> means that the certificate cannot be used.
     * @see StatusType
     */

    public void setStatus(StatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status you want to assign to the certificate. <code>Active</code> means that the certificate can be used for
     * API calls to AWS <code>Inactive</code> means that the certificate cannot be used.
     * </p>
     * 
     * @param status
     *        The status you want to assign to the certificate. <code>Active</code> means that the certificate can be
     *        used for API calls to AWS <code>Inactive</code> means that the certificate cannot be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public UpdateSigningCertificateRequest withStatus(StatusType status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSigningCertificateRequest == false)
            return false;
        UpdateSigningCertificateRequest other = (UpdateSigningCertificateRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
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
    public UpdateSigningCertificateRequest clone() {
        return (UpdateSigningCertificateRequest) super.clone();
    }

}
