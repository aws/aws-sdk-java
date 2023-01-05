/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CertificateSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The entity that issued the certificate.
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     */
    private java.util.Date notValidAfter;
    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     */
    private java.util.Date notValidBefore;
    /**
     * <p>
     * The entity the certificate belongs to.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * A hexadecimal identifier for the certificate.
     * </p>
     */
    private String thumbprint;

    /**
     * <p>
     * The entity that issued the certificate.
     * </p>
     * 
     * @param issuer
     *        The entity that issued the certificate.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The entity that issued the certificate.
     * </p>
     * 
     * @return The entity that issued the certificate.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The entity that issued the certificate.
     * </p>
     * 
     * @param issuer
     *        The entity that issued the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     * 
     * @param notValidAfter
     *        The certificate is not valid after this date.
     */

    public void setNotValidAfter(java.util.Date notValidAfter) {
        this.notValidAfter = notValidAfter;
    }

    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     * 
     * @return The certificate is not valid after this date.
     */

    public java.util.Date getNotValidAfter() {
        return this.notValidAfter;
    }

    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     * 
     * @param notValidAfter
     *        The certificate is not valid after this date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withNotValidAfter(java.util.Date notValidAfter) {
        setNotValidAfter(notValidAfter);
        return this;
    }

    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     * 
     * @param notValidBefore
     *        The certificate is not valid before this date.
     */

    public void setNotValidBefore(java.util.Date notValidBefore) {
        this.notValidBefore = notValidBefore;
    }

    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     * 
     * @return The certificate is not valid before this date.
     */

    public java.util.Date getNotValidBefore() {
        return this.notValidBefore;
    }

    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     * 
     * @param notValidBefore
     *        The certificate is not valid before this date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withNotValidBefore(java.util.Date notValidBefore) {
        setNotValidBefore(notValidBefore);
        return this;
    }

    /**
     * <p>
     * The entity the certificate belongs to.
     * </p>
     * 
     * @param subject
     *        The entity the certificate belongs to.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The entity the certificate belongs to.
     * </p>
     * 
     * @return The entity the certificate belongs to.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The entity the certificate belongs to.
     * </p>
     * 
     * @param subject
     *        The entity the certificate belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * A hexadecimal identifier for the certificate.
     * </p>
     * 
     * @param thumbprint
     *        A hexadecimal identifier for the certificate.
     */

    public void setThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
    }

    /**
     * <p>
     * A hexadecimal identifier for the certificate.
     * </p>
     * 
     * @return A hexadecimal identifier for the certificate.
     */

    public String getThumbprint() {
        return this.thumbprint;
    }

    /**
     * <p>
     * A hexadecimal identifier for the certificate.
     * </p>
     * 
     * @param thumbprint
     *        A hexadecimal identifier for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withThumbprint(String thumbprint) {
        setThumbprint(thumbprint);
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
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getNotValidAfter() != null)
            sb.append("NotValidAfter: ").append(getNotValidAfter()).append(",");
        if (getNotValidBefore() != null)
            sb.append("NotValidBefore: ").append(getNotValidBefore()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getThumbprint() != null)
            sb.append("Thumbprint: ").append(getThumbprint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateSummary == false)
            return false;
        CertificateSummary other = (CertificateSummary) obj;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getNotValidAfter() == null ^ this.getNotValidAfter() == null)
            return false;
        if (other.getNotValidAfter() != null && other.getNotValidAfter().equals(this.getNotValidAfter()) == false)
            return false;
        if (other.getNotValidBefore() == null ^ this.getNotValidBefore() == null)
            return false;
        if (other.getNotValidBefore() != null && other.getNotValidBefore().equals(this.getNotValidBefore()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getThumbprint() == null ^ this.getThumbprint() == null)
            return false;
        if (other.getThumbprint() != null && other.getThumbprint().equals(this.getThumbprint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getNotValidAfter() == null) ? 0 : getNotValidAfter().hashCode());
        hashCode = prime * hashCode + ((getNotValidBefore() == null) ? 0 : getNotValidBefore().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getThumbprint() == null) ? 0 : getThumbprint().hashCode());
        return hashCode;
    }

    @Override
    public CertificateSummary clone() {
        try {
            return (CertificateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.CertificateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
