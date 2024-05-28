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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information describing the end of the validity period of the certificate. This parameter sets the “Not After” date
 * for the certificate. Certificate validity is the period of time during which a certificate is valid. Validity can be
 * expressed as an explicit date and time when the certificate expires, or as a span of time after issuance, stated in
 * days, months, or years. For more information, see Validity in RFC 5280. This value is unaffected when
 * ValidityNotBefore is also specified. For example, if Validity is set to 20 days in the future, the certificate will
 * expire 20 days from issuance time regardless of the ValidityNotBefore value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CertificateValidity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateValidity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Renewal period is the period of time before certificate expiration when a new certificate will be requested.
     * </p>
     */
    private ValidityPeriod renewalPeriod;
    /**
     * <p>
     * Information describing the end of the validity period of the certificate. This parameter sets the “Not After”
     * date for the certificate. Certificate validity is the period of time during which a certificate is valid.
     * Validity can be expressed as an explicit date and time when the certificate expires, or as a span of time after
     * issuance, stated in days, months, or years. For more information, see Validity in RFC 5280. This value is
     * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20 days in the future,
     * the certificate will expire 20 days from issuance time regardless of the ValidityNotBefore value.
     * </p>
     */
    private ValidityPeriod validityPeriod;

    /**
     * <p>
     * Renewal period is the period of time before certificate expiration when a new certificate will be requested.
     * </p>
     * 
     * @param renewalPeriod
     *        Renewal period is the period of time before certificate expiration when a new certificate will be
     *        requested.
     */

    public void setRenewalPeriod(ValidityPeriod renewalPeriod) {
        this.renewalPeriod = renewalPeriod;
    }

    /**
     * <p>
     * Renewal period is the period of time before certificate expiration when a new certificate will be requested.
     * </p>
     * 
     * @return Renewal period is the period of time before certificate expiration when a new certificate will be
     *         requested.
     */

    public ValidityPeriod getRenewalPeriod() {
        return this.renewalPeriod;
    }

    /**
     * <p>
     * Renewal period is the period of time before certificate expiration when a new certificate will be requested.
     * </p>
     * 
     * @param renewalPeriod
     *        Renewal period is the period of time before certificate expiration when a new certificate will be
     *        requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateValidity withRenewalPeriod(ValidityPeriod renewalPeriod) {
        setRenewalPeriod(renewalPeriod);
        return this;
    }

    /**
     * <p>
     * Information describing the end of the validity period of the certificate. This parameter sets the “Not After”
     * date for the certificate. Certificate validity is the period of time during which a certificate is valid.
     * Validity can be expressed as an explicit date and time when the certificate expires, or as a span of time after
     * issuance, stated in days, months, or years. For more information, see Validity in RFC 5280. This value is
     * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20 days in the future,
     * the certificate will expire 20 days from issuance time regardless of the ValidityNotBefore value.
     * </p>
     * 
     * @param validityPeriod
     *        Information describing the end of the validity period of the certificate. This parameter sets the “Not
     *        After” date for the certificate. Certificate validity is the period of time during which a certificate is
     *        valid. Validity can be expressed as an explicit date and time when the certificate expires, or as a span
     *        of time after issuance, stated in days, months, or years. For more information, see Validity in RFC 5280.
     *        This value is unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20
     *        days in the future, the certificate will expire 20 days from issuance time regardless of the
     *        ValidityNotBefore value.
     */

    public void setValidityPeriod(ValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * <p>
     * Information describing the end of the validity period of the certificate. This parameter sets the “Not After”
     * date for the certificate. Certificate validity is the period of time during which a certificate is valid.
     * Validity can be expressed as an explicit date and time when the certificate expires, or as a span of time after
     * issuance, stated in days, months, or years. For more information, see Validity in RFC 5280. This value is
     * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20 days in the future,
     * the certificate will expire 20 days from issuance time regardless of the ValidityNotBefore value.
     * </p>
     * 
     * @return Information describing the end of the validity period of the certificate. This parameter sets the “Not
     *         After” date for the certificate. Certificate validity is the period of time during which a certificate is
     *         valid. Validity can be expressed as an explicit date and time when the certificate expires, or as a span
     *         of time after issuance, stated in days, months, or years. For more information, see Validity in RFC 5280.
     *         This value is unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20
     *         days in the future, the certificate will expire 20 days from issuance time regardless of the
     *         ValidityNotBefore value.
     */

    public ValidityPeriod getValidityPeriod() {
        return this.validityPeriod;
    }

    /**
     * <p>
     * Information describing the end of the validity period of the certificate. This parameter sets the “Not After”
     * date for the certificate. Certificate validity is the period of time during which a certificate is valid.
     * Validity can be expressed as an explicit date and time when the certificate expires, or as a span of time after
     * issuance, stated in days, months, or years. For more information, see Validity in RFC 5280. This value is
     * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20 days in the future,
     * the certificate will expire 20 days from issuance time regardless of the ValidityNotBefore value.
     * </p>
     * 
     * @param validityPeriod
     *        Information describing the end of the validity period of the certificate. This parameter sets the “Not
     *        After” date for the certificate. Certificate validity is the period of time during which a certificate is
     *        valid. Validity can be expressed as an explicit date and time when the certificate expires, or as a span
     *        of time after issuance, stated in days, months, or years. For more information, see Validity in RFC 5280.
     *        This value is unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20
     *        days in the future, the certificate will expire 20 days from issuance time regardless of the
     *        ValidityNotBefore value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateValidity withValidityPeriod(ValidityPeriod validityPeriod) {
        setValidityPeriod(validityPeriod);
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
        if (getRenewalPeriod() != null)
            sb.append("RenewalPeriod: ").append(getRenewalPeriod()).append(",");
        if (getValidityPeriod() != null)
            sb.append("ValidityPeriod: ").append(getValidityPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateValidity == false)
            return false;
        CertificateValidity other = (CertificateValidity) obj;
        if (other.getRenewalPeriod() == null ^ this.getRenewalPeriod() == null)
            return false;
        if (other.getRenewalPeriod() != null && other.getRenewalPeriod().equals(this.getRenewalPeriod()) == false)
            return false;
        if (other.getValidityPeriod() == null ^ this.getValidityPeriod() == null)
            return false;
        if (other.getValidityPeriod() != null && other.getValidityPeriod().equals(this.getValidityPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRenewalPeriod() == null) ? 0 : getRenewalPeriod().hashCode());
        hashCode = prime * hashCode + ((getValidityPeriod() == null) ? 0 : getValidityPeriod().hashCode());
        return hashCode;
    }

    @Override
    public CertificateValidity clone() {
        try {
            return (CertificateValidity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.CertificateValidityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
