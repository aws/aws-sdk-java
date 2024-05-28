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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetScalingConfigurationRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetScalingConfigurationRecommendationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of a previously completed Inference Recommender job.
     * </p>
     */
    private String inferenceRecommendationsJobName;
    /**
     * <p>
     * The recommendation ID of a previously completed inference recommendation.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * The name of an endpoint benchmarked during a previously completed Inference Recommender job.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The percentage of how much utilization you want an instance to use before autoscaling, which you specified in the
     * request. The default value is 50%.
     * </p>
     */
    private Integer targetCpuUtilizationPerCore;
    /**
     * <p>
     * An object representing the anticipated traffic pattern for an endpoint that you specified in the request.
     * </p>
     */
    private ScalingPolicyObjective scalingPolicyObjective;
    /**
     * <p>
     * An object with a list of metrics that were benchmarked during the previously completed Inference Recommender job.
     * </p>
     */
    private ScalingPolicyMetric metric;
    /**
     * <p>
     * An object with the recommended values for you to specify when creating an autoscaling policy.
     * </p>
     */
    private DynamicScalingConfiguration dynamicScalingConfiguration;

    /**
     * <p>
     * The name of a previously completed Inference Recommender job.
     * </p>
     * 
     * @param inferenceRecommendationsJobName
     *        The name of a previously completed Inference Recommender job.
     */

    public void setInferenceRecommendationsJobName(String inferenceRecommendationsJobName) {
        this.inferenceRecommendationsJobName = inferenceRecommendationsJobName;
    }

    /**
     * <p>
     * The name of a previously completed Inference Recommender job.
     * </p>
     * 
     * @return The name of a previously completed Inference Recommender job.
     */

    public String getInferenceRecommendationsJobName() {
        return this.inferenceRecommendationsJobName;
    }

    /**
     * <p>
     * The name of a previously completed Inference Recommender job.
     * </p>
     * 
     * @param inferenceRecommendationsJobName
     *        The name of a previously completed Inference Recommender job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScalingConfigurationRecommendationResult withInferenceRecommendationsJobName(String inferenceRecommendationsJobName) {
        setInferenceRecommendationsJobName(inferenceRecommendationsJobName);
        return this;
    }

    /**
     * <p>
     * The recommendation ID of a previously completed inference recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The recommendation ID of a previously completed inference recommendation.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The recommendation ID of a previously completed inference recommendation.
     * </p>
     * 
     * @return The recommendation ID of a previously completed inference recommendation.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The recommendation ID of a previously completed inference recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The recommendation ID of a previously completed inference recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScalingConfigurationRecommendationResult withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * The name of an endpoint benchmarked during a previously completed Inference Recommender job.
     * </p>
     * 
     * @param endpointName
     *        The name of an endpoint benchmarked during a previously completed Inference Recommender job.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of an endpoint benchmarked during a previously completed Inference Recommender job.
     * </p>
     * 
     * @return The name of an endpoint benchmarked during a previously completed Inference Recommender job.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of an endpoint benchmarked during a previously completed Inference Recommender job.
     * </p>
     * 
     * @param endpointName
     *        The name of an endpoint benchmarked during a previously completed Inference Recommender job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScalingConfigurationRecommendationResult withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The percentage of how much utilization you want an instance to use before autoscaling, which you specified in the
     * request. The default value is 50%.
     * </p>
     * 
     * @param targetCpuUtilizationPerCore
     *        The percentage of how much utilization you want an instance to use before autoscaling, which you specified
     *        in the request. The default value is 50%.
     */

    public void setTargetCpuUtilizationPerCore(Integer targetCpuUtilizationPerCore) {
        this.targetCpuUtilizationPerCore = targetCpuUtilizationPerCore;
    }

    /**
     * <p>
     * The percentage of how much utilization you want an instance to use before autoscaling, which you specified in the
     * request. The default value is 50%.
     * </p>
     * 
     * @return The percentage of how much utilization you want an instance to use before autoscaling, which you
     *         specified in the request. The default value is 50%.
     */

    public Integer getTargetCpuUtilizationPerCore() {
        return this.targetCpuUtilizationPerCore;
    }

    /**
     * <p>
     * The percentage of how much utilization you want an instance to use before autoscaling, which you specified in the
     * request. The default value is 50%.
     * </p>
     * 
     * @param targetCpuUtilizationPerCore
     *        The percentage of how much utilization you want an instance to use before autoscaling, which you specified
     *        in the request. The default value is 50%.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScalingConfigurationRecommendationResult withTargetCpuUtilizationPerCore(Integer targetCpuUtilizationPerCore) {
        setTargetCpuUtilizationPerCore(targetCpuUtilizationPerCore);
        return this;
    }

    /**
     * <p>
     * An object representing the anticipated traffic pattern for an endpoint that you specified in the request.
     * </p>
     * 
     * @param scalingPolicyObjective
     *        An object representing the anticipated traffic pattern for an endpoint that you specified in the request.
     */

    public void setScalingPolicyObjective(ScalingPolicyObjective scalingPolicyObjective) {
        this.scalingPolicyObjective = scalingPolicyObjective;
    }

    /**
     * <p>
     * An object representing the anticipated traffic pattern for an endpoint that you specified in the request.
     * </p>
     * 
     * @return An object representing the anticipated traffic pattern for an endpoint that you specified in the request.
     */

    public ScalingPolicyObjective getScalingPolicyObjective() {
        return this.scalingPolicyObjective;
    }

    /**
     * <p>
     * An object representing the anticipated traffic pattern for an endpoint that you specified in the request.
     * </p>
     * 
     * @param scalingPolicyObjective
     *        An object representing the anticipated traffic pattern for an endpoint that you specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScalingConfigurationRecommendationResult withScalingPolicyObjective(ScalingPolicyObjective scalingPolicyObjective) {
        setScalingPolicyObjective(scalingPolicyObjective);
        return this;
    }

    /**
     * <p>
     * An object with a list of metrics that were benchmarked during the previously completed Inference Recommender job.
     * </p>
     * 
     * @param metric
     *        An object with a list of metrics that were benchmarked during the previously completed Inference
     *        Recommender job.
     */

    public void setMetric(ScalingPolicyMetric metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * An object with a list of metrics that were benchmarked during the previously completed Inference Recommender job.
     * </p>
     * 
     * @return An object with a list of metrics that were benchmarked during the previously completed Inference
     *         Recommender job.
     */

    public ScalingPolicyMetric getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * An object with a list of metrics that were benchmarked during the previously completed Inference Recommender job.
     * </p>
     * 
     * @param metric
     *        An object with a list of metrics that were benchmarked during the previously completed Inference
     *        Recommender job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScalingConfigurationRecommendationResult withMetric(ScalingPolicyMetric metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * An object with the recommended values for you to specify when creating an autoscaling policy.
     * </p>
     * 
     * @param dynamicScalingConfiguration
     *        An object with the recommended values for you to specify when creating an autoscaling policy.
     */

    public void setDynamicScalingConfiguration(DynamicScalingConfiguration dynamicScalingConfiguration) {
        this.dynamicScalingConfiguration = dynamicScalingConfiguration;
    }

    /**
     * <p>
     * An object with the recommended values for you to specify when creating an autoscaling policy.
     * </p>
     * 
     * @return An object with the recommended values for you to specify when creating an autoscaling policy.
     */

    public DynamicScalingConfiguration getDynamicScalingConfiguration() {
        return this.dynamicScalingConfiguration;
    }

    /**
     * <p>
     * An object with the recommended values for you to specify when creating an autoscaling policy.
     * </p>
     * 
     * @param dynamicScalingConfiguration
     *        An object with the recommended values for you to specify when creating an autoscaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScalingConfigurationRecommendationResult withDynamicScalingConfiguration(DynamicScalingConfiguration dynamicScalingConfiguration) {
        setDynamicScalingConfiguration(dynamicScalingConfiguration);
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
        if (getInferenceRecommendationsJobName() != null)
            sb.append("InferenceRecommendationsJobName: ").append(getInferenceRecommendationsJobName()).append(",");
        if (getRecommendationId() != null)
            sb.append("RecommendationId: ").append(getRecommendationId()).append(",");
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getTargetCpuUtilizationPerCore() != null)
            sb.append("TargetCpuUtilizationPerCore: ").append(getTargetCpuUtilizationPerCore()).append(",");
        if (getScalingPolicyObjective() != null)
            sb.append("ScalingPolicyObjective: ").append(getScalingPolicyObjective()).append(",");
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getDynamicScalingConfiguration() != null)
            sb.append("DynamicScalingConfiguration: ").append(getDynamicScalingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetScalingConfigurationRecommendationResult == false)
            return false;
        GetScalingConfigurationRecommendationResult other = (GetScalingConfigurationRecommendationResult) obj;
        if (other.getInferenceRecommendationsJobName() == null ^ this.getInferenceRecommendationsJobName() == null)
            return false;
        if (other.getInferenceRecommendationsJobName() != null
                && other.getInferenceRecommendationsJobName().equals(this.getInferenceRecommendationsJobName()) == false)
            return false;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getTargetCpuUtilizationPerCore() == null ^ this.getTargetCpuUtilizationPerCore() == null)
            return false;
        if (other.getTargetCpuUtilizationPerCore() != null && other.getTargetCpuUtilizationPerCore().equals(this.getTargetCpuUtilizationPerCore()) == false)
            return false;
        if (other.getScalingPolicyObjective() == null ^ this.getScalingPolicyObjective() == null)
            return false;
        if (other.getScalingPolicyObjective() != null && other.getScalingPolicyObjective().equals(this.getScalingPolicyObjective()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getDynamicScalingConfiguration() == null ^ this.getDynamicScalingConfiguration() == null)
            return false;
        if (other.getDynamicScalingConfiguration() != null && other.getDynamicScalingConfiguration().equals(this.getDynamicScalingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInferenceRecommendationsJobName() == null) ? 0 : getInferenceRecommendationsJobName().hashCode());
        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getTargetCpuUtilizationPerCore() == null) ? 0 : getTargetCpuUtilizationPerCore().hashCode());
        hashCode = prime * hashCode + ((getScalingPolicyObjective() == null) ? 0 : getScalingPolicyObjective().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getDynamicScalingConfiguration() == null) ? 0 : getDynamicScalingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetScalingConfigurationRecommendationResult clone() {
        try {
            return (GetScalingConfigurationRecommendationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
