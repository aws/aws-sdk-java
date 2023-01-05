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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The certificate issuer indentifier.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IssuerCertificateIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subject of the issuer certificate.
     * </p>
     */
    private String issuerCertificateSubject;
    /**
     * <p>
     * The issuer ID.
     * </p>
     */
    private String issuerId;
    /**
     * <p>
     * The issuer certificate serial number.
     * </p>
     */
    private String issuerCertificateSerialNumber;

    /**
     * <p>
     * The subject of the issuer certificate.
     * </p>
     * 
     * @param issuerCertificateSubject
     *        The subject of the issuer certificate.
     */

    public void setIssuerCertificateSubject(String issuerCertificateSubject) {
        this.issuerCertificateSubject = issuerCertificateSubject;
    }

    /**
     * <p>
     * The subject of the issuer certificate.
     * </p>
     * 
     * @return The subject of the issuer certificate.
     */

    public String getIssuerCertificateSubject() {
        return this.issuerCertificateSubject;
    }

    /**
     * <p>
     * The subject of the issuer certificate.
     * </p>
     * 
     * @param issuerCertificateSubject
     *        The subject of the issuer certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssuerCertificateIdentifier withIssuerCertificateSubject(String issuerCertificateSubject) {
        setIssuerCertificateSubject(issuerCertificateSubject);
        return this;
    }

    /**
     * <p>
     * The issuer ID.
     * </p>
     * 
     * @param issuerId
     *        The issuer ID.
     */

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    /**
     * <p>
     * The issuer ID.
     * </p>
     * 
     * @return The issuer ID.
     */

    public String getIssuerId() {
        return this.issuerId;
    }

    /**
     * <p>
     * The issuer ID.
     * </p>
     * 
     * @param issuerId
     *        The issuer ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssuerCertificateIdentifier withIssuerId(String issuerId) {
        setIssuerId(issuerId);
        return this;
    }

    /**
     * <p>
     * The issuer certificate serial number.
     * </p>
     * 
     * @param issuerCertificateSerialNumber
     *        The issuer certificate serial number.
     */

    public void setIssuerCertificateSerialNumber(String issuerCertificateSerialNumber) {
        this.issuerCertificateSerialNumber = issuerCertificateSerialNumber;
    }

    /**
     * <p>
     * The issuer certificate serial number.
     * </p>
     * 
     * @return The issuer certificate serial number.
     */

    public String getIssuerCertificateSerialNumber() {
        return this.issuerCertificateSerialNumber;
    }

    /**
     * <p>
     * The issuer certificate serial number.
     * </p>
     * 
     * @param issuerCertificateSerialNumber
     *        The issuer certificate serial number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssuerCertificateIdentifier withIssuerCertificateSerialNumber(String issuerCertificateSerialNumber) {
        setIssuerCertificateSerialNumber(issuerCertificateSerialNumber);
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
        if (getIssuerCertificateSubject() != null)
            sb.append("IssuerCertificateSubject: ").append(getIssuerCertificateSubject()).append(",");
        if (getIssuerId() != null)
            sb.append("IssuerId: ").append(getIssuerId()).append(",");
        if (getIssuerCertificateSerialNumber() != null)
            sb.append("IssuerCertificateSerialNumber: ").append(getIssuerCertificateSerialNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IssuerCertificateIdentifier == false)
            return false;
        IssuerCertificateIdentifier other = (IssuerCertificateIdentifier) obj;
        if (other.getIssuerCertificateSubject() == null ^ this.getIssuerCertificateSubject() == null)
            return false;
        if (other.getIssuerCertificateSubject() != null && other.getIssuerCertificateSubject().equals(this.getIssuerCertificateSubject()) == false)
            return false;
        if (other.getIssuerId() == null ^ this.getIssuerId() == null)
            return false;
        if (other.getIssuerId() != null && other.getIssuerId().equals(this.getIssuerId()) == false)
            return false;
        if (other.getIssuerCertificateSerialNumber() == null ^ this.getIssuerCertificateSerialNumber() == null)
            return false;
        if (other.getIssuerCertificateSerialNumber() != null
                && other.getIssuerCertificateSerialNumber().equals(this.getIssuerCertificateSerialNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIssuerCertificateSubject() == null) ? 0 : getIssuerCertificateSubject().hashCode());
        hashCode = prime * hashCode + ((getIssuerId() == null) ? 0 : getIssuerId().hashCode());
        hashCode = prime * hashCode + ((getIssuerCertificateSerialNumber() == null) ? 0 : getIssuerCertificateSerialNumber().hashCode());
        return hashCode;
    }

    @Override
    public IssuerCertificateIdentifier clone() {
        try {
            return (IssuerCertificateIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.IssuerCertificateIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
