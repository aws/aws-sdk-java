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
package com.amazonaws.services.trustedadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Recommendation pillar aggregates
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/RecommendationPillarSpecificAggregates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationPillarSpecificAggregates implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Cost optimizing aggregates
     * </p>
     */
    private RecommendationCostOptimizingAggregates costOptimizing;

    /**
     * <p>
     * Cost optimizing aggregates
     * </p>
     * 
     * @param costOptimizing
     *        Cost optimizing aggregates
     */

    public void setCostOptimizing(RecommendationCostOptimizingAggregates costOptimizing) {
        this.costOptimizing = costOptimizing;
    }

    /**
     * <p>
     * Cost optimizing aggregates
     * </p>
     * 
     * @return Cost optimizing aggregates
     */

    public RecommendationCostOptimizingAggregates getCostOptimizing() {
        return this.costOptimizing;
    }

    /**
     * <p>
     * Cost optimizing aggregates
     * </p>
     * 
     * @param costOptimizing
     *        Cost optimizing aggregates
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationPillarSpecificAggregates withCostOptimizing(RecommendationCostOptimizingAggregates costOptimizing) {
        setCostOptimizing(costOptimizing);
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
        if (getCostOptimizing() != null)
            sb.append("CostOptimizing: ").append(getCostOptimizing());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationPillarSpecificAggregates == false)
            return false;
        RecommendationPillarSpecificAggregates other = (RecommendationPillarSpecificAggregates) obj;
        if (other.getCostOptimizing() == null ^ this.getCostOptimizing() == null)
            return false;
        if (other.getCostOptimizing() != null && other.getCostOptimizing().equals(this.getCostOptimizing()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCostOptimizing() == null) ? 0 : getCostOptimizing().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationPillarSpecificAggregates clone() {
        try {
            return (RecommendationPillarSpecificAggregates) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.trustedadvisor.model.transform.RecommendationPillarSpecificAggregatesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
