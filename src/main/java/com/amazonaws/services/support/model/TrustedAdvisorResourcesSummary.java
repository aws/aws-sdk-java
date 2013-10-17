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
 * JSON-formatted object that lists details about AWS resources that were analyzed in a call to Trusted Advisor <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckSummaries.html"> DescribeTrustedAdvisorCheckSummaries
 * </a> .
 * </p>
 */
public class TrustedAdvisorResourcesSummary implements Serializable {

    /**
     * Reports the number of AWS resources that were analyzed in your Trusted
     * Advisor check.
     */
    private Long resourcesProcessed;

    /**
     * Reports the number of AWS resources that were flagged in your Trusted
     * Advisor check.
     */
    private Long resourcesFlagged;

    /**
     * Indicates the number of resources ignored by Trusted Advisor due to
     * unavailability of information.
     */
    private Long resourcesIgnored;

    /**
     * Indicates whether the specified AWS resource has had its participation
     * in Trusted Advisor checks suppressed.
     */
    private Long resourcesSuppressed;

    /**
     * Reports the number of AWS resources that were analyzed in your Trusted
     * Advisor check.
     *
     * @return Reports the number of AWS resources that were analyzed in your Trusted
     *         Advisor check.
     */
    public Long getResourcesProcessed() {
        return resourcesProcessed;
    }
    
    /**
     * Reports the number of AWS resources that were analyzed in your Trusted
     * Advisor check.
     *
     * @param resourcesProcessed Reports the number of AWS resources that were analyzed in your Trusted
     *         Advisor check.
     */
    public void setResourcesProcessed(Long resourcesProcessed) {
        this.resourcesProcessed = resourcesProcessed;
    }
    
    /**
     * Reports the number of AWS resources that were analyzed in your Trusted
     * Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourcesProcessed Reports the number of AWS resources that were analyzed in your Trusted
     *         Advisor check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorResourcesSummary withResourcesProcessed(Long resourcesProcessed) {
        this.resourcesProcessed = resourcesProcessed;
        return this;
    }

    /**
     * Reports the number of AWS resources that were flagged in your Trusted
     * Advisor check.
     *
     * @return Reports the number of AWS resources that were flagged in your Trusted
     *         Advisor check.
     */
    public Long getResourcesFlagged() {
        return resourcesFlagged;
    }
    
    /**
     * Reports the number of AWS resources that were flagged in your Trusted
     * Advisor check.
     *
     * @param resourcesFlagged Reports the number of AWS resources that were flagged in your Trusted
     *         Advisor check.
     */
    public void setResourcesFlagged(Long resourcesFlagged) {
        this.resourcesFlagged = resourcesFlagged;
    }
    
    /**
     * Reports the number of AWS resources that were flagged in your Trusted
     * Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourcesFlagged Reports the number of AWS resources that were flagged in your Trusted
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
     * Indicates the number of resources ignored by Trusted Advisor due to
     * unavailability of information.
     *
     * @return Indicates the number of resources ignored by Trusted Advisor due to
     *         unavailability of information.
     */
    public Long getResourcesIgnored() {
        return resourcesIgnored;
    }
    
    /**
     * Indicates the number of resources ignored by Trusted Advisor due to
     * unavailability of information.
     *
     * @param resourcesIgnored Indicates the number of resources ignored by Trusted Advisor due to
     *         unavailability of information.
     */
    public void setResourcesIgnored(Long resourcesIgnored) {
        this.resourcesIgnored = resourcesIgnored;
    }
    
    /**
     * Indicates the number of resources ignored by Trusted Advisor due to
     * unavailability of information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourcesIgnored Indicates the number of resources ignored by Trusted Advisor due to
     *         unavailability of information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorResourcesSummary withResourcesIgnored(Long resourcesIgnored) {
        this.resourcesIgnored = resourcesIgnored;
        return this;
    }

    /**
     * Indicates whether the specified AWS resource has had its participation
     * in Trusted Advisor checks suppressed.
     *
     * @return Indicates whether the specified AWS resource has had its participation
     *         in Trusted Advisor checks suppressed.
     */
    public Long getResourcesSuppressed() {
        return resourcesSuppressed;
    }
    
    /**
     * Indicates whether the specified AWS resource has had its participation
     * in Trusted Advisor checks suppressed.
     *
     * @param resourcesSuppressed Indicates whether the specified AWS resource has had its participation
     *         in Trusted Advisor checks suppressed.
     */
    public void setResourcesSuppressed(Long resourcesSuppressed) {
        this.resourcesSuppressed = resourcesSuppressed;
    }
    
    /**
     * Indicates whether the specified AWS resource has had its participation
     * in Trusted Advisor checks suppressed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourcesSuppressed Indicates whether the specified AWS resource has had its participation
     *         in Trusted Advisor checks suppressed.
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
    