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
 * Describes a recommendation option for an AWS Lambda function.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/LambdaFunctionMemoryRecommendationOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionMemoryRecommendationOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rank of the function recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     */
    private Integer rank;
    /**
     * <p>
     * The memory size, in MB, of the function recommendation option.
     * </p>
     */
    private Integer memorySize;
    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the function recommendation option.
     * </p>
     */
    private java.util.List<LambdaFunctionMemoryProjectedMetric> projectedUtilizationMetrics;

    /**
     * <p>
     * The rank of the function recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @param rank
     *        The rank of the function recommendation option.</p>
     *        <p>
     *        The top recommendation option is ranked as <code>1</code>.
     */

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>
     * The rank of the function recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @return The rank of the function recommendation option.</p>
     *         <p>
     *         The top recommendation option is ranked as <code>1</code>.
     */

    public Integer getRank() {
        return this.rank;
    }

    /**
     * <p>
     * The rank of the function recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @param rank
     *        The rank of the function recommendation option.</p>
     *        <p>
     *        The top recommendation option is ranked as <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionMemoryRecommendationOption withRank(Integer rank) {
        setRank(rank);
        return this;
    }

    /**
     * <p>
     * The memory size, in MB, of the function recommendation option.
     * </p>
     * 
     * @param memorySize
     *        The memory size, in MB, of the function recommendation option.
     */

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    /**
     * <p>
     * The memory size, in MB, of the function recommendation option.
     * </p>
     * 
     * @return The memory size, in MB, of the function recommendation option.
     */

    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * <p>
     * The memory size, in MB, of the function recommendation option.
     * </p>
     * 
     * @param memorySize
     *        The memory size, in MB, of the function recommendation option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionMemoryRecommendationOption withMemorySize(Integer memorySize) {
        setMemorySize(memorySize);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the function recommendation option.
     * </p>
     * 
     * @return An array of objects that describe the projected utilization metrics of the function recommendation
     *         option.
     */

    public java.util.List<LambdaFunctionMemoryProjectedMetric> getProjectedUtilizationMetrics() {
        return projectedUtilizationMetrics;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the function recommendation option.
     * </p>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the function recommendation option.
     */

    public void setProjectedUtilizationMetrics(java.util.Collection<LambdaFunctionMemoryProjectedMetric> projectedUtilizationMetrics) {
        if (projectedUtilizationMetrics == null) {
            this.projectedUtilizationMetrics = null;
            return;
        }

        this.projectedUtilizationMetrics = new java.util.ArrayList<LambdaFunctionMemoryProjectedMetric>(projectedUtilizationMetrics);
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the function recommendation option.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectedUtilizationMetrics(java.util.Collection)} or
     * {@link #withProjectedUtilizationMetrics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the function recommendation option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionMemoryRecommendationOption withProjectedUtilizationMetrics(LambdaFunctionMemoryProjectedMetric... projectedUtilizationMetrics) {
        if (this.projectedUtilizationMetrics == null) {
            setProjectedUtilizationMetrics(new java.util.ArrayList<LambdaFunctionMemoryProjectedMetric>(projectedUtilizationMetrics.length));
        }
        for (LambdaFunctionMemoryProjectedMetric ele : projectedUtilizationMetrics) {
            this.projectedUtilizationMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the function recommendation option.
     * </p>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the function recommendation option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionMemoryRecommendationOption withProjectedUtilizationMetrics(
            java.util.Collection<LambdaFunctionMemoryProjectedMetric> projectedUtilizationMetrics) {
        setProjectedUtilizationMetrics(projectedUtilizationMetrics);
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
        if (getRank() != null)
            sb.append("Rank: ").append(getRank()).append(",");
        if (getMemorySize() != null)
            sb.append("MemorySize: ").append(getMemorySize()).append(",");
        if (getProjectedUtilizationMetrics() != null)
            sb.append("ProjectedUtilizationMetrics: ").append(getProjectedUtilizationMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionMemoryRecommendationOption == false)
            return false;
        LambdaFunctionMemoryRecommendationOption other = (LambdaFunctionMemoryRecommendationOption) obj;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        if (other.getMemorySize() == null ^ this.getMemorySize() == null)
            return false;
        if (other.getMemorySize() != null && other.getMemorySize().equals(this.getMemorySize()) == false)
            return false;
        if (other.getProjectedUtilizationMetrics() == null ^ this.getProjectedUtilizationMetrics() == null)
            return false;
        if (other.getProjectedUtilizationMetrics() != null && other.getProjectedUtilizationMetrics().equals(this.getProjectedUtilizationMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        hashCode = prime * hashCode + ((getMemorySize() == null) ? 0 : getMemorySize().hashCode());
        hashCode = prime * hashCode + ((getProjectedUtilizationMetrics() == null) ? 0 : getProjectedUtilizationMetrics().hashCode());
        return hashCode;
    }

    @Override
    public LambdaFunctionMemoryRecommendationOption clone() {
        try {
            return (LambdaFunctionMemoryRecommendationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.LambdaFunctionMemoryRecommendationOptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
