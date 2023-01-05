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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the external (Amazon Sagemaker) model evaluated for generating predictions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/EvaluatedExternalModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluatedExternalModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint of the external (Amazon Sagemaker) model.
     * </p>
     */
    private String modelEndpoint;
    /**
     * <p>
     * Indicates whether event variables were used to generate predictions.
     * </p>
     */
    private Boolean useEventVariables;
    /**
     * <p>
     * Input variables use for generating predictions.
     * </p>
     */
    private java.util.Map<String, String> inputVariables;
    /**
     * <p>
     * Output variables.
     * </p>
     */
    private java.util.Map<String, String> outputVariables;

    /**
     * <p>
     * The endpoint of the external (Amazon Sagemaker) model.
     * </p>
     * 
     * @param modelEndpoint
     *        The endpoint of the external (Amazon Sagemaker) model.
     */

    public void setModelEndpoint(String modelEndpoint) {
        this.modelEndpoint = modelEndpoint;
    }

    /**
     * <p>
     * The endpoint of the external (Amazon Sagemaker) model.
     * </p>
     * 
     * @return The endpoint of the external (Amazon Sagemaker) model.
     */

    public String getModelEndpoint() {
        return this.modelEndpoint;
    }

    /**
     * <p>
     * The endpoint of the external (Amazon Sagemaker) model.
     * </p>
     * 
     * @param modelEndpoint
     *        The endpoint of the external (Amazon Sagemaker) model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedExternalModel withModelEndpoint(String modelEndpoint) {
        setModelEndpoint(modelEndpoint);
        return this;
    }

    /**
     * <p>
     * Indicates whether event variables were used to generate predictions.
     * </p>
     * 
     * @param useEventVariables
     *        Indicates whether event variables were used to generate predictions.
     */

    public void setUseEventVariables(Boolean useEventVariables) {
        this.useEventVariables = useEventVariables;
    }

    /**
     * <p>
     * Indicates whether event variables were used to generate predictions.
     * </p>
     * 
     * @return Indicates whether event variables were used to generate predictions.
     */

    public Boolean getUseEventVariables() {
        return this.useEventVariables;
    }

    /**
     * <p>
     * Indicates whether event variables were used to generate predictions.
     * </p>
     * 
     * @param useEventVariables
     *        Indicates whether event variables were used to generate predictions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedExternalModel withUseEventVariables(Boolean useEventVariables) {
        setUseEventVariables(useEventVariables);
        return this;
    }

    /**
     * <p>
     * Indicates whether event variables were used to generate predictions.
     * </p>
     * 
     * @return Indicates whether event variables were used to generate predictions.
     */

    public Boolean isUseEventVariables() {
        return this.useEventVariables;
    }

    /**
     * <p>
     * Input variables use for generating predictions.
     * </p>
     * 
     * @return Input variables use for generating predictions.
     */

    public java.util.Map<String, String> getInputVariables() {
        return inputVariables;
    }

    /**
     * <p>
     * Input variables use for generating predictions.
     * </p>
     * 
     * @param inputVariables
     *        Input variables use for generating predictions.
     */

    public void setInputVariables(java.util.Map<String, String> inputVariables) {
        this.inputVariables = inputVariables;
    }

    /**
     * <p>
     * Input variables use for generating predictions.
     * </p>
     * 
     * @param inputVariables
     *        Input variables use for generating predictions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedExternalModel withInputVariables(java.util.Map<String, String> inputVariables) {
        setInputVariables(inputVariables);
        return this;
    }

    /**
     * Add a single InputVariables entry
     *
     * @see EvaluatedExternalModel#withInputVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedExternalModel addInputVariablesEntry(String key, String value) {
        if (null == this.inputVariables) {
            this.inputVariables = new java.util.HashMap<String, String>();
        }
        if (this.inputVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.inputVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into InputVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedExternalModel clearInputVariablesEntries() {
        this.inputVariables = null;
        return this;
    }

    /**
     * <p>
     * Output variables.
     * </p>
     * 
     * @return Output variables.
     */

    public java.util.Map<String, String> getOutputVariables() {
        return outputVariables;
    }

    /**
     * <p>
     * Output variables.
     * </p>
     * 
     * @param outputVariables
     *        Output variables.
     */

    public void setOutputVariables(java.util.Map<String, String> outputVariables) {
        this.outputVariables = outputVariables;
    }

    /**
     * <p>
     * Output variables.
     * </p>
     * 
     * @param outputVariables
     *        Output variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedExternalModel withOutputVariables(java.util.Map<String, String> outputVariables) {
        setOutputVariables(outputVariables);
        return this;
    }

    /**
     * Add a single OutputVariables entry
     *
     * @see EvaluatedExternalModel#withOutputVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedExternalModel addOutputVariablesEntry(String key, String value) {
        if (null == this.outputVariables) {
            this.outputVariables = new java.util.HashMap<String, String>();
        }
        if (this.outputVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.outputVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OutputVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedExternalModel clearOutputVariablesEntries() {
        this.outputVariables = null;
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
        if (getUseEventVariables() != null)
            sb.append("UseEventVariables: ").append(getUseEventVariables()).append(",");
        if (getInputVariables() != null)
            sb.append("InputVariables: ").append("***Sensitive Data Redacted***").append(",");
        if (getOutputVariables() != null)
            sb.append("OutputVariables: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluatedExternalModel == false)
            return false;
        EvaluatedExternalModel other = (EvaluatedExternalModel) obj;
        if (other.getModelEndpoint() == null ^ this.getModelEndpoint() == null)
            return false;
        if (other.getModelEndpoint() != null && other.getModelEndpoint().equals(this.getModelEndpoint()) == false)
            return false;
        if (other.getUseEventVariables() == null ^ this.getUseEventVariables() == null)
            return false;
        if (other.getUseEventVariables() != null && other.getUseEventVariables().equals(this.getUseEventVariables()) == false)
            return false;
        if (other.getInputVariables() == null ^ this.getInputVariables() == null)
            return false;
        if (other.getInputVariables() != null && other.getInputVariables().equals(this.getInputVariables()) == false)
            return false;
        if (other.getOutputVariables() == null ^ this.getOutputVariables() == null)
            return false;
        if (other.getOutputVariables() != null && other.getOutputVariables().equals(this.getOutputVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelEndpoint() == null) ? 0 : getModelEndpoint().hashCode());
        hashCode = prime * hashCode + ((getUseEventVariables() == null) ? 0 : getUseEventVariables().hashCode());
        hashCode = prime * hashCode + ((getInputVariables() == null) ? 0 : getInputVariables().hashCode());
        hashCode = prime * hashCode + ((getOutputVariables() == null) ? 0 : getOutputVariables().hashCode());
        return hashCode;
    }

    @Override
    public EvaluatedExternalModel clone() {
        try {
            return (EvaluatedExternalModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.EvaluatedExternalModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
