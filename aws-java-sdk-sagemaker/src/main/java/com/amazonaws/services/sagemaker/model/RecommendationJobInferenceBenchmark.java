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
 * The details for a specific benchmark from an Inference Recommender job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RecommendationJobInferenceBenchmark"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationJobInferenceBenchmark implements Serializable, Cloneable, StructuredPojo {

    private RecommendationMetrics metrics;

    private EndpointOutputConfiguration endpointConfiguration;

    private ModelConfiguration modelConfiguration;
    /**
     * <p>
     * The reason why a benchmark failed.
     * </p>
     */
    private String failureReason;

    /**
     * @param metrics
     */

    public void setMetrics(RecommendationMetrics metrics) {
        this.metrics = metrics;
    }

    /**
     * @return
     */

    public RecommendationMetrics getMetrics() {
        return this.metrics;
    }

    /**
     * @param metrics
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInferenceBenchmark withMetrics(RecommendationMetrics metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * @param endpointConfiguration
     */

    public void setEndpointConfiguration(EndpointOutputConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
    }

    /**
     * @return
     */

    public EndpointOutputConfiguration getEndpointConfiguration() {
        return this.endpointConfiguration;
    }

    /**
     * @param endpointConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInferenceBenchmark withEndpointConfiguration(EndpointOutputConfiguration endpointConfiguration) {
        setEndpointConfiguration(endpointConfiguration);
        return this;
    }

    /**
     * @param modelConfiguration
     */

    public void setModelConfiguration(ModelConfiguration modelConfiguration) {
        this.modelConfiguration = modelConfiguration;
    }

    /**
     * @return
     */

    public ModelConfiguration getModelConfiguration() {
        return this.modelConfiguration;
    }

    /**
     * @param modelConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInferenceBenchmark withModelConfiguration(ModelConfiguration modelConfiguration) {
        setModelConfiguration(modelConfiguration);
        return this;
    }

    /**
     * <p>
     * The reason why a benchmark failed.
     * </p>
     * 
     * @param failureReason
     *        The reason why a benchmark failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason why a benchmark failed.
     * </p>
     * 
     * @return The reason why a benchmark failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason why a benchmark failed.
     * </p>
     * 
     * @param failureReason
     *        The reason why a benchmark failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInferenceBenchmark withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getEndpointConfiguration() != null)
            sb.append("EndpointConfiguration: ").append(getEndpointConfiguration()).append(",");
        if (getModelConfiguration() != null)
            sb.append("ModelConfiguration: ").append(getModelConfiguration()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationJobInferenceBenchmark == false)
            return false;
        RecommendationJobInferenceBenchmark other = (RecommendationJobInferenceBenchmark) obj;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getEndpointConfiguration() == null ^ this.getEndpointConfiguration() == null)
            return false;
        if (other.getEndpointConfiguration() != null && other.getEndpointConfiguration().equals(this.getEndpointConfiguration()) == false)
            return false;
        if (other.getModelConfiguration() == null ^ this.getModelConfiguration() == null)
            return false;
        if (other.getModelConfiguration() != null && other.getModelConfiguration().equals(this.getModelConfiguration()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfiguration() == null) ? 0 : getEndpointConfiguration().hashCode());
        hashCode = prime * hashCode + ((getModelConfiguration() == null) ? 0 : getModelConfiguration().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationJobInferenceBenchmark clone() {
        try {
            return (RecommendationJobInferenceBenchmark) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RecommendationJobInferenceBenchmarkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
