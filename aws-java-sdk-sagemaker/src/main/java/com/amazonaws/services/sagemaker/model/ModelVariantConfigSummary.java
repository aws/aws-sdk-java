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
 * Summary of the deployment configuration of a model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelVariantConfigSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelVariantConfigSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The configuration of the infrastructure that the model has been deployed to.
     * </p>
     */
    private ModelInfrastructureConfig infrastructureConfig;
    /**
     * <p>
     * The status of deployment for the model variant on the hosted inference endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - Amazon SageMaker is preparing the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - The model variant is running on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code> - Amazon SageMaker is updating the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code> - Amazon SageMaker is deleting the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code> - The model variant has been deleted on the hosted inference endpoint. This can only happen
     * after stopping the experiment.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

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

    public ModelVariantConfigSummary withModelName(String modelName) {
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

    public ModelVariantConfigSummary withVariantName(String variantName) {
        setVariantName(variantName);
        return this;
    }

    /**
     * <p>
     * The configuration of the infrastructure that the model has been deployed to.
     * </p>
     * 
     * @param infrastructureConfig
     *        The configuration of the infrastructure that the model has been deployed to.
     */

    public void setInfrastructureConfig(ModelInfrastructureConfig infrastructureConfig) {
        this.infrastructureConfig = infrastructureConfig;
    }

    /**
     * <p>
     * The configuration of the infrastructure that the model has been deployed to.
     * </p>
     * 
     * @return The configuration of the infrastructure that the model has been deployed to.
     */

    public ModelInfrastructureConfig getInfrastructureConfig() {
        return this.infrastructureConfig;
    }

    /**
     * <p>
     * The configuration of the infrastructure that the model has been deployed to.
     * </p>
     * 
     * @param infrastructureConfig
     *        The configuration of the infrastructure that the model has been deployed to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVariantConfigSummary withInfrastructureConfig(ModelInfrastructureConfig infrastructureConfig) {
        setInfrastructureConfig(infrastructureConfig);
        return this;
    }

    /**
     * <p>
     * The status of deployment for the model variant on the hosted inference endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - Amazon SageMaker is preparing the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - The model variant is running on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code> - Amazon SageMaker is updating the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code> - Amazon SageMaker is deleting the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code> - The model variant has been deleted on the hosted inference endpoint. This can only happen
     * after stopping the experiment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of deployment for the model variant on the hosted inference endpoint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code> - Amazon SageMaker is preparing the model variant on the hosted inference endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InService</code> - The model variant is running on the hosted inference endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Updating</code> - Amazon SageMaker is updating the model variant on the hosted inference endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code> - Amazon SageMaker is deleting the model variant on the hosted inference endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleted</code> - The model variant has been deleted on the hosted inference endpoint. This can only
     *        happen after stopping the experiment.
     *        </p>
     *        </li>
     * @see ModelVariantStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of deployment for the model variant on the hosted inference endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - Amazon SageMaker is preparing the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - The model variant is running on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code> - Amazon SageMaker is updating the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code> - Amazon SageMaker is deleting the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code> - The model variant has been deleted on the hosted inference endpoint. This can only happen
     * after stopping the experiment.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of deployment for the model variant on the hosted inference endpoint.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Creating</code> - Amazon SageMaker is preparing the model variant on the hosted inference endpoint.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InService</code> - The model variant is running on the hosted inference endpoint.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Updating</code> - Amazon SageMaker is updating the model variant on the hosted inference endpoint.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deleting</code> - Amazon SageMaker is deleting the model variant on the hosted inference endpoint.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deleted</code> - The model variant has been deleted on the hosted inference endpoint. This can only
     *         happen after stopping the experiment.
     *         </p>
     *         </li>
     * @see ModelVariantStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of deployment for the model variant on the hosted inference endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - Amazon SageMaker is preparing the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - The model variant is running on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code> - Amazon SageMaker is updating the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code> - Amazon SageMaker is deleting the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code> - The model variant has been deleted on the hosted inference endpoint. This can only happen
     * after stopping the experiment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of deployment for the model variant on the hosted inference endpoint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code> - Amazon SageMaker is preparing the model variant on the hosted inference endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InService</code> - The model variant is running on the hosted inference endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Updating</code> - Amazon SageMaker is updating the model variant on the hosted inference endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code> - Amazon SageMaker is deleting the model variant on the hosted inference endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleted</code> - The model variant has been deleted on the hosted inference endpoint. This can only
     *        happen after stopping the experiment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVariantStatus
     */

    public ModelVariantConfigSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of deployment for the model variant on the hosted inference endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - Amazon SageMaker is preparing the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - The model variant is running on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code> - Amazon SageMaker is updating the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code> - Amazon SageMaker is deleting the model variant on the hosted inference endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code> - The model variant has been deleted on the hosted inference endpoint. This can only happen
     * after stopping the experiment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of deployment for the model variant on the hosted inference endpoint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code> - Amazon SageMaker is preparing the model variant on the hosted inference endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InService</code> - The model variant is running on the hosted inference endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Updating</code> - Amazon SageMaker is updating the model variant on the hosted inference endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code> - Amazon SageMaker is deleting the model variant on the hosted inference endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleted</code> - The model variant has been deleted on the hosted inference endpoint. This can only
     *        happen after stopping the experiment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVariantStatus
     */

    public ModelVariantConfigSummary withStatus(ModelVariantStatus status) {
        this.status = status.toString();
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
            sb.append("InfrastructureConfig: ").append(getInfrastructureConfig()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelVariantConfigSummary == false)
            return false;
        ModelVariantConfigSummary other = (ModelVariantConfigSummary) obj;
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ModelVariantConfigSummary clone() {
        try {
            return (ModelVariantConfigSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelVariantConfigSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
