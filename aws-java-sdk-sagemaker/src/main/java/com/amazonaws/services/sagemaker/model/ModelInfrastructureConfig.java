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
 * The configuration for the infrastructure that the model will be deployed to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelInfrastructureConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelInfrastructureConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The inference option to which to deploy your model. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RealTime</code>: Deploy to real-time inference.
     * </p>
     * </li>
     * </ul>
     */
    private String infrastructureType;
    /**
     * <p>
     * The infrastructure configuration for deploying the model to real-time inference.
     * </p>
     */
    private RealTimeInferenceConfig realTimeInferenceConfig;

    /**
     * <p>
     * The inference option to which to deploy your model. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RealTime</code>: Deploy to real-time inference.
     * </p>
     * </li>
     * </ul>
     * 
     * @param infrastructureType
     *        The inference option to which to deploy your model. Possible values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RealTime</code>: Deploy to real-time inference.
     *        </p>
     *        </li>
     * @see ModelInfrastructureType
     */

    public void setInfrastructureType(String infrastructureType) {
        this.infrastructureType = infrastructureType;
    }

    /**
     * <p>
     * The inference option to which to deploy your model. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RealTime</code>: Deploy to real-time inference.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The inference option to which to deploy your model. Possible values are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RealTime</code>: Deploy to real-time inference.
     *         </p>
     *         </li>
     * @see ModelInfrastructureType
     */

    public String getInfrastructureType() {
        return this.infrastructureType;
    }

    /**
     * <p>
     * The inference option to which to deploy your model. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RealTime</code>: Deploy to real-time inference.
     * </p>
     * </li>
     * </ul>
     * 
     * @param infrastructureType
     *        The inference option to which to deploy your model. Possible values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RealTime</code>: Deploy to real-time inference.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelInfrastructureType
     */

    public ModelInfrastructureConfig withInfrastructureType(String infrastructureType) {
        setInfrastructureType(infrastructureType);
        return this;
    }

    /**
     * <p>
     * The inference option to which to deploy your model. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RealTime</code>: Deploy to real-time inference.
     * </p>
     * </li>
     * </ul>
     * 
     * @param infrastructureType
     *        The inference option to which to deploy your model. Possible values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RealTime</code>: Deploy to real-time inference.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelInfrastructureType
     */

    public ModelInfrastructureConfig withInfrastructureType(ModelInfrastructureType infrastructureType) {
        this.infrastructureType = infrastructureType.toString();
        return this;
    }

    /**
     * <p>
     * The infrastructure configuration for deploying the model to real-time inference.
     * </p>
     * 
     * @param realTimeInferenceConfig
     *        The infrastructure configuration for deploying the model to real-time inference.
     */

    public void setRealTimeInferenceConfig(RealTimeInferenceConfig realTimeInferenceConfig) {
        this.realTimeInferenceConfig = realTimeInferenceConfig;
    }

    /**
     * <p>
     * The infrastructure configuration for deploying the model to real-time inference.
     * </p>
     * 
     * @return The infrastructure configuration for deploying the model to real-time inference.
     */

    public RealTimeInferenceConfig getRealTimeInferenceConfig() {
        return this.realTimeInferenceConfig;
    }

    /**
     * <p>
     * The infrastructure configuration for deploying the model to real-time inference.
     * </p>
     * 
     * @param realTimeInferenceConfig
     *        The infrastructure configuration for deploying the model to real-time inference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelInfrastructureConfig withRealTimeInferenceConfig(RealTimeInferenceConfig realTimeInferenceConfig) {
        setRealTimeInferenceConfig(realTimeInferenceConfig);
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
        if (getInfrastructureType() != null)
            sb.append("InfrastructureType: ").append(getInfrastructureType()).append(",");
        if (getRealTimeInferenceConfig() != null)
            sb.append("RealTimeInferenceConfig: ").append(getRealTimeInferenceConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelInfrastructureConfig == false)
            return false;
        ModelInfrastructureConfig other = (ModelInfrastructureConfig) obj;
        if (other.getInfrastructureType() == null ^ this.getInfrastructureType() == null)
            return false;
        if (other.getInfrastructureType() != null && other.getInfrastructureType().equals(this.getInfrastructureType()) == false)
            return false;
        if (other.getRealTimeInferenceConfig() == null ^ this.getRealTimeInferenceConfig() == null)
            return false;
        if (other.getRealTimeInferenceConfig() != null && other.getRealTimeInferenceConfig().equals(this.getRealTimeInferenceConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInfrastructureType() == null) ? 0 : getInfrastructureType().hashCode());
        hashCode = prime * hashCode + ((getRealTimeInferenceConfig() == null) ? 0 : getRealTimeInferenceConfig().hashCode());
        return hashCode;
    }

    @Override
    public ModelInfrastructureConfig clone() {
        try {
            return (ModelInfrastructureConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelInfrastructureConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
