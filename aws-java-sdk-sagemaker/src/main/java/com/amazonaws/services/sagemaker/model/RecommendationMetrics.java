/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metrics of recommendations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RecommendationMetrics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the cost per hour for the instance.
     * </p>
     */
    private Float costPerHour;
    /**
     * <p>
     * Defines the cost per inference for the instance .
     * </p>
     */
    private Float costPerInference;
    /**
     * <p>
     * The expected maximum number of requests per minute for the instance.
     * </p>
     */
    private Integer maxInvocations;
    /**
     * <p>
     * The expected model latency at maximum invocation per minute for the instance.
     * </p>
     */
    private Integer modelLatency;

    /**
     * <p>
     * Defines the cost per hour for the instance.
     * </p>
     * 
     * @param costPerHour
     *        Defines the cost per hour for the instance.
     */

    public void setCostPerHour(Float costPerHour) {
        this.costPerHour = costPerHour;
    }

    /**
     * <p>
     * Defines the cost per hour for the instance.
     * </p>
     * 
     * @return Defines the cost per hour for the instance.
     */

    public Float getCostPerHour() {
        return this.costPerHour;
    }

    /**
     * <p>
     * Defines the cost per hour for the instance.
     * </p>
     * 
     * @param costPerHour
     *        Defines the cost per hour for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationMetrics withCostPerHour(Float costPerHour) {
        setCostPerHour(costPerHour);
        return this;
    }

    /**
     * <p>
     * Defines the cost per inference for the instance .
     * </p>
     * 
     * @param costPerInference
     *        Defines the cost per inference for the instance .
     */

    public void setCostPerInference(Float costPerInference) {
        this.costPerInference = costPerInference;
    }

    /**
     * <p>
     * Defines the cost per inference for the instance .
     * </p>
     * 
     * @return Defines the cost per inference for the instance .
     */

    public Float getCostPerInference() {
        return this.costPerInference;
    }

    /**
     * <p>
     * Defines the cost per inference for the instance .
     * </p>
     * 
     * @param costPerInference
     *        Defines the cost per inference for the instance .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationMetrics withCostPerInference(Float costPerInference) {
        setCostPerInference(costPerInference);
        return this;
    }

    /**
     * <p>
     * The expected maximum number of requests per minute for the instance.
     * </p>
     * 
     * @param maxInvocations
     *        The expected maximum number of requests per minute for the instance.
     */

    public void setMaxInvocations(Integer maxInvocations) {
        this.maxInvocations = maxInvocations;
    }

    /**
     * <p>
     * The expected maximum number of requests per minute for the instance.
     * </p>
     * 
     * @return The expected maximum number of requests per minute for the instance.
     */

    public Integer getMaxInvocations() {
        return this.maxInvocations;
    }

    /**
     * <p>
     * The expected maximum number of requests per minute for the instance.
     * </p>
     * 
     * @param maxInvocations
     *        The expected maximum number of requests per minute for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationMetrics withMaxInvocations(Integer maxInvocations) {
        setMaxInvocations(maxInvocations);
        return this;
    }

    /**
     * <p>
     * The expected model latency at maximum invocation per minute for the instance.
     * </p>
     * 
     * @param modelLatency
     *        The expected model latency at maximum invocation per minute for the instance.
     */

    public void setModelLatency(Integer modelLatency) {
        this.modelLatency = modelLatency;
    }

    /**
     * <p>
     * The expected model latency at maximum invocation per minute for the instance.
     * </p>
     * 
     * @return The expected model latency at maximum invocation per minute for the instance.
     */

    public Integer getModelLatency() {
        return this.modelLatency;
    }

    /**
     * <p>
     * The expected model latency at maximum invocation per minute for the instance.
     * </p>
     * 
     * @param modelLatency
     *        The expected model latency at maximum invocation per minute for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationMetrics withModelLatency(Integer modelLatency) {
        setModelLatency(modelLatency);
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
        if (getCostPerHour() != null)
            sb.append("CostPerHour: ").append(getCostPerHour()).append(",");
        if (getCostPerInference() != null)
            sb.append("CostPerInference: ").append(getCostPerInference()).append(",");
        if (getMaxInvocations() != null)
            sb.append("MaxInvocations: ").append(getMaxInvocations()).append(",");
        if (getModelLatency() != null)
            sb.append("ModelLatency: ").append(getModelLatency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationMetrics == false)
            return false;
        RecommendationMetrics other = (RecommendationMetrics) obj;
        if (other.getCostPerHour() == null ^ this.getCostPerHour() == null)
            return false;
        if (other.getCostPerHour() != null && other.getCostPerHour().equals(this.getCostPerHour()) == false)
            return false;
        if (other.getCostPerInference() == null ^ this.getCostPerInference() == null)
            return false;
        if (other.getCostPerInference() != null && other.getCostPerInference().equals(this.getCostPerInference()) == false)
            return false;
        if (other.getMaxInvocations() == null ^ this.getMaxInvocations() == null)
            return false;
        if (other.getMaxInvocations() != null && other.getMaxInvocations().equals(this.getMaxInvocations()) == false)
            return false;
        if (other.getModelLatency() == null ^ this.getModelLatency() == null)
            return false;
        if (other.getModelLatency() != null && other.getModelLatency().equals(this.getModelLatency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCostPerHour() == null) ? 0 : getCostPerHour().hashCode());
        hashCode = prime * hashCode + ((getCostPerInference() == null) ? 0 : getCostPerInference().hashCode());
        hashCode = prime * hashCode + ((getMaxInvocations() == null) ? 0 : getMaxInvocations().hashCode());
        hashCode = prime * hashCode + ((getModelLatency() == null) ? 0 : getModelLatency().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationMetrics clone() {
        try {
            return (RecommendationMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RecommendationMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
