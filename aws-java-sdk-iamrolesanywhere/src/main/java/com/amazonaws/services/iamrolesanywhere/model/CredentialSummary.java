/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A record of a presented X509 credential to <a
 * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/CredentialSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CredentialSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the credential is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Indicates whether the <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation was successful.
     * </p>
     */
    private Boolean failed;
    /**
     * <p>
     * The fully qualified domain name of the issuing certificate for the presented end-entity certificate.
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was last used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     */
    private java.util.Date seenAt;
    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * The PEM-encoded data of the certificate.
     * </p>
     */
    private String x509CertificateData;

    /**
     * <p>
     * Indicates whether the credential is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the credential is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the credential is enabled.
     * </p>
     * 
     * @return Indicates whether the credential is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether the credential is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the credential is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CredentialSummary withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the credential is enabled.
     * </p>
     * 
     * @return Indicates whether the credential is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether the <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation was successful.
     * </p>
     * 
     * @param failed
     *        Indicates whether the <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation was successful.
     */

    public void setFailed(Boolean failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * Indicates whether the <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation was successful.
     * </p>
     * 
     * @return Indicates whether the <a
     *         href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *         >CreateSession</a> operation was successful.
     */

    public Boolean getFailed() {
        return this.failed;
    }

    /**
     * <p>
     * Indicates whether the <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation was successful.
     * </p>
     * 
     * @param failed
     *        Indicates whether the <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation was successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CredentialSummary withFailed(Boolean failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * Indicates whether the <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation was successful.
     * </p>
     * 
     * @return Indicates whether the <a
     *         href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *         >CreateSession</a> operation was successful.
     */

    public Boolean isFailed() {
        return this.failed;
    }

    /**
     * <p>
     * The fully qualified domain name of the issuing certificate for the presented end-entity certificate.
     * </p>
     * 
     * @param issuer
     *        The fully qualified domain name of the issuing certificate for the presented end-entity certificate.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The fully qualified domain name of the issuing certificate for the presented end-entity certificate.
     * </p>
     * 
     * @return The fully qualified domain name of the issuing certificate for the presented end-entity certificate.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The fully qualified domain name of the issuing certificate for the presented end-entity certificate.
     * </p>
     * 
     * @param issuer
     *        The fully qualified domain name of the issuing certificate for the presented end-entity certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CredentialSummary withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was last used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @param seenAt
     *        The ISO-8601 time stamp of when the certificate was last used in a <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation.
     */

    public void setSeenAt(java.util.Date seenAt) {
        this.seenAt = seenAt;
    }

    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was last used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @return The ISO-8601 time stamp of when the certificate was last used in a <a
     *         href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *         >CreateSession</a> operation.
     */

    public java.util.Date getSeenAt() {
        return this.seenAt;
    }

    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was last used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @param seenAt
     *        The ISO-8601 time stamp of when the certificate was last used in a <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CredentialSummary withSeenAt(java.util.Date seenAt) {
        setSeenAt(seenAt);
        return this;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @param serialNumber
     *        The serial number of the certificate.
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @return The serial number of the certificate.
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @param serialNumber
     *        The serial number of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CredentialSummary withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * The PEM-encoded data of the certificate.
     * </p>
     * 
     * @param x509CertificateData
     *        The PEM-encoded data of the certificate.
     */

    public void setX509CertificateData(String x509CertificateData) {
        this.x509CertificateData = x509CertificateData;
    }

    /**
     * <p>
     * The PEM-encoded data of the certificate.
     * </p>
     * 
     * @return The PEM-encoded data of the certificate.
     */

    public String getX509CertificateData() {
        return this.x509CertificateData;
    }

    /**
     * <p>
     * The PEM-encoded data of the certificate.
     * </p>
     * 
     * @param x509CertificateData
     *        The PEM-encoded data of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CredentialSummary withX509CertificateData(String x509CertificateData) {
        setX509CertificateData(x509CertificateData);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed()).append(",");
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getSeenAt() != null)
            sb.append("SeenAt: ").append(getSeenAt()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getX509CertificateData() != null)
            sb.append("X509CertificateData: ").append(getX509CertificateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CredentialSummary == false)
            return false;
        CredentialSummary other = (CredentialSummary) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getSeenAt() == null ^ this.getSeenAt() == null)
            return false;
        if (other.getSeenAt() != null && other.getSeenAt().equals(this.getSeenAt()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getX509CertificateData() == null ^ this.getX509CertificateData() == null)
            return false;
        if (other.getX509CertificateData() != null && other.getX509CertificateData().equals(this.getX509CertificateData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getSeenAt() == null) ? 0 : getSeenAt().hashCode());
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getX509CertificateData() == null) ? 0 : getX509CertificateData().hashCode());
        return hashCode;
    }

    @Override
    public CredentialSummary clone() {
        try {
            return (CredentialSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iamrolesanywhere.model.transform.CredentialSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
