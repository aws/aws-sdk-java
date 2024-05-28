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
 * A structure that contains runtime information about both current and completed hyperparameter tuning jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HyperParameterTuningJobCompletionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTuningJobCompletionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of training jobs launched by a tuning job that are not improving (1% or less) as measured by model
     * performance evaluated against an objective function.
     * </p>
     */
    private Integer numberOfTrainingJobsObjectiveNotImproving;
    /**
     * <p>
     * The time in timestamp format that AMT detected model convergence, as defined by a lack of significant improvement
     * over time based on criteria developed over a wide range of diverse benchmarking tests.
     * </p>
     */
    private java.util.Date convergenceDetectedTime;

    /**
     * <p>
     * The number of training jobs launched by a tuning job that are not improving (1% or less) as measured by model
     * performance evaluated against an objective function.
     * </p>
     * 
     * @param numberOfTrainingJobsObjectiveNotImproving
     *        The number of training jobs launched by a tuning job that are not improving (1% or less) as measured by
     *        model performance evaluated against an objective function.
     */

    public void setNumberOfTrainingJobsObjectiveNotImproving(Integer numberOfTrainingJobsObjectiveNotImproving) {
        this.numberOfTrainingJobsObjectiveNotImproving = numberOfTrainingJobsObjectiveNotImproving;
    }

    /**
     * <p>
     * The number of training jobs launched by a tuning job that are not improving (1% or less) as measured by model
     * performance evaluated against an objective function.
     * </p>
     * 
     * @return The number of training jobs launched by a tuning job that are not improving (1% or less) as measured by
     *         model performance evaluated against an objective function.
     */

    public Integer getNumberOfTrainingJobsObjectiveNotImproving() {
        return this.numberOfTrainingJobsObjectiveNotImproving;
    }

    /**
     * <p>
     * The number of training jobs launched by a tuning job that are not improving (1% or less) as measured by model
     * performance evaluated against an objective function.
     * </p>
     * 
     * @param numberOfTrainingJobsObjectiveNotImproving
     *        The number of training jobs launched by a tuning job that are not improving (1% or less) as measured by
     *        model performance evaluated against an objective function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobCompletionDetails withNumberOfTrainingJobsObjectiveNotImproving(Integer numberOfTrainingJobsObjectiveNotImproving) {
        setNumberOfTrainingJobsObjectiveNotImproving(numberOfTrainingJobsObjectiveNotImproving);
        return this;
    }

    /**
     * <p>
     * The time in timestamp format that AMT detected model convergence, as defined by a lack of significant improvement
     * over time based on criteria developed over a wide range of diverse benchmarking tests.
     * </p>
     * 
     * @param convergenceDetectedTime
     *        The time in timestamp format that AMT detected model convergence, as defined by a lack of significant
     *        improvement over time based on criteria developed over a wide range of diverse benchmarking tests.
     */

    public void setConvergenceDetectedTime(java.util.Date convergenceDetectedTime) {
        this.convergenceDetectedTime = convergenceDetectedTime;
    }

    /**
     * <p>
     * The time in timestamp format that AMT detected model convergence, as defined by a lack of significant improvement
     * over time based on criteria developed over a wide range of diverse benchmarking tests.
     * </p>
     * 
     * @return The time in timestamp format that AMT detected model convergence, as defined by a lack of significant
     *         improvement over time based on criteria developed over a wide range of diverse benchmarking tests.
     */

    public java.util.Date getConvergenceDetectedTime() {
        return this.convergenceDetectedTime;
    }

    /**
     * <p>
     * The time in timestamp format that AMT detected model convergence, as defined by a lack of significant improvement
     * over time based on criteria developed over a wide range of diverse benchmarking tests.
     * </p>
     * 
     * @param convergenceDetectedTime
     *        The time in timestamp format that AMT detected model convergence, as defined by a lack of significant
     *        improvement over time based on criteria developed over a wide range of diverse benchmarking tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobCompletionDetails withConvergenceDetectedTime(java.util.Date convergenceDetectedTime) {
        setConvergenceDetectedTime(convergenceDetectedTime);
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
        if (getNumberOfTrainingJobsObjectiveNotImproving() != null)
            sb.append("NumberOfTrainingJobsObjectiveNotImproving: ").append(getNumberOfTrainingJobsObjectiveNotImproving()).append(",");
        if (getConvergenceDetectedTime() != null)
            sb.append("ConvergenceDetectedTime: ").append(getConvergenceDetectedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterTuningJobCompletionDetails == false)
            return false;
        HyperParameterTuningJobCompletionDetails other = (HyperParameterTuningJobCompletionDetails) obj;
        if (other.getNumberOfTrainingJobsObjectiveNotImproving() == null ^ this.getNumberOfTrainingJobsObjectiveNotImproving() == null)
            return false;
        if (other.getNumberOfTrainingJobsObjectiveNotImproving() != null
                && other.getNumberOfTrainingJobsObjectiveNotImproving().equals(this.getNumberOfTrainingJobsObjectiveNotImproving()) == false)
            return false;
        if (other.getConvergenceDetectedTime() == null ^ this.getConvergenceDetectedTime() == null)
            return false;
        if (other.getConvergenceDetectedTime() != null && other.getConvergenceDetectedTime().equals(this.getConvergenceDetectedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNumberOfTrainingJobsObjectiveNotImproving() == null) ? 0 : getNumberOfTrainingJobsObjectiveNotImproving().hashCode());
        hashCode = prime * hashCode + ((getConvergenceDetectedTime() == null) ? 0 : getConvergenceDetectedTime().hashCode());
        return hashCode;
    }

    @Override
    public HyperParameterTuningJobCompletionDetails clone() {
        try {
            return (HyperParameterTuningJobCompletionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HyperParameterTuningJobCompletionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
