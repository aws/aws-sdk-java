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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about the custom domain name association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/Association" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Association implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate associated with the custom domain.
     * </p>
     */
    private String customDomainCertificateArn;
    /**
     * <p>
     * The expiration date for the certificate.
     * </p>
     */
    private java.util.Date customDomainCertificateExpiryDate;
    /**
     * <p>
     * A list of all associated clusters and domain names tied to a specific certificate.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CertificateAssociation> certificateAssociations;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate associated with the custom domain.
     * </p>
     * 
     * @param customDomainCertificateArn
     *        The Amazon Resource Name (ARN) for the certificate associated with the custom domain.
     */

    public void setCustomDomainCertificateArn(String customDomainCertificateArn) {
        this.customDomainCertificateArn = customDomainCertificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate associated with the custom domain.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the certificate associated with the custom domain.
     */

    public String getCustomDomainCertificateArn() {
        return this.customDomainCertificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate associated with the custom domain.
     * </p>
     * 
     * @param customDomainCertificateArn
     *        The Amazon Resource Name (ARN) for the certificate associated with the custom domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withCustomDomainCertificateArn(String customDomainCertificateArn) {
        setCustomDomainCertificateArn(customDomainCertificateArn);
        return this;
    }

    /**
     * <p>
     * The expiration date for the certificate.
     * </p>
     * 
     * @param customDomainCertificateExpiryDate
     *        The expiration date for the certificate.
     */

    public void setCustomDomainCertificateExpiryDate(java.util.Date customDomainCertificateExpiryDate) {
        this.customDomainCertificateExpiryDate = customDomainCertificateExpiryDate;
    }

    /**
     * <p>
     * The expiration date for the certificate.
     * </p>
     * 
     * @return The expiration date for the certificate.
     */

    public java.util.Date getCustomDomainCertificateExpiryDate() {
        return this.customDomainCertificateExpiryDate;
    }

    /**
     * <p>
     * The expiration date for the certificate.
     * </p>
     * 
     * @param customDomainCertificateExpiryDate
     *        The expiration date for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withCustomDomainCertificateExpiryDate(java.util.Date customDomainCertificateExpiryDate) {
        setCustomDomainCertificateExpiryDate(customDomainCertificateExpiryDate);
        return this;
    }

    /**
     * <p>
     * A list of all associated clusters and domain names tied to a specific certificate.
     * </p>
     * 
     * @return A list of all associated clusters and domain names tied to a specific certificate.
     */

    public java.util.List<CertificateAssociation> getCertificateAssociations() {
        if (certificateAssociations == null) {
            certificateAssociations = new com.amazonaws.internal.SdkInternalList<CertificateAssociation>();
        }
        return certificateAssociations;
    }

    /**
     * <p>
     * A list of all associated clusters and domain names tied to a specific certificate.
     * </p>
     * 
     * @param certificateAssociations
     *        A list of all associated clusters and domain names tied to a specific certificate.
     */

    public void setCertificateAssociations(java.util.Collection<CertificateAssociation> certificateAssociations) {
        if (certificateAssociations == null) {
            this.certificateAssociations = null;
            return;
        }

        this.certificateAssociations = new com.amazonaws.internal.SdkInternalList<CertificateAssociation>(certificateAssociations);
    }

    /**
     * <p>
     * A list of all associated clusters and domain names tied to a specific certificate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateAssociations(java.util.Collection)} or
     * {@link #withCertificateAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param certificateAssociations
     *        A list of all associated clusters and domain names tied to a specific certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withCertificateAssociations(CertificateAssociation... certificateAssociations) {
        if (this.certificateAssociations == null) {
            setCertificateAssociations(new com.amazonaws.internal.SdkInternalList<CertificateAssociation>(certificateAssociations.length));
        }
        for (CertificateAssociation ele : certificateAssociations) {
            this.certificateAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all associated clusters and domain names tied to a specific certificate.
     * </p>
     * 
     * @param certificateAssociations
     *        A list of all associated clusters and domain names tied to a specific certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withCertificateAssociations(java.util.Collection<CertificateAssociation> certificateAssociations) {
        setCertificateAssociations(certificateAssociations);
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
        if (getCustomDomainCertificateArn() != null)
            sb.append("CustomDomainCertificateArn: ").append(getCustomDomainCertificateArn()).append(",");
        if (getCustomDomainCertificateExpiryDate() != null)
            sb.append("CustomDomainCertificateExpiryDate: ").append(getCustomDomainCertificateExpiryDate()).append(",");
        if (getCertificateAssociations() != null)
            sb.append("CertificateAssociations: ").append(getCertificateAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Association == false)
            return false;
        Association other = (Association) obj;
        if (other.getCustomDomainCertificateArn() == null ^ this.getCustomDomainCertificateArn() == null)
            return false;
        if (other.getCustomDomainCertificateArn() != null && other.getCustomDomainCertificateArn().equals(this.getCustomDomainCertificateArn()) == false)
            return false;
        if (other.getCustomDomainCertificateExpiryDate() == null ^ this.getCustomDomainCertificateExpiryDate() == null)
            return false;
        if (other.getCustomDomainCertificateExpiryDate() != null
                && other.getCustomDomainCertificateExpiryDate().equals(this.getCustomDomainCertificateExpiryDate()) == false)
            return false;
        if (other.getCertificateAssociations() == null ^ this.getCertificateAssociations() == null)
            return false;
        if (other.getCertificateAssociations() != null && other.getCertificateAssociations().equals(this.getCertificateAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomDomainCertificateArn() == null) ? 0 : getCustomDomainCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCustomDomainCertificateExpiryDate() == null) ? 0 : getCustomDomainCertificateExpiryDate().hashCode());
        hashCode = prime * hashCode + ((getCertificateAssociations() == null) ? 0 : getCertificateAssociations().hashCode());
        return hashCode;
    }

    @Override
    public Association clone() {
        try {
            return (Association) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
