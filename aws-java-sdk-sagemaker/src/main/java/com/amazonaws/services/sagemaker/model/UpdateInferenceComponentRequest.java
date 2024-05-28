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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateInferenceComponent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInferenceComponentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the inference component.
     * </p>
     */
    private String inferenceComponentName;
    /**
     * <p>
     * Details about the resources to deploy with this inference component, including the model, container, and compute
     * resources.
     * </p>
     */
    private InferenceComponentSpecification specification;
    /**
     * <p>
     * Runtime settings for a model that is deployed with an inference component.
     * </p>
     */
    private InferenceComponentRuntimeConfig runtimeConfig;

    /**
     * <p>
     * The name of the inference component.
     * </p>
     * 
     * @param inferenceComponentName
     *        The name of the inference component.
     */

    public void setInferenceComponentName(String inferenceComponentName) {
        this.inferenceComponentName = inferenceComponentName;
    }

    /**
     * <p>
     * The name of the inference component.
     * </p>
     * 
     * @return The name of the inference component.
     */

    public String getInferenceComponentName() {
        return this.inferenceComponentName;
    }

    /**
     * <p>
     * The name of the inference component.
     * </p>
     * 
     * @param inferenceComponentName
     *        The name of the inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceComponentRequest withInferenceComponentName(String inferenceComponentName) {
        setInferenceComponentName(inferenceComponentName);
        return this;
    }

    /**
     * <p>
     * Details about the resources to deploy with this inference component, including the model, container, and compute
     * resources.
     * </p>
     * 
     * @param specification
     *        Details about the resources to deploy with this inference component, including the model, container, and
     *        compute resources.
     */

    public void setSpecification(InferenceComponentSpecification specification) {
        this.specification = specification;
    }

    /**
     * <p>
     * Details about the resources to deploy with this inference component, including the model, container, and compute
     * resources.
     * </p>
     * 
     * @return Details about the resources to deploy with this inference component, including the model, container, and
     *         compute resources.
     */

    public InferenceComponentSpecification getSpecification() {
        return this.specification;
    }

    /**
     * <p>
     * Details about the resources to deploy with this inference component, including the model, container, and compute
     * resources.
     * </p>
     * 
     * @param specification
     *        Details about the resources to deploy with this inference component, including the model, container, and
     *        compute resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceComponentRequest withSpecification(InferenceComponentSpecification specification) {
        setSpecification(specification);
        return this;
    }

    /**
     * <p>
     * Runtime settings for a model that is deployed with an inference component.
     * </p>
     * 
     * @param runtimeConfig
     *        Runtime settings for a model that is deployed with an inference component.
     */

    public void setRuntimeConfig(InferenceComponentRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

    /**
     * <p>
     * Runtime settings for a model that is deployed with an inference component.
     * </p>
     * 
     * @return Runtime settings for a model that is deployed with an inference component.
     */

    public InferenceComponentRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

    /**
     * <p>
     * Runtime settings for a model that is deployed with an inference component.
     * </p>
     * 
     * @param runtimeConfig
     *        Runtime settings for a model that is deployed with an inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceComponentRequest withRuntimeConfig(InferenceComponentRuntimeConfig runtimeConfig) {
        setRuntimeConfig(runtimeConfig);
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
        if (getSpecification() != null)
            sb.append("Specification: ").append(getSpecification()).append(",");
        if (getRuntimeConfig() != null)
            sb.append("RuntimeConfig: ").append(getRuntimeConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInferenceComponentRequest == false)
            return false;
        UpdateInferenceComponentRequest other = (UpdateInferenceComponentRequest) obj;
        if (other.getInferenceComponentName() == null ^ this.getInferenceComponentName() == null)
            return false;
        if (other.getInferenceComponentName() != null && other.getInferenceComponentName().equals(this.getInferenceComponentName()) == false)
            return false;
        if (other.getSpecification() == null ^ this.getSpecification() == null)
            return false;
        if (other.getSpecification() != null && other.getSpecification().equals(this.getSpecification()) == false)
            return false;
        if (other.getRuntimeConfig() == null ^ this.getRuntimeConfig() == null)
            return false;
        if (other.getRuntimeConfig() != null && other.getRuntimeConfig().equals(this.getRuntimeConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInferenceComponentName() == null) ? 0 : getInferenceComponentName().hashCode());
        hashCode = prime * hashCode + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        hashCode = prime * hashCode + ((getRuntimeConfig() == null) ? 0 : getRuntimeConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInferenceComponentRequest clone() {
        return (UpdateInferenceComponentRequest) super.clone();
    }

}
