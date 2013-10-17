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
package com.amazonaws.services.support.model;

import java.io.Serializable;


/**
 * <p>
 * Description of each check returned by <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html">
 * DescribeTrustedAdvisorChecks </a> .
 * </p>
 */
public class TrustedAdvisorCheckDescription implements Serializable {

    /**
     * Unique identifier for a specific Trusted Advisor check description.
     */
    private String id;

    /**
     * Display name for the Trusted Advisor check. Corresponds to the display
     * name for the check in the Trusted Advisor user interface.
     */
    private String name;

    /**
     * Description of the Trusted Advisor check.
     */
    private String description;

    /**
     * Category to which the Trusted Advisor check belongs.
     */
    private String category;

    /**
     * List of metadata returned in <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorResourceDetail.html"
     * title="TrustedAdvisorResourceDetail">TrustedAdvisorResourceDetail</a>
     * objects for a Trusted Advisor check.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> metadata;

    /**
     * Unique identifier for a specific Trusted Advisor check description.
     *
     * @return Unique identifier for a specific Trusted Advisor check description.
     */
    public String getId() {
        return id;
    }
    
    /**
     * Unique identifier for a specific Trusted Advisor check description.
     *
     * @param id Unique identifier for a specific Trusted Advisor check description.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Unique identifier for a specific Trusted Advisor check description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id Unique identifier for a specific Trusted Advisor check description.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckDescription withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Display name for the Trusted Advisor check. Corresponds to the display
     * name for the check in the Trusted Advisor user interface.
     *
     * @return Display name for the Trusted Advisor check. Corresponds to the display
     *         name for the check in the Trusted Advisor user interface.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Display name for the Trusted Advisor check. Corresponds to the display
     * name for the check in the Trusted Advisor user interface.
     *
     * @param name Display name for the Trusted Advisor check. Corresponds to the display
     *         name for the check in the Trusted Advisor user interface.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Display name for the Trusted Advisor check. Corresponds to the display
     * name for the check in the Trusted Advisor user interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name Display name for the Trusted Advisor check. Corresponds to the display
     *         name for the check in the Trusted Advisor user interface.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Description of the Trusted Advisor check.
     *
     * @return Description of the Trusted Advisor check.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Description of the Trusted Advisor check.
     *
     * @param description Description of the Trusted Advisor check.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Description of the Trusted Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description Description of the Trusted Advisor check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckDescription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Category to which the Trusted Advisor check belongs.
     *
     * @return Category to which the Trusted Advisor check belongs.
     */
    public String getCategory() {
        return category;
    }
    
    /**
     * Category to which the Trusted Advisor check belongs.
     *
     * @param category Category to which the Trusted Advisor check belongs.
     */
    public void setCategory(String category) {
        this.category = category;
    }
    
    /**
     * Category to which the Trusted Advisor check belongs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param category Category to which the Trusted Advisor check belongs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckDescription withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * List of metadata returned in <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorResourceDetail.html"
     * title="TrustedAdvisorResourceDetail">TrustedAdvisorResourceDetail</a>
     * objects for a Trusted Advisor check.
     *
     * @return List of metadata returned in <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorResourceDetail.html"
     *         title="TrustedAdvisorResourceDetail">TrustedAdvisorResourceDetail</a>
     *         objects for a Trusted Advisor check.
     */
    public java.util.List<String> getMetadata() {
        if (metadata == null) {
              metadata = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              metadata.setAutoConstruct(true);
        }
        return metadata;
    }
    
    /**
     * List of metadata returned in <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorResourceDetail.html"
     * title="TrustedAdvisorResourceDetail">TrustedAdvisorResourceDetail</a>
     * objects for a Trusted Advisor check.
     *
     * @param metadata List of metadata returned in <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorResourceDetail.html"
     *         title="TrustedAdvisorResourceDetail">TrustedAdvisorResourceDetail</a>
     *         objects for a Trusted Advisor check.
     */
    public void setMetadata(java.util.Collection<String> metadata) {
        if (metadata == null) {
            this.metadata = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> metadataCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(metadata.size());
        metadataCopy.addAll(metadata);
        this.metadata = metadataCopy;
    }
    
    /**
     * List of metadata returned in <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorResourceDetail.html"
     * title="TrustedAdvisorResourceDetail">TrustedAdvisorResourceDetail</a>
     * objects for a Trusted Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metadata List of metadata returned in <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorResourceDetail.html"
     *         title="TrustedAdvisorResourceDetail">TrustedAdvisorResourceDetail</a>
     *         objects for a Trusted Advisor check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckDescription withMetadata(String... metadata) {
        if (getMetadata() == null) setMetadata(new java.util.ArrayList<String>(metadata.length));
        for (String value : metadata) {
            getMetadata().add(value);
        }
        return this;
    }
    
    /**
     * List of metadata returned in <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorResourceDetail.html"
     * title="TrustedAdvisorResourceDetail">TrustedAdvisorResourceDetail</a>
     * objects for a Trusted Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metadata List of metadata returned in <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorResourceDetail.html"
     *         title="TrustedAdvisorResourceDetail">TrustedAdvisorResourceDetail</a>
     *         objects for a Trusted Advisor check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckDescription withMetadata(java.util.Collection<String> metadata) {
        if (metadata == null) {
            this.metadata = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> metadataCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(metadata.size());
            metadataCopy.addAll(metadata);
            this.metadata = metadataCopy;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getCategory() != null) sb.append("Category: " + getCategory() + ",");
        if (getMetadata() != null) sb.append("Metadata: " + getMetadata() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode()); 
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TrustedAdvisorCheckDescription == false) return false;
        TrustedAdvisorCheckDescription other = (TrustedAdvisorCheckDescription)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getCategory() == null ^ this.getCategory() == null) return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false) return false; 
        if (other.getMetadata() == null ^ this.getMetadata() == null) return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false) return false; 
        return true;
    }
    
}
    