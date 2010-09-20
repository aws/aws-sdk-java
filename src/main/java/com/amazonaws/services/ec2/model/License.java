/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A software license that can be associated with an Amazon EC2 instance
 * when launched (ex. a Microsoft Windows license).
 * </p>
 */
public class License {

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
    private java.util.List<LicenseCapacity> capacities;

    /**
     * A list of tags for the License.
     */
    private java.util.List<Tag> tags;

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
            capacities = new java.util.ArrayList<LicenseCapacity>();
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
        java.util.List<LicenseCapacity> capacitiesCopy = new java.util.ArrayList<LicenseCapacity>();
        if (capacities != null) {
            capacitiesCopy.addAll(capacities);
        }
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
        java.util.List<LicenseCapacity> capacitiesCopy = new java.util.ArrayList<LicenseCapacity>();
        if (capacities != null) {
            capacitiesCopy.addAll(capacities);
        }
        this.capacities = capacitiesCopy;

        return this;
    }
    
    /**
     * A list of tags for the License.
     *
     * @return A list of tags for the License.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new java.util.ArrayList<Tag>();
        }
        return tags;
    }
    
    /**
     * A list of tags for the License.
     *
     * @param tags A list of tags for the License.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
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
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
        this.tags = tagsCopy;

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
        sb.append("LicenseId: " + licenseId + ", ");
        sb.append("Type: " + type + ", ");
        sb.append("Pool: " + pool + ", ");
        sb.append("Capacities: " + capacities + ", ");
        sb.append("Tags: " + tags + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    