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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DescribeLunaClient" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLunaClientResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the client.
     * </p>
     */
    private String clientArn;
    /**
     * <p>
     * The certificate installed on the HSMs used by this client.
     * </p>
     */
    private String certificate;
    /**
     * <p>
     * The certificate fingerprint.
     * </p>
     */
    private String certificateFingerprint;
    /**
     * <p>
     * The date and time the client was last modified.
     * </p>
     */
    private String lastModifiedTimestamp;
    /**
     * <p>
     * The label of the client.
     * </p>
     */
    private String label;

    /**
     * <p>
     * The ARN of the client.
     * </p>
     * 
     * @param clientArn
     *        The ARN of the client.
     */

    public void setClientArn(String clientArn) {
        this.clientArn = clientArn;
    }

    /**
     * <p>
     * The ARN of the client.
     * </p>
     * 
     * @return The ARN of the client.
     */

    public String getClientArn() {
        return this.clientArn;
    }

    /**
     * <p>
     * The ARN of the client.
     * </p>
     * 
     * @param clientArn
     *        The ARN of the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLunaClientResult withClientArn(String clientArn) {
        setClientArn(clientArn);
        return this;
    }

    /**
     * <p>
     * The certificate installed on the HSMs used by this client.
     * </p>
     * 
     * @param certificate
     *        The certificate installed on the HSMs used by this client.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The certificate installed on the HSMs used by this client.
     * </p>
     * 
     * @return The certificate installed on the HSMs used by this client.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The certificate installed on the HSMs used by this client.
     * </p>
     * 
     * @param certificate
     *        The certificate installed on the HSMs used by this client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLunaClientResult withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * The certificate fingerprint.
     * </p>
     * 
     * @param certificateFingerprint
     *        The certificate fingerprint.
     */

    public void setCertificateFingerprint(String certificateFingerprint) {
        this.certificateFingerprint = certificateFingerprint;
    }

    /**
     * <p>
     * The certificate fingerprint.
     * </p>
     * 
     * @return The certificate fingerprint.
     */

    public String getCertificateFingerprint() {
        return this.certificateFingerprint;
    }

    /**
     * <p>
     * The certificate fingerprint.
     * </p>
     * 
     * @param certificateFingerprint
     *        The certificate fingerprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLunaClientResult withCertificateFingerprint(String certificateFingerprint) {
        setCertificateFingerprint(certificateFingerprint);
        return this;
    }

    /**
     * <p>
     * The date and time the client was last modified.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The date and time the client was last modified.
     */

    public void setLastModifiedTimestamp(String lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The date and time the client was last modified.
     * </p>
     * 
     * @return The date and time the client was last modified.
     */

    public String getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The date and time the client was last modified.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The date and time the client was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLunaClientResult withLastModifiedTimestamp(String lastModifiedTimestamp) {
        setLastModifiedTimestamp(lastModifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The label of the client.
     * </p>
     * 
     * @param label
     *        The label of the client.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The label of the client.
     * </p>
     * 
     * @return The label of the client.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The label of the client.
     * </p>
     * 
     * @param label
     *        The label of the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLunaClientResult withLabel(String label) {
        setLabel(label);
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
        if (getClientArn() != null)
            sb.append("ClientArn: ").append(getClientArn()).append(",");
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getCertificateFingerprint() != null)
            sb.append("CertificateFingerprint: ").append(getCertificateFingerprint()).append(",");
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: ").append(getLastModifiedTimestamp()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLunaClientResult == false)
            return false;
        DescribeLunaClientResult other = (DescribeLunaClientResult) obj;
        if (other.getClientArn() == null ^ this.getClientArn() == null)
            return false;
        if (other.getClientArn() != null && other.getClientArn().equals(this.getClientArn()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getCertificateFingerprint() == null ^ this.getCertificateFingerprint() == null)
            return false;
        if (other.getCertificateFingerprint() != null && other.getCertificateFingerprint().equals(this.getCertificateFingerprint()) == false)
            return false;
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null)
            return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientArn() == null) ? 0 : getClientArn().hashCode());
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getCertificateFingerprint() == null) ? 0 : getCertificateFingerprint().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLunaClientResult clone() {
        try {
            return (DescribeLunaClientResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
