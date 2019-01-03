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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Returns information about an HSM client certificate. The certificate is stored in a secure Hardware Storage Module
 * (HSM), and used by the Amazon Redshift cluster to encrypt data files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/HsmClientCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HsmClientCertificate implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the HSM client certificate.
     * </p>
     */
    private String hsmClientCertificateIdentifier;
    /**
     * <p>
     * The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the public key
     * in the HSM.
     * </p>
     */
    private String hsmClientCertificatePublicKey;
    /**
     * <p>
     * The list of tags for the HSM client certificate.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The identifier of the HSM client certificate.
     * </p>
     * 
     * @param hsmClientCertificateIdentifier
     *        The identifier of the HSM client certificate.
     */

    public void setHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }

    /**
     * <p>
     * The identifier of the HSM client certificate.
     * </p>
     * 
     * @return The identifier of the HSM client certificate.
     */

    public String getHsmClientCertificateIdentifier() {
        return this.hsmClientCertificateIdentifier;
    }

    /**
     * <p>
     * The identifier of the HSM client certificate.
     * </p>
     * 
     * @param hsmClientCertificateIdentifier
     *        The identifier of the HSM client certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HsmClientCertificate withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        setHsmClientCertificateIdentifier(hsmClientCertificateIdentifier);
        return this;
    }

    /**
     * <p>
     * The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the public key
     * in the HSM.
     * </p>
     * 
     * @param hsmClientCertificatePublicKey
     *        The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the
     *        public key in the HSM.
     */

    public void setHsmClientCertificatePublicKey(String hsmClientCertificatePublicKey) {
        this.hsmClientCertificatePublicKey = hsmClientCertificatePublicKey;
    }

    /**
     * <p>
     * The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the public key
     * in the HSM.
     * </p>
     * 
     * @return The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the
     *         public key in the HSM.
     */

    public String getHsmClientCertificatePublicKey() {
        return this.hsmClientCertificatePublicKey;
    }

    /**
     * <p>
     * The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the public key
     * in the HSM.
     * </p>
     * 
     * @param hsmClientCertificatePublicKey
     *        The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the
     *        public key in the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HsmClientCertificate withHsmClientCertificatePublicKey(String hsmClientCertificatePublicKey) {
        setHsmClientCertificatePublicKey(hsmClientCertificatePublicKey);
        return this;
    }

    /**
     * <p>
     * The list of tags for the HSM client certificate.
     * </p>
     * 
     * @return The list of tags for the HSM client certificate.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags for the HSM client certificate.
     * </p>
     * 
     * @param tags
     *        The list of tags for the HSM client certificate.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags for the HSM client certificate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags for the HSM client certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HsmClientCertificate withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags for the HSM client certificate.
     * </p>
     * 
     * @param tags
     *        The list of tags for the HSM client certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HsmClientCertificate withTags(java.util.Collection<Tag> tags) {
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
        if (getHsmClientCertificateIdentifier() != null)
            sb.append("HsmClientCertificateIdentifier: ").append(getHsmClientCertificateIdentifier()).append(",");
        if (getHsmClientCertificatePublicKey() != null)
            sb.append("HsmClientCertificatePublicKey: ").append(getHsmClientCertificatePublicKey()).append(",");
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

        if (obj instanceof HsmClientCertificate == false)
            return false;
        HsmClientCertificate other = (HsmClientCertificate) obj;
        if (other.getHsmClientCertificateIdentifier() == null ^ this.getHsmClientCertificateIdentifier() == null)
            return false;
        if (other.getHsmClientCertificateIdentifier() != null
                && other.getHsmClientCertificateIdentifier().equals(this.getHsmClientCertificateIdentifier()) == false)
            return false;
        if (other.getHsmClientCertificatePublicKey() == null ^ this.getHsmClientCertificatePublicKey() == null)
            return false;
        if (other.getHsmClientCertificatePublicKey() != null
                && other.getHsmClientCertificatePublicKey().equals(this.getHsmClientCertificatePublicKey()) == false)
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

        hashCode = prime * hashCode + ((getHsmClientCertificateIdentifier() == null) ? 0 : getHsmClientCertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getHsmClientCertificatePublicKey() == null) ? 0 : getHsmClientCertificatePublicKey().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public HsmClientCertificate clone() {
        try {
            return (HsmClientCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
