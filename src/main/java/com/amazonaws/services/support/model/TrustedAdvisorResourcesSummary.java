/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Details about AWS resources that were analyzed in a call to Trusted Advisor DescribeTrustedAdvisorCheckSummaries.
 * </p>
 */
public class TrustedAdvisorResourcesSummary implements Serializable {

    /**
     * The number of AWS resources that were analyzed by the Trusted Advisor
     * check.
     */
    private Long resourcesProcessed;

    /**
     * The number of AWS resources that were flagged (listed) by the Trusted
     * Advisor check.
     */
    private Long resourcesFlagged;

    /**
     * The number of AWS resources ignored by Trusted Advisor because
     * information was unavailable.
     */
    private Long resourcesIgnored;

    /**
     * The number of AWS resources ignored by Trusted Advisor because they
     * were marked as suppressed by the user.
     */
    private Long resourcesSuppressed;

    /**
     * The number of AWS resources that were analyzed by the Trusted Advisor
     * check.
     *
     * @return The number of AWS resources that were analyzed by the Trusted Advisor
     *         check.
     */
    public Long getResourcesProcessed() {
        return resourcesProcessed;
    }
    
    /**
     * The number of AWS resources that were analyzed by the Trusted Advisor
     * check.
     *
     * @param resourcesProcessed The number of AWS resources that were analyzed by the Trusted Advisor
     *         check.
     */
    public void setResourcesProcessed(Long resourcesProcessed) {
        this.resourcesProcessed = resourcesProcessed;
    }
    
    /**
     * The number of AWS resources that were analyzed by the Trusted Advisor
     * check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourcesProcessed The number of AWS resources that were analyzed by the Trusted Advisor
     *         check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorResourcesSummary withResourcesProcessed(Long resourcesProcessed) {
        this.resourcesProcessed = resourcesProcessed;
        return this;
    }

    /**
     * The number of AWS resources that were flagged (listed) by the Trusted
     * Advisor check.
     *
     * @return The number of AWS resources that were flagged (listed) by the Trusted
     *         Advisor check.
     */
    public Long getResourcesFlagged() {
        return resourcesFlagged;
    }
    
    /**
     * The number of AWS resources that were flagged (listed) by the Trusted
     * Advisor check.
     *
     * @param resourcesFlagged The number of AWS resources that were flagged (listed) by the Trusted
     *         Advisor check.
     */
    public void setResourcesFlagged(Long resourcesFlagged) {
        this.resourcesFlagged = resourcesFlagged;
    }
    
    /**
     * The number of AWS resources that were flagged (listed) by the Trusted
     * Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourcesFlagged The number of AWS resources that were flagged (listed) by the Trusted
     *         Advisor check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorResourcesSummary withResourcesFlagged(Long resourcesFlagged) {
        this.resourcesFlagged = resourcesFlagged;
        return this;
    }

    /**
     * The number of AWS resources ignored by Trusted Advisor because
     * information was unavailable.
     *
     * @return The number of AWS resources ignored by Trusted Advisor because
     *         information was unavailable.
     */
    public Long getResourcesIgnored() {
        return resourcesIgnored;
    }
    
    /**
     * The number of AWS resources ignored by Trusted Advisor because
     * information was unavailable.
     *
     * @param resourcesIgnored The number of AWS resources ignored by Trusted Advisor because
     *         information was unavailable.
     */
    public void setResourcesIgnored(Long resourcesIgnored) {
        this.resourcesIgnored = resourcesIgnored;
    }
    
    /**
     * The number of AWS resources ignored by Trusted Advisor because
     * information was unavailable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourcesIgnored The number of AWS resources ignored by Trusted Advisor because
     *         information was unavailable.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorResourcesSummary withResourcesIgnored(Long resourcesIgnored) {
        this.resourcesIgnored = resourcesIgnored;
        return this;
    }

    /**
     * The number of AWS resources ignored by Trusted Advisor because they
     * were marked as suppressed by the user.
     *
     * @return The number of AWS resources ignored by Trusted Advisor because they
     *         were marked as suppressed by the user.
     */
    public Long getResourcesSuppressed() {
        return resourcesSuppressed;
    }
    
    /**
     * The number of AWS resources ignored by Trusted Advisor because they
     * were marked as suppressed by the user.
     *
     * @param resourcesSuppressed The number of AWS resources ignored by Trusted Advisor because they
     *         were marked as suppressed by the user.
     */
    public void setResourcesSuppressed(Long resourcesSuppressed) {
        this.resourcesSuppressed = resourcesSuppressed;
    }
    
    /**
     * The number of AWS resources ignored by Trusted Advisor because they
     * were marked as suppressed by the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourcesSuppressed The number of AWS resources ignored by Trusted Advisor because they
     *         were marked as suppressed by the user.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorResourcesSummary withResourcesSuppressed(Long resourcesSuppressed) {
        this.resourcesSuppressed = resourcesSuppressed;
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
        if (getResourcesProcessed() != null) sb.append("ResourcesProcessed: " + getResourcesProcessed() + ",");
        if (getResourcesFlagged() != null) sb.append("ResourcesFlagged: " + getResourcesFlagged() + ",");
        if (getResourcesIgnored() != null) sb.append("ResourcesIgnored: " + getResourcesIgnored() + ",");
        if (getResourcesSuppressed() != null) sb.append("ResourcesSuppressed: " + getResourcesSuppressed() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourcesProcessed() == null) ? 0 : getResourcesProcessed().hashCode()); 
        hashCode = prime * hashCode + ((getResourcesFlagged() == null) ? 0 : getResourcesFlagged().hashCode()); 
        hashCode = prime * hashCode + ((getResourcesIgnored() == null) ? 0 : getResourcesIgnored().hashCode()); 
        hashCode = prime * hashCode + ((getResourcesSuppressed() == null) ? 0 : getResourcesSuppressed().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TrustedAdvisorResourcesSummary == false) return false;
        TrustedAdvisorResourcesSummary other = (TrustedAdvisorResourcesSummary)obj;
        
        if (other.getResourcesProcessed() == null ^ this.getResourcesProcessed() == null) return false;
        if (other.getResourcesProcessed() != null && other.getResourcesProcessed().equals(this.getResourcesProcessed()) == false) return false; 
        if (other.getResourcesFlagged() == null ^ this.getResourcesFlagged() == null) return false;
        if (other.getResourcesFlagged() != null && other.getResourcesFlagged().equals(this.getResourcesFlagged()) == false) return false; 
        if (other.getResourcesIgnored() == null ^ this.getResourcesIgnored() == null) return false;
        if (other.getResourcesIgnored() != null && other.getResourcesIgnored().equals(this.getResourcesIgnored()) == false) return false; 
        if (other.getResourcesSuppressed() == null ^ this.getResourcesSuppressed() == null) return false;
        if (other.getResourcesSuppressed() != null && other.getResourcesSuppressed().equals(this.getResourcesSuppressed()) == false) return false; 
        return true;
    }
    
}
    