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
 * A flag to indicate if you want to use Autotune to automatically find optimal values for the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_HyperParameterTuningJobConfig.html#sagemaker-Type-HyperParameterTuningJobConfig-ParameterRanges"
 * >ParameterRanges</a>: The names and ranges of parameters that a hyperparameter tuning job can optimize.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ResourceLimits.html">ResourceLimits</a>: The
 * maximum resources that can be used for a training job. These resources include the maximum number of training jobs,
 * the maximum runtime of a tuning job, and the maximum number of training jobs to run at the same time.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_HyperParameterTuningJobConfig.html#sagemaker-Type-HyperParameterTuningJobConfig-TrainingJobEarlyStoppingType"
 * >TrainingJobEarlyStoppingType</a>: A flag that specifies whether or not to use early stopping for training jobs
 * launched by a hyperparameter tuning job.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_HyperParameterTrainingJobDefinition.html#sagemaker-Type-HyperParameterTrainingJobDefinition-RetryStrategy"
 * >RetryStrategy</a>: The number of times to retry a training job.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_HyperParameterTuningJobConfig.html">Strategy</a>:
 * Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the training jobs
 * that it launches.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ConvergenceDetected.html">ConvergenceDetected</
 * a>: A flag to indicate that Automatic model tuning (AMT) has detected model convergence.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Autotune" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Autotune implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set <code>Mode</code> to <code>Enabled</code> if you want to use Autotune.
     * </p>
     */
    private String mode;

    /**
     * <p>
     * Set <code>Mode</code> to <code>Enabled</code> if you want to use Autotune.
     * </p>
     * 
     * @param mode
     *        Set <code>Mode</code> to <code>Enabled</code> if you want to use Autotune.
     * @see AutotuneMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Set <code>Mode</code> to <code>Enabled</code> if you want to use Autotune.
     * </p>
     * 
     * @return Set <code>Mode</code> to <code>Enabled</code> if you want to use Autotune.
     * @see AutotuneMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Set <code>Mode</code> to <code>Enabled</code> if you want to use Autotune.
     * </p>
     * 
     * @param mode
     *        Set <code>Mode</code> to <code>Enabled</code> if you want to use Autotune.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutotuneMode
     */

    public Autotune withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Set <code>Mode</code> to <code>Enabled</code> if you want to use Autotune.
     * </p>
     * 
     * @param mode
     *        Set <code>Mode</code> to <code>Enabled</code> if you want to use Autotune.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutotuneMode
     */

    public Autotune withMode(AutotuneMode mode) {
        this.mode = mode.toString();
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Autotune == false)
            return false;
        Autotune other = (Autotune) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public Autotune clone() {
        try {
            return (Autotune) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutotuneMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
