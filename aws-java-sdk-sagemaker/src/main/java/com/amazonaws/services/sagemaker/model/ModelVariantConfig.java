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
 * Contains information about the deployment options of a model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelVariantConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelVariantConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon SageMaker Model entity.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The name of the variant.
     * </p>
     */
    private String variantName;
    /**
     * <p>
     * The configuration for the infrastructure that the model will be deployed to.
     * </p>
     */
    private ModelInfrastructureConfig infrastructureConfig;

    /**
     * <p>
     * The name of the Amazon SageMaker Model entity.
     * </p>
     * 
     * @param modelName
     *        The name of the Amazon SageMaker Model entity.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker Model entity.
     * </p>
     * 
     * @return The name of the Amazon SageMaker Model entity.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker Model entity.
     * </p>
     * 
     * @param modelName
     *        The name of the Amazon SageMaker Model entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVariantConfig withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The name of the variant.
     * </p>
     * 
     * @param variantName
     *        The name of the variant.
     */

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    /**
     * <p>
     * The name of the variant.
     * </p>
     * 
     * @return The name of the variant.
     */

    public String getVariantName() {
        return this.variantName;
    }

    /**
     * <p>
     * The name of the variant.
     * </p>
     * 
     * @param variantName
     *        The name of the variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVariantConfig withVariantName(String variantName) {
        setVariantName(variantName);
        return this;
    }

    /**
     * <p>
     * The configuration for the infrastructure that the model will be deployed to.
     * </p>
     * 
     * @param infrastructureConfig
     *        The configuration for the infrastructure that the model will be deployed to.
     */

    public void setInfrastructureConfig(ModelInfrastructureConfig infrastructureConfig) {
        this.infrastructureConfig = infrastructureConfig;
    }

    /**
     * <p>
     * The configuration for the infrastructure that the model will be deployed to.
     * </p>
     * 
     * @return The configuration for the infrastructure that the model will be deployed to.
     */

    public ModelInfrastructureConfig getInfrastructureConfig() {
        return this.infrastructureConfig;
    }

    /**
     * <p>
     * The configuration for the infrastructure that the model will be deployed to.
     * </p>
     * 
     * @param infrastructureConfig
     *        The configuration for the infrastructure that the model will be deployed to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVariantConfig withInfrastructureConfig(ModelInfrastructureConfig infrastructureConfig) {
        setInfrastructureConfig(infrastructureConfig);
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
        if (getVariantName() != null)
            sb.append("VariantName: ").append(getVariantName()).append(",");
        if (getInfrastructureConfig() != null)
            sb.append("InfrastructureConfig: ").append(getInfrastructureConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelVariantConfig == false)
            return false;
        ModelVariantConfig other = (ModelVariantConfig) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getVariantName() == null ^ this.getVariantName() == null)
            return false;
        if (other.getVariantName() != null && other.getVariantName().equals(this.getVariantName()) == false)
            return false;
        if (other.getInfrastructureConfig() == null ^ this.getInfrastructureConfig() == null)
            return false;
        if (other.getInfrastructureConfig() != null && other.getInfrastructureConfig().equals(this.getInfrastructureConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getVariantName() == null) ? 0 : getVariantName().hashCode());
        hashCode = prime * hashCode + ((getInfrastructureConfig() == null) ? 0 : getInfrastructureConfig().hashCode());
        return hashCode;
    }

    @Override
    public ModelVariantConfig clone() {
        try {
            return (ModelVariantConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelVariantConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
