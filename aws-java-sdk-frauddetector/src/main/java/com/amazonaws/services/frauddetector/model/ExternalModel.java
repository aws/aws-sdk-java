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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon SageMaker model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ExternalModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExternalModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon SageMaker model endpoints.
     * </p>
     */
    private String modelEndpoint;
    /**
     * <p>
     * The source of the model.
     * </p>
     */
    private String modelSource;
    /**
     * <p>
     * The role used to invoke the model.
     * </p>
     */
    private Role role;
    /**
     * <p>
     * The input configuration.
     * </p>
     */
    private ModelInputConfiguration inputConfiguration;
    /**
     * <p>
     * The output configuration.
     * </p>
     */
    private ModelOutputConfiguration outputConfiguration;
    /**
     * <p>
     * The Amazon Fraud Detector status for the external model endpoint
     * </p>
     */
    private String modelEndpointStatus;
    /**
     * <p>
     * Timestamp of when the model was last updated.
     * </p>
     */
    private String lastUpdatedTime;
    /**
     * <p>
     * Timestamp of when the model was last created.
     * </p>
     */
    private String createdTime;

    /**
     * <p>
     * The Amazon SageMaker model endpoints.
     * </p>
     * 
     * @param modelEndpoint
     *        The Amazon SageMaker model endpoints.
     */

    public void setModelEndpoint(String modelEndpoint) {
        this.modelEndpoint = modelEndpoint;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoints.
     * </p>
     * 
     * @return The Amazon SageMaker model endpoints.
     */

    public String getModelEndpoint() {
        return this.modelEndpoint;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoints.
     * </p>
     * 
     * @param modelEndpoint
     *        The Amazon SageMaker model endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalModel withModelEndpoint(String modelEndpoint) {
        setModelEndpoint(modelEndpoint);
        return this;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * 
     * @param modelSource
     *        The source of the model.
     * @see ModelSource
     */

    public void setModelSource(String modelSource) {
        this.modelSource = modelSource;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * 
     * @return The source of the model.
     * @see ModelSource
     */

    public String getModelSource() {
        return this.modelSource;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * 
     * @param modelSource
     *        The source of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelSource
     */

    public ExternalModel withModelSource(String modelSource) {
        setModelSource(modelSource);
        return this;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * 
     * @param modelSource
     *        The source of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelSource
     */

    public ExternalModel withModelSource(ModelSource modelSource) {
        this.modelSource = modelSource.toString();
        return this;
    }

    /**
     * <p>
     * The role used to invoke the model.
     * </p>
     * 
     * @param role
     *        The role used to invoke the model.
     */

    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * <p>
     * The role used to invoke the model.
     * </p>
     * 
     * @return The role used to invoke the model.
     */

    public Role getRole() {
        return this.role;
    }

    /**
     * <p>
     * The role used to invoke the model.
     * </p>
     * 
     * @param role
     *        The role used to invoke the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalModel withRole(Role role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The input configuration.
     * </p>
     * 
     * @param inputConfiguration
     *        The input configuration.
     */

    public void setInputConfiguration(ModelInputConfiguration inputConfiguration) {
        this.inputConfiguration = inputConfiguration;
    }

    /**
     * <p>
     * The input configuration.
     * </p>
     * 
     * @return The input configuration.
     */

    public ModelInputConfiguration getInputConfiguration() {
        return this.inputConfiguration;
    }

    /**
     * <p>
     * The input configuration.
     * </p>
     * 
     * @param inputConfiguration
     *        The input configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalModel withInputConfiguration(ModelInputConfiguration inputConfiguration) {
        setInputConfiguration(inputConfiguration);
        return this;
    }

    /**
     * <p>
     * The output configuration.
     * </p>
     * 
     * @param outputConfiguration
     *        The output configuration.
     */

    public void setOutputConfiguration(ModelOutputConfiguration outputConfiguration) {
        this.outputConfiguration = outputConfiguration;
    }

    /**
     * <p>
     * The output configuration.
     * </p>
     * 
     * @return The output configuration.
     */

    public ModelOutputConfiguration getOutputConfiguration() {
        return this.outputConfiguration;
    }

    /**
     * <p>
     * The output configuration.
     * </p>
     * 
     * @param outputConfiguration
     *        The output configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalModel withOutputConfiguration(ModelOutputConfiguration outputConfiguration) {
        setOutputConfiguration(outputConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Fraud Detector status for the external model endpoint
     * </p>
     * 
     * @param modelEndpointStatus
     *        The Amazon Fraud Detector status for the external model endpoint
     * @see ModelEndpointStatus
     */

    public void setModelEndpointStatus(String modelEndpointStatus) {
        this.modelEndpointStatus = modelEndpointStatus;
    }

    /**
     * <p>
     * The Amazon Fraud Detector status for the external model endpoint
     * </p>
     * 
     * @return The Amazon Fraud Detector status for the external model endpoint
     * @see ModelEndpointStatus
     */

    public String getModelEndpointStatus() {
        return this.modelEndpointStatus;
    }

    /**
     * <p>
     * The Amazon Fraud Detector status for the external model endpoint
     * </p>
     * 
     * @param modelEndpointStatus
     *        The Amazon Fraud Detector status for the external model endpoint
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelEndpointStatus
     */

    public ExternalModel withModelEndpointStatus(String modelEndpointStatus) {
        setModelEndpointStatus(modelEndpointStatus);
        return this;
    }

    /**
     * <p>
     * The Amazon Fraud Detector status for the external model endpoint
     * </p>
     * 
     * @param modelEndpointStatus
     *        The Amazon Fraud Detector status for the external model endpoint
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelEndpointStatus
     */

    public ExternalModel withModelEndpointStatus(ModelEndpointStatus modelEndpointStatus) {
        this.modelEndpointStatus = modelEndpointStatus.toString();
        return this;
    }

    /**
     * <p>
     * Timestamp of when the model was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Timestamp of when the model was last updated.
     */

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of when the model was last updated.
     * </p>
     * 
     * @return Timestamp of when the model was last updated.
     */

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of when the model was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Timestamp of when the model was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalModel withLastUpdatedTime(String lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * Timestamp of when the model was last created.
     * </p>
     * 
     * @param createdTime
     *        Timestamp of when the model was last created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * Timestamp of when the model was last created.
     * </p>
     * 
     * @return Timestamp of when the model was last created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * Timestamp of when the model was last created.
     * </p>
     * 
     * @param createdTime
     *        Timestamp of when the model was last created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalModel withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
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
        if (getModelEndpoint() != null)
            sb.append("ModelEndpoint: ").append(getModelEndpoint()).append(",");
        if (getModelSource() != null)
            sb.append("ModelSource: ").append(getModelSource()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getInputConfiguration() != null)
            sb.append("InputConfiguration: ").append(getInputConfiguration()).append(",");
        if (getOutputConfiguration() != null)
            sb.append("OutputConfiguration: ").append(getOutputConfiguration()).append(",");
        if (getModelEndpointStatus() != null)
            sb.append("ModelEndpointStatus: ").append(getModelEndpointStatus()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExternalModel == false)
            return false;
        ExternalModel other = (ExternalModel) obj;
        if (other.getModelEndpoint() == null ^ this.getModelEndpoint() == null)
            return false;
        if (other.getModelEndpoint() != null && other.getModelEndpoint().equals(this.getModelEndpoint()) == false)
            return false;
        if (other.getModelSource() == null ^ this.getModelSource() == null)
            return false;
        if (other.getModelSource() != null && other.getModelSource().equals(this.getModelSource()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getInputConfiguration() == null ^ this.getInputConfiguration() == null)
            return false;
        if (other.getInputConfiguration() != null && other.getInputConfiguration().equals(this.getInputConfiguration()) == false)
            return false;
        if (other.getOutputConfiguration() == null ^ this.getOutputConfiguration() == null)
            return false;
        if (other.getOutputConfiguration() != null && other.getOutputConfiguration().equals(this.getOutputConfiguration()) == false)
            return false;
        if (other.getModelEndpointStatus() == null ^ this.getModelEndpointStatus() == null)
            return false;
        if (other.getModelEndpointStatus() != null && other.getModelEndpointStatus().equals(this.getModelEndpointStatus()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelEndpoint() == null) ? 0 : getModelEndpoint().hashCode());
        hashCode = prime * hashCode + ((getModelSource() == null) ? 0 : getModelSource().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getInputConfiguration() == null) ? 0 : getInputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOutputConfiguration() == null) ? 0 : getOutputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getModelEndpointStatus() == null) ? 0 : getModelEndpointStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public ExternalModel clone() {
        try {
            return (ExternalModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.ExternalModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
