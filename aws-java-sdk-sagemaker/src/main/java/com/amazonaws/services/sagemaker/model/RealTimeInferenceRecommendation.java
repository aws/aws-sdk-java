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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The recommended configuration to use for Real-Time Inference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RealTimeInferenceRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeInferenceRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recommendation ID which uniquely identifies each recommendation.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * The recommended instance type for Real-Time Inference.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The recommended environment variables to set in the model container for Real-Time Inference.
     * </p>
     */
    private java.util.Map<String, String> environment;

    /**
     * <p>
     * The recommendation ID which uniquely identifies each recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The recommendation ID which uniquely identifies each recommendation.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The recommendation ID which uniquely identifies each recommendation.
     * </p>
     * 
     * @return The recommendation ID which uniquely identifies each recommendation.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The recommendation ID which uniquely identifies each recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The recommendation ID which uniquely identifies each recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeInferenceRecommendation withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * The recommended instance type for Real-Time Inference.
     * </p>
     * 
     * @param instanceType
     *        The recommended instance type for Real-Time Inference.
     * @see ProductionVariantInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The recommended instance type for Real-Time Inference.
     * </p>
     * 
     * @return The recommended instance type for Real-Time Inference.
     * @see ProductionVariantInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The recommended instance type for Real-Time Inference.
     * </p>
     * 
     * @param instanceType
     *        The recommended instance type for Real-Time Inference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantInstanceType
     */

    public RealTimeInferenceRecommendation withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The recommended instance type for Real-Time Inference.
     * </p>
     * 
     * @param instanceType
     *        The recommended instance type for Real-Time Inference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantInstanceType
     */

    public RealTimeInferenceRecommendation withInstanceType(ProductionVariantInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The recommended environment variables to set in the model container for Real-Time Inference.
     * </p>
     * 
     * @return The recommended environment variables to set in the model container for Real-Time Inference.
     */

    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The recommended environment variables to set in the model container for Real-Time Inference.
     * </p>
     * 
     * @param environment
     *        The recommended environment variables to set in the model container for Real-Time Inference.
     */

    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The recommended environment variables to set in the model container for Real-Time Inference.
     * </p>
     * 
     * @param environment
     *        The recommended environment variables to set in the model container for Real-Time Inference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeInferenceRecommendation withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * Add a single Environment entry
     *
     * @see RealTimeInferenceRecommendation#withEnvironment
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeInferenceRecommendation addEnvironmentEntry(String key, String value) {
        if (null == this.environment) {
            this.environment = new java.util.HashMap<String, String>();
        }
        if (this.environment.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environment.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Environment.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeInferenceRecommendation clearEnvironmentEntries() {
        this.environment = null;
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
        if (getRecommendationId() != null)
            sb.append("RecommendationId: ").append(getRecommendationId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeInferenceRecommendation == false)
            return false;
        RealTimeInferenceRecommendation other = (RealTimeInferenceRecommendation) obj;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        return hashCode;
    }

    @Override
    public RealTimeInferenceRecommendation clone() {
        try {
            return (RealTimeInferenceRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RealTimeInferenceRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
