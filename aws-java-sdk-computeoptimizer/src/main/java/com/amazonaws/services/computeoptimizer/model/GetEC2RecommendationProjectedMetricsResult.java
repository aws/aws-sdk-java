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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEC2RecommendationProjectedMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEC2RecommendationProjectedMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of objects that describe a projected metrics.
     * </p>
     */
    private java.util.List<RecommendedOptionProjectedMetric> recommendedOptionProjectedMetrics;

    /**
     * <p>
     * An array of objects that describe a projected metrics.
     * </p>
     * 
     * @return An array of objects that describe a projected metrics.
     */

    public java.util.List<RecommendedOptionProjectedMetric> getRecommendedOptionProjectedMetrics() {
        return recommendedOptionProjectedMetrics;
    }

    /**
     * <p>
     * An array of objects that describe a projected metrics.
     * </p>
     * 
     * @param recommendedOptionProjectedMetrics
     *        An array of objects that describe a projected metrics.
     */

    public void setRecommendedOptionProjectedMetrics(java.util.Collection<RecommendedOptionProjectedMetric> recommendedOptionProjectedMetrics) {
        if (recommendedOptionProjectedMetrics == null) {
            this.recommendedOptionProjectedMetrics = null;
            return;
        }

        this.recommendedOptionProjectedMetrics = new java.util.ArrayList<RecommendedOptionProjectedMetric>(recommendedOptionProjectedMetrics);
    }

    /**
     * <p>
     * An array of objects that describe a projected metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendedOptionProjectedMetrics(java.util.Collection)} or
     * {@link #withRecommendedOptionProjectedMetrics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendedOptionProjectedMetrics
     *        An array of objects that describe a projected metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEC2RecommendationProjectedMetricsResult withRecommendedOptionProjectedMetrics(
            RecommendedOptionProjectedMetric... recommendedOptionProjectedMetrics) {
        if (this.recommendedOptionProjectedMetrics == null) {
            setRecommendedOptionProjectedMetrics(new java.util.ArrayList<RecommendedOptionProjectedMetric>(recommendedOptionProjectedMetrics.length));
        }
        for (RecommendedOptionProjectedMetric ele : recommendedOptionProjectedMetrics) {
            this.recommendedOptionProjectedMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe a projected metrics.
     * </p>
     * 
     * @param recommendedOptionProjectedMetrics
     *        An array of objects that describe a projected metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEC2RecommendationProjectedMetricsResult withRecommendedOptionProjectedMetrics(
            java.util.Collection<RecommendedOptionProjectedMetric> recommendedOptionProjectedMetrics) {
        setRecommendedOptionProjectedMetrics(recommendedOptionProjectedMetrics);
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
        if (getRecommendedOptionProjectedMetrics() != null)
            sb.append("RecommendedOptionProjectedMetrics: ").append(getRecommendedOptionProjectedMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEC2RecommendationProjectedMetricsResult == false)
            return false;
        GetEC2RecommendationProjectedMetricsResult other = (GetEC2RecommendationProjectedMetricsResult) obj;
        if (other.getRecommendedOptionProjectedMetrics() == null ^ this.getRecommendedOptionProjectedMetrics() == null)
            return false;
        if (other.getRecommendedOptionProjectedMetrics() != null
                && other.getRecommendedOptionProjectedMetrics().equals(this.getRecommendedOptionProjectedMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendedOptionProjectedMetrics() == null) ? 0 : getRecommendedOptionProjectedMetrics().hashCode());
        return hashCode;
    }

    @Override
    public GetEC2RecommendationProjectedMetricsResult clone() {
        try {
            return (GetEC2RecommendationProjectedMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
