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
 * A summary of a Trusted Advisor check result, including the alert status, last refresh, and number of resources examined.
 * </p>
 */
public class TrustedAdvisorCheckSummary implements Serializable {

    /**
     * The unique identifier for the Trusted Advisor check.
     */
    private String checkId;

    /**
     * The time of the last refresh of the check.
     */
    private String timestamp;

    /**
     * The alert status of the check: "ok" (green), "warning" (yellow),
     * "error" (red), or "not_available".
     */
    private String status;

    /**
     * Specifies whether the Trusted Advisor check has flagged resources.
     */
    private Boolean hasFlaggedResources;

    /**
     * Details about AWS resources that were analyzed in a call to Trusted
     * Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
     */
    private TrustedAdvisorResourcesSummary resourcesSummary;

    /**
     * Summary information that relates to the category of the check. Cost
     * Optimizing is the only category that is currently supported.
     */
    private TrustedAdvisorCategorySpecificSummary categorySpecificSummary;

    /**
     * The unique identifier for the Trusted Advisor check.
     *
     * @return The unique identifier for the Trusted Advisor check.
     */
    public String getCheckId() {
        return checkId;
    }
    
    /**
     * The unique identifier for the Trusted Advisor check.
     *
     * @param checkId The unique identifier for the Trusted Advisor check.
     */
    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }
    
    /**
     * The unique identifier for the Trusted Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checkId The unique identifier for the Trusted Advisor check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckSummary withCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }

    /**
     * The time of the last refresh of the check.
     *
     * @return The time of the last refresh of the check.
     */
    public String getTimestamp() {
        return timestamp;
    }
    
    /**
     * The time of the last refresh of the check.
     *
     * @param timestamp The time of the last refresh of the check.
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    
    /**
     * The time of the last refresh of the check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timestamp The time of the last refresh of the check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckSummary withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The alert status of the check: "ok" (green), "warning" (yellow),
     * "error" (red), or "not_available".
     *
     * @return The alert status of the check: "ok" (green), "warning" (yellow),
     *         "error" (red), or "not_available".
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The alert status of the check: "ok" (green), "warning" (yellow),
     * "error" (red), or "not_available".
     *
     * @param status The alert status of the check: "ok" (green), "warning" (yellow),
     *         "error" (red), or "not_available".
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The alert status of the check: "ok" (green), "warning" (yellow),
     * "error" (red), or "not_available".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The alert status of the check: "ok" (green), "warning" (yellow),
     *         "error" (red), or "not_available".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies whether the Trusted Advisor check has flagged resources.
     *
     * @return Specifies whether the Trusted Advisor check has flagged resources.
     */
    public Boolean isHasFlaggedResources() {
        return hasFlaggedResources;
    }
    
    /**
     * Specifies whether the Trusted Advisor check has flagged resources.
     *
     * @param hasFlaggedResources Specifies whether the Trusted Advisor check has flagged resources.
     */
    public void setHasFlaggedResources(Boolean hasFlaggedResources) {
        this.hasFlaggedResources = hasFlaggedResources;
    }
    
    /**
     * Specifies whether the Trusted Advisor check has flagged resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hasFlaggedResources Specifies whether the Trusted Advisor check has flagged resources.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckSummary withHasFlaggedResources(Boolean hasFlaggedResources) {
        this.hasFlaggedResources = hasFlaggedResources;
        return this;
    }

    /**
     * Specifies whether the Trusted Advisor check has flagged resources.
     *
     * @return Specifies whether the Trusted Advisor check has flagged resources.
     */
    public Boolean getHasFlaggedResources() {
        return hasFlaggedResources;
    }

    /**
     * Details about AWS resources that were analyzed in a call to Trusted
     * Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
     *
     * @return Details about AWS resources that were analyzed in a call to Trusted
     *         Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
     */
    public TrustedAdvisorResourcesSummary getResourcesSummary() {
        return resourcesSummary;
    }
    
    /**
     * Details about AWS resources that were analyzed in a call to Trusted
     * Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
     *
     * @param resourcesSummary Details about AWS resources that were analyzed in a call to Trusted
     *         Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
     */
    public void setResourcesSummary(TrustedAdvisorResourcesSummary resourcesSummary) {
        this.resourcesSummary = resourcesSummary;
    }
    
    /**
     * Details about AWS resources that were analyzed in a call to Trusted
     * Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourcesSummary Details about AWS resources that were analyzed in a call to Trusted
     *         Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckSummary withResourcesSummary(TrustedAdvisorResourcesSummary resourcesSummary) {
        this.resourcesSummary = resourcesSummary;
        return this;
    }

    /**
     * Summary information that relates to the category of the check. Cost
     * Optimizing is the only category that is currently supported.
     *
     * @return Summary information that relates to the category of the check. Cost
     *         Optimizing is the only category that is currently supported.
     */
    public TrustedAdvisorCategorySpecificSummary getCategorySpecificSummary() {
        return categorySpecificSummary;
    }
    
    /**
     * Summary information that relates to the category of the check. Cost
     * Optimizing is the only category that is currently supported.
     *
     * @param categorySpecificSummary Summary information that relates to the category of the check. Cost
     *         Optimizing is the only category that is currently supported.
     */
    public void setCategorySpecificSummary(TrustedAdvisorCategorySpecificSummary categorySpecificSummary) {
        this.categorySpecificSummary = categorySpecificSummary;
    }
    
    /**
     * Summary information that relates to the category of the check. Cost
     * Optimizing is the only category that is currently supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param categorySpecificSummary Summary information that relates to the category of the check. Cost
     *         Optimizing is the only category that is currently supported.
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
    