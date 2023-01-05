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
 * The training result details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/TrainingResultV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingResultV2 implements Serializable, Cloneable, StructuredPojo {

    private DataValidationMetrics dataValidationMetrics;
    /**
     * <p>
     * The training metric details.
     * </p>
     */
    private TrainingMetricsV2 trainingMetricsV2;

    private VariableImportanceMetrics variableImportanceMetrics;
    /**
     * <p>
     * The variable importance metrics of the aggregated variables.
     * </p>
     * <p>
     * Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously
     * calculate a set of variables (aggregated variables) based on historical events. For example, your ATI model might
     * calculate the number of times an user has logged in using the same IP address. In this case, event variables used
     * to derive the aggregated variables are <code>IP address</code> and <code>user</code>.
     * </p>
     */
    private AggregatedVariablesImportanceMetrics aggregatedVariablesImportanceMetrics;

    /**
     * @param dataValidationMetrics
     */

    public void setDataValidationMetrics(DataValidationMetrics dataValidationMetrics) {
        this.dataValidationMetrics = dataValidationMetrics;
    }

    /**
     * @return
     */

    public DataValidationMetrics getDataValidationMetrics() {
        return this.dataValidationMetrics;
    }

    /**
     * @param dataValidationMetrics
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingResultV2 withDataValidationMetrics(DataValidationMetrics dataValidationMetrics) {
        setDataValidationMetrics(dataValidationMetrics);
        return this;
    }

    /**
     * <p>
     * The training metric details.
     * </p>
     * 
     * @param trainingMetricsV2
     *        The training metric details.
     */

    public void setTrainingMetricsV2(TrainingMetricsV2 trainingMetricsV2) {
        this.trainingMetricsV2 = trainingMetricsV2;
    }

    /**
     * <p>
     * The training metric details.
     * </p>
     * 
     * @return The training metric details.
     */

    public TrainingMetricsV2 getTrainingMetricsV2() {
        return this.trainingMetricsV2;
    }

    /**
     * <p>
     * The training metric details.
     * </p>
     * 
     * @param trainingMetricsV2
     *        The training metric details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingResultV2 withTrainingMetricsV2(TrainingMetricsV2 trainingMetricsV2) {
        setTrainingMetricsV2(trainingMetricsV2);
        return this;
    }

    /**
     * @param variableImportanceMetrics
     */

    public void setVariableImportanceMetrics(VariableImportanceMetrics variableImportanceMetrics) {
        this.variableImportanceMetrics = variableImportanceMetrics;
    }

    /**
     * @return
     */

    public VariableImportanceMetrics getVariableImportanceMetrics() {
        return this.variableImportanceMetrics;
    }

    /**
     * @param variableImportanceMetrics
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingResultV2 withVariableImportanceMetrics(VariableImportanceMetrics variableImportanceMetrics) {
        setVariableImportanceMetrics(variableImportanceMetrics);
        return this;
    }

    /**
     * <p>
     * The variable importance metrics of the aggregated variables.
     * </p>
     * <p>
     * Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously
     * calculate a set of variables (aggregated variables) based on historical events. For example, your ATI model might
     * calculate the number of times an user has logged in using the same IP address. In this case, event variables used
     * to derive the aggregated variables are <code>IP address</code> and <code>user</code>.
     * </p>
     * 
     * @param aggregatedVariablesImportanceMetrics
     *        The variable importance metrics of the aggregated variables. </p>
     *        <p>
     *        Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously
     *        calculate a set of variables (aggregated variables) based on historical events. For example, your ATI
     *        model might calculate the number of times an user has logged in using the same IP address. In this case,
     *        event variables used to derive the aggregated variables are <code>IP address</code> and <code>user</code>.
     */

    public void setAggregatedVariablesImportanceMetrics(AggregatedVariablesImportanceMetrics aggregatedVariablesImportanceMetrics) {
        this.aggregatedVariablesImportanceMetrics = aggregatedVariablesImportanceMetrics;
    }

    /**
     * <p>
     * The variable importance metrics of the aggregated variables.
     * </p>
     * <p>
     * Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously
     * calculate a set of variables (aggregated variables) based on historical events. For example, your ATI model might
     * calculate the number of times an user has logged in using the same IP address. In this case, event variables used
     * to derive the aggregated variables are <code>IP address</code> and <code>user</code>.
     * </p>
     * 
     * @return The variable importance metrics of the aggregated variables. </p>
     *         <p>
     *         Account Takeover Insights (ATI) model uses event variables from the login data you provide to
     *         continuously calculate a set of variables (aggregated variables) based on historical events. For example,
     *         your ATI model might calculate the number of times an user has logged in using the same IP address. In
     *         this case, event variables used to derive the aggregated variables are <code>IP address</code> and
     *         <code>user</code>.
     */

    public AggregatedVariablesImportanceMetrics getAggregatedVariablesImportanceMetrics() {
        return this.aggregatedVariablesImportanceMetrics;
    }

    /**
     * <p>
     * The variable importance metrics of the aggregated variables.
     * </p>
     * <p>
     * Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously
     * calculate a set of variables (aggregated variables) based on historical events. For example, your ATI model might
     * calculate the number of times an user has logged in using the same IP address. In this case, event variables used
     * to derive the aggregated variables are <code>IP address</code> and <code>user</code>.
     * </p>
     * 
     * @param aggregatedVariablesImportanceMetrics
     *        The variable importance metrics of the aggregated variables. </p>
     *        <p>
     *        Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously
     *        calculate a set of variables (aggregated variables) based on historical events. For example, your ATI
     *        model might calculate the number of times an user has logged in using the same IP address. In this case,
     *        event variables used to derive the aggregated variables are <code>IP address</code> and <code>user</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingResultV2 withAggregatedVariablesImportanceMetrics(AggregatedVariablesImportanceMetrics aggregatedVariablesImportanceMetrics) {
        setAggregatedVariablesImportanceMetrics(aggregatedVariablesImportanceMetrics);
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
        if (getTrainingMetricsV2() != null)
            sb.append("TrainingMetricsV2: ").append(getTrainingMetricsV2()).append(",");
        if (getVariableImportanceMetrics() != null)
            sb.append("VariableImportanceMetrics: ").append(getVariableImportanceMetrics()).append(",");
        if (getAggregatedVariablesImportanceMetrics() != null)
            sb.append("AggregatedVariablesImportanceMetrics: ").append(getAggregatedVariablesImportanceMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingResultV2 == false)
            return false;
        TrainingResultV2 other = (TrainingResultV2) obj;
        if (other.getDataValidationMetrics() == null ^ this.getDataValidationMetrics() == null)
            return false;
        if (other.getDataValidationMetrics() != null && other.getDataValidationMetrics().equals(this.getDataValidationMetrics()) == false)
            return false;
        if (other.getTrainingMetricsV2() == null ^ this.getTrainingMetricsV2() == null)
            return false;
        if (other.getTrainingMetricsV2() != null && other.getTrainingMetricsV2().equals(this.getTrainingMetricsV2()) == false)
            return false;
        if (other.getVariableImportanceMetrics() == null ^ this.getVariableImportanceMetrics() == null)
            return false;
        if (other.getVariableImportanceMetrics() != null && other.getVariableImportanceMetrics().equals(this.getVariableImportanceMetrics()) == false)
            return false;
        if (other.getAggregatedVariablesImportanceMetrics() == null ^ this.getAggregatedVariablesImportanceMetrics() == null)
            return false;
        if (other.getAggregatedVariablesImportanceMetrics() != null
                && other.getAggregatedVariablesImportanceMetrics().equals(this.getAggregatedVariablesImportanceMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataValidationMetrics() == null) ? 0 : getDataValidationMetrics().hashCode());
        hashCode = prime * hashCode + ((getTrainingMetricsV2() == null) ? 0 : getTrainingMetricsV2().hashCode());
        hashCode = prime * hashCode + ((getVariableImportanceMetrics() == null) ? 0 : getVariableImportanceMetrics().hashCode());
        hashCode = prime * hashCode + ((getAggregatedVariablesImportanceMetrics() == null) ? 0 : getAggregatedVariablesImportanceMetrics().hashCode());
        return hashCode;
    }

    @Override
    public TrainingResultV2 clone() {
        try {
            return (TrainingResultV2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.TrainingResultV2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
