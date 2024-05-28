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
 * Details about the resources to deploy with this inference component, including the model, container, and compute
 * resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InferenceComponentSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceComponentSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an existing SageMaker model object in your account that you want to deploy with the inference
     * component.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * Defines a container that provides the runtime environment for a model that you deploy with an inference
     * component.
     * </p>
     */
    private InferenceComponentContainerSpecification container;
    /**
     * <p>
     * Settings that take effect while the model container starts up.
     * </p>
     */
    private InferenceComponentStartupParameters startupParameters;
    /**
     * <p>
     * The compute resources allocated to run the model assigned to the inference component.
     * </p>
     */
    private InferenceComponentComputeResourceRequirements computeResourceRequirements;

    /**
     * <p>
     * The name of an existing SageMaker model object in your account that you want to deploy with the inference
     * component.
     * </p>
     * 
     * @param modelName
     *        The name of an existing SageMaker model object in your account that you want to deploy with the inference
     *        component.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of an existing SageMaker model object in your account that you want to deploy with the inference
     * component.
     * </p>
     * 
     * @return The name of an existing SageMaker model object in your account that you want to deploy with the inference
     *         component.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of an existing SageMaker model object in your account that you want to deploy with the inference
     * component.
     * </p>
     * 
     * @param modelName
     *        The name of an existing SageMaker model object in your account that you want to deploy with the inference
     *        component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentSpecification withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * Defines a container that provides the runtime environment for a model that you deploy with an inference
     * component.
     * </p>
     * 
     * @param container
     *        Defines a container that provides the runtime environment for a model that you deploy with an inference
     *        component.
     */

    public void setContainer(InferenceComponentContainerSpecification container) {
        this.container = container;
    }

    /**
     * <p>
     * Defines a container that provides the runtime environment for a model that you deploy with an inference
     * component.
     * </p>
     * 
     * @return Defines a container that provides the runtime environment for a model that you deploy with an inference
     *         component.
     */

    public InferenceComponentContainerSpecification getContainer() {
        return this.container;
    }

    /**
     * <p>
     * Defines a container that provides the runtime environment for a model that you deploy with an inference
     * component.
     * </p>
     * 
     * @param container
     *        Defines a container that provides the runtime environment for a model that you deploy with an inference
     *        component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentSpecification withContainer(InferenceComponentContainerSpecification container) {
        setContainer(container);
        return this;
    }

    /**
     * <p>
     * Settings that take effect while the model container starts up.
     * </p>
     * 
     * @param startupParameters
     *        Settings that take effect while the model container starts up.
     */

    public void setStartupParameters(InferenceComponentStartupParameters startupParameters) {
        this.startupParameters = startupParameters;
    }

    /**
     * <p>
     * Settings that take effect while the model container starts up.
     * </p>
     * 
     * @return Settings that take effect while the model container starts up.
     */

    public InferenceComponentStartupParameters getStartupParameters() {
        return this.startupParameters;
    }

    /**
     * <p>
     * Settings that take effect while the model container starts up.
     * </p>
     * 
     * @param startupParameters
     *        Settings that take effect while the model container starts up.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentSpecification withStartupParameters(InferenceComponentStartupParameters startupParameters) {
        setStartupParameters(startupParameters);
        return this;
    }

    /**
     * <p>
     * The compute resources allocated to run the model assigned to the inference component.
     * </p>
     * 
     * @param computeResourceRequirements
     *        The compute resources allocated to run the model assigned to the inference component.
     */

    public void setComputeResourceRequirements(InferenceComponentComputeResourceRequirements computeResourceRequirements) {
        this.computeResourceRequirements = computeResourceRequirements;
    }

    /**
     * <p>
     * The compute resources allocated to run the model assigned to the inference component.
     * </p>
     * 
     * @return The compute resources allocated to run the model assigned to the inference component.
     */

    public InferenceComponentComputeResourceRequirements getComputeResourceRequirements() {
        return this.computeResourceRequirements;
    }

    /**
     * <p>
     * The compute resources allocated to run the model assigned to the inference component.
     * </p>
     * 
     * @param computeResourceRequirements
     *        The compute resources allocated to run the model assigned to the inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentSpecification withComputeResourceRequirements(InferenceComponentComputeResourceRequirements computeResourceRequirements) {
        setComputeResourceRequirements(computeResourceRequirements);
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer()).append(",");
        if (getStartupParameters() != null)
            sb.append("StartupParameters: ").append(getStartupParameters()).append(",");
        if (getComputeResourceRequirements() != null)
            sb.append("ComputeResourceRequirements: ").append(getComputeResourceRequirements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceComponentSpecification == false)
            return false;
        InferenceComponentSpecification other = (InferenceComponentSpecification) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        if (other.getStartupParameters() == null ^ this.getStartupParameters() == null)
            return false;
        if (other.getStartupParameters() != null && other.getStartupParameters().equals(this.getStartupParameters()) == false)
            return false;
        if (other.getComputeResourceRequirements() == null ^ this.getComputeResourceRequirements() == null)
            return false;
        if (other.getComputeResourceRequirements() != null && other.getComputeResourceRequirements().equals(this.getComputeResourceRequirements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getStartupParameters() == null) ? 0 : getStartupParameters().hashCode());
        hashCode = prime * hashCode + ((getComputeResourceRequirements() == null) ? 0 : getComputeResourceRequirements().hashCode());
        return hashCode;
    }

    @Override
    public InferenceComponentSpecification clone() {
        try {
            return (InferenceComponentSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InferenceComponentSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
