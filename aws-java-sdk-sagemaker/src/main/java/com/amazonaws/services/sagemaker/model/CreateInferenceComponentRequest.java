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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateInferenceComponent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInferenceComponentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name to assign to the inference component.
     * </p>
     */
    private String inferenceComponentName;
    /**
     * <p>
     * The name of an existing endpoint where you host the inference component.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The name of an existing production variant where you host the inference component.
     * </p>
     */
    private String variantName;
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
     * A list of key-value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique name to assign to the inference component.
     * </p>
     * 
     * @param inferenceComponentName
     *        A unique name to assign to the inference component.
     */

    public void setInferenceComponentName(String inferenceComponentName) {
        this.inferenceComponentName = inferenceComponentName;
    }

    /**
     * <p>
     * A unique name to assign to the inference component.
     * </p>
     * 
     * @return A unique name to assign to the inference component.
     */

    public String getInferenceComponentName() {
        return this.inferenceComponentName;
    }

    /**
     * <p>
     * A unique name to assign to the inference component.
     * </p>
     * 
     * @param inferenceComponentName
     *        A unique name to assign to the inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceComponentRequest withInferenceComponentName(String inferenceComponentName) {
        setInferenceComponentName(inferenceComponentName);
        return this;
    }

    /**
     * <p>
     * The name of an existing endpoint where you host the inference component.
     * </p>
     * 
     * @param endpointName
     *        The name of an existing endpoint where you host the inference component.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of an existing endpoint where you host the inference component.
     * </p>
     * 
     * @return The name of an existing endpoint where you host the inference component.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of an existing endpoint where you host the inference component.
     * </p>
     * 
     * @param endpointName
     *        The name of an existing endpoint where you host the inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceComponentRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The name of an existing production variant where you host the inference component.
     * </p>
     * 
     * @param variantName
     *        The name of an existing production variant where you host the inference component.
     */

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    /**
     * <p>
     * The name of an existing production variant where you host the inference component.
     * </p>
     * 
     * @return The name of an existing production variant where you host the inference component.
     */

    public String getVariantName() {
        return this.variantName;
    }

    /**
     * <p>
     * The name of an existing production variant where you host the inference component.
     * </p>
     * 
     * @param variantName
     *        The name of an existing production variant where you host the inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceComponentRequest withVariantName(String variantName) {
        setVariantName(variantName);
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

    public CreateInferenceComponentRequest withSpecification(InferenceComponentSpecification specification) {
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

    public CreateInferenceComponentRequest withRuntimeConfig(InferenceComponentRuntimeConfig runtimeConfig) {
        setRuntimeConfig(runtimeConfig);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return A list of key-value pairs associated with the model. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs associated with the model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs associated with the model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceComponentRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs associated with the model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceComponentRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getVariantName() != null)
            sb.append("VariantName: ").append(getVariantName()).append(",");
        if (getSpecification() != null)
            sb.append("Specification: ").append(getSpecification()).append(",");
        if (getRuntimeConfig() != null)
            sb.append("RuntimeConfig: ").append(getRuntimeConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInferenceComponentRequest == false)
            return false;
        CreateInferenceComponentRequest other = (CreateInferenceComponentRequest) obj;
        if (other.getInferenceComponentName() == null ^ this.getInferenceComponentName() == null)
            return false;
        if (other.getInferenceComponentName() != null && other.getInferenceComponentName().equals(this.getInferenceComponentName()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getVariantName() == null ^ this.getVariantName() == null)
            return false;
        if (other.getVariantName() != null && other.getVariantName().equals(this.getVariantName()) == false)
            return false;
        if (other.getSpecification() == null ^ this.getSpecification() == null)
            return false;
        if (other.getSpecification() != null && other.getSpecification().equals(this.getSpecification()) == false)
            return false;
        if (other.getRuntimeConfig() == null ^ this.getRuntimeConfig() == null)
            return false;
        if (other.getRuntimeConfig() != null && other.getRuntimeConfig().equals(this.getRuntimeConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInferenceComponentName() == null) ? 0 : getInferenceComponentName().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getVariantName() == null) ? 0 : getVariantName().hashCode());
        hashCode = prime * hashCode + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        hashCode = prime * hashCode + ((getRuntimeConfig() == null) ? 0 : getRuntimeConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateInferenceComponentRequest clone() {
        return (CreateInferenceComponentRequest) super.clone();
    }

}
