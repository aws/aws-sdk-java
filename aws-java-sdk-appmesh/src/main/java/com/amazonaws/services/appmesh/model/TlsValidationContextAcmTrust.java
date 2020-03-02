/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a TLS validation context trust for an AWS Certicate Manager (ACM) certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/TlsValidationContextAcmTrust"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TlsValidationContextAcmTrust implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more ACM Amazon Resource Name (ARN)s.
     * </p>
     */
    private java.util.List<String> certificateAuthorityArns;

    /**
     * <p>
     * One or more ACM Amazon Resource Name (ARN)s.
     * </p>
     * 
     * @return One or more ACM Amazon Resource Name (ARN)s.
     */

    public java.util.List<String> getCertificateAuthorityArns() {
        return certificateAuthorityArns;
    }

    /**
     * <p>
     * One or more ACM Amazon Resource Name (ARN)s.
     * </p>
     * 
     * @param certificateAuthorityArns
     *        One or more ACM Amazon Resource Name (ARN)s.
     */

    public void setCertificateAuthorityArns(java.util.Collection<String> certificateAuthorityArns) {
        if (certificateAuthorityArns == null) {
            this.certificateAuthorityArns = null;
            return;
        }

        this.certificateAuthorityArns = new java.util.ArrayList<String>(certificateAuthorityArns);
    }

    /**
     * <p>
     * One or more ACM Amazon Resource Name (ARN)s.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateAuthorityArns(java.util.Collection)} or
     * {@link #withCertificateAuthorityArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param certificateAuthorityArns
     *        One or more ACM Amazon Resource Name (ARN)s.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TlsValidationContextAcmTrust withCertificateAuthorityArns(String... certificateAuthorityArns) {
        if (this.certificateAuthorityArns == null) {
            setCertificateAuthorityArns(new java.util.ArrayList<String>(certificateAuthorityArns.length));
        }
        for (String ele : certificateAuthorityArns) {
            this.certificateAuthorityArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more ACM Amazon Resource Name (ARN)s.
     * </p>
     * 
     * @param certificateAuthorityArns
     *        One or more ACM Amazon Resource Name (ARN)s.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TlsValidationContextAcmTrust withCertificateAuthorityArns(java.util.Collection<String> certificateAuthorityArns) {
        setCertificateAuthorityArns(certificateAuthorityArns);
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
        if (getCertificateAuthorityArns() != null)
            sb.append("CertificateAuthorityArns: ").append(getCertificateAuthorityArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TlsValidationContextAcmTrust == false)
            return false;
        TlsValidationContextAcmTrust other = (TlsValidationContextAcmTrust) obj;
        if (other.getCertificateAuthorityArns() == null ^ this.getCertificateAuthorityArns() == null)
            return false;
        if (other.getCertificateAuthorityArns() != null && other.getCertificateAuthorityArns().equals(this.getCertificateAuthorityArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityArns() == null) ? 0 : getCertificateAuthorityArns().hashCode());
        return hashCode;
    }

    @Override
    public TlsValidationContextAcmTrust clone() {
        try {
            return (TlsValidationContextAcmTrust) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.TlsValidationContextAcmTrustMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
