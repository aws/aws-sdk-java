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
 * JSON-formatted child object of <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckResult.html">
 * TrustedAdvisorCheckResult </a> objects.
 * </p>
 */
public class TrustedAdvisorCategorySpecificSummary implements Serializable {

    /**
     * Corresponds to the <i>Cost Optimizing</i> tab on the AWS Support
     * Center Trusted Advisor page. This field is only available to checks in
     * the Cost Optimizing category.
     */
    private TrustedAdvisorCostOptimizingSummary costOptimizing;

    /**
     * Corresponds to the <i>Cost Optimizing</i> tab on the AWS Support
     * Center Trusted Advisor page. This field is only available to checks in
     * the Cost Optimizing category.
     *
     * @return Corresponds to the <i>Cost Optimizing</i> tab on the AWS Support
     *         Center Trusted Advisor page. This field is only available to checks in
     *         the Cost Optimizing category.
     */
    public TrustedAdvisorCostOptimizingSummary getCostOptimizing() {
        return costOptimizing;
    }
    
    /**
     * Corresponds to the <i>Cost Optimizing</i> tab on the AWS Support
     * Center Trusted Advisor page. This field is only available to checks in
     * the Cost Optimizing category.
     *
     * @param costOptimizing Corresponds to the <i>Cost Optimizing</i> tab on the AWS Support
     *         Center Trusted Advisor page. This field is only available to checks in
     *         the Cost Optimizing category.
     */
    public void setCostOptimizing(TrustedAdvisorCostOptimizingSummary costOptimizing) {
        this.costOptimizing = costOptimizing;
    }
    
    /**
     * Corresponds to the <i>Cost Optimizing</i> tab on the AWS Support
     * Center Trusted Advisor page. This field is only available to checks in
     * the Cost Optimizing category.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param costOptimizing Corresponds to the <i>Cost Optimizing</i> tab on the AWS Support
     *         Center Trusted Advisor page. This field is only available to checks in
     *         the Cost Optimizing category.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCategorySpecificSummary withCostOptimizing(TrustedAdvisorCostOptimizingSummary costOptimizing) {
        this.costOptimizing = costOptimizing;
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
        if (getCostOptimizing() != null) sb.append("CostOptimizing: " + getCostOptimizing() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCostOptimizing() == null) ? 0 : getCostOptimizing().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TrustedAdvisorCategorySpecificSummary == false) return false;
        TrustedAdvisorCategorySpecificSummary other = (TrustedAdvisorCategorySpecificSummary)obj;
        
        if (other.getCostOptimizing() == null ^ this.getCostOptimizing() == null) return false;
        if (other.getCostOptimizing() != null && other.getCostOptimizing().equals(this.getCostOptimizing()) == false) return false; 
        return true;
    }
    
}
    