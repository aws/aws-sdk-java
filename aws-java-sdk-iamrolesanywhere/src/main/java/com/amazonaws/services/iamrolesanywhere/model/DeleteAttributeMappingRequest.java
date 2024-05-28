/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteAttributeMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAttributeMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * </p>
     */
    private String certificateField;
    /**
     * <p>
     * The unique identifier of the profile.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * A list of specifiers of a certificate field; for example, CN, OU, UID from a Subject.
     * </p>
     */
    private java.util.List<String> specifiers;

    /**
     * <p>
     * Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * </p>
     * 
     * @param certificateField
     *        Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * @see CertificateField
     */

    public void setCertificateField(String certificateField) {
        this.certificateField = certificateField;
    }

    /**
     * <p>
     * Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * </p>
     * 
     * @return Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * @see CertificateField
     */

    public String getCertificateField() {
        return this.certificateField;
    }

    /**
     * <p>
     * Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * </p>
     * 
     * @param certificateField
     *        Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateField
     */

    public DeleteAttributeMappingRequest withCertificateField(String certificateField) {
        setCertificateField(certificateField);
        return this;
    }

    /**
     * <p>
     * Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * </p>
     * 
     * @param certificateField
     *        Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateField
     */

    public DeleteAttributeMappingRequest withCertificateField(CertificateField certificateField) {
        this.certificateField = certificateField.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the profile.
     * </p>
     * 
     * @param profileId
     *        The unique identifier of the profile.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * The unique identifier of the profile.
     * </p>
     * 
     * @return The unique identifier of the profile.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * The unique identifier of the profile.
     * </p>
     * 
     * @param profileId
     *        The unique identifier of the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAttributeMappingRequest withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * A list of specifiers of a certificate field; for example, CN, OU, UID from a Subject.
     * </p>
     * 
     * @return A list of specifiers of a certificate field; for example, CN, OU, UID from a Subject.
     */

    public java.util.List<String> getSpecifiers() {
        return specifiers;
    }

    /**
     * <p>
     * A list of specifiers of a certificate field; for example, CN, OU, UID from a Subject.
     * </p>
     * 
     * @param specifiers
     *        A list of specifiers of a certificate field; for example, CN, OU, UID from a Subject.
     */

    public void setSpecifiers(java.util.Collection<String> specifiers) {
        if (specifiers == null) {
            this.specifiers = null;
            return;
        }

        this.specifiers = new java.util.ArrayList<String>(specifiers);
    }

    /**
     * <p>
     * A list of specifiers of a certificate field; for example, CN, OU, UID from a Subject.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpecifiers(java.util.Collection)} or {@link #withSpecifiers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param specifiers
     *        A list of specifiers of a certificate field; for example, CN, OU, UID from a Subject.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAttributeMappingRequest withSpecifiers(String... specifiers) {
        if (this.specifiers == null) {
            setSpecifiers(new java.util.ArrayList<String>(specifiers.length));
        }
        for (String ele : specifiers) {
            this.specifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of specifiers of a certificate field; for example, CN, OU, UID from a Subject.
     * </p>
     * 
     * @param specifiers
     *        A list of specifiers of a certificate field; for example, CN, OU, UID from a Subject.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAttributeMappingRequest withSpecifiers(java.util.Collection<String> specifiers) {
        setSpecifiers(specifiers);
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
        if (getCertificateField() != null)
            sb.append("CertificateField: ").append(getCertificateField()).append(",");
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getSpecifiers() != null)
            sb.append("Specifiers: ").append(getSpecifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAttributeMappingRequest == false)
            return false;
        DeleteAttributeMappingRequest other = (DeleteAttributeMappingRequest) obj;
        if (other.getCertificateField() == null ^ this.getCertificateField() == null)
            return false;
        if (other.getCertificateField() != null && other.getCertificateField().equals(this.getCertificateField()) == false)
            return false;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getSpecifiers() == null ^ this.getSpecifiers() == null)
            return false;
        if (other.getSpecifiers() != null && other.getSpecifiers().equals(this.getSpecifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateField() == null) ? 0 : getCertificateField().hashCode());
        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getSpecifiers() == null) ? 0 : getSpecifiers().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAttributeMappingRequest clone() {
        return (DeleteAttributeMappingRequest) super.clone();
    }

}
