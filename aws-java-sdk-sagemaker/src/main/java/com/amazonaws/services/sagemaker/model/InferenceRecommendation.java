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
 * A list of recommendations made by Amazon SageMaker Inference Recommender.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InferenceRecommendation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metrics used to decide what recommendation to make.
     * </p>
     */
    private RecommendationMetrics metrics;
    /**
     * <p>
     * Defines the endpoint configuration parameters.
     * </p>
     */
    private EndpointOutputConfiguration endpointConfiguration;
    /**
     * <p>
     * Defines the model configuration.
     * </p>
     */
    private ModelConfiguration modelConfiguration;

    /**
     * <p>
     * The metrics used to decide what recommendation to make.
     * </p>
     * 
     * @param metrics
     *        The metrics used to decide what recommendation to make.
     */

    public void setMetrics(RecommendationMetrics metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * The metrics used to decide what recommendation to make.
     * </p>
     * 
     * @return The metrics used to decide what recommendation to make.
     */

    public RecommendationMetrics getMetrics() {
        return this.metrics;
    }

    /**
     * <p>
     * The metrics used to decide what recommendation to make.
     * </p>
     * 
     * @param metrics
     *        The metrics used to decide what recommendation to make.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceRecommendation withMetrics(RecommendationMetrics metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * Defines the endpoint configuration parameters.
     * </p>
     * 
     * @param endpointConfiguration
     *        Defines the endpoint configuration parameters.
     */

    public void setEndpointConfiguration(EndpointOutputConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
    }

    /**
     * <p>
     * Defines the endpoint configuration parameters.
     * </p>
     * 
     * @return Defines the endpoint configuration parameters.
     */

    public EndpointOutputConfiguration getEndpointConfiguration() {
        return this.endpointConfiguration;
    }

    /**
     * <p>
     * Defines the endpoint configuration parameters.
     * </p>
     * 
     * @param endpointConfiguration
     *        Defines the endpoint configuration parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceRecommendation withEndpointConfiguration(EndpointOutputConfiguration endpointConfiguration) {
        setEndpointConfiguration(endpointConfiguration);
        return this;
    }

    /**
     * <p>
     * Defines the model configuration.
     * </p>
     * 
     * @param modelConfiguration
     *        Defines the model configuration.
     */

    public void setModelConfiguration(ModelConfiguration modelConfiguration) {
        this.modelConfiguration = modelConfiguration;
    }

    /**
     * <p>
     * Defines the model configuration.
     * </p>
     * 
     * @return Defines the model configuration.
     */

    public ModelConfiguration getModelConfiguration() {
        return this.modelConfiguration;
    }

    /**
     * <p>
     * Defines the model configuration.
     * </p>
     * 
     * @param modelConfiguration
     *        Defines the model configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceRecommendation withModelConfiguration(ModelConfiguration modelConfiguration) {
        setModelConfiguration(modelConfiguration);
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
            sb.append("ModelConfiguration: ").append(getModelConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceRecommendation == false)
            return false;
        InferenceRecommendation other = (InferenceRecommendation) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfiguration() == null) ? 0 : getEndpointConfiguration().hashCode());
        hashCode = prime * hashCode + ((getModelConfiguration() == null) ? 0 : getModelConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public InferenceRecommendation clone() {
        try {
            return (InferenceRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InferenceRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
