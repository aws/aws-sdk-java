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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the status of a SSL/TLS certificate renewal managed by Amazon Lightsail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RenewalSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RenewalSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of objects that describe the domain validation records of the certificate.
     * </p>
     */
    private java.util.List<DomainValidationRecord> domainValidationRecords;
    /**
     * <p>
     * The renewal status of the certificate.
     * </p>
     * <p>
     * The following renewal status are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PendingAutoRenewal</code> </b> - Lightsail is attempting to automatically validate the domain names of
     * the certificate. No further action is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PendingValidation</code> </b> - Lightsail couldn't automatically validate one or more domain names of
     * the certificate. You must take action to validate these domain names or the certificate won't be renewed. Check
     * to make sure your certificate's domain validation records exist in your domain's DNS, and that your certificate
     * remains in use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Success</code> </b> - All domain names in the certificate are validated, and Lightsail renewed the
     * certificate. No further action is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Failed</code> </b> - One or more domain names were not validated before the certificate expired, and
     * Lightsail did not renew the certificate. You can request a new certificate using the
     * <code>CreateCertificate</code> action.
     * </p>
     * </li>
     * </ul>
     */
    private String renewalStatus;
    /**
     * <p>
     * The reason for the renewal status of the certificate.
     * </p>
     */
    private String renewalStatusReason;
    /**
     * <p>
     * The timestamp when the certificate was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * An array of objects that describe the domain validation records of the certificate.
     * </p>
     * 
     * @return An array of objects that describe the domain validation records of the certificate.
     */

    public java.util.List<DomainValidationRecord> getDomainValidationRecords() {
        return domainValidationRecords;
    }

    /**
     * <p>
     * An array of objects that describe the domain validation records of the certificate.
     * </p>
     * 
     * @param domainValidationRecords
     *        An array of objects that describe the domain validation records of the certificate.
     */

    public void setDomainValidationRecords(java.util.Collection<DomainValidationRecord> domainValidationRecords) {
        if (domainValidationRecords == null) {
            this.domainValidationRecords = null;
            return;
        }

        this.domainValidationRecords = new java.util.ArrayList<DomainValidationRecord>(domainValidationRecords);
    }

    /**
     * <p>
     * An array of objects that describe the domain validation records of the certificate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainValidationRecords(java.util.Collection)} or
     * {@link #withDomainValidationRecords(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainValidationRecords
     *        An array of objects that describe the domain validation records of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenewalSummary withDomainValidationRecords(DomainValidationRecord... domainValidationRecords) {
        if (this.domainValidationRecords == null) {
            setDomainValidationRecords(new java.util.ArrayList<DomainValidationRecord>(domainValidationRecords.length));
        }
        for (DomainValidationRecord ele : domainValidationRecords) {
            this.domainValidationRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the domain validation records of the certificate.
     * </p>
     * 
     * @param domainValidationRecords
     *        An array of objects that describe the domain validation records of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenewalSummary withDomainValidationRecords(java.util.Collection<DomainValidationRecord> domainValidationRecords) {
        setDomainValidationRecords(domainValidationRecords);
        return this;
    }

    /**
     * <p>
     * The renewal status of the certificate.
     * </p>
     * <p>
     * The following renewal status are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PendingAutoRenewal</code> </b> - Lightsail is attempting to automatically validate the domain names of
     * the certificate. No further action is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PendingValidation</code> </b> - Lightsail couldn't automatically validate one or more domain names of
     * the certificate. You must take action to validate these domain names or the certificate won't be renewed. Check
     * to make sure your certificate's domain validation records exist in your domain's DNS, and that your certificate
     * remains in use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Success</code> </b> - All domain names in the certificate are validated, and Lightsail renewed the
     * certificate. No further action is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Failed</code> </b> - One or more domain names were not validated before the certificate expired, and
     * Lightsail did not renew the certificate. You can request a new certificate using the
     * <code>CreateCertificate</code> action.
     * </p>
     * </li>
     * </ul>
     * 
     * @param renewalStatus
     *        The renewal status of the certificate.</p>
     *        <p>
     *        The following renewal status are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>PendingAutoRenewal</code> </b> - Lightsail is attempting to automatically validate the domain
     *        names of the certificate. No further action is required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PendingValidation</code> </b> - Lightsail couldn't automatically validate one or more domain
     *        names of the certificate. You must take action to validate these domain names or the certificate won't be
     *        renewed. Check to make sure your certificate's domain validation records exist in your domain's DNS, and
     *        that your certificate remains in use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Success</code> </b> - All domain names in the certificate are validated, and Lightsail renewed
     *        the certificate. No further action is required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Failed</code> </b> - One or more domain names were not validated before the certificate expired,
     *        and Lightsail did not renew the certificate. You can request a new certificate using the
     *        <code>CreateCertificate</code> action.
     *        </p>
     *        </li>
     * @see RenewalStatus
     */

    public void setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
    }

    /**
     * <p>
     * The renewal status of the certificate.
     * </p>
     * <p>
     * The following renewal status are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PendingAutoRenewal</code> </b> - Lightsail is attempting to automatically validate the domain names of
     * the certificate. No further action is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PendingValidation</code> </b> - Lightsail couldn't automatically validate one or more domain names of
     * the certificate. You must take action to validate these domain names or the certificate won't be renewed. Check
     * to make sure your certificate's domain validation records exist in your domain's DNS, and that your certificate
     * remains in use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Success</code> </b> - All domain names in the certificate are validated, and Lightsail renewed the
     * certificate. No further action is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Failed</code> </b> - One or more domain names were not validated before the certificate expired, and
     * Lightsail did not renew the certificate. You can request a new certificate using the
     * <code>CreateCertificate</code> action.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The renewal status of the certificate.</p>
     *         <p>
     *         The following renewal status are possible:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>PendingAutoRenewal</code> </b> - Lightsail is attempting to automatically validate the domain
     *         names of the certificate. No further action is required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>PendingValidation</code> </b> - Lightsail couldn't automatically validate one or more domain
     *         names of the certificate. You must take action to validate these domain names or the certificate won't be
     *         renewed. Check to make sure your certificate's domain validation records exist in your domain's DNS, and
     *         that your certificate remains in use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Success</code> </b> - All domain names in the certificate are validated, and Lightsail renewed
     *         the certificate. No further action is required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Failed</code> </b> - One or more domain names were not validated before the certificate
     *         expired, and Lightsail did not renew the certificate. You can request a new certificate using the
     *         <code>CreateCertificate</code> action.
     *         </p>
     *         </li>
     * @see RenewalStatus
     */

    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    /**
     * <p>
     * The renewal status of the certificate.
     * </p>
     * <p>
     * The following renewal status are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PendingAutoRenewal</code> </b> - Lightsail is attempting to automatically validate the domain names of
     * the certificate. No further action is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PendingValidation</code> </b> - Lightsail couldn't automatically validate one or more domain names of
     * the certificate. You must take action to validate these domain names or the certificate won't be renewed. Check
     * to make sure your certificate's domain validation records exist in your domain's DNS, and that your certificate
     * remains in use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Success</code> </b> - All domain names in the certificate are validated, and Lightsail renewed the
     * certificate. No further action is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Failed</code> </b> - One or more domain names were not validated before the certificate expired, and
     * Lightsail did not renew the certificate. You can request a new certificate using the
     * <code>CreateCertificate</code> action.
     * </p>
     * </li>
     * </ul>
     * 
     * @param renewalStatus
     *        The renewal status of the certificate.</p>
     *        <p>
     *        The following renewal status are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>PendingAutoRenewal</code> </b> - Lightsail is attempting to automatically validate the domain
     *        names of the certificate. No further action is required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PendingValidation</code> </b> - Lightsail couldn't automatically validate one or more domain
     *        names of the certificate. You must take action to validate these domain names or the certificate won't be
     *        renewed. Check to make sure your certificate's domain validation records exist in your domain's DNS, and
     *        that your certificate remains in use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Success</code> </b> - All domain names in the certificate are validated, and Lightsail renewed
     *        the certificate. No further action is required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Failed</code> </b> - One or more domain names were not validated before the certificate expired,
     *        and Lightsail did not renew the certificate. You can request a new certificate using the
     *        <code>CreateCertificate</code> action.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenewalStatus
     */

    public RenewalSummary withRenewalStatus(String renewalStatus) {
        setRenewalStatus(renewalStatus);
        return this;
    }

    /**
     * <p>
     * The renewal status of the certificate.
     * </p>
     * <p>
     * The following renewal status are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>PendingAutoRenewal</code> </b> - Lightsail is attempting to automatically validate the domain names of
     * the certificate. No further action is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PendingValidation</code> </b> - Lightsail couldn't automatically validate one or more domain names of
     * the certificate. You must take action to validate these domain names or the certificate won't be renewed. Check
     * to make sure your certificate's domain validation records exist in your domain's DNS, and that your certificate
     * remains in use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Success</code> </b> - All domain names in the certificate are validated, and Lightsail renewed the
     * certificate. No further action is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Failed</code> </b> - One or more domain names were not validated before the certificate expired, and
     * Lightsail did not renew the certificate. You can request a new certificate using the
     * <code>CreateCertificate</code> action.
     * </p>
     * </li>
     * </ul>
     * 
     * @param renewalStatus
     *        The renewal status of the certificate.</p>
     *        <p>
     *        The following renewal status are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>PendingAutoRenewal</code> </b> - Lightsail is attempting to automatically validate the domain
     *        names of the certificate. No further action is required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PendingValidation</code> </b> - Lightsail couldn't automatically validate one or more domain
     *        names of the certificate. You must take action to validate these domain names or the certificate won't be
     *        renewed. Check to make sure your certificate's domain validation records exist in your domain's DNS, and
     *        that your certificate remains in use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Success</code> </b> - All domain names in the certificate are validated, and Lightsail renewed
     *        the certificate. No further action is required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Failed</code> </b> - One or more domain names were not validated before the certificate expired,
     *        and Lightsail did not renew the certificate. You can request a new certificate using the
     *        <code>CreateCertificate</code> action.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenewalStatus
     */

    public RenewalSummary withRenewalStatus(RenewalStatus renewalStatus) {
        this.renewalStatus = renewalStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the renewal status of the certificate.
     * </p>
     * 
     * @param renewalStatusReason
     *        The reason for the renewal status of the certificate.
     */

    public void setRenewalStatusReason(String renewalStatusReason) {
        this.renewalStatusReason = renewalStatusReason;
    }

    /**
     * <p>
     * The reason for the renewal status of the certificate.
     * </p>
     * 
     * @return The reason for the renewal status of the certificate.
     */

    public String getRenewalStatusReason() {
        return this.renewalStatusReason;
    }

    /**
     * <p>
     * The reason for the renewal status of the certificate.
     * </p>
     * 
     * @param renewalStatusReason
     *        The reason for the renewal status of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenewalSummary withRenewalStatusReason(String renewalStatusReason) {
        setRenewalStatusReason(renewalStatusReason);
        return this;
    }

    /**
     * <p>
     * The timestamp when the certificate was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp when the certificate was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp when the certificate was last updated.
     * </p>
     * 
     * @return The timestamp when the certificate was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp when the certificate was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp when the certificate was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenewalSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getDomainValidationRecords() != null)
            sb.append("DomainValidationRecords: ").append(getDomainValidationRecords()).append(",");
        if (getRenewalStatus() != null)
            sb.append("RenewalStatus: ").append(getRenewalStatus()).append(",");
        if (getRenewalStatusReason() != null)
            sb.append("RenewalStatusReason: ").append(getRenewalStatusReason()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenewalSummary == false)
            return false;
        RenewalSummary other = (RenewalSummary) obj;
        if (other.getDomainValidationRecords() == null ^ this.getDomainValidationRecords() == null)
            return false;
        if (other.getDomainValidationRecords() != null && other.getDomainValidationRecords().equals(this.getDomainValidationRecords()) == false)
            return false;
        if (other.getRenewalStatus() == null ^ this.getRenewalStatus() == null)
            return false;
        if (other.getRenewalStatus() != null && other.getRenewalStatus().equals(this.getRenewalStatus()) == false)
            return false;
        if (other.getRenewalStatusReason() == null ^ this.getRenewalStatusReason() == null)
            return false;
        if (other.getRenewalStatusReason() != null && other.getRenewalStatusReason().equals(this.getRenewalStatusReason()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainValidationRecords() == null) ? 0 : getDomainValidationRecords().hashCode());
        hashCode = prime * hashCode + ((getRenewalStatus() == null) ? 0 : getRenewalStatus().hashCode());
        hashCode = prime * hashCode + ((getRenewalStatusReason() == null) ? 0 : getRenewalStatusReason().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public RenewalSummary clone() {
        try {
            return (RenewalSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.RenewalSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
