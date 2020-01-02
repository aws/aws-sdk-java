/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a recommendation option for an Amazon EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/InstanceRecommendationOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceRecommendationOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance type of the instance recommendation.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the instance recommendation option.
     * </p>
     */
    private java.util.List<UtilizationMetric> projectedUtilizationMetrics;
    /**
     * <p>
     * The performance risk of the instance recommendation option.
     * </p>
     * <p>
     * Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of
     * your workload.
     * </p>
     * <p>
     * The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.
     * </p>
     */
    private Double performanceRisk;
    /**
     * <p>
     * The rank of the instance recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     */
    private Integer rank;

    /**
     * <p>
     * The instance type of the instance recommendation.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the instance recommendation.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the instance recommendation.
     * </p>
     * 
     * @return The instance type of the instance recommendation.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the instance recommendation.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the instance recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendationOption withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the instance recommendation option.
     * </p>
     * 
     * @return An array of objects that describe the projected utilization metrics of the instance recommendation
     *         option.
     */

    public java.util.List<UtilizationMetric> getProjectedUtilizationMetrics() {
        return projectedUtilizationMetrics;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the instance recommendation option.
     * </p>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the instance recommendation option.
     */

    public void setProjectedUtilizationMetrics(java.util.Collection<UtilizationMetric> projectedUtilizationMetrics) {
        if (projectedUtilizationMetrics == null) {
            this.projectedUtilizationMetrics = null;
            return;
        }

        this.projectedUtilizationMetrics = new java.util.ArrayList<UtilizationMetric>(projectedUtilizationMetrics);
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the instance recommendation option.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectedUtilizationMetrics(java.util.Collection)} or
     * {@link #withProjectedUtilizationMetrics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the instance recommendation option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendationOption withProjectedUtilizationMetrics(UtilizationMetric... projectedUtilizationMetrics) {
        if (this.projectedUtilizationMetrics == null) {
            setProjectedUtilizationMetrics(new java.util.ArrayList<UtilizationMetric>(projectedUtilizationMetrics.length));
        }
        for (UtilizationMetric ele : projectedUtilizationMetrics) {
            this.projectedUtilizationMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the instance recommendation option.
     * </p>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the instance recommendation option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendationOption withProjectedUtilizationMetrics(java.util.Collection<UtilizationMetric> projectedUtilizationMetrics) {
        setProjectedUtilizationMetrics(projectedUtilizationMetrics);
        return this;
    }

    /**
     * <p>
     * The performance risk of the instance recommendation option.
     * </p>
     * <p>
     * Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of
     * your workload.
     * </p>
     * <p>
     * The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.
     * </p>
     * 
     * @param performanceRisk
     *        The performance risk of the instance recommendation option.</p>
     *        <p>
     *        Performance risk is the likelihood of the recommended instance type not meeting the performance
     *        requirement of your workload.
     *        </p>
     *        <p>
     *        The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.
     */

    public void setPerformanceRisk(Double performanceRisk) {
        this.performanceRisk = performanceRisk;
    }

    /**
     * <p>
     * The performance risk of the instance recommendation option.
     * </p>
     * <p>
     * Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of
     * your workload.
     * </p>
     * <p>
     * The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.
     * </p>
     * 
     * @return The performance risk of the instance recommendation option.</p>
     *         <p>
     *         Performance risk is the likelihood of the recommended instance type not meeting the performance
     *         requirement of your workload.
     *         </p>
     *         <p>
     *         The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.
     */

    public Double getPerformanceRisk() {
        return this.performanceRisk;
    }

    /**
     * <p>
     * The performance risk of the instance recommendation option.
     * </p>
     * <p>
     * Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of
     * your workload.
     * </p>
     * <p>
     * The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.
     * </p>
     * 
     * @param performanceRisk
     *        The performance risk of the instance recommendation option.</p>
     *        <p>
     *        Performance risk is the likelihood of the recommended instance type not meeting the performance
     *        requirement of your workload.
     *        </p>
     *        <p>
     *        The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendationOption withPerformanceRisk(Double performanceRisk) {
        setPerformanceRisk(performanceRisk);
        return this;
    }

    /**
     * <p>
     * The rank of the instance recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @param rank
     *        The rank of the instance recommendation option.</p>
     *        <p>
     *        The top recommendation option is ranked as <code>1</code>.
     */

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>
     * The rank of the instance recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @return The rank of the instance recommendation option.</p>
     *         <p>
     *         The top recommendation option is ranked as <code>1</code>.
     */

    public Integer getRank() {
        return this.rank;
    }

    /**
     * <p>
     * The rank of the instance recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @param rank
     *        The rank of the instance recommendation option.</p>
     *        <p>
     *        The top recommendation option is ranked as <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendationOption withRank(Integer rank) {
        setRank(rank);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getProjectedUtilizationMetrics() != null)
            sb.append("ProjectedUtilizationMetrics: ").append(getProjectedUtilizationMetrics()).append(",");
        if (getPerformanceRisk() != null)
            sb.append("PerformanceRisk: ").append(getPerformanceRisk()).append(",");
        if (getRank() != null)
            sb.append("Rank: ").append(getRank());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceRecommendationOption == false)
            return false;
        InstanceRecommendationOption other = (InstanceRecommendationOption) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getProjectedUtilizationMetrics() == null ^ this.getProjectedUtilizationMetrics() == null)
            return false;
        if (other.getProjectedUtilizationMetrics() != null && other.getProjectedUtilizationMetrics().equals(this.getProjectedUtilizationMetrics()) == false)
            return false;
        if (other.getPerformanceRisk() == null ^ this.getPerformanceRisk() == null)
            return false;
        if (other.getPerformanceRisk() != null && other.getPerformanceRisk().equals(this.getPerformanceRisk()) == false)
            return false;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getProjectedUtilizationMetrics() == null) ? 0 : getProjectedUtilizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getPerformanceRisk() == null) ? 0 : getPerformanceRisk().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        return hashCode;
    }

    @Override
    public InstanceRecommendationOption clone() {
        try {
            return (InstanceRecommendationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.InstanceRecommendationOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
