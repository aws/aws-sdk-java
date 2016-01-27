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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#createHsmConfiguration(CreateHsmConfigurationRequest) CreateHsmConfiguration operation}.
 * <p>
 * Creates an HSM configuration that contains the information required by
 * an Amazon Redshift cluster to store and use database encryption keys
 * in a Hardware Security Module (HSM). After creating the HSM
 * configuration, you can specify it as a parameter when creating a
 * cluster. The cluster will then store its encryption keys in the HSM.
 * </p>
 * <p>
 * In addition to creating an HSM configuration, you must also create an
 * HSM client certificate. For more information, go to
 * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-HSM.html"> Hardware Security Modules </a>
 * in the Amazon Redshift Cluster Management Guide.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#createHsmConfiguration(CreateHsmConfigurationRequest)
 */
public class CreateHsmConfigurationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier to be assigned to the new Amazon Redshift HSM
     * configuration.
     */
    private String hsmConfigurationIdentifier;

    /**
     * A text description of the HSM configuration to be created.
     */
    private String description;

    /**
     * The IP address that the Amazon Redshift cluster must use to access the
     * HSM.
     */
    private String hsmIpAddress;

    /**
     * The name of the partition in the HSM where the Amazon Redshift
     * clusters will store their database encryption keys.
     */
    private String hsmPartitionName;

    /**
     * The password required to access the HSM partition.
     */
    private String hsmPartitionPassword;

    /**
     * The HSMs public certificate file. When using Cloud HSM, the file name
     * is server.pem.
     */
    private String hsmServerPublicCertificate;

    /**
     * A list of tag instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The identifier to be assigned to the new Amazon Redshift HSM
     * configuration.
     *
     * @return The identifier to be assigned to the new Amazon Redshift HSM
     *         configuration.
     */
    public String getHsmConfigurationIdentifier() {
        return hsmConfigurationIdentifier;
    }
    
    /**
     * The identifier to be assigned to the new Amazon Redshift HSM
     * configuration.
     *
     * @param hsmConfigurationIdentifier The identifier to be assigned to the new Amazon Redshift HSM
     *         configuration.
     */
    public void setHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }
    
    /**
     * The identifier to be assigned to the new Amazon Redshift HSM
     * configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmConfigurationIdentifier The identifier to be assigned to the new Amazon Redshift HSM
     *         configuration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmConfigurationRequest withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
        return this;
    }

    /**
     * A text description of the HSM configuration to be created.
     *
     * @return A text description of the HSM configuration to be created.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A text description of the HSM configuration to be created.
     *
     * @param description A text description of the HSM configuration to be created.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A text description of the HSM configuration to be created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A text description of the HSM configuration to be created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmConfigurationRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The IP address that the Amazon Redshift cluster must use to access the
     * HSM.
     *
     * @return The IP address that the Amazon Redshift cluster must use to access the
     *         HSM.
     */
    public String getHsmIpAddress() {
        return hsmIpAddress;
    }
    
    /**
     * The IP address that the Amazon Redshift cluster must use to access the
     * HSM.
     *
     * @param hsmIpAddress The IP address that the Amazon Redshift cluster must use to access the
     *         HSM.
     */
    public void setHsmIpAddress(String hsmIpAddress) {
        this.hsmIpAddress = hsmIpAddress;
    }
    
    /**
     * The IP address that the Amazon Redshift cluster must use to access the
     * HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmIpAddress The IP address that the Amazon Redshift cluster must use to access the
     *         HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmConfigurationRequest withHsmIpAddress(String hsmIpAddress) {
        this.hsmIpAddress = hsmIpAddress;
        return this;
    }

    /**
     * The name of the partition in the HSM where the Amazon Redshift
     * clusters will store their database encryption keys.
     *
     * @return The name of the partition in the HSM where the Amazon Redshift
     *         clusters will store their database encryption keys.
     */
    public String getHsmPartitionName() {
        return hsmPartitionName;
    }
    
    /**
     * The name of the partition in the HSM where the Amazon Redshift
     * clusters will store their database encryption keys.
     *
     * @param hsmPartitionName The name of the partition in the HSM where the Amazon Redshift
     *         clusters will store their database encryption keys.
     */
    public void setHsmPartitionName(String hsmPartitionName) {
        this.hsmPartitionName = hsmPartitionName;
    }
    
    /**
     * The name of the partition in the HSM where the Amazon Redshift
     * clusters will store their database encryption keys.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmPartitionName The name of the partition in the HSM where the Amazon Redshift
     *         clusters will store their database encryption keys.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmConfigurationRequest withHsmPartitionName(String hsmPartitionName) {
        this.hsmPartitionName = hsmPartitionName;
        return this;
    }

    /**
     * The password required to access the HSM partition.
     *
     * @return The password required to access the HSM partition.
     */
    public String getHsmPartitionPassword() {
        return hsmPartitionPassword;
    }
    
    /**
     * The password required to access the HSM partition.
     *
     * @param hsmPartitionPassword The password required to access the HSM partition.
     */
    public void setHsmPartitionPassword(String hsmPartitionPassword) {
        this.hsmPartitionPassword = hsmPartitionPassword;
    }
    
    /**
     * The password required to access the HSM partition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmPartitionPassword The password required to access the HSM partition.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmConfigurationRequest withHsmPartitionPassword(String hsmPartitionPassword) {
        this.hsmPartitionPassword = hsmPartitionPassword;
        return this;
    }

    /**
     * The HSMs public certificate file. When using Cloud HSM, the file name
     * is server.pem.
     *
     * @return The HSMs public certificate file. When using Cloud HSM, the file name
     *         is server.pem.
     */
    public String getHsmServerPublicCertificate() {
        return hsmServerPublicCertificate;
    }
    
    /**
     * The HSMs public certificate file. When using Cloud HSM, the file name
     * is server.pem.
     *
     * @param hsmServerPublicCertificate The HSMs public certificate file. When using Cloud HSM, the file name
     *         is server.pem.
     */
    public void setHsmServerPublicCertificate(String hsmServerPublicCertificate) {
        this.hsmServerPublicCertificate = hsmServerPublicCertificate;
    }
    
    /**
     * The HSMs public certificate file. When using Cloud HSM, the file name
     * is server.pem.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmServerPublicCertificate The HSMs public certificate file. When using Cloud HSM, the file name
     *         is server.pem.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmConfigurationRequest withHsmServerPublicCertificate(String hsmServerPublicCertificate) {
        this.hsmServerPublicCertificate = hsmServerPublicCertificate;
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
    public CreateHsmConfigurationRequest withTags(Tag... tags) {
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
    public CreateHsmConfigurationRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getHsmConfigurationIdentifier() != null) sb.append("HsmConfigurationIdentifier: " + getHsmConfigurationIdentifier() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getHsmIpAddress() != null) sb.append("HsmIpAddress: " + getHsmIpAddress() + ",");
        if (getHsmPartitionName() != null) sb.append("HsmPartitionName: " + getHsmPartitionName() + ",");
        if (getHsmPartitionPassword() != null) sb.append("HsmPartitionPassword: " + getHsmPartitionPassword() + ",");
        if (getHsmServerPublicCertificate() != null) sb.append("HsmServerPublicCertificate: " + getHsmServerPublicCertificate() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHsmConfigurationIdentifier() == null) ? 0 : getHsmConfigurationIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getHsmIpAddress() == null) ? 0 : getHsmIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getHsmPartitionName() == null) ? 0 : getHsmPartitionName().hashCode()); 
        hashCode = prime * hashCode + ((getHsmPartitionPassword() == null) ? 0 : getHsmPartitionPassword().hashCode()); 
        hashCode = prime * hashCode + ((getHsmServerPublicCertificate() == null) ? 0 : getHsmServerPublicCertificate().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateHsmConfigurationRequest == false) return false;
        CreateHsmConfigurationRequest other = (CreateHsmConfigurationRequest)obj;
        
        if (other.getHsmConfigurationIdentifier() == null ^ this.getHsmConfigurationIdentifier() == null) return false;
        if (other.getHsmConfigurationIdentifier() != null && other.getHsmConfigurationIdentifier().equals(this.getHsmConfigurationIdentifier()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getHsmIpAddress() == null ^ this.getHsmIpAddress() == null) return false;
        if (other.getHsmIpAddress() != null && other.getHsmIpAddress().equals(this.getHsmIpAddress()) == false) return false; 
        if (other.getHsmPartitionName() == null ^ this.getHsmPartitionName() == null) return false;
        if (other.getHsmPartitionName() != null && other.getHsmPartitionName().equals(this.getHsmPartitionName()) == false) return false; 
        if (other.getHsmPartitionPassword() == null ^ this.getHsmPartitionPassword() == null) return false;
        if (other.getHsmPartitionPassword() != null && other.getHsmPartitionPassword().equals(this.getHsmPartitionPassword()) == false) return false; 
        if (other.getHsmServerPublicCertificate() == null ^ this.getHsmServerPublicCertificate() == null) return false;
        if (other.getHsmServerPublicCertificate() != null && other.getHsmServerPublicCertificate().equals(this.getHsmServerPublicCertificate()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateHsmConfigurationRequest clone() {
        
            return (CreateHsmConfigurationRequest) super.clone();
    }

}
    