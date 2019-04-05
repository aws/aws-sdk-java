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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteSigningCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSigningCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the user the signing certificate belongs to.
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
     * The ID of the signing certificate to delete.
     * </p>
     * <p>
     * The format of this parameter, as described by its <a href="http://wikipedia.org/wiki/regex">regex</a> pattern, is
     * a string of characters that can be upper- or lower-cased letters or digits.
     * </p>
     */
    private String certificateId;

    /**
     * Default constructor for DeleteSigningCertificateRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DeleteSigningCertificateRequest() {
    }

    /**
     * Constructs a new DeleteSigningCertificateRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param certificateId
     *        The ID of the signing certificate to delete.</p>
     *        <p>
     *        The format of this parameter, as described by its <a href="http://wikipedia.org/wiki/regex">regex</a>
     *        pattern, is a string of characters that can be upper- or lower-cased letters or digits.
     */
    public DeleteSigningCertificateRequest(String certificateId) {
        setCertificateId(certificateId);
    }

    /**
     * <p>
     * The name of the user the signing certificate belongs to.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the user the signing certificate belongs to.</p>
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
     * The name of the user the signing certificate belongs to.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @return The name of the user the signing certificate belongs to.</p>
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
     * The name of the user the signing certificate belongs to.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the user the signing certificate belongs to.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSigningCertificateRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The ID of the signing certificate to delete.
     * </p>
     * <p>
     * The format of this parameter, as described by its <a href="http://wikipedia.org/wiki/regex">regex</a> pattern, is
     * a string of characters that can be upper- or lower-cased letters or digits.
     * </p>
     * 
     * @param certificateId
     *        The ID of the signing certificate to delete.</p>
     *        <p>
     *        The format of this parameter, as described by its <a href="http://wikipedia.org/wiki/regex">regex</a>
     *        pattern, is a string of characters that can be upper- or lower-cased letters or digits.
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID of the signing certificate to delete.
     * </p>
     * <p>
     * The format of this parameter, as described by its <a href="http://wikipedia.org/wiki/regex">regex</a> pattern, is
     * a string of characters that can be upper- or lower-cased letters or digits.
     * </p>
     * 
     * @return The ID of the signing certificate to delete.</p>
     *         <p>
     *         The format of this parameter, as described by its <a href="http://wikipedia.org/wiki/regex">regex</a>
     *         pattern, is a string of characters that can be upper- or lower-cased letters or digits.
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The ID of the signing certificate to delete.
     * </p>
     * <p>
     * The format of this parameter, as described by its <a href="http://wikipedia.org/wiki/regex">regex</a> pattern, is
     * a string of characters that can be upper- or lower-cased letters or digits.
     * </p>
     * 
     * @param certificateId
     *        The ID of the signing certificate to delete.</p>
     *        <p>
     *        The format of this parameter, as described by its <a href="http://wikipedia.org/wiki/regex">regex</a>
     *        pattern, is a string of characters that can be upper- or lower-cased letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSigningCertificateRequest withCertificateId(String certificateId) {
        setCertificateId(certificateId);
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
            sb.append("CertificateId: ").append(getCertificateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSigningCertificateRequest == false)
            return false;
        DeleteSigningCertificateRequest other = (DeleteSigningCertificateRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSigningCertificateRequest clone() {
        return (DeleteSigningCertificateRequest) super.clone();
    }

}
