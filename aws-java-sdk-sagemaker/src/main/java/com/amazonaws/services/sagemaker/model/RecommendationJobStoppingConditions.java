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
 * Specifies conditions for stopping a job. When a job reaches a stopping condition limit, SageMaker ends the job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RecommendationJobStoppingConditions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationJobStoppingConditions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of requests per minute expected for the endpoint.
     * </p>
     */
    private Integer maxInvocations;
    /**
     * <p>
     * The interval of time taken by a model to respond as viewed from SageMaker. The interval includes the local
     * communication time taken to send the request and to fetch the response from the container of a model and the time
     * taken to complete the inference in the container.
     * </p>
     */
    private java.util.List<ModelLatencyThreshold> modelLatencyThresholds;

    /**
     * <p>
     * The maximum number of requests per minute expected for the endpoint.
     * </p>
     * 
     * @param maxInvocations
     *        The maximum number of requests per minute expected for the endpoint.
     */

    public void setMaxInvocations(Integer maxInvocations) {
        this.maxInvocations = maxInvocations;
    }

    /**
     * <p>
     * The maximum number of requests per minute expected for the endpoint.
     * </p>
     * 
     * @return The maximum number of requests per minute expected for the endpoint.
     */

    public Integer getMaxInvocations() {
        return this.maxInvocations;
    }

    /**
     * <p>
     * The maximum number of requests per minute expected for the endpoint.
     * </p>
     * 
     * @param maxInvocations
     *        The maximum number of requests per minute expected for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobStoppingConditions withMaxInvocations(Integer maxInvocations) {
        setMaxInvocations(maxInvocations);
        return this;
    }

    /**
     * <p>
     * The interval of time taken by a model to respond as viewed from SageMaker. The interval includes the local
     * communication time taken to send the request and to fetch the response from the container of a model and the time
     * taken to complete the inference in the container.
     * </p>
     * 
     * @return The interval of time taken by a model to respond as viewed from SageMaker. The interval includes the
     *         local communication time taken to send the request and to fetch the response from the container of a
     *         model and the time taken to complete the inference in the container.
     */

    public java.util.List<ModelLatencyThreshold> getModelLatencyThresholds() {
        return modelLatencyThresholds;
    }

    /**
     * <p>
     * The interval of time taken by a model to respond as viewed from SageMaker. The interval includes the local
     * communication time taken to send the request and to fetch the response from the container of a model and the time
     * taken to complete the inference in the container.
     * </p>
     * 
     * @param modelLatencyThresholds
     *        The interval of time taken by a model to respond as viewed from SageMaker. The interval includes the local
     *        communication time taken to send the request and to fetch the response from the container of a model and
     *        the time taken to complete the inference in the container.
     */

    public void setModelLatencyThresholds(java.util.Collection<ModelLatencyThreshold> modelLatencyThresholds) {
        if (modelLatencyThresholds == null) {
            this.modelLatencyThresholds = null;
            return;
        }

        this.modelLatencyThresholds = new java.util.ArrayList<ModelLatencyThreshold>(modelLatencyThresholds);
    }

    /**
     * <p>
     * The interval of time taken by a model to respond as viewed from SageMaker. The interval includes the local
     * communication time taken to send the request and to fetch the response from the container of a model and the time
     * taken to complete the inference in the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelLatencyThresholds(java.util.Collection)} or
     * {@link #withModelLatencyThresholds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param modelLatencyThresholds
     *        The interval of time taken by a model to respond as viewed from SageMaker. The interval includes the local
     *        communication time taken to send the request and to fetch the response from the container of a model and
     *        the time taken to complete the inference in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobStoppingConditions withModelLatencyThresholds(ModelLatencyThreshold... modelLatencyThresholds) {
        if (this.modelLatencyThresholds == null) {
            setModelLatencyThresholds(new java.util.ArrayList<ModelLatencyThreshold>(modelLatencyThresholds.length));
        }
        for (ModelLatencyThreshold ele : modelLatencyThresholds) {
            this.modelLatencyThresholds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The interval of time taken by a model to respond as viewed from SageMaker. The interval includes the local
     * communication time taken to send the request and to fetch the response from the container of a model and the time
     * taken to complete the inference in the container.
     * </p>
     * 
     * @param modelLatencyThresholds
     *        The interval of time taken by a model to respond as viewed from SageMaker. The interval includes the local
     *        communication time taken to send the request and to fetch the response from the container of a model and
     *        the time taken to complete the inference in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobStoppingConditions withModelLatencyThresholds(java.util.Collection<ModelLatencyThreshold> modelLatencyThresholds) {
        setModelLatencyThresholds(modelLatencyThresholds);
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
        if (getMaxInvocations() != null)
            sb.append("MaxInvocations: ").append(getMaxInvocations()).append(",");
        if (getModelLatencyThresholds() != null)
            sb.append("ModelLatencyThresholds: ").append(getModelLatencyThresholds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationJobStoppingConditions == false)
            return false;
        RecommendationJobStoppingConditions other = (RecommendationJobStoppingConditions) obj;
        if (other.getMaxInvocations() == null ^ this.getMaxInvocations() == null)
            return false;
        if (other.getMaxInvocations() != null && other.getMaxInvocations().equals(this.getMaxInvocations()) == false)
            return false;
        if (other.getModelLatencyThresholds() == null ^ this.getModelLatencyThresholds() == null)
            return false;
        if (other.getModelLatencyThresholds() != null && other.getModelLatencyThresholds().equals(this.getModelLatencyThresholds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxInvocations() == null) ? 0 : getMaxInvocations().hashCode());
        hashCode = prime * hashCode + ((getModelLatencyThresholds() == null) ? 0 : getModelLatencyThresholds().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationJobStoppingConditions clone() {
        try {
            return (RecommendationJobStoppingConditions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RecommendationJobStoppingConditionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
