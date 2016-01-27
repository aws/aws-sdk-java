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
 * Returns information about an HSM configuration, which is an object
 * that describes to Amazon Redshift clusters the information they
 * require to connect to an HSM where they can store database encryption
 * keys.
 * </p>
 */
public class HsmConfiguration implements Serializable, Cloneable {

    /**
     * The name of the Amazon Redshift HSM configuration.
     */
    private String hsmConfigurationIdentifier;

    /**
     * A text description of the HSM configuration.
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
     * The list of tags for the HSM configuration.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The name of the Amazon Redshift HSM configuration.
     *
     * @return The name of the Amazon Redshift HSM configuration.
     */
    public String getHsmConfigurationIdentifier() {
        return hsmConfigurationIdentifier;
    }
    
    /**
     * The name of the Amazon Redshift HSM configuration.
     *
     * @param hsmConfigurationIdentifier The name of the Amazon Redshift HSM configuration.
     */
    public void setHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }
    
    /**
     * The name of the Amazon Redshift HSM configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmConfigurationIdentifier The name of the Amazon Redshift HSM configuration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HsmConfiguration withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
        return this;
    }

    /**
     * A text description of the HSM configuration.
     *
     * @return A text description of the HSM configuration.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A text description of the HSM configuration.
     *
     * @param description A text description of the HSM configuration.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A text description of the HSM configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A text description of the HSM configuration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HsmConfiguration withDescription(String description) {
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
    public HsmConfiguration withHsmIpAddress(String hsmIpAddress) {
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
    public HsmConfiguration withHsmPartitionName(String hsmPartitionName) {
        this.hsmPartitionName = hsmPartitionName;
        return this;
    }

    /**
     * The list of tags for the HSM configuration.
     *
     * @return The list of tags for the HSM configuration.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * The list of tags for the HSM configuration.
     *
     * @param tags The list of tags for the HSM configuration.
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
     * The list of tags for the HSM configuration.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The list of tags for the HSM configuration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HsmConfiguration withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * The list of tags for the HSM configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The list of tags for the HSM configuration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HsmConfiguration withTags(java.util.Collection<Tag> tags) {
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HsmConfiguration == false) return false;
        HsmConfiguration other = (HsmConfiguration)obj;
        
        if (other.getHsmConfigurationIdentifier() == null ^ this.getHsmConfigurationIdentifier() == null) return false;
        if (other.getHsmConfigurationIdentifier() != null && other.getHsmConfigurationIdentifier().equals(this.getHsmConfigurationIdentifier()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getHsmIpAddress() == null ^ this.getHsmIpAddress() == null) return false;
        if (other.getHsmIpAddress() != null && other.getHsmIpAddress().equals(this.getHsmIpAddress()) == false) return false; 
        if (other.getHsmPartitionName() == null ^ this.getHsmPartitionName() == null) return false;
        if (other.getHsmPartitionName() != null && other.getHsmPartitionName().equals(this.getHsmPartitionName()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public HsmConfiguration clone() {
        try {
            return (HsmConfiguration) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    