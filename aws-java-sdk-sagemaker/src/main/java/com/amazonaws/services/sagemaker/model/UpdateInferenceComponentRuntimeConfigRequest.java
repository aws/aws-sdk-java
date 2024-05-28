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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateInferenceComponentRuntimeConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInferenceComponentRuntimeConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the inference component to update.
     * </p>
     */
    private String inferenceComponentName;
    /**
     * <p>
     * Runtime settings for a model that is deployed with an inference component.
     * </p>
     */
    private InferenceComponentRuntimeConfig desiredRuntimeConfig;

    /**
     * <p>
     * The name of the inference component to update.
     * </p>
     * 
     * @param inferenceComponentName
     *        The name of the inference component to update.
     */

    public void setInferenceComponentName(String inferenceComponentName) {
        this.inferenceComponentName = inferenceComponentName;
    }

    /**
     * <p>
     * The name of the inference component to update.
     * </p>
     * 
     * @return The name of the inference component to update.
     */

    public String getInferenceComponentName() {
        return this.inferenceComponentName;
    }

    /**
     * <p>
     * The name of the inference component to update.
     * </p>
     * 
     * @param inferenceComponentName
     *        The name of the inference component to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceComponentRuntimeConfigRequest withInferenceComponentName(String inferenceComponentName) {
        setInferenceComponentName(inferenceComponentName);
        return this;
    }

    /**
     * <p>
     * Runtime settings for a model that is deployed with an inference component.
     * </p>
     * 
     * @param desiredRuntimeConfig
     *        Runtime settings for a model that is deployed with an inference component.
     */

    public void setDesiredRuntimeConfig(InferenceComponentRuntimeConfig desiredRuntimeConfig) {
        this.desiredRuntimeConfig = desiredRuntimeConfig;
    }

    /**
     * <p>
     * Runtime settings for a model that is deployed with an inference component.
     * </p>
     * 
     * @return Runtime settings for a model that is deployed with an inference component.
     */

    public InferenceComponentRuntimeConfig getDesiredRuntimeConfig() {
        return this.desiredRuntimeConfig;
    }

    /**
     * <p>
     * Runtime settings for a model that is deployed with an inference component.
     * </p>
     * 
     * @param desiredRuntimeConfig
     *        Runtime settings for a model that is deployed with an inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceComponentRuntimeConfigRequest withDesiredRuntimeConfig(InferenceComponentRuntimeConfig desiredRuntimeConfig) {
        setDesiredRuntimeConfig(desiredRuntimeConfig);
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
        if (getInferenceComponentName() != null)
            sb.append("InferenceComponentName: ").append(getInferenceComponentName()).append(",");
        if (getDesiredRuntimeConfig() != null)
            sb.append("DesiredRuntimeConfig: ").append(getDesiredRuntimeConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInferenceComponentRuntimeConfigRequest == false)
            return false;
        UpdateInferenceComponentRuntimeConfigRequest other = (UpdateInferenceComponentRuntimeConfigRequest) obj;
        if (other.getInferenceComponentName() == null ^ this.getInferenceComponentName() == null)
            return false;
        if (other.getInferenceComponentName() != null && other.getInferenceComponentName().equals(this.getInferenceComponentName()) == false)
            return false;
        if (other.getDesiredRuntimeConfig() == null ^ this.getDesiredRuntimeConfig() == null)
            return false;
        if (other.getDesiredRuntimeConfig() != null && other.getDesiredRuntimeConfig().equals(this.getDesiredRuntimeConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInferenceComponentName() == null) ? 0 : getInferenceComponentName().hashCode());
        hashCode = prime * hashCode + ((getDesiredRuntimeConfig() == null) ? 0 : getDesiredRuntimeConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInferenceComponentRuntimeConfigRequest clone() {
        return (UpdateInferenceComponentRuntimeConfigRequest) super.clone();
    }

}
