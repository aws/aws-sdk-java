/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A list of container definitions that describe the different containers that make up one AutoML candidate. Refer to
 * ContainerDefinition for more details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLContainerDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLContainerDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ECR path of the container. Refer to ContainerDefinition for more details.
     * </p>
     */
    private String image;
    /**
     * <p>
     * The location of the model artifacts. Refer to ContainerDefinition for more details.
     * </p>
     */
    private String modelDataUrl;
    /**
     * <p>
     * Environment variables to set in the container. Refer to ContainerDefinition for more details.
     * </p>
     */
    private java.util.Map<String, String> environment;

    /**
     * <p>
     * The ECR path of the container. Refer to ContainerDefinition for more details.
     * </p>
     * 
     * @param image
     *        The ECR path of the container. Refer to ContainerDefinition for more details.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The ECR path of the container. Refer to ContainerDefinition for more details.
     * </p>
     * 
     * @return The ECR path of the container. Refer to ContainerDefinition for more details.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The ECR path of the container. Refer to ContainerDefinition for more details.
     * </p>
     * 
     * @param image
     *        The ECR path of the container. Refer to ContainerDefinition for more details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLContainerDefinition withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The location of the model artifacts. Refer to ContainerDefinition for more details.
     * </p>
     * 
     * @param modelDataUrl
     *        The location of the model artifacts. Refer to ContainerDefinition for more details.
     */

    public void setModelDataUrl(String modelDataUrl) {
        this.modelDataUrl = modelDataUrl;
    }

    /**
     * <p>
     * The location of the model artifacts. Refer to ContainerDefinition for more details.
     * </p>
     * 
     * @return The location of the model artifacts. Refer to ContainerDefinition for more details.
     */

    public String getModelDataUrl() {
        return this.modelDataUrl;
    }

    /**
     * <p>
     * The location of the model artifacts. Refer to ContainerDefinition for more details.
     * </p>
     * 
     * @param modelDataUrl
     *        The location of the model artifacts. Refer to ContainerDefinition for more details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLContainerDefinition withModelDataUrl(String modelDataUrl) {
        setModelDataUrl(modelDataUrl);
        return this;
    }

    /**
     * <p>
     * Environment variables to set in the container. Refer to ContainerDefinition for more details.
     * </p>
     * 
     * @return Environment variables to set in the container. Refer to ContainerDefinition for more details.
     */

    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * Environment variables to set in the container. Refer to ContainerDefinition for more details.
     * </p>
     * 
     * @param environment
     *        Environment variables to set in the container. Refer to ContainerDefinition for more details.
     */

    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Environment variables to set in the container. Refer to ContainerDefinition for more details.
     * </p>
     * 
     * @param environment
     *        Environment variables to set in the container. Refer to ContainerDefinition for more details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLContainerDefinition withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * Add a single Environment entry
     *
     * @see AutoMLContainerDefinition#withEnvironment
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLContainerDefinition addEnvironmentEntry(String key, String value) {
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

    public AutoMLContainerDefinition clearEnvironmentEntries() {
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getModelDataUrl() != null)
            sb.append("ModelDataUrl: ").append(getModelDataUrl()).append(",");
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

        if (obj instanceof AutoMLContainerDefinition == false)
            return false;
        AutoMLContainerDefinition other = (AutoMLContainerDefinition) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getModelDataUrl() == null ^ this.getModelDataUrl() == null)
            return false;
        if (other.getModelDataUrl() != null && other.getModelDataUrl().equals(this.getModelDataUrl()) == false)
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

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getModelDataUrl() == null) ? 0 : getModelDataUrl().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLContainerDefinition clone() {
        try {
            return (AutoMLContainerDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLContainerDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
