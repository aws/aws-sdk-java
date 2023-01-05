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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether this certificate is used for signing or encryption.
     * </p>
     */
    private String usage;
    /**
     * <p>
     * The file that contains the certificate to import.
     * </p>
     */
    private String certificate;
    /**
     * <p>
     * An optional list of certificates that make up the chain for the certificate that's being imported.
     * </p>
     */
    private String certificateChain;
    /**
     * <p>
     * The file that contains the private key for the certificate that's being imported.
     * </p>
     */
    private String privateKey;
    /**
     * <p>
     * An optional date that specifies when the certificate becomes active.
     * </p>
     */
    private java.util.Date activeDate;
    /**
     * <p>
     * An optional date that specifies when the certificate becomes inactive.
     * </p>
     */
    private java.util.Date inactiveDate;
    /**
     * <p>
     * A short description that helps identify the certificate.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Key-value pairs that can be used to group and search for certificates.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies whether this certificate is used for signing or encryption.
     * </p>
     * 
     * @param usage
     *        Specifies whether this certificate is used for signing or encryption.
     * @see CertificateUsageType
     */

    public void setUsage(String usage) {
        this.usage = usage;
    }

    /**
     * <p>
     * Specifies whether this certificate is used for signing or encryption.
     * </p>
     * 
     * @return Specifies whether this certificate is used for signing or encryption.
     * @see CertificateUsageType
     */

    public String getUsage() {
        return this.usage;
    }

    /**
     * <p>
     * Specifies whether this certificate is used for signing or encryption.
     * </p>
     * 
     * @param usage
     *        Specifies whether this certificate is used for signing or encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateUsageType
     */

    public ImportCertificateRequest withUsage(String usage) {
        setUsage(usage);
        return this;
    }

    /**
     * <p>
     * Specifies whether this certificate is used for signing or encryption.
     * </p>
     * 
     * @param usage
     *        Specifies whether this certificate is used for signing or encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateUsageType
     */

    public ImportCertificateRequest withUsage(CertificateUsageType usage) {
        this.usage = usage.toString();
        return this;
    }

    /**
     * <p>
     * The file that contains the certificate to import.
     * </p>
     * 
     * @param certificate
     *        The file that contains the certificate to import.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The file that contains the certificate to import.
     * </p>
     * 
     * @return The file that contains the certificate to import.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The file that contains the certificate to import.
     * </p>
     * 
     * @param certificate
     *        The file that contains the certificate to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * An optional list of certificates that make up the chain for the certificate that's being imported.
     * </p>
     * 
     * @param certificateChain
     *        An optional list of certificates that make up the chain for the certificate that's being imported.
     */

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * An optional list of certificates that make up the chain for the certificate that's being imported.
     * </p>
     * 
     * @return An optional list of certificates that make up the chain for the certificate that's being imported.
     */

    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * An optional list of certificates that make up the chain for the certificate that's being imported.
     * </p>
     * 
     * @param certificateChain
     *        An optional list of certificates that make up the chain for the certificate that's being imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withCertificateChain(String certificateChain) {
        setCertificateChain(certificateChain);
        return this;
    }

    /**
     * <p>
     * The file that contains the private key for the certificate that's being imported.
     * </p>
     * 
     * @param privateKey
     *        The file that contains the private key for the certificate that's being imported.
     */

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * The file that contains the private key for the certificate that's being imported.
     * </p>
     * 
     * @return The file that contains the private key for the certificate that's being imported.
     */

    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * <p>
     * The file that contains the private key for the certificate that's being imported.
     * </p>
     * 
     * @param privateKey
     *        The file that contains the private key for the certificate that's being imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withPrivateKey(String privateKey) {
        setPrivateKey(privateKey);
        return this;
    }

    /**
     * <p>
     * An optional date that specifies when the certificate becomes active.
     * </p>
     * 
     * @param activeDate
     *        An optional date that specifies when the certificate becomes active.
     */

    public void setActiveDate(java.util.Date activeDate) {
        this.activeDate = activeDate;
    }

    /**
     * <p>
     * An optional date that specifies when the certificate becomes active.
     * </p>
     * 
     * @return An optional date that specifies when the certificate becomes active.
     */

    public java.util.Date getActiveDate() {
        return this.activeDate;
    }

    /**
     * <p>
     * An optional date that specifies when the certificate becomes active.
     * </p>
     * 
     * @param activeDate
     *        An optional date that specifies when the certificate becomes active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withActiveDate(java.util.Date activeDate) {
        setActiveDate(activeDate);
        return this;
    }

    /**
     * <p>
     * An optional date that specifies when the certificate becomes inactive.
     * </p>
     * 
     * @param inactiveDate
     *        An optional date that specifies when the certificate becomes inactive.
     */

    public void setInactiveDate(java.util.Date inactiveDate) {
        this.inactiveDate = inactiveDate;
    }

    /**
     * <p>
     * An optional date that specifies when the certificate becomes inactive.
     * </p>
     * 
     * @return An optional date that specifies when the certificate becomes inactive.
     */

    public java.util.Date getInactiveDate() {
        return this.inactiveDate;
    }

    /**
     * <p>
     * An optional date that specifies when the certificate becomes inactive.
     * </p>
     * 
     * @param inactiveDate
     *        An optional date that specifies when the certificate becomes inactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withInactiveDate(java.util.Date inactiveDate) {
        setInactiveDate(inactiveDate);
        return this;
    }

    /**
     * <p>
     * A short description that helps identify the certificate.
     * </p>
     * 
     * @param description
     *        A short description that helps identify the certificate.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A short description that helps identify the certificate.
     * </p>
     * 
     * @return A short description that helps identify the certificate.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A short description that helps identify the certificate.
     * </p>
     * 
     * @param description
     *        A short description that helps identify the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for certificates.
     * </p>
     * 
     * @return Key-value pairs that can be used to group and search for certificates.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for certificates.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for certificates.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for certificates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for certificates.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getUsage() != null)
            sb.append("Usage: ").append(getUsage()).append(",");
        if (getCertificate() != null)
            sb.append("Certificate: ").append("***Sensitive Data Redacted***").append(",");
        if (getCertificateChain() != null)
            sb.append("CertificateChain: ").append("***Sensitive Data Redacted***").append(",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: ").append("***Sensitive Data Redacted***").append(",");
        if (getActiveDate() != null)
            sb.append("ActiveDate: ").append(getActiveDate()).append(",");
        if (getInactiveDate() != null)
            sb.append("InactiveDate: ").append(getInactiveDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportCertificateRequest == false)
            return false;
        ImportCertificateRequest other = (ImportCertificateRequest) obj;
        if (other.getUsage() == null ^ this.getUsage() == null)
            return false;
        if (other.getUsage() != null && other.getUsage().equals(this.getUsage()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        if (other.getActiveDate() == null ^ this.getActiveDate() == null)
            return false;
        if (other.getActiveDate() != null && other.getActiveDate().equals(this.getActiveDate()) == false)
            return false;
        if (other.getInactiveDate() == null ^ this.getInactiveDate() == null)
            return false;
        if (other.getInactiveDate() != null && other.getInactiveDate().equals(this.getInactiveDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsage() == null) ? 0 : getUsage().hashCode());
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        hashCode = prime * hashCode + ((getActiveDate() == null) ? 0 : getActiveDate().hashCode());
        hashCode = prime * hashCode + ((getInactiveDate() == null) ? 0 : getInactiveDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ImportCertificateRequest clone() {
        return (ImportCertificateRequest) super.clone();
    }

}
