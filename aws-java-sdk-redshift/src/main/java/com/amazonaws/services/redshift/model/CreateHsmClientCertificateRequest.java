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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#createHsmClientCertificate(CreateHsmClientCertificateRequest) CreateHsmClientCertificate operation}.
 * <p>
 * Creates an HSM client certificate that an Amazon Redshift cluster will
 * use to connect to the client's HSM in order to store and retrieve the
 * keys used to encrypt the cluster databases.
 * </p>
 * <p>
 * The command returns a public key, which you must store in the HSM. In
 * addition to creating the HSM certificate, you must create an Amazon
 * Redshift HSM configuration that provides a cluster the information
 * needed to store and use encryption keys in the HSM. For more
 * information, go to
 * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-HSM.html"> Hardware Security Modules </a>
 * in the Amazon Redshift Cluster Management Guide.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#createHsmClientCertificate(CreateHsmClientCertificateRequest)
 */
public class CreateHsmClientCertificateRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier to be assigned to the new HSM client certificate that
     * the cluster will use to connect to the HSM to use the database
     * encryption keys.
     */
    private String hsmClientCertificateIdentifier;

    /**
     * A list of tag instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The identifier to be assigned to the new HSM client certificate that
     * the cluster will use to connect to the HSM to use the database
     * encryption keys.
     *
     * @return The identifier to be assigned to the new HSM client certificate that
     *         the cluster will use to connect to the HSM to use the database
     *         encryption keys.
     */
    public String getHsmClientCertificateIdentifier() {
        return hsmClientCertificateIdentifier;
    }
    
    /**
     * The identifier to be assigned to the new HSM client certificate that
     * the cluster will use to connect to the HSM to use the database
     * encryption keys.
     *
     * @param hsmClientCertificateIdentifier The identifier to be assigned to the new HSM client certificate that
     *         the cluster will use to connect to the HSM to use the database
     *         encryption keys.
     */
    public void setHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }
    
    /**
     * The identifier to be assigned to the new HSM client certificate that
     * the cluster will use to connect to the HSM to use the database
     * encryption keys.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmClientCertificateIdentifier The identifier to be assigned to the new HSM client certificate that
     *         the cluster will use to connect to the HSM to use the database
     *         encryption keys.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmClientCertificateRequest withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
        return this;
    }

    /**
     * A list of tag instances.
     *
     * @return A list of tag instances.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tag instances.
     *
     * @param tags A list of tag instances.
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
     * A list of tag instances.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tag instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmClientCertificateRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tag instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tag instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmClientCertificateRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHsmClientCertificateIdentifier() == null) ? 0 : getHsmClientCertificateIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateHsmClientCertificateRequest == false) return false;
        CreateHsmClientCertificateRequest other = (CreateHsmClientCertificateRequest)obj;
        
        if (other.getHsmClientCertificateIdentifier() == null ^ this.getHsmClientCertificateIdentifier() == null) return false;
        if (other.getHsmClientCertificateIdentifier() != null && other.getHsmClientCertificateIdentifier().equals(this.getHsmClientCertificateIdentifier()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateHsmClientCertificateRequest clone() {
        
            return (CreateHsmClientCertificateRequest) super.clone();
    }

}
    