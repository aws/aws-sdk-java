/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

/**
 * <p>
 * Returns information about an HSM client certificate. The certificate
 * is stored in a secure Hardware Storage Module (HSM), and used by the
 * Amazon Redshift cluster to encrypt data files.
 * </p>
 */
public class HsmClientCertificate implements Serializable, Cloneable {

    /**
     * The identifier of the HSM client certificate.
     */
    private String hsmClientCertificateIdentifier;

    /**
     * The public key that the Amazon Redshift cluster will use to connect to
     * the HSM. You must register the public key in the HSM.
     */
    private String hsmClientCertificatePublicKey;

    /**
     * The list of tags for the HSM client certificate.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The identifier of the HSM client certificate.
     *
     * @return The identifier of the HSM client certificate.
     */
    public String getHsmClientCertificateIdentifier() {
        return hsmClientCertificateIdentifier;
    }
    
    /**
     * The identifier of the HSM client certificate.
     *
     * @param hsmClientCertificateIdentifier The identifier of the HSM client certificate.
     */
    public void setHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }
    
    /**
     * The identifier of the HSM client certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmClientCertificateIdentifier The identifier of the HSM client certificate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HsmClientCertificate withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
        return this;
    }

    /**
     * The public key that the Amazon Redshift cluster will use to connect to
     * the HSM. You must register the public key in the HSM.
     *
     * @return The public key that the Amazon Redshift cluster will use to connect to
     *         the HSM. You must register the public key in the HSM.
     */
    public String getHsmClientCertificatePublicKey() {
        return hsmClientCertificatePublicKey;
    }
    
    /**
     * The public key that the Amazon Redshift cluster will use to connect to
     * the HSM. You must register the public key in the HSM.
     *
     * @param hsmClientCertificatePublicKey The public key that the Amazon Redshift cluster will use to connect to
     *         the HSM. You must register the public key in the HSM.
     */
    public void setHsmClientCertificatePublicKey(String hsmClientCertificatePublicKey) {
        this.hsmClientCertificatePublicKey = hsmClientCertificatePublicKey;
    }
    
    /**
     * The public key that the Amazon Redshift cluster will use to connect to
     * the HSM. You must register the public key in the HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmClientCertificatePublicKey The public key that the Amazon Redshift cluster will use to connect to
     *         the HSM. You must register the public key in the HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HsmClientCertificate withHsmClientCertificatePublicKey(String hsmClientCertificatePublicKey) {
        this.hsmClientCertificatePublicKey = hsmClientCertificatePublicKey;
        return this;
    }

    /**
     * The list of tags for the HSM client certificate.
     *
     * @return The list of tags for the HSM client certificate.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * The list of tags for the HSM client certificate.
     *
     * @param tags The list of tags for the HSM client certificate.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * The list of tags for the HSM client certificate.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The list of tags for the HSM client certificate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HsmClientCertificate withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * The list of tags for the HSM client certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The list of tags for the HSM client certificate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HsmClientCertificate withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHsmClientCertificateIdentifier() != null) sb.append("HsmClientCertificateIdentifier: " + getHsmClientCertificateIdentifier() + ",");
        if (getHsmClientCertificatePublicKey() != null) sb.append("HsmClientCertificatePublicKey: " + getHsmClientCertificatePublicKey() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HsmClientCertificate == false) return false;
        HsmClientCertificate other = (HsmClientCertificate)obj;
        
        if (other.getHsmClientCertificateIdentifier() == null ^ this.getHsmClientCertificateIdentifier() == null) return false;
        if (other.getHsmClientCertificateIdentifier() != null && other.getHsmClientCertificateIdentifier().equals(this.getHsmClientCertificateIdentifier()) == false) return false; 
        if (other.getHsmClientCertificatePublicKey() == null ^ this.getHsmClientCertificatePublicKey() == null) return false;
        if (other.getHsmClientCertificatePublicKey() != null && other.getHsmClientCertificatePublicKey().equals(this.getHsmClientCertificatePublicKey()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public HsmClientCertificate clone() {
        try {
            return (HsmClientCertificate) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    