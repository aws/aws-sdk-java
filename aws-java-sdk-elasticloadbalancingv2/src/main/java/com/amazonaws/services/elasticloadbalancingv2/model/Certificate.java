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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about an SSL server certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/Certificate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Certificate implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * Indicates whether the certificate is the default certificate. Do not set <code>IsDefault</code> when specifying a
     * certificate as an input parameter.
     * </p>
     */
    private Boolean isDefault;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the certificate.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether the certificate is the default certificate. Do not set <code>IsDefault</code> when specifying a
     * certificate as an input parameter.
     * </p>
     * 
     * @param isDefault
     *        Indicates whether the certificate is the default certificate. Do not set <code>IsDefault</code> when
     *        specifying a certificate as an input parameter.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Indicates whether the certificate is the default certificate. Do not set <code>IsDefault</code> when specifying a
     * certificate as an input parameter.
     * </p>
     * 
     * @return Indicates whether the certificate is the default certificate. Do not set <code>IsDefault</code> when
     *         specifying a certificate as an input parameter.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Indicates whether the certificate is the default certificate. Do not set <code>IsDefault</code> when specifying a
     * certificate as an input parameter.
     * </p>
     * 
     * @param isDefault
     *        Indicates whether the certificate is the default certificate. Do not set <code>IsDefault</code> when
     *        specifying a certificate as an input parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Indicates whether the certificate is the default certificate. Do not set <code>IsDefault</code> when specifying a
     * certificate as an input parameter.
     * </p>
     * 
     * @return Indicates whether the certificate is the default certificate. Do not set <code>IsDefault</code> when
     *         specifying a certificate as an input parameter.
     */

    public Boolean isDefault() {
        return this.isDefault;
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Certificate == false)
            return false;
        Certificate other = (Certificate) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        return hashCode;
    }

    @Override
    public Certificate clone() {
        try {
            return (Certificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
