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
 * Describes a projected utilization metric of a recommendation option.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/RecommendedOptionProjectedMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendedOptionProjectedMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recommended instance type.
     * </p>
     */
    private String recommendedInstanceType;
    /**
     * <p>
     * The rank of the recommendation option projected metric.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * <p>
     * The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked
     * as <code>1</code> is related to the recommendation option that is also ranked as <code>1</code> in the same
     * response.
     * </p>
     */
    private Integer rank;
    /**
     * <p>
     * An array of objects that describe a projected utilization metric.
     * </p>
     */
    private java.util.List<ProjectedMetric> projectedMetrics;

    /**
     * <p>
     * The recommended instance type.
     * </p>
     * 
     * @param recommendedInstanceType
     *        The recommended instance type.
     */

    public void setRecommendedInstanceType(String recommendedInstanceType) {
        this.recommendedInstanceType = recommendedInstanceType;
    }

    /**
     * <p>
     * The recommended instance type.
     * </p>
     * 
     * @return The recommended instance type.
     */

    public String getRecommendedInstanceType() {
        return this.recommendedInstanceType;
    }

    /**
     * <p>
     * The recommended instance type.
     * </p>
     * 
     * @param recommendedInstanceType
     *        The recommended instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedOptionProjectedMetric withRecommendedInstanceType(String recommendedInstanceType) {
        setRecommendedInstanceType(recommendedInstanceType);
        return this;
    }

    /**
     * <p>
     * The rank of the recommendation option projected metric.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * <p>
     * The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked
     * as <code>1</code> is related to the recommendation option that is also ranked as <code>1</code> in the same
     * response.
     * </p>
     * 
     * @param rank
     *        The rank of the recommendation option projected metric.</p>
     *        <p>
     *        The top recommendation option is ranked as <code>1</code>.
     *        </p>
     *        <p>
     *        The projected metric rank correlates to the recommendation option rank. For example, the projected metric
     *        ranked as <code>1</code> is related to the recommendation option that is also ranked as <code>1</code> in
     *        the same response.
     */

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>
     * The rank of the recommendation option projected metric.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * <p>
     * The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked
     * as <code>1</code> is related to the recommendation option that is also ranked as <code>1</code> in the same
     * response.
     * </p>
     * 
     * @return The rank of the recommendation option projected metric.</p>
     *         <p>
     *         The top recommendation option is ranked as <code>1</code>.
     *         </p>
     *         <p>
     *         The projected metric rank correlates to the recommendation option rank. For example, the projected metric
     *         ranked as <code>1</code> is related to the recommendation option that is also ranked as <code>1</code> in
     *         the same response.
     */

    public Integer getRank() {
        return this.rank;
    }

    /**
     * <p>
     * The rank of the recommendation option projected metric.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * <p>
     * The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked
     * as <code>1</code> is related to the recommendation option that is also ranked as <code>1</code> in the same
     * response.
     * </p>
     * 
     * @param rank
     *        The rank of the recommendation option projected metric.</p>
     *        <p>
     *        The top recommendation option is ranked as <code>1</code>.
     *        </p>
     *        <p>
     *        The projected metric rank correlates to the recommendation option rank. For example, the projected metric
     *        ranked as <code>1</code> is related to the recommendation option that is also ranked as <code>1</code> in
     *        the same response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedOptionProjectedMetric withRank(Integer rank) {
        setRank(rank);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe a projected utilization metric.
     * </p>
     * 
     * @return An array of objects that describe a projected utilization metric.
     */

    public java.util.List<ProjectedMetric> getProjectedMetrics() {
        return projectedMetrics;
    }

    /**
     * <p>
     * An array of objects that describe a projected utilization metric.
     * </p>
     * 
     * @param projectedMetrics
     *        An array of objects that describe a projected utilization metric.
     */

    public void setProjectedMetrics(java.util.Collection<ProjectedMetric> projectedMetrics) {
        if (projectedMetrics == null) {
            this.projectedMetrics = null;
            return;
        }

        this.projectedMetrics = new java.util.ArrayList<ProjectedMetric>(projectedMetrics);
    }

    /**
     * <p>
     * An array of objects that describe a projected utilization metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectedMetrics(java.util.Collection)} or {@link #withProjectedMetrics(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param projectedMetrics
     *        An array of objects that describe a projected utilization metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedOptionProjectedMetric withProjectedMetrics(ProjectedMetric... projectedMetrics) {
        if (this.projectedMetrics == null) {
            setProjectedMetrics(new java.util.ArrayList<ProjectedMetric>(projectedMetrics.length));
        }
        for (ProjectedMetric ele : projectedMetrics) {
            this.projectedMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe a projected utilization metric.
     * </p>
     * 
     * @param projectedMetrics
     *        An array of objects that describe a projected utilization metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedOptionProjectedMetric withProjectedMetrics(java.util.Collection<ProjectedMetric> projectedMetrics) {
        setProjectedMetrics(projectedMetrics);
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
        if (getRecommendedInstanceType() != null)
            sb.append("RecommendedInstanceType: ").append(getRecommendedInstanceType()).append(",");
        if (getRank() != null)
            sb.append("Rank: ").append(getRank()).append(",");
        if (getProjectedMetrics() != null)
            sb.append("ProjectedMetrics: ").append(getProjectedMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendedOptionProjectedMetric == false)
            return false;
        RecommendedOptionProjectedMetric other = (RecommendedOptionProjectedMetric) obj;
        if (other.getRecommendedInstanceType() == null ^ this.getRecommendedInstanceType() == null)
            return false;
        if (other.getRecommendedInstanceType() != null && other.getRecommendedInstanceType().equals(this.getRecommendedInstanceType()) == false)
            return false;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        if (other.getProjectedMetrics() == null ^ this.getProjectedMetrics() == null)
            return false;
        if (other.getProjectedMetrics() != null && other.getProjectedMetrics().equals(this.getProjectedMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendedInstanceType() == null) ? 0 : getRecommendedInstanceType().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        hashCode = prime * hashCode + ((getProjectedMetrics() == null) ? 0 : getProjectedMetrics().hashCode());
        return hashCode;
    }

    @Override
    public RecommendedOptionProjectedMetric clone() {
        try {
            return (RecommendedOptionProjectedMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.RecommendedOptionProjectedMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
