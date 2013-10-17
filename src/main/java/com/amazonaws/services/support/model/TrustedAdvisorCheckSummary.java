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
 * Reports a summary of the Trusted Advisor check. This object contains the following child objects that report summary information about specific checks
 * by category and resource:
 * </p>
 * 
 * <ul>
 * <li> <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCategorySpecificSummary.html">
 * TrustedAdvisorCategorySpecificSummary </a> </li>
 * <li> <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorResourcesSummary.html"> TrustedAdvisorResourcesSummary </a>
 * </li>
 * 
 * </ul>
 */
public class TrustedAdvisorCheckSummary implements Serializable {

    /**
     * Unique identifier for a Trusted Advisor check.
     */
    private String checkId;

    /**
     * 
     */
    private String timestamp;

    /**
     * Overall status of the Trusted Advisor check.
     */
    private String status;

    /**
     * Indicates that the Trusted Advisor check returned flagged resources.
     */
    private Boolean hasFlaggedResources;

    /**
     * JSON-formatted object that lists details about AWS resources that were
     * analyzed in a call to Trusted Advisor <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckSummaries.html"
     * title="DescribeTrustedAdvisorCheckSummaries">DescribeTrustedAdvisorCheckSummaries</a>.
     */
    private TrustedAdvisorResourcesSummary resourcesSummary;

    /**
     * Reports the results of a Trusted Advisor check by category. Only
     * <i>Cost Optimizing</i> is currently supported.
     */
    private TrustedAdvisorCategorySpecificSummary categorySpecificSummary;

    /**
     * Unique identifier for a Trusted Advisor check.
     *
     * @return Unique identifier for a Trusted Advisor check.
     */
    public String getCheckId() {
        return checkId;
    }
    
