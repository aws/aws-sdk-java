/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the certificate extensions to be added to the certificate signing request (CSR).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CsrExtensions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CsrExtensions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the purpose of the certificate and of the key contained in the certificate.
     * </p>
     */
    private KeyUsage keyUsage;
    /**
     * <p>
     * For CA certificates, provides a path to additional information pertaining to the CA, such as revocation and
     * policy. For more information, see <a href="https://tools.ietf.org/html/rfc5280#section-4.2.2.2">Subject
     * Information Access</a> in RFC 5280.
     * </p>
     */
    private java.util.List<AccessDescription> subjectInformationAccess;

    /**
     * <p>
     * Indicates the purpose of the certificate and of the key contained in the certificate.
     * </p>
     * 
     * @param keyUsage
     *        Indicates the purpose of the certificate and of the key contained in the certificate.
     */

    public void setKeyUsage(KeyUsage keyUsage) {
        this.keyUsage = keyUsage;
    }

    /**
     * <p>
     * Indicates the purpose of the certificate and of the key contained in the certificate.
     * </p>
     * 
     * @return Indicates the purpose of the certificate and of the key contained in the certificate.
     */

    public KeyUsage getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * <p>
     * Indicates the purpose of the certificate and of the key contained in the certificate.
     * </p>
     * 
     * @param keyUsage
     *        Indicates the purpose of the certificate and of the key contained in the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsrExtensions withKeyUsage(KeyUsage keyUsage) {
        setKeyUsage(keyUsage);
        return this;
    }

    /**
     * <p>
     * For CA certificates, provides a path to additional information pertaining to the CA, such as revocation and
     * policy. For more information, see <a href="https://tools.ietf.org/html/rfc5280#section-4.2.2.2">Subject
     * Information Access</a> in RFC 5280.
     * </p>
     * 
     * @return For CA certificates, provides a path to additional information pertaining to the CA, such as revocation
     *         and policy. For more information, see <a
     *         href="https://tools.ietf.org/html/rfc5280#section-4.2.2.2">Subject Information Access</a> in RFC 5280.
     */

    public java.util.List<AccessDescription> getSubjectInformationAccess() {
        return subjectInformationAccess;
    }

    /**
     * <p>
     * For CA certificates, provides a path to additional information pertaining to the CA, such as revocation and
     * policy. For more information, see <a href="https://tools.ietf.org/html/rfc5280#section-4.2.2.2">Subject
     * Information Access</a> in RFC 5280.
     * </p>
     * 
     * @param subjectInformationAccess
     *        For CA certificates, provides a path to additional information pertaining to the CA, such as revocation
     *        and policy. For more information, see <a
     *        href="https://tools.ietf.org/html/rfc5280#section-4.2.2.2">Subject Information Access</a> in RFC 5280.
     */

    public void setSubjectInformationAccess(java.util.Collection<AccessDescription> subjectInformationAccess) {
        if (subjectInformationAccess == null) {
            this.subjectInformationAccess = null;
            return;
        }

        this.subjectInformationAccess = new java.util.ArrayList<AccessDescription>(subjectInformationAccess);
    }

    /**
     * <p>
     * For CA certificates, provides a path to additional information pertaining to the CA, such as revocation and
     * policy. For more information, see <a href="https://tools.ietf.org/html/rfc5280#section-4.2.2.2">Subject
     * Information Access</a> in RFC 5280.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubjectInformationAccess(java.util.Collection)} or
     * {@link #withSubjectInformationAccess(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param subjectInformationAccess
     *        For CA certificates, provides a path to additional information pertaining to the CA, such as revocation
     *        and policy. For more information, see <a
     *        href="https://tools.ietf.org/html/rfc5280#section-4.2.2.2">Subject Information Access</a> in RFC 5280.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsrExtensions withSubjectInformationAccess(AccessDescription... subjectInformationAccess) {
        if (this.subjectInformationAccess == null) {
            setSubjectInformationAccess(new java.util.ArrayList<AccessDescription>(subjectInformationAccess.length));
        }
        for (AccessDescription ele : subjectInformationAccess) {
            this.subjectInformationAccess.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For CA certificates, provides a path to additional information pertaining to the CA, such as revocation and
     * policy. For more information, see <a href="https://tools.ietf.org/html/rfc5280#section-4.2.2.2">Subject
     * Information Access</a> in RFC 5280.
     * </p>
     * 
     * @param subjectInformationAccess
     *        For CA certificates, provides a path to additional information pertaining to the CA, such as revocation
     *        and policy. For more information, see <a
     *        href="https://tools.ietf.org/html/rfc5280#section-4.2.2.2">Subject Information Access</a> in RFC 5280.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsrExtensions withSubjectInformationAccess(java.util.Collection<AccessDescription> subjectInformationAccess) {
        setSubjectInformationAccess(subjectInformationAccess);
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
        if (getKeyUsage() != null)
            sb.append("KeyUsage: ").append(getKeyUsage()).append(",");
        if (getSubjectInformationAccess() != null)
            sb.append("SubjectInformationAccess: ").append(getSubjectInformationAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CsrExtensions == false)
            return false;
        CsrExtensions other = (CsrExtensions) obj;
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null)
            return false;
        if (other.getKeyUsage() != null && other.getKeyUsage().equals(this.getKeyUsage()) == false)
            return false;
        if (other.getSubjectInformationAccess() == null ^ this.getSubjectInformationAccess() == null)
            return false;
        if (other.getSubjectInformationAccess() != null && other.getSubjectInformationAccess().equals(this.getSubjectInformationAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        hashCode = prime * hashCode + ((getSubjectInformationAccess() == null) ? 0 : getSubjectInformationAccess().hashCode());
        return hashCode;
    }

    @Override
    public CsrExtensions clone() {
        try {
            return (CsrExtensions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.CsrExtensionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
