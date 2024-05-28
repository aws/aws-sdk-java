/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the hourly metrics for the given recommendation over the lookback period.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/RecommendationDetailHourlyMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationDetailHourlyMetrics implements Serializable, Cloneable, StructuredPojo {

    private String startTime;
    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plan, over the length of the
     * lookback period.
     * </p>
     */
    private String estimatedOnDemandCost;
    /**
     * <p>
     * The current amount of Savings Plans eligible usage that the Savings Plan covered.
     * </p>
     */
    private String currentCoverage;
    /**
     * <p>
     * The estimated coverage amount based on the recommended Savings Plan.
     * </p>
     */
    private String estimatedCoverage;
    /**
     * <p>
     * The estimated utilization for the recommended Savings Plan.
     * </p>
     */
    private String estimatedNewCommitmentUtilization;

    /**
     * @param startTime
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @param startTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailHourlyMetrics withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plan, over the length of the
     * lookback period.
     * </p>
     * 
     * @param estimatedOnDemandCost
     *        The remaining On-Demand cost estimated to not be covered by the recommended Savings Plan, over the length
     *        of the lookback period.
     */

    public void setEstimatedOnDemandCost(String estimatedOnDemandCost) {
        this.estimatedOnDemandCost = estimatedOnDemandCost;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plan, over the length of the
     * lookback period.
     * </p>
     * 
     * @return The remaining On-Demand cost estimated to not be covered by the recommended Savings Plan, over the length
     *         of the lookback period.
     */

    public String getEstimatedOnDemandCost() {
        return this.estimatedOnDemandCost;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plan, over the length of the
     * lookback period.
     * </p>
     * 
     * @param estimatedOnDemandCost
     *        The remaining On-Demand cost estimated to not be covered by the recommended Savings Plan, over the length
     *        of the lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailHourlyMetrics withEstimatedOnDemandCost(String estimatedOnDemandCost) {
        setEstimatedOnDemandCost(estimatedOnDemandCost);
        return this;
    }

    /**
     * <p>
     * The current amount of Savings Plans eligible usage that the Savings Plan covered.
     * </p>
     * 
     * @param currentCoverage
     *        The current amount of Savings Plans eligible usage that the Savings Plan covered.
     */

    public void setCurrentCoverage(String currentCoverage) {
        this.currentCoverage = currentCoverage;
    }

    /**
     * <p>
     * The current amount of Savings Plans eligible usage that the Savings Plan covered.
     * </p>
     * 
     * @return The current amount of Savings Plans eligible usage that the Savings Plan covered.
     */

    public String getCurrentCoverage() {
        return this.currentCoverage;
    }

    /**
     * <p>
     * The current amount of Savings Plans eligible usage that the Savings Plan covered.
     * </p>
     * 
     * @param currentCoverage
     *        The current amount of Savings Plans eligible usage that the Savings Plan covered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailHourlyMetrics withCurrentCoverage(String currentCoverage) {
        setCurrentCoverage(currentCoverage);
        return this;
    }

    /**
     * <p>
     * The estimated coverage amount based on the recommended Savings Plan.
     * </p>
     * 
     * @param estimatedCoverage
     *        The estimated coverage amount based on the recommended Savings Plan.
     */

    public void setEstimatedCoverage(String estimatedCoverage) {
        this.estimatedCoverage = estimatedCoverage;
    }

    /**
     * <p>
     * The estimated coverage amount based on the recommended Savings Plan.
     * </p>
     * 
     * @return The estimated coverage amount based on the recommended Savings Plan.
     */

    public String getEstimatedCoverage() {
        return this.estimatedCoverage;
    }

    /**
     * <p>
     * The estimated coverage amount based on the recommended Savings Plan.
     * </p>
     * 
     * @param estimatedCoverage
     *        The estimated coverage amount based on the recommended Savings Plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailHourlyMetrics withEstimatedCoverage(String estimatedCoverage) {
        setEstimatedCoverage(estimatedCoverage);
        return this;
    }

    /**
     * <p>
     * The estimated utilization for the recommended Savings Plan.
     * </p>
     * 
     * @param estimatedNewCommitmentUtilization
     *        The estimated utilization for the recommended Savings Plan.
     */

    public void setEstimatedNewCommitmentUtilization(String estimatedNewCommitmentUtilization) {
        this.estimatedNewCommitmentUtilization = estimatedNewCommitmentUtilization;
    }

    /**
     * <p>
     * The estimated utilization for the recommended Savings Plan.
     * </p>
     * 
     * @return The estimated utilization for the recommended Savings Plan.
     */

    public String getEstimatedNewCommitmentUtilization() {
        return this.estimatedNewCommitmentUtilization;
    }

    /**
     * <p>
     * The estimated utilization for the recommended Savings Plan.
     * </p>
     * 
     * @param estimatedNewCommitmentUtilization
     *        The estimated utilization for the recommended Savings Plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailHourlyMetrics withEstimatedNewCommitmentUtilization(String estimatedNewCommitmentUtilization) {
        setEstimatedNewCommitmentUtilization(estimatedNewCommitmentUtilization);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEstimatedOnDemandCost() != null)
            sb.append("EstimatedOnDemandCost: ").append(getEstimatedOnDemandCost()).append(",");
        if (getCurrentCoverage() != null)
            sb.append("CurrentCoverage: ").append(getCurrentCoverage()).append(",");
        if (getEstimatedCoverage() != null)
            sb.append("EstimatedCoverage: ").append(getEstimatedCoverage()).append(",");
        if (getEstimatedNewCommitmentUtilization() != null)
            sb.append("EstimatedNewCommitmentUtilization: ").append(getEstimatedNewCommitmentUtilization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationDetailHourlyMetrics == false)
            return false;
        RecommendationDetailHourlyMetrics other = (RecommendationDetailHourlyMetrics) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEstimatedOnDemandCost() == null ^ this.getEstimatedOnDemandCost() == null)
            return false;
        if (other.getEstimatedOnDemandCost() != null && other.getEstimatedOnDemandCost().equals(this.getEstimatedOnDemandCost()) == false)
            return false;
        if (other.getCurrentCoverage() == null ^ this.getCurrentCoverage() == null)
            return false;
        if (other.getCurrentCoverage() != null && other.getCurrentCoverage().equals(this.getCurrentCoverage()) == false)
            return false;
        if (other.getEstimatedCoverage() == null ^ this.getEstimatedCoverage() == null)
            return false;
        if (other.getEstimatedCoverage() != null && other.getEstimatedCoverage().equals(this.getEstimatedCoverage()) == false)
            return false;
        if (other.getEstimatedNewCommitmentUtilization() == null ^ this.getEstimatedNewCommitmentUtilization() == null)
            return false;
        if (other.getEstimatedNewCommitmentUtilization() != null
                && other.getEstimatedNewCommitmentUtilization().equals(this.getEstimatedNewCommitmentUtilization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEstimatedOnDemandCost() == null) ? 0 : getEstimatedOnDemandCost().hashCode());
        hashCode = prime * hashCode + ((getCurrentCoverage() == null) ? 0 : getCurrentCoverage().hashCode());
        hashCode = prime * hashCode + ((getEstimatedCoverage() == null) ? 0 : getEstimatedCoverage().hashCode());
        hashCode = prime * hashCode + ((getEstimatedNewCommitmentUtilization() == null) ? 0 : getEstimatedNewCommitmentUtilization().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationDetailHourlyMetrics clone() {
        try {
            return (RecommendationDetailHourlyMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.RecommendationDetailHourlyMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
