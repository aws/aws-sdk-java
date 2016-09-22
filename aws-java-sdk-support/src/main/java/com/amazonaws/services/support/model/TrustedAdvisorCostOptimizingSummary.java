/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * The estimated cost savings that might be realized if the recommended actions are taken.
 * </p>
 */
public class TrustedAdvisorCostOptimizingSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The estimated monthly savings that might be realized if the recommended actions are taken.
     * </p>
     */
    private Double estimatedMonthlySavings;
    /**
     * <p>
     * The estimated percentage of savings that might be realized if the recommended actions are taken.
     * </p>
     */
    private Double estimatedPercentMonthlySavings;

    /**
     * <p>
     * The estimated monthly savings that might be realized if the recommended actions are taken.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        The estimated monthly savings that might be realized if the recommended actions are taken.
     */

    public void setEstimatedMonthlySavings(Double estimatedMonthlySavings) {
        this.estimatedMonthlySavings = estimatedMonthlySavings;
    }

    /**
     * <p>
     * The estimated monthly savings that might be realized if the recommended actions are taken.
     * </p>
     * 
     * @return The estimated monthly savings that might be realized if the recommended actions are taken.
     */

    public Double getEstimatedMonthlySavings() {
        return this.estimatedMonthlySavings;
    }

    /**
     * <p>
     * The estimated monthly savings that might be realized if the recommended actions are taken.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        The estimated monthly savings that might be realized if the recommended actions are taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCostOptimizingSummary withEstimatedMonthlySavings(Double estimatedMonthlySavings) {
        setEstimatedMonthlySavings(estimatedMonthlySavings);
        return this;
    }

    /**
     * <p>
     * The estimated percentage of savings that might be realized if the recommended actions are taken.
     * </p>
     * 
     * @param estimatedPercentMonthlySavings
     *        The estimated percentage of savings that might be realized if the recommended actions are taken.
     */

    public void setEstimatedPercentMonthlySavings(Double estimatedPercentMonthlySavings) {
        this.estimatedPercentMonthlySavings = estimatedPercentMonthlySavings;
    }

    /**
     * <p>
     * The estimated percentage of savings that might be realized if the recommended actions are taken.
     * </p>
     * 
     * @return The estimated percentage of savings that might be realized if the recommended actions are taken.
     */

    public Double getEstimatedPercentMonthlySavings() {
        return this.estimatedPercentMonthlySavings;
    }

    /**
     * <p>
     * The estimated percentage of savings that might be realized if the recommended actions are taken.
     * </p>
     * 
     * @param estimatedPercentMonthlySavings
     *        The estimated percentage of savings that might be realized if the recommended actions are taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCostOptimizingSummary withEstimatedPercentMonthlySavings(Double estimatedPercentMonthlySavings) {
        setEstimatedPercentMonthlySavings(estimatedPercentMonthlySavings);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEstimatedMonthlySavings() != null)
            sb.append("EstimatedMonthlySavings: " + getEstimatedMonthlySavings() + ",");
        if (getEstimatedPercentMonthlySavings() != null)
            sb.append("EstimatedPercentMonthlySavings: " + getEstimatedPercentMonthlySavings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedAdvisorCostOptimizingSummary == false)
            return false;
        TrustedAdvisorCostOptimizingSummary other = (TrustedAdvisorCostOptimizingSummary) obj;
        if (other.getEstimatedMonthlySavings() == null ^ this.getEstimatedMonthlySavings() == null)
            return false;
        if (other.getEstimatedMonthlySavings() != null && other.getEstimatedMonthlySavings().equals(this.getEstimatedMonthlySavings()) == false)
            return false;
        if (other.getEstimatedPercentMonthlySavings() == null ^ this.getEstimatedPercentMonthlySavings() == null)
            return false;
        if (other.getEstimatedPercentMonthlySavings() != null
                && other.getEstimatedPercentMonthlySavings().equals(this.getEstimatedPercentMonthlySavings()) == false)
            return false;
        return true;
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
    public TrustedAdvisorCostOptimizingSummary clone() {
        try {
            return (TrustedAdvisorCostOptimizingSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
