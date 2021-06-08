/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Docker container image configuration object for the model bias job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelBiasAppSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelBiasAppSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The container image to be run by the model bias job.
     * </p>
     */
    private String imageUri;
    /**
     * <p>
     * JSON formatted S3 file that defines bias parameters. For more information on this JSON configuration file, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/json-bias-parameter-config.html">Configure bias
     * parameters</a>.
     * </p>
     */
    private String configUri;
    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     */
    private java.util.Map<String, String> environment;

    /**
     * <p>
     * The container image to be run by the model bias job.
     * </p>
     * 
     * @param imageUri
     *        The container image to be run by the model bias job.
     */

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    /**
     * <p>
     * The container image to be run by the model bias job.
     * </p>
     * 
     * @return The container image to be run by the model bias job.
     */

    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * <p>
     * The container image to be run by the model bias job.
     * </p>
     * 
     * @param imageUri
     *        The container image to be run by the model bias job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelBiasAppSpecification withImageUri(String imageUri) {
        setImageUri(imageUri);
        return this;
    }

    /**
     * <p>
     * JSON formatted S3 file that defines bias parameters. For more information on this JSON configuration file, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/json-bias-parameter-config.html">Configure bias
     * parameters</a>.
     * </p>
     * 
     * @param configUri
     *        JSON formatted S3 file that defines bias parameters. For more information on this JSON configuration file,
     *        see <a href="https://docs.aws.amazon.com/sagemaker/latest/json-bias-parameter-config.html">Configure bias
     *        parameters</a>.
     */

    public void setConfigUri(String configUri) {
        this.configUri = configUri;
    }

    /**
     * <p>
     * JSON formatted S3 file that defines bias parameters. For more information on this JSON configuration file, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/json-bias-parameter-config.html">Configure bias
     * parameters</a>.
     * </p>
     * 
     * @return JSON formatted S3 file that defines bias parameters. For more information on this JSON configuration
     *         file, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/json-bias-parameter-config.html">Configure bias
     *         parameters</a>.
     */

    public String getConfigUri() {
        return this.configUri;
    }

    /**
     * <p>
     * JSON formatted S3 file that defines bias parameters. For more information on this JSON configuration file, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/json-bias-parameter-config.html">Configure bias
     * parameters</a>.
     * </p>
     * 
     * @param configUri
     *        JSON formatted S3 file that defines bias parameters. For more information on this JSON configuration file,
     *        see <a href="https://docs.aws.amazon.com/sagemaker/latest/json-bias-parameter-config.html">Configure bias
     *        parameters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelBiasAppSpecification withConfigUri(String configUri) {
        setConfigUri(configUri);
        return this;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     * 
     * @return Sets the environment variables in the Docker container.
     */

    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     * 
     * @param environment
     *        Sets the environment variables in the Docker container.
     */

    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     * 
     * @param environment
     *        Sets the environment variables in the Docker container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelBiasAppSpecification withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * Add a single Environment entry
     *
     * @see ModelBiasAppSpecification#withEnvironment
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ModelBiasAppSpecification addEnvironmentEntry(String key, String value) {
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

    public ModelBiasAppSpecification clearEnvironmentEntries() {
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
        if (getImageUri() != null)
            sb.append("ImageUri: ").append(getImageUri()).append(",");
        if (getConfigUri() != null)
            sb.append("ConfigUri: ").append(getConfigUri()).append(",");
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

        if (obj instanceof ModelBiasAppSpecification == false)
            return false;
        ModelBiasAppSpecification other = (ModelBiasAppSpecification) obj;
        if (other.getImageUri() == null ^ this.getImageUri() == null)
            return false;
        if (other.getImageUri() != null && other.getImageUri().equals(this.getImageUri()) == false)
            return false;
        if (other.getConfigUri() == null ^ this.getConfigUri() == null)
            return false;
        if (other.getConfigUri() != null && other.getConfigUri().equals(this.getConfigUri()) == false)
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

        hashCode = prime * hashCode + ((getImageUri() == null) ? 0 : getImageUri().hashCode());
        hashCode = prime * hashCode + ((getConfigUri() == null) ? 0 : getConfigUri().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        return hashCode;
    }

    @Override
    public ModelBiasAppSpecification clone() {
        try {
            return (ModelBiasAppSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelBiasAppSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
