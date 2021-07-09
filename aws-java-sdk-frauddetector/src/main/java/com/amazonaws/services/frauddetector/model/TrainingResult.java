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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The training result details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/TrainingResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The validation metrics.
     * </p>
     */
    private DataValidationMetrics dataValidationMetrics;
    /**
     * <p>
     * The training metric details.
     * </p>
     */
    private TrainingMetrics trainingMetrics;
    /**
     * <p>
     * The variable importance metrics.
     * </p>
     */
    private VariableImportanceMetrics variableImportanceMetrics;

    /**
     * <p>
     * The validation metrics.
     * </p>
     * 
     * @param dataValidationMetrics
     *        The validation metrics.
     */

    public void setDataValidationMetrics(DataValidationMetrics dataValidationMetrics) {
        this.dataValidationMetrics = dataValidationMetrics;
    }

    /**
     * <p>
     * The validation metrics.
     * </p>
     * 
     * @return The validation metrics.
     */

    public DataValidationMetrics getDataValidationMetrics() {
        return this.dataValidationMetrics;
    }

    /**
     * <p>
     * The validation metrics.
     * </p>
     * 
     * @param dataValidationMetrics
     *        The validation metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingResult withDataValidationMetrics(DataValidationMetrics dataValidationMetrics) {
        setDataValidationMetrics(dataValidationMetrics);
        return this;
    }

    /**
     * <p>
     * The training metric details.
     * </p>
     * 
     * @param trainingMetrics
     *        The training metric details.
     */

    public void setTrainingMetrics(TrainingMetrics trainingMetrics) {
        this.trainingMetrics = trainingMetrics;
    }

    /**
     * <p>
     * The training metric details.
     * </p>
     * 
     * @return The training metric details.
     */

    public TrainingMetrics getTrainingMetrics() {
        return this.trainingMetrics;
    }

    /**
     * <p>
     * The training metric details.
     * </p>
     * 
     * @param trainingMetrics
     *        The training metric details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingResult withTrainingMetrics(TrainingMetrics trainingMetrics) {
        setTrainingMetrics(trainingMetrics);
        return this;
    }

    /**
     * <p>
     * The variable importance metrics.
     * </p>
     * 
     * @param variableImportanceMetrics
     *        The variable importance metrics.
     */

    public void setVariableImportanceMetrics(VariableImportanceMetrics variableImportanceMetrics) {
        this.variableImportanceMetrics = variableImportanceMetrics;
    }

    /**
     * <p>
     * The variable importance metrics.
     * </p>
     * 
     * @return The variable importance metrics.
     */

    public VariableImportanceMetrics getVariableImportanceMetrics() {
        return this.variableImportanceMetrics;
    }

    /**
     * <p>
     * The variable importance metrics.
     * </p>
     * 
     * @param variableImportanceMetrics
     *        The variable importance metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingResult withVariableImportanceMetrics(VariableImportanceMetrics variableImportanceMetrics) {
        setVariableImportanceMetrics(variableImportanceMetrics);
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
        if (getDataValidationMetrics() != null)
            sb.append("DataValidationMetrics: ").append(getDataValidationMetrics()).append(",");
        if (getTrainingMetrics() != null)
            sb.append("TrainingMetrics: ").append(getTrainingMetrics()).append(",");
        if (getVariableImportanceMetrics() != null)
            sb.append("VariableImportanceMetrics: ").append(getVariableImportanceMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingResult == false)
            return false;
        TrainingResult other = (TrainingResult) obj;
        if (other.getDataValidationMetrics() == null ^ this.getDataValidationMetrics() == null)
            return false;
        if (other.getDataValidationMetrics() != null && other.getDataValidationMetrics().equals(this.getDataValidationMetrics()) == false)
            return false;
        if (other.getTrainingMetrics() == null ^ this.getTrainingMetrics() == null)
            return false;
        if (other.getTrainingMetrics() != null && other.getTrainingMetrics().equals(this.getTrainingMetrics()) == false)
            return false;
        if (other.getVariableImportanceMetrics() == null ^ this.getVariableImportanceMetrics() == null)
            return false;
        if (other.getVariableImportanceMetrics() != null && other.getVariableImportanceMetrics().equals(this.getVariableImportanceMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataValidationMetrics() == null) ? 0 : getDataValidationMetrics().hashCode());
        hashCode = prime * hashCode + ((getTrainingMetrics() == null) ? 0 : getTrainingMetrics().hashCode());
        hashCode = prime * hashCode + ((getVariableImportanceMetrics() == null) ? 0 : getVariableImportanceMetrics().hashCode());
        return hashCode;
    }

    @Override
    public TrainingResult clone() {
        try {
            return (TrainingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.TrainingResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
