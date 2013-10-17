/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * A software license that can be associated with an Amazon EC2 instance when launched (ex. a Microsoft Windows license).
 * </p>
 */
public class License implements Serializable {

    /**
     * The unique ID identifying the license.
     */
    private String licenseId;

    /**
     * The license type (ex. "Microsoft/Windows/Standard").
     */
    private String type;

    /**
     * The name of the pool in which the license is kept.
     */
    private String pool;

    /**
     * The capacities available for this license, indicating how many
     * licenses are in use, how many are available, how many Amazon EC2
     * instances can be supported, etc.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LicenseCapacity> capacities;

    /**
     * A list of tags for the License.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The unique ID identifying the license.
     *
     * @return The unique ID identifying the license.
     */
    public String getLicenseId() {
        return licenseId;
    }
    
    /**
     * The unique ID identifying the license.
     *
     * @param licenseId The unique ID identifying the license.
     */
    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }
    
    /**
     * The unique ID identifying the license.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseId The unique ID identifying the license.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public License withLicenseId(String licenseId) {
        this.licenseId = licenseId;
        return this;
    }

    /**
     * The license type (ex. "Microsoft/Windows/Standard").
     *
     * @return The license type (ex. "Microsoft/Windows/Standard").
     */
    public String getType() {
        return type;
    }
    
    /**
     * The license type (ex. "Microsoft/Windows/Standard").
     *
     * @param type The license type (ex. "Microsoft/Windows/Standard").
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The license type (ex. "Microsoft/Windows/Standard").
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The license type (ex. "Microsoft/Windows/Standard").
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public License withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The name of the pool in which the license is kept.
     *
     * @return The name of the pool in which the license is kept.
     */
    public String getPool() {
        return pool;
    }
    
    /**
     * The name of the pool in which the license is kept.
     *
     * @param pool The name of the pool in which the license is kept.
     */
    public void setPool(String pool) {
        this.pool = pool;
    }
    
    /**
     * The name of the pool in which the license is kept.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pool The name of the pool in which the license is kept.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public License withPool(String pool) {
        this.pool = pool;
        return this;
    }

    /**
     * The capacities available for this license, indicating how many
     * licenses are in use, how many are available, how many Amazon EC2
     * instances can be supported, etc.
     *
     * @return The capacities available for this license, indicating how many
     *         licenses are in use, how many are available, how many Amazon EC2
     *         instances can be supported, etc.
     */
    public java.util.List<LicenseCapacity> getCapacities() {
        if (capacities == null) {
              capacities = new com.amazonaws.internal.ListWithAutoConstructFlag<LicenseCapacity>();
              capacities.setAutoConstruct(true);
        }
        return capacities;
    }
    
    /**
     * The capacities available for this license, indicating how many
     * licenses are in use, how many are available, how many Amazon EC2
     * instances can be supported, etc.
     *
     * @param capacities The capacities available for this license, indicating how many
     *         licenses are in use, how many are available, how many Amazon EC2
     *         instances can be supported, etc.
     */
    public void setCapacities(java.util.Collection<LicenseCapacity> capacities) {
        if (capacities == null) {
            this.capacities = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LicenseCapacity> capacitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LicenseCapacity>(capacities.size());
        capacitiesCopy.addAll(capacities);
        this.capacities = capacitiesCopy;
    }
    
    /**
     * The capacities available for this license, indicating how many
     * licenses are in use, how many are available, how many Amazon EC2
     * instances can be supported, etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capacities The capacities available for this license, indicating how many
     *         licenses are in use, how many are available, how many Amazon EC2
     *         instances can be supported, etc.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public License withCapacities(LicenseCapacity... capacities) {
        if (getCapacities() == null) setCapacities(new java.util.ArrayList<LicenseCapacity>(capacities.length));
        for (LicenseCapacity value : capacities) {
            getCapacities().add(value);
        }
        return this;
    }
    
    /**
     * The capacities available for this license, indicating how many
     * licenses are in use, how many are available, how many Amazon EC2
     * instances can be supported, etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capacities The capacities available for this license, indicating how many
     *         licenses are in use, how many are available, how many Amazon EC2
     *         instances can be supported, etc.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public License withCapacities(java.util.Collection<LicenseCapacity> capacities) {
        if (capacities == null) {
            this.capacities = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LicenseCapacity> capacitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LicenseCapacity>(capacities.size());
            capacitiesCopy.addAll(capacities);
            this.capacities = capacitiesCopy;
        }

        return this;
    }

    /**
     * A list of tags for the License.
     *
     * @return A list of tags for the License.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags for the License.
     *
     * @param tags A list of tags for the License.
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
     * A list of tags for the License.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the License.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public License withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags for the License.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the License.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public License withTags(java.util.Collection<Tag> tags) {
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
        if (getLicenseId() != null) sb.append("LicenseId: " + getLicenseId() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getPool() != null) sb.append("Pool: " + getPool() + ",");
        if (getCapacities() != null) sb.append("Capacities: " + getCapacities() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLicenseId() == null) ? 0 : getLicenseId().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getPool() == null) ? 0 : getPool().hashCode()); 
        hashCode = prime * hashCode + ((getCapacities() == null) ? 0 : getCapacities().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof License == false) return false;
        License other = (License)obj;
        
        if (other.getLicenseId() == null ^ this.getLicenseId() == null) return false;
        if (other.getLicenseId() != null && other.getLicenseId().equals(this.getLicenseId()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getPool() == null ^ this.getPool() == null) return false;
        if (other.getPool() != null && other.getPool().equals(this.getPool()) == false) return false; 
        if (other.getCapacities() == null ^ this.getCapacities() == null) return false;
        if (other.getCapacities() != null && other.getCapacities().equals(this.getCapacities()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    