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
 * Reports the estimated monthly savings and percentage of monthly savings determined by the Trusted Advisor check for your account.
 * </p>
 */
public class TrustedAdvisorCostOptimizingSummary implements Serializable {

    /**
     * Reports the estimated monthly savings determined by the Trusted
     * Advisor check for your account.
     */
    private Double estimatedMonthlySavings;

    /**
     * Reports the estimated percentage of savings determined for your
     * account by the Trusted Advisor check.
     */
    private Double estimatedPercentMonthlySavings;

    /**
     * Reports the estimated monthly savings determined by the Trusted
     * Advisor check for your account.
     *
     * @return Reports the estimated monthly savings determined by the Trusted
     *         Advisor check for your account.
     */
    public Double getEstimatedMonthlySavings() {
        return estimatedMonthlySavings;
    }
    
    /**
     * Reports the estimated monthly savings determined by the Trusted
     * Advisor check for your account.
     *
     * @param estimatedMonthlySavings Reports the estimated monthly savings determined by the Trusted
     *         Advisor check for your account.
     */
    public void setEstimatedMonthlySavings(Double estimatedMonthlySavings) {
        this.estimatedMonthlySavings = estimatedMonthlySavings;
    }
    
    /**
     * Reports the estimated monthly savings determined by the Trusted
     * Advisor check for your account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param estimatedMonthlySavings Reports the estimated monthly savings determined by the Trusted
     *         Advisor check for your account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCostOptimizingSummary withEstimatedMonthlySavings(Double estimatedMonthlySavings) {
        this.estimatedMonthlySavings = estimatedMonthlySavings;
        return this;
    }

    /**
     * Reports the estimated percentage of savings determined for your
     * account by the Trusted Advisor check.
     *
     * @return Reports the estimated percentage of savings determined for your
     *         account by the Trusted Advisor check.
     */
    public Double getEstimatedPercentMonthlySavings() {
        return estimatedPercentMonthlySavings;
    }
    
    /**
     * Reports the estimated percentage of savings determined for your
     * account by the Trusted Advisor check.
     *
     * @param estimatedPercentMonthlySavings Reports the estimated percentage of savings determined for your
     *         account by the Trusted Advisor check.
     */
    public void setEstimatedPercentMonthlySavings(Double estimatedPercentMonthlySavings) {
        this.estimatedPercentMonthlySavings = estimatedPercentMonthlySavings;
    }
    
    /**
     * Reports the estimated percentage of savings determined for your
     * account by the Trusted Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param estimatedPercentMonthlySavings Reports the estimated percentage of savings determined for your
     *         account by the Trusted Advisor check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCostOptimizingSummary withEstimatedPercentMonthlySavings(Double estimatedPercentMonthlySavings) {
        this.estimatedPercentMonthlySavings = estimatedPercentMonthlySavings;
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
        if (getEstimatedMonthlySavings() != null) sb.append("EstimatedMonthlySavings: " + getEstimatedMonthlySavings() + ",");
        if (getEstimatedPercentMonthlySavings() != null) sb.append("EstimatedPercentMonthlySavings: " + getEstimatedPercentMonthlySavings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEstimatedMonthlySavings() == null) ? 0 : getEstimatedMonthlySavings().hashCode()); 
        hashCode = prime * hashCode + ((getEstimatedPercentMonthlySavings() == null) ? 0 : getEstimatedPercentMonthlySavings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TrustedAdvisorCostOptimizingSummary == false) return false;
        TrustedAdvisorCostOptimizingSummary other = (TrustedAdvisorCostOptimizingSummary)obj;
        
        if (other.getEstimatedMonthlySavings() == null ^ this.getEstimatedMonthlySavings() == null) return false;
        if (other.getEstimatedMonthlySavings() != null && other.getEstimatedMonthlySavings().equals(this.getEstimatedMonthlySavings()) == false) return false; 
        if (other.getEstimatedPercentMonthlySavings() == null ^ this.getEstimatedPercentMonthlySavings() == null) return false;
        if (other.getEstimatedPercentMonthlySavings() != null && other.getEstimatedPercentMonthlySavings().equals(this.getEstimatedPercentMonthlySavings()) == false) return false; 
        return true;
    }
    
}
    