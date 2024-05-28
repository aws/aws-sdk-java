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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of rightsizing recommendations, including de-duped savings from all types of recommendations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/RecommendationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The estimated total savings resulting from modifications, on a monthly basis.
     * </p>
     */
    private Double estimatedMonthlySavings;
    /**
     * <p>
     * The grouping of recommendations.
     * </p>
     */
    private String group;
    /**
     * <p>
     * The total number of instance recommendations.
     * </p>
     */
    private Integer recommendationCount;

    /**
     * <p>
     * The estimated total savings resulting from modifications, on a monthly basis.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        The estimated total savings resulting from modifications, on a monthly basis.
     */

    public void setEstimatedMonthlySavings(Double estimatedMonthlySavings) {
        this.estimatedMonthlySavings = estimatedMonthlySavings;
    }

    /**
     * <p>
     * The estimated total savings resulting from modifications, on a monthly basis.
     * </p>
     * 
     * @return The estimated total savings resulting from modifications, on a monthly basis.
     */

    public Double getEstimatedMonthlySavings() {
        return this.estimatedMonthlySavings;
    }

    /**
     * <p>
     * The estimated total savings resulting from modifications, on a monthly basis.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        The estimated total savings resulting from modifications, on a monthly basis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationSummary withEstimatedMonthlySavings(Double estimatedMonthlySavings) {
        setEstimatedMonthlySavings(estimatedMonthlySavings);
        return this;
    }

    /**
     * <p>
     * The grouping of recommendations.
     * </p>
     * 
     * @param group
     *        The grouping of recommendations.
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The grouping of recommendations.
     * </p>
     * 
     * @return The grouping of recommendations.
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The grouping of recommendations.
     * </p>
     * 
     * @param group
     *        The grouping of recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationSummary withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * The total number of instance recommendations.
     * </p>
     * 
     * @param recommendationCount
     *        The total number of instance recommendations.
     */

    public void setRecommendationCount(Integer recommendationCount) {
        this.recommendationCount = recommendationCount;
    }

    /**
     * <p>
     * The total number of instance recommendations.
     * </p>
     * 
     * @return The total number of instance recommendations.
     */

    public Integer getRecommendationCount() {
        return this.recommendationCount;
    }

    /**
     * <p>
     * The total number of instance recommendations.
     * </p>
     * 
     * @param recommendationCount
     *        The total number of instance recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationSummary withRecommendationCount(Integer recommendationCount) {
        setRecommendationCount(recommendationCount);
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
        if (getEstimatedMonthlySavings() != null)
            sb.append("EstimatedMonthlySavings: ").append(getEstimatedMonthlySavings()).append(",");
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getRecommendationCount() != null)
            sb.append("RecommendationCount: ").append(getRecommendationCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationSummary == false)
            return false;
        RecommendationSummary other = (RecommendationSummary) obj;
        if (other.getEstimatedMonthlySavings() == null ^ this.getEstimatedMonthlySavings() == null)
            return false;
        if (other.getEstimatedMonthlySavings() != null && other.getEstimatedMonthlySavings().equals(this.getEstimatedMonthlySavings()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getRecommendationCount() == null ^ this.getRecommendationCount() == null)
            return false;
        if (other.getRecommendationCount() != null && other.getRecommendationCount().equals(this.getRecommendationCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEstimatedMonthlySavings() == null) ? 0 : getEstimatedMonthlySavings().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getRecommendationCount() == null) ? 0 : getRecommendationCount().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationSummary clone() {
        try {
            return (RecommendationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.RecommendationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