    /**
     * Unique identifier for a Trusted Advisor check.
     *
     * @param checkId Unique identifier for a Trusted Advisor check.
     */
    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }
    
    /**
     * Unique identifier for a Trusted Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checkId Unique identifier for a Trusted Advisor check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckSummary withCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }

    /**
     * 
     *
     * @return 
     */
    public String getTimestamp() {
        return timestamp;
    }
    
    /**
     * 
     *
     * @param timestamp 
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timestamp 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckSummary withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Overall status of the Trusted Advisor check.
     *
     * @return Overall status of the Trusted Advisor check.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Overall status of the Trusted Advisor check.
     *
     * @param status Overall status of the Trusted Advisor check.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Overall status of the Trusted Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Overall status of the Trusted Advisor check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Indicates that the Trusted Advisor check returned flagged resources.
     *
     * @return Indicates that the Trusted Advisor check returned flagged resources.
     */
    public Boolean isHasFlaggedResources() {
        return hasFlaggedResources;
    }
    
    /**
     * Indicates that the Trusted Advisor check returned flagged resources.
     *
     * @param hasFlaggedResources Indicates that the Trusted Advisor check returned flagged resources.
     */
    public void setHasFlaggedResources(Boolean hasFlaggedResources) {
        this.hasFlaggedResources = hasFlaggedResources;
    }
    
    /**
     * Indicates that the Trusted Advisor check returned flagged resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hasFlaggedResources Indicates that the Trusted Advisor check returned flagged resources.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckSummary withHasFlaggedResources(Boolean hasFlaggedResources) {
        this.hasFlaggedResources = hasFlaggedResources;
        return this;
    }

    /**
     * Indicates that the Trusted Advisor check returned flagged resources.
     *
     * @return Indicates that the Trusted Advisor check returned flagged resources.
     */
    public Boolean getHasFlaggedResources() {
        return hasFlaggedResources;
    }

    /**
     * JSON-formatted object that lists details about AWS resources that were
     * analyzed in a call to Trusted Advisor <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckSummaries.html"
     * title="DescribeTrustedAdvisorCheckSummaries">DescribeTrustedAdvisorCheckSummaries</a>.
     *
     * @return JSON-formatted object that lists details about AWS resources that were
     *         analyzed in a call to Trusted Advisor <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckSummaries.html"
     *         title="DescribeTrustedAdvisorCheckSummaries">DescribeTrustedAdvisorCheckSummaries</a>.
     */
    public TrustedAdvisorResourcesSummary getResourcesSummary() {
        return resourcesSummary;
    }
    
    /**
     * JSON-formatted object that lists details about AWS resources that were
     * analyzed in a call to Trusted Advisor <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckSummaries.html"
     * title="DescribeTrustedAdvisorCheckSummaries">DescribeTrustedAdvisorCheckSummaries</a>.
     *
     * @param resourcesSummary JSON-formatted object that lists details about AWS resources that were
     *         analyzed in a call to Trusted Advisor <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckSummaries.html"
     *         title="DescribeTrustedAdvisorCheckSummaries">DescribeTrustedAdvisorCheckSummaries</a>.
     */
    public void setResourcesSummary(TrustedAdvisorResourcesSummary resourcesSummary) {
        this.resourcesSummary = resourcesSummary;
    }
    
    /**
     * JSON-formatted object that lists details about AWS resources that were
     * analyzed in a call to Trusted Advisor <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckSummaries.html"
     * title="DescribeTrustedAdvisorCheckSummaries">DescribeTrustedAdvisorCheckSummaries</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourcesSummary JSON-formatted object that lists details about AWS resources that were
     *         analyzed in a call to Trusted Advisor <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckSummaries.html"
     *         title="DescribeTrustedAdvisorCheckSummaries">DescribeTrustedAdvisorCheckSummaries</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckSummary withResourcesSummary(TrustedAdvisorResourcesSummary resourcesSummary) {
        this.resourcesSummary = resourcesSummary;
        return this;
    }

    /**
     * Reports the results of a Trusted Advisor check by category. Only
     * <i>Cost Optimizing</i> is currently supported.
     *
     * @return Reports the results of a Trusted Advisor check by category. Only
     *         <i>Cost Optimizing</i> is currently supported.
     */
    public TrustedAdvisorCategorySpecificSummary getCategorySpecificSummary() {
        return categorySpecificSummary;
    }
    
    /**
     * Reports the results of a Trusted Advisor check by category. Only
     * <i>Cost Optimizing</i> is currently supported.
     *
     * @param categorySpecificSummary Reports the results of a Trusted Advisor check by category. Only
     *         <i>Cost Optimizing</i> is currently supported.
     */
    public void setCategorySpecificSummary(TrustedAdvisorCategorySpecificSummary categorySpecificSummary) {
        this.categorySpecificSummary = categorySpecificSummary;
    }
    
    /**
     * Reports the results of a Trusted Advisor check by category. Only
     * <i>Cost Optimizing</i> is currently supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param categorySpecificSummary Reports the results of a Trusted Advisor check by category. Only
     *         <i>Cost Optimizing</i> is currently supported.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckSummary withCategorySpecificSummary(TrustedAdvisorCategorySpecificSummary categorySpecificSummary) {
        this.categorySpecificSummary = categorySpecificSummary;
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
        if (getCheckId() != null) sb.append("CheckId: " + getCheckId() + ",");
        if (getTimestamp() != null) sb.append("Timestamp: " + getTimestamp() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (isHasFlaggedResources() != null) sb.append("HasFlaggedResources: " + isHasFlaggedResources() + ",");
        if (getResourcesSummary() != null) sb.append("ResourcesSummary: " + getResourcesSummary() + ",");
        if (getCategorySpecificSummary() != null) sb.append("CategorySpecificSummary: " + getCategorySpecificSummary() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCheckId() == null) ? 0 : getCheckId().hashCode()); 
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((isHasFlaggedResources() == null) ? 0 : isHasFlaggedResources().hashCode()); 
        hashCode = prime * hashCode + ((getResourcesSummary() == null) ? 0 : getResourcesSummary().hashCode()); 
        hashCode = prime * hashCode + ((getCategorySpecificSummary() == null) ? 0 : getCategorySpecificSummary().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TrustedAdvisorCheckSummary == false) return false;
        TrustedAdvisorCheckSummary other = (TrustedAdvisorCheckSummary)obj;
        
        if (other.getCheckId() == null ^ this.getCheckId() == null) return false;
        if (other.getCheckId() != null && other.getCheckId().equals(this.getCheckId()) == false) return false; 
        if (other.getTimestamp() == null ^ this.getTimestamp() == null) return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.isHasFlaggedResources() == null ^ this.isHasFlaggedResources() == null) return false;
        if (other.isHasFlaggedResources() != null && other.isHasFlaggedResources().equals(this.isHasFlaggedResources()) == false) return false; 
        if (other.getResourcesSummary() == null ^ this.getResourcesSummary() == null) return false;
        if (other.getResourcesSummary() != null && other.getResourcesSummary().equals(this.getResourcesSummary()) == false) return false; 
        if (other.getCategorySpecificSummary() == null ^ this.getCategorySpecificSummary() == null) return false;
        if (other.getCategorySpecificSummary() != null && other.getCategorySpecificSummary().equals(this.getCategorySpecificSummary()) == false) return false; 
        return true;
    }
    
}
    